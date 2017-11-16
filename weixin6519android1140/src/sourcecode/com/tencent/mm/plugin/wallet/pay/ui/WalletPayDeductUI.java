package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.wallet.pwd.a.c;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.ui.f.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.a;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import java.util.ArrayList;
import java.util.List;

public class WalletPayDeductUI
  extends MMPreference
  implements View.OnClickListener, com.tencent.mm.ad.e
{
  private Dialog hul;
  protected com.tencent.mm.ui.base.preference.f iAA;
  private String jzt;
  protected Button kES;
  protected Orders opK;
  protected MMSwitchBtn qZl;
  protected ArrayList<Preference> qZm;
  protected TextView qZn;
  private TextView qZo;
  private TextView qZp;
  private String qZq;
  private String qZr;
  private Bankcard qZs;
  private LinearLayout qZt;
  protected boolean qZu;
  private int qZv;
  private String qZw;
  
  public WalletPayDeductUI()
  {
    GMTrace.i(7797513125888L, 58096);
    this.hul = null;
    this.qZu = false;
    this.qZv = 0;
    GMTrace.o(7797513125888L, 58096);
  }
  
  private void bK(List<Orders.DeductShowInfo> paramList)
  {
    GMTrace.i(7798586867712L, 58104);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.e("MicroMsg.WalletPayDeductUI", "showinfos is null or length is 0");
      GMTrace.o(7798586867712L, 58104);
      return;
    }
    if (this.qZm == null)
    {
      int j = paramList.size();
      this.qZm = new ArrayList();
      int i = 0;
      while (i < j)
      {
        Object localObject = (Orders.DeductShowInfo)paramList.get(i);
        if ((localObject != null) && (!bg.nm(((Orders.DeductShowInfo)localObject).name)))
        {
          com.tencent.mm.plugin.wallet_core.ui.d locald = new com.tencent.mm.plugin.wallet_core.ui.d(this);
          locald.setTitle(((Orders.DeductShowInfo)localObject).name);
          locald.lNF = ((Orders.DeductShowInfo)localObject).value;
          locald.lNJ = false;
          int k = a.f.sJt;
          localObject = ((Orders.DeductShowInfo)localObject).url;
          if (locald.kgo != null) {
            locald.kgo.setTag(k, localObject);
          }
          locald.setKey("deduct_info_" + i);
          this.qZm.add(locald);
          this.iAA.a(locald);
          this.iAA.bc(locald.hiu, true);
        }
        i += 1;
      }
    }
    GMTrace.o(7798586867712L, 58104);
  }
  
  private void bxu()
  {
    GMTrace.i(7798318432256L, 58102);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    af localaf = com.tencent.mm.plugin.wallet.a.p.bxe();
    if (this.qZs == null) {
      this.qZs = localaf.a(null, null, true, true);
    }
    if (this.qZs == null)
    {
      w.i("MicroMsg.WalletPayDeductUI", "no bank card!");
      finish();
      GMTrace.o(7798318432256L, 58102);
      return;
    }
    SpannableString localSpannableString = new SpannableString(this.qZs.field_desc);
    com.tencent.mm.plugin.wallet_core.ui.f localf = new com.tencent.mm.plugin.wallet_core.ui.f(this.vKB.vKW);
    localf.rmz = new f.a()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7819256397824L, 58258);
        com.tencent.mm.plugin.wallet_core.ui.g.a(WalletPayDeductUI.this.vKB.vKW, this.qZy, null, WalletPayDeductUI.a(WalletPayDeductUI.this), WalletPayDeductUI.b(WalletPayDeductUI.this), new h.a()
        {
          public final void te(int paramAnonymous2Int)
          {
            GMTrace.i(7818987962368L, 58256);
            WalletPayDeductUI.a(WalletPayDeductUI.this, (Bankcard)WalletPayDeductUI.3.this.qZy.get(paramAnonymous2Int));
            WalletPayDeductUI.c(WalletPayDeductUI.this);
            GMTrace.o(7818987962368L, 58256);
          }
        });
        GMTrace.o(7819256397824L, 58258);
      }
    };
    localSpannableString.setSpan(localf, 0, localSpannableString.length(), 18);
    this.qZo.setText(localSpannableString);
    this.qZo.setMovementMethod(LinkMovementMethod.getInstance());
    GMTrace.o(7798318432256L, 58102);
  }
  
  private void bxv()
  {
    GMTrace.i(19536464052224L, 145558);
    if ((this.qZm == null) || (this.qZm.size() <= 0))
    {
      GMTrace.o(19536464052224L, 145558);
      return;
    }
    int j = this.qZm.size();
    int i = 0;
    while (i < j)
    {
      this.iAA.bc(((Preference)this.qZm.get(i)).hiu, false);
      i += 1;
    }
    this.iAA.notifyDataSetChanged();
    GMTrace.o(19536464052224L, 145558);
  }
  
  protected final void MP()
  {
    GMTrace.i(7798184214528L, 58101);
    this.qZn = ((TextView)this.vKB.hqF.findViewById(a.f.sqW));
    this.kES = ((Button)this.vKB.hqF.findViewById(a.f.bQR));
    this.qZt = ((LinearLayout)findViewById(a.f.sDM));
    ((TextView)findViewById(a.f.suy)).setText(this.opK.rhA.title);
    ((TextView)findViewById(a.f.title)).setText(((Orders.Commodity)this.opK.rhv.get(0)).desc);
    ((TextView)findViewById(a.f.svD)).setText(com.tencent.mm.wallet_core.ui.e.Xv(this.opK.nEr));
    ((TextView)findViewById(a.f.eCT)).setText(((Orders.Commodity)this.opK.rhv.get(0)).jWS);
    TextView localTextView = (TextView)findViewById(a.f.gdi);
    Object localObject1 = (TextView)findViewById(a.f.sux);
    boolean bool;
    if (!bg.nm(this.opK.rhA.rhX))
    {
      ((TextView)localObject1).setText(this.opK.rhA.rhX);
      this.qZo = ((TextView)findViewById(a.f.suz));
      this.qZp = ((TextView)findViewById(a.f.sqh));
      if (this.opK.rhA.rad != 1) {
        break label749;
      }
      bool = true;
      label282:
      this.qZu = bool;
      this.qZv = this.opK.rhA.qZv;
      this.jzt = this.opK.rhA.jzt;
      this.qZw = this.opK.rhA.qZw;
      w.i("MicroMsg.WalletPayDeductUI", "open: %s, show_type: %s", new Object[] { Boolean.valueOf(this.qZu), Integer.valueOf(this.qZv) });
      if (this.qZv != 0) {
        break label754;
      }
      this.qZl = ((MMSwitchBtn)findViewById(a.f.checkbox));
      this.qZl.mK(this.qZu);
      this.qZl.xrE = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(7797378908160L, 58095);
          WalletPayDeductUI.this.iN(paramAnonymousBoolean);
          GMTrace.o(7797378908160L, 58095);
        }
      };
      iN(this.qZu);
      label416:
      w.d("MicroMsg.WalletPayDeductUI", "show pay way layout: %d", new Object[] { Integer.valueOf(this.opK.rhA.rhW) });
      if (this.opK.rhA.rhW != 1) {
        break label841;
      }
      com.tencent.mm.kernel.h.xz();
      this.qZr = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vup, ""));
      com.tencent.mm.kernel.h.xz();
      this.qZq = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vuo, ""));
      if ((!bg.nm(this.qZq)) && (!bg.nm(this.qZq))) {
        break label823;
      }
      w.i("MicroMsg.WalletPayDeductUI", "need do pay manager");
      this.hul = com.tencent.mm.wallet_core.ui.g.a(this.vKB.vKW, false, null);
      localObject1 = new c();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
      label578:
      if (bg.nm(this.opK.rhA.rhU)) {
        break label853;
      }
      Object localObject2 = getString(a.i.tbl);
      localObject1 = getString(a.i.tbm);
      localObject2 = com.tencent.mm.pluginsdk.ui.d.h.a(this, getString(a.i.tbk, new Object[] { localObject2, localObject1 }));
      com.tencent.mm.plugin.wallet_core.ui.f localf = new com.tencent.mm.plugin.wallet_core.ui.f(this.vKB.vKW);
      SpannableString localSpannableString = new SpannableString((CharSequence)localObject2);
      localSpannableString.setSpan(localf, ((CharSequence)localObject2).length() - ((String)localObject1).length(), ((CharSequence)localObject2).length(), 33);
      localTextView.setTextColor(getResources().getColor(a.c.aOa));
      localTextView.setText(localSpannableString);
      localTextView.setOnClickListener(this);
      localTextView.setVisibility(0);
    }
    for (;;)
    {
      this.kES.setOnClickListener(this);
      GMTrace.o(7798184214528L, 58101);
      return;
      ((TextView)localObject1).setVisibility(8);
      break;
      label749:
      bool = false;
      break label282;
      label754:
      if (!bg.nm(this.jzt)) {
        this.kES.setText(this.jzt);
      }
      if (!bg.nm(this.qZw))
      {
        this.qZn.setText(this.qZw);
        this.qZn.setVisibility(0);
      }
      findViewById(a.f.suw).setVisibility(8);
      bxv();
      break label416;
      label823:
      this.qZp.setText(this.qZr);
      bxu();
      break label578;
      label841:
      this.qZt.setVisibility(8);
      break label578;
      label853:
      localTextView.setVisibility(8);
    }
  }
  
  public final int QI()
  {
    GMTrace.i(7798049996800L, 58100);
    GMTrace.o(7798049996800L, 58100);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7799257956352L, 58109);
    w.i("MicroMsg.WalletPayDeductUI", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramk instanceof c)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.kernel.h.xz();
        this.qZr = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vup, getString(a.i.tew)));
        com.tencent.mm.kernel.h.xz();
        this.qZq = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vuo, getString(a.i.tey)));
        this.qZp.setText(this.qZr);
        bxu();
      }
    }
    for (;;)
    {
      if (this.hul != null) {
        this.hul.dismiss();
      }
      GMTrace.o(7799257956352L, 58109);
      return;
      w.d("MicroMsg.WalletPayDeductUI", "other tenpay scene");
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    Object localObject = null;
    GMTrace.i(7798855303168L, 58106);
    int i;
    if ((paramPreference instanceof com.tencent.mm.plugin.wallet_core.ui.d))
    {
      paramf = (com.tencent.mm.plugin.wallet_core.ui.d)paramPreference;
      i = a.f.sJt;
      if (paramf.kgo == null) {
        break label129;
      }
    }
    label129:
    for (paramf = paramf.kgo.getTag(i);; paramf = null)
    {
      if (paramf == null) {
        paramf = (com.tencent.mm.ui.base.preference.f)localObject;
      }
      for (;;)
      {
        if (paramf != null)
        {
          paramf = (String)paramf;
          if (!bg.nm(paramf))
          {
            paramPreference = new Intent();
            paramPreference.putExtra("rawUrl", paramf);
            paramPreference.putExtra("showShare", false);
            com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
            GMTrace.o(7798855303168L, 58106);
            return true;
          }
        }
        GMTrace.o(7798855303168L, 58106);
        return false;
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7798721085440L, 58105);
    int i = a.g.sPT;
    GMTrace.o(7798721085440L, 58105);
    return i;
  }
  
  protected final void iN(boolean paramBoolean)
  {
    GMTrace.i(7798452649984L, 58103);
    if (paramBoolean)
    {
      findViewById(16908298).setVisibility(0);
      if (this.opK.rhA.rhW == 1)
      {
        this.qZt.setVisibility(0);
        bxv();
        if (!com.tencent.mm.plugin.wallet_core.model.n.byx().byS()) {
          break label128;
        }
        this.qZn.setVisibility(8);
        this.kES.setText(a.i.tbq);
      }
    }
    for (;;)
    {
      w.i("MicroMsg.WalletPayDeductUI", "isCheck=" + this.qZl.xrA);
      GMTrace.o(7798452649984L, 58103);
      return;
      this.qZt.setVisibility(8);
      break;
      label128:
      this.qZn.setVisibility(0);
      this.qZn.setText(a.i.tbp);
      this.kES.setText(a.i.tbn);
      continue;
      if ((this.qZm != null) && (this.qZm.size() > 0))
      {
        int j = this.qZm.size();
        int i = 0;
        while (i < j)
        {
          this.iAA.bc(((Preference)this.qZm.get(i)).hiu, true);
          i += 1;
        }
      }
      findViewById(16908298).setVisibility(8);
      this.qZt.setVisibility(8);
      this.qZn.setVisibility(8);
      this.kES.setText(a.i.tbo);
    }
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(7798989520896L, 58107);
    int i = paramView.getId();
    if (i == a.f.bQR)
    {
      paramView = new Intent();
      if (this.qZv == 0) {
        if (this.qZl.xrA)
        {
          i = 1;
          paramView.putExtra("auto_deduct_flag", i);
        }
      }
      for (;;)
      {
        if (this.qZs != null)
        {
          paramView.putExtra("deduct_bank_type", this.qZs.field_bankcardType);
          paramView.putExtra("deduct_bind_serial", this.qZs.field_bindSerial);
          w.i("MicroMsg.WalletPayDeductUI", "deduct bankType: %s", new Object[] { this.qZs.field_bankcardType });
        }
        setResult(-1, paramView);
        finish();
        GMTrace.o(7798989520896L, 58107);
        return;
        i = 0;
        break;
        paramView.putExtra("auto_deduct_flag", this.opK.rhA.rad);
      }
    }
    if ((i == a.f.gdi) && (!bg.nm(this.opK.rhA.rhU)))
    {
      paramView = new Intent();
      paramView.putExtra("rawUrl", this.opK.rhA.rhU);
      paramView.putExtra("showShare", false);
      com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", paramView);
    }
    GMTrace.o(7798989520896L, 58107);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7797647343616L, 58097);
    super.onCreate(paramBundle);
    this.iAA = this.wky;
    cN().cO().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.white)));
    paramBundle = cN().cO().getCustomView();
    if (paramBundle != null)
    {
      View localView = paramBundle.findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.transparent));
      }
      paramBundle = paramBundle.findViewById(16908309);
      if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
        ((TextView)paramBundle).setTextColor(getResources().getColor(a.c.white));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      if (!com.tencent.mm.compatible.util.d.et(23)) {
        break label212;
      }
      paramBundle.setStatusBarColor(getResources().getColor(a.c.smP));
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    for (;;)
    {
      paramBundle = getIntent();
      if (paramBundle != null) {
        break;
      }
      w.e("MicroMsg.WalletPayDeductUI", "intent is null");
      finish();
      GMTrace.o(7797647343616L, 58097);
      return;
      label212:
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
    this.opK = ((Orders)paramBundle.getParcelableExtra("orders"));
    if ((this.opK == null) || (this.opK.rhA == null))
    {
      w.e("MicroMsg.WalletPayDeductUI", "Orders data or deductInfo is null   : " + this.opK);
      finish();
    }
    bK(this.opK.rhA.rhV);
    setResult(0);
    a(new s()
    {
      public final void bxw()
      {
        GMTrace.i(7796439384064L, 58088);
        WalletPayDeductUI.this.setResult(0);
        WalletPayDeductUI.this.finish();
        GMTrace.o(7796439384064L, 58088);
      }
    }, a.h.cJD);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(385, this);
    MP();
    GMTrace.o(7797647343616L, 58097);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7797915779072L, 58099);
    super.onDestroy();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(385, this);
    GMTrace.o(7797915779072L, 58099);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7799123738624L, 58108);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7799123738624L, 58108);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(7797781561344L, 58098);
    super.onResume();
    GMTrace.o(7797781561344L, 58098);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\ui\WalletPayDeductUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */