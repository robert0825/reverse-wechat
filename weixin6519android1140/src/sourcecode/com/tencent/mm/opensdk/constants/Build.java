package com.tencent.mm.opensdk.constants;

import com.tencent.gmtrace.GMTrace;

public final class Build
{
  public static final int CHOOSE_INVOICE_TILE_SUPPORT_SDK_INT = 620822528;
  public static final int EMOJI_SUPPORTED_SDK_INT = 553844737;
  public static final int FAVORITE_SUPPPORTED_SDK_INT = 570425345;
  public static final int LAUNCH_MINIPROGRAM_SUPPORTED_SDK_INT = 620757000;
  public static final int MESSAGE_ACTION_SUPPPORTED_SDK_INT = 570490883;
  public static final int MINIPROGRAM_SUPPORTED_SDK_INT = 620756993;
  public static final int MIN_SDK_INT = 553713665;
  public static final int MUSIC_DATA_URL_SUPPORTED_SDK_INT = 553910273;
  public static final int OPENID_SUPPORTED_SDK_INT = 570425345;
  public static final int PAY_SUPPORTED_SDK_INT = 570425345;
  public static final int SCAN_QRCODE_AUTH_SUPPORTED_SDK_INT = 587268097;
  public static final int SDK_INT = 620822528;
  public static final String SDK_VERSION_NAME = "android 5.1.0";
  public static final int SUBSCRIBE_MESSAGE_SUPPORTED_SDK_INT = 620756998;
  public static final int TIMELINE_SUPPORTED_SDK_INT = 553779201;
  public static final int VIDEO_FILE_SUPPORTED_SDK_INT = 620756996;
  
  private Build()
  {
    GMTrace.i(1073741824L, 8);
    throw new RuntimeException(getClass().getSimpleName() + " should not be instantiated");
  }
  
  public static int getMajorVersion()
  {
    GMTrace.i(1207959552L, 9);
    GMTrace.o(1207959552L, 9);
    return 5;
  }
  
  public static int getMinorVersion()
  {
    GMTrace.i(1342177280L, 10);
    GMTrace.o(1342177280L, 10);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\opensdk\constants\Build.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */