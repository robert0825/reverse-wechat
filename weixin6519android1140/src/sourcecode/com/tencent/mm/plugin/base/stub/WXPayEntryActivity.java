package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelpay.PayReq.Options;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXPayEntryActivity
  extends AutoLoginActivity
{
  private String jjG;
  private long jjH;
  
  public WXPayEntryActivity()
  {
    GMTrace.i(12841817997312L, 95679);
    this.jjG = null;
    this.jjH = 0L;
    GMTrace.o(12841817997312L, 95679);
  }
  
  private void kV(int paramInt)
  {
    GMTrace.i(12842354868224L, 95683);
    PayReq localPayReq = new PayReq();
    localPayReq.fromBundle(s.ah(getIntent()));
    PayReq.Options localOptions = new PayReq.Options();
    localOptions.fromBundle(s.ah(getIntent()));
    PayResp localPayResp = new PayResp();
    localPayResp.prepayId = localPayReq.prepayId;
    localPayResp.extData = localPayReq.extData;
    localPayResp.errCode = paramInt;
    com.tencent.mm.plugin.wallet_index.ui.a.a(this, s.i(getIntent(), "_mmessage_appPackage"), localPayResp, localOptions);
    GMTrace.o(12842354868224L, 95683);
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    boolean bool2 = true;
    GMTrace.i(12842220650496L, 95682);
    if (paramIntent == null)
    {
      finish();
      GMTrace.o(12842220650496L, 95682);
      return;
    }
    w.i("MicroMsg.WXPayEntryActivity", "postLogin, delegate intent to OrderHandlerUI, resultCode = " + parama);
    switch (1.jjk[parama.ordinal()])
    {
    default: 
      w.e("MicroMsg.WXPayEntryActivity", "postLogin, unknown login result = " + parama);
    }
    for (;;)
    {
      this.jjG = s.i(paramIntent, "_mmessage_appPackage");
      w.i("MicroMsg.WXPayEntryActivity", "postLogin, getCallingPackage success, value = " + this.jjG);
      boolean bool1;
      if ((getIntent() == null) || (s.ah(getIntent()) == null))
      {
        bool1 = false;
        label158:
        if (!bool1) {
          w.e("MicroMsg.WXPayEntryActivity", "postLogin, checkApp fail");
        }
      }
      try
      {
        paramIntent.putExtra("key_scene", 0);
        parama = s.ah(paramIntent);
        parama.putLong("wallet_pay_key_check_time", this.jjH);
        com.tencent.mm.pluginsdk.wallet.g.a(this, parama, bool1);
        finish();
        GMTrace.o(12842220650496L, 95682);
        return;
        w.i("MicroMsg.WXPayEntryActivity", "coreaccount st %s", new Object[] { Boolean.valueOf(com.tencent.mm.kernel.a.wF()) });
        if (!com.tencent.mm.kernel.a.wF()) {
          continue;
        }
        finish();
        GMTrace.o(12842220650496L, 95682);
        return;
        kV(-2);
        w.e("MicroMsg.WXPayEntryActivity", "postLogin fail, loginResult = " + parama);
        finish();
        GMTrace.o(12842220650496L, 95682);
        return;
        kV(-1);
        w.e("MicroMsg.WXPayEntryActivity", "postLogin fail, loginResult = " + parama);
        finish();
        GMTrace.o(12842220650496L, 95682);
        return;
        parama = new PayReq();
        parama.fromBundle(s.ah(getIntent()));
        parama = parama.appId;
        w.d("MicroMsg.WXPayEntryActivity", "postLogin, appId = " + parama);
        if ((parama == null) || (parama.length() == 0))
        {
          w.e("MicroMsg.WXPayEntryActivity", "checkApp fail, appId is null");
          bool1 = false;
          break label158;
        }
        f localf = com.tencent.mm.pluginsdk.model.app.g.aP(parama, true);
        if (localf == null)
        {
          w.w("MicroMsg.WXPayEntryActivity", "checkApp fail, not reg");
          localf = new f();
          localf.field_appId = parama;
          localf.field_appName = "";
          localf.field_packageName = this.jjG;
          localf.field_status = 0;
          String str = p.aP(this, this.jjG);
          if (str != null) {
            localf.field_signature = str;
          }
          bool1 = bool2;
          if (!an.aWy().l(localf)) {
            break label158;
          }
          bool1 = bool2;
          if (!bg.nm(localf.field_openId)) {
            break label158;
          }
          w.d("MicroMsg.WXPayEntryActivity", "checkApp, trigger getAppSetting, appId = " + parama);
          an.aWA().LD(parama);
          bool1 = bool2;
          break label158;
        }
        if (localf.field_status == 3)
        {
          w.e("MicroMsg.WXPayEntryActivity", "checkApp fail, app is in blacklist");
          bool1 = false;
          break label158;
        }
        bool1 = bool2;
        if (p.b(this, localf, this.jjG)) {
          break label158;
        }
        a(this, localf, this.jjG, 5);
        w.e("MicroMsg.WXPayEntryActivity", "checkApp fail, app invalid");
        bool1 = false;
      }
      catch (Exception parama)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.IntentUtil", parama, "", new Object[0]);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12841952215040L, 95680);
    this.jjH = System.currentTimeMillis();
    s.b(getIntent(), "key_auto_login_wizard_exit", true);
    super.onCreate(paramBundle);
    GMTrace.o(12841952215040L, 95680);
  }
  
  protected final boolean y(Intent paramIntent)
  {
    GMTrace.i(12842086432768L, 95681);
    GMTrace.o(12842086432768L, 95681);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\base\stub\WXPayEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */