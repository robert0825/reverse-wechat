package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.sk;
import com.tencent.mm.g.a.sr;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.g.a.ss.a;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.plugin.wallet.pay.a.b.d;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.h.b;
import com.tencent.mm.plugin.wallet_core.ui.l.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.r;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUI
  extends WalletBaseUI
  implements a.a
{
  private static boolean qZA;
  public String llG;
  public int mCount;
  private String onA;
  protected com.tencent.mm.plugin.wallet.a onh;
  public Button oow;
  public Orders opK;
  public com.tencent.mm.plugin.wallet_core.ui.l qTS;
  public ArrayList<Bankcard> qTU;
  public Bankcard qTV;
  private com.tencent.mm.plugin.wallet.pay.a.c qYL;
  public PayInfo qYU;
  public FavorPayInfo qYW;
  private a qYX;
  com.tencent.mm.plugin.wallet_core.ui.c qYY;
  private com.tencent.mm.sdk.b.c qYZ;
  protected com.tencent.mm.plugin.wallet_core.ui.a qZB;
  private boolean qZC;
  private boolean qZD;
  public boolean qZE;
  protected boolean qZF;
  protected String qZG;
  protected boolean qZH;
  public Bundle qZI;
  protected boolean qZJ;
  protected TextView qZK;
  protected TextView qZL;
  private TextView qZM;
  protected TextView qZN;
  protected TextView qZO;
  protected TextView qZP;
  protected ImageView qZQ;
  private TextView qZR;
  private TextView qZS;
  protected LinearLayout qZT;
  protected a qZU;
  private long qZV;
  private TextView qZW;
  private LinearLayout qZX;
  private boolean qZY;
  private boolean qZZ;
  private boolean raa;
  private boolean rab;
  private boolean rac;
  private int rad;
  private boolean rae;
  private boolean raf;
  private com.tencent.mm.plugin.wallet.pay.a.b.e rag;
  private boolean rah;
  private boolean rai;
  private long raj;
  
  static
  {
    GMTrace.i(7813887688704L, 58218);
    qZA = false;
    GMTrace.o(7813887688704L, 58218);
  }
  
  public WalletPayUI()
  {
    GMTrace.i(7807445237760L, 58170);
    this.opK = null;
    this.mCount = 0;
    this.llG = null;
    this.qTU = null;
    this.qTV = null;
    this.qYW = null;
    this.qZB = null;
    this.qZC = false;
    this.qZD = false;
    this.qZE = false;
    this.qZF = false;
    this.qZG = "";
    this.qYU = null;
    this.qZH = false;
    this.qZI = null;
    this.qZJ = false;
    this.qZV = 0L;
    this.qZY = true;
    this.qZZ = false;
    this.raa = false;
    this.rab = false;
    this.rac = false;
    this.rad = -1;
    this.rae = false;
    this.raf = false;
    this.onh = null;
    this.rah = false;
    this.rai = false;
    this.qYL = null;
    this.raj = 0L;
    this.qYZ = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7807445237760L, 58170);
  }
  
  private static Bankcard Ka(String paramString)
  {
    GMTrace.i(7811337551872L, 58199);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    Object localObject = com.tencent.mm.plugin.wallet.a.p.bxe().iL(true);
    if (((ArrayList)localObject).size() != 0)
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Bankcard localBankcard = (Bankcard)((Iterator)localObject).next();
        if (bg.nl(paramString).equals(localBankcard.field_bindSerial))
        {
          w.i("MicroMsg.WalletPayUI", "hy: get given bankcard");
          GMTrace.o(7811337551872L, 58199);
          return localBankcard;
        }
      }
    }
    GMTrace.o(7811337551872L, 58199);
    return null;
  }
  
  private void bxA()
  {
    GMTrace.i(7809324285952L, 58184);
    if (this.qZY)
    {
      this.oow.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7792010199040L, 58055);
          if (WalletPayUI.this.opK.rhx == 1)
          {
            WalletPayUI.d(WalletPayUI.this);
            GMTrace.o(7792010199040L, 58055);
            return;
          }
          w.i("MicroMsg.WalletPayUI", "SimpleReg , assigned userinfo pay! payWithNewBankcard");
          WalletPayUI.this.b(false, 0, "");
          GMTrace.o(7792010199040L, 58055);
        }
      });
      GMTrace.o(7809324285952L, 58184);
      return;
    }
    this.oow.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18973689118720L, 141365);
        WalletPayUI.this.bxE();
        GMTrace.o(18973689118720L, 141365);
      }
    });
    GMTrace.o(7809324285952L, 58184);
  }
  
  private void bxF()
  {
    GMTrace.i(17430587899904L, 129868);
    com.tencent.mm.plugin.report.service.g.ork.i(13958, new Object[] { Integer.valueOf(1) });
    if ((this.qYU != null) && (8 == this.qYU.ePL))
    {
      com.tencent.mm.plugin.report.service.g.ork.i(13955, new Object[] { Integer.valueOf(2) });
      if (this.qYU.tIC != null)
      {
        long l = this.qYU.tIC.getLong("extinfo_key_9");
        com.tencent.mm.plugin.report.service.g.ork.i(13956, new Object[] { Integer.valueOf(1), Long.valueOf(System.currentTimeMillis() - l) });
      }
    }
    if (this.qZF)
    {
      w.i("MicroMsg.WalletPayUI", "hy: start do pay with force use given bankcard");
      if (!bg.nm(this.qZG))
      {
        this.qTV = bxH();
        bxp();
        GMTrace.o(17430587899904L, 129868);
        return;
      }
      b(false, 0, "");
      GMTrace.o(17430587899904L, 129868);
      return;
    }
    String str = bg.aq(getIntent().getStringExtra("key_is_use_default_card"), "");
    if (!bg.nm(str)) {
      this.qTV = Ka(str);
    }
    if (this.qTV == null)
    {
      if ((this.qTU != null) && (this.qTU.size() > 0))
      {
        w.i("MicroMsg.WalletPayUI", " no last pay bankcard ! jump to select bankcard!");
        c(false, 8, "");
        GMTrace.o(17430587899904L, 129868);
        return;
      }
      w.i("MicroMsg.WalletPayUI", "default bankcard not found! payWithNewBankcard");
      b(false, 0, "");
      GMTrace.o(17430587899904L, 129868);
      return;
    }
    int i = this.qTV.a(this.opK.rcw, this.opK);
    if (this.onh != null) {
      this.onh.ay(10002, "");
    }
    if (i != 0)
    {
      w.i("MicroMsg.WalletPayUI", "main bankcard(" + i + ") is useless! jump to select bankcard!");
      c(false, i, "");
      GMTrace.o(17430587899904L, 129868);
      return;
    }
    com.tencent.mm.plugin.wallet.a.p.bxd();
    if (com.tencent.mm.plugin.wallet.a.p.bxe().byT())
    {
      w.i("MicroMsg.WalletPayUI", "payWithoutPassword");
      iP(true);
      com.tencent.mm.plugin.wallet_core.e.c.bAa();
      GMTrace.o(17430587899904L, 129868);
      return;
    }
    w.i("MicroMsg.WalletPayUI", "has useful bankcard ! payWithOldBankcard");
    bxp();
    GMTrace.o(17430587899904L, 129868);
  }
  
  private Bankcard bxH()
  {
    GMTrace.i(7811203334144L, 58198);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    Object localObject = com.tencent.mm.plugin.wallet.a.p.bxe().iL(true);
    if (((ArrayList)localObject).size() != 0)
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Bankcard localBankcard = (Bankcard)((Iterator)localObject).next();
        if (bg.nl(this.qZG).equals(localBankcard.field_bindSerial))
        {
          w.i("MicroMsg.WalletPayUI", "hy: get given bankcard");
          GMTrace.o(7811203334144L, 58198);
          return localBankcard;
        }
      }
    }
    GMTrace.o(7811203334144L, 58198);
    return null;
  }
  
  private void bxI()
  {
    GMTrace.i(7811874422784L, 58203);
    if (aNg())
    {
      sv(4);
      GMTrace.o(7811874422784L, 58203);
      return;
    }
    sv(0);
    GMTrace.o(7811874422784L, 58203);
  }
  
  private boolean bxx()
  {
    GMTrace.i(7807713673216L, 58172);
    Bundle localBundle = getIntent().getExtras();
    if ((localBundle != null) && (localBundle.containsKey("intent_pay_end")))
    {
      w.i("MicroMsg.WalletPayUI", "hy: pay end. finish the activity");
      if (localBundle.getBoolean("intent_pay_end", false))
      {
        w.d("MicroMsg.WalletPayUI", "pay done... errCode:" + localBundle.getInt("intent_pay_end_errcode"));
        w.d("MicroMsg.WalletPayUI", "pay done INTENT_PAY_APP_URL:" + localBundle.getString("intent_pay_app_url"));
        w.d("MicroMsg.WalletPayUI", "pay done INTENT_PAY_END:" + localBundle.getBoolean("intent_pay_end", false));
        c(-1, getIntent());
      }
      for (this.qZD = true;; this.qZD = false)
      {
        GMTrace.o(7807713673216L, 58172);
        return true;
        w.d("MicroMsg.WalletPayUI", "pay cancel");
        c(0, getIntent());
      }
    }
    if ((localBundle != null) && (localBundle.getBoolean("key_is_realname_verify_process")))
    {
      switch (localBundle.getInt("realname_verify_process_ret", 0))
      {
      default: 
        GMTrace.o(7807713673216L, 58172);
        return false;
      }
      GMTrace.o(7807713673216L, 58172);
      return true;
    }
    w.i("MicroMsg.WalletPayUI", "hy: pay not end");
    GMTrace.o(7807713673216L, 58172);
    return false;
  }
  
  private void bxz()
  {
    GMTrace.i(7809190068224L, 58183);
    if (this.opK == null)
    {
      w.e("MicroMsg.WalletPayUI", "updatePaymentMethodForFavor mOrders is null");
      GMTrace.o(7809190068224L, 58183);
      return;
    }
    this.qZP.setVisibility(8);
    this.qZO.setVisibility(8);
    this.oow.setText(a.i.tec);
    this.qZW.setVisibility(0);
    this.qZX.setVisibility(0);
    View localView1 = this.qZX.findViewById(a.f.sqb);
    View localView2 = this.qZX.findViewById(a.f.spD);
    final CheckedTextView localCheckedTextView1;
    final CheckedTextView localCheckedTextView2;
    int i;
    if ("CFT".equals(this.opK.rhr))
    {
      localView2.setVisibility(8);
      localCheckedTextView1 = (CheckedTextView)this.qZX.findViewById(a.f.spX);
      localCheckedTextView2 = (CheckedTextView)this.qZX.findViewById(a.f.spC);
      localView1.setEnabled(true);
      if ((this.opK == null) || (this.opK.rhv == null) || (this.opK.rhv.size() <= 0)) {
        break label673;
      }
      if (this.opK.rhf != 1) {
        break label480;
      }
      i = 1;
    }
    for (;;)
    {
      label203:
      if (this.qTV == null)
      {
        localView1.setVisibility(8);
        label216:
        localView2.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7806237278208L, 58161);
            localCheckedTextView1.setChecked(false);
            localCheckedTextView2.setChecked(true);
            WalletPayUI.a(WalletPayUI.this, true);
            WalletPayUI.c(WalletPayUI.this);
            GMTrace.o(7806237278208L, 58161);
          }
        });
        this.qZY = true;
        localCheckedTextView1.setChecked(false);
        localCheckedTextView2.setChecked(true);
        w.i("MicroMsg.WalletPayUI", "updatePaymentMethodForFavor needbindcardtoshowfavinfo is " + this.opK.rhx);
        if (this.opK.rhx != 1) {
          break label533;
        }
        this.qZX.findViewById(a.f.sva).setVisibility(0);
        ((TextView)this.qZX.findViewById(a.f.suZ)).setText(this.opK.rhy);
        if (TextUtils.isEmpty(this.opK.rhz)) {
          break label509;
        }
        ((TextView)this.qZX.findViewById(a.f.svA)).setText(" (" + this.opK.rhz + ")");
        label390:
        if ((this.qTV != null) && (this.qTV.byd()) && (!TextUtils.isEmpty(this.qTV.field_forbidWord)))
        {
          localView1.setEnabled(false);
          localCheckedTextView1.setVisibility(8);
          ((TextView)this.qZX.findViewById(a.f.sqf)).setText(this.qTV.field_forbidWord);
        }
      }
      for (;;)
      {
        bxA();
        GMTrace.o(7809190068224L, 58183);
        return;
        localView2.setVisibility(0);
        break;
        label480:
        i = 0;
        break label203;
        localView1.setVisibility(0);
        localView1.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7800868569088L, 58121);
            localCheckedTextView1.setChecked(true);
            localCheckedTextView2.setChecked(false);
            WalletPayUI.a(WalletPayUI.this, false);
            WalletPayUI.c(WalletPayUI.this);
            GMTrace.o(7800868569088L, 58121);
          }
        });
        break label216;
        label509:
        ((TextView)this.qZX.findViewById(a.f.svA)).setText("");
        break label390;
        label533:
        this.qZX.findViewById(a.f.sva).setVisibility(8);
        if ((this.qTV != null) && (this.qTV.byd()) && (!TextUtils.isEmpty(this.qTV.field_forbidWord)))
        {
          localView1.setEnabled(false);
          localCheckedTextView1.setVisibility(8);
          ((TextView)this.qZX.findViewById(a.f.sqf)).setText(this.qTV.field_forbidWord);
        }
        else if ((this.qTV != null) && (this.qTV.byd()) && (TextUtils.isEmpty(this.qTV.field_forbidWord)) && (i == 0))
        {
          localCheckedTextView1.setChecked(true);
          localCheckedTextView2.setChecked(false);
          this.qZY = false;
        }
      }
      label673:
      i = 0;
    }
  }
  
  private void c(int paramInt, Intent paramIntent)
  {
    GMTrace.i(7808787415040L, 58180);
    ss localss = new ss();
    localss.eYc.context = this;
    localss.eYc.intent = paramIntent;
    localss.eYc.result = paramInt;
    ss.a locala = localss.eYc;
    if (this.qYU == null) {}
    for (paramIntent = "";; paramIntent = this.qYU.eHG)
    {
      locala.eHG = paramIntent;
      com.tencent.mm.sdk.b.a.vgX.m(localss);
      GMTrace.o(7808787415040L, 58180);
      return;
    }
  }
  
  public void K(Bundle paramBundle)
  {
    GMTrace.i(7812813946880L, 58210);
    this.qZE = true;
    if (this.opK != null)
    {
      paramBundle.putInt("key_support_bankcard", this.opK.rcw);
      paramBundle.putString("key_reqKey", this.opK.eHG);
      if ((this.opK.rhv != null) && (this.opK.rhv.size() > 0)) {
        paramBundle.putString("key_TransId", ((Orders.Commodity)this.opK.rhv.get(0)).eRP);
      }
      paramBundle.putLong("key_SessionId", this.qZV);
    }
    if (this.qYU != null) {
      paramBundle.putInt("key_scene", this.qYU.ePL);
    }
    if (!bxD()) {}
    for (boolean bool = true;; bool = false)
    {
      paramBundle.putBoolean("key_is_oversea", bool);
      paramBundle.putInt("is_deduct_open", this.rad);
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.pay.b.class, paramBundle, null);
      GMTrace.o(7812813946880L, 58210);
      return;
    }
  }
  
  protected final void M(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(7810666463232L, 58194);
    com.tencent.mm.plugin.report.service.g.ork.i(13958, new Object[] { Integer.valueOf(2) });
    com.tencent.mm.plugin.report.service.g.ork.i(13955, new Object[] { Integer.valueOf(4) });
    Bundle localBundle = this.ui;
    localBundle.putInt("key_main_bankcard_state", paramInt);
    localBundle.putParcelable("key_orders", this.opK);
    localBundle.putParcelable("key_pay_info", this.qYU);
    localBundle.putParcelable("key_authen", bxC());
    localBundle.putString("key_pwd1", this.llG);
    localBundle.putInt("key_pay_flag", 3);
    localBundle.putInt("key_err_code", 64532);
    localBundle.putParcelable("key_favor_pay_info", this.qYW);
    localBundle.putBoolean("key_is_filter_bank_type", paramBoolean);
    if (this.qTV != null) {
      localBundle.putString("key_is_cur_bankcard_bind_serial", this.qTV.field_bindSerial);
    }
    K(localBundle);
    GMTrace.o(7810666463232L, 58194);
  }
  
  protected final void MP()
  {
    GMTrace.i(7808921632768L, 58181);
    MMScrollView localMMScrollView = (MMScrollView)findViewById(a.f.cnx);
    localMMScrollView.a(localMMScrollView, localMMScrollView);
    this.oow = ((Button)findViewById(a.f.sKA));
    this.oow.setClickable(false);
    this.oow.setEnabled(false);
    this.qZK = ((TextView)findViewById(a.f.sKr));
    this.qZL = ((TextView)findViewById(a.f.sKq));
    this.qZN = ((TextView)findViewById(a.f.sKa));
    this.qZS = ((TextView)findViewById(a.f.sJY));
    this.qZM = ((TextView)findViewById(a.f.sKg));
    this.qZR = ((TextView)findViewById(a.f.sKx));
    this.qZM.getPaint().setFlags(16);
    this.qZO = ((TextView)findViewById(a.f.sKB));
    this.qZP = ((TextView)findViewById(a.f.sKy));
    this.qZP.setOnClickListener(new r()
    {
      public final void aoJ()
      {
        GMTrace.i(18973823336448L, 141366);
        WalletPayUI.this.b(false, 0, "");
        GMTrace.o(18973823336448L, 141366);
      }
    });
    this.qZQ = ((ImageView)findViewById(a.f.sJV));
    this.qZQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18973018030080L, 141360);
        if (WalletPayUI.this.qZH) {
          WalletPayUI.this.qZQ.setImageResource(a.e.soH);
        }
        for (WalletPayUI.this.qZH = false;; WalletPayUI.this.qZH = true)
        {
          WalletPayUI.this.qZU.notifyDataSetChanged();
          GMTrace.o(18973018030080L, 141360);
          return;
          WalletPayUI.this.qZQ.setImageResource(a.e.soI);
        }
      }
    });
    this.qZT = ((LinearLayout)findViewById(a.f.sKd));
    this.qZU = new a();
    this.oow.setOnClickListener(new r()
    {
      public final void aoJ()
      {
        GMTrace.i(18972749594624L, 141358);
        WalletPayUI.this.bxE();
        GMTrace.o(18972749594624L, 141358);
      }
    });
    this.oow.setText(a.i.tec);
    this.qZW = ((TextView)findViewById(a.f.sEi));
    this.qZX = ((LinearLayout)findViewById(a.f.sEh));
    ar();
    GMTrace.o(7808921632768L, 58181);
  }
  
  public final boolean QS()
  {
    GMTrace.i(7811069116416L, 58197);
    if ((this.opK == null) || (this.opK.rhv == null) || (this.opK.rhv.size() <= 0))
    {
      w.w("MicroMsg.WalletPayUI", "mOrders info is Illegal!");
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7818182656000L, 58250);
          WalletPayUI.this.finish();
          GMTrace.o(7818182656000L, 58250);
        }
      });
      GMTrace.o(7811069116416L, 58197);
      return false;
    }
    if ((this.qZF) && (!bg.nm(this.qZG)) && (bxH() == null))
    {
      w.w("MicroMsg.WalletPayUI", "hy: should use given bankcard, but resolved as null. show error msg and quit");
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18972346941440L, 141355);
          WalletPayUI.this.finish();
          GMTrace.o(18972346941440L, 141355);
        }
      });
      GMTrace.o(7811069116416L, 58197);
      return false;
    }
    GMTrace.o(7811069116416L, 58197);
    return true;
  }
  
  protected final int Qf()
  {
    GMTrace.i(7812679729152L, 58209);
    GMTrace.o(7812679729152L, 58209);
    return 1;
  }
  
  public final boolean aNg()
  {
    GMTrace.i(7811740205056L, 58202);
    if (this.rae)
    {
      boolean bool1;
      label70:
      int i;
      if ((bxJ() == null) || (!bxJ().lNA))
      {
        bool1 = true;
        w.d("MicroMsg.WalletPayUI", "case 1 %s,", new Object[] { Boolean.valueOf(bool1) });
        com.tencent.mm.plugin.wallet.a.p.bxd();
        if (com.tencent.mm.plugin.wallet.a.p.bxe().byS()) {
          break label177;
        }
        bool1 = true;
        w.d("MicroMsg.WalletPayUI", "case 2 %s,", new Object[] { Boolean.valueOf(bool1) });
        if (this.qTU != null) {
          break label182;
        }
        i = 0;
        label99:
        if (this.qTV != null) {
          break label193;
        }
      }
      label177:
      label182:
      label193:
      for (String str = "";; str = this.qTV.field_forbidWord)
      {
        w.d("MicroMsg.WalletPayUI", "case 3 mBankcardList %s, mDefaultBankcard %s", new Object[] { Integer.valueOf(i), str });
        if ((bxJ() != null) && (bxJ().lNA)) {
          break label205;
        }
        w.i("MicroMsg.WalletPayUI", "get isTransparent1");
        GMTrace.o(7811740205056L, 58202);
        return false;
        bool1 = false;
        break;
        bool1 = false;
        break label70;
        i = this.qTU.size();
        break label99;
      }
      label205:
      com.tencent.mm.plugin.wallet.a.p.bxd();
      if (!com.tencent.mm.plugin.wallet.a.p.bxe().byS())
      {
        w.i("MicroMsg.WalletPayUI", "get isTransparent2");
        GMTrace.o(7811740205056L, 58202);
        return false;
      }
      if ((this.qTU != null) && ((this.qTU.size() == 0) || ((this.qTV != null) && (!bg.nm(this.qTV.field_forbidWord)))))
      {
        if ((this.qTU != null) && (this.qTU.size() == 0))
        {
          bool1 = true;
          if ((this.qTV == null) || (bg.nm(this.qTV.field_forbidWord))) {
            break label359;
          }
        }
        label359:
        for (boolean bool2 = true;; bool2 = false)
        {
          w.i("MicroMsg.WalletPayUI", "get isTransparent3 1 %s 2 %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          GMTrace.o(7811740205056L, 58202);
          return false;
          bool1 = false;
          break;
        }
      }
      w.i("MicroMsg.WalletPayUI", "get isTransparent4");
      GMTrace.o(7811740205056L, 58202);
      return true;
    }
    w.i("MicroMsg.WalletPayUI", "get isTransparent5");
    GMTrace.o(7811740205056L, 58202);
    return true;
  }
  
  protected final boolean aNj()
  {
    boolean bool2 = true;
    GMTrace.i(7811605987328L, 58201);
    w.i("MicroMsg.WalletPayUI", "onProgressFinish isFromH5RealNameVerify %s", new Object[] { Boolean.valueOf(this.rah) });
    com.tencent.mm.sdk.b.a.vgX.m(new sk());
    int i;
    boolean bool1;
    if ((this.opK != null) && (this.opK.rhA != null) && (!this.rac))
    {
      i = 1;
      if (i == 0) {
        bxI();
      }
      if (!this.rah) {
        break label112;
      }
      iO(true);
      bool1 = bool2;
    }
    for (;;)
    {
      GMTrace.o(7811605987328L, 58201);
      return bool1;
      i = 0;
      break;
      label112:
      bool1 = bool2;
      if (!this.rab) {
        if (i != 0)
        {
          Intent localIntent = new Intent(this, WalletPayDeductUI.class);
          localIntent.putExtra("orders", this.opK);
          startActivityForResult(localIntent, 0);
          bool1 = bool2;
        }
        else if (this.vKB.hqF.getVisibility() != 0)
        {
          bool1 = bool2;
          if (!this.qZJ)
          {
            bool1 = bool2;
            if (QS())
            {
              iO(true);
              this.qZJ = true;
              bool1 = bool2;
            }
          }
        }
        else
        {
          if ((this.vKB.hqF.getVisibility() == 0) && (this.opK != null) && (this.opK.rhA != null) && (this.oow.isEnabled()) && (!this.raf))
          {
            this.oow.performClick();
            this.raf = true;
          }
          bool1 = false;
        }
      }
    }
  }
  
  public final boolean aNk()
  {
    GMTrace.i(7810934898688L, 58196);
    GMTrace.o(7810934898688L, 58196);
    return false;
  }
  
  public final void ar()
  {
    GMTrace.i(7809055850496L, 58182);
    if ((this.opK != null) && (this.opK.rhv != null) && (this.opK.rhv.size() > 0))
    {
      this.qZK.setText(com.tencent.mm.wallet_core.ui.e.r(this.opK.rhd));
      this.qZN.setText(com.tencent.mm.wallet_core.ui.e.Xv(this.opK.nEr));
      this.qZU.notifyDataSetChanged();
      if (this.opK.rhv.size() > 1)
      {
        this.qZQ.setVisibility(0);
        this.qZL.setText(getString(a.i.teM, new Object[] { ((Orders.Commodity)this.opK.rhv.get(0)).desc, this.opK.rhv.size() }));
        this.qZH = false;
        i = this.opK.rhf;
      }
    }
    else
    {
      if ((this.qYU != null) && (this.qYU.ePL == 48)) {
        this.qZL.setText(a.i.sWQ);
      }
      this.qZO.setVisibility(8);
      this.qZP.setVisibility(8);
      this.qZW.setVisibility(8);
      this.qZX.setVisibility(8);
      this.oow.setText(a.i.tec);
      if ((this.qTV == null) || (!this.qTV.byd())) {
        break label556;
      }
      if (bg.nm(this.qTV.field_forbidWord)) {
        break label536;
      }
      this.qZO.setText(this.qTV.field_forbidWord);
      this.qZO.setVisibility(4);
      this.qZP.setVisibility(8);
      com.tencent.mm.plugin.wallet.a.p.bxd();
      if (com.tencent.mm.plugin.wallet.a.p.bxe().byT()) {
        bxz();
      }
      label340:
      com.tencent.mm.plugin.wallet.a.p.bxd();
      if (!com.tencent.mm.plugin.wallet.a.p.bxe().byT())
      {
        com.tencent.mm.plugin.wallet.a.p.bxd();
        if (!com.tencent.mm.plugin.wallet.a.p.bxe().byP()) {
          break label604;
        }
      }
    }
    label435:
    label536:
    label556:
    label585:
    label604:
    for (int i = 1;; i = 0)
    {
      LinearLayout localLinearLayout = (LinearLayout)findViewById(a.f.sJZ);
      if ((i != 0) && (this.qYW != null) && (this.qZB != null) && (this.qZC) && (this.opK != null))
      {
        bxB();
        this.qZS.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7793889247232L, 58069);
            com.tencent.mm.plugin.wallet_core.ui.h.a(WalletPayUI.this.vKB.vKW, WalletPayUI.this.opK, WalletPayUI.this.qYW.rgo, new h.b()
            {
              public final void a(FavorPayInfo paramAnonymous2FavorPayInfo)
              {
                int i = 1;
                GMTrace.i(18972615376896L, 141357);
                WalletPayUI.this.qYW = paramAnonymous2FavorPayInfo;
                if (WalletPayUI.this.qYW != null)
                {
                  if ((WalletPayUI.this.qTV != null) && (!com.tencent.mm.plugin.wallet_core.ui.a.a(WalletPayUI.this.qYW, WalletPayUI.this.qTV))) {
                    break label184;
                  }
                  WalletPayUI.this.qZP.setVisibility(8);
                  WalletPayUI.this.oow.setOnClickListener(new View.OnClickListener()
                  {
                    public final void onClick(View paramAnonymous3View)
                    {
                      GMTrace.i(18972078505984L, 141353);
                      w.i("MicroMsg.WalletPayUI", "mDefaultBankcard null or needToPayWithBankcard after favor selection! payWithNewBankcard");
                      WalletPayUI.this.b(false, 0, "");
                      GMTrace.o(18972078505984L, 141353);
                    }
                  });
                }
                for (;;)
                {
                  if (i == 0)
                  {
                    WalletPayUI.this.qZO.setVisibility(8);
                    WalletPayUI.this.qZP.setVisibility(0);
                    WalletPayUI.this.oow.setOnClickListener(new View.OnClickListener()
                    {
                      public final void onClick(View paramAnonymous3View)
                      {
                        GMTrace.i(18971004764160L, 141345);
                        WalletPayUI.this.bxE();
                        GMTrace.o(18971004764160L, 141345);
                      }
                    });
                  }
                  WalletPayUI.this.bxB();
                  GMTrace.o(18972615376896L, 141357);
                  return;
                  label184:
                  paramAnonymous2FavorPayInfo = WalletPayUI.this.qZB.Ku(WalletPayUI.this.qYW.rgo);
                  if ((paramAnonymous2FavorPayInfo != null) && (WalletPayUI.this.qTV.byd()))
                  {
                    com.tencent.mm.plugin.wallet.a.p.bxd();
                    Bankcard localBankcard = com.tencent.mm.plugin.wallet.a.p.bxe().qUy;
                    double d = paramAnonymous2FavorPayInfo.qXy;
                    if ((localBankcard != null) && (localBankcard.reK < d))
                    {
                      w.i("MicroMsg.WalletPayUI", "balance not meet");
                      WalletPayUI.this.qZP.setVisibility(8);
                      WalletPayUI.this.oow.setOnClickListener(new View.OnClickListener()
                      {
                        public final void onClick(View paramAnonymous3View)
                        {
                          GMTrace.i(18970333675520L, 141340);
                          w.i("MicroMsg.WalletPayUI", "Balance amount not meet, after favor selection! payWithNewBankcard");
                          WalletPayUI.this.b(false, 0, "");
                          GMTrace.o(18970333675520L, 141340);
                        }
                      });
                      continue;
                    }
                  }
                  i = 0;
                }
              }
            });
            GMTrace.o(7793889247232L, 58069);
          }
        });
        localLinearLayout.setVisibility(0);
        if ((this.opK == null) || (this.qTU == null) || (this.qYU == null)) {
          break label585;
        }
        this.oow.setClickable(true);
        this.oow.setEnabled(true);
      }
      for (;;)
      {
        if (this.opK == null) {
          this.qZP.setVisibility(8);
        }
        GMTrace.o(7809055850496L, 58182);
        return;
        this.qZL.setText(((Orders.Commodity)this.opK.rhv.get(0)).desc);
        this.qZQ.setVisibility(8);
        break;
        com.tencent.mm.plugin.wallet.a.p.bxd();
        if (!com.tencent.mm.plugin.wallet.a.p.bxe().byT()) {
          break label340;
        }
        bxz();
        break label340;
        com.tencent.mm.plugin.wallet.a.p.bxd();
        if (!com.tencent.mm.plugin.wallet.a.p.bxe().byP()) {
          break label340;
        }
        bxz();
        break label340;
        localLinearLayout.setVisibility(8);
        break label435;
        this.oow.setClickable(false);
        this.oow.setEnabled(false);
      }
    }
  }
  
  public final void b(boolean paramBoolean, int paramInt, String paramString)
  {
    GMTrace.i(7810263810048L, 58191);
    StringBuilder localStringBuilder = new StringBuilder("pay with new bankcard! user's wxpay register status :");
    com.tencent.mm.plugin.wallet.a.p.bxd();
    w.d("MicroMsg.WalletPayUI", com.tencent.mm.plugin.wallet.a.p.bxe().byS() + ", need confirm ? " + paramBoolean);
    if (paramBoolean)
    {
      if (!bg.nm(paramString)) {
        break label134;
      }
      paramString = Bankcard.I(this, paramInt);
    }
    label134:
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(a.i.tee), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7796976254976L, 58092);
          WalletPayUI.this.bxG();
          GMTrace.o(7796976254976L, 58092);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7792815505408L, 58061);
          if (WalletPayUI.this.aNg()) {
            WalletPayUI.this.finish();
          }
          GMTrace.o(7792815505408L, 58061);
        }
      });
      GMTrace.o(7810263810048L, 58191);
      return;
      bxG();
      GMTrace.o(7810263810048L, 58191);
      return;
    }
  }
  
  public final void bxB()
  {
    GMTrace.i(7809458503680L, 58185);
    com.tencent.mm.plugin.wallet.a.h localh = this.qZB.Ku(this.qYW.rgo);
    List localList = this.qZB.bzs();
    com.tencent.mm.plugin.wallet.a.f localf = this.qZB.rkm;
    String str1 = "";
    double d;
    int i;
    if (localh != null)
    {
      d = localh.qXG;
      if (d > 0.0D)
      {
        str1 = localh.qXI;
        if (!bg.nm(localh.qXJ))
        {
          str1 = str1 + "," + localh.qXJ;
          i = 1;
        }
      }
    }
    for (;;)
    {
      String str2 = str1;
      if (i == 0)
      {
        str2 = str1;
        if (localList.size() > 0) {
          str2 = str1 + this.vKB.vKW.getString(a.i.tfd);
        }
      }
      if ((d > 0.0D) && (localf != null) && (localf.qXC == 0))
      {
        if (localh != null) {
          this.qZK.setText(com.tencent.mm.wallet_core.ui.e.r(localh.qXF));
        }
        this.qZN.setText(com.tencent.mm.wallet_core.ui.e.Xv(this.opK.nEr));
        this.qZM.setText(com.tencent.mm.wallet_core.ui.e.d(this.opK.rhd, this.opK.nEr));
        this.qZM.setVisibility(0);
      }
      for (;;)
      {
        if (!bg.nm(str2)) {
          this.qZS.setText(str2);
        }
        GMTrace.o(7809458503680L, 58185);
        return;
        this.qZK.setText(com.tencent.mm.wallet_core.ui.e.r(this.opK.rhd));
        this.qZN.setText(com.tencent.mm.wallet_core.ui.e.Xv(this.opK.nEr));
        this.qZM.setVisibility(8);
      }
      i = 1;
      continue;
      i = 0;
      continue;
      i = 0;
      d = 0.0D;
    }
  }
  
  public final Authen bxC()
  {
    GMTrace.i(7809592721408L, 58186);
    Authen localAuthen = new Authen();
    if (bxD()) {}
    for (localAuthen.eQl = 3;; localAuthen.eQl = 6)
    {
      if (!bg.nm(this.llG)) {
        localAuthen.red = this.llG;
      }
      if (this.qTV != null)
      {
        localAuthen.nDu = this.qTV.field_bindSerial;
        localAuthen.nDt = this.qTV.field_bankcardType;
      }
      if (this.qYW != null)
      {
        localAuthen.rep = this.qYW.rgo;
        localAuthen.reo = this.qYW.rgr;
      }
      localAuthen.oek = this.qYU;
      GMTrace.o(7809592721408L, 58186);
      return localAuthen;
    }
  }
  
  public final boolean bxD()
  {
    GMTrace.i(7809726939136L, 58187);
    if ((this.qTV != null) && (this.opK != null) && (this.opK.rcw == 3))
    {
      if (this.qTV.byg())
      {
        GMTrace.o(7809726939136L, 58187);
        return true;
      }
      GMTrace.o(7809726939136L, 58187);
      return false;
    }
    if ((this.opK != null) && (!Bankcard.wP(this.opK.rcw)))
    {
      GMTrace.o(7809726939136L, 58187);
      return true;
    }
    GMTrace.o(7809726939136L, 58187);
    return false;
  }
  
  protected final void bxE()
  {
    GMTrace.i(7809861156864L, 58188);
    iO(true);
    GMTrace.o(7809861156864L, 58188);
  }
  
  protected final void bxG()
  {
    GMTrace.i(7810532245504L, 58193);
    Bundle localBundle = getIntent().getExtras();
    com.tencent.mm.plugin.wallet.a.p.bxd();
    if (com.tencent.mm.plugin.wallet.a.p.bxe().byS()) {}
    for (int i = 2;; i = 1)
    {
      localBundle.putInt("key_pay_flag", i);
      localBundle.putParcelable("key_orders", this.opK);
      localBundle.putParcelable("key_pay_info", this.qYU);
      localBundle.putParcelable("key_favor_pay_info", this.qYW);
      K(localBundle);
      GMTrace.o(7810532245504L, 58193);
      return;
    }
  }
  
  public final PayInfo bxJ()
  {
    GMTrace.i(7812545511424L, 58208);
    if (this.qYU == null) {
      this.qYU = ((PayInfo)getIntent().getParcelableExtra("key_pay_info"));
    }
    PayInfo localPayInfo = this.qYU;
    GMTrace.o(7812545511424L, 58208);
    return localPayInfo;
  }
  
  public final boolean bxm()
  {
    GMTrace.i(7812411293696L, 58207);
    if ((this.qYU != null) && (this.qYU.ePL != 11))
    {
      GMTrace.o(7812411293696L, 58207);
      return true;
    }
    GMTrace.o(7812411293696L, 58207);
    return false;
  }
  
  public void bxp()
  {
    GMTrace.i(7810129592320L, 58190);
    if (!QS())
    {
      GMTrace.o(7810129592320L, 58190);
      return;
    }
    w.d("MicroMsg.WalletPayUI", "pay with old bankcard!");
    if (!this.qZF) {}
    for (boolean bool = true;; bool = false)
    {
      this.qTS = com.tencent.mm.plugin.wallet_core.ui.l.a(this, bool, this.opK, this.qYW, this.qTV, this.qYU, this.onA, new l.c()new View.OnClickListener
      {
        public final void a(String paramAnonymousString, FavorPayInfo paramAnonymousFavorPayInfo, boolean paramAnonymousBoolean)
        {
          GMTrace.i(18973957554176L, 141367);
          WalletPayUI.this.aLo();
          WalletPayUI.this.qYW = paramAnonymousFavorPayInfo;
          if ((WalletPayUI.this.qYW != null) && (paramAnonymousBoolean))
          {
            WalletPayUI.this.M(-100, true);
            GMTrace.o(18973957554176L, 141367);
            return;
          }
          WalletPayUI.this.llG = paramAnonymousString;
          WalletPayUI.this.iP(false);
          com.tencent.mm.plugin.wallet_core.e.c.bAa();
          WalletPayUI.this.qYY = null;
          GMTrace.o(18973957554176L, 141367);
        }
      }, new View.OnClickListener()new DialogInterface.OnCancelListener
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18971273199616L, 141347);
          WalletPayUI.this.qYW = ((FavorPayInfo)paramAnonymousView.getTag());
          if (WalletPayUI.this.qYW != null) {
            WalletPayUI.this.qYW.rgs = "";
          }
          WalletPayUI.this.c(false, 0, "");
          WalletPayUI.this.qTS.dismiss();
          WalletPayUI.this.llG = null;
          WalletPayUI.this.qTS = null;
          WalletPayUI.this.qYY = null;
          GMTrace.o(18971273199616L, 141347);
        }
      }, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(18970065240064L, 141338);
          if (paramAnonymousDialogInterface != null) {
            paramAnonymousDialogInterface.dismiss();
          }
          WalletPayUI.this.llG = null;
          WalletPayUI.this.qTS = null;
          if (WalletPayUI.this.aNg()) {
            WalletPayUI.this.finish();
          }
          WalletPayUI.this.qYY = null;
          GMTrace.o(18970065240064L, 141338);
        }
      });
      this.qYY = this.qTS;
      GMTrace.o(7810129592320L, 58190);
      return;
    }
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(7812008640512L, 58204);
    GMTrace.o(7812008640512L, 58204);
    return true;
  }
  
  public void bxy()
  {
    int j = 2;
    GMTrace.i(7807982108672L, 58174);
    com.tencent.mm.plugin.report.service.g.ork.i(11850, new Object[] { Integer.valueOf(2), Integer.valueOf(this.qYU.ePL) });
    if (this.qYU.ePL == 11) {}
    for (int i = 3;; i = 2)
    {
      Object localObject = this.qYU;
      if ((localObject == null) || (bg.nm(((PayInfo)localObject).eHG)))
      {
        w.i("MicroMsg.CgiManager", "no payInfo or reqKey");
        localObject = null;
        if (localObject != null)
        {
          ((com.tencent.mm.wallet_core.c.l)localObject).fXf = "PayProcess";
          ((com.tencent.mm.wallet_core.c.l)localObject).sessionId = this.qZV;
          if ((this.qYU.ePL != 6) || (this.qYU.tIz != 100)) {
            break label369;
          }
          ((com.tencent.mm.wallet_core.c.l)localObject).gRb = 100;
          label137:
          if (!this.qYU.tIA) {
            break label383;
          }
          i = 1;
          label149:
          super.cmr();
          if (i != 0) {
            break label388;
          }
        }
      }
      label369:
      label383:
      label388:
      for (i = j;; i = 1)
      {
        this.xEL.a((com.tencent.mm.ad.k)localObject, true, i);
        GMTrace.o(7807982108672L, 58174);
        return;
        String str = ((PayInfo)localObject).eHG;
        w.i("MicroMsg.CgiManager", "qrorderinfo reqKey: %s", new Object[] { str });
        w.i("MicroMsg.CgiManager", "qrorderinfo go new split cgi");
        if (str.startsWith("sns_aa_"))
        {
          localObject = new com.tencent.mm.plugin.wallet.pay.a.b.a((PayInfo)localObject, i);
          break;
        }
        if (str.startsWith("sns_tf_"))
        {
          localObject = new com.tencent.mm.plugin.wallet.pay.a.b.g((PayInfo)localObject, i);
          break;
        }
        if (str.startsWith("sns_ff_"))
        {
          localObject = new com.tencent.mm.plugin.wallet.pay.a.b.b((PayInfo)localObject, i);
          break;
        }
        if (str.startsWith("ts_"))
        {
          localObject = new com.tencent.mm.plugin.wallet.pay.a.b.c((PayInfo)localObject, i);
          break;
        }
        if (str.startsWith("sns_"))
        {
          localObject = new com.tencent.mm.plugin.wallet.pay.a.b.f((PayInfo)localObject, i);
          break;
        }
        if (str.startsWith("offline_"))
        {
          localObject = new d((PayInfo)localObject, i);
          break;
        }
        localObject = new com.tencent.mm.plugin.wallet.pay.a.b.e((PayInfo)localObject, i);
        break;
        ((com.tencent.mm.wallet_core.c.l)localObject).gRb = this.qYU.ePL;
        break label137;
        i = 0;
        break label149;
      }
    }
  }
  
  public final void c(boolean paramBoolean, final int paramInt, String paramString)
  {
    GMTrace.i(7810398027776L, 58192);
    w.d("MicroMsg.WalletPayUI", "pay with select bankcard! need confirm ? " + paramBoolean);
    if (paramBoolean)
    {
      if (!bg.nm(paramString)) {
        break label114;
      }
      paramString = Bankcard.I(this, paramInt);
    }
    label114:
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(a.i.teu), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7806774149120L, 58165);
          WalletPayUI.this.M(paramInt, false);
          GMTrace.o(7806774149120L, 58165);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7796707819520L, 58090);
          if (WalletPayUI.this.aNg()) {
            WalletPayUI.this.finish();
          }
          GMTrace.o(7796707819520L, 58090);
        }
      });
      GMTrace.o(7810398027776L, 58192);
      return;
      M(paramInt, false);
      GMTrace.o(7810398027776L, 58192);
      return;
    }
  }
  
  public final void c(boolean paramBoolean, String paramString1, String paramString2)
  {
    GMTrace.i(7812948164608L, 58211);
    w.i("MicroMsg.WalletPayUI", "onGenFinish callback");
    if (paramBoolean)
    {
      w.i("MicroMsg.WalletPayUI", "onGenFinish callback, result.isSuccess is true");
      this.qYU.eJR = paramString1;
      this.qYU.eJS = paramString2;
      iP(false);
      com.tencent.mm.plugin.wallet_core.e.c.bAa();
      GMTrace.o(7812948164608L, 58211);
      return;
    }
    w.e("MicroMsg.WalletPayUI", "onGenFinish callback, result.isSuccess is false");
    iP(false);
    com.tencent.mm.plugin.wallet_core.e.c.bAa();
    GMTrace.o(7812948164608L, 58211);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(7810800680960L, 58195);
    w.i("MicroMsg.WalletPayUI", "errorType %s errCode %s, errmsg %s, scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk });
    label143:
    label178:
    label495:
    label500:
    label506:
    label570:
    label944:
    label949:
    boolean bool;
    label1113:
    Object localObject;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet.pay.a.b.e))
      {
        paramString = (com.tencent.mm.plugin.wallet.pay.a.b.e)paramk;
        if (("1".equals(paramString.eXD)) || ("2".equals(paramString.eXD)))
        {
          this.rag = paramString;
          this.qYL = paramString.qYL;
          this.rae = true;
          this.opK = ((com.tencent.mm.plugin.wallet.pay.a.b.e)paramk).opK;
          if (this.opK == null) {
            break label495;
          }
          paramInt1 = this.opK.rhv.size();
          this.mCount = paramInt1;
          paramk = new StringBuilder("get mOrders! bankcardTag : ");
          if (this.opK == null) {
            break label500;
          }
          paramString = Integer.valueOf(this.opK.rcw);
          w.d("MicroMsg.WalletPayUI", paramString);
          QS();
          if ((this.opK != null) && (this.opK.rhw != null))
          {
            this.qZB = com.tencent.mm.plugin.wallet_core.ui.b.rks.a(this.opK);
            if (this.qZB != null)
            {
              if (this.qZB.bzs().size() > 0) {
                this.qZC = true;
              }
              this.qYW = this.qZB.Kx(this.opK.rhw.qXz);
              this.qYW.rgo = this.qZB.Ky(this.qYW.rgo);
            }
          }
          if ((this.opK != null) && (this.qTU != null) && (this.qYU != null))
          {
            com.tencent.mm.plugin.wallet_core.e.c.a(this.qYU, this.opK);
            paramString = com.tencent.mm.plugin.report.service.g.ork;
            paramInt2 = this.qYU.ePL;
            com.tencent.mm.plugin.wallet.a.p.bxd();
            if (!com.tencent.mm.plugin.wallet.a.p.bxe().byS()) {
              break label506;
            }
          }
        }
        for (paramInt1 = 2;; paramInt1 = 1)
        {
          paramString.i(10690, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf((int)(this.opK.rhd * 100.0D)), this.opK.nEr });
          if ((this.opK == null) || (this.opK.rhv == null)) {
            break label570;
          }
          paramString = new LinkedList();
          paramk = this.opK.rhv.iterator();
          while (paramk.hasNext()) {
            paramString.add(((Orders.Commodity)paramk.next()).eRP);
          }
          this.rag = null;
          break;
          paramInt1 = 0;
          break label143;
          paramString = "";
          break label178;
        }
        if (paramString.size() > 0)
        {
          paramk = new sr();
          paramk.eXZ.eYb = paramString;
          com.tencent.mm.sdk.b.a.vgX.m(paramk);
          if (this.onh != null) {
            this.onh.ay(10001, (String)paramString.get(0));
          }
        }
        com.tencent.mm.plugin.wallet.a.p.bxd();
        this.qTU = com.tencent.mm.plugin.wallet.a.p.bxe().iL(bxm());
        com.tencent.mm.plugin.wallet.a.p.bxd();
        this.qTV = com.tencent.mm.plugin.wallet.a.p.bxe().a(null, null, bxm(), false);
        paramString = bg.aq(getIntent().getStringExtra("key_is_use_default_card"), "");
        if (!bg.nm(paramString)) {
          this.qTV = Ka(paramString);
        }
        this.oow.setClickable(true);
        if (!bg.nm(n.byx().rjE))
        {
          this.qZR.setVisibility(0);
          this.qZR.setText(n.byx().rjE);
          if ((this.opK != null) && (this.qTU != null) && (this.qYU != null))
          {
            com.tencent.mm.plugin.wallet_core.e.c.a(this.qYU, this.opK);
            paramString = com.tencent.mm.plugin.report.service.g.ork;
            paramInt2 = this.qYU.ePL;
            com.tencent.mm.plugin.wallet.a.p.bxd();
            if (!com.tencent.mm.plugin.wallet.a.p.bxe().byS()) {
              break label944;
            }
            paramInt1 = 2;
            paramString.i(10690, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf((int)(this.opK.rhd * 100.0D)), this.opK.nEr });
          }
          if (this.qZZ) {
            M(0, false);
          }
          if (bxJ().tIC != null) {
            break label949;
          }
          l = 0L;
          if (l > 0L)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(641L, 4L, 1L, true);
            com.tencent.mm.plugin.report.service.g.ork.a(641L, 5L, bg.aH(l), true);
          }
          if (this.raj > 0L)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(641L, 7L, 1L, true);
            com.tencent.mm.plugin.report.service.g.ork.a(641L, 8L, bg.aH(this.raj), true);
          }
        }
      }
      while (!(paramk instanceof com.tencent.mm.plugin.wallet.pay.a.a.b)) {
        for (;;)
        {
          ar();
          GMTrace.o(7810800680960L, 58195);
          return true;
          this.qZR.setVisibility(8);
          this.qZR.setText("");
          continue;
          paramInt1 = 1;
          continue;
          long l = bxJ().tIC.getLong("wallet_pay_key_check_time");
        }
      }
      paramk = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramk;
      paramString = this.ui;
      paramString.putParcelable("key_pay_info", this.qYU);
      paramString.putParcelable("key_bankcard", this.qTV);
      paramString.putString("key_bank_type", this.qTV.field_bankcardType);
      if (!bg.nm(this.llG)) {
        paramString.putString("key_pwd1", this.llG);
      }
      paramString.putString("kreq_token", paramk.token);
      paramString.putParcelable("key_authen", paramk.qYD);
      if (!paramk.qYB)
      {
        bool = true;
        paramString.putBoolean("key_need_verify_sms", bool);
        if (!bg.nm(paramk.qYE)) {
          break label1368;
        }
        paramString.putString("key_mobile", this.qTV.field_mobile);
        paramString.putString("key_QADNA_URL", paramk.qYF);
        if (!paramk.qZD) {
          break label1383;
        }
        if (this.onh != null)
        {
          this.onh.ay(10003, "");
          localObject = this.onh;
          com.tencent.mm.plugin.report.service.g.ork.i(13455, new Object[] { ((com.tencent.mm.plugin.wallet.a)localObject).qTd, Long.valueOf(System.currentTimeMillis()), ((com.tencent.mm.plugin.wallet.a)localObject).qTe });
        }
        paramString.putParcelable("key_orders", paramk.qYC);
        if (this.qYU != null)
        {
          w.i("MicroMsg.WalletPayUI", "payscene %d", new Object[] { Integer.valueOf(this.qYU.ePL) });
          if (8 == this.qYU.ePL)
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().a(w.a.vvj, Boolean.valueOf(true));
          }
        }
      }
      for (;;)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putString("pwd", this.llG);
        ((com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class)).a(paramk.bxi(), true, (Bundle)localObject);
        paramString.putInt("key_pay_flag", 3);
        paramk = paramk.nAD;
        if (paramk != null) {
          paramString.putParcelable("key_realname_guide_helper", paramk);
        }
        K(paramString);
        GMTrace.o(7810800680960L, 58195);
        return true;
        bool = false;
        break;
        label1368:
        paramString.putString("key_mobile", paramk.qYE);
        break label1113;
        label1383:
        paramString.putParcelable("key_orders", this.opK);
      }
    }
    if ((paramk instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
    {
      localObject = new Bundle();
      ((Bundle)localObject).putString("pwd", this.llG);
      com.tencent.mm.pluginsdk.k localk = (com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class);
      if (this.qYU.tID == 1) {}
      for (bool = true;; bool = false)
      {
        localk.a(bool, false, (Bundle)localObject);
        switch (paramInt2)
        {
        default: 
          GMTrace.o(7810800680960L, 58195);
          return false;
        }
      }
      paramk = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramk;
      this.qZI = this.ui;
      this.qZI.putParcelable("key_pay_info", this.qYU);
      this.qZI.putParcelable("key_bankcard", this.qTV);
      if (!bg.nm(this.llG)) {
        this.qZI.putString("key_pwd1", this.llG);
      }
      this.qZI.putString("kreq_token", paramk.token);
      this.qZI.putParcelable("key_authen", paramk.qYD);
      localObject = this.qZI;
      if (!paramk.qYB)
      {
        bool = true;
        label1679:
        ((Bundle)localObject).putBoolean("key_need_verify_sms", bool);
        this.qZI.putString("key_mobile", this.qTV.field_mobile);
        this.qZI.putInt("key_err_code", paramInt2);
        this.qZI.putParcelable("key_orders", this.opK);
        if (!bg.nm(paramString)) {
          break label2153;
        }
        paramString = getString(a.i.teK, new Object[] { this.qTV.field_desc, this.qTV.field_mobile });
      }
    }
    label2153:
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(a.i.teJ), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(17431258988544L, 129873);
          WalletPayUI.this.qZI.putInt("key_pay_flag", 3);
          WalletPayUI.this.K(WalletPayUI.this.qZI);
          GMTrace.o(17431258988544L, 129873);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7793352376320L, 58065);
          if (WalletPayUI.this.aNg()) {
            WalletPayUI.this.finish();
          }
          GMTrace.o(7793352376320L, 58065);
        }
      });
      GMTrace.o(7810800680960L, 58195);
      return true;
      bool = false;
      break label1679;
      this.qYU.tIF = paramInt2;
      bxp();
      GMTrace.o(7810800680960L, 58195);
      return true;
      this.qYU.tIF = paramInt2;
      bool = false;
      if (paramInt2 == 100100) {
        bool = true;
      }
      if (this.qYX == null) {
        this.qYX = new a(this, this);
      }
      this.qYX.a(bool, this.qYU.eJP, this.qYU.eHG);
      w.i("MicroMsg.WalletPayUI", "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is " + bool);
      GMTrace.o(7810800680960L, 58195);
      return true;
      if ((this.qTV == null) || (this.opK == null)) {
        break;
      }
      this.qTV.reJ = this.opK.eHG;
      if ((this.qTU != null) && (this.qTU.size() > 1)) {
        c(true, 4, paramString);
      }
      for (;;)
      {
        GMTrace.o(7810800680960L, 58195);
        return true;
        b(true, 4, paramString);
      }
      if (!(paramk instanceof com.tencent.mm.plugin.wallet.pay.a.b.e)) {
        break;
      }
      this.rae = true;
      bxI();
      if (paramInt2 == 416)
      {
        w.e("MicroMsg.WalletPayUI", "errCode is 416 need real name verify!");
        this.rab = true;
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUI");
        paramString.putString("realname_verify_process_jump_plugin", "wallet");
        if (this.qYU != null) {}
        for (paramInt1 = this.qYU.ePL;; paramInt1 = 0)
        {
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramInt2, paramk, paramString, paramInt1);
          GMTrace.o(7810800680960L, 58195);
          return bool;
        }
      }
      w.i("MicroMsg.WalletPayUI", "errCode is %d , not need real name verify!", new Object[] { Integer.valueOf(paramInt2) });
      break;
    }
  }
  
  public void finish()
  {
    GMTrace.i(7808384761856L, 58177);
    cmm();
    if (this.qZD)
    {
      if ((this.qYU != null) && ((this.qYU.ePL == 42) || (this.qYU.ePL == 49)) && (this.opK != null) && (!this.opK.rhv.isEmpty())) {
        getIntent().putExtra("key_trans_id", ((Orders.Commodity)this.opK.rhv.get(0)).eRP);
      }
      c(-1, getIntent());
      setResult(-1, getIntent());
    }
    for (;;)
    {
      super.finish();
      GMTrace.o(7808384761856L, 58177);
      return;
      if ((this.qYU != null) && (this.qYU.ePL == 8) && (this.opK != null))
      {
        this.qYU.tIK = 0;
        b(com.tencent.mm.plugin.wallet.pay.a.a.a(bxC(), this.opK, true), false);
        if (this.qYU.tIC != null)
        {
          long l = this.qYU.tIC.getLong("extinfo_key_9");
          com.tencent.mm.plugin.report.service.g.ork.i(13956, new Object[] { Integer.valueOf(3), Long.valueOf(System.currentTimeMillis() - l) });
        }
      }
      c(0, getIntent());
      setResult(0);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7808250544128L, 58176);
    int i = a.g.sPW;
    GMTrace.o(7808250544128L, 58176);
    return i;
  }
  
  protected final void iO(boolean paramBoolean)
  {
    GMTrace.i(7809995374592L, 58189);
    final Object localObject2;
    final Object localObject1;
    Object localObject3;
    int i;
    if (paramBoolean)
    {
      if ((this.opK != null) && (this.opK.rhn))
      {
        com.tencent.mm.kernel.h.xz();
        if (((Boolean)com.tencent.mm.kernel.h.xy().xh().get(196614, Boolean.valueOf(true))).booleanValue())
        {
          localObject2 = getLayoutInflater().inflate(a.g.sPV, null);
          localObject1 = (CheckBox)((View)localObject2).findViewById(a.f.sHQ);
          localObject3 = (TextView)((View)localObject2).findViewById(a.f.bPY);
          ((TextView)localObject3).setText(Html.fromHtml(String.format(getResources().getString(a.i.teH), new Object[] { getResources().getString(a.i.sYY) })));
          ((TextView)localObject3).setMovementMethod(LinkMovementMethod.getInstance());
          ((TextView)((View)localObject2).findViewById(a.f.chF)).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(18971407417344L, 141348);
              paramAnonymousView = localObject1;
              if (!localObject1.isChecked()) {}
              for (boolean bool = true;; bool = false)
              {
                paramAnonymousView.setChecked(bool);
                GMTrace.o(18971407417344L, 141348);
                return;
              }
            }
          });
          localObject2 = com.tencent.mm.ui.base.h.a(this, getString(a.i.teI), (View)localObject2, getString(a.i.taP), getString(a.i.tfM), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(17431527424000L, 129875);
              if (localObject1.isChecked())
              {
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xy().xh().set(196614, Boolean.valueOf(false));
              }
              WalletPayUI.this.iO(false);
              GMTrace.o(17431527424000L, 129875);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(18971675852800L, 141350);
              WalletPayUI.this.finish();
              GMTrace.o(18971675852800L, 141350);
            }
          });
          ((com.tencent.mm.ui.base.i)localObject2).setCancelable(false);
          ((CheckBox)localObject1).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
          {
            public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
            {
              GMTrace.i(18970736328704L, 141343);
              paramAnonymousCompoundButton = localObject2.getButton(-2);
              if (paramAnonymousBoolean)
              {
                paramAnonymousCompoundButton.setEnabled(false);
                GMTrace.o(18970736328704L, 141343);
                return;
              }
              paramAnonymousCompoundButton.setEnabled(true);
              GMTrace.o(18970736328704L, 141343);
            }
          });
        }
      }
      for (i = 0; i == 0; i = 1)
      {
        GMTrace.o(7809995374592L, 58189);
        return;
      }
    }
    if (this.rag != null)
    {
      w.i("MicroMsg.WalletPayUI", "need real name,stop");
      localObject2 = this.rag;
      if ("1".equals(((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXD))
      {
        w.i("MicroMsg.WalletPayUI", "need realname verify");
        this.rab = true;
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUI");
        ((Bundle)localObject1).putString("realname_verify_process_jump_plugin", "wallet");
        localObject3 = ((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXE;
        localObject3 = ((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXF;
        localObject2 = ((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXG;
        aNg();
        if (this.qYU != null) {}
        for (i = this.qYU.ePL;; i = 0)
        {
          com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, (Bundle)localObject1, i);
          GMTrace.o(7809995374592L, 58189);
          return;
        }
      }
      if ("2".equals(((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXD))
      {
        w.i("MicroMsg.WalletPayUI", "need upload credit");
        com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, ((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXE, ((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXH, ((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXF, ((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXG, aNg(), null);
        GMTrace.o(7809995374592L, 58189);
        return;
      }
      w.i("MicroMsg.WalletPayUI", "realnameGuideFlag =  " + ((com.tencent.mm.plugin.wallet.pay.a.b.e)localObject2).eXD);
      GMTrace.o(7809995374592L, 58189);
      return;
    }
    if (this.qYL != null)
    {
      if ((this.qYL.qYw == 1) && (!bg.nm(this.qYL.mJO)) && (!bg.nm(this.qYL.mJP)) && (!bg.nm(this.qYL.qYx)))
      {
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, this.qYL.qYx, "", this.qYL.mJP, this.qYL.mJO, false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17431930077184L, 129878);
            w.i("MicroMsg.WalletPayUI", "click continue pay");
            WalletPayUI.e(WalletPayUI.this);
            GMTrace.o(17431930077184L, 129878);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17432466948096L, 129882);
            w.i("MicroMsg.WalletPayUI", "click cancel pay");
            WalletPayUI.this.finish();
            GMTrace.o(17432466948096L, 129882);
          }
        });
        GMTrace.o(7809995374592L, 58189);
        return;
      }
      if ((this.qYL.qYw == 2) && (!bg.nm(this.qYL.qYx)) && (!bg.nm(this.qYL.qYy)))
      {
        w.i("MicroMsg.WalletPayUI", "pay has been blocked");
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, this.qYL.qYx, "", this.qYL.qYy, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(18974225989632L, 141369);
            WalletPayUI.this.finish();
            GMTrace.o(18974225989632L, 141369);
          }
        });
        GMTrace.o(7809995374592L, 58189);
        return;
      }
    }
    bxF();
    GMTrace.o(7809995374592L, 58189);
  }
  
  public void iP(boolean paramBoolean)
  {
    GMTrace.i(7812277075968L, 58206);
    com.tencent.mm.plugin.wallet.pay.a.a.b localb = com.tencent.mm.plugin.wallet.pay.a.a.a(bxC(), this.opK, paramBoolean);
    if (this.opK != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("key_reqKey", this.opK.eHG);
      if ((this.opK.rhv != null) && (this.opK.rhv.size() > 0)) {
        localBundle.putString("key_TransId", ((Orders.Commodity)this.opK.rhv.get(0)).eRP);
      }
      localBundle.putLong("key_SessionId", this.qZV);
      localb.fXf = "PayProcess";
      localb.ui = localBundle;
    }
    if (this.qYU != null) {
      if ((this.qYU.ePL != 6) || (this.qYU.tIz != 100)) {
        break label261;
      }
    }
    label261:
    for (localb.gRb = 100;; localb.gRb = this.qYU.ePL)
    {
      l(localb);
      if ((this.qYU != null) && (8 == this.qYU.ePL) && (this.qYU.tIC != null))
      {
        long l = this.qYU.tIC.getLong("extinfo_key_9");
        com.tencent.mm.plugin.report.service.g.ork.i(13956, new Object[] { Integer.valueOf(2), Long.valueOf(System.currentTimeMillis() - l) });
      }
      GMTrace.o(7812277075968L, 58206);
      return;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7811471769600L, 58200);
    w.i("MicroMsg.WalletPayUI", "onAcvityResult requestCode:" + paramInt1 + ", resultCode:" + paramInt2);
    switch (paramInt1)
    {
    default: 
      GMTrace.o(7811471769600L, 58200);
      return;
    }
    if (paramInt2 == -1)
    {
      if (paramIntent != null)
      {
        this.rad = paramIntent.getIntExtra("auto_deduct_flag", -1);
        this.opK.rhA.rad = this.rad;
        bxJ().tIH = this.rad;
        if (this.rad == 1)
        {
          bxJ().tII = paramIntent.getStringExtra("deduct_bank_type");
          bxJ().tIJ = paramIntent.getStringExtra("deduct_bind_serial");
        }
      }
      this.rac = true;
      aNj();
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(13958, new Object[] { Integer.valueOf(3) });
      break;
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7807579455488L, 58171);
    super.onCreate(paramBundle);
    if (qZA)
    {
      w.w("MicroMsg.WalletPayUI", "has Undestory WalletPayUI!");
      finish();
    }
    qZA = true;
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      w.e("MicroMsg.WalletPayUI", "hy: account not ready. finish now");
      finish();
      GMTrace.o(7807579455488L, 58171);
      return;
    }
    getWindow().getDecorView().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18972883812352L, 141359);
        w.i("MicroMsg.WalletPayUI", "auto reset create flag");
        WalletPayUI.aaR();
        GMTrace.o(18972883812352L, 141359);
      }
    }, 600L);
    this.raj = bg.Pv();
    com.tencent.mm.sdk.b.a.vgX.b(this.qYZ);
    com.tencent.mm.plugin.wallet_core.model.h.g(this, 5);
    this.onh = com.tencent.mm.plugin.wallet.a.X(getIntent());
    oM(a.i.teL);
    this.qYU = bxJ();
    this.qZF = getIntent().getBooleanExtra("key_is_force_use_given_card", false);
    this.qZG = bg.aq(getIntent().getStringExtra("key_force_use_bind_serail"), "");
    this.onA = getIntent().getStringExtra("key_receiver_true_name");
    if ((this.qYU == null) || (this.qYU.tIG == 0L)) {
      this.qZV = System.currentTimeMillis();
    }
    while (!bxx())
    {
      w.d("MicroMsg.WalletPayUI", "PayInfo = " + this.qYU);
      if ((this.qYU != null) && (!bg.nm(this.qYU.eHG)))
      {
        bxy();
        MP();
        GMTrace.o(7807579455488L, 58171);
        return;
        this.qZV = this.qYU.tIG;
      }
      else
      {
        if ((this.qYU != null) && (!bg.nm(this.qYU.eAR))) {}
        for (paramBundle = this.qYU.eAR;; paramBundle = getString(a.i.teG))
        {
          com.tencent.mm.ui.base.h.a(this, paramBundle, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(18973554900992L, 141364);
              WalletPayUI.this.finish();
              GMTrace.o(18973554900992L, 141364);
            }
          });
          break;
        }
      }
    }
    w.i("MicroMsg.WalletPayUI", "hy: pay end on create. finish");
    finish();
    GMTrace.o(7807579455488L, 58171);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7807847890944L, 58173);
    if (this.qYX != null)
    {
      this.qYX.bxl();
      this.qYX.release();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.qYZ);
    this.qYY = null;
    qZA = false;
    super.onDestroy();
    GMTrace.o(7807847890944L, 58173);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7808518979584L, 58178);
    if (paramInt == 4)
    {
      if ((this.qTS != null) && (this.qYU != null) && (this.qYU.lNA)) {
        finish();
      }
      for (;;)
      {
        GMTrace.o(7808518979584L, 58178);
        return true;
        aLo();
        showDialog(1000);
      }
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(7808518979584L, 58178);
    return bool;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    int j = 1;
    GMTrace.i(7808653197312L, 58179);
    w.v("MicroMsg.WalletPayUI", "onNewIntent");
    setIntent(paramIntent);
    if (!bxx())
    {
      w.w("MicroMsg.WalletPayUI", "hy: pay not end if judge from intent, but should finish this ui, and set cancel event");
      c(0, getIntent());
      this.qZD = false;
    }
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("intent_bind_end", false))) {
      this.qZZ = true;
    }
    for (int i = 1; i != 0; i = 0)
    {
      w.i("MicroMsg.WalletPayUI", "isFromBindCard is true");
      bxy();
      GMTrace.o(7808653197312L, 58179);
      return;
    }
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("key_is_realname_verify_process", false)))
    {
      this.raa = true;
      i = j;
      if (i == 0) {
        break label167;
      }
      w.i("MicroMsg.WalletPayUI", "isFromRealNameVerify is true");
      finish();
    }
    for (;;)
    {
      finish();
      GMTrace.o(7808653197312L, 58179);
      return;
      i = 0;
      break;
      label167:
      w.e("MicroMsg.WalletPayUI", "isFromBindCard is false,isFromRealNameVerify is false");
    }
  }
  
  public void onPause()
  {
    GMTrace.i(7813082382336L, 58212);
    super.onPause();
    if (this.qYY != null) {
      this.qYY.bzu();
    }
    GMTrace.o(7813082382336L, 58212);
  }
  
  public void onResume()
  {
    GMTrace.i(7808116326400L, 58175);
    w.i("MicroMsg.WalletPayUI", "hy: onResume isFromH5RealNameVerify %s", new Object[] { Boolean.valueOf(this.rah) });
    if (!this.xEL.aMd())
    {
      if (this.qTV == null)
      {
        com.tencent.mm.plugin.wallet.a.p.bxd();
        this.qTV = com.tencent.mm.plugin.wallet.a.p.bxe().a(null, null, bxm(), false);
      }
    }
    else
    {
      if (!this.rai) {
        break label135;
      }
      w.i("MicroMsg.WalletPayUI", "onResume isResumePassFinish");
      this.rai = false;
    }
    for (;;)
    {
      super.onResume();
      GMTrace.o(7808116326400L, 58175);
      return;
      com.tencent.mm.plugin.wallet.a.p.bxd();
      this.qTV = com.tencent.mm.plugin.wallet.a.p.bxe().a(null, this.qTV.field_bindSerial, bxm(), false);
      break;
      label135:
      if ((this.qZE) && (this.vKB.hqF.getVisibility() != 0) && ((this.qTS == null) || (!this.qTS.isShowing())))
      {
        w.i("MicroMsg.WalletPayUI", "hy: has started process and is transparent and no pwd appeared. finish self");
        finish();
      }
      else if (this.qYY != null)
      {
        this.qYY.bzt();
      }
    }
  }
  
  public final void so(int paramInt)
  {
    GMTrace.i(7812142858240L, 58205);
    if (paramInt == 0)
    {
      if (aNg())
      {
        finish();
        GMTrace.o(7812142858240L, 58205);
      }
    }
    else if (paramInt == 1) {
      bxp();
    }
    GMTrace.o(7812142858240L, 58205);
  }
  
  protected final class a
  {
    protected a()
    {
      GMTrace.i(7807176802304L, 58168);
      GMTrace.o(7807176802304L, 58168);
    }
    
    public final void notifyDataSetChanged()
    {
      GMTrace.i(7807311020032L, 58169);
      WalletPayUI.this.qZT.removeAllViews();
      int i;
      ViewGroup.LayoutParams localLayoutParams;
      int j;
      label44:
      View localView;
      TextView localTextView1;
      TextView localTextView2;
      Orders.Commodity localCommodity;
      String str2;
      String str1;
      if (WalletPayUI.this.mCount == 0)
      {
        i = 0;
        localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
        j = 0;
        if (j >= i) {
          break label573;
        }
        localView = ((LayoutInflater)WalletPayUI.this.getSystemService("layout_inflater")).inflate(a.g.sPU, null);
        localTextView1 = (TextView)localView.findViewById(a.f.sJU);
        localTextView2 = (TextView)localView.findViewById(a.f.sKm);
        localCommodity = (Orders.Commodity)WalletPayUI.this.opK.rhv.get(j);
        str2 = "";
        str1 = str2;
        if (WalletPayUI.this.qYU != null) {
          if ((WalletPayUI.this.qYU.ePL != 32) && (WalletPayUI.this.qYU.ePL != 33) && (WalletPayUI.this.qYU.ePL != 31))
          {
            str1 = str2;
            if (WalletPayUI.this.qYU.ePL != 48) {}
          }
          else
          {
            str1 = WalletPayUI.this.qYU.tIC.getString("extinfo_key_1", "");
            if (bg.nm(str1)) {
              break label453;
            }
            com.tencent.mm.kernel.h.xz();
            x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC(str1);
            if (localx == null) {
              break label426;
            }
            str1 = localx.vk();
          }
        }
        label258:
        if (localCommodity != null)
        {
          if (bg.nm(str1)) {
            break label466;
          }
          localTextView2.setText(str1);
          localTextView2.setVisibility(0);
          ((TextView)localView.findViewById(a.f.sKn)).setVisibility(0);
          label297:
          if (bg.nm(localCommodity.desc)) {
            break label537;
          }
          localTextView1.setText(localCommodity.desc);
          localTextView1.setVisibility(8);
          ((TextView)localView.findViewById(a.f.sJW)).setVisibility(8);
          label341:
          if ((bg.nm(str1)) && (bg.nm(localCommodity.nEg))) {
            break label563;
          }
          localView.setVisibility(0);
        }
      }
      for (;;)
      {
        localView.setLayoutParams(localLayoutParams);
        localView.measure(-2, -2);
        WalletPayUI.this.qZT.addView(localView);
        j += 1;
        break label44;
        if (WalletPayUI.this.qZH)
        {
          i = WalletPayUI.this.mCount;
          break;
        }
        i = 1;
        break;
        label426:
        w.e("MicroMsg.WalletPayUI", "can not found contact for user::" + str1);
        str1 = str2;
        break label258;
        label453:
        w.e("MicroMsg.WalletPayUI", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
        str1 = str2;
        break label258;
        label466:
        if (!bg.nm(localCommodity.nEg))
        {
          localTextView2.setText(localCommodity.nEg);
          localTextView2.setVisibility(0);
          ((TextView)localView.findViewById(a.f.sKn)).setVisibility(0);
          break label297;
        }
        ((TextView)localView.findViewById(a.f.sKn)).setVisibility(8);
        localTextView2.setVisibility(8);
        break label297;
        label537:
        ((TextView)localView.findViewById(a.f.sJW)).setVisibility(8);
        localTextView1.setVisibility(8);
        break label341;
        label563:
        localView.setVisibility(8);
      }
      label573:
      GMTrace.o(7807311020032L, 58169);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\ui\WalletPayUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */