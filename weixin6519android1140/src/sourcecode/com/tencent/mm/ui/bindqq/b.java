package com.tencent.mm.ui.bindqq;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.v;
import com.tencent.mm.modelsimple.aj;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bnh;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;

public final class b
  implements e
{
  public Context context;
  i oaD;
  private View oaE;
  public SecurityImage vMf;
  public r vQR;
  public String vQY;
  private String vRa;
  private String vRb;
  private byte[] vRc;
  private a woh;
  
  public b(Context paramContext, a parama)
  {
    GMTrace.i(1901328334848L, 14166);
    this.context = paramContext;
    this.oaE = null;
    this.vQR = null;
    this.oaD = null;
    this.vQY = "";
    this.vMf = null;
    this.vRc = null;
    this.vRa = "";
    this.woh = parama;
    GMTrace.o(1901328334848L, 14166);
  }
  
  @TargetApi(17)
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1901865205760L, 14170);
    onDetach();
    if ((paramk == null) || (paramk.getType() != 384))
    {
      GMTrace.o(1901865205760L, 14170);
      return;
    }
    if (this.vQR != null)
    {
      this.vQR.dismiss();
      this.vQR = null;
    }
    this.vRa = com.tencent.mm.platformtools.n.a(((bnh)((aj)paramk).fUa.gtD.gtK).uuK);
    paramk = (aj)paramk;
    if ((((bnh)paramk.fUa.gtD.gtK).tSd != null) && (((bnh)paramk.fUa.gtD.gtK).tSd.uNN > 0)) {}
    for (paramk = com.tencent.mm.kernel.h.xw().fXT.Y(paramk.gvv);; paramk = com.tencent.mm.platformtools.n.a(((bnh)paramk.fUa.gtD.gtK).tQa))
    {
      this.vRc = paramk;
      if ((this.woh == null) || (!this.woh.v(paramInt1, paramInt2, paramString))) {
        break;
      }
      GMTrace.o(1901865205760L, 14170);
      return;
    }
    if ((this.context instanceof Activity))
    {
      paramk = (Activity)this.context;
      if ((paramk.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramk.isDestroyed())))
      {
        GMTrace.o(1901865205760L, 14170);
        return;
      }
    }
    if (paramInt1 == 4)
    {
      switch (paramInt2)
      {
      default: 
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this.context, null, null);
          GMTrace.o(1901865205760L, 14170);
          return;
        }
        break;
      case -311: 
      case -310: 
      case -6: 
        if (at.AU())
        {
          if (this.vMf == null)
          {
            this.vMf = SecurityImage.a.a(this.context, R.l.dRU, 0, this.vRc, this.vRa, this.vRb, new DialogInterface.OnClickListener()
            {
              public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(1904952213504L, 14193);
                paramAnonymousDialogInterface = new aj(5, b.this.vQY, b.this.vMf.vRa, b.this.vMf.bZo(), b.this.vMf.vRb, true, 1);
                b.this.yv();
                at.wS().a(paramAnonymousDialogInterface, 0);
                b localb = b.this;
                Context localContext = b.this.context;
                b.this.context.getString(R.l.cUG);
                localb.vQR = com.tencent.mm.ui.base.h.a(localContext, b.this.context.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
                {
                  public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                  {
                    GMTrace.i(1888577650688L, 14071);
                    b.this.onDetach();
                    at.wS().c(paramAnonymousDialogInterface);
                    GMTrace.o(1888577650688L, 14071);
                  }
                });
                GMTrace.o(1904952213504L, 14193);
              }
            }, null, new DialogInterface.OnDismissListener()new b
            {
              public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(1894751666176L, 14117);
                b.this.vMf = null;
                GMTrace.o(1894751666176L, 14117);
              }
            }, new b());
            GMTrace.o(1901865205760L, 14170);
            return;
          }
          this.vMf.a(0, this.vRc, this.vRa, this.vRb);
        }
        GMTrace.o(1901865205760L, 14170);
        return;
      case -3: 
        paramString = new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1893275271168L, 14106);
            b.this.oaD = null;
            b.this.onDetach();
            b.this.cbp();
            GMTrace.o(1893275271168L, 14106);
          }
        };
        this.oaD = com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.dfk), this.context.getString(R.l.cUG), paramString, null);
        GMTrace.o(1901865205760L, 14170);
        return;
      case -72: 
        this.oaD = com.tencent.mm.ui.base.h.h(this.context, R.l.dgG, R.l.cUG);
        GMTrace.o(1901865205760L, 14170);
        return;
      case -34: 
        this.oaD = com.tencent.mm.ui.base.h.b(this.context, this.context.getString(R.l.dar), this.context.getString(R.l.cUG), true);
        GMTrace.o(1901865205760L, 14170);
        return;
      }
      GMTrace.o(1901865205760L, 14170);
      return;
    }
    paramString = com.tencent.mm.h.a.dH(paramString);
    if (paramString != null)
    {
      paramString.a(this.context, null, null);
      GMTrace.o(1901865205760L, 14170);
      return;
    }
    GMTrace.o(1901865205760L, 14170);
  }
  
  public final void cbp()
  {
    GMTrace.i(1901730988032L, 14169);
    this.oaE = View.inflate(this.context, R.i.cFR, null);
    final Object localObject = (EditText)this.oaE.findViewById(R.h.ccj);
    ((EditText)localObject).setHint(R.l.dgE);
    localObject = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1890725134336L, 14087);
        b.this.oaD = null;
        paramAnonymousDialogInterface = b.this;
        Object localObject = localObject.getText().toString().trim();
        paramAnonymousDialogInterface.yv();
        paramAnonymousDialogInterface.vQY = ((String)localObject);
        localObject = paramAnonymousDialogInterface.context;
        paramAnonymousDialogInterface.context.getString(R.l.cUG);
        paramAnonymousDialogInterface.vQR = com.tencent.mm.ui.base.h.a((Context)localObject, paramAnonymousDialogInterface.context.getString(R.l.dXH), true, new b.3(paramAnonymousDialogInterface));
        at.wS().a(new aj(5, paramAnonymousDialogInterface.vQY, "", "", "", false, 1), 0);
        GMTrace.o(1890725134336L, 14087);
      }
    };
    DialogInterface.OnClickListener local2 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1902133641216L, 14172);
        b.this.oaD = null;
        b.this.onDetach();
        GMTrace.o(1902133641216L, 14172);
      }
    };
    this.oaD = com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.dgF), this.oaE, (DialogInterface.OnClickListener)localObject, local2);
    GMTrace.o(1901730988032L, 14169);
  }
  
  public final void onDetach()
  {
    GMTrace.i(1901596770304L, 14168);
    at.wS().b(384, this);
    if (this.woh != null) {
      this.woh.cbo();
    }
    GMTrace.o(1901596770304L, 14168);
  }
  
  public final void yv()
  {
    GMTrace.i(1901462552576L, 14167);
    at.wS().a(384, this);
    GMTrace.o(1901462552576L, 14167);
  }
  
  public static abstract interface a
  {
    public abstract void cbo();
    
    public abstract boolean v(int paramInt1, int paramInt2, String paramString);
  }
  
  final class b
    extends SecurityImage.b
  {
    b()
    {
      GMTrace.i(1894349012992L, 14114);
      GMTrace.o(1894349012992L, 14114);
    }
    
    public final void bYp()
    {
      GMTrace.i(1894483230720L, 14115);
      b.this.yv();
      aj localaj = new aj(5, b.this.vQY, b.this.vMf.vRa, b.this.vMf.bZo(), b.this.vMf.vRb, true, 1);
      at.wS().a(localaj, 0);
      GMTrace.o(1894483230720L, 14115);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindqq\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */