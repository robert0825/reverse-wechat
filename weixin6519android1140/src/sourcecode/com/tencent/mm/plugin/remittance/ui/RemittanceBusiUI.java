package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.c.b;
import com.tencent.mm.plugin.remittance.c.c;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.protocal.c.bdx;
import com.tencent.mm.protocal.c.ih;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.r;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class RemittanceBusiUI
  extends WalletBaseUI
{
  private int mChannel;
  private String nAz;
  private ScrollView ola;
  private boolean onG;
  private boolean onJ;
  private int onk;
  private LinearLayout onw;
  private double ooA;
  private String ooB;
  private String ooC;
  private String ooD;
  private String ooE;
  private String ooF;
  private int ooG;
  private String ooH;
  private boolean ooI;
  private String ooJ;
  private int ooK;
  private int ooL;
  private String oob;
  private String oog;
  private String ooh;
  private String ooi;
  private TextView ooo;
  private TextView oop;
  private TextView ooq;
  private TextView oor;
  private TextView oos;
  private TextView oot;
  private CdnImageView oou;
  private WalletFormView oov;
  private Button oow;
  private LinearLayout oox;
  private LinearLayout ooy;
  private String ooz;
  
  public RemittanceBusiUI()
  {
    GMTrace.i(19330439839744L, 144023);
    GMTrace.o(19330439839744L, 144023);
  }
  
  private void FF(String paramString)
  {
    GMTrace.i(19331513581568L, 144031);
    w.i("MicroMsg.RemittanceBusiUI", "do start pay");
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.eHG = paramString;
    localPayInfo.ePL = this.onk;
    if (this.mChannel > 0) {
      localPayInfo.ePH = this.mChannel;
    }
    paramString = new Bundle();
    paramString.putString("extinfo_key_1", this.ooB);
    paramString.putString("extinfo_key_2", this.ooC);
    paramString.putString("extinfo_key_3", this.ooD);
    paramString.putString("extinfo_key_5", getIntent().getStringExtra("receiver_tips"));
    paramString.putString("extinfo_key_7", this.ooE);
    localPayInfo.tIC = paramString;
    localPayInfo.omG = 1;
    paramString = new Intent();
    g.a(this, false, "", localPayInfo, this.ooC, paramString, 1);
    GMTrace.o(19331513581568L, 144031);
  }
  
  private boolean a(final c paramc)
  {
    boolean bool2 = true;
    GMTrace.i(19331379363840L, 144030);
    boolean bool1;
    if (!this.onG) {
      if (!bg.nm(paramc.olZ.tXm))
      {
        this.onG = true;
        com.tencent.mm.ui.base.h.a(this, paramc.olZ.tXm, getString(a.i.cUl), getString(a.i.sXk), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19338224467968L, 144081);
            if (!RemittanceBusiUI.a(RemittanceBusiUI.this, paramc)) {
              RemittanceBusiUI.b(RemittanceBusiUI.this, paramc.olZ.eJQ);
            }
            GMTrace.o(19338224467968L, 144081);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19335942766592L, 144064);
            GMTrace.o(19335942766592L, 144064);
          }
        });
        bool1 = true;
      }
    }
    for (;;)
    {
      if ((!bool1) && (!this.onJ)) {
        if (paramc.olZ.tXn != null)
        {
          this.onJ = true;
          com.tencent.mm.ui.base.h.a(this, paramc.olZ.jzI, "", paramc.olZ.tXn.mJP, paramc.olZ.tXn.mJO, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19328426573824L, 144008);
              w.i("MicroMsg.RemittanceBusiUI", "goto h5: %s", new Object[] { paramc.olZ.tXn.jWz });
              e.m(RemittanceBusiUI.this.vKB.vKW, paramc.olZ.tXn.jWz, false);
              GMTrace.o(19328426573824L, 144008);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19334332153856L, 144052);
              GMTrace.o(19334332153856L, 144052);
            }
          });
          bool1 = bool2;
        }
      }
      for (;;)
      {
        GMTrace.o(19331379363840L, 144030);
        return bool1;
        bool1 = false;
        break;
        bool1 = false;
      }
      bool1 = false;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(19330708275200L, 144025);
    this.ola = ((ScrollView)findViewById(a.f.sGW));
    this.ooo = ((TextView)findViewById(a.f.sGm));
    this.oop = ((TextView)findViewById(a.f.sGn));
    this.ooq = ((TextView)findViewById(a.f.sGj));
    this.oor = ((TextView)findViewById(a.f.sGh));
    this.oos = ((TextView)findViewById(a.f.sGe));
    this.oot = ((TextView)findViewById(a.f.sGd));
    this.oou = ((CdnImageView)findViewById(a.f.sGk));
    this.oov = ((WalletFormView)findViewById(a.f.sGl));
    this.oow = ((Button)findViewById(a.f.sGo));
    this.oox = ((LinearLayout)findViewById(a.f.sGi));
    this.onw = ((LinearLayout)findViewById(a.f.sGg));
    this.ooy = ((LinearLayout)findViewById(a.f.sGf));
    if (this.ooI)
    {
      if (!bg.nm(this.ooD)) {
        this.ooq.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, this.ooD, this.ooq.getTextSize()));
      }
      this.oor.setText(e.r(this.ooA));
      this.oox.setVisibility(0);
      this.onw.setVisibility(8);
      this.ooo.setText(this.oob);
      String str2 = getString(a.i.sGn) + e.dl(e.fs(this.ooB), 10);
      String str1 = str2;
      if (!bg.nm(this.ooC)) {
        str1 = getString(a.i.sXo, new Object[] { str2, this.ooC });
      }
      this.oop.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, str1, this.oop.getTextSize()));
      if (bg.nm(this.ooH)) {
        break label480;
      }
      this.oou.setUrl(this.ooH);
    }
    for (;;)
    {
      this.ooy.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19335137460224L, 144058);
          if (!RemittanceBusiUI.c(RemittanceBusiUI.this)) {
            RemittanceBusiUI.d(RemittanceBusiUI.this);
          }
          com.tencent.mm.plugin.wallet_core.ui.view.a.a(RemittanceBusiUI.this, RemittanceBusiUI.this.getString(a.i.sGd), RemittanceBusiUI.e(RemittanceBusiUI.this), RemittanceBusiUI.this.getString(a.i.sXl), 20, new h.b()new DialogInterface.OnClickListener
          {
            public final boolean v(CharSequence paramAnonymous2CharSequence)
            {
              GMTrace.i(19329634533376L, 144017);
              RemittanceBusiUI.a(RemittanceBusiUI.this, paramAnonymous2CharSequence.toString());
              RemittanceBusiUI.f(RemittanceBusiUI.this);
              GMTrace.o(19329634533376L, 144017);
              return true;
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(19334869024768L, 144056);
              af.i(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19334063718400L, 144050);
                  RemittanceBusiUI.this.aLo();
                  GMTrace.o(19334063718400L, 144050);
                }
              }, 500L);
              GMTrace.o(19334869024768L, 144056);
            }
          });
          GMTrace.o(19335137460224L, 144058);
        }
      });
      this.oow.setOnClickListener(new r()
      {
        public final void aoJ()
        {
          GMTrace.i(19336748072960L, 144070);
          if (!RemittanceBusiUI.c(RemittanceBusiUI.this)) {
            RemittanceBusiUI.a(RemittanceBusiUI.this, bg.getDouble(RemittanceBusiUI.g(RemittanceBusiUI.this).getText(), 0.0D));
          }
          if (RemittanceBusiUI.h(RemittanceBusiUI.this) <= 0.0D)
          {
            u.makeText(RemittanceBusiUI.this.vKB.vKW, a.i.sZH, 0).show();
            GMTrace.o(19336748072960L, 144070);
            return;
          }
          RemittanceBusiUI.i(RemittanceBusiUI.this);
          GMTrace.o(19336748072960L, 144070);
        }
      });
      this.mLW = new com.tencent.mm.wallet_core.ui.a()
      {
        public final void gU(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19329366097920L, 144015);
          if (paramAnonymousBoolean)
          {
            RemittanceBusiUI.a(RemittanceBusiUI.this, RemittanceBusiUI.j(RemittanceBusiUI.this), RemittanceBusiUI.k(RemittanceBusiUI.this));
            GMTrace.o(19329366097920L, 144015);
            return;
          }
          RemittanceBusiUI.j(RemittanceBusiUI.this).scrollTo(0, 0);
          GMTrace.o(19329366097920L, 144015);
        }
      };
      GMTrace.o(19330708275200L, 144025);
      return;
      e(this.oov, 2, false);
      this.oov.a(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(19335674331136L, 144062);
          if (paramAnonymousEditable.toString().startsWith(".")) {
            paramAnonymousEditable.insert(0, "0");
          }
          String str = paramAnonymousEditable.toString();
          int i = str.indexOf(".");
          int j = str.length();
          if ((i >= 0) && (j - i > 2)) {
            paramAnonymousEditable.delete(i + 3, j);
          }
          GMTrace.o(19335674331136L, 144062);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(19335405895680L, 144060);
          GMTrace.o(19335405895680L, 144060);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(19335540113408L, 144061);
          GMTrace.o(19335540113408L, 144061);
        }
      });
      this.oox.setVisibility(8);
      this.onw.setVisibility(0);
      break;
      label480:
      a.b.a(this.oou, this.ooB);
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(19330976710656L, 144027);
    if ((paramk instanceof c))
    {
      paramString = (c)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        if (paramString.olZ.jzH == 0) {
          if (!a(paramString))
          {
            this.oog = paramString.olZ.tXc;
            this.nAz = paramString.olZ.tXd;
            this.ooi = paramString.olZ.tXg;
            FF(paramString.olZ.eJQ);
          }
        }
      }
    }
    while (!(paramk instanceof b)) {
      for (;;)
      {
        GMTrace.o(19330976710656L, 144027);
        return false;
        w.e("MicroMsg.RemittanceBusiUI", "place order response: %s, %s", new Object[] { Integer.valueOf(paramString.olZ.jzH), paramString.olZ.jzI });
        Toast.makeText(this, paramString.olZ.jzI, 1).show();
        continue;
        w.e("MicroMsg.RemittanceBusiUI", "net error: %s", new Object[] { paramk });
      }
    }
    w.i("MicroMsg.RemittanceBusiUI", "pay check callback");
    GMTrace.o(19330976710656L, 144027);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19331245146112L, 144029);
    int i = a.g.sOw;
    GMTrace.o(19331245146112L, 144029);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19331110928384L, 144028);
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      w.i("MicroMsg.RemittanceBusiUI", "goto busi result");
      Intent localIntent = new Intent(this, RemittanceBusiResultUI.class);
      localIntent.putExtra("key_pay_desc", this.ooE);
      localIntent.putExtra("key_rcv_desc", this.ooD);
      localIntent.putExtra("key_mch_name", this.oob);
      localIntent.putExtra("key_rcver_name", this.ooB);
      localIntent.putExtra("key_rcver_true_name", this.ooC);
      localIntent.putExtra("key_money", this.ooA);
      localIntent.putExtra("key_f2f_id", this.oog);
      localIntent.putExtra("key_trans_id", this.nAz);
      localIntent.putExtra("key_check_sign", this.ooi);
      localIntent.putExtra("key_rcvr_open_id", this.ooh);
      startActivity(localIntent);
      finish();
      w.i("MicroMsg.RemittanceBusiUI", "do pay check");
      int i = (int)Math.round(this.ooA * 100.0D);
      b(new b(this.oog, this.nAz, this.ooh, i), false);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(19331110928384L, 144028);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19330574057472L, 144024);
    super.onCreate(paramBundle);
    cN().cO().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.smJ)));
    paramBundle = cN().cO().getCustomView();
    if (paramBundle != null)
    {
      View localView = paramBundle.findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.aNX));
      }
      paramBundle = paramBundle.findViewById(16908308);
      if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
        ((TextView)paramBundle).setTextColor(getResources().getColor(a.c.black));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.setStatusBarColor(getResources().getColor(a.c.smJ));
    }
    if (com.tencent.mm.compatible.util.d.et(21))
    {
      if (com.tencent.mm.compatible.util.d.et(23)) {
        getWindow().getDecorView().setSystemUiVisibility(8192);
      }
    }
    else
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(19337419161600L, 144075);
          if (RemittanceBusiUI.b(RemittanceBusiUI.this))
          {
            RemittanceBusiUI.this.aLo();
            RemittanceBusiUI.this.showDialog(1000);
          }
          for (;;)
          {
            GMTrace.o(19337419161600L, 144075);
            return true;
            RemittanceBusiUI.this.finish();
          }
        }
      }, a.h.cJD);
      hN(1633);
      hN(1241);
      oM(a.i.sXm);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(19334600589312L, 144054);
          RemittanceBusiUI.a(RemittanceBusiUI.this);
          RemittanceBusiUI.this.finish();
          GMTrace.o(19334600589312L, 144054);
          return false;
        }
      });
      this.onk = getIntent().getIntExtra("pay_scene", 31);
      this.ooz = getIntent().getStringExtra("scan_remittance_id");
      this.ooA = getIntent().getDoubleExtra("fee", 0.0D);
      this.ooB = getIntent().getStringExtra("receiver_name");
      this.ooC = getIntent().getStringExtra("receiver_true_name");
      this.mChannel = getIntent().getIntExtra("pay_channel", 0);
      this.ooD = getIntent().getStringExtra("desc");
      this.ooG = getIntent().getIntExtra("busi_type", 0);
      this.oob = getIntent().getStringExtra("mch_name");
      this.ooH = getIntent().getStringExtra("mch_photo");
      this.ooJ = getIntent().getStringExtra("mch_type");
      this.ooL = getIntent().getIntExtra("mch_time", 0);
      this.ooK = getIntent().getIntExtra("get_pay_wifi", 0);
      this.ooh = getIntent().getStringExtra("rcvr_open_id");
      this.ooF = getIntent().getStringExtra("rcvr_ticket");
      if (this.ooA <= 0.0D) {
        break label509;
      }
    }
    label509:
    for (this.ooI = true;; this.ooI = false)
    {
      if (this.ooG == 0)
      {
        w.w("MicroMsg.RemittanceBusiUI", "wrong busi type!");
        finish();
      }
      MP();
      GMTrace.o(19330574057472L, 144024);
      return;
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      break;
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(19330842492928L, 144026);
    super.onDestroy();
    hO(1633);
    hO(1241);
    GMTrace.o(19330842492928L, 144026);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceBusiUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */