package com.tencent.mm.plugin.appbrand.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.pluginsdk.model.w.a;
import com.tencent.mm.pluginsdk.ui.tools.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.e.g;
import com.tencent.xweb.util.b;
import com.tencent.xweb.x5.sdk.d;
import com.tencent.xweb.x5.sdk.f;
import com.tencent.xweb.x5.sdk.f.a;

@a(7)
public final class AppBrandTBSDownloadProxyUI
  extends MMActivity
{
  private static boolean iCz;
  r hsU;
  private a iCx;
  private Runnable iCy;
  private Handler mHandler;
  
  static
  {
    GMTrace.i(10521864568832L, 78394);
    w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "TRACE_ORDER:AppBrandTBSDownloadProxyUI.java");
    com.tencent.xweb.p.a(ab.getContext(), new b()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19699404374016L, 146772);
        w.d(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19699404374016L, 146772);
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19699135938560L, 146770);
        w.e(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19699135938560L, 146770);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19699001720832L, 146769);
        w.i(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19699001720832L, 146769);
      }
      
      public final void v(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19699538591744L, 146773);
        w.v(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19699538591744L, 146773);
      }
      
      public final void w(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19699270156288L, 146771);
        w.w(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19699270156288L, 146771);
      }
    }, null, null);
    iCz = false;
    GMTrace.o(10521864568832L, 78394);
  }
  
  public AppBrandTBSDownloadProxyUI()
  {
    GMTrace.i(10520253956096L, 78382);
    this.iCx = null;
    GMTrace.o(10520253956096L, 78382);
  }
  
  private void startTimer()
  {
    GMTrace.i(10520656609280L, 78385);
    this.mHandler = new Handler();
    this.iCy = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10513006198784L, 78328);
        AppBrandTBSDownloadProxyUI.aaR();
        Intent localIntent = new Intent();
        AppBrandTBSDownloadProxyUI.this.setResult(0, localIntent);
        AppBrandTBSDownloadProxyUI.this.finish();
        GMTrace.o(10513006198784L, 78328);
      }
    };
    this.mHandler.postDelayed(this.iCy, 20000L);
    GMTrace.o(10520656609280L, 78385);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10520388173824L, 78383);
    GMTrace.o(10520388173824L, 78383);
    return -1;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10520522391552L, 78384);
    super.onCreate(paramBundle);
    w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onCreate");
    this.hsU = com.tencent.mm.ui.base.h.a(this.vKB.vKW, null, true, null);
    this.hsU.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(10518643343360L, 78370);
        w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "cancle loading download background");
        paramAnonymousDialogInterface = new Intent();
        AppBrandTBSDownloadProxyUI.this.setResult(2, paramAnonymousDialogInterface);
        AppBrandTBSDownloadProxyUI.this.finish();
        GMTrace.o(10518643343360L, 78370);
      }
    });
    g.a(getWindow());
    w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onCreate, kill tool");
    paramBundle = new Intent();
    paramBundle.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    paramBundle.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
    sendBroadcast(paramBundle);
    boolean bool1 = f.isDownloading();
    boolean bool2 = d.getTBSInstalling();
    boolean bool3 = f.col();
    w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "now status, downloading = %b, installing = %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if ((bool1) || (bool2))
    {
      if (bool3)
      {
        w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "is foreground download");
        if (iCz)
        {
          setResult(0, new Intent());
          finish();
          GMTrace.o(10520522391552L, 78384);
          return;
        }
        if (this.iCx == null) {
          this.iCx = new a();
        }
        d.a(this.iCx);
        w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "is foreground download TBS already downloading, ignore duplicated request");
        paramBundle = this.vKB.vKW;
        this.vKB.vKW.getString(o.i.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a(paramBundle, this.vKB.vKW.getString(o.i.hGJ), true, null);
        if (this.hsU.getWindow() != null)
        {
          paramBundle = this.hsU.getWindow().getAttributes();
          paramBundle.dimAmount = 0.0F;
          this.hsU.getWindow().setAttributes(paramBundle);
        }
        this.hsU.setOnCancelListener(new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(10552600428544L, 78623);
            w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "cancle loading download background");
            paramAnonymousDialogInterface = new Intent();
            AppBrandTBSDownloadProxyUI.this.setResult(2, paramAnonymousDialogInterface);
            AppBrandTBSDownloadProxyUI.this.finish();
            GMTrace.o(10552600428544L, 78623);
          }
        });
        startTimer();
        GMTrace.o(10520522391552L, 78384);
        return;
      }
      w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "isBackGroundDownload reset download");
      f.stopDownload();
    }
    w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "try to get need download");
    paramBundle = new f.a()
    {
      public final void g(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
        GMTrace.i(10500658167808L, 78236);
        if ((paramAnonymousBoolean) && (paramAnonymousInt >= 36824))
        {
          w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "try to get need download success result %s version %d", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt) });
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(10541997228032L, 78544);
              w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onNeedDownloadFinish : showDialog");
              AppBrandTBSDownloadProxyUI.a(AppBrandTBSDownloadProxyUI.this);
              GMTrace.o(10541997228032L, 78544);
            }
          });
          GMTrace.o(10500658167808L, 78236);
          return;
        }
        w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "try to get need download fail result %s version %d", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt) });
        Intent localIntent = new Intent();
        AppBrandTBSDownloadProxyUI.this.setResult(0, localIntent);
        AppBrandTBSDownloadProxyUI.this.finish();
        GMTrace.o(10500658167808L, 78236);
      }
    };
    f.a(this.vKB.vKW, false, true, paramBundle);
    GMTrace.o(10520522391552L, 78384);
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(10520790827008L, 78386);
    w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onDestroy");
    if ((this.mHandler != null) && (this.iCy != null)) {
      this.mHandler.removeCallbacks(this.iCy);
    }
    super.onDestroy();
    GMTrace.o(10520790827008L, 78386);
  }
  
  private final class a
    implements com.tencent.xweb.x5.sdk.h
  {
    public a()
    {
      GMTrace.i(10494752587776L, 78192);
      GMTrace.o(10494752587776L, 78192);
    }
    
    public final void jA(int paramInt)
    {
      GMTrace.i(10494886805504L, 78193);
      w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onDownloadFinish, result = %d", new Object[] { Integer.valueOf(paramInt) });
      j.dX(5, paramInt);
      if ((paramInt == 100) || (paramInt == 120) || (paramInt == 122))
      {
        com.tencent.mm.plugin.report.service.g.ork.a(366L, 4L, 1L, false);
        if (paramInt == 110) {
          break label231;
        }
        if ((paramInt != 100) && (paramInt != 120) && (paramInt != 122)) {
          break label172;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(64, 64, 4, 3, 1, 1, false);
      }
      for (;;)
      {
        localObject = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
        if (localObject != null)
        {
          w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "tbs has download finished, save to sharedpreference");
          localObject = ((SharedPreferences)localObject).edit();
          ((SharedPreferences.Editor)localObject).putBoolean("tbs_download_finished", true);
          ((SharedPreferences.Editor)localObject).apply();
        }
        GMTrace.o(10494886805504L, 78193);
        return;
        com.tencent.mm.plugin.report.service.g.ork.a(366L, 5L, 1L, false);
        break;
        label172:
        AppBrandTBSDownloadProxyUI.d(AppBrandTBSDownloadProxyUI.this);
        d.a(AppBrandTBSDownloadProxyUI.e(AppBrandTBSDownloadProxyUI.this));
        com.tencent.mm.plugin.report.service.g.ork.a(64L, 3L, 1L, false);
        localObject = new Intent();
        AppBrandTBSDownloadProxyUI.this.setResult(0, (Intent)localObject);
        AppBrandTBSDownloadProxyUI.this.finish();
      }
      label231:
      Object localObject = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
      if (localObject != null)
      {
        w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "tbs has download finished, save to sharedpreference");
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putBoolean("tbs_download_finished", true);
        ((SharedPreferences.Editor)localObject).apply();
      }
      AppBrandTBSDownloadProxyUI.d(AppBrandTBSDownloadProxyUI.this);
      d.a(AppBrandTBSDownloadProxyUI.e(AppBrandTBSDownloadProxyUI.this));
      localObject = new Intent();
      AppBrandTBSDownloadProxyUI.this.setResult(0, (Intent)localObject);
      AppBrandTBSDownloadProxyUI.this.finish();
      GMTrace.o(10494886805504L, 78193);
    }
    
    public final void jB(int paramInt)
    {
      GMTrace.i(10495021023232L, 78194);
      w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onInstallFinish, result = %d", new Object[] { Integer.valueOf(paramInt) });
      if (AppBrandTBSDownloadProxyUI.this.hsU != null)
      {
        AppBrandTBSDownloadProxyUI.this.hsU.dismiss();
        AppBrandTBSDownloadProxyUI.this.hsU = null;
      }
      j.dX(6, paramInt);
      if ((paramInt == 200) || (paramInt == 220))
      {
        com.tencent.mm.plugin.report.service.g.ork.a(64, 64, 7, 6, 1, 1, false);
        com.tencent.mm.plugin.report.service.g.ork.a(366L, 6L, 1L, false);
        w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onInstallFinish, restart tool");
        localIntent = new Intent();
        localIntent.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
        AppBrandTBSDownloadProxyUI.this.sendBroadcast(localIntent);
        AppBrandTBSDownloadProxyUI.d(AppBrandTBSDownloadProxyUI.this);
        d.a(AppBrandTBSDownloadProxyUI.e(AppBrandTBSDownloadProxyUI.this));
        localIntent = new Intent();
        AppBrandTBSDownloadProxyUI.this.setResult(-1, localIntent);
        AppBrandTBSDownloadProxyUI.this.finish();
        GMTrace.o(10495021023232L, 78194);
        return;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(64L, 6L, 1L, false);
      com.tencent.mm.plugin.report.service.g.ork.a(366L, 7L, 1L, false);
      AppBrandTBSDownloadProxyUI.d(AppBrandTBSDownloadProxyUI.this);
      d.a(AppBrandTBSDownloadProxyUI.e(AppBrandTBSDownloadProxyUI.this));
      Intent localIntent = new Intent();
      AppBrandTBSDownloadProxyUI.this.setResult(0, localIntent);
      AppBrandTBSDownloadProxyUI.this.finish();
      GMTrace.o(10495021023232L, 78194);
    }
    
    public final void jC(final int paramInt)
    {
      GMTrace.i(10495155240960L, 78195);
      w.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onDownloadProgress, percent = %d", new Object[] { Integer.valueOf(paramInt) });
      if (AppBrandTBSDownloadProxyUI.this.hsU != null) {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10518911778816L, 78372);
            AppBrandTBSDownloadProxyUI.this.hsU.setMessage(AppBrandTBSDownloadProxyUI.this.vKB.vKW.getString(o.i.hGK, new Object[] { String.valueOf(paramInt) }));
            GMTrace.o(10518911778816L, 78372);
          }
        });
      }
      GMTrace.o(10495155240960L, 78195);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandTBSDownloadProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */