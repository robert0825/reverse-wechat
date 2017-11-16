package com.tencent.mm.plugin.collect.reward.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.fi;
import com.tencent.mm.plugin.collect.reward.a.a;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.ks;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.r;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class QrRewardGrantUI
  extends QrRewardBaseUI
{
  private String eHG;
  private int ePH;
  private String hZW;
  private String jVR;
  private String jXA;
  private String jXB;
  private String jXC;
  private String jXD;
  private String jXE;
  private int jXF;
  private c<fi> jXG;
  private ImageView jXm;
  private TextView jXn;
  private TextView jXo;
  private WalletTextView jXp;
  private LinearLayout jXq;
  private WalletFormView jXr;
  private MMEditText jXs;
  private Button jXt;
  private int jXu;
  private int jXv;
  private String jXw;
  private String jXx;
  private String jXy;
  private String jXz;
  
  public QrRewardGrantUI()
  {
    GMTrace.i(19359296651264L, 144238);
    this.jXG = new c() {};
    GMTrace.o(19359296651264L, 144238);
  }
  
  public final void MP()
  {
    GMTrace.i(19359565086720L, 144240);
    this.jXm = ((ImageView)findViewById(a.f.sED));
    this.jXn = ((TextView)findViewById(a.f.sEE));
    this.jXp = ((WalletTextView)findViewById(a.f.sEI));
    this.jXq = ((LinearLayout)findViewById(a.f.sEH));
    this.jXr = ((WalletFormView)findViewById(a.f.sEF));
    this.jXs = ((MMEditText)findViewById(a.f.sEG));
    this.jXt = ((Button)findViewById(a.f.sEJ));
    this.jXo = ((TextView)findViewById(a.f.sEC));
    this.jXo.setText(getString(a.i.sXa, new Object[] { Math.round(this.jXF / 100.0F) }));
    a.b.a(this.jXm, this.jXA, 0.03F, false);
    String str = e.dl(e.fs(this.jXA), 10);
    this.jXn.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, getString(a.i.sWS, new Object[] { str })));
    if (this.jXv == 2)
    {
      w.i("MicroMsg.QrRewardGrantUI", "edit layout");
      e(this.jXr, 2, false);
      this.jXr.a(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(19363725836288L, 144271);
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
            i = (int)Math.round(bg.getDouble(paramAnonymousEditable.toString(), 0.0D) * 100.0D);
            QrRewardGrantUI.a(QrRewardGrantUI.this, i);
            QrRewardGrantUI.b(QrRewardGrantUI.this, i);
            GMTrace.o(19363725836288L, 144271);
            return;
            if (i > 6) {
              paramAnonymousEditable.delete(6, i);
            } else if ((i == -1) && (j > 6)) {
              paramAnonymousEditable.delete(6, j);
            }
          }
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(19363457400832L, 144269);
          GMTrace.o(19363457400832L, 144269);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(19363591618560L, 144270);
          GMTrace.o(19363591618560L, 144270);
        }
      });
      this.jXr.setVisibility(0);
      this.jXq.setVisibility(8);
      this.jXr.cmA();
      this.jXt.setEnabled(false);
    }
    for (;;)
    {
      this.jXt.setOnClickListener(new r()
      {
        public final void aoJ()
        {
          GMTrace.i(19359162433536L, 144237);
          int i = (int)Math.round(bg.getDouble(QrRewardGrantUI.a(QrRewardGrantUI.this).getText(), 0.0D) * 100.0D);
          if (QrRewardGrantUI.a(QrRewardGrantUI.this, i)) {
            QrRewardGrantUI.b(QrRewardGrantUI.this);
          }
          GMTrace.o(19359162433536L, 144237);
        }
      });
      GMTrace.o(19359565086720L, 144240);
      return;
      this.jXp.setText(e.r(this.jXu / 100.0D));
      this.jXr.setVisibility(8);
      this.jXq.setVisibility(0);
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(19359699304448L, 144241);
    if ((paramk instanceof d))
    {
      paramString = (d)paramk;
      paramString.a(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19377281826816L, 144372);
          QrRewardGrantUI.a(QrRewardGrantUI.this, paramString.jXc.eJQ);
          QrRewardGrantUI.b(QrRewardGrantUI.this, paramString.jXc.ubq);
          QrRewardGrantUI.c(QrRewardGrantUI.this, paramString.jXc.tXd);
          QrRewardGrantUI.d(QrRewardGrantUI.this, paramString.jXc.ubo);
          QrRewardGrantUI.e(QrRewardGrantUI.this, paramString.jXc.ubn);
          w.i("MicroMsg.QrRewardGrantUI", "remind str: %s", new Object[] { paramString.jXc.uby });
          if (!bg.nm(paramString.jXc.uby))
          {
            com.tencent.mm.ui.base.h.a(QrRewardGrantUI.this.vKB.vKW, paramString.jXc.uby, "", QrRewardGrantUI.this.getString(a.i.sXt), QrRewardGrantUI.this.getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(20953803259904L, 156118);
                QrRewardGrantUI.c(QrRewardGrantUI.this);
                GMTrace.o(20953803259904L, 156118);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(20953266388992L, 156114);
                GMTrace.o(20953266388992L, 156114);
              }
            });
            GMTrace.o(19377281826816L, 144372);
            return;
          }
          QrRewardGrantUI.c(QrRewardGrantUI.this);
          GMTrace.o(19377281826816L, 144372);
        }
      }).b(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19363188965376L, 144267);
          w.e("MicroMsg.QrRewardGrantUI", "place order error: %s, %s", new Object[] { Integer.valueOf(paramString.jXc.jWs), paramString.jXc.jWt });
          if (!bg.nm(paramString.jXc.jWt)) {
            Toast.makeText(QrRewardGrantUI.this, paramString.jXc.jWt, 0).show();
          }
          GMTrace.o(19363188965376L, 144267);
        }
      }).c(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19377550262272L, 144374);
          w.e("MicroMsg.QrRewardGrantUI", "net error: %s", new Object[] { paramAnonymousk });
          GMTrace.o(19377550262272L, 144374);
        }
      });
    }
    GMTrace.o(19359699304448L, 144241);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19360101957632L, 144244);
    int i = a.g.sOg;
    GMTrace.o(19360101957632L, 144244);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19359967739904L, 144243);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        setResult(-1);
        finish();
        GMTrace.o(19359967739904L, 144243);
        return;
      }
      w.w("MicroMsg.QrRewardGrantUI", "pay fail");
      GMTrace.o(19359967739904L, 144243);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(19359967739904L, 144243);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19359430868992L, 144239);
    super.onCreate(paramBundle);
    hN(1336);
    this.jXG.bPu();
    oM(a.i.sWR);
    this.jXu = getIntent().getIntExtra("key_money_amt", 20000);
    this.jXv = getIntent().getIntExtra("key_amt_type", 0);
    this.jXw = getIntent().getStringExtra("key_qrcode_desc");
    this.ePH = getIntent().getIntExtra("key_channel", 0);
    this.jXy = getIntent().getStringExtra("key_rcvr_open_id");
    this.jXA = getIntent().getStringExtra("key_rcvr_name");
    this.jXB = getIntent().getStringExtra("key_rcvr_true_name");
    this.jXC = getIntent().getStringExtra("key_scan_id");
    this.hZW = getIntent().getStringExtra("key_web_url");
    this.jXD = getIntent().getStringExtra("key_sxtend_1");
    this.jXE = getIntent().getStringExtra("key_sxtend_2");
    this.jXF = getIntent().getIntExtra("key_max_amt", 20000);
    w.i("MicroMsg.QrRewardGrantUI", "amtType: %s, channel: %s, maxAmt: %s", new Object[] { Integer.valueOf(this.jXv), Integer.valueOf(this.ePH), Integer.valueOf(this.jXF) });
    MP();
    GMTrace.o(19359430868992L, 144239);
  }
  
  public void onDestroy()
  {
    GMTrace.i(19359833522176L, 144242);
    super.onDestroy();
    hO(1336);
    this.jXG.dead();
    GMTrace.o(19359833522176L, 144242);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\ui\QrRewardGrantUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */