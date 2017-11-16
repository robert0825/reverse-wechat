package com.tencent.mm.ba;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.d.a.a.t.b;
import com.d.a.a.t.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.map.geolocation.TencentLocationUtils;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.n;
import com.tencent.mm.aw.k;
import com.tencent.mm.c.f;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  private static final byte[] gSs;
  private static b gSt;
  public c gSA;
  public List<d> gSB;
  public List<d> gSC;
  public com.tencent.mm.sdk.b.c gSD;
  aj gSE;
  public com.tencent.map.a.a.b gSF;
  int gSG;
  public com.tencent.map.a.a.c gSH;
  public boolean gSu;
  af gSv;
  int gSw;
  int gSx;
  int gSy;
  private int gSz;
  public long startTime;
  
  static
  {
    GMTrace.i(4408918147072L, 32849);
    gSs = "@wechat*weixin!!".getBytes();
    GMTrace.o(4408918147072L, 32849);
  }
  
  public b()
  {
    GMTrace.i(4404891615232L, 32819);
    this.gSu = false;
    this.startTime = 0L;
    this.gSw = 5000;
    this.gSx = 5000;
    this.gSy = 30000;
    this.gSz = 3600;
    this.gSB = new ArrayList();
    this.gSC = new ArrayList();
    this.gSD = new com.tencent.mm.sdk.b.c() {};
    com.tencent.mm.kernel.h.xz();
    this.gSE = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4403817873408L, 32811);
        w.i("MicroMsg.SenseWhereHelper", "time up, stop sense where sdk.");
        b.KS();
        b.this.KO();
        GMTrace.o(4403817873408L, 32811);
        return false;
      }
    }, false);
    this.gSF = new com.tencent.map.a.a.b()
    {
      public final void a(double paramAnonymousDouble1, double paramAnonymousDouble2, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong)
      {
        GMTrace.i(4404623179776L, 32817);
        w.d("MicroMsg.SenseWhereHelper", "onLocationUpdate latitude[%f] longitude[%f] error[%d] floor[%d] buildingId[%d]", new Object[] { Double.valueOf(paramAnonymousDouble1), Double.valueOf(paramAnonymousDouble2), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Long.valueOf(paramAnonymousLong) });
        GMTrace.o(4404623179776L, 32817);
      }
    };
    this.gSG = 0;
    this.gSH = new com.tencent.map.a.a.c()
    {
      public final void onMessage(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(4402744131584L, 32803);
        w.d("MicroMsg.SenseWhereHelper", "onMessage code[%d] message[%s]", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        if (paramAnonymousInt != 0)
        {
          paramAnonymousString = b.this;
          paramAnonymousInt = paramAnonymousString.gSG + 1;
          paramAnonymousString.gSG = paramAnonymousInt;
          if (paramAnonymousInt > 3)
          {
            w.i("MicroMsg.SenseWhereHelper", "sense where error time more than %d, stop now.", new Object[] { Integer.valueOf(3) });
            b.KT();
            b.this.KO();
          }
        }
        GMTrace.o(4402744131584L, 32803);
      }
    };
    GMTrace.o(4404891615232L, 32819);
  }
  
  public static b KM()
  {
    GMTrace.i(4404757397504L, 32818);
    if (gSt == null) {
      gSt = new b();
    }
    b localb = gSt;
    GMTrace.o(4404757397504L, 32818);
    return localb;
  }
  
  public static String KN()
  {
    GMTrace.i(4405025832960L, 32820);
    String str1 = p.sZ();
    com.tencent.mm.kernel.h.xw();
    String str2 = new o(com.tencent.mm.kernel.a.ww()).toString();
    str1 = str1 + "_" + str2;
    try
    {
      str2 = new String(Base64.encode(new s().encrypt(str1.getBytes("UTF-8"), gSs), 0), "UTF-8");
      w.i("MicroMsg.SenseWhereHelper", "create encrypt imei[%s], original imei[%s]", new Object[] { str2, bg.SJ(str1) });
      GMTrace.o(4405025832960L, 32820);
      return str2;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SenseWhereHelper", localException, "", new Object[0]);
      w.e("MicroMsg.SenseWhereHelper", "create imei error: " + localException.toString());
      GMTrace.o(4405025832960L, 32820);
    }
    return "";
  }
  
  public static void KQ()
  {
    GMTrace.i(4405428486144L, 32823);
    if (bg.aG(bg.a((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vuX, null), 0L)) * 1000L > 21600000L)
    {
      w.i("MicroMsg.SenseWhereHelper", "update sense where location package list.");
      k localk = new k(36);
      com.tencent.mm.kernel.h.xx().fYr.a(localk, 0);
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vuX, Long.valueOf(bg.Pu()));
    }
    GMTrace.o(4405428486144L, 32823);
  }
  
  public static void KR()
  {
    GMTrace.i(16023449239552L, 119384);
    com.tencent.mm.plugin.report.service.g.ork.a(345L, 1L, 1L, false);
    GMTrace.o(16023449239552L, 119384);
  }
  
  public static void KS()
  {
    GMTrace.i(16023583457280L, 119385);
    com.tencent.mm.plugin.report.service.g.ork.a(345L, 2L, 1L, false);
    GMTrace.o(16023583457280L, 119385);
  }
  
  public static void KT()
  {
    GMTrace.i(16023717675008L, 119386);
    com.tencent.mm.plugin.report.service.g.ork.a(345L, 3L, 1L, false);
    GMTrace.o(16023717675008L, 119386);
  }
  
  public static void KU()
  {
    GMTrace.i(16023851892736L, 119387);
    com.tencent.mm.plugin.report.service.g.ork.a(345L, 5L, 1L, false);
    GMTrace.o(16023851892736L, 119387);
  }
  
  public final void KO()
  {
    GMTrace.i(4405160050688L, 32821);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4404354744320L, 32815);
        w.i("MicroMsg.SenseWhereHelper", "it stop sense where sdk.");
        com.tencent.mm.sdk.b.a.vgX.c(b.this.gSD);
        com.d.a.a.t.oa();
        com.d.a.a.t.finish();
        if (b.this.gSA != null)
        {
          b.this.gSA.finish();
          b.this.gSA = null;
        }
        b localb = b.this;
        if (localb.gSv != null) {
          localb.gSv.ngv.quit();
        }
        localb.gSv = null;
        b.this.gSE.stopTimer();
        localb = b.this;
        if (localb.startTime > 0L)
        {
          long l = (bg.Pw() - localb.startTime) / 1000L;
          int i = bg.e((Integer)com.tencent.mm.plugin.report.service.g.a((int)l, new int[] { 5, 10, 20, 30 }, 10, 14));
          w.d("MicroMsg.SenseWhereHelper", "reportCollectionTime time %d, res %d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
          com.tencent.mm.plugin.report.service.g.ork.a(345L, i, 1L, false);
        }
        b.this.gSu = false;
        GMTrace.o(4404354744320L, 32815);
      }
    });
    GMTrace.o(4405160050688L, 32821);
  }
  
  public final boolean KP()
  {
    GMTrace.i(4405294268416L, 32822);
    com.tencent.mm.kernel.h.xw();
    if (new o(com.tencent.mm.kernel.a.ww()).longValue() < 1000000L)
    {
      w.i("MicroMsg.SenseWhereHelper", "it boss uin do not start sense where.");
      GMTrace.o(4405294268416L, 32822);
      return false;
    }
    Object localObject = com.tencent.mm.k.g.ut().getValue("AndroidSenseWhereArgs");
    if (bg.nm((String)localObject))
    {
      w.i("MicroMsg.SenseWhereHelper", "it has no config do not start sense where.");
      GMTrace.o(4405294268416L, 32822);
      return false;
    }
    try
    {
      w.d("MicroMsg.SenseWhereHelper", "sense where config : " + (String)localObject);
      localObject = ((String)localObject).split(";");
      int i = bg.getInt(localObject[0], 0);
      com.tencent.mm.kernel.h.xw();
      int j = com.tencent.mm.a.h.aw(com.tencent.mm.kernel.a.ww() + 5, 100);
      if (j > i)
      {
        w.d("MicroMsg.SenseWhereHelper", "do not start sense where.uinhash %d, percent %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        GMTrace.o(4405294268416L, 32822);
        return false;
      }
      this.gSx = bg.getInt(localObject[1], 5000);
      this.gSw = bg.getInt(localObject[2], 5000);
      this.gSy = bg.getInt(localObject[3], 30000);
      this.gSz = bg.getInt(localObject[4], 3600);
      w.i("MicroMsg.SenseWhereHelper", "check sense where report args[%d, %d, %d, %d]", new Object[] { Integer.valueOf(this.gSx), Integer.valueOf(this.gSw), Integer.valueOf(this.gSy), Integer.valueOf(this.gSz) });
      long l = bg.aG(((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vuY, Long.valueOf(0L))).longValue());
      i = this.gSz;
      if (l > i)
      {
        GMTrace.o(4405294268416L, 32822);
        return true;
      }
      w.i("MicroMsg.SenseWhereHelper", "it is not time out. diff[%d], collection interval[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(this.gSz) });
      GMTrace.o(4405294268416L, 32822);
      return false;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SenseWhereHelper", localException, "", new Object[0]);
      w.e("MicroMsg.SenseWhereHelper", "check sense where config error: " + localException.toString());
      w.i("MicroMsg.SenseWhereHelper", "it default do not start sense where.");
      GMTrace.o(4405294268416L, 32822);
    }
    return false;
  }
  
  public final boolean a(int paramInt, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(16023180804096L, 119382);
    if (paramInt == 1) {}
    for (Object localObject = this.gSB; (localObject == null) || (((List)localObject).size() <= 0); localObject = this.gSC)
    {
      w.i("MicroMsg.SenseWhereHelper", "it has not report location, do not start sense where.");
      GMTrace.o(16023180804096L, 119382);
      return false;
    }
    long l = bg.Pw();
    localObject = ((List)localObject).iterator();
    d locald;
    double d;
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      locald = (d)((Iterator)localObject).next();
      d = TencentLocationUtils.distanceBetween(locald.latitude, locald.longitude, paramFloat2, paramFloat1);
      w.d("MicroMsg.SenseWhereHelper", "loc[%f, %f], config[%f, %f], dis[%f, %f]", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Double.valueOf(locald.latitude), Double.valueOf(locald.longitude), Double.valueOf(d), Double.valueOf(locald.gSX) });
    } while (d > locald.gSX);
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.SenseWhereHelper", "check location[%d, %f, %f] finish %b, cost time %d", new Object[] { Integer.valueOf(paramInt), Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Boolean.valueOf(bool), Long.valueOf(bg.aI(l)) });
      GMTrace.o(16023180804096L, 119382);
      return bool;
    }
  }
  
  public final void gV(int paramInt)
  {
    GMTrace.i(16023315021824L, 119383);
    aj localaj = this.gSE;
    long l = paramInt;
    localaj.z(l, l);
    GMTrace.o(16023315021824L, 119383);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ba\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */