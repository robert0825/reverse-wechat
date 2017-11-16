package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.balance.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletBalanceResultUI
  extends WalletBaseUI
{
  protected Button kES;
  protected TextView mOF;
  public TextView ojD;
  public Orders opK;
  public TextView qUB;
  protected TextView qUC;
  public CheckBox qUD;
  public Bankcard qUE;
  protected TextView qpx;
  
  public WalletBalanceResultUI()
  {
    GMTrace.i(7720069496832L, 57519);
    GMTrace.o(7720069496832L, 57519);
  }
  
  private void bwO()
  {
    GMTrace.i(7720606367744L, 57523);
    if ((this.qUD.getVisibility() == 0) && (this.qUD.isChecked()))
    {
      int i = this.ui.getInt("key_pay_flag", 0);
      String str1 = this.ui.getString("key_pwd1");
      String str2 = this.ui.getString("key_verify_code");
      PayInfo localPayInfo = (PayInfo)this.ui.getParcelable("key_pay_info");
      l(new com.tencent.mm.plugin.wallet.balance.a.a(i, str1, str2, localPayInfo.eHG, localPayInfo.ePL));
      GMTrace.o(7720606367744L, 57523);
      return;
    }
    bwP();
    GMTrace.o(7720606367744L, 57523);
  }
  
  public void MP()
  {
    GMTrace.i(7720472150016L, 57522);
    sq((String)cmq().se(0));
    this.qpx = ((TextView)findViewById(a.f.sIj));
    this.qpx.setText(cmq().se(1));
    this.qUC = ((TextView)findViewById(a.f.sIo));
    this.mOF = ((TextView)findViewById(a.f.sIn));
    Object localObject = cmq().se(2);
    if (!bg.L((CharSequence)localObject))
    {
      this.qUC.setVisibility(0);
      this.mOF.setVisibility(0);
      this.mOF.setText((CharSequence)localObject);
      localObject = (ImageView)findViewById(a.f.sIm);
      int i = this.ui.getInt("key_balance_result_logo", -1);
      if (i <= 0) {
        break label326;
      }
      ((ImageView)localObject).setImageResource(i);
      label151:
      this.ojD = ((TextView)findViewById(a.f.sIi));
      this.qUB = ((TextView)findViewById(a.f.sIp));
      localObject = (TextView)findViewById(a.f.sIq);
      if ((cmp() instanceof b)) {
        ((TextView)localObject).setText(getString(a.i.sZB));
      }
      this.qUD = ((CheckBox)findViewById(a.f.sqQ));
      this.qUE = ((Bankcard)this.ui.getParcelable("key_bankcard"));
      if (this.qUE == null) {
        break label336;
      }
      this.qUD.setVisibility(8);
    }
    for (;;)
    {
      this.kES = ((Button)findViewById(a.f.bQR));
      this.kES.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7723693375488L, 57546);
          WalletBalanceResultUI.a(WalletBalanceResultUI.this);
          GMTrace.o(7723693375488L, 57546);
        }
      });
      ld(false);
      le(false);
      GMTrace.o(7720472150016L, 57522);
      return;
      this.qUC.setVisibility(8);
      this.mOF.setVisibility(8);
      break;
      label326:
      ((ImageView)localObject).setImageResource(a.h.sQT);
      break label151;
      label336:
      this.qUD.setVisibility(0);
    }
  }
  
  public void ar()
  {
    GMTrace.i(7720740585472L, 57524);
    if (this.opK != null)
    {
      this.qUB.setText(e.d(this.opK.rhd, this.opK.nEr));
      Object localObject;
      if ((this.opK.rhv != null) && (this.opK.rhv.size() > 0))
      {
        localObject = (Orders.Commodity)this.opK.rhv.get(0);
        if (bg.nm(((Orders.Commodity)localObject).rhL)) {
          break label219;
        }
        this.ojD.setText(((Orders.Commodity)localObject).nEp + " " + getString(a.i.tev) + ((Orders.Commodity)localObject).rhL);
      }
      while ((cmp() instanceof b)) {
        if (this.opK.oml > 0.0D)
        {
          findViewById(a.f.sIl).setVisibility(0);
          localObject = (TextView)findViewById(a.f.sIk);
          ((TextView)localObject).setText(e.d(this.opK.oml, this.opK.nEr));
          ((TextView)localObject).setVisibility(0);
          GMTrace.o(7720740585472L, 57524);
          return;
          label219:
          this.ojD.setText(((Orders.Commodity)localObject).nEp);
        }
        else
        {
          w.i("MicroMsg.WalletBalanceResultUI", "fetch_fee is 0");
        }
      }
    }
    GMTrace.o(7720740585472L, 57524);
  }
  
  public final void bwP()
  {
    GMTrace.i(7720874803200L, 57525);
    if (!cmq().j(new Object[] { this.opK })) {
      super.bwP();
    }
    GMTrace.o(7720874803200L, 57525);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7721143238656L, 57527);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof com.tencent.mm.plugin.wallet.balance.a.a)))
    {
      p.bxd();
      p.bxe().rjz = bg.Pu();
      bwP();
      GMTrace.o(7721143238656L, 57527);
      return true;
    }
    GMTrace.o(7721143238656L, 57527);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7720203714560L, 57520);
    int i = a.g.sOM;
    GMTrace.o(7720203714560L, 57520);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(7721009020928L, 57526);
    GMTrace.o(7721009020928L, 57526);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7720337932288L, 57521);
    super.onCreate(paramBundle);
    this.opK = ((Orders)this.ui.getParcelable("key_orders"));
    MP();
    ar();
    GMTrace.o(7720337932288L, 57521);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\WalletBalanceResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */