package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.j.a.d.j;
import com.tencent.mm.pluginsdk.j.a.d.k;
import com.tencent.mm.pluginsdk.j.a.d.l;
import com.tencent.mm.pluginsdk.j.a.d.m.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.ConcurrentHashMap;

public final class c
  extends m.a<e>
{
  private static final ConcurrentHashMap<String, Boolean> rGt;
  
  static
  {
    GMTrace.i(12354339209216L, 92047);
    rGt = new ConcurrentHashMap();
    GMTrace.o(12354339209216L, 92047);
  }
  
  public c(e parame)
  {
    super(parame);
    GMTrace.i(12353131249664L, 92038);
    GMTrace.o(12353131249664L, 92038);
  }
  
  public static void clearCache()
  {
    GMTrace.i(12354204991488L, 92046);
    rGt.clear();
    GMTrace.o(12354204991488L, 92046);
  }
  
  public final String SM()
  {
    GMTrace.i(12353802338304L, 92043);
    GMTrace.o(12353802338304L, 92043);
    return "WebViewCache";
  }
  
  public final boolean SN()
  {
    GMTrace.i(12353265467392L, 92039);
    GMTrace.o(12353265467392L, 92039);
    return true;
  }
  
  public final boolean SO()
  {
    GMTrace.i(12353399685120L, 92040);
    GMTrace.o(12353399685120L, 92040);
    return false;
  }
  
  public final boolean SP()
  {
    GMTrace.i(12353533902848L, 92041);
    GMTrace.o(12353533902848L, 92041);
    return true;
  }
  
  public final boolean SR()
  {
    GMTrace.i(12353668120576L, 92042);
    GMTrace.o(12353668120576L, 92042);
    return false;
  }
  
  protected final l a(j paramj)
  {
    GMTrace.i(12354070773760L, 92045);
    if (rGt.putIfAbsent(((e)ST()).getFilePath(), Boolean.TRUE) != null)
    {
      w.i("MicroMsg.ResDownloader.WebViewCacheDownloadNetworkRequestHandler", "request urlKey = %s, already downloading this file", new Object[] { ((e)ST()).tpD });
      GMTrace.o(12354070773760L, 92045);
      return null;
    }
    paramj = super.a(paramj);
    rGt.remove(((e)ST()).getFilePath());
    GMTrace.o(12354070773760L, 92045);
    return paramj;
  }
  
  public final boolean el(long paramLong)
  {
    GMTrace.i(12353936556032L, 92044);
    if (!super.el(paramLong))
    {
      GMTrace.o(12353936556032L, 92044);
      return false;
    }
    if (paramLong < 5242880L)
    {
      GMTrace.o(12353936556032L, 92044);
      return true;
    }
    GMTrace.o(12353936556032L, 92044);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\downloaderimpl\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */