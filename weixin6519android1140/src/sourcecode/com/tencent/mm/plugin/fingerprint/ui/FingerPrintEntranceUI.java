package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class FingerPrintEntranceUI
  extends WalletBaseUI
{
  public FingerPrintEntranceUI()
  {
    GMTrace.i(10767751446528L, 80226);
    GMTrace.o(10767751446528L, 80226);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(10768154099712L, 80229);
    GMTrace.o(10768154099712L, 80229);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10768288317440L, 80230);
    GMTrace.o(10768288317440L, 80230);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int j = 1;
    GMTrace.i(10767885664256L, 80227);
    super.onCreate(paramBundle);
    w.i("MicroMsg.FingerPrintEntranceUI", "onCreate");
    int i;
    if (e.azV())
    {
      w.i("MicroMsg.FingerPrintEntranceUI", "will call showSetFingerPrintGuide()");
      w.i("MicroMsg.FingerPrintEntranceUI", "hy: has standard action starting to fingerprint setting");
      paramBundle = getResources().getString(a.i.sYE);
      Resources localResources = getResources();
      if (((com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class)).azE())
      {
        i = a.i.sSj;
        com.tencent.mm.ui.base.h.a(this, paramBundle, "", localResources.getString(i), getString(a.i.cSk), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(10760101036032L, 80169);
            w.i("MicroMsg.FingerPrintEntranceUI", "user click the button to set system fingerprint");
            FingerPrintEntranceUI.a(FingerPrintEntranceUI.this);
            FingerPrintEntranceUI.this.finish();
            GMTrace.o(10760101036032L, 80169);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(10755403415552L, 80134);
            FingerPrintEntranceUI.this.finish();
            GMTrace.o(10755403415552L, 80134);
          }
        });
        e.azQ();
        i = j;
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        w.e("MicroMsg.FingerPrintEntranceUI", "finish FingerPrintEntranceUI");
        finish();
      }
      GMTrace.o(10767885664256L, 80227);
      return;
      i = a.i.cTM;
      break;
      if (!e.azP())
      {
        w.i("MicroMsg.FingerPrintEntranceUI", "will showOpenFingerPrintPayGuide()");
        com.tencent.mm.ui.base.h.a(this, getResources().getString(a.i.sYD), "", getResources().getString(a.i.sSi), getString(a.i.cSk), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(10761980084224L, 80183);
            w.i("MicroMsg.FingerPrintEntranceUI", "user click the button to open fingerprint pay");
            d.x(FingerPrintEntranceUI.this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
            FingerPrintEntranceUI.this.finish();
            GMTrace.o(10761980084224L, 80183);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(10767080357888L, 80221);
            FingerPrintEntranceUI.this.finish();
            GMTrace.o(10767080357888L, 80221);
          }
        });
        e.azO();
        i = j;
      }
      else
      {
        i = 0;
      }
    }
  }
  
  public void onResume()
  {
    GMTrace.i(10768019881984L, 80228);
    super.onResume();
    GMTrace.o(10768019881984L, 80228);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\ui\FingerPrintEntranceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */