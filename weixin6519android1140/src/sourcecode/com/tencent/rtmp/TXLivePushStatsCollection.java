package com.tencent.rtmp;

import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRDef;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamUploader;
import com.tencent.liteav.network.TXCStreamUploader.UploadStats;
import com.tencent.liteav.videoencoder.TXCVideoEncoder;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class TXLivePushStatsCollection
  implements ITXStatsCollection
{
  private static String TAG = "TXLivePushStatsCollection";
  private String mAppVersion;
  private Context mApplicationContext;
  private int mAudioSamplerate;
  public int mCollectInterval = 1000;
  public Object mCollectLock = new Object();
  private Thread mCollectThread = null;
  public WeakReference<TXCVideoEncoder> mEncoder;
  private HashMap mFix = new HashMap(100);
  public boolean mIsCollecting = false;
  public boolean mIsReportBegin;
  private HashMap mLast = new HashMap(100);
  public long mLastNotify;
  public long mLastReport;
  public long mLastTimeStamp = 0L;
  public WeakReference<TXINotifyListener> mListener;
  public HashMap mStats = new HashMap(100);
  public WeakReference<TXCStreamUploader> mUploader;
  private String mUrl;
  private int mVideoBitrate;
  private int mVideoHeight;
  private int mVideoWidth;
  
  public TXLivePushStatsCollection(Context paramContext)
  {
    this.mApplicationContext = paramContext;
    this.mAppVersion = "";
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
  
  private void reportEndEvt()
  {
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    localTXCDRExtInfo.url = this.mUrl;
    String str = (String)this.mStats.get("token");
    TXCDRApi.InitEvent(this.mApplicationContext, str, TXCDRDef.COMMAND_ID_40002, TXCDRDef.MODULE_PUSH_SDK, localTXCDRExtInfo);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40002, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40002, "u32_result", (TXCTimeUtil.getTimeTick() - getFieldLong("u64_timestamp")) / 1000L);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40002, "str_user_id", (String)this.mStats.get("str_user_id"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40002, "str_package_name", (String)this.mStats.get("str_package_name"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40002, "u32_channel_type", getFieldValue("u32_channel_type"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40002, "str_app_version", this.mAppVersion);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40002, "dev_uuid", (String)this.mStats.get("dev_uuid"));
    TXCDRApi.nativeReportEvent(str, TXCDRDef.COMMAND_ID_40002);
  }
  
  private void reportFailed()
  {
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    localTXCDRExtInfo.url = this.mUrl;
    String str = (String)this.mStats.get("token");
    TXCDRApi.InitEvent(this.mApplicationContext, str, TXCDRDef.COMMAND_ID_40001, TXCDRDef.MODULE_PUSH_SDK, localTXCDRExtInfo);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "str_device_type", (String)this.mStats.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_network_type", getFieldValue("u32_network_type"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_dns_time", -1L);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_connect_server_time", -1L);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "u32_server_ip", "");
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_video_resolution", this.mVideoWidth << 16 | this.mVideoHeight);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_audio_samplerate", this.mAudioSamplerate);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_video_bitrate", this.mVideoBitrate);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "str_user_id", (String)this.mStats.get("str_user_id"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "str_package_name", (String)this.mStats.get("str_package_name"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_channel_type", getFieldValue("u32_channel_type"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "str_app_version", this.mAppVersion);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "dev_uuid", (String)this.mStats.get("dev_uuid"));
    TXCDRApi.nativeReportEvent(str, TXCDRDef.COMMAND_ID_40001);
  }
  
  private void setupStats()
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
  
  public HashMap getStats()
  {
    HashMap localHashMap = new HashMap(100);
    synchronized (this.mCollectLock)
    {
      localHashMap.putAll(this.mStats);
      return localHashMap;
    }
  }
  
  public Bundle getStatus()
  {
    Bundle localBundle = new Bundle();
    int i = ((Long)this.mStats.get("u32_app_cpu_usage")).intValue() / 10;
    int j = ((Long)this.mStats.get("u32_cpu_usage")).intValue() / 10;
    localBundle.putCharSequence("CPU_USAGE", i + "/" + j + "%");
    localBundle.putInt("VIDEO_WIDTH", getFieldValue("VIDEO_WIDTH"));
    localBundle.putInt("VIDEO_HEIGHT", getFieldValue("VIDEO_HEIGHT"));
    localBundle.putInt("NET_SPEED", getFieldValue("u32_avg_net_speed"));
    localBundle.putInt("VIDEO_FPS", getFieldValue("u32_fps"));
    localBundle.putInt("DROP_SIZE", getFieldValue("video_drop"));
    localBundle.putInt("VIDEO_BITRATE", getFieldValue("u32_avg_video_bitrate"));
    localBundle.putInt("AUDIO_BITRATE", getFieldValue("u32_avg_audio_bitrate"));
    localBundle.putInt("CACHE_SIZE", getFieldValue("u32_avg_cache_size"));
    localBundle.putCharSequence("SERVER_IP", (String)this.mStats.get("u32_server_ip"));
    localBundle.putInt("qos_video_bitrate", getFieldValue("qos_video_bitrate"));
    return localBundle;
  }
  
  public long getValueByKey(String paramString)
  {
    return 0L;
  }
  
  public void reportBeginEvt()
  {
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    localTXCDRExtInfo.url = this.mUrl;
    String str = (String)this.mStats.get("token");
    TXCDRApi.InitEvent(this.mApplicationContext, str, TXCDRDef.COMMAND_ID_40001, TXCDRDef.MODULE_PUSH_SDK, localTXCDRExtInfo);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "str_device_type", (String)this.mStats.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_network_type", getFieldValue("u32_network_type"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_dns_time", getFieldValue("u32_dns_time"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_connect_server_time", getFieldValue("u32_connect_server_time"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "u32_server_ip", (String)this.mStats.get("u32_server_ip"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_video_resolution", this.mVideoWidth << 16 | this.mVideoHeight);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_audio_samplerate", this.mAudioSamplerate);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_video_bitrate", this.mVideoBitrate);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "str_user_id", (String)this.mStats.get("str_user_id"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "str_package_name", (String)this.mStats.get("str_package_name"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40001, "u32_channel_type", getFieldValue("u32_channel_type"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "str_app_version", this.mAppVersion);
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40001, "dev_uuid", (String)this.mStats.get("dev_uuid"));
    TXCDRApi.nativeReportEvent(str, TXCDRDef.COMMAND_ID_40001);
  }
  
  public void reportStatus()
  {
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = true;
    localTXCDRExtInfo.url = this.mUrl;
    String str = (String)this.mStats.get("token");
    TXCDRApi.InitEvent(this.mApplicationContext, str, TXCDRDef.COMMAND_ID_40000, TXCDRDef.MODULE_PUSH_SDK, localTXCDRExtInfo);
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40000, "u32_avg_audio_bitrate", getFieldValue("u32_avg_audio_bitrate"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40000, "u32_avg_video_bitrate", getFieldValue("qos_video_bitrate"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40000, "u32_avg_net_speed", getFieldValue("u32_avg_net_speed"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40000, "u32_fps", getFieldValue("u32_fps"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40000, "u32_avg_cache_size", getFieldValue("u32_avg_cache_size"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40000, "u32_cpu_usage", getFieldValue("u32_cpu_usage"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40000, "u32_app_cpu_usage", getFieldValue("u32_app_cpu_usage"));
    TXCDRApi.txSetEventIntValue(str, TXCDRDef.COMMAND_ID_40000, "u32_channel_type", getFieldValue("u32_channel_type"));
    TXCDRApi.txSetEventValue(str, TXCDRDef.COMMAND_ID_40000, "str_app_version", this.mAppVersion);
    TXCDRApi.nativeReportEvent(str, TXCDRDef.COMMAND_ID_40000);
  }
  
  public void setAppVersion(String paramString)
  {
    this.mAppVersion = paramString;
  }
  
  public void setApplicationContext(Context paramContext)
  {
    this.mApplicationContext = paramContext;
  }
  
  public void setAudioSamplerate(int paramInt)
  {
    this.mAudioSamplerate = paramInt;
  }
  
  public void setEncoder(TXCVideoEncoder paramTXCVideoEncoder)
  {
    this.mEncoder = new WeakReference(paramTXCVideoEncoder);
  }
  
  public void setInterval(int paramInt)
  {
    this.mCollectInterval = paramInt;
  }
  
  public void setListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mListener = new WeakReference(paramTXINotifyListener);
  }
  
  public void setUploader(TXCStreamUploader paramTXCStreamUploader)
  {
    this.mUploader = new WeakReference(paramTXCStreamUploader);
  }
  
  public void setUrl(String paramString)
  {
    this.mUrl = paramString;
  }
  
  public void setVideoBitrate(int paramInt)
  {
    this.mVideoBitrate = paramInt;
  }
  
  public void setVideoResolution(int paramInt1, int paramInt2)
  {
    this.mVideoWidth = paramInt1;
    this.mVideoHeight = paramInt2;
  }
  
  public void start()
  {
    if (this.mIsCollecting == true)
    {
      TXCLog.w(TAG, "has been started!");
      return;
    }
    this.mIsCollecting = true;
    newStats();
    setupStats();
    this.mCollectThread = new Thread("TXCLivePushStats")
    {
      public void run()
      {
        TXLivePushStatsCollection.this.mLastTimeStamp = TXCTimeUtil.getTimeTick();
        TXLivePushStatsCollection.this.mLastNotify = TXCTimeUtil.getTimeTick();
        TXLivePushStatsCollection.this.mLastReport = TXCTimeUtil.getTimeTick();
        TXLivePushStatsCollection.this.mIsReportBegin = false;
        try
        {
          sleep(TXLivePushStatsCollection.this.mCollectInterval);
          while (TXLivePushStatsCollection.this.mIsCollecting) {
            synchronized (TXLivePushStatsCollection.this.mCollectLock)
            {
              if (TXLivePushStatsCollection.this.mUploader != null)
              {
                localObject2 = (TXCStreamUploader)TXLivePushStatsCollection.this.mUploader.get();
                if (localObject2 != null)
                {
                  localObject2 = ((TXCStreamUploader)localObject2).getUploadStats();
                  TXLivePushStatsCollection.this.updateNetStats((TXCStreamUploader.UploadStats)localObject2, TXCTimeUtil.getTimeTick() - TXLivePushStatsCollection.this.mLastTimeStamp);
                }
              }
              if (TXLivePushStatsCollection.this.mEncoder != null)
              {
                localObject2 = (TXCVideoEncoder)TXLivePushStatsCollection.this.mEncoder.get();
                if (localObject2 != null)
                {
                  long l = ((TXCVideoEncoder)localObject2).getRealFPS();
                  TXLivePushStatsCollection.this.mStats.put("u32_fps", Long.valueOf(l));
                  l = ((TXCVideoEncoder)localObject2).getRealBitrate();
                  TXLivePushStatsCollection.this.mStats.put("u32_avg_video_bitrate", Long.valueOf(l));
                  TXLivePushStatsCollection.this.mStats.put("VIDEO_WIDTH", Long.valueOf(((TXCVideoEncoder)localObject2).getVideoWidth()));
                  TXLivePushStatsCollection.this.mStats.put("VIDEO_HEIGHT", Long.valueOf(((TXCVideoEncoder)localObject2).getVideoHeight()));
                }
              }
              Object localObject2 = TXCSystemUtil.getProcessCPURate();
              TXLivePushStatsCollection.this.mStats.put("u32_app_cpu_usage", Long.valueOf(localObject2[0]));
              TXLivePushStatsCollection.this.mStats.put("u32_cpu_usage", Long.valueOf(localObject2[1]));
              if (TXLivePushStatsCollection.this.mListener != null)
              {
                localObject2 = (TXINotifyListener)TXLivePushStatsCollection.this.mListener.get();
                if ((localObject2 != null) && (TXCTimeUtil.getTimeTick() > TXLivePushStatsCollection.this.mLastNotify + 2000L))
                {
                  ((TXINotifyListener)localObject2).onNotifyEvent(15002, TXLivePushStatsCollection.this.getStatus());
                  TXLivePushStatsCollection.this.mLastNotify = TXCTimeUtil.getTimeTick();
                }
              }
              if ((!TXLivePushStatsCollection.this.mIsReportBegin) && (TXLivePushStatsCollection.this.mStats.get("u32_server_ip") != null) && (!((String)TXLivePushStatsCollection.this.mStats.get("u32_server_ip")).isEmpty()))
              {
                TXLivePushStatsCollection.this.reportBeginEvt();
                TXLivePushStatsCollection.this.mIsReportBegin = true;
              }
              if ((TXLivePushStatsCollection.this.mIsReportBegin == true) && (TXCTimeUtil.getTimeTick() - TXLivePushStatsCollection.this.mLastReport > 5000L))
              {
                TXLivePushStatsCollection.this.reportStatus();
                TXLivePushStatsCollection.this.mLastReport = TXCTimeUtil.getTimeTick();
              }
              TXLivePushStatsCollection.this.mLastTimeStamp = TXCTimeUtil.getTimeTick();
              try
              {
                sleep(TXLivePushStatsCollection.this.mCollectInterval);
              }
              catch (Exception localException1) {}
            }
          }
          return;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
      }
    };
    this.mCollectThread.start();
  }
  
  public void stop()
  {
    if (!this.mIsCollecting)
    {
      TXCLog.w(TAG, "has been stopped!");
      return;
    }
    this.mIsCollecting = false;
    if (this.mIsReportBegin == true) {}
    for (;;)
    {
      synchronized (this.mCollectLock)
      {
        reportEndEvt();
        synchronized (this.mCollectLock)
        {
          clearStats();
          return;
        }
      }
      TXCLog.e(TAG, "push " + this.mUrl + " failed!");
      synchronized (this.mCollectLock)
      {
        reportFailed();
      }
    }
  }
  
  public void updateNetStats(TXCStreamUploader.UploadStats paramUploadStats, long paramLong)
  {
    if ((paramUploadStats == null) || (paramLong == 0L)) {
      return;
    }
    long l1 = updateField("qos_video_bitrate", paramUploadStats.inVideoBytes);
    this.mStats.put("qos_video_bitrate", Long.valueOf(l1 * 8L * 1000L / (1024L * paramLong)));
    l1 = updateField("u32_avg_audio_bitrate", paramUploadStats.inAudioBytes);
    this.mStats.put("u32_avg_audio_bitrate", Long.valueOf(l1 * 8L * 1000L / (1024L * paramLong)));
    l1 = updateField("VIDEO_BITRATE", paramUploadStats.outVideoBytes);
    long l2 = updateField("AUDIO_BITRATE", paramUploadStats.outAudioBytes);
    this.mStats.put("u32_avg_net_speed", Long.valueOf((l1 + l2) * 8L * 1000L / (1024L * paramLong)));
    this.mStats.put("u32_avg_cache_size", Long.valueOf(paramUploadStats.videoCacheLen));
    this.mStats.put("video_drop", Long.valueOf(paramUploadStats.videoDropCount));
    this.mStats.put("u32_server_ip", paramUploadStats.serverIP);
    if (paramUploadStats.dnsTS != -1L)
    {
      this.mStats.put("u32_dns_time", Long.valueOf(paramUploadStats.dnsTS - paramUploadStats.startTS));
      if (paramUploadStats.connTS == -1L) {
        break label327;
      }
      this.mStats.put("u32_connect_server_time", Long.valueOf(paramUploadStats.connTS - paramUploadStats.startTS));
    }
    for (;;)
    {
      this.mStats.put("u32_channel_type", Long.valueOf(paramUploadStats.channelType));
      this.mStats.put("u64_timestamp", Long.valueOf(paramUploadStats.startTS));
      return;
      this.mStats.put("u32_dns_time", Long.valueOf(paramUploadStats.dnsTS));
      break;
      label327:
      this.mStats.put("u32_connect_server_time", Long.valueOf(paramUploadStats.connTS));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\TXLivePushStatsCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */