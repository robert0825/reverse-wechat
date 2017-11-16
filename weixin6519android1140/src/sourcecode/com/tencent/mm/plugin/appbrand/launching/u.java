package com.tencent.mm.plugin.appbrand.launching;

import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.model.w.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;

class u
  implements MMActivity.a
{
  final int eLN;
  
  u()
  {
    GMTrace.i(21032723283968L, 156706);
    this.eLN = (u.class.hashCode() & 0xFFFF);
    GMTrace.o(21032723283968L, 156706);
  }
  
  private void ctM()
  {
    GMTrace.i(10158000308224L, 75683);
    if (com.tencent.mm.compatible.util.d.et(17)) {
      onReady();
    }
    GMTrace.o(10158000308224L, 75683);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10158134525952L, 75684);
    if (this.eLN != paramInt1)
    {
      GMTrace.o(10158134525952L, 75684);
      return;
    }
    if (paramInt2 == -1)
    {
      w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "onActivityResult, tbs download ok");
      com.tencent.mm.plugin.appbrand.task.d.jy(0);
      onReady();
      GMTrace.o(10158134525952L, 75684);
      return;
    }
    if (paramInt2 == 2)
    {
      w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "onActivityResult, tbs cancel loading, download in background");
      bBT();
      GMTrace.o(10158134525952L, 75684);
      return;
    }
    w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "onActivityResult, tbs download unknown error, resultCode = %d, apiLevel = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(Build.VERSION.SDK_INT) });
    g.ork.a(366L, 8L, 1L, false);
    ctM();
    GMTrace.o(10158134525952L, 75684);
  }
  
  final void a(AppBrandLaunchProxyUI paramAppBrandLaunchProxyUI)
  {
    GMTrace.i(21032857501696L, 156707);
    long l = bg.Pv();
    int i = w.a.ctN();
    w.d("MicroMsg.AppBrand.PreLaunchCheckForTBS", "check tbs download, cost = %d, cheTBSRet = %d", new Object[] { Long.valueOf(bg.Pv() - l), Integer.valueOf(i) });
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(21032857501696L, 156707);
      return;
      w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "check(Activity), onReady");
      onReady();
      GMTrace.o(21032857501696L, 156707);
      return;
      w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "check(Activity), goProxyUI");
      if ((paramAppBrandLaunchProxyUI == null) || (paramAppBrandLaunchProxyUI.isFinishing()))
      {
        GMTrace.o(21032857501696L, 156707);
        return;
      }
      Intent localIntent = new Intent().setClass(paramAppBrandLaunchProxyUI, AppBrandTBSDownloadProxyUI.class).putExtra("intent_extra_download_ignore_network_type", true);
      i = this.eLN;
      paramAppBrandLaunchProxyUI.vKC = this;
      paramAppBrandLaunchProxyUI.startActivityForResult(localIntent, i);
      GMTrace.o(21032857501696L, 156707);
      return;
      w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "check(Activity), dealCannotDownload");
      ctM();
    }
  }
  
  void bBT()
  {
    GMTrace.i(10157463437312L, 75679);
    GMTrace.o(10157463437312L, 75679);
  }
  
  void onReady()
  {
    GMTrace.i(10157329219584L, 75678);
    GMTrace.o(10157329219584L, 75678);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */