package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.y.s;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.List;
import java.util.Map;

public class WalletCardElementUI
  extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private String countryCode;
  private String goU;
  private String goV;
  private String mDR;
  private String mDS;
  private Orders opK;
  private Button qXb;
  private Authen qYD;
  private PayInfo qYU;
  a qZB;
  private TextView qeo;
  private com.tencent.mm.sdk.b.c raZ;
  private WalletFormView rbc;
  private TextView rbd;
  private TextView rbe;
  private int rbg;
  private Profession[] rcz;
  private ElementQuery rdw;
  private Profession rdx;
  private WalletFormView rkx;
  private Bankcard rky;
  private WalletFormView rlA;
  private WalletFormView rlB;
  private ScrollView rlC;
  private WalletFormView rlD;
  private WalletFormView rlE;
  private Map<String, a.a> rlF;
  private boolean rlG;
  private CheckBox rlH;
  private CheckBox rlI;
  private String rlJ;
  private boolean rlK;
  private boolean rlL;
  private BaseAdapter rlM;
  private View.OnClickListener rlN;
  private TextView rlg;
  private TextView rlh;
  private TextView rli;
  private TextView rlj;
  private TextView rlk;
  private TextView rll;
  private TextView rlm;
  private TextView rln;
  private WalletFormView rlo;
  private WalletFormView rlp;
  private WalletFormView rlq;
  private WalletFormView rlr;
  private WalletFormView rls;
  private WalletFormView rlt;
  private WalletFormView rlu;
  private WalletFormView rlv;
  private WalletFormView rlw;
  private WalletFormView rlx;
  private WalletFormView rly;
  private WalletFormView rlz;
  
  public WalletCardElementUI()
  {
    GMTrace.i(6998246555648L, 52141);
    this.rlD = null;
    this.rdw = new ElementQuery();
    this.qYD = new Authen();
    this.opK = null;
    this.qYU = null;
    this.rky = null;
    this.rlF = null;
    this.qZB = null;
    this.rlG = false;
    this.rbg = 1;
    this.rlM = new BaseAdapter()
    {
      private Integer wU(int paramAnonymousInt)
      {
        GMTrace.i(6962007769088L, 51871);
        Integer localInteger = (Integer)WalletCardElementUI.d(WalletCardElementUI.this).byn().get(paramAnonymousInt);
        GMTrace.o(6962007769088L, 51871);
        return localInteger;
      }
      
      public final int getCount()
      {
        GMTrace.i(6961873551360L, 51870);
        if (WalletCardElementUI.d(WalletCardElementUI.this).byn() != null)
        {
          int i = WalletCardElementUI.d(WalletCardElementUI.this).byn().size();
          GMTrace.o(6961873551360L, 51870);
          return i;
        }
        GMTrace.o(6961873551360L, 51870);
        return 0;
      }
      
      public final long getItemId(int paramAnonymousInt)
      {
        GMTrace.i(6962141986816L, 51872);
        long l = paramAnonymousInt;
        GMTrace.o(6962141986816L, 51872);
        return l;
      }
      
      public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
      {
        GMTrace.i(6962276204544L, 51873);
        paramAnonymousView = (CheckedTextView)View.inflate(WalletCardElementUI.this, a.g.sPy, null);
        paramAnonymousView.setText(n.byF().J(WalletCardElementUI.this, wU(paramAnonymousInt).intValue()));
        if (WalletCardElementUI.g(WalletCardElementUI.this) == wU(paramAnonymousInt).intValue()) {
          paramAnonymousView.setChecked(true);
        }
        for (;;)
        {
          GMTrace.o(6962276204544L, 51873);
          return paramAnonymousView;
          paramAnonymousView.setChecked(false);
        }
      }
    };
    this.rlN = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6951001915392L, 51789);
        g.ork.i(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
        e.e(WalletCardElementUI.this, n.byx().apc());
        GMTrace.o(6951001915392L, 51789);
      }
    };
    this.raZ = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6998246555648L, 52141);
  }
  
  private boolean QS()
  {
    GMTrace.i(6999857168384L, 52153);
    WalletFormView localWalletFormView = this.rlD;
    this.rlD = null;
    if (!this.rlo.dJ(null))
    {
      if ((this.rlD == null) && (localWalletFormView != this.rlo)) {
        this.rlD = this.rlo;
      }
      this.rlj.setText(a.i.taj);
      this.rlj.setTextColor(getResources().getColor(a.c.aOL));
    }
    for (boolean bool1 = false;; bool1 = true)
    {
      if (!this.rkx.dJ(null))
      {
        if ((this.rlD == null) && (localWalletFormView != this.rkx)) {
          this.rlD = this.rkx;
        }
        bool1 = false;
      }
      if (!this.rlE.dJ(this.rlh))
      {
        if ((this.rlD == null) && (localWalletFormView != this.rlE)) {
          this.rlD = this.rlE;
        }
        bool1 = false;
      }
      int i;
      if ((!this.rbc.dJ(this.rbe)) && (!this.rlG))
      {
        if ((this.rlD == null) && (localWalletFormView != this.rbc)) {
          this.rlD = this.rbc;
        }
        this.rbe.setText(a.i.sJd);
        this.rbe.setTextColor(getResources().getColor(a.c.aOL));
        i = 1;
        bool1 = false;
      }
      for (;;)
      {
        boolean bool2;
        if (!this.rls.dJ(this.rbe)) {
          if (i != 0)
          {
            this.rbe.setText(a.i.tas);
            this.rbe.setTextColor(getResources().getColor(a.c.aOL));
            if ((this.rlD == null) && (localWalletFormView != this.rls)) {
              this.rlD = this.rls;
            }
            bool2 = false;
            label307:
            if (this.rbe.getVisibility() == 4)
            {
              if (!this.rdw.rfN) {
                break label931;
              }
              this.rbe.setText(getString(a.i.taw));
              label342:
              this.rbe.setTextColor(getResources().getColor(a.c.aOa));
              this.rbe.setVisibility(0);
            }
            if (this.rlq.dJ(this.rll)) {
              break label986;
            }
            if ((this.rlD == null) && (localWalletFormView != this.rlq)) {
              this.rlD = this.rlq;
            }
            i = 1;
            bool2 = false;
          }
        }
        for (;;)
        {
          if (!this.rlp.dJ(this.rll))
          {
            if ((this.rlD == null) && (localWalletFormView != this.rlp)) {
              this.rlD = this.rlp;
            }
            bool1 = false;
            label449:
            if (!this.rlH.isChecked()) {
              bool1 = false;
            }
            if (!this.rlv.dJ(this.rlm))
            {
              if ((this.rlD == null) && (localWalletFormView != this.rlv)) {
                this.rlD = this.rlv;
              }
              bool1 = false;
            }
            if (!this.rlw.dJ(this.rlm))
            {
              if ((this.rlD == null) && (localWalletFormView != this.rlw)) {
                this.rlD = this.rlw;
              }
              bool1 = false;
            }
            if (!this.rlx.dJ(this.rlm))
            {
              if ((this.rlD == null) && (localWalletFormView != this.rlx)) {
                this.rlD = this.rlx;
              }
              bool1 = false;
            }
            if (!this.rly.dJ(this.rlm))
            {
              if ((this.rlD == null) && (localWalletFormView != this.rly)) {
                this.rlD = this.rly;
              }
              bool1 = false;
            }
            if (!this.rlz.dJ(this.rlm))
            {
              if ((this.rlD == null) && (localWalletFormView != this.rlz)) {
                this.rlD = this.rlz;
              }
              bool1 = false;
            }
            if (!this.rlA.dJ(this.rlm))
            {
              if ((this.rlD == null) && (localWalletFormView != this.rlA)) {
                this.rlD = this.rlA;
              }
              bool1 = false;
            }
            bool2 = bool1;
            if (!this.rlB.dJ(this.rlm))
            {
              if ((this.rlD == null) && (localWalletFormView != this.rlB)) {
                this.rlD = this.rlB;
              }
              bool2 = false;
            }
            bool1 = bool2;
            if (this.rlL)
            {
              bool1 = bool2;
              if (!this.rlt.dJ(null))
              {
                if ((this.rlD == null) && (localWalletFormView != this.rlt)) {
                  this.rlD = this.rlt;
                }
                bool1 = false;
              }
            }
            bool2 = bool1;
            if (this.rlK)
            {
              bool2 = bool1;
              if (!this.rlu.dJ(null))
              {
                if ((this.rlD == null) && (localWalletFormView != this.rlu)) {
                  this.rlD = this.rlu;
                }
                bool2 = false;
              }
            }
            if (!bool2) {
              break label967;
            }
            this.qXb.setEnabled(true);
            this.qXb.setClickable(true);
            if (localWalletFormView != null) {
              localWalletFormView.setImeOptions(1073741824);
            }
          }
          for (;;)
          {
            GMTrace.o(6999857168384L, 52153);
            return bool2;
            this.rbe.setText(a.i.tat);
            this.rbe.setTextColor(getResources().getColor(a.c.aOL));
            break;
            bool2 = bool1;
            if (i == 0) {
              break label307;
            }
            this.rbe.setVisibility(0);
            bool2 = bool1;
            break label307;
            label931:
            this.rbe.setText(getString(a.i.tay));
            break label342;
            bool1 = bool2;
            if (i == 0) {
              break label449;
            }
            this.rll.setVisibility(4);
            bool1 = bool2;
            break label449;
            label967:
            this.qXb.setEnabled(false);
            this.qXb.setClickable(false);
          }
          label986:
          i = 0;
        }
        i = 0;
      }
    }
  }
  
  private static void a(WalletFormView paramWalletFormView, int paramInt)
  {
    GMTrace.i(7000394039296L, 52157);
    paramWalletFormView = paramWalletFormView.xFw;
    if ((paramWalletFormView instanceof com.tencent.mm.wallet_core.ui.formview.a.a)) {
      ((com.tencent.mm.wallet_core.ui.formview.a.a)paramWalletFormView).ER(paramInt);
    }
    GMTrace.o(7000394039296L, 52157);
  }
  
  private static void a(WalletFormView paramWalletFormView, String paramString)
  {
    GMTrace.i(6998783426560L, 52145);
    if (!bg.nm(paramString))
    {
      KeyListener localKeyListener = paramWalletFormView.getKeyListener();
      paramWalletFormView.setKeyListener(null);
      paramWalletFormView.setEnabled(false);
      paramWalletFormView.setClickable(false);
      paramWalletFormView.setText(paramString);
      paramWalletFormView.setKeyListener(localKeyListener);
      paramWalletFormView.setVisibility(0);
      GMTrace.o(6998783426560L, 52145);
      return;
    }
    paramWalletFormView.setVisibility(8);
    GMTrace.o(6998783426560L, 52145);
  }
  
  private static void a(boolean[] paramArrayOfBoolean, WalletFormView[] paramArrayOfWalletFormView, TextView paramTextView1, TextView paramTextView2)
  {
    GMTrace.i(6999186079744L, 52148);
    a(paramArrayOfBoolean, paramArrayOfWalletFormView, paramTextView1, paramTextView2, false);
    GMTrace.o(6999186079744L, 52148);
  }
  
  private static void a(boolean[] paramArrayOfBoolean, WalletFormView[] paramArrayOfWalletFormView, TextView paramTextView1, TextView paramTextView2, boolean paramBoolean)
  {
    GMTrace.i(6999051862016L, 52147);
    int k = paramArrayOfBoolean.length;
    int i = 0;
    int j = 0;
    if (i < k)
    {
      if (paramArrayOfBoolean[i] != 0)
      {
        j = 1;
        paramArrayOfWalletFormView[i].setVisibility(0);
      }
      for (;;)
      {
        i += 1;
        break;
        paramArrayOfWalletFormView[i].setVisibility(8);
      }
    }
    if (j != 0)
    {
      paramTextView1.setVisibility(0);
      if (paramTextView2 != null)
      {
        if (paramBoolean)
        {
          paramTextView2.setVisibility(8);
          GMTrace.o(6999051862016L, 52147);
          return;
        }
        paramTextView2.setVisibility(4);
        GMTrace.o(6999051862016L, 52147);
      }
    }
    else
    {
      paramTextView1.setVisibility(8);
      if (paramTextView2 != null) {
        paramTextView2.setVisibility(8);
      }
    }
    GMTrace.o(6999051862016L, 52147);
  }
  
  private void ar()
  {
    GMTrace.i(6998649208832L, 52144);
    if (this.rdw == null) {
      this.rdw = new ElementQuery();
    }
    Object localObject1;
    if ((this.rdw != null) && (this.rlF != null) && (this.rlF.containsKey(this.rdw.nDt)))
    {
      localObject1 = (a.a)this.rlF.get(this.rdw.nDt);
      if ((localObject1 == null) || (((a.a)localObject1).rkp == null)) {
        break label1793;
      }
    }
    label277:
    label411:
    label541:
    label954:
    label968:
    label995:
    label1053:
    label1240:
    label1375:
    label1392:
    label1560:
    label1577:
    label1680:
    label1691:
    label1762:
    label1774:
    label1793:
    for (double d = ((a.a)localObject1).rkq;; d = 0.0D)
    {
      localObject1 = getString(a.i.tai, new Object[] { e.s(d) });
      this.rln.setText((CharSequence)localObject1);
      this.rln.setVisibility(0);
      com.tencent.mm.wallet_core.a.ad(this);
      localObject1 = (Bankcard)this.ui.getParcelable("key_bankcard");
      Object localObject2;
      Object localObject3;
      TextView localTextView1;
      TextView localTextView2;
      boolean bool1;
      boolean bool2;
      if ((bzA()) && (localObject1 != null))
      {
        this.rlE.setHint(getString(a.i.tav, new Object[] { ((Bankcard)localObject1).field_bankcardTail }));
        localObject1 = this.rlE;
        localObject2 = this.rlg;
        localObject3 = this.rlh;
        a(new boolean[] { true }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3);
        localObject1 = this.rlo;
        localObject2 = this.rli;
        localObject3 = this.rlj;
        a(new boolean[] { false }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3);
        if (!Bankcard.wP(this.rdw.rcw)) {
          break label968;
        }
        localObject1 = this.rkx;
        localObject2 = this.rlr;
        localObject3 = this.rbc;
        localTextView1 = this.rbd;
        localTextView2 = this.rbe;
        a(new boolean[] { 0, 0, 0 }, new WalletFormView[] { localObject1, localObject2, localObject3 }, localTextView1, localTextView2);
        this.rls.setVisibility(8);
        iU(true);
        this.rlu.setVisibility(8);
        this.rlt.setVisibility(8);
        findViewById(a.f.sJg).setVisibility(8);
        bool1 = this.rdw.rfP;
        bool2 = this.rdw.rfQ;
        localObject1 = this.rlq;
        localObject2 = this.rlp;
        localObject3 = this.rlk;
        localTextView1 = this.rll;
        a(new boolean[] { bool1, bool2 }, new WalletFormView[] { localObject1, localObject2 }, (TextView)localObject3, localTextView1);
        if (this.rlo.getVisibility() != 0) {
          break label1762;
        }
        switch (this.rdw.rfT)
        {
        default: 
          this.rlj.setVisibility(8);
          this.rlj.setTextColor(getResources().getColor(a.c.aOB));
        }
      }
      for (;;)
      {
        if ((bg.nm(this.rdw.rfY)) || (!s.fC(this.rdw.rfY)) || (bzA())) {
          break label1774;
        }
        this.rlI.setText(this.rdw.rfZ);
        this.rlI.setVisibility(0);
        GMTrace.o(6998649208832L, 52144);
        return;
        this.rln.setVisibility(8);
        break;
        if (bg.nm(this.rdw.mhU)) {
          this.rlo.setText("");
        }
        for (;;)
        {
          localObject1 = this.rlE;
          localObject2 = this.rlg;
          localObject3 = this.rlh;
          a(new boolean[] { false }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3, true);
          localObject1 = this.rlo;
          localObject2 = this.rli;
          localObject3 = this.rlj;
          a(new boolean[] { true }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3, true);
          this.rlE.j(this.rlN);
          if (!n.byx().byW().byL()) {
            break label954;
          }
          this.rlE.ogf.setImageResource(a.h.sQZ);
          this.rlE.ogf.setVisibility(0);
          break;
          if (!bg.nm(this.rdw.rfV)) {
            this.rlo.setText(this.rdw.mhU + " " + this.rdw.rfV);
          } else if (2 == this.rdw.rfU) {
            this.rlo.setText(this.rdw.mhU + " " + getString(a.i.tbg));
          } else {
            this.rlo.setText(this.rdw.mhU + " " + getString(a.i.tbv));
          }
        }
        this.rlE.ogf.setVisibility(4);
        break label277;
        if ((this.rdw.byn() != null) && (this.rdw.byn().size() > 0))
        {
          bool1 = true;
          if ((!bzA()) && (!n.byx().byP())) {
            break label1392;
          }
          localObject1 = n.byx().apc();
          if (bg.nm((String)localObject1)) {
            break label1375;
          }
          this.rkx.setHint(getString(a.i.taN, new Object[] { e.Xx((String)localObject1) }));
          localObject1 = this.rkx;
          localObject2 = this.rlr;
          localObject3 = this.rbc;
          localTextView1 = this.rbd;
          localTextView2 = this.rbe;
          a(new boolean[] { true, bool1, true }, new WalletFormView[] { localObject1, localObject2, localObject3 }, localTextView1, localTextView2);
          this.rls.setVisibility(0);
          if (this.rky != null)
          {
            if (!bg.nm(this.rky.field_mobile)) {
              a(this.rls, this.rky.field_mobile);
            }
            if (!bg.nm(this.rky.rei)) {
              a(this.rlq, this.rky.rei);
            }
            if (!bg.nm(this.rky.reH)) {
              a(this.rlp, this.rky.reH);
            }
          }
          if (!this.rdw.rfN) {
            break label1560;
          }
          this.rbe.setText("");
          if ((!bzA()) || (n.byx().byY() <= 0)) {
            break label1577;
          }
          this.rlr.setClickable(false);
          this.rlr.setText(n.byF().J(this, n.byx().byY()));
          this.rlr.setEnabled(false);
          a(this.rbc, this.rbg);
          wT(this.rbg);
          iU(false);
          if (this.rlK) {
            break label1680;
          }
          this.rlu.setVisibility(8);
        }
        for (;;)
        {
          this.rlt.setVisibility(8);
          if ((this.rlK) || (this.rlL)) {
            break label1691;
          }
          findViewById(a.f.sJg).setVisibility(8);
          break;
          bool1 = false;
          break label995;
          this.rkx.setHint(getString(a.i.taM));
          break label1053;
          bool2 = this.rdw.rfN;
          if ((bool1) && (this.rdw.rfO)) {}
          for (bool1 = true;; bool1 = false)
          {
            boolean bool3 = this.rdw.rfO;
            localObject1 = this.rkx;
            localObject2 = this.rlr;
            localObject3 = this.rbc;
            localTextView1 = this.rbd;
            localTextView2 = this.rbe;
            a(new boolean[] { bool2, bool1, bool3 }, new WalletFormView[] { localObject1, localObject2, localObject3 }, localTextView1, localTextView2);
            this.rls.setVisibility(0);
            w.i("MicroMsg.WalletCardElmentUI", "elemt canModifyName:" + this.rdw.rfN + " canModifyIdentity:" + this.rdw.rfO);
            break;
          }
          this.rbe.setText(getString(a.i.tay));
          break label1240;
          if (this.rlM.getCount() <= 1)
          {
            this.rlr.setClickable(false);
            this.rlr.setEnabled(false);
          }
          for (;;)
          {
            localObject1 = this.rdw.byn();
            if ((localObject1 == null) || (!((List)localObject1).contains(Integer.valueOf(this.rbg)))) {
              this.rbg = 1;
            }
            this.rlr.setText(n.byF().J(this, this.rbg));
            break;
            this.rlr.setClickable(true);
            this.rlr.setEnabled(true);
          }
          this.rlu.setVisibility(0);
        }
        findViewById(a.f.sJg).setVisibility(0);
        break label411;
        this.rlj.setText(a.i.tal);
        this.rlj.setVisibility(0);
        break label541;
        this.rlj.setVisibility(8);
        break label541;
        this.rlj.setVisibility(8);
        break label541;
        this.rlj.setVisibility(8);
        break label541;
        this.rlj.setVisibility(8);
      }
      this.rlI.setVisibility(8);
      GMTrace.o(6998649208832L, 52144);
      return;
    }
  }
  
  private boolean bzA()
  {
    GMTrace.i(7000796692480L, 52160);
    boolean bool = this.ui.getBoolean("key_is_forgot_process", false);
    GMTrace.o(7000796692480L, 52160);
    return bool;
  }
  
  private void bzz()
  {
    GMTrace.i(6999320297472L, 52149);
    Object localObject1;
    boolean bool;
    if (QS())
    {
      com.tencent.mm.plugin.wallet_core.e.c.bAa();
      if (!bg.nm(this.rdw.rfY))
      {
        localObject1 = this.ui;
        if ((this.rlI.getVisibility() == 0) && (this.rlI.isChecked()))
        {
          bool = true;
          ((Bundle)localObject1).putBoolean("key_is_follow_bank_username", bool);
          this.ui.putString("key_bank_username", this.rdw.rfY);
        }
      }
      else
      {
        localObject1 = (FavorPayInfo)this.ui.getParcelable("key_favor_pay_info");
        if ((this.rdw != null) && (localObject1 != null) && (this.qZB != null) && (this.rlF != null))
        {
          if (!this.rlF.containsKey(this.rdw.nDt)) {
            break label878;
          }
          ((FavorPayInfo)localObject1).rgo = ((a.a)this.rlF.get(this.rdw.nDt)).rkp.qXN;
          label171:
          this.ui.putParcelable("key_favor_pay_info", (Parcelable)localObject1);
        }
        this.qYD = new Authen();
        if (this.rky != null)
        {
          this.qYD.nDu = this.rky.reI;
          this.qYD.rek = this.rky.field_bankcardTail;
        }
        localObject1 = this.ui.getString("key_card_id");
        if (this.rlE.getVisibility() != 0) {
          break label932;
        }
        localObject1 = this.rlE.getText();
      }
    }
    label525:
    label878:
    label902:
    label913:
    label932:
    for (;;)
    {
      this.qYD.oek = ((PayInfo)this.ui.getParcelable("key_pay_info"));
      this.qYD.reh = ((String)localObject1);
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
      localObject1 = e.Xy(this.qYD.rcs);
      this.ui.putString("key_mobile", (String)localObject1);
      Object localObject2 = this.ui;
      if (this.rdw.rcw == 2)
      {
        bool = true;
        ((Bundle)localObject2).putBoolean("key_is_oversea", bool);
        this.qYD.ref = this.rbc.getText();
        this.qYD.ree = this.rkx.getText();
        this.qYD.rej = this.rlp.getText();
        localObject2 = (FavorPayInfo)this.ui.getParcelable("key_favor_pay_info");
        if (localObject2 != null)
        {
          this.qYD.reo = ((FavorPayInfo)localObject2).rgr;
          this.qYD.rep = ((FavorPayInfo)localObject2).rgo;
        }
        w.d("MicroMsg.WalletCardElmentUI", "payInfo " + this.qYD.oek + " elemt.bankcardTag : " + this.rdw.rcw);
        w.i("MicroMsg.WalletCardElmentUI", " elemt.bankcardTag : " + this.rdw.rcw);
        localObject2 = this.ui;
        ((Bundle)localObject2).putString("key_mobile", (String)localObject1);
        ((Bundle)localObject2).putParcelable("key_authen", this.qYD);
        ((Bundle)localObject2).putString("key_bank_phone", this.rdw.rfX);
        ((Bundle)localObject2).putString("key_country_code", this.countryCode);
        ((Bundle)localObject2).putString("key_province_code", this.goV);
        ((Bundle)localObject2).putString("key_city_code", this.goU);
        ((Bundle)localObject2).putParcelable("key_profession", this.rdx);
        ((Bundle)localObject2).putString("key_bind_card_type", this.qYD.nDt);
        ((Bundle)localObject2).putString("key_bind_card_show1", this.rdw.mhU);
        if (2 != this.rdw.rfU) {
          break label902;
        }
      }
      for (localObject1 = getString(a.i.tbg);; localObject1 = getString(a.i.tbv))
      {
        ((Bundle)localObject2).putString("key_bind_card_show2", (String)localObject1);
        if (!cmq().j(new Object[] { this.qYD, this.opK })) {
          break label913;
        }
        w.i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
        GMTrace.o(6999320297472L, 52149);
        return;
        bool = false;
        break;
        ((FavorPayInfo)localObject1).rgo = this.qZB.aC(((FavorPayInfo)localObject1).rgo, false);
        break label171;
        bool = false;
        break label525;
      }
      w.e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
      GMTrace.o(6999320297472L, 52149);
      return;
    }
  }
  
  private void iU(boolean paramBoolean)
  {
    int j = 0;
    GMTrace.i(6998917644288L, 52146);
    if (paramBoolean)
    {
      Object localObject = this.qeo;
      if (this.rdw.rgb)
      {
        i = 0;
        ((TextView)localObject).setVisibility(i);
        localObject = this.rlv;
        if (!this.rdw.rgb) {
          break label231;
        }
        i = 0;
        label57:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rlw;
        if (!this.rdw.rgc) {
          break label237;
        }
        i = 0;
        label81:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rlx;
        if (!this.rdw.rgd) {
          break label243;
        }
        i = 0;
        label105:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rly;
        if (!this.rdw.rgg) {
          break label249;
        }
        i = 0;
        label129:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rlz;
        if (!this.rdw.rgi) {
          break label255;
        }
        i = 0;
        label153:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rlA;
        if (!this.rdw.rgh) {
          break label261;
        }
        i = 0;
        label177:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rlB;
        if (!this.rdw.rgj) {
          break label267;
        }
      }
      label231:
      label237:
      label243:
      label249:
      label255:
      label261:
      label267:
      for (int i = j;; i = 8)
      {
        ((WalletFormView)localObject).setVisibility(i);
        this.rlm.setVisibility(4);
        GMTrace.o(6998917644288L, 52146);
        return;
        i = 8;
        break;
        i = 8;
        break label57;
        i = 8;
        break label81;
        i = 8;
        break label105;
        i = 8;
        break label129;
        i = 8;
        break label153;
        i = 8;
        break label177;
      }
    }
    this.qeo.setVisibility(8);
    this.rlv.setVisibility(8);
    this.rlw.setVisibility(8);
    this.rlx.setVisibility(8);
    this.rly.setVisibility(8);
    this.rlz.setVisibility(8);
    this.rlA.setVisibility(8);
    this.rlB.setVisibility(8);
    this.rlm.setVisibility(8);
    GMTrace.o(6998917644288L, 52146);
  }
  
  private void wT(int paramInt)
  {
    GMTrace.i(7000528257024L, 52158);
    if (paramInt == 1)
    {
      e(this.rbc, 1, false);
      GMTrace.o(7000528257024L, 52158);
      return;
    }
    e(this.rbc, 1, true);
    GMTrace.o(7000528257024L, 52158);
  }
  
  protected final void MP()
  {
    GMTrace.i(6998514991104L, 52143);
    this.rlg = ((TextView)findViewById(a.f.sJc));
    this.rlE = ((WalletFormView)findViewById(a.f.sJa));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rlE);
    this.rlh = ((TextView)findViewById(a.f.sJb));
    this.rbd = ((TextView)findViewById(a.f.sJe));
    this.rkx = ((WalletFormView)findViewById(a.f.sCF));
    com.tencent.mm.wallet_core.ui.formview.a.e(this, this.rkx);
    this.rls = ((WalletFormView)findViewById(a.f.sCx));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.rls);
    this.rlr = ((WalletFormView)findViewById(a.f.sJr));
    this.rbc = ((WalletFormView)findViewById(a.f.svX));
    com.tencent.mm.wallet_core.ui.formview.a.c(this.rbc);
    this.rbe = ((TextView)findViewById(a.f.sJd));
    this.rli = ((TextView)findViewById(a.f.sIU));
    this.rlo = ((WalletFormView)findViewById(a.f.sJi));
    this.rlj = ((TextView)findViewById(a.f.sIV));
    this.rln = ((TextView)findViewById(a.f.sIY));
    this.rlk = ((TextView)findViewById(a.f.sIX));
    this.rlq = ((WalletFormView)findViewById(a.f.sut));
    com.tencent.mm.wallet_core.ui.formview.a.b(this, this.rlq);
    this.rlp = ((WalletFormView)findViewById(a.f.suu));
    com.tencent.mm.wallet_core.ui.formview.a.a(this, this.rlp);
    this.rll = ((TextView)findViewById(a.f.sIW));
    this.qeo = ((TextView)findViewById(a.f.sIS));
    this.rlv = ((WalletFormView)findViewById(a.f.svP));
    this.rlw = ((WalletFormView)findViewById(a.f.swx));
    this.rlx = ((WalletFormView)findViewById(a.f.spS));
    this.rly = ((WalletFormView)findViewById(a.f.spG));
    this.rlz = ((WalletFormView)findViewById(a.f.sEo));
    this.rlA = ((WalletFormView)findViewById(a.f.sEv));
    this.rlB = ((WalletFormView)findViewById(a.f.svi));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.rlB);
    this.rlm = ((TextView)findViewById(a.f.sIR));
    this.rlH = ((CheckBox)findViewById(a.f.spJ));
    this.rlI = ((CheckBox)findViewById(a.f.spH));
    this.qXb = ((Button)findViewById(a.f.bQR));
    this.rlC = ((ScrollView)findViewById(a.f.cnx));
    this.rlt = ((WalletFormView)findViewById(a.f.sEy));
    this.rlu = ((WalletFormView)findViewById(a.f.sEx));
    this.rkx.xFu = this;
    this.rlE.xFu = this;
    this.rlr.xFu = this;
    this.rbc.xFu = this;
    this.rls.xFu = new WalletFormView.a()
    {
      public final void gR(boolean paramAnonymousBoolean)
      {
        GMTrace.i(6924024152064L, 51588);
        if (!paramAnonymousBoolean)
        {
          WalletCardElementUI.a(WalletCardElementUI.this);
          WalletCardElementUI.this.ui.putParcelable("key_history_bankcard", null);
        }
        WalletCardElementUI.b(WalletCardElementUI.this);
        GMTrace.o(6924024152064L, 51588);
      }
    };
    this.rlq.xFu = this;
    this.rlp.xFu = this;
    this.rlv.xFu = this;
    this.rlw.xFu = this;
    this.rlx.xFu = this;
    this.rly.xFu = this;
    this.rlz.xFu = this;
    this.rlA.xFu = this;
    this.rlB.xFu = this;
    this.rlt.xFu = this;
    this.rlu.xFu = this;
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
    this.rlu.setOnEditorActionListener(this);
    this.rlt.setOnEditorActionListener(this);
    this.rlo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6928184901632L, 51619);
        paramAnonymousView = new Bundle();
        paramAnonymousView.putInt("key_support_bankcard", WalletCardElementUI.this.ui.getInt("key_support_bankcard", 3));
        paramAnonymousView.putInt("key_bind_scene", WalletCardElementUI.this.ui.getInt("key_bind_scene", -1));
        if (!bg.nm(WalletCardElementUI.c(WalletCardElementUI.this).getText()))
        {
          paramAnonymousView.putString("key_bank_type", WalletCardElementUI.d(WalletCardElementUI.this).nDt);
          paramAnonymousView.putInt("key_bankcard_type", WalletCardElementUI.d(WalletCardElementUI.this).rfU);
        }
        com.tencent.mm.wallet_core.b localb = com.tencent.mm.wallet_core.a.ad(WalletCardElementUI.this);
        if (localb != null) {
          localb.a(WalletCardElementUI.this, WalletCardSelectUI.class, paramAnonymousView, 1);
        }
        GMTrace.o(6928184901632L, 51619);
      }
    });
    this.rlr.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6929527078912L, 51629);
        WalletCardElementUI.this.showDialog(1);
        GMTrace.o(6929527078912L, 51629);
      }
    });
    this.rlu.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7021063569408L, 52311);
        paramAnonymousView = new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true).putExtra("ShowSelectedLocation", false);
        if (!Bankcard.wP(WalletCardElementUI.d(WalletCardElementUI.this).rcw))
        {
          paramAnonymousView.putExtra("IsRealNameVerifyScene", true);
          paramAnonymousView.putExtra("IsNeedShowSearchBar", true);
        }
        WalletCardElementUI.this.startActivityForResult(paramAnonymousView, 4);
        GMTrace.o(7021063569408L, 52311);
      }
    });
    this.rlt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6953954705408L, 51811);
        paramAnonymousView = new Intent(WalletCardElementUI.this.vKB.vKW, WalletSelectProfessionUI.class);
        paramAnonymousView.putExtra("key_profession_list", WalletCardElementUI.e(WalletCardElementUI.this));
        WalletCardElementUI.this.startActivityForResult(paramAnonymousView, 5);
        GMTrace.o(6953954705408L, 51811);
      }
    });
    this.rlH.setChecked(true);
    this.rlH.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6983616823296L, 52032);
        WalletCardElementUI.b(WalletCardElementUI.this);
        GMTrace.o(6983616823296L, 52032);
      }
    });
    findViewById(a.f.bdr).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6979321856000L, 52000);
        e.a(WalletCardElementUI.this, WalletCardElementUI.d(WalletCardElementUI.this).nDt, WalletCardElementUI.d(WalletCardElementUI.this).mhU, false, WalletCardElementUI.d(WalletCardElementUI.this).rgm);
        GMTrace.o(6979321856000L, 52000);
      }
    });
    this.rlx.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6962947293184L, 51878);
        paramAnonymousView = new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true).putExtra("ShowSelectedLocation", false);
        if (Bankcard.wP(WalletCardElementUI.d(WalletCardElementUI.this).rcw)) {
          paramAnonymousView.putExtra("IsAutoPosition", false);
        }
        for (;;)
        {
          WalletCardElementUI.this.startActivityForResult(paramAnonymousView, 2);
          GMTrace.o(6962947293184L, 51878);
          return;
          paramAnonymousView.putExtra("IsRealNameVerifyScene", true);
          paramAnonymousView.putExtra("IsNeedShowSearchBar", true);
        }
      }
    });
    this.qXb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7022137311232L, 52319);
        WalletCardElementUI.f(WalletCardElementUI.this);
        GMTrace.o(7022137311232L, 52319);
      }
    });
    e(this.rlE, 0, false);
    e(this.rbc, 1, false);
    e(this.rls, 0, false);
    if ((this.rdw != null) && (!bg.nm(this.rdw.rga)))
    {
      com.tencent.mm.ui.base.h.a(this, this.rdw.rga, null, true, null);
      this.rdw = null;
    }
    for (;;)
    {
      ar();
      QS();
      Object localObject = com.tencent.mm.wallet_core.a.ad(this);
      if ((localObject == null) || (!((com.tencent.mm.wallet_core.b)localObject).clC())) {
        break label1204;
      }
      localObject = (Orders)this.ui.getParcelable("key_orders");
      if ((localObject == null) || (((Orders)localObject).rhf != 1)) {
        break;
      }
      this.rlG = true;
      this.rkx.setText(e.Xx(((Orders)localObject).ree));
      this.rkx.setEnabled(false);
      this.rkx.setFocusable(false);
      this.rbg = ((Orders)localObject).rhh;
      this.rlr.setText(n.byF().J(this, this.rbg));
      this.rlr.setEnabled(false);
      this.rbc.setText(((Orders)localObject).rhg);
      this.rbc.setEnabled(false);
      this.rbc.setFocusable(false);
      this.rbd.setText(a.i.tah);
      this.rls.cmA();
      GMTrace.o(6998514991104L, 52143);
      return;
      if ((this.ui.getInt("key_bind_scene", -1) == 5) && (!this.rdw.rgn))
      {
        com.tencent.mm.ui.base.h.a(this, getString(a.i.thx), null, true, null);
        this.rdw.mhU = null;
      }
    }
    this.rlG = false;
    label1204:
    GMTrace.o(6998514991104L, 52143);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7000662474752L, 52159);
    GMTrace.o(7000662474752L, 52159);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6999454515200L, 52150);
    w.i("MicroMsg.WalletCardElmentUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.ui;
      w.d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.qYU);
      if ((paramk instanceof o))
      {
        w.i("MicroMsg.WalletCardElmentUI", "query bound bank card resp, forwardProcess");
        com.tencent.mm.wallet_core.a.i(this, paramString);
        GMTrace.o(6999454515200L, 52150);
        return true;
      }
      GMTrace.o(6999454515200L, 52150);
      return false;
    }
    GMTrace.o(6999454515200L, 52150);
    return false;
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(6999991386112L, 52154);
    QS();
    GMTrace.o(6999991386112L, 52154);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6999588732928L, 52151);
    int i = a.g.sPb;
    GMTrace.o(6999588732928L, 52151);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6999722950656L, 52152);
    w.i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(6999722950656L, 52152);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      QS();
      GMTrace.o(6999722950656L, 52152);
      return;
      this.rdw = ((ElementQuery)paramIntent.getParcelableExtra("elemt_query"));
      this.rky = null;
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
        label307:
        if ((!"US".equals(str2)) && (!"CA".equals(str2)) && (!this.rdw.rgh)) {
          break label494;
        }
        this.rlA.setVisibility(0);
      }
      for (;;)
      {
        w.i("MicroMsg.WalletCardElmentUI", "onActivityResult for address countryName %s,countryCode %s, provinceName %s, cityName %s, mCity %s", new Object[] { str1, str2, str3, str4, this.mDS });
        break;
        if (!bg.nm(paramIntent.getStringExtra("Contact_Province")))
        {
          this.mDS = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
          this.rlx.setText(str1 + " " + str3);
          break label307;
        }
        this.mDS = this.rlJ;
        this.rlx.setText(str1);
        break label307;
        label494:
        this.rlA.setVisibility(8);
      }
      paramIntent = paramIntent.getStringExtra("key_bankcard_id");
      this.rlE.XF(paramIntent);
      continue;
      str1 = paramIntent.getStringExtra("CountryName");
      str2 = paramIntent.getStringExtra("ProviceName");
      str3 = paramIntent.getStringExtra("CityName");
      this.countryCode = paramIntent.getStringExtra("Country");
      this.goV = paramIntent.getStringExtra("Contact_Province");
      this.goU = paramIntent.getStringExtra("Contact_City");
      paramIntent = new StringBuilder();
      if (!bg.nm(str1)) {
        paramIntent.append(str1);
      }
      if (!bg.nm(str2)) {
        paramIntent.append(" ").append(str2);
      }
      if (!bg.nm(str3)) {
        paramIntent.append(" ").append(str3);
      }
      this.rlu.setText(paramIntent.toString());
      continue;
      this.rdx = ((Profession)paramIntent.getParcelableExtra("key_select_profession"));
      this.rlt.setText(this.rdx.rdP);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6998380773376L, 52142);
    super.onCreate(paramBundle);
    this.rdw = ((ElementQuery)this.ui.getParcelable("elemt_query"));
    this.opK = ((Orders)this.ui.getParcelable("key_orders"));
    this.qYU = ((PayInfo)this.ui.getParcelable("key_pay_info"));
    this.rbg = n.byx().byY();
    this.rky = ((Bankcard)this.ui.getParcelable("key_history_bankcard"));
    this.rlK = this.ui.getBoolean("key_need_area", false);
    if ((this.rlK) || (this.rlL))
    {
      oM(a.i.tby);
      if (this.qYU == null) {
        this.qYU = new PayInfo();
      }
      w.d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.qYU);
      paramBundle = (FavorPayInfo)this.ui.getParcelable("key_favor_pay_info");
      if ((this.opK != null) && (paramBundle != null))
      {
        this.qZB = b.rks.a(this.opK);
        if (this.qZB == null) {
          break label296;
        }
        paramBundle = this.qZB.Kw(paramBundle.rgo);
        this.rlF = this.qZB.Ks(paramBundle);
      }
    }
    for (;;)
    {
      MP();
      this.rlC.pageScroll(33);
      com.tencent.mm.plugin.wallet_core.e.c.b(this, this.ui, 3);
      com.tencent.mm.sdk.b.a.vgX.b(this.raZ);
      GMTrace.o(6998380773376L, 52142);
      return;
      oM(a.i.tbx);
      break;
      label296:
      w.w("MicroMsg.WalletCardElmentUI", " get favorLogicHelper null");
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7000259821568L, 52156);
    com.tencent.mm.sdk.b.a.vgX.c(this.raZ);
    super.onDestroy();
    GMTrace.o(7000259821568L, 52156);
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    GMTrace.i(7000125603840L, 52155);
    w.d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : " + paramInt);
    switch (paramInt)
    {
    default: 
      if (this.rlD == null) {
        bzz();
      }
      GMTrace.o(7000125603840L, 52155);
      return false;
    }
    boolean bool1;
    if (this.rlD != null)
    {
      paramTextView = this.rlD;
      if (paramTextView.xFt != null)
      {
        bool1 = paramTextView.xFt.isFocusable();
        if (!bool1) {
          break label175;
        }
        paramTextView = this.rlD;
        bool1 = bool2;
        if (paramTextView.xFt != null) {
          bool1 = paramTextView.xFt.isClickable();
        }
        if ((!bool1) || (!this.rlD.cmy())) {
          break label175;
        }
        this.rlD.cmA();
      }
    }
    for (;;)
    {
      GMTrace.o(7000125603840L, 52155);
      return true;
      bool1 = false;
      break;
      label175:
      this.rlD.performClick();
      continue;
      bzz();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletCardElementUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */