package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.st;
import com.tencent.mm.g.a.su;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.c.t;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(19)
public class WalletPwdConfirmUI
  extends WalletBaseUI
{
  private com.tencent.mm.sdk.b.c fJv;
  public EditHintPasswdView qVS;
  private PayInfo qYU;
  private TextView rop;
  private boolean roq;
  private aj ror;
  
  public WalletPwdConfirmUI()
  {
    GMTrace.i(6954491576320L, 51815);
    this.roq = false;
    this.ror = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6977442807808L, 51986);
        if (WalletPwdConfirmUI.c(WalletPwdConfirmUI.this))
        {
          WalletPwdConfirmUI.d(WalletPwdConfirmUI.this);
          WalletPwdConfirmUI.e(WalletPwdConfirmUI.this);
        }
        GMTrace.o(6977442807808L, 51986);
        return false;
      }
    }, false);
    this.fJv = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6954491576320L, 51815);
  }
  
  private void bzJ()
  {
    GMTrace.i(6955162664960L, 51820);
    Bundle localBundle = this.ui;
    localBundle.putBoolean("intent_bind_end", true);
    com.tencent.mm.wallet_core.a.i(this, localBundle);
    GMTrace.o(6955162664960L, 51820);
  }
  
  protected final void MP()
  {
    GMTrace.i(6954760011776L, 51817);
    TextView localTextView = (TextView)findViewById(a.f.sKP);
    String str;
    if (q.zR())
    {
      str = getString(a.i.tdI);
      localTextView.setText(str);
      this.rop = ((TextView)findViewById(a.f.swe));
      if (bg.L(se(0))) {
        break label190;
      }
      this.rop.setText(a.i.tgz);
    }
    for (;;)
    {
      this.rop.setVisibility(0);
      this.rop.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6952612528128L, 51801);
          Object localObject = WalletPwdConfirmUI.this.ui.getString("key_new_pwd1");
          String str2 = WalletPwdConfirmUI.this.qVS.cmw();
          paramAnonymousView = WalletPwdConfirmUI.this.ui.getString("kreq_token");
          String str1 = WalletPwdConfirmUI.this.ui.getString("key_verify_code");
          w.d("Micromsg.WalletPwdConfirmUI", "mPayInfo " + WalletPwdConfirmUI.a(WalletPwdConfirmUI.this) + " vertifyCode: " + str1);
          if ((localObject != null) && (((String)localObject).equals(str2)))
          {
            localObject = new com.tencent.mm.plugin.wallet_core.model.o();
            ((com.tencent.mm.plugin.wallet_core.model.o)localObject).riF = WalletPwdConfirmUI.this.qVS.getText();
            ((com.tencent.mm.plugin.wallet_core.model.o)localObject).oek = WalletPwdConfirmUI.a(WalletPwdConfirmUI.this);
            ((com.tencent.mm.plugin.wallet_core.model.o)localObject).token = paramAnonymousView;
            ((com.tencent.mm.plugin.wallet_core.model.o)localObject).riG = str1;
            ((com.tencent.mm.plugin.wallet_core.model.o)localObject).riH = WalletPwdConfirmUI.this.ui.getBoolean("key_is_bind_bankcard", true);
            if (!com.tencent.mm.wallet_core.a.ad(WalletPwdConfirmUI.this).clA()) {}
            for (((com.tencent.mm.plugin.wallet_core.model.o)localObject).flag = "1";; ((com.tencent.mm.plugin.wallet_core.model.o)localObject).flag = "4")
            {
              paramAnonymousView = (FavorPayInfo)WalletPwdConfirmUI.this.ui.getParcelable("key_favor_pay_info");
              if (paramAnonymousView != null)
              {
                ((com.tencent.mm.plugin.wallet_core.model.o)localObject).reo = paramAnonymousView.rgr;
                ((com.tencent.mm.plugin.wallet_core.model.o)localObject).rep = paramAnonymousView.rgo;
              }
              WalletPwdConfirmUI.this.cmq().j(new Object[] { localObject });
              GMTrace.o(6952612528128L, 51801);
              return;
            }
          }
          com.tencent.mm.wallet_core.a.k(WalletPwdConfirmUI.this, 64534);
          GMTrace.o(6952612528128L, 51801);
        }
      });
      this.rop.setEnabled(false);
      this.rop.setClickable(false);
      this.qVS = ((EditHintPasswdView)findViewById(a.f.swd));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.qVS);
      this.qVS.xFp = new EditHintPasswdView.a()
      {
        public final void gR(boolean paramAnonymousBoolean)
        {
          GMTrace.i(6918521225216L, 51547);
          if (paramAnonymousBoolean)
          {
            String str1 = WalletPwdConfirmUI.this.ui.getString("key_new_pwd1");
            String str2 = WalletPwdConfirmUI.this.qVS.cmw();
            if ((str1 == null) || (!str1.equals(str2)))
            {
              com.tencent.mm.wallet_core.a.k(WalletPwdConfirmUI.this, 64534);
              GMTrace.o(6918521225216L, 51547);
              return;
            }
            WalletPwdConfirmUI.b(WalletPwdConfirmUI.this).setEnabled(paramAnonymousBoolean);
            WalletPwdConfirmUI.b(WalletPwdConfirmUI.this).setClickable(paramAnonymousBoolean);
            GMTrace.o(6918521225216L, 51547);
            return;
          }
          WalletPwdConfirmUI.b(WalletPwdConfirmUI.this).setEnabled(paramAnonymousBoolean);
          WalletPwdConfirmUI.b(WalletPwdConfirmUI.this).setClickable(paramAnonymousBoolean);
          GMTrace.o(6918521225216L, 51547);
        }
      };
      findViewById(a.f.sqV).setVisibility(8);
      e(this.qVS, 0, false);
      GMTrace.o(6954760011776L, 51817);
      return;
      str = getString(a.i.tdH);
      break;
      label190:
      this.rop.setText(a.i.cTh);
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(6955699535872L, 51824);
    GMTrace.o(6955699535872L, 51824);
    return 1;
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(6955565318144L, 51823);
    GMTrace.o(6955565318144L, 51823);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6955296882688L, 51821);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.ui.putString("key_pwd1", this.qVS.getText());
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.o)) {
        if (!this.roq) {
          bzJ();
        }
      }
      for (;;)
      {
        GMTrace.o(6955296882688L, 51821);
        return true;
        if ((com.tencent.mm.wallet_core.a.ad(this) != null) && (com.tencent.mm.wallet_core.a.ad(this).c(this, null)))
        {
          if (this.qYU != null) {}
          for (paramString = this.qYU.eHG;; paramString = "")
          {
            r(new com.tencent.mm.plugin.wallet_core.c.o(paramString));
            paramString = new su();
            if (com.tencent.mm.sdk.b.a.vgX.u(paramString.getClass()))
            {
              this.roq = true;
              com.tencent.mm.sdk.b.a.vgX.m(paramString);
            }
            this.ror.z(10000L, 10000L);
            break;
          }
        }
        com.tencent.mm.wallet_core.a.i(this, this.ui);
      }
    }
    GMTrace.o(6955296882688L, 51821);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6955431100416L, 51822);
    int i = a.g.sQj;
    GMTrace.o(6955431100416L, 51822);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6954625794048L, 51816);
    super.onCreate(paramBundle);
    sq(t.fJ(this));
    this.qYU = ((PayInfo)this.ui.getParcelable("key_pay_info"));
    MP();
    com.tencent.mm.plugin.wallet_core.e.c.b(this, this.ui, 6);
    GMTrace.o(6954625794048L, 51816);
  }
  
  public void onPause()
  {
    GMTrace.i(6955028447232L, 51819);
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.fJv);
    GMTrace.o(6955028447232L, 51819);
  }
  
  public void onResume()
  {
    GMTrace.i(6954894229504L, 51818);
    this.qVS.requestFocus();
    super.onResume();
    com.tencent.mm.sdk.b.a.vgX.b(this.fJv);
    GMTrace.o(6954894229504L, 51818);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletPwdConfirmUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */