package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRDef;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCModule;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.util.ArrayList;

public class TXCStreamUploader
  extends TXCModule
  implements IntelligentRouteListener
{
  public static final int RTMPSENDSTRATEGY_LIVE = 1;
  public static final int RTMPSENDSTRATEGY_REALTIME_QUIC = 3;
  public static final int RTMPSENDSTRATEGY_REALTIME_TCP = 2;
  static final String TAG = "TXCStreamUploader";
  public static final int TXE_UPLOAD_ERROR_ALLADDRESS_FAILED = 11011;
  public static final int TXE_UPLOAD_ERROR_NET_DISCONNECT = 11012;
  public static final int TXE_UPLOAD_ERROR_NET_RECONNECT = 11016;
  public static final int TXE_UPLOAD_ERROR_NO_DATA = 11013;
  public static final int TXE_UPLOAD_ERROR_NO_NETWORK = 11015;
  public static final int TXE_UPLOAD_ERROR_READ_FAILED = 11017;
  public static final int TXE_UPLOAD_ERROR_WRITE_FAILED = 11018;
  public static final int TXE_UPLOAD_INFO_CONNECT_FAILED = 11006;
  public static final int TXE_UPLOAD_INFO_CONNECT_SUCCESS = 11001;
  public static final int TXE_UPLOAD_INFO_HANDSHAKE_FAIL = 11005;
  public static final int TXE_UPLOAD_INFO_NET_BUSY = 11003;
  public static final int TXE_UPLOAD_INFO_PUSH_BEGIN = 11002;
  public static final int TXE_UPLOAD_INFO_SERVER_REFUSE = 11007;
  public static final int TXE_UPLOAD_MODE_AUDIO_ONLY = 1;
  public static final int TXE_UPLOAD_MODE_LINK_MIC = 2;
  public static final int TXE_UPLOAD_MODE_REAL_TIME = 0;
  public static final int TXE_UPLOAD_PROTOCOL_AV = 1;
  public static final int TXE_UPLOAD_PROTOCOL_RTMP = 0;
  private final int MSG_EVENT = 102;
  private final int MSG_RECONNECT = 101;
  private final int MSG_REPORT_STATUS = 103;
  private int mChannelType = 0;
  private long mConnectSuccessTimeStamps = 0L;
  private Context mContext = null;
  private int mCurrentRecordIdx = 0;
  private boolean mEnableNearestIP = true;
  private long mGoodPushTime = 30000L;
  private Handler mHandler = null;
  private HandlerThread mHandlerThread = null;
  private TXCIntelligentRoute mIntelligentRoute = null;
  private ArrayList<IPRecord> mIpList = null;
  private boolean mIsPushing = false;
  private int mLastNetworkType = 255;
  private long mLastTimeStamp = 0L;
  private UploadStats mLastUploadStats = null;
  private TXINotifyListener mNotifyListener = null;
  public TXSStreamUploaderParam mParam = null;
  private long mPushStartTS = 0L;
  public boolean mQuicChannel = false;
  private int mRetryCount = 0;
  public String mRtmpUrl = "";
  private Thread mThread = null;
  public Object mThreadLock = null;
  public long mUploaderInstance = 0L;
  
  static {}
  
  public TXCStreamUploader(Context paramContext, TXSStreamUploaderParam paramTXSStreamUploaderParam)
  {
    this.mContext = paramContext;
    paramContext = paramTXSStreamUploaderParam;
    if (paramTXSStreamUploaderParam == null)
    {
      paramContext = new TXSStreamUploaderParam();
      paramContext.mode = 0;
      paramContext.retryInterval = 3;
      paramContext.retryTimes = 3;
      paramContext.maxDropVideoCount = 40;
      paramContext.maxDropVideoCacheTime = 1000;
      paramContext.isWaitIFrame = true;
    }
    this.mParam = paramContext;
    this.mThreadLock = new Object();
    this.mIntelligentRoute = new TXCIntelligentRoute();
    this.mIntelligentRoute.IRListener = this;
    this.mUploaderInstance = 0L;
    this.mRetryCount = 0;
    this.mCurrentRecordIdx = 0;
    this.mIpList = null;
    this.mIsPushing = false;
    this.mThread = null;
    this.mRtmpUrl = null;
    this.mLastNetworkType = 255;
    this.mHandlerThread = null;
  }
  
  private RtmpRealConnectInfo getRtmpRealConnectInfo()
  {
    int i = 1;
    if (!this.mEnableNearestIP) {
      return new RtmpRealConnectInfo(this.mRtmpUrl, false);
    }
    if (this.mIpList == null) {
      return new RtmpRealConnectInfo(this.mRtmpUrl, false);
    }
    if ((this.mCurrentRecordIdx >= this.mIpList.size()) || (this.mCurrentRecordIdx < 0)) {
      return new RtmpRealConnectInfo(this.mRtmpUrl, false);
    }
    IPRecord localIPRecord = (IPRecord)this.mIpList.get(this.mCurrentRecordIdx);
    String[] arrayOfString1 = this.mRtmpUrl.split("://");
    if (arrayOfString1.length < 2) {
      return new RtmpRealConnectInfo(this.mRtmpUrl, false);
    }
    String[] arrayOfString2 = arrayOfString1[1].split("/");
    arrayOfString2[0] = (localIPRecord.ip + ":" + localIPRecord.port);
    StringBuilder localStringBuilder = new StringBuilder(arrayOfString2[0]);
    while (i < arrayOfString2.length)
    {
      localStringBuilder.append("/");
      localStringBuilder.append(arrayOfString2[i]);
      i += 1;
    }
    return new RtmpRealConnectInfo(arrayOfString1[0] + "://" + localStringBuilder.toString(), localIPRecord.quic_channel);
  }
  
  private Long getSpeed(long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong1 > paramLong2) {}
    for (;;)
    {
      return Long.valueOf(8L * paramLong2 * 1000L / (1024L * paramLong3));
      paramLong2 -= paramLong1;
    }
  }
  
  private native void nativeEnableDrop(long paramLong, boolean paramBoolean);
  
  private native UploadStats nativeGetStats(long paramLong);
  
  private native void nativePushAAC(long paramLong1, byte[] paramArrayOfByte, long paramLong2);
  
  private native void nativePushNAL(long paramLong1, byte[] paramArrayOfByte, int paramInt, long paramLong2, long paramLong3, long paramLong4);
  
  private native void nativeSetSendStrategy(long paramLong, int paramInt);
  
  private native void nativeStopPush(long paramLong);
  
  private boolean nextRecordIdx(boolean paramBoolean)
  {
    if ((this.mIpList == null) || (this.mIpList.size() == 0)) {
      return false;
    }
    if (paramBoolean == true)
    {
      IPRecord localIPRecord = (IPRecord)this.mIpList.get(this.mCurrentRecordIdx);
      localIPRecord.conn_times += 1;
    }
    if (this.mCurrentRecordIdx < this.mIpList.size())
    {
      this.mCurrentRecordIdx += 1;
      if (this.mCurrentRecordIdx == this.mIpList.size())
      {
        this.mCurrentRecordIdx = 0;
        return false;
      }
      return true;
    }
    return false;
  }
  
  private void postReconnectMsg(String paramString, boolean paramBoolean, int paramInt)
  {
    Message localMessage = new Message();
    localMessage.what = 101;
    localMessage.obj = paramString;
    if (paramBoolean) {}
    for (int i = 2;; i = 1)
    {
      localMessage.arg1 = i;
      if (this.mHandler != null) {
        this.mHandler.sendMessageDelayed(localMessage, paramInt);
      }
      return;
    }
  }
  
  private void reconnect(boolean paramBoolean)
  {
    stopPushTask();
    if ((this.mEnableNearestIP) && (this.mLastNetworkType != TXCSystemUtil.getNetworkType(this.mContext)))
    {
      TXCLog.e("TXCStreamUploader", "reconnect network switch from " + this.mLastNetworkType + " to " + TXCSystemUtil.getNetworkType(this.mContext));
      this.mLastNetworkType = TXCSystemUtil.getNetworkType(this.mContext);
      this.mIntelligentRoute.fetchByUrl(this.mRtmpUrl, this.mChannelType);
      this.mRetryCount = 0;
      return;
    }
    if (!this.mEnableNearestIP) {
      paramBoolean = false;
    }
    if (this.mQuicChannel == true) {
      paramBoolean = true;
    }
    StringBuilder localStringBuilder = new StringBuilder("reconnect change ip: ").append(paramBoolean).append(" enableNearestIP: ").append(this.mEnableNearestIP).append(" last channel type: ");
    if (this.mQuicChannel) {}
    for (Object localObject = "Q Channel";; localObject = "TCP")
    {
      TXCLog.e("TXCStreamUploader", (String)localObject);
      if ((paramBoolean != true) || (nextRecordIdx(true))) {
        break;
      }
      TXCDRApi.reportEvent40003(this.mRtmpUrl, TXCDRDef.PEE_CONN_SERVER_FAILED, "connect upload server failed", "try all addresses");
      sendNotifyEvent(11011);
      return;
    }
    localObject = getRtmpRealConnectInfo();
    if (this.mQuicChannel == true)
    {
      TXCLog.e("TXCStreamUploader", "reconnect last channel type is Q Channel,  invoke reconnect " + this.mParam.retryInterval + "s after");
      TXCDRApi.reportEvent40003(this.mRtmpUrl, TXCDRDef.PEE_RECONN_BEGIN, "reconnect upload server", "reconnect last channel type is Q Channel,  invoke reconnect " + this.mParam.retryInterval + "s after");
      postReconnectMsg(((RtmpRealConnectInfo)localObject).connectUrl, ((RtmpRealConnectInfo)localObject).quicChannel, this.mParam.retryInterval * 1000);
      sendNotifyEvent(11016);
      return;
    }
    TXCLog.e("TXCStreamUploader", "reconnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.retryTimes + " invoke reconnect " + this.mParam.retryInterval + "s after");
    if (this.mRetryCount < this.mParam.retryTimes)
    {
      this.mRetryCount += 1;
      TXCDRApi.reportEvent40003(this.mRtmpUrl, TXCDRDef.PEE_RECONN_BEGIN, "reconnect upload server", "reconnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.retryTimes + " invoke reconnect " + this.mParam.retryInterval + "s after");
      postReconnectMsg(((RtmpRealConnectInfo)localObject).connectUrl, ((RtmpRealConnectInfo)localObject).quicChannel, this.mParam.retryInterval * 1000);
      sendNotifyEvent(11016);
      return;
    }
    TXCDRApi.reportEvent40003(this.mRtmpUrl, TXCDRDef.PEE_CONN_SERVER_FAILED, "connect upload server failed", "try all times");
    sendNotifyEvent(11012);
  }
  
  private void sendNotifyEvent(int paramInt)
  {
    if (paramInt == 0) {
      reconnect(false);
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        reconnect(true);
        return;
      }
      if (paramInt == 11001) {
        this.mConnectSuccessTimeStamps = TXCTimeUtil.getTimeTick();
      }
    } while (this.mNotifyListener == null);
    Bundle localBundle = new Bundle();
    switch (paramInt)
    {
    case 11004: 
    case 11008: 
    case 11009: 
    case 11010: 
    case 11014: 
    default: 
      localBundle.putString("EVT_MSG", "UNKNOWN");
    }
    for (;;)
    {
      localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
      if (this.mNotifyListener == null) {
        break;
      }
      this.mNotifyListener.onNotifyEvent(paramInt, localBundle);
      return;
      localBundle.putString("EVT_MSG", "所有IP都已经尝试失败,可以放弃治疗");
      paramInt = 64229;
      continue;
      localBundle.putString("EVT_MSG", "经连续多次重连失败，放弃重连");
      paramInt = 64229;
      continue;
      localBundle.putString("EVT_MSG", "超过30s没有数据发送，主动断开连接");
      paramInt = 64229;
      continue;
      localBundle.putString("EVT_MSG", "没有网络，请检测WiFi或移动数据是否开启");
      paramInt = 64229;
      continue;
      localBundle.putString("EVT_MSG", "连接服务器失败");
      paramInt = 3002;
      continue;
      paramInt = 1001;
      localBundle.putString("EVT_MSG", "已经连接rtmp服务器");
      continue;
      paramInt = 3003;
      localBundle.putString("EVT_MSG", "RTMP服务器握手失败");
      continue;
      localBundle.putString("EVT_MSG", "上行带宽不足，数据发送不及时");
      paramInt = 1101;
      continue;
      paramInt = 1002;
      localBundle.putString("EVT_MSG", "rtmp开始推流");
      continue;
      paramInt = 3004;
      localBundle.putString("EVT_MSG", "服务器拒绝连接请求，可能是该推流地址已经被占用");
      continue;
      paramInt = 1102;
      localBundle.putString("EVT_MSG", "启动网络重连");
    }
  }
  
  private void sendNotifyEvent(int paramInt, String paramString)
  {
    if (paramString.isEmpty()) {
      sendNotifyEvent(paramInt);
    }
    for (;;)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putString("EVT_MSG", paramString);
      localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
      switch (paramInt)
      {
      }
      while (this.mNotifyListener != null)
      {
        this.mNotifyListener.onNotifyEvent(paramInt, localBundle);
        return;
        paramInt = 3002;
        continue;
        paramInt = 3005;
        continue;
        paramInt = 3005;
      }
    }
  }
  
  private void stopPushTask()
  {
    TXCLog.d("TXCStreamUploader", "stop push task");
    synchronized (this.mThreadLock)
    {
      nativeStopPush(this.mUploaderInstance);
      return;
    }
  }
  
  private void tryResetRetryCount()
  {
    if ((this.mConnectSuccessTimeStamps != 0L) && (TXCTimeUtil.getTimeTick() - this.mConnectSuccessTimeStamps > this.mParam.retryTimes * (this.mParam.retryInterval + 13) * 1000))
    {
      this.mRetryCount = 0;
      this.mConnectSuccessTimeStamps = 0L;
      TXCLog.d("TXCStreamUploader", "reset retry count");
    }
  }
  
  public UploadStats getUploadStats()
  {
    for (;;)
    {
      synchronized (this.mThreadLock)
      {
        UploadStats localUploadStats = nativeGetStats(this.mUploaderInstance);
        if (localUploadStats != null)
        {
          if (this.mQuicChannel == true)
          {
            l = 2L;
            localUploadStats.channelType = l;
          }
        }
        else {
          return localUploadStats;
        }
      }
      long l = 1L;
    }
  }
  
  public int init()
  {
    return 0;
  }
  
  public native long nativeInitUploader(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  public native void nativeOnThreadRun(long paramLong);
  
  public native void nativeSetVideoDropParams(long paramLong, boolean paramBoolean, int paramInt1, int paramInt2);
  
  public native void nativeUninitUploader(long paramLong);
  
  public void onFetchDone(int paramInt, ArrayList<IPRecord> paramArrayList)
  {
    if (!this.mIsPushing) {
      return;
    }
    if (paramArrayList != null)
    {
      TXCLog.e("TXCStreamUploader", "onFetchDone: code = " + paramInt + " ip count = " + paramArrayList.size());
      if (paramInt == 0)
      {
        this.mIpList = paramArrayList;
        this.mCurrentRecordIdx = 0;
      }
    }
    paramArrayList = getRtmpRealConnectInfo();
    postReconnectMsg(paramArrayList.connectUrl, paramArrayList.quicChannel, 0);
  }
  
  public void pushAAC(byte[] paramArrayOfByte, long paramLong)
  {
    tryResetRetryCount();
    synchronized (this.mThreadLock)
    {
      if (this.mPushStartTS == 0L) {
        this.mPushStartTS = (paramLong - 3600000L);
      }
      nativePushAAC(this.mUploaderInstance, paramArrayOfByte, paramLong - this.mPushStartTS);
      return;
    }
  }
  
  public void pushNAL(TXSNALPacket paramTXSNALPacket)
  {
    tryResetRetryCount();
    synchronized (this.mThreadLock)
    {
      if (this.mPushStartTS == 0L) {
        this.mPushStartTS = (paramTXSNALPacket.dts - 3600000L);
      }
      if ((paramTXSNALPacket != null) && (paramTXSNALPacket.nalData != null) && (paramTXSNALPacket.nalData.length > 0)) {
        nativePushNAL(this.mUploaderInstance, paramTXSNALPacket.nalData, paramTXSNALPacket.nalType, paramTXSNALPacket.frameIndex, paramTXSNALPacket.pts - this.mPushStartTS, paramTXSNALPacket.dts - this.mPushStartTS);
      }
      return;
    }
  }
  
  public void reportNetStatus()
  {
    long l6 = TXCTimeUtil.getTimeTick();
    long l5 = l6 - this.mLastTimeStamp;
    UploadStats localUploadStats = getUploadStats();
    long l3 = 0L;
    long l2 = 0L;
    long l1 = 0L;
    long l4;
    if (localUploadStats != null)
    {
      if (this.mLastUploadStats == null) {
        break label374;
      }
      l4 = getSpeed(this.mLastUploadStats.inVideoBytes, localUploadStats.inVideoBytes, l5).longValue();
      l3 = getSpeed(this.mLastUploadStats.inAudioBytes, localUploadStats.inAudioBytes, l5).longValue();
      l1 = getSpeed(this.mLastUploadStats.outVideoBytes, localUploadStats.outVideoBytes, l5).longValue();
      l5 = getSpeed(this.mLastUploadStats.outAudioBytes, localUploadStats.outAudioBytes, l5).longValue();
      l2 = l1;
      l1 = l5;
    }
    for (;;)
    {
      setStatusValue(7001, Long.valueOf(l4));
      setStatusValue(7002, Long.valueOf(l3));
      setStatusValue(7003, Long.valueOf(l2));
      setStatusValue(7004, Long.valueOf(l1));
      setStatusValue(7005, Long.valueOf(localUploadStats.videoCacheLen));
      setStatusValue(7006, Long.valueOf(localUploadStats.audioCacheLen));
      setStatusValue(7007, Long.valueOf(localUploadStats.videoDropCount));
      setStatusValue(7008, Long.valueOf(localUploadStats.audioDropCount));
      setStatusValue(7009, Long.valueOf(localUploadStats.startTS));
      setStatusValue(7010, Long.valueOf(localUploadStats.dnsTS));
      setStatusValue(7011, Long.valueOf(localUploadStats.connTS));
      setStatusValue(7012, String.valueOf(localUploadStats.serverIP));
      if (this.mQuicChannel) {}
      for (l1 = 2L;; l1 = 1L)
      {
        setStatusValue(7013, Long.valueOf(l1));
        this.mLastTimeStamp = l6;
        this.mLastUploadStats = localUploadStats;
        if (this.mHandler != null) {
          this.mHandler.sendEmptyMessageDelayed(103, 2000L);
        }
        return;
      }
      label374:
      l4 = 0L;
    }
  }
  
  public void setAudioInfo(int paramInt1, int paramInt2)
  {
    if (this.mParam != null)
    {
      this.mParam.audioChannels = paramInt2;
      this.mParam.audioSamplerate = paramInt1;
    }
  }
  
  public void setDropEanble(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("drop enable ");
    if (paramBoolean) {
      ??? = "yes";
    }
    for (;;)
    {
      TXCLog.d("TXCStreamUploader", (String)???);
      synchronized (this.mThreadLock)
      {
        nativeEnableDrop(this.mUploaderInstance, paramBoolean);
        return;
        ??? = "no";
      }
    }
  }
  
  public void setMode(int paramInt)
  {
    if (this.mParam != null) {
      this.mParam.mode = paramInt;
    }
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mNotifyListener = paramTXINotifyListener;
  }
  
  public void setRetryInterval(int paramInt)
  {
    if (this.mParam != null) {
      this.mParam.retryInterval = paramInt;
    }
  }
  
  public void setRetryTimes(int paramInt)
  {
    if (this.mParam != null) {
      this.mParam.retryTimes = paramInt;
    }
  }
  
  public void setSendStrategy(boolean paramBoolean)
  {
    if (this.mParam.realtimeSendStrategy != paramBoolean) {}
    synchronized (this.mThreadLock)
    {
      long l = this.mUploaderInstance;
      if (this.mParam.realtimeSendStrategy)
      {
        if (this.mQuicChannel) {}
        for (i = 3;; i = 2)
        {
          nativeSetSendStrategy(l, i);
          this.mParam.realtimeSendStrategy = paramBoolean;
          return;
        }
      }
      int i = 1;
    }
  }
  
  public void setVideoDropParams(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder("drop params wait i frame:");
    if (paramBoolean) {
      ??? = "yes";
    }
    for (;;)
    {
      TXCLog.d("TXCStreamUploader", (String)??? + " max video count:" + paramInt1 + " max video cache time: " + paramInt2 + " ms");
      synchronized (this.mThreadLock)
      {
        this.mParam.isWaitIFrame = paramBoolean;
        this.mParam.maxDropVideoCount = paramInt1;
        this.mParam.maxDropVideoCacheTime = paramInt2;
        if (this.mUploaderInstance != 0L) {
          nativeSetVideoDropParams(this.mUploaderInstance, this.mParam.isWaitIFrame, this.mParam.maxDropVideoCount, this.mParam.maxDropVideoCacheTime);
        }
        return;
        ??? = "no";
      }
    }
  }
  
  public void start(String paramString, boolean paramBoolean, int paramInt)
  {
    if (this.mIsPushing == true) {
      return;
    }
    this.mIsPushing = true;
    this.mConnectSuccessTimeStamps = 0L;
    this.mRetryCount = 0;
    this.mRtmpUrl = paramString;
    this.mChannelType = paramInt;
    this.mPushStartTS = 0L;
    StringBuilder localStringBuilder = new StringBuilder("start push with url:").append(this.mRtmpUrl).append(" enable nearest ip:");
    if (paramBoolean) {}
    for (String str = "yes";; str = "no")
    {
      TXCLog.d("TXCStreamUploader", str + "channel type:" + paramInt);
      if (TXCSystemUtil.getNetworkType(this.mContext) != 255) {
        break;
      }
      sendNotifyEvent(11015);
      return;
    }
    this.mEnableNearestIP = paramBoolean;
    if (this.mHandlerThread == null)
    {
      this.mHandlerThread = new HandlerThread("RTMP_PUSH");
      this.mHandlerThread.start();
    }
    this.mHandler = new Handler(this.mHandlerThread.getLooper())
    {
      public void handleMessage(Message paramAnonymousMessage)
      {
        switch (paramAnonymousMessage.what)
        {
        case 102: 
        default: 
          return;
        case 101: 
          TXCStreamUploader localTXCStreamUploader = TXCStreamUploader.this;
          String str = (String)paramAnonymousMessage.obj;
          if (paramAnonymousMessage.arg1 == 2) {}
          for (boolean bool = true;; bool = false)
          {
            localTXCStreamUploader.startPushTask(str, bool, 0);
            return;
          }
        }
        TXCStreamUploader.this.reportNetStatus();
      }
    };
    if ((this.mEnableNearestIP) && (this.mLastNetworkType != TXCSystemUtil.getNetworkType(this.mContext)))
    {
      TXCLog.d("TXCStreamUploader", "fetching nearest ip list");
      this.mIntelligentRoute.fetchByUrl(paramString, paramInt);
    }
    for (;;)
    {
      this.mHandler.sendEmptyMessageDelayed(103, 2000L);
      return;
      startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
    }
  }
  
  public void startPushTask(final String paramString, final boolean paramBoolean, int paramInt)
  {
    TXCLog.d("TXCStreamUploader", "start push task");
    if ((this.mQuicChannel != paramBoolean) && (this.mQuicChannel == true)) {
      TXCDRApi.reportEvent40003(this.mRtmpUrl, TXCDRDef.PEE_QUIC_TO_TCP, "switch video push channel from quic to tcp", "limits:" + this.mParam.retryTimes + " current:" + this.mRetryCount);
    }
    this.mThread = new Thread("RTMPUpload")
    {
      public void run()
      {
        while (TXCStreamUploader.this.mUploaderInstance != 0L) {
          try
          {
            sleep(100L, 0);
          }
          catch (InterruptedException localInterruptedException) {}
        }
        for (;;)
        {
          int i;
          synchronized (TXCStreamUploader.this.mThreadLock)
          {
            TXCStreamUploader.this.mQuicChannel = paramBoolean;
            TXCStreamUploader localTXCStreamUploader1 = TXCStreamUploader.this;
            TXCStreamUploader localTXCStreamUploader2 = TXCStreamUploader.this;
            String str1 = TXCStreamUploader.this.mRtmpUrl;
            String str2 = paramString;
            boolean bool = paramBoolean;
            int j = TXCStreamUploader.this.mParam.audioSamplerate;
            int k = TXCStreamUploader.this.mParam.audioChannels;
            int m = TXCStreamUploader.this.mParam.mode;
            int n = TXCStreamUploader.this.mParam.videoFps;
            int i1 = TXCStreamUploader.this.mParam.maxDropVideoCount;
            if (TXCStreamUploader.this.mParam.realtimeSendStrategy) {
              if (paramBoolean)
              {
                i = 3;
                localTXCStreamUploader1.mUploaderInstance = localTXCStreamUploader2.nativeInitUploader(str1, str2, bool, j, k, m, n, i1, 16, i);
                if (TXCStreamUploader.this.mUploaderInstance != 0L) {
                  TXCStreamUploader.this.nativeSetVideoDropParams(TXCStreamUploader.this.mUploaderInstance, TXCStreamUploader.this.mParam.isWaitIFrame, TXCStreamUploader.this.mParam.maxDropVideoCount, TXCStreamUploader.this.mParam.maxDropVideoCacheTime);
                }
                TXCStreamUploader.this.nativeOnThreadRun(TXCStreamUploader.this.mUploaderInstance);
              }
            }
          }
          synchronized (TXCStreamUploader.this.mThreadLock)
          {
            TXCStreamUploader.this.nativeUninitUploader(TXCStreamUploader.this.mUploaderInstance);
            TXCStreamUploader.this.mUploaderInstance = 0L;
            return;
            i = 2;
            continue;
            i = 1;
            continue;
            localObject2 = finally;
            throw ((Throwable)localObject2);
          }
        }
      }
    };
    this.mThread.start();
  }
  
  public void stop()
  {
    if (!this.mIsPushing) {}
    for (;;)
    {
      return;
      this.mIsPushing = false;
      TXCLog.d("TXCStreamUploader", "stop push");
      synchronized (this.mThreadLock)
      {
        nativeStopPush(this.mUploaderInstance);
        this.mPushStartTS = 0L;
        if (this.mHandlerThread != null)
        {
          this.mHandlerThread.getLooper().quit();
          this.mHandlerThread = null;
        }
        if (this.mHandler == null) {
          continue;
        }
        this.mHandler = null;
        return;
      }
    }
  }
  
  private class RtmpRealConnectInfo
  {
    public String connectUrl = "";
    public boolean quicChannel = false;
    
    public RtmpRealConnectInfo(String paramString, boolean paramBoolean)
    {
      this.connectUrl = paramString;
      this.quicChannel = paramBoolean;
    }
  }
  
  public class UploadStats
  {
    public long audioCacheLen;
    public long audioDropCount;
    public long channelType;
    public long connTS;
    public long dnsTS;
    public long inAudioBytes;
    public long inVideoBytes;
    public long outAudioBytes;
    public long outVideoBytes;
    public String serverIP;
    public long startTS;
    public long videoCacheLen;
    public long videoDropCount;
    
    public UploadStats() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\network\TXCStreamUploader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */