package com.tencent.mm.pluginsdk.j.a.d;

import android.annotation.SuppressLint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.j.a.b.b.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@SuppressLint({"UseSparseArrays"})
public final class p
{
  private static final HashMap<Integer, g> jdField_try;
  private static volatile List<g> trz;
  
  static
  {
    GMTrace.i(861409378304L, 6418);
    Object localObject = new HashMap(2);
    try = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("CheckResUpdatePlugin".hashCode()), new b.a());
    try
    {
      localObject = Class.forName("com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper$ResDownloaderPlugin").newInstance();
      try.put(Integer.valueOf("WebViewCacheDownload".hashCode()), (g)localObject);
      trz = null;
      GMTrace.o(861409378304L, 6418);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ResDownloaderPluginMap", localException, "", new Object[0]);
      }
    }
  }
  
  public static Collection<g> bKq()
  {
    GMTrace.i(861275160576L, 6417);
    if (trz != null)
    {
      localObject = trz;
      GMTrace.o(861275160576L, 6417);
      return (Collection<g>)localObject;
    }
    Object localObject = new LinkedList();
    Iterator localIterator = try.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      g localg = (g)try.get(Integer.valueOf(i));
      if (localg != null) {
        ((LinkedList)localObject).add(localg);
      }
    }
    trz = (List)localObject;
    GMTrace.o(861275160576L, 6417);
    return (Collection<g>)localObject;
  }
  
  public static void init()
  {
    GMTrace.i(861140942848L, 6416);
    GMTrace.o(861140942848L, 6416);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */