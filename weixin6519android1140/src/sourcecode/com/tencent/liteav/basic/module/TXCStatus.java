package com.tencent.liteav.basic.module;

public class TXCStatus
{
  public static final int TXE_STATUS_AVG_CACHE_COUNT = 2006;
  public static final int TXE_STATUS_AVG_LOAD_TIME = 2001;
  public static final int TXE_STATUS_FIRST_FRAME_RENDER_TIMESTAMP = 6001;
  public static final int TXE_STATUS_LOAD_COUNT = 2002;
  public static final int TXE_STATUS_MAX_LOAD_TIME = 2003;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_AUDIO_SPEED_IN = 7102;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_BIZID = 7114;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_CHANNEL_TYPE = 7111;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_CONNECT_START_TS = 7107;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_CONNECT_SUCCESS_TS = 7109;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_DNS_PARSE_SUCCESS_TS = 7108;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_FIRST_AUDIO_FRAME_TS = 7104;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_FIRST_VIDEO_FRAME_TS = 7103;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_RTMP_ACC_ERROR_CODE = 7105;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_RTMP_ACC_ERROR_INFO = 7106;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_SERVER_IP = 7110;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_STREAM_ID = 7113;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_STREAM_URL = 7112;
  public static final int TXE_STATUS_NETWORK_DOWNLOAD_VIDEO_SPEED_IN = 7101;
  public static final int TXE_STATUS_NETWORK_UPLOAD_AUDIO_FRAME_CACHE = 7006;
  public static final int TXE_STATUS_NETWORK_UPLOAD_AUDIO_FRAME_DROP = 7008;
  public static final int TXE_STATUS_NETWORK_UPLOAD_AUDIO_SPEED_IN = 7002;
  public static final int TXE_STATUS_NETWORK_UPLOAD_AUDIO_SPEED_OUT = 7004;
  public static final int TXE_STATUS_NETWORK_UPLOAD_CHANNEL_TYPE = 7013;
  public static final int TXE_STATUS_NETWORK_UPLOAD_CONNECT_START_TS = 7009;
  public static final int TXE_STATUS_NETWORK_UPLOAD_CONNECT_SUCCESS_TS = 7011;
  public static final int TXE_STATUS_NETWORK_UPLOAD_DNS_PARSE_SUCCESS_TS = 7010;
  public static final int TXE_STATUS_NETWORK_UPLOAD_SERVER_IP = 7012;
  public static final int TXE_STATUS_NETWORK_UPLOAD_VIDEO_FRAME_CACHE = 7005;
  public static final int TXE_STATUS_NETWORK_UPLOAD_VIDEO_FRAME_DROP = 7007;
  public static final int TXE_STATUS_NETWORK_UPLOAD_VIDEO_SPEED_IN = 7001;
  public static final int TXE_STATUS_NETWORK_UPLOAD_VIDEO_SPEED_OUT = 7003;
  public static final int TXE_STATUS_NO_DATA_COUNT = 2005;
  public static final int TXE_STATUS_REAL_CAPTURE_FPS = 1001;
  public static final int TXE_STATUS_REAL_DECODE_FPS = 5001;
  public static final int TXE_STATUS_REAL_ENCODE_BITRATE = 4002;
  public static final int TXE_STATUS_REAL_ENCODE_FPS = 4001;
  public static final int TXE_STATUS_REAL_RENDER_FPS = 6002;
  public static final int TXE_STATUS_RENDER_BLOCK_COUNT_1000MS = 6004;
  public static final int TXE_STATUS_RENDER_BLOCK_COUNT_500MS = 6003;
  public static final int TXE_STATUS_RENDER_BLOCK_MAX_DURATION = 6005;
  public static final int TXE_STATUS_RENDER_BLOCK_TOTAL_DURATION = 6006;
  public static final int TXE_STATUS_SPEED_COUNT = 2004;
  
  public static double getDoubleValue(String paramString, int paramInt)
  {
    paramString = getValue(paramString, paramInt);
    if ((paramString != null) && ((paramString instanceof Double))) {
      return ((Double)paramString).doubleValue();
    }
    return 0.0D;
  }
  
  public static int getIntValue(String paramString, int paramInt)
  {
    paramString = getValue(paramString, paramInt);
    if ((paramString != null) && ((paramString instanceof Long))) {
      return ((Long)paramString).intValue();
    }
    return 0;
  }
  
  public static long getLongValue(String paramString, int paramInt)
  {
    paramString = getValue(paramString, paramInt);
    if ((paramString != null) && ((paramString instanceof Long))) {
      return ((Long)paramString).longValue();
    }
    return 0L;
  }
  
  public static String getStringValue(String paramString, int paramInt)
  {
    paramString = getValue(paramString, paramInt);
    if ((paramString != null) && ((paramString instanceof String))) {
      return (String)paramString;
    }
    return "";
  }
  
  public static Object getValue(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    switch (paramInt)
    {
    default: 
      return null;
    case 1001: 
    case 4001: 
    case 5001: 
    case 6002: 
      return Double.valueOf(nativeStatusGetDoubleValue(paramString, paramInt));
    case 2001: 
    case 2002: 
    case 2003: 
    case 2004: 
    case 2005: 
    case 2006: 
    case 4002: 
    case 6001: 
    case 6003: 
    case 6004: 
    case 6005: 
    case 6006: 
      return Long.valueOf(nativeStatusGetIntValue(paramString, paramInt));
    case 7001: 
    case 7002: 
    case 7003: 
    case 7004: 
    case 7005: 
    case 7006: 
    case 7007: 
    case 7008: 
    case 7009: 
    case 7010: 
    case 7011: 
    case 7013: 
    case 7101: 
    case 7102: 
    case 7103: 
    case 7104: 
    case 7105: 
    case 7107: 
    case 7108: 
    case 7109: 
    case 7111: 
      return Long.valueOf(nativeStatusGetIntValue(paramString, paramInt));
    }
    return nativeStatusGetStrValue(paramString, paramInt);
  }
  
  private static native double nativeStatusGetDoubleValue(String paramString, int paramInt);
  
  private static native long nativeStatusGetIntValue(String paramString, int paramInt);
  
  private static native String nativeStatusGetStrValue(String paramString, int paramInt);
  
  private static native boolean nativeStatusSetDoubleValue(String paramString, int paramInt, double paramDouble);
  
  private static native boolean nativeStatusSetIntValue(String paramString, int paramInt, long paramLong);
  
  private static native boolean nativeStatusSetStrValue(String paramString1, int paramInt, String paramString2);
  
  private static native void nativeStatusStartRecord(String paramString);
  
  private static native void nativeStatusStopRecord(String paramString);
  
  public static boolean setValue(String paramString, int paramInt, Object paramObject)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return false;
            } while (paramObject == null);
            switch (paramInt)
            {
            default: 
              return false;
            }
          } while (!(paramObject instanceof Double));
          return nativeStatusSetDoubleValue(paramString, paramInt, ((Double)paramObject).doubleValue());
        } while (!(paramObject instanceof Long));
        return nativeStatusSetIntValue(paramString, paramInt, ((Long)paramObject).longValue());
      } while (!(paramObject instanceof Long));
      return nativeStatusSetIntValue(paramString, paramInt, ((Long)paramObject).longValue());
    } while (!(paramObject instanceof String));
    return nativeStatusSetStrValue(paramString, paramInt, (String)paramObject);
  }
  
  public static void startRecord(String paramString)
  {
    nativeStatusStartRecord(paramString);
  }
  
  public static void stopRecord(String paramString)
  {
    nativeStatusStopRecord(paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\module\TXCStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */