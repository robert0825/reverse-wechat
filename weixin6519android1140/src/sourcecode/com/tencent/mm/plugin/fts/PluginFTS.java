package com.tencent.mm.plugin.fts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.util.Log;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.bx;
import com.tencent.mm.g.a.rr;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.jni.FTSJNIUtils;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.bw;
import com.tencent.mm.y.bw.a;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.PriorityBlockingQueue;

public class PluginFTS
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.kernel.api.bucket.c, l
{
  public static boolean lvy;
  public com.tencent.mm.sdk.b.c lvA;
  private com.tencent.mm.sdk.b.c lvB;
  public com.tencent.mm.ad.e lvC;
  private com.tencent.mm.sdk.b.c lvD;
  private BroadcastReceiver lvE;
  private SparseArray<com.tencent.mm.plugin.fts.a.g> lvF;
  private e lvG;
  private SparseArray<com.tencent.mm.plugin.fts.a.i> lvH;
  public f lvq;
  public c lvr;
  public boolean lvs;
  public boolean lvt;
  public boolean lvu;
  public boolean lvv;
  private Runnable lvw;
  private d lvx;
  private bw.a lvz;
  
  public PluginFTS()
  {
    GMTrace.i(18505269248000L, 137875);
    this.lvs = false;
    this.lvt = false;
    this.lvu = false;
    this.lvv = false;
    this.lvw = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18510637957120L, 137915);
        if (PluginFTS.this.lvr != null) {
          PluginFTS.this.lvr.rollback();
        }
        GMTrace.o(18510637957120L, 137915);
      }
    };
    this.lvx = new d()
    {
      public final void aCd()
      {
        GMTrace.i(18556943073280L, 138260);
        com.tencent.mm.kernel.h.xz();
        int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyH, Integer.valueOf(3))).intValue();
        w.e("MicroMsg.FTS.PluginFTS", "DB onCorrupt dbCorruptRebuildTimes: %d", new Object[] { Integer.valueOf(i) });
        if (i > 0)
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().a(w.a.vyH, Integer.valueOf(i - 1));
          PluginFTS.this.destroyNativeLogic();
          PluginFTS.this.destroyStorage();
          PluginFTS.this.lvr.close();
          c.aCc();
          PluginFTS.this.lvq.a(-131072, new PluginFTS.a(PluginFTS.this));
        }
        GMTrace.o(18556943073280L, 138260);
      }
    };
    this.lvz = new bw.a()
    {
      public final boolean BU()
      {
        GMTrace.i(18511577481216L, 137922);
        w.w("MicroMsg.FTS.PluginFTS", "HERE UninitForUEH is called! stg:%s ", new Object[] { PluginFTS.this.lvr });
        PluginFTS.lvy = true;
        if (PluginFTS.this.lvr != null)
        {
          PluginFTS.this.lvr.rollback();
          PluginFTS.this.lvr.close();
        }
        GMTrace.o(18511577481216L, 137922);
        return true;
      }
    };
    this.lvA = new com.tencent.mm.sdk.b.c() {};
    this.lvB = new com.tencent.mm.sdk.b.c() {};
    this.lvC = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(18513322311680L, 137935);
        com.tencent.mm.kernel.h.xz();
        if (bg.e((Integer)com.tencent.mm.kernel.h.xy().xh().get(15, null)) != 0)
        {
          com.tencent.mm.kernel.h.wS().b(138, PluginFTS.this.lvC);
          PluginFTS.this.lvs = true;
          w.i("MicroMsg.FTS.PluginFTS", "*** User has finished initializing.");
          PluginFTS.this.waitAndStartDaemon();
        }
        GMTrace.o(18513322311680L, 137935);
      }
    };
    this.lvD = new com.tencent.mm.sdk.b.c() {};
    this.lvE = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(18504598159360L, 137870);
        if ((paramAnonymousIntent == null) || (paramAnonymousIntent.getAction() == null))
        {
          GMTrace.o(18504598159360L, 137870);
          return;
        }
        w.i("MicroMsg.FTS.PluginFTS", "*** Charging notified: " + paramAnonymousIntent.getAction());
        if (paramAnonymousIntent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED"))
        {
          PluginFTS.this.lvu = true;
          GMTrace.o(18504598159360L, 137870);
          return;
        }
        if (paramAnonymousIntent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
          PluginFTS.this.lvu = false;
        }
        GMTrace.o(18504598159360L, 137870);
      }
    };
    this.lvF = new SparseArray();
    this.lvH = new SparseArray();
    GMTrace.o(18505269248000L, 137875);
  }
  
  private void startDaemon()
  {
    GMTrace.i(18507685167104L, 137893);
    if (!this.lvq.aCe())
    {
      f localf = this.lvq;
      localf.lvg.start();
      w.i("MicroMsg.FTS.FTSTaskDaemon", "***** Search daemon started with TID: " + localf.lvg.getId());
    }
    GMTrace.o(18507685167104L, 137893);
  }
  
  public void addSOSHistory(String paramString)
  {
    GMTrace.i(18508222038016L, 137897);
    if ((isFTSContextReady()) && (this.lvH.indexOfKey(8) >= 0)) {
      ((com.tencent.mm.plugin.fts.a.i)this.lvH.get(8)).addSOSHistory(paramString);
    }
    GMTrace.o(18508222038016L, 137897);
  }
  
  public void cancelSearchTask(com.tencent.mm.plugin.fts.a.a.a parama)
  {
    GMTrace.i(18507953602560L, 137895);
    if (isFTSContextReady())
    {
      Object localObject = this.lvq;
      if (((f)localObject).lvg != null)
      {
        localObject = ((f)localObject).lvg;
        parama.hy = true;
        ((f.a)localObject).lvi.remove(parama);
        if (((f.a)localObject).lvk == parama) {
          ((f.a)localObject).interrupt();
        }
      }
    }
    GMTrace.o(18507953602560L, 137895);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18506208772096L, 137882);
    GMTrace.o(18506208772096L, 137882);
  }
  
  public void createIndexStorage()
  {
    int j = 0;
    GMTrace.i(18507282513920L, 137890);
    w.i("MicroMsg.FTS.PluginFTS", "Create Index Storage");
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < this.lvF.size())
    {
      int k = this.lvF.keyAt(i);
      localLinkedList.add((com.tencent.mm.plugin.fts.a.g)this.lvF.get(k));
      i += 1;
    }
    Collections.sort(localLinkedList);
    i = j;
    while (i < localLinkedList.size())
    {
      ((com.tencent.mm.plugin.fts.a.g)localLinkedList.get(i)).create();
      i += 1;
    }
    GMTrace.o(18507282513920L, 137890);
  }
  
  public void createNativeLogic()
  {
    GMTrace.i(18507014078464L, 137888);
    w.i("MicroMsg.FTS.PluginFTS", "Create Native Logic");
    int i = 0;
    for (;;)
    {
      if (i < this.lvH.size())
      {
        int j = this.lvH.keyAt(i);
        com.tencent.mm.plugin.fts.a.i locali = (com.tencent.mm.plugin.fts.a.i)this.lvH.get(j);
        if (locali != null) {}
        try
        {
          locali.create();
          i += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", new Object[] { locali.getName(), bg.f(localException) });
          }
        }
      }
    }
    GMTrace.o(18507014078464L, 137888);
  }
  
  public void deleteSOSHistory()
  {
    GMTrace.i(20669261676544L, 153998);
    if ((isFTSContextReady()) && (this.lvH.indexOfKey(8) >= 0)) {
      ((com.tencent.mm.plugin.fts.a.i)this.lvH.get(8)).deleteSOSHistory();
    }
    GMTrace.o(20669261676544L, 153998);
  }
  
  public void deleteSOSHistory(String paramString)
  {
    GMTrace.i(18508356255744L, 137898);
    if ((isFTSContextReady()) && (this.lvH.indexOfKey(8) >= 0)) {
      ((com.tencent.mm.plugin.fts.a.i)this.lvH.get(8)).deleteSOSHistory(paramString);
    }
    GMTrace.o(18508356255744L, 137898);
  }
  
  public void dependency()
  {
    GMTrace.i(18505537683456L, 137877);
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    GMTrace.o(18505537683456L, 137877);
  }
  
  public void destroyNativeLogic()
  {
    GMTrace.i(18507148296192L, 137889);
    w.i("MicroMsg.FTS.PluginFTS", "Destroy Native Logic");
    int i = 0;
    for (;;)
    {
      if (i < this.lvH.size())
      {
        int j = this.lvH.keyAt(i);
        com.tencent.mm.plugin.fts.a.i locali = (com.tencent.mm.plugin.fts.a.i)this.lvH.get(j);
        if (locali != null) {}
        try
        {
          locali.destroy();
          i += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", new Object[] { locali.getName(), bg.f(localException) });
          }
        }
      }
    }
    GMTrace.o(18507148296192L, 137889);
  }
  
  public void destroyStorage()
  {
    GMTrace.i(18507416731648L, 137891);
    w.i("MicroMsg.FTS.PluginFTS", "Destroy Index Storage");
    int i = 0;
    while (i < this.lvF.size())
    {
      int j = this.lvF.keyAt(i);
      com.tencent.mm.plugin.fts.a.g localg = (com.tencent.mm.plugin.fts.a.g)this.lvF.get(j);
      if (localg != null) {
        localg.destroy();
      }
      i += 1;
    }
    GMTrace.o(18507416731648L, 137891);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18506342989824L, 137883);
    GMTrace.o(18506342989824L, 137883);
  }
  
  public com.tencent.mm.plugin.fts.a.f getFTSIndexDB()
  {
    GMTrace.i(18506611425280L, 137885);
    c localc = this.lvr;
    GMTrace.o(18506611425280L, 137885);
    return localc;
  }
  
  public com.tencent.mm.plugin.fts.a.g getFTSIndexStorage(int paramInt)
  {
    GMTrace.i(18508758908928L, 137901);
    com.tencent.mm.plugin.fts.a.g localg = (com.tencent.mm.plugin.fts.a.g)this.lvF.get(paramInt);
    GMTrace.o(18508758908928L, 137901);
    return localg;
  }
  
  public com.tencent.mm.plugin.fts.a.h getFTSMainDB()
  {
    GMTrace.i(18508893126656L, 137902);
    if (this.lvG == null) {
      this.lvG = new e();
    }
    e locale = this.lvG;
    GMTrace.o(18508893126656L, 137902);
    return locale;
  }
  
  public com.tencent.mm.plugin.fts.a.k getFTSTaskDaemon()
  {
    GMTrace.i(18506477207552L, 137884);
    f localf = this.lvq;
    GMTrace.o(18506477207552L, 137884);
    return localf;
  }
  
  public com.tencent.mm.plugin.fts.b.e getTopHitsLogic()
  {
    GMTrace.i(18509698433024L, 137908);
    com.tencent.mm.plugin.fts.b.e locale = (com.tencent.mm.plugin.fts.b.e)this.lvH.get(1);
    GMTrace.o(18509698433024L, 137908);
    return locale;
  }
  
  public void installed()
  {
    GMTrace.i(18505403465728L, 137876);
    alias(l.class);
    GMTrace.o(18505403465728L, 137876);
  }
  
  public boolean isCharging()
  {
    GMTrace.i(18505671901184L, 137878);
    boolean bool = this.lvu;
    GMTrace.o(18505671901184L, 137878);
    return bool;
  }
  
  public boolean isFTSContextReady()
  {
    GMTrace.i(18509429997568L, 137906);
    boolean bool = this.lvq.aCe();
    GMTrace.o(18509429997568L, 137906);
    return bool;
  }
  
  public boolean isFTSIndexReady()
  {
    GMTrace.i(18509564215296L, 137907);
    if (((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyG, Integer.valueOf(0))).intValue() == 1)
    {
      GMTrace.o(18509564215296L, 137907);
      return true;
    }
    GMTrace.o(18509564215296L, 137907);
    return false;
  }
  
  public boolean isInBackground()
  {
    GMTrace.i(18505806118912L, 137879);
    boolean bool = this.lvv;
    GMTrace.o(18505806118912L, 137879);
    return bool;
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    boolean bool = false;
    GMTrace.i(18505940336640L, 137880);
    paramf = new File(com.tencent.mm.plugin.fts.a.c.lwp);
    if (!paramf.exists()) {
      paramf.mkdir();
    }
    if (this.lvq != null) {
      this.lvq.quit();
    }
    this.lvq = new f();
    paramf = this.lvq;
    if ((paramf.lvg != null) && (paramf.lvg.isAlive()))
    {
      w.printErrStackTrace("MicroMsg.FTS.FTSTaskDaemon", new Throwable(), "Duplicated daemon initialization detected, working queue maybe dirty!", new Object[0]);
      paramf = this.lvq;
      Object localObject = this.lvw;
      if (paramf.lvg != null) {
        paramf.lvg.lvm = ((Runnable)localObject);
      }
      paramf = this.lvq;
      localObject = this.lvx;
      paramf.lvg.lvn = ((d)localObject);
      paramf = new IntentFilter("android.intent.action.BATTERY_CHANGED");
      paramf = ab.getContext().registerReceiver(null, paramf);
      if (paramf == null) {
        break label350;
      }
      int i = paramf.getIntExtra("status", -1);
      if ((i == 2) || (i == 5)) {
        bool = true;
      }
    }
    label350:
    for (this.lvu = bool;; this.lvu = false)
    {
      paramf = new IntentFilter();
      paramf.addAction("android.intent.action.ACTION_POWER_CONNECTED");
      paramf.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
      ab.getContext().registerReceiver(this.lvE, paramf);
      com.tencent.mm.kernel.h.xA().a(this.lvz);
      this.lvB.bPu();
      this.lvD.bPu();
      this.lvA.bPu();
      com.tencent.mm.kernel.h.wS().a(138, this.lvC);
      this.lvq.a(-131072, new a());
      this.lvq.a(-131071, new b());
      GMTrace.o(18505940336640L, 137880);
      return;
      paramf.lvg = new f.a(paramf);
      w.i("MicroMsg.FTS.FTSTaskDaemon", "***** Search daemon initialized, waiting for starting.");
      break;
    }
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(18506074554368L, 137881);
    destroyNativeLogic();
    destroyStorage();
    if (this.lvq != null) {
      this.lvq.quit();
    }
    if (this.lvr != null) {
      this.lvr.close();
    }
    ab.getContext().unregisterReceiver(this.lvE);
    this.lvB.dead();
    this.lvA.dead();
    this.lvD.dead();
    com.tencent.mm.kernel.h.wS().b(138, this.lvC);
    com.tencent.mm.kernel.h.xA().b(this.lvz);
    this.lvs = false;
    this.lvt = false;
    GMTrace.o(18506074554368L, 137881);
  }
  
  public void registerIndexStorage(com.tencent.mm.plugin.fts.a.g paramg)
  {
    GMTrace.i(18508490473472L, 137899);
    this.lvF.put(paramg.getType(), paramg);
    GMTrace.o(18508490473472L, 137899);
  }
  
  public void registerNativeLogic(int paramInt, com.tencent.mm.plugin.fts.a.i parami)
  {
    GMTrace.i(18509161562112L, 137904);
    this.lvH.put(paramInt, parami);
    GMTrace.o(18509161562112L, 137904);
  }
  
  public void registerSearchLogic()
  {
    GMTrace.i(18506745643008L, 137886);
    registerNativeLogic(1, new com.tencent.mm.plugin.fts.b.e());
    registerNativeLogic(2, new com.tencent.mm.plugin.fts.b.a());
    registerNativeLogic(3, new com.tencent.mm.plugin.fts.b.c());
    registerNativeLogic(4, new com.tencent.mm.plugin.fts.b.b());
    registerNativeLogic(8, new com.tencent.mm.plugin.fts.b.d());
    registerNativeLogic(10000, new com.tencent.mm.plugin.fts.b.f());
    GMTrace.o(18506745643008L, 137886);
  }
  
  public void registerStorage()
  {
    GMTrace.i(18506879860736L, 137887);
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.e());
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.a());
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.b());
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.c());
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.d());
    GMTrace.o(18506879860736L, 137887);
  }
  
  public com.tencent.mm.plugin.fts.a.a.a search(int paramInt, com.tencent.mm.plugin.fts.a.a.f paramf)
  {
    GMTrace.i(18507819384832L, 137894);
    b localb = new b(paramf);
    if (!isFTSContextReady())
    {
      com.tencent.mm.sdk.f.e.post(localb, "FTSExceptionHandler");
      GMTrace.o(18507819384832L, 137894);
      return localb;
    }
    localb.errorCode = -3;
    if (!isFTSIndexReady())
    {
      com.tencent.mm.sdk.f.e.post(localb, "FTSExceptionHandler");
      GMTrace.o(18507819384832L, 137894);
      return localb;
    }
    if (this.lvH.indexOfKey(paramInt) >= 0)
    {
      com.tencent.mm.plugin.fts.a.i locali = (com.tencent.mm.plugin.fts.a.i)this.lvH.get(paramInt);
      if (locali.aCj())
      {
        paramf = locali.a(paramf);
        GMTrace.o(18507819384832L, 137894);
        return paramf;
      }
      com.tencent.mm.sdk.f.e.post(localb, "FTSExceptionHandler");
      GMTrace.o(18507819384832L, 137894);
      return localb;
    }
    w.e("MicroMsg.FTS.PluginFTS", "Not Found Search Logic, LogicArraySize=%d", new Object[] { Integer.valueOf(this.lvH.size()) });
    com.tencent.mm.sdk.f.e.post(localb, "FTSExceptionHandler");
    GMTrace.o(18507819384832L, 137894);
    return localb;
  }
  
  public int stringCompareUtfBinary(String paramString1, String paramString2)
  {
    GMTrace.i(18509027344384L, 137903);
    int i = FTSJNIUtils.stringCompareUtfBinary(paramString1, paramString2);
    GMTrace.o(18509027344384L, 137903);
    return i;
  }
  
  public void unregisterIndexStorage(int paramInt)
  {
    GMTrace.i(18508624691200L, 137900);
    com.tencent.mm.plugin.fts.a.g localg;
    if (this.lvF.indexOfKey(paramInt) >= 0) {
      localg = (com.tencent.mm.plugin.fts.a.g)this.lvF.get(paramInt);
    }
    try
    {
      localg.destroy();
      this.lvF.remove(paramInt);
      GMTrace.o(18508624691200L, 137900);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.FTS.PluginFTS", "Destroy Index Storage name=%s \nexception=%s", new Object[] { localg.getName(), bg.f(localException) });
      }
    }
  }
  
  public void unregisterNativeLogic(int paramInt)
  {
    GMTrace.i(18509295779840L, 137905);
    com.tencent.mm.plugin.fts.a.i locali;
    if (this.lvH.indexOfKey(paramInt) >= 0) {
      locali = (com.tencent.mm.plugin.fts.a.i)this.lvH.get(paramInt);
    }
    try
    {
      locali.destroy();
      this.lvH.remove(paramInt);
      GMTrace.o(18509295779840L, 137905);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.FTS.PluginFTS", "Destroy Native Logic name=%s \nexception=%s", new Object[] { locali.getName(), bg.f(localException) });
      }
    }
  }
  
  public void updateTopHitsRank(String paramString, com.tencent.mm.plugin.fts.a.a.i parami, int paramInt)
  {
    GMTrace.i(18508087820288L, 137896);
    if ((isFTSContextReady()) && (this.lvH.indexOfKey(1) >= 0)) {
      ((com.tencent.mm.plugin.fts.a.i)this.lvH.get(1)).a(paramString, parami, paramInt, com.tencent.mm.plugin.fts.a.d.aCk());
    }
    GMTrace.o(18508087820288L, 137896);
  }
  
  public void waitAndStartDaemon()
  {
    GMTrace.i(18507550949376L, 137892);
    com.tencent.mm.kernel.h.xz();
    boolean bool;
    if (bg.e((Integer)com.tencent.mm.kernel.h.xy().xh().get(15, null)) != 0)
    {
      bool = true;
      this.lvs = bool;
      if (this.lvs) {
        break label117;
      }
      com.tencent.mm.kernel.h.wS().a(138, this.lvC);
      w.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for account initialized");
      label69:
      if (this.lvt) {
        break label128;
      }
      w.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for all account post reset.");
    }
    for (;;)
    {
      if ((this.lvs) && (this.lvt)) {
        startDaemon();
      }
      GMTrace.o(18507550949376L, 137892);
      return;
      bool = false;
      break;
      label117:
      w.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon user is initialized.");
      break label69;
      label128:
      w.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon all account post reset.");
    }
  }
  
  private final class a
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public a()
    {
      GMTrace.i(18559224774656L, 138277);
      GMTrace.o(18559224774656L, 138277);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18559358992384L, 138278);
      com.tencent.mm.kernel.h.xz();
      if (2 != ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyF, Integer.valueOf(0))).intValue())
      {
        c.aCc();
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vyF, Integer.valueOf(2));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vyG, Integer.valueOf(0));
      }
      com.tencent.mm.kernel.h.xz();
      Object localObject = new File(com.tencent.mm.kernel.h.xy().cachePath, "IndexMicroMsg.db");
      if (((File)localObject).exists()) {
        ((File)localObject).delete();
      }
      try
      {
        localObject = PluginFTS.this;
        com.tencent.mm.kernel.h.xz();
        ((PluginFTS)localObject).lvr = new c(com.tencent.mm.kernel.h.xy().cachePath);
        PluginFTS.this.registerStorage();
        PluginFTS.this.createIndexStorage();
        PluginFTS.this.registerSearchLogic();
        PluginFTS.this.createNativeLogic();
        GMTrace.o(18559358992384L, 138278);
        return true;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          if (PluginFTS.lvy)
          {
            GMTrace.o(18559358992384L, 138278);
            return true;
          }
          w.printErrStackTrace("MicroMsg.FTS.PluginFTS", localException, "Index database corruption detected", new Object[0]);
          com.tencent.mm.plugin.fts.a.e.nX(19);
          PluginFTS.this.destroyNativeLogic();
          PluginFTS.this.destroyStorage();
          PluginFTS.this.lvr.close();
          c.aCc();
          String str = "InitSearchTask: " + Log.getStackTraceString(localException);
          com.tencent.mm.plugin.report.service.g.ork.d("FTS", str, null);
        }
      }
    }
    
    public final String getName()
    {
      GMTrace.i(18559493210112L, 138279);
      GMTrace.o(18559493210112L, 138279);
      return "InitSearchTask";
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public b()
    {
      GMTrace.i(18504732377088L, 137871);
      GMTrace.o(18504732377088L, 137871);
    }
    
    public final boolean execute()
    {
      int i = 0;
      GMTrace.i(18504866594816L, 137872);
      Object localObject4 = ab.getContext().getAssets();
      localObject3 = null;
      localObject1 = null;
      try
      {
        localObject4 = ((AssetManager)localObject4).open("t2sCH.txt");
        localObject1 = localObject4;
        localObject3 = localObject4;
        String[] arrayOfString = new String(com.tencent.mm.loader.stub.b.c((InputStream)localObject4)).split(",");
        for (;;)
        {
          localObject1 = localObject4;
          localObject3 = localObject4;
          if (i + 1 >= arrayOfString.length) {
            break;
          }
          localObject1 = localObject4;
          localObject3 = localObject4;
          SpellMap.hjt.put(arrayOfString[i], arrayOfString[(i + 1)]);
          i += 2;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localObject3 = localObject1;
          w.printErrStackTrace("MicroMsg.FTS.PluginFTS", localException, localException.getMessage(), new Object[0]);
          com.tencent.mm.a.e.b((InputStream)localObject1);
        }
      }
      finally
      {
        com.tencent.mm.a.e.b((InputStream)localObject3);
      }
      GMTrace.o(18504866594816L, 137872);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18505000812544L, 137873);
      GMTrace.o(18505000812544L, 137873);
      return "InitT2SCHTask";
    }
    
    public final String toString()
    {
      GMTrace.i(18505135030272L, 137874);
      String str = String.format("InitT2SCHTask size: %d", new Object[] { Integer.valueOf(SpellMap.hjt.size()) });
      GMTrace.o(18505135030272L, 137874);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\PluginFTS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */