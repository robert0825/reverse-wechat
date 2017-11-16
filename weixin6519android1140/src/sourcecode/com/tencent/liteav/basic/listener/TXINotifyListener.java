package com.tencent.liteav.basic.listener;

import android.os.Bundle;

public abstract interface TXINotifyListener
{
  public static final String EVT_DESCRIPTION = "EVT_MSG";
  public static final String EVT_ID = "EVT_ID";
  public static final String EVT_PARAM1 = "EVT_PARAM1";
  public static final String EVT_PARAM2 = "EVT_PARAM2";
  public static final String EVT_REPORT_TOKEN = "EVT_REPORT_TOKEN";
  public static final String EVT_TIME = "EVT_TIME";
  public static final String EVT_USERID = "EVT_USERID";
  public static final int PLAY_ERR_FILE_NOT_FOUND = -2303;
  public static final int PLAY_ERR_GET_RTMP_ACC_URL_FAIL = -2302;
  public static final int PLAY_ERR_NET_DISCONNECT = -2301;
  public static final int PLAY_EVT_CHANGE_RESOLUTION = 2009;
  public static final int PLAY_EVT_CONNECT_SUCC = 2001;
  public static final int PLAY_EVT_FIRST_AUDIO_PLAY = 2010;
  public static final int PLAY_EVT_PLAY_BEGIN = 2004;
  public static final int PLAY_EVT_PLAY_END = 2006;
  public static final int PLAY_EVT_PLAY_LOADING = 2007;
  public static final int PLAY_EVT_PLAY_PROGRESS = 2005;
  public static final int PLAY_EVT_RCV_FIRST_I_FRAME = 2003;
  public static final int PLAY_EVT_RTMP_STREAM_BEGIN = 2002;
  public static final int PLAY_EVT_START_VIDEO_DECODER = 2008;
  public static final int PLAY_WARNING_AUDIO_DECODE_FAIL = 2102;
  public static final int PLAY_WARNING_DNS_FAIL = 3001;
  public static final int PLAY_WARNING_FIRST_IDR_HW_DECODE_FAIL = 2108;
  public static final int PLAY_WARNING_HEVC_HW_ACCELERATION_FAIL = 2109;
  public static final int PLAY_WARNING_HW_ACCELERATION_FAIL = 2106;
  public static final int PLAY_WARNING_READ_WRITE_FAIL = 3005;
  public static final int PLAY_WARNING_RECONNECT = 2103;
  public static final int PLAY_WARNING_RECV_DATA_LAG = 2104;
  public static final int PLAY_WARNING_SERVER_DISCONNECT = 3004;
  public static final int PLAY_WARNING_SEVER_CONN_FAIL = 3002;
  public static final int PLAY_WARNING_SHAKE_FAIL = 3003;
  public static final int PLAY_WARNING_VIDEO_DECODE_FAIL = 2101;
  public static final int PLAY_WARNING_VIDEO_DISCONTINUITY = 2107;
  public static final int PLAY_WARNING_VIDEO_PLAY_LAG = 2105;
  public static final int PUSH_ERR_AUDIO_ENCODE_FAIL = -1304;
  public static final int PUSH_ERR_MIC_RECORD_FAIL = -1311;
  public static final int PUSH_ERR_NET_DISCONNECT = -1307;
  public static final int PUSH_ERR_OPEN_CAMERA_FAIL = -1301;
  public static final int PUSH_ERR_OPEN_MIC_FAIL = -1302;
  public static final int PUSH_ERR_SCREEN_CAPTURE_DISTURBED = -1310;
  public static final int PUSH_ERR_SCREEN_CAPTURE_START_FAILED = -1308;
  public static final int PUSH_ERR_SCREEN_CAPTURE_SWITCH_DISPLAY_FAILED = -1312;
  public static final int PUSH_ERR_SCREEN_CAPTURE_UNSURPORT = -1309;
  public static final int PUSH_ERR_UNSUPPORTED_RESOLUTION = -1305;
  public static final int PUSH_ERR_UNSUPPORTED_SAMPLERATE = -1306;
  public static final int PUSH_ERR_VIDEO_ENCODE_FAIL = -1303;
  public static final int PUSH_EVT_CHANGE_BITRATE = 1006;
  public static final int PUSH_EVT_CHANGE_RESOLUTION = 1005;
  public static final int PUSH_EVT_CONNECT_SUCC = 1001;
  public static final int PUSH_EVT_FIRST_FRAME_AVAILABLE = 1007;
  public static final int PUSH_EVT_OPEN_CAMERA_SUCC = 1003;
  public static final int PUSH_EVT_PUSH_BEGIN = 1002;
  public static final int PUSH_EVT_SCREEN_CAPTURE_SUCC = 1004;
  public static final int PUSH_EVT_START_VIDEO_ENCODER = 1008;
  public static final int PUSH_WARNING_BEAUTYSURFACE_VIEW_INIT_FAIL = 1105;
  public static final int PUSH_WARNING_DNS_FAIL = 3001;
  public static final int PUSH_WARNING_HW_ACCELERATION_FAIL = 1103;
  public static final int PUSH_WARNING_NET_BUSY = 1101;
  public static final int PUSH_WARNING_READ_WRITE_FAIL = 3005;
  public static final int PUSH_WARNING_RECONNECT = 1102;
  public static final int PUSH_WARNING_SERVER_DISCONNECT = 3004;
  public static final int PUSH_WARNING_SEVER_CONN_FAIL = 3002;
  public static final int PUSH_WARNING_SHAKE_FAIL = 3003;
  public static final int PUSH_WARNING_VIDEO_ENCODE_BITRATE_OVERFLOW = 1106;
  public static final int PUSH_WARNING_VIDEO_ENCODE_FAIL = 1104;
  public static final int PUSH_WARNING_VIDEO_ENCODE_SW_SWITCH_HW = 1107;
  
  public abstract void onNotifyEvent(int paramInt, Bundle paramBundle);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\listener\TXINotifyListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */