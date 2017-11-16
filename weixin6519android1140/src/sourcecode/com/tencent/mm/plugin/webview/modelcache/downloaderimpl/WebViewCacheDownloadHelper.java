package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import android.os.Looper;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ti;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pluginsdk.j.a.d.g;
import com.tencent.mm.pluginsdk.j.a.d.h;
import com.tencent.mm.pluginsdk.j.a.d.i;
import com.tencent.mm.pluginsdk.j.a.d.k;
import com.tencent.mm.pluginsdk.j.a.d.l;
import com.tencent.mm.pluginsdk.j.a.d.m.a;
import com.tencent.mm.pluginsdk.j.a.d.o;
import com.tencent.mm.pluginsdk.j.a.d.o.a;
import com.tencent.mm.pluginsdk.j.a.d.q;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class WebViewCacheDownloadHelper
{
  private static final byte[] rGp;
  private static volatile WebViewCacheDownloadHelper rGq;
  
  static
  {
    GMTrace.i(12355010297856L, 92052);
    rGp = new byte[0];
    rGq = null;
    GMTrace.o(12355010297856L, 92052);
  }
  
  private WebViewCacheDownloadHelper()
  {
    GMTrace.i(12354473426944L, 92048);
    GMTrace.o(12354473426944L, 92048);
  }
  
  static void a(f paramf)
  {
    GMTrace.i(12354876080128L, 92051);
    ti localti = new ti();
    localti.eYQ.url = paramf.url;
    localti.eYQ.filePath = paramf.filePath;
    localti.eYQ.version = paramf.version;
    localti.eYQ.appId = paramf.appId;
    localti.eYQ.eYR = paramf.eYR;
    localti.eYQ.eYS = paramf.eYS;
    localti.eYQ.eYT = paramf.eYT;
    localti.eYQ.eYU = paramf.eYU;
    localti.eYQ.eYW = paramf.eYW;
    localti.eYQ.eYV = paramf.eYV;
    com.tencent.mm.sdk.b.a.vgX.a(localti, Looper.getMainLooper());
    GMTrace.o(12354876080128L, 92051);
  }
  
  public static WebViewCacheDownloadHelper bCL()
  {
    GMTrace.i(12354607644672L, 92049);
    if (rGq == null) {}
    synchronized (rGp)
    {
      if (rGq == null) {
        rGq = new WebViewCacheDownloadHelper();
      }
      ??? = rGq;
      GMTrace.o(12354607644672L, 92049);
      return (WebViewCacheDownloadHelper)???;
    }
  }
  
  public static void bCM()
  {
    GMTrace.i(12354741862400L, 92050);
    FileOp.B(a.rGo, false);
    GMTrace.o(12354741862400L, 92050);
  }
  
  public static final class ResDownloaderPlugin
    implements g
  {
    private final com.tencent.mm.pluginsdk.j.a.d.d rGr;
    
    public ResDownloaderPlugin()
    {
      GMTrace.i(12355547168768L, 92056);
      this.rGr = new com.tencent.mm.pluginsdk.j.a.d.d()
      {
        private static void LB(String paramAnonymousString)
        {
          GMTrace.i(12357023563776L, 92067);
          paramAnonymousString = o.a.trx.OO(paramAnonymousString);
          if (paramAnonymousString != null) {
            com.tencent.mm.pluginsdk.j.a.e.a.OS(paramAnonymousString.field_filePath);
          }
          GMTrace.o(12357023563776L, 92067);
        }
        
        public final void LA(String paramAnonymousString)
        {
          GMTrace.i(12356755128320L, 92065);
          LB(paramAnonymousString);
          GMTrace.o(12356755128320L, 92065);
        }
        
        public final String SM()
        {
          GMTrace.i(12356889346048L, 92066);
          GMTrace.o(12356889346048L, 92066);
          return "WebViewCache";
        }
        
        public final void a(String paramAnonymousString, l paramAnonymousl)
        {
          GMTrace.i(12356486692864L, 92063);
          b.c(paramAnonymousString, paramAnonymousl);
          GMTrace.o(12356486692864L, 92063);
        }
        
        public final void b(String paramAnonymousString, l paramAnonymousl)
        {
          GMTrace.i(12356620910592L, 92064);
          LB(paramAnonymousString);
          b.c(paramAnonymousString, paramAnonymousl);
          GMTrace.o(12356620910592L, 92064);
        }
      };
      GMTrace.o(12355547168768L, 92056);
    }
    
    public final String SM()
    {
      GMTrace.i(12355949821952L, 92059);
      GMTrace.o(12355949821952L, 92059);
      return "WebViewCache";
    }
    
    public final void bCN()
    {
      GMTrace.i(12355681386496L, 92057);
      o.a.trx.a("WebViewCache", this.rGr);
      GMTrace.o(12355681386496L, 92057);
    }
    
    public final h bCO()
    {
      GMTrace.i(12356218257408L, 92061);
      d locald = new d();
      GMTrace.o(12356218257408L, 92061);
      return locald;
    }
    
    public final m.a c(k paramk)
    {
      GMTrace.i(12356084039680L, 92060);
      if ((paramk == null) || (!(paramk instanceof e)))
      {
        w.e("MicroMsg.ResDownloader.WebViewCacheDownloadHelper", "getNetworkRequestHandler, get invalid request = " + paramk);
        GMTrace.o(12356084039680L, 92060);
        return null;
      }
      paramk = new c((e)paramk);
      GMTrace.o(12356084039680L, 92060);
      return paramk;
    }
    
    public final void onAccountRelease()
    {
      GMTrace.i(12355815604224L, 92058);
      c.clearCache();
      ??? = o.a.trx;
      com.tencent.mm.pluginsdk.j.a.d.d locald = this.rGr;
      if (((o)???).rFD)
      {
        Object localObject3 = ((o)???).trw;
        if (locald != null)
        {
          int i = "WebViewCache".hashCode();
          synchronized (((i)localObject3).trf)
          {
            localObject3 = (List)((i)localObject3).tre.get(i);
            if (localObject3 == null)
            {
              GMTrace.o(12355815604224L, 92058);
              return;
            }
            ((List)localObject3).remove(locald);
            GMTrace.o(12355815604224L, 92058);
            return;
          }
        }
      }
      GMTrace.o(12355815604224L, 92058);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\downloaderimpl\WebViewCacheDownloadHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */