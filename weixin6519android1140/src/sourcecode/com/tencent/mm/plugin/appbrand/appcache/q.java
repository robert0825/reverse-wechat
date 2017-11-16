package com.tencent.mm.plugin.appbrand.appcache;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.v;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.pluginsdk.j.a.d.f.d;
import com.tencent.mm.pluginsdk.j.a.d.j;
import com.tencent.mm.pluginsdk.j.a.d.k;
import com.tencent.mm.pluginsdk.j.a.d.l;
import com.tencent.mm.pluginsdk.j.a.d.m;
import com.tencent.mm.pluginsdk.j.a.d.m.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.e;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;

final class q
{
  final c hJu;
  
  q()
  {
    GMTrace.i(10599710851072L, 78974);
    this.hJu = new c();
    GMTrace.o(10599710851072L, 78974);
  }
  
  static String SK()
  {
    GMTrace.i(10599845068800L, 78975);
    String str2 = com.tencent.mm.kernel.h.xy().cachePath;
    String str1 = str2;
    if (!str2.endsWith("/")) {
      str1 = str2 + "/";
    }
    str1 = str1 + "appbrand/pkg/";
    com.tencent.mm.sdk.platformtools.h.Nj(str1);
    GMTrace.o(10599845068800L, 78975);
    return str1;
  }
  
  final int b(r paramr)
  {
    GMTrace.i(19996965076992L, 148989);
    if (this.hJu.OM(paramr.tpD))
    {
      w.i("MicroMsg.AppBrandWxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s already in queue", new Object[] { paramr.tpD });
      GMTrace.o(19996965076992L, 148989);
      return 0;
    }
    int i = this.hJu.b(paramr);
    w.i("MicroMsg.AppBrandWxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s, addResult %d", new Object[] { paramr.tpD, Integer.valueOf(i) });
    GMTrace.o(19996965076992L, 148989);
    return i;
  }
  
  private static final class a
  {
    public a()
    {
      GMTrace.i(15542547120128L, 115801);
      GMTrace.o(15542547120128L, 115801);
    }
    
    public final l a(q.d paramd)
    {
      GMTrace.i(15542681337856L, 115802);
      str = paramd.bJY();
      try
      {
        final CountDownLatch localCountDownLatch = new CountDownLatch(1);
        final com.tencent.mm.plugin.appbrand.n.d locald = new com.tencent.mm.plugin.appbrand.n.d();
        final Object localObject2 = paramd.SL();
        final Object localObject3 = ((k)localObject2).tpD;
        final Object localObject1 = paramd.hJG;
        localObject1 = new aj(Looper.getMainLooper(), new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(20782004568064L, 154838);
            com.tencent.mm.modelcdntran.g.Gk().jz(localObject3);
            localObject1.Su();
            com.tencent.mm.loader.stub.b.deleteFile(localObject2.getFilePath());
            locald.iGp = null;
            localCountDownLatch.countDown();
            GMTrace.o(20782004568064L, 154838);
            return false;
          }
        }, false);
        a local2 = new a(paramd)
        {
          final void b(l paramAnonymousl)
          {
            GMTrace.i(20781736132608L, 154836);
            localObject1.stopTimer();
            locald.iGp = paramAnonymousl;
            localCountDownLatch.countDown();
            GMTrace.o(20781736132608L, 154836);
          }
        };
        paramd = new i();
        paramd.field_mediaId = ((String)localObject3);
        paramd.field_fullpath = ((r)localObject2).getFilePath();
        paramd.gAD = ((k)localObject2).url;
        paramd.eYr = false;
        paramd.gAB = local2;
        paramd.gAC = true;
        paramd.gAE = 15;
        paramd.gAF = 30;
        localObject2 = Uri.parse(paramd.gAD).getHost();
        if (!bg.nm((String)localObject2)) {
          localObject3 = new ArrayList();
        }
        try
        {
          com.tencent.mm.kernel.h.xx().fYr.gus.getHostByName((String)localObject2, (List)localObject3);
          paramd.gAG = new String[((ArrayList)localObject3).size()];
          ((ArrayList)localObject3).toArray(paramd.gAG);
          com.tencent.mm.modelcdntran.g.Gk().b(paramd, -1);
          long l = TimeUnit.SECONDS.toMillis(20L);
          ((aj)localObject1).z(l, l);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            try
            {
              localCountDownLatch.await();
              paramd = (l)locald.iGp;
              GMTrace.o(15542681337856L, 115802);
              return paramd;
            }
            catch (Exception paramd)
            {
              w.e("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "cdn https perform, urlKey %s semaphore await e = %s", new Object[] { str, paramd });
              GMTrace.o(15542681337856L, 115802);
            }
            localException = localException;
            w.e("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "cdn https getHostByName e = %s", new Object[] { localException });
          }
        }
        return null;
      }
      catch (Exception paramd)
      {
        w.e("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "cdn https perform urlKey %s exp %s", new Object[] { str, paramd });
        GMTrace.o(15542681337856L, 115802);
        return null;
      }
    }
    
    static abstract class a
      implements i.a
    {
      private final q.d hJC;
      
      a(q.d paramd)
      {
        GMTrace.i(16161290846208L, 120411);
        this.hJC = paramd;
        GMTrace.o(16161290846208L, 120411);
      }
      
      public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult, boolean paramBoolean)
      {
        GMTrace.i(15541741813760L, 115795);
        if (paramInt != 0)
        {
          b(new l(this.hJC, new SSLException(String.format(Locale.US, "CdnHttpsAddTaskFailed$%s$%d", new Object[] { this.hJC.bJY(), Integer.valueOf(paramInt) })), 3));
          w.e("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "urlKey %s, startRet %d", new Object[] { this.hJC.bJY(), Integer.valueOf(paramInt) });
          GMTrace.o(15541741813760L, 115795);
          return 0;
        }
        if (paramkeep_ProgressInfo != null)
        {
          GMTrace.o(15541741813760L, 115795);
          return 0;
        }
        if (paramkeep_SceneResult != null)
        {
          w.i("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "urlKey %s, retCode %d", new Object[] { this.hJC.bJY(), Integer.valueOf(paramkeep_SceneResult.field_retCode) });
          if (paramkeep_SceneResult.field_retCode == 0) {
            break label227;
          }
          b(new l(this.hJC, new SSLException(String.format(Locale.US, "CdnHttpsDownloadFailed$%s$%d", new Object[] { this.hJC.bJY(), Integer.valueOf(paramkeep_SceneResult.field_retCode) })), 3));
        }
        for (;;)
        {
          GMTrace.o(15541741813760L, 115795);
          return 0;
          label227:
          b(new l(this.hJC, -1L, null));
          paramInt = com.tencent.mm.a.e.aY(this.hJC.SL().getFilePath());
          if (ak.a.gmY != null) {
            ak.a.gmY.aI(paramInt, 0);
          }
        }
      }
      
      public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
      {
        GMTrace.i(15541876031488L, 115796);
        GMTrace.o(15541876031488L, 115796);
      }
      
      abstract void b(l paraml);
      
      public final byte[] h(String paramString, byte[] paramArrayOfByte)
      {
        GMTrace.i(15542010249216L, 115797);
        GMTrace.o(15542010249216L, 115797);
        return new byte[0];
      }
    }
  }
  
  @SuppressLint({"DefaultLocale"})
  public static class b
    extends r
  {
    b(String paramString1, String paramString2, int paramInt)
    {
      super(str2 + String.format("debug_%d_%d_%d.wxapkg", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt), Integer.valueOf(paramString2.hashCode()) }), paramString2, paramString1, String.format("%d-%s", new Object[] { Integer.valueOf(paramInt), paramString2 }).hashCode(), paramInt);
      GMTrace.i(10620648816640L, 79130);
      GMTrace.o(10620648816640L, 79130);
    }
  }
  
  private final class c
    extends m
  {
    c()
    {
      super(new q.e(q.this));
      GMTrace.i(10602932076544L, 78998);
      GMTrace.o(10602932076544L, 78998);
    }
    
    protected final f.d a(k paramk)
    {
      GMTrace.i(10603066294272L, 78999);
      paramk = new q.d((r)paramk);
      paramk.trt = this.trq;
      GMTrace.o(10603066294272L, 78999);
      return paramk;
    }
    
    protected final int b(k paramk)
    {
      GMTrace.i(10603200512000L, 79000);
      int i = super.b(paramk);
      if (i == 1)
      {
        super.b(paramk);
        GMTrace.o(10603200512000L, 79000);
        return 2;
      }
      GMTrace.o(10603200512000L, 79000);
      return i;
    }
    
    public final void shutdown()
    {
      GMTrace.i(17654328852480L, 131535);
      super.shutdown();
      ((q.e)this.trq).hJH.getLooper().quit();
      GMTrace.o(17654328852480L, 131535);
    }
  }
  
  private static final class d
    extends m.a<r>
  {
    private static final ThreadLocal<q.a> hJE;
    private String hJF;
    final g.a hJG;
    
    static
    {
      GMTrace.i(15541473378304L, 115793);
      hJE = new ThreadLocal() {};
      GMTrace.o(15541473378304L, 115793);
    }
    
    d(r paramr)
    {
      super();
      GMTrace.i(19998173036544L, 148998);
      this.hJF = null;
      g.a locala = g.a(paramr);
      paramr = locala;
      if (locala == null) {
        paramr = d.hIA;
      }
      this.hJG = paramr;
      GMTrace.o(19998173036544L, 148998);
    }
    
    protected final r SL()
    {
      GMTrace.i(19998307254272L, 148999);
      r localr = (r)super.ST();
      GMTrace.o(19998307254272L, 148999);
      return localr;
    }
    
    public final String SM()
    {
      GMTrace.i(10601589899264L, 78988);
      GMTrace.o(10601589899264L, 78988);
      return "AppBrandWxaPkgDownloader";
    }
    
    public final boolean SN()
    {
      GMTrace.i(10601724116992L, 78989);
      GMTrace.o(10601724116992L, 78989);
      return true;
    }
    
    public final boolean SO()
    {
      GMTrace.i(10601858334720L, 78990);
      GMTrace.o(10601858334720L, 78990);
      return false;
    }
    
    public final boolean SP()
    {
      GMTrace.i(10601992552448L, 78991);
      GMTrace.o(10601992552448L, 78991);
      return true;
    }
    
    protected final boolean SQ()
    {
      GMTrace.i(10602126770176L, 78992);
      GMTrace.o(10602126770176L, 78992);
      return false;
    }
    
    public final boolean SR()
    {
      GMTrace.i(10602260987904L, 78993);
      GMTrace.o(10602260987904L, 78993);
      return false;
    }
    
    public final boolean SS()
    {
      GMTrace.i(10602395205632L, 78994);
      switch (v.tq())
      {
      default: 
        GMTrace.o(10602395205632L, 78994);
        return false;
      case 0: 
        GMTrace.o(10602395205632L, 78994);
        return false;
      }
      boolean bool = super.SS();
      GMTrace.o(10602395205632L, 78994);
      return bool;
    }
    
    protected final l a(j paramj)
    {
      GMTrace.i(10601455681536L, 78987);
      r localr = (r)super.ST();
      com.tencent.mm.loader.stub.b.deleteFile(localr.getFilePath());
      this.hJF = localr.url;
      Object localObject = this.hJG;
      this.hJF.startsWith("https");
      ((g.a)localObject).St();
      if (this.hJF.startsWith("https"))
      {
        localObject = ((q.a)hJE.get()).a(this);
        if (((localObject != null) && (((l)localObject).status != 3)) || (!this.hJF.startsWith("https"))) {
          break label175;
        }
        this.hJG.Sv();
        if (!(localr instanceof q.b)) {
          break label193;
        }
      }
      label175:
      label193:
      for (int i = 0;; i = 1)
      {
        if (i != 0)
        {
          this.hJF = this.hJF.replaceFirst("https", "http");
          paramj = super.a(paramj);
        }
        for (;;)
        {
          this.hJG.a(paramj);
          GMTrace.o(10601455681536L, 78987);
          return paramj;
          localObject = null;
          break;
          if (localObject == null) {
            paramj = super.a(paramj);
          } else {
            paramj = (j)localObject;
          }
        }
      }
    }
    
    public final String getURL()
    {
      GMTrace.i(14345190768640L, 106880);
      String str = this.hJF;
      GMTrace.o(14345190768640L, 106880);
      return str;
    }
  }
  
  private final class e
    implements com.tencent.mm.pluginsdk.j.a.d.c
  {
    public final ae hJH;
    
    e()
    {
      GMTrace.i(10617696026624L, 79108);
      this.hJH = new ae(new af("WxaPkgDownloadPerformerEventDispatchThread").ngv.getLooper());
      GMTrace.o(10617696026624L, 79108);
    }
    
    public static void b(com.tencent.mm.pluginsdk.j.a.d.e parame, l paraml)
    {
      GMTrace.i(15064329355264L, 112238);
      e(parame, paraml);
      GMTrace.o(15064329355264L, 112238);
    }
    
    public static void c(com.tencent.mm.pluginsdk.j.a.d.e parame, l paraml)
    {
      GMTrace.i(15064463572992L, 112239);
      Object localObject1 = ((q.d)parame).SL();
      if ((localObject1 instanceof n))
      {
        paraml = (n)localObject1;
        parame = ((q.d)parame).hJG;
        localObject1 = ((a)com.tencent.mm.kernel.h.h(a.class)).RZ();
        if (localObject1 == null)
        {
          y.a(paraml.tpD, paraml.appId, y.a.b.hKz, null);
          GMTrace.o(15064463572992L, 112239);
          return;
        }
        Object localObject2 = paraml.appId;
        j = paraml.hJg;
        i = paraml.hJh;
        String str = n.U((String)localObject2, i);
        t localt = ((x)localObject1).a((String)localObject2, j, 0, new String[] { "pkgPath" });
        localObject2 = ((x)localObject1).a((String)localObject2, i, 0, new String[] { "versionMd5" });
        if ((localt == null) || (localObject2 == null))
        {
          y.a(paraml.tpD, paraml.appId, y.a.b.hKz, null);
          GMTrace.o(15064463572992L, 112239);
          return;
        }
        parame.Sw();
        long l1 = SystemClock.elapsedRealtime();
        j = e.u(localt.field_pkgPath, str, paraml.getFilePath());
        long l2 = SystemClock.elapsedRealtime();
        w.i("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "applyPkgPatch, appId[%s], oldPath[%s], newPath[%s], patchPath[%s], cost %d, ret %d", new Object[] { paraml.appId, localt.field_pkgPath, str, paraml.getFilePath(), Long.valueOf(l2 - l1), Integer.valueOf(j) });
        parame.hY(j);
        if (j == 0)
        {
          com.tencent.mm.loader.stub.b.deleteFile(paraml.getFilePath());
          y.a(paraml.tpD, paraml.appId, str, i, 0, parame);
          GMTrace.o(15064463572992L, 112239);
          return;
        }
        com.tencent.mm.loader.stub.b.deleteFile(str);
        parame = ((x)localObject1).a(paraml.appId, paraml.hJh, 0, new String[] { "downloadURL" });
        if (parame == null)
        {
          y.a(paraml.tpD, paraml.appId, y.a.b.hKz, null);
          GMTrace.o(15064463572992L, 112239);
          return;
        }
        y.ot(paraml.tpD);
        y.a(paraml.appId, 0, paraml.hJh, parame.field_downloadURL, paraml.hJi);
        GMTrace.o(15064463572992L, 112239);
        return;
      }
      localObject1 = ((q.d)parame).SL().appId;
      int i = ((q.d)parame).SL().version;
      int j = ((q.d)parame).SL().eII;
      try
      {
        y.a(paraml.tpD, (String)localObject1, paraml.filePath, i, j, ((q.d)parame).hJG);
        GMTrace.o(15064463572992L, 112239);
        return;
      }
      catch (Exception parame)
      {
        w.printErrStackTrace("MicroMsg.AppBrandWxaPkgDownloadPerformer", parame, "dispatchComplete", new Object[0]);
        y.aB(paraml.tpD, (String)localObject1);
        GMTrace.o(15064463572992L, 112239);
      }
    }
    
    public static void d(com.tencent.mm.pluginsdk.j.a.d.e parame, l paraml)
    {
      GMTrace.i(16162096152576L, 120417);
      e(parame, paraml);
      GMTrace.o(16162096152576L, 120417);
    }
    
    private static void e(com.tencent.mm.pluginsdk.j.a.d.e parame, l paraml)
    {
      GMTrace.i(14345324986368L, 106881);
      com.tencent.mm.loader.stub.b.deleteFile(paraml.filePath);
      String str = ((q.d)parame).SL().appId;
      switch (paraml.httpStatusCode)
      {
      }
      for (parame = y.a.b.hKu;; parame = y.a.b.hKy)
      {
        y.a(paraml.tpD, str, parame);
        GMTrace.o(14345324986368L, 106881);
        return;
      }
    }
    
    public final void a(final com.tencent.mm.pluginsdk.j.a.d.e parame, final l paraml)
    {
      GMTrace.i(10617830244352L, 79109);
      this.hJH.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10612058882048L, 79066);
          switch (paraml.status)
          {
          }
          for (;;)
          {
            GMTrace.o(10612058882048L, 79066);
            return;
            q.e.d(parame, paraml);
            GMTrace.o(10612058882048L, 79066);
            return;
            q.e.c(parame, paraml);
            GMTrace.o(10612058882048L, 79066);
            return;
            q.e.b(parame, paraml);
          }
        }
      });
      GMTrace.o(10617830244352L, 79109);
    }
    
    public final void n(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(10617964462080L, 79110);
      GMTrace.o(10617964462080L, 79110);
    }
    
    public final void o(String paramString, long paramLong)
    {
      GMTrace.i(10618098679808L, 79111);
      GMTrace.o(10618098679808L, 79111);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */