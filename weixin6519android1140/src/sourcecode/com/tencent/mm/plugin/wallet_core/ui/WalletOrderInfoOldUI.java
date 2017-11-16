package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
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
import com.tencent.mm.plugin.wallet_core.model.Orders.a;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.plugin.wxpay.a.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoOldUI
  extends WalletOrderInfoUI
{
  protected boolean eBI;
  protected boolean eBJ;
  protected boolean eBK;
  protected String hyD;
  protected String iAx;
  protected String nAz;
  private com.tencent.mm.sdk.b.c nCD;
  protected String nFJ;
  private String opd;
  public Orders qYC;
  protected PayInfo qYU;
  protected boolean rkJ;
  private HashMap<String, b> rkO;
  protected String rkP;
  public Set<String> rmZ;
  protected LinearLayout rnE;
  protected TextView rnF;
  protected TextView rnG;
  public a rnH;
  protected String rnI;
  protected HashMap<String, TextView> rnJ;
  protected c rnK;
  protected Map<Long, String> rnL;
  private d rnM;
  private boolean rnN;
  public ak.b.a rnO;
  private View.OnLongClickListener rnP;
  public List<Orders.Commodity> rna;
  private com.tencent.mm.sdk.b.c rnw;
  
  public WalletOrderInfoOldUI()
  {
    GMTrace.i(6932614086656L, 51652);
    this.rnE = null;
    this.rnF = null;
    this.rnG = null;
    this.rna = null;
    this.rnH = null;
    this.iAx = null;
    this.nFJ = null;
    this.rkJ = false;
    this.rmZ = null;
    this.hyD = "";
    this.rnI = null;
    this.eBI = true;
    this.eBJ = false;
    this.eBK = false;
    this.rnJ = new HashMap();
    this.rnL = new HashMap();
    this.rkO = new HashMap();
    this.rnN = false;
    this.nCD = new com.tencent.mm.sdk.b.c() {};
    this.rnO = new ak.b.a()
    {
      public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6928453337088L, 51621);
        x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramAnonymousString);
        w.d("MicroMsg.WalletOrderInfoOldUI", "call back from contactServer " + paramAnonymousString + " succ: " + paramAnonymousBoolean);
        WalletOrderInfoOldUI.this.K(localx);
        GMTrace.o(6928453337088L, 51621);
      }
    };
    this.rnP = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(6983348387840L, 52030);
        if ((paramAnonymousView.getId() == a.f.sJU) || (paramAnonymousView.getId() == a.f.sKs)) {}
        try
        {
          paramAnonymousView = (String)paramAnonymousView.getTag();
          Toast.makeText(WalletOrderInfoOldUI.this, a.i.tcX, 0).show();
          com.tencent.mm.pluginsdk.i.c.a(WalletOrderInfoOldUI.this.vKB.vKW, paramAnonymousView, paramAnonymousView);
          GMTrace.o(6983348387840L, 52030);
          return true;
        }
        catch (Exception paramAnonymousView)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.WalletOrderInfoOldUI", paramAnonymousView, "", new Object[0]);
          }
        }
      }
    };
    this.rnw = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6932614086656L, 51652);
  }
  
  private void bzI()
  {
    GMTrace.i(6935701094400L, 51675);
    if ((this.qYC != null) && (this.qYC.rhv != null) && (this.qYC.rhv.size() > 0) && (((Orders.Commodity)this.qYC.rhv.get(0)).rhT != null) && (!bg.nm(((Orders.Commodity)this.qYC.rhv.get(0)).rhT.text)) && (!bg.nm(((Orders.Commodity)this.qYC.rhv.get(0)).rhT.url)))
    {
      this.rnG.setVisibility(0);
      this.rnG.setText(((Orders.Commodity)this.qYC.rhv.get(0)).rhT.text);
      this.rnG.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6923755716608L, 51586);
          com.tencent.mm.wallet_core.ui.e.m(WalletOrderInfoOldUI.this, ((Orders.Commodity)WalletOrderInfoOldUI.this.qYC.rhv.get(0)).rhT.url, false);
          GMTrace.o(6923755716608L, 51586);
        }
      });
      GMTrace.o(6935701094400L, 51675);
      return;
    }
    w.i("MicroMsg.WalletOrderInfoOldUI", "hy: no commodity or no link act or link act is illegal!");
    this.rnG.setVisibility(8);
    GMTrace.o(6935701094400L, 51675);
  }
  
  public final void K(x paramx)
  {
    GMTrace.i(6934761570304L, 51668);
    if ((paramx != null) && ((int)paramx.fTq != 0))
    {
      String str = paramx.vj();
      w.d("MicroMsg.WalletOrderInfoOldUI", "call back from contactServer nickName " + str + " username: " + paramx.field_username);
      if ((this.rna != null) && (this.rna.size() > 0))
      {
        Iterator localIterator = this.rna.iterator();
        while (localIterator.hasNext()) {
          ((Orders.Commodity)localIterator.next()).nEs = str;
        }
        this.rnH.notifyDataSetChanged();
      }
      this.iAx = paramx.field_username;
    }
    GMTrace.o(6934761570304L, 51668);
  }
  
  public void KA(String paramString)
  {
    GMTrace.i(6933553610752L, 51659);
    l(new com.tencent.mm.plugin.wallet_core.c.p(paramString));
    GMTrace.o(6933553610752L, 51659);
  }
  
  protected final void Kz(String paramString)
  {
    GMTrace.i(6934493134848L, 51666);
    bzy();
    com.tencent.mm.wallet_core.ui.e.m(this, paramString, false);
    this.rnN = false;
    GMTrace.o(6934493134848L, 51666);
  }
  
  protected final void MP()
  {
    GMTrace.i(6934090481664L, 51663);
    oM(a.i.tdB);
    ld(false);
    le(false);
    String str = getString(a.i.cTh);
    Object localObject;
    if ((this.qYU != null) && (this.qYU.ePL == 2)) {
      if (!bg.nm(this.qYU.rse)) {
        localObject = getString(a.i.cRO) + this.qYU.rse;
      }
    }
    for (;;)
    {
      a(0, (String)localObject, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6986166960128L, 52051);
          WalletOrderInfoOldUI.this.done();
          GMTrace.o(6986166960128L, 52051);
          return true;
        }
      });
      this.rnE = ((LinearLayout)findViewById(a.f.sKj));
      this.rnF = ((TextView)findViewById(a.f.sKi));
      this.rnG = ((TextView)findViewById(a.f.sKb));
      localObject = (MaxListView)findViewById(a.f.sJO);
      this.rnH = new a();
      ((MaxListView)localObject).setAdapter(this.rnH);
      bzH();
      bzI();
      ((ScrollView)findViewById(a.f.cnx)).pageScroll(33);
      GMTrace.o(6934090481664L, 51663);
      return;
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
  
  public void PY()
  {
    GMTrace.i(6932882522112L, 51654);
    Object localObject1 = com.tencent.mm.wallet_core.a.ad(this);
    this.qYU = ((PayInfo)this.ui.getParcelable("key_pay_info"));
    this.nAz = this.ui.getString("key_trans_id");
    this.ui.getInt("key_pay_type", -1);
    w.i("MicroMsg.WalletOrderInfoOldUI", "mTransId %s", new Object[] { this.nAz });
    this.qYC = bzF();
    int i;
    Object localObject2;
    label213:
    int j;
    if (this.qYC != null)
    {
      sv(0);
      this.qYC = ((Orders)this.ui.getParcelable("key_orders"));
      c(this.qYC);
      if ((localObject1 != null) && (this.qYC != null) && (this.qYU != null))
      {
        this.hyD = this.qYU.appId;
        boolean bool2 = ((com.tencent.mm.wallet_core.b)localObject1).clC();
        com.tencent.mm.plugin.wallet_core.e.c.b(this, this.ui, 7);
        if (this.ui.getInt("key_support_bankcard", 1) == 2)
        {
          i = 2;
          localObject2 = com.tencent.mm.plugin.report.service.g.ork;
          int k = this.qYU.ePL;
          if (this.qYU.ePL != 3) {
            break label494;
          }
          bool1 = true;
          if (!bool2) {
            break label500;
          }
          j = 1;
          label220:
          ((com.tencent.mm.plugin.report.service.g)localObject2).i(10691, new Object[] { Integer.valueOf(k), Boolean.valueOf(bool1), Integer.valueOf(j), Integer.valueOf(com.tencent.mm.wallet_core.c.p.clR()), Integer.valueOf((int)(this.qYC.rhd * 100.0D)), this.qYC.nEr, Integer.valueOf(i) });
        }
      }
      else
      {
        if (((!com.tencent.mm.plugin.wallet_core.model.n.byx().byS()) && (localObject1 != null) && (((com.tencent.mm.wallet_core.b)localObject1).clC())) || (!com.tencent.mm.y.q.zN())) {
          com.tencent.mm.y.q.zO();
        }
        if ((this.qYC == null) || (this.qYC.rhv == null) || (this.qYC.rhv.size() <= 0)) {
          break label505;
        }
        this.rna = this.qYC.rhv;
        this.nAz = ((Orders.Commodity)this.rna.get(0)).eRP;
        if ((this.qYU != null) && (localObject1 != null) && ((((com.tencent.mm.wallet_core.b)localObject1).clB()) || (((com.tencent.mm.wallet_core.b)localObject1).clC()))) {
          bzG();
        }
        label426:
        if (this.nAz != null) {
          break label671;
        }
        localObject1 = com.tencent.mm.kernel.h.xy().xh().get(w.a.vrC, Boolean.valueOf(false));
        if (localObject1 == null) {
          break label681;
        }
      }
    }
    label494:
    label500:
    label505:
    label671:
    label681:
    for (boolean bool1 = ((Boolean)localObject1).booleanValue();; bool1 = false)
    {
      if (bool1)
      {
        w.i("MicroMsg.WalletOrderInfoOldUI", "has show the finger print auth guide!");
        GMTrace.o(6932882522112L, 51654);
        return;
        i = 1;
        break;
        bool1 = false;
        break label213;
        j = 2;
        break label220;
        w.k("MicroMsg.WalletOrderInfoOldUI", "mOrders info is Illegal!", new Object[0]);
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6963484164096L, 51882);
            WalletOrderInfoOldUI.this.done();
            GMTrace.o(6963484164096L, 51882);
          }
        });
        break label426;
      }
      localObject2 = com.tencent.mm.wallet_core.a.ad(this);
      localObject1 = new Bundle();
      if (localObject2 != null) {
        localObject1 = ((com.tencent.mm.wallet_core.b)localObject2).ler;
      }
      if (TextUtils.isEmpty(((Bundle)localObject1).getString("key_pwd1")))
      {
        w.i("MicroMsg.WalletOrderInfoOldUI", "pwd is empty, not show the finger print auth guide!");
        GMTrace.o(6932882522112L, 51654);
        return;
      }
      this.rnN = false;
      if (localObject2 != null) {
        ((com.tencent.mm.wallet_core.b)localObject2).a(this, "fingerprint", ".ui.FingerPrintAuthTransparentUI", (Bundle)localObject1);
      }
      GMTrace.o(6932882522112L, 51654);
      return;
      w.k("MicroMsg.WalletOrderInfoOldUI", "mOrders info is Illegal!", new Object[0]);
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6982140428288L, 52021);
          WalletOrderInfoOldUI.this.finish();
          GMTrace.o(6982140428288L, 52021);
        }
      });
      GMTrace.o(6932882522112L, 51654);
      return;
    }
  }
  
  protected final void a(Orders.b paramb)
  {
    GMTrace.i(6933822046208L, 51661);
    r(new com.tencent.mm.plugin.wallet_core.c.g(paramb, bxg(), this.nAz, paramb.rgS));
    GMTrace.o(6933822046208L, 51661);
  }
  
  protected final void a(String paramString, d paramd)
  {
    GMTrace.i(6934358917120L, 51665);
    bzy();
    this.rnM = paramd;
    com.tencent.mm.wallet_core.ui.e.p(this, paramString, 1);
    this.rnN = false;
    GMTrace.o(6934358917120L, 51665);
  }
  
  protected final boolean bbM()
  {
    GMTrace.i(6933150957568L, 51656);
    GMTrace.o(6933150957568L, 51656);
    return false;
  }
  
  public final void bzE()
  {
    GMTrace.i(6935164223488L, 51671);
    bzy();
    this.rnN = false;
    Object localObject1 = new am();
    ((am)localObject1).eBD.eBE = true;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    Object localObject2 = new Bundle();
    ((Bundle)localObject2).putInt("intent_pay_end_errcode", this.ui.getInt("intent_pay_end_errcode"));
    ((Bundle)localObject2).putString("intent_pay_app_url", this.ui.getString("intent_pay_app_url"));
    ((Bundle)localObject2).putBoolean("intent_pay_end", this.ui.getBoolean("intent_pay_end"));
    w.i("MicroMsg.WalletOrderInfoOldUI", "pay done...feedbackData errCode:" + this.ui.getInt("intent_pay_end_errcode"));
    Iterator localIterator = this.rmZ.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (!bg.nm(str1))
      {
        w.i("MicroMsg.WalletOrderInfoOldUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str1 });
        if ((this.qYC == null) || (this.qYU == null)) {
          break label342;
        }
        com.tencent.mm.ad.n localn = com.tencent.mm.kernel.h.xx().fYr;
        String str2 = this.qYC.eHG;
        if (this.qYC.rhv.size() <= 0) {
          break label336;
        }
        localObject1 = ((Orders.Commodity)this.qYC.rhv.get(0)).eRP;
        label253:
        localn.a(new i(str1, str2, (String)localObject1, this.qYU.ePL, this.qYU.ePH, this.qYC.rhm), 0);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(13033, new Object[] { Integer.valueOf(2), str1, "", "", "" });
        break;
        label336:
        localObject1 = "";
        break label253;
        label342:
        com.tencent.mm.kernel.h.xx().fYr.a(new i(str1), 0);
      }
    }
    com.tencent.mm.wallet_core.a.i(this, (Bundle)localObject2);
    if ((this.qYC != null) && (!bg.nm(this.qYC.kBQ))) {
      if (this.qYC.rhv.size() <= 0) {
        break label548;
      }
    }
    label548:
    for (localObject1 = ((Orders.Commodity)this.qYC.rhv.get(0)).eRP;; localObject1 = "")
    {
      localObject1 = d(this.qYC.kBQ, this.qYC.eHG, (String)localObject1, this.qYU.jxX, this.qYU.hLO);
      w.d("MicroMsg.WalletOrderInfoOldUI", "url = " + (String)localObject1);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("showShare", false);
      ((Intent)localObject2).putExtra("geta8key_username", com.tencent.mm.y.q.zE());
      ((Intent)localObject2).putExtra("stastic_scene", 8);
      d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject2);
      GMTrace.o(6935164223488L, 51671);
      return;
    }
  }
  
  protected final Orders bzF()
  {
    GMTrace.i(6933285175296L, 51657);
    Orders localOrders = (Orders)this.ui.getParcelable("key_orders");
    GMTrace.o(6933285175296L, 51657);
    return localOrders;
  }
  
  public void bzG()
  {
    GMTrace.i(6933419393024L, 51658);
    l(new o(bxg()));
    GMTrace.o(6933419393024L, 51658);
  }
  
  public final void bzH()
  {
    GMTrace.i(6934224699392L, 51664);
    if (this.qYC != null)
    {
      this.rna = this.qYC.rhv;
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
      this.rnE.setVisibility(0);
      this.rnF.setVisibility(0);
      if (i != 0)
      {
        if ((!bg.nm(this.qYC.rho)) && (!bg.nm(this.qYC.rho.trim())))
        {
          this.rnF.setText(this.qYC.rho);
          GMTrace.o(6934224699392L, 51664);
          return;
        }
        if (this.qYC.rcw != 1)
        {
          this.rnF.setText(a.i.tdq);
          GMTrace.o(6934224699392L, 51664);
          return;
        }
        this.rnF.setText(a.i.tdp);
        GMTrace.o(6934224699392L, 51664);
        return;
      }
      this.rnF.setText(a.i.tdr);
      GMTrace.o(6934224699392L, 51664);
      return;
    }
  }
  
  public final void bzy()
  {
    int i = 0;
    GMTrace.i(6934627352576L, 51667);
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
    GMTrace.o(6934627352576L, 51667);
  }
  
  public final void c(Orders paramOrders)
  {
    GMTrace.i(6933956263936L, 51662);
    this.rmZ.clear();
    if ((paramOrders == null) || (paramOrders.rhv == null))
    {
      w.w("MicroMsg.WalletOrderInfoOldUI", "hy: orders is null");
      GMTrace.o(6933956263936L, 51662);
      return;
    }
    paramOrders = paramOrders.rhv.iterator();
    while (paramOrders.hasNext())
    {
      Orders.Commodity localCommodity = (Orders.Commodity)paramOrders.next();
      if ((localCommodity.rhm == 2) && (!bg.nm(localCommodity.rhK)))
      {
        w.d("MicroMsg.WalletOrderInfoOldUI", "hy: has username and is force recommend");
        this.rmZ.add(localCommodity.rhK);
      }
    }
    GMTrace.o(6933956263936L, 51662);
  }
  
  protected final void cd(String paramString, int paramInt)
  {
    GMTrace.i(6933687828480L, 51660);
    l(new com.tencent.mm.plugin.wallet_core.c.p(paramString, paramInt));
    GMTrace.o(6933687828480L, 51660);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6935835312128L, 51676);
    int i;
    if (((paramk instanceof com.tencent.mm.plugin.wallet_core.c.q)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.plugin.wallet_core.c.q localq = (com.tencent.mm.plugin.wallet_core.c.q)paramk;
      b localb = new b(localq.mXK);
      if ((!bg.nm(localb.url)) && (!bg.nm(localb.eLQ)))
      {
        i = 1;
        if (i != 0) {
          this.rkO.put(localq.rcA, localb);
        }
        this.rnH.notifyDataSetChanged();
      }
    }
    else
    {
      if (!(paramk instanceof com.tencent.mm.plugin.wallet_core.c.p)) {
        break label361;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        sv(0);
        this.qYC = ((com.tencent.mm.plugin.wallet_core.c.p)paramk).rcB;
        if (this.qYC != null) {
          this.rna = this.qYC.rhv;
        }
        c(this.qYC);
        w.d("MicroMsg.WalletOrderInfoOldUI", "Coomdity:" + this.rna);
        if ((this.rna != null) && (this.rna.size() != 0))
        {
          paramString = (Orders.Commodity)this.rna.get(0);
          this.nAz = paramString.eRP;
          w.d("MicroMsg.WalletOrderInfoOldUI", "Coomdity:" + paramString.toString());
          paramk = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString.nEs);
          if ((paramk == null) || ((int)paramk.fTq == 0)) {
            break label340;
          }
          K(paramk);
        }
      }
    }
    for (;;)
    {
      this.rnH.notifyDataSetChanged();
      bzH();
      if (this.rnH != null) {
        this.rnH.notifyDataSetChanged();
      }
      bzI();
      GMTrace.o(6935835312128L, 51676);
      return true;
      i = 0;
      break;
      label340:
      ak.a.gmX.a(paramString.nEs, "", this.rnO);
    }
    label361:
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.g))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.wallet_core.c.g)paramk;
        paramk = paramString.rcl;
        long l = paramString.rco.rgN;
        this.rnL.put(Long.valueOf(l), paramk);
        paramString.rco.rgT = paramString.jNb;
        if ((!"-1".equals(paramk)) && (!"0".equals(paramk)) && (!bg.nm(paramString.rcm))) {
          com.tencent.mm.ui.base.h.b(this, paramString.rcm, "", true);
        }
        while (!"0".equals(paramk))
        {
          this.rnH.notifyDataSetChanged();
          GMTrace.o(6935835312128L, 51676);
          return true;
        }
        if (!bg.nm(paramString.rcm)) {}
        for (paramString = paramString.rcm;; paramString = getString(a.i.ted))
        {
          Toast.makeText(this, paramString, 0).show();
          break;
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.g))
      {
        paramk = paramString;
        if (bg.nm(paramString)) {
          paramk = getString(a.i.tgK);
        }
        com.tencent.mm.ui.base.h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6947243819008L, 51761);
            GMTrace.o(6947243819008L, 51761);
          }
        });
        GMTrace.o(6935835312128L, 51676);
        return true;
      }
    }
    GMTrace.o(6935835312128L, 51676);
    return false;
  }
  
  public void done()
  {
    GMTrace.i(6935030005760L, 51670);
    if (this.ui.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.ui.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoOldUI");
        localBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        boolean bool = localRealnameGuideHelper.b(this, localBundle, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6984422129664L, 52038);
            WalletOrderInfoOldUI.this.bzE();
            GMTrace.o(6984422129664L, 52038);
          }
        });
        this.ui.remove("key_realname_guide_helper");
        if (!bool) {
          bzE();
        }
      }
      GMTrace.o(6935030005760L, 51670);
      return;
    }
    bzE();
    GMTrace.o(6935030005760L, 51670);
  }
  
  public final String ei(long paramLong)
  {
    GMTrace.i(6935969529856L, 51677);
    if (this.rnL.containsKey(Long.valueOf(paramLong)))
    {
      String str = (String)this.rnL.get(Long.valueOf(paramLong));
      GMTrace.o(6935969529856L, 51677);
      return str;
    }
    GMTrace.o(6935969529856L, 51677);
    return "-1";
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6932748304384L, 51653);
    int i = a.g.sJO;
    GMTrace.o(6932748304384L, 51653);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6935566876672L, 51674);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.WalletOrderInfoOldUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1) {
      l(new com.tencent.mm.plugin.wallet_core.c.q(this.rnM.rcA, this.rnM.rnA, this.rnM.rnB, this.rnM.rnC, this.rnM.eJQ, this.rnM.omN, this.rnM.ril));
    }
    GMTrace.o(6935566876672L, 51674);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6933016739840L, 51655);
    super.onCreate(paramBundle);
    sv(4);
    this.rmZ = new HashSet();
    PY();
    MP();
    hN(1979);
    com.tencent.mm.sdk.b.a.vgX.b(this.rnw);
    com.tencent.mm.sdk.b.a.vgX.b(this.nCD);
    this.rnN = false;
    GMTrace.o(6933016739840L, 51655);
  }
  
  @Deprecated
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(6935432658944L, 51673);
    Dialog localDialog = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(a.i.tdn), getResources().getStringArray(a.b.slP), "", new h.c()
    {
      public final void hQ(int paramAnonymousInt)
      {
        GMTrace.i(6979590291456L, 52002);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(6979590291456L, 52002);
          return;
          WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this, false);
          Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletOrderInfoOldUI.this.nFJ));
          localIntent.addFlags(268435456);
          WalletOrderInfoOldUI.this.startActivity(localIntent);
        }
      }
    });
    GMTrace.o(6935432658944L, 51673);
    return localDialog;
  }
  
  public void onDestroy()
  {
    GMTrace.i(6934895788032L, 51669);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.vgX.c(this.rnw);
    com.tencent.mm.sdk.b.a.vgX.c(this.nCD);
    hO(1979);
    GMTrace.o(6934895788032L, 51669);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6935298441216L, 51672);
    if (paramInt == 4)
    {
      done();
      GMTrace.o(6935298441216L, 51672);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6935298441216L, 51672);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(16141963493376L, 120267);
    super.onResume();
    w.i("MicroMsg.WalletOrderInfoOldUI", "onResume, isClickActivityTinyApp: %s", new Object[] { Boolean.valueOf(this.rnN) });
    if (this.rnN) {
      l(new com.tencent.mm.plugin.wallet_core.c.q(this.rnM.rcA, this.rnM.rnA, this.rnM.rnB, this.rnM.rnC, this.rnM.eJQ, this.rnM.omN, this.rnM.ril));
    }
    GMTrace.o(16141963493376L, 120267);
  }
  
  public final class a
    extends BaseAdapter
  {
    public a()
    {
      GMTrace.i(6919460749312L, 51554);
      GMTrace.o(6919460749312L, 51554);
    }
    
    private Orders.Commodity wW(int paramInt)
    {
      GMTrace.i(6919729184768L, 51556);
      Orders.Commodity localCommodity = (Orders.Commodity)WalletOrderInfoOldUI.this.rna.get(paramInt);
      GMTrace.o(6919729184768L, 51556);
      return localCommodity;
    }
    
    public final int getCount()
    {
      GMTrace.i(6919594967040L, 51555);
      if (WalletOrderInfoOldUI.this.rna != null)
      {
        int i = WalletOrderInfoOldUI.this.rna.size();
        GMTrace.o(6919594967040L, 51555);
        return i;
      }
      GMTrace.o(6919594967040L, 51555);
      return 0;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6919863402496L, 51557);
      long l = paramInt;
      GMTrace.o(6919863402496L, 51557);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6919997620224L, 51558);
      final Orders.Commodity localCommodity;
      if (paramView == null)
      {
        paramView = View.inflate(WalletOrderInfoOldUI.this, a.g.sPO, null);
        paramViewGroup = new a();
        paramViewGroup.rnT = ((TextView)paramView.findViewById(a.f.sJQ));
        paramViewGroup.hqI = ((TextView)paramView.findViewById(a.f.sJU));
        paramViewGroup.rnW = ((TextView)paramView.findViewById(a.f.sKm));
        paramViewGroup.rnU = ((TextView)paramView.findViewById(a.f.sKr));
        paramViewGroup.rnV = ((TextView)paramView.findViewById(a.f.sKf));
        paramViewGroup.rnV.getPaint().setFlags(16);
        paramViewGroup.rnX = ((TextView)paramView.findViewById(a.f.sKs));
        paramViewGroup.rnY = ((TextView)paramView.findViewById(a.f.sJT));
        paramViewGroup.rnZ = ((TextView)paramView.findViewById(a.f.sJP));
        paramViewGroup.rob = ((MaxListView)paramView.findViewById(a.f.sKh));
        paramViewGroup.roc = paramView.findViewById(a.f.sJX);
        paramViewGroup.roa = paramView.findViewById(a.f.sKk);
        paramViewGroup.roe = ((TextView)paramView.findViewById(a.f.sKt));
        paramViewGroup.rod = ((TextView)paramView.findViewById(a.f.sKu));
        paramViewGroup.rof = ((TextView)paramView.findViewById(a.f.sKv));
        paramViewGroup.rog = ((TextView)paramView.findViewById(a.f.sKw));
        paramViewGroup.roi = ((ViewGroup)paramView.findViewById(a.f.sKo));
        paramViewGroup.rkV = ((CdnImageView)paramView.findViewById(a.f.sHJ));
        paramViewGroup.rkW = ((TextView)paramView.findViewById(a.f.sHF));
        paramViewGroup.rkX = ((TextView)paramView.findViewById(a.f.sHK));
        paramViewGroup.roh = paramView.findViewById(a.f.sKl);
        paramView.setTag(paramViewGroup);
        localCommodity = wW(paramInt);
        if ((localCommodity == null) || (paramViewGroup == null)) {
          break label1199;
        }
        WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this, localCommodity.eRP);
        paramViewGroup.rnU.setText(com.tencent.mm.wallet_core.ui.e.d(localCommodity.jWS, localCommodity.nEr));
        if ((localCommodity.rhJ < 0.0D) || (localCommodity.jWS >= localCommodity.rhJ)) {
          break label656;
        }
        paramViewGroup.rnV.setText(com.tencent.mm.wallet_core.ui.e.d(localCommodity.rhJ, localCommodity.nEr));
        paramViewGroup.rnV.setVisibility(0);
      }
      Object localObject1;
      Object localObject2;
      for (;;)
      {
        localObject1 = (LinearLayout)paramViewGroup.roc;
        localObject2 = localCommodity.rhM;
        ((LinearLayout)localObject1).removeAllViews();
        if ((localObject2 == null) || (((List)localObject2).size() <= 0)) {
          break label668;
        }
        paramInt = 0;
        while (paramInt < ((List)localObject2).size())
        {
          Orders.DiscountInfo localDiscountInfo = (Orders.DiscountInfo)((List)localObject2).get(paramInt);
          TextView localTextView = new TextView(WalletOrderInfoOldUI.this.vKB.vKW);
          LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams.bottomMargin = WalletOrderInfoOldUI.this.vKB.vKW.getResources().getDimensionPixelOffset(a.d.aPv);
          localTextView.setLayoutParams(localLayoutParams);
          localTextView.setTextAppearance(WalletOrderInfoOldUI.this.vKB.vKW, a.j.til);
          localTextView.setText(localDiscountInfo.qXr + com.tencent.mm.wallet_core.ui.e.d(localDiscountInfo.rhY / 100.0D, WalletOrderInfoOldUI.this.qYC.nEr));
          ((LinearLayout)localObject1).addView(localTextView);
          localTextView.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(a.c.smQ));
          paramInt += 1;
        }
        paramViewGroup = (a)paramView.getTag();
        break;
        label656:
        paramViewGroup.rnV.setVisibility(8);
      }
      label668:
      if (((LinearLayout)localObject1).getChildCount() > 0)
      {
        ((LinearLayout)localObject1).setVisibility(0);
        localObject2 = paramViewGroup.rnT;
        localObject1 = WalletOrderInfoOldUI.this;
        if (!com.tencent.mm.y.q.zR()) {
          break label1219;
        }
        localObject1 = ((Context)localObject1).getString(a.i.tdm);
        label710:
        ((TextView)localObject2).setText((CharSequence)localObject1);
        paramViewGroup.rnW.setText(localCommodity.nEg);
        paramViewGroup.hqI.setText(localCommodity.desc);
        paramViewGroup.hqI.setTag(localCommodity.desc);
        paramViewGroup.hqI.setOnLongClickListener(WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this));
        paramViewGroup.hqI.setBackgroundResource(a.e.spi);
        paramViewGroup.rnX.setText(localCommodity.eRP);
        paramViewGroup.rnX.setTag(localCommodity.eRP);
        paramViewGroup.rnX.setOnLongClickListener(WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this));
        paramViewGroup.rnX.setBackgroundResource(a.e.spi);
        paramViewGroup.rnY.setText(com.tencent.mm.wallet_core.ui.e.EO(localCommodity.nEn));
        paramViewGroup.rnZ.setText(localCommodity.nEp);
        localObject1 = localCommodity.rhN;
        if (paramViewGroup.rof != null)
        {
          if (bg.nm((String)localObject1)) {
            break label1232;
          }
          paramViewGroup.rof.setText((CharSequence)localObject1);
          paramViewGroup.rof.setVisibility(0);
          paramViewGroup.rog.setVisibility(0);
        }
        label899:
        localObject1 = localCommodity.rhP;
        if (paramViewGroup.roe != null)
        {
          if (bg.nm((String)localObject1)) {
            break label1253;
          }
          paramViewGroup.roe.setText((CharSequence)localObject1);
          paramViewGroup.roe.setVisibility(0);
          paramViewGroup.rod.setVisibility(0);
        }
        label946:
        if (localCommodity.rhR.size() <= 0) {
          break label1274;
        }
        localObject1 = (Orders.b)localCommodity.rhR.get(0);
        com.tencent.mm.plugin.report.service.g.ork.i(13033, new Object[] { Integer.valueOf(1), ((Orders.b)localObject1).nEs, ((Orders.b)localObject1).url, ((Orders.b)localObject1).name, WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this) });
        WalletOrderInfoOldUI.this.rnK = new WalletOrderInfoOldUI.c(WalletOrderInfoOldUI.this, localCommodity.rhR);
        paramViewGroup.rob.setAdapter(WalletOrderInfoOldUI.this.rnK);
        paramViewGroup.rob.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(6994488459264L, 52113);
            paramAnonymousAdapterView = WalletOrderInfoOldUI.this.rnK.wX(paramAnonymousInt);
            if (!bg.nm(paramAnonymousAdapterView.nEs))
            {
              if (WalletOrderInfoOldUI.this.rmZ.contains(paramAnonymousAdapterView.nEs)) {
                WalletOrderInfoOldUI.this.rmZ.remove(paramAnonymousAdapterView.nEs);
              }
              for (;;)
              {
                WalletOrderInfoOldUI.this.rnH.notifyDataSetChanged();
                GMTrace.o(6994488459264L, 52113);
                return;
                WalletOrderInfoOldUI.this.rmZ.add(paramAnonymousAdapterView.nEs);
              }
            }
            paramAnonymousView = WalletOrderInfoOldUI.this.ei(paramAnonymousAdapterView.rgN);
            if (("-1".equals(paramAnonymousView)) || ("3".equals(paramAnonymousView)))
            {
              com.tencent.mm.plugin.report.service.g.ork.i(13472, new Object[] { WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this), Integer.valueOf(paramAnonymousAdapterView.ria), Integer.valueOf(1), Long.valueOf(paramAnonymousAdapterView.rgN), Long.valueOf(paramAnonymousAdapterView.rgS) });
              com.tencent.mm.plugin.report.service.g.ork.i(13033, new Object[] { Integer.valueOf(2), "", paramAnonymousAdapterView.url, paramAnonymousAdapterView.name, "" });
              if ((!bg.nm(paramAnonymousAdapterView.rid)) && (!bg.nm(paramAnonymousAdapterView.rie)))
              {
                w.i("MicroMsg.WalletOrderInfoOldUI", "promotion jump tiny app, username: %s, path: %s", new Object[] { paramAnonymousAdapterView.rid, paramAnonymousAdapterView.rie });
                paramAnonymousView = new qi();
                paramAnonymousView.eUY.userName = paramAnonymousAdapterView.rid;
                paramAnonymousView.eUY.eVa = bg.aq(paramAnonymousAdapterView.rie, "");
                paramAnonymousView.eUY.scene = 1060;
                paramAnonymousView.eUY.eAv = WalletOrderInfoOldUI.this.nAz;
                paramAnonymousView.eUY.eVb = 0;
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
                com.tencent.mm.plugin.report.service.g.ork.i(14118, new Object[] { WalletOrderInfoOldUI.this.nAz, WalletOrderInfoOldUI.this.bxg(), Integer.valueOf(2) });
                WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this, new WalletOrderInfoOldUI.d(WalletOrderInfoOldUI.this, paramAnonymousAdapterView.rgN, paramAnonymousAdapterView.rib, paramAnonymousAdapterView.rgQ, paramAnonymousAdapterView.rgR, WalletOrderInfoOldUI.this.bxg(), WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this), paramAnonymousAdapterView.rgS));
                WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this, true);
                GMTrace.o(6994488459264L, 52113);
                return;
              }
              if (paramAnonymousAdapterView.ria == 1)
              {
                WalletOrderInfoOldUI.this.a(paramAnonymousAdapterView);
                GMTrace.o(6994488459264L, 52113);
                return;
              }
              if ((paramAnonymousAdapterView.ria == 2) && (!bg.nm(paramAnonymousAdapterView.url)))
              {
                if (WalletOrderInfoOldUI.c(WalletOrderInfoOldUI.this).containsKey(paramAnonymousAdapterView.rgN))
                {
                  paramAnonymousAdapterView = (WalletOrderInfoOldUI.b)WalletOrderInfoOldUI.c(WalletOrderInfoOldUI.this).get(paramAnonymousAdapterView.rgN);
                  w.i("MicroMsg.WalletOrderInfoOldUI", "go to new url %s", new Object[] { paramAnonymousAdapterView.url });
                  WalletOrderInfoOldUI.this.Kz(paramAnonymousAdapterView.url);
                  GMTrace.o(6994488459264L, 52113);
                  return;
                }
                WalletOrderInfoOldUI.this.rkP = paramAnonymousAdapterView.url;
                WalletOrderInfoOldUI.this.a(paramAnonymousAdapterView.url, new WalletOrderInfoOldUI.d(WalletOrderInfoOldUI.this, paramAnonymousAdapterView.rgN, paramAnonymousAdapterView.rib, paramAnonymousAdapterView.rgQ, paramAnonymousAdapterView.rgR, WalletOrderInfoOldUI.this.bxg(), WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this), paramAnonymousAdapterView.rgS));
                GMTrace.o(6994488459264L, 52113);
                return;
              }
              w.e("MicroMsg.WalletOrderInfoOldUI", "promotion's activityActionType != ACTION_TYPE_NORMAL and url is null,unknow option");
            }
            GMTrace.o(6994488459264L, 52113);
          }
        });
        WalletOrderInfoOldUI.this.rnK.notifyDataSetChanged();
        paramViewGroup.rob.setVisibility(0);
        paramViewGroup.roa.setVisibility(0);
        label1107:
        if ((localCommodity.rhQ == null) || (bg.nm(localCommodity.rhQ.rgY))) {
          break label1304;
        }
        paramViewGroup.rkV.setUrl(localCommodity.rhQ.rgW);
        paramViewGroup.rkW.setText(localCommodity.rhQ.rgX);
        paramViewGroup.rkX.setText(localCommodity.rhQ.rgV);
        paramViewGroup.roi.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6964557905920L, 51890);
            paramAnonymousView = new qi();
            paramAnonymousView.eUY.userName = localCommodity.rhQ.rgY;
            paramAnonymousView.eUY.eVa = bg.aq(localCommodity.rhQ.rgZ, "");
            paramAnonymousView.eUY.scene = 1034;
            paramAnonymousView.eUY.eVb = 0;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
            com.tencent.mm.plugin.report.service.g.ork.i(14118, new Object[] { WalletOrderInfoOldUI.this.nAz, WalletOrderInfoOldUI.this.bxg(), Integer.valueOf(1) });
            GMTrace.o(6964557905920L, 51890);
          }
        });
        paramViewGroup.roh.setVisibility(0);
      }
      for (;;)
      {
        label1199:
        GMTrace.o(6919997620224L, 51558);
        return paramView;
        ((LinearLayout)localObject1).setVisibility(8);
        break;
        label1219:
        localObject1 = ((Context)localObject1).getString(a.i.tdl);
        break label710;
        label1232:
        paramViewGroup.rog.setVisibility(8);
        paramViewGroup.rof.setVisibility(8);
        break label899;
        label1253:
        paramViewGroup.rod.setVisibility(8);
        paramViewGroup.roe.setVisibility(8);
        break label946;
        label1274:
        paramViewGroup.rob.setVisibility(8);
        paramViewGroup.roi.setVisibility(8);
        paramViewGroup.roa.setVisibility(8);
        break label1107;
        label1304:
        paramViewGroup.roi.setVisibility(8);
        paramViewGroup.roh.setVisibility(8);
      }
    }
    
    final class a
    {
      TextView hqI;
      CdnImageView rkV;
      TextView rkW;
      TextView rkX;
      TextView rnT;
      TextView rnU;
      TextView rnV;
      TextView rnW;
      TextView rnX;
      TextView rnY;
      TextView rnZ;
      View roa;
      MaxListView rob;
      View roc;
      TextView rod;
      TextView roe;
      TextView rof;
      TextView rog;
      View roh;
      ViewGroup roi;
      
      a()
      {
        GMTrace.i(6996501725184L, 52128);
        GMTrace.o(6996501725184L, 52128);
      }
    }
  }
  
  final class b
  {
    public String eLQ;
    public String eQA;
    public String rnz;
    public String title;
    public String url;
    
    public b(JSONObject paramJSONObject)
    {
      GMTrace.i(6927782248448L, 51616);
      if (paramJSONObject == null)
      {
        GMTrace.o(6927782248448L, 51616);
        return;
      }
      this$1 = paramJSONObject.optJSONObject("activity_change_info");
      if (WalletOrderInfoOldUI.this != null)
      {
        this.url = WalletOrderInfoOldUI.this.optString("url");
        this.eLQ = WalletOrderInfoOldUI.this.optString("wording");
        this.eQA = WalletOrderInfoOldUI.this.optString("icon");
        this.rnz = WalletOrderInfoOldUI.this.optString("btn_text");
        this.title = WalletOrderInfoOldUI.this.optString("title");
      }
      GMTrace.o(6927782248448L, 51616);
    }
    
    public final String toString()
    {
      GMTrace.i(6927916466176L, 51617);
      String str = this.url + " , " + this.eLQ + " , " + this.eQA + " , " + this.rnz + " , " + this.title;
      GMTrace.o(6927916466176L, 51617);
      return str;
    }
  }
  
  final class c
    extends BaseAdapter
  {
    protected List<Orders.b> rhR;
    
    public c()
    {
      GMTrace.i(6948183343104L, 51768);
      this.rhR = null;
      this.rhR = new ArrayList();
      Object localObject;
      int j = ((List)localObject).size();
      int i = 0;
      while (i < j)
      {
        this$1 = (Orders.b)((List)localObject).get(i);
        if ((WalletOrderInfoOldUI.this != null) && ((!bg.nm(WalletOrderInfoOldUI.this.nEs)) || (WalletOrderInfoOldUI.this.ria == 2) || (WalletOrderInfoOldUI.this.ria == 1))) {
          this.rhR.add(((List)localObject).get(i));
        }
        i += 1;
      }
      GMTrace.o(6948183343104L, 51768);
    }
    
    public final int getCount()
    {
      GMTrace.i(6948317560832L, 51769);
      if (this.rhR != null)
      {
        int i = this.rhR.size();
        GMTrace.o(6948317560832L, 51769);
        return i;
      }
      GMTrace.o(6948317560832L, 51769);
      return 0;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6948585996288L, 51771);
      long l = paramInt;
      GMTrace.o(6948585996288L, 51771);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6948720214016L, 51772);
      Orders.b localb = wX(paramInt);
      Object localObject;
      if ((bg.nm(localb.nEs)) && (localb.rgN > 0L))
      {
        localObject = WalletOrderInfoOldUI.this.ei(localb.rgN);
        com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
        String str = WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this);
        paramInt = localb.ria;
        paramViewGroup = (ViewGroup)localObject;
        if ("-1".equals(localObject)) {
          paramViewGroup = Integer.valueOf(5);
        }
        localg.i(13471, new Object[] { str, Integer.valueOf(1), Integer.valueOf(paramInt), paramViewGroup, Long.valueOf(localb.rgN), Long.valueOf(localb.rgS) });
      }
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramViewGroup.type = localb.type;
        if (localb.type == Orders.rhI) {
          if (localb.rhZ == 1)
          {
            paramView = View.inflate(WalletOrderInfoOldUI.this, a.g.sPP, null);
            paramViewGroup.roj = ((CdnImageView)paramView.findViewById(a.f.sKc));
            paramViewGroup.hqi = ((TextView)paramView.findViewById(a.f.sKp));
            paramViewGroup.rok = ((TextView)paramView.findViewById(a.f.sJS));
            paramViewGroup.hvQ = ((TextView)paramView.findViewById(a.f.sKe));
            if (!TextUtils.isEmpty(localb.url)) {
              WalletOrderInfoOldUI.this.rnJ.put(localb.url, paramViewGroup.rok);
            }
            paramView.setTag(paramViewGroup);
            paramViewGroup.rhZ = localb.rhZ;
          }
        }
      }
      label301:
      label402:
      label465:
      label500:
      label1349:
      label1388:
      label1399:
      label1426:
      label1478:
      label1629:
      for (;;)
      {
        if (localb != null)
        {
          localObject = (WalletOrderInfoOldUI.b)WalletOrderInfoOldUI.c(WalletOrderInfoOldUI.this).get(localb.rgN);
          w.i("MicroMsg.WalletOrderInfoOldUI", "try get result " + localObject);
          if (localObject == null) {
            break label1349;
          }
          paramViewGroup.roj.setUrl(((WalletOrderInfoOldUI.b)localObject).eQA);
          paramViewGroup.hvQ.setText(((WalletOrderInfoOldUI.b)localObject).eLQ);
          paramViewGroup.rok.setText(((WalletOrderInfoOldUI.b)localObject).rnz);
          if (bg.nm(localb.nEs)) {
            break label1399;
          }
          paramViewGroup.rok.setVisibility(8);
          if (paramViewGroup.rol != null)
          {
            paramViewGroup.rol.setVisibility(0);
            if (!WalletOrderInfoOldUI.this.rmZ.contains(localb.nEs)) {
              break label1388;
            }
            paramViewGroup.rol.setChecked(true);
          }
          if ((paramViewGroup.hqi == null) || (localObject == null) || (bg.nm(((WalletOrderInfoOldUI.b)localObject).title))) {
            break label1426;
          }
          paramViewGroup.hqi.setText(((WalletOrderInfoOldUI.b)localObject).title);
          if ((!bg.nm(WalletOrderInfoOldUI.this.rkP)) && (paramViewGroup.rok != null))
          {
            paramViewGroup.rok.setClickable(WalletOrderInfoOldUI.this.eBI);
            paramViewGroup.rok.setEnabled(WalletOrderInfoOldUI.this.eBI);
            paramViewGroup.rok.setOnClickListener(null);
            if (WalletOrderInfoOldUI.this.eBJ) {
              paramViewGroup.rok.setVisibility(8);
            }
          }
          long l = localb.rgN;
          localObject = WalletOrderInfoOldUI.this.ei(l);
          if (!((String)localObject).equals("0")) {
            break label1478;
          }
          paramViewGroup.rok.setBackgroundColor(WalletOrderInfoOldUI.this.getResources().getColor(a.c.transparent));
          paramViewGroup.rok.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(a.c.aPp));
        }
        for (;;)
        {
          if (paramViewGroup.rok != null)
          {
            paramInt = BackwardSupportUtil.b.a(WalletOrderInfoOldUI.this.vKB.vKW, 15.0F);
            i = BackwardSupportUtil.b.a(WalletOrderInfoOldUI.this.vKB.vKW, 5.0F);
            paramViewGroup.rok.setPadding(paramInt, i, paramInt, i);
          }
          GMTrace.o(6948720214016L, 51772);
          return paramView;
          paramView = View.inflate(WalletOrderInfoOldUI.this, a.g.sPQ, null);
          paramViewGroup.roj = ((CdnImageView)paramView.findViewById(a.f.sKc));
          paramViewGroup.rok = ((TextView)paramView.findViewById(a.f.sJS));
          paramViewGroup.hvQ = ((TextView)paramView.findViewById(a.f.sKe));
          paramViewGroup.hqi = ((TextView)paramView.findViewById(a.f.sKp));
          if (!TextUtils.isEmpty(localb.url)) {
            WalletOrderInfoOldUI.this.rnJ.put(localb.url, paramViewGroup.rok);
          }
          paramView.setTag(paramViewGroup);
          break;
          paramView = View.inflate(WalletOrderInfoOldUI.this, a.g.sPR, null);
          paramViewGroup.roj = ((CdnImageView)paramView.findViewById(a.f.sKc));
          paramViewGroup.rok = ((TextView)paramView.findViewById(a.f.sJS));
          paramViewGroup.hvQ = ((TextView)paramView.findViewById(a.f.sKe));
          paramViewGroup.rol = ((CheckBox)paramView.findViewById(a.f.spJ));
          if (!TextUtils.isEmpty(localb.url)) {
            WalletOrderInfoOldUI.this.rnJ.put(localb.url, paramViewGroup.rok);
          }
          paramView.setTag(paramViewGroup);
          break label301;
          paramViewGroup = (a)paramView.getTag();
          int i = 0;
          paramInt = i;
          if (localb.type == paramViewGroup.type) {
            if (localb.type == Orders.rhI)
            {
              paramInt = i;
              if (localb.rhZ != paramViewGroup.rhZ) {}
            }
            else
            {
              paramInt = 1;
            }
          }
          if (paramInt != 0) {
            break label1629;
          }
          paramViewGroup = new a();
          paramViewGroup.type = localb.type;
          if (localb.type == Orders.rhI)
          {
            if (localb.rhZ == 1)
            {
              paramView = View.inflate(WalletOrderInfoOldUI.this, a.g.sPP, null);
              paramViewGroup.roj = ((CdnImageView)paramView.findViewById(a.f.sKc));
              paramViewGroup.hqi = ((TextView)paramView.findViewById(a.f.sKp));
              paramViewGroup.rok = ((TextView)paramView.findViewById(a.f.sJS));
              paramViewGroup.hvQ = ((TextView)paramView.findViewById(a.f.sKe));
              if (!TextUtils.isEmpty(localb.url)) {
                WalletOrderInfoOldUI.this.rnJ.put(localb.url, paramViewGroup.rok);
              }
              paramView.setTag(paramViewGroup);
            }
            for (;;)
            {
              paramViewGroup.rhZ = localb.rhZ;
              break;
              paramView = View.inflate(WalletOrderInfoOldUI.this, a.g.sPQ, null);
              paramViewGroup.roj = ((CdnImageView)paramView.findViewById(a.f.sKc));
              paramViewGroup.rok = ((TextView)paramView.findViewById(a.f.sJS));
              paramViewGroup.hvQ = ((TextView)paramView.findViewById(a.f.sKe));
              paramViewGroup.hqi = ((TextView)paramView.findViewById(a.f.sKp));
              if (!TextUtils.isEmpty(localb.url)) {
                WalletOrderInfoOldUI.this.rnJ.put(localb.url, paramViewGroup.rok);
              }
              paramView.setTag(paramViewGroup);
            }
          }
          paramView = View.inflate(WalletOrderInfoOldUI.this, a.g.sPR, null);
          paramViewGroup.roj = ((CdnImageView)paramView.findViewById(a.f.sKc));
          paramViewGroup.rok = ((TextView)paramView.findViewById(a.f.sJS));
          paramViewGroup.hvQ = ((TextView)paramView.findViewById(a.f.sKe));
          paramViewGroup.rol = ((CheckBox)paramView.findViewById(a.f.spJ));
          if (!TextUtils.isEmpty(localb.url)) {
            WalletOrderInfoOldUI.this.rnJ.put(localb.url, paramViewGroup.rok);
          }
          paramView.setTag(paramViewGroup);
          break label301;
          paramViewGroup.roj.setUrl(localb.nIR);
          paramViewGroup.hvQ.setText(localb.name);
          paramViewGroup.rok.setText(localb.rgT);
          break label402;
          paramViewGroup.rol.setChecked(false);
          break label465;
          paramViewGroup.rok.setVisibility(0);
          if (paramViewGroup.rol == null) {
            break label465;
          }
          paramViewGroup.rol.setVisibility(8);
          break label465;
          if ((paramViewGroup.hqi != null) && (!bg.nm(localb.title)))
          {
            paramViewGroup.hqi.setText(localb.title);
            break label500;
          }
          if (paramViewGroup.hqi == null) {
            break label500;
          }
          paramViewGroup.hqi.setVisibility(8);
          break label500;
          if ((((String)localObject).equals("-1")) || (((String)localObject).equals("3")))
          {
            paramViewGroup.rok.setBackgroundDrawable(WalletOrderInfoOldUI.this.getResources().getDrawable(a.e.snN));
            paramViewGroup.rok.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(a.c.aPp));
          }
          else if ((((String)localObject).equals("4")) || (((String)localObject).equals("2")) || (((String)localObject).equals("1")))
          {
            paramViewGroup.rok.setBackgroundColor(WalletOrderInfoOldUI.this.getResources().getColor(a.c.transparent));
            paramViewGroup.rok.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(a.c.aOa));
          }
          else
          {
            w.e("MicroMsg.WalletOrderInfoOldUI", "PromotionsAdapter unknow award state");
          }
        }
      }
    }
    
    public final Orders.b wX(int paramInt)
    {
      GMTrace.i(6948451778560L, 51770);
      Orders.b localb = (Orders.b)this.rhR.get(paramInt);
      GMTrace.o(6948451778560L, 51770);
      return localb;
    }
    
    final class a
    {
      TextView hqi;
      TextView hvQ;
      int rhZ;
      CdnImageView roj;
      TextView rok;
      CheckBox rol;
      int type;
      
      a()
      {
        GMTrace.i(6954357358592L, 51814);
        GMTrace.o(6954357358592L, 51814);
      }
    }
  }
  
  final class d
  {
    public String eJQ;
    public String omN;
    public String rcA;
    public long ril;
    public String rnA;
    public String rnB;
    public String rnC;
    
    public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong)
    {
      GMTrace.i(16143171452928L, 120276);
      this.rcA = paramString1;
      this.rnA = paramString2;
      this.rnB = paramString3;
      this.rnC = paramString4;
      this.eJQ = paramString5;
      this.omN = paramString6;
      this.ril = paramLong;
      GMTrace.o(16143171452928L, 120276);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletOrderInfoOldUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */