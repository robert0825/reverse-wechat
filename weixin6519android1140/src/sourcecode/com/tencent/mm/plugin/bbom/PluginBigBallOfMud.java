package com.tencent.mm.plugin.bbom;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.mm.AppCallBack;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mm.R.l;
import com.tencent.mm.app.MMApplicationLike;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.booter.MMReceivers.SandBoxProcessReceiver;
import com.tencent.mm.booter.MMReceivers.ToolsProcessReceiver;
import com.tencent.mm.booter.d.a;
import com.tencent.mm.booter.d.b;
import com.tencent.mm.booter.q;
import com.tencent.mm.booter.x;
import com.tencent.mm.compatible.loader.f.1;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.api.bucket.ApplicationLifeCycleBucket;
import com.tencent.mm.modelfriend.s.a;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.messenger.foundation.a.p.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.MMAppMgr.Receiver;
import com.tencent.mm.x.f.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.be;
import com.tencent.mm.y.d.b.3;
import com.tencent.mm.y.l.1;
import com.tencent.mm.y.l.2;
import com.tencent.mm.y.l.3;
import com.tencent.mm.y.t;
import com.tencent.mm.y.t.a;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteTrace;
import java.util.Iterator;
import java.util.List;

public class PluginBigBallOfMud
  extends com.tencent.mm.kernel.b.d
  implements ApplicationLifeCycleBucket
{
  private static final String TAG = "MicroMsg.PluginBigBallOfMud";
  public Application app;
  private final MMAppMgr appMgr;
  private com.tencent.mm.compatible.loader.e mProfileCompat;
  
  public PluginBigBallOfMud()
  {
    GMTrace.i(8021522513920L, 59765);
    this.appMgr = new MMAppMgr();
    GMTrace.o(8021522513920L, 59765);
  }
  
  private void autoScaleFontSize()
  {
    GMTrace.i(8022193602560L, 59770);
    GMTrace.o(8022193602560L, 59770);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(8021925167104L, 59768);
    MMReceivers.ToolsProcessReceiver.a(new d.b());
    MMReceivers.SandBoxProcessReceiver.a(new d.a());
    Object localObject1 = (com.tencent.mm.plugin.zero.a.d)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.zero.a.d.class);
    ((com.tencent.mm.plugin.zero.a.d)localObject1).setILightPushDelegate(new g());
    ((com.tencent.mm.plugin.zero.a.d)localObject1).addNotifyReceiverCallback(new k());
    ((com.tencent.mm.plugin.zero.a.d)localObject1).addICoreServiceLifecycleCallback(new d());
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "zero %s", new Object[] { localObject1 });
    this.app = parame.gap;
    com.tencent.mm.modelstat.d.b(this.app);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "app.getResources() is:" + parame.gap.getResources());
    ab.a(com.tencent.mm.bs.a.a(parame.gap.getResources(), parame.gap));
    autoScaleFontSize();
    com.tencent.mm.app.d.ag(this.app.getApplicationContext());
    long l = System.currentTimeMillis();
    Object localObject3 = new com.tencent.mm.compatible.loader.f();
    localObject1 = this.app;
    Object localObject2 = parame.fXf;
    if ((localObject2 == null) || (((String)localObject2).length() <= 0))
    {
      HandlerThread localHandlerThread = com.tencent.mm.sdk.f.e.SV("ProfileFactoryImp_handlerThread");
      localHandlerThread.start();
      localObject2 = (String)new f.1((com.tencent.mm.compatible.loader.f)localObject3).b(new ae(localHandlerThread.getLooper()));
      localHandlerThread.getLooper().quit();
    }
    for (;;)
    {
      if (localObject2 == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ProfileFactoryImpl", "get process name failed, retry later");
        localObject1 = null;
        this.mProfileCompat = ((com.tencent.mm.compatible.loader.e)localObject1);
        if ((this.mProfileCompat != null) && (!parame.eR("")))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "before profile oncreate.");
          this.mProfileCompat.onCreate();
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "after profile oncreate.");
        ((com.tencent.mm.kernel.b.f)parame).mProfileCompat = this.mProfileCompat;
        localObject1 = parame.gap.getSharedPreferences("system_config_prefs", 0);
        if (localObject1 == null) {
          break label3144;
        }
      }
      label3142:
      label3144:
      for (int i = ((SharedPreferences)localObject1).getInt("default_uin", 0);; i = 0)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "APPonCreate proc:%s time:%d (loader:%d) ueh:%d data[%s] sdcard[%s]", new Object[] { parame.fXf, Long.valueOf(bg.aH(MMApplicationLike.sAppStartTime)), Long.valueOf(bg.aH(l)), Integer.valueOf(i), com.tencent.mm.storage.w.ghv, com.tencent.mm.compatible.util.e.ghx });
        com.tencent.mm.j.a.a.a(new com.tencent.mm.j.a()
        {
          public final void b(au paramAnonymousau)
          {
            GMTrace.i(14554167771136L, 108437);
            if (com.tencent.mm.af.f.dL(paramAnonymousau.field_talker)) {
              paramAnonymousau.dh(com.tencent.mm.af.a.e.Br());
            }
            GMTrace.o(14554167771136L, 108437);
          }
          
          public final String c(au paramAnonymousau)
          {
            GMTrace.i(16315238580224L, 121558);
            if (com.tencent.mm.af.f.dL(paramAnonymousau.field_talker))
            {
              paramAnonymousau = com.tencent.mm.af.a.e.jj(paramAnonymousau.fwv);
              GMTrace.o(16315238580224L, 121558);
              return paramAnonymousau;
            }
            GMTrace.o(16315238580224L, 121558);
            return null;
          }
          
          public final boolean dL(String paramAnonymousString)
          {
            GMTrace.i(16315372797952L, 121559);
            boolean bool = com.tencent.mm.af.f.dL(paramAnonymousString);
            GMTrace.o(16315372797952L, 121559);
            return bool;
          }
          
          public final String q(String paramAnonymousString, int paramAnonymousInt)
          {
            GMTrace.i(14554301988864L, 108438);
            if (com.tencent.mm.af.f.dL(paramAnonymousString))
            {
              paramAnonymousString = com.tencent.mm.af.a.e.jj(((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramAnonymousInt).fwv);
              GMTrace.o(14554301988864L, 108438);
              return paramAnonymousString;
            }
            paramAnonymousString = be.Bs();
            GMTrace.o(14554301988864L, 108438);
            return paramAnonymousString;
          }
        });
        if (parame.eR(""))
        {
          com.tencent.mm.modelfriend.s.gDt = new s.a()
          {
            public final String HM()
            {
              GMTrace.i(14555107295232L, 108444);
              if (com.tencent.mm.sdk.platformtools.f.vhv)
              {
                str = ab.getContext().getString(R.l.dUl);
                GMTrace.o(14555107295232L, 108444);
                return str;
              }
              String str = ab.getContext().getString(R.l.dUk);
              GMTrace.o(14555107295232L, 108444);
              return str;
            }
          };
          com.tencent.mm.bu.e.a(new SQLiteTrace()
          {
            public final void onConnectionObtained(SQLiteDatabase paramAnonymousSQLiteDatabase, String paramAnonymousString, long paramAnonymousLong, boolean paramAnonymousBoolean)
            {
              GMTrace.i(18911412092928L, 140901);
              GMTrace.o(18911412092928L, 140901);
            }
            
            public final void onConnectionPoolBusy(SQLiteDatabase paramAnonymousSQLiteDatabase, String paramAnonymousString1, List<String> paramAnonymousList, String paramAnonymousString2)
            {
              GMTrace.i(14703552102400L, 109550);
              GMTrace.o(14703552102400L, 109550);
            }
            
            public final void onDatabaseCorrupted(SQLiteDatabase paramAnonymousSQLiteDatabase)
            {
              GMTrace.i(14703686320128L, 109551);
              GMTrace.o(14703686320128L, 109551);
            }
            
            public final void onSQLExecuted(SQLiteDatabase paramAnonymousSQLiteDatabase, String paramAnonymousString, int paramAnonymousInt, long paramAnonymousLong)
            {
              GMTrace.i(14703417884672L, 109549);
              for (;;)
              {
                com.tencent.mm.y.d.b localb;
                try
                {
                  localb = com.tencent.mm.y.d.b.CA();
                  boolean bool1 = af.isMainThread();
                  paramAnonymousSQLiteDatabase = paramAnonymousSQLiteDatabase.getPath();
                  if (((paramAnonymousLong > localb.gqD) && (bool1)) || ((paramAnonymousLong > localb.gqF) && (!bool1)))
                  {
                    Iterator localIterator = com.tencent.mm.y.d.b.gqL.iterator();
                    if (localIterator.hasNext())
                    {
                      String str = (String)localIterator.next();
                      if (bool1) {
                        continue;
                      }
                      boolean bool2 = paramAnonymousSQLiteDatabase.contains(str);
                      if (!bool2) {
                        continue;
                      }
                    }
                  }
                  else
                  {
                    GMTrace.o(14703417884672L, 109549);
                    return;
                  }
                  if ((paramAnonymousInt == 2) && (bool1) && (paramAnonymousLong < localb.gqE)) {
                    continue;
                  }
                  if (localb.gqi) {
                    break label497;
                  }
                  paramAnonymousString = paramAnonymousString.trim().toUpperCase();
                  if ((!paramAnonymousString.startsWith("INSERT")) && (!paramAnonymousString.startsWith("UPDATE")) && (!paramAnonymousString.startsWith("DELETE")) && (!paramAnonymousString.startsWith("COMMIT")) && (!paramAnonymousString.startsWith("SELECT")))
                  {
                    paramAnonymousSQLiteDatabase = null;
                    if (!bg.nm(paramAnonymousSQLiteDatabase))
                    {
                      paramAnonymousString = new StringBuilder();
                      com.tencent.mm.y.d.b.a("tid", String.valueOf(Thread.currentThread().getId()), paramAnonymousString);
                      com.tencent.mm.y.d.b.a("sql", paramAnonymousSQLiteDatabase, paramAnonymousString);
                      com.tencent.mm.y.d.b.a("lastTime", String.valueOf(paramAnonymousLong), paramAnonymousString);
                      if (!com.tencent.mm.sdk.a.b.foreground) {
                        break label513;
                      }
                      paramAnonymousSQLiteDatabase = "1";
                      com.tencent.mm.y.d.b.a("foreground", paramAnonymousSQLiteDatabase, paramAnonymousString);
                      com.tencent.mm.y.d.b.a("tname", Thread.currentThread().getName(), paramAnonymousString);
                      paramAnonymousSQLiteDatabase = paramAnonymousString.toString();
                      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SQLTraceManager", "SQL Trace mark : " + paramAnonymousSQLiteDatabase);
                      at.xB().A(new b.3(localb, paramAnonymousSQLiteDatabase));
                    }
                    GMTrace.o(14703417884672L, 109549);
                    return;
                  }
                }
                catch (Exception paramAnonymousSQLiteDatabase)
                {
                  com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.SQLiteTrace", paramAnonymousSQLiteDatabase, "Failed to send trace.", new Object[0]);
                  GMTrace.o(14703417884672L, 109549);
                  return;
                }
                if (paramAnonymousString.startsWith("INSERT")) {
                  paramAnonymousSQLiteDatabase = paramAnonymousString.substring(0, paramAnonymousString.indexOf("(", 0));
                }
                for (;;)
                {
                  paramAnonymousString = paramAnonymousSQLiteDatabase;
                  if (paramAnonymousSQLiteDatabase.length() > 512) {
                    paramAnonymousString = paramAnonymousSQLiteDatabase.substring(0, 512) + "...";
                  }
                  paramAnonymousSQLiteDatabase = paramAnonymousString;
                  if (paramAnonymousString.trim().endsWith(";")) {
                    break;
                  }
                  paramAnonymousSQLiteDatabase = paramAnonymousString + ";";
                  break;
                  paramAnonymousSQLiteDatabase = paramAnonymousString;
                  if (paramAnonymousString.startsWith("COMMIT"))
                  {
                    if (paramAnonymousLong <= localb.gqG) {
                      break label508;
                    }
                    paramAnonymousSQLiteDatabase = paramAnonymousString + "task:" + bg.bQW();
                  }
                }
                label497:
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SQLTraceManager", "mark stop as file is full !");
                continue;
                label508:
                paramAnonymousSQLiteDatabase = null;
                continue;
                label513:
                paramAnonymousSQLiteDatabase = "0";
              }
            }
          });
          com.tencent.mm.storage.e.vpm = new com.tencent.mm.plugin.messenger.foundation.a.j()
          {
            public final String E(au paramAnonymousau)
            {
              GMTrace.i(14555241512960L, 108445);
              int i;
              if ((paramAnonymousau.field_bizChatId != -1L) && (com.tencent.mm.af.f.dL(paramAnonymousau.field_talker)))
              {
                i = 1;
                if (i == 0) {
                  break label95;
                }
                paramAnonymousau = paramAnonymousau.field_talker + ":" + paramAnonymousau.field_bizChatId;
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PluginBigBallOfMud", "mapNotifyInfo key:%s", new Object[] { paramAnonymousau });
              }
              for (;;)
              {
                GMTrace.o(14555241512960L, 108445);
                return paramAnonymousau;
                i = 0;
                break;
                label95:
                paramAnonymousau = paramAnonymousau.field_talker;
              }
            }
          };
          t.a(new t.a()
          {
            public final boolean a(String paramAnonymousString1, String paramAnonymousString2, PInt paramAnonymousPInt)
            {
              GMTrace.i(14554973077504L, 108443);
              if (com.tencent.mm.y.s.fD(paramAnonymousString1))
              {
                if (com.tencent.mm.af.f.dL(paramAnonymousString1)) {
                  if (com.tencent.mm.af.a.e.jf(paramAnonymousString2)) {
                    paramAnonymousPInt.value = 5;
                  }
                }
                for (;;)
                {
                  GMTrace.o(14554973077504L, 108443);
                  return true;
                  paramAnonymousPInt.value = 4;
                  continue;
                  if (com.tencent.mm.af.f.iO(paramAnonymousString1)) {
                    paramAnonymousPInt.value = 3;
                  } else if (com.tencent.mm.af.f.iP(paramAnonymousString1)) {
                    paramAnonymousPInt.value = 0;
                  } else if (com.tencent.mm.af.f.iL(paramAnonymousString1)) {
                    paramAnonymousPInt.value = 6;
                  } else {
                    paramAnonymousPInt.value = 7;
                  }
                }
              }
              GMTrace.o(14554973077504L, 108443);
              return false;
            }
          });
          com.tencent.mm.plugin.messenger.foundation.a.s.b(new com.tencent.mm.bz.b() {});
          localObject1 = new com.tencent.mm.modelmulti.a();
          p.a.a(69, (p)localObject1);
          p.a.a(68, (p)localObject1);
          p.a.a(22, (p)localObject1);
          p.a.a(13, (p)localObject1);
          p.a.a(15, (p)localObject1);
          p.a.a(23, (p)localObject1);
          p.a.a(25, (p)localObject1);
          p.a.a(24, (p)localObject1);
          p.a.a(33, (p)localObject1);
          p.a.a(35, (p)localObject1);
          p.a.a(44, (p)localObject1);
          p.a.a(999999, (p)localObject1);
          p.a.a(53, (p)localObject1);
          p.a.a(204, (p)localObject1);
          localObject1 = new c();
          ((com.tencent.mm.plugin.messenger.foundation.a.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.c.class)).a((com.tencent.mm.plugin.messenger.foundation.a.b)localObject1);
          com.tencent.mm.kernel.h.wS().a(681, (com.tencent.mm.ad.e)localObject1);
          com.tencent.mm.plugin.messenger.foundation.a.s.a(5, new h());
          com.tencent.mm.plugin.messenger.foundation.a.s.a(1, new o());
          com.tencent.mm.plugin.messenger.foundation.a.s.a(4, new e());
          ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new a());
          localObject1 = new i();
          ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.o.class)).a((com.tencent.mm.plugin.messenger.foundation.a.k)localObject1);
          ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.o.class)).a((com.tencent.mm.plugin.messenger.foundation.a.f)localObject1);
          com.tencent.mm.y.e.a(new b());
          new com.tencent.mm.permission.b();
          new m().bPu();
          com.tencent.mm.kernel.h.wS().b(138, j.jjR);
          com.tencent.mm.kernel.h.wS().b(39, j.jjR);
          com.tencent.mm.kernel.h.wS().b(268369922, j.jjR);
          if (j.jjR == null) {
            j.jjR = new j();
          }
          com.tencent.mm.kernel.h.wS().a(138, j.jjR);
          com.tencent.mm.kernel.h.wS().a(39, j.jjR);
          com.tencent.mm.kernel.h.wS().a(268369922, j.jjR);
          l.ca(this.app);
          com.tencent.mm.au.a.a.a("delchatroommember", new l.1());
          com.tencent.mm.au.a.a.a("NewXmlChatRoomAccessVerifyApplication", new l.2());
          com.tencent.mm.au.a.a.a("NewXmlChatRoomAccessVerifyApproval", new l.3());
          localObject1 = this.appMgr;
          localObject2 = this.app;
          if (((MMAppMgr)localObject1).vLS == null) {
            ((MMAppMgr)localObject1).vLS = new MMAppMgr.Receiver((MMAppMgr)localObject1);
          }
          MMActivity.bXn();
          localObject3 = new IntentFilter();
          ((IntentFilter)localObject3).addAction("com.tencent.mm.ui.ACTION_ACTIVE");
          ((IntentFilter)localObject3).addAction("com.tencent.mm.ui.ACTION_DEACTIVE");
          ((IntentFilter)localObject3).addAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
          ((IntentFilter)localObject3).addAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
          ((IntentFilter)localObject3).addAction("MINIQB_OPEN_RET");
          ((Context)localObject2).registerReceiver(((MMAppMgr)localObject1).vLS, (IntentFilter)localObject3, "com.tencent.mm.permission.MM_MESSAGE", null);
          localObject1 = new x(com.tencent.mm.booter.c.av(this.app));
          ((x)localObject1).dl("MM");
          com.tencent.mm.platformtools.r.hkp = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.use_cdn_down_thumb"), false);
          com.tencent.mm.platformtools.r.hjx = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.display_errcode"), false);
          com.tencent.mm.platformtools.r.hjy = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.display_msgstate"), false);
          com.tencent.mm.platformtools.r.hjz = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.network.simulate_fault"), false);
          com.tencent.mm.platformtools.r.hjA = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.network.force_touch"), false);
          com.tencent.mm.platformtools.r.hjB = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
          com.tencent.mm.platformtools.r.hjC = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.crashIsExit"), false);
          com.tencent.mm.platformtools.r.hkb = bg.getInt(bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.datatransfer.times"), "0"), 0);
          com.tencent.mm.platformtools.r.hkc = bg.getInt(bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.datatransfer.duration"), "0"), 0);
          com.tencent.mm.platformtools.r.hjE = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.album_drop_table"), false);
          com.tencent.mm.platformtools.r.hjF = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.album_dle_file"), false);
          com.tencent.mm.platformtools.r.hjG = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.album_show_info"), false);
          com.tencent.mm.platformtools.r.hjH = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.location_help"), false);
          com.tencent.mm.platformtools.r.hjK = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.force_soso"), false);
          com.tencent.mm.platformtools.r.hjL = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.simulatePostServerError"), false);
          com.tencent.mm.platformtools.r.hjM = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
          com.tencent.mm.platformtools.r.hjN = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
          com.tencent.mm.platformtools.r.hjQ = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.filterfpnp"), false);
          com.tencent.mm.platformtools.r.hjR = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.testForPull"), false);
          i = bg.a(((x)localObject1).getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
          com.tencent.mm.platformtools.r.hjO = i;
          if ((i != 4) && (com.tencent.mm.platformtools.r.hjO > 0))
          {
            com.tencent.mm.storage.v.vpz = com.tencent.mm.platformtools.r.hjO;
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WorkerDebugger", "cdn thread num " + com.tencent.mm.platformtools.r.hjO);
          }
          com.tencent.mm.platformtools.r.hjP = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
          com.tencent.mm.platformtools.r.hjS = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.server.host.http"), "");
          com.tencent.mm.platformtools.r.hjT = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.server.host.socket"), "");
          if (bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.show_full_version"), false)) {
            com.tencent.mm.sdk.platformtools.f.vhs = true;
          }
        }
        for (;;)
        {
          try
          {
            i = Integer.decode(((x)localObject1).getString(".com.tencent.mm.debug.log.setversion")).intValue();
            com.tencent.mm.protocal.d.zM(i);
            new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
          }
          catch (Exception localException4)
          {
            try
            {
              localObject2 = ((x)localObject1).getString(".com.tencent.mm.debug.log.setapilevel");
              if (!bg.nm((String)localObject2))
              {
                com.tencent.mm.protocal.d.DEVICE_TYPE = "android-" + (String)localObject2;
                com.tencent.mm.protocal.d.tJx = "android-" + (String)localObject2;
                com.tencent.mm.protocal.d.tJz = (String)localObject2;
                com.tencent.mm.sdk.a.b.Ry((String)localObject2);
                new StringBuilder("set up test protocal apilevel = ").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append(" ").append(com.tencent.mm.sdk.a.b.bPr());
              }
            }
            catch (Exception localException4)
            {
              try
              {
                l = Long.decode(((x)localObject1).getString(".com.tencent.mm.debug.log.setuin")).longValue();
                new StringBuilder("set up test protocal uin old: ").append(com.tencent.mm.protocal.d.tJB).append(" new: ").append(l);
                com.tencent.mm.protocal.d.tJB = l;
              }
              catch (Exception localException4)
              {
                try
                {
                  i = Integer.decode(((x)localObject1).getString(".com.tencent.mm.debug.log.setchannel")).intValue();
                  ((q)localObject1).fJG.fIP = i;
                }
                catch (Exception localException4)
                {
                  try
                  {
                    boolean bool1 = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.report.debugmodel"), false);
                    boolean bool2 = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.report.kvstat"), false);
                    boolean bool3 = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.report.clientpref"), false);
                    boolean bool4 = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.report.useraction"), false);
                    com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                    new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                    com.tencent.mm.platformtools.r.hjW = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.update_test"), false);
                    com.tencent.mm.platformtools.r.hjX = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.scan_save_image"), false);
                    com.tencent.mm.platformtools.r.hjZ = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.shake_get_config_list"), false);
                    com.tencent.mm.platformtools.r.hka = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.test.shake_show_shaketv"), false);
                    com.tencent.mm.platformtools.r.hke = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.jsapi.permission"), "");
                    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.WorkerDebugger", "Test.jsapiPermission = " + com.tencent.mm.platformtools.r.hke);
                    com.tencent.mm.platformtools.r.hkt = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.cdn.front"), "");
                    com.tencent.mm.platformtools.r.hku = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.cdn.zone"), "");
                    com.tencent.mm.platformtools.r.hkv = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.cdn.wifi_elt"), "");
                    com.tencent.mm.platformtools.r.hkw = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.cdn.nowifi_elt"), "");
                    com.tencent.mm.platformtools.r.hkx = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.cdn.ptl"), "");
                    com.tencent.mm.platformtools.r.hky = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.cdn.usestream"), false);
                    com.tencent.mm.platformtools.r.hkz = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.cdn.onlysendetl"), false);
                    com.tencent.mm.platformtools.r.hkA = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.cdn.onlysendptl"), false);
                    com.tencent.mm.platformtools.r.hkC = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.cdn.enable_debug"), false);
                    com.tencent.mm.platformtools.r.hkD = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.cdn.enable_conn_verify"), false);
                    com.tencent.mm.platformtools.r.hkE = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.cdn.enable_video_redirect_oc"), false);
                    com.tencent.mm.platformtools.r.hkK = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.bakmove_hardcode"), false);
                    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.WorkerDebugger", "Test.bakmove_hardcode = " + com.tencent.mm.platformtools.r.hkK);
                    com.tencent.mm.platformtools.r.hkL = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.bakmove_ip"), "");
                    com.tencent.mm.platformtools.r.hkM = bg.getInt(bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.bakmove_port"), "0"), 0);
                    com.tencent.mm.platformtools.r.hkH = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.cursormode_enabled"), true);
                    com.tencent.mm.platformtools.r.hli = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.disaster_ignore_interval"), false);
                    com.tencent.mm.platformtools.r.hlj = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.disaster_ignore_expire"), false);
                    com.tencent.mm.platformtools.r.hlk = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.disaster_ignore_remove"), false);
                    com.tencent.mm.platformtools.r.hkZ = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.netscene_sniffer.enable_snapshot"), false);
                    com.tencent.mm.platformtools.r.hlb = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.netscene_sniffer.snapshot_protocal"), "");
                    com.tencent.mm.platformtools.r.hla = bg.a(((x)localObject1).dm(".com.tencent.mm.debug.netscene_sniffer.enable_inject"), false);
                    com.tencent.mm.platformtools.r.hlc = bg.aq(((x)localObject1).getString(".com.tencent.mm.debug.netscene_sniffer.inject_protocal"), "");
                    localObject1 = bg.eH(ab.getContext());
                    if ((localObject1 != null) && (((ComponentName)localObject1).getPackageName().equals(ab.getPackageName())) && (((ComponentName)localObject1).getClassName().equals(ab.bPS())))
                    {
                      WorkerProfile.pz().etw = true;
                      WorkerProfile.pz().etx = true;
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "start time check currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s", new Object[] { ((ComponentName)localObject1).getPackageName(), ((ComponentName)localObject1).getClassName() });
                      com.tencent.mm.kernel.a.a.a(new com.tencent.mm.plugin.h.d(), parame);
                      com.tencent.mm.y.d.b.CA();
                      com.tencent.mm.y.d.b.setup();
                      AppLogic.setCallBack(new AppCallBack(ab.getContext()));
                      SmcLogic.setCallBack(new com.tencent.mm.plugin.report.service.h());
                      com.tencent.mm.plugin.report.service.h.orx = (WorkerProfile)this.mProfileCompat;
                      com.tencent.mm.compatible.util.k.b(com.tencent.mm.sdk.a.vgP, WorkerProfile.class.getClassLoader());
                      BaseEvent.onCreate();
                      SmcLogic.SetDebugFlag(com.tencent.mm.plugin.report.a.c.oqh);
                      parame = (com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class);
                      com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.zero.a.d.class);
                      localObject1 = (com.tencent.mm.plugin.h.c)new com.tencent.mm.plugin.h.c().after(parame).before(this);
                      localObject1 = (com.tencent.mm.plugin.h.a)new com.tencent.mm.plugin.h.a().after((com.tencent.mm.kernel.b.a)localObject1).before(this);
                      new com.tencent.mm.plugin.h.e().after((com.tencent.mm.kernel.b.a)localObject1).before(this);
                      new com.tencent.mm.plugin.h.b().after(parame).before(this);
                      com.tencent.mm.pluginsdk.j.a.b.m.a(new com.tencent.mm.pluginsdk.j.a.a.a()
                      {
                        public final boolean kW(int paramAnonymousInt)
                        {
                          GMTrace.i(16314835927040L, 121555);
                          if ((paramAnonymousInt == 39) && (!com.tencent.mm.plugin.ipcall.d.aHT()))
                          {
                            GMTrace.o(16314835927040L, 121555);
                            return true;
                          }
                          GMTrace.o(16314835927040L, 121555);
                          return false;
                        }
                      });
                      f.b.a(new com.tencent.mm.bz.b() {});
                      f.b.a(new com.tencent.mm.bz.b() {});
                      f.b.a(new com.tencent.mm.bz.b() {});
                      f.b.a(new com.tencent.mm.bz.b() {});
                      GMTrace.o(8021925167104L, 59768);
                      return;
                      ab.RQ((String)localObject2);
                      if (((String)localObject2).equals(ab.getPackageName()))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.WorkerProfile");
                        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ProfileFactoryImpl", "application started, profile = %s", new Object[] { localObject2 });
                        break;
                      }
                      if (((String)localObject2).equals(ab.getPackageName() + ":push"))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.PusherProfile");
                        continue;
                      }
                      if (((String)localObject2).equals(ab.getPackageName() + ":tools"))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.ToolsProfile");
                        continue;
                      }
                      if (((String)localObject2).equals(ab.getPackageName() + ":sandbox"))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.SandBoxProfile");
                        continue;
                      }
                      if (((String)localObject2).equals(ab.getPackageName() + ":exdevice"))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.ExDeviceProfile");
                        continue;
                      }
                      if (((String)localObject2).equals(ab.getPackageName() + ":TMAssistantDownloadSDKService"))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.TMAssistantProfile");
                        continue;
                      }
                      if (((String)localObject2).equals(ab.getPackageName() + ":nospace"))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.NoSpaceProfile");
                        continue;
                      }
                      if (((String)localObject2).equals(ab.getPackageName() + ":patch"))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.PatchProfile");
                        continue;
                      }
                      if (((String)localObject2).startsWith(ab.getPackageName() + ":appbrand"))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.AppBrandProfile");
                        continue;
                      }
                      if (((String)localObject2).startsWith(ab.getPackageName() + ":support"))
                      {
                        localObject1 = com.tencent.mm.compatible.loader.f.a((Application)localObject1, ".app.SupportProfile");
                        continue;
                      }
                      com.tencent.mm.sdk.a.b.r("MMApplication onCreate profile == null", "profile is null and initMMcore failed");
                      localObject1 = null;
                      break;
                      localException1 = localException1;
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WorkerDebugger", "no debugger was got");
                      continue;
                      localException2 = localException2;
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WorkerDebugger", "no debugger was got");
                      continue;
                      localException3 = localException3;
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WorkerDebugger", "no debugger was got");
                      continue;
                      localException4 = localException4;
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WorkerDebugger", "no debugger was got");
                      continue;
                    }
                  }
                  catch (Exception localException5)
                  {
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WorkerDebugger", "no debugger was got");
                    continue;
                  }
                }
              }
            }
          }
          if (localObject1 != null) {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "start time check onCreate appOnCreate currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s", new Object[] { ((ComponentName)localObject1).getPackageName(), ((ComponentName)localObject1).getClassName() });
          }
          for (;;)
          {
            if ((localObject1 == null) || (((ComponentName)localObject1).getPackageName().equals(ab.getPackageName()))) {
              break label3142;
            }
            WorkerProfile.pz().etw = true;
            break;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "start time check onCreate appOnCreate currentActivity == null");
          }
        }
      }
    }
  }
  
  public void dependency()
  {
    GMTrace.i(8021790949376L, 59767);
    dependsOn(com.tencent.mm.plugin.auth.a.b.class);
    dependsOn(com.tencent.mm.plugin.messenger.foundation.a.n.class);
    GMTrace.o(8021790949376L, 59767);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(8022059384832L, 59769);
    GMTrace.o(8022059384832L, 59769);
  }
  
  public void installed()
  {
    GMTrace.i(14554033553408L, 108436);
    GMTrace.o(14554033553408L, 108436);
  }
  
  public void onBaseContextAttached(Context paramContext)
  {
    GMTrace.i(8022998908928L, 59776);
    GMTrace.o(8022998908928L, 59776);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(8022462038016L, 59772);
    if (this.mProfileCompat != null) {
      this.mProfileCompat.onConfigurationChanged(paramConfiguration);
    }
    paramConfiguration = ab.getResources();
    if ((paramConfiguration instanceof com.tencent.mm.bs.a)) {
      ((com.tencent.mm.bs.a)paramConfiguration).bOB();
    }
    GMTrace.o(8022462038016L, 59772);
  }
  
  public void onCreate()
  {
    GMTrace.i(8022864691200L, 59775);
    GMTrace.o(8022864691200L, 59775);
  }
  
  public void onLowMemory()
  {
    GMTrace.i(8022596255744L, 59773);
    GMTrace.o(8022596255744L, 59773);
  }
  
  public void onTerminate()
  {
    GMTrace.i(8022327820288L, 59771);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "onTerminate(%s)", new Object[] { ab.vM() });
    if (this.mProfileCompat != null) {
      this.mProfileCompat.onTerminate();
    }
    MMAppMgr localMMAppMgr = this.appMgr;
    Application localApplication = this.app;
    if (localMMAppMgr.vLS != null) {
      localApplication.unregisterReceiver(localMMAppMgr.vLS);
    }
    GMTrace.o(8022327820288L, 59771);
  }
  
  public void onTrimMemory(int paramInt)
  {
    GMTrace.i(8022730473472L, 59774);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PluginBigBallOfMud", "onTrimMemory, level = %d, process = %s", new Object[] { Integer.valueOf(paramInt), ab.vM() });
    if (this.mProfileCompat != null) {
      this.mProfileCompat.onTrimMemory(paramInt);
    }
    GMTrace.o(8022730473472L, 59774);
  }
  
  public String toString()
  {
    GMTrace.i(8021656731648L, 59766);
    GMTrace.o(8021656731648L, 59766);
    return "plugin-big-ball-of-mud";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\PluginBigBallOfMud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */