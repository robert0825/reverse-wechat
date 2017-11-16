package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRDef;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCModule;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.util.Vector;

public class TXCStreamDownloader
  extends TXCModule
  implements TXINotifyListener, TXIStreamDownloaderListener
{
  public static final String TAG = "TXCStreamDownloader";
  public static final int TXE_DOWNLOAD_ERROR_ALLADDRESS_FAILED = 12031;
  public static final int TXE_DOWNLOAD_ERROR_CONNECT_FAILED = 12011;
  public static final int TXE_DOWNLOAD_ERROR_DISCONNECT = 12012;
  public static final int TXE_DOWNLOAD_ERROR_GET_RTMP_ACC_URL_FAIL = 12030;
  public static final int TXE_DOWNLOAD_ERROR_NET_RECONNECT = 12015;
  public static final int TXE_DOWNLOAD_ERROR_READ_FAILED = 12013;
  public static final int TXE_DOWNLOAD_ERROR_WRITE_FAILED = 12014;
  public static final int TXE_DOWNLOAD_INFO_CONNECT_END = 12007;
  public static final int TXE_DOWNLOAD_INFO_CONNECT_FAILED = 12004;
  public static final int TXE_DOWNLOAD_INFO_CONNECT_SUCCESS = 12001;
  public static final int TXE_DOWNLOAD_INFO_HANDSHAKE_FAIL = 12005;
  public static final int TXE_DOWNLOAD_INFO_PLAY_BEGIN = 12008;
  public static final int TXE_DOWNLOAD_INFO_SERVER_REFUSE = 12009;
  public TXRTMPAccUrlFetcher mAccUrlFetcher;
  public Context mApplicationContext;
  private int mDownloadFormat = 1;
  public TXIStreamDownloader mDownloader = null;
  public boolean mDownloaderRunning = false;
  public Handler mHandler = null;
  private DownloadStats mLastDownloadStats = null;
  private long mLastTimeStamp = 0L;
  private TXIStreamDownloaderListener mListener = null;
  private byte[] mListenerLock = new byte[0];
  private TXINotifyListener mNotifyListener = null;
  public Runnable mReportNetStatusRunnalbe = new Runnable()
  {
    public void run()
    {
      TXCStreamDownloader.this.reportNetStatus();
    }
  };
  
  static {}
  
  public TXCStreamDownloader(Context paramContext, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {}
    for (this.mDownloader = new TXCFLVDownloader();; this.mDownloader = new TXCRTMPDownloader()) {
      do
      {
        if (this.mDownloader != null)
        {
          this.mDownloader.setListener(this);
          this.mDownloader.setNotifyListener(this);
        }
        this.mDownloadFormat = paramInt2;
        this.mAccUrlFetcher = new TXRTMPAccUrlFetcher(paramContext);
        this.mApplicationContext = paramContext;
        if (this.mApplicationContext != null) {
          this.mHandler = new Handler(this.mApplicationContext.getMainLooper());
        }
        return;
      } while ((paramInt2 != 1) && (paramInt2 != 4));
    }
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
  
  private void reportNetStatusInternal()
  {
    long l1 = 0L;
    long l3 = TXCTimeUtil.getTimeTick();
    long l4 = l3 - this.mLastTimeStamp;
    DownloadStats localDownloadStats = getDownloadStats();
    RealTimeStreamInfo localRealTimeStreamInfo = getRealTimeStreamInfo();
    long l2;
    if (localDownloadStats != null)
    {
      if (this.mLastDownloadStats == null) {
        break label320;
      }
      l2 = getSpeed(this.mLastDownloadStats.afterParseVideoBytes, localDownloadStats.afterParseVideoBytes, l4).longValue();
      l1 = getSpeed(this.mLastDownloadStats.afterParseAudioBytes, localDownloadStats.afterParseAudioBytes, l4).longValue();
    }
    for (;;)
    {
      setStatusValue(7101, Long.valueOf(l2));
      setStatusValue(7102, Long.valueOf(l1));
      setStatusValue(7103, Long.valueOf(localDownloadStats.firstVideoTS));
      setStatusValue(7104, Long.valueOf(localDownloadStats.firstAudioTS));
      if (localRealTimeStreamInfo != null)
      {
        setStatusValue(7105, Long.valueOf(localRealTimeStreamInfo.errorCode));
        setStatusValue(7106, localRealTimeStreamInfo.errorInfo);
        if (!localRealTimeStreamInfo.quicChannel) {
          break label315;
        }
      }
      label315:
      for (l1 = 2L;; l1 = 1L)
      {
        setStatusValue(7111, Long.valueOf(l1));
        setStatusValue(7112, localRealTimeStreamInfo.streamUrl);
        setStatusValue(7113, localRealTimeStreamInfo.streamId);
        setStatusValue(7114, localRealTimeStreamInfo.bizid);
        setStatusValue(7107, Long.valueOf(localDownloadStats.startTS));
        setStatusValue(7108, Long.valueOf(localDownloadStats.dnsTS));
        setStatusValue(7109, Long.valueOf(localDownloadStats.connTS));
        setStatusValue(7110, String.valueOf(localDownloadStats.serverIP));
        this.mLastTimeStamp = l3;
        this.mLastDownloadStats = localDownloadStats;
        return;
      }
      label320:
      l2 = 0L;
    }
  }
  
  private void tryResetRetryCount()
  {
    if (this.mDownloader != null) {
      this.mDownloader.connectRetryTimes = 0;
    }
  }
  
  public DownloadStats getDownloadStats()
  {
    if (this.mDownloader != null) {
      return this.mDownloader.getDownloadStats();
    }
    return null;
  }
  
  public RealTimeStreamInfo getRealTimeStreamInfo()
  {
    RealTimeStreamInfo localRealTimeStreamInfo = new RealTimeStreamInfo();
    if (this.mAccUrlFetcher != null)
    {
      localRealTimeStreamInfo.streamId = this.mAccUrlFetcher.getStreamId();
      localRealTimeStreamInfo.bizid = this.mAccUrlFetcher.getBizid();
      localRealTimeStreamInfo.errorCode = this.mAccUrlFetcher.getErrorCode();
      localRealTimeStreamInfo.errorInfo = this.mAccUrlFetcher.getErrorInfo();
    }
    if (this.mDownloader != null)
    {
      localRealTimeStreamInfo.streamUrl = this.mDownloader.getCurrentStreamUrl();
      localRealTimeStreamInfo.quicChannel = this.mDownloader.isQuicChannel();
    }
    return localRealTimeStreamInfo;
  }
  
  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    int i = 3002;
    for (;;)
    {
      Bundle localBundle;
      synchronized (this.mListenerLock)
      {
        if (this.mNotifyListener != null) {
          localBundle = new Bundle();
        }
        switch (paramInt)
        {
        case 12002: 
        case 12003: 
        case 12006: 
        case 12010: 
        case 12016: 
        case 12017: 
        case 12018: 
        case 12019: 
        case 12020: 
        case 12021: 
        case 12022: 
        case 12023: 
        case 12024: 
        case 12025: 
        case 12026: 
        case 12027: 
        case 12028: 
        case 12029: 
          localBundle.putString("EVT_MSG", "UNKNOWN event = " + paramInt);
          i = paramInt;
          String str = "";
          if (paramBundle != null) {
            str = paramBundle.getString("EVT_MSG", "");
          }
          if ((str != null) && (!str.isEmpty())) {
            localBundle.putString("EVT_MSG", str);
          }
          localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
          this.mNotifyListener.onNotifyEvent(i, localBundle);
          if (paramInt == 12001) {
            reportNetStatusInternal();
          }
          return;
        case 12005: 
          localBundle.putString("EVT_MSG", "RTMP服务器握手失败");
          i = 3003;
          break;
        case 12012: 
          localBundle.putString("EVT_MSG", "经多次自动重连失败，放弃连接");
          i = 63235;
          break;
        case 12011: 
          localBundle.putString("EVT_MSG", "连接服务器失败");
        }
      }
      localBundle.putString("EVT_MSG", "读数据错误，网络连接断开");
      i = 3005;
      continue;
      localBundle.putString("EVT_MSG", "写数据错误，网络连接断开");
      i = 3005;
      continue;
      localBundle.putString("EVT_MSG", "获取加速拉流地址失败");
      i = 63234;
      continue;
      localBundle.putString("EVT_MSG", "所有拉流地址尝试失败,可以放弃治疗");
      i = 63235;
      continue;
      localBundle.putString("EVT_MSG", "连接结束");
      i = paramInt;
      continue;
      localBundle.putString("EVT_MSG", "已连接服务器");
      i = 2001;
      continue;
      localBundle.putString("EVT_MSG", "连接服务器失败");
      continue;
      localBundle.putString("EVT_MSG", "启动网络重连");
      i = 2103;
      continue;
      localBundle.putString("EVT_MSG", "开始拉流");
      i = 2002;
      continue;
      localBundle.putString("EVT_MSG", "服务器拒绝连接请求");
      i = 2103;
    }
  }
  
  public void onPullAudio(TXSAudioPacket paramTXSAudioPacket)
  {
    tryResetRetryCount();
    synchronized (this.mListenerLock)
    {
      if (this.mListener != null) {
        this.mListener.onPullAudio(paramTXSAudioPacket);
      }
      return;
    }
  }
  
  public void onPullNAL(TXSNALPacket paramTXSNALPacket)
  {
    tryResetRetryCount();
    synchronized (this.mListenerLock)
    {
      if (this.mListener != null) {
        this.mListener.onPullNAL(paramTXSNALPacket);
      }
      return;
    }
  }
  
  public void reportNetStatus()
  {
    reportNetStatusInternal();
    this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
  }
  
  public void setListener(TXIStreamDownloaderListener paramTXIStreamDownloaderListener)
  {
    synchronized (this.mListenerLock)
    {
      this.mListener = paramTXIStreamDownloaderListener;
      return;
    }
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    synchronized (this.mListenerLock)
    {
      this.mNotifyListener = paramTXINotifyListener;
      return;
    }
  }
  
  public void setRetryInterval(int paramInt)
  {
    if (this.mDownloader != null) {
      this.mDownloader.connectRetryInterval = paramInt;
    }
  }
  
  public void setRetryTimes(int paramInt)
  {
    if (this.mDownloader != null) {
      this.mDownloader.connectRetryLimit = paramInt;
    }
  }
  
  public int start(final String paramString, boolean paramBoolean, int paramInt)
  {
    boolean bool = true;
    this.mDownloaderRunning = true;
    if ((paramBoolean) && (this.mDownloadFormat == 4))
    {
      paramInt = this.mAccUrlFetcher.getAccerateStreamPlayUrl(paramString, paramInt, new TXRTMPAccUrlFetcher.OnGetAccerateStreamPlayUrl()
      {
        public void onGetAccelerateStreamPlayUrl(int paramAnonymousInt, String paramAnonymousString, Vector<TXCStreamPlayUrl> paramAnonymousVector)
        {
          if ((paramAnonymousInt == 0) && (paramAnonymousVector != null) && (!paramAnonymousVector.isEmpty())) {
            if (TXCStreamDownloader.this.mDownloaderRunning)
            {
              if (TXCStreamDownloader.this.mDownloader != null) {
                TXCStreamDownloader.this.mDownloader.startDownload(paramAnonymousVector, true, true);
              }
              if (TXCStreamDownloader.this.mHandler != null) {
                TXCStreamDownloader.this.mHandler.postDelayed(TXCStreamDownloader.this.mReportNetStatusRunnalbe, 2000L);
              }
              paramAnonymousString = TXCStreamDownloader.this.mAccUrlFetcher.getBizid();
              TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, TXCDRDef.DR_DAU_EVENT_ID_LINK_MIC, paramAnonymousInt, paramAnonymousString);
            }
          }
          do
          {
            return;
            TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, TXCDRDef.DR_DAU_EVENT_ID_LINK_MIC, -4, "livePlayer have been stopped");
            return;
            TXCStreamDownloader.this.onNotifyEvent(12030, null);
            TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, TXCDRDef.DR_DAU_EVENT_ID_LINK_MIC, paramAnonymousInt, paramAnonymousString);
            TXCLog.e("TXCStreamDownloader", "getAccelerateStreamPlayUrl failed, play stream with raw url");
          } while ((!TXCStreamDownloader.this.mDownloaderRunning) || (TXCStreamDownloader.this.mDownloader == null));
          paramAnonymousString = new Vector();
          paramAnonymousString.add(new TXCStreamPlayUrl(paramString, false));
          TXCStreamDownloader.this.mDownloader.startDownload(paramAnonymousString, false, false);
        }
      });
      if (paramInt != 0)
      {
        if (paramInt != -1) {
          break label134;
        }
        TXCDRApi.txReportDAU(this.mApplicationContext, TXCDRDef.DR_DAU_EVENT_ID_LINK_MIC, paramInt, "invalid playUrl");
        TXCLog.e("TXCStreamDownloader", "getAccelerateStreamPlayUrl failed, result = " + paramInt + ", play stream with raw url");
        if (this.mDownloader != null)
        {
          localVector = new Vector();
          localVector.add(new TXCStreamPlayUrl(paramString, false));
          this.mDownloader.startDownload(localVector, false, false);
        }
      }
    }
    label134:
    while (this.mDownloader == null) {
      for (;;)
      {
        return 0;
        if (paramInt == -2) {
          TXCDRApi.txReportDAU(this.mApplicationContext, TXCDRDef.DR_DAU_EVENT_ID_LINK_MIC, paramInt, "invalid streamID");
        } else if (paramInt == -3) {
          TXCDRApi.txReportDAU(this.mApplicationContext, TXCDRDef.DR_DAU_EVENT_ID_LINK_MIC, paramInt, "invalid signature");
        }
      }
    }
    Vector localVector = new Vector();
    localVector.add(new TXCStreamPlayUrl(paramString, false));
    paramString = this.mDownloader;
    if (this.mDownloadFormat == 4) {}
    for (;;)
    {
      paramString.startDownload(localVector, bool, paramBoolean);
      if (this.mHandler == null) {
        break;
      }
      this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
      return 0;
      bool = false;
    }
  }
  
  public void stop()
  {
    this.mDownloaderRunning = false;
    if (this.mDownloader != null) {
      this.mDownloader.stopDownload();
    }
    if (this.mHandler != null) {
      this.mHandler.removeCallbacks(this.mReportNetStatusRunnalbe);
    }
  }
  
  public static class DownloadStats
  {
    public long afterParseAudioBytes;
    public long afterParseVideoBytes;
    public long beforeParseAudioBytes;
    public long beforeParseVideoBytes;
    public long connTS;
    public long dnsTS;
    public long firstAudioTS;
    public long firstVideoTS;
    public String serverIP;
    public long startTS;
  }
  
  public static class RealTimeStreamInfo
  {
    public String bizid;
    public int errorCode;
    public String errorInfo;
    public boolean quicChannel;
    public String streamId;
    public String streamUrl;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\network\TXCStreamDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */