package com.tencent.mm.plugin.appbrand.appcache;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.pluginsdk.j.a.d.l;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class f
  implements g.b
{
  public f()
  {
    GMTrace.i(19689606479872L, 146699);
    GMTrace.o(19689606479872L, 146699);
  }
  
  public final g.a a(r paramr)
  {
    GMTrace.i(19689740697600L, 146700);
    if ((r.class == paramr.getClass()) || (q.b.class == paramr.getClass()) || (n.class == paramr.getClass()))
    {
      paramr = new a(paramr);
      GMTrace.o(19689740697600L, 146700);
      return paramr;
    }
    GMTrace.o(19689740697600L, 146700);
    return null;
  }
  
  private static final class a
    implements g.a
  {
    private final r hIC;
    private a hID;
    private ArrayList<IDKey> hIE;
    private long hIF;
    private long hIG;
    private long hIH;
    
    public a(r paramr)
    {
      GMTrace.i(19686653689856L, 146677);
      this.hIF = 0L;
      this.hIG = 0L;
      this.hIH = 0L;
      this.hIC = paramr;
      GMTrace.o(19686653689856L, 146677);
    }
    
    private void Sz()
    {
      GMTrace.i(19687056343040L, 146680);
      try
      {
        d.oqe.b(this.hIE, false);
        this.hIE.clear();
        GMTrace.o(19687056343040L, 146680);
        return;
      }
      catch (Exception localException)
      {
        GMTrace.o(19687056343040L, 146680);
      }
    }
    
    private void bk(int paramInt1, int paramInt2)
    {
      GMTrace.i(19686922125312L, 146679);
      if (this.hIE == null) {
        this.hIE = new ArrayList();
      }
      this.hIE.add(new IDKey(paramInt1, paramInt2, 1));
      GMTrace.o(19686922125312L, 146679);
    }
    
    private void hZ(int paramInt)
    {
      GMTrace.i(19686787907584L, 146678);
      bk(368, paramInt);
      GMTrace.o(19686787907584L, 146678);
    }
    
    public final void St()
    {
      GMTrace.i(19687190560768L, 146681);
      int i;
      if ("@LibraryAppId".equals(this.hIC.appId))
      {
        this.hID = a.hIK;
        switch (f.1.hIB[this.hID.ordinal()])
        {
        default: 
          i = 0;
        }
      }
      for (;;)
      {
        hZ(i);
        this.hIF = SystemClock.elapsedRealtime();
        GMTrace.o(19687190560768L, 146681);
        return;
        if (c.a.hX(this.hIC.eII))
        {
          if (e.Sl() == null)
          {
            i = 1;
            label116:
            if (i <= 1) {
              break label157;
            }
          }
          label157:
          for (a locala = a.hIJ;; locala = a.hII)
          {
            this.hID = locala;
            break;
            i = e.Sl().V(this.hIC.appId, this.hIC.eII);
            break label116;
          }
        }
        if ((this.hIC instanceof n))
        {
          this.hID = a.hIL;
          break;
        }
        this.hID = a.hII;
        break;
        i = 1;
        continue;
        i = 10;
        continue;
        i = 20;
        continue;
        i = 35;
      }
    }
    
    public final void Su()
    {
      GMTrace.i(20684294062080L, 154110);
      hZ(32);
      GMTrace.o(20684294062080L, 154110);
    }
    
    public final void Sv()
    {
      GMTrace.i(19687324778496L, 146682);
      switch (f.1.hIB[this.hID.ordinal()])
      {
      }
      for (int i = 31;; i = 30)
      {
        hZ(i);
        GMTrace.o(19687324778496L, 146682);
        return;
      }
    }
    
    public final void Sw()
    {
      GMTrace.i(19687593213952L, 146684);
      this.hIH = SystemClock.elapsedRealtime();
      bk(697, 1);
      GMTrace.o(19687593213952L, 146684);
    }
    
    public final void Sx()
    {
      GMTrace.i(19687861649408L, 146686);
      if (a.hIK != this.hID) {
        a.x(this.hIC.appId, 20, this.hIC.eII + 1);
      }
      GMTrace.o(19687861649408L, 146686);
    }
    
    public final void Sy()
    {
      GMTrace.i(19687995867136L, 146687);
      this.hIG = SystemClock.elapsedRealtime();
      switch (f.1.hIB[this.hID.ordinal()])
      {
      }
      for (;;)
      {
        GMTrace.o(19687995867136L, 146687);
        return;
        hZ(5);
        GMTrace.o(19687995867136L, 146687);
        return;
        hZ(14);
        GMTrace.o(19687995867136L, 146687);
        return;
        hZ(24);
        GMTrace.o(19687995867136L, 146687);
        return;
        hZ(41);
      }
    }
    
    public final void a(l paraml)
    {
      int k = 2;
      GMTrace.i(19687458996224L, 146683);
      long l = SystemClock.elapsedRealtime() - this.hIF;
      int i;
      if ((paraml != null) && (paraml.status == 2)) {
        i = 1;
      }
      for (;;)
      {
        switch (f.1.hIB[this.hID.ordinal()])
        {
        default: 
          if ((i == 0) && (!"@LibraryAppId".equals(this.hIC.appId)) && (999 != this.hIC.eII))
          {
            if ((paraml != null) && ((paraml.httpStatusCode == 404) || (paraml.httpStatusCode == 403)))
            {
              i = 23;
              label135:
              a.x(this.hIC.appId, i, this.hIC.eII + 1);
            }
          }
          else {
            if (paraml == null) {
              break label314;
            }
          }
          break;
        }
        try
        {
          if (paraml.status == 2)
          {
            i = 1;
            label169:
            if (a.hIK != this.hID) {
              break label337;
            }
          }
          label314:
          label337:
          for (paraml = "";; paraml = this.hIC.appId)
          {
            a.a(paraml, this.hID.value, i, l);
            AppBrandPerformanceManager.p(this.hIC.appId, l);
            Sz();
            GMTrace.o(19687458996224L, 146683);
            return;
            i = 0;
            break;
            if (i != 0) {}
            for (int j = 2;; j = 3)
            {
              hZ(j);
              break;
            }
            if (i != 0) {}
            for (j = 11;; j = 12)
            {
              hZ(j);
              break;
            }
            if (i != 0) {}
            for (j = 21;; j = 22)
            {
              hZ(j);
              break;
            }
            if (i != 0) {}
            for (j = 36;; j = 37)
            {
              hZ(j);
              break;
            }
            i = 19;
            break label135;
            i = k;
            if (paraml == null) {
              break label169;
            }
            i = k;
            if (paraml.status != 4) {
              break label169;
            }
            i = 3;
            break label169;
          }
          return;
        }
        catch (Exception paraml)
        {
          w.printErrStackTrace("MicroMsg.AppBrand.PkgDownloadReporterImpl", paraml, "report onEnd, appId %s", new Object[] { this.hIC.appId });
          GMTrace.o(19687458996224L, 146683);
        }
      }
    }
    
    public final void bV(boolean paramBoolean)
    {
      GMTrace.i(19688130084864L, 146688);
      long l1 = SystemClock.elapsedRealtime();
      long l2 = this.hIG;
      String str;
      label85:
      int j;
      switch (f.1.hIB[this.hID.ordinal()])
      {
      default: 
        i = 0;
        hZ(i);
        Sz();
        if (a.hIK == this.hID)
        {
          str = "";
          j = this.hID.value;
          if (!paramBoolean) {
            break label223;
          }
        }
        break;
      }
      label223:
      for (int i = 1;; i = 2)
      {
        a.a(str, j + 1, i, l1 - l2);
        if (!paramBoolean) {
          a.x(this.hIC.appId, 22, this.hIC.eII + 1);
        }
        GMTrace.o(19688130084864L, 146688);
        return;
        if (paramBoolean)
        {
          i = 6;
          break;
        }
        i = 7;
        break;
        if (paramBoolean)
        {
          i = 15;
          break;
        }
        i = 16;
        break;
        if (paramBoolean)
        {
          i = 25;
          break;
        }
        i = 26;
        break;
        if (paramBoolean)
        {
          i = 42;
          break;
        }
        i = 43;
        break;
        str = this.hIC.appId;
        break label85;
      }
    }
    
    public final void hY(int paramInt)
    {
      GMTrace.i(19687727431680L, 146685);
      SystemClock.elapsedRealtime();
      if (paramInt == 0) {
        bk(697, 2);
      }
      for (;;)
      {
        Sz();
        GMTrace.o(19687727431680L, 146685);
        return;
        if (paramInt < 0) {
          bk(697, -paramInt);
        } else if (paramInt == 1) {
          bk(697, 10);
        }
      }
    }
    
    private static enum a
    {
      final int value;
      
      static
      {
        GMTrace.i(19689338044416L, 146697);
        hII = new a("DOWNLOAD", 0, 1);
        hIJ = new a("UPDATE", 1, 4);
        hIK = new a("LIB_UPDATE", 2, 7);
        hIL = new a("INCREMENTAL_UPDATE", 3, 10);
        hIM = new a[] { hII, hIJ, hIK, hIL };
        GMTrace.o(19689338044416L, 146697);
      }
      
      private a(int paramInt)
      {
        GMTrace.i(19689203826688L, 146696);
        this.value = paramInt;
        GMTrace.o(19689203826688L, 146696);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */