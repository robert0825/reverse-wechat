package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.ag;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bda;
import com.tencent.mm.protocal.c.dy;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.au;
import com.tencent.mm.y.c;
import java.io.IOException;

public abstract class SetPwdUI
  extends MMActivity
  implements e
{
  public String eEU;
  private ProgressDialog htG;
  public boolean oND;
  private String vUa;
  private String vUb;
  public azp vUc;
  
  public SetPwdUI()
  {
    GMTrace.i(2760858664960L, 20570);
    this.htG = null;
    this.eEU = null;
    this.vUc = null;
    this.oND = true;
    GMTrace.o(2760858664960L, 20570);
  }
  
  protected static boolean bYV()
  {
    GMTrace.i(19240111308800L, 143350);
    GMTrace.o(19240111308800L, 143350);
    return true;
  }
  
  protected abstract void Bt(int paramInt);
  
  protected ProgressDialog a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(2761798189056L, 20577);
    paramContext = h.a(paramContext, paramString2, true, paramOnCancelListener);
    GMTrace.o(2761798189056L, 20577);
    return paramContext;
  }
  
  protected k a(String paramString1, String paramString2, azp paramazp)
  {
    GMTrace.i(2762066624512L, 20579);
    paramString1 = new ag(paramString1, paramString2, paramazp);
    GMTrace.o(2762066624512L, 20579);
    return paramString1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    SharedPreferences.Editor localEditor = null;
    GMTrace.i(2762200842240L, 20580);
    if (paramk.getType() != bYE())
    {
      GMTrace.o(2762200842240L, 20580);
      return;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramk.getType() == 383) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      Toast.makeText(this, getString(R.l.dxl), 0).show();
      ag localag = (ag)paramk;
      paramk = localEditor;
      if (localag.fUa != null)
      {
        paramk = localEditor;
        if (localag.fUa.gtD.gtK != null) {
          paramk = (bda)localag.fUa.gtD.gtK;
        }
      }
      if ((paramk != null) && (paramk.tSb != null))
      {
        paramk = paramk.tSb.uNP.toByteArray();
        localEditor = ab.getContext().getSharedPreferences("auth_info_key_prefs", 4).edit();
        localEditor.putBoolean("key_auth_info_prefs_created", true);
        localEditor.putInt("key_auth_update_version", d.tJC);
        localEditor.putString("_auth_key", bg.bs(paramk));
        at.AR();
        localEditor.putInt("_auth_uin", c.ww());
        localEditor.commit();
      }
      setResult(-1);
    }
    if (u(paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2762200842240L, 20580);
      return;
    }
    Toast.makeText(this, getString(R.l.dxk, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(2762200842240L, 20580);
  }
  
  protected abstract String bYC();
  
  protected abstract String bYD();
  
  protected int bYE()
  {
    GMTrace.i(2761932406784L, 20578);
    GMTrace.o(2761932406784L, 20578);
    return 383;
  }
  
  public boolean bYK()
  {
    GMTrace.i(2762469277696L, 20582);
    GMTrace.o(2762469277696L, 20582);
    return false;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(2762603495424L, 20583);
    if (this.oND)
    {
      if (bYK())
      {
        w.d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 1");
        g.ork.i(11868, new Object[] { Integer.valueOf(1) });
      }
      super.onBackPressed();
    }
    GMTrace.o(2762603495424L, 20583);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2760992882688L, 20571);
    at.wS().a(bYE(), this);
    super.onCreate(paramBundle);
    this.eEU = getIntent().getStringExtra("setpwd_ticket");
    paramBundle = bg.St(au.AX().getString("_auth_key", ""));
    dy localdy = new dy();
    if (!bg.bq(paramBundle)) {}
    for (this.vUc = new azp().be(paramBundle);; this.vUc = new azp().be(new byte[0])) {
      try
      {
        localdy.aD(paramBundle);
        a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(2692944494592L, 20064);
            SetPwdUI.a(SetPwdUI.this, SetPwdUI.this.bYC());
            SetPwdUI.b(SetPwdUI.this, SetPwdUI.this.bYD());
            if (bg.nm(SetPwdUI.a(SetPwdUI.this)))
            {
              GMTrace.o(2692944494592L, 20064);
              return true;
            }
            if (!SetPwdUI.a(SetPwdUI.this).equals(SetPwdUI.b(SetPwdUI.this)))
            {
              SetPwdUI.this.Bt(SetPwdUI.a.vUf);
              GMTrace.o(2692944494592L, 20064);
              return true;
            }
            if (SetPwdUI.a(SetPwdUI.this).length() > 16)
            {
              SetPwdUI.this.Bt(SetPwdUI.a.vUg);
              GMTrace.o(2692944494592L, 20064);
              return true;
            }
            if (bg.Sg(SetPwdUI.a(SetPwdUI.this)))
            {
              h.h(SetPwdUI.this, R.l.dRh, R.l.dRD);
              GMTrace.o(2692944494592L, 20064);
              return true;
            }
            if (!bg.Sl(SetPwdUI.a(SetPwdUI.this)))
            {
              if ((SetPwdUI.a(SetPwdUI.this).length() >= 8) && (SetPwdUI.a(SetPwdUI.this).length() < 16)) {
                SetPwdUI.this.Bt(SetPwdUI.a.vUi);
              }
              for (;;)
              {
                GMTrace.o(2692944494592L, 20064);
                return true;
                SetPwdUI.this.Bt(SetPwdUI.a.vUh);
              }
            }
            SetPwdUI.a(SetPwdUI.this);
            SetPwdUI.b(SetPwdUI.this);
            SetPwdUI.bYV();
            SetPwdUI.this.aLo();
            if (bg.nm(SetPwdUI.this.eEU))
            {
              paramAnonymousMenuItem = SetPwdUI.this;
              at.AR();
              paramAnonymousMenuItem.eEU = ((String)c.xh().get(77830, null));
            }
            paramAnonymousMenuItem = SetPwdUI.this.a(SetPwdUI.a(SetPwdUI.this), SetPwdUI.this.eEU, SetPwdUI.this.vUc);
            at.wS().a(paramAnonymousMenuItem, 0);
            SetPwdUI.a(SetPwdUI.this, SetPwdUI.this.a(SetPwdUI.this, SetPwdUI.this.getString(R.l.cUG), SetPwdUI.this.getString(R.l.dQF), new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(2664892989440L, 19855);
                at.wS().c(paramAnonymousMenuItem);
                GMTrace.o(2664892989440L, 19855);
              }
            }));
            if ((SetPwdUI.this.bYK()) && (!SetPwdUI.this.oND))
            {
              w.d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 0");
              g.ork.i(11868, new Object[] { Integer.valueOf(0) });
            }
            GMTrace.o(2692944494592L, 20064);
            return true;
          }
        }, p.b.vLG);
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(2706768920576L, 20167);
            if ((SetPwdUI.this.bYK()) && (SetPwdUI.this.oND))
            {
              w.d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 1");
              g.ork.i(11868, new Object[] { Integer.valueOf(1) });
            }
            SetPwdUI.this.aLo();
            SetPwdUI.this.setResult(0);
            SetPwdUI.this.finish();
            GMTrace.o(2706768920576L, 20167);
            return true;
          }
        });
        GMTrace.o(2760992882688L, 20571);
        return;
      }
      catch (IOException paramBundle)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SetPwdUI", paramBundle, "summersetpwd Failed parse autoauthkey buf", new Object[0]);
        }
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(2761127100416L, 20572);
    at.wS().b(bYE(), this);
    super.onDestroy();
    GMTrace.o(2761127100416L, 20572);
  }
  
  protected final boolean q(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(2762335059968L, 20581);
    if (a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2762335059968L, 20581);
      return true;
    }
    GMTrace.o(2762335059968L, 20581);
    return false;
  }
  
  protected abstract boolean u(int paramInt1, int paramInt2, String paramString);
  
  protected static enum a
  {
    static
    {
      GMTrace.i(2654826659840L, 19780);
      vUf = 1;
      vUg = 2;
      vUh = 3;
      vUi = 4;
      vUj = new int[] { vUf, vUg, vUh, vUi };
      GMTrace.o(2654826659840L, 19780);
    }
    
    public static int[] bYW()
    {
      GMTrace.i(2654692442112L, 19779);
      int[] arrayOfInt = (int[])vUj.clone();
      GMTrace.o(2654692442112L, 19779);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\SetPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */