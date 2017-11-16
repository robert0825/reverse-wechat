package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.wallet_core.c.a.b;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletIbgAdapterUI
  extends WalletBaseUI
{
  public WalletIbgAdapterUI()
  {
    GMTrace.i(6958786543616L, 51847);
    GMTrace.o(6958786543616L, 51847);
  }
  
  private void KG(String paramString)
  {
    GMTrace.i(6959457632256L, 51852);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(6959457632256L, 51852);
  }
  
  private void bzZ()
  {
    GMTrace.i(6959591849984L, 51853);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(com.tencent.mm.storage.w.a.vtX, Boolean.valueOf(true));
    com.tencent.mm.ui.base.h.a(this, false, getString(a.i.tia), "", getString(a.i.thX), getString(a.i.thW), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6958383890432L, 51844);
        com.tencent.mm.pluginsdk.model.w.a.dM(WalletIbgAdapterUI.this);
        Toast.makeText(WalletIbgAdapterUI.this, WalletIbgAdapterUI.this.getString(a.i.thY), 1).show();
        WalletIbgAdapterUI.this.finish();
        GMTrace.o(6958383890432L, 51844);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6958652325888L, 51846);
        WalletIbgAdapterUI.this.finish();
        GMTrace.o(6958652325888L, 51846);
      }
    });
    GMTrace.o(6959591849984L, 51853);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6959189196800L, 51850);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof b)))
    {
      paramInt1 = ((b)paramk).rcM;
      paramString = ((b)paramk).jumpUrl;
      w.i("MicroMsg.WalletH5AdapterUI", "hy: get success! url is: %s, download x5 = %b", new Object[] { paramString, Integer.valueOf(paramInt1) });
      if (paramInt1 == 1)
      {
        paramInt1 = com.tencent.mm.pluginsdk.model.w.a.bJn();
        w.i("MicroMsg.WalletH5AdapterUI", "now status = %d", new Object[] { Integer.valueOf(paramInt1) });
        switch (paramInt1)
        {
        default: 
          bzZ();
        case 1: 
        case 4: 
          for (paramInt1 = 0; paramInt1 != 0; paramInt1 = 1)
          {
            KG(paramString);
            finish();
            GMTrace.o(6959189196800L, 51850);
            return false;
          }
        }
        com.tencent.mm.kernel.h.xz();
        if (((Boolean)com.tencent.mm.kernel.h.xy().xh().get(com.tencent.mm.storage.w.a.vtX, Boolean.valueOf(false))).booleanValue())
        {
          Toast.makeText(this, getString(a.i.thZ), 1).show();
          com.tencent.mm.pluginsdk.model.w.a.dM(this);
          finish();
        }
        for (;;)
        {
          paramInt1 = 0;
          break;
          bzZ();
        }
      }
      KG(paramString);
      finish();
      GMTrace.o(6959189196800L, 51850);
      return false;
    }
    com.tencent.mm.wallet_core.a.c(this, null, 0);
    GMTrace.o(6959189196800L, 51850);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6959726067712L, 51854);
    GMTrace.o(6959726067712L, 51854);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6958920761344L, 51848);
    super.onCreate(paramBundle);
    sv(4);
    this.xEL.hN(1564);
    r(new b());
    GMTrace.o(6958920761344L, 51848);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6959323414528L, 51851);
    this.xEL.hO(1564);
    super.onDestroy();
    GMTrace.o(6959323414528L, 51851);
  }
  
  public void onResume()
  {
    GMTrace.i(6959054979072L, 51849);
    super.onResume();
    GMTrace.o(6959054979072L, 51849);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\ibg\WalletIbgAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */