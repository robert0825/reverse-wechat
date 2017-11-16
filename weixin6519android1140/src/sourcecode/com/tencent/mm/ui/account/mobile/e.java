package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;
import com.tencent.mm.ui.account.RegSetInfoUI;
import com.tencent.mm.ui.account.ShowAgreementsUI;
import com.tencent.mm.ui.account.f;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;

public final class e
  implements com.tencent.mm.ad.e, MobileInputUI.b
{
  private String eVw;
  public String gUy;
  String lnX;
  private String osh;
  public SecurityImage vMf;
  private int vQE;
  private String vQF;
  private String vQG;
  private String vQH;
  private int vQI;
  private boolean vQz;
  int vVB;
  public MobileInputUI vVw;
  
  public e()
  {
    GMTrace.i(16808488730624L, 125233);
    this.vMf = null;
    this.vQz = true;
    GMTrace.o(16808488730624L, 125233);
  }
  
  private void bZd()
  {
    GMTrace.i(19227629060096L, 143257);
    Intent localIntent = new Intent();
    localIntent.putExtra("regsetinfo_ticket", this.vQH);
    localIntent.putExtra("regsetinfo_user", this.gUy);
    localIntent.putExtra("regsession_id", this.vQG);
    localIntent.putExtra("regsetinfo_ismobile", 1);
    localIntent.putExtra("regsetinfo_NextControl", this.vQI);
    localIntent.setClass(this.vVw, RegSetInfoUI.class);
    b.nz("R200_950_olduser");
    this.vVw.startActivity(localIntent);
    b.nA(at.wN() + "," + getClass().getName() + ",L200_900_phone," + at.eK("L200_900_phone") + ",2");
    GMTrace.o(19227629060096L, 143257);
  }
  
  private boolean q(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(16809696690176L, 125242);
    if (com.tencent.mm.plugin.c.a.hnI.a(this.vVw, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(16809696690176L, 125242);
      return true;
    }
    if (paramInt1 == 4) {}
    switch (paramInt2)
    {
    default: 
      GMTrace.o(16809696690176L, 125242);
      return false;
    case -1: 
      if (at.wS().DN() == 5)
      {
        h.h(this.vVw, R.l.dLj, R.l.dLi);
        GMTrace.o(16809696690176L, 125242);
        return true;
      }
      GMTrace.o(16809696690176L, 125242);
      return false;
    case -4: 
    case -3: 
      h.h(this.vVw, R.l.dqu, R.l.dHa);
      GMTrace.o(16809696690176L, 125242);
      return true;
    case -9: 
      h.h(this.vVw, R.l.dGZ, R.l.dHa);
      GMTrace.o(16809696690176L, 125242);
      return true;
    case -100: 
      at.hold();
      MobileInputUI localMobileInputUI = this.vVw;
      if (TextUtils.isEmpty(at.wy())) {}
      for (paramString = com.tencent.mm.br.a.X(this.vVw, R.l.dHY);; paramString = at.wy())
      {
        h.a(localMobileInputUI, paramString, this.vVw.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(16814796963840L, 125280);
            GMTrace.o(16814796963840L, 125280);
          }
        }, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(16813052133376L, 125267);
            GMTrace.o(16813052133376L, 125267);
          }
        });
        GMTrace.o(16809696690176L, 125242);
        return true;
      }
    case -140: 
      if (!bg.nm(this.eVw)) {
        com.tencent.mm.platformtools.m.j(this.vVw, paramString, this.eVw);
      }
      GMTrace.o(16809696690176L, 125242);
      return true;
    case -34: 
      Toast.makeText(this.vVw, R.l.cZq, 0).show();
      GMTrace.o(16809696690176L, 125242);
      return true;
    case -32: 
      h.a(this.vVw, R.l.cZZ, R.l.bhd, null);
      GMTrace.o(16809696690176L, 125242);
      return true;
    }
    h.a(this.vVw, R.l.cZX, R.l.bhd, null);
    GMTrace.o(16809696690176L, 125242);
    return true;
  }
  
  public final void Bv(int paramInt)
  {
    GMTrace.i(16809159819264L, 125238);
    switch (9.vVy[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(16809159819264L, 125238);
      return;
      this.vVw.aLo();
      switch (this.vVB)
      {
      default: 
        if (this.vQE == 65181)
        {
          com.tencent.mm.platformtools.m.b(this.vVw, this.vQF, 32046);
          GMTrace.o(16809159819264L, 125238);
          return;
        }
        break;
      case 1: 
        bYw();
        GMTrace.o(16809159819264L, 125238);
        return;
      case 2: 
        bZd();
        GMTrace.o(16809159819264L, 125238);
        return;
      }
      if (this.vQE == -30)
      {
        bZd();
        GMTrace.o(16809159819264L, 125238);
        return;
      }
      this.vVw.vVO = an.Sc(this.vVw.countryCode);
      this.vVw.nLL = this.vVw.vVI.getText().toString();
      if ((bg.nm(this.vVw.vVO)) || (bg.nm(this.vVw.nLL)))
      {
        GMTrace.o(16809159819264L, 125238);
        return;
      }
      if (this.vVw.gns == 7)
      {
        if (!bg.nm(this.lnX))
        {
          fm(this.gUy, this.lnX);
          GMTrace.o(16809159819264L, 125238);
          return;
        }
        fm(this.gUy, this.vVw.kGe.getText().toString());
        GMTrace.o(16809159819264L, 125238);
        return;
      }
      if (this.vVw.gns == 6)
      {
        final Object localObject = this.vVw.vVJ.getText().toString().trim();
        if (bg.nm((String)localObject))
        {
          h.h(this.vVw, R.l.egd, R.l.dHa);
          GMTrace.o(16809159819264L, 125238);
          return;
        }
        this.vVw.aLo();
        localObject = new s(this.gUy, 17, (String)localObject, 0, "");
        at.wS().a((k)localObject, 0);
        MobileInputUI localMobileInputUI1 = this.vVw;
        MobileInputUI localMobileInputUI2 = this.vVw;
        this.vVw.getString(R.l.cUG);
        localMobileInputUI1.vQR = h.a(localMobileInputUI2, this.vVw.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(16812515262464L, 125263);
            at.wS().c(localObject);
            GMTrace.o(16812515262464L, 125263);
          }
        });
      }
    }
  }
  
  public final void Vu(final String paramString)
  {
    GMTrace.i(16809294036992L, 125239);
    paramString = new s(paramString, 16, "", 0, "");
    at.wS().a(paramString, 0);
    MobileInputUI localMobileInputUI1 = this.vVw;
    MobileInputUI localMobileInputUI2 = this.vVw;
    this.vVw.getString(R.l.cUG);
    localMobileInputUI1.vQR = h.a(localMobileInputUI2, this.vVw.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(16816004923392L, 125289);
        at.wS().c(paramString);
        GMTrace.o(16816004923392L, 125289);
      }
    });
    GMTrace.o(16809294036992L, 125239);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(16809562472448L, 125241);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MobileInputIndepPassLoginLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.vVw.vQR != null)
    {
      this.vVw.vQR.dismiss();
      this.vVw.vQR = null;
    }
    int i;
    if (paramk.getType() == 145)
    {
      i = ((s)paramk).CD();
      if (i == 16)
      {
        if (paramInt2 == -41)
        {
          this.vVw.vVJ.reset();
          h.h(this.vVw, R.l.dRp, R.l.dRq);
          GMTrace.o(16809562472448L, 125241);
          return;
        }
        if (paramInt2 == -75)
        {
          this.vVw.vVJ.reset();
          h.b(this.vVw, this.vVw.getString(R.l.cRF), "", true);
          GMTrace.o(16809562472448L, 125241);
        }
      }
      else if (i == 17)
      {
        this.vQE = paramInt2;
        this.vQF = paramString;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          new a(new a.a()
          {
            public final void b(ProgressDialog paramAnonymousProgressDialog)
            {
              GMTrace.i(16807414988800L, 125225);
              e.this.vVw.vQR = ((r)paramAnonymousProgressDialog);
              GMTrace.o(16807414988800L, 125225);
            }
          }, ((s)paramk).getUsername(), ((s)paramk).Hw(), this.gUy).i(this.vVw);
          GMTrace.o(16809562472448L, 125241);
          return;
        }
        this.vQG = ((s)paramk).HL();
        this.vQH = ((s)paramk).Hx();
        this.vQI = ((s)paramk).HD();
        if ((paramInt2 == 65181) || (paramInt2 == -30))
        {
          b.nA(at.wN() + "," + getClass().getName() + ",L200_900_phone," + at.eK("L200_900_phone") + ",1");
          if (com.tencent.mm.protocal.d.tJF)
          {
            paramString = this.vVw.getString(R.l.dmb, new Object[] { "0x" + Integer.toHexString(com.tencent.mm.protocal.d.tJC), v.bPK() });
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.MobileInputIndepPassLoginLogic", "url " + paramString);
            paramk = new Intent();
            paramk.putExtra("rawUrl", paramString);
            paramk.putExtra("showShare", false);
            paramk.putExtra("show_bottom", false);
            paramk.putExtra("needRedirect", false);
            paramk.putExtra("neverGetA8Key", true);
            paramk.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
            paramk.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
            com.tencent.mm.plugin.c.a.hnH.j(paramk, this.vVw);
            GMTrace.o(16809562472448L, 125241);
            return;
          }
          if (paramInt2 == 65181)
          {
            bYw();
            GMTrace.o(16809562472448L, 125241);
            return;
          }
          paramString = com.tencent.mm.h.a.dH(paramString);
          if (paramString != null) {
            paramString.a(this.vVw, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(16812246827008L, 125261);
                e.this.bYw();
                GMTrace.o(16812246827008L, 125261);
              }
            }, null);
          }
          GMTrace.o(16809562472448L, 125241);
          return;
        }
        if (paramInt2 == -51)
        {
          paramString = com.tencent.mm.h.a.dH(paramString);
          if (paramString != null)
          {
            paramString.a(this.vVw, null, null);
            GMTrace.o(16809562472448L, 125241);
            return;
          }
          h.h(this.vVw, R.l.dQM, R.l.bhd);
          GMTrace.o(16809562472448L, 125241);
          return;
        }
        if (q(paramInt1, paramInt2, paramString))
        {
          GMTrace.o(16809562472448L, 125241);
          return;
        }
      }
      GMTrace.o(16809562472448L, 125241);
      return;
    }
    if (paramk.getType() == 701)
    {
      this.eVw = ((u)paramk).Lu();
      final Object localObject = new f();
      ((f)localObject).vRa = ((u)paramk).HQ();
      ((f)localObject).vRc = ((u)paramk).HP();
      ((f)localObject).vRb = ((u)paramk).Lw();
      ((f)localObject).vRd = ((u)paramk).Lv();
      ((f)localObject).gUy = this.gUy;
      ((f)localObject).vQY = this.vVw.kGe.getText().toString();
      int j = 0;
      if (paramInt2 == -75)
      {
        com.tencent.mm.platformtools.m.bw(this.vVw);
        GMTrace.o(16809562472448L, 125241);
        return;
      }
      if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.m.b(this.vVw, paramString, 32045);
        GMTrace.o(16809562472448L, 125241);
        return;
      }
      if (paramInt2 == 65319)
      {
        com.tencent.mm.platformtools.m.a(this.vVw, com.tencent.mm.pluginsdk.a.a.a((u)paramk), paramInt2);
        GMTrace.o(16809562472448L, 125241);
        return;
      }
      if (paramInt2 == 65331)
      {
        this.osh = ((u)paramk).Hy();
        paramString = ((u)paramk).Lx();
        paramk = ((u)paramk).LA();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MobileInputIndepPassLoginLogic", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bg.SJ(this.osh), paramk });
        f.a((f)localObject);
        localObject = new Intent();
        ((Intent)localObject).putExtra("auth_ticket", this.osh);
        ((Intent)localObject).putExtra("binded_mobile", paramString);
        ((Intent)localObject).putExtra("close_safe_device_style", paramk);
        ((Intent)localObject).putExtra("from_source", 6);
        com.tencent.mm.plugin.c.a.hnH.f(this.vVw, (Intent)localObject);
        GMTrace.o(16809562472448L, 125241);
        return;
      }
      if (paramInt2 == 65396)
      {
        if (!bg.nm(this.eVw)) {
          com.tencent.mm.platformtools.m.j(this.vVw, paramString, this.eVw);
        }
        GMTrace.o(16809562472448L, 125241);
        return;
      }
      i = j;
      if (paramInt1 == 4) {
        if (paramInt2 != -16)
        {
          i = j;
          if (paramInt2 != -17) {}
        }
        else
        {
          i = 1;
          at.wS().a(new bf(new bf.a()
          {
            public final void a(com.tencent.mm.network.e paramAnonymouse)
            {
              GMTrace.i(16807146553344L, 125223);
              if (paramAnonymouse == null)
              {
                GMTrace.o(16807146553344L, 125223);
                return;
              }
              paramAnonymouse = paramAnonymouse.DY();
              at.AR();
              int i = com.tencent.mm.y.c.ww();
              paramAnonymouse.i(new byte[0], i);
              GMTrace.o(16807146553344L, 125223);
            }
          }), 0);
        }
      }
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        if (this.vMf == null)
        {
          this.vMf = SecurityImage.a.a(this.vVw, R.l.dRU, ((f)localObject).vRd, ((f)localObject).vRc, ((f)localObject).vRa, ((f)localObject).vRb, new DialogInterface.OnClickListener()
          {
            public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(16815468052480L, 125285);
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.MobileInputIndepPassLoginLogic", "imgSid:" + localObject.vRa + " img len" + localObject.vRc.length + " " + g.tC());
              paramAnonymousDialogInterface = new u(localObject.gUy, localObject.vQY, localObject.vRd, e.this.vMf.bZo(), e.this.vMf.vRa, e.this.vMf.vRb, 1, "", false, false);
              at.wS().a(paramAnonymousDialogInterface, 0);
              MobileInputUI localMobileInputUI1 = e.this.vVw;
              MobileInputUI localMobileInputUI2 = e.this.vVw;
              e.this.vVw.getString(R.l.cUG);
              localMobileInputUI1.vQR = h.a(localMobileInputUI2, e.this.vVw.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(16816810229760L, 125295);
                  at.wS().c(paramAnonymousDialogInterface);
                  GMTrace.o(16816810229760L, 125295);
                }
              });
              GMTrace.o(16815468052480L, 125285);
            }
          }, null, new DialogInterface.OnDismissListener()
          {
            public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(16816273358848L, 125291);
              e.this.vMf = null;
              GMTrace.o(16816273358848L, 125291);
            }
          }, (SecurityImage.b)localObject);
          GMTrace.o(16809562472448L, 125241);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.MobileInputIndepPassLoginLogic", "imgSid:" + ((f)localObject).vRa + " img len" + ((f)localObject).vRc.length + " " + g.tC());
        this.vMf.a(((f)localObject).vRd, ((f)localObject).vRc, ((f)localObject).vRa, ((f)localObject).vRb);
        GMTrace.o(16809562472448L, 125241);
        return;
      }
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        at.unhold();
        com.tencent.mm.platformtools.m.nh(((f)localObject).gUy);
        com.tencent.mm.modelsimple.d.bk(this.vVw);
        com.tencent.mm.platformtools.m.a(this.vVw, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16809965125632L, 125244);
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.MobileInputIndepPassLoginLogic", "onSceneEnd, in runnable");
            Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(e.this.vVw);
            localIntent.addFlags(67108864);
            e.this.vVw.startActivity(localIntent);
            e.this.vVw.finish();
            GMTrace.o(16809965125632L, 125244);
          }
        }, false, 2);
        if (this.vVw.gns == 6)
        {
          this.vQz = ((u)paramk).LC();
          at.wS().a(255, this);
          paramString = new com.tencent.mm.modelsimple.w(1);
          at.wS().a(paramString, 0);
          paramk = this.vVw;
          localObject = this.vVw;
          this.vVw.getString(R.l.cUG);
          paramk.vQR = h.a((Context)localObject, this.vVw.getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(16814528528384L, 125278);
              at.wS().c(paramString);
              at.wS().b(255, e.this);
              GMTrace.o(16814528528384L, 125278);
            }
          });
        }
        GMTrace.o(16809562472448L, 125241);
        return;
      }
      if (q(paramInt1, paramInt2, paramString))
      {
        GMTrace.o(16809562472448L, 125241);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        Toast.makeText(this.vVw, this.vVw.getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      paramString = com.tencent.mm.h.a.dH(paramString);
      if ((paramString != null) && (this.vVw != null) && (paramString.a(this.vVw, null, null)))
      {
        GMTrace.o(16809562472448L, 125241);
        return;
      }
      GMTrace.o(16809562472448L, 125241);
      return;
    }
    if (paramk.getType() == 255)
    {
      at.wS().b(255, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        paramString = this.vVw;
        boolean bool = this.vQz;
        paramk = new Intent(paramString, RegByMobileSetPwdUI.class);
        paramk.putExtra("kintent_hint", paramString.getString(R.l.dZu));
        paramk.putExtra("kintent_cancelable", bool);
        paramString.startActivity(paramk);
      }
      GMTrace.o(16809562472448L, 125241);
      return;
    }
    GMTrace.o(16809562472448L, 125241);
  }
  
  public final void a(MobileInputUI paramMobileInputUI)
  {
    GMTrace.i(16808622948352L, 125234);
    this.vVw = paramMobileInputUI;
    paramMobileInputUI.vVM.setVisibility(0);
    this.gUy = paramMobileInputUI.getIntent().getStringExtra("binded_mobile");
    if (bg.nm(this.gUy)) {
      this.gUy = an.Sa(paramMobileInputUI.vVO + paramMobileInputUI.nLL);
    }
    paramMobileInputUI.vVI.setTextColor(paramMobileInputUI.getResources().getColor(R.e.aOa));
    paramMobileInputUI.vVI.setEnabled(false);
    paramMobileInputUI.vVI.setFocusable(false);
    paramMobileInputUI.vVH.setFocusable(false);
    paramMobileInputUI.vVH.setText(an.Sa(this.gUy));
    paramMobileInputUI.vVH.setVisibility(0);
    aWO();
    paramMobileInputUI.vVN.setVisibility(0);
    paramMobileInputUI.vRW.setText(R.l.dHf);
    paramMobileInputUI.vRW.setVisibility(0);
    paramMobileInputUI.vRW.setEnabled(true);
    this.osh = paramMobileInputUI.getIntent().getStringExtra("auth_ticket");
    if (!bg.nm(this.osh)) {
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16813991657472L, 125274);
          e.this.fm(f.bYz(), f.bYA());
          GMTrace.o(16813991657472L, 125274);
        }
      }, 500L);
    }
    GMTrace.o(16808622948352L, 125234);
  }
  
  public final void aWO()
  {
    GMTrace.i(16808757166080L, 125235);
    if (this.vVw.gns == 6)
    {
      this.vVw.vVJ.reset();
      this.vVw.vVN.setText(R.l.dHh);
      this.vVw.vRm.setVisibility(8);
      this.vVw.vVJ.setVisibility(0);
      this.vVw.vVJ.nUE.requestFocus();
      this.vVw.vVJ.wcc = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16806207029248L, 125216);
          h.a(e.this.vVw, e.this.vVw.getString(R.l.dRJ) + e.this.gUy, e.this.vVw.getString(R.l.dRK), e.this.vVw.getString(R.l.cTM), e.this.vVw.getString(R.l.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(16813723222016L, 125272);
              e.this.vVw.vVJ.bZJ();
              e.this.Vu(e.this.gUy);
              GMTrace.o(16813723222016L, 125272);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(16813454786560L, 125270);
              e.this.vVw.vVJ.reset();
              GMTrace.o(16813454786560L, 125270);
            }
          });
          GMTrace.o(16806207029248L, 125216);
        }
      };
      this.vVw.vVN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16808220295168L, 125231);
          e.this.vVw.mGp[1] = 2;
          e.this.vVw.gns = 7;
          e.this.vVw.vVJ.reset();
          at.wS().b(145, e.this);
          e.this.aWO();
          GMTrace.o(16808220295168L, 125231);
        }
      });
      GMTrace.o(16808757166080L, 125235);
      return;
    }
    if (this.vVw.gns == 7)
    {
      this.vVw.vVN.setText(R.l.dHi);
      this.vVw.vRm.setVisibility(0);
      this.vVw.kGe.requestFocus();
      this.vVw.vVJ.setVisibility(8);
      this.vVw.vVN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16815199617024L, 125283);
          e.this.vVw.mGp[1] = 1;
          e.this.vVw.gns = 6;
          at.wS().a(145, e.this);
          e.this.aWO();
          GMTrace.o(16815199617024L, 125283);
        }
      });
    }
    GMTrace.o(16808757166080L, 125235);
  }
  
  public final void bYw()
  {
    GMTrace.i(19227763277824L, 143258);
    Intent localIntent = new Intent(this.vVw, ShowAgreementsUI.class);
    localIntent.putExtra("agreement_type", 0);
    this.vVw.startActivityForResult(localIntent, 32047);
    GMTrace.o(19227763277824L, 143258);
  }
  
  public final void fm(final String paramString1, String paramString2)
  {
    GMTrace.i(16809428254720L, 125240);
    if (bg.nm(paramString1))
    {
      h.h(this.vVw, R.l.ege, R.l.dHa);
      GMTrace.o(16809428254720L, 125240);
      return;
    }
    if (bg.nm(paramString2))
    {
      h.h(this.vVw, R.l.egb, R.l.dHa);
      GMTrace.o(16809428254720L, 125240);
      return;
    }
    this.vVw.kGe.setText(paramString2);
    this.vVw.aLo();
    paramString1 = new u(paramString1, paramString2, null, 1);
    at.wS().a(paramString1, 0);
    paramString2 = this.vVw;
    MobileInputUI localMobileInputUI = this.vVw;
    this.vVw.getString(R.l.cUG);
    paramString2.vQR = h.a(localMobileInputUI, this.vVw.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(16810501996544L, 125248);
        at.wS().c(paramString1);
        GMTrace.o(16810501996544L, 125248);
      }
    });
    GMTrace.o(16809428254720L, 125240);
  }
  
  public final void start()
  {
    GMTrace.i(16808891383808L, 125236);
    at.wS().a(701, this);
    at.wS().a(145, this);
    b.b(true, at.wN() + "," + getClass().getName() + ",L200_100," + at.eK("L200_100") + ",1");
    b.ny("L200_100");
    GMTrace.o(16808891383808L, 125236);
  }
  
  public final void stop()
  {
    GMTrace.i(16809025601536L, 125237);
    at.wS().b(701, this);
    at.wS().b(145, this);
    b.b(false, at.wN() + "," + getClass().getName() + ",L200_100," + at.eK("L200_100") + ",2");
    GMTrace.o(16809025601536L, 125237);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */