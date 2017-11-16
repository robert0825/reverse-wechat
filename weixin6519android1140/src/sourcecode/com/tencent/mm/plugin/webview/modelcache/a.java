package com.tencent.mm.plugin.webview.modelcache;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.du;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
{
  private static final SparseArray<a> rFA;
  private static volatile b rFB;
  private static final byte[] rFC;
  public final String appId;
  public final String path;
  public final b rFz;
  
  static
  {
    GMTrace.i(12359171047424L, 92083);
    rFA = new SparseArray();
    rFB = null;
    rFC = new byte[0];
    GMTrace.o(12359171047424L, 92083);
  }
  
  private a(String paramString)
  {
    GMTrace.i(12359036829696L, 92082);
    this.appId = paramString;
    FileOp.la(com.tencent.mm.compatible.util.e.fSl + "sfs");
    this.path = (com.tencent.mm.compatible.util.e.fSl + String.valueOf(paramString.hashCode()));
    FileOp.la(this.path);
    this.rFz = bCH();
    GMTrace.o(12359036829696L, 92082);
  }
  
  public static a Ls(String paramString)
  {
    GMTrace.i(12358634176512L, 92079);
    if (bg.nm(paramString))
    {
      GMTrace.o(12358634176512L, 92079);
      return null;
    }
    int i = paramString.hashCode();
    a locala = (a)rFA.get(i);
    if (locala == null)
    {
      paramString = new a(paramString);
      rFA.put(i, paramString);
    }
    for (;;)
    {
      GMTrace.o(12358634176512L, 92079);
      return paramString;
      FileOp.la(locala.path);
      paramString = locala;
    }
  }
  
  public static d.a bCG()
  {
    GMTrace.i(12358499958784L, 92078);
    d.a locala = new d.a("WEBVIEW_RESOURCE_CACHE_APPID_OCCUPATION_TABLE".hashCode(), new String[] { i.a(du.qM(), "WebViewCacheAppIdOccupation") });
    GMTrace.o(12358499958784L, 92078);
    return locala;
  }
  
  private static b bCH()
  {
    GMTrace.i(12358902611968L, 92081);
    if (!at.AU())
    {
      ??? = new b(null);
      GMTrace.o(12358902611968L, 92081);
      return (b)???;
    }
    synchronized (rFC)
    {
      if ((rFB == null) || (!rFB.rFD))
      {
        at.AR();
        rFB = new b(c.yH());
      }
      b localb = rFB;
      GMTrace.o(12358902611968L, 92081);
      return localb;
    }
  }
  
  static void clearCache()
  {
    GMTrace.i(12358768394240L, 92080);
    rFA.clear();
    GMTrace.o(12358768394240L, 92080);
  }
  
  private static final class a
    extends du
  {
    public static final c.a hJW;
    
    static
    {
      GMTrace.i(12364137103360L, 92120);
      hJW = qM();
      GMTrace.o(12364137103360L, 92120);
    }
    
    public a()
    {
      GMTrace.i(12363600232448L, 92116);
      GMTrace.o(12363600232448L, 92116);
    }
    
    protected final c.a uw()
    {
      GMTrace.i(12363734450176L, 92117);
      c.a locala = hJW;
      GMTrace.o(12363734450176L, 92117);
      return locala;
    }
  }
  
  private static final class b
    extends i<a.a>
  {
    public final boolean rFD;
    
    public b(com.tencent.mm.sdk.e.e parame)
    {
      super(a.a.hJW, "WebViewCacheAppIdOccupation", null);
      GMTrace.i(12359305265152L, 92084);
      if (parame != null) {}
      for (boolean bool = true;; bool = false)
      {
        this.rFD = bool;
        GMTrace.o(12359305265152L, 92084);
        return;
      }
    }
    
    public final void Z(String paramString, long paramLong)
    {
      GMTrace.i(16083041910784L, 119828);
      if (!this.rFD)
      {
        GMTrace.o(16083041910784L, 119828);
        return;
      }
      a.a locala = new a.a();
      locala.field_appId = paramString;
      if (b(locala, new String[0]))
      {
        locala.field_occupation += paramLong;
        c(locala, new String[0]);
        GMTrace.o(16083041910784L, 119828);
        return;
      }
      locala.field_occupation = paramLong;
      b(locala);
      GMTrace.o(16083041910784L, 119828);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */