package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoUI
  extends WalletBaseUI
{
  private String nAz;
  private Orders qYC;
  protected ak.b.a rnO;
  
  public WalletOrderInfoUI()
  {
    GMTrace.i(6920534491136L, 51562);
    this.rnO = new ak.b.a()
    {
      public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6926842724352L, 51609);
        com.tencent.mm.kernel.h.xz();
        x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramAnonymousString);
        w.d("MicroMsg.WalletOrderInfoUI", "call back from contactServer " + paramAnonymousString + " succ: " + paramAnonymousBoolean);
        WalletOrderInfoUI.this.K(localx);
        GMTrace.o(6926842724352L, 51609);
      }
    };
    GMTrace.o(6920534491136L, 51562);
  }
  
  protected static String d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(6921876668416L, 51572);
    for (;;)
    {
      try
      {
        paramString5 = URLEncoder.encode(URLEncoder.encode(paramString5, "utf-8"), "utf-8");
        if ((paramString1.indexOf("%7Breqkey%7D") <= 0) && (paramString1.indexOf("%7Btransid%7D") <= 0) && (paramString1.indexOf("%7Bphone%7D") <= 0) && (paramString1.indexOf("%7Bremark%7D") <= 0)) {
          continue;
        }
        w.i("MicroMsg.WalletOrderInfoUI", "concat url 1: ");
        paramString2 = paramString1.replace("%7Breqkey%7D", paramString2).replace("%7Btransid%7D", paramString3).replace("%7Bphone%7D", paramString4).replace("%7Bremark%7D", paramString5);
        paramString1 = paramString2;
      }
      catch (Exception paramString2)
      {
        w.printErrStackTrace("MicroMsg.WalletOrderInfoUI", paramString2, "", new Object[0]);
        continue;
      }
      GMTrace.o(6921876668416L, 51572);
      return paramString1;
      if ((paramString1.indexOf("{reqkey}") > 0) || (paramString1.indexOf("{transid}") > 0) || (paramString1.indexOf("{phone}") > 0) || (paramString1.indexOf("{remark}") > 0))
      {
        w.i("MicroMsg.WalletOrderInfoUI", "concat url 2: ");
        paramString2 = paramString1.replace("{reqkey}", paramString2).replace("{transid}", paramString3).replace("{phone}", paramString4).replace("{remark}", paramString5);
        paramString1 = paramString2;
      }
      else
      {
        w.i("MicroMsg.WalletOrderInfoUI", "concat url 3: ");
        paramString2 = paramString1 + String.format("?reqkey=%s&transid=%s&phone=%s&remark=%s", new Object[] { paramString2, paramString3, paramString4, paramString5 });
        paramString1 = paramString2;
      }
    }
  }
  
  private void d(Orders paramOrders)
  {
    GMTrace.i(6921608232960L, 51570);
    w.k("MicroMsg.WalletOrderInfoUI", "goToOrderInfoUI, is_use_new_paid_succ_page: %d", new Object[] { Integer.valueOf(paramOrders.rhF) });
    if (paramOrders.rhF == 1) {
      cmp().c(this, WalletOrderInfoNewUI.class, this.ui);
    }
    for (;;)
    {
      finish();
      GMTrace.o(6921608232960L, 51570);
      return;
      cmp().c(this, WalletOrderInfoOldUI.class, this.ui);
    }
  }
  
  protected void K(x paramx)
  {
    GMTrace.i(6921742450688L, 51571);
    if ((paramx != null) && ((int)paramx.fTq != 0))
    {
      String str = paramx.vj();
      w.d("MicroMsg.WalletOrderInfoUI", "call back from contactServer nickName " + str + " username: " + paramx.field_username);
      if ((this.qYC.rhv != null) && (this.qYC.rhv.size() > 0))
      {
        paramx = this.qYC.rhv.iterator();
        while (paramx.hasNext()) {
          ((Orders.Commodity)paramx.next()).nEs = str;
        }
      }
    }
    GMTrace.o(6921742450688L, 51571);
  }
  
  public void KA(String paramString)
  {
    GMTrace.i(6921339797504L, 51568);
    l(new com.tencent.mm.plugin.wallet_core.c.p(paramString));
    GMTrace.o(6921339797504L, 51568);
  }
  
  protected boolean bbM()
  {
    GMTrace.i(6920937144320L, 51565);
    GMTrace.o(6920937144320L, 51565);
    return true;
  }
  
  protected Orders bzF()
  {
    GMTrace.i(6921071362048L, 51566);
    Orders localOrders = (Orders)this.ui.getParcelable("key_orders");
    GMTrace.o(6921071362048L, 51566);
    return localOrders;
  }
  
  protected void cd(String paramString, int paramInt)
  {
    GMTrace.i(6921474015232L, 51569);
    l(new com.tencent.mm.plugin.wallet_core.c.p(paramString, paramInt));
    GMTrace.o(6921474015232L, 51569);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6922010886144L, 51573);
    if (((paramk instanceof com.tencent.mm.plugin.wallet_core.c.p)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      this.qYC = ((com.tencent.mm.plugin.wallet_core.c.p)paramk).rcB;
      if (this.qYC != null) {
        if ((this.qYC.rhv != null) && (this.qYC.rhv.size() != 0))
        {
          paramString = (Orders.Commodity)this.qYC.rhv.get(0);
          this.nAz = paramString.eRP;
          w.d("MicroMsg.WalletOrderInfoUI", "Coomdity:" + paramString.toString());
          com.tencent.mm.kernel.h.xz();
          paramk = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString.nEs);
          if ((paramk != null) && ((int)paramk.fTq != 0)) {
            K(paramk);
          }
        }
        else
        {
          d(this.qYC);
        }
      }
      for (;;)
      {
        GMTrace.o(6922010886144L, 51573);
        return true;
        ak.a.gmX.a(paramString.nEs, "", this.rnO);
        break;
        w.e("MicroMsg.WalletOrderInfoUI", "cannot get orders");
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6924695240704L, 51593);
            WalletOrderInfoUI.this.finish();
            GMTrace.o(6924695240704L, 51593);
          }
        });
      }
    }
    GMTrace.o(6922010886144L, 51573);
    return false;
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(6921205579776L, 51567);
    int i = a.g.sOG;
    GMTrace.o(6921205579776L, 51567);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6920668708864L, 51563);
    super.onCreate(paramBundle);
    if (bbM())
    {
      this.qYC = bzF();
      this.nAz = this.ui.getString("key_trans_id");
      int i = this.ui.getInt("key_pay_type", -1);
      w.i("MicroMsg.WalletOrderInfoUI", "mTransId %s", new Object[] { this.nAz });
      if (this.nAz != null)
      {
        if (i == -1)
        {
          KA(this.nAz);
          GMTrace.o(6920668708864L, 51563);
          return;
        }
        cd(this.nAz, i);
        GMTrace.o(6920668708864L, 51563);
        return;
      }
      if (this.qYC != null) {
        d(this.qYC);
      }
    }
    GMTrace.o(6920668708864L, 51563);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6920802926592L, 51564);
    super.onDestroy();
    if ((this.qYC != null) && (!bg.nm(this.qYC.username))) {
      ak.a.gmX.gJ(this.qYC.username);
    }
    GMTrace.o(6920802926592L, 51564);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletOrderInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */