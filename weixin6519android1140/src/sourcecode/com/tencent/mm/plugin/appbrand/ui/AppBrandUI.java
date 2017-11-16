package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.a.a;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.a;
import com.tencent.mm.plugin.appbrand.page.k;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.a;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.c;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.u;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

@com.tencent.mm.ui.base.a(1)
public class AppBrandUI
  extends MMActivity
  implements a.a
{
  private static HashSet<MMActivity> iCH;
  private AppBrandRemoteTaskController.c hzs;
  private com.tencent.mm.plugin.appbrand.f iCE;
  private f iCF;
  private com.tencent.mm.plugin.appbrand.b.d iCG;
  private i iCI;
  
  static
  {
    GMTrace.i(17662784569344L, 131598);
    iCH = new HashSet();
    GMTrace.o(17662784569344L, 131598);
  }
  
  public AppBrandUI()
  {
    GMTrace.i(10482270339072L, 78099);
    this.hzs = new AppBrandRemoteTaskController.c()
    {
      public final void a(AppBrandRemoteTaskController paramAnonymousAppBrandRemoteTaskController)
      {
        GMTrace.i(18836115947520L, 140340);
        AppBrandUI.a(AppBrandUI.this, paramAnonymousAppBrandRemoteTaskController);
        GMTrace.o(18836115947520L, 140340);
      }
      
      public final void finish()
      {
        GMTrace.i(18835981729792L, 140339);
        AppBrandUI.this.vKB.vKW.finish();
        GMTrace.o(18835981729792L, 140339);
      }
    };
    this.iCI = null;
    GMTrace.o(10482270339072L, 78099);
  }
  
  private void v(Intent paramIntent)
  {
    GMTrace.i(15505234591744L, 115523);
    Object localObject1 = paramIntent.getExtras();
    if (localObject1 == null)
    {
      finish();
      GMTrace.o(15505234591744L, 115523);
      return;
    }
    for (;;)
    {
      try
      {
        ((Bundle)localObject1).setClassLoader(AppBrandInitConfig.class.getClassLoader());
        paramIntent = (AppBrandInitConfig)((Bundle)localObject1).getParcelable("key_appbrand_init_config");
      }
      catch (Exception localException1)
      {
        try
        {
          localObject1 = (AppBrandStatObject)((Bundle)localObject1).getParcelable("key_appbrand_stat_object");
          w.i("MicroMsg.AppBrandUI", "load() config %s , stat %s", new Object[] { paramIntent, localObject1 });
          this.iCE.a(null, paramIntent, (AppBrandStatObject)localObject1);
          a((AppBrandStatObject)localObject1);
          GMTrace.o(15505234591744L, 115523);
          return;
        }
        catch (Exception localException2)
        {
          Object localObject2;
          for (;;) {}
        }
        localException1 = localException1;
        paramIntent = null;
      }
      tmp113_110[0] = localException1;
      w.e("MicroMsg.AppBrandUI", "getParcelable: %s", tmp113_110);
      localObject2 = null;
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(10484015169536L, 78112);
    GMTrace.o(10484015169536L, 78112);
    return 1;
  }
  
  protected final void VC()
  {
    GMTrace.i(10483880951808L, 78111);
    super.VC();
    getWindow().requestFeature(10);
    getWindow().getDecorView().setFitsSystemWindows(true);
    aq(10);
    aq(1);
    com.tencent.mm.plugin.appbrand.widget.input.m.b(this);
    GMTrace.o(10483880951808L, 78111);
  }
  
  protected void a(AppBrandStatObject paramAppBrandStatObject)
  {
    int j = 0;
    GMTrace.i(19702759817216L, 146797);
    if (paramAppBrandStatObject == null) {}
    for (int i = 0;; i = paramAppBrandStatObject.scene)
    {
      if (i == 1023) {
        j = 1;
      }
      if (j == 0) {
        break;
      }
      com.tencent.mm.plugin.appbrand.o.d.bU(this.vKB.vKW);
      GMTrace.o(19702759817216L, 146797);
      return;
    }
    com.tencent.mm.plugin.appbrand.o.d.bW(this.vKB.vKW);
    GMTrace.o(19702759817216L, 146797);
  }
  
  protected boolean aaB()
  {
    GMTrace.i(18836518600704L, 140343);
    final Runnable local4 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18965233401856L, 141302);
        try
        {
          KVCommCrossProcessReceiver.bbU();
          GMTrace.o(18965233401856L, 141302);
          return;
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.AppBrandUI", localException, "sendKV", new Object[0]);
          GMTrace.o(18965233401856L, 141302);
        }
      }
    };
    if (!iCH.isEmpty())
    {
      w.i("MicroMsg.AppBrandUI", "Activity running");
      com.tencent.mm.bv.a.post(local4);
      GMTrace.o(18836518600704L, 140343);
      return false;
    }
    if (DebuggerShell.UK())
    {
      GMTrace.o(18836518600704L, 140343);
      return false;
    }
    com.tencent.mm.bv.a.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20694360391680L, 154185);
        local4.run();
        w.i("MicroMsg.AppBrandUI", "tryRestartProcess, %s", new Object[] { u.Av().toString() });
        w.bPN();
        if (!((Boolean)new bb()new ae {}.b(new ae(Looper.getMainLooper()))).booleanValue())
        {
          GMTrace.o(20694360391680L, 154185);
          return;
        }
        AppBrandUI.ProcessRestartTask localProcessRestartTask = new AppBrandUI.ProcessRestartTask();
        localProcessRestartTask.fXf = ab.vM();
        localProcessRestartTask.izU = AppBrandUI.this.getClass().getName();
        AppBrandMainProcessService.b(localProcessRestartTask);
        System.exit(0);
        GMTrace.o(20694360391680L, 154185);
      }
    });
    GMTrace.o(18836518600704L, 140343);
    return true;
  }
  
  protected void aaL()
  {
    GMTrace.i(19702894034944L, 146798);
    com.tencent.mm.plugin.appbrand.o.d.bV(this.vKB.vKW);
    GMTrace.o(19702894034944L, 146798);
  }
  
  public final boolean aaS()
  {
    GMTrace.i(10484149387264L, 78113);
    GMTrace.o(10484149387264L, 78113);
    return true;
  }
  
  public void finish()
  {
    GMTrace.i(10485357346816L, 78122);
    if ((isFinishing()) || (this.vKD))
    {
      GMTrace.o(10485357346816L, 78122);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      finishAndRemoveTask();
    }
    for (;;)
    {
      aaL();
      com.tencent.mm.plugin.appbrand.report.a.aaa();
      GMTrace.o(10485357346816L, 78122);
      return;
      super.finish();
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10484283604992L, 78114);
    GMTrace.o(10484283604992L, 78114);
    return -1;
  }
  
  public boolean moveTaskToBack(boolean paramBoolean)
  {
    GMTrace.i(10483478298624L, 78108);
    try
    {
      paramBoolean = super.moveTaskToBack(paramBoolean);
      aaL();
      GMTrace.o(10483478298624L, 78108);
      return paramBoolean;
    }
    catch (NullPointerException localNullPointerException)
    {
      iCH.remove(this);
      if (!aaB()) {
        finish();
      }
      GMTrace.o(10483478298624L, 78108);
    }
    return true;
  }
  
  public void onBackPressed()
  {
    int k = 0;
    int j = 0;
    GMTrace.i(10483746734080L, 78110);
    Object localObject1 = this.iCE.RO();
    if (localObject1 != null) {
      if (((com.tencent.mm.plugin.appbrand.e)localObject1).hyL == null)
      {
        Object localObject2;
        com.tencent.mm.plugin.appbrand.widget.c.a locala;
        if (((com.tencent.mm.plugin.appbrand.e)localObject1).hyN != null)
        {
          localObject2 = ((com.tencent.mm.plugin.appbrand.e)localObject1).hyN;
          locala = (com.tencent.mm.plugin.appbrand.widget.c.a)((com.tencent.mm.plugin.appbrand.widget.c.b)localObject2).iKI.peekLast();
          if (locala == null)
          {
            ((com.tencent.mm.plugin.appbrand.widget.c.b)localObject2).setVisibility(8);
            i = 0;
            if (i != 0) {
              break label222;
            }
          }
        }
        else
        {
          if (((com.tencent.mm.plugin.appbrand.e)localObject1).hyJ == null) {
            break label222;
          }
          localObject1 = ((com.tencent.mm.plugin.appbrand.e)localObject1).hyJ;
          localObject2 = ((com.tencent.mm.plugin.appbrand.page.m)localObject1).Zs().Zh();
          if (!((AppBrandPageView)localObject2).ivt.YZ()) {
            break label155;
          }
          j = 1;
        }
        label155:
        do
        {
          do
          {
            if (j == 0) {
              ((com.tencent.mm.plugin.appbrand.page.m)localObject1).Zr();
            }
            GMTrace.o(10483746734080L, 78110);
            return;
            locala.onCancel();
            ((com.tencent.mm.plugin.appbrand.widget.c.b)localObject2).b(locala);
            i = 1;
            break;
          } while (((AppBrandPageView)localObject2).ive.size() == 0);
          localObject2 = ((AppBrandPageView)localObject2).ive.iterator();
          i = k;
          j = i;
        } while (!((Iterator)localObject2).hasNext());
        if (!((AppBrandPageView.a)((Iterator)localObject2).next()).Yb()) {
          break label232;
        }
        int i = 1;
      }
    }
    label222:
    label232:
    for (;;)
    {
      break;
      ((com.tencent.mm.plugin.appbrand.e)localObject1).finish();
      GMTrace.o(10483746734080L, 78110);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10482404556800L, 78100);
    super.onCreate(paramBundle);
    w.i("MicroMsg.AppBrandUI", "onCreate");
    paramBundle = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "pref_appbrand_process", 4);
    Object localObject = ab.vM() + ":start_time";
    SharedPreferences.Editor localEditor = paramBundle.edit();
    if (paramBundle.contains((String)localObject))
    {
      localEditor.remove((String)localObject);
      com.tencent.mm.plugin.report.d.oqe.a(365L, 2L, 1L, false);
    }
    com.tencent.mm.plugin.report.d.oqe.a(365L, 4L, 1L, false);
    localEditor.putLong((String)localObject, System.currentTimeMillis());
    localEditor.commit();
    w.v("MicroMsg.AppBrandReporter", "onProcessStart");
    KVCommCrossProcessReceiver.bbQ();
    paramBundle = new FrameLayout(this.vKB.vKW);
    paramBundle.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    setContentView(paramBundle);
    com.tencent.mm.plugin.appbrand.widget.input.m.a(this, paramBundle);
    this.iCE = new com.tencent.mm.plugin.appbrand.f(this, this.hzs, paramBundle);
    this.iCF = new f(this, this.iCE);
    paramBundle = this.iCF;
    localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_OFF");
    try
    {
      ab.getContext().registerReceiver(paramBundle.hLi, (IntentFilter)localObject);
      this.iCG = new com.tencent.mm.plugin.appbrand.b.d(this)
      {
        protected final void Tg()
        {
          GMTrace.i(18836384382976L, 140342);
          com.tencent.mm.plugin.appbrand.e locale = AppBrandUI.a(AppBrandUI.this).RO();
          if (locale == null)
          {
            GMTrace.o(18836384382976L, 140342);
            return;
          }
          com.tencent.mm.plugin.appbrand.c.a(locale.hyD, c.c.hyw);
          GMTrace.o(18836384382976L, 140342);
        }
      };
      paramBundle = this.iCG;
      localObject = new IntentFilter();
      ((IntentFilter)localObject).addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
    }
    catch (Exception paramBundle)
    {
      try
      {
        ab.getContext().registerReceiver(paramBundle.sU, (IntentFilter)localObject);
        iCH.add(this);
        v(getIntent());
        GMTrace.o(10482404556800L, 78100);
        return;
        paramBundle = paramBundle;
        w.e("MicroMsg.BaseAppBrandUIScreenOffReceiver", "register screen off receiver e = " + paramBundle);
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          w.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "register screen off receiver e = " + paramBundle);
        }
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(10483612516352L, 78109);
    super.onDestroy();
    Object localObject1 = this.iCE;
    Object localObject2 = new LinkedList();
    ((LinkedList)localObject2).addAll(((com.tencent.mm.plugin.appbrand.f)localObject1).hzq);
    ((LinkedList)localObject2).addAll(((com.tencent.mm.plugin.appbrand.f)localObject1).hzr.values());
    localObject2 = ((LinkedList)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((com.tencent.mm.plugin.appbrand.f)localObject1).d((com.tencent.mm.plugin.appbrand.e)((Iterator)localObject2).next());
    }
    w.i("MicroMsg.AppBrandRuntimeContainer", "cleanup");
    iCH.remove(this);
    if (this.iCG != null) {
      localObject1 = this.iCG;
    }
    try
    {
      ab.getContext().unregisterReceiver(((com.tencent.mm.plugin.appbrand.b.d)localObject1).sU);
      if (this.iCF != null) {
        localObject1 = this.iCF;
      }
    }
    catch (Exception localException1)
    {
      try
      {
        ab.getContext().unregisterReceiver(((com.tencent.mm.plugin.appbrand.b.e)localObject1).hLi);
        aaB();
        GMTrace.o(10483612516352L, 78109);
        return;
        localException1 = localException1;
        w.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "unregister screen off receiver e = " + localException1);
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.e("MicroMsg.BaseAppBrandUIScreenOffReceiver", "unregister screen off receiver e = " + localException2);
        }
      }
    }
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(10482538774528L, 78101);
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("key_appbrand_bring_ui_to_front", false)))
    {
      if ((this.iCE == null) || (this.iCE.hzq.size() == 0)) {
        finish();
      }
      GMTrace.o(10482538774528L, 78101);
      return;
    }
    w.i("MicroMsg.AppBrandUI", "onNewIntent");
    v(paramIntent);
    GMTrace.o(10482538774528L, 78101);
  }
  
  public void onPause()
  {
    GMTrace.i(10482941427712L, 78104);
    super.onPause();
    w.i("MicroMsg.AppBrandUI", "onPause");
    com.tencent.mm.plugin.appbrand.e locale = this.iCE.RO();
    if (locale != null) {
      locale.onPause();
    }
    try
    {
      com.tencent.mm.modelstat.d.a(4, "AppBrandUI_" + this.iCE.RO().hyD, hashCode());
      GMTrace.o(10482941427712L, 78104);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.AppBrandUI", localThrowable, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
      GMTrace.o(10482941427712L, 78104);
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(10484686258176L, 78117);
    com.tencent.mm.plugin.appbrand.e locale = this.iCE.RO();
    if (locale != null) {
      com.tencent.mm.plugin.appbrand.a.a(locale.hyD, paramInt, paramArrayOfString, paramArrayOfInt);
    }
    GMTrace.o(10484686258176L, 78117);
  }
  
  public void onResume()
  {
    GMTrace.i(10482807209984L, 78103);
    super.onResume();
    w.i("MicroMsg.AppBrandUI", "onResume");
    com.tencent.mm.plugin.appbrand.e locale = this.iCE.RO();
    if (locale != null) {
      locale.onResume();
    }
    try
    {
      com.tencent.mm.modelstat.d.a(3, "AppBrandUI_" + this.iCE.RO().hyD, hashCode());
      GMTrace.o(10482807209984L, 78103);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.AppBrandUI", localThrowable, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
      GMTrace.o(10482807209984L, 78103);
    }
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    int j = 1;
    GMTrace.i(10482672992256L, 78102);
    int i;
    if ((paramIntent != null) && ((paramIntent.getFlags() & 0x10000000) > 0)) {
      i = 1;
    }
    for (;;)
    {
      if ((paramIntent != null) && (com.tencent.mm.plugin.appbrand.o.d.b(paramIntent.getComponent()).equals(com.tencent.mm.plugin.appbrand.o.d.b(getComponentName()))))
      {
        boolean bool = AppBrandProcessProxyUI.u(paramIntent);
        if (((i == 0) || (j != 0) || (bool)) && (this.iCE.RO() != null))
        {
          String str = this.iCE.RO().hyD;
          if (c.c.hyu == com.tencent.mm.plugin.appbrand.c.nW(str)) {
            com.tencent.mm.plugin.appbrand.c.a(str, c.c.hyx);
          }
        }
      }
      try
      {
        this.iCE.RO().hyJ.iuy.iuR = paramIntent;
        super.startActivityForResult(paramIntent, paramInt, paramBundle);
        GMTrace.o(10482672992256L, 78102);
        return;
        i = 0;
        continue;
        j = 0;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  private static class ProcessRestartTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<ProcessRestartTask> CREATOR;
    public String fXf;
    public String izU;
    
    static
    {
      GMTrace.i(17662247698432L, 131594);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17662247698432L, 131594);
    }
    
    public ProcessRestartTask()
    {
      GMTrace.i(17661710827520L, 131590);
      GMTrace.o(17661710827520L, 131590);
    }
    
    public final void RY()
    {
      GMTrace.i(17661845045248L, 131591);
      com.tencent.mm.modelappbrand.b.hp(this.fXf);
      com.tencent.mm.plugin.appbrand.task.d.sk(this.izU);
      GMTrace.o(17661845045248L, 131591);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(17662113480704L, 131593);
      this.fXf = paramParcel.readString();
      this.izU = paramParcel.readString();
      GMTrace.o(17662113480704L, 131593);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17661979262976L, 131592);
      paramParcel.writeString(this.fXf);
      paramParcel.writeString(this.izU);
      GMTrace.o(17661979262976L, 131592);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */