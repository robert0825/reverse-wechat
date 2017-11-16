package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.ap.b.a;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileVerifyUI;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bj;

public class RegByMobileRegAIOUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private String countryCode;
  private String gLy;
  private ImageView hqG;
  private int ibA;
  private String nLL;
  private String osl;
  private int progress;
  private com.tencent.mm.sdk.b.c vPG;
  private String vQG;
  private r vQR;
  private ResizeLayout vQr;
  private LinearLayout vRL;
  private TextView vRM;
  private EditText vRN;
  private MMFormInputView vRO;
  private String vRP;
  private boolean vRQ;
  private String vRR;
  private String vRS;
  private String vRT;
  private TextView vRU;
  private Button vRV;
  private Button vRW;
  private MMFormInputView vRX;
  private boolean vRY;
  private ImageView vRZ;
  private MMFormInputView vSa;
  private int vSb;
  private boolean vSc;
  private boolean vSd;
  private ScrollView vSe;
  private boolean vSf;
  private boolean vSg;
  private ProgressBar vSh;
  private i vSi;
  private ae vSj;
  private j vSk;
  private boolean vSl;
  private j.a vSm;
  private int vSn;
  private int vSo;
  private boolean vSp;
  private boolean vSq;
  private final int vSr;
  
  public RegByMobileRegAIOUI()
  {
    GMTrace.i(2700594905088L, 20121);
    this.vRP = null;
    this.gLy = null;
    this.countryCode = null;
    this.vRQ = true;
    this.vRT = null;
    this.nLL = null;
    this.vRY = false;
    this.vSb = 0;
    this.vSf = false;
    this.vSg = true;
    this.vPG = new com.tencent.mm.sdk.b.c() {};
    this.vSi = null;
    this.progress = 0;
    this.vSj = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(16834526969856L, 125427);
        if (((RegByMobileRegAIOUI.q(RegByMobileRegAIOUI.this) != null) && (!RegByMobileRegAIOUI.q(RegByMobileRegAIOUI.this).isShowing())) || (RegByMobileRegAIOUI.r(RegByMobileRegAIOUI.this)))
        {
          GMTrace.o(16834526969856L, 125427);
          return;
        }
        RegByMobileRegAIOUI.a(RegByMobileRegAIOUI.this, RegByMobileRegAIOUI.s(RegByMobileRegAIOUI.this) + 2);
        RegByMobileRegAIOUI.t(RegByMobileRegAIOUI.this).setProgress(RegByMobileRegAIOUI.s(RegByMobileRegAIOUI.this));
        if (RegByMobileRegAIOUI.s(RegByMobileRegAIOUI.this) < RegByMobileRegAIOUI.t(RegByMobileRegAIOUI.this).getMax())
        {
          sendEmptyMessageDelayed(0, 10L);
          GMTrace.o(16834526969856L, 125427);
          return;
        }
        RegByMobileRegAIOUI.t(RegByMobileRegAIOUI.this).setIndeterminate(true);
        if (!RegByMobileRegAIOUI.r(RegByMobileRegAIOUI.this))
        {
          if (RegByMobileRegAIOUI.q(RegByMobileRegAIOUI.this) != null) {
            RegByMobileRegAIOUI.q(RegByMobileRegAIOUI.this).dismiss();
          }
          RegByMobileRegAIOUI.u(RegByMobileRegAIOUI.this);
        }
        GMTrace.o(16834526969856L, 125427);
      }
    };
    this.vSl = false;
    this.vSm = new j.a()
    {
      public final void Vr(String paramAnonymousString)
      {
        GMTrace.i(16847680307200L, 125525);
        paramAnonymousString = paramAnonymousString.trim();
        RegByMobileRegAIOUI.d(RegByMobileRegAIOUI.this, paramAnonymousString);
        GMTrace.o(16847680307200L, 125525);
      }
      
      public final void bYI()
      {
        GMTrace.i(16847814524928L, 125526);
        RegByMobileRegAIOUI.u(RegByMobileRegAIOUI.this);
        GMTrace.o(16847814524928L, 125526);
      }
    };
    this.vSr = 128;
    GMTrace.o(2700594905088L, 20121);
  }
  
  private void Bt(int paramInt)
  {
    GMTrace.i(2702339735552L, 20134);
    switch (18.vRK[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(2702339735552L, 20134);
      return;
      h.h(this, R.l.dRB, R.l.dRD);
      GMTrace.o(2702339735552L, 20134);
      return;
      h.h(this, R.l.dRC, R.l.dRD);
      GMTrace.o(2702339735552L, 20134);
      return;
      h.h(this, R.l.ega, R.l.cSK);
      GMTrace.o(2702339735552L, 20134);
      return;
      h.h(this, R.l.egc, R.l.cSK);
    }
  }
  
  private void Vp(String paramString)
  {
    GMTrace.i(19235950559232L, 143319);
    String str;
    int i;
    if (this.vSd)
    {
      str = this.vRX.getText().toString();
      if (str.length() > 16)
      {
        Bt(SetPwdUI.a.vUg);
        i = 0;
      }
      while (i == 0)
      {
        GMTrace.o(19235950559232L, 143319);
        return;
        if (bg.Sg(str))
        {
          h.h(this, R.l.dRh, R.l.dRD);
          i = 0;
        }
        else
        {
          if (!bg.Sl(str))
          {
            if ((str.length() >= 8) && (str.length() < 16)) {
              Bt(SetPwdUI.a.vUi);
            }
            for (;;)
            {
              i = 0;
              break;
              Bt(SetPwdUI.a.vUh);
            }
          }
          i = 1;
        }
      }
    }
    if (this.vQR != null) {
      this.vQR.dismiss();
    }
    getString(R.l.cUG);
    this.vQR = h.a(this, getString(R.l.dRi), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(16825937035264L, 125363);
        GMTrace.o(16825937035264L, 125363);
      }
    });
    if (this.ibA == 0)
    {
      str = an.Sa(this.vRN.getText().toString().trim());
      if ((this.vRR != null) && (this.vRS != null) && (!str.equals(this.vRR)) && (str.equals(this.vRS))) {
        i = 1;
      }
      for (;;)
      {
        paramString = new s(paramString, 12, "", 0, "");
        paramString.ge(this.vSb);
        paramString.gf(i);
        at.wS().a(paramString, 0);
        this.vRR = an.Sa(this.vRN.getText().toString().trim());
        this.vSb += 1;
        GMTrace.o(19235950559232L, 143319);
        return;
        if ((this.vRR != null) && (this.vRS != null) && (!this.vRS.equals(this.vRR)) && (!str.equals(this.vRS))) {
          i = 2;
        } else {
          i = 0;
        }
      }
    }
    throw new IllegalArgumentException("NO IMPLEMENT");
  }
  
  private void Vq(String paramString)
  {
    try
    {
      GMTrace.i(2702071300096L, 20132);
      if (this.vSk != null)
      {
        this.vSk.bYY();
        this.vSk = null;
      }
      if (!this.vSl)
      {
        this.vSl = true;
        finish();
        Intent localIntent = new Intent();
        localIntent.putExtra("bindmcontact_mobile", this.vRT + " " + this.vRN.getText().toString());
        localIntent.putExtra("bindmcontact_shortmobile", this.nLL);
        localIntent.putExtra("country_name", this.gLy);
        localIntent.putExtra("couttry_code", this.countryCode);
        localIntent.putExtra("login_type", this.ibA);
        localIntent.putExtra("mobileverify_countdownsec", this.vSn);
        localIntent.putExtra("mobileverify_countdownstyle", this.vSo);
        localIntent.putExtra("mobileverify_fb", this.vSp);
        localIntent.putExtra("mobileverify_reg_qq", this.vSq);
        localIntent.putExtra("kintent_nickname", this.vSa.getText().toString());
        localIntent.putExtra("kintent_password", this.vRX.getText().toString());
        localIntent.putExtra("kintent_hasavatar", this.vRY);
        localIntent.putExtra("regsession_id", this.vQG);
        localIntent.putExtra("mobile_verify_purpose", 2);
        if ((paramString != null) && (paramString.length() > 0)) {
          localIntent.putExtra("MicroMsg.MobileVerifyUIIntent_sms_code", paramString);
        }
        a(MobileVerifyUI.class, localIntent);
      }
      GMTrace.o(2702071300096L, 20132);
      return;
    }
    finally {}
  }
  
  private boolean a(Editable... paramVarArgs)
  {
    GMTrace.i(2702205517824L, 20133);
    int j = paramVarArgs.length;
    int i = 0;
    if (i < j)
    {
      Editable localEditable = paramVarArgs[i];
      if ((localEditable != null) && (localEditable.toString().length() != 0)) {}
    }
    for (i = 0;; i = 1)
    {
      if ((i != 0) && (this.vRQ))
      {
        GMTrace.o(2702205517824L, 20133);
        return true;
        i += 1;
        break;
      }
      GMTrace.o(2702205517824L, 20133);
      return false;
    }
  }
  
  private void bYF()
  {
    GMTrace.i(16830366220288L, 125396);
    if ((!bg.nm(this.gLy)) && (!bg.nm(this.countryCode)))
    {
      this.vRM.setText(an.eT(this.gLy, this.countryCode));
      GMTrace.o(16830366220288L, 125396);
      return;
    }
    this.vRM.setText(getString(R.l.dIL));
    GMTrace.o(16830366220288L, 125396);
  }
  
  private void bYG()
  {
    GMTrace.i(19236084776960L, 143320);
    getString(R.l.cUG);
    this.vQR = h.a(this, getString(R.l.dRi), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(16836942888960L, 125445);
        GMTrace.o(16836942888960L, 125445);
      }
    });
    s locals = new s(this.vRT + this.nLL, 14, "", 0, "");
    locals.jU(this.vQG);
    at.wS().a(locals, 0);
    GMTrace.o(19236084776960L, 143320);
  }
  
  private boolean bYH()
  {
    GMTrace.i(19236218994688L, 143321);
    if (bg.nm(this.countryCode)) {}
    for (int i = 0;; i = 1)
    {
      boolean bool;
      if (this.vSd)
      {
        bool = i & a(new Editable[] { this.vRN.getText(), this.vRX.getText(), this.vSa.getText() });
        if (!bool) {
          break label126;
        }
        this.vRW.setEnabled(true);
      }
      for (;;)
      {
        GMTrace.o(19236218994688L, 143321);
        return bool;
        bool = i & a(new Editable[] { this.vRN.getText(), this.vSa.getText() });
        break;
        label126:
        this.vRW.setEnabled(false);
      }
    }
  }
  
  private void bci()
  {
    GMTrace.i(2701534429184L, 20128);
    com.tencent.mm.plugin.c.b.nz(this.osl);
    com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",RE200_100," + at.eK("RE200_100") + ",2");
    finish();
    GMTrace.o(2701534429184L, 20128);
  }
  
  protected final void MP()
  {
    GMTrace.i(2701265993728L, 20126);
    this.vRL = ((LinearLayout)findViewById(R.h.bsh));
    this.vRM = ((TextView)findViewById(R.h.bsj));
    this.vRO = ((MMFormInputView)findViewById(R.h.bYf));
    this.vRO.setInputType(3);
    this.vRN = this.vRO.nUE;
    this.vRU = ((TextView)findViewById(R.h.bdt));
    this.vRW = ((Button)findViewById(R.h.bXW));
    this.hqG = ((ImageView)findViewById(R.h.ccs));
    this.vRZ = ((ImageView)findViewById(R.h.ccu));
    this.vRX = ((MMFormInputView)findViewById(R.h.bYd));
    com.tencent.mm.ui.tools.a.c.d(this.vRX.nUE).Ea(16).a(null);
    this.vSe = ((ScrollView)findViewById(R.h.scrollView));
    this.vQr = ((ResizeLayout)findViewById(R.h.bYy));
    this.vSa = ((MMFormInputView)findViewById(R.h.bXY));
    this.vSa.nUE.requestFocus();
    this.vQr.vTZ = new ResizeLayout.a()
    {
      public final void bYy()
      {
        GMTrace.i(16819628802048L, 125316);
        RegByMobileRegAIOUI.a(RegByMobileRegAIOUI.this);
        GMTrace.o(16819628802048L, 125316);
      }
    };
    Object localObject = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(2690125922304L, 20043);
        if (paramAnonymousBoolean) {
          RegByMobileRegAIOUI.a(RegByMobileRegAIOUI.this);
        }
        GMTrace.o(2690125922304L, 20043);
      }
    };
    this.vSa.wbP = ((View.OnFocusChangeListener)localObject);
    this.vRX.wbP = ((View.OnFocusChangeListener)localObject);
    bj.BC();
    this.vSd = true;
    bj.BC();
    this.vSc = true;
    if (!this.vSc)
    {
      this.hqG.setVisibility(8);
      this.vRZ.setVisibility(8);
    }
    if (!this.vSd) {
      this.vRX.setVisibility(8);
    }
    String str1 = getString(R.l.dRM);
    localObject = str1;
    if (com.tencent.mm.protocal.d.tJF) {
      localObject = str1 + getString(R.l.cRD);
    }
    sq((String)localObject);
    if (this.vRV != null) {
      this.vRV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2773743566848L, 20666);
          bg.E(RegByMobileRegAIOUI.this.vKB.vKW, RegByMobileRegAIOUI.this.getString(R.l.efA));
          GMTrace.o(2773743566848L, 20666);
        }
      });
    }
    localObject = getString(R.l.dGp);
    String str2;
    String str3;
    Spannable localSpannable;
    if (v.bPH())
    {
      str1 = getString(R.l.dGq);
      str2 = getString(R.l.dOA);
      str3 = getString(R.l.cRI);
      localSpannable = Spannable.Factory.getInstance().newSpannable((String)localObject + "  " + str1 + str3 + str2);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2635230871552L, 19634);
          bg.E(RegByMobileRegAIOUI.this.vKB.vKW, RegByMobileRegAIOUI.this.getString(R.l.efA));
          GMTrace.o(2635230871552L, 19634);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(2635365089280L, 19635);
          paramAnonymousTextPaint.setColor(RegByMobileRegAIOUI.this.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(true);
          GMTrace.o(2635365089280L, 19635);
        }
      }, ((String)localObject).length() + "  ".length(), ((String)localObject).length() + str1.length() + "  ".length(), 33);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2766764244992L, 20614);
          bg.E(RegByMobileRegAIOUI.this.vKB.vKW, RegByMobileRegAIOUI.this.getString(R.l.dGv, new Object[] { v.bPK(), v.bPJ() }));
          GMTrace.o(2766764244992L, 20614);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(2766898462720L, 20615);
          paramAnonymousTextPaint.setColor(RegByMobileRegAIOUI.this.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(true);
          GMTrace.o(2766898462720L, 20615);
        }
      }, ((String)localObject).length() + "  ".length() + str1.length() + str3.length(), ((String)localObject).length() + "  ".length() + str1.length() + str3.length() + str2.length(), 33);
      this.vRU.setText(localSpannable);
      this.vRU.setMovementMethod(LinkMovementMethod.getInstance());
      this.vRN.addTextChangedListener(new TextWatcher()
      {
        private an mnt;
        
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(2760187576320L, 20565);
          RegByMobileRegAIOUI.b(RegByMobileRegAIOUI.this);
          GMTrace.o(2760187576320L, 20565);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2760321794048L, 20566);
          GMTrace.o(2760321794048L, 20566);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2760456011776L, 20567);
          GMTrace.o(2760456011776L, 20567);
        }
      });
      this.vRX.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(16827547648000L, 125375);
          RegByMobileRegAIOUI.b(RegByMobileRegAIOUI.this);
          GMTrace.o(16827547648000L, 125375);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(16827413430272L, 125374);
          GMTrace.o(16827413430272L, 125374);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(16827279212544L, 125373);
          GMTrace.o(16827279212544L, 125373);
        }
      });
      this.vSa.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(2720459128832L, 20269);
          RegByMobileRegAIOUI.b(RegByMobileRegAIOUI.this);
          GMTrace.o(2720459128832L, 20269);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2720324911104L, 20268);
          GMTrace.o(2720324911104L, 20268);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2720190693376L, 20267);
          GMTrace.o(2720190693376L, 20267);
        }
      });
      this.vRW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16833587445760L, 125420);
          paramAnonymousView = com.tencent.mm.ui.tools.a.c.d(RegByMobileRegAIOUI.h(RegByMobileRegAIOUI.this).nUE).eE(1, 32);
          paramAnonymousView.xkl = true;
          paramAnonymousView.a(new c.a()
          {
            public final void acJ()
            {
              GMTrace.i(16842311598080L, 125485);
              h.h(RegByMobileRegAIOUI.this, R.l.dZr, R.l.dZt);
              GMTrace.o(16842311598080L, 125485);
            }
            
            public final void ack()
            {
              GMTrace.i(16842445815808L, 125486);
              h.h(RegByMobileRegAIOUI.this, R.l.dZs, R.l.dZt);
              GMTrace.o(16842445815808L, 125486);
            }
            
            public final void sT(String paramAnonymous2String)
            {
              GMTrace.i(16842177380352L, 125484);
              RegByMobileRegAIOUI.a(RegByMobileRegAIOUI.this, an.Sa(RegByMobileRegAIOUI.c(RegByMobileRegAIOUI.this).getText().toString()));
              RegByMobileRegAIOUI.b(RegByMobileRegAIOUI.this, an.Sc(RegByMobileRegAIOUI.d(RegByMobileRegAIOUI.this)));
              paramAnonymous2String = RegByMobileRegAIOUI.e(RegByMobileRegAIOUI.this) + RegByMobileRegAIOUI.f(RegByMobileRegAIOUI.this);
              RegByMobileRegAIOUI.this.aLo();
              if (RegByMobileRegAIOUI.g(RegByMobileRegAIOUI.this))
              {
                paramAnonymous2String = new Intent(RegByMobileRegAIOUI.this, ShowAgreementsUI.class);
                paramAnonymous2String.putExtra("agreement_type", 0);
                if (an.Sc(RegByMobileRegAIOUI.d(RegByMobileRegAIOUI.this)).equals("+86")) {
                  paramAnonymous2String.putExtra("country_code", "CN");
                }
                for (;;)
                {
                  RegByMobileRegAIOUI.this.startActivityForResult(paramAnonymous2String, 30847);
                  GMTrace.o(16842177380352L, 125484);
                  return;
                  paramAnonymous2String.putExtra("country_code", "US");
                }
              }
              RegByMobileRegAIOUI.c(RegByMobileRegAIOUI.this, paramAnonymous2String);
              GMTrace.o(16842177380352L, 125484);
            }
          });
          GMTrace.o(16833587445760L, 125420);
        }
      });
      this.vRW.setEnabled(false);
      if ((bg.nm(this.gLy)) || (bg.nm(this.countryCode)))
      {
        localObject = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
        w.i("MicroMsg.RegByMobileRegAIOUI", "tm.getSimCountryIso()" + (String)localObject);
        if (!bg.nm((String)localObject)) {
          break label1064;
        }
        w.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
      }
      label729:
      if ((bg.nm(this.gLy)) || (bg.nm(this.countryCode)))
      {
        this.gLy = getString(R.l.dlZ);
        this.countryCode = an.Sb(getString(R.l.dlY));
      }
      bYF();
      if ((this.vRP == null) || (this.vRP.equals(""))) {
        break label1112;
      }
      this.vRN.setText(this.vRP);
    }
    for (;;)
    {
      this.vRL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16805535940608L, 125211);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("country_name", RegByMobileRegAIOUI.i(RegByMobileRegAIOUI.this));
          paramAnonymousView.putExtra("couttry_code", RegByMobileRegAIOUI.d(RegByMobileRegAIOUI.this));
          com.tencent.mm.plugin.c.a.hnH.b(paramAnonymousView, RegByMobileRegAIOUI.this);
          GMTrace.o(16805535940608L, 125211);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(16820568326144L, 125323);
          RegByMobileRegAIOUI.this.aLo();
          RegByMobileRegAIOUI.j(RegByMobileRegAIOUI.this);
          RegByMobileRegAIOUI.this.finish();
          GMTrace.o(16820568326144L, 125323);
          return true;
        }
      });
      this.hqG.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16824057987072L, 125349);
          com.tencent.mm.plugin.c.a.hnI.d(RegByMobileRegAIOUI.this);
          GMTrace.o(16824057987072L, 125349);
        }
      });
      at.xB().a(new af.a()
      {
        Bitmap bitmap;
        String eCQ;
        
        public final boolean Dj()
        {
          GMTrace.i(16826876559360L, 125370);
          this.eCQ = com.tencent.mm.modelsimple.c.bi(RegByMobileRegAIOUI.this);
          this.bitmap = com.tencent.mm.modelsimple.c.bj(RegByMobileRegAIOUI.this);
          if ((this.bitmap != null) && (!this.bitmap.isRecycled())) {}
          try
          {
            com.tencent.mm.sdk.platformtools.d.a(this.bitmap, 100, Bitmap.CompressFormat.PNG, com.tencent.mm.compatible.util.e.fSg + "temp.avatar", false);
            GMTrace.o(16826876559360L, 125370);
            return true;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("MicroMsg.RegByMobileRegAIOUI", "save avatar fail." + localException.getMessage());
              w.printErrStackTrace("MicroMsg.RegByMobileRegAIOUI", localException, "", new Object[0]);
            }
          }
        }
        
        public final boolean Dk()
        {
          GMTrace.i(16826742341632L, 125369);
          if ((!bg.nm(this.eCQ)) && (bg.nm(RegByMobileRegAIOUI.h(RegByMobileRegAIOUI.this).getText().trim()))) {
            RegByMobileRegAIOUI.h(RegByMobileRegAIOUI.this).setText(this.eCQ);
          }
          if (!f.ty())
          {
            w.e("MicroMsg.RegByMobileRegAIOUI", "SDcard is not available");
            GMTrace.o(16826742341632L, 125369);
            return false;
          }
          if ((this.bitmap != null) && (!this.bitmap.isRecycled()) && (!RegByMobileRegAIOUI.k(RegByMobileRegAIOUI.this)))
          {
            RegByMobileRegAIOUI.l(RegByMobileRegAIOUI.this).setImageBitmap(this.bitmap);
            RegByMobileRegAIOUI.m(RegByMobileRegAIOUI.this).setVisibility(8);
            RegByMobileRegAIOUI.n(RegByMobileRegAIOUI.this);
          }
          GMTrace.o(16826742341632L, 125369);
          return true;
        }
        
        public final String toString()
        {
          GMTrace.i(16827010777088L, 125371);
          String str = super.toString() + "|initView2";
          GMTrace.o(16827010777088L, 125371);
          return str;
        }
      });
      GMTrace.o(2701265993728L, 20126);
      return;
      str1 = getString(R.l.dGw);
      str2 = getString(R.l.dGs);
      str3 = getString(R.l.cRI);
      localSpannable = Spannable.Factory.getInstance().newSpannable((String)localObject + "  " + str1 + str3 + str2);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2754147778560L, 20520);
          bg.E(RegByMobileRegAIOUI.this.vKB.vKW, RegByMobileRegAIOUI.this.getString(R.l.efC));
          GMTrace.o(2754147778560L, 20520);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(2754281996288L, 20521);
          paramAnonymousTextPaint.setColor(RegByMobileRegAIOUI.this.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(true);
          GMTrace.o(2754281996288L, 20521);
        }
      }, ((String)localObject).length() + "  ".length(), ((String)localObject).length() + "  ".length() + str1.length(), 33);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2733478248448L, 20366);
          bg.E(RegByMobileRegAIOUI.this.vKB.vKW, RegByMobileRegAIOUI.this.getString(R.l.dGv, new Object[] { v.bPK(), v.bPJ() }));
          GMTrace.o(2733478248448L, 20366);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(2733612466176L, 20367);
          paramAnonymousTextPaint.setColor(RegByMobileRegAIOUI.this.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(true);
          GMTrace.o(2733612466176L, 20367);
        }
      }, ((String)localObject).length() + str1.length() + "  ".length() + str3.length(), ((String)localObject).length() + str1.length() + "  ".length() + str3.length() + str2.length(), 33);
      this.vRU.setText(localSpannable);
      break;
      label1064:
      localObject = com.tencent.mm.ap.b.h(this, (String)localObject, getString(R.l.bsf));
      if (localObject == null)
      {
        w.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
        break label729;
      }
      this.gLy = ((b.a)localObject).gLy;
      this.countryCode = ((b.a)localObject).gLx;
      break label729;
      label1112:
      at.xB().a(new af.a()
      {
        String jPF;
        
        public final boolean Dj()
        {
          GMTrace.i(16848754049024L, 125533);
          this.jPF = com.tencent.mm.modelsimple.c.y(RegByMobileRegAIOUI.this, RegByMobileRegAIOUI.d(RegByMobileRegAIOUI.this));
          GMTrace.o(16848754049024L, 125533);
          return true;
        }
        
        public final boolean Dk()
        {
          GMTrace.i(16848619831296L, 125532);
          EditText localEditText;
          if (bg.nm(RegByMobileRegAIOUI.c(RegByMobileRegAIOUI.this).getText().trim()))
          {
            localEditText = RegByMobileRegAIOUI.c(RegByMobileRegAIOUI.this);
            if (!bg.nm(this.jPF)) {
              break label76;
            }
          }
          label76:
          for (String str = "";; str = this.jPF)
          {
            localEditText.setText(str);
            GMTrace.o(16848619831296L, 125532);
            return true;
          }
        }
        
        public final String toString()
        {
          GMTrace.i(16848888266752L, 125534);
          String str = super.toString() + "|initView1";
          GMTrace.o(16848888266752L, 125534);
          return str;
        }
      });
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2701802864640L, 20130);
    w.i("MicroMsg.RegByMobileRegAIOUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.vQR != null)
    {
      this.vQR.dismiss();
      this.vQR = null;
    }
    if (paramInt2 == -75)
    {
      h.h(this, R.l.cRG, R.l.dQH);
      GMTrace.o(2701802864640L, 20130);
      return;
    }
    Object localObject1;
    Object localObject2;
    if (paramk.getType() == 145)
    {
      int i = ((s)paramk).CD();
      if (i == 12)
      {
        if ((paramInt2 == -41) || (paramInt2 == -59))
        {
          paramString = com.tencent.mm.h.a.dH(paramString);
          if (paramString != null)
          {
            paramString.a(this, null, null);
            GMTrace.o(2701802864640L, 20130);
            return;
          }
          h.h(this, R.l.dRp, R.l.dRq);
          GMTrace.o(2701802864640L, 20130);
          return;
        }
        this.nLL = an.Sa(this.nLL);
        this.vRS = (this.vRT + this.nLL);
        this.vQG = ((s)paramk).HL();
        if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
        {
          paramk = ((s)paramk).Hz();
          if (!bg.nm(paramk)) {
            this.nLL = paramk.trim();
          }
          com.tencent.mm.plugin.c.b.ny("RE200_100");
          com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",RE200_200," + at.eK("RE200_200") + ",1");
          paramString = com.tencent.mm.h.a.dH(paramString);
          if (paramString != null)
          {
            paramString.a(this, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(16820970979328L, 125326);
                RegByMobileRegAIOUI.o(RegByMobileRegAIOUI.this);
                com.tencent.mm.plugin.c.b.nz("RE200_250");
                RegByMobileRegAIOUI.p(RegByMobileRegAIOUI.this);
                GMTrace.o(16820970979328L, 125326);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(2752805601280L, 20510);
                com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + RegByMobileRegAIOUI.this.getClass().getName() + ",RE200_200," + at.eK("RE200_200") + ",2");
                com.tencent.mm.plugin.c.b.nz("RE200_100");
                GMTrace.o(2752805601280L, 20510);
              }
            });
            GMTrace.o(2701802864640L, 20130);
            return;
          }
          bYG();
          com.tencent.mm.plugin.c.b.nz("RE200_250");
          this.vSf = false;
          GMTrace.o(2701802864640L, 20130);
          return;
        }
        if (paramInt2 == 65181)
        {
          com.tencent.mm.platformtools.m.b(this, paramString, 30846);
          GMTrace.o(2701802864640L, 20130);
          return;
        }
        if (paramInt2 == -34)
        {
          h.b(this, getString(R.l.cZq), "", true);
          GMTrace.o(2701802864640L, 20130);
          return;
        }
        if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString))
        {
          GMTrace.o(2701802864640L, 20130);
          return;
        }
        Toast.makeText(this, getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      if (i == 14)
      {
        if ((paramInt2 != 0) && (paramString != null)) {
          break label986;
        }
        if (((s)paramk).HA() != 1) {
          break label740;
        }
        localObject1 = this.vRT + this.nLL;
        localObject2 = ((s)paramk).HC();
        String str = ((s)paramk).HB();
        Intent localIntent = new Intent(this, RegByMobileSendSmsUI.class);
        localIntent.putExtra("regsession_id", this.vQG);
        localIntent.putExtra("from_mobile", (String)localObject1);
        localIntent.putExtra("to_mobile", (String)localObject2);
        localIntent.putExtra("verify_code", str);
        localIntent.putExtra("kintent_nickname", this.vSa.getText().toString());
        localIntent.putExtra("kintent_password", this.vRX.getText().toString());
        localIntent.putExtra("kintent_hasavatar", this.vRY);
        startActivity(localIntent);
      }
    }
    if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2701802864640L, 20130);
      return;
      label740:
      this.vSn = ((s)paramk).HE();
      this.vSo = ((s)paramk).HF();
      this.vSp = ((s)paramk).HG();
      this.vSq = ((s)paramk).HI();
      if (this.vSk == null)
      {
        this.vSk = new j(this, this.vSm);
        this.vSk.bYX();
      }
      if (this.vSi == null)
      {
        localObject1 = ((LayoutInflater)getSystemService("layout_inflater")).inflate(R.i.cEI, null);
        this.vSh = ((ProgressBar)((View)localObject1).findViewById(R.h.bUw));
        localObject2 = (TextView)((View)localObject1).findViewById(R.h.cjX);
        this.vSi = h.a(this, false, getString(R.l.cZH), (View)localObject1, "", "", null, null);
        this.vRT = an.Sc(this.countryCode);
        ((TextView)localObject2).setText(this.vRT + " " + this.vRN.getText().toString());
      }
      for (;;)
      {
        this.progress = 0;
        this.vSh.setIndeterminate(false);
        this.vSj.sendEmptyMessage(10);
        break;
        this.vSi.show();
      }
      label986:
      if (paramInt2 == -41)
      {
        h.h(this, R.l.dRp, R.l.dRq);
        GMTrace.o(2701802864640L, 20130);
        return;
      }
      if (paramInt2 == -34)
      {
        h.b(this, getString(R.l.cZq), "", true);
        GMTrace.o(2701802864640L, 20130);
        return;
      }
      if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString))
      {
        GMTrace.o(2701802864640L, 20130);
        return;
      }
      Toast.makeText(this, getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(2701802864640L, 20130);
      return;
    }
    if (paramk.getType() == 701)
    {
      paramString = com.tencent.mm.h.a.dH(paramString);
      if ((paramString != null) && (paramString.a(this, null, null)))
      {
        GMTrace.o(2701802864640L, 20130);
        return;
      }
    }
    GMTrace.o(2701802864640L, 20130);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2700729122816L, 20122);
    int i = R.i.cEK;
    GMTrace.o(2700729122816L, 20122);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2701668646912L, 20129);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 30846)
    {
      if ((paramInt2 == -1) && (bYH()))
      {
        bYG();
        com.tencent.mm.plugin.c.b.nz("RE200_250");
        this.vSf = false;
        GMTrace.o(2701668646912L, 20129);
      }
    }
    else if (paramInt1 == 30847)
    {
      if (paramInt2 != -1) {
        break label175;
      }
      this.vSg = false;
      Vp(this.vRT + this.nLL);
      GMTrace.o(2701668646912L, 20129);
    }
    switch (paramInt2)
    {
    default: 
      paramIntent = com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramIntent);
      if (paramIntent != null)
      {
        this.hqG.setImageBitmap(paramIntent);
        this.vRY = true;
        this.vRZ.setVisibility(8);
      }
      label175:
      GMTrace.o(2701668646912L, 20129);
      return;
    }
    this.gLy = bg.aq(paramIntent.getStringExtra("country_name"), "");
    this.countryCode = bg.aq(paramIntent.getStringExtra("couttry_code"), "");
    bYF();
    GMTrace.o(2701668646912L, 20129);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2700863340544L, 20123);
    super.onCreate(paramBundle);
    this.gLy = bg.aq(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bg.aq(getIntent().getStringExtra("couttry_code"), "");
    this.vRP = bg.aq(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.ibA = getIntent().getIntExtra("login_type", 0);
    this.osl = com.tencent.mm.plugin.c.b.Qu();
    bj.BC();
    com.tencent.mm.plugin.c.b.hI(20);
    MP();
    GMTrace.o(2700863340544L, 20123);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2701937082368L, 20131);
    if (this.vSk != null)
    {
      this.vSk.bYY();
      this.vSk = null;
    }
    if (this.vSi != null) {
      this.vSi.dismiss();
    }
    super.onDestroy();
    GMTrace.o(2701937082368L, 20131);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2701400211456L, 20127);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bci();
      GMTrace.o(2701400211456L, 20127);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2701400211456L, 20127);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2701131776000L, 20125);
    super.onPause();
    if (this.vQR != null) {
      this.vQR.dismiss();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.vPG);
    at.wS().b(701, this);
    at.wS().b(145, this);
    at.wS().b(132, this);
    com.tencent.mm.plugin.c.b.ny("RE200_100");
    GMTrace.o(2701131776000L, 20125);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(2702473953280L, 20135);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.RegByMobileRegAIOUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        GMTrace.o(2702473953280L, 20135);
        return;
      }
    }
    w.i("MicroMsg.RegByMobileRegAIOUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(2702473953280L, 20135);
      return;
      if ((paramArrayOfInt[0] == 0) && (this.vSk != null)) {
        this.vSk.bYZ();
      }
    }
  }
  
  public void onResume()
  {
    GMTrace.i(2700997558272L, 20124);
    com.tencent.mm.sdk.b.a.vgX.b(this.vPG);
    super.onResume();
    at.wS().a(701, this);
    at.wS().a(145, this);
    at.wS().a(132, this);
    com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",RE200_100," + at.eK("RE200_100") + ",1");
    aLs();
    this.vSb = 0;
    GMTrace.o(2700997558272L, 20124);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\RegByMobileRegAIOUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */