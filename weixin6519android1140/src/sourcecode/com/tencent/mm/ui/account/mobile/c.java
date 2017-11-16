package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.account.LoginUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;

public final class c
  implements e, MobileInputUI.b
{
  private SecurityImage vMf;
  private a vSw;
  private MobileInputUI vVw;
  
  public c()
  {
    GMTrace.i(2605031882752L, 19409);
    this.vMf = null;
    this.vSw = null;
    GMTrace.o(2605031882752L, 19409);
  }
  
  public final void Bv(int paramInt)
  {
    GMTrace.i(2605702971392L, 19414);
    switch (3.vVy[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(2605702971392L, 19414);
      return;
      this.vVw.vVO = an.Sc(this.vVw.countryCode);
      this.vVw.nLL = this.vVw.vVI.getText().toString();
      Object localObject = an.Sa(this.vVw.vVO + this.vVw.nLL);
      MobileInputUI localMobileInputUI1 = this.vVw;
      MobileInputUI localMobileInputUI2 = this.vVw;
      this.vVw.getString(R.l.cUG);
      localMobileInputUI1.vQR = h.a(localMobileInputUI2, this.vVw.getString(R.l.dRi), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2588791537664L, 19288);
          GMTrace.o(2588791537664L, 19288);
        }
      });
      localObject = new s((String)localObject, 13, "", 0, "");
      at.wS().a((k)localObject, 0);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2605837189120L, 19415);
    w.i("MicroMsg.MobileInputLoginLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.vVw.vQR != null)
    {
      this.vVw.vQR.dismiss();
      this.vVw.vQR = null;
    }
    if ((paramk.getType() == 701) && (this.vSw != null))
    {
      this.vSw.vRq = this.vVw.vRq;
      this.vSw.a(this.vVw, paramInt1, paramInt2, paramString, paramk);
      GMTrace.o(2605837189120L, 19415);
      return;
    }
    if ((paramk.getType() == 145) && (((s)paramk).CD() == 13))
    {
      if (paramInt2 == -41)
      {
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this.vVw, null, null);
          GMTrace.o(2605837189120L, 19415);
          return;
        }
        h.h(this.vVw, R.l.dRp, R.l.dRq);
        GMTrace.o(2605837189120L, 19415);
        return;
      }
      if (paramInt2 == -1)
      {
        Toast.makeText(this.vVw, this.vVw.getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        GMTrace.o(2605837189120L, 19415);
        return;
      }
      if (paramInt2 == -34)
      {
        h.b(this.vVw, this.vVw.getString(R.l.cZq), "", true);
        GMTrace.o(2605837189120L, 19415);
        return;
      }
      this.vVw.aLo();
      paramString = new Intent(this.vVw, MobileInputUI.class);
      paramString.putExtra("mobile_input_purpose", -1);
      paramString.putExtra("mobile_auth_type", 7);
      paramString.putExtra("input_country_code", this.vVw.countryCode);
      paramString.putExtra("input_mobile_number", this.vVw.nLL);
      this.vVw.startActivity(paramString);
      GMTrace.o(2605837189120L, 19415);
      return;
    }
    GMTrace.o(2605837189120L, 19415);
  }
  
  public final void a(final MobileInputUI paramMobileInputUI)
  {
    GMTrace.i(2605166100480L, 19410);
    this.vVw = paramMobileInputUI;
    paramMobileInputUI.vRL.setVisibility(0);
    paramMobileInputUI.vVH.setVisibility(0);
    paramMobileInputUI.vVI.requestFocus();
    paramMobileInputUI.vRW.setText(R.l.cTI);
    paramMobileInputUI.vRW.setVisibility(0);
    paramMobileInputUI.vVM.setVisibility(0);
    paramMobileInputUI.vVN.setText(R.l.dGV);
    paramMobileInputUI.vVN.setVisibility(0);
    paramMobileInputUI.vVN.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16810233561088L, 125246);
        paramMobileInputUI.mGp[0] = 1;
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(paramMobileInputUI, LoginUI.class);
        paramMobileInputUI.startActivity(paramAnonymousView);
        paramMobileInputUI.finish();
        GMTrace.o(16810233561088L, 125246);
      }
    });
    GMTrace.o(2605166100480L, 19410);
  }
  
  public final void start()
  {
    GMTrace.i(2605434535936L, 19412);
    at.wS().a(145, this);
    b.b(true, at.wN() + "," + getClass().getName() + ",L200_100," + at.eK("L200_100") + ",1");
    b.ny("L200_100");
    GMTrace.o(2605434535936L, 19412);
  }
  
  public final void stop()
  {
    GMTrace.i(2605568753664L, 19413);
    at.wS().b(145, this);
    b.b(false, at.wN() + "," + getClass().getName() + ",L200_100," + at.eK("L200_100") + ",2");
    GMTrace.o(2605568753664L, 19413);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */