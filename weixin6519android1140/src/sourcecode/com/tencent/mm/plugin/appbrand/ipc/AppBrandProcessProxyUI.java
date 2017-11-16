package com.tencent.mm.plugin.appbrand.ipc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;

@a(7)
public class AppBrandProcessProxyUI
  extends MMActivity
  implements b
{
  private int hWK;
  private AppBrandProxyUIProcessTask hWL;
  private AppBrandProxyUIProcessTask.ProcessRequest hWM;
  private boolean hWN;
  private volatile boolean hWO;
  private i hWP;
  private a hWQ;
  
  public AppBrandProcessProxyUI()
  {
    GMTrace.i(10290204770304L, 76668);
    this.hWK = 0;
    this.hWN = false;
    this.hWO = false;
    GMTrace.o(10290204770304L, 76668);
  }
  
  static <_Req extends AppBrandProxyUIProcessTask.ProcessRequest, _Result extends AppBrandProxyUIProcessTask.ProcessResult> void a(Context paramContext, Class<? extends AppBrandProcessProxyUI> paramClass, _Req param_Req, final AppBrandProxyUIProcessTask.b<_Result> paramb)
  {
    GMTrace.i(10290338988032L, 76669);
    if (paramContext == null) {
      paramContext = ab.getContext();
    }
    for (;;)
    {
      String str = param_Req.VI().getName();
      Object localObject;
      if (paramClass == null)
      {
        localObject = AppBrandProcessProxyUI.class;
        localObject = new Intent(paramContext, (Class)localObject).putExtra("key_model_class_name", str);
        if (paramb != null) {
          break label141;
        }
        paramb = null;
        label58:
        paramb = ((Intent)localObject).putExtra("key_result_receiver", paramb).putExtra("appbrand_report_key_target_activity", param_Req.VH()).putExtra("key_running_mode", 1);
        paramb.putExtra("key_request_parcel", param_Req);
        if ((paramContext instanceof Activity)) {
          break label159;
        }
        paramb.addFlags(268435456);
      }
      for (;;)
      {
        if ((AppBrandProcessProxyUI.class == paramClass) || (!(paramContext instanceof Activity))) {
          break label179;
        }
        ((Activity)paramContext).startActivityForResult(paramb, 0);
        GMTrace.o(10290338988032L, 76669);
        return;
        localObject = paramClass;
        break;
        label141:
        paramb = new ResultReceiver(ae.fetchFreeHandler(Looper.getMainLooper()))
        {
          protected final void onReceiveResult(int paramAnonymousInt, Bundle paramAnonymousBundle)
          {
            GMTrace.i(10279333134336L, 76587);
            if (paramAnonymousBundle == null)
            {
              paramb.c(null);
              GMTrace.o(10279333134336L, 76587);
              return;
            }
            paramAnonymousBundle.setClassLoader(AppBrandProcessProxyUI.class.getClassLoader());
            paramAnonymousBundle = (AppBrandProxyUIProcessTask.ProcessResult)paramAnonymousBundle.getParcelable("key_result_parcel");
            paramb.c(paramAnonymousBundle);
            GMTrace.o(10279333134336L, 76587);
          }
        };
        break label58;
        label159:
        paramb.putExtra("key_need_light_status", g.c(((Activity)paramContext).getWindow()));
      }
      label179:
      paramContext.startActivity(paramb);
      GMTrace.o(10290338988032L, 76669);
      return;
    }
  }
  
  static void a(Context paramContext, Class<? extends AppBrandProcessProxyUI> paramClass, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, DialogInterface.OnClickListener paramOnClickListener3)
  {
    GMTrace.i(10290473205760L, 76670);
    paramOnClickListener1 = paramContext;
    if (paramContext == null) {
      paramOnClickListener1 = ab.getContext();
    }
    paramContext = new Intent(paramOnClickListener1, paramClass).putExtra("key_running_mode", 2).putExtra("key_result_receiver", new ResultReceiver(ae.fetchFreeHandler(Looper.getMainLooper()))
    {
      protected final void onReceiveResult(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(10279601569792L, 76589);
        if ((-1 == paramAnonymousInt) && (this.hWS != null)) {
          this.hWS.onClick(null, paramAnonymousInt);
        }
        if ((-2 == paramAnonymousInt) && (this.hWT != null)) {
          this.hWT.onClick(null, paramAnonymousInt);
        }
        if ((-3 == paramAnonymousInt) && (this.hWU != null)) {
          this.hWU.onClick(null, paramAnonymousInt);
        }
        GMTrace.o(10279601569792L, 76589);
      }
    }).putExtra("key_alert_message", paramString1).putExtra("key_alert_title", paramString2).putExtra("key_alert_confirm", paramString3).putExtra("key_alert_deny", paramString4);
    if (!(paramOnClickListener1 instanceof Activity)) {
      paramContext.addFlags(268435456);
    }
    paramOnClickListener1.startActivity(paramContext);
    GMTrace.o(10290473205760L, 76670);
  }
  
  private static String aY(String paramString1, String paramString2)
  {
    GMTrace.i(10291010076672L, 76674);
    if (bg.nm(paramString1))
    {
      GMTrace.o(10291010076672L, 76674);
      return paramString2;
    }
    GMTrace.o(10291010076672L, 76674);
    return paramString1;
  }
  
  public static void l(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(21076209827840L, 157030);
    if ((!(paramContext instanceof AppBrandUI)) || ((paramContext instanceof AppBrandPluginUI)))
    {
      paramContext.startActivity(paramIntent);
      GMTrace.o(21076209827840L, 157030);
      return;
    }
    paramContext.startActivity(new Intent(paramContext, AppBrandProcessProxyUI.class).putExtra("key_running_mode", 10000).putExtra("key_proxy_launch_target_intent", paramIntent).putExtra("key_proxy_launch_appbrand_ui_class", paramContext.getClass()).addFlags(268435456));
    GMTrace.o(21076209827840L, 157030);
  }
  
  public static boolean u(Intent paramIntent)
  {
    GMTrace.i(20686844198912L, 154129);
    if (paramIntent != null) {}
    try
    {
      if ((paramIntent.getComponent() != null) && (paramIntent.getComponent().getShortClassName().equals(".plugin.appbrand.ipc.AppBrandProcessProxyUI")) && (paramIntent.getIntExtra("key_running_mode", -1) == 10000))
      {
        GMTrace.o(20686844198912L, 154129);
        return true;
      }
      GMTrace.o(20686844198912L, 154129);
      return false;
    }
    catch (Exception paramIntent)
    {
      GMTrace.o(20686844198912L, 154129);
    }
    return false;
  }
  
  protected final void VC()
  {
    GMTrace.i(10290741641216L, 76672);
    super.VC();
    aq(1);
    GMTrace.o(10290741641216L, 76672);
  }
  
  public final MMActivity VD()
  {
    GMTrace.i(10291681165312L, 76679);
    GMTrace.o(10291681165312L, 76679);
    return this;
  }
  
  public final boolean VE()
  {
    GMTrace.i(10291949600768L, 76681);
    if ((this.vKD) || (isFinishing()) || (this.hWO))
    {
      GMTrace.o(10291949600768L, 76681);
      return true;
    }
    GMTrace.o(10291949600768L, 76681);
    return false;
  }
  
  public final void a(final AppBrandProxyUIProcessTask.ProcessResult paramProcessResult)
  {
    GMTrace.i(10291815383040L, 76680);
    this.hWO = true;
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10281749053440L, 76605);
        AppBrandProcessProxyUI.this.b(paramProcessResult);
        AppBrandProcessProxyUI.this.finish();
        GMTrace.o(10281749053440L, 76605);
      }
    });
    GMTrace.o(10291815383040L, 76680);
  }
  
  public final void b(AppBrandProxyUIProcessTask.ProcessResult paramProcessResult)
  {
    GMTrace.i(10292083818496L, 76682);
    ResultReceiver localResultReceiver = (ResultReceiver)getIntent().getParcelableExtra("key_result_receiver");
    if ((localResultReceiver != null) && (paramProcessResult != null))
    {
      Bundle localBundle = new Bundle(2);
      localBundle.putParcelable("key_result_parcel", paramProcessResult);
      localResultReceiver.send(0, localBundle);
    }
    GMTrace.o(10292083818496L, 76682);
  }
  
  public void finish()
  {
    GMTrace.i(10291546947584L, 76678);
    super.finish();
    overridePendingTransition(0, 0);
    if (this.hWL != null) {
      this.hWL.VF();
    }
    GMTrace.o(10291546947584L, 76678);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(10290607423488L, 76671);
    GMTrace.o(10290607423488L, 76671);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10291412729856L, 76677);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.d("MicroMsg.AppBrandProcessProxyUI", "onActivityResult, requestCode = %d, resultCode = %d, request = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this.hWM.getClass().getName() });
    this.hWN = false;
    GMTrace.o(10291412729856L, 76677);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(10290875858944L, 76673);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    g.a(getWindow());
    g.a(getWindow(), getIntent().getBooleanExtra("key_need_light_status", false));
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    if (getIntent() == null)
    {
      finish();
      GMTrace.o(10290875858944L, 76673);
      return;
    }
    switch (getIntent().getIntExtra("key_running_mode", 0))
    {
    default: 
      finish();
      GMTrace.o(10290875858944L, 76673);
      return;
    case 1: 
      getIntent().setExtrasClassLoader(AppBrandProcessProxyUI.class.getClassLoader());
      paramBundle = getIntent().getStringExtra("key_model_class_name");
      w.i("MicroMsg.AppBrandProcessProxyUI", "onCreate, modelClass = %s", new Object[] { paramBundle });
      if (bg.nm(paramBundle)) {}
      while (i == 0)
      {
        finish();
        GMTrace.o(10290875858944L, 76673);
        return;
        this.hWL = AppBrandProxyUIProcessTask.a.qb(paramBundle);
        if (this.hWL == null)
        {
          w.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown model class = %s", new Object[] { paramBundle });
        }
        else
        {
          if (getIntent().getBooleanExtra("key_request_need_params", true))
          {
            this.hWM = ((AppBrandProxyUIProcessTask.ProcessRequest)getIntent().getParcelableExtra("key_request_parcel"));
            if (this.hWM == null) {
              w.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown request class = %s", new Object[] { paramBundle });
            }
          }
          else
          {
            this.hWM = null;
            continue;
          }
          this.hWL.hWZ = this;
          this.hWL.a(this.hWM);
          i = 1;
        }
      }
    case 2: 
      paramBundle = aY(getIntent().getStringExtra("key_alert_title"), "");
      String str1 = aY(getIntent().getStringExtra("key_alert_message"), getString(o.i.cUG));
      String str2 = aY(getIntent().getStringExtra("key_alert_confirm"), "");
      final String str3 = aY(getIntent().getStringExtra("key_alert_deny"), "");
      this.hWQ = new a();
      this.hWP = h.a(this, str1, paramBundle, str2, str3, false, this.hWQ, this.hWQ);
      this.hWP.setOnDismissListener(this.hWQ);
      this.hWP.setOnKeyListener(new DialogInterface.OnKeyListener()
      {
        public final boolean onKey(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(10285372932096L, 76632);
          if ((paramAnonymousInt == 4) && (paramAnonymousKeyEvent.getAction() == 1))
          {
            if (!bg.nm(str3))
            {
              AppBrandProcessProxyUI.b(AppBrandProcessProxyUI.this).onClick(AppBrandProcessProxyUI.a(AppBrandProcessProxyUI.this), -3);
              paramAnonymousDialogInterface.dismiss();
            }
            AppBrandProcessProxyUI.this.a(null);
          }
          GMTrace.o(10285372932096L, 76632);
          return false;
        }
      });
      GMTrace.o(10290875858944L, 76673);
      return;
    }
    paramBundle = (Intent)getIntent().getParcelableExtra("key_proxy_launch_target_intent");
    if (paramBundle != null)
    {
      if (paramBundle.getComponent() != null) {}
      try
      {
        Class.forName(paramBundle.getComponent().getClassName());
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          try
          {
            startActivity(paramBundle);
            GMTrace.o(10290875858944L, 76673);
            return;
          }
          catch (Exception localException2)
          {
            try
            {
              w.e("MicroMsg.AppBrandProcessProxyUI", "start targetActivity, %s, e = %s", new Object[] { paramBundle, localException2 });
              GMTrace.o(10290875858944L, 76673);
              return;
            }
            catch (Exception paramBundle)
            {
              GMTrace.o(10290875858944L, 76673);
              return;
            }
          }
          localException1 = localException1;
          w.e("MicroMsg.AppBrandProcessProxyUI", "proxyLaunch, Class.forName %s, e = %s", new Object[] { paramBundle.getComponent().getClassName() });
        }
      }
    }
    finish();
    GMTrace.o(10290875858944L, 76673);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10291278512128L, 76676);
    super.onDestroy();
    if ((this.hWP != null) && (this.hWP.isShowing()))
    {
      this.hWP.dismiss();
      this.hWP = null;
      this.hWQ = null;
    }
    GMTrace.o(10291278512128L, 76676);
  }
  
  protected void onResume()
  {
    GMTrace.i(10291144294400L, 76675);
    super.onResume();
    int i = getIntent().getIntExtra("key_running_mode", 0);
    if (i == 10000)
    {
      i = this.hWK + 1;
      this.hWK = i;
      if (i > 1) {
        try
        {
          Class localClass = (Class)getIntent().getSerializableExtra("key_proxy_launch_appbrand_ui_class");
          if (localClass == null)
          {
            finish();
            GMTrace.o(10291144294400L, 76675);
            return;
          }
          startActivity(new Intent(this, localClass).putExtra("key_appbrand_bring_ui_to_front", true).addFlags(268435456));
          finish();
          GMTrace.o(10291144294400L, 76675);
          return;
        }
        catch (Exception localException)
        {
          finish();
        }
      }
      GMTrace.o(10291144294400L, 76675);
      return;
    }
    if (i == 2)
    {
      w.d("MicroMsg.AppBrandProcessProxyUI", "onResume, RUNNING_MODE_SHOW_ALERT");
      GMTrace.o(10291144294400L, 76675);
      return;
    }
    boolean bool = VE();
    w.d("MicroMsg.AppBrandProcessProxyUI", "onResume, mFinishOnNextResume = %b, finishing = %b, request = %s", new Object[] { Boolean.valueOf(this.hWN), Boolean.valueOf(bool), this.hWM.getClass().getName() });
    if ((this.hWN) && (this.hWM.VG()) && (!bool)) {
      a(null);
    }
    this.hWN = true;
    GMTrace.o(10291144294400L, 76675);
  }
  
  private final class a
    implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener
  {
    private boolean hWY;
    
    public a()
    {
      GMTrace.i(10286446673920L, 76640);
      this.hWY = false;
      GMTrace.o(10286446673920L, 76640);
    }
    
    private void iA(int paramInt)
    {
      GMTrace.i(10286849327104L, 76643);
      if (this.hWY)
      {
        GMTrace.o(10286849327104L, 76643);
        return;
      }
      this.hWY = true;
      ResultReceiver localResultReceiver = (ResultReceiver)AppBrandProcessProxyUI.this.getIntent().getParcelableExtra("key_result_receiver");
      if (localResultReceiver != null) {
        localResultReceiver.send(paramInt, null);
      }
      GMTrace.o(10286849327104L, 76643);
    }
    
    public final void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
      GMTrace.i(10286580891648L, 76641);
      iA(paramInt);
      GMTrace.o(10286580891648L, 76641);
    }
    
    public final void onDismiss(DialogInterface paramDialogInterface)
    {
      GMTrace.i(10286715109376L, 76642);
      iA(-2);
      AppBrandProcessProxyUI.this.a(null);
      GMTrace.o(10286715109376L, 76642);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\AppBrandProcessProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */