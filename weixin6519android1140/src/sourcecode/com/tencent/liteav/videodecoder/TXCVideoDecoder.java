package com.tencent.liteav.videodecoder;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public class TXCVideoDecoder
  implements TXINotifyListener
{
  private static final String TAG = "TXCVideoDecoder";
  private TXCVideoDecodeHandler mDecoderHandler;
  TXIVideoDecoderListener mDecoderListener;
  boolean mHWDec = true;
  private ArrayList<NALData> mNALList = new ArrayList();
  boolean mNeedSortFrame = true;
  private WeakReference<TXINotifyListener> mNotifyListener;
  private ByteBuffer mPps;
  boolean mRecvFirstFrame = false;
  private ByteBuffer mSps;
  SurfaceTexture mSurface;
  
  private void addOneNalToDecoder(boolean paramBoolean, byte[] paramArrayOfByte, long paramLong1, long paramLong2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("iframe", paramBoolean);
    localBundle.putByteArray("nal", paramArrayOfByte);
    localBundle.putLong("pts", paramLong1);
    localBundle.putLong("dts", paramLong2);
    paramArrayOfByte = new Message();
    paramArrayOfByte.what = 101;
    paramArrayOfByte.setData(localBundle);
    if (this.mDecoderHandler != null) {
      this.mDecoderHandler.sendMessage(paramArrayOfByte);
    }
  }
  
  public void loadNativeData(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    if ((this.mDecoderHandler != null) && (!this.mDecoderHandler.mHWDec) && (this.mDecoderHandler.mVideoDecoder != null)) {
      ((TXCVideoFfmpegDecoder)this.mDecoderHandler.mVideoDecoder).loadNativeData(paramArrayOfByte, paramLong, paramInt);
    }
  }
  
  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    TXCSystemUtil.notifyEvent(this.mNotifyListener, paramInt, paramBundle);
    if (paramInt == 2106)
    {
      stop();
      if (this.mDecoderListener != null) {
        this.mDecoderListener.onDecodeFrame(-1);
      }
      start(false, this.mNeedSortFrame);
    }
  }
  
  public void pushNAL(boolean paramBoolean, byte[] paramArrayOfByte, long paramLong1, long paramLong2)
  {
    try
    {
      if ((!this.mRecvFirstFrame) && (!paramBoolean))
      {
        TXCLog.e("TXCVideoDecoder", "play:decode: push nal ignore p frame when not got i frame");
        if (this.mDecoderListener != null) {
          this.mDecoderListener.onDecodeFrame(1);
        }
      }
      else
      {
        if ((!this.mRecvFirstFrame) && (paramBoolean))
        {
          TXCLog.e("TXCVideoDecoder", "play:decode: push first i frame");
          this.mRecvFirstFrame = true;
        }
        if (this.mDecoderHandler != null)
        {
          if (!this.mNALList.isEmpty())
          {
            new ArrayList();
            localObject = this.mNALList.iterator();
            while (((Iterator)localObject).hasNext())
            {
              NALData localNALData = (NALData)((Iterator)localObject).next();
              addOneNalToDecoder(localNALData.iframe, localNALData.nal, localNALData.pts, localNALData.dts);
            }
          }
          this.mNALList.clear();
          addOneNalToDecoder(paramBoolean, paramArrayOfByte, paramLong1, paramLong2);
          return;
        }
        if ((paramBoolean) && (!this.mNALList.isEmpty()))
        {
          if (this.mDecoderListener != null) {
            this.mDecoderListener.onDecodeFrame(this.mNALList.size());
          }
          this.mNALList.clear();
        }
        Object localObject = new NALData();
        ((NALData)localObject).iframe = paramBoolean;
        ((NALData)localObject).nal = paramArrayOfByte;
        ((NALData)localObject).pts = paramLong1;
        ((NALData)localObject).dts = paramLong2;
        this.mNALList.add(localObject);
      }
      return;
    }
    catch (Exception paramArrayOfByte) {}
  }
  
  public void setListener(TXIVideoDecoderListener paramTXIVideoDecoderListener)
  {
    this.mDecoderListener = paramTXIVideoDecoderListener;
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mNotifyListener = new WeakReference(paramTXINotifyListener);
  }
  
  public int setup(SurfaceTexture paramSurfaceTexture, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    this.mSurface = paramSurfaceTexture;
    this.mSps = paramByteBuffer1;
    this.mPps = paramByteBuffer2;
    return 0;
  }
  
  public int start(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mSurface == null)
    {
      TXCLog.e("TXCVideoDecoder", "play:decode: start decoder error when not setup surface");
      return -1;
    }
    this.mHWDec = paramBoolean1;
    this.mNeedSortFrame = paramBoolean2;
    Object localObject;
    if (this.mDecoderHandler == null)
    {
      localObject = new HandlerThread("VideoDecoderThread");
      ((HandlerThread)localObject).start();
      this.mDecoderHandler = new TXCVideoDecodeHandler(((HandlerThread)localObject).getLooper());
      this.mDecoderHandler.init(this.mHWDec, this.mSurface, this.mSps, this.mPps, this.mDecoderListener, this);
      TXCLog.w("TXCVideoDecoder", "play:decode: start decode thread");
    }
    Bundle localBundle;
    if (this.mDecoderHandler != null)
    {
      TXCLog.w("TXCVideoDecoder", "play:decode: start decode ");
      localObject = Message.obtain();
      ((Message)localObject).what = 100;
      ((Message)localObject).obj = Boolean.valueOf(paramBoolean2);
      this.mDecoderHandler.sendMessage((Message)localObject);
      localBundle = new Bundle();
      localBundle.putInt("EVT_ID", 2008);
      localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
      if (!this.mHWDec) {
        break label228;
      }
      localObject = "启动硬解";
      localBundle.putCharSequence("EVT_MSG", (CharSequence)localObject);
      if (!this.mHWDec) {
        break label236;
      }
    }
    label228:
    label236:
    for (int i = 1;; i = 2)
    {
      localBundle.putInt("EVT_PARAM1", i);
      TXCSystemUtil.notifyEvent(this.mNotifyListener, 2008, localBundle);
      return 0;
      localObject = "启动软解";
      break;
    }
  }
  
  public void stop()
  {
    if (this.mDecoderHandler != null) {
      this.mDecoderHandler.sendEmptyMessage(102);
    }
    this.mDecoderHandler = null;
    this.mNALList.clear();
    this.mRecvFirstFrame = false;
  }
  
  private static class NALData
  {
    public long dts;
    public boolean iframe;
    public byte[] nal;
    public long pts;
  }
  
  private static class TXCVideoDecodeHandler
    extends Handler
  {
    public static final int MSG_DECODE = 101;
    public static final int MSG_START_DECODER = 100;
    public static final int MSG_STOP_DECODER = 102;
    TXIVideoDecoderListener mDecoderListener;
    boolean mHWDec;
    WeakReference<TXINotifyListener> mNotifyListener;
    private ByteBuffer mPps;
    private ByteBuffer mSps;
    SurfaceTexture mSurface;
    IVideoDecoder mVideoDecoder;
    
    public TXCVideoDecodeHandler(Looper paramLooper)
    {
      super();
    }
    
    private void decode(byte[] paramArrayOfByte, long paramLong1, long paramLong2)
    {
      if (this.mVideoDecoder != null) {
        this.mVideoDecoder.decode(paramArrayOfByte, paramLong1, paramLong2);
      }
    }
    
    private void start(boolean paramBoolean)
    {
      if (this.mVideoDecoder != null)
      {
        TXCLog.w("TXCVideoDecoder", "play:decode: start decode ignore hwdec: " + this.mHWDec);
        return;
      }
      if (this.mHWDec) {}
      for (this.mVideoDecoder = new TXCVideoMediaCodecDecoder();; this.mVideoDecoder = new TXCVideoFfmpegDecoder())
      {
        this.mVideoDecoder.setListener(this.mDecoderListener);
        this.mVideoDecoder.setNotifyListener(this.mNotifyListener);
        this.mVideoDecoder.config(this.mSurface);
        this.mVideoDecoder.start(this.mSps, this.mPps, paramBoolean);
        TXCLog.w("TXCVideoDecoder", "play:decode: start decode hwdec: " + this.mHWDec);
        return;
      }
    }
    
    private void stop()
    {
      if (this.mVideoDecoder != null)
      {
        this.mVideoDecoder.stop();
        this.mVideoDecoder.setListener(null);
        this.mVideoDecoder.setNotifyListener(null);
        this.mVideoDecoder = null;
      }
      Looper.myLooper().quit();
      TXCLog.w("TXCVideoDecoder", "play:decode: stop decode hwdec: " + this.mHWDec);
    }
    
    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        return;
      case 100: 
        start(((Boolean)paramMessage.obj).booleanValue());
        return;
      case 101: 
        try
        {
          paramMessage = paramMessage.getData();
          decode(paramMessage.getByteArray("nal"), paramMessage.getLong("pts"), paramMessage.getLong("dts"));
          return;
        }
        catch (Exception paramMessage)
        {
          return;
        }
      }
      stop();
    }
    
    public void init(boolean paramBoolean, SurfaceTexture paramSurfaceTexture, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, TXIVideoDecoderListener paramTXIVideoDecoderListener, TXINotifyListener paramTXINotifyListener)
    {
      this.mHWDec = paramBoolean;
      this.mSurface = paramSurfaceTexture;
      this.mSps = paramByteBuffer1;
      this.mPps = paramByteBuffer2;
      this.mDecoderListener = paramTXIVideoDecoderListener;
      this.mNotifyListener = new WeakReference(paramTXINotifyListener);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videodecoder\TXCVideoDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */