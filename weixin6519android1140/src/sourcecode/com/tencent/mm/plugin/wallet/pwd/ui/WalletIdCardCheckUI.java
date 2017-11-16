package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.wallet_core.ui.formview.a.a;

@com.tencent.mm.ui.base.a(3)
public class WalletIdCardCheckUI
  extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private WalletFormView rbc;
  private TextView rbd;
  private TextView rbe;
  private Button rbf;
  private int rbg;
  
  public WalletIdCardCheckUI()
  {
    GMTrace.i(7763421822976L, 57842);
    this.rbg = 1;
    GMTrace.o(7763421822976L, 57842);
  }
  
  protected final void MP()
  {
    GMTrace.i(7764361347072L, 57849);
    this.rbc = ((WalletFormView)findViewById(a.f.svX));
    this.rbe = ((TextView)findViewById(a.f.sJd));
    this.rbd = ((TextView)findViewById(a.f.sJe));
    this.rbc.xFu = this;
    this.rbc.setOnEditorActionListener(this);
    this.rbe.setVisibility(4);
    this.rbf = ((Button)findViewById(a.f.swi));
    com.tencent.mm.wallet_core.ui.formview.a.c(this.rbc);
    e(this.rbc, 1, false);
    this.rbf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7757516242944L, 57798);
        if (WalletIdCardCheckUI.a(WalletIdCardCheckUI.this))
        {
          g.ork.i(13731, new Object[] { Integer.valueOf(2) });
          paramAnonymousView = new com.tencent.mm.wallet_core.c.f(WalletIdCardCheckUI.b(WalletIdCardCheckUI.this).getText(), WalletIdCardCheckUI.c(WalletIdCardCheckUI.this), n.byx().apc());
          WalletIdCardCheckUI.this.l(paramAnonymousView);
        }
        GMTrace.o(7757516242944L, 57798);
      }
    });
    this.rbg = n.byx().byY();
    Object localObject1 = n.byx();
    if (((af)localObject1).rjs != null)
    {
      localObject1 = ((af)localObject1).rjs.field_cre_name;
      w.i("Micromsg.WalletIdCardCheckUI", "mIdentityType %d %s", new Object[] { Integer.valueOf(this.rbg), localObject1 });
      if (!bg.nm((String)localObject1)) {
        break label316;
      }
      localObject1 = n.byF().J(this, this.rbg);
    }
    label316:
    for (;;)
    {
      Object localObject2 = this.rbc;
      int i = this.rbg;
      localObject2 = ((WalletFormView)localObject2).xFw;
      if ((localObject2 instanceof a.a)) {
        ((a.a)localObject2).ER(i);
      }
      this.rbc.vl((String)localObject1);
      this.rbc.baC();
      if (this.rbg == 1) {
        e(this.rbc, 1, false);
      }
      for (;;)
      {
        localObject1 = n.byx().apc();
        this.rbc.setHint(getString(a.i.tdN, new Object[] { e.XA((String)localObject1) }));
        GMTrace.o(7764361347072L, 57849);
        return;
        localObject1 = "";
        break;
        e(this.rbc, 1, true);
      }
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(7764764000256L, 57852);
    GMTrace.o(7764764000256L, 57852);
    return 1;
  }
  
  protected final void aMc()
  {
    GMTrace.i(7763824476160L, 57845);
    w.d("Micromsg.WalletIdCardCheckUI", "check pwd ");
    this.xEL.aMc();
    GMTrace.o(7763824476160L, 57845);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7764495564800L, 57850);
    GMTrace.o(7764495564800L, 57850);
    return false;
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(7765032435712L, 57854);
    this.rbe.setVisibility(4);
    GMTrace.o(7765032435712L, 57854);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7763556040704L, 57843);
    int i = a.g.sPh;
    GMTrace.o(7763556040704L, 57843);
    return i;
  }
  
  public final boolean i(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7764898217984L, 57853);
    w.d("Micromsg.WalletIdCardCheckUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof com.tencent.mm.wallet_core.c.f))) {
      h.a(this, getString(a.i.tdO), "", getString(a.i.tbT), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7754563452928L, 57776);
          WalletIdCardCheckUI.this.setResult(-1);
          WalletIdCardCheckUI.this.finish();
          GMTrace.o(7754563452928L, 57776);
        }
      });
    }
    GMTrace.o(7764898217984L, 57853);
    return true;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7763690258432L, 57844);
    super.onCreate(paramBundle);
    oM(a.i.tdP);
    hN(1580);
    MP();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7762213863424L, 57833);
        w.i("Micromsg.WalletIdCardCheckUI", "onbackbtn click");
        WalletIdCardCheckUI.this.finish();
        GMTrace.o(7762213863424L, 57833);
        return false;
      }
    });
    GMTrace.o(7763690258432L, 57844);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7764227129344L, 57848);
    super.onDestroy();
    hO(1580);
    GMTrace.o(7764227129344L, 57848);
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7765166653440L, 57855);
    GMTrace.o(7765166653440L, 57855);
    return false;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7764629782528L, 57851);
    if ((this.mLL != null) && (this.mLL.isShown()))
    {
      this.mLL.setVisibility(8);
      GMTrace.o(7764629782528L, 57851);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(7764629782528L, 57851);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(7764092911616L, 57847);
    super.onPause();
    GMTrace.o(7764092911616L, 57847);
  }
  
  public void onResume()
  {
    GMTrace.i(7763958693888L, 57846);
    super.onResume();
    GMTrace.o(7763958693888L, 57846);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\ui\WalletIdCardCheckUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */