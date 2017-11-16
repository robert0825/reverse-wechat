package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.plugin.appbrand.app.e;
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
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.protocal.c.afx;
import com.tencent.mm.protocal.c.buu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import junit.framework.Assert;

public class n
  extends l<WxaPkgWrappingInfo>
{
  final String appId;
  public int hKC;
  public String hUz;
  final int hZb;
  final int iqd;
  private WxaPkgWrappingInfo iqt;
  
  n(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20675838345216L, 154047);
    this.appId = paramString;
    this.hZb = paramInt1;
    this.hKC = paramInt2;
    this.iqd = paramInt3;
    this.hUz = null;
    GMTrace.o(20675838345216L, 154047);
  }
  
  private WxaPkgWrappingInfo Vi()
  {
    GMTrace.i(17667884843008L, 131636);
    Pair localPair = s.p(this.appId, this.hZb, this.hKC);
    Object localObject1;
    if (localPair.second != null)
    {
      localObject1 = (WxaPkgWrappingInfo)localPair.second;
      GMTrace.o(17667884843008L, 131636);
      return (WxaPkgWrappingInfo)localObject1;
    }
    if (s.a.hJQ.equals(localPair.first))
    {
      if (this.hZb == 0)
      {
        this.iqt = ol(this.appId);
        try
        {
          localObject1 = e.Sl().a(this.appId, 0, new String[] { "version", "versionMd5", "versionState" });
          if (localObject1 == null) {
            throw new n.a.a().c(com.tencent.mm.plugin.appbrand.o.d.e(o.i.hGn, new Object[] { com.tencent.mm.plugin.appbrand.appcache.a.hW(this.hZb) }), new Object[0]).f("get NULL record with md5", new Object[0]).Ys();
          }
        }
        catch (a locala)
        {
          w.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "release_pkg APP_BROKEN obtain appId %s, message %s", new Object[] { this.appId, locala.getMessage() });
          Object localObject3 = ol(this.appId);
          if (localObject3 != null)
          {
            GMTrace.o(17667884843008L, 131636);
            return (WxaPkgWrappingInfo)localObject3;
            long l1 = bg.Pv();
            int j = locala.field_version;
            int i;
            if (this.iqt == null)
            {
              i = 0;
              localObject3 = c.c(new b(this.appId, locala.field_version, locala.field_versionMd5, 0, i).fUa);
              if ((localObject3 != null) && (((a.a)localObject3).errType == 0) && (((a.a)localObject3).errCode == 0)) {
                break label451;
              }
              localObject4 = new n.a.a();
              if (localObject3 != null) {
                break label394;
              }
              localObject2 = null;
              label312:
              localObject2 = ((n.a.a)localObject4).f("fail get download url, resp %s", new Object[] { localObject2 });
              k = o.i.hGj;
              if (localObject3 != null) {
                break label433;
              }
              i = -1;
              label341:
              if (localObject3 != null) {
                break label442;
              }
            }
            label394:
            label433:
            label442:
            for (j = -1;; j = ((a.a)localObject3).errCode)
            {
              throw ((n.a.a)localObject2).c(m.e(k, new Object[] { Integer.valueOf(i), Integer.valueOf(j) }), new Object[0]).Ys();
              i = this.iqt.hKC;
              break;
              localObject2 = String.format(Locale.US, "(%d, %d)", new Object[] { Integer.valueOf(((a.a)localObject3).errType), Integer.valueOf(((a.a)localObject3).errCode) });
              break label312;
              i = ((a.a)localObject3).errType;
              break label341;
            }
            label451:
            long l2 = bg.Pv();
            h.a(h.a.iqp, this.appId, j, this.hZb, this.iqd, l2 - l1);
            if (bg.nm(((afx)((a.a)localObject3).eWz).url)) {
              throw new n.a.a().f("CgiGetDownloadURL return EMPTY url, ret = %d", new Object[] { Integer.valueOf(((afx)((a.a)localObject3).eWz).ret) }).Ys();
            }
            Object localObject4 = new buu();
            String str = ((afx)((a.a)localObject3).eWz).url;
            this.hUz = str;
            ((buu)localObject4).vdn = str;
            int k = ((t)localObject2).field_version;
            this.hKC = k;
            ((buu)localObject4).tVE = k;
            ((buu)localObject4).vdl = ((t)localObject2).field_versionState;
            ((buu)localObject4).vdm = ((t)localObject2).field_versionMd5;
            e.Sl().a(this.appId, (buu)localObject4, 0);
            localObject2 = b(new c(i, j, (afx)((a.a)localObject3).eWz));
            if (localObject2 != null)
            {
              GMTrace.o(17667884843008L, 131636);
              return (WxaPkgWrappingInfo)localObject2;
            }
            throw new n.a.a().f("Download Fail", new Object[0]).Ys();
          }
          if (bg.nm(((a)localObject2).iqu)) {
            break label740;
          }
        }
        m.rb(((a)localObject2).iqu);
        GMTrace.o(17667884843008L, 131636);
        return null;
      }
      Object localObject2 = b(new d());
      if (localObject2 != null)
      {
        GMTrace.o(17667884843008L, 131636);
        return (WxaPkgWrappingInfo)localObject2;
      }
    }
    label740:
    a((s.a)localPair.first);
    GMTrace.o(17667884843008L, 131636);
    return null;
  }
  
  private WxaPkgWrappingInfo b(Callable<WxaPkgWrappingInfo> paramCallable)
  {
    GMTrace.i(19678332190720L, 146615);
    if (paramCallable == this)
    {
      Assert.assertTrue("Why the hell you pass 'this' to this method", false);
      GMTrace.o(19678332190720L, 146615);
      return null;
    }
    Yl();
    try
    {
      paramCallable = (WxaPkgWrappingInfo)paramCallable.call();
      Yo();
      GMTrace.o(19678332190720L, 146615);
      return paramCallable;
    }
    catch (Exception paramCallable)
    {
      for (;;)
      {
        paramCallable = null;
      }
    }
  }
  
  static WxaPkgWrappingInfo ol(String paramString)
  {
    int i = 1;
    GMTrace.i(17668019060736L, 131637);
    int[] arrayOfInt = e.Sl().os(paramString);
    if ((arrayOfInt != null) && (arrayOfInt.length > 1)) {}
    for (;;)
    {
      int j = i + 1;
      Pair localPair = s.p(paramString, 0, arrayOfInt[i]);
      if ((localPair != null) && (localPair.first == s.a.hJM) && (localPair.second != null))
      {
        paramString = (WxaPkgWrappingInfo)localPair.second;
        GMTrace.o(17668019060736L, 131637);
        return paramString;
      }
      if (j >= arrayOfInt.length)
      {
        GMTrace.o(17668019060736L, 131637);
        return null;
      }
      i = j;
    }
  }
  
  void Yl()
  {
    GMTrace.i(10149007720448L, 75616);
    GMTrace.o(10149007720448L, 75616);
  }
  
  void Yo()
  {
    GMTrace.i(17328716644352L, 129109);
    GMTrace.o(17328716644352L, 129109);
  }
  
  public final void a(s.a parama)
  {
    GMTrace.i(10149276155904L, 75618);
    if (s.a.hJN.equals(parama))
    {
      if (this.hZb == 1) {}
      for (parama = com.tencent.mm.plugin.appbrand.o.d.e(o.i.hFv, new Object[0]);; parama = com.tencent.mm.plugin.appbrand.o.d.e(o.i.hGn, new Object[] { com.tencent.mm.plugin.appbrand.appcache.a.hW(this.hZb) }))
      {
        if (this.hZb == 1)
        {
          com.tencent.mm.plugin.appbrand.task.d.as(this.appId, this.hZb);
          com.tencent.mm.plugin.appbrand.report.a.x(this.appId, 10, this.hZb + 1);
        }
        m.rb(parama);
        GMTrace.o(10149276155904L, 75618);
        return;
      }
    }
    if ((s.a.hJP.equals(parama)) || (s.a.hJO.equals(parama)))
    {
      if (this.hZb != 0) {}
      for (int i = o.i.hFv;; i = o.i.hFx)
      {
        m.iU(i);
        if (this.hZb == 1) {
          com.tencent.mm.plugin.appbrand.report.a.x(this.appId, 10, this.hZb + 1);
        }
        com.tencent.mm.plugin.appbrand.task.d.as(this.appId, this.hZb);
        GMTrace.o(10149276155904L, 75618);
        return;
      }
    }
    m.rb(com.tencent.mm.plugin.appbrand.o.d.e(o.i.hGl, new Object[] { Integer.valueOf(1), Integer.valueOf(parama.SU()) }));
    GMTrace.o(10149276155904L, 75618);
  }
  
  final String getTag()
  {
    GMTrace.i(17328850862080L, 129110);
    GMTrace.o(17328850862080L, 129110);
    return "MicroMsg.AppBrand.PrepareStepCheckAppPkg";
  }
  
  private static final class a
    extends Error
  {
    final String iqu;
    
    a(String paramString1, String paramString2)
    {
      super();
      GMTrace.i(17669092802560L, 131645);
      this.iqu = paramString2;
      GMTrace.o(17669092802560L, 131645);
    }
    
    static final class a
    {
      String iqu;
      String iqv;
      
      a()
      {
        GMTrace.i(17668287496192L, 131639);
        GMTrace.o(17668287496192L, 131639);
      }
      
      final n.a Ys()
      {
        GMTrace.i(17668690149376L, 131642);
        n.a locala = new n.a(this.iqv, this.iqu);
        GMTrace.o(17668690149376L, 131642);
        return locala;
      }
      
      final a c(String paramString, Object... paramVarArgs)
      {
        GMTrace.i(17668421713920L, 131640);
        this.iqu = String.format(Locale.US, paramString, paramVarArgs);
        GMTrace.o(17668421713920L, 131640);
        return this;
      }
      
      final a f(String paramString, Object... paramVarArgs)
      {
        GMTrace.i(17668555931648L, 131641);
        this.iqv = String.format(Locale.US, paramString, paramVarArgs);
        GMTrace.o(17668555931648L, 131641);
        return this;
      }
    }
  }
  
  private abstract class b
    implements y.a
  {
    public b()
    {
      GMTrace.i(19676721577984L, 146603);
      GMTrace.o(19676721577984L, 146603);
    }
    
    abstract String Yt();
    
    public final void a(String paramString, y.a.b paramb, y.a.a parama)
    {
      GMTrace.i(19676855795712L, 146604);
      w.i("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "[%s] onPkgUpdatingCallback, appId = %s, return = %s", new Object[] { Yt(), paramString, paramb.name() });
      if (y.a.b.hKt.equals(paramb))
      {
        paramString = WxaPkgWrappingInfo.ou(parama.filePath);
        if (paramString == null) {
          w.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "[%s] onPkgUpdatingCallback, ret=OK but obtain null appPkgInfo");
        }
        for (;;)
        {
          b(paramString);
          GMTrace.o(19676855795712L, 146604);
          return;
          paramString.hKC = parama.version;
          paramString.hKD = com.tencent.mm.plugin.appbrand.o.d.abz();
          paramString.hKB = parama.hKs;
        }
      }
      if (y.a.b.hKy.equals(paramb))
      {
        m.iU(o.i.hGo);
        com.tencent.mm.plugin.appbrand.report.a.x(paramString, 23, n.this.hZb + 1);
      }
      for (;;)
      {
        b(null);
        GMTrace.o(19676855795712L, 146604);
        return;
        m.rb(com.tencent.mm.plugin.appbrand.o.d.e(o.i.hGl, new Object[] { Integer.valueOf(2), Integer.valueOf(paramb.code) }));
      }
    }
    
    abstract void b(WxaPkgWrappingInfo paramWxaPkgWrappingInfo);
  }
  
  private final class c
    implements Callable<WxaPkgWrappingInfo>
  {
    public final int iqx;
    public final int iqy;
    private final afx iqz;
    
    public c(int paramInt1, int paramInt2, afx paramafx)
    {
      GMTrace.i(19678466408448L, 146616);
      this.iqx = paramInt1;
      this.iqy = paramInt2;
      this.iqz = paramafx;
      GMTrace.o(19678466408448L, 146616);
    }
    
    private WxaPkgWrappingInfo Yu()
    {
      GMTrace.i(19678600626176L, 146617);
      final CountDownLatch localCountDownLatch = new CountDownLatch(1);
      final Object localObject = new com.tencent.mm.plugin.appbrand.n.d();
      n.b local1 = new n.b((com.tencent.mm.plugin.appbrand.n.d)localObject)
      {
        final String Yt()
        {
          GMTrace.i(19677526884352L, 146609);
          String str = String.format(Locale.US, "Incremental %d|%d", new Object[] { Integer.valueOf(n.c.this.iqx), Integer.valueOf(n.c.this.iqy) });
          GMTrace.o(19677526884352L, 146609);
          return str;
        }
        
        final void b(WxaPkgWrappingInfo paramAnonymousWxaPkgWrappingInfo)
        {
          GMTrace.i(19677661102080L, 146610);
          localObject.iGp = paramAnonymousWxaPkgWrappingInfo;
          localCountDownLatch.countDown();
          GMTrace.o(19677661102080L, 146610);
        }
      };
      if (!y.a(new com.tencent.mm.plugin.appbrand.appcache.n(n.this.appId, this.iqx, this.iqy, this.iqz.eLy, local1), local1))
      {
        GMTrace.o(19678600626176L, 146617);
        return null;
      }
      try
      {
        localCountDownLatch.await();
        localObject = (WxaPkgWrappingInfo)((com.tencent.mm.plugin.appbrand.n.d)localObject).iGp;
        GMTrace.o(19678600626176L, 146617);
        return (WxaPkgWrappingInfo)localObject;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckAppPkg", localInterruptedException, "downloadIncremental semaphore exp ", new Object[0]);
        }
      }
    }
  }
  
  private final class d
    implements Callable<WxaPkgWrappingInfo>
  {
    public d()
    {
      GMTrace.i(19676318924800L, 146600);
      GMTrace.o(19676318924800L, 146600);
    }
    
    public final WxaPkgWrappingInfo Vi()
    {
      GMTrace.i(19676453142528L, 146601);
      final CountDownLatch localCountDownLatch = new CountDownLatch(1);
      final Object localObject = new com.tencent.mm.plugin.appbrand.n.d();
      n.b local1 = new n.b((com.tencent.mm.plugin.appbrand.n.d)localObject)
      {
        final String Yt()
        {
          GMTrace.i(19677929537536L, 146612);
          String str = String.format(Locale.US, "NonIncremental %d", new Object[] { Integer.valueOf(n.this.hKC) });
          GMTrace.o(19677929537536L, 146612);
          return str;
        }
        
        final void b(WxaPkgWrappingInfo paramAnonymousWxaPkgWrappingInfo)
        {
          GMTrace.i(19678063755264L, 146613);
          localObject.iGp = paramAnonymousWxaPkgWrappingInfo;
          localCountDownLatch.countDown();
          GMTrace.o(19678063755264L, 146613);
        }
      };
      w.i("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, not incremental before start appId(%s), type(%d), pkgVersion(%d)", new Object[] { n.this.appId, Integer.valueOf(n.this.hZb), Integer.valueOf(n.this.hKC) });
      if (n.this.hZb != 0)
      {
        n.this.hUz = e.Sl().W(n.this.appId, n.this.hZb);
        if (bg.nm(n.this.hUz))
        {
          w.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, get EMPTY url appId(%s), type(%d)", new Object[] { n.this.appId, Integer.valueOf(n.this.hZb) });
          n.this.a(s.a.hJN);
          GMTrace.o(19676453142528L, 146601);
          return null;
        }
      }
      if (!y.a(n.this.appId, n.this.hZb, n.this.hKC, n.this.hUz, local1))
      {
        w.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, not incremental FATAL ERROR appId(%s), type(%d), pkgVersion(%d)", new Object[] { n.this.appId, Integer.valueOf(n.this.hZb), Integer.valueOf(n.this.hKC) });
        n.this.a(s.a.hJR);
        GMTrace.o(19676453142528L, 146601);
        return null;
      }
      try
      {
        localCountDownLatch.await();
        localObject = (WxaPkgWrappingInfo)((com.tencent.mm.plugin.appbrand.n.d)localObject).iGp;
        GMTrace.o(19676453142528L, 146601);
        return (WxaPkgWrappingInfo)localObject;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckAppPkg", localException, "downloadNonIncremental semaphore exp ", new Object[0]);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */