package com.tencent.mm.kernel;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteException;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.n;
import com.tencent.mm.ad.v;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.bx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.as;
import com.tencent.mm.y.au;
import com.tencent.mm.y.bz;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class a
{
  private static boolean fXU;
  private static boolean fXV;
  static b fXX;
  private static String fXY;
  private static String fXZ;
  private static int fYe;
  private com.tencent.mm.kernel.api.c fXS;
  public final v fXT;
  byte[] fXW;
  public com.tencent.mm.y.a fYa;
  public int fYb;
  public int fYc;
  public List<ap> fYd;
  volatile int fYf;
  public volatile boolean fYg;
  private String fYh;
  private Map<String, Integer> fYi;
  
  static
  {
    GMTrace.i(13531965554688L, 100821);
    fXU = true;
    fXV = false;
    fXX = new b();
    fXY = "NoResetUinStack";
    fXZ = null;
    fYe = -1;
    GMTrace.o(13531965554688L, 100821);
  }
  
  public a(com.tencent.mm.kernel.api.c paramc)
  {
    GMTrace.i(13527267934208L, 100786);
    this.fXW = new byte[0];
    this.fYb = 0;
    this.fYd = new LinkedList();
    this.fYf = a.fYk;
    this.fYg = false;
    this.fYh = "";
    this.fYi = new HashMap();
    Assert.assertNotNull(fXX);
    h.xz();
    if (bg.e((Integer)h.xy().fYL.get(17)) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      fXU = bool;
      this.fXT = new v();
      com.tencent.mm.protocal.i.c.a.tJY = new au(702);
      this.fXS = paramc;
      GMTrace.o(13527267934208L, 100786);
      return;
    }
  }
  
  public static void bd(boolean paramBoolean)
  {
    GMTrace.i(13529012764672L, 100799);
    fXV = paramBoolean;
    GMTrace.o(13529012764672L, 100799);
  }
  
  public static String eI(String paramString)
  {
    GMTrace.i(13527670587392L, 100789);
    fXZ = paramString;
    GMTrace.o(13527670587392L, 100789);
    return paramString;
  }
  
  public static void eJ(String paramString)
  {
    GMTrace.i(13527939022848L, 100791);
    fXY = paramString;
    GMTrace.o(13527939022848L, 100791);
  }
  
  public static int eK(String paramString)
  {
    GMTrace.i(13531562901504L, 100818);
    h.xz();
    if (h.xw().fYi.get(paramString) == null) {}
    int j;
    for (int i = 0;; i = ((Integer)h.xw().fYi.get(paramString)).intValue())
    {
      j = (int)bg.Pu();
      if (i != 0) {
        break;
      }
      h.xz();
      h.xw().fYi.put(paramString, Integer.valueOf(j));
      GMTrace.o(13531562901504L, 100818);
      return i;
      h.xz();
    }
    i = j - i;
    h.xz();
    h.xw().fYi.put(paramString, Integer.valueOf(j));
    if (i >= 0)
    {
      GMTrace.o(13531562901504L, 100818);
      return i;
    }
    GMTrace.o(13531562901504L, 100818);
    return 0;
  }
  
  static boolean fe(int paramInt)
  {
    GMTrace.i(13528073240576L, 100792);
    if (paramInt != 0)
    {
      GMTrace.o(13528073240576L, 100792);
      return true;
    }
    GMTrace.o(13528073240576L, 100792);
    return false;
  }
  
  public static void ff(int paramInt)
  {
    GMTrace.i(13530086506496L, 100807);
    if ((fYe != -1) && (fYe == paramInt))
    {
      GMTrace.o(13530086506496L, 100807);
      return;
    }
    fYe = paramInt;
    wJ().edit().putInt("notification.user.state", paramInt).commit();
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "[NOTIFICATION SETTINGS]save UserStatus: %d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(13530086506496L, 100807);
  }
  
  public static boolean fg(int paramInt)
  {
    GMTrace.i(13530489159680L, 100810);
    if ((paramInt & 0x1) != 0)
    {
      GMTrace.o(13530489159680L, 100810);
      return true;
    }
    GMTrace.o(13530489159680L, 100810);
    return false;
  }
  
  public static void hold()
  {
    GMTrace.i(13529281200128L, 100801);
    h.xz();
    if (h.xw() != null)
    {
      h.xz();
      h.xw();
    }
    for (String str = o.getString(fXX.ww());; str = "-1")
    {
      com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreAccount", " HOLD ACCOUNT! uin:%s stack:%s init:%b", new Object[] { str, bg.bQW(), Boolean.valueOf(h.xw().wL()) });
      fXU = true;
      h.xz();
      h.xy().fYL.set(17, Integer.valueOf(1));
      GMTrace.o(13529281200128L, 100801);
      return;
    }
  }
  
  public static void unhold()
  {
    GMTrace.i(13529415417856L, 100802);
    h.xz();
    if (h.xw() != null)
    {
      h.xz();
      h.xw();
    }
    for (String str = o.getString(fXX.ww());; str = "-1")
    {
      com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreAccount", " UN HOLD ACCOUNT! uin:%s init:%b", new Object[] { str, Boolean.valueOf(h.xw().wL()) });
      fXU = false;
      h.xz();
      h.xy().fYL.set(17, Integer.valueOf(0));
      GMTrace.o(13529415417856L, 100802);
      return;
    }
  }
  
  protected static void wA()
  {
    GMTrace.i(13528207458304L, 100793);
    fXX.dp(0);
    GMTrace.o(13528207458304L, 100793);
  }
  
  protected static void wB()
  {
    GMTrace.i(13528341676032L, 100794);
    fXX.dp(0);
    GMTrace.o(13528341676032L, 100794);
  }
  
  private void wC()
  {
    GMTrace.i(13528475893760L, 100795);
    this.fYf = a.fYk;
    this.fYg = false;
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "mAccountStatus to NotReady");
    ab.getContext().getSharedPreferences(ab.bPU(), 0).edit().putBoolean("isLogin", false).commit();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
    com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreAccount", "[arthurdan.AccountNR] account storage reset! uin:%d, resetStack is:%s, resetTime:%s", new Object[] { Integer.valueOf(fXX.ww()), fXY, localSimpleDateFormat.format(new Date()) });
    GMTrace.o(13528475893760L, 100795);
  }
  
  public static boolean wE()
  {
    GMTrace.i(13528878546944L, 100798);
    boolean bool = fXV;
    GMTrace.o(13528878546944L, 100798);
    return bool;
  }
  
  public static boolean wF()
  {
    GMTrace.i(13529146982400L, 100800);
    if (fXU)
    {
      h.xz();
      if (h.xw() == null) {
        break label86;
      }
      h.xz();
      h.xw();
    }
    label86:
    for (String str = o.getString(fXX.ww());; str = "-1")
    {
      com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreAccount", "account holded :%s init:%b", new Object[] { str, Boolean.valueOf(h.xw().wL()) });
      boolean bool = fXU;
      GMTrace.o(13529146982400L, 100800);
      return bool;
    }
  }
  
  public static int wI()
  {
    GMTrace.i(13530220724224L, 100808);
    int i = wJ().getInt("notification.user.state", 0);
    GMTrace.o(13530220724224L, 100808);
    return i;
  }
  
  public static SharedPreferences wJ()
  {
    GMTrace.i(13530354941952L, 100809);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("notify_key_pref_settings", 4);
    GMTrace.o(13530354941952L, 100809);
    return localSharedPreferences;
  }
  
  public static boolean wK()
  {
    GMTrace.i(13530891812864L, 100813);
    if (fXX.ww() != 0)
    {
      GMTrace.o(13530891812864L, 100813);
      return true;
    }
    GMTrace.o(13530891812864L, 100813);
    return false;
  }
  
  public static int wM()
  {
    GMTrace.i(13531160248320L, 100815);
    int i = Integer.valueOf(ab.getContext().getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0)).intValue();
    GMTrace.o(13531160248320L, 100815);
    return i;
  }
  
  public static String wN()
  {
    GMTrace.i(13531294466048L, 100816);
    h.xz();
    if (bg.nm(h.xw().fYh)) {
      wO();
    }
    h.xz();
    String str = h.xw().fYh;
    GMTrace.o(13531294466048L, 100816);
    return str;
  }
  
  public static void wO()
  {
    GMTrace.i(13531428683776L, 100817);
    h.xz();
    h.xw().fYh = (p.ta() + "_" + System.currentTimeMillis());
    h.xz();
    h.xw().fYi.clear();
    GMTrace.o(13531428683776L, 100817);
  }
  
  public static int ww()
  {
    GMTrace.i(13527402151936L, 100787);
    int i = fXX.ww();
    GMTrace.o(13527402151936L, 100787);
    return i;
  }
  
  public static String wx()
  {
    GMTrace.i(21018093551616L, 156597);
    String str = new o(fXX.ww()).toString();
    GMTrace.o(21018093551616L, 156597);
    return str;
  }
  
  public static String wy()
  {
    GMTrace.i(13527536369664L, 100788);
    String str = fXZ;
    GMTrace.o(13527536369664L, 100788);
    return str;
  }
  
  public static String wz()
  {
    GMTrace.i(13527804805120L, 100790);
    String str = fXY;
    GMTrace.o(13527804805120L, 100790);
    return str;
  }
  
  public final void aG(int paramInt1, int paramInt2)
  {
    GMTrace.i(13529952288768L, 100806);
    if ((this.fYb != paramInt1) || (this.fYc != paramInt2)) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.sdk.platformtools.w.d("MMKernel.CoreAccount", "online status, %d, %d, %d ,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.fYc), Integer.valueOf(this.fYb) });
      if (i != 0) {
        break;
      }
      GMTrace.o(13529952288768L, 100806);
      return;
    }
    this.fYb = paramInt1;
    this.fYc = paramInt2;
    new ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13524717797376L, 100767);
        a.this.wH();
        GMTrace.o(13524717797376L, 100767);
      }
    });
    GMTrace.o(13529952288768L, 100806);
  }
  
  final void bc(boolean paramBoolean)
  {
    GMTrace.i(18924296994816L, 140997);
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "UserStatusChange: clear");
    int k;
    int j;
    for (;;)
    {
      synchronized (this.fYd)
      {
        this.fYd.clear();
        ??? = h.xB();
        if (Thread.currentThread().getId() == ((af)???).ngv.getId())
        {
          i = 1;
          if ((i == 0) || (h.xB().bQg())) {
            break label245;
          }
          i = 1;
          if (i != 0) {
            h.xB().bQf();
          }
          long l1 = System.currentTimeMillis();
          k = fXX.ww();
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "dkacc setAccuin %s hash:%d thread:%d[%s] stack:%s", new Object[] { o.getString(k), Integer.valueOf(com.tencent.mm.a.h.aw(k, 100)), Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName(), bg.bQW() });
          if (k == 0) {
            break label250;
          }
          j = 1;
          if (j != 0) {
            break;
          }
          com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreAccount", "setAccUin, Reset by MMCore.resetAccUin");
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "start time check setUinImpl end total time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          if (i != 0) {
            h.xB().bQh();
          }
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "mAccountStatus to AccountHasReady");
          GMTrace.o(18924296994816L, 140997);
          return;
        }
      }
      int i = 0;
      continue;
      label245:
      i = 0;
      continue;
      label250:
      j = 0;
    }
    if (wL()) {
      wD();
    }
    o.getString(k);
    h.xz();
    ??? = h.xy();
    Object localObject3 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13534381473792L, 100839);
        a.this.fYf = a.a.fYl;
        GMTrace.o(13534381473792L, 100839);
      }
    };
    ab.getContext().getSharedPreferences(ab.bPU(), 0).edit().putBoolean("isLogin", true).commit();
    String str1 = com.tencent.mm.a.g.n(("mm" + k).getBytes());
    ((e)???).fYU = (((e)???).fYT + str1 + "/");
    ((e)???).cachePath = (com.tencent.mm.storage.w.ghv + str1 + "/");
    Object localObject4 = new File(((e)???).cachePath);
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "dkacc cachePath:" + ((e)???).cachePath + " accPath:" + ((e)???).fYU);
    long l2;
    if (!((File)localObject4).exists())
    {
      com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreStorage", "setUin REBUILD data now ! DO NOT FUCKING TELL ME DB BROKEN !!! uin:%s data:%s sd:%s", new Object[] { o.getString(k), ((e)???).cachePath, ((e)???).fYU });
      ((File)localObject4).mkdirs();
      if (!((e)???).cachePath.equalsIgnoreCase(((e)???).fYU))
      {
        l2 = System.currentTimeMillis();
        localObject4 = new File(((e)???).fYU);
        str1 = str1 + "temp" + System.currentTimeMillis();
        str1 = com.tencent.mm.compatible.util.e.ghz + str1;
        ((File)localObject4).renameTo(new File(str1));
        com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "find the old files and rename then %s" + (System.currentTimeMillis() - l2), new Object[] { str1 });
      }
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      ((e)???).fYZ = new bz(((e)???).cachePath, bool1);
      ((e)???).xc();
      localObject4 = ((e)???).cachePath + "MicroMsg.db";
      str1 = ((e)???).cachePath + "EnMicroMsg.db";
      String str2 = ((e)???).cachePath + "EnMicroMsg2.db";
      ((e)???).dk(null);
      ((e)???).fYV = new com.tencent.mm.bu.g(new e.2((e)???));
      if (!((e)???).fYV.a((String)localObject4, str1, str2, k, p.sZ(), ((e)???).vH(), true)) {
        throw new SQLiteException("main db init failed");
      }
      String str3 = ((e)???).fYV.vDx;
      if (!bg.nm(str3))
      {
        com.tencent.mm.sdk.platformtools.w.e("MMKernel.CoreStorage", "dbinit failed :" + str3);
        com.tencent.mm.sdk.a.b.r("init db Failed: [ " + str3 + "]", "DBinit");
      }
      ((e)???).fYX = new t(((e)???).fYV);
      ((e)???).fYW = new com.tencent.mm.bu.g(((e)???).fYQ);
      if (!((e)???).fYW.a((String)localObject4, str1, str2, k, p.sZ(), new HashMap(), true)) {
        throw new com.tencent.mm.y.b((byte)0);
      }
      ((e)???).fYY = new ba(((e)???).fYX);
      ((e)???).fYY.c(new e.3((e)???));
      ((e)???).fYY.bUp();
      ((Runnable)localObject3).run();
      ((e)???).fYM.onDataBaseOpened(((e)???).fYV, ((e)???).fYW);
      ab.getContext().getSharedPreferences(ab.bPU() + k, 0);
      boolean bool2 = ((e)???).xb();
      com.tencent.mm.sdk.platformtools.w.d("MMKernel.CoreStorage", "edw setAccUin, needTransfer = " + bool2);
      if (bool1)
      {
        l2 = ((Long)((e)???).fYX.get(w.a.vvL, Long.valueOf(0L))).longValue();
        j = ((Integer)((e)???).fYX.get(w.a.vvM, Integer.valueOf(0))).intValue();
        if (l2 > 0L)
        {
          com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreStorage", "summerinstall new install but firsttime[%d] > 0", new Object[] { Long.valueOf(l2) });
          label1181:
          if (j <= 0) {
            break label1439;
          }
          com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreStorage", "summerinstall new install but version[%d] > 0", new Object[] { Integer.valueOf(j) });
          label1205:
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "edw setAccUin, summerinstall time[%d]，version[%d], clientversion[%d]", new Object[] { (Long)((e)???).fYX.get(w.a.vvL, Long.valueOf(0L)), (Integer)((e)???).fYX.get(w.a.vvM, Integer.valueOf(0)), Integer.valueOf(com.tencent.mm.protocal.d.tJC) });
        }
      }
      else
      {
        com.tencent.mm.sdk.platformtools.w.d("MMKernel.CoreStorage", "edw postDataTransfer begin");
        if (paramBoolean) {
          break label1464;
        }
        h.xz();
        ??? = bg.nl((String)h.xy().xh().get(2, null));
        com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "summerinit validateUsername username[%s]", new Object[] { ??? });
        if (((String)???).length() > 0) {
          break label1459;
        }
        com.tencent.mm.sdk.platformtools.w.e("MMKernel.CoreAccount", "username of acc stg not set: uin=" + fXX.ww());
        wC();
        fXX.dp(0);
        fXY = bg.bQW().toString();
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(13502303436800L, 100600);
            h.xz().releaseAll();
            GMTrace.o(13502303436800L, 100600);
          }
        });
      }
      label1439:
      label1459:
      for (j = 0;; j = 1)
      {
        if (j != 0) {
          break label1464;
        }
        com.tencent.mm.plugin.report.d.oqe.a(598L, 21L, 1L, true);
        com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreAccount", "setAccUin, validateUsername false no need initialize!");
        break;
        ((e)???).fYX.a(w.a.vvL, Long.valueOf(System.currentTimeMillis()));
        break label1181;
        ((e)???).fYX.a(w.a.vvM, Integer.valueOf(com.tencent.mm.protocal.d.tJC));
        break label1205;
      }
      label1464:
      h.xz();
      ??? = h.xy();
      localObject3 = new e.f();
      j = bg.e((Integer)((e)???).fYX.get(14, null));
      int m = com.tencent.mm.protocal.d.tJC;
      if (m == j) {
        paramBoolean = false;
      }
      for (;;)
      {
        label1513:
        if (paramBoolean)
        {
          ((e)???).fYX.set(8197, "");
          ((e)???).fYX.set(15, Integer.valueOf(0));
        }
        if (j != m)
        {
          bool1 = true;
          label1553:
          if ((j > 620822536) || (j == m)) {
            break label2308;
          }
          ((e)???).fYX.set(274480, Boolean.valueOf(true));
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "[initialize] need init emoji");
          label1590:
          if ((j != 0) && (j < 637599744)) {
            ((e)???).fYX.set(348162, Boolean.valueOf(true));
          }
          if (j == m) {
            break label2335;
          }
          bool2 = true;
          label1625:
          if (!bool2) {
            break label2341;
          }
          com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreStorage", "account storage version changed from " + Integer.toHexString(j) + " to " + Integer.toHexString(m) + ", init=" + paramBoolean);
          if (((Integer)((e)???).fYL.get(37, Integer.valueOf(0))).intValue() == 0) {
            ((e)???).fYL.set(37, Integer.valueOf(j));
          }
          ((e)???).fYX.set(14, Integer.valueOf(m));
          ((e)???).fYX.set(30, Boolean.valueOf(false));
          ((e)???).fYX.set(-2046825377, Boolean.valueOf(false));
          ((e)???).fYX.set(-2046825369, Boolean.valueOf(false));
          ((e)???).fYX.set(54, Boolean.valueOf(false));
          ((e)???).fYX.set(-2046825368, Boolean.valueOf(false));
          ((e)???).fYX.set(-2046825366, Boolean.valueOf(true));
          ((e)???).fYX.set(62, Boolean.valueOf(true));
          ab.getContext().getSharedPreferences("update_config_prefs", 4).edit().clear().commit();
          if ((j & 0xFF00) == (m & 0xFF00)) {
            ad.RS("show_whatsnew");
          }
        }
        for (;;)
        {
          ((e)???).fYN.be(bool2);
          ((e.f)localObject3).fZo = bool1;
          ((e.f)localObject3).fZp = j;
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "check is update :%b ", new Object[] { Boolean.valueOf(((e.f)localObject3).fZo) });
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized tid:%d, stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), bg.bQW() });
          l2 = System.currentTimeMillis();
          this.fXS.onAccountInitialized((e.f)localObject3);
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "summerasyncinit setInitializedNotifyAllDone[%b] to true stack[%s]", new Object[] { Boolean.valueOf(this.fYg), bg.bQW() });
          this.fYg = true;
          ??? = new bx();
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)???);
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized run tid[%d] take[%d]ms", new Object[] { Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - l2) });
          as.gnb.M("last_login_uin", o.getString(k));
          com.tencent.mm.plugin.report.d.oqe.dp(k);
          this.fYa = new com.tencent.mm.y.a();
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "setAccUin done :%s", new Object[] { o.getString(k) });
          h.xz();
          if (h.xx().fYr == null) {
            break;
          }
          h.xz();
          if (h.xx().fYr.gus == null) {
            break;
          }
          h.xz();
          h.xx().fYr.gus.bn(true);
          h.xz();
          ??? = h.xx().fYr.gus.DY();
          if ((k == 0) || (??? == null) || (k == ((com.tencent.mm.network.c)???).ww())) {
            break;
          }
          com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreAccount", "summerauth update acc info with acc stg: old acc uin=%d, this uin=%d", new Object[] { Integer.valueOf(((com.tencent.mm.network.c)???).ww()), Integer.valueOf(k) });
          com.tencent.mm.plugin.report.d.oqe.a(148L, 46L, 1L, false);
          ((com.tencent.mm.network.c)???).dp(k);
          break;
          if ((m > 570425344) && (j <= 570425344))
          {
            paramBoolean = true;
            break label1513;
          }
          if ((m <= 570556456) || (j > 570556456)) {
            break label2351;
          }
          paramBoolean = true;
          break label1513;
          bool1 = false;
          break label1553;
          label2308:
          ((e)???).fYX.set(274480, Boolean.valueOf(false));
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "[initialize] need not init emoji");
          break label1590;
          label2335:
          bool2 = false;
          break label1625;
          label2341:
          ad.RS("show_whatsnew");
        }
        label2351:
        paramBoolean = false;
      }
    }
  }
  
  public final void initialize()
  {
    GMTrace.i(13530757595136L, 100812);
    if (wL())
    {
      GMTrace.o(13530757595136L, 100812);
      return;
    }
    synchronized (this.fXW)
    {
      if (wL())
      {
        GMTrace.o(13530757595136L, 100812);
        return;
      }
      int i = fXX.ww();
      if (i != 0)
      {
        com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreAccount", "auto set up account storage uin: %d, stack: %s", new Object[] { Integer.valueOf(i), bg.bQW() });
        bc(false);
      }
      GMTrace.o(13530757595136L, 100812);
      return;
    }
  }
  
  public final void release()
  {
    GMTrace.i(13530623377408L, 100811);
    synchronized (this.fXW)
    {
      wD();
      GMTrace.o(13530623377408L, 100811);
      return;
    }
  }
  
  final void wD()
  {
    GMTrace.i(13528610111488L, 100796);
    com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreAccount", "account storage release  uin:%s thread:%s stack:%s", new Object[] { o.getString(fXX.ww()), Thread.currentThread().getName(), bg.bQW() });
    if (!wL())
    {
      com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "Fatal crash error!!! status is not initialized when release(), this callStack is:%s, last reset stack is:%s", new Object[] { bg.bQW().toString(), fXY });
      GMTrace.o(13528610111488L, 100796);
      return;
    }
    this.fXS.onAccountRelease();
    h.xz();
    h.xy().dk(null);
    wC();
    h.xz();
    h.xy().fZa.clear();
    GMTrace.o(13528610111488L, 100796);
  }
  
  public final void wG()
  {
    GMTrace.i(13529549635584L, 100803);
    if (!wL()) {
      throw new com.tencent.mm.y.b();
    }
    GMTrace.o(13529549635584L, 100803);
  }
  
  public final void wH()
  {
    GMTrace.i(13529818071040L, 100805);
    new ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13496934727680L, 100560);
        ap[] arrayOfap = new ap[a.this.fYd.size()];
        a.this.fYd.toArray(arrayOfap);
        int j = arrayOfap.length;
        int i = 0;
        while (i < j)
        {
          arrayOfap[i].AI();
          i += 1;
        }
        GMTrace.o(13496934727680L, 100560);
      }
    });
    GMTrace.o(13529818071040L, 100805);
  }
  
  public final boolean wL()
  {
    GMTrace.i(13531026030592L, 100814);
    if (this.fYf == a.fYl)
    {
      GMTrace.o(13531026030592L, 100814);
      return true;
    }
    GMTrace.o(13531026030592L, 100814);
    return false;
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(13506195750912L, 100629);
      fYk = 1;
      fYl = 2;
      fYm = new int[] { fYk, fYl };
      GMTrace.o(13506195750912L, 100629);
    }
  }
  
  static final class b
  {
    private static boolean fYp;
    private boolean fYn;
    private s fYo;
    private int uin;
    
    static
    {
      GMTrace.i(13526194192384L, 100778);
      fYp = true;
      GMTrace.o(13526194192384L, 100778);
    }
    
    b()
    {
      GMTrace.i(13525254668288L, 100771);
      this.uin = 0;
      this.fYn = false;
      GMTrace.o(13525254668288L, 100771);
    }
    
    private static void a(s params, int paramInt)
    {
      GMTrace.i(13525791539200L, 100775);
      com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "setSysUin uin: %d, stack: %s", new Object[] { Integer.valueOf(paramInt), bg.bQW() });
      ab.getContext().getSharedPreferences("system_config_prefs", 4).edit().putInt("default_uin", paramInt).commit();
      params.set(1, Integer.valueOf(paramInt));
      GMTrace.o(13525791539200L, 100775);
    }
    
    /* Error */
    private void wP()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: aload_0
      //   3: monitorenter
      //   4: ldc2_w 107
      //   7: ldc 109
      //   9: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   12: aload_0
      //   13: getfield 111	com/tencent/mm/kernel/a$b:fYo	Lcom/tencent/mm/storage/s;
      //   16: invokestatic 117	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
      //   19: aload_0
      //   20: getfield 111	com/tencent/mm/kernel/a$b:fYo	Lcom/tencent/mm/storage/s;
      //   23: astore 5
      //   25: aload 5
      //   27: ifnonnull +26 -> 53
      //   30: ldc 48
      //   32: ldc 119
      //   34: invokestatic 123	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
      //   37: aload_0
      //   38: iload_1
      //   39: putfield 39	com/tencent/mm/kernel/a$b:uin	I
      //   42: ldc2_w 107
      //   45: ldc 109
      //   47: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   50: aload_0
      //   51: monitorexit
      //   52: return
      //   53: aload 5
      //   55: iconst_1
      //   56: invokevirtual 127	com/tencent/mm/storage/s:get	(I)Ljava/lang/Object;
      //   59: checkcast 52	java/lang/Integer
      //   62: astore_3
      //   63: aload_3
      //   64: astore_2
      //   65: aload_3
      //   66: ifnonnull +154 -> 220
      //   69: aload 5
      //   71: getfield 130	com/tencent/mm/storage/s:vpt	Z
      //   74: ifeq +17 -> 91
      //   77: getstatic 136	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
      //   80: ldc2_w 137
      //   83: ldc2_w 139
      //   86: lconst_1
      //   87: iconst_0
      //   88: invokevirtual 143	com/tencent/mm/plugin/report/d:a	(JJJZ)V
      //   91: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   94: ldc 75
      //   96: iconst_4
      //   97: invokevirtual 81	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
      //   100: ldc 89
      //   102: iconst_0
      //   103: invokeinterface 147 3 0
      //   108: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   111: astore 4
      //   113: aload_3
      //   114: astore_2
      //   115: aload 4
      //   117: ifnull +103 -> 220
      //   120: ldc 48
      //   122: ldc -107
      //   124: iconst_3
      //   125: anewarray 4	java/lang/Object
      //   128: dup
      //   129: iconst_0
      //   130: aload_3
      //   131: aastore
      //   132: dup
      //   133: iconst_1
      //   134: aload 4
      //   136: aastore
      //   137: dup
      //   138: iconst_2
      //   139: aload 5
      //   141: getfield 130	com/tencent/mm/storage/s:vpt	Z
      //   144: invokestatic 154	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   147: aastore
      //   148: invokestatic 67	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   151: getstatic 27	com/tencent/mm/kernel/a$b:fYp	Z
      //   154: ifeq +53 -> 207
      //   157: ldc 48
      //   159: ldc -100
      //   161: iconst_2
      //   162: anewarray 4	java/lang/Object
      //   165: dup
      //   166: iconst_0
      //   167: aload 4
      //   169: aastore
      //   170: dup
      //   171: iconst_1
      //   172: invokestatic 62	com/tencent/mm/sdk/platformtools/bg:bQW	()Lcom/tencent/mm/sdk/platformtools/ah;
      //   175: aastore
      //   176: invokestatic 158	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   179: getstatic 136	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
      //   182: sipush 11911
      //   185: iconst_1
      //   186: anewarray 4	java/lang/Object
      //   189: dup
      //   190: iconst_0
      //   191: aload 4
      //   193: invokestatic 162	com/tencent/mm/sdk/platformtools/bg:e	(Ljava/lang/Integer;)I
      //   196: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   199: aastore
      //   200: invokevirtual 165	com/tencent/mm/plugin/report/d:i	(I[Ljava/lang/Object;)V
      //   203: iconst_0
      //   204: putstatic 27	com/tencent/mm/kernel/a$b:fYp	Z
      //   207: aload 5
      //   209: aload 4
      //   211: invokevirtual 169	java/lang/Integer:intValue	()I
      //   214: invokestatic 171	com/tencent/mm/kernel/a$b:a	(Lcom/tencent/mm/storage/s;I)V
      //   217: aload 4
      //   219: astore_2
      //   220: ldc 48
      //   222: ldc -83
      //   224: iconst_1
      //   225: anewarray 4	java/lang/Object
      //   228: dup
      //   229: iconst_0
      //   230: aload_2
      //   231: invokestatic 162	com/tencent/mm/sdk/platformtools/bg:e	(Ljava/lang/Integer;)I
      //   234: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   237: aastore
      //   238: invokestatic 67	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   241: aload_2
      //   242: invokestatic 162	com/tencent/mm/sdk/platformtools/bg:e	(Ljava/lang/Integer;)I
      //   245: istore_1
      //   246: goto -209 -> 37
      //   249: astore_2
      //   250: aload_0
      //   251: monitorexit
      //   252: aload_2
      //   253: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	254	0	this	b
      //   1	245	1	i	int
      //   64	178	2	localObject1	Object
      //   249	4	2	localObject2	Object
      //   62	69	3	localInteger1	Integer
      //   111	107	4	localInteger2	Integer
      //   23	185	5	locals	s
      // Exception table:
      //   from	to	target	type
      //   4	25	249	finally
      //   30	37	249	finally
      //   37	50	249	finally
      //   53	63	249	finally
      //   69	91	249	finally
      //   91	113	249	finally
      //   120	207	249	finally
      //   207	217	249	finally
      //   220	246	249	finally
    }
    
    public final void a(s params)
    {
      try
      {
        GMTrace.i(20313316261888L, 151346);
        this.fYo = params;
        GMTrace.o(20313316261888L, 151346);
        return;
      }
      finally
      {
        params = finally;
        throw params;
      }
    }
    
    public final void dp(int paramInt)
    {
      try
      {
        GMTrace.i(13525523103744L, 100773);
        com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "Uin From %s To %s hash:%d thread:%d[%s] stack:%s", new Object[] { o.getString(this.uin), o.getString(paramInt), Integer.valueOf(com.tencent.mm.a.h.aw(paramInt, 100)), Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName(), bg.bQW() });
        Assert.assertNotNull(this.fYo);
        a(this.fYo, paramInt);
        this.uin = paramInt;
        GMTrace.o(13525523103744L, 100773);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final int ww()
    {
      try
      {
        GMTrace.i(13525388886016L, 100772);
        if (!this.fYn)
        {
          wP();
          this.fYn = true;
        }
        int i = this.uin;
        GMTrace.o(13525388886016L, 100772);
        return i;
      }
      finally {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */