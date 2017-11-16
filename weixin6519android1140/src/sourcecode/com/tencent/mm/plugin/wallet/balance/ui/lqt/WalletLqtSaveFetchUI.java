package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.balance.a.a.i;
import com.tencent.mm.plugin.wallet.balance.a.a.j;
import com.tencent.mm.plugin.wallet.balance.a.a.j.c;
import com.tencent.mm.plugin.wallet.balance.a.a.k.5;
import com.tencent.mm.plugin.wallet.balance.a.a.k.6;
import com.tencent.mm.plugin.wallet.balance.a.a.k.7;
import com.tencent.mm.plugin.wallet.balance.a.a.k.8;
import com.tencent.mm.plugin.wallet.balance.a.a.l;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.avx;
import com.tencent.mm.protocal.c.axx;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.vending.g.b;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WalletLqtSaveFetchUI
  extends WalletLqtBasePresenterUI
{
  private Dialog hqr;
  private int mode;
  private i qTD;
  private j qTE;
  private Button qVA;
  private TextView qVB;
  private ViewGroup qVC;
  private TextView qVD;
  private CheckBox qVE;
  private CharSequence qVF;
  private Bankcard qVG;
  private int qVH;
  private String qVI;
  private String qVJ;
  private long qVK;
  private com.tencent.mm.plugin.wallet.balance.a.a.k qVu;
  private l qVv;
  private ViewGroup qVw;
  private WalletFormView qVx;
  private TextView qVy;
  private TextView qVz;
  
  public WalletLqtSaveFetchUI()
  {
    GMTrace.i(18394673840128L, 137051);
    this.qTD = ((i)p(i.class));
    this.qTE = ((j)m(j.class));
    this.qVu = new com.tencent.mm.plugin.wallet.balance.a.a.k(this.qTD, this.qTE, this);
    this.qVv = new l(this.qVu);
    this.qVK = -1L;
    GMTrace.o(18394673840128L, 137051);
  }
  
  private static double D(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(19534853439488L, 145546);
    try
    {
      if (bg.getDouble(paramString1.trim(), 0.0D) == 0.0D) {}
      for (paramString1 = "0";; paramString1 = paramString1.trim())
      {
        double d = new BigDecimal(paramString1).divide(new BigDecimal(paramString2.trim()), 5, 2).doubleValue();
        GMTrace.o(19534853439488L, 145546);
        return d;
      }
      return 0.0D;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", paramString1, "", new Object[0]);
      GMTrace.o(19534853439488L, 145546);
    }
  }
  
  private static int dZ(String paramString1, String paramString2)
  {
    GMTrace.i(19534987657216L, 145547);
    try
    {
      double d1 = bg.getDouble(paramString1, 0.0D);
      double d2 = bg.getDouble(paramString2, 0.0D);
      if (d1 == 0.0D) {
        paramString1 = "0";
      }
      paramString1 = new BigDecimal(paramString1);
      if (d2 == 0.0D) {
        paramString2 = "0";
      }
      int i = paramString1.multiply(new BigDecimal(paramString2)).intValue();
      GMTrace.o(19534987657216L, 145547);
      return i;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", paramString1, "", new Object[0]);
      GMTrace.o(19534987657216L, 145547);
    }
    return 0;
  }
  
  public final void Fn(String paramString)
  {
    GMTrace.i(18395747581952L, 137059);
    Toast.makeText(this, paramString, 1).show();
    GMTrace.o(18395747581952L, 137059);
  }
  
  public final void WZ()
  {
    GMTrace.i(18395479146496L, 137057);
    if (this.hqr == null)
    {
      this.hqr = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
      GMTrace.o(18395479146496L, 137057);
      return;
    }
    this.hqr.show();
    GMTrace.o(18395479146496L, 137057);
  }
  
  public final void bwR()
  {
    GMTrace.i(18395613364224L, 137058);
    if (this.hqr != null) {
      this.hqr.dismiss();
    }
    GMTrace.o(18395613364224L, 137058);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(18395344928768L, 137056);
    com.tencent.mm.plugin.wallet.balance.a.a.k localk = this.qVu;
    w.i("MicroMsg.LqtSaveFetchLogic", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk });
    if ((paramk instanceof o))
    {
      p.bxd();
      localk.qTK = p.bxe().qUy;
      if (localk.how != null) {
        localk.how.resume();
      }
    }
    boolean bool = super.d(paramInt1, paramInt2, paramString, paramk);
    GMTrace.o(18395344928768L, 137056);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18395076493312L, 137054);
    int i = a.g.sPB;
    GMTrace.o(18395076493312L, 137054);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(18395210711040L, 137055);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.plugin.wallet.balance.a.a.k localk = this.qVu;
    if ((paramInt1 == com.tencent.mm.plugin.wallet.balance.a.a.k.qTB) && (paramInt2 == -1))
    {
      paramIntent = (Orders)paramIntent.getParcelableExtra("key_orders");
      if ((paramIntent != null) && (paramIntent.rhv != null) && (paramIntent.rhv.size() > 0))
      {
        w.i("MicroMsg.LqtSaveFetchLogic", "onActivityResult, doQueryPurchaseResult");
        localk.eRP = ((Orders.Commodity)paramIntent.rhv.get(0)).eRP;
        w.i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult");
        localk.qTF.WZ();
        paramIntent = localk.qTE.qTx;
        com.tencent.mm.vending.g.g.a(localk.qTG, localk.eRP, Integer.valueOf(localk.qTH)).a(paramIntent).d(new k.6(localk)).a(new k.5(localk));
      }
      GMTrace.o(18395210711040L, 137055);
      return;
    }
    if ((paramInt1 == com.tencent.mm.plugin.wallet.balance.a.a.k.qTC) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringExtra("lqt_fetch_enc_pwd");
      w.i("MicroMsg.LqtSaveFetchLogic", "onActivityResult, doRedeemFund");
      w.i("MicroMsg.LqtSaveFetchLogic", "doRedeemFund");
      localk.qTF.WZ();
      j.c localc = localk.qTE.qTy;
      com.tencent.mm.vending.g.g.a(Integer.valueOf(localk.qTI), paramIntent, localk.qTJ).a(localc).d(new k.8(localk)).a(new k.7(localk));
    }
    GMTrace.o(18395210711040L, 137055);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(18394808057856L, 137052);
    super.onCreate(paramBundle);
    this.qVx = ((WalletFormView)findViewById(a.f.sxs));
    this.qVA = ((Button)findViewById(a.f.bQR));
    this.qVB = ((TextView)findViewById(a.f.sxr));
    this.qVy = ((TextView)findViewById(a.f.sxt));
    this.qVz = ((TextView)findViewById(a.f.sxu));
    this.qVC = ((ViewGroup)findViewById(a.f.sxv));
    this.qVD = ((TextView)findViewById(a.f.sxx));
    this.qVE = ((CheckBox)findViewById(a.f.sxw));
    this.qVw = ((ViewGroup)findViewById(a.f.bLQ));
    a(this.qVx, 2, false, false);
    this.mode = getIntent().getIntExtra("lqt_save_fetch_mode", 1);
    this.qVH = getIntent().getIntExtra("lqt_max_redeem_amount", -1);
    this.qVI = getIntent().getStringExtra("lqt_redeem_invalid_amount_hint");
    this.qVJ = getIntent().getStringExtra("lqt_profile_wording");
    final int i;
    if (this.mode == 1)
    {
      this.qVy.setText(getString(a.i.tcH));
      this.qVA.setText(a.i.tcL);
      this.qVz.setText(getString(a.i.tcJ));
      this.qVx.a(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(18400445202432L, 137094);
          if (paramAnonymousEditable.toString().startsWith(".")) {
            paramAnonymousEditable.insert(0, "0");
          }
          String str = paramAnonymousEditable.toString();
          int i = str.indexOf(".");
          int j = str.length();
          if ((i >= 0) && (j - i > 3)) {
            paramAnonymousEditable.delete(i + 3, j);
          }
          for (;;)
          {
            i = WalletLqtSaveFetchUI.eb(paramAnonymousEditable.toString(), "100");
            if (i <= 0) {
              break label488;
            }
            if (WalletLqtSaveFetchUI.g(WalletLqtSaveFetchUI.this) != 1) {
              break label286;
            }
            if ((WalletLqtSaveFetchUI.a(WalletLqtSaveFetchUI.this) == null) || (i <= WalletLqtSaveFetchUI.eb(WalletLqtSaveFetchUI.a(WalletLqtSaveFetchUI.this).reK, "100"))) {
              break;
            }
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.this.getString(a.i.tcI));
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(-65536);
            WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
            GMTrace.o(18400445202432L, 137094);
            return;
            if (i > 12) {
              paramAnonymousEditable.delete(12, i);
            } else if ((i == -1) && (j > 12)) {
              paramAnonymousEditable.delete(12, j);
            }
          }
          WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.h(WalletLqtSaveFetchUI.this));
          WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(Color.parseColor("#888888"));
          WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(true);
          GMTrace.o(18400445202432L, 137094);
          return;
          label286:
          if (WalletLqtSaveFetchUI.g(WalletLqtSaveFetchUI.this) == 2)
          {
            if (i > WalletLqtSaveFetchUI.this.getIntent().getIntExtra("lqt_balance", 0))
            {
              WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.this.getString(a.i.tcw));
              WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(-65536);
              WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
              GMTrace.o(18400445202432L, 137094);
              return;
            }
            if ((WalletLqtSaveFetchUI.i(WalletLqtSaveFetchUI.this) > 0) && (i > WalletLqtSaveFetchUI.i(WalletLqtSaveFetchUI.this)))
            {
              WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.j(WalletLqtSaveFetchUI.this));
              WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(-65536);
              WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
              GMTrace.o(18400445202432L, 137094);
              return;
            }
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.h(WalletLqtSaveFetchUI.this));
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(Color.parseColor("#888888"));
            WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(true);
            GMTrace.o(18400445202432L, 137094);
            return;
            label488:
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.h(WalletLqtSaveFetchUI.this));
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(Color.parseColor("#888888"));
            WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
          }
          GMTrace.o(18400445202432L, 137094);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(18400176766976L, 137092);
          GMTrace.o(18400176766976L, 137092);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(18400310984704L, 137093);
          GMTrace.o(18400310984704L, 137093);
        }
      });
      this.qVA.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18402592686080L, 137110);
          if ((WalletLqtSaveFetchUI.k(WalletLqtSaveFetchUI.this) <= 0L) || (bg.aI(WalletLqtSaveFetchUI.k(WalletLqtSaveFetchUI.this)) < 800L))
          {
            w.d("MicroMsg.WalletLqtSaveFetchUI", "saveButton click too soon");
            WalletLqtSaveFetchUI.a(WalletLqtSaveFetchUI.this, bg.Pw());
            GMTrace.o(18402592686080L, 137110);
            return;
          }
          WalletLqtSaveFetchUI.a(WalletLqtSaveFetchUI.this, bg.Pw());
          final int i = WalletLqtSaveFetchUI.eb(WalletLqtSaveFetchUI.b(WalletLqtSaveFetchUI.this).getText(), "100");
          if (i > 0)
          {
            if (WalletLqtSaveFetchUI.g(WalletLqtSaveFetchUI.this) == 1)
            {
              w.i("MicroMsg.WalletLqtSaveFetchUI", "click save lqt");
              paramAnonymousView = WalletLqtSaveFetchUI.l(WalletLqtSaveFetchUI.this).qTN;
              com.tencent.mm.vending.g.g.bY(Integer.valueOf(i)).a(paramAnonymousView).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
              {
                public final void aH(Object paramAnonymous2Object)
                {
                  GMTrace.i(18401518944256L, 137102);
                  w.i("MicroMsg.WalletLqtSaveFetchUI", "save failed: %s", new Object[] { paramAnonymous2Object });
                  WalletLqtSaveFetchUI.this.bwR();
                  if (paramAnonymous2Object != null) {
                    if (!(paramAnonymous2Object instanceof String)) {
                      break label69;
                    }
                  }
                  label69:
                  for (paramAnonymous2Object = paramAnonymous2Object.toString();; paramAnonymous2Object = WalletLqtSaveFetchUI.this.getString(a.i.tcE))
                  {
                    WalletLqtSaveFetchUI.this.Fn((String)paramAnonymous2Object);
                    GMTrace.o(18401518944256L, 137102);
                    return;
                  }
                }
              });
              GMTrace.o(18402592686080L, 137110);
              return;
            }
            if (WalletLqtSaveFetchUI.g(WalletLqtSaveFetchUI.this) == 2)
            {
              w.i("MicroMsg.WalletLqtSaveFetchUI", "click fetch lqt");
              paramAnonymousView = WalletLqtSaveFetchUI.l(WalletLqtSaveFetchUI.this).qTO;
              com.tencent.mm.vending.g.g.bY(Integer.valueOf(i)).a(paramAnonymousView).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
              {
                public final void aH(Object paramAnonymous2Object)
                {
                  GMTrace.i(18414135410688L, 137196);
                  WalletLqtSaveFetchUI.this.bwR();
                  if (paramAnonymous2Object != null) {
                    if (!(paramAnonymous2Object instanceof String)) {
                      break label54;
                    }
                  }
                  label54:
                  for (paramAnonymous2Object = paramAnonymous2Object.toString();; paramAnonymous2Object = WalletLqtSaveFetchUI.this.getString(a.i.tcE))
                  {
                    WalletLqtSaveFetchUI.this.Fn((String)paramAnonymous2Object);
                    GMTrace.o(18414135410688L, 137196);
                    return;
                  }
                }
              });
            }
          }
          GMTrace.o(18402592686080L, 137110);
        }
      });
      if (!bg.nm(this.qVJ))
      {
        paramBundle = (TextView)findViewById(a.f.sxp);
        paramBundle.setText(this.qVJ);
        paramBundle.setVisibility(0);
      }
      this.qVB.setText("");
      this.qVB.setClickable(true);
      this.qVB.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
      this.qVA.setEnabled(false);
      if (this.mode != 1) {
        break label693;
      }
      this.qVw.setVisibility(4);
      sq(getString(a.i.tcL));
      paramBundle = getIntent().getStringArrayListExtra("lqt_protocol_list");
      boolean bool = getIntent().getBooleanExtra("lqt_is_show_protocol", false);
      if ((paramBundle == null) || (paramBundle.size() <= 0) || (!bool)) {
        break label681;
      }
      this.qVC.setVisibility(0);
      this.qVE.setChecked(getIntent().getBooleanExtra("lqt_is_agree_protocol", false));
      this.qVC.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18398163501056L, 137077);
          if (!WalletLqtSaveFetchUI.e(WalletLqtSaveFetchUI.this).isChecked()) {}
          for (boolean bool = true;; bool = false)
          {
            WalletLqtSaveFetchUI.e(WalletLqtSaveFetchUI.this).setChecked(bool);
            GMTrace.o(18398163501056L, 137077);
            return;
          }
        }
      });
      this.qVE.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
      {
        public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
        {
          GMTrace.i(18411987927040L, 137180);
          if (!paramAnonymousBoolean)
          {
            WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
            GMTrace.o(18411987927040L, 137180);
            return;
          }
          WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(true);
          GMTrace.o(18411987927040L, 137180);
        }
      });
      Object localObject = getString(a.i.tcF);
      i = ((String)localObject).length();
      localObject = new SpannableString((String)localObject + getString(a.i.tcG));
      ((SpannableString)localObject).setSpan(new a(new a.a()
      {
        public final void PT()
        {
          GMTrace.i(18409572007936L, 137162);
          f localf = new f(WalletLqtSaveFetchUI.this, f.xpQ, false);
          localf.qik = new p.c()
          {
            public final void a(n paramAnonymous2n)
            {
              GMTrace.i(18404069081088L, 137121);
              Iterator localIterator = WalletLqtSaveFetchUI.5.this.qVO.iterator();
              int i = 0;
              while (localIterator.hasNext())
              {
                paramAnonymous2n.add(0, i, 0, ((String)localIterator.next()).split("\\|\\|")[0]);
                i += 1;
              }
              GMTrace.o(18404069081088L, 137121);
            }
          };
          localf.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(18397895065600L, 137075);
              paramAnonymous2Int = paramAnonymous2MenuItem.getItemId();
              if (paramAnonymous2Int < WalletLqtSaveFetchUI.5.this.qVO.size())
              {
                paramAnonymous2MenuItem = ((String)WalletLqtSaveFetchUI.5.this.qVO.get(paramAnonymous2Int)).split("\\|\\|")[1];
                e.m(WalletLqtSaveFetchUI.this, paramAnonymous2MenuItem, false);
              }
              GMTrace.o(18397895065600L, 137075);
            }
          };
          localf.bFk();
          GMTrace.o(18409572007936L, 137162);
        }
      }), i, ((SpannableString)localObject).length(), 17);
      this.qVD.setText((CharSequence)localObject);
      this.qVD.setClickable(true);
      this.qVD.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
    }
    for (;;)
    {
      paramBundle = this.qVv.qTP;
      com.tencent.mm.vending.g.g.ckp().a(paramBundle).d(new com.tencent.mm.vending.c.a() {});
      GMTrace.o(18394808057856L, 137052);
      return;
      if (this.mode != 2) {
        break;
      }
      this.qVy.setText(getString(a.i.tcv));
      this.qVA.setText(a.i.tcC);
      this.qVz.setText(getString(a.i.tcx));
      break;
      label681:
      this.qVC.setVisibility(8);
    }
    label693:
    if (this.mode == 2)
    {
      this.qVC.setVisibility(8);
      sq(getString(a.i.tcD));
      i = getIntent().getIntExtra("lqt_balance", 0);
      if (i > 0)
      {
        paramBundle = getString(a.i.tcz, new Object[] { Double.valueOf(D(String.valueOf(i), "100", 2)) });
        int j = paramBundle.length();
        paramBundle = new SpannableString(paramBundle + getString(a.i.tcA));
        paramBundle.setSpan(new a(new a.a()
        {
          public final void PT()
          {
            GMTrace.i(18400713637888L, 137096);
            WalletLqtSaveFetchUI.b(WalletLqtSaveFetchUI.this).setText(e.r(WalletLqtSaveFetchUI.ea(i, "100")));
            GMTrace.o(18400713637888L, 137096);
          }
        }), j, paramBundle.length(), 18);
        this.qVF = paramBundle;
        this.qVB.setText(paramBundle);
      }
    }
    GMTrace.o(18394808057856L, 137052);
  }
  
  public void onDestroy()
  {
    GMTrace.i(18395881799680L, 137060);
    super.onDestroy();
    this.qVu = null;
    this.qVv = null;
    GMTrace.o(18395881799680L, 137060);
  }
  
  public void onResume()
  {
    GMTrace.i(18394942275584L, 137053);
    super.onResume();
    GMTrace.o(18394942275584L, 137053);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\lqt\WalletLqtSaveFetchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */