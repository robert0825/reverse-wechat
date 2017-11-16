package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public final class f
  implements e, MobileVerifyUI.b
{
  public SecurityImage vMf;
  public com.tencent.mm.ui.account.f vQl;
  private a vSw;
  public MobileVerifyUI vWn;
  
  public f()
  {
    GMTrace.i(2631338557440L, 19605);
    this.vSw = null;
    this.vMf = null;
    this.vQl = null;
    GMTrace.o(2631338557440L, 19605);
  }
  
  public final boolean Bw(int paramInt)
  {
    GMTrace.i(2631875428352L, 19609);
    switch (6.vWq[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(2631875428352L, 19609);
      return false;
      at.wS().a(145, this);
      final s locals = new s(this.vWn.eMW, 9, this.vWn.vVi.getText().toString().trim(), 0, "");
      at.wS().a(locals, 0);
      MobileVerifyUI localMobileVerifyUI1 = this.vWn;
      MobileVerifyUI localMobileVerifyUI2 = this.vWn;
      this.vWn.getString(R.l.cUG);
      localMobileVerifyUI1.htG = h.a(localMobileVerifyUI2, this.vWn.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2610803245056L, 19452);
          at.wS().c(locals);
          at.wS().b(145, f.this);
          GMTrace.o(2610803245056L, 19452);
        }
      });
      continue;
      b.nA(at.wN() + "," + getClass().getName() + ",R200_400," + at.eK("R200_400") + ",1");
      at.wS().a(145, this);
      locals = new s(this.vWn.eMW, 8, "", 0, "");
      at.wS().a(locals, 0);
      continue;
      b.nA(at.wN() + "," + getClass().getName() + ",R200_350_auto," + at.eK("R200_350_auto") + ",1");
      at.wS().a(145, this);
      locals = new s(this.vWn.eMW, 9, this.vWn.vVi.getText().toString().trim(), 0, "");
      at.wS().a(locals, 0);
      localMobileVerifyUI1 = this.vWn;
      localMobileVerifyUI2 = this.vWn;
      this.vWn.getString(R.l.cUG);
      localMobileVerifyUI1.htG = h.a(localMobileVerifyUI2, this.vWn.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2619930050560L, 19520);
          at.wS().c(locals);
          at.wS().b(145, f.this);
          GMTrace.o(2619930050560L, 19520);
        }
      });
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2632009646080L, 19610);
    w.i("MicroMsg.MobileVerifyForgetPwdLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.vWn.htG != null)
    {
      this.vWn.htG.dismiss();
      this.vWn.htG = null;
    }
    if (this.vQl == null) {
      this.vQl = new com.tencent.mm.ui.account.f();
    }
    if ((paramk.getType() == 701) && (this.vSw != null))
    {
      at.wS().b(701, this);
      this.vQl.vRa = ((u)paramk).HQ();
      this.vQl.vRc = ((u)paramk).HP();
      this.vQl.vRb = ((u)paramk).Lw();
      this.vQl.vRd = ((u)paramk).Lv();
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        at.wS().a(701, this);
        if (this.vMf == null)
        {
          this.vMf = SecurityImage.a.a(this.vWn, R.l.dRU, this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb, new DialogInterface.OnClickListener()
          {
            public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2627714678784L, 19578);
              w.d("MicroMsg.MobileVerifyForgetPwdLogic", "imgSid:" + f.this.vQl.vRa + " img len" + f.this.vQl.vRc.length + " " + g.tC());
              paramAnonymousDialogInterface = new u(f.this.vQl.gUy, f.this.vQl.vQZ, f.this.vQl.vRd, f.this.vMf.bZo(), f.this.vMf.vRa, f.this.vMf.vRb, 1, "", false, true);
              at.wS().a(paramAnonymousDialogInterface, 0);
              MobileVerifyUI localMobileVerifyUI = f.this.vWn;
              f.this.vWn.getString(R.l.cUG);
              h.a(localMobileVerifyUI, f.this.vWn.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(2583557046272L, 19249);
                  at.wS().c(paramAnonymousDialogInterface);
                  at.wS().b(701, f.this);
                  GMTrace.o(2583557046272L, 19249);
                }
              });
              GMTrace.o(2627714678784L, 19578);
            }
          }, null, new DialogInterface.OnDismissListener()
          {
            public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(2590536368128L, 19301);
              f.this.vMf = null;
              GMTrace.o(2590536368128L, 19301);
            }
          }, this.vQl);
          GMTrace.o(2632009646080L, 19610);
          return;
        }
        w.d("MicroMsg.MobileVerifyForgetPwdLogic", "imgSid:" + this.vQl.vRa + " img len" + this.vQl.vRc.length + " " + g.tC());
        this.vMf.a(this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb);
        GMTrace.o(2632009646080L, 19610);
        return;
      }
      this.vSw.a(this.vWn, paramInt1, paramInt2, paramString, paramk);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        boolean bool = true;
        if ((paramk instanceof u)) {
          bool = ((u)paramk).LC();
        }
        this.vWn.lt(bool);
      }
      GMTrace.o(2632009646080L, 19610);
      return;
    }
    if (paramk.getType() == 145)
    {
      this.vQl.gUy = ((s)paramk).getUsername();
      this.vQl.vQZ = ((s)paramk).Hw();
      at.wS().b(145, this);
      if (((s)paramk).CD() != 9)
      {
        GMTrace.o(2632009646080L, 19610);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        at.wS().a(701, this);
        this.vSw = new a(new a.a()
        {
          public final void b(ProgressDialog paramAnonymousProgressDialog)
          {
            GMTrace.i(2587046707200L, 19275);
            f.this.vWn.htG = paramAnonymousProgressDialog;
            GMTrace.o(2587046707200L, 19275);
          }
        }, ((s)paramk).getUsername(), ((s)paramk).Hw(), this.vWn.eMW);
        this.vSw.i(this.vWn);
        GMTrace.o(2632009646080L, 19610);
        return;
      }
      if (paramInt2 == -51)
      {
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this.vWn, null, null);
          GMTrace.o(2632009646080L, 19610);
          return;
        }
        h.h(this.vWn, R.l.cZX, R.l.bhd);
        GMTrace.o(2632009646080L, 19610);
        return;
      }
    }
    if (this.vWn.q(paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2632009646080L, 19610);
      return;
    }
    if (paramk.getType() == 701)
    {
      paramString = com.tencent.mm.h.a.dH(paramString);
      if ((paramString != null) && (paramString.a(this.vWn, null, null)))
      {
        GMTrace.o(2632009646080L, 19610);
        return;
      }
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      Toast.makeText(this.vWn, this.vWn.getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
    GMTrace.o(2632009646080L, 19610);
  }
  
  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    GMTrace.i(2631472775168L, 19606);
    this.vWn = paramMobileVerifyUI;
    GMTrace.o(2631472775168L, 19606);
  }
  
  public final void start()
  {
    GMTrace.i(2631606992896L, 19607);
    b.b(true, at.wN() + "," + getClass().getName() + ",F200_300," + at.eK("F200_300") + ",1");
    b.ny("F200_300");
    GMTrace.o(2631606992896L, 19607);
  }
  
  public final void stop()
  {
    GMTrace.i(2631741210624L, 19608);
    int i = 2;
    if (this.vWn.vWO != -1) {
      i = this.vWn.vWO;
    }
    b.b(false, at.wN() + "," + getClass().getName() + ",F200_300," + at.eK("F200_300") + "," + i);
    GMTrace.o(2631741210624L, 19608);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */