package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class d
{
  private static volatile d hSD;
  Map<String, c> hSE;
  
  private d()
  {
    GMTrace.i(17758616027136L, 132312);
    this.hSE = new ConcurrentHashMap();
    GMTrace.o(17758616027136L, 132312);
  }
  
  public static d UO()
  {
    GMTrace.i(17758750244864L, 132313);
    if (hSD == null) {}
    try
    {
      if (hSD == null) {
        hSD = new d();
      }
      d locald = hSD;
      GMTrace.o(17758750244864L, 132313);
      return locald;
    }
    finally {}
  }
  
  public final c pG(String paramString)
  {
    GMTrace.i(17758884462592L, 132314);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.DynamicPageViewIPCProxyManager", "get IPCProxy from manager failed, key is null or nil.");
      GMTrace.o(17758884462592L, 132314);
      return null;
    }
    paramString = (c)this.hSE.get(paramString);
    GMTrace.o(17758884462592L, 132314);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */