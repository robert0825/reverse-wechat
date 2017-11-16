package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class WalletWXCreditErrDetailUI
  extends WalletBaseUI
{
  private Bankcard qUE;
  private String slA;
  private TextView slB;
  private TextView slC;
  
  public WalletWXCreditErrDetailUI()
  {
    GMTrace.i(8998090702848L, 67041);
    GMTrace.o(8998090702848L, 67041);
  }
  
  protected final void MP()
  {
    GMTrace.i(8998493356032L, 67044);
    this.qUE = ((Bankcard)this.ui.getParcelable("key_bankcard"));
    this.slA = this.ui.getString("key_repayment_url");
    if (this.qUE == null)
    {
      GMTrace.o(8998493356032L, 67044);
      return;
    }
    this.slB = ((TextView)findViewById(a.f.sIH));
    this.slB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9015673225216L, 67172);
        e.m(WalletWXCreditErrDetailUI.this, WalletWXCreditErrDetailUI.a(WalletWXCreditErrDetailUI.this), false);
        GMTrace.o(9015673225216L, 67172);
      }
    });
    this.slC = ((TextView)findViewById(a.f.sII));
    this.slC.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9004667371520L, 67090);
        a.i(WalletWXCreditErrDetailUI.this, WalletWXCreditErrDetailUI.this.ui);
        GMTrace.o(9004667371520L, 67090);
      }
    });
    boolean bool = this.ui.getBoolean("key_can_unbind", true);
    TextView localTextView = this.slC;
    if (bool) {}
    for (int i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      GMTrace.o(8998493356032L, 67044);
      return;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8998627573760L, 67045);
    GMTrace.o(8998627573760L, 67045);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8998224920576L, 67042);
    int i = a.g.sQu;
    GMTrace.o(8998224920576L, 67042);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8998359138304L, 67043);
    super.onCreate(paramBundle);
    oM(a.i.sZP);
    MP();
    GMTrace.o(8998359138304L, 67043);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletWXCreditErrDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */