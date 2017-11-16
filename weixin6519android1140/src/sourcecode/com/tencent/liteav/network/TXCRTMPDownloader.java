package com.tencent.liteav.network;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.util.Vector;

public class TXCRTMPDownloader
  extends TXIStreamDownloader
{
  private final int MSG_EVENT = 102;
  private final int MSG_RECONNECT = 101;
  private final String TAG = "network.TXCRTMPDownloader";
  private RecvThread mCurrentThread = null;
  private boolean mEnableNearestIP = false;
  private Handler mHandler = null;
  private boolean mHasTcpPlayUrl;
  private boolean mIsPlayRtmpAccStream = false;
  private String mPlayUrl = "";
  private boolean mQuicChannel = false;
  private Object mRTMPThreadLock = null;
  private String mServerIp = "";
  private HandlerThread mThread = null;
  private Vector<TXCStreamPlayUrl> mVecPlayUrls;
  
  private void postReconnectMsg()
  {
    Message localMessage = new Message();
    localMessage.what = 101;
    if (this.mHandler != null) {
      this.mHandler.sendMessageDelayed(localMessage, this.connectRetryInterval * 1000);
    }
  }
  
  private void reconnect(boolean paramBoolean)
  {
    synchronized (this.mRTMPThreadLock)
    {
      if (this.mCurrentThread != null)
      {
        this.mCurrentThread.stopThread();
        this.mCurrentThread = null;
      }
      if (!this.mIsRunning) {
        return;
      }
    }
    boolean bool = this.mQuicChannel;
    if (this.mIsPlayRtmpAccStream)
    {
      if (this.mEnableNearestIP) {
        break label228;
      }
      paramBoolean = false;
    }
    label228:
    for (;;)
    {
      if (bool) {
        paramBoolean = true;
      }
      if ((paramBoolean) && (this.mVecPlayUrls != null) && (!this.mVecPlayUrls.isEmpty()))
      {
        ??? = (TXCStreamPlayUrl)this.mVecPlayUrls.get(0);
        this.mVecPlayUrls.remove(0);
        this.mPlayUrl = ((TXCStreamPlayUrl)???).strStreamUrl;
        this.mQuicChannel = ((TXCStreamPlayUrl)???).quicChannel;
      }
      if ((bool) && (this.mHasTcpPlayUrl))
      {
        sendNotifyEvent(12015);
        postReconnectMsg();
        return;
      }
      if (this.connectRetryTimes < this.connectRetryLimit)
      {
        this.connectRetryTimes += 1;
        TXCLog.d("network.TXCRTMPDownloader", "reconnect retry count:" + this.connectRetryTimes + " limit:" + this.connectRetryLimit);
        sendNotifyEvent(12015);
        postReconnectMsg();
        return;
      }
      sendNotifyEvent(12012);
      return;
    }
  }
  
  public String getCurrentStreamUrl()
  {
    return this.mPlayUrl;
  }
  
  public TXCStreamDownloader.DownloadStats getDownloadStats()
  {
    synchronized (this.mRTMPThreadLock)
    {
      if (this.mCurrentThread != null)
      {
        TXCStreamDownloader.DownloadStats localDownloadStats = this.mCurrentThread.getRecvStatus();
        return localDownloadStats;
      }
      return null;
    }
  }
  
  public boolean isQuicChannel()
  {
    return this.mQuicChannel;
  }
  
  public native TXCStreamDownloader.DownloadStats nativeGetStats(long paramLong);
  
  public native long nativeInitRtmpHandler(String paramString, boolean paramBoolean);
  
  public native void nativeStart(long paramLong);
  
  public native void nativeStop(long paramLong);
  
  public native void nativeUninitRtmpHandler(long paramLong);
  
  public void sendNotifyEvent(int paramInt)
  {
    boolean bool = true;
    if ((paramInt == 0) || (paramInt == 1))
    {
      if (paramInt == 1) {}
      for (;;)
      {
        reconnect(bool);
        return;
        bool = false;
      }
    }
    super.sendNotifyEvent(paramInt);
  }
  
  public void sendNotifyEvent(int paramInt, String paramString)
  {
    if (paramString.isEmpty()) {
      sendNotifyEvent(paramInt);
    }
    Bundle localBundle;
    do
    {
      return;
      localBundle = new Bundle();
      localBundle.putString("EVT_MSG", paramString);
      localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
    } while (this.mNotifyListener == null);
    this.mNotifyListener.onNotifyEvent(paramInt, localBundle);
  }
  
  public void startDownload(Vector<TXCStreamPlayUrl> paramVector, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mIsRunning) {}
    while ((paramVector == null) || (paramVector.isEmpty())) {
      return;
    }
    this.mIsPlayRtmpAccStream = paramBoolean1;
    this.mEnableNearestIP = paramBoolean2;
    this.mVecPlayUrls = paramVector;
    this.mHasTcpPlayUrl = false;
    int i = 0;
    StringBuilder localStringBuilder;
    if (i < this.mVecPlayUrls.size())
    {
      if (!((TXCStreamPlayUrl)this.mVecPlayUrls.elementAt(i)).quicChannel) {
        this.mHasTcpPlayUrl = true;
      }
    }
    else
    {
      paramVector = (TXCStreamPlayUrl)this.mVecPlayUrls.get(0);
      this.mVecPlayUrls.remove(0);
      this.mPlayUrl = paramVector.strStreamUrl;
      this.mQuicChannel = paramVector.quicChannel;
      this.mIsRunning = true;
      localStringBuilder = new StringBuilder("start pull with url:").append(this.mPlayUrl).append(" quic:");
      if (!this.mQuicChannel) {
        break label226;
      }
    }
    label226:
    for (paramVector = "yes";; paramVector = "no")
    {
      TXCLog.d("network.TXCRTMPDownloader", paramVector);
      if (this.mThread == null)
      {
        this.mThread = new HandlerThread("RTMP_PULL");
        this.mThread.start();
      }
      this.mHandler = new Handler(this.mThread.getLooper())
      {
        public void handleMessage(Message paramAnonymousMessage)
        {
          if (paramAnonymousMessage.what == 101) {
            TXCRTMPDownloader.this.startInternal();
          }
        }
      };
      startInternal();
      return;
      i += 1;
      break;
    }
  }
  
  public void startInternal()
  {
    synchronized (this.mRTMPThreadLock)
    {
      this.mCurrentThread = new RecvThread(this.mPlayUrl, this.mQuicChannel);
      this.mCurrentThread.start();
      return;
    }
  }
  
  public void stopDownload()
  {
    if (!this.mIsRunning) {}
    for (;;)
    {
      return;
      this.mIsRunning = false;
      this.mVecPlayUrls.removeAllElements();
      this.mVecPlayUrls = null;
      this.mIsPlayRtmpAccStream = false;
      this.mEnableNearestIP = false;
      TXCLog.d("network.TXCRTMPDownloader", "stop pull");
      synchronized (this.mRTMPThreadLock)
      {
        if (this.mCurrentThread != null)
        {
          this.mCurrentThread.stopThread();
          this.mCurrentThread = null;
        }
        if (this.mThread != null)
        {
          this.mThread.quit();
          this.mThread = null;
        }
        if (this.mHandler == null) {
          continue;
        }
        this.mHandler = null;
        return;
      }
    }
  }
  
  class RecvThread
    extends Thread
  {
    private String mPlayUrl;
    private boolean mQuicChannel;
    private long mRtmpInstance = 0L;
    
    RecvThread(String paramString, boolean paramBoolean)
    {
      super();
      this.mPlayUrl = paramString;
      this.mQuicChannel = paramBoolean;
    }
    
    public TXCStreamDownloader.DownloadStats getRecvStatus()
    {
      TXCStreamDownloader.DownloadStats localDownloadStats = null;
      try
      {
        if (this.mRtmpInstance != 0L) {
          localDownloadStats = TXCRTMPDownloader.this.nativeGetStats(this.mRtmpInstance);
        }
        return localDownloadStats;
      }
      finally {}
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: aload_0
      //   4: getfield 19	com/tencent/liteav/network/TXCRTMPDownloader$RecvThread:this$0	Lcom/tencent/liteav/network/TXCRTMPDownloader;
      //   7: aload_0
      //   8: getfield 28	com/tencent/liteav/network/TXCRTMPDownloader$RecvThread:mPlayUrl	Ljava/lang/String;
      //   11: aload_0
      //   12: getfield 30	com/tencent/liteav/network/TXCRTMPDownloader$RecvThread:mQuicChannel	Z
      //   15: invokevirtual 43	com/tencent/liteav/network/TXCRTMPDownloader:nativeInitRtmpHandler	(Ljava/lang/String;Z)J
      //   18: putfield 26	com/tencent/liteav/network/TXCRTMPDownloader$RecvThread:mRtmpInstance	J
      //   21: aload_0
      //   22: monitorexit
      //   23: aload_0
      //   24: getfield 19	com/tencent/liteav/network/TXCRTMPDownloader$RecvThread:this$0	Lcom/tencent/liteav/network/TXCRTMPDownloader;
      //   27: aload_0
      //   28: getfield 26	com/tencent/liteav/network/TXCRTMPDownloader$RecvThread:mRtmpInstance	J
      //   31: invokevirtual 47	com/tencent/liteav/network/TXCRTMPDownloader:nativeStart	(J)V
      //   34: aload_0
      //   35: monitorenter
      //   36: aload_0
      //   37: getfield 19	com/tencent/liteav/network/TXCRTMPDownloader$RecvThread:this$0	Lcom/tencent/liteav/network/TXCRTMPDownloader;
      //   40: aload_0
      //   41: getfield 26	com/tencent/liteav/network/TXCRTMPDownloader$RecvThread:mRtmpInstance	J
      //   44: invokevirtual 50	com/tencent/liteav/network/TXCRTMPDownloader:nativeUninitRtmpHandler	(J)V
      //   47: aload_0
      //   48: lconst_0
      //   49: putfield 26	com/tencent/liteav/network/TXCRTMPDownloader$RecvThread:mRtmpInstance	J
      //   52: aload_0
      //   53: monitorexit
      //   54: return
      //   55: astore_1
      //   56: aload_0
      //   57: monitorexit
      //   58: aload_1
      //   59: athrow
      //   60: astore_1
      //   61: aload_0
      //   62: monitorexit
      //   63: aload_1
      //   64: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	65	0	this	RecvThread
      //   55	4	1	localObject1	Object
      //   60	4	1	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   2	23	55	finally
      //   56	58	55	finally
      //   36	54	60	finally
      //   61	63	60	finally
    }
    
    public void stopThread()
    {
      try
      {
        if (this.mRtmpInstance != 0L) {
          TXCRTMPDownloader.this.nativeStop(this.mRtmpInstance);
        }
        return;
      }
      finally {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\network\TXCRTMPDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */