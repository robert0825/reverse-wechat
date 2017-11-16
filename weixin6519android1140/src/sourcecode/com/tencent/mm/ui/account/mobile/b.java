package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.h.a;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;

public final class b
  implements e, MobileInputUI.b
{
  private String vRR;
  private String vRS;
  private int vSb;
  private MobileInputUI vVw;
  
  public b()
  {
    GMTrace.i(2597381472256L, 19352);
    this.vSb = 0;
    GMTrace.o(2597381472256L, 19352);
  }
  
  public final void Bv(int paramInt)
  {
    GMTrace.i(2597918343168L, 19356);
    switch (5.vVy[(paramInt - 1)])
    {
    default: 
      GMTrace.o(2597918343168L, 19356);
      return;
    }
    this.vVw.vVO = an.Sc(this.vVw.countryCode);
    this.vVw.nLL = this.vVw.vVH.getText().toString();
    Object localObject1 = this.vVw.vVO + this.vVw.nLL;
    if (this.vVw.vQR != null)
    {
      w.d("MicroMsg.MobileInputForgetPwdLogic", "already checking ");
      GMTrace.o(2597918343168L, 19356);
      return;
    }
    Object localObject2 = this.vVw;
    MobileInputUI localMobileInputUI = this.vVw;
    this.vVw.getString(R.l.cUG);
    ((MobileInputUI)localObject2).vQR = h.a(localMobileInputUI, this.vVw.getString(R.l.dRi), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2621003792384L, 19528);
        GMTrace.o(2621003792384L, 19528);
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
    GMTrace.i(2598052560896L, 19357);
    w.i("MicroMsg.MobileInputForgetPwdLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.vVw.vQR != null)
    {
      this.vVw.vQR.dismiss();
      this.vVw.vQR = null;
    }
    if (paramInt2 == -75)
    {
      h.h(this.vVw, R.l.cRG, R.l.dQH);
      GMTrace.o(2598052560896L, 19357);
      return;
    }
    if ((paramInt2 == -41) || (paramInt2 == -59))
    {
      paramString = a.dH(paramString);
      if (paramString != null)
      {
        paramString.a(this.vVw, null, null);
        GMTrace.o(2598052560896L, 19357);
        return;
      }
      h.h(this.vVw, R.l.dRp, R.l.dRq);
      GMTrace.o(2598052560896L, 19357);
      return;
    }
    if (paramk.getType() == 145)
    {
      int i = ((s)paramk).CD();
      if (i == 12)
      {
        if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
        {
          paramk = ((s)paramk).Hz();
          if (!bg.nm(paramk)) {
            this.vVw.nLL = paramk.trim();
          }
          this.vVw.nLL = an.Sa(this.vVw.nLL);
          this.vRS = (this.vVw.vVO + this.vVw.nLL);
          com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",F200_200," + at.eK("F200_200") + ",1");
          paramString = a.dH(paramString);
          if (paramString != null)
          {
            paramString.a(this.vVw, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(2630399033344L, 19598);
                b.this.bZc();
                com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",F200_200," + at.eK("F200_200") + ",2");
                GMTrace.o(2630399033344L, 19598);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(2595770859520L, 19340);
                com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",F200_200," + at.eK("F200_200") + ",2");
                GMTrace.o(2595770859520L, 19340);
              }
            });
            GMTrace.o(2598052560896L, 19357);
            return;
          }
          bZc();
          com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",F200_200," + at.eK("F200_200") + ",2");
          GMTrace.o(2598052560896L, 19357);
          return;
        }
        if (paramInt2 == -34)
        {
          h.b(this.vVw, this.vVw.getString(R.l.cZq), "", true);
          GMTrace.o(2598052560896L, 19357);
          return;
        }
        Toast.makeText(this.vVw, this.vVw.getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      if ((i == 8) && (paramInt2 == 0))
      {
        paramString = new Intent();
        paramString.putExtra("bindmcontact_mobile", this.vVw.vVO + " " + this.vVw.vVH.getText().toString());
        paramString.putExtra("bindmcontact_shortmobile", this.vVw.nLL);
        paramString.putExtra("country_name", this.vVw.gLy);
        paramString.putExtra("couttry_code", this.vVw.countryCode);
        paramString.putExtra("mobileverify_countdownsec", ((s)paramk).HE());
        paramString.putExtra("mobileverify_countdownstyle", ((s)paramk).HF());
        paramString.putExtra("mobileverify_fb", ((s)paramk).HG());
        paramString.putExtra("mobileverify_reg_qq", ((s)paramk).HI());
        paramString.putExtra("mobile_verify_purpose", 3);
        paramString.setClass(this.vVw, MobileVerifyUI.class);
        this.vVw.startActivity(paramString);
      }
    }
    GMTrace.o(2598052560896L, 19357);
  }
  
  public final void a(MobileInputUI paramMobileInputUI)
  {
    GMTrace.i(2597515689984L, 19353);
    this.vVw = paramMobileInputUI;
    paramMobileInputUI.vVI.requestFocus();
    paramMobileInputUI.aLs();
    String str2 = paramMobileInputUI.getString(R.l.dRM);
    String str1 = str2;
    if (d.tJF) {
      str1 = str2 + paramMobileInputUI.getString(R.l.cRD);
    }
    paramMobileInputUI.sq(str1);
    paramMobileInputUI.vRL.setVisibility(0);
    paramMobileInputUI.vVH.setVisibility(0);
    paramMobileInputUI.vVI.requestFocus();
    paramMobileInputUI.vRW.setText(R.l.cTI);
    paramMobileInputUI.vRW.setVisibility(0);
    GMTrace.o(2597515689984L, 19353);
  }
  
  public final void bZc()
  {
    GMTrace.i(2598186778624L, 19358);
    Object localObject = this.vVw;
    MobileInputUI localMobileInputUI = this.vVw;
    this.vVw.getString(R.l.cUG);
    ((MobileInputUI)localObject).vQR = h.a(localMobileInputUI, this.vVw.getString(R.l.dRi), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2596844601344L, 19348);
        GMTrace.o(2596844601344L, 19348);
      }
    });
    localObject = new s(this.vVw.vVO + this.vVw.nLL, 8, "", 0, "");
    at.wS().a((k)localObject, 0);
    GMTrace.o(2598186778624L, 19358);
  }
  
  public final void start()
  {
    GMTrace.i(2597649907712L, 19354);
    at.wS().a(145, this);
    com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",F200_100," + at.eK("F200_100") + ",1");
    com.tencent.mm.plugin.c.b.ny("F200_100");
    this.vSb = 0;
    GMTrace.o(2597649907712L, 19354);
  }
  
  public final void stop()
  {
    GMTrace.i(2597784125440L, 19355);
    at.wS().b(145, this);
    com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",F200_100," + at.eK("F200_100") + ",2");
    GMTrace.o(2597784125440L, 19355);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */