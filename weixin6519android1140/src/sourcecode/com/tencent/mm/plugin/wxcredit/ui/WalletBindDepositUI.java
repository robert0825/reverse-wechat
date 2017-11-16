package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.c.l;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class WalletBindDepositUI
  extends WalletBaseUI
{
  private Button qXb;
  private ElementQuery rdw;
  private WalletFormView rkw;
  private WalletFormView rlo;
  private WalletFormView skS;
  private boolean skT;
  
  public WalletBindDepositUI()
  {
    GMTrace.i(9000909275136L, 67062);
    this.skT = true;
    this.rdw = new ElementQuery();
    GMTrace.o(9000909275136L, 67062);
  }
  
  private void ar()
  {
    GMTrace.i(9001446146048L, 67066);
    if (bg.nm(this.rdw.mhU))
    {
      this.rlo.setText("");
      GMTrace.o(9001446146048L, 67066);
      return;
    }
    if (2 == this.rdw.rfU)
    {
      this.rlo.setText(this.rdw.mhU + " " + getString(a.i.tbg));
      GMTrace.o(9001446146048L, 67066);
      return;
    }
    this.rlo.setText(this.rdw.mhU + " " + getString(a.i.tbv));
    GMTrace.o(9001446146048L, 67066);
  }
  
  public final void MP()
  {
    GMTrace.i(9001311928320L, 67065);
    oM(a.i.sZX);
    this.rkw = ((WalletFormView)findViewById(a.f.sIT));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rkw);
    this.rlo = ((WalletFormView)findViewById(a.f.sJi));
    this.skS = ((WalletFormView)findViewById(a.f.sCx));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.skS);
    this.qXb = ((Button)findViewById(a.f.bQR));
    e(this.rkw, 0, false);
    e(this.skS, 0, false);
    this.rlo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9016746967040L, 67180);
        paramAnonymousView = WalletBindDepositUI.a(WalletBindDepositUI.this).getText();
        if (bg.nm(paramAnonymousView))
        {
          GMTrace.o(9016746967040L, 67180);
          return;
        }
        if (WalletBindDepositUI.b(WalletBindDepositUI.this))
        {
          WalletBindDepositUI.this.cmq().q(new Object[] { paramAnonymousView });
          WalletBindDepositUI.c(WalletBindDepositUI.this);
          GMTrace.o(9016746967040L, 67180);
          return;
        }
        paramAnonymousView = new Bundle();
        paramAnonymousView.putInt("key_support_bankcard", 1);
        paramAnonymousView.putString("key_bank_type", WalletBindDepositUI.d(WalletBindDepositUI.this).nDt);
        paramAnonymousView.putInt("key_bankcard_type", 1);
        com.tencent.mm.wallet_core.a.ad(WalletBindDepositUI.this).a(WalletBindDepositUI.this, WalletCardSelectUI.class, paramAnonymousView, 1);
        GMTrace.o(9016746967040L, 67180);
      }
    });
    this.qXb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9000506621952L, 67059);
        if (WalletBindDepositUI.e(WalletBindDepositUI.this)) {
          WalletBindDepositUI.this.cmq().j(new Object[] { WalletBindDepositUI.a(WalletBindDepositUI.this).getText(), WalletBindDepositUI.d(WalletBindDepositUI.this).nDt, WalletBindDepositUI.f(WalletBindDepositUI.this).getText(), WalletBindDepositUI.d(WalletBindDepositUI.this).rfX, Boolean.valueOf(false) });
        }
        GMTrace.o(9000506621952L, 67059);
      }
    });
    GMTrace.o(9001311928320L, 67065);
  }
  
  protected final int Qf()
  {
    GMTrace.i(9001848799232L, 67069);
    GMTrace.o(9001848799232L, 67069);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    boolean bool = false;
    GMTrace.i(9001714581504L, 67068);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof l)))
    {
      paramString = (l)paramk;
      if (paramString.rcv != null)
      {
        if (!paramString.rcv.bym())
        {
          h.h(this, a.i.sZW, a.i.cUG);
          GMTrace.o(9001714581504L, 67068);
          return true;
        }
        this.rdw = paramString.rcv;
        ar();
        if ((this.rdw.rfS) && (this.rdw.isError()))
        {
          h.h(this, a.i.sZK, a.i.cUG);
          GMTrace.o(9001714581504L, 67068);
          return true;
        }
        paramString = com.tencent.mm.wallet_core.a.ad(this);
        if (paramString != null)
        {
          paramInt1 = this.rdw.rcw;
          if (paramString == null)
          {
            if (bool) {
              break label261;
            }
            if (!paramString.clA()) {
              break label238;
            }
            w.w("MicroMsg.WalletBindDepositUI", "Overseas user try to bind domestic card!");
            h.h(this, a.i.sZa, a.i.cUG);
          }
          for (;;)
          {
            this.rkw.baC();
            GMTrace.o(9001714581504L, 67068);
            return true;
            if (!paramString.ler.containsKey("key_support_bankcard"))
            {
              bool = true;
              break;
            }
            paramInt2 = paramString.clz();
            if (paramInt2 == 0)
            {
              bool = true;
              break;
            }
            bool = Bankcard.dw(paramInt2, paramInt1);
            break;
            label238:
            w.w("MicroMsg.WalletBindDepositUI", "Domestic user try to bind international card!");
            h.h(this, a.i.sYZ, a.i.cUG);
          }
        }
        label261:
        ar();
        GMTrace.o(9001714581504L, 67068);
        return true;
      }
    }
    GMTrace.o(9001714581504L, 67068);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9001177710592L, 67064);
    int i = a.g.sOI;
    GMTrace.o(9001177710592L, 67064);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9001580363776L, 67067);
    w.i("MicroMsg.WalletBindDepositUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(9001580363776L, 67067);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(9001580363776L, 67067);
      return;
      paramIntent = (ElementQuery)paramIntent.getParcelableExtra("elemt_query");
      if (paramIntent.bym())
      {
        this.rdw = paramIntent;
        ar();
        GMTrace.o(9001580363776L, 67067);
        return;
      }
      h.h(this, a.i.sZW, a.i.cUG);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9001043492864L, 67063);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(9001043492864L, 67063);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletBindDepositUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */