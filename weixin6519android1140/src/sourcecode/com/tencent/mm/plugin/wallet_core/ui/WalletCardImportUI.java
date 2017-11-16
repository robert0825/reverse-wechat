package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.e.c;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.MMScrollView.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.util.LinkedList;
import java.util.List;

public class WalletCardImportUI
  extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private static final String[] rlP;
  private String mDR;
  private String mDS;
  private ae mHandler;
  private Dialog oa;
  private Orders opK;
  private Button qXb;
  private Authen qYD;
  private PayInfo qYU;
  private WalletFormView rbc;
  private int rbg;
  private ElementQuery rdw;
  private WalletFormView rkx;
  private WalletFormView rlA;
  private WalletFormView rlB;
  private WalletFormView rlD;
  private WalletFormView rlE;
  private CheckBox rlI;
  private String rlJ;
  private TextView rlQ;
  private MMScrollView rlR;
  private Bankcard rlS;
  private CheckBox rlT;
  private BaseAdapter rlU;
  private WalletFormView rlo;
  private WalletFormView rlp;
  private WalletFormView rlq;
  private WalletFormView rlr;
  private WalletFormView rls;
  private WalletFormView rlv;
  private WalletFormView rlw;
  private WalletFormView rlx;
  private WalletFormView rly;
  private WalletFormView rlz;
  
  static
  {
    GMTrace.i(6976905936896L, 51982);
    rlP = new String[] { "ABC_DEBIT", "ABC_CREDIT", "CITIC_CREDIT", "CMBC_DEBIT", "HSBC_DEBIT" };
    GMTrace.o(6976905936896L, 51982);
  }
  
  public WalletCardImportUI()
  {
    GMTrace.i(6973550493696L, 51957);
    this.oa = null;
    this.rlD = null;
    this.mHandler = new ae();
    this.rdw = new ElementQuery();
    this.qYD = new Authen();
    this.opK = null;
    this.qYU = null;
    this.rlS = null;
    this.rbg = 1;
    this.rlU = new BaseAdapter()
    {
      private Integer wU(int paramAnonymousInt)
      {
        GMTrace.i(6947646472192L, 51764);
        Integer localInteger = (Integer)WalletCardImportUI.c(WalletCardImportUI.this).byn().get(paramAnonymousInt);
        GMTrace.o(6947646472192L, 51764);
        return localInteger;
      }
      
      public final int getCount()
      {
        GMTrace.i(6947512254464L, 51763);
        if (WalletCardImportUI.c(WalletCardImportUI.this).byn() != null)
        {
          int i = WalletCardImportUI.c(WalletCardImportUI.this).byn().size();
          GMTrace.o(6947512254464L, 51763);
          return i;
        }
        GMTrace.o(6947512254464L, 51763);
        return 0;
      }
      
      public final long getItemId(int paramAnonymousInt)
      {
        GMTrace.i(6947780689920L, 51765);
        long l = paramAnonymousInt;
        GMTrace.o(6947780689920L, 51765);
        return l;
      }
      
      public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
      {
        GMTrace.i(6947914907648L, 51766);
        paramAnonymousView = (CheckedTextView)View.inflate(WalletCardImportUI.this, a.g.sPy, null);
        paramAnonymousView.setText(n.byF().J(WalletCardImportUI.this, wU(paramAnonymousInt).intValue()));
        if (WalletCardImportUI.f(WalletCardImportUI.this) == wU(paramAnonymousInt).intValue()) {
          paramAnonymousView.setChecked(true);
        }
        for (;;)
        {
          paramAnonymousView.setBackgroundResource(a.e.aVO);
          GMTrace.o(6947914907648L, 51766);
          return paramAnonymousView;
          paramAnonymousView.setChecked(false);
        }
      }
    };
    GMTrace.o(6973550493696L, 51957);
  }
  
  private boolean QS()
  {
    GMTrace.i(6974758453248L, 51966);
    if (!this.rlT.isChecked()) {}
    for (boolean bool = false;; bool = true)
    {
      if (bool)
      {
        this.qXb.setEnabled(true);
        this.qXb.setClickable(true);
      }
      for (;;)
      {
        GMTrace.o(6974758453248L, 51966);
        return bool;
        this.qXb.setEnabled(false);
        this.qXb.setClickable(false);
      }
    }
  }
  
  private void ar()
  {
    Object localObject2 = null;
    GMTrace.i(6973953146880L, 51960);
    if (this.rlS != null)
    {
      findViewById(a.f.sJh).setVisibility(0);
      Object localObject1;
      label96:
      label199:
      Object localObject3;
      if (!bg.nm(this.ui.getString("key_bank_username")))
      {
        localObject1 = this.ui.getString("key_recommand_desc");
        if (bg.nm((String)localObject1))
        {
          this.rlI.setText(getString(a.i.tau, new Object[] { this.rlS.field_bankName }));
          this.rlI.setVisibility(0);
          this.rlv.setVisibility(8);
          this.rlw.setVisibility(8);
          this.rlx.setVisibility(8);
          this.rly.setVisibility(8);
          this.rlz.setVisibility(8);
          this.rlA.setVisibility(8);
          this.rlB.setVisibility(8);
          if ((bg.nm(this.rlS.field_bankcardTail)) || (!b(this.rlE, this.rlS.reG))) {
            break label574;
          }
          localObject1 = this.rlE;
          localObject2 = this.rlE;
          if (!this.rlS.byf()) {
            break label588;
          }
          localObject3 = getString(a.i.tbg);
          label217:
          if ((bg.nm(this.rlS.field_bankName)) || (!b(this.rlo, this.rlS.field_bankName + " " + (String)localObject3))) {
            break label599;
          }
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = this.rlo;
          }
          localObject3 = this.rlo;
        }
      }
      for (;;)
      {
        localObject1 = localObject2;
        if (b(this.rkx, this.rlS.field_trueName))
        {
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = this.rkx;
          }
          localObject3 = this.rkx;
        }
        localObject2 = localObject1;
        if (b(this.rlr, n.byF().J(this.vKB.vKW, this.rlS.reg)))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = this.rlr;
          }
          localObject3 = this.rlr;
        }
        localObject1 = localObject2;
        if (b(this.rbc, this.rlS.reF))
        {
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = this.rbc;
          }
          localObject3 = this.rbc;
        }
        localObject2 = localObject1;
        if (b(this.rls, this.rlS.field_mobile))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = this.rls;
          }
          localObject3 = this.rls;
        }
        localObject1 = localObject2;
        if (b(this.rlq, this.rlS.rei))
        {
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = this.rlq;
          }
          localObject3 = this.rlq;
        }
        localObject2 = localObject1;
        if (b(this.rlp, this.rlS.reH))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = this.rlp;
          }
          localObject3 = this.rlp;
        }
        ((WalletFormView)localObject2).setBackgroundResource(a.e.aVO);
        ((WalletFormView)localObject3).setBackgroundResource(a.e.aVO);
        if (!n.byx().byP()) {
          break label615;
        }
        this.qXb.setText(a.i.taB);
        GMTrace.o(6973953146880L, 51960);
        return;
        this.rlI.setText((CharSequence)localObject1);
        break;
        this.rlI.setVisibility(8);
        break label96;
        label574:
        this.rlE.setVisibility(8);
        localObject1 = null;
        break label199;
        label588:
        localObject3 = getString(a.i.tbv);
        break label217;
        label599:
        this.rlo.setVisibility(8);
        localObject3 = localObject2;
        localObject2 = localObject1;
      }
      label615:
      this.qXb.setText(a.i.taz);
      GMTrace.o(6973953146880L, 51960);
      return;
    }
    GMTrace.o(6973953146880L, 51960);
  }
  
  private static boolean b(WalletFormView paramWalletFormView, String paramString)
  {
    GMTrace.i(6974087364608L, 51961);
    if (!bg.nm(paramString))
    {
      KeyListener localKeyListener = paramWalletFormView.getKeyListener();
      paramWalletFormView.setKeyListener(null);
      paramWalletFormView.setEnabled(false);
      paramWalletFormView.setClickable(false);
      paramWalletFormView.setText(paramString);
      paramWalletFormView.setKeyListener(localKeyListener);
      paramWalletFormView.setVisibility(0);
      GMTrace.o(6974087364608L, 51961);
      return true;
    }
    paramWalletFormView.setVisibility(8);
    GMTrace.o(6974087364608L, 51961);
    return false;
  }
  
  private void bzz()
  {
    GMTrace.i(6974221582336L, 51962);
    Object localObject;
    if (QS())
    {
      c.bAa();
      this.qYD = new Authen();
      this.ui.putBoolean("key_is_follow_bank_username", this.rlI.isChecked());
      if ((this.rlS != null) && (!bg.nm(this.rlS.reQ)))
      {
        this.qYD.qWc = this.rlS.reQ;
        this.qYD.nDu = this.rlS.field_bindSerial;
        this.qYD.nDt = this.rlS.field_bankcardType;
        this.qYD.reg = this.rlS.reg;
        this.qYD.red = this.ui.getString("key_pwd1");
        this.qYD.token = this.ui.getString("kreq_token");
        com.tencent.mm.wallet_core.a.ad(this);
        if (cmq().j(new Object[] { this.qYD, this.opK }))
        {
          w.i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
          GMTrace.o(6974221582336L, 51962);
        }
      }
      else
      {
        localObject = this.ui.getString("key_card_id");
        if (this.rlE.getVisibility() != 0) {
          break label628;
        }
        localObject = this.rlE.getText();
      }
    }
    label628:
    for (;;)
    {
      this.qYD.oek = ((PayInfo)this.ui.getParcelable("key_pay_info"));
      this.qYD.reh = ((String)localObject);
      this.qYD.nDt = this.rdw.nDt;
      this.qYD.reg = this.rbg;
      this.qYD.red = this.ui.getString("key_pwd1");
      if (!bg.nm(this.rlq.getText())) {
        this.qYD.rei = this.rlq.getText();
      }
      this.qYD.rcs = this.rls.getText();
      this.qYD.rem = this.rlv.getText();
      this.qYD.ren = this.rlw.getText();
      this.qYD.country = this.rlJ;
      this.qYD.fjk = this.mDR;
      this.qYD.fjl = this.mDS;
      this.qYD.gEy = this.rly.getText();
      this.qYD.mhW = this.rlz.getText();
      this.qYD.hur = this.rlA.getText();
      this.qYD.fjd = this.rlB.getText();
      localObject = e.Xy(this.qYD.rcs);
      this.ui.putString("key_mobile", (String)localObject);
      localObject = this.ui;
      if (this.rdw.rcw == 2) {}
      for (boolean bool = true;; bool = false)
      {
        ((Bundle)localObject).putBoolean("key_is_oversea", bool);
        this.qYD.ref = this.rbc.getText();
        this.qYD.ree = this.rkx.getText();
        this.qYD.rej = this.rlp.getText();
        w.d("MicroMsg.WalletCardElmentUI", "payInfo " + this.qYD.oek + " elemt.bankcardTag : " + this.rdw.rcw);
        break;
      }
      w.e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
      GMTrace.o(6974221582336L, 51962);
      return;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(6973818929152L, 51959);
    this.rlE = ((WalletFormView)findViewById(a.f.sJa));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rlE);
    this.rls = ((WalletFormView)findViewById(a.f.sCx));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.rls);
    this.rkx = ((WalletFormView)findViewById(a.f.sCF));
    com.tencent.mm.wallet_core.ui.formview.a.e(this, this.rkx);
    this.rlr = ((WalletFormView)findViewById(a.f.sJr));
    this.rbc = ((WalletFormView)findViewById(a.f.svX));
    com.tencent.mm.wallet_core.ui.formview.a.c(this.rbc);
    this.rlo = ((WalletFormView)findViewById(a.f.sJi));
    this.rlq = ((WalletFormView)findViewById(a.f.sut));
    com.tencent.mm.wallet_core.ui.formview.a.b(this, this.rlq);
    this.rlp = ((WalletFormView)findViewById(a.f.suu));
    com.tencent.mm.wallet_core.ui.formview.a.a(this, this.rlp);
    this.rlQ = ((TextView)findViewById(a.f.sKC));
    this.rlv = ((WalletFormView)findViewById(a.f.svP));
    this.rlw = ((WalletFormView)findViewById(a.f.swx));
    this.rlx = ((WalletFormView)findViewById(a.f.spS));
    this.rly = ((WalletFormView)findViewById(a.f.spG));
    this.rlz = ((WalletFormView)findViewById(a.f.sEo));
    this.rlA = ((WalletFormView)findViewById(a.f.sEv));
    this.rlB = ((WalletFormView)findViewById(a.f.svi));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.rlB);
    this.rlT = ((CheckBox)findViewById(a.f.spJ));
    this.rlI = ((CheckBox)findViewById(a.f.spH));
    this.qXb = ((Button)findViewById(a.f.bQR));
    this.rlR = ((MMScrollView)findViewById(a.f.cnx));
    MMScrollView localMMScrollView = this.rlR;
    localMMScrollView.a(localMMScrollView, localMMScrollView);
    this.rlR.xEF = new MMScrollView.a()
    {
      public final void iV(boolean paramAnonymousBoolean)
      {
        GMTrace.i(6927648030720L, 51615);
        if (paramAnonymousBoolean) {}
        for (final int i = 8;; i = 0)
        {
          w.d("MicroMsg.WalletCardElmentUI", "onSizeChanged : " + paramAnonymousBoolean);
          WalletCardImportUI.b(WalletCardImportUI.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6957444366336L, 51837);
              if (i != WalletCardImportUI.a(WalletCardImportUI.this).getVisibility()) {
                WalletCardImportUI.a(WalletCardImportUI.this).setVisibility(i);
              }
              GMTrace.o(6957444366336L, 51837);
            }
          });
          GMTrace.o(6927648030720L, 51615);
          return;
        }
      }
    };
    this.rkx.xFu = this;
    this.rlE.xFu = this;
    this.rlr.xFu = this;
    this.rbc.xFu = this;
    this.rls.xFu = this;
    this.rlq.xFu = this;
    this.rlp.xFu = this;
    this.rlv.xFu = this;
    this.rlw.xFu = this;
    this.rlx.xFu = this;
    this.rly.xFu = this;
    this.rlz.xFu = this;
    this.rlA.xFu = this;
    this.rlB.xFu = this;
    this.rkx.setOnEditorActionListener(this);
    this.rlE.setOnEditorActionListener(this);
    this.rlr.setOnEditorActionListener(this);
    this.rbc.setOnEditorActionListener(this);
    this.rls.setOnEditorActionListener(this);
    this.rlq.setOnEditorActionListener(this);
    this.rlp.setOnEditorActionListener(this);
    this.rlv.setOnEditorActionListener(this);
    this.rlw.setOnEditorActionListener(this);
    this.rlx.setOnEditorActionListener(this);
    this.rly.setOnEditorActionListener(this);
    this.rlz.setOnEditorActionListener(this);
    this.rlA.setOnEditorActionListener(this);
    this.rlB.setOnEditorActionListener(this);
    this.rlo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6917179047936L, 51537);
        paramAnonymousView = new Bundle();
        paramAnonymousView.putInt("key_support_bankcard", WalletCardImportUI.this.ui.getInt("key_support_bankcard", 3));
        paramAnonymousView.putString("key_bank_type", WalletCardImportUI.c(WalletCardImportUI.this).nDt);
        paramAnonymousView.putInt("key_bankcard_type", WalletCardImportUI.c(WalletCardImportUI.this).rfU);
        com.tencent.mm.wallet_core.a.ad(WalletCardImportUI.this).a(WalletCardImportUI.this, WalletCardSelectUI.class, paramAnonymousView, 1);
        GMTrace.o(6917179047936L, 51537);
      }
    });
    this.rlr.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6997307031552L, 52134);
        WalletCardImportUI.this.showDialog(1);
        GMTrace.o(6997307031552L, 52134);
      }
    });
    this.rlT.setChecked(true);
    this.rlT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6925232111616L, 51597);
        WalletCardImportUI.d(WalletCardImportUI.this);
        GMTrace.o(6925232111616L, 51597);
      }
    });
    this.rlI.setChecked(true);
    findViewById(a.f.bdr).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7014889553920L, 52265);
        paramAnonymousView = new LinkedList();
        LinkedList localLinkedList = new LinkedList();
        paramAnonymousView.add(WalletCardImportUI.this.getString(a.i.tad));
        localLinkedList.add(Integer.valueOf(0));
        if ((WalletCardImportUI.c(WalletCardImportUI.this) != null) && (WalletCardImportUI.c(WalletCardImportUI.this).rgm))
        {
          paramAnonymousView.add(WalletCardImportUI.this.getString(a.i.tac));
          localLinkedList.add(Integer.valueOf(1));
        }
        h.a(WalletCardImportUI.this, "", paramAnonymousView, localLinkedList, "", new h.d()
        {
          public final void bT(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(7021868875776L, 52317);
            Intent localIntent = new Intent();
            switch (paramAnonymous2Int1)
            {
            }
            for (;;)
            {
              localIntent.putExtra("showShare", false);
              com.tencent.mm.bj.d.b(WalletCardImportUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", localIntent);
              GMTrace.o(7021868875776L, 52317);
              return;
              localIntent.putExtra("rawUrl", WalletCardImportUI.this.getString(a.i.sYV, new Object[] { v.bPK() }));
              continue;
              if (WalletCardImportUI.c(WalletCardImportUI.this) != null) {
                localIntent.putExtra("rawUrl", WalletCardImportUI.this.getString(a.i.sYU, new Object[] { v.bPK(), WalletCardImportUI.c(WalletCardImportUI.this).nDt }));
              }
            }
          }
        });
        GMTrace.o(7014889553920L, 52265);
      }
    });
    this.rlx.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7015157989376L, 52267);
        WalletCardImportUI.this.startActivityForResult(new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true), 2);
        GMTrace.o(7015157989376L, 52267);
      }
    });
    this.qXb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6918789660672L, 51549);
        WalletCardImportUI.e(WalletCardImportUI.this);
        GMTrace.o(6918789660672L, 51549);
      }
    });
    ar();
    QS();
    GMTrace.o(6973818929152L, 51959);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6974355800064L, 51963);
    w.d("MicroMsg.WalletCardElmentUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.ui;
      w.d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.qYU);
      if ((paramk instanceof o))
      {
        paramString.putBoolean("intent_bind_end", true);
        com.tencent.mm.wallet_core.a.i(this, paramString);
        h.bm(this, getString(a.i.sZL));
        GMTrace.o(6974355800064L, 51963);
        return true;
      }
      GMTrace.o(6974355800064L, 51963);
      return false;
    }
    GMTrace.o(6974355800064L, 51963);
    return false;
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(6974892670976L, 51967);
    QS();
    GMTrace.o(6974892670976L, 51967);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6974490017792L, 51964);
    int i = a.g.sPc;
    GMTrace.o(6974490017792L, 51964);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6974624235520L, 51965);
    w.i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(6974624235520L, 51965);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      QS();
      GMTrace.o(6974624235520L, 51965);
      return;
      this.rdw = ((ElementQuery)paramIntent.getParcelableExtra("elemt_query"));
      ar();
      continue;
      String str1 = paramIntent.getStringExtra("CountryName");
      String str2 = paramIntent.getStringExtra("Country");
      this.rlJ = (str1 + "|" + str2);
      String str3 = paramIntent.getStringExtra("ProviceName");
      String str4 = paramIntent.getStringExtra("CityName");
      if (!bg.nm(paramIntent.getStringExtra("Contact_City")))
      {
        this.mDR = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
        this.mDS = (str4 + "|" + paramIntent.getStringExtra("Contact_City"));
        this.rlx.setText(str1 + " " + str4);
      }
      for (;;)
      {
        if ((!"US".equals(str2)) && (!"CA".equals(str2)) && (!this.rdw.rgh)) {
          break label437;
        }
        this.rlA.setVisibility(0);
        break;
        if (!bg.nm(paramIntent.getStringExtra("Contact_Province")))
        {
          this.mDS = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
          this.rlx.setText(str1 + " " + str3);
        }
        else
        {
          this.mDS = this.rlJ;
          this.rlx.setText(str1);
        }
      }
      label437:
      this.rlA.setVisibility(8);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6973684711424L, 51958);
    super.onCreate(paramBundle);
    oM(a.i.tbx);
    this.rdw = ((ElementQuery)this.ui.getParcelable("elemt_query"));
    this.opK = ((Orders)this.ui.getParcelable("key_orders"));
    this.qYU = ((PayInfo)this.ui.getParcelable("key_pay_info"));
    this.rlS = ((Bankcard)this.ui.getParcelable("key_import_bankcard"));
    if (this.qYU == null) {
      this.qYU = new PayInfo();
    }
    w.d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.qYU);
    MP();
    this.rlR.pageScroll(33);
    c.b(this, this.ui, 3);
    GMTrace.o(6973684711424L, 51958);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(6975295324160L, 51970);
    switch (paramInt)
    {
    default: 
      localObject = super.onCreateDialog(paramInt);
      GMTrace.o(6975295324160L, 51970);
      return (Dialog)localObject;
    }
    Object localObject = new com.tencent.mm.ui.base.k(this, a.j.tim);
    ((Dialog)localObject).setContentView(a.g.sPx);
    ListView localListView = (ListView)((Dialog)localObject).findViewById(a.f.bcT);
    localListView.setAdapter(this.rlU);
    localListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6926574288896L, 51607);
        WalletCardImportUI.this.dismissDialog(1);
        paramAnonymousInt = ((Integer)WalletCardImportUI.c(WalletCardImportUI.this).byn().get(paramAnonymousInt)).intValue();
        if (WalletCardImportUI.f(WalletCardImportUI.this) != paramAnonymousInt)
        {
          WalletCardImportUI.a(WalletCardImportUI.this, paramAnonymousInt);
          WalletCardImportUI.g(WalletCardImportUI.this).setText(((CheckedTextView)paramAnonymousView).getText().toString());
          WalletCardImportUI.c(WalletCardImportUI.h(WalletCardImportUI.this), WalletCardImportUI.f(WalletCardImportUI.this));
          WalletCardImportUI.h(WalletCardImportUI.this).baC();
          WalletCardImportUI.i(WalletCardImportUI.this);
        }
        GMTrace.o(6926574288896L, 51607);
      }
    });
    GMTrace.o(6975295324160L, 51970);
    return (Dialog)localObject;
  }
  
  public void onDestroy()
  {
    GMTrace.i(6975161106432L, 51969);
    if ((this.oa != null) && (this.oa.isShowing()))
    {
      this.oa.dismiss();
      this.oa = null;
    }
    super.onDestroy();
    GMTrace.o(6975161106432L, 51969);
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6975026888704L, 51968);
    w.d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : " + paramInt);
    switch (paramInt)
    {
    default: 
      if (this.rlD == null) {
        bzz();
      }
      GMTrace.o(6975026888704L, 51968);
      return false;
    }
    if (this.rlD != null) {
      if ((this.rlD.isEnabled()) && (!this.rlD.isClickable()) && (this.rlD.cmy())) {
        this.rlD.cmA();
      }
    }
    for (;;)
    {
      GMTrace.o(6975026888704L, 51968);
      return true;
      this.rlD.performClick();
      continue;
      bzz();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletCardImportUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */