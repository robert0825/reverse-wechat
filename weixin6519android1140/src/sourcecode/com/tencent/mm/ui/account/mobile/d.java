package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.platformtools.m;
import com.tencent.mm.plugin.accountsync.a.c;
import com.tencent.mm.plugin.accountsync.a.c.a;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.RegByMobileSendSmsUI;
import com.tencent.mm.ui.account.ShowAgreementsUI;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;

public final class d
  implements e, MobileInputUI.b
{
  private String vQG;
  private String vRR;
  private String vRS;
  private int vSb;
  int vVB;
  private MobileInputUI vVw;
  
  public d()
  {
    GMTrace.i(2584228134912L, 19254);
    this.vSb = 0;
    this.vVB = 1;
    GMTrace.o(2584228134912L, 19254);
  }
  
  public final void Bv(int paramInt)
  {
    GMTrace.i(2584765005824L, 19258);
    switch (2.vVy[(paramInt - 1)])
    {
    default: 
      GMTrace.o(2584765005824L, 19258);
      return;
    }
    this.vVw.aLo();
    Object localObject1;
    switch (this.vVB)
    {
    default: 
      this.vVw.vVO = an.Sc(this.vVw.countryCode);
      this.vVw.nLL = this.vVw.vVH.getText().toString();
      localObject1 = this.vVw.vVO + this.vVw.nLL;
      if (this.vVw.vQR != null) {
        w.d("MicroMsg.MobileInputRegLogic", "already checking ");
      }
      break;
    case 2: 
      for (;;)
      {
        this.vVB = 0;
        break;
        bZc();
      }
    case 1: 
      localObject1 = new Intent(this.vVw, ShowAgreementsUI.class);
      ((Intent)localObject1).putExtra("agreement_type", 0);
      if (an.Sc(this.vVw.countryCode).equals("+86")) {
        ((Intent)localObject1).putExtra("country_code", "CN");
      }
      for (;;)
      {
        this.vVw.startActivityForResult((Intent)localObject1, 32047);
        break;
        ((Intent)localObject1).putExtra("country_code", "US");
      }
    }
    Object localObject2 = this.vVw;
    MobileInputUI localMobileInputUI = this.vVw;
    this.vVw.getString(R.l.cUG);
    ((MobileInputUI)localObject2).vQR = h.a(localMobileInputUI, this.vVw.getString(R.l.dRi), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2626909372416L, 19572);
        GMTrace.o(2626909372416L, 19572);
      }
    });
    localObject2 = this.vVw.vVH.getText().toString();
    if ((this.vRR != null) && (this.vRS != null) && (!((String)localObject2).equals(this.vRR)) && (((String)localObject2).equals(this.vRS))) {
      paramInt = 1;
    }
    for (;;)
    {
      localObject1 = new s((String)localObject1, 12, "", 0, "");
      ((s)localObject1).ge(this.vSb);
      ((s)localObject1).gf(paramInt);
      at.wS().a((k)localObject1, 0);
      this.vRR = this.vVw.vVH.getText().toString();
      this.vSb += 1;
      break;
      if ((this.vRR != null) && (this.vRS != null) && (!this.vRS.equals(this.vRR)) && (!((String)localObject2).equals(this.vRS))) {
        paramInt = 2;
      } else {
        paramInt = 0;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2584899223552L, 19259);
    w.i("MicroMsg.MobileInputRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.vVw.vQR != null)
    {
      this.vVw.vQR.dismiss();
      this.vVw.vQR = null;
    }
    if (paramInt2 == -75)
    {
      h.h(this.vVw, R.l.cRG, R.l.dQH);
      GMTrace.o(2584899223552L, 19259);
      return;
    }
    if (paramk.getType() == 145)
    {
      if ((paramInt2 == -41) || (paramInt2 == -59))
      {
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this.vVw, null, null);
          GMTrace.o(2584899223552L, 19259);
          return;
        }
        h.h(this.vVw, R.l.dRp, R.l.dRq);
        GMTrace.o(2584899223552L, 19259);
        return;
      }
      int i = ((s)paramk).CD();
      String str;
      if (i == 12)
      {
        if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
        {
          str = ((s)paramk).Hz();
          if (!bg.nm(str)) {
            this.vVw.nLL = str.trim();
          }
          this.vVw.nLL = an.Sa(this.vVw.nLL);
          this.vRS = (this.vVw.vVO + this.vVw.nLL);
          this.vQG = ((s)paramk).HL();
          b.b(true, at.wN() + "," + getClass().getName() + ",R200_200," + at.eK("R200_200") + ",1");
          paramString = com.tencent.mm.h.a.dH(paramString);
          if (paramString != null)
          {
            paramString.a(this.vVw, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(2630667468800L, 19600);
                d.this.bZc();
                GMTrace.o(2630667468800L, 19600);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(2608387325952L, 19434);
                b.b(true, at.wN() + "," + getClass().getName() + ",R200_200," + at.eK("R200_200") + ",2");
                GMTrace.o(2608387325952L, 19434);
              }
            });
            GMTrace.o(2584899223552L, 19259);
            return;
          }
          bZc();
          b.b(true, at.wN() + "," + getClass().getName() + ",R200_200," + at.eK("R200_200") + ",2");
          GMTrace.o(2584899223552L, 19259);
          return;
        }
        if (paramInt2 == 65181)
        {
          m.b(this.vVw, paramString, 32046);
          GMTrace.o(2584899223552L, 19259);
          return;
        }
        if (paramInt2 == -34)
        {
          h.b(this.vVw, this.vVw.getString(R.l.cZq), "", true);
          GMTrace.o(2584899223552L, 19259);
          return;
        }
        Toast.makeText(this.vVw, this.vVw.getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      if (i == 14)
      {
        if ((paramInt2 == 0) || (paramString == null))
        {
          if (((s)paramk).HA() == 1)
          {
            paramString = this.vVw.vVO + this.vVw.nLL;
            str = ((s)paramk).HC();
            paramk = ((s)paramk).HB();
            Intent localIntent = new Intent(this.vVw, RegByMobileSendSmsUI.class);
            localIntent.putExtra("from_mobile", paramString);
            localIntent.putExtra("to_mobile", str);
            localIntent.putExtra("verify_code", paramk);
            localIntent.putExtra("regsession_id", this.vQG);
            this.vVw.startActivity(localIntent);
            GMTrace.o(2584899223552L, 19259);
            return;
          }
          b.nz("R200_300");
          paramString = new Intent();
          paramString.putExtra("bindmcontact_mobile", this.vVw.vVO + " " + this.vVw.vVH.getText().toString());
          paramString.putExtra("bindmcontact_shortmobile", this.vVw.nLL);
          paramString.putExtra("country_name", this.vVw.gLy);
          paramString.putExtra("couttry_code", this.vVw.countryCode);
          paramString.putExtra("mobileverify_countdownsec", ((s)paramk).HE());
          paramString.putExtra("mobileverify_countdownstyle", ((s)paramk).HF());
          paramString.putExtra("mobileverify_fb", ((s)paramk).HG());
          paramString.putExtra("mobileverify_reg_qq", ((s)paramk).HI());
          paramString.putExtra("mobile_verify_purpose", 2);
          paramString.setClass(this.vVw, MobileVerifyUI.class);
          this.vVw.startActivity(paramString);
          c.hJ(c.a.hth);
          GMTrace.o(2584899223552L, 19259);
          return;
        }
        if (paramInt2 == -34)
        {
          h.b(this.vVw, this.vVw.getString(R.l.cZq), "", true);
          GMTrace.o(2584899223552L, 19259);
          return;
        }
        if (com.tencent.mm.plugin.c.a.hnI.a(this.vVw, paramInt1, paramInt2, paramString))
        {
          GMTrace.o(2584899223552L, 19259);
          return;
        }
        Toast.makeText(this.vVw, this.vVw.getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        GMTrace.o(2584899223552L, 19259);
        return;
      }
    }
    GMTrace.o(2584899223552L, 19259);
  }
  
  public final void a(final MobileInputUI paramMobileInputUI)
  {
    GMTrace.i(2584362352640L, 19255);
    this.vVw = paramMobileInputUI;
    String str2 = paramMobileInputUI.getString(R.l.dRL);
    String str1 = str2;
    if (com.tencent.mm.protocal.d.tJF) {
      str1 = str2 + paramMobileInputUI.getString(R.l.cRD);
    }
    paramMobileInputUI.sq(str1);
    paramMobileInputUI.lg(false);
    paramMobileInputUI.vVL.setVisibility(0);
    paramMobileInputUI.vVL.setVisibility(0);
    paramMobileInputUI.vRL.setVisibility(0);
    paramMobileInputUI.vVH.setVisibility(0);
    paramMobileInputUI.vVI.requestFocus();
    paramMobileInputUI.vVK.setVisibility(0);
    paramMobileInputUI.vRW.setVisibility(0);
    paramMobileInputUI.vRW.setText(R.l.dHm);
    if (paramMobileInputUI.vRV != null) {
      paramMobileInputUI.vRV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2595233988608L, 19336);
          bg.E(paramMobileInputUI, paramMobileInputUI.getString(R.l.efA));
          GMTrace.o(2595233988608L, 19336);
        }
      });
    }
    str1 = paramMobileInputUI.getString(R.l.dGp);
    String str3;
    String str4;
    Spannable localSpannable;
    if (v.bPH())
    {
      str2 = paramMobileInputUI.getString(R.l.dGq);
      str3 = paramMobileInputUI.getString(R.l.dOA);
      str4 = paramMobileInputUI.getString(R.l.cRI);
      localSpannable = Spannable.Factory.getInstance().newSpannable(str1 + "  " + str2 + str4 + str3);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2580470038528L, 19226);
          bg.E(paramMobileInputUI.vKB.vKW, paramMobileInputUI.getString(R.l.efA));
          GMTrace.o(2580470038528L, 19226);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(2580604256256L, 19227);
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(true);
          GMTrace.o(2580604256256L, 19227);
        }
      }, str1.length() + "  ".length(), str1.length() + str2.length() + "  ".length(), 33);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2602213310464L, 19388);
          bg.E(paramMobileInputUI, ab.getResources().getString(R.l.dGv, new Object[] { v.eq(paramMobileInputUI), v.bPJ() }));
          GMTrace.o(2602213310464L, 19388);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(2602347528192L, 19389);
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(true);
          GMTrace.o(2602347528192L, 19389);
        }
      }, str1.length() + "  ".length() + str2.length() + str4.length(), str1.length() + str2.length() + "  ".length() + str4.length() + str3.length(), 33);
      paramMobileInputUI.vRU.setText(localSpannable);
    }
    for (;;)
    {
      paramMobileInputUI.vRU.setMovementMethod(LinkMovementMethod.getInstance());
      GMTrace.o(2584362352640L, 19255);
      return;
      str2 = paramMobileInputUI.getString(R.l.dGw);
      str3 = paramMobileInputUI.getString(R.l.dGs);
      str4 = paramMobileInputUI.getString(R.l.cRI);
      localSpannable = Spannable.Factory.getInstance().newSpannable(str1 + "  " + str2 + str4 + str3);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2604763447296L, 19407);
          bg.E(paramMobileInputUI.vKB.vKW, paramMobileInputUI.getString(R.l.efC));
          GMTrace.o(2604763447296L, 19407);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(2604897665024L, 19408);
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(true);
          GMTrace.o(2604897665024L, 19408);
        }
      }, str1.length() + "  ".length(), str1.length() + "  ".length() + str2.length(), 33);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2587852013568L, 19281);
          bg.E(paramMobileInputUI, ab.getResources().getString(R.l.dGv, new Object[] { v.eq(paramMobileInputUI), v.bPJ() }));
          GMTrace.o(2587852013568L, 19281);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(2587986231296L, 19282);
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(true);
          GMTrace.o(2587986231296L, 19282);
        }
      }, str1.length() + str2.length() + "  ".length() + str4.length(), str1.length() + str2.length() + "  ".length() + str4.length() + str3.length(), 33);
      paramMobileInputUI.vRU.setText(localSpannable);
    }
  }
  
  public final void bZc()
  {
    GMTrace.i(2585033441280L, 19260);
    Object localObject = this.vVw;
    MobileInputUI localMobileInputUI = this.vVw;
    this.vVw.getString(R.l.cUG);
    ((MobileInputUI)localObject).vQR = h.a(localMobileInputUI, this.vVw.getString(R.l.dRi), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2584093917184L, 19253);
        GMTrace.o(2584093917184L, 19253);
      }
    });
    localObject = new s(this.vVw.vVO + this.vVw.nLL, 14, "", 0, "");
    ((s)localObject).jU(this.vQG);
    at.wS().a((k)localObject, 0);
    GMTrace.o(2585033441280L, 19260);
  }
  
  public final void start()
  {
    GMTrace.i(2584496570368L, 19256);
    at.wS().a(145, this);
    b.b(true, at.wN() + "," + getClass().getName() + ",R200_100," + at.eK("R200_100") + ",1");
    b.ny("R200_100");
    this.vSb = 0;
    GMTrace.o(2584496570368L, 19256);
  }
  
  public final void stop()
  {
    GMTrace.i(2584630788096L, 19257);
    at.wS().b(145, this);
    b.b(false, at.wN() + "," + getClass().getName() + ",R200_100," + at.eK("R200_100") + ",2");
    GMTrace.o(2584630788096L, 19257);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */