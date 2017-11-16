package com.tencent.rtmp;

import java.util.HashMap;

public abstract interface ITXStatsCollection
{
  public static final int TXE_STATS_COLLECTION_EVENT_PLAYER_STATS = 15001;
  public static final int TXE_STATS_COLLECTION_EVENT_PUSHER_STATS = 15002;
  public static final String kAppCpu = "app_cpu";
  public static final String kAppCpuUsage = "u32_app_cpu_usage";
  public static final String kAppVersion = "str_app_version";
  public static final String kAudioCache = "CODEC_CACHE";
  public static final String kAudioDrop = "audio_drop";
  public static final String kAudioSamplerate = "u32_audio_samplerate";
  public static final String kAudioSpeed = "AUDIO_BITRATE";
  public static final String kAvgAudioBitrate = "u32_avg_audio_bitrate";
  public static final String kAvgBlockCount = "u32_avg_block_count";
  public static final String kAvgCacheCount = "u32_avg_cache_count";
  public static final String kAvgCacheSize = "u32_avg_cache_size";
  public static final String kAvgLoadTime = "u32_avg_load";
  public static final String kAvgNetSpeed = "u32_avg_net_speed";
  public static final String kAvgVideoBitrate = "u32_avg_video_bitrate";
  public static final String kAvgVideoFrameDrop = "u32_avg_drop_video_frame";
  public static final String kChannelType = "u32_channel_type";
  public static final String kConnTime = "u32_connect_server_time";
  public static final String kCpu = "CPU_USAGE";
  public static final String kDevUuid = "dev_uuid";
  public static final String kDeviceName = "str_device_type";
  public static final String kDeviceType = "str_device_type";
  public static final String kDnsTime = "u32_dns_time";
  public static final String kDrop = "DROP_SIZE";
  public static final String kFirstFrameDown = "u32_first_frame_down";
  public static final String kFirstIFrame = "u32_first_i_frame";
  public static final String kFps = "u32_fps";
  public static final String kHardEncodeFlag = "u32_hw_enc";
  public static final String kIsP2P = "u32_isp2p";
  public static final String kLoadCnt = "u32_load_cnt";
  public static final String kMaxLoadTime = "u32_max_load";
  public static final String kNetworkType = "u32_network_type";
  public static final String kNoDataCnt = "u32_nodata_cnt";
  public static final String kPackageName = "str_package_name";
  public static final String kQosVideoBitrate = "qos_video_bitrate";
  public static final String kServer = "SERVER_IP";
  public static final String kServerIp = "u32_server_ip";
  public static final String kSpeed = "NET_SPEED";
  public static final String kSpeedCnt = "u32_speed_cnt";
  public static final String kStreamBegin = "u32_stream_begin";
  public static final String kStreamDuration = "u32_stream_duration";
  public static final String kStreamSize = "u32_stream_size";
  public static final String kStreamUrl = "str_stream_url";
  public static final String kTatalCpu = "sys_cpu";
  public static final String kTimeStamp = "u64_timestamp";
  public static final String kTotalBlockTime = "u32_avg_block_time";
  public static final String kTotalCpuUsage = "u32_cpu_usage";
  public static final String kTotalTime = "u32_result";
  public static final String kUserid = "str_user_id";
  public static final String kUuid = "token";
  public static final String kVideoBitrate = "u32_video_bitrate";
  public static final String kVideoCache = "CACHE_SIZE";
  public static final String kVideoDrop = "video_drop";
  public static final String kVideoEncodeHeight = "VIDEO_HEIGHT";
  public static final String kVideoEncodeWidth = "VIDEO_WIDTH";
  public static final String kVideoFps = "VIDEO_FPS";
  public static final String kVideoResolution = "u32_video_resolution";
  public static final String kVideoSpeed = "VIDEO_BITRATE";
  
  public abstract HashMap getStats();
  
  public abstract long getValueByKey(String paramString);
  
  public abstract void setInterval(int paramInt);
  
  public abstract void start();
  
  public abstract void stop();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\ITXStatsCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */