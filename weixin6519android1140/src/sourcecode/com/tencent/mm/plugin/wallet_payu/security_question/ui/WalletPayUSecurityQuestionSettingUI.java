package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion;
import com.tencent.mm.plugin.wallet_payu.security_question.model.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.tools.m;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUSecurityQuestionSettingUI
  extends WalletBaseUI
{
  private Button kES;
  private String rvA;
  private a rvB;
  private WalletPayUSecurityQuestionView rvu;
  private WalletFormView rvv;
  private m rvz;
  
  public WalletPayUSecurityQuestionSettingUI()
  {
    GMTrace.i(7926496362496L, 59057);
    this.rvA = "";
    GMTrace.o(7926496362496L, 59057);
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(7927167451136L, 59062);
    GMTrace.o(7927167451136L, 59062);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7926899015680L, 59060);
    if (((paramk instanceof d)) && (this.rvz.isShowing())) {
      this.rvz.dismiss();
    }
    GMTrace.o(7926899015680L, 59060);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7927033233408L, 59061);
    int i = a.g.sNN;
    GMTrace.o(7927033233408L, 59061);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7926630580224L, 59058);
    super.onCreate(paramBundle);
    this.rvz = new m(this);
    this.rvz.mE(true);
    this.rvz.qik = new p.c()
    {
      public final void a(n paramAnonymousn)
      {
        GMTrace.i(7931596636160L, 59095);
        paramAnonymousn.clear();
        ArrayList localArrayList = WalletPayUSecurityQuestionSettingUI.a(WalletPayUSecurityQuestionSettingUI.this);
        if (localArrayList != null)
        {
          int i = 0;
          while (i < localArrayList.size())
          {
            paramAnonymousn.add(((PayUSecurityQuestion)localArrayList.get(i)).desc);
            i += 1;
          }
        }
        GMTrace.o(7931596636160L, 59095);
      }
    };
    this.rvz.qil = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(7931059765248L, 59091);
        WalletPayUSecurityQuestionSettingUI.b(WalletPayUSecurityQuestionSettingUI.this).KM(((PayUSecurityQuestion)WalletPayUSecurityQuestionSettingUI.a(WalletPayUSecurityQuestionSettingUI.this).get(paramAnonymousInt)).desc);
        WalletPayUSecurityQuestionSettingUI.a(WalletPayUSecurityQuestionSettingUI.this, ((PayUSecurityQuestion)WalletPayUSecurityQuestionSettingUI.a(WalletPayUSecurityQuestionSettingUI.this).get(paramAnonymousInt)).id);
        WalletPayUSecurityQuestionSettingUI.c(WalletPayUSecurityQuestionSettingUI.this).baC();
        WalletPayUSecurityQuestionSettingUI.d(WalletPayUSecurityQuestionSettingUI.this).bAk();
        GMTrace.o(7931059765248L, 59091);
      }
    };
    this.rvB = new a();
    this.rvu = ((WalletPayUSecurityQuestionView)findViewById(a.f.sEl));
    this.rvv = ((WalletFormView)findViewById(a.f.sEk));
    com.tencent.mm.wallet_core.ui.formview.a.f(this.rvv);
    this.kES = ((Button)findViewById(a.f.sEj));
    this.rvu.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7931865071616L, 59097);
        WalletPayUSecurityQuestionSettingUI.e(WalletPayUSecurityQuestionSettingUI.this).dK();
        GMTrace.o(7931865071616L, 59097);
      }
    });
    this.rvv.xFu = new WalletFormView.a()
    {
      public final void gR(boolean paramAnonymousBoolean)
      {
        GMTrace.i(7931328200704L, 59093);
        WalletPayUSecurityQuestionSettingUI.d(WalletPayUSecurityQuestionSettingUI.this).bAk();
        GMTrace.o(7931328200704L, 59093);
      }
    };
    this.kES.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7932133507072L, 59099);
        if (WalletPayUSecurityQuestionSettingUI.d(WalletPayUSecurityQuestionSettingUI.this).bAp())
        {
          WalletPayUSecurityQuestionSettingUI.this.ui.putString("key_question_id", WalletPayUSecurityQuestionSettingUI.f(WalletPayUSecurityQuestionSettingUI.this));
          WalletPayUSecurityQuestionSettingUI.this.ui.putString("key_question_answer", WalletPayUSecurityQuestionSettingUI.c(WalletPayUSecurityQuestionSettingUI.this).getText());
          com.tencent.mm.wallet_core.a.i(WalletPayUSecurityQuestionSettingUI.this, WalletPayUSecurityQuestionSettingUI.this.ui);
          GMTrace.o(7932133507072L, 59099);
          return;
        }
        WalletPayUSecurityQuestionSettingUI.d(WalletPayUSecurityQuestionSettingUI.this).bAk();
        GMTrace.o(7932133507072L, 59099);
      }
    });
    this.rvB.bAk();
    GMTrace.o(7926630580224L, 59058);
  }
  
  public void onResume()
  {
    GMTrace.i(7926764797952L, 59059);
    super.onResume();
    GMTrace.o(7926764797952L, 59059);
  }
  
  protected final class a
  {
    protected a()
    {
      GMTrace.i(7930522894336L, 59087);
      GMTrace.o(7930522894336L, 59087);
    }
    
    public final void bAk()
    {
      GMTrace.i(16040763326464L, 119513);
      if (bAp())
      {
        WalletPayUSecurityQuestionSettingUI.g(WalletPayUSecurityQuestionSettingUI.this).setEnabled(true);
        GMTrace.o(16040763326464L, 119513);
        return;
      }
      WalletPayUSecurityQuestionSettingUI.g(WalletPayUSecurityQuestionSettingUI.this).setEnabled(false);
      GMTrace.o(16040763326464L, 119513);
    }
    
    protected final boolean bAp()
    {
      GMTrace.i(7930657112064L, 59088);
      if (!bg.nm(WalletPayUSecurityQuestionSettingUI.b(WalletPayUSecurityQuestionSettingUI.this).rvF)) {}
      for (int i = 1; (i != 0) && (WalletPayUSecurityQuestionSettingUI.c(WalletPayUSecurityQuestionSettingUI.this).QW()); i = 0)
      {
        GMTrace.o(7930657112064L, 59088);
        return true;
      }
      GMTrace.o(7930657112064L, 59088);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\security_question\ui\WalletPayUSecurityQuestionSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */