package com.tencent.liteav;

import android.graphics.Bitmap;
import com.tencent.liteav.audio.TXCAudioRecorder;

public class TXCLivePushConfig
{
  public static final int ENCODE_VIDEO_AUTO = 2;
  public static final int ENCODE_VIDEO_HARDWARE = 1;
  public static final int ENCODE_VIDEO_SOFTWARE = 0;
  public static final int PAUSE_FLAG_PAUSE_AUDIO = 2;
  public static final int PAUSE_FLAG_PAUSE_VIDEO = 1;
  public static final int VIDEO_ANGLE_HOME_DOWN = 1;
  public static final int VIDEO_ANGLE_HOME_LEFT = 2;
  public static final int VIDEO_ANGLE_HOME_RIGHT = 0;
  public static final int VIDEO_ANGLE_HOME_UP = 3;
  public static final int VIDEO_RESOLUTION_TYPE_1280_720 = 5;
  public static final int VIDEO_RESOLUTION_TYPE_180_320 = 7;
  public static final int VIDEO_RESOLUTION_TYPE_240_320 = 11;
  public static final int VIDEO_RESOLUTION_TYPE_270_480 = 8;
  public static final int VIDEO_RESOLUTION_TYPE_320_180 = 9;
  public static final int VIDEO_RESOLUTION_TYPE_320_240 = 14;
  public static final int VIDEO_RESOLUTION_TYPE_320_480 = 6;
  public static final int VIDEO_RESOLUTION_TYPE_360_480 = 12;
  public static final int VIDEO_RESOLUTION_TYPE_360_640 = 0;
  public static final int VIDEO_RESOLUTION_TYPE_480_270 = 10;
  public static final int VIDEO_RESOLUTION_TYPE_480_360 = 15;
  public static final int VIDEO_RESOLUTION_TYPE_480_640 = 13;
  public static final int VIDEO_RESOLUTION_TYPE_540_960 = 1;
  public static final int VIDEO_RESOLUTION_TYPE_640_360 = 3;
  public static final int VIDEO_RESOLUTION_TYPE_640_480 = 16;
  public static final int VIDEO_RESOLUTION_TYPE_720_1280 = 2;
  public static final int VIDEO_RESOLUTION_TYPE_960_540 = 4;
  public int audioChannels = TXCAudioRecorder.DEFAULT_CHANNELS_PER_SAMPLE;
  public int audioSample = TXCAudioRecorder.DEFAULT_SAMPLE_RATE;
  public boolean autoAdjustBitrate = false;
  public int autoAdjustStrategy = 0;
  public int bitRate = 700;
  public int connectRetryCount = 3;
  public int connectRetryInterval = 3;
  public int customModeType = 0;
  public boolean enableAec = false;
  public boolean enableHighCapture = true;
  public boolean enableMainProfile = true;
  public boolean enableNearestIP = true;
  public int fps = 15;
  public boolean frontCamera = true;
  public int gop = 3;
  public int height = 0;
  public int homeOrientation = 1;
  public int maxBitrate = 700;
  public int minBitrate = 700;
  public boolean mirror = false;
  public int pauseFlag = 1;
  public int pauseFps = 10;
  public Bitmap pauseImg = null;
  public int pauseTime = 300;
  public boolean pureAudioPush = false;
  public boolean realTimeMode = false;
  public int resolution = 1;
  public int rtmpChannelType = 1;
  public boolean touchFoucus = true;
  public int videoEncType = 2;
  public Bitmap watermark = null;
  public float watermarkWidth = -1.0F;
  public int watermarkX = 0;
  public float watermarkXF = 0.0F;
  public int watermarkY = 0;
  public float watermarkYF = 0.0F;
  public int width = 0;
  
  public void updateResolution()
  {
    switch (this.resolution)
    {
    case 3: 
    case 4: 
    case 5: 
    case 9: 
    case 10: 
    default: 
      this.width = 640;
      this.height = 368;
      return;
    case 0: 
      this.width = 640;
      this.height = 368;
      return;
    case 1: 
      this.width = 960;
      this.height = 544;
      return;
    case 2: 
      this.width = 1280;
      this.height = 720;
      return;
    case 6: 
      this.width = 480;
      this.height = 320;
      return;
    case 7: 
      this.width = 320;
      this.height = 192;
      return;
    case 8: 
      this.width = 480;
      this.height = 272;
      return;
    case 11: 
      this.width = 320;
      this.height = 240;
      return;
    case 12: 
      this.width = 480;
      this.height = 368;
      return;
    }
    this.width = 640;
    this.height = 480;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\TXCLivePushConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */