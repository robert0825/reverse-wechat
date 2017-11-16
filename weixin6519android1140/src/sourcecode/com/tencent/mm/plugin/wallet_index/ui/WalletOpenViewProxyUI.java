package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.wallet_core.c.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public class WalletOpenViewProxyUI
  extends WalletBaseUI
{
  private Map<String, String> rsU;
  
  public WalletOpenViewProxyUI()
  {
    GMTrace.i(7570550947840L, 56405);
    this.rsU = new HashMap();
    GMTrace.o(7570550947840L, 56405);
  }
  
  private void KI(String paramString)
  {
    GMTrace.i(7571222036480L, 56410);
    if (!bg.nm(paramString))
    {
      paramString = (String)this.rsU.get("openview");
      if ("open_wcpay_biz_view".equals(paramString))
      {
        w.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open mall_index_ui");
        d.x(this.vKB.vKW, "mall", ".ui.MallIndexUI");
      }
    }
    for (;;)
    {
      setResult(-1);
      finish();
      GMTrace.o(7571222036480L, 56410);
      return;
      if ("open_wcpay_balance_view".equals(paramString))
      {
        w.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open wallet_balance_manager_ui");
        com.tencent.mm.pluginsdk.wallet.g.T(this.vKB.vKW, 0);
      }
      else if ("open_wcpay_order_detail_view".equals(paramString))
      {
        w.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open mall_order_transaction_info_ui");
        paramString = new Intent();
        paramString.putExtra("trans_id", (String)this.rsU.get("trans_id"));
        paramString.putExtra("scene", 1);
        if (this.rsU.containsKey("bill_id")) {
          paramString.putExtra("bill_id", (String)this.rsU.get("bill_id"));
        }
        d.b(this.vKB.vKW, "order", ".ui.MallOrderTransactionInfoUI", paramString);
      }
      else if ("open_wcpay_f2f_receive_detail".equals(paramString))
      {
        w.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open open_wcpay_f2f_receive_detail");
        paramString = new Intent();
        paramString.putExtra("key_timestamp", bg.getLong((String)this.rsU.get("fromtimestamp"), 0L));
        paramString.putExtra("key_from_scene", 1);
        d.b(this.vKB.vKW, "collect", ".ui.CollectBillUI", paramString);
        com.tencent.mm.plugin.report.service.g.ork.i(13944, new Object[] { Integer.valueOf(2) });
      }
      else if ("open_wcpay_grouppay_detail".equals(paramString))
      {
        w.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open open_wcpay_grouppay_detail");
        paramString = new Intent();
        paramString.putExtra("bill_no", (String)this.rsU.get("billno"));
        paramString.putExtra("chatroom", (String)this.rsU.get("groupid"));
        paramString.putExtra("key_sign", (String)this.rsU.get("sign"));
        paramString.putExtra("key_ver", (String)this.rsU.get("ver"));
        paramString.putExtra("enter_scene", 5);
        d.b(this.vKB.vKW, "aa", ".ui.PaylistAAUI", paramString);
      }
      else if ("open_wcpay_t2bc_detail".equals(paramString))
      {
        w.d("MicroMsg.WalletOpenViewProxyUI", "do open_wcpay_t2bc_detail");
        paramString = new Intent();
        paramString.putExtra("key_transfer_bill_id", (String)this.rsU.get("transfer_bill_id"));
        paramString.putExtra("key_enter_scene", 1);
        d.b(this.vKB.vKW, "remittance", ".bankcard.ui.BankRemitDetailUI", paramString);
      }
      else
      {
        w.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] invalid target view : " + paramString);
        continue;
        w.w("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] packageExt null or nil");
      }
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7570819383296L, 56407);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        KI(getIntent().getStringExtra("packageExt"));
        GMTrace.o(7570819383296L, 56407);
        return true;
      }
      if ((paramk instanceof m))
      {
        KI(getIntent().getStringExtra("packageExt"));
        GMTrace.o(7570819383296L, 56407);
        return true;
      }
    }
    else
    {
      setResult(0);
      finish();
      GMTrace.o(7570819383296L, 56407);
      return true;
    }
    GMTrace.o(7570819383296L, 56407);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7571087818752L, 56409);
    GMTrace.o(7571087818752L, 56409);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7570685165568L, 56406);
    super.onCreate(paramBundle);
    sv(8);
    paramBundle = getIntent().getStringExtra("packageExt");
    this.rsU = new HashMap();
    if (!bg.nm(paramBundle))
    {
      paramBundle = paramBundle.split("&");
      if ((paramBundle != null) && (paramBundle.length > 0))
      {
        int i = 0;
        while (i < paramBundle.length)
        {
          if (!bg.nm(paramBundle[i]))
          {
            localObject = paramBundle[i].split("=");
            if ((localObject.length == 2) && (!bg.nm(localObject[0]))) {
              this.rsU.put(localObject[0], localObject[1]);
            }
          }
          i += 1;
        }
      }
    }
    hN(580);
    hN(385);
    if (getIntent() == null)
    {
      w.d("MicroMsg.WalletOpenViewProxyUI", "func[doCheckPayNetscene] intent null");
      setResult(0);
      finish();
      GMTrace.o(7570685165568L, 56406);
      return;
    }
    paramBundle = (String)this.rsU.get("openview");
    Object localObject = getIntent().getStringExtra("appId");
    String str1 = getIntent().getStringExtra("timeStamp");
    String str2 = getIntent().getStringExtra("nonceStr");
    String str3 = getIntent().getStringExtra("packageExt");
    String str4 = getIntent().getStringExtra("paySignature");
    if ("open_wcpay_f2f_receive_detail".equals(paramBundle))
    {
      r(new m((String)localObject, str1, str2, str3, str4));
      GMTrace.o(7570685165568L, 56406);
      return;
    }
    if ("open_wcpay_grouppay_detail".equals(paramBundle))
    {
      KI(str3);
      GMTrace.o(7570685165568L, 56406);
      return;
    }
    if ("open_wcpay_lqt_detail".equals(paramBundle))
    {
      d.x(this.vKB.vKW, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
      com.tencent.mm.plugin.report.service.g.ork.a(663L, 18L, 1L, false);
      setResult(-1);
      finish();
      GMTrace.o(7570685165568L, 56406);
      return;
    }
    r(new com.tencent.mm.plugin.wallet_core.c.a((String)localObject, str1, str2, str3, getIntent().getStringExtra("signtype"), str4, getIntent().getStringExtra("url"), 4));
    GMTrace.o(7570685165568L, 56406);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7570953601024L, 56408);
    super.onDestroy();
    hO(580);
    hO(385);
    GMTrace.o(7570953601024L, 56408);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\ui\WalletOpenViewProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */