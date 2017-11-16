package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.compatible.loader.a;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appcache.k;
import com.tencent.mm.plugin.appbrand.appcache.t;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.protocal.c.alc;
import com.tencent.mm.protocal.c.ale;
import com.tencent.mm.protocal.c.bud;
import com.tencent.mm.protocal.c.bvd;
import com.tencent.mm.protocal.c.bvj;
import com.tencent.mm.sdk.platformtools.bg;

final class o
  extends l<j>
{
  final String appId;
  final int eVc;
  final int eVi;
  final AppBrandLaunchReferrer hQB;
  final String hQy;
  final int hZb;
  final int icO;
  final int iqd;
  final String iqe;
  
  o(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, String paramString3, int paramInt4)
  {
    GMTrace.i(20670335418368L, 154006);
    this.appId = paramString1;
    this.hZb = paramInt1;
    this.eVi = paramInt2;
    this.iqd = paramInt3;
    this.hQy = paramString2;
    this.hQB = paramAppBrandLaunchReferrer;
    this.iqe = paramString3;
    paramString1 = e.Sl().a(paramString1, paramInt1, new String[] { "version" });
    if (paramString1 == null)
    {
      paramInt1 = 0;
      this.eVc = paramInt1;
      if (paramInt4 < 0) {
        break label108;
      }
    }
    for (;;)
    {
      this.icO = paramInt4;
      GMTrace.o(20670335418368L, 154006);
      return;
      paramInt1 = paramString1.field_version;
      break;
      label108:
      paramInt4 = k.SA();
    }
  }
  
  public final j Yv()
  {
    int j = 0;
    GMTrace.i(20670469636096L, 154007);
    Object localObject1 = new j();
    ((j)localObject1).field_appId = this.appId;
    Object localObject2 = e.Sf();
    if (localObject2 == null)
    {
      GMTrace.o(20670469636096L, 154007);
      return null;
    }
    bud localbud = new bud();
    localbud.uyt = this.hZb;
    localbud.tVE = this.eVc;
    localbud.tOG = this.iqd;
    localbud.uBM = this.hQy;
    localbud.uBL = 0;
    localbud.uBK = this.eVi;
    int i;
    if (1055 == this.iqd)
    {
      i = 1;
      if (i == 0) {
        if (((i)localObject2).a((j)localObject1, new String[] { "appId" }))
        {
          i = j;
          if (((j)localObject1).field_jsapiInfo != null) {
            i = 1;
          }
          if ((i != 0) && (((j)localObject1).field_launchAction != null) && (1 == ((j)localObject1).field_launchAction.tNf)) {
            break label444;
          }
        }
      }
      if ((this.hQB == null) || (1 != this.hQB.hQF)) {
        break label485;
      }
      localObject1 = new bvd();
      ((bvd)localObject1).uyn = this.hQB.appId;
    }
    for (;;)
    {
      if ((this.hQB != null) && (2 == this.hQB.hQF))
      {
        localObject2 = new bvj();
        ((bvj)localObject2).lTf = this.hQB.appId;
        ((bvj)localObject2).lPM = this.hQB.url;
      }
      for (;;)
      {
        long l1 = bg.Pv();
        localObject1 = new f(this.appId, true, localbud, (bvj)localObject2, (bvd)localObject1, this.iqe, this.icO);
        ((f)localObject1).iql = true;
        localObject2 = c.c(((f)localObject1).fUa);
        ((f)localObject1).a(((a.a)localObject2).errType, ((a.a)localObject2).errCode, ((a.a)localObject2).eAR, (ale)((a.a)localObject2).eWz);
        long l2 = bg.Pv();
        h.a(h.a.iqo, this.appId, this.eVc, this.hZb, this.iqd, l2 - l1);
        localObject1 = ((f)localObject1).iqk;
        GMTrace.o(20670469636096L, 154007);
        return (j)localObject1;
        if (1037 == this.iqd)
        {
          i = 1;
          break;
        }
        int[] arrayOfInt = AppBrandGlobalSystemConfig.Uu().hQh;
        if ((arrayOfInt != null) && (a.b(arrayOfInt, this.iqd)))
        {
          i = 1;
          break;
        }
        i = 0;
        break;
        label444:
        new f(this.appId, localbud, this.iqe, this.icO).Yr();
        GMTrace.o(20670469636096L, 154007);
        return (j)localObject1;
        localObject2 = null;
      }
      label485:
      localObject1 = null;
    }
  }
  
  final String getTag()
  {
    GMTrace.i(17336367054848L, 129166);
    GMTrace.o(17336367054848L, 129166);
    return "MicroMsg.AppBrand.PrepareStepCheckLaunchInfo";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */