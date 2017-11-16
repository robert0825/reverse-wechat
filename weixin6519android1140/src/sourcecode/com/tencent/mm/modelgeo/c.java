package com.tencent.mm.modelgeo;

import android.content.Context;
import android.location.LocationManager;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements a
{
  public static c gxh;
  public double aEG;
  public boolean gET;
  public g gEU;
  public List<WeakReference<a.a>> gEV;
  long gEW;
  public long gEX;
  public boolean gEY;
  public boolean gEZ;
  public double gFa;
  public double gFb;
  public int gFc;
  public double gFd;
  public double gFe;
  private boolean gFf;
  private boolean gFg;
  private e gFh;
  private f gFi;
  private ae ghS;
  private Context mContext;
  
  private c(Context paramContext)
  {
    GMTrace.i(487076134912L, 3629);
    this.gET = false;
    this.gEV = new ArrayList();
    this.gEW = 0L;
    this.gEX = 0L;
    this.gEY = false;
    this.gEZ = false;
    this.gFa = 23.0D;
    this.gFb = 100.0D;
    this.gFc = 0;
    this.gFd = 0.0D;
    this.gFe = 0.0D;
    this.aEG = 0.0D;
    this.gFf = false;
    this.gFg = false;
    this.ghS = new ae(Looper.getMainLooper());
    this.gFh = new e()
    {
      public final void b(final boolean paramAnonymousBoolean, final double paramAnonymousDouble1, double paramAnonymousDouble2, final int paramAnonymousInt, double paramAnonymousDouble3, final double paramAnonymousDouble4, final double paramAnonymousDouble5)
      {
        GMTrace.i(15680388726784L, 116828);
        c.this.bw(paramAnonymousBoolean);
        if (paramAnonymousBoolean)
        {
          c.this.gFa = paramAnonymousDouble1;
          c.this.gFb = paramAnonymousDouble2;
          c.this.gFc = paramAnonymousInt;
          c.this.gFd = paramAnonymousDouble3;
          c.this.gFe = paramAnonymousDouble4;
          c.this.aEG = paramAnonymousDouble5;
          c.this.gEX = System.currentTimeMillis();
          c.this.gEY = true;
          c.this.gEZ = false;
          c.this.gi(67592);
        }
        w.d("MicroMsg.LocationGeo", "onGetLocation fLongitude: %f fLatitude:%f locType:%d %f:spped", new Object[] { Double.valueOf(paramAnonymousDouble2), Double.valueOf(paramAnonymousDouble1), Integer.valueOf(paramAnonymousInt), Double.valueOf(paramAnonymousDouble3) });
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(483049603072L, 3599);
            c.this.a(paramAnonymousBoolean, paramAnonymousDouble1, paramAnonymousInt, paramAnonymousDouble4, paramAnonymousDouble5, this.gFp, this.gFq);
            GMTrace.o(483049603072L, 3599);
          }
        });
        GMTrace.o(15680388726784L, 116828);
      }
    };
    this.gFi = new f()
    {
      public final void b(final boolean paramAnonymousBoolean, final double paramAnonymousDouble1, double paramAnonymousDouble2, final int paramAnonymousInt, double paramAnonymousDouble3, final double paramAnonymousDouble4, final double paramAnonymousDouble5)
      {
        GMTrace.i(15681462468608L, 116836);
        c.this.bw(paramAnonymousBoolean);
        if (paramAnonymousBoolean)
        {
          c.this.gFa = paramAnonymousDouble1;
          c.this.gFb = paramAnonymousDouble2;
          c.this.gFc = paramAnonymousInt;
          c.this.gFd = paramAnonymousDouble3;
          c.this.gFe = paramAnonymousDouble4;
          c.this.aEG = paramAnonymousDouble5;
          c.this.gEZ = true;
          c.this.gEY = false;
          c.this.gEX = System.currentTimeMillis();
          c.this.gi(67591);
        }
        w.d("MicroMsg.LocationGeo", "onGetLocationWgs84 fLongitude: %f fLatitude:%f locType:%d %f:spped", new Object[] { Double.valueOf(paramAnonymousDouble2), Double.valueOf(paramAnonymousDouble1), Integer.valueOf(paramAnonymousInt), Double.valueOf(paramAnonymousDouble3) });
        new ae(Looper.getMainLooper()).postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(486807699456L, 3627);
            c.this.a(paramAnonymousBoolean, paramAnonymousDouble1, paramAnonymousInt, paramAnonymousDouble4, paramAnonymousDouble5, this.gFp, this.gFq);
            GMTrace.o(486807699456L, 3627);
          }
        }, 200L);
        GMTrace.o(15681462468608L, 116836);
      }
    };
    this.mContext = paramContext;
    this.gEU = g.be(paramContext);
    GMTrace.o(487076134912L, 3629);
  }
  
  public static c Ir()
  {
    GMTrace.i(486941917184L, 3628);
    if (gxh == null) {
      gxh = new c(ab.getContext());
    }
    c localc = gxh;
    GMTrace.o(486941917184L, 3628);
    return localc;
  }
  
  public static boolean Is()
  {
    GMTrace.i(487747223552L, 3634);
    try
    {
      boolean bool = ((LocationManager)ab.getContext().getSystemService("location")).isProviderEnabled("gps");
      GMTrace.o(487747223552L, 3634);
      return bool;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.LocationGeo", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(487747223552L, 3634);
    }
    return false;
  }
  
  public static boolean It()
  {
    GMTrace.i(487881441280L, 3635);
    try
    {
      boolean bool = ((LocationManager)ab.getContext().getSystemService("location")).isProviderEnabled("network");
      GMTrace.o(487881441280L, 3635);
      return bool;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.LocationGeo", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(487881441280L, 3635);
    }
    return false;
  }
  
  public final void a(a.a parama)
  {
    GMTrace.i(487478788096L, 3632);
    b(parama, true);
    GMTrace.o(487478788096L, 3632);
  }
  
  public final void a(a.a parama, boolean paramBoolean)
  {
    GMTrace.i(487210352640L, 3630);
    w.i("MicroMsg.LocationGeo", "startWgs84 %s userCache %s delay %d", new Object[] { parama, Boolean.valueOf(paramBoolean), Integer.valueOf(0) });
    if ((this.gET) && (this.gEV.size() > 0)) {}
    try
    {
      this.gEW = System.currentTimeMillis();
      this.gFf = false;
      this.gFg = false;
      g.Iv();
      g.a(this.gFi, 0, Looper.getMainLooper());
      this.gET = false;
      Iterator localIterator = this.gEV.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localWeakReference = (WeakReference)localIterator.next();
      } while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((a.a)localWeakReference.get()).equals(parama)));
      i = 0;
      if (i != 0) {
        this.gEV.add(new WeakReference(parama));
      }
      w.i("MicroMsg.LocationGeo", "add listeners size %d", new Object[] { Integer.valueOf(this.gEV.size()) });
      if ((this.gEV.size() != 1) || (i == 0)) {}
    }
    catch (g.a locala)
    {
      for (;;)
      {
        try
        {
          this.gEW = System.currentTimeMillis();
          this.gFf = false;
          this.gFg = false;
          g.a(this.gFi, 0, Looper.getMainLooper());
          if ((paramBoolean) && (this.gEZ) && (System.currentTimeMillis() - this.gEX < 60000L)) {
            this.gFh.b(true, this.gFa, this.gFb, this.gFc, this.gFd, this.gFe, this.aEG);
          }
          GMTrace.o(487210352640L, 3630);
          return;
          locala = locala;
          w.d("MicroMsg.LocationGeo", locala.toString());
        }
        catch (g.a parama)
        {
          w.d("MicroMsg.LocationGeo", parama.toString());
          continue;
        }
        int i = 1;
      }
    }
  }
  
  public final void a(boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    GMTrace.i(16086263136256L, 119852);
    Object localObject1 = new LinkedList();
    Object localObject2 = this.gEV.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject2).next();
      if ((localWeakReference != null) && (localWeakReference.get() != null)) {
        ((List)localObject1).add((a.a)localWeakReference.get());
      }
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (a.a)((Iterator)localObject1).next();
      if ((r.hjI) && (b.bPq())) {
        ((a.a)localObject2).a(paramBoolean, (float)r.lng, (float)r.lat, paramInt, (float)paramDouble3, paramDouble4, paramDouble5);
      } else {
        ((a.a)localObject2).a(paramBoolean, (float)paramDouble2, (float)paramDouble1, paramInt, (float)paramDouble3, paramDouble4, paramDouble5);
      }
    }
    GMTrace.o(16086263136256L, 119852);
  }
  
  public final void b(a.a parama)
  {
    GMTrace.i(487344570368L, 3631);
    a(parama, true);
    GMTrace.o(487344570368L, 3631);
  }
  
  public final void b(a.a parama, boolean paramBoolean)
  {
    GMTrace.i(16287589728256L, 121352);
    if ((!this.gET) && (this.gEV.size() > 0)) {}
    try
    {
      this.gEW = System.currentTimeMillis();
      this.gFf = false;
      this.gFg = false;
      g.Iv();
      g.a(this.gFh, 1, Looper.getMainLooper());
      this.gET = true;
      Iterator localIterator = this.gEV.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localWeakReference = (WeakReference)localIterator.next();
      } while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((a.a)localWeakReference.get()).equals(parama)));
      i = 0;
      if (i != 0) {
        this.gEV.add(new WeakReference(parama));
      }
      w.i("MicroMsg.LocationGeo", "add listeners size %d", new Object[] { Integer.valueOf(this.gEV.size()) });
      if ((this.gEV.size() != 1) || (i == 0)) {}
    }
    catch (g.a locala)
    {
      for (;;)
      {
        try
        {
          this.gEW = System.currentTimeMillis();
          this.gFf = false;
          this.gFg = false;
          g.a(this.gFh, 1, Looper.getMainLooper());
          if ((paramBoolean) && (this.gEY) && (System.currentTimeMillis() - this.gEX < 60000L)) {
            this.gFh.b(true, this.gFa, this.gFb, this.gFc, this.gFd, this.gFe, this.aEG);
          }
          GMTrace.o(16287589728256L, 121352);
          return;
          locala = locala;
          w.d("MicroMsg.LocationGeo", locala.toString());
        }
        catch (g.a parama)
        {
          w.d("MicroMsg.LocationGeo", parama.toString());
          continue;
        }
        int i = 1;
      }
    }
  }
  
  public final void bw(boolean paramBoolean)
  {
    int i = 10;
    GMTrace.i(16086397353984L, 119853);
    if ((paramBoolean) && (this.gFf))
    {
      GMTrace.o(16086397353984L, 119853);
      return;
    }
    if ((!paramBoolean) && (this.gFg))
    {
      GMTrace.o(16086397353984L, 119853);
      return;
    }
    long l = System.currentTimeMillis();
    if (l - this.gEW <= 500L) {}
    for (;;)
    {
      int j = i;
      if (!paramBoolean) {
        j = i + 1;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(584L, j, 1L, true);
      if (!paramBoolean) {
        break;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(584L, 30L, 1L, true);
      com.tencent.mm.plugin.report.service.g.ork.a(584L, 31L, l - this.gEW, true);
      this.gFf = true;
      GMTrace.o(16086397353984L, 119853);
      return;
      if (l - this.gEW <= 1000L) {
        i = 12;
      } else if (l - this.gEW <= 2000L) {
        i = 14;
      } else if (l - this.gEW <= 4000L) {
        i = 16;
      } else if (l - this.gEW <= 8000L) {
        i = 18;
      }
    }
    this.gFg = true;
    GMTrace.o(16086397353984L, 119853);
  }
  
  public final void c(final a.a parama)
  {
    GMTrace.i(487613005824L, 3633);
    new ae().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(482110078976L, 3592);
        Object localObject1 = new ArrayList();
        Object localObject2 = c.this.gEV.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          WeakReference localWeakReference = (WeakReference)((Iterator)localObject2).next();
          if ((localWeakReference == null) || (localWeakReference.get() == null) || (((a.a)localWeakReference.get()).equals(parama))) {
            ((List)localObject1).add(localWeakReference);
          }
        }
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (WeakReference)((Iterator)localObject1).next();
          c.this.gEV.remove(localObject2);
        }
        w.i("MicroMsg.LocationGeo", "stop listeners size %d", new Object[] { Integer.valueOf(c.this.gEV.size()) });
        if ((c.this.gEV.size() == 0) && (c.this.gEU != null)) {
          g.Iv();
        }
        GMTrace.o(482110078976L, 3592);
      }
    });
    GMTrace.o(487613005824L, 3633);
  }
  
  public final void gi(int paramInt)
  {
    GMTrace.i(16086531571712L, 119854);
    if (!h.xw().wL())
    {
      GMTrace.o(16086531571712L, 119854);
      return;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append((int)this.gFe);
    localStringBuffer.append(",");
    localStringBuffer.append(this.gFc);
    localStringBuffer.append(",");
    localStringBuffer.append((int)(this.gFa * 1000000.0D));
    localStringBuffer.append(",");
    localStringBuffer.append((int)(this.gFb * 1000000.0D));
    h.xy().xh().set(paramInt, localStringBuffer.toString());
    w.d("MicroMsg.LocationGeo", "Save Location Success id=%d|content=%s", new Object[] { Integer.valueOf(paramInt), localStringBuffer.toString() });
    GMTrace.o(16086531571712L, 119854);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelgeo\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */