package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.b;
import com.tencent.mm.plugin.appbrand.appcache.s;
import com.tencent.mm.plugin.appbrand.appcache.s.a;
import com.tencent.mm.plugin.appbrand.appcache.t;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.appcache.y;
import com.tencent.mm.plugin.appbrand.appcache.y.a;
import com.tencent.mm.plugin.appbrand.appcache.y.a.a;
import com.tencent.mm.plugin.appbrand.appcache.y.a.b;
import com.tencent.mm.plugin.appbrand.n.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.afx;
import com.tencent.mm.protocal.c.buu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public final class c
  implements Callable<WxaPkgWrappingInfo>
{
  public static int hUx;
  public static int hUy;
  final String appId;
  final int eII;
  volatile int hKC;
  String hSv;
  int hUw;
  volatile String hUz;
  
  static
  {
    GMTrace.i(17846662856704L, 132968);
    hUx = 0;
    hUy = 1;
    GMTrace.o(17846662856704L, 132968);
  }
  
  public c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    GMTrace.i(18298171293696L, 136332);
    this.appId = paramString1;
    this.eII = paramInt1;
    this.hKC = paramInt2;
    this.hUz = paramString3;
    this.hUw = paramInt3;
    this.hSv = paramString2;
    GMTrace.o(18298171293696L, 136332);
  }
  
  private WxaPkgWrappingInfo Vj()
  {
    GMTrace.i(17846260203520L, 132965);
    final CountDownLatch localCountDownLatch = new CountDownLatch(1);
    final Object localObject = new d();
    y.a local1 = new y.a()
    {
      public final void a(String paramAnonymousString, y.a.b paramAnonymousb, y.a.a paramAnonymousa)
      {
        GMTrace.i(17847333945344L, 132973);
        w.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "onPkgUpdatingCallback, appId = %s, return = %s", new Object[] { paramAnonymousString, paramAnonymousb.name() });
        if (y.a.b.hKt.equals(paramAnonymousb))
        {
          paramAnonymousString = WxaPkgWrappingInfo.ou(paramAnonymousa.filePath);
          if (paramAnonymousString == null) {
            w.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "onPkgUpdatingCallback, ret=OK but obtain null appPkgInfo");
          }
        }
        for (;;)
        {
          localCountDownLatch.countDown();
          GMTrace.o(17847333945344L, 132973);
          return;
          paramAnonymousString.hKC = paramAnonymousa.version;
          paramAnonymousString.hKD = bg.Pu();
          paramAnonymousString.hKB = paramAnonymousa.hKs;
          localObject.iGp = paramAnonymousString;
          continue;
          y.a.b.hKy.equals(paramAnonymousb);
        }
      }
    };
    if ((this.eII == 10002) || (this.eII == 10102))
    {
      w.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, debug type is release, start download appId(%s), pkgVersion(%d)", new Object[] { this.appId, Integer.valueOf(this.hKC) });
      if (!y.a(this.appId, this.eII, this.hKC, this.hUz, local1))
      {
        a(s.a.hJR);
        GMTrace.o(17846260203520L, 132965);
        return null;
      }
    }
    else
    {
      w.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, appId = %s, debug type is %d", new Object[] { this.appId, Integer.valueOf(this.eII) });
      if (((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ() == null)
      {
        w.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, null storage");
        a(s.a.hJR);
        GMTrace.o(17846260203520L, 132965);
        return null;
      }
      String str = ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().W(this.appId, this.eII);
      if (bg.nm(str))
      {
        w.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, url is null or nil");
        a(s.a.hJN);
        GMTrace.o(17846260203520L, 132965);
        return null;
      }
      y.a(this.appId, this.eII, str, local1);
    }
    try
    {
      localCountDownLatch.await();
      localObject = (WxaPkgWrappingInfo)((d)localObject).iGp;
      GMTrace.o(17846260203520L, 132965);
      return (WxaPkgWrappingInfo)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", localException, "tryDownload semaphore exp ", new Object[0]);
      }
    }
  }
  
  private static void a(s.a parama)
  {
    GMTrace.i(17846394421248L, 132966);
    if (s.a.hJN.equals(parama))
    {
      GMTrace.o(17846394421248L, 132966);
      return;
    }
    if ((s.a.hJP.equals(parama)) || (s.a.hJO.equals(parama)))
    {
      GMTrace.o(17846394421248L, 132966);
      return;
    }
    GMTrace.o(17846394421248L, 132966);
  }
  
  public final WxaPkgWrappingInfo Vi()
  {
    int j = 1;
    GMTrace.i(17846125985792L, 132964);
    Object localObject1 = s.p(this.appId, this.eII, this.hKC);
    if (((Pair)localObject1).second != null)
    {
      localObject1 = (WxaPkgWrappingInfo)((Pair)localObject1).second;
      GMTrace.o(17846125985792L, 132964);
      return (WxaPkgWrappingInfo)localObject1;
    }
    Object localObject2;
    Object localObject3;
    if (s.a.hJQ.equals(((Pair)localObject1).first))
    {
      if ((this.eII == 10002) || (this.eII == 10102))
      {
        localObject2 = ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(this.appId, this.eII, new String[] { "version", "versionMd5", "versionState" });
        if (localObject2 == null)
        {
          a((s.a)((Pair)localObject1).first);
          GMTrace.o(17846125985792L, 132964);
          return null;
        }
        if (this.eII == 10102) {}
        for (i = 2;; i = 1)
        {
          com.tencent.mm.plugin.appbrand.dynamic.h.a.a.pR(this.appId);
          localObject4 = com.tencent.mm.plugin.appbrand.g.c.c(new b(this.appId, ((t)localObject2).field_version, ((t)localObject2).field_versionMd5, i).fUa);
          if ((localObject4 != null) && (((a.a)localObject4).errType == 0) && (((a.a)localObject4).errCode == 0)) {
            break;
          }
          if (this.hUw == 1)
          {
            com.tencent.mm.plugin.appbrand.dynamic.h.a.a.L(this.appId, false);
            g.ork.i(14452, new Object[] { this.hSv + "-" + this.appId, Integer.valueOf(6), Long.valueOf(System.currentTimeMillis()) });
          }
          GMTrace.o(17846125985792L, 132964);
          return null;
        }
        if (this.hUw == 1) {
          com.tencent.mm.plugin.appbrand.dynamic.h.a.a.L(this.appId, true);
        }
        if (bg.nm(((afx)((a.a)localObject4).eWz).url))
        {
          if (this.hUw == 1) {
            g.ork.i(14452, new Object[] { this.hSv + "-" + this.appId, Integer.valueOf(6), Long.valueOf(System.currentTimeMillis()) });
          }
          GMTrace.o(17846125985792L, 132964);
          return null;
        }
        if (this.hUw == 1) {
          g.ork.i(14452, new Object[] { this.hSv + "-" + this.appId, Integer.valueOf(5), Long.valueOf(System.currentTimeMillis()) });
        }
        localObject3 = new buu();
        Object localObject4 = ((afx)((a.a)localObject4).eWz).url;
        this.hUz = ((String)localObject4);
        ((buu)localObject3).vdn = ((String)localObject4);
        i = ((t)localObject2).field_version;
        this.hKC = i;
        ((buu)localObject3).tVE = i;
        ((buu)localObject3).vdl = ((t)localObject2).field_versionState;
        ((buu)localObject3).vdm = ((t)localObject2).field_versionMd5;
        ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(this.appId, (buu)localObject3, this.eII);
      }
      localObject2 = Vj();
      if (localObject2 != null)
      {
        if (this.hUw == 1) {
          g.ork.i(14452, new Object[] { this.hSv + "-" + this.appId, Integer.valueOf(7), Long.valueOf(System.currentTimeMillis()) });
        }
        GMTrace.o(17846125985792L, 132964);
        return (WxaPkgWrappingInfo)localObject2;
      }
      if (this.hUw == 1) {
        g.ork.i(14452, new Object[] { this.hSv + "-" + this.appId, Integer.valueOf(8), Long.valueOf(System.currentTimeMillis()) });
      }
      if ((this.eII != 10002) && (this.eII != 10102)) {
        break label980;
      }
      localObject2 = ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().os(this.appId);
      if ((localObject2 == null) || (localObject2.length <= 1)) {
        break label980;
      }
    }
    for (int i = j;; i = j)
    {
      localObject3 = this.appId;
      int k = this.eII;
      j = i + 1;
      localObject3 = s.p((String)localObject3, k, localObject2[i]);
      if ((localObject3 != null) && (((Pair)localObject3).first == s.a.hJM) && (((Pair)localObject3).second != null))
      {
        localObject1 = (WxaPkgWrappingInfo)((Pair)localObject3).second;
        GMTrace.o(17846125985792L, 132964);
        return (WxaPkgWrappingInfo)localObject1;
        if (s.a.hJM.equals(((Pair)localObject1).first)) {
          break;
        }
        w.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "WxaPkgIntegrityChecker.checkPkg  appid %s, pkgType %d,pkgVersion %d return %d", new Object[] { this.appId, Integer.valueOf(this.eII), Integer.valueOf(this.hKC), Integer.valueOf(((s.a)((Pair)localObject1).first).SU()) });
        break;
      }
      if (j >= localObject2.length)
      {
        label980:
        a((s.a)((Pair)localObject1).first);
        GMTrace.o(17846125985792L, 132964);
        return null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\launching\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */