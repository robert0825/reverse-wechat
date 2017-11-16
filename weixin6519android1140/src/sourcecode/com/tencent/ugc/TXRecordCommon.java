package com.tencent.ugc;

import android.graphics.Bitmap;
import android.os.Bundle;

public class TXRecordCommon
{
  public static final String EVT_DESCRIPTION = "EVT_DESCRIPTION";
  public static final int EVT_ID_PAUSE = 1;
  public static final int EVT_ID_RESUME = 2;
  public static final String EVT_PARAM1 = "EVT_PARAM1";
  public static final String EVT_PARAM2 = "EVT_PARAM2";
  public static final String EVT_TIME = "EVT_TIME";
  public static final int RECORD_ERR_OPEN_CAMERA_FAIL = -1301;
  public static final int RECORD_ERR_OPEN_MIC_FAIL = -1302;
  public static final int RECORD_RESULT_FAILED = -1;
  public static final int RECORD_RESULT_OK = 0;
  public static final int RECORD_RESULT_OK_LESS_THAN_MINDURATION = 1;
  public static final int RECORD_RESULT_OK_REACHED_MAXDURATION = 2;
  public static final int RECORD_SPEED_FAST = 2;
  public static final int RECORD_SPEED_FASTEST = 4;
  public static final int RECORD_SPEED_NORMAL = 1;
  public static final int RECORD_SPEED_SLOW = -2;
  public static final int RECORD_SPEED_SLOWEST = -4;
  public static final int RECORD_TYPE_STREAM_SOURCE = 1;
  public static final int VIDEO_ASPECT_RATIO_1_1 = 2;
  public static final int VIDEO_ASPECT_RATIO_3_4 = 1;
  public static final int VIDEO_ASPECT_RATIO_9_16 = 0;
  public static final int VIDEO_QUALITY_HIGH = 2;
  public static final int VIDEO_QUALITY_LOW = 0;
  public static final int VIDEO_QUALITY_MEDIUM = 1;
  public static final int VIDEO_RESOLUTION_360_640 = 0;
  public static final int VIDEO_RESOLUTION_540_960 = 1;
  public static final int VIDEO_RESOLUTION_720_1280 = 2;
  
  public static abstract interface ITXBGMNotify
  {
    public abstract void onBGMComplete(int paramInt);
    
    public abstract void onBGMProgress(long paramLong1, long paramLong2);
    
    public abstract void onBGMStart();
  }
  
  public static abstract interface ITXVideoRecordListener
  {
    public abstract void onRecordComplete(TXRecordCommon.TXRecordResult paramTXRecordResult);
    
    public abstract void onRecordEvent(int paramInt, Bundle paramBundle);
    
    public abstract void onRecordProgress(long paramLong);
  }
  
  public static final class TXRecordResult
  {
    public String coverPath;
    public String descMsg;
    public int retCode;
    public String videoPath;
  }
  
  public static final class TXUGCCustomConfig
  {
    boolean enableHighResolutionCapture = false;
    public boolean isFront = true;
    public int mHomeOriention = 1;
    public int maxDuration = 60000;
    public int minDuration = 5000;
    public int videoBitrate = 1800;
    public int videoFps = 20;
    public int videoGop = 3;
    public int videoResolution = 1;
    public Bitmap watermark = null;
    public int watermarkX = 0;
    public int watermarkY = 0;
  }
  
  public static final class TXUGCSimpleConfig
  {
    public boolean isFront = true;
    public int mHomeOriention = 1;
    public int maxDuration = 60000;
    public int minDuration = 5000;
    public int videoQuality = 1;
    public Bitmap watermark = null;
    public int watermarkX = 0;
    public int watermarkY = 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\ugc\TXRecordCommon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */