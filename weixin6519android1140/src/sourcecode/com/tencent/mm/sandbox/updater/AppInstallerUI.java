package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i.a;

public class AppInstallerUI
  extends MMBaseActivity
{
  private static AppInstallerUI vfb;
  private String desc;
  private String eDW;
  private com.tencent.mm.ui.base.i oaD;
  private int pUw;
  private com.tencent.mm.ui.base.i vfa;
  private DialogInterface.OnClickListener vfc;
  
  static
  {
    GMTrace.i(3590726877184L, 26753);
    vfb = null;
    GMTrace.o(3590726877184L, 26753);
  }
  
  public AppInstallerUI()
  {
    GMTrace.i(3589384699904L, 26743);
    this.oaD = null;
    this.vfa = null;
    this.vfc = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(3560527888384L, 26528);
        w.d("MicroMsg.AppInstallerUI", "getBtn (ok button) is click");
        if (AppInstallerUI.b(AppInstallerUI.this) == 2) {
          i.aa(AppInstallerUI.this, 3);
        }
        paramAnonymousDialogInterface = com.tencent.mm.sandbox.monitor.c.FM(AppInstallerUI.c(AppInstallerUI.this));
        w.d("MicroMsg.AppInstallerUI", paramAnonymousDialogInterface);
        if (paramAnonymousDialogInterface != null)
        {
          j.a.vgF.X(1, true);
          g.ork.a(405L, 72L, 1L, true);
          AppInstallerUI.a(AppInstallerUI.this, paramAnonymousDialogInterface);
          GMTrace.o(3560527888384L, 26528);
          return;
        }
        g.ork.a(405L, 73L, 1L, true);
        w.e("MicroMsg.AppInstallerUI", "pack not found!");
        h.bm(AppInstallerUI.this, AppInstallerUI.this.getString(R.l.efh));
        i.bPe();
        AppInstallerUI.this.finish();
        GMTrace.o(3560527888384L, 26528);
      }
    };
    GMTrace.o(3589384699904L, 26743);
  }
  
  public static AppInstallerUI bOL()
  {
    GMTrace.i(3589518917632L, 26744);
    AppInstallerUI localAppInstallerUI = vfb;
    GMTrace.o(3589518917632L, 26744);
    return localAppInstallerUI;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3589653135360L, 26745);
    super.onCreate(paramBundle);
    w.d("MicroMsg.AppInstallerUI", "onCreate");
    com.tencent.mm.sandbox.c.f(hashCode(), this);
    MMActivity.eJ(this);
    if ((AppUpdaterUI.bOM() != null) && (!AppUpdaterUI.bOM().isFinishing()))
    {
      w.d("MicroMsg.AppInstallerUI", "AppUpdaterUI is there, finish self");
      finish();
      GMTrace.o(3589653135360L, 26745);
      return;
    }
    if ((vfb != null) && (!vfb.isFinishing()) && (vfb != this))
    {
      w.d("MicroMsg.AppInstallerUI", "duplicate instance, finish self");
      finish();
      GMTrace.o(3589653135360L, 26745);
      return;
    }
    vfb = this;
    this.eDW = i.bJN();
    if ((bg.nm(this.eDW)) || (com.tencent.mm.sandbox.monitor.c.FM(this.eDW) == null))
    {
      finish();
      GMTrace.o(3589653135360L, 26745);
      return;
    }
    this.desc = i.bOW();
    this.pUw = i.bOX();
    setContentView(R.i.empty);
    paramBundle = new i.a(this);
    paramBundle.BN(R.l.dxo);
    paramBundle.lz(true);
    paramBundle.d(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3573412790272L, 26624);
        AppInstallerUI.a(AppInstallerUI.this);
        GMTrace.o(3573412790272L, 26624);
      }
    });
    paramBundle.VA(getString(R.l.dxr, new Object[] { this.desc }));
    paramBundle.BQ(R.l.dDf).a(false, this.vfc);
    paramBundle.BR(R.l.eff).b(null);
    this.oaD = paramBundle.aax();
    this.oaD.setCanceledOnTouchOutside(false);
    this.oaD.show();
    g.ork.a(405L, 71L, 1L, true);
    if (this.pUw == 2) {
      i.f(this, 2, i.bOY() + 1);
    }
    GMTrace.o(3589653135360L, 26745);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(3589787353088L, 26746);
    w.d("MicroMsg.AppInstallerUI", "onDestroy");
    if ((this.oaD != null) && (this.oaD.isShowing())) {
      this.oaD.dismiss();
    }
    if ((this.vfa != null) && (this.vfa.isShowing())) {
      this.vfa.dismiss();
    }
    if (vfb == this) {
      vfb = null;
    }
    com.tencent.mm.sandbox.c.g(hashCode(), this);
    super.onDestroy();
    GMTrace.o(3589787353088L, 26746);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\AppInstallerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */