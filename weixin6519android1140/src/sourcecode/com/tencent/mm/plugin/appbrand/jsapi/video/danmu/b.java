package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;

public final class b
{
  public static int inl;
  public static int inm;
  private static int inn;
  
  static
  {
    GMTrace.i(17349654609920L, 129265);
    inl = 18;
    inm = 10;
    inn = 3;
    GMTrace.o(17349654609920L, 129265);
  }
  
  public static int XP()
  {
    GMTrace.i(17349520392192L, 129264);
    int i = inn;
    GMTrace.o(17349520392192L, 129264);
    return i;
  }
  
  public static float bM(Context paramContext)
  {
    GMTrace.i(17349251956736L, 129262);
    float f = a.fromDPToPix(paramContext, inl);
    GMTrace.o(17349251956736L, 129262);
    return f * 2.0F;
  }
  
  public static int u(Context paramContext, int paramInt)
  {
    GMTrace.i(17349386174464L, 129263);
    paramInt = a.fromDPToPix(paramContext, paramInt);
    GMTrace.o(17349386174464L, 129263);
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\danmu\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */