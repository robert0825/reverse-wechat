package com.tencent.mm.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.LocationManager;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.provider.Settings.Secure;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.BaseEvent;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.bb.e.1;
import com.tencent.mm.booter.CoreService;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.booter.cache.CacheService;
import com.tencent.mm.booter.z;
import com.tencent.mm.booter.z.a;
import com.tencent.mm.g.a.co;
import com.tencent.mm.g.a.fp;
import com.tencent.mm.g.a.iv;
import com.tencent.mm.g.a.l;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.qj;
import com.tencent.mm.g.a.qw;
import com.tencent.mm.g.a.rj;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.g.a.x;
import com.tencent.mm.modelmulti.j;
import com.tencent.mm.modelmulti.q;
import com.tencent.mm.modelmulti.r;
import com.tencent.mm.modelvideo.x.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.i.p;
import com.tencent.mm.pluginsdk.model.app.am.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.p.k;
import com.tencent.mm.pluginsdk.p.z;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import java.util.Map;

public final class MMAppMgr
{
  public static StringBuffer vLP;
  private static long vLQ;
  public long gVk;
  public String vLR;
  public Receiver vLS;
  public boolean vLT;
  public boolean vLU;
  public final com.tencent.mm.sdk.platformtools.aj vLV;
  private final com.tencent.mm.sdk.platformtools.aj vLW;
  
  public MMAppMgr()
  {
    GMTrace.i(1609404776448L, 11991);
    this.vLT = false;
    this.vLU = false;
    this.vLV = new com.tencent.mm.sdk.platformtools.aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(2850381889536L, 21237);
        Object localObject = bg.bs(ab.getContext());
        if ((localObject != null) && (((String)localObject).toLowerCase().startsWith(ab.getPackageName())))
        {
          w.i("MicroMsg.MMAppMgr", "onTimerExpired, top activity belongs to mm, skip kill tools");
          GMTrace.o(2850381889536L, 21237);
          return false;
        }
        w.i("MicroMsg.MMAppMgr", "onTimerExpired, kill tools process");
        localObject = new Intent();
        ((Intent)localObject).setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
        ab.getContext().sendBroadcast((Intent)localObject);
        GMTrace.o(2850381889536L, 21237);
        return false;
      }
    }, true);
    this.vLW = new com.tencent.mm.sdk.platformtools.aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3012785340416L, 22447);
        if (MMAppMgr.this.vLU == MMAppMgr.this.vLT)
        {
          w.d("MicroMsg.MMAppMgr", "status not changed, cur=" + MMAppMgr.this.vLU);
          GMTrace.o(3012785340416L, 22447);
          return true;
        }
        if (at.AJ())
        {
          GMTrace.o(3012785340416L, 22447);
          return false;
        }
        MMAppMgr.this.vLU = MMAppMgr.this.vLT;
        BaseEvent.onForeground(MMAppMgr.this.vLU);
        com.tencent.mm.ai.a.bs(MMAppMgr.this.vLU);
        if (MMAppMgr.this.vLU)
        {
          w.w("MicroMsg.MMAppMgr", "[ACTIVATED MODE]");
          WorkerProfile.pA();
          at.wS().bk(true);
          if ((at.AU()) && (com.tencent.mm.kernel.h.xw().fYg) && (!at.wF()))
          {
            localObject1 = z.fJI;
            if (!((z)localObject1).hasInit)
            {
              ((z)localObject1).hasInit = true;
              Object localObject2 = com.tencent.mm.y.c.c.Ct().er("100066");
              if (((com.tencent.mm.storage.c)localObject2).isValid())
              {
                localObject2 = ((com.tencent.mm.storage.c)localObject2).bSg();
                ((z)localObject1).fJU = com.tencent.mm.platformtools.t.getInt((String)((Map)localObject2).get("maxCacheCount"), 20);
                ((z)localObject1).fJV = com.tencent.mm.platformtools.t.getInt((String)((Map)localObject2).get("maxCacheHours"), 24);
              }
              localObject2 = com.tencent.mm.y.c.c.Ct().er("100058");
              if (((com.tencent.mm.storage.c)localObject2).isValid())
              {
                localObject2 = ((com.tencent.mm.storage.c)localObject2).bSg();
                ((z)localObject1).fJW = com.tencent.mm.platformtools.t.getInt((String)((Map)localObject2).get("cacheLogCount"), 30);
                ((z)localObject1).fJX = com.tencent.mm.platformtools.t.getInt((String)((Map)localObject2).get("maxCacheTime"), 10800);
              }
              w.i("MicroMsg.StayTimeReport", "initAbtestChattingArg appMaxCnt:%d, appMaxHour:%d, chattingMaxCnt:%d, chattingMaxSeconds:%d", new Object[] { Integer.valueOf(((z)localObject1).fJU), Integer.valueOf(((z)localObject1).fJV), Integer.valueOf(((z)localObject1).fJW), Integer.valueOf(((z)localObject1).fJX) });
            }
            com.tencent.mm.modelsimple.f.bA(true);
            q.JF().gE(3);
            at.wS().a(new j(), 0);
            at.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2531480567808L, 18861);
                com.tencent.mm.modelvoice.m.NM().run();
                com.tencent.mm.modelvideo.o.Nm().run();
                com.tencent.mm.ao.n.IX().run();
                an.bJK().run();
                if (ak.a.gna != null) {
                  ak.a.gna.AD();
                }
                com.tencent.mm.sdk.b.a.vgX.m(new qj());
                at.AR();
                com.tencent.mm.y.c.yJ().b(null);
                GMTrace.o(2531480567808L, 18861);
              }
            });
            bq.BG().c(19, new Object[] { Integer.valueOf(1) });
            localObject1 = com.tencent.mm.bb.e.Me();
            w.d("MicroMsg.SpeexUploadCore", "now pause speex uploader");
            ((com.tencent.mm.bb.e)localObject1).gEP.kH(true);
            com.tencent.mm.ao.n.Jb().bk(true);
            if (p.z.tmj != null) {
              p.z.tmj.bry();
            }
            localObject1 = new l();
            ((l)localObject1).eAn.eAo = true;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            com.tencent.mm.modelstat.n.hj(4);
            com.tencent.mm.modelstat.n.hj(3);
            com.tencent.mm.modelstat.n.bD(true);
            localObject1 = new qw();
            ((qw)localObject1).eVI.eVJ = true;
            ((qw)localObject1).eVI.scene = 1;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            localObject1 = new tn();
            ((tn)localObject1).eZp.eCx = 5;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          }
          at.wS().bj(false);
          ab.getContext().getSharedPreferences("notify_prep", 0).edit().putBoolean("longNoopIntervalFlag", false).commit();
          if (!MMAppMgr.this.vLV.bQn()) {
            MMAppMgr.this.vLV.stopTimer();
          }
          GMTrace.o(3012785340416L, 22447);
          return true;
        }
        w.w("MicroMsg.MMAppMgr", "[DEACTIVATED MODE]");
        WorkerProfile.pA();
        MMAppMgr.this.gVk = bg.Pw();
        MMAppMgr.this.vLR = "desktop";
        Object localObject1 = new l();
        ((l)localObject1).eAn.eAo = false;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        at.wS().bk(false);
        boolean bool;
        if (at.AU())
        {
          com.tencent.mm.kernel.h.xz();
          if (com.tencent.mm.kernel.h.xw().fYg)
          {
            com.tencent.mm.bk.a.PY(com.tencent.mm.bk.a.bNB());
            localObject1 = com.tencent.mm.bb.e.Me();
            Looper.myQueue().addIdleHandler(new e.1((com.tencent.mm.bb.e)localObject1));
            localObject1 = new mw();
            ((mw)localObject1).eRT.state = 0;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            localObject1 = new rj();
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            localObject1 = new com.tencent.mm.g.a.e();
            ((com.tencent.mm.g.a.e)localObject1).ezV.ezW = false;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            localObject1 = new nr();
            ((nr)localObject1).eSH.ezY = false;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            com.tencent.mm.ao.n.Jb().bk(false);
            w.d("MicroMsg.MMAppMgr", "[oneliang][statInputMethod]");
            at.AR();
            localObject1 = com.tencent.mm.y.c.xh().get(327808, null);
            if (localObject1 != null) {
              break label1127;
            }
            bool = true;
          }
        }
        for (;;)
        {
          w.d("MicroMsg.MMAppMgr", "[oneliang][statInputMethod] needToStat:%s", new Object[] { String.valueOf(bool) });
          if (bool) {}
          try
          {
            localObject1 = Settings.Secure.getString(ab.getContext().getContentResolver(), "default_input_method");
            g.ork.A(11375, bg.nl((String)localObject1));
            at.AR();
            com.tencent.mm.y.c.xh().set(327808, Long.valueOf(System.currentTimeMillis()));
            localObject1 = new co();
            ((co)localObject1).eDS.state = 0;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            localObject1 = new tn();
            ((tn)localObject1).eZp.eCx = 3;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            com.tencent.mm.modelsimple.f.bA(false);
            com.tencent.mm.modelstat.n.bD(false);
            if (!MMAppMgr.this.vLV.bQn()) {
              MMAppMgr.this.vLV.stopTimer();
            }
            bool = bg.bc(ab.getContext(), ab.getPackageName() + ":tools");
            w.i("MicroMsg.MMAppMgr", "before kill tools, tools is running : %b", new Object[] { Boolean.valueOf(bool) });
            if (!bool) {
              break;
            }
            MMAppMgr.this.vLV.z(60000L, 60000L);
            break;
            label1127:
            if (bg.nm(localObject1.toString()))
            {
              bool = true;
            }
            else
            {
              long l = bg.Sz(localObject1.toString());
              if (System.currentTimeMillis() - l >= 604800000L) {
                bool = true;
              }
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("MicroMsg.MMAppMgr", "[oneliang][inputMethodStat]exception:" + localException.getMessage());
            }
            bool = false;
          }
        }
      }
    }, false);
    GMTrace.o(1609404776448L, 11991);
  }
  
  public static void V(Activity paramActivity)
  {
    GMTrace.i(1610881171456L, 12002);
    com.tencent.mm.bj.d.b(paramActivity, "whatsnew", ".ui.WhatsNewUI", new Intent(), 57005);
    GMTrace.o(1610881171456L, 12002);
  }
  
  private static String Vg(String paramString)
  {
    GMTrace.i(1609807429632L, 11994);
    int i = paramString.length();
    int j = 0;
    i -= 1;
    while (i >= 0)
    {
      int k = j;
      if (paramString.charAt(i) == '|') {
        k = j + 1;
      }
      if (k == 3) {
        break;
      }
      i -= 1;
      j = k;
    }
    paramString = paramString.substring(i + 1);
    GMTrace.o(1609807429632L, 11994);
    return paramString;
  }
  
  public static void Vn()
  {
    GMTrace.i(1610210082816L, 11997);
    lj(true);
    GMTrace.o(1610210082816L, 11997);
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(1610612736000L, 12000);
    com.tencent.mm.kernel.h.xz().fZy.fZV.as(paramBoolean);
    BaseEvent.onSingalCrash(0);
    MMNativeJpeg.Destroy();
    com.tencent.mm.booter.o.px();
    if ((at.wS() != null) && (at.wS().gus != null)) {
      at.wS().gus.bo(paramBoolean);
    }
    Intent localIntent = new Intent().setClass(paramContext, LauncherUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("absolutely_exit_pid", Process.myPid());
    localIntent.putExtra("kill_service", paramBoolean);
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    paramContext.startActivity(localIntent);
    GMTrace.o(1610612736000L, 12000);
  }
  
  public static boolean a(final Activity paramActivity, final DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(19245882671104L, 143393);
    final SharedPreferences localSharedPreferences = paramActivity.getSharedPreferences(ab.bPU(), 0);
    boolean bool = localSharedPreferences.getBoolean("gprs_alert", true);
    com.tencent.mm.sdk.platformtools.f.vht &= bool;
    if (bool)
    {
      View localView = View.inflate(paramActivity, R.i.czE, null);
      CheckBox localCheckBox = (CheckBox)localView.findViewById(R.h.bFy);
      paramOnClickListener = com.tencent.mm.ui.base.h.a(paramActivity, false, null, localView, paramActivity.getString(R.l.diu), paramActivity.getString(R.l.dIa), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1609270558720L, 11990);
          if (this.vLY.isChecked())
          {
            SharedPreferences.Editor localEditor = localSharedPreferences.edit();
            localEditor.putBoolean("gprs_alert", false);
            localEditor.commit();
          }
          com.tencent.mm.sdk.platformtools.f.vht = false;
          paramAnonymousDialogInterface.dismiss();
          MMAppMgr.eZ(paramActivity);
          if (paramOnClickListener != null) {
            paramOnClickListener.onClick(paramAnonymousDialogInterface, paramAnonymousInt);
          }
          GMTrace.o(1609270558720L, 11990);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3012516904960L, 22445);
          paramAnonymousDialogInterface.dismiss();
          MMAppMgr.a(this.hjp, true);
          GMTrace.o(3012516904960L, 22445);
        }
      });
      if (paramOnClickListener == null)
      {
        GMTrace.o(19245882671104L, 143393);
        return false;
      }
      paramOnClickListener.setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2859374477312L, 21304);
          this.hjp.onKeyDown(4, new KeyEvent(0, 4));
          GMTrace.o(2859374477312L, 21304);
        }
      });
    }
    GMTrace.o(19245882671104L, 143393);
    return bool;
  }
  
  public static boolean a(Context paramContext, int paramInt, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(1611283824640L, 12005);
    View localView = View.inflate(paramContext, R.i.cDc, null);
    Object localObject = (CheckBox)localView.findViewById(R.h.bPX);
    ((CheckBox)localObject).setText(paramContext.getString(R.l.dLm));
    ((CheckBox)localObject).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(2849442365440L, 21230);
        at.AR();
        paramAnonymousCompoundButton = com.tencent.mm.y.c.xh();
        if (!paramAnonymousBoolean) {}
        for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
        {
          paramAnonymousCompoundButton.set(16385, Boolean.valueOf(paramAnonymousBoolean));
          GMTrace.o(2849442365440L, 21230);
          return;
        }
      }
    });
    localView.findViewById(R.h.bPZ).setVisibility(8);
    localObject = (TextView)localView.findViewById(R.h.bPY);
    switch (paramInt)
    {
    case 2: 
    default: 
      ((TextView)localObject).setText(R.l.dLs);
      paramInt = 1;
    }
    while (paramInt != 0)
    {
      paramContext = new com.tencent.mm.ui.base.i.a(paramContext);
      paramContext.BN(R.l.cUG);
      paramContext.lz(false);
      paramContext.dg(localView);
      paramContext.BQ(R.l.dLp).a(paramOnClickListener1);
      paramContext.BR(R.l.dLm).b(paramOnClickListener2);
      paramContext.aax().show();
      GMTrace.o(1611283824640L, 12005);
      return true;
      ((TextView)localObject).setText(R.l.dLs);
      paramInt = 0;
      continue;
      ((TextView)localObject).setText(R.l.dLl);
      paramInt = 1;
    }
    GMTrace.o(1611283824640L, 12005);
    return false;
  }
  
  public static void am(Context paramContext)
  {
    GMTrace.i(1610478518272L, 11999);
    a(paramContext, true);
    GMTrace.o(1610478518272L, 11999);
  }
  
  public static com.tencent.mm.ui.base.i an(Context paramContext)
  {
    GMTrace.i(1611418042368L, 12006);
    try
    {
      localObject = (LocationManager)paramContext.getSystemService("location");
      if (am.isWifi(paramContext))
      {
        boolean bool = ((LocationManager)localObject).isProviderEnabled("gps");
        if (bool)
        {
          GMTrace.o(1611418042368L, 12006);
          return null;
        }
      }
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.MMAppMgr", paramContext, "showLbsTipsAlert error", new Object[0]);
      GMTrace.o(1611418042368L, 12006);
      return null;
    }
    at.AR();
    Object localObject = (Boolean)com.tencent.mm.y.c.xh().get(4105, Boolean.valueOf(false));
    if ((localObject != null) && (((Boolean)localObject).booleanValue()))
    {
      GMTrace.o(1611418042368L, 12006);
      return null;
    }
    localObject = View.inflate(paramContext, R.i.cAK, null);
    ((CheckBox)((View)localObject).findViewById(R.h.bJS)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(2076482469888L, 15471);
        if (paramAnonymousBoolean)
        {
          at.AR();
          com.tencent.mm.y.c.xh().set(4105, Boolean.valueOf(true));
          GMTrace.o(2076482469888L, 15471);
          return;
        }
        at.AR();
        com.tencent.mm.y.c.xh().set(4105, Boolean.valueOf(false));
        GMTrace.o(2076482469888L, 15471);
      }
    });
    DialogInterface.OnClickListener local7 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1882269417472L, 14024);
        try
        {
          paramAnonymousDialogInterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
          this.val$context.startActivity(paramAnonymousDialogInterface);
          GMTrace.o(1882269417472L, 14024);
          return;
        }
        catch (Exception paramAnonymousDialogInterface)
        {
          w.printErrStackTrace("MicroMsg.MMAppMgr", paramAnonymousDialogInterface, "showLbsTipsAlert", new Object[0]);
          GMTrace.o(1882269417472L, 14024);
        }
      }
    };
    paramContext = new com.tencent.mm.ui.base.i.a(paramContext);
    paramContext.BN(R.l.dKT);
    paramContext.dg((View)localObject);
    paramContext.BQ(R.l.cUv).a(local7);
    paramContext.BR(R.l.cTq);
    paramContext = paramContext.aax();
    paramContext.show();
    GMTrace.o(1611418042368L, 12006);
    return paramContext;
  }
  
  public static void bXG()
  {
    GMTrace.i(1609673211904L, 11993);
    StringBuffer localStringBuffer = new StringBuffer(800);
    if (vLP == null)
    {
      vLP = localStringBuffer;
      vLQ = bg.Pu();
      GMTrace.o(1609673211904L, 11993);
      return;
    }
    String str = vLP.toString();
    localStringBuffer.append(Vg(str));
    vLP = localStringBuffer;
    w.i("MicroMsg.MMAppMgr", "oreh report clickstream %s", new Object[] { str });
    g.ork.A(10508, "1," + vLQ + "," + str);
    vLQ = bg.Pu();
    GMTrace.o(1609673211904L, 11993);
  }
  
  public static void cancelNotification(String paramString)
  {
    GMTrace.i(1609941647360L, 11995);
    at.getNotification().cancelNotification(paramString);
    GMTrace.o(1609941647360L, 11995);
  }
  
  public static void eZ(Context paramContext)
  {
    GMTrace.i(1611015389184L, 12003);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(ab.bPU(), 0);
    if (!localSharedPreferences.getBoolean("Main_ShortCut", false))
    {
      Intent localIntent1 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
      localIntent1.putExtra("android.intent.extra.shortcut.NAME", paramContext.getString(R.l.dGo));
      localIntent1.putExtra("duplicate", false);
      Intent localIntent2 = new Intent("android.intent.action.MAIN");
      localIntent2.addCategory("android.intent.category.LAUNCHER");
      localIntent2.setComponent(new ComponentName(paramContext.getPackageName(), ab.bPT() + ".ui.LauncherUI"));
      localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
      localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(paramContext, R.g.icon));
      localIntent1.putExtra("shortcut_icon_resource_id", R.g.icon);
      localIntent1.putExtra("shortcut_is_adaptive_icon", true);
      localIntent1.putExtra("is_main_shortcut", true);
      com.tencent.mm.plugin.base.model.b.n(paramContext, localIntent1);
      paramContext = localSharedPreferences.edit();
      paramContext.putBoolean("Main_ShortCut", true);
      paramContext.commit();
    }
    GMTrace.o(1611015389184L, 12003);
  }
  
  public static void lj(boolean paramBoolean)
  {
    GMTrace.i(1610344300544L, 11998);
    w.w("MicroMsg.MMAppMgr", "killProcess thread:%s proc:%d stack:%s, killService:%b", new Object[] { Thread.currentThread().getName(), Integer.valueOf(Process.myPid()), bg.bQW(), Boolean.valueOf(paramBoolean) });
    com.tencent.mm.plugin.report.b.d.p(2, 0, "");
    if (paramBoolean)
    {
      localObject = ab.getContext();
      if (localObject != null)
      {
        ((Context)localObject).stopService(new Intent((Context)localObject, CoreService.class));
        ((Context)localObject).stopService(new Intent((Context)localObject, NotifyReceiver.NotifyService.class));
        ((Context)localObject).stopService(new Intent((Context)localObject, CacheService.class));
        ((Context)localObject).stopService(new Intent().setClassName((Context)localObject, "com.tencent.mm.plugin.exdevice.service.ExDeviceService"));
      }
    }
    Object localObject = new x();
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new iv();
    ((iv)localObject).eMv.status = 0;
    ((iv)localObject).eMv.eMw = 2;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    bXG();
    if (paramBoolean)
    {
      at.eJ(bg.bQW().toString());
      com.tencent.mm.kernel.h.xz().releaseAll();
    }
    w.appenderClose();
    BaseEvent.onSingalCrash(0);
    Process.killProcess(Process.myPid());
    GMTrace.o(1610344300544L, 11998);
  }
  
  public static boolean pG()
  {
    GMTrace.i(1610746953728L, 12001);
    if (com.tencent.mm.protocal.d.tJF)
    {
      GMTrace.o(1610746953728L, 12001);
      return false;
    }
    if (!com.tencent.mm.bj.d.PX("whatsnew"))
    {
      w.i("MicroMsg.MMAppMgr", "plugin cannot load");
      GMTrace.o(1610746953728L, 12001);
      return false;
    }
    GMTrace.o(1610746953728L, 12001);
    return false;
  }
  
  public static void pu()
  {
    GMTrace.i(1610075865088L, 11996);
    at.getNotification().pu();
    GMTrace.o(1610075865088L, 11996);
  }
  
  public final void e(Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(1609538994176L, 11992);
    if (paramBoolean)
    {
      com.tencent.mm.ac.m.Ds();
      localObject1 = new mw();
      ((mw)localObject1).eRT.state = 1;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new com.tencent.mm.g.a.e();
      ((com.tencent.mm.g.a.e)localObject1).ezV.ezW = true;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new nr();
      ((nr)localObject1).eSH.ezY = true;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new co();
      ((co)localObject1).eDS.state = 1;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    }
    Object localObject1 = new fp();
    ((fp)localObject1).eHZ.eAo = paramBoolean;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    this.vLT = paramBoolean;
    paramIntent = paramIntent.getStringExtra("classname");
    Object localObject2;
    if (bg.nm(paramIntent))
    {
      paramIntent = "";
      if (!paramBoolean) {
        break label354;
      }
      localObject2 = z.fJI;
      if (((z)localObject2).fJT == -1L)
      {
        if (((z)localObject2).fJJ.Ar(3) == 0) {
          ((z)localObject2).fJJ.setLong(1, com.tencent.mm.platformtools.t.Pu());
        }
        ((z)localObject2).fJT = com.tencent.mm.platformtools.t.Pu();
        if (((z)localObject2).fJM != null) {
          break label341;
        }
        localObject1 = "null";
        label241:
        w.i("MicroMsg.StayTimeReport", "onAppResume chatUser:%s, class:%s", new Object[] { localObject1, paramIntent });
        if (((z)localObject2).fJM != null)
        {
          ((z)localObject2).fJQ = com.tencent.mm.platformtools.t.Pw();
          if ((paramIntent != null) && (paramIntent.contains("WebViewUI"))) {
            ((z)localObject2).fJR = com.tencent.mm.platformtools.t.Pw();
          }
        }
      }
    }
    for (;;)
    {
      this.vLW.z(800L, 800L);
      GMTrace.o(1609538994176L, 11992);
      return;
      paramIntent = paramIntent.substring(paramIntent.lastIndexOf(".") + 1);
      break;
      label341:
      localObject1 = ((z)localObject2).fJM.fJZ;
      break label241;
      label354:
      localObject1 = z.fJI;
      if (((z)localObject1).fJT != -1L)
      {
        long l = com.tencent.mm.platformtools.t.Pu();
        localObject2 = (String)((z)localObject1).fJJ.get(2, "");
        localObject2 = (String)localObject2 + ((z)localObject1).fJT + "|" + l + "#";
        ((z)localObject1).fJJ.set(2, localObject2);
        int i = ((z)localObject1).fJJ.Ar(3) + 1;
        ((z)localObject1).fJJ.setInt(3, i);
        w.i("MicroMsg.StayTimeReport", "onAppPause,appReportCnt:%d app(%d-%d)", new Object[] { Integer.valueOf(i), Long.valueOf(((z)localObject1).fJT), Long.valueOf(l) });
        ((z)localObject1).fJT = -1L;
        if ((com.tencent.mm.platformtools.t.aG(((z)localObject1).fJJ.getLong(1, 0L)) > 3600L * ((z)localObject1).fJV) || (i > ((z)localObject1).fJU))
        {
          g.ork.A(13110, (String)localObject2);
          w.i("MicroMsg.StayTimeReport", "report appStayTime:%s", new Object[] { localObject2 });
          ((z)localObject1).fJJ.set(2, "");
          ((z)localObject1).fJJ.setInt(3, 0);
        }
        if (((z)localObject1).fJM != null)
        {
          localObject2 = ((z)localObject1).fJM;
          ((z.a)localObject2).time += com.tencent.mm.platformtools.t.aI(((z)localObject1).fJQ) / 1000L;
          if ((paramIntent != null) && (paramIntent.contains("WebViewUI")))
          {
            paramIntent = ((z)localObject1).fJM;
            paramIntent.fKd = ((int)(paramIntent.fKd + com.tencent.mm.platformtools.t.aI(((z)localObject1).fJR) / 1000L));
          }
          w.i("MicroMsg.StayTimeReport", "onAppPause, chatting:totalTime:%d", new Object[] { Long.valueOf(((z)localObject1).fJM.time) });
        }
      }
    }
  }
  
  public final void f(Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(16013517127680L, 119310);
    paramIntent = paramIntent.getStringExtra("classname");
    if (bg.nm(paramIntent))
    {
      w.i("MicroMsg.MMAppMgr", "dealWithClickStream className is null, broadcast should set this intent flag");
      GMTrace.o(16013517127680L, 119310);
      return;
    }
    paramIntent = paramIntent.substring(paramIntent.lastIndexOf(".") + 1);
    com.tencent.mm.sdk.a.b.Rx(paramIntent);
    if (vLP == null)
    {
      vLP = new StringBuffer(800);
      vLQ = bg.Pu();
      vLP.append("start:");
      vLP.append(bg.Pu());
      vLP.append("|");
    }
    if (paramBoolean)
    {
      if ("desktop".equals(this.vLR))
      {
        vLP.append("desktop:");
        vLP.append(bg.aI(this.gVk) + 800L);
        vLP.append("|");
      }
      this.gVk = bg.Pw();
      this.vLR = paramIntent;
    }
    for (;;)
    {
      com.tencent.mm.g.a.f localf = new com.tencent.mm.g.a.f();
      localf.ezX.ezY = paramBoolean;
      localf.ezX.className = paramIntent;
      com.tencent.mm.sdk.b.a.vgX.m(localf);
      w.i("MicroMsg.MMAppMgr", "dkact classname %s, isAcitvity %b", new Object[] { paramIntent, Boolean.valueOf(paramBoolean) });
      GMTrace.o(16013517127680L, 119310);
      return;
      vLP.append(this.vLR + ":");
      vLP.append(bg.aI(this.gVk));
      vLP.append("|");
    }
  }
  
  @JgClassChecked(author=20, fComment="checked", lastDate="20141015", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public static class Receiver
    extends BroadcastReceiver
  {
    private MMAppMgr appMgr;
    
    public Receiver()
    {
      GMTrace.i(2071382196224L, 15433);
      GMTrace.o(2071382196224L, 15433);
    }
    
    public Receiver(MMAppMgr paramMMAppMgr)
    {
      GMTrace.i(2071516413952L, 15434);
      this.appMgr = paramMMAppMgr;
      GMTrace.o(2071516413952L, 15434);
    }
    
    private static boolean al(Intent paramIntent)
    {
      GMTrace.i(2071650631680L, 15435);
      if (!paramIntent.getBooleanExtra("process_is_mm", false))
      {
        GMTrace.o(2071650631680L, 15435);
        return true;
      }
      if (paramIntent.getIntExtra("process_id", 0) == Process.myPid())
      {
        GMTrace.o(2071650631680L, 15435);
        return true;
      }
      GMTrace.o(2071650631680L, 15435);
      return false;
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(2071784849408L, 15436);
      if (paramIntent == null)
      {
        GMTrace.o(2071784849408L, 15436);
        return;
      }
      if ((at.AJ()) || (at.AL()))
      {
        GMTrace.o(2071784849408L, 15436);
        return;
      }
      String str = paramIntent.getAction();
      if ("com.tencent.mm.ui.ACTION_ACTIVE".equals(str))
      {
        if (!al(paramIntent))
        {
          w.w("MicroMsg.MMAppMgr", "onreceive active process changed old: %d, new: %d", new Object[] { Integer.valueOf(paramIntent.getIntExtra("process_id", 0)), Integer.valueOf(Process.myPid()) });
          GMTrace.o(2071784849408L, 15436);
          return;
        }
        this.appMgr.f(paramIntent, true);
        this.appMgr.e(paramIntent, true);
        GMTrace.o(2071784849408L, 15436);
        return;
      }
      if ("com.tencent.mm.ui.ACTION_DEACTIVE".equals(str))
      {
        if (!al(paramIntent))
        {
          w.w("MicroMsg.MMAppMgr", "onreceive deactive process changed old: %d, new: %d", new Object[] { Integer.valueOf(paramIntent.getIntExtra("process_id", 0)), Integer.valueOf(Process.myPid()) });
          GMTrace.o(2071784849408L, 15436);
          return;
        }
        com.tencent.mm.booter.o.rw();
        this.appMgr.f(paramIntent, false);
        this.appMgr.e(paramIntent, false);
        if ((MMAppMgr.vLP != null) && (MMAppMgr.vLP.length() > 800)) {
          new ae(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2076750905344L, 15473);
              MMAppMgr.bXG();
              GMTrace.o(2076750905344L, 15473);
            }
          });
        }
        GMTrace.o(2071784849408L, 15436);
        return;
      }
      if ("com.tencent.mm.ui.ACTION_ABTEST".equals(str))
      {
        paramContext = paramIntent.getStringExtra("content");
        if (bg.nm(paramContext)) {
          w.i("MicroMsg.MMAppMgr", "dealWithClickTestCaseStream case id is null, broadcast should set this intent flag");
        }
        for (;;)
        {
          if ((MMAppMgr.vLP != null) && (MMAppMgr.vLP.length() > 800)) {
            new ae(Looper.getMainLooper()).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(1703222968320L, 12690);
                MMAppMgr.bXG();
                GMTrace.o(1703222968320L, 12690);
              }
            });
          }
          GMTrace.o(2071784849408L, 15436);
          return;
          if (MMAppMgr.vLP == null) {
            MMAppMgr.vLP = new StringBuffer(800);
          }
          MMAppMgr.vLP.append(paramContext);
          w.i("MicroMsg.MMAppMgr", "cpan content: %s", new Object[] { paramContext });
        }
      }
      if (paramIntent.getAction().equals("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE"))
      {
        int i;
        if (!paramIntent.getBooleanExtra("intent_extra_is_silence_stat", false))
        {
          i = paramIntent.getIntExtra("intent_extra_opcode", 0);
          w.d("MicroMsg.MMAppMgr", "incremental_update = " + i);
          if (at.AU()) {
            g.ork.i(10328, new Object[] { Integer.valueOf(i) });
          }
        }
        long l1;
        long l2;
        label706:
        for (;;)
        {
          l1 = paramIntent.getLongExtra("intent_extra_flow_stat_upstream", 0L);
          l2 = paramIntent.getLongExtra("intent_extra_flow_stat_downstream", 0L);
          boolean bool = paramIntent.getBooleanExtra("intent_extra_flow_stat_is_wifi", false);
          if ((!at.AU()) || ((l1 == 0L) && (l2 == 0L))) {
            break label718;
          }
          w.d("MicroMsg.MMAppMgr", "silence_update_flow_stat upstream %s downstream %s isWifi %s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool) });
          if (!bool) {
            break;
          }
          com.tencent.mm.modelstat.m.t((int)l2, (int)l1, 0);
          GMTrace.o(2071784849408L, 15436);
          return;
          i = paramIntent.getIntExtra("intent_extra_opcode", 0);
          w.d("MicroMsg.MMAppMgr", "silence_update_stat = " + i);
          if (at.AU())
          {
            if (i == 2)
            {
              int j = paramIntent.getIntExtra("intent_extra_install_dialog_times", 0);
              g.ork.i(11147, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            }
            for (;;)
            {
              if ((i != 4) || (p.bJO() != 4)) {
                break label706;
              }
              paramContext = com.tencent.mm.pluginsdk.model.app.a.bJo();
              if (paramContext == null) {
                break;
              }
              paramContext.bJq();
              break;
              g.ork.i(11147, new Object[] { Integer.valueOf(i) });
            }
          }
        }
        com.tencent.mm.modelstat.m.u((int)l2, (int)l1, 0);
        label718:
        GMTrace.o(2071784849408L, 15436);
        return;
      }
      if (paramIntent.getAction().equals("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP"))
      {
        MMAppMgr.a(paramContext, true);
        GMTrace.o(2071784849408L, 15436);
        return;
      }
      if (paramIntent.getAction().equals("MINIQB_OPEN_RET"))
      {
        com.tencent.mm.pluginsdk.ui.tools.a.ae(paramIntent);
        GMTrace.o(2071784849408L, 15436);
        return;
      }
      w.e("MicroMsg.MMAppMgr", "unknown broadcast action");
      GMTrace.o(2071784849408L, 15436);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\MMAppMgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */