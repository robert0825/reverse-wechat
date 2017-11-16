package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

final class f
{
  static Map<String, d> hXH;
  static Map<String, d> hXI;
  
  static void a(d paramd)
  {
    GMTrace.i(10425362022400L, 77675);
    if (bg.nm(paramd.getName()))
    {
      GMTrace.o(10425362022400L, 77675);
      return;
    }
    hXH.put(paramd.getName(), paramd);
    GMTrace.o(10425362022400L, 77675);
  }
  
  static void b(d paramd)
  {
    GMTrace.i(10425496240128L, 77676);
    if (bg.nm(paramd.getName()))
    {
      GMTrace.o(10425496240128L, 77676);
      return;
    }
    hXI.put(paramd.getName(), paramd);
    GMTrace.o(10425496240128L, 77676);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */