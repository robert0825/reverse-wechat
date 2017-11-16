package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUSecurityQuestionAnswerUI
  extends WalletBaseUI
{
  private Button kES;
  private WalletPayUSecurityQuestionView rvu;
  private WalletFormView rvv;
  private PayUSecurityQuestion rvw;
  private a rvx;
  
  public WalletPayUSecurityQuestionAnswerUI()
  {
    GMTrace.i(7929180717056L, 59077);
    GMTrace.o(7929180717056L, 59077);
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(7929717587968L, 59081);
    GMTrace.o(7929717587968L, 59081);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7929449152512L, 59079);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.rvw = ((PayUSecurityQuestion)this.ui.getParcelable("key_security_question"));
      w.d("MicroMsg.WalletPayUSecurityQuestionAnswerUI", "hy: updating view");
      if (this.rvw != null) {
        this.rvu.KM(this.rvw.desc);
      }
      this.rvv.baC();
    }
    GMTrace.o(7929449152512L, 59079);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7929583370240L, 59080);
    int i = a.g.sNM;
    GMTrace.o(7929583370240L, 59080);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7929314934784L, 59078);
    super.onCreate(paramBundle);
    this.rvx = new a();
    this.rvu = ((WalletPayUSecurityQuestionView)findViewById(a.f.sEl));
    this.rvv = ((WalletFormView)findViewById(a.f.sEk));
    com.tencent.mm.wallet_core.ui.formview.a.f(this.rvv);
    this.kES = ((Button)findViewById(a.f.sEj));
    this.rvv.xFu = new WalletFormView.a()
    {
      public final void gR(boolean paramAnonymousBoolean)
      {
        GMTrace.i(7928912281600L, 59075);
        WalletPayUSecurityQuestionAnswerUI.a locala = WalletPayUSecurityQuestionAnswerUI.a(WalletPayUSecurityQuestionAnswerUI.this);
        if (WalletPayUSecurityQuestionAnswerUI.b(locala.rvy).QW()) {}
        for (int i = 1; i != 0; i = 0)
        {
          WalletPayUSecurityQuestionAnswerUI.c(locala.rvy).setEnabled(true);
          GMTrace.o(7928912281600L, 59075);
          return;
        }
        WalletPayUSecurityQuestionAnswerUI.c(locala.rvy).setEnabled(false);
        GMTrace.o(7928912281600L, 59075);
      }
    };
    this.kES.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7930388676608L, 59086);
        if (WalletPayUSecurityQuestionAnswerUI.b(WalletPayUSecurityQuestionAnswerUI.this).QW())
        {
          WalletPayUSecurityQuestionAnswerUI.this.ui.putString("key_question_answer", WalletPayUSecurityQuestionAnswerUI.b(WalletPayUSecurityQuestionAnswerUI.this).getText());
          WalletPayUSecurityQuestionAnswerUI.this.cmq().j(new Object[0]);
        }
        GMTrace.o(7930388676608L, 59086);
      }
    });
    GMTrace.o(7929314934784L, 59078);
  }
  
  protected final class a
  {
    protected a()
    {
      GMTrace.i(7929046499328L, 59076);
      GMTrace.o(7929046499328L, 59076);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\security_question\ui\WalletPayUSecurityQuestionAnswerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */