package com.tencent.mm.plugin.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.bm;
import com.tencent.mm.g.a.cb;
import com.tencent.mm.g.a.cb.a;
import com.tencent.mm.g.a.je;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.platformtools.g.a;
import com.tencent.mm.plugin.i.a.d;
import com.tencent.mm.plugin.i.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class b
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.b.b
{
  private static HashMap<Integer, g.d> jvQ;
  private static b jvT;
  private BroadcastReceiver gNE;
  public boolean gNF;
  public boolean gNG;
  public Runnable gNI;
  private com.tencent.mm.plugin.i.b.b jvR;
  private g.a jvS;
  public af jvU;
  public com.tencent.mm.plugin.i.c.c jvV;
  public boolean jvW;
  public com.tencent.mm.plugin.i.c.c jvX;
  public com.tencent.mm.plugin.i.c.b jvY;
  private HashMap<Integer, com.tencent.mm.plugin.i.a.a> jvZ;
  public com.tencent.mm.plugin.i.c.c.a jwa;
  public com.tencent.mm.plugin.i.c.c.a jwb;
  private com.tencent.mm.plugin.messenger.foundation.a.a.c.a jwc;
  private com.tencent.mm.sdk.b.c<cb> jwd;
  public boolean jwe;
  private com.tencent.mm.sdk.b.c<bm> jwf;
  public boolean rZT;
  public HashSet<Long> yvi;
  
  static
  {
    GMTrace.i(20664966709248L, 153966);
    HashMap localHashMap = new HashMap();
    jvQ = localHashMap;
    localHashMap.put(Integer.valueOf("WXFILEINDEX_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(20657047863296L, 153907);
        String[] arrayOfString = com.tencent.mm.plugin.i.b.b.fTX;
        GMTrace.o(20657047863296L, 153907);
        return arrayOfString;
      }
    });
    GMTrace.o(20664966709248L, 153966);
  }
  
  public b()
  {
    GMTrace.i(20662685007872L, 153949);
    this.jvV = null;
    this.yvi = new HashSet();
    this.rZT = false;
    this.jvW = false;
    this.jvX = null;
    this.jvY = null;
    this.jvZ = new HashMap();
    this.jwa = new com.tencent.mm.plugin.i.c.c.a()
    {
      public final void finish()
      {
        GMTrace.i(20657316298752L, 153909);
        b.this.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20656242556928L, 153901);
            b.this.jvX = null;
            b.this.dt(false);
            GMTrace.o(20656242556928L, 153901);
          }
        });
        GMTrace.o(20657316298752L, 153909);
      }
    };
    this.jwb = new com.tencent.mm.plugin.i.c.c.a()
    {
      public final void finish()
      {
        GMTrace.i(20665772015616L, 153972);
        b.this.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20655974121472L, 153899);
            b.this.jvV = null;
            b.this.aiC();
            GMTrace.o(20655974121472L, 153899);
          }
        });
        GMTrace.o(20665772015616L, 153972);
      }
    };
    this.jwc = new com.tencent.mm.plugin.messenger.foundation.a.a.c.a()
    {
      public final void a(com.tencent.mm.plugin.messenger.foundation.a.a.c paramAnonymousc, final c.c paramAnonymousc1)
      {
        GMTrace.i(20656510992384L, 153903);
        if (paramAnonymousc == null)
        {
          GMTrace.o(20656510992384L, 153903);
          return;
        }
        if ((paramAnonymousc1 == null) || (paramAnonymousc1.mVa == null))
        {
          GMTrace.o(20656510992384L, 153903);
          return;
        }
        b.this.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20653826637824L, 153883);
            w.d("MicroMsg.CalcWxService", "on notify change [%s] [%d]", new Object[] { paramAnonymousc1.mUZ, Integer.valueOf(paramAnonymousc1.mVa.size()) });
            if ("delete".equals(paramAnonymousc1.mUZ))
            {
              GMTrace.o(20653826637824L, 153883);
              return;
            }
            int i;
            Iterator localIterator;
            if ("delete".equals(paramAnonymousc1.mUZ))
            {
              i = 2;
              localIterator = paramAnonymousc1.mVa.iterator();
            }
            for (;;)
            {
              label98:
              if (!localIterator.hasNext()) {
                break label234;
              }
              Object localObject = (au)localIterator.next();
              if (localObject != null)
              {
                b localb = b.this;
                long l = ((ce)localObject).field_msgId;
                if (localb.rZT) {}
                for (boolean bool = localb.yvi.contains(Long.valueOf(l));; bool = false)
                {
                  if (!bool) {
                    break label203;
                  }
                  w.d("MicroMsg.CalcWxService", "it locked now [%d]", new Object[] { Long.valueOf(((ce)localObject).field_msgId) });
                  break label98;
                  i = 1;
                  break;
                }
                label203:
                localObject = new com.tencent.mm.plugin.i.c.a((au)localObject, i);
                b.this.jvU.A((Runnable)localObject);
              }
            }
            label234:
            GMTrace.o(20653826637824L, 153883);
          }
        });
        GMTrace.o(20656510992384L, 153903);
      }
    };
    this.jwd = new com.tencent.mm.sdk.b.c() {};
    this.gNF = false;
    this.gNG = true;
    this.jwe = false;
    this.jwf = new com.tencent.mm.sdk.b.c()
    {
      private boolean aiI()
      {
        GMTrace.i(20655571468288L, 153896);
        w.i("MicroMsg.CalcWxService", "%s clean wx file index event ", new Object[] { b.this.aiH() });
        b.this.jwe = true;
        try
        {
          com.tencent.mm.kernel.h.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20653021331456L, 153877);
              com.tencent.mm.kernel.h.xy().xh().a(w.a.vyV, Long.valueOf(-1L));
              com.tencent.mm.kernel.h.xy().xh().a(w.a.vyU, Long.valueOf(0L));
              com.tencent.mm.kernel.h.xy().xh().kL(true);
              b.aiA().aiB().delete();
              b.this.jwe = false;
              GMTrace.o(20653021331456L, 153877);
            }
          });
          GMTrace.o(20655571468288L, 153896);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.CalcWxService", localException, "%s clean wx file error", new Object[] { b.this.aiH() });
          }
        }
      }
    };
    GMTrace.o(20662685007872L, 153949);
  }
  
  public static b aiA()
  {
    try
    {
      GMTrace.i(20662819225600L, 153950);
      if (jvT == null) {
        jvT = new b();
      }
      b localb = jvT;
      GMTrace.o(20662819225600L, 153950);
      return localb;
    }
    finally {}
  }
  
  public static long aiD()
  {
    GMTrace.i(20663892967424L, 153958);
    long l2 = ((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyV, Long.valueOf(-1L))).longValue();
    long l1 = l2;
    if (l2 <= -1L)
    {
      l1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().CA("message");
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vyV, Long.valueOf(l1));
    }
    GMTrace.o(20663892967424L, 153958);
    return l1;
  }
  
  public static long aiF()
  {
    GMTrace.i(20664564056064L, 153963);
    long l = ((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyU, Long.valueOf(0L))).longValue();
    GMTrace.o(20664564056064L, 153963);
    return l;
  }
  
  public static int aiG()
  {
    GMTrace.i(20664698273792L, 153964);
    int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyT, Integer.valueOf(5))).intValue();
    GMTrace.o(20664698273792L, 153964);
    return i;
  }
  
  public static void o(int paramInt, long paramLong)
  {
    int i = 30;
    GMTrace.i(20664295620608L, 153961);
    if (paramLong <= 1000L)
    {
      paramInt += 5;
      if (paramInt <= 30) {
        break label129;
      }
      paramInt = i;
    }
    label129:
    for (;;)
    {
      i = paramInt;
      if (paramInt < 5) {
        i = 5;
      }
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vyT, Integer.valueOf(i));
      paramInt = ((Integer)com.tencent.mm.plugin.report.service.g.a(i, new int[] { 5, 10, 20, 25, 30 }, 10, 15)).intValue();
      com.tencent.mm.plugin.report.service.g.ork.a(664L, paramInt, 1L, false);
      GMTrace.o(20664295620608L, 153961);
      return;
      paramInt -= 5;
      break;
    }
  }
  
  public final void G(au paramau)
  {
    GMTrace.i(20664161402880L, 153960);
    if (paramau == null)
    {
      GMTrace.o(20664161402880L, 153960);
      return;
    }
    try
    {
      com.tencent.mm.plugin.i.a.a locala = (com.tencent.mm.plugin.i.a.a)this.jvZ.get(Integer.valueOf(paramau.field_type));
      if (locala != null) {
        locala.H(paramau);
      }
      GMTrace.o(20664161402880L, 153960);
      return;
    }
    catch (Exception paramau)
    {
      w.printErrStackTrace("MicroMsg.CalcWxService", paramau, "", new Object[0]);
      com.tencent.mm.plugin.report.service.g.ork.a(664L, 5L, 1L, false);
      GMTrace.o(20664161402880L, 153960);
    }
  }
  
  public final void aW(long paramLong)
  {
    GMTrace.i(20664429838336L, 153962);
    w.d("MicroMsg.CalcWxService", "%d update scan msgid[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(paramLong) });
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vyU, Long.valueOf(paramLong));
    GMTrace.o(20664429838336L, 153962);
  }
  
  public final void agW()
  {
    GMTrace.i(20663490314240L, 153955);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20665503580160L, 153970);
        if (b.this.jvV != null)
        {
          if (b.this.jvU != null)
          {
            af localaf = b.this.jvU;
            af.F(b.this.jvV);
          }
          b.this.jvV.isStop = true;
          b.this.jvV = null;
          com.tencent.mm.plugin.report.service.g.ork.a(664L, 2L, 1L, false);
        }
        if (b.this.jvY != null) {
          b.this.jvY.isStop = true;
        }
        GMTrace.o(20665503580160L, 153970);
      }
    });
    GMTrace.o(20663490314240L, 153955);
  }
  
  public final com.tencent.mm.plugin.i.b.b aiB()
  {
    GMTrace.i(20662953443328L, 153951);
    if (this.jvR == null) {
      this.jvR = new com.tencent.mm.plugin.i.b.b(this.jvS);
    }
    com.tencent.mm.plugin.i.b.b localb = this.jvR;
    GMTrace.o(20662953443328L, 153951);
    return localb;
  }
  
  public final void aiC()
  {
    GMTrace.i(20663356096512L, 153954);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20656779427840L, 153905);
        b localb = b.this;
        if ((!localb.jvW) && (localb.gNF) && (!localb.gNG)) {}
        for (int i = 1; i == 0; i = 0)
        {
          if (b.this.jvV != null)
          {
            b.this.jvV.isStop = true;
            b.this.jvV = null;
          }
          GMTrace.o(20656779427840L, 153905);
          return;
        }
        if (b.this.aiE())
        {
          com.tencent.mm.plugin.report.service.g.ork.a(664L, 3L, 1L, false);
          GMTrace.o(20656779427840L, 153905);
          return;
        }
        if (b.this.jvV != null)
        {
          GMTrace.o(20656779427840L, 153905);
          return;
        }
        b.this.jvV = new com.tencent.mm.plugin.i.c.c("message", b.aiF(), b.aiG(), b.this.jwb);
        b.this.jvU.h(b.this.jvV, 2000L);
        if (((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyX, Long.valueOf(0L))).longValue() <= 0L) {
          com.tencent.mm.kernel.h.xy().xh().a(w.a.vyX, Long.valueOf(bg.Pu()));
        }
        GMTrace.o(20656779427840L, 153905);
      }
    });
    GMTrace.o(20663356096512L, 153954);
  }
  
  public final boolean aiE()
  {
    GMTrace.i(20664027185152L, 153959);
    long l1 = aiD();
    long l2 = aiF();
    if (l2 >= l1) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.CalcWxService", "%d scan finish [%d %d %b]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool) });
      if ((bool) && (((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyY, Long.valueOf(0L))).longValue() <= 0L)) {
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vyY, Long.valueOf(bg.Pu()));
      }
      GMTrace.o(20664027185152L, 153959);
      return bool;
    }
  }
  
  public final String aiH()
  {
    GMTrace.i(20664832491520L, 153965);
    String str = hashCode();
    GMTrace.o(20664832491520L, 153965);
    return str;
  }
  
  public final void bMR()
  {
    GMTrace.i(21058493087744L, 156898);
    this.rZT = false;
    this.yvi.clear();
    w.d("MicroMsg.CalcWxService", "%d unlock msg change [%s]", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    GMTrace.o(21058493087744L, 156898);
  }
  
  public final void dt(final boolean paramBoolean)
  {
    boolean bool = false;
    GMTrace.i(20663221878784L, 153953);
    String str = aiH();
    if (this.jvX != null) {
      bool = true;
    }
    w.d("MicroMsg.CalcWxService", "%s manual scan now manualScanTask[%b] uiClick[%b]", new Object[] { str, Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20655303032832L, 153894);
        if (paramBoolean) {
          b.this.jvW = true;
        }
        if (!b.this.jvW)
        {
          GMTrace.o(20655303032832L, 153894);
          return;
        }
        if (b.this.jvX == null)
        {
          je localje = new je();
          if (b.this.aiE())
          {
            b.this.jvW = false;
            localje.eME.eqi = true;
            com.tencent.mm.sdk.b.a.vgX.m(localje);
            com.tencent.mm.plugin.report.service.g.ork.a(664L, 9L, 1L, false);
            GMTrace.o(20655303032832L, 153894);
            return;
          }
          if (paramBoolean) {
            com.tencent.mm.plugin.report.service.g.ork.a(664L, 7L, 1L, false);
          }
          localje.eME.eMF = b.aiF();
          localje.eME.eMG = b.aiD();
          localje.eME.eqi = false;
          com.tencent.mm.sdk.b.a.vgX.m(localje);
          b.this.jvX = new com.tencent.mm.plugin.i.c.c("message", b.aiF(), b.aiG(), b.this.jwa);
          b.this.jvU.A(b.this.jvX);
          if (((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyX, Long.valueOf(0L))).longValue() <= 0L) {
            com.tencent.mm.kernel.h.xy().xh().a(w.a.vyX, Long.valueOf(bg.Pu()));
          }
        }
        GMTrace.o(20655303032832L, 153894);
      }
    });
    GMTrace.o(20663221878784L, 153953);
  }
  
  public final void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(20663624531968L, 153956);
    w.i("MicroMsg.CalcWxService", "%s CalcWxService Initialized", new Object[] { aiH() });
    if (this.jvU == null)
    {
      w.i("MicroMsg.CalcWxService", "%s init calc wx thread", new Object[] { aiH() });
      this.jvU = new af("calc-wx");
    }
    paramf = com.tencent.mm.kernel.h.xy().cachePath + "WxFileIndex.db";
    this.jvS = com.tencent.mm.platformtools.g.a(hashCode(), paramf, jvQ, true);
    this.jvZ.put(Integer.valueOf(43), new com.tencent.mm.plugin.i.a.e());
    this.jvZ.put(Integer.valueOf(62), new com.tencent.mm.plugin.i.a.e());
    this.jvZ.put(Integer.valueOf(44), new com.tencent.mm.plugin.i.a.e());
    this.jvZ.put(Integer.valueOf(34), new f());
    this.jvZ.put(Integer.valueOf(3), new d());
    this.jvZ.put(Integer.valueOf(49), new com.tencent.mm.plugin.i.a.c());
    this.jvZ.put(Integer.valueOf(268435505), new com.tencent.mm.plugin.i.a.b());
    aiD();
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this.jwc, null);
    com.tencent.mm.sdk.b.a.vgX.a(this.jwd);
    paramf = ab.getContext();
    Object localObject = paramf.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    boolean bool;
    if (localObject != null)
    {
      int i = ((Intent)localObject).getIntExtra("status", -1);
      if ((i == 2) || (i == 5)) {
        bool = true;
      }
    }
    for (this.gNF = bool;; this.gNF = false)
    {
      this.gNG = ((PowerManager)paramf.getSystemService("power")).isScreenOn();
      this.gNE = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          GMTrace.i(20666308886528L, 153976);
          paramAnonymousContext = paramAnonymousIntent.getAction();
          int i = -1;
          switch (paramAnonymousContext.hashCode())
          {
          default: 
            switch (i)
            {
            }
            break;
          }
          for (;;)
          {
            if ((!b.this.gNF) || (b.this.gNG)) {
              break label270;
            }
            w.i("MicroMsg.CalcWxService", "it is charging and screen off, 5 min to calc");
            if (b.this.gNI != null) {
              break label309;
            }
            b.this.gNI = new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20665235144704L, 153968);
                w.i("MicroMsg.CalcWxService", "start to calc");
                if (b.this.aiE())
                {
                  b localb = b.this;
                  if (bg.aH(((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyW, Long.valueOf(0L))).longValue()) >= 259200000L)
                  {
                    if (localb.jvY != null) {
                      localb.jvY.isStop = true;
                    }
                    localb.jvY = new com.tencent.mm.plugin.i.c.b();
                    localb.post(localb.jvY);
                    com.tencent.mm.kernel.h.xy().xh().a(w.a.vyW, Long.valueOf(bg.Pv()));
                  }
                  GMTrace.o(20665235144704L, 153968);
                  return;
                }
                com.tencent.mm.plugin.report.service.g.ork.a(664L, 1L, 1L, false);
                b.this.aiC();
                GMTrace.o(20665235144704L, 153968);
              }
            };
            at.xB().h(b.this.gNI, 300000L);
            GMTrace.o(20666308886528L, 153976);
            return;
            if (!paramAnonymousContext.equals("android.intent.action.SCREEN_ON")) {
              break;
            }
            i = 0;
            break;
            if (!paramAnonymousContext.equals("android.intent.action.SCREEN_OFF")) {
              break;
            }
            i = 1;
            break;
            if (!paramAnonymousContext.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
              break;
            }
            i = 2;
            break;
            if (!paramAnonymousContext.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
              break;
            }
            i = 3;
            break;
            b.this.gNG = true;
            continue;
            b.this.gNG = false;
            continue;
            b.this.gNF = true;
            continue;
            b.this.gNF = false;
          }
          label270:
          if (b.this.gNI != null)
          {
            at.xB();
            af.F(b.this.gNI);
            b.this.gNI = null;
          }
          b.this.agW();
          label309:
          GMTrace.o(20666308886528L, 153976);
        }
      };
      localObject = new IntentFilter();
      ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_ON");
      ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_OFF");
      ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_CONNECTED");
      ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
      paramf.registerReceiver(this.gNE, (IntentFilter)localObject);
      com.tencent.mm.sdk.b.a.vgX.a(this.jwf);
      if (this.jwe) {
        com.tencent.mm.sdk.b.a.vgX.m(new bm());
      }
      GMTrace.o(20663624531968L, 153956);
      return;
      bool = false;
      break;
    }
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(20663758749696L, 153957);
    w.i("MicroMsg.CalcWxService", "CalcWxService Release");
    this.yvi.clear();
    this.rZT = false;
    if (this.jvS != null)
    {
      this.jvS.hA(hashCode());
      this.jvS = null;
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this.jwc);
    com.tencent.mm.sdk.b.a.vgX.c(this.jwd);
    this.jvZ.clear();
    if (this.gNE != null)
    {
      ab.getContext().unregisterReceiver(this.gNE);
      this.gNE = null;
    }
    if (this.gNI != null)
    {
      at.xB();
      af.F(this.gNI);
      this.gNI = null;
    }
    agW();
    if (this.jvU != null)
    {
      w.i("MicroMsg.CalcWxService", "%s quit calc wx thread", new Object[] { aiH() });
      this.jvU.ngv.quit();
    }
    this.jvU = null;
    com.tencent.mm.sdk.b.a.vgX.c(this.jwf);
    GMTrace.o(20663758749696L, 153957);
  }
  
  public final void post(Runnable paramRunnable)
  {
    GMTrace.i(20663087661056L, 153952);
    if (this.jvU != null)
    {
      this.jvU.A(paramRunnable);
      GMTrace.o(20663087661056L, 153952);
      return;
    }
    w.w("MicroMsg.CalcWxService", "%s post runnable but thread is null ", new Object[] { aiH() });
    GMTrace.o(20663087661056L, 153952);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */