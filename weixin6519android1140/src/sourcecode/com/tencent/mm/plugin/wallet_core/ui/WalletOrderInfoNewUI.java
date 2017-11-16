package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.am;
import com.tencent.mm.g.a.an;
import com.tencent.mm.g.a.ij;
import com.tencent.mm.g.a.ij.a;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.sp;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wxpay.a.b;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoNewUI
  extends WalletOrderInfoUI
{
  private String hyD;
  private String iAx;
  private String nAz;
  private com.tencent.mm.sdk.b.c nCD;
  private String nFJ;
  private TextView opN;
  private String opd;
  private Orders qYC;
  private PayInfo qYU;
  private int rhb;
  private boolean rkJ;
  private String rkK;
  private String rkL;
  private b rkN;
  private HashMap<String, a> rkO;
  private String rkP;
  private String rkR;
  private Button rkS;
  private ImageView rkT;
  private ViewGroup rkU;
  private CdnImageView rkV;
  private TextView rkW;
  private TextView rkX;
  private View rkY;
  private Button rkZ;
  private ViewGroup rla;
  private boolean rlb;
  private boolean rlc;
  private boolean rld;
  private com.tencent.mm.wallet_core.b rle;
  private Set<String> rmZ;
  private List<Orders.Commodity> rna;
  private Orders.RecommendTinyAppInfo rnb;
  private String rnc;
  private Orders.b rnd;
  private TextView rne;
  private TextView rnf;
  private WalletTextView rng;
  private TextView rnh;
  private ViewGroup rni;
  private ViewGroup rnj;
  private ViewGroup rnk;
  private ViewGroup rnl;
  private ViewGroup rnm;
  private ViewGroup rnn;
  private ViewGroup rno;
  private TextView rnp;
  private CheckBox rnq;
  private ViewGroup rnr;
  private CdnImageView rns;
  private TextView rnt;
  private TextView rnu;
  private Button rnv;
  private com.tencent.mm.sdk.b.c rnw;
  
  public WalletOrderInfoNewUI()
  {
    GMTrace.i(6936909053952L, 51684);
    this.iAx = null;
    this.nFJ = null;
    this.rkJ = false;
    this.rmZ = null;
    this.hyD = "";
    this.rna = null;
    this.rkO = new HashMap();
    this.rnd = null;
    this.rkR = "-1";
    this.rlb = false;
    this.rlc = false;
    this.rld = false;
    this.nCD = new com.tencent.mm.sdk.b.c() {};
    this.rnw = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6936909053952L, 51684);
  }
  
  private void Kz(String paramString)
  {
    GMTrace.i(17094909362176L, 127367);
    bzy();
    com.tencent.mm.wallet_core.ui.e.m(this, paramString, false);
    GMTrace.o(17094909362176L, 127367);
  }
  
  private void b(Orders paramOrders)
  {
    GMTrace.i(6938519666688L, 51696);
    this.rmZ.clear();
    if ((paramOrders == null) || (paramOrders.rhv == null))
    {
      w.w("MicroMsg.WalletOrderInfoNewUI", "hy: orders is null");
      GMTrace.o(6938519666688L, 51696);
      return;
    }
    paramOrders = paramOrders.rhv.iterator();
    while (paramOrders.hasNext())
    {
      Orders.Commodity localCommodity = (Orders.Commodity)paramOrders.next();
      if ((localCommodity.rhm == 2) && (!bg.nm(localCommodity.rhK)))
      {
        w.i("MicroMsg.WalletOrderInfoNewUI", "hy: has username and is force recommend");
        this.rmZ.add(localCommodity.rhK);
      }
    }
    GMTrace.o(6938519666688L, 51696);
  }
  
  private void bzC()
  {
    GMTrace.i(14549201715200L, 108400);
    this.rni.setVisibility(8);
    this.rnj.setVisibility(8);
    this.rnk.setVisibility(8);
    this.rnl.setVisibility(8);
    if ((this.qYC != null) && (this.rna != null) && (this.rna.size() > 0))
    {
      Orders.Commodity localCommodity = (Orders.Commodity)this.rna.get(0);
      List localList = localCommodity.rhM;
      if (localList != null) {}
      for (int i = localList.size();; i = 0)
      {
        w.i("MicroMsg.WalletOrderInfoNewUI", "discountInfoList: %s, size: %s", new Object[] { localList, Integer.valueOf(i) });
        if ((localList == null) || (localList.size() <= 0)) {
          break label310;
        }
        this.rnj.removeAllViews();
        i = 0;
        while (i < localList.size())
        {
          Orders.DiscountInfo localDiscountInfo = (Orders.DiscountInfo)localList.get(i);
          TextView localTextView = new TextView(this.vKB.vKW);
          localTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
          localTextView.setTextSize(1, 12.0F);
          localTextView.setTextColor(Color.parseColor("#FA962A"));
          localTextView.setText(localDiscountInfo.qXr + com.tencent.mm.wallet_core.ui.e.d(localDiscountInfo.rhY / 100.0D, this.qYC.nEr));
          this.rnj.addView(localTextView);
          i += 1;
        }
      }
      this.rnj.setVisibility(0);
      this.rni.setVisibility(0);
      this.rnk.setVisibility(0);
      label310:
      if ((localCommodity.rhJ >= 0.0D) && (localCommodity.jWS < localCommodity.rhJ))
      {
        this.rnh.setText(com.tencent.mm.wallet_core.ui.e.d(localCommodity.rhJ, localCommodity.nEr));
        this.rnh.getPaint().setFlags(16);
        this.rnl.setVisibility(0);
        this.rni.setVisibility(0);
      }
    }
    GMTrace.o(14549201715200L, 108400);
  }
  
  private void bzD()
  {
    GMTrace.i(6937714360320L, 51690);
    this.rno.setVisibility(8);
    Orders.Commodity localCommodity;
    Orders.b localb;
    if (this.qYC != null)
    {
      b(this.qYC);
      if ((this.rna != null) && (this.rna.size() > 0))
      {
        localCommodity = (Orders.Commodity)this.rna.get(0);
        w.i("MicroMsg.WalletOrderInfoNewUI", "setSubscribeBizInfo, hasSubscribeBiz: %s", new Object[] { Boolean.valueOf(localCommodity.rhS) });
        if ((localCommodity.rhS) && (localCommodity.rhR != null) && (localCommodity.rhR.size() > 0))
        {
          Iterator localIterator = localCommodity.rhR.iterator();
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
            localb = (Orders.b)localIterator.next();
          } while (localb.type != Orders.rhH);
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.WalletOrderInfoNewUI", "subscribePromotions: %s", new Object[] { localb });
      if ((localb != null) && (!bg.nm(localb.nEs)))
      {
        this.opd = localCommodity.eRP;
        com.tencent.mm.plugin.report.service.g.ork.i(13033, new Object[] { Integer.valueOf(1), localb.nEs, localb.url, localb.name, this.opd });
        this.rnp.setText(localb.name);
        this.rnc = localb.nEs;
        this.rnq.setVisibility(0);
        if (!this.rmZ.contains(localb.nEs)) {
          break label323;
        }
        this.rnq.setChecked(true);
      }
      for (;;)
      {
        this.rno.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6932211433472L, 51649);
            if (!bg.nm(WalletOrderInfoNewUI.i(WalletOrderInfoNewUI.this)))
            {
              if (WalletOrderInfoNewUI.j(WalletOrderInfoNewUI.this).contains(WalletOrderInfoNewUI.i(WalletOrderInfoNewUI.this)))
              {
                WalletOrderInfoNewUI.j(WalletOrderInfoNewUI.this).remove(WalletOrderInfoNewUI.i(WalletOrderInfoNewUI.this));
                WalletOrderInfoNewUI.k(WalletOrderInfoNewUI.this).setChecked(false);
                GMTrace.o(6932211433472L, 51649);
                return;
              }
              WalletOrderInfoNewUI.j(WalletOrderInfoNewUI.this).add(WalletOrderInfoNewUI.i(WalletOrderInfoNewUI.this));
              WalletOrderInfoNewUI.k(WalletOrderInfoNewUI.this).setChecked(true);
            }
            GMTrace.o(6932211433472L, 51649);
          }
        });
        this.rno.setVisibility(0);
        GMTrace.o(6937714360320L, 51690);
        return;
        label323:
        this.rnq.setChecked(false);
      }
      localb = null;
    }
  }
  
  private void bzv()
  {
    GMTrace.i(6937445924864L, 51688);
    int j = 0;
    if (this.rkU.getVisibility() == 0) {
      j = 1;
    }
    int i = j;
    if (this.rni.getVisibility() == 0) {
      i = j + 1;
    }
    j = i;
    if (this.rno.getVisibility() == 0) {
      j = i + 1;
    }
    if (this.rnr.getVisibility() == 0) {}
    for (i = j + 1;; i = j)
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams1 = (ViewGroup.MarginLayoutParams)this.rkT.getLayoutParams();
      ViewGroup.MarginLayoutParams localMarginLayoutParams2 = (ViewGroup.MarginLayoutParams)this.rne.getLayoutParams();
      if (i >= 3)
      {
        i = com.tencent.mm.br.a.fromDPToPix(this, 40);
        localMarginLayoutParams1.topMargin = i;
      }
      for (localMarginLayoutParams2.topMargin = i;; localMarginLayoutParams2.topMargin = i)
      {
        this.rkT.setLayoutParams(localMarginLayoutParams1);
        this.rne.setLayoutParams(localMarginLayoutParams2);
        this.rla.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6987240701952L, 52059);
            int k = WalletOrderInfoNewUI.e(WalletOrderInfoNewUI.this).getHeight();
            int m = WalletOrderInfoNewUI.this.findViewById(a.f.sGV).getHeight();
            int i;
            int j;
            label64:
            label83:
            int n;
            ViewGroup.MarginLayoutParams localMarginLayoutParams;
            if (WalletOrderInfoNewUI.f(WalletOrderInfoNewUI.this).getVisibility() == 0)
            {
              i = 1;
              if (WalletOrderInfoNewUI.g(WalletOrderInfoNewUI.this).getVisibility() != 0) {
                break label255;
              }
              j = 1;
              if ((i == 0) || (j == 0)) {
                break label260;
              }
              i = WalletOrderInfoNewUI.f(WalletOrderInfoNewUI.this).getBottom();
              j = k;
              if (WalletOrderInfoNewUI.h(WalletOrderInfoNewUI.this).getVisibility() != 0)
              {
                j = k;
                if (WalletOrderInfoNewUI.c(WalletOrderInfoNewUI.this).getVisibility() != 0) {
                  j = k + com.tencent.mm.br.a.fromDPToPix(WalletOrderInfoNewUI.this, 70);
                }
              }
              k = m - i - j;
              n = com.tencent.mm.br.a.fromDPToPix(WalletOrderInfoNewUI.this, 50);
              w.i("MicroMsg.WalletOrderInfoNewUI", "autoAdjustLayout inner, height: %s, topViewPos: %s, contentHeight: %s, topMargin: %s, 50dp: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(n) });
              localMarginLayoutParams = (ViewGroup.MarginLayoutParams)WalletOrderInfoNewUI.e(WalletOrderInfoNewUI.this).getLayoutParams();
              if (k <= n) {
                break label313;
              }
            }
            label255:
            label260:
            label313:
            for (localMarginLayoutParams.topMargin = k;; localMarginLayoutParams.topMargin = n)
            {
              WalletOrderInfoNewUI.e(WalletOrderInfoNewUI.this).setLayoutParams(localMarginLayoutParams);
              WalletOrderInfoNewUI.e(WalletOrderInfoNewUI.this).setVisibility(0);
              GMTrace.o(6987240701952L, 52059);
              return;
              i = 0;
              break;
              j = 0;
              break label64;
              if (j != 0)
              {
                i = WalletOrderInfoNewUI.g(WalletOrderInfoNewUI.this).getBottom();
                break label83;
              }
              if (i != 0)
              {
                i = WalletOrderInfoNewUI.f(WalletOrderInfoNewUI.this).getBottom();
                break label83;
              }
              i = WalletOrderInfoNewUI.this.findViewById(a.f.sDI).getBottom();
              break label83;
            }
          }
        });
        GMTrace.o(6937445924864L, 51688);
        return;
        i = com.tencent.mm.br.a.fromDPToPix(this, 70);
        localMarginLayoutParams1.topMargin = i;
      }
    }
  }
  
  private void bzw()
  {
    GMTrace.i(6937580142592L, 51689);
    if ((this.qYC != null) && (this.rna != null) && (this.rna.size() > 0))
    {
      Iterator localIterator = this.rna.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!"1".equals(((Orders.Commodity)localIterator.next()).nEk));
    }
    for (int i = 0;; i = 1)
    {
      this.opN.setVisibility(0);
      if (i != 0)
      {
        if ((!bg.nm(this.qYC.rho)) && (!bg.nm(this.qYC.rho.trim())))
        {
          this.opN.setText(this.qYC.rho);
          GMTrace.o(6937580142592L, 51689);
          return;
        }
        if (this.qYC.rcw != 1)
        {
          this.opN.setText(a.i.tdq);
          GMTrace.o(6937580142592L, 51689);
          return;
        }
        this.opN.setText(a.i.tdp);
        GMTrace.o(6937580142592L, 51689);
        return;
      }
      this.opN.setText(a.i.tdr);
      GMTrace.o(6937580142592L, 51689);
      return;
    }
  }
  
  private void bzy()
  {
    int i = 0;
    GMTrace.i(6939190755328L, 51701);
    if (!this.rkJ)
    {
      ij localij = new ij();
      localij.eLM.eLN = 4;
      ij.a locala = localij.eLM;
      if (this.ui.getBoolean("intent_pay_end", false)) {
        i = -1;
      }
      locala.aGY = i;
      com.tencent.mm.sdk.b.a.vgX.m(localij);
      this.rkJ = true;
    }
    GMTrace.o(6939190755328L, 51701);
  }
  
  private void iX(boolean paramBoolean)
  {
    GMTrace.i(18829673496576L, 140292);
    this.rkU.setVisibility(8);
    this.rlc = false;
    this.rlb = false;
    final Object localObject2;
    Object localObject3;
    Object localObject1;
    if (this.qYC != null) {
      if ((this.rna != null) && (this.rna.size() > 0))
      {
        localObject2 = (Orders.Commodity)this.rna.get(0);
        if (localObject2 != null)
        {
          w.i("MicroMsg.WalletOrderInfoNewUI", "setTinyAppActivityInfo, hasSubscribeBiz: %s", new Object[] { Boolean.valueOf(((Orders.Commodity)localObject2).rhS) });
          if ((((Orders.Commodity)localObject2).rhR == null) || (((Orders.Commodity)localObject2).rhR.size() <= 0)) {
            break label1632;
          }
          localObject3 = ((Orders.Commodity)localObject2).rhR.iterator();
          do
          {
            if (!((Iterator)localObject3).hasNext()) {
              break;
            }
            localObject1 = (Orders.b)((Iterator)localObject3).next();
          } while (((Orders.b)localObject1).type != Orders.rhI);
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.WalletOrderInfoNewUI", "activityPromotions: %s", new Object[] { localObject1 });
      Object localObject4;
      label458:
      int i;
      if ((localObject1 != null) && (((Orders.b)localObject1).rgN > 0L) && (!bg.nm(((Orders.b)localObject1).rgT)))
      {
        this.rnd = ((Orders.b)localObject1);
        this.rkY.setVisibility(8);
        this.rkV.twF = true;
        this.rkZ.setEnabled(true);
        this.rkZ.setBackgroundResource(a.e.aUF);
        this.rkX.setCompoundDrawables(null, null, null, null);
        localObject3 = (a)this.rkO.get(((Orders.b)localObject1).rgN);
        if (localObject3 != null)
        {
          if (!bg.nm(((a)localObject3).eQA)) {
            this.rkV.setUrl(((a)localObject3).eQA);
          }
          if (!bg.nm(((a)localObject3).eLQ)) {
            this.rkW.setText(((a)localObject3).eLQ);
          }
          if (!bg.nm(((a)localObject3).rnz))
          {
            this.rkZ.setText(((a)localObject3).rnz);
            this.rkZ.setBackgroundResource(a.e.sph);
          }
          if (!bg.nm(((a)localObject3).rgY)) {
            this.rnd.rid = ((a)localObject3).rgY;
          }
          if (!bg.nm(((a)localObject3).rgZ)) {
            this.rnd.rie = ((a)localObject3).rgZ;
          }
          localObject4 = (RelativeLayout.LayoutParams)this.rkX.getLayoutParams();
          if ((localObject3 == null) || (bg.nm(((a)localObject3).title))) {
            break label914;
          }
          this.rkX.setText(((a)localObject3).title);
          ((RelativeLayout.LayoutParams)localObject4).addRule(15, 0);
          this.rkX.setLayoutParams((ViewGroup.LayoutParams)localObject4);
          this.rkZ.setVisibility(0);
          this.rkZ.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(17094104055808L, 127361);
              w.i("MicroMsg.WalletOrderInfoNewUI", "click activity button");
              WalletOrderInfoNewUI.p(WalletOrderInfoNewUI.this);
              GMTrace.o(17094104055808L, 127361);
            }
          });
          if (((Orders.b)localObject1).ria != 1) {
            this.rkU.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(17096385757184L, 127378);
                w.i("MicroMsg.WalletOrderInfoNewUI", "click activity layout");
                WalletOrderInfoNewUI.p(WalletOrderInfoNewUI.this);
                GMTrace.o(17096385757184L, 127378);
              }
            });
          }
          localObject3 = this.rkR;
          i = -1;
          switch (((String)localObject3).hashCode())
          {
          default: 
            switch (i)
            {
            default: 
              label584:
              label604:
              localObject3 = (ViewGroup.MarginLayoutParams)this.rkU.getLayoutParams();
              localObject4 = ((Orders.Commodity)localObject2).rhM;
              if (((((Orders.Commodity)localObject2).rhJ >= 0.0D) && (((Orders.Commodity)localObject2).jWS < ((Orders.Commodity)localObject2).rhJ)) || ((localObject4 != null) && (((List)localObject4).size() > 0)))
              {
                ((ViewGroup.MarginLayoutParams)localObject3).topMargin = 0;
                label668:
                this.rkU.setLayoutParams((ViewGroup.LayoutParams)localObject3);
                this.rkU.setVisibility(0);
                if (paramBoolean)
                {
                  localObject3 = com.tencent.mm.plugin.report.service.g.ork;
                  localObject4 = this.opd;
                  i = ((Orders.b)localObject1).ria;
                  if (!this.rkR.equals("-1")) {
                    break label1086;
                  }
                  localObject2 = Integer.valueOf(5);
                  label723:
                  ((com.tencent.mm.plugin.report.service.g)localObject3).i(13471, new Object[] { localObject4, Integer.valueOf(1), Integer.valueOf(i), localObject2, Long.valueOf(((Orders.b)localObject1).rgN), Long.valueOf(((Orders.b)localObject1).rgS) });
                }
              }
              break;
            }
            break;
          }
        }
      }
      for (;;)
      {
        if (this.rkW.getVisibility() == 0)
        {
          this.rkW.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19001472188416L, 141572);
              if ((WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getVisibility() == 0) && (WalletOrderInfoNewUI.s(WalletOrderInfoNewUI.this).getRight() >= WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getLeft()) && (!bg.L(WalletOrderInfoNewUI.s(WalletOrderInfoNewUI.this).getText())))
              {
                float f1 = WalletOrderInfoNewUI.s(WalletOrderInfoNewUI.this).getTextSize();
                w.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", new Object[] { Integer.valueOf(WalletOrderInfoNewUI.s(WalletOrderInfoNewUI.this).getRight()), Integer.valueOf(WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getLeft()) });
                Paint localPaint = new Paint();
                localPaint.setTextSize(f1);
                String str = WalletOrderInfoNewUI.s(WalletOrderInfoNewUI.this).getText().toString();
                f1 = localPaint.measureText(str);
                float f2 = WalletOrderInfoNewUI.s(WalletOrderInfoNewUI.this).getRight() - WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getLeft();
                int i = 1;
                while ((localPaint.measureText(str.substring(0, str.length() - i - 1)) > f1 - f2) && (i <= str.length() - 1)) {
                  i += 1;
                }
                w.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(str.length()) });
                WalletOrderInfoNewUI.s(WalletOrderInfoNewUI.this).setText(str.substring(0, str.length() - i - 1));
                WalletOrderInfoNewUI.s(WalletOrderInfoNewUI.this).append("...");
              }
              GMTrace.o(19001472188416L, 141572);
            }
          });
          if (this.rkZ.getVisibility() == 0)
          {
            localObject1 = this.rkW.getText();
            if ((!bg.L((CharSequence)localObject1)) && (((CharSequence)localObject1).length() > 9))
            {
              this.rkW.setText(((CharSequence)localObject1).subSequence(0, 9));
              this.rkW.append("...");
            }
            GMTrace.o(18829673496576L, 140292);
            return;
            this.rkV.setUrl(((Orders.b)localObject1).nIR);
            this.rkW.setText(((Orders.b)localObject1).name);
            this.rkZ.setText(((Orders.b)localObject1).rgT);
            break;
            label914:
            if (!bg.nm(((Orders.b)localObject1).title))
            {
              this.rkX.setText(((Orders.b)localObject1).title);
              ((RelativeLayout.LayoutParams)localObject4).addRule(15, 0);
              break label458;
            }
            this.rkX.setVisibility(8);
            ((RelativeLayout.LayoutParams)localObject4).addRule(15, -1);
            break label458;
            if (!((String)localObject3).equals("0")) {
              break label584;
            }
            i = 0;
            break label584;
            if (!((String)localObject3).equals("-1")) {
              break label584;
            }
            i = 1;
            break label584;
            if (!((String)localObject3).equals("3")) {
              break label584;
            }
            i = 2;
            break label584;
            if (!((String)localObject3).equals("4")) {
              break label584;
            }
            i = 3;
            break label584;
            if (!((String)localObject3).equals("2")) {
              break label584;
            }
            i = 4;
            break label584;
            if (!((String)localObject3).equals("1")) {
              break label584;
            }
            i = 5;
            break label584;
            this.rkZ.setEnabled(false);
            break label604;
            ((ViewGroup.MarginLayoutParams)localObject3).topMargin = com.tencent.mm.br.a.fromDPToPix(this, 50);
            break label668;
            label1086:
            localObject2 = this.rkR;
            break label723;
            if ((((Orders.Commodity)localObject2).rhQ == null) || (bg.nm(((Orders.Commodity)localObject2).rhQ.rgY))) {
              continue;
            }
            this.rkK = ((Orders.Commodity)localObject2).rhQ.rgY;
            this.rkL = ((Orders.Commodity)localObject2).rhQ.rgZ;
            this.rhb = ((Orders.Commodity)localObject2).rhQ.rhb;
            this.rnb = ((Orders.Commodity)localObject2).rhQ;
            this.rkV.setUrl(((Orders.Commodity)localObject2).rhQ.rgW);
            this.rkW.setText(((Orders.Commodity)localObject2).rhQ.rgX);
            this.rkX.setText(getString(a.i.sZb));
            this.rkX.setVisibility(0);
            this.rkV.twF = true;
            this.rkZ.setEnabled(true);
            this.rkZ.setBackgroundResource(a.e.aUF);
            localObject1 = (RelativeLayout.LayoutParams)this.rkX.getLayoutParams();
            ((RelativeLayout.LayoutParams)localObject1).addRule(15, 0);
            this.rkX.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            if (((Orders.Commodity)localObject2).rhQ.rig > 0L)
            {
              if (!bg.nm(((Orders.Commodity)localObject2).rhQ.rha))
              {
                this.rkZ.setVisibility(0);
                this.rkZ.setText(((Orders.Commodity)localObject2).rhQ.rha);
                this.rkY.setVisibility(8);
              }
              localObject1 = (a)this.rkO.get(((Orders.Commodity)localObject2).rhQ.rig);
              if (localObject1 != null)
              {
                if (!bg.nm(((a)localObject1).rgW)) {
                  this.rkV.setUrl(((a)localObject1).rgW);
                }
                if (!bg.nm(((a)localObject1).rgX)) {
                  this.rkW.setText(((a)localObject1).rgX);
                }
                if (!bg.nm(((a)localObject1).rha))
                {
                  this.rkZ.setText(((a)localObject1).rha);
                  this.rkZ.setBackgroundResource(a.e.sph);
                }
                if (!bg.nm(((a)localObject1).rgY)) {
                  this.rkK = ((a)localObject1).rgY;
                }
                if (!bg.nm(((a)localObject1).rgZ)) {
                  this.rkL = ((a)localObject1).rgZ;
                }
              }
              label1470:
              localObject1 = new View.OnClickListener()
              {
                public final void onClick(View paramAnonymousView)
                {
                  GMTrace.i(17094372491264L, 127363);
                  w.i("MicroMsg.WalletOrderInfoNewUI", "click tiny app, userName: %s, path: %s, version: %s", new Object[] { WalletOrderInfoNewUI.l(WalletOrderInfoNewUI.this), WalletOrderInfoNewUI.m(WalletOrderInfoNewUI.this), Integer.valueOf(WalletOrderInfoNewUI.q(WalletOrderInfoNewUI.this)) });
                  paramAnonymousView = new qi();
                  paramAnonymousView.eUY.userName = WalletOrderInfoNewUI.l(WalletOrderInfoNewUI.this);
                  paramAnonymousView.eUY.eVa = bg.aq(WalletOrderInfoNewUI.m(WalletOrderInfoNewUI.this), "");
                  paramAnonymousView.eUY.scene = 1034;
                  paramAnonymousView.eUY.eVb = 0;
                  if (WalletOrderInfoNewUI.q(WalletOrderInfoNewUI.this) > 0) {
                    paramAnonymousView.eUY.eVc = WalletOrderInfoNewUI.q(WalletOrderInfoNewUI.this);
                  }
                  com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
                  paramAnonymousView = WalletOrderInfoNewUI.this;
                  if ((!bg.nm(localObject2.rhQ.rha)) && (localObject2.rhQ.rig > 0L)) {}
                  for (boolean bool = true;; bool = false)
                  {
                    WalletOrderInfoNewUI.a(paramAnonymousView, bool);
                    if (!WalletOrderInfoNewUI.n(WalletOrderInfoNewUI.this)) {
                      break;
                    }
                    com.tencent.mm.plugin.report.service.g.ork.i(14118, new Object[] { WalletOrderInfoNewUI.o(WalletOrderInfoNewUI.this), WalletOrderInfoNewUI.this.bxg(), Integer.valueOf(3) });
                    GMTrace.o(17094372491264L, 127363);
                    return;
                  }
                  com.tencent.mm.plugin.report.service.g.ork.i(14118, new Object[] { WalletOrderInfoNewUI.o(WalletOrderInfoNewUI.this), WalletOrderInfoNewUI.this.bxg(), Integer.valueOf(1) });
                  GMTrace.o(17094372491264L, 127363);
                }
              };
              this.rkU.setOnClickListener((View.OnClickListener)localObject1);
              this.rkZ.setOnClickListener((View.OnClickListener)localObject1);
              localObject1 = (ViewGroup.MarginLayoutParams)this.rkU.getLayoutParams();
              localObject3 = ((Orders.Commodity)localObject2).rhM;
              if (((((Orders.Commodity)localObject2).rhJ < 0.0D) || (((Orders.Commodity)localObject2).jWS >= ((Orders.Commodity)localObject2).rhJ)) && ((localObject3 == null) || (((List)localObject3).size() <= 0))) {
                break label1599;
              }
            }
            label1599:
            for (((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;; ((ViewGroup.MarginLayoutParams)localObject1).topMargin = com.tencent.mm.br.a.fromDPToPix(this, 50))
            {
              this.rkU.setLayoutParams((ViewGroup.LayoutParams)localObject1);
              this.rkU.setVisibility(0);
              break;
              this.rkZ.setVisibility(8);
              this.rkY.setVisibility(8);
              break label1470;
            }
          }
          this.rkW.setEllipsize(TextUtils.TruncateAt.END);
        }
      }
      GMTrace.o(18829673496576L, 140292);
      return;
      label1632:
      localObject1 = null;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(6937311707136L, 51687);
    if (cN().cO() != null) {
      cN().cO().hide();
    }
    this.rkT = ((ImageView)findViewById(a.f.sLs));
    this.opN = ((TextView)findViewById(a.f.sDJ));
    this.rne = ((TextView)findViewById(a.f.sqZ));
    this.rnf = ((TextView)findViewById(a.f.svE));
    this.rng = ((WalletTextView)findViewById(a.f.sHV));
    this.rnh = ((TextView)findViewById(a.f.sDC));
    this.rkS = ((Button)findViewById(a.f.sDG));
    ld(false);
    le(false);
    String str = getString(a.i.cTh);
    Object localObject;
    if ((this.qYU != null) && (this.qYU.ePL == 2)) {
      if ((this.qYC != null) && (!bg.nm(this.qYC.rhG))) {
        localObject = this.qYC.rhG;
      }
    }
    for (;;)
    {
      this.rkS.setText((CharSequence)localObject);
      this.rkS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7003346829312L, 52179);
          WalletOrderInfoNewUI.this.done();
          GMTrace.o(7003346829312L, 52179);
        }
      });
      this.rni = ((ViewGroup)findViewById(a.f.suV));
      this.rnj = ((ViewGroup)findViewById(a.f.suU));
      this.rla = ((ViewGroup)findViewById(a.f.sJR));
      this.rnk = ((ViewGroup)findViewById(a.f.suW));
      this.rnl = ((ViewGroup)findViewById(a.f.sDD));
      this.rnm = ((ViewGroup)findViewById(a.f.swV));
      this.rnn = ((ViewGroup)findViewById(a.f.suX));
      this.rkU = ((ViewGroup)findViewById(a.f.sHH));
      this.rkV = ((CdnImageView)findViewById(a.f.sHJ));
      this.rkV.twG = true;
      this.rkW = ((TextView)findViewById(a.f.sHG));
      this.rkX = ((TextView)findViewById(a.f.sHL));
      this.rkZ = ((Button)findViewById(a.f.sHE));
      this.rkY = findViewById(a.f.sHI);
      this.rno = ((ViewGroup)findViewById(a.f.sHn));
      this.rnp = ((TextView)findViewById(a.f.sqX));
      this.rnq = ((CheckBox)findViewById(a.f.sHm));
      this.rnr = ((ViewGroup)findViewById(a.f.spz));
      this.rns = ((CdnImageView)findViewById(a.f.spA));
      this.rns.twG = true;
      this.rnu = ((TextView)findViewById(a.f.spB));
      this.rnt = ((TextView)findViewById(a.f.spy));
      this.rnv = ((Button)findViewById(a.f.spx));
      this.rla.setVisibility(4);
      bzw();
      if ((this.qYC != null) && (this.rna != null) && (this.rna.size() > 0))
      {
        localObject = (Orders.Commodity)this.rna.get(0);
        this.rne.setText(((Orders.Commodity)localObject).nEg);
        this.rnf.setText(com.tencent.mm.wallet_core.ui.e.Xu(((Orders.Commodity)localObject).nEr));
        this.rng.setText(String.format("%.2f", new Object[] { Double.valueOf(((Orders.Commodity)localObject).jWS) }));
      }
      bzC();
      bzD();
      this.rnn.setVisibility(8);
      this.rnm.setVisibility(8);
      if ((this.qYC != null) && (this.rna != null) && (this.rna.size() > 0))
      {
        localObject = (Orders.Commodity)this.rna.get(0);
        if (!bg.nm(((Orders.Commodity)localObject).rhP))
        {
          ((TextView)findViewById(a.f.swW)).setText(((Orders.Commodity)localObject).rhP);
          this.rnm.setVisibility(0);
          this.rni.setVisibility(0);
        }
        if (!bg.nm(((Orders.Commodity)localObject).rhN))
        {
          ((TextView)findViewById(a.f.suY)).setText(((Orders.Commodity)localObject).rhN);
          this.rnn.setVisibility(0);
          this.rni.setVisibility(0);
        }
      }
      iX(true);
      bzv();
      GMTrace.o(6937311707136L, 51687);
      return;
      if (!bg.nm(this.qYU.rse))
      {
        localObject = getString(a.i.cRO) + this.qYU.rse;
      }
      else
      {
        localObject = str;
        if (!bg.nm(this.qYU.appId))
        {
          localObject = str;
          if (!bg.nm(com.tencent.mm.pluginsdk.model.app.g.m(this, this.qYU.appId)))
          {
            localObject = getString(a.i.cRO) + com.tencent.mm.pluginsdk.model.app.g.m(this, this.qYU.appId);
            continue;
            localObject = str;
            if (this.qYC != null)
            {
              localObject = str;
              if (!bg.nm(this.qYC.rhG)) {
                localObject = this.qYC.rhG;
              }
            }
          }
        }
      }
    }
  }
  
  protected final boolean bbM()
  {
    GMTrace.i(6938251231232L, 51694);
    GMTrace.o(6938251231232L, 51694);
    return false;
  }
  
  public final void bzE()
  {
    GMTrace.i(6938788102144L, 51698);
    bzy();
    Object localObject1 = new am();
    ((am)localObject1).eBD.eBE = true;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    Object localObject2 = new Bundle();
    ((Bundle)localObject2).putInt("intent_pay_end_errcode", this.ui.getInt("intent_pay_end_errcode"));
    ((Bundle)localObject2).putString("intent_pay_app_url", this.ui.getString("intent_pay_app_url"));
    ((Bundle)localObject2).putBoolean("intent_pay_end", this.ui.getBoolean("intent_pay_end"));
    w.i("MicroMsg.WalletOrderInfoNewUI", "pay done...feedbackData errCode:" + this.ui.getInt("intent_pay_end_errcode"));
    Iterator localIterator = this.rmZ.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (!bg.nm(str1))
      {
        w.i("MicroMsg.WalletOrderInfoNewUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str1 });
        if ((this.qYC == null) || (this.qYU == null)) {
          break label337;
        }
        com.tencent.mm.ad.n localn = com.tencent.mm.kernel.h.xx().fYr;
        String str2 = this.qYC.eHG;
        if (this.qYC.rhv.size() <= 0) {
          break label331;
        }
        localObject1 = ((Orders.Commodity)this.qYC.rhv.get(0)).eRP;
        label248:
        localn.a(new i(str1, str2, (String)localObject1, this.qYU.ePL, this.qYU.ePH, this.qYC.rhm), 0);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(13033, new Object[] { Integer.valueOf(2), str1, "", "", "" });
        break;
        label331:
        localObject1 = "";
        break label248;
        label337:
        com.tencent.mm.kernel.h.xx().fYr.a(new i(str1), 0);
      }
    }
    if (this.rle != null) {
      this.rle.a(this, 0, (Bundle)localObject2);
    }
    if ((this.qYC != null) && (!bg.nm(this.qYC.kBQ))) {
      if (this.qYC.rhv.size() <= 0) {
        break label555;
      }
    }
    label555:
    for (localObject1 = ((Orders.Commodity)this.qYC.rhv.get(0)).eRP;; localObject1 = "")
    {
      localObject1 = d(this.qYC.kBQ, this.qYC.eHG, (String)localObject1, this.qYU.jxX, this.qYU.hLO);
      w.d("MicroMsg.WalletOrderInfoNewUI", "url = " + (String)localObject1);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("showShare", false);
      ((Intent)localObject2).putExtra("geta8key_username", com.tencent.mm.y.q.zE());
      ((Intent)localObject2).putExtra("stastic_scene", 8);
      com.tencent.mm.bj.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject2);
      GMTrace.o(6938788102144L, 51698);
      return;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6939324973056L, 51702);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.q)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.wallet_core.c.q)paramk;
        paramk = new a(paramString.mXK);
        if (this.rkN == null) {
          break label85;
        }
        this.rkO.put(paramString.rcA, paramk);
        iX(false);
        bzv();
      }
    }
    label85:
    while (!(paramk instanceof com.tencent.mm.plugin.wallet_core.c.g)) {
      for (;;)
      {
        GMTrace.o(6939324973056L, 51702);
        return false;
        if (this.rlb)
        {
          this.rkO.put(paramString.rcA, paramk);
          iX(false);
          bzv();
        }
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (com.tencent.mm.plugin.wallet_core.c.g)paramk;
      paramk = paramString.rcl;
      if ((this.rnd != null) && (this.rnd.rgN == paramString.rco.rgN))
      {
        w.i("MicroMsg.WalletOrderInfoNewUI", "activityAwardState: %s", new Object[] { this.rnd });
        this.rkR = paramk;
        w.d("MicroMsg.WalletOrderInfoNewUI", "btnName: %s", new Object[] { paramString.rco.rgT });
        iX(false);
        bzv();
        if ((!bg.nm(paramString.jNb)) && (!"3".equals(paramk))) {
          this.rkZ.setText(paramString.jNb);
        }
      }
      if ((!"-1".equals(paramk)) && (!"0".equals(paramk)) && (!bg.nm(paramString.rcm))) {
        com.tencent.mm.ui.base.h.b(this, paramString.rcm, "", true);
      }
      while (!"0".equals(paramk))
      {
        GMTrace.o(6939324973056L, 51702);
        return true;
      }
      if (!bg.nm(paramString.rcm)) {}
      for (paramString = paramString.rcm;; paramString = getString(a.i.ted))
      {
        Toast.makeText(this, paramString, 0).show();
        break;
      }
    }
    paramk = paramString;
    if (bg.nm(paramString)) {
      paramk = getString(a.i.tgK);
    }
    com.tencent.mm.ui.base.h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19318091808768L, 143931);
        GMTrace.o(19318091808768L, 143931);
      }
    });
    GMTrace.o(6939324973056L, 51702);
    return true;
  }
  
  public final void done()
  {
    GMTrace.i(6938653884416L, 51697);
    if (this.ui.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.ui.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoNewUI");
        localBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        boolean bool1 = localRealnameGuideHelper.b(this, localBundle, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17094640926720L, 127365);
            WalletOrderInfoNewUI.this.bzE();
            GMTrace.o(17094640926720L, 127365);
          }
        });
        boolean bool2 = localRealnameGuideHelper.a(this, localBundle, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19001740623872L, 141574);
            WalletOrderInfoNewUI.this.bzE();
            GMTrace.o(19001740623872L, 141574);
          }
        });
        this.ui.remove("key_realname_guide_helper");
        if ((!bool1) && (!bool2)) {
          bzE();
        }
      }
      GMTrace.o(6938653884416L, 51697);
      return;
    }
    bzE();
    GMTrace.o(6938653884416L, 51697);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6938385448960L, 51695);
    int i = a.g.sPS;
    GMTrace.o(6938385448960L, 51695);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6937982795776L, 51692);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.WalletOrderInfoNewUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      w.i("MicroMsg.WalletOrderInfoNewUI", "do query pay arawrd");
      l(new com.tencent.mm.plugin.wallet_core.c.q(this.rkN.rcA, this.rkN.rnA, this.rkN.rnB, this.rkN.rnC, this.rkN.eJQ, this.rkN.omN, this.rkN.ril));
    }
    GMTrace.o(6937982795776L, 51692);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = false;
    GMTrace.i(6937043271680L, 51685);
    super.onCreate(paramBundle);
    int i;
    label244:
    Object localObject;
    boolean bool1;
    label272:
    int j;
    if (com.tencent.mm.compatible.util.d.et(21))
    {
      if (com.tencent.mm.compatible.util.d.et(23))
      {
        getWindow().setStatusBarColor(-1);
        getWindow().getDecorView().setSystemUiVisibility(8192);
      }
    }
    else
    {
      sv(4);
      this.rmZ = new HashSet();
      paramBundle = com.tencent.mm.wallet_core.a.ad(this);
      this.qYU = ((PayInfo)this.ui.getParcelable("key_pay_info"));
      this.nAz = this.ui.getString("key_trans_id");
      this.ui.getInt("key_pay_type", -1);
      w.i("MicroMsg.WalletOrderInfoNewUI", "mTransId %s", new Object[] { this.nAz });
      this.qYC = bzF();
      if (this.qYC == null) {
        break label793;
      }
      sv(0);
      this.qYC = ((Orders)this.ui.getParcelable("key_orders"));
      b(this.qYC);
      if ((paramBundle != null) && (this.qYC != null) && (this.qYU != null))
      {
        this.hyD = this.qYU.appId;
        boolean bool3 = paramBundle.clC();
        com.tencent.mm.plugin.wallet_core.e.c.b(this, this.ui, 7);
        if (this.ui.getInt("key_support_bankcard", 1) != 2) {
          break label669;
        }
        i = 2;
        localObject = com.tencent.mm.plugin.report.service.g.ork;
        int k = this.qYU.ePL;
        if (this.qYU.ePL != 3) {
          break label674;
        }
        bool1 = true;
        if (!bool3) {
          break label680;
        }
        j = 1;
        label279:
        ((com.tencent.mm.plugin.report.service.g)localObject).i(10691, new Object[] { Integer.valueOf(k), Boolean.valueOf(bool1), Integer.valueOf(j), Integer.valueOf(com.tencent.mm.wallet_core.c.p.clR()), Integer.valueOf((int)(this.qYC.rhd * 100.0D)), this.qYC.nEr, Integer.valueOf(i) });
      }
      if (((!com.tencent.mm.plugin.wallet_core.model.n.byx().byS()) && (paramBundle != null) && (paramBundle.clC())) || (!com.tencent.mm.y.q.zN())) {
        com.tencent.mm.y.q.zO();
      }
      if ((this.qYC == null) || (this.qYC.rhv == null) || (this.qYC.rhv.size() <= 0)) {
        break label685;
      }
      this.rna = this.qYC.rhv;
      w.i("MicroMsg.WalletOrderInfoNewUI", "init data commoditys size: %s", new Object[] { Integer.valueOf(this.rna.size()) });
      this.nAz = ((Orders.Commodity)this.rna.get(0)).eRP;
      this.opd = ((Orders.Commodity)this.rna.get(0)).eRP;
      if ((this.qYU != null) && (paramBundle != null) && ((paramBundle.clB()) || (paramBundle.clC()))) {
        l(new o(bxg()));
      }
      label539:
      if (this.nAz == null)
      {
        paramBundle = com.tencent.mm.kernel.h.xy().xh().get(w.a.vrC, Boolean.valueOf(false));
        bool1 = bool2;
        if (paramBundle != null) {
          bool1 = ((Boolean)paramBundle).booleanValue();
        }
        if (!bool1) {
          break label723;
        }
        w.i("MicroMsg.WalletOrderInfoNewUI", "has show the finger print auth guide!");
      }
    }
    for (;;)
    {
      MP();
      this.rle = cmp();
      bzw();
      hN(1979);
      com.tencent.mm.sdk.b.a.vgX.b(this.rnw);
      com.tencent.mm.sdk.b.a.vgX.b(this.nCD);
      this.rld = true;
      GMTrace.o(6937043271680L, 51685);
      return;
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      break;
      label669:
      i = 1;
      break label244;
      label674:
      bool1 = false;
      break label272;
      label680:
      j = 2;
      break label279;
      label685:
      w.k("MicroMsg.WalletOrderInfoNewUI", "mOrders info is Illegal!", new Object[0]);
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6981603557376L, 52017);
          WalletOrderInfoNewUI.this.done();
          GMTrace.o(6981603557376L, 52017);
        }
      });
      break label539;
      label723:
      localObject = com.tencent.mm.wallet_core.a.ad(this);
      paramBundle = new Bundle();
      if (localObject != null) {
        paramBundle = ((com.tencent.mm.wallet_core.b)localObject).ler;
      }
      if (TextUtils.isEmpty(paramBundle.getString("key_pwd1")))
      {
        w.i("MicroMsg.WalletOrderInfoNewUI", "pwd is empty, not show the finger print auth guide!");
      }
      else if (localObject != null)
      {
        ((com.tencent.mm.wallet_core.b)localObject).a(this, "fingerprint", ".ui.FingerPrintAuthTransparentUI", paramBundle);
        continue;
        label793:
        w.k("MicroMsg.WalletOrderInfoNewUI", "mOrders info is Illegal!", new Object[0]);
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6997038596096L, 52132);
            WalletOrderInfoNewUI.this.finish();
            GMTrace.o(6997038596096L, 52132);
          }
        });
      }
    }
  }
  
  @Deprecated
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(6938117013504L, 51693);
    Dialog localDialog = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(a.i.tdn), getResources().getStringArray(a.b.slP), "", new h.c()
    {
      public final void hQ(int paramAnonymousInt)
      {
        GMTrace.i(19000935317504L, 141568);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(19000935317504L, 141568);
          return;
          Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletOrderInfoNewUI.t(WalletOrderInfoNewUI.this)));
          localIntent.addFlags(268435456);
          WalletOrderInfoNewUI.this.startActivity(localIntent);
        }
      }
    });
    GMTrace.o(6938117013504L, 51693);
    return localDialog;
  }
  
  public void onDestroy()
  {
    GMTrace.i(6939056537600L, 51700);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.vgX.c(this.rnw);
    com.tencent.mm.sdk.b.a.vgX.c(this.nCD);
    hO(1979);
    GMTrace.o(6939056537600L, 51700);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6938922319872L, 51699);
    if (paramInt == 4)
    {
      done();
      GMTrace.o(6938922319872L, 51699);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6938922319872L, 51699);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(6937177489408L, 51686);
    super.onResume();
    w.i("MicroMsg.WalletOrderInfoNewUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s", new Object[] { Boolean.valueOf(this.rld), this.rnd, Boolean.valueOf(this.rlb), Boolean.valueOf(this.rlc), this.rnb });
    if (this.rld)
    {
      this.rld = false;
      GMTrace.o(6937177489408L, 51686);
      return;
    }
    if ((this.rnd != null) && (this.rlc))
    {
      l(new com.tencent.mm.plugin.wallet_core.c.q(this.rnd.rgN, this.rnd.rib, this.rnd.rgQ, this.rnd.rgR, bxg(), this.opd, this.rnd.rgS));
      GMTrace.o(6937177489408L, 51686);
      return;
    }
    if ((this.rlb) && (this.rnb != null)) {
      l(new com.tencent.mm.plugin.wallet_core.c.q(this.rnb.rig, this.rnb.rii, this.rnb.rij, this.rnb.rik, bxg(), this.opd, this.rnb.ril));
    }
    GMTrace.o(6937177489408L, 51686);
  }
  
  public final void sv(int paramInt)
  {
    GMTrace.i(6939459190784L, 51703);
    this.vKB.hqF.setVisibility(paramInt);
    GMTrace.o(6939459190784L, 51703);
  }
  
  static final class a
  {
    public String eLQ;
    public String eQA;
    public String rgV;
    public String rgW;
    public String rgX;
    public String rgY;
    public String rgZ;
    public String rha;
    public String rnz;
    public String title;
    public String url;
    
    public a(JSONObject paramJSONObject)
    {
      GMTrace.i(20884681129984L, 155603);
      if (paramJSONObject == null)
      {
        GMTrace.o(20884681129984L, 155603);
        return;
      }
      paramJSONObject = paramJSONObject.optJSONObject("activity_change_info");
      if (paramJSONObject != null)
      {
        this.url = paramJSONObject.optString("url");
        this.eLQ = paramJSONObject.optString("wording");
        this.eQA = paramJSONObject.optString("icon");
        this.rnz = paramJSONObject.optString("btn_text");
        this.title = paramJSONObject.optString("title");
        this.rgV = paramJSONObject.optString("tinyapp_name");
        this.rgW = paramJSONObject.optString("tinyapp_logo");
        this.rgX = paramJSONObject.optString("tinyapp_desc");
        this.rgY = paramJSONObject.optString("tinyapp_username");
        this.rgZ = paramJSONObject.optString("tinyapp_path");
        this.rha = paramJSONObject.optString("activity_tinyapp_btn_text");
      }
      GMTrace.o(20884681129984L, 155603);
    }
    
    public final String toString()
    {
      GMTrace.i(6981335121920L, 52015);
      String str = this.url + " , " + this.eLQ + " , " + this.eQA + " , " + this.rnz + " , " + this.title;
      GMTrace.o(6981335121920L, 52015);
      return str;
    }
  }
  
  static final class b
  {
    public String eJQ;
    public String omN;
    public String rcA;
    public long ril;
    public String rnA;
    public String rnB;
    public String rnC;
    public long rnD;
    
    public b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong)
    {
      GMTrace.i(20884815347712L, 155604);
      this.rcA = paramString1;
      this.rnA = paramString2;
      this.rnB = paramString3;
      this.rnC = paramString4;
      this.eJQ = paramString5;
      this.omN = paramString6;
      this.ril = paramLong;
      GMTrace.o(20884815347712L, 155604);
    }
    
    public b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong1, long paramLong2)
    {
      GMTrace.i(20884949565440L, 155605);
      this.rcA = paramString1;
      this.rnA = paramString2;
      this.rnB = paramString3;
      this.rnC = paramString4;
      this.eJQ = paramString5;
      this.omN = paramString6;
      this.ril = paramLong1;
      this.rnD = paramLong2;
      GMTrace.o(20884949565440L, 155605);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletOrderInfoNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */