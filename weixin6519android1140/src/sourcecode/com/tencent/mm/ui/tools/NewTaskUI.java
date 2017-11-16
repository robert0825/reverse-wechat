package com.tencent.mm.ui.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.t;
import com.tencent.mm.y.at;

public class NewTaskUI
  extends MMBaseActivity
  implements e
{
  static NewTaskUI xiA;
  private ProgressDialog htG;
  private SecurityImage vMf;
  private c vPG;
  private i xiB;
  
  public NewTaskUI()
  {
    GMTrace.i(1960786788352L, 14609);
    this.vMf = null;
    this.xiB = new i();
    this.htG = null;
    this.vPG = new c() {};
    GMTrace.o(1960786788352L, 14609);
  }
  
  public static NewTaskUI cis()
  {
    GMTrace.i(1961457876992L, 14614);
    NewTaskUI localNewTaskUI = xiA;
    GMTrace.o(1961457876992L, 14614);
    return localNewTaskUI;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1961592094720L, 14615);
    w.i("MicroMsg.NewTaskUI", "onSceneEnd :%d  [%d,%d,%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    if ((paramInt1 == 4) && (paramInt2 == -3))
    {
      w.i("MicroMsg.NewTaskUI", "summerauth MM_ERR_PASSWORD need kick out acc ready[%b]", new Object[] { Boolean.valueOf(at.AU()) });
      if (t.a(xiA, paramInt1, paramInt2, new Intent().setClass(xiA, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString))
      {
        GMTrace.o(1961592094720L, 14615);
        return;
      }
    }
    if ((paramInt1 != 4) || ((paramInt2 != -6) && (paramInt2 != 65225) && (paramInt2 != 65226)))
    {
      xiA = null;
      finish();
      GMTrace.o(1961592094720L, 14615);
      return;
    }
    if ((paramk instanceof u))
    {
      paramString = (u)paramk;
      this.xiB.vRd = paramString.Lv();
      this.xiB.vRc = paramString.HP();
      this.xiB.vRa = paramString.HQ();
      this.xiB.vRb = paramString.Lw();
      w.i("MicroMsg.NewTaskUI", "onSceneEnd dkwt imgSid:" + this.xiB.vRa + " img len" + this.xiB.vRc.length + " " + g.tC());
    }
    if (this.vMf == null)
    {
      this.vMf = SecurityImage.a.a(this, R.l.dRU, this.xiB.vRd, this.xiB.vRc, this.xiB.vRa, this.xiB.vRb, new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
      {
        public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1939714605056L, 14452);
          w.i("MicroMsg.NewTaskUI", "dkwt dlg imgSid:" + NewTaskUI.a(NewTaskUI.this).vRa + " img len" + NewTaskUI.a(NewTaskUI.this).vRc.length + " " + g.tC());
          if (NewTaskUI.b(NewTaskUI.this) == null)
          {
            w.d("MicroMsg.NewTaskUI", "[arthurdan.SecurityImageCrash] fatal error!!! secimg is null!");
            GMTrace.o(1939714605056L, 14452);
            return;
          }
          paramAnonymousDialogInterface = new u(NewTaskUI.a(NewTaskUI.this).vRd, NewTaskUI.b(NewTaskUI.this).bZo(), NewTaskUI.b(NewTaskUI.this).vRa, NewTaskUI.b(NewTaskUI.this).vRb);
          at.wS().a(paramAnonymousDialogInterface, 0);
          NewTaskUI localNewTaskUI1 = NewTaskUI.this;
          NewTaskUI localNewTaskUI2 = NewTaskUI.this;
          NewTaskUI.this.getString(R.l.cUG);
          NewTaskUI.a(localNewTaskUI1, h.a(localNewTaskUI2, NewTaskUI.this.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(1945888620544L, 14498);
              at.wS().c(paramAnonymousDialogInterface);
              GMTrace.o(1945888620544L, 14498);
            }
          }));
          GMTrace.o(1939714605056L, 14452);
        }
      }, new DialogInterface.OnCancelListener()new DialogInterface.OnDismissListener
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1952599506944L, 14548);
          if (NewTaskUI.xiA != null)
          {
            NewTaskUI.xiA = null;
            NewTaskUI.this.finish();
          }
          GMTrace.o(1952599506944L, 14548);
        }
      }, new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1940251475968L, 14456);
          NewTaskUI.c(NewTaskUI.this);
          GMTrace.o(1940251475968L, 14456);
        }
      }, this.xiB);
      GMTrace.o(1961592094720L, 14615);
      return;
    }
    w.d("MicroMsg.NewTaskUI", "imgSid:" + this.xiB.vRa + " img len" + this.xiB.vRc.length + " " + g.tC());
    this.vMf.a(this.xiB.vRd, this.xiB.vRc, this.xiB.vRa, this.xiB.vRb);
    GMTrace.o(1961592094720L, 14615);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(1960921006080L, 14610);
    super.onCreate(paramBundle);
    w.i("MicroMsg.NewTaskUI", "onCreate :%d", new Object[] { Integer.valueOf(hashCode()) });
    setContentView(R.i.cpE);
    at.wS().a(701, this);
    xiA = this;
    paramBundle = new u(0, "", "", "");
    at.wS().a(paramBundle, 0);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(1954478555136L, 14562);
        at.wS().c(paramBundle);
        GMTrace.o(1954478555136L, 14562);
      }
    });
    GMTrace.o(1960921006080L, 14610);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1961323659264L, 14613);
    w.i("MicroMsg.NewTaskUI", "onDestroy :%d", new Object[] { Integer.valueOf(hashCode()) });
    if (equals(xiA)) {
      xiA = null;
    }
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    if (this.vMf != null) {
      this.vMf.dismiss();
    }
    at.wS().b(701, this);
    super.onDestroy();
    GMTrace.o(1961323659264L, 14613);
  }
  
  public void onPause()
  {
    GMTrace.i(1961189441536L, 14612);
    super.onPause();
    a.vgX.c(this.vPG);
    GMTrace.o(1961189441536L, 14612);
  }
  
  public void onResume()
  {
    GMTrace.i(1961055223808L, 14611);
    a.vgX.b(this.vPG);
    super.onResume();
    GMTrace.o(1961055223808L, 14611);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\NewTaskUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */