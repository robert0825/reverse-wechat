package com.tencent.pb.b.a;

import com.tencent.pb.common.c.h;

public final class a
{
  private static String TAG = "AccountEngine";
  private static int xOv = 0;
  private static String xOw = "";
  
  public static void EV(int paramInt)
  {
    xOv = paramInt;
  }
  
  public static void XK(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    xOw = str;
  }
  
  public static String cmY()
  {
    return xOw;
  }
  
  public static boolean cmZ()
  {
    return !h.yp(xOw);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */