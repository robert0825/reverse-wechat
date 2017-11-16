package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.plugin.appbrand.appcache.h;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.protocal.c.alc;
import com.tencent.mm.protocal.c.ald;
import com.tencent.mm.protocal.c.ale;
import com.tencent.mm.protocal.c.bud;
import com.tencent.mm.protocal.c.bul;
import com.tencent.mm.protocal.c.bva;
import com.tencent.mm.protocal.c.bvd;
import com.tencent.mm.protocal.c.bvj;
import com.tencent.mm.protocal.c.md;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Locale;

final class f
  extends a<ale>
{
  final com.tencent.mm.ad.b fUa;
  final String hzG;
  volatile j iqk;
  public volatile boolean iql;
  
  f(String paramString1, bud parambud, String paramString2, int paramInt)
  {
    this(paramString1, false, parambud, null, null, paramString2, paramInt);
    GMTrace.i(19679003279360L, 146620);
    GMTrace.o(19679003279360L, 146620);
  }
  
  f(String paramString1, boolean paramBoolean, bud parambud, bvj parambvj, bvd parambvd, String paramString2, int paramInt)
  {
    GMTrace.i(19678869061632L, 146619);
    this.iql = false;
    this.hzG = paramString2;
    paramString2 = new ald();
    paramString2.lQa = paramString1;
    paramString2.uAg = parambud;
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      paramString2.utx = i;
      paramString2.uAj = parambvj;
      paramString2.uAk = parambvd;
      paramString1 = new bva();
      paramString1.uBN = paramInt;
      if (paramInt > 0)
      {
        parambud = com.tencent.mm.plugin.appbrand.app.e.Sr();
        if (parambud != null)
        {
          parambvj = new h();
          parambvj.field_key = "@LibraryAppId";
          parambvj.field_version = paramInt;
          if (parambud.b(parambvj, new String[] { "key", "version" }))
          {
            paramString1.tPN = ((int)parambvj.field_updateTime);
            paramString1.vds = parambvj.field_scene;
          }
        }
      }
      paramString2.uAi = paramString1;
      paramString1 = new b.a();
      paramString1.gtE = 1122;
      paramString1.uri = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
      paramString1.gtF = paramString2;
      paramString1.gtG = new ale();
      paramString1 = paramString1.DA();
      this.fUa = paramString1;
      this.fUa = paramString1;
      GMTrace.o(19678869061632L, 146619);
      return;
    }
  }
  
  private int Yp()
  {
    GMTrace.i(15441749606400L, 115050);
    int i = ((ald)this.fUa.gtC.gtK).uAg.uyt;
    GMTrace.o(15441749606400L, 115050);
    return i;
  }
  
  private boolean Yq()
  {
    GMTrace.i(17328582426624L, 129108);
    if (((ald)this.fUa.gtC.gtK).uAg.uBL > 0)
    {
      GMTrace.o(17328582426624L, 129108);
      return true;
    }
    GMTrace.o(17328582426624L, 129108);
    return false;
  }
  
  private String getAppId()
  {
    GMTrace.i(15441615388672L, 115049);
    String str = ((ald)this.fUa.gtC.gtK).lQa;
    GMTrace.o(15441615388672L, 115049);
    return str;
  }
  
  final void Yr()
  {
    GMTrace.i(15441883824128L, 115051);
    com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15439870558208L, 115036);
        f.this.iql = false;
        f.this.Dy();
        GMTrace.o(15439870558208L, 115036);
      }
    });
    GMTrace.o(15441883824128L, 115051);
  }
  
  void a(int paramInt1, int paramInt2, String paramString, ale paramale)
  {
    GMTrace.i(15442018041856L, 115052);
    if (paramale == null) {
      localObject1 = "NULL";
    }
    Object localObject2;
    String str;
    for (;;)
    {
      w.i("MicroMsg.CgiLaunchWxaApp", "onCgiBack, errType %d, errCode %d, errMsg %s, req[appId %s, bg %B, sync %B, libVersion %d], resp[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, getAppId(), Boolean.valueOf(Yq()), Boolean.valueOf(this.iql), Integer.valueOf(((ald)this.fUa.gtC.gtK).uAi.uBN), localObject1 });
      if ((paramInt1 != 0) || (paramInt2 != 0) || (paramale == null)) {
        break label898;
      }
      localObject2 = com.tencent.mm.plugin.appbrand.app.e.Sf();
      str = getAppId();
      if ((!bg.nm(str)) && (paramale != null)) {
        break;
      }
      paramString = null;
      this.iqk = paramString;
      this.iqk.iql = this.iql;
      if (paramale.uAl == null) {
        break label948;
      }
      if (paramale.uAl.uAe) {
        com.tencent.mm.plugin.appbrand.app.e.Sj().a(q.pw(getAppId()), Yp(), Yq(), ((ald)this.fUa.gtC.gtK).uAg.tOG, 1, this.hzG);
      }
      if (this.iql) {
        break label948;
      }
      paramString = AppBrandLaunchErrorAction.CREATOR;
      com.tencent.mm.plugin.appbrand.ipc.d.a(AppBrandLaunchErrorAction.a.a(getAppId(), Yp(), this.iqk));
      GMTrace.o(15442018041856L, 115052);
      return;
      if (paramale.uAm == null)
      {
        localObject1 = "NULL_API_INFO";
        if (paramale.uAl == null) {
          localObject1 = (String)localObject1 + " || NULL_LAUNCH";
        }
      }
      else
      {
        localObject2 = new StringBuilder("api_info~ fg:");
        if (paramale.uAm.ucU == null) {}
        for (localObject1 = "NULL";; localObject1 = Integer.valueOf(paramale.uAm.ucU.tJp.length))
        {
          str = localObject1;
          localObject2 = str;
          if (paramale.uAm.ucV != null)
          {
            localObject1 = str;
            if (paramale.uAm.ucV.size() > 0) {
              localObject1 = str + " | bg:" + ((com.tencent.mm.bm.b)paramale.uAm.ucV.get(0)).tJp.length;
            }
            localObject2 = localObject1;
            if (paramale.uAm.ucV.size() > 1) {
              localObject2 = (String)localObject1 + " | suspend:" + ((com.tencent.mm.bm.b)paramale.uAm.ucV.get(1)).tJp.length;
            }
          }
          localObject1 = (String)localObject2 + "~";
          break;
        }
      }
      localObject1 = (String)localObject1 + " || launch " + paramale.uAl.tNf;
    }
    Object localObject1 = new j();
    ((j)localObject1).field_appId = str;
    boolean bool2;
    label614:
    label691:
    boolean bool3;
    if (!((i)localObject2).a((j)localObject1, new String[] { "appId" }))
    {
      bool2 = true;
      boolean bool1 = false;
      if (!com.tencent.mm.plugin.appbrand.n.e.a(((j)localObject1).field_launchAction, paramale.uAl))
      {
        ((j)localObject1).field_launchAction = paramale.uAl;
        bool1 = true;
      }
      if (!com.tencent.mm.plugin.appbrand.n.e.a(((j)localObject1).field_jsapiInfo, paramale.uAm))
      {
        ((j)localObject1).field_jsapiInfo = paramale.uAm;
        bool1 = true;
      }
      if (paramale.uAn != null) {
        break label867;
      }
      paramString = new bul();
      paramale.uAn = paramString;
      if (!com.tencent.mm.plugin.appbrand.n.e.a(((j)localObject1).field_hostInfo, paramale.uAn))
      {
        ((j)localObject1).field_hostInfo = paramale.uAn;
        bool1 = true;
      }
      bool3 = bool1;
      if (paramale.uAp != null)
      {
        bool3 = bool1;
        if (!com.tencent.mm.plugin.appbrand.n.e.a(((j)localObject1).field_actionsheetInfo, paramale.uAp))
        {
          ((j)localObject1).field_actionsheetInfo = paramale.uAp;
          bool3 = true;
        }
      }
      w.i("MicroMsg.LaunchWxaAppCacheStorage", "flush resp, appId %s, apply %B, insert %B", new Object[] { str, Boolean.valueOf(bool3), Boolean.valueOf(bool2) });
      if (bool3)
      {
        if (!bool2) {
          break label876;
        }
        ((i)localObject2).a((j)localObject1, false);
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.appbrand.appcache.m.a(paramale.uAo);
      if (bool3) {
        ((i)localObject2).a((j)localObject1, new String[] { "appId" });
      }
      paramString = (String)localObject1;
      break;
      bool2 = false;
      break label614;
      label867:
      paramString = paramale.uAn;
      break label691;
      label876:
      ((i)localObject2).b((j)localObject1, false, new String[] { "appId" });
    }
    label898:
    if (this.iql) {
      m.rb(m.e(o.i.hGm, new Object[] { String.format(Locale.US, " (%d,%d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }) }));
    }
    label948:
    GMTrace.o(15442018041856L, 115052);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */