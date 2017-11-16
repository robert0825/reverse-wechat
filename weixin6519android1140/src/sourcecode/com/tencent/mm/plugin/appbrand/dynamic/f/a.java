package com.tencent.mm.plugin.appbrand.dynamic.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.n.e;
import com.tencent.mm.plugin.appbrand.widget.n;
import com.tencent.mm.plugin.appbrand.widget.o;
import com.tencent.mm.protocal.c.alf;
import com.tencent.mm.protocal.c.alg;
import com.tencent.mm.protocal.c.bty;
import com.tencent.mm.protocal.c.buu;
import com.tencent.mm.protocal.c.bvk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.a<alg>
{
  private int eII;
  public final b fUa;
  public o hUO;
  private int hUw;
  
  public a(String paramString, boolean paramBoolean, bvk parambvk)
  {
    GMTrace.i(17757005414400L, 132300);
    alf localalf = new alf();
    localalf.lQa = paramString;
    localalf.uAq = parambvk;
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      localalf.utx = i;
      paramString = new b.a();
      paramString.gtE = 1181;
      paramString.uri = "/cgi-bin/mmbiz-bin/wxaattr/launchwxawidget";
      paramString.gtF = localalf;
      paramString.gtG = new alg();
      paramString = paramString.DA();
      this.fUa = paramString;
      this.fUa = paramString;
      this.hUw = parambvk.vdF;
      this.eII = com.tencent.mm.plugin.appbrand.dynamic.j.a.bp(this.hUw, parambvk.uyt);
      GMTrace.o(17757005414400L, 132300);
      return;
    }
  }
  
  private String getAppId()
  {
    GMTrace.i(17757139632128L, 132301);
    String str = ((alf)this.fUa.gtC.gtK).lQa;
    GMTrace.o(17757139632128L, 132301);
    return str;
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, alg paramalg)
  {
    GMTrace.i(17757273849856L, 132302);
    w.i("MicroMsg.CgiLaunchWxaWidget", "onCgiBack, errType %d, errCode %d, errMsg %s, req appId %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, getAppId() });
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramalg != null))
    {
      str = getAppId();
      Object localObject = ((com.tencent.mm.plugin.appbrand.widget.a.a)h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sg();
      paramInt1 = this.eII;
      paramInt2 = this.hUw;
      if ((bg.nm(str)) || (paramalg == null))
      {
        paramString = null;
        this.hUO = paramString;
        if (paramalg.uAs == null) {
          break label525;
        }
        paramString = ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().W(str, this.eII);
        localObject = new buu();
        ((buu)localObject).vdn = paramString;
        ((buu)localObject).tVE = paramalg.uAs.tVE;
        if (this.eII == 10102)
        {
          ((buu)localObject).vdm = paramalg.uAs.vcE;
          ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, (buu)localObject, this.eII);
          GMTrace.o(17757273849856L, 132302);
        }
      }
      else
      {
        paramString = new o();
        paramString.field_appIdHash = str.hashCode();
        paramString.field_appId = str;
        paramString.field_pkgType = paramInt1;
        paramString.field_widgetType = paramInt2;
        if (!((n)localObject).a(paramString, new String[] { "appId", "pkgType", "widgetType" }))
        {
          paramInt2 = 1;
          label287:
          paramInt1 = 0;
          if (!e.a(paramString.field_launchAction, paramalg.uAr))
          {
            paramString.field_launchAction = paramalg.uAr;
            paramInt1 = 1;
          }
          if (!e.a(paramString.field_jsApiInfo, paramalg.uAm))
          {
            paramString.field_jsApiInfo = paramalg.uAm;
            paramInt1 = 1;
          }
          if (!e.a(paramString.field_versionInfo, paramalg.uAs))
          {
            paramString.field_versionInfo = paramalg.uAs;
            paramInt1 = 1;
          }
          if (!e.a(paramString.field_widgetSetting, paramalg.uAt))
          {
            paramString.field_widgetSetting = paramalg.uAt;
            paramInt1 = 1;
          }
          if (paramInt1 != 0)
          {
            if (paramInt2 == 0) {
              break label447;
            }
            ((n)localObject).a(paramString, false);
          }
        }
        for (;;)
        {
          if (paramInt1 != 0) {
            ((n)localObject).a(paramString, new String[] { "appId", "pkgType", "widgetType" });
          }
          break;
          paramInt2 = 0;
          break label287;
          label447:
          ((n)localObject).a(paramString, false, new String[] { "appId", "pkgType", "widgetType" });
        }
      }
      if (this.eII == 10002)
      {
        ((buu)localObject).vdm = paramalg.uAs.vcD;
        ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, (buu)localObject, this.eII);
      }
      label525:
      GMTrace.o(17757273849856L, 132302);
      return;
    }
    paramalg = ((com.tencent.mm.plugin.appbrand.widget.a.a)h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sg();
    String str = getAppId();
    paramInt1 = this.eII;
    paramInt2 = this.hUw;
    if (!bg.nm(str))
    {
      paramString = new o();
      paramString.field_appIdHash = str.hashCode();
      paramString.field_appId = str;
      paramString.field_pkgType = paramInt1;
      paramString.field_widgetType = paramInt2;
      if (!paramalg.a(paramString, new String[] { "appId", "pkgType", "widgetType" })) {}
    }
    for (;;)
    {
      this.hUO = paramString;
      GMTrace.o(17757273849856L, 132302);
      return;
      paramString = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */