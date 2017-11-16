package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.modelfriend.t;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.gm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.Map;

public class SecurityAccountIntroUI
  extends MMWizardActivity
  implements e
{
  private String eMW;
  private ProgressDialog htG;
  private String jumpUrl;
  private String osh;
  private String osi;
  private boolean osj;
  private Button osk;
  private String osl;
  
  public SecurityAccountIntroUI()
  {
    GMTrace.i(12866111406080L, 95860);
    this.osj = false;
    this.htG = null;
    GMTrace.o(12866111406080L, 95860);
  }
  
  private void bci()
  {
    GMTrace.i(12867050930176L, 95867);
    com.tencent.mm.plugin.c.b.nz(this.osl);
    cancel();
    Bh(1);
    GMTrace.o(12867050930176L, 95867);
  }
  
  protected final void MP()
  {
    GMTrace.i(12866916712448L, 95866);
    oM(R.l.dUF);
    findViewById(R.h.bSx).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(12865977188352L, 95859);
        if (!SecurityAccountIntroUI.a(SecurityAccountIntroUI.this)) {}
        for (paramAnonymousView = new s(SecurityAccountIntroUI.b(SecurityAccountIntroUI.this), 10, "", 0, "", SecurityAccountIntroUI.c(SecurityAccountIntroUI.this));; paramAnonymousView = new t(SecurityAccountIntroUI.b(SecurityAccountIntroUI.this), 10, "", 0, ""))
        {
          at.wS().a(paramAnonymousView, 0);
          SecurityAccountIntroUI localSecurityAccountIntroUI1 = SecurityAccountIntroUI.this;
          SecurityAccountIntroUI localSecurityAccountIntroUI2 = SecurityAccountIntroUI.this;
          SecurityAccountIntroUI.this.getString(R.l.cUG);
          SecurityAccountIntroUI.a(localSecurityAccountIntroUI1, h.a(localSecurityAccountIntroUI2, SecurityAccountIntroUI.this.getString(R.l.dUD), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(12870137937920L, 95890);
              at.wS().c(paramAnonymousView);
              GMTrace.o(12870137937920L, 95890);
            }
          }));
          GMTrace.o(12865977188352L, 95859);
          return;
        }
      }
    });
    if (!this.osj)
    {
      this.osk = ((Button)findViewById(R.h.bpq));
      if (!bg.nm(this.osi)) {
        this.osk.setText(this.osi);
      }
      this.osk.setVisibility(0);
      this.osk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12872419639296L, 95907);
          paramAnonymousView = v.d(SecurityAccountIntroUI.this.getSharedPreferences(ab.bPU(), 0));
          Intent localIntent = new Intent();
          if (bg.nm(SecurityAccountIntroUI.d(SecurityAccountIntroUI.this))) {
            localIntent.putExtra("rawUrl", String.format("https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android", new Object[] { paramAnonymousView }));
          }
          for (;;)
          {
            localIntent.putExtra("useJs", true);
            localIntent.putExtra("vertical_scroll", true);
            localIntent.putExtra("title", SecurityAccountIntroUI.this.getString(R.l.dUA));
            localIntent.putExtra("show_bottom", false);
            localIntent.putExtra("showShare", false);
            localIntent.putExtra("neverGetA8Key", true);
            localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
            localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
            a.hnH.j(localIntent, SecurityAccountIntroUI.this);
            GMTrace.o(12872419639296L, 95907);
            return;
            localIntent.putExtra("rawUrl", SecurityAccountIntroUI.d(SecurityAccountIntroUI.this));
          }
        }
      });
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12865440317440L, 95855);
        SecurityAccountIntroUI.e(SecurityAccountIntroUI.this);
        GMTrace.o(12865440317440L, 95855);
        return true;
      }
    });
    GMTrace.o(12866916712448L, 95866);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12867185147904L, 95868);
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!this.osj) {}
      for (paramString = ((s)paramk).Hy();; paramString = ((gm)((t)paramk).fUa.gtD.gtK).tSm)
      {
        w.d("MicroMsg.SecurityAccountIntroUI", "duanyi test authTicket_login = " + this.osh + "duanyi test authTicket_check = " + paramString);
        paramk = new Intent(this, SecurityAccountVerifyUI.class);
        paramk.putExtra("auth_ticket", paramString);
        paramk.putExtra("binded_mobile", this.eMW);
        paramk.putExtra("re_open_verify", this.osj);
        paramk.putExtra("from_source", getIntent().getIntExtra("from_source", 1));
        A(this, paramk);
        if (getIntent().getIntExtra("from_source", 1) == 3) {
          finish();
        }
        GMTrace.o(12867185147904L, 95868);
        return;
      }
    }
    int i;
    switch (paramInt2)
    {
    default: 
      i = 0;
    }
    while ((i != 0) || (a.hnI.a(this, paramInt1, paramInt2, paramString)))
    {
      GMTrace.o(12867185147904L, 95868);
      return;
      Toast.makeText(this, R.l.cSM, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, R.l.cZq, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, R.l.cZp, 0).show();
      i = 1;
      continue;
      h.a(this, R.l.cZm, R.l.cUG, null);
      i = 1;
    }
    Toast.makeText(this, getString(R.l.dUC, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(12867185147904L, 95868);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12866245623808L, 95861);
    int i = R.i.cFz;
    GMTrace.o(12866245623808L, 95861);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12866379841536L, 95862);
    super.onCreate(paramBundle);
    this.osh = getIntent().getStringExtra("auth_ticket");
    this.eMW = getIntent().getStringExtra("binded_mobile");
    this.osj = getIntent().getBooleanExtra("re_open_verify", false);
    paramBundle = getIntent().getStringExtra("close_safe_device_style");
    w.i("MicroMsg.SecurityAccountIntroUI", "summerphone authTicket[%s], showStyle[%s]", new Object[] { bg.SJ(this.osh), paramBundle });
    if (!bg.nm(paramBundle))
    {
      paramBundle = bh.q(paramBundle, "wording");
      if (paramBundle != null)
      {
        this.osi = ((String)paramBundle.get(".wording.title"));
        this.jumpUrl = ((String)paramBundle.get(".wording.url"));
        w.i("MicroMsg.SecurityAccountIntroUI", "summerphone closeBtnText[%s], jumpUrl[%s]", new Object[] { this.osi, this.jumpUrl });
      }
    }
    this.osl = com.tencent.mm.plugin.c.b.Qu();
    MP();
    GMTrace.o(12866379841536L, 95862);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12866782494720L, 95865);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bci();
      GMTrace.o(12866782494720L, 95865);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12866782494720L, 95865);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(12866648276992L, 95864);
    super.onPause();
    at.wS().b(145, this);
    at.wS().b(132, this);
    if (!this.osj) {
      com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",L600_100," + at.eK("L600_100") + ",2");
    }
    GMTrace.o(12866648276992L, 95864);
  }
  
  protected void onResume()
  {
    GMTrace.i(12866514059264L, 95863);
    super.onResume();
    at.wS().a(145, this);
    at.wS().a(132, this);
    if (!this.osj)
    {
      com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",L600_100," + at.eK("L600_100") + ",1");
      com.tencent.mm.plugin.c.b.ny("L600_100");
    }
    GMTrace.o(12866514059264L, 95863);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\ui\SecurityAccountIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */