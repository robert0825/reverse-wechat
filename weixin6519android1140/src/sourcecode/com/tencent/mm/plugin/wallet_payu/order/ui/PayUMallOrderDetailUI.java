package com.tencent.mm.plugin.wallet_payu.order.ui;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_payu.order.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.asz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class PayUMallOrderDetailUI
  extends WalletBaseUI
{
  private TextView mOF;
  private TextView mPc;
  private String nAz;
  private TextView okC;
  private asz rui;
  private LinearLayout ruj;
  private LinearLayout ruk;
  private LinearLayout rul;
  private LinearLayout rum;
  private LinearLayout run;
  private LinearLayout ruo;
  private LinearLayout rup;
  private TextView ruq;
  private TextView rur;
  private TextView rus;
  private TextView rut;
  
  public PayUMallOrderDetailUI()
  {
    GMTrace.i(7941797183488L, 59171);
    this.nAz = "";
    GMTrace.o(7941797183488L, 59171);
  }
  
  private void bAo()
  {
    GMTrace.i(7942065618944L, 59173);
    if (this.rui == null)
    {
      GMTrace.o(7942065618944L, 59173);
      return;
    }
    if (!bg.nm(this.rui.nFa))
    {
      this.ruj.setVisibility(0);
      this.ruq.setText(this.rui.nFa);
      label59:
      if (bg.nm(this.rui.nFk)) {
        break label315;
      }
      this.ruk.setVisibility(0);
      this.rur.setText(this.rui.nFk);
      label94:
      if (bg.nm(this.rui.nFc)) {
        break label327;
      }
      this.rul.setVisibility(0);
      this.rus.setText(this.rui.nFc);
      label129:
      if (bg.nm(this.rui.nFg)) {
        break label339;
      }
      this.rum.setVisibility(0);
      this.okC.setText(e.d(this.rui.uIS / 100.0D, this.rui.nFg));
      label179:
      if (this.rui.nFd < 0) {
        break label351;
      }
      this.run.setVisibility(0);
      this.mOF.setText(e.EO(this.rui.nFd));
      label214:
      if (bg.nm(this.rui.nFe)) {
        break label363;
      }
      this.ruo.setVisibility(0);
      this.mPc.setText(this.rui.nFe);
    }
    for (;;)
    {
      switch (this.rui.nFi)
      {
      case 4: 
      default: 
        this.rut.setText(a.i.teO);
        GMTrace.o(7942065618944L, 59173);
        return;
        this.ruj.setVisibility(8);
        break label59;
        label315:
        this.ruk.setVisibility(8);
        break label94;
        label327:
        this.rul.setVisibility(8);
        break label129;
        label339:
        this.rum.setVisibility(8);
        break label179;
        label351:
        this.run.setVisibility(8);
        break label214;
        label363:
        this.ruo.setVisibility(8);
      }
    }
    this.rut.setText(a.i.sZv);
    GMTrace.o(7942065618944L, 59173);
    return;
    this.rut.setText(a.i.tcd);
    GMTrace.o(7942065618944L, 59173);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7942199836672L, 59174);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof c))
      {
        this.rui = ((c)paramk).ruh;
        bAo();
      }
      GMTrace.o(7942199836672L, 59174);
      return true;
    }
    GMTrace.o(7942199836672L, 59174);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7942468272128L, 59176);
    int i = a.g.sNK;
    GMTrace.o(7942468272128L, 59176);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7941931401216L, 59172);
    super.onCreate(paramBundle);
    hN(1520);
    this.nAz = this.ui.getString("key_trans_id");
    if (bg.nm(this.nAz))
    {
      w.e("MicroMsg.PayUMallOrderDetailUI", "hy: trans id is null");
      finish();
    }
    l(new c(this.nAz));
    this.ruj = ((LinearLayout)findViewById(a.f.suO));
    this.ruk = ((LinearLayout)findViewById(a.f.suC));
    this.rul = ((LinearLayout)findViewById(a.f.suF));
    this.rum = ((LinearLayout)findViewById(a.f.suI));
    this.run = ((LinearLayout)findViewById(a.f.suM));
    this.ruo = ((LinearLayout)findViewById(a.f.suK));
    this.rup = ((LinearLayout)findViewById(a.f.suQ));
    this.ruq = ((TextView)findViewById(a.f.suP));
    this.rur = ((TextView)findViewById(a.f.suD));
    this.rus = ((TextView)findViewById(a.f.suG));
    this.okC = ((TextView)findViewById(a.f.suJ));
    this.mOF = ((TextView)findViewById(a.f.suN));
    this.mPc = ((TextView)findViewById(a.f.suL));
    this.rut = ((TextView)findViewById(a.f.suR));
    bAo();
    GMTrace.o(7941931401216L, 59172);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7942334054400L, 59175);
    super.onDestroy();
    hO(1520);
    GMTrace.o(7942334054400L, 59175);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\order\ui\PayUMallOrderDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */