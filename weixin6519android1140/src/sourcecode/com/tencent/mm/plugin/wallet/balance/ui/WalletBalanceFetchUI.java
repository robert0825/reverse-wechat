package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.a.sm.b;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.ui.g;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletBalanceFetchUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private String eHG;
  private final int hqZ;
  private View jBw;
  private Button kES;
  private double oni;
  private ArrayList<Bankcard> qTU;
  private Bankcard qTV;
  private String qTW;
  private WalletFormView qTX;
  private WalletFormView qTY;
  private View qTZ;
  private TextView qUa;
  private TextView qUb;
  private TextView qUc;
  private TextView qUd;
  private TextView qUe;
  private int qUf;
  private int qUg;
  private int qUh;
  private double qUi;
  private int qUj;
  private int qUk;
  private DecimalFormat qUl;
  private boolean qUm;
  private boolean qUn;
  private boolean qUo;
  private boolean qUp;
  private boolean qUq;
  
  public WalletBalanceFetchUI()
  {
    GMTrace.i(7710271602688L, 57446);
    this.hqZ = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 270);
    this.eHG = null;
    this.qUf = 0;
    this.qUg = 0;
    this.qUh = 0;
    this.qUi = 0.0D;
    this.qUj = -1;
    this.qUk = 0;
    this.qUl = new DecimalFormat("0.00");
    this.qUm = false;
    this.qUn = false;
    this.qUo = false;
    this.qUp = false;
    this.qUq = false;
    GMTrace.o(7710271602688L, 57446);
  }
  
  private void Y(Intent paramIntent)
  {
    boolean bool2 = false;
    GMTrace.i(7712687521792L, 57464);
    boolean bool1 = bool2;
    if (paramIntent != null)
    {
      bool1 = bool2;
      if (paramIntent.getBooleanExtra("intent_bind_end", false)) {
        bool1 = true;
      }
    }
    this.qUm = bool1;
    if (this.qUm)
    {
      w.i("MicroMsg.WalletBalanceFetchUI", "onNewIntent() bind card success");
      PayInfo localPayInfo = (PayInfo)this.ui.get("key_pay_info");
      paramIntent = localPayInfo;
      if (localPayInfo == null)
      {
        paramIntent = new PayInfo();
        paramIntent.eHG = this.eHG;
        paramIntent.ePL = 21;
      }
      r(new o(paramIntent.eHG, 4));
      GMTrace.o(7712687521792L, 57464);
      return;
    }
    r(new o(null, 4));
    w.i("MicroMsg.WalletBalanceFetchUI", "onNewIntent() bind card fail or from create call");
    GMTrace.o(7712687521792L, 57464);
  }
  
  private void a(com.tencent.mm.plugin.wallet.balance.a.b paramb)
  {
    GMTrace.i(7711613779968L, 57456);
    if (!bg.nm(this.eHG))
    {
      Object localObject = new PayInfo();
      ((PayInfo)localObject).eHG = this.eHG;
      ((PayInfo)localObject).ePL = 21;
      this.ui.putParcelable("key_pay_info", (Parcelable)localObject);
      localObject = new Orders();
      ((Orders)localObject).rhd = (paramb.omw - paramb.oml);
      ((Orders)localObject).rhe = (paramb.omw - paramb.oml);
      ((Orders)localObject).rhv.add(new Orders.Commodity());
      ((Orders)localObject).oml = paramb.oml;
      this.ui.putParcelable("key_orders", (Parcelable)localObject);
      this.ui.putParcelable("key_bankcard", this.qTV);
      if (cmp() == null)
      {
        com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.b.class, this.ui, null);
        GMTrace.o(7711613779968L, 57456);
        return;
      }
      cmq().j(new Object[] { this.ui });
      GMTrace.o(7711613779968L, 57456);
      return;
    }
    w.w("MicroMsg.WalletBalanceFetchUI", "hy: req key is null. abandon");
    GMTrace.o(7711613779968L, 57456);
  }
  
  private void ar()
  {
    GMTrace.i(7711211126784L, 57453);
    label138:
    label149:
    String str;
    if (this.qTX.izE != null)
    {
      this.qTX.izE.setText(String.format(getString(a.i.sYc), new Object[] { com.tencent.mm.wallet_core.c.t.clX() }));
      if (this.qTV == null) {
        break label362;
      }
      this.qTY.setText(this.qTV.field_desc);
      this.qTY.setVisibility(0);
      if (this.qTY.ogg == null) {
        break label329;
      }
      if ((this.qUf != 1) || (this.qTV.field_fetch_charge_rate <= 0.0D)) {
        break label301;
      }
      if (TextUtils.isEmpty(this.qTV.field_fetch_charge_info)) {
        break label246;
      }
      this.qTY.ogg.setText(this.qTV.field_fetch_charge_info);
      this.qTY.ogg.setVisibility(0);
      if (bg.nm(this.qTV.field_fetchArriveTimeWording)) {
        break label340;
      }
      this.qUc.setText(this.qTV.field_fetchArriveTimeWording);
      this.qUc.setVisibility(0);
      com.tencent.mm.plugin.wallet.a.p.bxd();
      str = com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reO;
      if (bg.nm(str)) {
        break label411;
      }
      this.qUb.setVisibility(0);
      this.qUb.setText(str);
    }
    for (;;)
    {
      bwI();
      GMTrace.o(7711211126784L, 57453);
      return;
      w.i("MicroMsg.WalletBalanceFetchUI", "mTotalFeeEHV.getTitleTv() is null");
      break;
      label246:
      str = getString(a.i.sZh) + this.qTV.field_fetch_charge_rate * 100.0D + "%";
      this.qTY.ogg.setText(str);
      break label138;
      label301:
      this.qTY.ogg.setText("");
      this.qTY.ogg.setVisibility(8);
      break label149;
      label329:
      w.i("MicroMsg.WalletBalanceFetchUI", "mBankcardEHV.getTipsTv() is null");
      break label149;
      label340:
      this.qUc.setText("");
      for (;;)
      {
        this.qUc.setVisibility(8);
        break;
        label362:
        this.qTY.setText(this.qTW);
        if (this.qTY.ogg != null)
        {
          this.qTY.ogg.setText("");
          this.qTY.ogg.setVisibility(8);
        }
      }
      label411:
      this.qUb.setVisibility(8);
    }
  }
  
  private boolean b(final com.tencent.mm.plugin.wallet.balance.a.b paramb)
  {
    boolean bool3 = true;
    GMTrace.i(7712284868608L, 57461);
    boolean bool1;
    if (!this.qUn) {
      if (paramb.qTi)
      {
        this.qUn = true;
        com.tencent.mm.ui.base.h.a(this, false, paramb.qTj, "", getString(a.i.cTM), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7723961810944L, 57548);
            paramAnonymousDialogInterface.dismiss();
            if (!WalletBalanceFetchUI.a(WalletBalanceFetchUI.this, paramb))
            {
              WalletBalanceFetchUI.a(WalletBalanceFetchUI.this, paramb.eJQ);
              WalletBalanceFetchUI.b(WalletBalanceFetchUI.this, paramb);
            }
            GMTrace.o(7723961810944L, 57548);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7704902893568L, 57406);
            paramAnonymousDialogInterface.dismiss();
            WalletBalanceFetchUI.i(WalletBalanceFetchUI.this);
            GMTrace.o(7704902893568L, 57406);
          }
        });
        bool1 = true;
      }
    }
    for (;;)
    {
      boolean bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!this.qUo)
        {
          com.tencent.mm.plugin.wallet_core.model.b localb = paramb.qTk;
          if ((localb == null) || ((TextUtils.isEmpty(localb.rev)) && ((localb.rew == null) || (localb.rew.size() <= 0)))) {
            break label259;
          }
          this.qUo = true;
          g.a(this, localb, false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7719398408192L, 57514);
              paramAnonymousDialogInterface.dismiss();
              if (!WalletBalanceFetchUI.a(WalletBalanceFetchUI.this, paramb))
              {
                WalletBalanceFetchUI.a(WalletBalanceFetchUI.this, paramb.eJQ);
                WalletBalanceFetchUI.b(WalletBalanceFetchUI.this, paramb);
              }
              GMTrace.o(7719398408192L, 57514);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7722216980480L, 57535);
              paramAnonymousDialogInterface.dismiss();
              WalletBalanceFetchUI.i(WalletBalanceFetchUI.this);
              GMTrace.o(7722216980480L, 57535);
            }
          });
          bool2 = true;
        }
      }
      label165:
      if ((!bool2) && (!this.qUp))
      {
        paramb = paramb.qTl;
        if ((paramb != null) && ((!TextUtils.isEmpty(paramb.rev)) || ((paramb.rew != null) && (paramb.rew.size() > 0))))
        {
          this.qUp = true;
          g.a(this, paramb, true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7710137384960L, 57445);
              paramAnonymousDialogInterface.dismiss();
              paramAnonymousDialogInterface = "";
              if (WalletBalanceFetchUI.j(WalletBalanceFetchUI.this) != null) {
                paramAnonymousDialogInterface = WalletBalanceFetchUI.j(WalletBalanceFetchUI.this).field_bankcardType;
              }
              WalletBalanceFetchUI.k(WalletBalanceFetchUI.this);
              WalletBalanceFetchUI.l(WalletBalanceFetchUI.this);
              WalletBalanceFetchUI.this.l(new com.tencent.mm.plugin.wallet.balance.a.b(WalletBalanceFetchUI.m(WalletBalanceFetchUI.this), "CNY", paramAnonymousDialogInterface, WalletBalanceFetchUI.n(WalletBalanceFetchUI.this)));
              GMTrace.o(7710137384960L, 57445);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7721680109568L, 57531);
              paramAnonymousDialogInterface.dismiss();
              WalletBalanceFetchUI.i(WalletBalanceFetchUI.this);
              GMTrace.o(7721680109568L, 57531);
            }
          });
          bool1 = bool3;
        }
      }
      for (;;)
      {
        GMTrace.o(7712284868608L, 57461);
        return bool1;
        bool1 = false;
        break;
        label259:
        bool2 = false;
        break label165;
        bool1 = false;
        continue;
        bool1 = bool2;
      }
      bool1 = false;
    }
  }
  
  private void bbq()
  {
    GMTrace.i(7710808473600L, 57450);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    af localaf = com.tencent.mm.plugin.wallet.a.p.bxe();
    Object localObject2;
    int i;
    if (this.qUm)
    {
      w.i("MicroMsg.WalletBalanceFetchUI", "is from new bind bankcard");
      localObject1 = new ArrayList();
      localObject2 = new ArrayList();
      if ((this.qTU != null) && (this.qTU.size() > 0)) {
        ((ArrayList)localObject1).addAll(this.qTU);
      }
      this.qTU = localaf.bze();
      if ((this.qTU != null) && (this.qTU.size() > 0)) {
        ((ArrayList)localObject2).addAll(this.qTU);
      }
      if ((((ArrayList)localObject1).size() <= 0) || (((ArrayList)localObject2).size() <= 0)) {
        break label528;
      }
      ArrayList localArrayList = new ArrayList();
      i = 0;
      while (i < ((ArrayList)localObject1).size())
      {
        Bankcard localBankcard1 = (Bankcard)((ArrayList)localObject1).get(i);
        int j = 0;
        while (j < ((ArrayList)localObject2).size())
        {
          Bankcard localBankcard2 = (Bankcard)((ArrayList)localObject2).get(j);
          if ((localBankcard1 != null) && (localBankcard2 != null) && (localBankcard1.field_bindSerial.equals(localBankcard2.field_bindSerial))) {
            localArrayList.add(localBankcard2);
          }
          j += 1;
        }
        i += 1;
      }
      if (localArrayList.size() > 0) {
        ((ArrayList)localObject2).removeAll(localArrayList);
      }
      if (((ArrayList)localObject2).size() <= 0) {
        break label528;
      }
    }
    label349:
    label514:
    label528:
    for (Object localObject1 = (Bankcard)((ArrayList)localObject2).get(0);; localObject1 = null)
    {
      if (localObject1 == null) {
        localObject1 = localaf.a(this.qTU, null, false, true);
      }
      for (;;)
      {
        i = 0;
        if ((this.qTU != null) && (i < this.qTU.size()))
        {
          localObject2 = (Bankcard)this.qTU.get(i);
          if ((localObject1 != null) && (localObject2 != null) && (((Bankcard)localObject1).field_bindSerial.equals(((Bankcard)localObject2).field_bindSerial))) {
            this.qUj = i;
          }
        }
        else
        {
          this.qTV = ((Bankcard)localObject1);
          this.qUm = false;
          if (localaf.rjw == null) {
            break label514;
          }
          this.qUf = localaf.rjw.qUf;
          this.qUg = localaf.rjw.qUg;
          this.qUi = localaf.rjw.qUi;
          this.qUh = localaf.rjw.qUh;
        }
        for (;;)
        {
          w.i("MicroMsg.WalletBalanceFetchUI", "is_show_charge:" + this.qUf + " is_cal_charge:" + this.qUg + " min_charge_fee:" + this.qUi + " is_full_fetch_direct:" + this.qUh);
          GMTrace.o(7710808473600L, 57450);
          return;
          i += 1;
          break;
          this.qTU = localaf.bze();
          this.qTV = localaf.a(this.qTU, null, false, true);
          break label349;
          w.e("MicroMsg.WalletBalanceFetchUI", "BalanceFetchInfo is null");
        }
      }
    }
  }
  
  private void bwI()
  {
    GMTrace.i(7711479562240L, 57455);
    this.oni = bg.getDouble(this.qTX.getText(), 0.0D);
    double d;
    StringBuilder localStringBuilder;
    if (this.oni > 0.0D)
    {
      this.kES.setEnabled(true);
      d = this.oni;
      com.tencent.mm.plugin.wallet.a.p.bxd();
      if ((d != com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reM) && (this.qTV != null))
      {
        d = this.oni;
        com.tencent.mm.plugin.wallet.a.p.bxd();
        if (d != com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reM - this.qTV.field_full_fetch_charge_fee) {
          this.qUk = 0;
        }
      }
      localStringBuilder = new StringBuilder();
      d = this.oni;
      com.tencent.mm.plugin.wallet.a.p.bxd();
      if (d <= com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reK) {
        break label211;
      }
      this.qUe.setVisibility(8);
      this.qUd.setTextColor(getResources().getColor(a.c.aOL));
      localStringBuilder.append(getString(a.i.sZq));
    }
    for (;;)
    {
      this.qUd.setText(localStringBuilder.toString());
      GMTrace.o(7711479562240L, 57455);
      return;
      this.kES.setEnabled(false);
      break;
      label211:
      Object localObject;
      if ((this.qTV != null) && (this.qUf != 0) && ((this.qUf != 1) || (this.qTV.field_fetch_charge_rate > 0.0D)) && ((this.qUf != 1) || (this.qTV.field_fetch_charge_rate <= 0.0D) || (this.qUg != 0)))
      {
        d = this.qUi;
        com.tencent.mm.plugin.wallet.a.p.bxd();
        if (d < com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reM) {}
      }
      else
      {
        this.qUe.setVisibility(0);
        this.qUd.setTextColor(getResources().getColor(a.c.aOa));
        com.tencent.mm.plugin.wallet.a.p.bxd();
        localObject = com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reP;
        if (!bg.nm((String)localObject)) {
          localStringBuilder.append((String)localObject);
        }
        for (;;)
        {
          localStringBuilder.append("，");
          break;
          w.i("MicroMsg.WalletBalanceFetchUI", "hy: wording's missing. use former routine");
          com.tencent.mm.plugin.wallet.a.p.bxd();
          d = com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reM;
          localStringBuilder.append(getString(a.i.sZk, new Object[] { com.tencent.mm.wallet_core.ui.e.d(d, "CNY") }));
        }
      }
      if ((this.qUf == 1) && (this.qTV.field_fetch_charge_rate > 0.0D) && (this.qUg == 1) && ((this.oni <= 0.0D) || (!this.qTX.QW())))
      {
        this.qUe.setVisibility(0);
        this.qUd.setTextColor(getResources().getColor(a.c.aOa));
        com.tencent.mm.plugin.wallet.a.p.bxd();
        localObject = com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reP;
        if (!bg.nm((String)localObject)) {
          localStringBuilder.append((String)localObject);
        }
        for (;;)
        {
          localStringBuilder.append("，");
          break;
          w.i("MicroMsg.WalletBalanceFetchUI", "hy: wording's missing. use former routine");
          com.tencent.mm.plugin.wallet.a.p.bxd();
          d = com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reM;
          localStringBuilder.append(getString(a.i.sZk, new Object[] { com.tencent.mm.wallet_core.ui.e.d(d, "CNY") }));
        }
      }
      if ((this.qUf == 1) && (this.qTV.field_fetch_charge_rate > 0.0D) && (this.qUg == 1))
      {
        this.qUe.setVisibility(8);
        this.qUd.setTextColor(getResources().getColor(a.c.aOa));
        d = this.oni;
        com.tencent.mm.plugin.wallet.a.p.bxd();
        if ((d == com.tencent.mm.plugin.wallet.a.p.bxe().qUy.reM - this.qTV.field_full_fetch_charge_fee) && (this.qTV.field_full_fetch_charge_fee > 0.0D))
        {
          localStringBuilder.append(getString(a.i.sZd, new Object[] { com.tencent.mm.wallet_core.ui.e.d(this.qTV.field_full_fetch_charge_fee, "CNY") }));
        }
        else
        {
          int i = a.i.sZd;
          d = this.oni;
          com.tencent.mm.plugin.wallet.a.p.bxd();
          localObject = com.tencent.mm.plugin.wallet.a.p.bxe();
          localStringBuilder.append(getString(i, new Object[] { com.tencent.mm.wallet_core.ui.e.d(Math.max(Math.round((d - ((af)localObject).rjw.omp) * this.qTV.field_fetch_charge_rate * 100.0D) / 100.0D, ((af)localObject).rjw.qUi), "CNY") }));
        }
      }
    }
  }
  
  private void bwJ()
  {
    GMTrace.i(7712419086336L, 57462);
    this.qUn = false;
    this.qUo = false;
    this.qUp = false;
    this.qUq = false;
    GMTrace.o(7712419086336L, 57462);
  }
  
  protected final void MP()
  {
    GMTrace.i(7710942691328L, 57451);
    oM(a.i.sZp);
    a(0, a.e.spj, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7727585689600L, 57575);
        com.tencent.mm.wallet_core.ui.e.m(WalletBalanceFetchUI.this.vKB.vKW, "http://kf.qq.com/touch/product/wechatwallet_app.html?platform=15&scene_id=kf4", false);
        GMTrace.o(7727585689600L, 57575);
        return true;
      }
    });
    this.jBw = findViewById(a.f.svH);
    this.qTY = ((WalletFormView)findViewById(a.f.spV));
    this.qTY.xFv = new com.tencent.mm.wallet_core.ui.formview.a.a()
    {
      public final boolean a(WalletFormView paramAnonymousWalletFormView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(7718190448640L, 57505);
        GMTrace.o(7718190448640L, 57505);
        return false;
      }
      
      public final void bwK()
      {
        GMTrace.i(7718324666368L, 57506);
        WalletBalanceFetchUI.a(WalletBalanceFetchUI.this);
        GMTrace.o(7718324666368L, 57506);
      }
    };
    com.tencent.mm.wallet_core.ui.formview.a.g(this.qTY);
    final Object localObject = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7726780383232L, 57569);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("key_scene_select_bankcard_mode_ui", 0);
        paramAnonymousView.putExtra("key_select_index", WalletBalanceFetchUI.b(WalletBalanceFetchUI.this));
        paramAnonymousView.setClass(WalletBalanceFetchUI.this, WalletSelectBankcardModeUI.class);
        WalletBalanceFetchUI.this.startActivityForResult(paramAnonymousView, 1);
        GMTrace.o(7726780383232L, 57569);
      }
    };
    this.qTZ = findViewById(a.f.spW);
    this.qTZ.setOnClickListener((View.OnClickListener)localObject);
    this.qTY.setOnClickListener((View.OnClickListener)localObject);
    this.qTX = ((WalletFormView)findViewById(a.f.spY));
    e(this.qTX, 2, false);
    com.tencent.mm.wallet_core.ui.formview.a.e(this.qTX);
    this.qTX.xFu = this;
    this.kES = ((Button)findViewById(a.f.bQR));
    this.kES.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7727854125056L, 57577);
        WalletBalanceFetchUI.c(WalletBalanceFetchUI.this);
        GMTrace.o(7727854125056L, 57577);
      }
    });
    this.kES.setEnabled(false);
    this.qUa = ((TextView)findViewById(a.f.sIf));
    this.qUb = ((TextView)findViewById(a.f.sqa));
    this.qUc = ((TextView)findViewById(a.f.spZ));
    this.qUd = ((TextView)findViewById(a.f.svG));
    this.qUe = ((TextView)findViewById(a.f.svF));
    this.qUe.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7718861537280L, 57510);
        WalletBalanceFetchUI.d(WalletBalanceFetchUI.this);
        GMTrace.o(7718861537280L, 57510);
      }
    });
    this.qTX.a(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(7717116706816L, 57497);
        if (paramAnonymousEditable.toString().startsWith(".")) {
          paramAnonymousEditable.insert(0, "0");
        }
        String str = paramAnonymousEditable.toString();
        int i = str.indexOf(".");
        str.length();
        int j = str.lastIndexOf(".");
        int k = str.length();
        if ((i >= 0) && (k - i > 3)) {
          paramAnonymousEditable.delete(i + 3, k);
        }
        for (;;)
        {
          WalletBalanceFetchUI.e(WalletBalanceFetchUI.this);
          GMTrace.o(7717116706816L, 57497);
          return;
          if (j != i) {
            paramAnonymousEditable.delete(j, k);
          }
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(7716982489088L, 57496);
        GMTrace.o(7716982489088L, 57496);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(7716848271360L, 57495);
        GMTrace.o(7716848271360L, 57495);
      }
    });
    this.mLW = new com.tencent.mm.wallet_core.ui.a()
    {
      public final void gU(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18390110437376L, 137017);
        if (paramAnonymousBoolean)
        {
          WalletBalanceFetchUI.f(WalletBalanceFetchUI.this);
          GMTrace.o(18390110437376L, 137017);
          return;
        }
        WalletBalanceFetchUI.g(WalletBalanceFetchUI.this).scrollTo(0, 0);
        GMTrace.o(18390110437376L, 137017);
      }
    };
    localObject = new sm();
    ((sm)localObject).eXp.eXr = "3";
    ((sm)localObject).eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18390915743744L, 137023);
        if (!bg.nm(localObject.eXq.eXs))
        {
          com.tencent.mm.wallet_core.ui.e.a(WalletBalanceFetchUI.h(WalletBalanceFetchUI.this), localObject.eXq.eXs, localObject.eXq.content, localObject.eXq.url);
          GMTrace.o(18390915743744L, 137023);
          return;
        }
        w.i("MicroMsg.WalletBalanceFetchUI", "no bulletin data");
        GMTrace.o(18390915743744L, 137023);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    GMTrace.o(7710942691328L, 57451);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7712016433152L, 57459);
    GMTrace.o(7712016433152L, 57459);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7711747997696L, 57457);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.wallet.balance.a.b))
      {
        paramString = (com.tencent.mm.plugin.wallet.balance.a.b)paramk;
        this.qUn = false;
        if (!this.qUq) {
          this.qUo = false;
        }
        this.qUp = false;
        this.qUq = false;
        if ("1".equals(paramString.eXD))
        {
          w.i("MicroMsg.WalletBalanceFetchUI", "need realname verify");
          paramk = new Bundle();
          paramk.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceFetchUI");
          paramk.putString("realname_verify_process_jump_plugin", "wallet");
          String str = paramString.eXE;
          str = paramString.eXF;
          str = paramString.eXG;
          aNg();
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramk, 0);
        }
        while (bool)
        {
          GMTrace.o(7711747997696L, 57457);
          return false;
          if ("2".equals(paramString.eXD))
          {
            w.i("MicroMsg.WalletBalanceFetchUI", "need upload credit");
            bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString.eXE, paramString.eXH, paramString.eXF, paramString.eXG, aNg(), null);
          }
          else
          {
            w.i("MicroMsg.WalletBalanceFetchUI", "realnameGuideFlag =  " + paramString.eXD);
            bool = false;
          }
        }
        if (!b(paramString))
        {
          this.eHG = paramString.eJQ;
          a(paramString);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(7711747997696L, 57457);
      return false;
      if ((paramk instanceof o))
      {
        bbq();
        ar();
        if (this.qUf != 0)
        {
          w.i("MicroMsg.WalletBalanceFetchUI", "showRemainFeeTip is_show_charge =" + this.qUf);
        }
        else
        {
          com.tencent.mm.kernel.h.xz();
          bool = ((Boolean)com.tencent.mm.kernel.h.xy().xh().get(w.a.vtZ, Boolean.valueOf(false))).booleanValue();
          com.tencent.mm.plugin.wallet.a.p.bxd();
          paramString = com.tencent.mm.plugin.wallet.a.p.bxe().rjw;
          if ((paramString != null) && (!bool))
          {
            double d = paramString.omp;
            com.tencent.mm.ui.base.h.a(this, getString(a.i.teA, new Object[] { com.tencent.mm.wallet_core.ui.e.s(d) }), getString(a.i.teB), getString(a.i.tbT), getString(a.i.teC), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(18393600098304L, 137043);
                paramAnonymousDialogInterface.dismiss();
                GMTrace.o(18393600098304L, 137043);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(18393868533760L, 137045);
                Intent localIntent = new Intent();
                localIntent.putExtra("rawUrl", WalletBalanceFetchUI.this.getString(a.i.tbI));
                localIntent.putExtra("showShare", false);
                com.tencent.mm.bj.d.b(WalletBalanceFetchUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
                paramAnonymousDialogInterface.dismiss();
                GMTrace.o(18393868533760L, 137045);
              }
            }, a.c.aPp);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().a(w.a.vtZ, Boolean.valueOf(true));
            continue;
            if ((paramk instanceof com.tencent.mm.plugin.wallet.balance.a.b)) {
              bwJ();
            }
          }
        }
      }
    }
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(7711882215424L, 57458);
    this.qTX.dJ(null);
    GMTrace.o(7711882215424L, 57458);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7710405820416L, 57447);
    int i = a.g.sOK;
    GMTrace.o(7710405820416L, 57447);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7712150650880L, 57460);
    if (paramInt1 == 1)
    {
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        paramInt1 = paramIntent.getIntExtra("key_select_index", -1);
        paramInt2 = this.qUj;
        this.qUj = paramInt1;
        w.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult select bankcard index is " + paramInt1);
        if ((this.qTU == null) || (paramInt1 < 0) || (paramInt1 >= this.qTU.size())) {
          if ((this.qTU == null) || (paramInt1 < 0) || (paramInt1 > this.qTU.size()))
          {
            this.qTV = null;
            Bundle localBundle = new Bundle();
            PayInfo localPayInfo = (PayInfo)this.ui.get("key_pay_info");
            paramIntent = localPayInfo;
            if (localPayInfo == null)
            {
              paramIntent = new PayInfo();
              paramIntent.eHG = this.eHG;
              paramIntent.ePL = 21;
            }
            if (paramIntent != null) {
              localBundle.putParcelable("key_pay_info", paramIntent);
            }
            localBundle.putInt("key_scene", 21);
            localBundle.putInt("key_bind_scene", 0);
            localBundle.putBoolean("key_need_bind_response", true);
            localBundle.putInt("key_bind_scene", 0);
            localBundle.putBoolean("key_is_bind_bankcard", true);
            localBundle.putInt("from_bind_ui", com.tencent.mm.plugin.wallet.balance.a.qTg);
            com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.a.class, localBundle, null);
          }
        }
        for (;;)
        {
          ar();
          GMTrace.o(7712150650880L, 57460);
          return;
          this.qUj = paramInt2;
          break;
          this.qTV = ((Bankcard)this.qTU.get(paramInt1));
        }
      }
      w.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult cancel select");
      GMTrace.o(7712150650880L, 57460);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(7712150650880L, 57460);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7710540038144L, 57448);
    super.onCreate(paramBundle);
    Y(getIntent());
    bbq();
    this.qTW = getString(a.i.sZE);
    MP();
    ar();
    com.tencent.mm.wallet_core.c.p.eP(4, 0);
    GMTrace.o(7710540038144L, 57448);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7710674255872L, 57449);
    this.qTY.xFv = null;
    super.onDestroy();
    GMTrace.o(7710674255872L, 57449);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(7712553304064L, 57463);
    bwJ();
    Y(paramIntent);
    GMTrace.o(7712553304064L, 57463);
  }
  
  public void onResume()
  {
    GMTrace.i(7711076909056L, 57452);
    bwJ();
    super.onResume();
    GMTrace.o(7711076909056L, 57452);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\WalletBalanceFetchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */