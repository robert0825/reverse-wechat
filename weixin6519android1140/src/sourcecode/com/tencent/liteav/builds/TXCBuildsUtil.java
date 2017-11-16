package com.tencent.liteav.builds;

import android.content.Context;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUPituInterface;

public class TXCBuildsUtil
{
  public static final int BUILDTYPE = 0;
  public static final int BUILD_NORMAL = 0;
  public static final int BUILD_PITU = 1;
  public static volatile boolean _PituInit;
  
  public static TXCGPUPituInterface createEyeScaleFilter()
  {
    return null;
  }
  
  public static TXCGPUPituInterface createFaceSlimFilter()
  {
    return null;
  }
  
  public static TXCGPUPituInterface createMotionFilter(Context paramContext)
  {
    return null;
  }
  
  public static boolean initMotionSdk(Context paramContext)
  {
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\builds\TXCBuildsUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */