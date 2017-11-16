package com.tencent.mm.plugin.appbrand.page;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.e;

public final class j
  extends e
{
  private static final int CTRL_INDEX = -2;
  private static final String NAME = "onTapStatusBar";
  private static j iup;
  
  static
  {
    GMTrace.i(10229269921792L, 76214);
    iup = new j();
    GMTrace.o(10229269921792L, 76214);
  }
  
  public j()
  {
    GMTrace.i(10229001486336L, 76212);
    GMTrace.o(10229001486336L, 76212);
  }
  
  public static void ao(String paramString, int paramInt)
  {
    GMTrace.i(10229135704064L, 76213);
    iup.ai(paramString, 0).f(new int[] { paramInt });
    GMTrace.o(10229135704064L, 76213);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */