package com.tencent.mm.plugin.appbrand.c;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.protocal.c.afy;
import com.tencent.mm.protocal.c.afz;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public enum c
{
  private static volatile long hMg;
  private static volatile afz hMh;
  private static final Set<c> hMi;
  
  static
  {
    GMTrace.i(15409940004864L, 114813);
    hMj = new c[0];
    hMi = Collections.newSetFromMap(new ConcurrentHashMap());
    GMTrace.o(15409940004864L, 114813);
  }
  
  public static boolean Tr()
  {
    GMTrace.i(15408463609856L, 114802);
    GMTrace.o(15408463609856L, 114802);
    return true;
  }
  
  public static boolean Ts()
  {
    GMTrace.i(15408597827584L, 114803);
    switch (3.hMo[Tt().ordinal()])
    {
    }
    do
    {
      GMTrace.o(15408597827584L, 114803);
      return false;
      GMTrace.o(15408597827584L, 114803);
      return false;
      GMTrace.o(15408597827584L, 114803);
      return true;
      if (Tu())
      {
        GMTrace.o(15408597827584L, 114803);
        return true;
      }
    } while (hMh == null);
    if (hMh.iXf >= hMh.uvH)
    {
      GMTrace.o(15408597827584L, 114803);
      return true;
    }
    GMTrace.o(15408597827584L, 114803);
    return false;
  }
  
  static a Tt()
  {
    int i = 0;
    GMTrace.i(15408866263040L, 114805);
    if (!h.xw().wL())
    {
      localObject = a.hMp;
      GMTrace.o(15408866263040L, 114805);
      return (a)localObject;
    }
    Object localObject = com.tencent.mm.y.c.c.Ct().er("100215");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      int j = bg.getInt((String)((com.tencent.mm.storage.c)localObject).bSg().get("isOpenNewNearEntry"), 0);
      localObject = a.values();
      int k = localObject.length;
      while (i < k)
      {
        a locala = localObject[i];
        if (locala.value == j)
        {
          GMTrace.o(15408866263040L, 114805);
          return locala;
        }
        i += 1;
      }
    }
    localObject = a.hMp;
    GMTrace.o(15408866263040L, 114805);
    return (a)localObject;
  }
  
  static boolean Tu()
  {
    GMTrace.i(15409000480768L, 114806);
    boolean bool = h.xy().xh().getBoolean(w.a.vuS, false);
    GMTrace.o(15409000480768L, 114806);
    return bool;
  }
  
  static void Tv()
  {
    GMTrace.i(15409134698496L, 114807);
    h.xy().xh().a(w.a.vuS, Boolean.valueOf(true));
    GMTrace.o(15409134698496L, 114807);
  }
  
  public static afz Tw()
  {
    GMTrace.i(15409403133952L, 114809);
    afz localafz = hMh;
    GMTrace.o(15409403133952L, 114809);
    return localafz;
  }
  
  public static boolean Tx()
  {
    GMTrace.i(15409537351680L, 114810);
    long l2 = bg.Pu();
    if ((!h.xw().wL()) || (hMh == null)) {}
    for (long l1 = 0L; l2 >= l1; l1 = hMg)
    {
      GMTrace.o(15409537351680L, 114810);
      return true;
    }
    GMTrace.o(15409537351680L, 114810);
    return false;
  }
  
  public static void Ty()
  {
    GMTrace.i(15409671569408L, 114811);
    hMh = null;
    GMTrace.o(15409671569408L, 114811);
  }
  
  public static void a(c paramc)
  {
    GMTrace.i(15408195174400L, 114800);
    if (paramc == null)
    {
      GMTrace.o(15408195174400L, 114800);
      return;
    }
    hMi.add(paramc);
    GMTrace.o(15408195174400L, 114800);
  }
  
  public static void b(c paramc)
  {
    GMTrace.i(15408329392128L, 114801);
    if (paramc == null)
    {
      GMTrace.o(15408329392128L, 114801);
      return;
    }
    hMi.remove(paramc);
    GMTrace.o(15408329392128L, 114801);
  }
  
  public static boolean refresh()
  {
    GMTrace.i(15408732045312L, 114804);
    hMh = null;
    hMg = 0L;
    final Object localObject = Tt();
    if (a.hMp == localObject)
    {
      GMTrace.o(15408732045312L, 114804);
      return false;
    }
    localObject = new PBool();
    final PBool localPBool = new PBool();
    ((PBool)localObject).value = false;
    localPBool.value = false;
    aj localaj = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(16284771155968L, 121331);
        if (this.hMk.value)
        {
          GMTrace.o(16284771155968L, 121331);
          return false;
        }
        localObject.value = true;
        c.a(null);
        GMTrace.o(16284771155968L, 121331);
        return false;
      }
    }, false);
    long l = TimeUnit.SECONDS.toMillis(20L);
    localaj.z(l, l);
    localObject = (a.a)com.tencent.mm.plugin.appbrand.o.d.aR(new a.a()
    {
      private int hMm;
      
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(16284502720512L, 121329);
        com.tencent.mm.plugin.appbrand.o.d.aS(this);
        com.tencent.mm.modelgeo.c.Ir().c(this);
        paramAnonymousInt = this.hMm + 1;
        this.hMm = paramAnonymousInt;
        if ((paramAnonymousInt > 1) || (this.hMl.value))
        {
          GMTrace.o(16284502720512L, 121329);
          return false;
        }
        localPBool.value = true;
        if (!paramAnonymousBoolean)
        {
          c.a(null);
          GMTrace.o(16284502720512L, 121329);
          return false;
        }
        b.a locala = new b.a();
        locala.gtE = 1056;
        locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxaappnearby";
        afy localafy = new afy();
        localafy.uvA = paramAnonymousFloat1;
        localafy.uvB = paramAnonymousFloat2;
        if (!c.Tu()) {}
        for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
        {
          localafy.uvD = paramAnonymousBoolean;
          locala.gtF = localafy;
          locala.gtG = new afz();
          u.a(locala.DA(), new u.a()
          {
            public final int a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, b paramAnonymous2b, k paramAnonymous2k)
            {
              GMTrace.i(16284234285056L, 121327);
              if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0) && (paramAnonymous2b != null) && (paramAnonymous2b.gtD.gtK != null) && ((paramAnonymous2b.gtD.gtK instanceof afz))) {
                c.a((afz)paramAnonymous2b.gtD.gtK);
              }
              for (;;)
              {
                GMTrace.o(16284234285056L, 121327);
                return 0;
                w.e("MicroMsg.AppBrandNearbyLogic", "refresh() cgi return errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
                c.a(null);
              }
            }
          }, true);
          GMTrace.o(16284502720512L, 121329);
          return false;
        }
      }
    });
    com.tencent.mm.modelgeo.c.Ir().b((a.a)localObject, false);
    GMTrace.o(15408732045312L, 114804);
    return true;
  }
  
  static enum a
  {
    final int value;
    
    static
    {
      GMTrace.i(15414637625344L, 114848);
      hMp = new a("FORCE_OFF", 0, 0);
      hMq = new a("FORCE_ON", 1, 1);
      hMr = new a("DYNAMIC_THRESHOLD", 2, 2);
      hMs = new a[] { hMp, hMq, hMr };
      GMTrace.o(15414637625344L, 114848);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(15414503407616L, 114847);
      this.value = paramInt;
      GMTrace.o(15414503407616L, 114847);
    }
  }
  
  public static enum b
  {
    final int value;
    
    static
    {
      GMTrace.i(19886101233664L, 148163);
      hMt = new b("DEFAULT", 0, 0);
      hMu = new b("SHOW_COUNT", 1, 1);
      hMv = new b("SHOW_WORDING", 2, 2);
      hMw = new b[] { hMt, hMu, hMv };
      GMTrace.o(19886101233664L, 148163);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(19885832798208L, 148161);
      this.value = paramInt;
      GMTrace.o(19885832798208L, 148161);
    }
    
    public static b jdMethod_if(int paramInt)
    {
      GMTrace.i(19885967015936L, 148162);
      Object localObject = values();
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        b localb = localObject[i];
        if (localb.value == paramInt)
        {
          GMTrace.o(19885967015936L, 148162);
          return localb;
        }
        i += 1;
      }
      localObject = hMt;
      GMTrace.o(19885967015936L, 148162);
      return (b)localObject;
    }
  }
  
  public static abstract interface c
  {
    public abstract void Tz();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */