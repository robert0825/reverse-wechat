package com.tencent.rtmp;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.liteav.audio.TXCAudioPlayer;
import com.tencent.liteav.audio.impl.TXAudioJitterBufferReportInfo;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRDef;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.jitterbuffer.TXCVideoJitterBuffer;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.network.TXCStreamDownloader.DownloadStats;
import com.tencent.liteav.network.TXCStreamDownloader.RealTimeStreamInfo;
import com.tencent.liteav.renderer.TXCVideoRender;
import com.tencent.liteav.renderer.TXCVideoRender.RenderStats;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TXLivePlayStatsCollection
  implements ITXStatsCollection
{
  private static HandlerThread sCollectThread = null;
  private final String TAG = "TXLivePlayStatsCollection";
  private String mAppVersion;
  private Context mApplicationContext;
  private WeakReference<TXCAudioPlayer> mAudioPlayer;
  public int mCollectInterval = 1000;
  private Object mCollectLock;
  private WeakReference<TXCStreamDownloader> mDownloader = null;
  private long mFirstIFrameRender;
  private HashMap mFix;
  public Handler mHandler = null;
  private boolean mIsCollecting;
  private int mIsP2P;
  private boolean mIsReportBegin;
  private WeakReference<TXCVideoJitterBuffer> mJitter = null;
  private HashMap mLast;
  private long mLastBlockCount;
  private long mLastNotify;
  private long mLastReport;
  private long mLastTimeStamp;
  private WeakReference<TXINotifyListener> mListener = null;
  private long mMaxVideoCache = 0L;
  private long mNumVideoCache = 0L;
  private String mPlayUrl;
  private boolean mRealTimeMode = false;
  private WeakReference<TXCVideoRender> mRender = null;
  private Runnable mRunnable = null;
  private long mStartTime = 0L;
  private HashMap mStats;
  private int mStatusReportInterval;
  private long mSumVideoCache = 0L;
  
  public TXLivePlayStatsCollection(Context paramContext)
  {
    this.mApplicationContext = paramContext;
    this.mPlayUrl = "";
    this.mAppVersion = "";
    this.mIsP2P = 0;
    this.mStatusReportInterval = 5000;
    if (sCollectThread == null)
    {
      paramContext = new HandlerThread("TXCLivePlayStats");
      sCollectThread = paramContext;
      paramContext.start();
    }
    this.mHandler = new Handler(sCollectThread.getLooper());
    this.mRunnable = new Runnable()
    {
      public void run()
      {
        TXLivePlayStatsCollection.this.collectStatus();
        TXLivePlayStatsCollection.this.mHandler.postDelayed(this, TXLivePlayStatsCollection.this.mCollectInterval);
      }
    };
    this.mIsCollecting = false;
    this.mLastTimeStamp = 0L;
    this.mCollectLock = new Object();
    this.mStats = new HashMap(100);
    this.mFix = new HashMap(100);
    this.mLast = new HashMap(100);
  }
  
  private void clearStats()
  {
    if (this.mStats != null) {
      this.mStats.clear();
    }
    if (this.mLast != null) {
      this.mLast.clear();
    }
    if (this.mFix != null) {
      this.mFix.clear();
    }
  }
  
  private long getFieldLong(String paramString)
  {
    paramString = (Number)this.mStats.get(paramString);
    if (paramString != null) {
      return paramString.longValue();
    }
    return 0L;
  }
  
  private int getFieldValue(String paramString)
  {
    paramString = (Number)this.mStats.get(paramString);
    if (paramString != null) {
      return paramString.intValue();
    }
    return 0;
  }
  
  private Bundle getStauts()
  {
    Bundle localBundle = new Bundle();
    int i = ((Long)this.mStats.get("u32_app_cpu_usage")).intValue() / 10;
    int j = ((Long)this.mStats.get("u32_cpu_usage")).intValue() / 10;
    localBundle.putCharSequence("CPU_USAGE", i + "/" + j + "%");
    localBundle.putInt("VIDEO_WIDTH", getFieldValue("VIDEO_WIDTH"));
    localBundle.putInt("VIDEO_HEIGHT", getFieldValue("VIDEO_HEIGHT"));
    localBundle.putInt("NET_SPEED", getFieldValue("u32_avg_net_speed"));
    localBundle.putInt("VIDEO_FPS", getFieldValue("u32_fps") / 10);
    localBundle.putInt("DROP_SIZE", getFieldValue("video_drop"));
    localBundle.putInt("VIDEO_BITRATE", getFieldValue("u32_avg_video_bitrate"));
    localBundle.putInt("AUDIO_BITRATE", getFieldValue("u32_avg_audio_bitrate"));
    localBundle.putInt("CODEC_CACHE", getFieldValue("CODEC_CACHE"));
    localBundle.putInt("CACHE_SIZE", getFieldValue("u32_avg_cache_count"));
    localBundle.putCharSequence("SERVER_IP", (String)this.mStats.get("u32_server_ip"));
    return localBundle;
  }
  
  private void newStats()
  {
    if (this.mStats == null) {
      this.mStats = new HashMap(100);
    }
    if (this.mLast == null) {
      this.mLast = new HashMap(100);
    }
    if (this.mFix == null) {
      this.mFix = new HashMap(100);
    }
  }
  
  private void reportBeginEvt()
  {
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.url = this.mPlayUrl;
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    String str = (String)this.mStats.get("token");
    TXCDRApi.InitEvent(this.mApplicationContext, str, TXCDRDef.COMMAND_ID_40101, TXCDRDef.MODULE_PLAYER_SDK, localTXCDRExtInfo);
    long l3 = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u64_timestamp", l3);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "str_device_type", (String)this.mStats.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_network_type", getFieldValue("u32_network_type"));
    long l1;
    if (getFieldLong("u32_dns_time") == -1L)
    {
      l1 = -1L;
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_dns_time", l1);
      TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "u32_server_ip", (String)this.mStats.get("u32_server_ip"));
      if (getFieldLong("u32_connect_server_time") != -1L) {
        break label643;
      }
    }
    label643:
    for (long l2 = -1L;; l2 = getFieldLong("u32_connect_server_time") - getFieldLong("u64_timestamp"))
    {
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_connect_server_time", l2);
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_stream_begin", -1L);
      this.mFirstIFrameRender = (getFieldLong("u32_first_i_frame") - getFieldLong("u64_timestamp"));
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_first_i_frame", this.mFirstIFrameRender);
      long l4 = getFieldLong("u32_first_frame_down") - getFieldLong("u64_timestamp");
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_first_frame_down", l4);
      TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "str_user_id", (String)this.mStats.get("str_user_id"));
      TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "str_package_name", (String)this.mStats.get("str_package_name"));
      TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "str_app_version", this.mAppVersion);
      TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "dev_uuid", (String)this.mStats.get("dev_uuid"));
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_isp2p", this.mIsP2P);
      TXCDRApi.nativeReportEvent(str, TXCDRDef.COMMAND_ID_40101);
      TXCLog.w("TXLivePlayStatsCollection", "report evt 40101: token=" + str + " u64_timestamp=" + l3 + " str_device_type=" + (String)this.mStats.get("str_device_type") + " u32_network_type=" + getFieldValue("u32_network_type") + " u32_dns_time=" + l1 + " u32_connect_server_time=" + l2 + " u32_server_ip=" + (String)this.mStats.get("u32_server_ip") + " u32_first_frame_down=" + l4 + " u32_first_i_frame=" + this.mFirstIFrameRender + " str_user_id=" + (String)this.mStats.get("str_user_id") + " str_package_name=" + (String)this.mStats.get("str_package_name") + " str_app_version=" + this.mAppVersion + " dev_uuid=" + (String)this.mStats.get("dev_uuid") + " u32_isp2p=" + this.mIsP2P);
      return;
      l1 = getFieldLong("u32_dns_time") - getFieldLong("u64_timestamp");
      break;
    }
  }
  
  private void reportEndEvt()
  {
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.url = this.mPlayUrl;
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    String str = (String)this.mStats.get("token");
    TXCDRApi.InitEvent(this.mApplicationContext, str, TXCDRDef.COMMAND_ID_40102, TXCDRDef.MODULE_PLAYER_SDK, localTXCDRExtInfo);
    long l1 = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u64_timestamp", l1);
    long l2 = (TXCTimeUtil.getTimeTick() - getFieldLong("u64_timestamp")) / 1000L;
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u32_result", l2);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u32_avg_block_time", getFieldValue("u32_avg_block_time"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40102, "str_app_version", this.mAppVersion);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u32_isp2p", this.mIsP2P);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u32_avg_load", getFieldValue("u32_avg_load"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u32_load_cnt", getFieldValue("u32_load_cnt"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u32_max_load", getFieldValue("u32_max_load"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u32_first_i_frame", this.mFirstIFrameRender);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u32_speed_cnt", getFieldValue("u32_speed_cnt"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40102, "u32_nodata_cnt", getFieldValue("u32_nodata_cnt"));
    TXCDRApi.nativeReportEvent(str, TXCDRDef.COMMAND_ID_40102);
    TXCLog.w("TXLivePlayStatsCollection", "report evt 40102: token=" + str + " u64_timestamp=" + l1 + " u32_result=" + l2 + " u32_avg_block_time=" + getFieldValue("u32_avg_block_time") + " u32_first_i_frame=" + this.mFirstIFrameRender + " str_app_version=" + this.mAppVersion + " u32_isp2p=" + this.mIsP2P + " u32_avg_load=" + getFieldValue("u32_avg_load") + " u32_load_cnt=" + getFieldValue("u32_load_cnt") + " u32_max_load=" + getFieldValue("u32_max_load") + " u32_speed_cnt=" + getFieldValue("u32_speed_cnt") + " u32_nodata_cnt=" + getFieldValue("u32_nodata_cnt"));
  }
  
  private void reportFailed()
  {
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.url = this.mPlayUrl;
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    String str = (String)this.mStats.get("token");
    TXCDRApi.InitEvent(this.mApplicationContext, str, TXCDRDef.COMMAND_ID_40101, TXCDRDef.MODULE_PLAYER_SDK, localTXCDRExtInfo);
    long l = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u64_timestamp", l);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "str_device_type", (String)this.mStats.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_network_type", getFieldValue("u32_network_type"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_dns_time", -1L);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "u32_server_ip", "");
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_connect_server_time", -1L);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_stream_begin", -1L);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_first_i_frame", -1L);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_first_frame_down", -1L);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "str_user_id", (String)this.mStats.get("str_user_id"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "str_package_name", (String)this.mStats.get("str_package_name"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "str_app_version", this.mAppVersion);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40101, "dev_uuid", (String)this.mStats.get("dev_uuid"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40101, "u32_isp2p", this.mIsP2P);
    TXCDRApi.nativeReportEvent(str, TXCDRDef.COMMAND_ID_40101);
  }
  
  private void reportRealTimePlayStatisticInfo()
  {
    if (this.mStartTime == 0L) {
      return;
    }
    HashMap localHashMap = new HashMap();
    Object localObject1;
    Object localObject3;
    String str;
    Object localObject2;
    int i;
    boolean bool;
    if (this.mDownloader != null)
    {
      localObject1 = (TXCStreamDownloader)this.mDownloader.get();
      if (localObject1 != null)
      {
        TXCStreamDownloader.RealTimeStreamInfo localRealTimeStreamInfo = ((TXCStreamDownloader)localObject1).getRealTimeStreamInfo();
        if (localRealTimeStreamInfo != null)
        {
          localObject3 = localRealTimeStreamInfo.streamUrl;
          str = localRealTimeStreamInfo.streamId;
          localObject2 = localRealTimeStreamInfo.bizid;
          i = localRealTimeStreamInfo.errorCode;
          localObject1 = localRealTimeStreamInfo.errorInfo;
          bool = localRealTimeStreamInfo.quicChannel;
        }
      }
    }
    for (;;)
    {
      localHashMap.put("stream_url", localObject3);
      localHashMap.put("stream_id", str);
      localHashMap.put("bizid", localObject2);
      localHashMap.put("err_code", String.valueOf(i));
      localHashMap.put("err_info", localObject1);
      if (bool) {}
      for (localObject1 = "2";; localObject1 = "1")
      {
        localHashMap.put("channel_type", localObject1);
        long l1 = System.currentTimeMillis();
        long l2 = this.mStartTime;
        localHashMap.put("start_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.mStartTime)));
        localHashMap.put("end_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(l1)));
        localHashMap.put("total_time", String.valueOf(l1 - l2));
        long l4 = 0L;
        long l5 = 0L;
        long l6 = 0L;
        l2 = l6;
        long l3 = l5;
        l1 = l4;
        if (this.mRender != null)
        {
          localObject1 = (TXCVideoRender)this.mRender.get();
          l2 = l6;
          l3 = l5;
          l1 = l4;
          if (localObject1 != null)
          {
            localObject1 = ((TXCVideoRender)localObject1).getRenderStats();
            l2 = l6;
            l3 = l5;
            l1 = l4;
            if (localObject1 != null)
            {
              l1 = ((TXCVideoRender.RenderStats)localObject1).totalBlockCount;
              l3 = ((TXCVideoRender.RenderStats)localObject1).blockTime;
              l2 = ((TXCVideoRender.RenderStats)localObject1).maxBlockDuration;
            }
          }
        }
        l4 = 0L;
        if (l1 != 0L) {
          l4 = l3 / l1;
        }
        localHashMap.put("block_count", String.valueOf(l1));
        localHashMap.put("block_duration_max", String.valueOf(l2));
        localHashMap.put("block_duration_avg", String.valueOf(l4));
        l1 = 0L;
        if (this.mNumVideoCache != 0L) {
          l1 = this.mSumVideoCache / this.mNumVideoCache;
        }
        localHashMap.put("jitter_cache_max", String.valueOf(this.mMaxVideoCache));
        localHashMap.put("jitter_cache_avg", String.valueOf(l1));
        localObject1 = TXCDRApi.txCreateToken();
        i = TXCDRDef.COMMAND_ID_LINKMIC;
        int j = TXCDRDef.MODULE_PUSH_SDK;
        localObject2 = new TXCDRExtInfo();
        ((TXCDRExtInfo)localObject2).command_id_comment = "LINKMIC";
        TXCDRApi.InitEvent(this.mApplicationContext, (String)localObject1, i, j, (TXCDRExtInfo)localObject2);
        localObject2 = localHashMap.entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          str = (String)((Map.Entry)localObject3).getKey();
          localObject3 = (String)((Map.Entry)localObject3).getValue();
          TXCLog.e("TXLivePlayStatsCollection", "RealTimePlayStatisticInfo: " + str + " = " + (String)localObject3);
          if ((str != null) && (str.length() > 0) && (localObject3 != null)) {
            TXCDRApi.txSetEventValue((String)localObject1, i, str, (String)localObject3);
          }
        }
      }
      TXCDRApi.nativeReportEvent((String)localObject1, i);
      this.mRealTimeMode = false;
      this.mStartTime = 0L;
      this.mNumVideoCache = 0L;
      this.mSumVideoCache = 0L;
      this.mMaxVideoCache = 0L;
      return;
      bool = false;
      localObject1 = "";
      i = 0;
      localObject2 = "";
      str = "";
      localObject3 = "";
    }
  }
  
  private void reportStatus()
  {
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.url = this.mPlayUrl;
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = true;
    String str = (String)this.mStats.get("token");
    TXCDRApi.InitEvent(this.mApplicationContext, str, TXCDRDef.COMMAND_ID_40100, TXCDRDef.MODULE_PLAYER_SDK, localTXCDRExtInfo);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40100, "u32_avg_net_speed", getFieldValue("u32_avg_net_speed"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40100, "u32_fps", getFieldValue("u32_fps") / 10);
    if ((this.mLastBlockCount != -1L) && (getFieldLong("u32_avg_block_count") >= this.mLastBlockCount)) {
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40100, "u32_avg_block_count", getFieldLong("u32_avg_block_count") - this.mLastBlockCount);
    }
    for (;;)
    {
      this.mLastBlockCount = getFieldLong("u32_avg_block_count");
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40100, "u32_avg_cache_count", getFieldValue("u32_avg_cache_count"));
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40100, "u32_cpu_usage", getFieldValue("u32_cpu_usage"));
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40100, "u32_app_cpu_usage", getFieldValue("u32_app_cpu_usage"));
      TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40100, "str_app_version", this.mAppVersion);
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40100, "u32_isp2p", this.mIsP2P);
      TXCDRApi.nativeReportEvent(str, TXCDRDef.COMMAND_ID_40100);
      return;
      TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40100, "u32_avg_block_count", 0L);
    }
  }
  
  private void setupStatus()
  {
    this.mStats.put("str_user_id", TXCSystemUtil.getUserId(this.mApplicationContext));
    this.mStats.put("str_device_type", TXCSystemUtil.getDeviceName());
    this.mStats.put("str_device_type", TXCSystemUtil.getDeviceName());
    this.mStats.put("u32_network_type", Integer.valueOf(TXCSystemUtil.getNetworkType(this.mApplicationContext)));
    this.mStats.put("token", TXCSystemUtil.createUUID());
    this.mStats.put("str_package_name", TXCSystemUtil.getPackageName(this.mApplicationContext));
    this.mStats.put("dev_uuid", TXCSystemUtil.getDevUUID(this.mApplicationContext));
  }
  
  private long updateField(String paramString, long paramLong)
  {
    if (!this.mFix.containsKey(paramString)) {
      this.mFix.put(paramString, Long.valueOf(0L));
    }
    if (!this.mLast.containsKey(paramString)) {
      this.mLast.put(paramString, Long.valueOf(0L));
    }
    if (((Long)this.mLast.get(paramString)).longValue() > paramLong)
    {
      this.mFix.put(paramString, Long.valueOf(((Long)this.mFix.get(paramString)).longValue() + paramLong));
      this.mLast.put(paramString, Long.valueOf(paramLong));
      return paramLong;
    }
    long l = ((Long)this.mLast.get(paramString)).longValue();
    this.mLast.put(paramString, Long.valueOf(paramLong));
    return paramLong - l;
  }
  
  private void updateLoadInfo(TXAudioJitterBufferReportInfo paramTXAudioJitterBufferReportInfo)
  {
    if (paramTXAudioJitterBufferReportInfo == null) {
      return;
    }
    if (paramTXAudioJitterBufferReportInfo.mLoadCnt == 0) {}
    for (long l = 0L;; l = paramTXAudioJitterBufferReportInfo.mLoadTime / paramTXAudioJitterBufferReportInfo.mLoadCnt)
    {
      this.mStats.put("u32_avg_load", Long.valueOf(l));
      this.mStats.put("u32_load_cnt", Integer.valueOf(paramTXAudioJitterBufferReportInfo.mLoadCnt));
      this.mStats.put("u32_max_load", Integer.valueOf(paramTXAudioJitterBufferReportInfo.mLoadMaxTime));
      this.mStats.put("u32_speed_cnt", Integer.valueOf(paramTXAudioJitterBufferReportInfo.mSpeedCnt));
      this.mStats.put("u32_nodata_cnt", Integer.valueOf(paramTXAudioJitterBufferReportInfo.mNoDataCnt));
      return;
    }
  }
  
  private void updateNetStats(TXCStreamDownloader.DownloadStats paramDownloadStats, long paramLong)
  {
    if ((paramDownloadStats == null) || (paramLong == 0L)) {
      return;
    }
    long l1 = updateField("u32_avg_audio_bitrate", paramDownloadStats.afterParseAudioBytes);
    this.mStats.put("u32_avg_audio_bitrate", Long.valueOf(8L * l1 * 1000L / (1024L * paramLong)));
    long l2 = updateField("u32_avg_video_bitrate", paramDownloadStats.afterParseVideoBytes);
    this.mStats.put("u32_avg_video_bitrate", Long.valueOf(8L * l2 * 1000L / (1024L * paramLong)));
    this.mStats.put("u32_avg_net_speed", Long.valueOf((l1 + l2) * 8L * 1000L / (1024L * paramLong)));
    this.mStats.put("u32_server_ip", paramDownloadStats.serverIP);
    this.mStats.put("u32_dns_time", Long.valueOf(paramDownloadStats.dnsTS));
    this.mStats.put("u32_connect_server_time", Long.valueOf(paramDownloadStats.connTS));
    this.mStats.put("u64_timestamp", Long.valueOf(paramDownloadStats.startTS));
    this.mStats.put("u32_first_frame_down", Long.valueOf(paramDownloadStats.firstVideoTS));
  }
  
  private void updateRenderStats(TXCVideoRender.RenderStats paramRenderStats, long paramLong)
  {
    if ((paramRenderStats == null) || (paramLong == 0L)) {
      return;
    }
    long l = updateField("u32_fps", paramRenderStats.renderFrameCount);
    this.mStats.put("u32_fps", Long.valueOf(l * 10000L / paramLong));
    this.mStats.put("u32_first_i_frame", Long.valueOf(paramRenderStats.firstFrameRenderTS));
    this.mStats.put("u32_avg_block_count", Long.valueOf(paramRenderStats.blockCount));
    this.mStats.put("u32_avg_block_time", Long.valueOf(paramRenderStats.blockTime));
    this.mStats.put("VIDEO_WIDTH", Long.valueOf(paramRenderStats.videoWidth));
    this.mStats.put("VIDEO_HEIGHT", Long.valueOf(paramRenderStats.videoHeight));
  }
  
  public void collectStatus()
  {
    synchronized (this.mCollectLock)
    {
      if (this.mDownloader != null)
      {
        localObject2 = (TXCStreamDownloader)this.mDownloader.get();
        if (localObject2 != null) {
          updateNetStats(((TXCStreamDownloader)localObject2).getDownloadStats(), TXCTimeUtil.getTimeTick() - this.mLastTimeStamp);
        }
      }
      if (this.mRender != null)
      {
        localObject2 = (TXCVideoRender)this.mRender.get();
        if (localObject2 != null) {
          updateRenderStats(((TXCVideoRender)localObject2).getRenderStats(), TXCTimeUtil.getTimeTick() - this.mLastTimeStamp);
        }
      }
      if (this.mJitter != null)
      {
        localObject2 = (TXCVideoJitterBuffer)this.mJitter.get();
        if (localObject2 != null)
        {
          long l = ((TXCVideoJitterBuffer)localObject2).getBufferFrames();
          this.mStats.put("u32_avg_cache_count", Long.valueOf(l));
          if (this.mRealTimeMode)
          {
            this.mNumVideoCache += 1L;
            this.mSumVideoCache += l;
            if (l > this.mMaxVideoCache) {
              this.mMaxVideoCache = l;
            }
          }
        }
      }
      if (this.mAudioPlayer != null)
      {
        localObject2 = (TXCAudioPlayer)this.mAudioPlayer.get();
        if (localObject2 != null)
        {
          this.mStats.put("CODEC_CACHE", Long.valueOf(((TXCAudioPlayer)localObject2).getCacheDuration()));
          updateLoadInfo(((TXCAudioPlayer)localObject2).getReportInfo());
        }
      }
      Object localObject2 = TXCSystemUtil.getProcessCPURate();
      this.mStats.put("u32_app_cpu_usage", Long.valueOf(localObject2[0]));
      this.mStats.put("u32_cpu_usage", Long.valueOf(localObject2[1]));
      if (this.mListener != null)
      {
        localObject2 = (TXINotifyListener)this.mListener.get();
        if ((localObject2 != null) && (TXCTimeUtil.getTimeTick() > this.mLastNotify + 2000L))
        {
          ((TXINotifyListener)localObject2).onNotifyEvent(15001, getStauts());
          this.mLastNotify = TXCTimeUtil.getTimeTick();
        }
      }
      if ((!this.mIsReportBegin) && (getFieldLong("u32_first_i_frame") != 0L))
      {
        reportBeginEvt();
        this.mIsReportBegin = true;
      }
      if ((this.mIsReportBegin == true) && (TXCTimeUtil.getTimeTick() > this.mLastReport + this.mStatusReportInterval))
      {
        reportStatus();
        this.mLastBlockCount = getFieldLong("u32_avg_block_count");
        this.mStatusReportInterval = TXCDRApi.getStatusReportInterval();
        if (this.mStatusReportInterval < 5000) {
          this.mStatusReportInterval = 5000;
        }
        this.mLastReport = TXCTimeUtil.getTimeTick();
      }
      this.mLastTimeStamp = TXCTimeUtil.getTimeTick();
      return;
    }
  }
  
  public HashMap getStats()
  {
    HashMap localHashMap = new HashMap(100);
    synchronized (this.mCollectLock)
    {
      localHashMap.putAll(this.mStats);
      return localHashMap;
    }
  }
  
  public long getValueByKey(String paramString)
  {
    if ((this.mFix.containsKey(paramString)) && (this.mLast.containsKey(paramString)))
    {
      long l = ((Long)this.mFix.get(paramString)).longValue();
      return ((Long)this.mLast.get(paramString)).longValue() + l;
    }
    return -1L;
  }
  
  public void setAppVersion(String paramString)
  {
    this.mAppVersion = paramString;
  }
  
  public void setApplicationContext(Context paramContext)
  {
    this.mApplicationContext = paramContext;
  }
  
  public void setAudioPlayer(TXCAudioPlayer paramTXCAudioPlayer)
  {
    this.mAudioPlayer = new WeakReference(paramTXCAudioPlayer);
  }
  
  public void setDownloader(TXCStreamDownloader paramTXCStreamDownloader)
  {
    this.mDownloader = new WeakReference(paramTXCStreamDownloader);
  }
  
  public void setInterval(int paramInt)
  {
    this.mCollectInterval = paramInt;
  }
  
  public void setIsP2P(int paramInt)
  {
    this.mIsP2P = paramInt;
  }
  
  public void setJitter(TXCVideoJitterBuffer paramTXCVideoJitterBuffer)
  {
    this.mJitter = new WeakReference(paramTXCVideoJitterBuffer);
  }
  
  public void setListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mListener = new WeakReference(paramTXINotifyListener);
  }
  
  public void setRealTimeMode(boolean paramBoolean)
  {
    this.mRealTimeMode = paramBoolean;
  }
  
  public void setRender(TXCVideoRender paramTXCVideoRender)
  {
    this.mRender = new WeakReference(paramTXCVideoRender);
  }
  
  public void setUrl(String paramString)
  {
    this.mPlayUrl = paramString;
  }
  
  public void start()
  {
    if (!this.mIsCollecting)
    {
      newStats();
      setupStatus();
      this.mStartTime = System.currentTimeMillis();
      this.mLastNotify = TXCTimeUtil.getTimeTick();
      this.mLastTimeStamp = TXCTimeUtil.getTimeTick();
      this.mLastReport = TXCTimeUtil.getTimeTick();
      this.mIsReportBegin = false;
      this.mLastBlockCount = -1L;
      this.mHandler.postDelayed(this.mRunnable, this.mCollectInterval);
      this.mIsCollecting = true;
      return;
    }
    TXCLog.w("TXLivePlayStatsCollection", "had been started!");
  }
  
  public void stop()
  {
    if (this.mIsCollecting == true)
    {
      if (this.mIsReportBegin == true) {
        synchronized (this.mCollectLock)
        {
          reportEndEvt();
          this.mHandler.removeCallbacks(this.mRunnable);
          this.mIsCollecting = false;
          if (this.mRealTimeMode) {
            reportRealTimePlayStatisticInfo();
          }
        }
      }
      synchronized (this.mCollectLock)
      {
        clearStats();
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        TXCLog.e("TXLivePlayStatsCollection", "play " + this.mPlayUrl + " failed");
        synchronized (this.mCollectLock)
        {
          reportFailed();
        }
      }
    }
    TXCLog.w("TXLivePlayStatsCollection", "had been stopped!");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\TXLivePlayStatsCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */