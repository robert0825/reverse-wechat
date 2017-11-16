package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMBaseActivity;
import java.util.ArrayList;

public class AppUpdaterUI
  extends MMBaseActivity
{
  private static AppUpdaterUI vfg;
  private Button jgI;
  private com.tencent.mm.ui.base.i oaD;
  private DialogInterface.OnClickListener vfc;
  private Button vff;
  private j vfh;
  private g vfi;
  private DialogInterface.OnClickListener vfj;
  
  static
  {
    GMTrace.i(3563078025216L, 26547);
    vfg = null;
    GMTrace.o(3563078025216L, 26547);
  }
  
  public AppUpdaterUI()
  {
    GMTrace.i(3560662106112L, 26529);
    this.oaD = null;
    this.vfi = new g()
    {
      public final void Ih(String paramAnonymousString)
      {
        GMTrace.i(3559856799744L, 26523);
        if (AppUpdaterUI.b(AppUpdaterUI.this) != null) {
          AppUpdaterUI.b(AppUpdaterUI.this).dismiss();
        }
        if (AppUpdaterUI.this.isFinishing())
        {
          GMTrace.o(3559856799744L, 26523);
          return;
        }
        w.d("MicroMsg.AppUpdaterUI", paramAnonymousString);
        if (paramAnonymousString != null)
        {
          AppUpdaterUI.a(AppUpdaterUI.this, paramAnonymousString);
          AppUpdaterUI.a(AppUpdaterUI.this).setEnabled(false);
        }
        GMTrace.o(3559856799744L, 26523);
      }
      
      public final void a(com.tencent.mm.sandbox.monitor.c paramAnonymousc)
      {
        GMTrace.i(3559991017472L, 26524);
        if (AppUpdaterUI.this.isFinishing())
        {
          GMTrace.o(3559991017472L, 26524);
          return;
        }
        if ((paramAnonymousc instanceof c))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(405L, 67L, 1L, true);
          w.e("MicroMsg.AppUpdaterUI", "download package from cdn error. switch to webserver");
          if (AppUpdaterUI.b(AppUpdaterUI.this) != null) {
            AppUpdaterUI.b(AppUpdaterUI.this).setMessage(AppUpdaterUI.this.getString(R.l.dxq, new Object[] { AppUpdaterUI.e(AppUpdaterUI.this).desc, AppUpdaterUI.this.getString(R.l.efj), bg.aF(AppUpdaterUI.e(AppUpdaterUI.this).size) }));
          }
          if (AppUpdaterUI.e(AppUpdaterUI.this).vgt)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(405L, 68L, 1L, true);
            AppUpdaterUI.a(AppUpdaterUI.this, paramAnonymousc);
          }
          GMTrace.o(3559991017472L, 26524);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(405L, 69L, 1L, true);
        com.tencent.mm.ui.base.h.a(AppUpdaterUI.this, R.l.efk, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(3586834563072L, 26724);
            w.d("MicroMsg.AppUpdaterUI", "go to WebView");
            paramAnonymous2DialogInterface = new Intent("android.intent.action.VIEW", Uri.parse("https://weixin.qq.com/m"));
            paramAnonymous2DialogInterface.addFlags(268435456);
            AppUpdaterUI.this.startActivity(paramAnonymous2DialogInterface);
            GMTrace.o(3586834563072L, 26724);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(3598243069952L, 26809);
            GMTrace.o(3598243069952L, 26809);
          }
        });
        GMTrace.o(3559991017472L, 26524);
      }
      
      public final void bOP()
      {
        GMTrace.i(3559454146560L, 26520);
        w.e("MicroMsg.AppUpdaterUI", "no sdcard.");
        if (AppUpdaterUI.b(AppUpdaterUI.this) != null) {
          AppUpdaterUI.b(AppUpdaterUI.this).dismiss();
        }
        if (AppUpdaterUI.this.isFinishing())
        {
          GMTrace.o(3559454146560L, 26520);
          return;
        }
        AppUpdaterUI.c(AppUpdaterUI.this);
        GMTrace.o(3559454146560L, 26520);
      }
      
      public final void bOQ()
      {
        GMTrace.i(3559588364288L, 26521);
        if (AppUpdaterUI.b(AppUpdaterUI.this) != null) {
          AppUpdaterUI.b(AppUpdaterUI.this).dismiss();
        }
        if (AppUpdaterUI.this.isFinishing())
        {
          GMTrace.o(3559588364288L, 26521);
          return;
        }
        AppUpdaterUI.d(AppUpdaterUI.this);
        GMTrace.o(3559588364288L, 26521);
      }
      
      public final void bP(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(3559319928832L, 26519);
        if (paramAnonymousInt1 <= 0) {}
        for (long l = 0L;; l = paramAnonymousInt2 * 100L / paramAnonymousInt1)
        {
          paramAnonymousInt1 = (int)l;
          if (paramAnonymousInt1 != 100) {
            break;
          }
          AppUpdaterUI.a(AppUpdaterUI.this).setText(AppUpdaterUI.this.getString(R.l.efo));
          GMTrace.o(3559319928832L, 26519);
          return;
        }
        AppUpdaterUI.a(AppUpdaterUI.this).setText(AppUpdaterUI.this.getString(R.l.efm) + paramAnonymousInt1 + "%");
        GMTrace.o(3559319928832L, 26519);
      }
      
      public final void bkK()
      {
        GMTrace.i(3559722582016L, 26522);
        if (AppUpdaterUI.this.isFinishing())
        {
          GMTrace.o(3559722582016L, 26522);
          return;
        }
        AppUpdaterUI.a(AppUpdaterUI.this).setText(R.l.efm);
        AppUpdaterUI.a(AppUpdaterUI.this).setEnabled(false);
        GMTrace.o(3559722582016L, 26522);
      }
    };
    this.vfj = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(3581600071680L, 26685);
        AppUpdaterUI.g(AppUpdaterUI.this);
        GMTrace.o(3581600071680L, 26685);
      }
    };
    this.vfc = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(3586297692160L, 26720);
        w.d("MicroMsg.AppUpdaterUI", "getBtn (ok button) is click");
        if (AppUpdaterUI.e(AppUpdaterUI.this).pUw == 1) {
          i.aa(AppUpdaterUI.this, 6);
        }
        if (!com.tencent.mm.compatible.util.h.getExternalStorageState().equals("mounted"))
        {
          w.e("MicroMsg.AppUpdaterUI", "no sdcard.");
          AppUpdaterUI.b(AppUpdaterUI.this).dismiss();
          AppUpdaterUI.c(AppUpdaterUI.this);
          GMTrace.o(3586297692160L, 26720);
          return;
        }
        if ((AppUpdaterUI.e(AppUpdaterUI.this).eqX & 0x1) != 0)
        {
          w.e("MicroMsg.AppUpdaterUI", "package has set external update mode");
          paramAnonymousDialogInterface = Uri.parse(AppUpdaterUI.e(AppUpdaterUI.this).eqZ);
          localObject = new Intent("android.intent.action.VIEW", paramAnonymousDialogInterface).addFlags(268435456);
          if ((paramAnonymousDialogInterface == null) || (localObject == null) || (!bg.j(AppUpdaterUI.this, (Intent)localObject)))
          {
            w.e("MicroMsg.AppUpdaterUI", "parse market uri failed, jump to weixin.qq.com");
            paramAnonymousDialogInterface = new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456);
            AppUpdaterUI.this.startActivity(paramAnonymousDialogInterface);
          }
          for (;;)
          {
            AppUpdaterUI.f(AppUpdaterUI.this);
            GMTrace.o(3586297692160L, 26720);
            return;
            w.i("MicroMsg.AppUpdaterUI", "parse market uri ok");
            AppUpdaterUI.this.startActivity((Intent)localObject);
          }
        }
        Object localObject = com.tencent.mm.sandbox.monitor.c.aU(AppUpdaterUI.e(AppUpdaterUI.this).eDW, AppUpdaterUI.e(AppUpdaterUI.this).vgx);
        paramAnonymousDialogInterface = (DialogInterface)localObject;
        if (bg.nm((String)localObject))
        {
          paramAnonymousDialogInterface = (DialogInterface)localObject;
          if (AppUpdaterUI.e(AppUpdaterUI.this).vgs != null) {
            paramAnonymousDialogInterface = com.tencent.mm.sandbox.monitor.c.Rt(AppUpdaterUI.e(AppUpdaterUI.this).vgs.ern);
          }
        }
        w.d("MicroMsg.AppUpdaterUI", paramAnonymousDialogInterface);
        if (paramAnonymousDialogInterface != null)
        {
          w.i("MicroMsg.AppUpdaterUI", "update package already exist.");
          AppUpdaterUI.a(AppUpdaterUI.this, 8);
          if (AppUpdaterUI.e(AppUpdaterUI.this).vgt) {
            AppUpdaterUI.a(AppUpdaterUI.this, 0);
          }
          for (;;)
          {
            AppUpdaterUI.e(AppUpdaterUI.this).X(1, true);
            AppUpdaterUI.h(AppUpdaterUI.this).Ih(paramAnonymousDialogInterface);
            GMTrace.o(3586297692160L, 26720);
            return;
            AppUpdaterUI.a(AppUpdaterUI.this, 9);
          }
        }
        w.d("MicroMsg.AppUpdaterUI", "current downloadMode : %s", new Object[] { Integer.valueOf(AppUpdaterUI.e(AppUpdaterUI.this).pUw) });
        w.d("MicroMsg.AppUpdaterUI", "current updateType : %s", new Object[] { Integer.valueOf(AppUpdaterUI.e(AppUpdaterUI.this).veV) });
        if (AppUpdaterUI.e(AppUpdaterUI.this).pUw == 0)
        {
          AppUpdaterUI.e(AppUpdaterUI.this).bPf();
          GMTrace.o(3586297692160L, 26720);
          return;
        }
        if (AppUpdaterUI.e(AppUpdaterUI.this).pUw == 1)
        {
          w.d("MicroMsg.AppUpdaterUI", "gonna start UpdaterService");
          AppUpdaterUI.f(AppUpdaterUI.this);
          paramAnonymousDialogInterface = new Intent(AppUpdaterUI.this.getIntent());
          paramAnonymousDialogInterface.setClass(AppUpdaterUI.this, UpdaterService.class);
          paramAnonymousDialogInterface.putExtra("intent_extra_run_in_foreground", true);
          AppUpdaterUI.this.startService(paramAnonymousDialogInterface);
          if (AppUpdaterUI.e(AppUpdaterUI.this).vgx)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(614L, 56L, 1L, false);
            w.d("MicroMsg.AppUpdaterUI", "boots download start.");
          }
          GMTrace.o(3586297692160L, 26720);
          return;
        }
        w.e("MicroMsg.AppUpdaterUI", "silence download never go here!");
        GMTrace.o(3586297692160L, 26720);
      }
    };
    GMTrace.o(3560662106112L, 26529);
  }
  
  public static AppUpdaterUI bOM()
  {
    GMTrace.i(3560796323840L, 26530);
    AppUpdaterUI localAppUpdaterUI = vfg;
    GMTrace.o(3560796323840L, 26530);
    return localAppUpdaterUI;
  }
  
  public static void bON()
  {
    GMTrace.i(3560930541568L, 26531);
    if (vfg != null) {
      vfg.bOO();
    }
    GMTrace.o(3560930541568L, 26531);
  }
  
  private void bOO()
  {
    GMTrace.i(3561333194752L, 26534);
    if ((this.oaD != null) && (this.oaD.isShowing())) {
      this.oaD.dismiss();
    }
    finish();
    GMTrace.o(3561333194752L, 26534);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3561064759296L, 26532);
    super.onCreate(paramBundle);
    w.d("MicroMsg.AppUpdaterUI", "onCreate");
    com.tencent.mm.sandbox.c.f(hashCode(), this);
    MMActivity.eJ(this);
    if ((AppInstallerUI.bOL() != null) && (!AppInstallerUI.bOL().isFinishing()))
    {
      w.d("MicroMsg.AppUpdaterUI", "AppInstallerUI is there, finish self");
      finish();
      GMTrace.o(3561064759296L, 26532);
      return;
    }
    if ((vfg != null) && (!vfg.isFinishing()) && (vfg != this))
    {
      w.d("MicroMsg.AppUpdaterUI", "duplicate instance, finish self");
      w.d("MicroMsg.AppUpdaterUI", "we already got one instance, does it gonna leak?");
      finish();
      GMTrace.o(3561064759296L, 26532);
      return;
    }
    vfg = this;
    setContentView(R.i.empty);
    this.vfh = j.a.vgF;
    if (!this.vfh.ag(getIntent()))
    {
      w.e("MicroMsg.AppUpdaterUI", "updaterManager.handleCommand return false");
      bOO();
      GMTrace.o(3561064759296L, 26532);
      return;
    }
    if ((this.vfh.veV == 999) && (this.vfh.vfx != null) && (this.vfh.vfx.length > 0))
    {
      w.d("MicroMsg.AppUpdaterUI", "into emergency status");
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3593008578560L, 26770);
          com.tencent.mm.ui.base.h.a(AppUpdaterUI.this, AppUpdaterUI.e(AppUpdaterUI.this).desc, AppUpdaterUI.this.getString(R.l.cUG), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(3581063200768L, 26681);
              paramAnonymous2DialogInterface = new Intent("android.intent.action.VIEW", Uri.parse(AppUpdaterUI.e(AppUpdaterUI.this).vfx[0]));
              paramAnonymous2DialogInterface.addFlags(268435456);
              ab.getContext().startActivity(paramAnonymous2DialogInterface);
              AppUpdaterUI.f(AppUpdaterUI.this);
              GMTrace.o(3581063200768L, 26681);
            }
          }).setOnCancelListener(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(3564822855680L, 26560);
              AppUpdaterUI.f(AppUpdaterUI.this);
              GMTrace.o(3564822855680L, 26560);
            }
          });
          GMTrace.o(3593008578560L, 26770);
        }
      }, 100L);
      GMTrace.o(3561064759296L, 26532);
      return;
    }
    w.d("MicroMsg.AppUpdaterUI", "showUpdateDlg, downloadUrls = " + this.vfh.vfx);
    Object localObject = new com.tencent.mm.ui.base.i.a(this);
    ((com.tencent.mm.ui.base.i.a)localObject).BN(R.l.dxo);
    ((com.tencent.mm.ui.base.i.a)localObject).lz(true);
    ((com.tencent.mm.ui.base.i.a)localObject).d(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3577841975296L, 26657);
        AppUpdaterUI.g(AppUpdaterUI.this);
        GMTrace.o(3577841975296L, 26657);
      }
    });
    if ((this.vfh.vgt) && (this.vfh.vgs != null))
    {
      paramBundle = getString(R.l.dxq, new Object[] { this.vfh.desc, getString(R.l.efn), bg.aF(this.vfh.vgs.size) });
      if (this.vfh.veV == 1) {
        break label617;
      }
    }
    label617:
    for (int i = R.l.eff;; i = R.l.efi)
    {
      ((com.tencent.mm.ui.base.i.a)localObject).VA(paramBundle);
      ((com.tencent.mm.ui.base.i.a)localObject).BQ(R.l.efr).a(false, this.vfc);
      ((com.tencent.mm.ui.base.i.a)localObject).BR(i);
      this.oaD = ((com.tencent.mm.ui.base.i.a)localObject).aax();
      this.oaD.setCanceledOnTouchOutside(false);
      this.vff = this.oaD.getButton(-1);
      this.jgI = this.oaD.getButton(-2);
      this.oaD.show();
      if (this.vfh.pUw == 1) {
        i.aa(this, 5);
      }
      if (this.vfh.vgx) {
        com.tencent.mm.plugin.report.service.g.ork.a(614L, 60L, 1L, false);
      }
      paramBundle = this.vfh;
      localObject = this.vfi;
      if ((localObject != null) && (!paramBundle.vgo.contains(localObject))) {
        paramBundle.vgo.add(localObject);
      }
      GMTrace.o(3561064759296L, 26532);
      return;
      w.d("MicroMsg.AppUpdaterUI", "had try to download full pack.");
      paramBundle = getString(R.l.dxq, new Object[] { this.vfh.desc, getString(R.l.efj), bg.aF(this.vfh.size) });
      break;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(3561198977024L, 26533);
    w.d("MicroMsg.AppUpdaterUI", "onDestroy");
    com.tencent.mm.sandbox.c.g(hashCode(), this);
    if (this.vfh != null)
    {
      j localj = this.vfh;
      g localg = this.vfi;
      localj.vgo.remove(localg);
    }
    if (vfg == this) {
      vfg = null;
    }
    super.onDestroy();
    GMTrace.o(3561198977024L, 26533);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\AppUpdaterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */