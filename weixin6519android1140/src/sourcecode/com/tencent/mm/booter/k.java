package com.tencent.mm.booter;

import android.bluetooth.BluetoothAdapter;
import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.di;
import com.tencent.mm.g.a.dj;
import com.tencent.mm.g.a.dk;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.protocal.c.ahz;
import com.tencent.mm.protocal.c.aib;
import com.tencent.mm.protocal.c.aie;
import com.tencent.mm.protocal.c.xd;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class k
{
  public static com.tencent.mm.modelgeo.c fJm;
  public static float fJn;
  public static float fJo;
  public static boolean fJp;
  public static Map<String, ahz> fJq;
  public static List<ahz> fJr;
  public static Boolean fJs;
  public static a.a fJt;
  private static aj fJu;
  public static com.tencent.mm.sdk.b.c fJv;
  
  static
  {
    GMTrace.i(504658657280L, 3760);
    fJn = -85.0F;
    fJo = -1000.0F;
    fJp = false;
    fJq = new ConcurrentHashMap();
    fJr = new CopyOnWriteArrayList();
    fJs = Boolean.valueOf(false);
    fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15301492080640L, 114005);
        if (paramAnonymousBoolean)
        {
          w.d("MicroMsg.PostTaskStartRangeForIBeacon", "on location get ok");
          k.fJn = paramAnonymousFloat2;
          k.fJo = paramAnonymousFloat1;
          k.fJp = true;
          if (k.fJm != null)
          {
            k.fJm.c(k.fJt);
            k.fJp = false;
          }
        }
        for (;;)
        {
          GMTrace.o(15301492080640L, 114005);
          return false;
          w.w("MicroMsg.PostTaskStartRangeForIBeacon", "getLocation fail");
        }
      }
    };
    fJu = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(494055456768L, 3681);
        try
        {
          at.AR();
          Boolean localBoolean = Boolean.valueOf(bg.a((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsX, null), false));
          Object localObject2 = com.tencent.mm.k.g.uu().ui();
          if (localObject2 == null) {
            break label382;
          }
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str = (String)((Iterator)localObject2).next();
            w.i("MicroMsg.PostTaskStartRangeForIBeacon", "op=false,isInShakeUI:" + localBoolean + ",iBeacon = %s", new Object[] { str });
            dj localdj = new dj();
            localdj.eEZ.eFb = str;
            localdj.eEZ.eEY = false;
            if (!localBoolean.booleanValue()) {
              a.vgX.m(localdj);
            }
          }
          localObject1 = new aib();
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.PostTaskStartRangeForIBeacon", localException.getMessage());
          GMTrace.o(494055456768L, 3681);
          return false;
        }
        final Object localObject1;
        ((aib)localObject1).latitude = k.fJn;
        ((aib)localObject1).longitude = k.fJo;
        at.AR();
        long l = bg.a((Long)com.tencent.mm.y.c.xh().get(w.a.vsO, null), 0L);
        if ((k.fJq.size() > 0) && (!k.fJs.booleanValue()) && (k.fJr.size() > 0))
        {
          k.fJs = Boolean.valueOf(true);
          localObject1 = new com.tencent.mm.modelmulti.e(k.fJr, l, (aib)localObject1);
          w.d("MicroMsg.PostTaskStartRangeForIBeacon", "[shakezb]PostTaskStartRangeForIBeacon[kevinkma] shopId " + l + ",beaconInfos size " + k.fJr.size() + ",info:" + k.fJr.toString());
          at.wS().a(1708, new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
            {
              GMTrace.i(500095254528L, 3726);
              if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
              {
                paramAnonymous2k = (xd)localObject1.gMj.gtD.gtK;
                if (paramAnonymous2k.result == 0)
                {
                  paramAnonymous2String = paramAnonymous2k.uoU;
                  paramAnonymous2k = paramAnonymous2k.uoW;
                  String str = paramAnonymous2String.title + "," + paramAnonymous2String.desc + "," + paramAnonymous2String.uxz + "," + paramAnonymous2String.uxA + "," + paramAnonymous2k.lOv + "," + paramAnonymous2k.major + "," + paramAnonymous2k.minor;
                  at.AR();
                  String[] arrayOfString = bg.aq((String)com.tencent.mm.y.c.xh().get(w.a.vsU, null), "").split(",");
                  paramAnonymous2Int2 = arrayOfString.length;
                  paramAnonymous2String = Boolean.valueOf(false);
                  paramAnonymous2Int1 = 0;
                  while (paramAnonymous2Int1 < paramAnonymous2Int2)
                  {
                    if (arrayOfString[paramAnonymous2Int1].equals(paramAnonymous2k.lOv + paramAnonymous2k.major + paramAnonymous2k.minor)) {
                      paramAnonymous2String = Boolean.valueOf(true);
                    }
                    paramAnonymous2Int1 += 1;
                  }
                  if (!paramAnonymous2String.booleanValue())
                  {
                    com.tencent.mm.plugin.report.service.g.ork.i(12653, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
                    com.tencent.mm.plugin.report.service.g.ork.i(12653, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
                    at.AR();
                    com.tencent.mm.y.c.xh().a(w.a.vsT, str);
                  }
                }
              }
              for (;;)
              {
                at.AR();
                com.tencent.mm.y.c.wH();
                paramAnonymous2String = new di();
                a.vgX.m(paramAnonymous2String);
                k.fJs = Boolean.valueOf(false);
                at.wS().b(1708, this);
                GMTrace.o(500095254528L, 3726);
                return;
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vsT, "");
                continue;
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vsT, "");
                continue;
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vsT, "");
              }
            }
          });
          at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
        }
        for (;;)
        {
          k.fJq.clear();
          k.fJr.clear();
          a.vgX.c(k.fJv);
          label382:
          GMTrace.o(494055456768L, 3681);
          return false;
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsT, "");
        }
      }
    }, true);
    fJv = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(504658657280L, 3760);
  }
  
  public static void run()
  {
    GMTrace.i(502913826816L, 3747);
    if ((!at.AU()) || (at.wF()))
    {
      GMTrace.o(502913826816L, 3747);
      return;
    }
    at.AR();
    Object localObject = Boolean.valueOf(bg.a((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsV, null), false));
    w.i("MicroMsg.PostTaskStartRangeForIBeacon", "the range road status is " + localObject);
    if (!((Boolean)localObject).booleanValue())
    {
      GMTrace.o(502913826816L, 3747);
      return;
    }
    long l1 = bg.Pu();
    at.AR();
    long l2 = bg.a((Long)com.tencent.mm.y.c.xh().get(w.a.vsW, null), 0L);
    at.AR();
    if (l1 - l2 > bg.a((Long)com.tencent.mm.y.c.xh().get(w.a.vsQ, null), 0L))
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vsV, Boolean.valueOf(false));
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vsU, "");
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vsT, "");
      at.AR();
      com.tencent.mm.y.c.wH();
      GMTrace.o(502913826816L, 3747);
      return;
    }
    localObject = BluetoothAdapter.getDefaultAdapter();
    if ((Build.VERSION.SDK_INT >= 18) && (localObject != null) && (((BluetoothAdapter)localObject).getState() == 12))
    {
      localObject = com.tencent.mm.k.g.uu().ui();
      if (localObject != null)
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          w.i("MicroMsg.PostTaskStartRangeForIBeacon", "op=true,iBeacon = %s", new Object[] { str });
          dj localdj = new dj();
          localdj.eEZ.eFb = str;
          localdj.eEZ.eEY = true;
          a.vgX.m(localdj);
        }
        fJm = com.tencent.mm.modelgeo.c.Ir();
        if (fJu.bQn()) {
          fJu.z(3000L, 3000L);
        }
        if ((!fJp) && (fJm != null)) {
          fJm.b(fJt);
        }
        a.vgX.b(fJv);
      }
      GMTrace.o(502913826816L, 3747);
      return;
    }
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vsT, "");
    GMTrace.o(502913826816L, 3747);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */