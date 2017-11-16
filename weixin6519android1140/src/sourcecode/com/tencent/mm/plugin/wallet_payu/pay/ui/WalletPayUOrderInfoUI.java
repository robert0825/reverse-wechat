package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.a;
import com.tencent.mm.plugin.wallet_payu.pay.a.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WalletPayUOrderInfoUI
  extends WalletOrderInfoOldUI
{
  public WalletPayUOrderInfoUI()
  {
    GMTrace.i(7981122977792L, 59464);
    GMTrace.o(7981122977792L, 59464);
  }
  
  protected final void KA(String paramString)
  {
    GMTrace.i(7981525630976L, 59467);
    l(new c(paramString, 1));
    GMTrace.o(7981525630976L, 59467);
  }
  
  protected final void bzG()
  {
    GMTrace.i(7981391413248L, 59466);
    l(new com.tencent.mm.plugin.wallet_core.c.b.a());
    GMTrace.o(7981391413248L, 59466);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7981794066432L, 59469);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_payu.pay.a.a))
    {
      GMTrace.o(7981794066432L, 59469);
      return true;
    }
    Object localObject;
    if ((paramk instanceof c))
    {
      localObject = (c)paramk;
      if ((((c)localObject).opK.rhv != null) && (((c)localObject).opK.rhv.size() > 0)) {
        break label116;
      }
      w.w("MicroMsg.WalletPayUOrderInfoUI", "hy: no commodity. show alert");
      com.tencent.mm.ui.base.h.a(this, a.i.teQ, a.i.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7977230663680L, 59435);
          com.tencent.mm.wallet_core.a.c(WalletPayUOrderInfoUI.this, WalletPayUOrderInfoUI.this.ui, 0);
          GMTrace.o(7977230663680L, 59435);
        }
      });
    }
    label116:
    do
    {
      boolean bool = super.d(paramInt1, paramInt2, paramString, paramk);
      GMTrace.o(7981794066432L, 59469);
      return bool;
      localObject = (Orders.Commodity)((c)localObject).opK.rhv.get(0);
      w.d("MicroMsg.WalletPayUOrderInfoUI", "Coomdity:" + localObject);
      com.tencent.mm.plugin.wallet_payu.a.d.bAm().ruf = null;
    } while (localObject == null);
    this.rna = new ArrayList();
    this.rna.add(localObject);
    com.tencent.mm.kernel.h.xz();
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(((Orders.Commodity)localObject).nEs);
    if ((localx != null) && ((int)localx.fTq != 0)) {
      K(localx);
    }
    for (;;)
    {
      this.rnH.notifyDataSetChanged();
      bzH();
      break;
      ak.a.gmX.a(((Orders.Commodity)localObject).nEs, "", this.rnO);
    }
  }
  
  public final void done()
  {
    GMTrace.i(7981928284160L, 59470);
    bzy();
    Object localObject1 = new Bundle();
    ((Bundle)localObject1).putInt("intent_pay_end_errcode", this.ui.getInt("intent_pay_end_errcode"));
    ((Bundle)localObject1).putString("intent_pay_app_url", this.ui.getString("intent_pay_app_url"));
    ((Bundle)localObject1).putBoolean("intent_pay_end", this.ui.getBoolean("intent_pay_end"));
    w.i("MicroMsg.WalletPayUOrderInfoUI", "pay done...feedbackData errCode:" + this.ui.getInt("intent_pay_end_errcode"));
    Object localObject2 = this.rmZ.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      if (!bg.nm(str))
      {
        w.d("MicroMsg.WalletPayUOrderInfoUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str });
        b(new i(str), false);
      }
    }
    com.tencent.mm.wallet_core.a.i(this, (Bundle)localObject1);
    if ((this.qYC != null) && (!bg.nm(this.qYC.kBQ))) {
      if (this.qYC.rhv.size() <= 0) {
        break label336;
      }
    }
    label336:
    for (localObject1 = ((Orders.Commodity)this.qYC.rhv.get(0)).eRP;; localObject1 = "")
    {
      localObject1 = String.format("%sreqkey=%s&transid=%s", new Object[] { this.qYC.kBQ, this.qYC.eHG, localObject1 });
      w.d("MicroMsg.WalletPayUOrderInfoUI", "url = " + (String)localObject1);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("showShare", false);
      ((Intent)localObject2).putExtra("geta8key_username", q.zE());
      com.tencent.mm.bj.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject2);
      GMTrace.o(7981928284160L, 59470);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7981257195520L, 59465);
    super.onCreate(paramBundle);
    hN(1554);
    GMTrace.o(7981257195520L, 59465);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7981659848704L, 59468);
    hO(1554);
    super.onDestroy();
    GMTrace.o(7981659848704L, 59468);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\ui\WalletPayUOrderInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */