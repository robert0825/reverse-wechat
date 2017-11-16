package com.tencent.mm.plugin.ipcall.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.aw.j;
import com.tencent.mm.aw.m;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;

public final class d
  implements com.tencent.mm.ad.e
{
  private static d miC;
  private boolean gqR;
  com.tencent.mm.sdk.b.c miD;
  private int retryCount;
  
  static
  {
    GMTrace.i(11620034019328L, 86576);
    miC = null;
    GMTrace.o(11620034019328L, 86576);
  }
  
  private d()
  {
    GMTrace.i(11619228712960L, 86570);
    this.retryCount = 0;
    this.gqR = false;
    this.miD = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(ck paramAnonymousck)
      {
        GMTrace.i(11572923596800L, 86225);
        Object localObject;
        if ((paramAnonymousck instanceof ck))
        {
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "detect DynamicConfigUpdatedEvent");
          at.AR();
          int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vrS, Integer.valueOf(0))).intValue();
          int j = g.ut().getInt("WeChatOutCountryCodeRestrictionPackageID", 0);
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "oldConfig: %d, newConfig: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          if (i != j)
          {
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vrS, Integer.valueOf(j));
            com.tencent.mm.aw.t.Kj().gI(26);
            paramAnonymousck = c.aIa();
            localObject = com.tencent.mm.compatible.util.e.ghv + "ipcallCountryCodeConfig.cfg";
            w.d("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, path: %s", new Object[] { localObject });
          }
        }
        try
        {
          localObject = new File((String)localObject);
          if (((File)localObject).exists()) {
            ((File)localObject).delete();
          }
          paramAnonymousck.isInit = false;
          paramAnonymousck.miB.clear();
        }
        catch (Exception paramAnonymousck)
        {
          for (;;)
          {
            w.e("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, error: %s", new Object[] { paramAnonymousck.getMessage() });
          }
        }
        d.this.fh(true);
        GMTrace.o(11572923596800L, 86225);
        return false;
      }
    };
    GMTrace.o(11619228712960L, 86570);
  }
  
  public static d aIe()
  {
    GMTrace.i(11619362930688L, 86571);
    if (miC == null) {
      miC = new d();
    }
    d locald = miC;
    GMTrace.o(11619362930688L, 86571);
    return locald;
  }
  
  private static void aIf()
  {
    GMTrace.i(11619631366144L, 86573);
    Object localObject = com.tencent.mm.aw.t.Kj().gJ(26);
    if ((localObject != null) && (localObject.length > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = new com.tencent.mm.aw.k(bool);
      at.wS().a((com.tencent.mm.ad.k)localObject, 0);
      GMTrace.o(11619631366144L, 86573);
      return;
    }
  }
  
  private void aIg()
  {
    GMTrace.i(11619899801600L, 86575);
    this.gqR = false;
    this.retryCount = 0;
    long l = System.currentTimeMillis();
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vrT, Long.valueOf(l));
    GMTrace.o(11619899801600L, 86575);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11619765583872L, 86574);
    w.d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, errType: %d, errCode: %d, isUpdating: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.gqR) });
    if (!this.gqR)
    {
      GMTrace.o(11619765583872L, 86574);
      return;
    }
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramInt1 != 0)
    {
      bool1 = bool2;
      if (paramInt2 != 0) {
        bool1 = false;
      }
    }
    w.d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, isSuccess: %b", new Object[] { Boolean.valueOf(bool1) });
    if (paramk.getType() == 159)
    {
      if (bool1)
      {
        w.d("MicroMsg.IPCallCoutryConfigUpdater", "get package list success, start download");
        paramString = com.tencent.mm.aw.t.Kj().gJ(26);
        if ((paramString == null) || (paramString.length == 0))
        {
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "do not exist package info");
          aIg();
          GMTrace.o(11619765583872L, 86574);
          return;
        }
        w.d("MicroMsg.IPCallCoutryConfigUpdater", "infos.length: %d", new Object[] { Integer.valueOf(paramString.length) });
        paramString = paramString[0];
        w.d("MicroMsg.IPCallCoutryConfigUpdater", "stored info type: %d, id: %d, version: %d, status: %d, name: %s", new Object[] { Integer.valueOf(paramString.eII), Integer.valueOf(paramString.id), Integer.valueOf(paramString.version), Integer.valueOf(paramString.status), paramString.Ke() });
        if (paramString.status == 3)
        {
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "downloading this package, ignore");
          GMTrace.o(11619765583872L, 86574);
          return;
        }
        if (paramString.status != 5)
        {
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "already download this package");
          c.aIa().fg(true);
          aIg();
          GMTrace.o(11619765583872L, 86574);
          return;
        }
        paramString = new j(paramString.id, 26);
        at.wS().a(paramString, 0);
        GMTrace.o(11619765583872L, 86574);
        return;
      }
      if (this.retryCount < 3)
      {
        this.retryCount += 1;
        aIf();
        w.d("MicroMsg.IPCallCoutryConfigUpdater", "retry get package list, retryCount: %d", new Object[] { Integer.valueOf(this.retryCount) });
        GMTrace.o(11619765583872L, 86574);
        return;
      }
      w.e("MicroMsg.IPCallCoutryConfigUpdater", "reach retry limit");
      GMTrace.o(11619765583872L, 86574);
      return;
    }
    if ((paramk.getType() == 160) && (bool1))
    {
      w.d("MicroMsg.IPCallCoutryConfigUpdater", "download package success");
      c.aIa().fg(true);
      aIg();
    }
    GMTrace.o(11619765583872L, 86574);
  }
  
  public final void fh(boolean paramBoolean)
  {
    GMTrace.i(11619497148416L, 86572);
    if (!at.AU())
    {
      w.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, acc not ready");
      GMTrace.o(11619497148416L, 86572);
      return;
    }
    if (this.gqR)
    {
      w.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate updating");
      GMTrace.o(11619497148416L, 86572);
      return;
    }
    w.d("MicroMsg.IPCallCoutryConfigUpdater", "tryupdate, isForce: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      at.AR();
      long l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vrT, Long.valueOf(0L))).longValue();
      long l2 = System.currentTimeMillis();
      if ((l1 != 0L) && (Math.abs(l2 - l1) < 86400000L))
      {
        w.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, not reach the update time limit");
        GMTrace.o(11619497148416L, 86572);
        return;
      }
    }
    w.i("MicroMsg.IPCallCoutryConfigUpdater", "try update now");
    this.gqR = true;
    at.wS().a(159, this);
    at.wS().a(160, this);
    aIf();
    GMTrace.o(11619497148416L, 86572);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */