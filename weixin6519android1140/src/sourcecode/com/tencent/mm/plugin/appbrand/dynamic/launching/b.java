package com.tencent.mm.plugin.appbrand.dynamic.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.dynamic.f.a.1;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.widget.n;
import com.tencent.mm.plugin.appbrand.widget.o;
import com.tencent.mm.protocal.c.alg;
import com.tencent.mm.protocal.c.btx;
import com.tencent.mm.protocal.c.bty;
import com.tencent.mm.protocal.c.bvk;
import java.util.concurrent.Callable;

public final class b
  implements Callable<o>
{
  final String appId;
  final int eII;
  final int eVc;
  final int hUw;
  final int scene;
  
  public b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18298305511424L, 136333);
    this.appId = paramString;
    this.eII = paramInt1;
    this.eVc = paramInt2;
    this.scene = paramInt3;
    this.hUw = paramInt4;
    GMTrace.o(18298305511424L, 136333);
  }
  
  public final o Vh()
  {
    GMTrace.i(19908112941056L, 148327);
    Object localObject1 = new o();
    ((o)localObject1).field_appId = this.appId;
    Object localObject2 = ((com.tencent.mm.plugin.appbrand.widget.a.a)h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sg();
    if (localObject2 == null)
    {
      GMTrace.o(19908112941056L, 148327);
      return null;
    }
    bvk localbvk = new bvk();
    localbvk.uyt = com.tencent.mm.plugin.appbrand.dynamic.j.a.ix(this.eII);
    localbvk.tVE = this.eVc;
    localbvk.vdF = this.hUw;
    localbvk.tOG = this.scene;
    localbvk.vdG = 0;
    if (((n)localObject2).a((o)localObject1, new String[] { "appId", "pkgType", "widgetType" })) {
      if (((o)localObject1).field_jsApiInfo == null) {
        break label267;
      }
    }
    label267:
    for (int i = 1; (i == 0) || (((o)localObject1).field_launchAction == null) || (1 != ((o)localObject1).field_launchAction.tNf) || (((o)localObject1).field_versionInfo == null) || (((o)localObject1).field_versionInfo.tVE < this.eVc); i = 0)
    {
      com.tencent.mm.plugin.appbrand.dynamic.h.a.a.pS(this.appId);
      com.tencent.mm.plugin.appbrand.dynamic.h.a.a.pP(this.appId);
      localObject1 = new com.tencent.mm.plugin.appbrand.dynamic.f.a(this.appId, true, localbvk);
      localObject2 = c.c(((com.tencent.mm.plugin.appbrand.dynamic.f.a)localObject1).fUa);
      ((com.tencent.mm.plugin.appbrand.dynamic.f.a)localObject1).a(((a.a)localObject2).errType, ((a.a)localObject2).errCode, ((a.a)localObject2).eAR, (alg)((a.a)localObject2).eWz);
      com.tencent.mm.plugin.appbrand.dynamic.h.a.a.pQ(this.appId);
      localObject1 = ((com.tencent.mm.plugin.appbrand.dynamic.f.a)localObject1).hUO;
      GMTrace.o(19908112941056L, 148327);
      return (o)localObject1;
    }
    com.tencent.mm.plugin.appbrand.dynamic.h.a.a.pT(this.appId);
    com.tencent.mm.bv.a.post(new a.1(new com.tencent.mm.plugin.appbrand.dynamic.f.a(this.appId, false, localbvk)));
    GMTrace.o(19908112941056L, 148327);
    return (o)localObject1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\launching\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */