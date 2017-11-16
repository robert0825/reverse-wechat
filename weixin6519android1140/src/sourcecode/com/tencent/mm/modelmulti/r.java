package com.tencent.mm.modelmulti;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.comm.WakerLock.IAutoUnlockCallback;
import com.tencent.mm.booter.f;
import com.tencent.mm.g.a.ai;
import com.tencent.mm.g.a.pz;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.zero.c;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.c.aqj;
import com.tencent.mm.protocal.c.aqk;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.protocal.w.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.bs;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import junit.framework.Assert;

public final class r
{
  private static Boolean gOh;
  private WakerLock fIX;
  public Queue<c> gOi;
  public Queue<c> gOj;
  public HashMap<c, Long> gOk;
  public c gOl;
  public long gOm;
  
  static
  {
    GMTrace.i(13445529337856L, 100177);
    gOh = null;
    GMTrace.o(13445529337856L, 100177);
  }
  
  public r()
  {
    GMTrace.i(13441368588288L, 100146);
    this.gOi = new LinkedList();
    this.gOj = new LinkedList();
    this.gOk = new HashMap();
    this.gOl = null;
    this.gOm = 0L;
    this.fIX = null;
    GMTrace.o(13441368588288L, 100146);
  }
  
  public static boolean JB()
  {
    GMTrace.i(13442710765568L, 100156);
    try
    {
      boolean bool = ((Boolean)PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager)ab.getContext().getSystemService("power"), new Object[0])).booleanValue();
      GMTrace.o(13442710765568L, 100156);
      return bool;
    }
    catch (Exception localException)
    {
      com.tencent.mm.plugin.report.d.oqe.a(99L, 45L, 1L, false);
      w.e("MicroMsg.SyncService", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", new Object[] { Boolean.valueOf(true), bg.f(localException) });
      GMTrace.o(13442710765568L, 100156);
    }
    return true;
  }
  
  private void a(final c paramc)
  {
    GMTrace.i(13442576547840L, 100155);
    if (m.JC())
    {
      w.e("MicroMsg.SyncService", "tryStart dkinit never do sync before init done :%s ", new Object[] { paramc });
      GMTrace.o(13442576547840L, 100155);
      return;
    }
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13450763829248L, 100216);
        if (paramc != null)
        {
          if (!(paramc instanceof r.f)) {
            break label59;
          }
          r.this.gOj.add(paramc);
        }
        for (;;)
        {
          r.this.b(null);
          GMTrace.o(13450763829248L, 100216);
          return;
          label59:
          r.this.gOi.add(paramc);
        }
      }
    });
    GMTrace.o(13442576547840L, 100155);
  }
  
  public static void a(c paramc, long paramLong)
  {
    GMTrace.i(16089752797184L, 119878);
    if (paramc == null)
    {
      GMTrace.o(16089752797184L, 119878);
      return;
    }
    int i = bg.e((Integer)com.tencent.mm.plugin.report.d.a((int)bg.aH(paramLong), new int[] { 200, 500, 800, 1500, 3000, 5000, 10000, 30000, 60000, 90000 }, new Integer[] { Integer.valueOf(70), Integer.valueOf(71), Integer.valueOf(72), Integer.valueOf(73), Integer.valueOf(74), Integer.valueOf(75), Integer.valueOf(76), Integer.valueOf(77), Integer.valueOf(78), Integer.valueOf(79), Integer.valueOf(80) }));
    com.tencent.mm.plugin.report.d.oqe.a(99L, i, 1L, false);
    GMTrace.o(16089752797184L, 119878);
  }
  
  public static void a(e parame)
  {
    GMTrace.i(16089618579456L, 119877);
    com.tencent.mm.plugin.report.d.oqe.a(99L, parame.scene, 1L, false);
    com.tencent.mm.plugin.report.d.oqe.a(99L, 0L, 1L, false);
    parame = com.tencent.mm.plugin.report.d.oqe;
    if (com.tencent.mm.sdk.a.b.foreground) {}
    for (long l = 241L;; l = 242L)
    {
      parame.a(99L, l, 1L, false);
      GMTrace.o(16089618579456L, 119877);
      return;
    }
  }
  
  public static void a(boolean paramBoolean, aqk paramaqk, c paramc)
  {
    GMTrace.i(16089484361728L, 119876);
    com.tencent.mm.kernel.h.xz();
    byte[] arrayOfByte4 = bg.St(bg.nl((String)com.tencent.mm.kernel.h.xy().xh().get(8195, new byte[0])));
    byte[] arrayOfByte2 = com.tencent.mm.platformtools.n.a(paramaqk.tZA);
    w.i("MicroMsg.SyncService", "processResp %s synckey req:%s  shouldMerge:%s", new Object[] { paramc, ad.bd(arrayOfByte4), Boolean.valueOf(paramBoolean) });
    w.i("MicroMsg.SyncService", "processResp %s synckey resp:%s", new Object[] { paramc, ad.bd(arrayOfByte2) });
    if ((paramaqk.tZA != null) && (paramaqk.tZA.uNN > 0))
    {
      if (paramBoolean)
      {
        byte[] arrayOfByte3 = ad.g(arrayOfByte4, arrayOfByte2);
        w.i("MicroMsg.SyncService", "processResp %s synckey merge:%s", new Object[] { paramc, ad.bd(arrayOfByte3) });
        byte[] arrayOfByte1;
        if (arrayOfByte3 != null)
        {
          arrayOfByte1 = arrayOfByte3;
          if (arrayOfByte3.length > 0) {}
        }
        else
        {
          arrayOfByte1 = arrayOfByte2;
        }
        paramaqk.tZA = com.tencent.mm.platformtools.n.H(arrayOfByte1);
      }
      if (!Arrays.equals(arrayOfByte4, com.tencent.mm.platformtools.n.a(paramaqk.tZA)))
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().set(8195, bg.bs(com.tencent.mm.platformtools.n.a(paramaqk.tZA)));
        ab.getContext().getSharedPreferences("notify_sync_pref", 4).edit().putString("notify_sync_key_keybuf", bg.bs(com.tencent.mm.platformtools.n.a(paramaqk.tZA))).commit();
        GMTrace.o(16089484361728L, 119876);
        return;
      }
      w.i("MicroMsg.SyncService", "processResp %s  Sync Key Not change, not save", new Object[] { paramc });
      GMTrace.o(16089484361728L, 119876);
      return;
    }
    com.tencent.mm.plugin.report.d.oqe.a(99L, 47L, 1L, false);
    GMTrace.o(16089484361728L, 119876);
  }
  
  public static void assertTrue(String paramString, boolean paramBoolean)
  {
    GMTrace.i(13441637023744L, 100148);
    if (paramBoolean)
    {
      GMTrace.o(13441637023744L, 100148);
      return;
    }
    w.e("MicroMsg.SyncService", "ASSERT now msg:%s", new Object[] { paramString });
    Assert.assertTrue(paramString, paramBoolean);
    GMTrace.o(13441637023744L, 100148);
  }
  
  private static boolean yB()
  {
    GMTrace.i(13441502806016L, 100147);
    if ((com.tencent.mm.kernel.a.wF()) || (!com.tencent.mm.kernel.h.xw().wL()))
    {
      GMTrace.o(13441502806016L, 100147);
      return false;
    }
    if (gOh != null)
    {
      boolean bool = gOh.booleanValue();
      GMTrace.o(13441502806016L, 100147);
      return bool;
    }
    gOh = Boolean.valueOf(true);
    GMTrace.o(13441502806016L, 100147);
    return true;
  }
  
  /* Error */
  public final void JI()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 371
    //   5: ldc_w 373
    //   8: invokestatic 62	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   15: ifnull +13 -> 28
    //   18: aload_0
    //   19: getfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   22: invokevirtual 378	com/tencent/mars/comm/WakerLock:isLocking	()Z
    //   25: ifne +65 -> 90
    //   28: aload_0
    //   29: getfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   32: ifnonnull +44 -> 76
    //   35: ldc_w 380
    //   38: astore_1
    //   39: ldc -107
    //   41: ldc_w 382
    //   44: iconst_2
    //   45: anewarray 4	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aload_1
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: getstatic 226	com/tencent/mm/sdk/a/b:foreground	Z
    //   57: invokestatic 155	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   60: aastore
    //   61: invokestatic 385	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: ldc2_w 371
    //   67: ldc_w 373
    //   70: invokestatic 67	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   73: aload_0
    //   74: monitorexit
    //   75: return
    //   76: aload_0
    //   77: getfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   80: invokevirtual 378	com/tencent/mars/comm/WakerLock:isLocking	()Z
    //   83: invokestatic 155	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   86: astore_1
    //   87: goto -48 -> 39
    //   90: aload_0
    //   91: getfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   94: invokevirtual 388	com/tencent/mars/comm/WakerLock:unLock	()V
    //   97: ldc2_w 371
    //   100: ldc_w 373
    //   103: invokestatic 67	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   106: goto -33 -> 73
    //   109: astore_1
    //   110: aload_0
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	r
    //   38	49	1	localObject1	Object
    //   109	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	28	109	finally
    //   28	35	109	finally
    //   39	73	109	finally
    //   76	87	109	finally
    //   90	106	109	finally
  }
  
  public final int a(long paramLong, int paramInt, String paramString)
  {
    GMTrace.i(13441771241472L, 100149);
    boolean bool = yB();
    w.i("MicroMsg.SyncService", "dealWithSelectoru checkUse:%s selector:%d aiScene:%d xml:%s [%s] ", new Object[] { Boolean.valueOf(bool), Long.valueOf(paramLong), Integer.valueOf(paramInt), paramString, bg.bQW() });
    int j = 0;
    Object localObject;
    if ((0x100 & paramLong) != 0L)
    {
      localObject = new pz();
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
    paramLong = 0xFFFFFFFFFFFFFEFF & paramLong & 0x5F;
    int i = j;
    if (paramLong != 0L)
    {
      i = j;
      if (com.tencent.mm.kernel.h.xw().wL())
      {
        com.tencent.mm.kernel.h.xz();
        i = j;
        if (com.tencent.mm.kernel.h.xy().xh() != null)
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().set(8196, Long.valueOf(paramLong));
          if (bool) {
            break label301;
          }
          localObject = new l(paramInt);
          paramInt = localObject.hashCode();
          w.i("MicroMsg.SyncService", "dealWithSelector syncHash: %d", new Object[] { Integer.valueOf(paramInt) });
          com.tencent.mm.kernel.h.xz();
          i = paramInt;
          if (!com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject, 0)) {
            w.w("MicroMsg.SyncService", "dealWithSelector doScene failed, hash: %d, zero hash will be return.", new Object[] { Integer.valueOf(paramInt) });
          }
        }
      }
    }
    label301:
    for (i = 0;; i = d(paramInt, 7, false))
    {
      if (!bg.nm(paramString))
      {
        localObject = new ai();
        ((ai)localObject).eBo.type = 3;
        ((ai)localObject).eBo.eBq = paramString;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      }
      GMTrace.o(13441771241472L, 100149);
      return i;
    }
  }
  
  public final void a(w.b paramb, int paramInt, long paramLong)
  {
    GMTrace.i(13441905459200L, 100150);
    boolean bool = yB();
    w.i("MicroMsg.SyncService", "triggerNotifyDataSync checkUse:%s resp:%s syncflag:%s recvtime:%s [%s]", new Object[] { Boolean.valueOf(bool), paramb, Integer.valueOf(paramInt), Long.valueOf(paramLong), bg.bQW() });
    if (!bool)
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(new l(paramb, paramInt, paramLong), 0);
      GMTrace.o(13441905459200L, 100150);
      return;
    }
    a(new f(paramb, paramInt, paramLong));
    GMTrace.o(13441905459200L, 100150);
  }
  
  public final void b(final c paramc)
  {
    GMTrace.i(16089350144000L, 119875);
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        boolean bool1 = true;
        boolean bool2 = false;
        GMTrace.i(13446737297408L, 100186);
        if ((com.tencent.mm.kernel.a.wF()) || (!com.tencent.mm.kernel.h.xw().wL()))
        {
          w.w("MicroMsg.SyncService", "begin to doLoop but MMCore account has not ready or MMCore is hold.");
          GMTrace.o(13446737297408L, 100186);
          return;
        }
        if (paramc != null)
        {
          w.i("MicroMsg.SyncService", "finish proc:%s running:%s RunTime:%s ", new Object[] { paramc, r.this.gOl, Long.valueOf(bg.aH(r.this.gOm)) });
          if (paramc != r.this.gOl)
          {
            localObject = r.this.gOk.keySet().iterator();
            while (((Iterator)localObject).hasNext())
            {
              r.c localc = (r.c)((Iterator)localObject).next();
              w.w("MicroMsg.SyncService", "check unfinish proc :%s timediff:%s", new Object[] { localc, Long.valueOf(bg.aH(((Long)r.this.gOk.get(localc)).longValue())) });
            }
            l = bg.a((Long)r.this.gOk.remove(paramc), -1L);
            localObject = "oldproc timeout, should in timeoutMap:" + paramc;
            bool1 = bool2;
            if (l != -1L) {
              bool1 = true;
            }
            r.assertTrue((String)localObject, bool1);
            GMTrace.o(13446737297408L, 100186);
            return;
          }
          r.a(paramc, r.this.gOm);
          r.this.gOl = null;
          r.this.gOm = 0L;
          r.this.JI();
        }
        if (r.this.gOl != null)
        {
          l = bg.aH(r.this.gOm);
          if (l <= 90000L) {
            break label841;
          }
          w.w("MicroMsg.SyncService", "tryStart last proc:%s TIMEOUT:%s Run Next Now.", new Object[] { r.this.gOl, Long.valueOf(l) });
          localObject = r.this.gOl;
          if (!(localObject instanceof r.e)) {
            break label561;
          }
          com.tencent.mm.plugin.report.d.oqe.i(11098, new Object[] { Integer.valueOf(3571), com.tencent.mm.sdk.a.b.foreground + ";" + r.JB() });
          localObject = com.tencent.mm.plugin.report.d.oqe;
          if (!com.tencent.mm.sdk.a.b.foreground) {
            break label554;
          }
        }
        label554:
        for (long l = 30L;; l = 34L)
        {
          ((com.tencent.mm.plugin.report.d)localObject).a(99L, l, 1L, false);
          r.this.gOk.put(r.this.gOl, Long.valueOf(r.this.gOm));
          r.this.gOl = null;
          r.this.gOm = 0L;
          r.this.JI();
          localObject = (com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class);
          if (!((com.tencent.mm.plugin.zero.b.b)localObject).bIL().BQ()) {
            break;
          }
          w.w("MicroMsg.SyncService", "Warning: Set SyncService Pause Now.");
          ((com.tencent.mm.plugin.zero.b.b)localObject).bIL().BO();
          GMTrace.o(13446737297408L, 100186);
          return;
        }
        label561:
        if ((localObject instanceof r.f))
        {
          com.tencent.mm.plugin.report.d.oqe.i(11098, new Object[] { Integer.valueOf(3572), com.tencent.mm.sdk.a.b.foreground + ";" + r.JB() });
          localObject = com.tencent.mm.plugin.report.d.oqe;
          if (com.tencent.mm.sdk.a.b.foreground) {}
          for (l = 31L;; l = 35L)
          {
            ((com.tencent.mm.plugin.report.d)localObject).a(99L, l, 1L, false);
            break;
          }
        }
        if ((localObject instanceof r.d))
        {
          com.tencent.mm.plugin.report.d.oqe.i(11098, new Object[] { Integer.valueOf(3573), com.tencent.mm.sdk.a.b.foreground + ";" + r.JB() });
          localObject = com.tencent.mm.plugin.report.d.oqe;
          if (com.tencent.mm.sdk.a.b.foreground) {}
          for (l = 32L;; l = 36L)
          {
            ((com.tencent.mm.plugin.report.d)localObject).a(99L, l, 1L, false);
            break;
          }
        }
        com.tencent.mm.plugin.report.d.oqe.i(11098, new Object[] { Integer.valueOf(3574), com.tencent.mm.sdk.a.b.foreground + ";" + r.JB() });
        Object localObject = com.tencent.mm.plugin.report.d.oqe;
        if (com.tencent.mm.sdk.a.b.foreground) {}
        for (l = 33L;; l = 37L)
        {
          ((com.tencent.mm.plugin.report.d)localObject).a(99L, l, 1L, false);
          break;
        }
        label841:
        w.i("MicroMsg.SyncService", "tryStart last proc:%s running:%s ", new Object[] { r.this.gOl, Long.valueOf(l) });
        GMTrace.o(13446737297408L, 100186);
        return;
        if (((com.tencent.mm.plugin.zero.b.b)localObject).bIL().BR())
        {
          w.w("MicroMsg.SyncService", "Warning: SyncService is Paused.");
          GMTrace.o(13446737297408L, 100186);
          return;
        }
        localObject = new r.d(r.this);
        if (((r.d)localObject).a(null))
        {
          r.this.kB("LightPush");
          r.this.gOl = ((r.c)localObject);
          r.this.gOm = bg.Pv();
          GMTrace.o(13446737297408L, 100186);
          return;
        }
        while (!r.this.gOj.isEmpty())
        {
          localObject = (r.c)r.this.gOj.poll();
          w.i("MicroMsg.SyncService", "tryStart check NotifyData ListSize:%s proc:%s", new Object[] { Integer.valueOf(r.this.gOj.size()), localObject });
          if ((localObject != null) && (((r.c)localObject).a(null)))
          {
            r.this.kB("NotifyData");
            r.this.gOl = ((r.c)localObject);
            r.this.gOm = bg.Pv();
            GMTrace.o(13446737297408L, 100186);
            return;
          }
        }
        if (!r.this.gOi.isEmpty())
        {
          localObject = (r.c)r.this.gOi.poll();
          w.i("MicroMsg.SyncService", "tryStart check Sync ListSize:%s proc:%s", new Object[] { Integer.valueOf(r.this.gOi.size()), localObject });
          if ((localObject != null) && (((r.c)localObject).a(r.this.gOi)))
          {
            r.this.kB("NetSync");
            r.this.gOl = ((r.c)localObject);
            r.this.gOm = bg.Pv();
            GMTrace.o(13446737297408L, 100186);
            return;
          }
        }
        w.i("MicroMsg.SyncService", "tryStart FINISH Check running:%s sync:%s notify:%s", new Object[] { r.this.gOl, Integer.valueOf(r.this.gOi.size()), Integer.valueOf(r.this.gOj.size()) });
        if ((r.this.gOl == null) && (r.this.gOi.isEmpty()) && (r.this.gOj.isEmpty())) {}
        for (;;)
        {
          r.assertTrue("", bool1);
          GMTrace.o(13446737297408L, 100186);
          return;
          bool1 = false;
        }
      }
    });
    GMTrace.o(16089350144000L, 119875);
  }
  
  public final int d(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(13442173894656L, 100152);
    e locale = new e(paramInt1, paramInt2, paramBoolean);
    a(locale);
    paramInt1 = locale.hashCode();
    GMTrace.o(13442173894656L, 100152);
    return paramInt1;
  }
  
  public final int gE(int paramInt)
  {
    GMTrace.i(13442039676928L, 100151);
    boolean bool = yB();
    w.i("MicroMsg.SyncService", "triggerSync checkUse:%s scene:%s [%s]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt), bg.bQW() });
    if (!bool)
    {
      l locall = new l(paramInt);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(locall, 0);
      paramInt = locall.hashCode();
      GMTrace.o(13442039676928L, 100151);
      return paramInt;
    }
    paramInt = d(paramInt, 7, false);
    GMTrace.o(13442039676928L, 100151);
    return paramInt;
  }
  
  /* Error */
  public final void kB(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 508
    //   7: ldc_w 510
    //   10: invokestatic 62	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: ldc -107
    //   15: ldc_w 512
    //   18: iconst_3
    //   19: anewarray 4	java/lang/Object
    //   22: dup
    //   23: iconst_0
    //   24: aload_1
    //   25: aastore
    //   26: dup
    //   27: iconst_1
    //   28: aload_0
    //   29: getfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   32: aastore
    //   33: dup
    //   34: iconst_2
    //   35: invokestatic 405	com/tencent/mm/sdk/platformtools/bg:bQW	()Lcom/tencent/mm/sdk/platformtools/ah;
    //   38: aastore
    //   39: invokestatic 285	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload_0
    //   43: getfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   46: ifnonnull +25 -> 71
    //   49: aload_0
    //   50: new 375	com/tencent/mars/comm/WakerLock
    //   53: dup
    //   54: invokestatic 115	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   57: new 6	com/tencent/mm/modelmulti/r$1
    //   60: dup
    //   61: aload_0
    //   62: invokespecial 515	com/tencent/mm/modelmulti/r$1:<init>	(Lcom/tencent/mm/modelmulti/r;)V
    //   65: invokespecial 518	com/tencent/mars/comm/WakerLock:<init>	(Landroid/content/Context;Lcom/tencent/mars/comm/WakerLock$IAutoUnlockCallback;)V
    //   68: putfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   71: aload_0
    //   72: getfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   75: invokevirtual 378	com/tencent/mars/comm/WakerLock:isLocking	()Z
    //   78: ifne +39 -> 117
    //   81: ldc_w 520
    //   84: iload_2
    //   85: invokestatic 521	com/tencent/mm/modelmulti/r:assertTrue	(Ljava/lang/String;Z)V
    //   88: getstatic 226	com/tencent/mm/sdk/a/b:foreground	Z
    //   91: ifne +14 -> 105
    //   94: aload_0
    //   95: getfield 92	com/tencent/mm/modelmulti/r:fIX	Lcom/tencent/mars/comm/WakerLock;
    //   98: ldc2_w 522
    //   101: aload_1
    //   102: invokevirtual 526	com/tencent/mars/comm/WakerLock:lock	(JLjava/lang/String;)V
    //   105: ldc2_w 508
    //   108: ldc_w 510
    //   111: invokestatic 67	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   114: aload_0
    //   115: monitorexit
    //   116: return
    //   117: iconst_0
    //   118: istore_2
    //   119: goto -38 -> 81
    //   122: astore_1
    //   123: aload_0
    //   124: monitorexit
    //   125: aload_1
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	r
    //   0	127	1	paramString	String
    //   1	118	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	71	122	finally
    //   71	81	122	finally
    //   81	105	122	finally
    //   105	114	122	finally
  }
  
  final class a
  {
    public int gMp;
    public boolean gOq;
    public aqk gOr;
    public r.b gOs;
    public r.c gOt;
    aj gOu;
    
    public a(r.c paramc, boolean paramBoolean, aqk paramaqk, r.b paramb)
    {
      GMTrace.i(13441100152832L, 100144);
      this.gMp = 0;
      this.gOq = false;
      this.gOr = null;
      this.gOs = null;
      this.gOu = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(13440965935104L, 100143);
          if ((com.tencent.mm.kernel.h.xw().wL()) && (!com.tencent.mm.kernel.a.wF()))
          {
            com.tencent.mm.kernel.h.xz();
            if (com.tencent.mm.kernel.h.xy() != null)
            {
              com.tencent.mm.kernel.h.xz();
              if (com.tencent.mm.kernel.h.xy().xh() != null) {
                break label130;
              }
            }
          }
          Object localObject = r.a.this.gOt;
          boolean bool1 = com.tencent.mm.kernel.h.xw().wL();
          boolean bool2 = com.tencent.mm.kernel.a.wF();
          com.tencent.mm.kernel.h.xz();
          w.e("MicroMsg.SyncService", "processResp %s accready:%s hold:%s accstg:%s ", new Object[] { localObject, Boolean.valueOf(bool1), Boolean.valueOf(bool2), com.tencent.mm.kernel.h.xy() });
          r.a.this.gOs.gF(0);
          GMTrace.o(13440965935104L, 100143);
          return false;
          label130:
          localObject = r.a.this.gOr.tZD.jhd;
          c localc = new c();
          localc.bc(r.a.this.gOt);
          long l1 = bg.Pv();
          long l2;
          do
          {
            if (r.a.this.gMp >= ((LinkedList)localObject).size()) {
              break;
            }
            ((LinkedList)localObject).size();
            if (!localc.a((nk)((LinkedList)localObject).get(r.a.this.gMp), false)) {
              com.tencent.mm.plugin.report.d.oqe.a(99L, 46L, 1L, false);
            }
            r.a locala = r.a.this;
            locala.gMp += 1;
            l2 = bg.aH(l1);
            w.i("MicroMsg.SyncService", "processResp %s time:%s size:%s index:%s", new Object[] { r.a.this.gOt, Long.valueOf(l2), Integer.valueOf(((LinkedList)localObject).size()), Integer.valueOf(r.a.this.gMp - 1) });
          } while (l2 < 500L);
          localc.bd(r.a.this.gOt);
          if (r.a.this.gMp < ((LinkedList)localObject).size())
          {
            w.i("MicroMsg.SyncService", "processResp %s time:%s size:%s index:%s Shold Continue.", new Object[] { r.a.this.gOt, Long.valueOf(bg.aH(l1)), Integer.valueOf(((LinkedList)localObject).size()), Integer.valueOf(r.a.this.gMp - 1) });
            GMTrace.o(13440965935104L, 100143);
            return true;
          }
          r.a(r.a.this.gOq, r.a.this.gOr, r.a.this.gOt);
          r.a.this.gOs.gF(((LinkedList)localObject).size());
          GMTrace.o(13440965935104L, 100143);
          return false;
        }
      }, true);
      this.gOs = paramb;
      this.gOt = paramc;
      this.gOq = paramBoolean;
      this.gOr = paramaqk;
      this.gMp = 0;
      if ((this.gOs != null) && (this.gOt != null)) {}
      for (boolean bool = true;; bool = false)
      {
        r.assertTrue("", bool);
        if (this.gOr != null) {
          break;
        }
        r.assertTrue("resp Not null", false);
        w.w("MicroMsg.SyncService", "CmdProcHandler %s NewSyncResponse is null", new Object[] { this.gOt });
        this.gOs.gF(0);
        GMTrace.o(13441100152832L, 100144);
        return;
      }
      if ((com.tencent.mm.kernel.h.xw().wL()) && (!com.tencent.mm.kernel.a.wF()))
      {
        com.tencent.mm.kernel.h.xz();
        if (com.tencent.mm.kernel.h.xy() != null)
        {
          com.tencent.mm.kernel.h.xz();
          if (com.tencent.mm.kernel.h.xy().xh() != null) {
            break label289;
          }
        }
      }
      this$1 = this.gOt;
      paramBoolean = com.tencent.mm.kernel.h.xw().wL();
      bool = com.tencent.mm.kernel.a.wF();
      com.tencent.mm.kernel.h.xz();
      w.e("MicroMsg.SyncService", "CmdProcHandler %s accready:%s hold:%s accstg:%s ", new Object[] { r.this, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), com.tencent.mm.kernel.h.xy() });
      this.gOs.gF(0);
      GMTrace.o(13441100152832L, 100144);
      return;
      label289:
      int i;
      if ((paramaqk.tZD == null) || (paramaqk.tZD.jhd == null) || (paramaqk.tZD.jhd.size() <= 0))
      {
        i = 0;
        int j = bg.e((Integer)com.tencent.mm.plugin.report.d.a(i, new int[] { 0, 1, 2, 3, 5, 10 }, new Integer[] { Integer.valueOf(249), Integer.valueOf(248), Integer.valueOf(247), Integer.valueOf(246), Integer.valueOf(245), Integer.valueOf(244), Integer.valueOf(243) }));
        com.tencent.mm.plugin.report.d.oqe.a(99L, j, 1L, false);
        if (r.JB()) {
          break label749;
        }
        this$1 = com.tencent.mm.plugin.report.d.oqe;
        if (i <= 0) {
          break label741;
        }
      }
      label741:
      for (long l1 = 221L;; l1 = 218L)
      {
        r.this.a(99L, l1, 1L, false);
        long l2 = paramaqk.uGH;
        l1 = l2;
        if (String.valueOf(l2).length() == 10) {
          l1 = l2 * 1000L;
        }
        l2 = System.currentTimeMillis();
        long l3 = l2 - l1;
        w.i("MicroMsg.SyncService", "[oneliang] client time is:%s,server time is:%s,diff time is:%s, diff second time is:%s,just save millisecond diff time", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Long.valueOf(l3), Long.valueOf(l3 / 1000L) });
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(com.tencent.mm.storage.w.a.vxJ, Long.valueOf(l3));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xw().aG(this.gOr.jhA, this.gOr.uGG);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xw();
        com.tencent.mm.kernel.a.ff(this.gOr.jhA);
        if ((this.gOr.tZD != null) && (this.gOr.tZD.jhd != null) && (this.gOr.tZD.jhd.size() > 0)) {
          break label827;
        }
        w.w("MicroMsg.SyncService", "CmdProcHandler %s cmdlist is null.  synckey may be changed, I have to merge it.", new Object[] { this.gOt });
        r.a(paramBoolean, this.gOr, this.gOt);
        this.gOs.gF(0);
        GMTrace.o(13441100152832L, 100144);
        return;
        i = paramaqk.tZD.jhd.size();
        break;
      }
      label749:
      if (!com.tencent.mm.sdk.a.b.foreground)
      {
        this$1 = com.tencent.mm.plugin.report.d.oqe;
        if (i > 0) {}
        for (l1 = 220L;; l1 = 217L)
        {
          r.this.a(99L, l1, 1L, false);
          break;
        }
      }
      this$1 = com.tencent.mm.plugin.report.d.oqe;
      if (i > 0) {}
      for (l1 = 219L;; l1 = 216L)
      {
        r.this.a(99L, l1, 1L, false);
        break;
      }
      label827:
      w.i("MicroMsg.SyncService", "CmdProcHandler %s Start docmd:%s respStatus:%s respOnlineVer:%s", new Object[] { this.gOt, Integer.valueOf(this.gOr.tZD.jhd.size()), Integer.valueOf(this.gOr.jhA), Integer.valueOf(this.gOr.uGG) });
      this.gOu.z(50L, 50L);
      GMTrace.o(13441100152832L, 100144);
    }
  }
  
  static abstract interface b
  {
    public abstract boolean gF(int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract boolean a(Queue<c> paramQueue);
  }
  
  final class d
    implements r.c
  {
    d()
    {
      GMTrace.i(13445931991040L, 100180);
      GMTrace.o(13445931991040L, 100180);
    }
    
    public final boolean a(Queue<r.c> paramQueue)
    {
      GMTrace.i(13446066208768L, 100181);
      Object localObject = new PInt();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xw();
      paramQueue = f.a((PInt)localObject, com.tencent.mm.kernel.a.ww());
      int j = ((PInt)localObject).value;
      if (paramQueue != null) {}
      for (final int i = paramQueue.length;; i = -1)
      {
        w.i("MicroMsg.SyncService", "%s index:%d, buf.len:%d ", new Object[] { this, Integer.valueOf(j), Integer.valueOf(i) });
        if ((((PInt)localObject).value != 0) && (!bg.bq(paramQueue))) {
          break;
        }
        GMTrace.o(13446066208768L, 100181);
        return false;
      }
      i = ((PInt)localObject).value;
      try
      {
        localObject = new w.b();
        ((w.b)localObject).y(paramQueue);
        paramQueue = ((w.b)localObject).tKU;
        if (paramQueue == null)
        {
          GMTrace.o(13446066208768L, 100181);
          return false;
        }
      }
      catch (Exception paramQueue)
      {
        for (;;)
        {
          com.tencent.mm.plugin.report.d.oqe.a(99L, 38L, 1L, false);
          w.e("MicroMsg.SyncService", "%s index:%s Resp fromProtoBuf failed ", new Object[] { this, Integer.valueOf(i) });
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xw();
          f.ay(i, com.tencent.mm.kernel.a.ww());
          paramQueue = null;
        }
      }
      catch (Error paramQueue)
      {
        for (;;)
        {
          com.tencent.mm.plugin.report.d.oqe.a(99L, 39L, 1L, false);
          long l1 = Runtime.getRuntime().freeMemory() / 1000L;
          long l2 = Runtime.getRuntime().totalMemory() / 1000L;
          w.i("MicroMsg.SyncService", "%s index:%s memoryInfo avail/total, dalvik[%dk, %dk, user:%dk]", new Object[] { this, Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l2 - l1) });
          r.assertTrue("LightPush memory error", false);
          paramQueue = null;
        }
        com.tencent.mm.plugin.report.d.oqe.a(99L, 20L, 1L, false);
        new r.a(r.this, this, true, paramQueue, new r.b()
        {
          public final boolean gF(int paramAnonymousInt)
          {
            GMTrace.i(13445797773312L, 100179);
            w.i("MicroMsg.SyncService", "%s onFinishCmd index:%s ", new Object[] { r.d.this, Integer.valueOf(i) });
            paramAnonymousInt = i;
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xw();
            f.ay(paramAnonymousInt, com.tencent.mm.kernel.a.ww());
            r.this.b(r.d.this);
            GMTrace.o(13445797773312L, 100179);
            return true;
          }
        });
        GMTrace.o(13446066208768L, 100181);
      }
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(13446200426496L, 100182);
      String str = "LightPush[" + hashCode() + "]";
      GMTrace.o(13446200426496L, 100182);
      return str;
    }
  }
  
  final class e
    extends com.tencent.mm.ad.k
    implements r.c, com.tencent.mm.network.k
  {
    public int cbU;
    private boolean gOA;
    public com.tencent.mm.ad.e gOy;
    public boolean gOz;
    private q guL;
    public int scene;
    
    public e(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(13432912871424L, 100083);
      this.gOA = false;
      this.scene = paramInt1;
      this.cbU = paramInt2;
      this.gOz = paramBoolean;
      GMTrace.o(13432912871424L, 100083);
    }
    
    public final boolean DH()
    {
      GMTrace.i(13433315524608L, 100086);
      GMTrace.o(13433315524608L, 100086);
      return false;
    }
    
    public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
    {
      GMTrace.i(13433181306880L, 100085);
      this.gOy = parame1;
      int i = a(parame, this.guL, this);
      GMTrace.o(13433181306880L, 100085);
      return i;
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, final String paramString, q paramq, byte[] paramArrayOfByte)
    {
      GMTrace.i(13433449742336L, 100087);
      if ((paramq == null) || (paramq.getType() != 138))
      {
        com.tencent.mm.plugin.report.d.oqe.a(99L, 44L, 1L, false);
        if (paramq == null) {}
        for (paramInt1 = -2;; paramInt1 = paramq.getType())
        {
          w.e("MicroMsg.SyncService", "%s onGYNetEnd error type:%d", new Object[] { this, Integer.valueOf(paramInt1) });
          GMTrace.o(13433449742336L, 100087);
          return;
        }
      }
      if (this.gOA)
      {
        w.e("MicroMsg.SyncService", "%s onGYNetEnd has been callback  , give up  ", new Object[] { this });
        GMTrace.o(13433449742336L, 100087);
        return;
      }
      this.gOA = true;
      if (paramq == this.guL) {}
      for (boolean bool = true;; bool = false)
      {
        r.assertTrue("Check rr failed.", bool);
        bool = true;
        if ((paramInt2 != 0) || (paramInt3 != 0))
        {
          w.e("MicroMsg.SyncService", "%s onGYNetEnd scene error Callback [%s,%s,%s ] rr:%s", new Object[] { this, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, paramq });
          if ((paramInt2 != 4) || (paramInt3 != 63530)) {
            break;
          }
          w.w("MicroMsg.SyncService", "%s onGYNetEnd MM_ERR_KEYBUF_INVALID , not merge key buf", new Object[] { this });
          com.tencent.mm.plugin.report.d.oqe.a(99L, 42L, 1L, false);
          bool = false;
        }
        paramString = ((w.b)paramq.AZ()).tKU;
        new r.a(r.this, this, bool, paramString, new r.b()
        {
          public final boolean gF(int paramAnonymousInt)
          {
            GMTrace.i(13437073620992L, 100114);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().set(8196, Long.valueOf(paramString.tXv));
            boolean bool;
            if ((paramString.tXv & r.e.this.cbU) != 0)
            {
              bool = true;
              w.i("MicroMsg.SyncService", "%s onFinishCmd ContinueFlag:%s canCont:%s SNSSYNCKEY:%s", new Object[] { r.e.this, Integer.valueOf(paramString.tXv), Boolean.valueOf(bool), Integer.valueOf(paramString.tXv & 0x100) });
              if ((!bool) && ((paramString.tXv & 0x100) != 0))
              {
                pz localpz = new pz();
                com.tencent.mm.sdk.b.a.vgX.m(localpz);
              }
              if (bool)
              {
                if ((paramAnonymousInt != 0) || (!r.e.this.gOz)) {
                  break label229;
                }
                w.w("MicroMsg.SyncService", "%s onFinishCmd is continue Sync , but no Cmd , I will not continue again.", new Object[] { r.e.this });
              }
            }
            for (;;)
            {
              r.e.this.gOy.a(0, 0, "", r.e.this);
              r.this.b(r.e.this);
              GMTrace.o(13437073620992L, 100114);
              return true;
              bool = false;
              break;
              label229:
              r.this.d(r.e.this.scene, r.e.this.cbU, true);
            }
          }
        });
        GMTrace.o(13433449742336L, 100087);
        return;
      }
      com.tencent.mm.plugin.report.d.oqe.i(11098, new Object[] { Integer.valueOf(3501), this.scene + ";" + paramInt2 + ";" + paramInt3 + ";" + com.tencent.mm.sdk.a.b.foreground + ";" + r.JB() });
      com.tencent.mm.plugin.report.d.oqe.a(99L, 43L, 1L, false);
      this.gOy.a(paramInt2, paramInt3, paramString, this);
      r.this.b(this);
      GMTrace.o(13433449742336L, 100087);
    }
    
    public final boolean a(Queue<r.c> paramQueue)
    {
      GMTrace.i(13432644435968L, 100081);
      int i = this.scene;
      int j = this.cbU;
      boolean bool1 = this.gOz;
      Object localObject;
      label91:
      boolean bool2;
      label97:
      boolean bool3;
      if (paramQueue == null)
      {
        localObject = "null";
        w.i("MicroMsg.SyncService", "%s begin run scene:%s selector:%s isContinue:%s List:%s", new Object[] { this, Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool1), localObject });
        if (paramQueue == null) {
          break label482;
        }
        if ((paramQueue != null) && (!paramQueue.isEmpty())) {
          break label251;
        }
        bool1 = false;
        bool2 = false;
        if (paramQueue.isEmpty()) {
          break label472;
        }
        localObject = (e)paramQueue.poll();
        this.cbU |= ((e)localObject).cbU;
        if (((e)localObject).scene != 3) {
          break label450;
        }
        bool3 = true;
      }
      for (;;)
      {
        w.i("MicroMsg.SyncService", "%s pop:%s[%s] scene:%s selector:%s iscontinue:%s hashcont:%s hasBgfg:%s", new Object[] { this, Integer.valueOf(paramQueue.size()), localObject, Integer.valueOf(((e)localObject).scene), Integer.valueOf(((e)localObject).cbU), Boolean.valueOf(((e)localObject).gOz), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        bool1 = bool3;
        break label97;
        localObject = Integer.valueOf(paramQueue.size());
        break;
        label251:
        if (paramQueue.size() >= 5) {
          com.tencent.mm.plugin.report.d.oqe.i(11098, new Object[] { Integer.valueOf(3590), paramQueue.size() + ";" + com.tencent.mm.sdk.a.b.foreground + ";" + r.JB() });
        }
        i = bg.e((Integer)com.tencent.mm.plugin.report.d.a(paramQueue.size(), new int[] { 1, 2, 3, 4, 5, 10 }, new Integer[] { Integer.valueOf(60), Integer.valueOf(61), Integer.valueOf(62), Integer.valueOf(63), Integer.valueOf(64), Integer.valueOf(65), Integer.valueOf(66) }));
        com.tencent.mm.plugin.report.d.oqe.a(99L, i, 1L, false);
        break label91;
        label450:
        bool3 = bool1;
        if (((e)localObject).gOz)
        {
          bool2 = true;
          bool3 = bool1;
        }
      }
      label472:
      if (bool1) {
        this.scene = 3;
      }
      for (;;)
      {
        label482:
        if ((com.tencent.mm.kernel.h.xw().wL()) && (!com.tencent.mm.kernel.a.wF()))
        {
          com.tencent.mm.kernel.h.xz();
          if (com.tencent.mm.kernel.h.xy() != null)
          {
            com.tencent.mm.kernel.h.xz();
            if (com.tencent.mm.kernel.h.xy().xh() != null) {
              break;
            }
          }
        }
        bool1 = com.tencent.mm.kernel.h.xw().wL();
        bool2 = com.tencent.mm.kernel.a.wF();
        com.tencent.mm.kernel.h.xz();
        w.e("MicroMsg.SyncService", "%s accready:%s hold:%s accstg:%s ", new Object[] { this, Boolean.valueOf(bool1), Boolean.valueOf(bool2), com.tencent.mm.kernel.h.xy() });
        GMTrace.o(13432644435968L, 100081);
        return false;
        if (bool2) {
          this.scene = 6;
        }
      }
      com.tencent.mm.kernel.h.xz();
      long l = bg.a((Long)com.tencent.mm.kernel.h.xy().xh().get(8196, null), 0L);
      if (l != 0L)
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().set(8196, Long.valueOf(0L));
        this.cbU = ((int)(this.cbU | l));
        this.cbU &= 0x5F;
      }
      if (this.scene == 3)
      {
        i = 1;
        if (this.scene != 1010) {
          break label1050;
        }
        this.cbU |= 0x10;
        this.scene = 7;
      }
      for (;;)
      {
        if (this.gOz) {
          this.scene = 6;
        }
        this.guL = new l.a();
        paramQueue = ((com.tencent.mm.protocal.w.a)this.guL.DC()).tKT;
        paramQueue.uGF = i;
        paramQueue.tZz = this.cbU;
        paramQueue.tOG = this.scene;
        com.tencent.mm.kernel.h.xz();
        localObject = bg.nl((String)com.tencent.mm.kernel.h.xy().xh().get(8195, new byte[0]));
        paramQueue.tZA = com.tencent.mm.platformtools.n.H(bg.St((String)localObject));
        paramQueue.uGE = new nl();
        paramQueue.tSz = com.tencent.mm.protocal.d.DEVICE_TYPE;
        w.i("MicroMsg.SyncService", "%s continueFlag:%s SyncMsgDigest:%s Selector:%d Scene:%d device:%s", new Object[] { this, Long.valueOf(l), Integer.valueOf(paramQueue.uGF), Integer.valueOf(paramQueue.tZz), Integer.valueOf(this.scene), paramQueue.tSz });
        w.i("MicroMsg.SyncService", "%s Req synckey %s", new Object[] { this, ad.bd(bg.St((String)localObject)) });
        r.a(this);
        com.tencent.mm.kernel.h.xz();
        if (com.tencent.mm.kernel.h.xx().fYr.a(this, 0)) {
          break label1108;
        }
        com.tencent.mm.plugin.report.d.oqe.i(11098, new Object[] { Integer.valueOf(3500), this.scene + ";" + com.tencent.mm.sdk.a.b.foreground + ";" + r.JB() });
        w.e("MicroMsg.SyncService", "%s NetSceneQueue doScene failed. ", new Object[] { this });
        com.tencent.mm.plugin.report.d.oqe.a(99L, 41L, 1L, false);
        GMTrace.o(13432644435968L, 100081);
        return false;
        i = 0;
        break;
        label1050:
        if (this.scene == 1011)
        {
          this.cbU |= 0x40;
          this.scene = 7;
        }
        else if (this.scene == 3)
        {
          this.cbU |= 0x40000;
          this.scene = 3;
        }
      }
      label1108:
      GMTrace.o(13432644435968L, 100081);
      return true;
    }
    
    public final int getType()
    {
      GMTrace.i(13433047089152L, 100084);
      GMTrace.o(13433047089152L, 100084);
      return 138;
    }
    
    public final String toString()
    {
      GMTrace.i(13432778653696L, 100082);
      String str = "NetSync[" + hashCode() + "]";
      GMTrace.o(13432778653696L, 100082);
      return str;
    }
  }
  
  final class f
    implements r.c
  {
    int gLZ;
    long gOD;
    aqk gOr;
    
    public f(w.b paramb, int paramInt, long paramLong)
    {
      GMTrace.i(13438415798272L, 100124);
      if (paramb == null) {}
      for (this$1 = null;; this$1 = paramb.tKU)
      {
        this.gOr = r.this;
        this.gOD = paramLong;
        this.gLZ = paramInt;
        GMTrace.o(13438415798272L, 100124);
        return;
      }
    }
    
    public final boolean a(Queue<r.c> paramQueue)
    {
      GMTrace.i(13438550016000L, 100125);
      if (this.gOr == null)
      {
        com.tencent.mm.plugin.report.d.oqe.a(99L, 40L, 1L, false);
        w.e("MicroMsg.SyncService", "%s run resp == null", new Object[] { this });
        GMTrace.o(13438550016000L, 100125);
        return false;
      }
      if (10018 == com.tencent.mm.platformtools.r.hkj)
      {
        w.e("MicroMsg.SyncService", "%s Give up for test", new Object[] { this });
        GMTrace.o(13438550016000L, 100125);
        return false;
      }
      new r.a(r.this, this, true, this.gOr, new r.b()
      {
        public final boolean gF(int paramAnonymousInt)
        {
          GMTrace.i(13440563281920L, 100140);
          w.i("MicroMsg.SyncService", "%s onFinishCmd resp:%s pushSycnFlag:%s recvTime:%s", new Object[] { r.f.this, r.f.this.gOr, Integer.valueOf(r.f.this.gLZ), Long.valueOf(r.f.this.gOD) });
          if ((r.f.this.gLZ & 0x1) > 0)
          {
            com.tencent.mm.kernel.h.xz();
            byte[] arrayOfByte = bg.St(bg.nl((String)com.tencent.mm.kernel.h.xy().xh().get(8195, null)));
            com.tencent.mm.kernel.h.wS().a(new h(r.f.this.gOD, arrayOfByte), 0);
          }
          r.this.b(r.f.this);
          GMTrace.o(13440563281920L, 100140);
          return true;
        }
      });
      com.tencent.mm.plugin.report.d.oqe.a(99L, 21L, 1L, false);
      GMTrace.o(13438550016000L, 100125);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(13438684233728L, 100126);
      String str = "NotifyData[" + hashCode() + "]";
      GMTrace.o(13438684233728L, 100126);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */