package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.appbrand.task.d;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.avk;
import com.tencent.mm.protocal.c.bui;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public enum m
{
  static
  {
    GMTrace.i(10614609018880L, 79085);
    hIZ = new m[0];
    GMTrace.o(10614609018880L, 79085);
  }
  
  private static void a(int paramInt1, int paramInt2, String paramString, bui parambui, a parama)
  {
    GMTrace.i(19688398520320L, 146690);
    if ((com.tencent.mm.kernel.h.xw().wL()) && (parama == a.hJc))
    {
      long l = bg.Pu();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vuv, Long.valueOf(86400L + l));
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.WxaCommLibVersionChecker", "onResp, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      GMTrace.o(19688398520320L, 146690);
      return;
    }
    if (parambui == null)
    {
      w.e("MicroMsg.WxaCommLibVersionChecker", "onResp, null response");
      GMTrace.o(19688398520320L, 146690);
      return;
    }
    if (com.tencent.mm.plugin.appbrand.app.e.Sl() != null)
    {
      paramString = new PInt();
      Object localObject = com.tencent.mm.plugin.appbrand.app.e.Sl();
      if ((parambui.version < 0) || (bg.nm(parambui.url)) || (bg.nm(parambui.eDW))) {
        w.e("MicroMsg.AppBrandWxaPkgStorage", "flushLibPkgVersionInfo, invalid resp: version( %d ), url( %s ), md5( %s )", new Object[] { Integer.valueOf(parambui.version), parambui.url, parambui.eDW });
      }
      for (boolean bool = false;; bool = ((x)localObject).a("@LibraryAppId", 0, parambui.version, parambui.eDW, parambui.url))
      {
        w.i("MicroMsg.WxaCommLibVersionChecker", "onResp, updateRet = %b, version = %d, forceUpdate = %d, md5 = %s, url = %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(parambui.version), Integer.valueOf(parambui.uKI), parambui.eDW, parambui.url });
        if (bool)
        {
          paramInt1 = parambui.version;
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16342216343552L, 121759);
              WxaPkgWrappingInfo localWxaPkgWrappingInfo = new j().bW(true);
              if ((localWxaPkgWrappingInfo != null) && (localWxaPkgWrappingInfo.hKC == this.hJb)) {
                d.jy(2);
              }
              GMTrace.o(16342216343552L, 121759);
            }
          }, "WxaCommLibUpdate-v" + paramInt1);
          localObject = new h();
          ((h)localObject).field_key = "@LibraryAppId";
          ((h)localObject).field_version = parambui.version;
          if (!com.tencent.mm.plugin.appbrand.app.e.Sr().b((c)localObject, new String[] { "key", "version" }))
          {
            ((h)localObject).field_updateTime = bg.Pu();
            ((h)localObject).field_scene = (parama.ordinal() + 1);
            com.tencent.mm.plugin.appbrand.app.e.Sr().b((c)localObject);
          }
        }
        if ((parambui.uKI > 0) && (paramString.value > 0))
        {
          paramInt1 = parambui.version;
          d.jy(2);
        }
        GMTrace.o(19688398520320L, 146690);
        return;
        if (parambui.uKI > 0)
        {
          paramInt1 = ((x)localObject).hKn.delete("AppBrandWxaPkgManifestRecord", String.format("%s=? and %s=? and %s>?", new Object[] { "appId", "debugType", "version" }), new String[] { "@LibraryAppId", "0", String.valueOf(parambui.version) });
          w.i("MicroMsg.AppBrandWxaPkgStorage", "flushLibPkgVersionInfo, delete manifest.version > %d, ret = %d", new Object[] { Integer.valueOf(parambui.version), Integer.valueOf(paramInt1) });
          paramString.value = paramInt1;
        }
      }
    }
    w.e("MicroMsg.WxaCommLibVersionChecker", "onResp, null storage");
    GMTrace.o(19688398520320L, 146690);
  }
  
  public static void a(avk paramavk)
  {
    GMTrace.i(15544291950592L, 115814);
    if (paramavk != null)
    {
      bui localbui = new bui();
      localbui.url = paramavk.url;
      localbui.eDW = paramavk.eDW;
      localbui.version = paramavk.version;
      localbui.uKI = paramavk.uKI;
      a(0, 0, null, localbui, a.hJe);
    }
    GMTrace.o(15544291950592L, 115814);
  }
  
  public static void a(bui parambui)
  {
    GMTrace.i(19688532738048L, 146691);
    a(0, 0, null, parambui, a.hJd);
    GMTrace.o(19688532738048L, 146691);
  }
  
  public static void bY(boolean paramBoolean)
  {
    GMTrace.i(19688264302592L, 146689);
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10597429149696L, 78957);
        if (this.hJa)
        {
          w.i("MicroMsg.WxaCommLibVersionChecker", "cgiCheckUpdate, force true");
          com.tencent.mm.kernel.h.xy().xh().a(w.a.vuv, Long.valueOf(bg.Pu() - 1L));
        }
        m.SE();
        GMTrace.o(10597429149696L, 78957);
      }
    }, "WxaCommLibVersionChecker");
    GMTrace.o(19688264302592L, 146689);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(19690277568512L, 146704);
      hJc = new a("CGI", 0);
      hJd = new a("NewXml", 1);
      hJe = new a("Launch", 2);
      hJf = new a[] { hJc, hJd, hJe };
      GMTrace.o(19690277568512L, 146704);
    }
    
    private a()
    {
      GMTrace.i(19690143350784L, 146703);
      GMTrace.o(19690143350784L, 146703);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */