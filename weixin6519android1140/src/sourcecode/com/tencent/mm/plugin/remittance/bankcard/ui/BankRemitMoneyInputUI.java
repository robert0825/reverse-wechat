package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.remittance.bankcard.a.c;
import com.tencent.mm.plugin.remittance.bankcard.a.n;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.plugin.wallet_core.ui.k.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.ayz;
import com.tencent.mm.protocal.c.cd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.r;
import com.tencent.mm.wallet_core.c.g.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class BankRemitMoneyInputUI
  extends BankRemitBaseUI
{
  private String fLH;
  private final int hqZ;
  private Button kES;
  private CdnImageView ojB;
  private TextView ojD;
  private TextView okE;
  private String okM;
  private ScrollView ola;
  private WalletFormView olb;
  private LinearLayout olc;
  private TextView old;
  private TextView ole;
  private TextView olf;
  private TextView olg;
  private BankcardElemParcel olh;
  private String oli;
  private String olj;
  private String olk;
  private String oll;
  private String olm;
  private int oln;
  private int olo;
  private com.tencent.mm.plugin.wallet_core.ui.k olp;
  private long olq;
  private int olr;
  private int ols;
  
  public BankRemitMoneyInputUI()
  {
    GMTrace.i(20935415431168L, 155981);
    this.hqZ = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 270);
    GMTrace.o(20935415431168L, 155981);
  }
  
  private void bbo()
  {
    GMTrace.i(20936489172992L, 155989);
    if ((bg.getDouble(this.olb.getText(), 0.0D) > 0.0D) && (!bg.nm(this.olj)) && (!bg.nm(this.olk)) && (!bg.nm(this.olm)) && (!bg.nm(this.oll)))
    {
      this.kES.setEnabled(true);
      GMTrace.o(20936489172992L, 155989);
      return;
    }
    w.i("MicroMsg.BankRemitMoneyInputUI", "disable btn: money: %s, seqNo: %s, tail: %s, bankType: %s, encrypt: %s", new Object[] { this.olb.getText(), Boolean.valueOf(bg.nm(this.olj)), Boolean.valueOf(bg.nm(this.olk)), Boolean.valueOf(bg.nm(this.olm)), Boolean.valueOf(bg.nm(this.oll)) });
    this.kES.setEnabled(false);
    GMTrace.o(20936489172992L, 155989);
  }
  
  private void bbr()
  {
    GMTrace.i(20936354955264L, 155988);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (!bg.nm(this.fLH))
    {
      localSpannableStringBuilder.append(com.tencent.mm.pluginsdk.ui.d.h.a(this.vKB.vKW, this.fLH));
      localSpannableStringBuilder.append(getString(a.i.sRW));
      localSpannableStringBuilder.setSpan(this.olp, this.fLH.length(), localSpannableStringBuilder.length(), 34);
    }
    for (;;)
    {
      this.olg.setText(localSpannableStringBuilder);
      GMTrace.o(20936354955264L, 155988);
      return;
      localSpannableStringBuilder.append(getString(a.i.sRX));
      localSpannableStringBuilder.setSpan(this.olp, 0, localSpannableStringBuilder.length(), 18);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(20935683866624L, 155983);
    this.ola = ((ScrollView)findViewById(a.f.sGW));
    this.ojB = ((CdnImageView)findViewById(a.f.srT));
    this.ojD = ((TextView)findViewById(a.f.srV));
    this.okE = ((TextView)findViewById(a.f.ssa));
    this.olb = ((WalletFormView)findViewById(a.f.srU));
    this.olc = ((LinearLayout)findViewById(a.f.srW));
    this.old = ((TextView)this.olc.findViewById(a.f.srX));
    this.ole = ((TextView)this.olc.findViewById(a.f.srY));
    this.olf = ((TextView)this.olc.findViewById(a.f.ssc));
    this.olg = ((TextView)this.olc.findViewById(a.f.ssb));
    this.kES = ((Button)findViewById(a.f.srZ));
    String str = com.tencent.mm.plugin.remittance.bankcard.model.a.dq(new StringBuilder().append(this.olh.ojl).toString(), "100") + "%";
    this.old.setText(getString(a.i.sRQ, new Object[] { str }));
    this.ojB.setUrl(this.olh.ojk);
    this.ojD.setText(getString(a.i.sSc, new Object[] { this.olh.mhU, this.olk }));
    this.okE.setText(this.oli);
    this.olb.vl(com.tencent.mm.wallet_core.c.t.clX());
    e(this.olb, 2, false);
    this.olb.a(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(20943736930304L, 156043);
        if (paramAnonymousEditable.toString().startsWith(".")) {
          paramAnonymousEditable.insert(0, "0");
        }
        String str = paramAnonymousEditable.toString();
        int i = str.indexOf(".");
        int j = str.length();
        if ((i >= 0) && (j - i > 2)) {
          paramAnonymousEditable.delete(i + 3, j);
        }
        paramAnonymousEditable = paramAnonymousEditable.toString();
        if ((!bg.nm(paramAnonymousEditable)) && (bg.getDouble(paramAnonymousEditable, 0.0D) > 0.0D)) {
          BankRemitMoneyInputUI.a(BankRemitMoneyInputUI.this).setVisibility(0);
        }
        for (;;)
        {
          BankRemitMoneyInputUI.a(BankRemitMoneyInputUI.this, paramAnonymousEditable);
          BankRemitMoneyInputUI.b(BankRemitMoneyInputUI.this);
          GMTrace.o(20943736930304L, 156043);
          return;
          BankRemitMoneyInputUI.a(BankRemitMoneyInputUI.this).setVisibility(8);
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20943468494848L, 156041);
        GMTrace.o(20943468494848L, 156041);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20943602712576L, 156042);
        GMTrace.o(20943602712576L, 156042);
      }
    });
    this.olg.setClickable(true);
    this.olg.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
    this.olp = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
    {
      public final void aoR()
      {
        GMTrace.i(20932596858880L, 155960);
        com.tencent.mm.plugin.wallet_core.ui.view.a.a(BankRemitMoneyInputUI.this, BankRemitMoneyInputUI.this.getString(a.i.sRX), BankRemitMoneyInputUI.h(BankRemitMoneyInputUI.this), BankRemitMoneyInputUI.this.getString(a.i.sXu), 20, new h.b()new DialogInterface.OnClickListener
        {
          public final boolean v(CharSequence paramAnonymous2CharSequence)
          {
            GMTrace.i(20898639773696L, 155707);
            if (!bg.nm(paramAnonymous2CharSequence.toString()))
            {
              BankRemitMoneyInputUI.c(BankRemitMoneyInputUI.this, paramAnonymous2CharSequence.toString());
              BankRemitMoneyInputUI.i(BankRemitMoneyInputUI.this);
            }
            for (;;)
            {
              GMTrace.o(20898639773696L, 155707);
              return true;
              BankRemitMoneyInputUI.c(BankRemitMoneyInputUI.this, null);
              BankRemitMoneyInputUI.i(BankRemitMoneyInputUI.this);
            }
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(20924006924288L, 155896);
            af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20945750196224L, 156058);
                BankRemitMoneyInputUI.this.aLo();
                GMTrace.o(20945750196224L, 156058);
              }
            }, 500L);
            GMTrace.o(20924006924288L, 155896);
          }
        });
        com.tencent.mm.plugin.report.service.g.ork.i(14673, new Object[] { Integer.valueOf(4) });
        GMTrace.o(20932596858880L, 155960);
      }
    });
    bbr();
    this.kES.setOnClickListener(new r()
    {
      public final void aoJ()
      {
        GMTrace.i(20940784140288L, 156021);
        w.d("MicroMsg.BankRemitMoneyInputUI", "on click next");
        double d = com.tencent.mm.plugin.remittance.bankcard.model.a.dr(BankRemitMoneyInputUI.c(BankRemitMoneyInputUI.this).getText(), "100");
        if (d <= 0.0D)
        {
          w.w("MicroMsg.BankRemitMoneyInputUI", "illegal money: %s", new Object[] { Double.valueOf(d) });
          Toast.makeText(BankRemitMoneyInputUI.this, a.i.sRU, 1).show();
          GMTrace.o(20940784140288L, 156021);
          return;
        }
        if (d > BankRemitMoneyInputUI.d(BankRemitMoneyInputUI.this))
        {
          w.w("MicroMsg.BankRemitMoneyInputUI", "more than max: %s", new Object[] { Double.valueOf(d) });
          Toast.makeText(BankRemitMoneyInputUI.this, BankRemitMoneyInputUI.this.getString(a.i.sRV, new Object[] { com.tencent.mm.plugin.remittance.bankcard.model.a.dq(new StringBuilder().append(BankRemitMoneyInputUI.d(BankRemitMoneyInputUI.this)).toString(), "100") }), 0).show();
          GMTrace.o(20940784140288L, 156021);
          return;
        }
        BankRemitMoneyInputUI.e(BankRemitMoneyInputUI.this);
        GMTrace.o(20940784140288L, 156021);
      }
    });
    bbo();
    this.mLW = new com.tencent.mm.wallet_core.ui.a()
    {
      public final void gU(boolean paramAnonymousBoolean)
      {
        GMTrace.i(20945347543040L, 156055);
        if (paramAnonymousBoolean)
        {
          BankRemitMoneyInputUI.f(BankRemitMoneyInputUI.this);
          GMTrace.o(20945347543040L, 156055);
          return;
        }
        BankRemitMoneyInputUI.g(BankRemitMoneyInputUI.this).scrollTo(0, 0);
        GMTrace.o(20945347543040L, 156055);
      }
    };
    GMTrace.o(20935683866624L, 155983);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(20935818084352L, 155984);
    if ((paramk instanceof n))
    {
      paramString = (n)paramk;
      paramString.a(new g.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(20942394753024L, 156033);
          w.i("MicroMsg.BankRemitMoneyInputUI", "reqKey: %s, billId: %s", new Object[] { paramString.ojj.mJK, paramString.ojj.tXo });
          w.d("MicroMsg.BankRemitMoneyInputUI", "name: %s, bank: %s", new Object[] { paramString.ojj.ojG, paramString.ojj.mhU });
          BankRemitMoneyInputUI.b(BankRemitMoneyInputUI.this, paramString.ojj.tXo);
          if (!BankRemitMoneyInputUI.a(BankRemitMoneyInputUI.this, paramString)) {
            BankRemitMoneyInputUI.a(BankRemitMoneyInputUI.this, paramString.ojj.mJK, paramString.ojj.ojG, paramString.ojj.mhU, paramString.ojj.ojF);
          }
          GMTrace.o(20942394753024L, 156033);
        }
      }).b(new g.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(20905619095552L, 155759);
          w.e("MicroMsg.BankRemitMoneyInputUI", "request order error: %s, %s", new Object[] { Integer.valueOf(paramString.ojj.jWs), paramString.ojj.jWt });
          BankRemitMoneyInputUI.a(BankRemitMoneyInputUI.this, paramString);
          GMTrace.o(20905619095552L, 155759);
        }
      }).c(new g.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(20941857882112L, 156029);
          w.e("MicroMsg.BankRemitMoneyInputUI", "net error: %s", new Object[] { paramAnonymousk });
          GMTrace.o(20941857882112L, 156029);
        }
      });
    }
    GMTrace.o(20935818084352L, 155984);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20936086519808L, 155986);
    int i = a.g.sLF;
    GMTrace.o(20936086519808L, 155986);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20936220737536L, 155987);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        paramIntent = paramIntent.getStringExtra("key_trans_id");
        w.i("MicroMsg.BankRemitMoneyInputUI", "do business callback: %s, %s", new Object[] { this.okM, paramIntent });
        b(new c(this.okM, paramIntent), false);
        w.i("MicroMsg.BankRemitMoneyInputUI", "goto detail");
        paramIntent = new Intent(this.vKB.vKW, BankRemitDetailUI.class);
        paramIntent.putExtra("key_transfer_bill_id", this.okM);
        paramIntent.putExtra("key_enter_scene", 0);
        startActivityForResult(paramIntent, 2);
        GMTrace.o(20936220737536L, 155987);
        return;
      }
      w.i("MicroMsg.BankRemitMoneyInputUI", "pay failed: %d", new Object[] { Integer.valueOf(paramInt2) });
      GMTrace.o(20936220737536L, 155987);
      return;
    }
    if (paramInt1 == 2)
    {
      w.d("MicroMsg.BankRemitMoneyInputUI", "return from detail");
      paramIntent = new Intent();
      paramIntent.addFlags(67108864);
      d.b(this.vKB.vKW, "offline", ".ui.WalletOfflineCoinPurseUI", paramIntent);
      GMTrace.o(20936220737536L, 155987);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(20936220737536L, 155987);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20935549648896L, 155982);
    super.onCreate(paramBundle);
    hN(1380);
    int j = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzS, Integer.valueOf(10))).intValue();
    int i = j;
    if (j < 0) {
      i = 10;
    }
    this.olr = i;
    j = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzT, Integer.valueOf(5000000))).intValue();
    i = j;
    if (j <= 0) {
      i = 5000000;
    }
    this.ols = i;
    w.i("MicroMsg.BankRemitMoneyInputUI", "minFee: %s, maxAmount: %s", new Object[] { Integer.valueOf(this.olr), Integer.valueOf(this.ols) });
    this.olh = ((BankcardElemParcel)getIntent().getParcelableExtra("key_bank_card_elem_parcel"));
    this.oli = getIntent().getStringExtra("key_payee_name");
    this.olj = getIntent().getStringExtra("key_bank_card_seqno");
    this.olk = getIntent().getStringExtra("key_bank_card_tailno");
    this.oll = getIntent().getStringExtra("key_encrypt_data");
    this.oln = getIntent().getIntExtra("key_enter_time_scene", 0);
    this.olo = getIntent().getIntExtra("key_input_type", 0);
    if (this.olh == null)
    {
      w.w("MicroMsg.BankRemitMoneyInputUI", "bankcard elem is null");
      this.olh = new BankcardElemParcel();
    }
    this.olm = this.olh.nDt;
    MP();
    oM(a.i.sSh);
    GMTrace.o(20935549648896L, 155982);
  }
  
  public void onDestroy()
  {
    GMTrace.i(20935952302080L, 155985);
    super.onDestroy();
    hO(1380);
    GMTrace.o(20935952302080L, 155985);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitMoneyInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */