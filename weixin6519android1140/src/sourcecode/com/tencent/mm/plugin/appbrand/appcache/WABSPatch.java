package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;

public final class WABSPatch
{
  public WABSPatch()
  {
    GMTrace.i(19994549157888L, 148971);
    GMTrace.o(19994549157888L, 148971);
  }
  
  public static native int bspatch(String paramString1, String paramString2, String paramString3);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\WABSPatch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */