package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class WalletWXCreditOpenUI
  extends WalletBaseUI
{
  private Button kES;
  private Bankcard qXk;
  
  public WalletWXCreditOpenUI()
  {
    GMTrace.i(9012988870656L, 67152);
    GMTrace.o(9012988870656L, 67152);
  }
  
  protected final void MP()
  {
    GMTrace.i(9013525741568L, 67156);
    oM(a.i.thN);
    ((CheckBox)findViewById(a.f.spJ)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(9014867918848L, 67166);
        WalletWXCreditOpenUI.a(WalletWXCreditOpenUI.this).setEnabled(paramAnonymousBoolean);
        GMTrace.o(9014867918848L, 67166);
      }
    });
    findViewById(a.f.bdr).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9017015402496L, 67182);
        e.a(WalletWXCreditOpenUI.this, WalletWXCreditOpenUI.b(WalletWXCreditOpenUI.this).field_bankcardType, WalletWXCreditOpenUI.b(WalletWXCreditOpenUI.this).field_bankName, true, false);
        GMTrace.o(9017015402496L, 67182);
      }
    });
    this.kES = ((Button)findViewById(a.f.bQR));
    this.kES.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9002922541056L, 67077);
        WalletWXCreditOpenUI.this.bwP();
        GMTrace.o(9002922541056L, 67077);
      }
    });
    GMTrace.o(9013525741568L, 67156);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9013123088384L, 67153);
    GMTrace.o(9013123088384L, 67153);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9013257306112L, 67154);
    int i = a.g.sQx;
    GMTrace.o(9013257306112L, 67154);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9013391523840L, 67155);
    super.onCreate(paramBundle);
    this.qXk = ((Bankcard)this.ui.getParcelable("key_bankcard"));
    MP();
    GMTrace.o(9013391523840L, 67155);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletWXCreditOpenUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */