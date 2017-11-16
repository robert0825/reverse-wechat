package com.tencent.qqmusic.mediaplayer;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.HashMap;

class MediaHTTPManager
{
  private static final int BUFFER_SIZE = 8192;
  private static final int MINIMAL_BUFFER_SIZE_TO_START = 204800;
  private static final int MSG_DISCONNECT = 51;
  private static final int MSG_PREPARE = 49;
  private static final int MSG_QUIT_THREAD = 53;
  private static final int MSG_READ_AT = 50;
  private static final int MSG_SEEK = 52;
  private static final int SNIFF_INTERVAL = 8192;
  private static final String TAG = "MediaHTTPManager";
  public IMediaHTTPConnection mConn;
  public boolean mDownloadFinished;
  public final String mFileName;
  private MediaHTTPHandler mHandler = null;
  public HandlerThread mHandlerThread = null;
  public OnBufferListener mOnBufferListener = null;
  public OnConnectionListener mOnConnectionListener = null;
  public OnSniffListener mOnSniffListener = null;
  public final IMediaHTTPService mService;
  public final URL mUrl;
  public RandomAccessFile mWriteFile;
  
  MediaHTTPManager(IMediaHTTPService paramIMediaHTTPService, String paramString, URL paramURL)
  {
    this.mService = paramIMediaHTTPService;
    this.mFileName = paramString;
    this.mUrl = paramURL;
    paramIMediaHTTPService = new File(paramString);
    if (paramIMediaHTTPService.exists()) {
      paramIMediaHTTPService.delete();
    }
    if (!paramIMediaHTTPService.exists()) {
      paramIMediaHTTPService.createNewFile();
    }
  }
  
  long getBufferedFileLength()
  {
    long l = 0L;
    if (this.mHandler != null) {
      l = this.mHandler.getBufferedFileLength();
    }
    return l;
  }
  
  boolean isDownloadFinished()
  {
    return this.mDownloadFinished;
  }
  
  void prepare()
  {
    this.mHandlerThread = new HandlerThread("MediaHTTPManager" + this.mFileName);
    this.mHandlerThread.start();
    this.mHandler = new MediaHTTPHandler(this.mHandlerThread.getLooper(), this);
    Message.obtain(this.mHandler, 49).sendToTarget();
  }
  
  void release()
  {
    if (this.mHandler != null)
    {
      Message.obtain(this.mHandler, 51).sendToTarget();
      Message.obtain(this.mHandler, 53).sendToTarget();
    }
  }
  
  void seekByBytePosition(long paramLong)
  {
    Message.obtain(this.mHandler, 52, Long.valueOf(paramLong)).sendToTarget();
  }
  
  void setBufferListener(OnBufferListener paramOnBufferListener)
  {
    this.mOnBufferListener = paramOnBufferListener;
  }
  
  void setConnectionListener(OnConnectionListener paramOnConnectionListener)
  {
    this.mOnConnectionListener = paramOnConnectionListener;
  }
  
  void setSniffListener(OnSniffListener paramOnSniffListener)
  {
    this.mOnSniffListener = paramOnSniffListener;
  }
  
  private static class MediaHTTPHandler
    extends Handler
  {
    private byte[] buffer;
    private long mCurrentPosition = 0L;
    private DataRangeTracker mDataRangeTracker;
    private boolean mHasCalledMiniBufferReady = false;
    private final WeakReference<MediaHTTPManager> mManager;
    private boolean mSniffFinished = false;
    private long mTargetPositionToStart = 0L;
    
    MediaHTTPHandler(Looper paramLooper, MediaHTTPManager paramMediaHTTPManager)
    {
      super();
      this.mManager = new WeakReference(paramMediaHTTPManager);
    }
    
    private boolean writeToFile(long paramLong, byte[] paramArrayOfByte, int paramInt, RandomAccessFile paramRandomAccessFile)
    {
      try
      {
        paramRandomAccessFile.seek(paramLong);
        paramRandomAccessFile.write(paramArrayOfByte, 0, paramInt);
        return true;
      }
      catch (FileNotFoundException paramArrayOfByte)
      {
        Logger.e("MediaHTTPManager", "file not found", paramArrayOfByte);
        return false;
      }
      catch (IOException paramArrayOfByte)
      {
        Logger.e("MediaHTTPManager", "io ", paramArrayOfByte);
      }
      return false;
    }
    
    long getBufferedFileLength()
    {
      return this.mCurrentPosition;
    }
    
    public void handleMessage(Message paramMessage)
    {
      MediaHTTPManager localMediaHTTPManager = (MediaHTTPManager)this.mManager.get();
      if (localMediaHTTPManager != null) {
        switch (paramMessage.what)
        {
        }
      }
      for (;;)
      {
        return;
        boolean bool;
        try
        {
          localMediaHTTPManager.mWriteFile = new RandomAccessFile(localMediaHTTPManager.mFileName, "rw");
          localMediaHTTPManager.mConn = localMediaHTTPManager.mService.makeHTTPConnection();
          bool = localMediaHTTPManager.mConn.connect(localMediaHTTPManager.mUrl, new HashMap());
          Logger.i("MediaHTTPManager", "connect result " + bool);
          if (bool)
          {
            this.buffer = new byte[' '];
            this.mTargetPositionToStart = (this.mCurrentPosition + 8192L);
            if (this.mTargetPositionToStart >= localMediaHTTPManager.mConn.getSize()) {
              this.mTargetPositionToStart = (localMediaHTTPManager.mConn.getSize() - 1L);
            }
            if (localMediaHTTPManager.mOnConnectionListener != null)
            {
              localMediaHTTPManager.mOnConnectionListener.onConnected(localMediaHTTPManager.mConn.getSize(), localMediaHTTPManager.mConn.getMIMEType());
              this.mDataRangeTracker = new DataRangeTracker();
            }
            removeMessageThenSendEmptyMessage(50);
            return;
          }
        }
        catch (FileNotFoundException paramMessage)
        {
          localMediaHTTPManager.mOnConnectionListener.onError(91, 53);
          return;
        }
        if (localMediaHTTPManager.mOnConnectionListener == null) {
          continue;
        }
        localMediaHTTPManager.mOnConnectionListener.onError(91, 80);
        return;
        paramMessage = this.buffer;
        int i = localMediaHTTPManager.mConn.readAt(paramMessage, (int)this.mCurrentPosition, 8192);
        if (i > 0)
        {
          if (writeToFile(this.mCurrentPosition, paramMessage, i, localMediaHTTPManager.mWriteFile))
          {
            this.mDataRangeTracker.addRange(this.mCurrentPosition, this.mCurrentPosition + i - 1L);
            this.mCurrentPosition += i;
          }
          if (localMediaHTTPManager.mOnBufferListener != null) {
            localMediaHTTPManager.mOnBufferListener.onBufferProgress(this.mCurrentPosition, localMediaHTTPManager.mConn.getSize());
          }
          if ((!this.mHasCalledMiniBufferReady) && (this.mCurrentPosition >= this.mTargetPositionToStart)) {
            if ((!this.mSniffFinished) && (localMediaHTTPManager.mOnSniffListener != null))
            {
              if (!localMediaHTTPManager.mOnSniffListener.sniff()) {
                break label506;
              }
              this.mSniffFinished = true;
            }
          }
          for (;;)
          {
            if (this.mSniffFinished)
            {
              this.mHasCalledMiniBufferReady = true;
              if (localMediaHTTPManager.mOnBufferListener != null) {
                localMediaHTTPManager.mOnBufferListener.onBufferReadyToPlay();
              }
            }
            if (this.mCurrentPosition >= localMediaHTTPManager.mConn.getSize()) {
              break;
            }
            removeMessageThenSendEmptyMessage(50);
            return;
            label506:
            this.mTargetPositionToStart += 8192L;
            if (this.mTargetPositionToStart >= localMediaHTTPManager.mConn.getSize()) {
              this.mTargetPositionToStart = (localMediaHTTPManager.mConn.getSize() - 1L);
            }
          }
          localMediaHTTPManager.mDownloadFinished = true;
          if ((this.mSniffFinished) || (localMediaHTTPManager.mOnConnectionListener == null)) {
            continue;
          }
          localMediaHTTPManager.mOnConnectionListener.onError(91, 55);
          return;
        }
        if (localMediaHTTPManager.mOnConnectionListener != null) {
          localMediaHTTPManager.mOnConnectionListener.onError(91, 80);
        }
        Logger.e("MediaHTTPManager", "connection.read failed " + i);
        return;
        if (!(paramMessage.obj instanceof Long)) {
          continue;
        }
        this.mCurrentPosition = ((Long)paramMessage.obj).longValue();
        this.mHasCalledMiniBufferReady = false;
        this.mTargetPositionToStart = (this.mCurrentPosition + 204800L);
        if (this.mTargetPositionToStart >= localMediaHTTPManager.mConn.getSize()) {
          this.mTargetPositionToStart = (localMediaHTTPManager.mConn.getSize() - 1L);
        }
        removeMessageThenSendEmptyMessage(50);
        return;
        if (localMediaHTTPManager.mConn != null) {
          localMediaHTTPManager.mConn.disconnect();
        }
        if (localMediaHTTPManager.mWriteFile != null) {}
        try
        {
          localMediaHTTPManager.mWriteFile.close();
          removeMessages(50);
          return;
          if (localMediaHTTPManager.mHandlerThread == null) {
            continue;
          }
          if (Build.VERSION.SDK_INT >= 19) {
            localMediaHTTPManager.mHandlerThread.quitSafely();
          }
          for (;;)
          {
            bool = new File(localMediaHTTPManager.mFileName).delete();
            Logger.i("MediaHTTPManager", "temp file deleted " + bool);
            return;
            localMediaHTTPManager.mHandlerThread.quit();
          }
        }
        catch (IOException paramMessage)
        {
          for (;;) {}
        }
      }
    }
    
    void removeMessageThenSendEmptyMessage(int paramInt)
    {
      removeMessages(paramInt);
      sendEmptyMessage(paramInt);
    }
  }
  
  static abstract interface OnBufferListener
  {
    public abstract void onBufferProgress(long paramLong1, long paramLong2);
    
    public abstract void onBufferReadyToPlay();
  }
  
  static abstract interface OnConnectionListener
  {
    public abstract void onConnected(long paramLong, String paramString);
    
    public abstract void onError(int paramInt1, int paramInt2);
  }
  
  static abstract interface OnSniffListener
  {
    public abstract boolean sniff();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\MediaHTTPManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */