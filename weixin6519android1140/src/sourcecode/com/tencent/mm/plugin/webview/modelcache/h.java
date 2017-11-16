package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.i;

public final class h
  extends i<g>
{
  static final String[] fTX;
  
  static
  {
    GMTrace.i(12363197579264L, 92113);
    fTX = new String[] { i.a(g.fTp, "WebViewCacheResConfigMap") };
    GMTrace.o(12363197579264L, 92113);
  }
  
  public static d.a bCG()
  {
    GMTrace.i(12362929143808L, 92111);
    d.a locala = new d.a("WEBVIEW_RESOURCE_CACHE_CONFIG_MAP_TABLE".hashCode(), fTX);
    GMTrace.o(12362929143808L, 92111);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */