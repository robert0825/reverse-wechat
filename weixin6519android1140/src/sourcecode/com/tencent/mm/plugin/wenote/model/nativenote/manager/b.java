package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class b
{
  private static float sdP;
  private static float sdQ;
  private static int sdR;
  public static float sdS;
  
  static
  {
    GMTrace.i(17235972194304L, 128418);
    sdP = Float.MAX_VALUE;
    sdQ = Float.MAX_VALUE;
    sdR = -1;
    sdS = 48.0F;
    GMTrace.o(17235972194304L, 128418);
  }
  
  public b()
  {
    GMTrace.i(17235569541120L, 128415);
    GMTrace.o(17235569541120L, 128415);
  }
  
  private static float bHl()
  {
    GMTrace.i(20644968267776L, 153817);
    try
    {
      if (sdP == Float.MAX_VALUE) {
        sdP = getDisplayMetrics().density;
      }
      float f = sdP;
      GMTrace.o(20644968267776L, 153817);
      return f;
    }
    finally {}
  }
  
  private static float bHm()
  {
    GMTrace.i(17235837976576L, 128417);
    try
    {
      if (sdQ == Float.MAX_VALUE) {
        sdQ = getDisplayMetrics().density * ab.getContext().getResources().getConfiguration().fontScale;
      }
      float f = sdQ;
      GMTrace.o(17235837976576L, 128417);
      return f;
    }
    finally {}
  }
  
  public static int bHn()
  {
    GMTrace.i(20645639356416L, 153822);
    if (sdR == -1) {
      sdR = Math.round(bHl() * 30.0F);
    }
    int i = sdR;
    GMTrace.o(20645639356416L, 153822);
    return i;
  }
  
  private static DisplayMetrics getDisplayMetrics()
  {
    GMTrace.i(20645505138688L, 153821);
    Display localDisplay = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    GMTrace.o(20645505138688L, 153821);
    return localDisplayMetrics;
  }
  
  public static float getTextSize()
  {
    GMTrace.i(20645102485504L, 153818);
    float f = sdS;
    GMTrace.o(20645102485504L, 153818);
    return f;
  }
  
  public static void setTextSize(float paramFloat)
  {
    GMTrace.i(20645236703232L, 153819);
    sdS = paramFloat;
    GMTrace.o(20645236703232L, 153819);
  }
  
  public static int yB(int paramInt)
  {
    GMTrace.i(20645370920960L, 153820);
    paramInt = Math.round(paramInt * bHm());
    GMTrace.o(20645370920960L, 153820);
    return paramInt;
  }
  
  public static int yC(int paramInt)
  {
    GMTrace.i(17235703758848L, 128416);
    paramInt = Math.round(paramInt / bHm());
    GMTrace.o(17235703758848L, 128416);
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */