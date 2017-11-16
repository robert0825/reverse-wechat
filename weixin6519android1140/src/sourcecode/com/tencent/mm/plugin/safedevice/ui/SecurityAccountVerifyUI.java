package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.modelfriend.t;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.Map;

public class SecurityAccountVerifyUI
  extends MMWizardActivity
  implements com.tencent.mm.ad.e
{
  private String eKL;
  private String eKN;
  private String eMW;
  private aj euU;
  private ProgressDialog htG;
  private String osh;
  private Button osk;
  private String osl;
  private EditText osp;
  private TextView osq;
  private TextView osr;
  private Button oss;
  private boolean ost;
  
  public SecurityAccountVerifyUI()
  {
    GMTrace.i(12861548003328L, 95826);
    this.htG = null;
    this.ost = false;
    GMTrace.o(12861548003328L, 95826);
  }
  
  private void bci()
  {
    GMTrace.i(12862621745152L, 95834);
    cancel();
    Bh(1);
    GMTrace.o(12862621745152L, 95834);
  }
  
  private boolean q(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool = true;
    GMTrace.i(12862890180608L, 95836);
    if (com.tencent.mm.plugin.c.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(12862890180608L, 95836);
      return true;
    }
    switch (paramInt2)
    {
    default: 
      bool = false;
    }
    for (;;)
    {
      GMTrace.o(12862890180608L, 95836);
      return bool;
      h.a(this.vKB.vKW, R.l.cZY, R.l.bhd, null);
      continue;
      h.a(this.vKB.vKW, R.l.cZX, R.l.bhd, null);
      continue;
      Toast.makeText(this, R.l.cZq, 0).show();
      continue;
      Toast.makeText(this.vKB.vKW, R.l.cSM, 0).show();
      continue;
      Toast.makeText(this.vKB.vKW, R.l.cZp, 0).show();
      continue;
      h.a(this.vKB.vKW, R.l.cZm, R.l.cUG, null);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(12862353309696L, 95832);
    this.eMW = getIntent().getStringExtra("binded_mobile");
    this.osh = getIntent().getStringExtra("auth_ticket");
    this.ost = getIntent().getBooleanExtra("re_open_verify", false);
    this.osp = ((EditText)findViewById(R.h.bhc));
    this.osq = ((TextView)findViewById(R.h.bNP));
    this.osr = ((TextView)findViewById(R.h.bYx));
    this.oss = ((Button)findViewById(R.h.bYw));
    this.osp.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(12876043517952L, 95934);
        if ((paramAnonymousEditable != null) && (!bg.nm(paramAnonymousEditable.toString()))) {}
        for (boolean bool = true;; bool = false)
        {
          SecurityAccountVerifyUI.this.lf(bool);
          GMTrace.o(12876043517952L, 95934);
          return;
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12875909300224L, 95933);
        GMTrace.o(12875909300224L, 95933);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12875775082496L, 95932);
        GMTrace.o(12875775082496L, 95932);
      }
    });
    this.osq.setText(bg.SG(this.eMW));
    this.osr.setTag(Integer.valueOf(60));
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12876580388864L, 95938);
        int i = ((Integer)SecurityAccountVerifyUI.a(SecurityAccountVerifyUI.this).getTag()).intValue();
        if (i <= 1)
        {
          SecurityAccountVerifyUI.b(SecurityAccountVerifyUI.this).setVisibility(0);
          SecurityAccountVerifyUI.a(SecurityAccountVerifyUI.this).setVisibility(8);
          GMTrace.o(12876580388864L, 95938);
          return false;
        }
        i -= 1;
        SecurityAccountVerifyUI.a(SecurityAccountVerifyUI.this).setTag(Integer.valueOf(i));
        SecurityAccountVerifyUI.a(SecurityAccountVerifyUI.this).setText(SecurityAccountVerifyUI.this.getString(R.l.dUB, new Object[] { Integer.valueOf(i) }));
        if (SecurityAccountVerifyUI.a(SecurityAccountVerifyUI.this).getVisibility() != 0) {
          SecurityAccountVerifyUI.a(SecurityAccountVerifyUI.this).setVisibility(0);
        }
        GMTrace.o(12876580388864L, 95938);
        return true;
      }
    }, true);
    this.oss.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(12871882768384L, 95903);
        w.v("MicroMsg.SecurityAccountVerifyUI", "on resend verify code button click");
        SecurityAccountVerifyUI.b(SecurityAccountVerifyUI.this).setVisibility(8);
        SecurityAccountVerifyUI.a(SecurityAccountVerifyUI.this).setTag(Integer.valueOf(60));
        SecurityAccountVerifyUI.c(SecurityAccountVerifyUI.this).stopTimer();
        SecurityAccountVerifyUI.c(SecurityAccountVerifyUI.this).z(1000L, 1000L);
        paramAnonymousView = new s(SecurityAccountVerifyUI.d(SecurityAccountVerifyUI.this), 10, "", 0, "", SecurityAccountVerifyUI.e(SecurityAccountVerifyUI.this));
        at.wS().a(paramAnonymousView, 0);
        SecurityAccountVerifyUI localSecurityAccountVerifyUI = SecurityAccountVerifyUI.this;
        ActionBarActivity localActionBarActivity = SecurityAccountVerifyUI.this.vKB.vKW;
        SecurityAccountVerifyUI.this.getString(R.l.cUG);
        SecurityAccountVerifyUI.a(localSecurityAccountVerifyUI, h.a(localActionBarActivity, SecurityAccountVerifyUI.this.getString(R.l.dUD), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(12877654130688L, 95946);
            at.wS().c(paramAnonymousView);
            GMTrace.o(12877654130688L, 95946);
          }
        }));
        GMTrace.o(12871882768384L, 95903);
      }
    });
    if (!this.ost)
    {
      this.osk = ((Button)findViewById(R.h.bpq));
      this.osk.setVisibility(0);
      this.osk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12877922566144L, 95948);
          b.nA(at.wN() + "," + getClass().getName() + ",L600_300," + at.eK("L600_300") + ",1");
          paramAnonymousView = v.d(SecurityAccountVerifyUI.this.getSharedPreferences(ab.bPU(), 0));
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", String.format("https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android", new Object[] { paramAnonymousView }));
          localIntent.putExtra("useJs", true);
          localIntent.putExtra("vertical_scroll", true);
          localIntent.putExtra("title", SecurityAccountVerifyUI.this.getString(R.l.dUA));
          localIntent.putExtra("show_bottom", false);
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("neverGetA8Key", true);
          localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          com.tencent.mm.plugin.c.a.hnH.j(localIntent, SecurityAccountVerifyUI.this);
          GMTrace.o(12877922566144L, 95948);
        }
      });
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12865708752896L, 95857);
        SecurityAccountVerifyUI.f(SecurityAccountVerifyUI.this);
        GMTrace.o(12865708752896L, 95857);
        return true;
      }
    });
    a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12869332631552L, 95884);
        paramAnonymousMenuItem = SecurityAccountVerifyUI.g(SecurityAccountVerifyUI.this).getText().toString().trim();
        if (bg.nm(paramAnonymousMenuItem))
        {
          h.h(SecurityAccountVerifyUI.this, R.l.dad, R.l.cUG);
          GMTrace.o(12869332631552L, 95884);
          return true;
        }
        SecurityAccountVerifyUI.this.aLo();
        SecurityAccountVerifyUI.a(SecurityAccountVerifyUI.this, com.tencent.mm.plugin.safedevice.a.e.da(SecurityAccountVerifyUI.this));
        SecurityAccountVerifyUI.b(SecurityAccountVerifyUI.this, com.tencent.mm.plugin.safedevice.a.e.bcd());
        if (!SecurityAccountVerifyUI.h(SecurityAccountVerifyUI.this)) {}
        for (paramAnonymousMenuItem = new s(SecurityAccountVerifyUI.d(SecurityAccountVerifyUI.this), paramAnonymousMenuItem, "", SecurityAccountVerifyUI.e(SecurityAccountVerifyUI.this), SecurityAccountVerifyUI.i(SecurityAccountVerifyUI.this), SecurityAccountVerifyUI.j(SecurityAccountVerifyUI.this));; paramAnonymousMenuItem = new t(SecurityAccountVerifyUI.d(SecurityAccountVerifyUI.this), 11, paramAnonymousMenuItem, "", SecurityAccountVerifyUI.i(SecurityAccountVerifyUI.this), SecurityAccountVerifyUI.j(SecurityAccountVerifyUI.this)))
        {
          at.wS().a(paramAnonymousMenuItem, 0);
          SecurityAccountVerifyUI localSecurityAccountVerifyUI1 = SecurityAccountVerifyUI.this;
          SecurityAccountVerifyUI localSecurityAccountVerifyUI2 = SecurityAccountVerifyUI.this;
          SecurityAccountVerifyUI.this.getString(R.l.cUG);
          SecurityAccountVerifyUI.a(localSecurityAccountVerifyUI1, h.a(localSecurityAccountVerifyUI2, SecurityAccountVerifyUI.this.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(12871614332928L, 95901);
              at.wS().c(paramAnonymousMenuItem);
              GMTrace.o(12871614332928L, 95901);
            }
          }));
          GMTrace.o(12869332631552L, 95884);
          return true;
        }
      }
    });
    lf(false);
    oM(R.l.dUx);
    this.euU.z(1000L, 1000L);
    GMTrace.o(12862353309696L, 95832);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12862755962880L, 95835);
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(12862755962880L, 95835);
      return;
      paramk = (s)paramk;
      if (paramk.CD() == 10)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          w.i("MicroMsg.SecurityAccountVerifyUI", "resend verify code successfully");
          GMTrace.o(12862755962880L, 95835);
          return;
        }
        w.w("MicroMsg.SecurityAccountVerifyUI", "resend verify code fail, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (q(paramInt1, paramInt2, paramString))
        {
          GMTrace.o(12862755962880L, 95835);
          return;
        }
        Toast.makeText(this.vKB.vKW, getString(R.l.dUC, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        GMTrace.o(12862755962880L, 95835);
        return;
      }
      if (paramk.CD() == 11)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.osh = paramk.Hy();
          w.d("MicroMsg.SecurityAccountVerifyUI", "duanyi test bind opmobile verify authticket = " + this.osh);
          paramInt1 = getIntent().getIntExtra("from_source", 1);
          Intent localIntent = new Intent();
          localIntent.putExtra("from_source", paramInt1);
          localIntent.putExtra("binded_mobile", this.eMW);
          switch (paramInt1)
          {
          case 4: 
          default: 
            Bh(1);
            GMTrace.o(12862755962880L, 95835);
            return;
          case 3: 
            localIntent.addFlags(67108864);
            localIntent.putExtra("auth_ticket", this.osh);
            paramk = getIntent().getStringExtra("WizardTransactionId");
            paramString = paramk;
            if (paramk == null) {
              paramString = "";
            }
            paramString = (Intent)vMN.get(paramString);
            vMN.clear();
            if (paramString != null) {
              com.tencent.mm.plugin.safedevice.a.a(this, localIntent, paramString);
            }
            for (;;)
            {
              finish();
              GMTrace.o(12862755962880L, 95835);
              return;
              com.tencent.mm.plugin.safedevice.a.a(this, localIntent, null);
            }
          }
          localIntent.addFlags(67108864);
          localIntent.putExtra("auth_ticket", this.osh);
          com.tencent.mm.plugin.safedevice.a.a(this, localIntent, null);
          finish();
          GMTrace.o(12862755962880L, 95835);
          return;
        }
        w.w("MicroMsg.SecurityAccountVerifyUI", "verify verify-code fail, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (q(paramInt1, paramInt2, paramString))
        {
          GMTrace.o(12862755962880L, 95835);
          return;
        }
        Toast.makeText(this.vKB.vKW, getString(R.l.dUE, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        GMTrace.o(12862755962880L, 95835);
        return;
      }
      w.w("MicroMsg.SecurityAccountVerifyUI", "unknow bind mobile for reg op code %d, errType %d, errCode %d", new Object[] { Integer.valueOf(paramk.CD()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(12862755962880L, 95835);
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.safedevice.a.e.r(true, true);
        paramString = new Intent(this, MySafeDeviceListUI.class);
        paramString.addFlags(67108864);
        startActivity(paramString);
        finish();
        GMTrace.o(12862755962880L, 95835);
        return;
      }
      if (q(paramInt1, paramInt2, paramString))
      {
        GMTrace.o(12862755962880L, 95835);
        return;
      }
      Toast.makeText(this, getString(R.l.dUE, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12861682221056L, 95827);
    int i = R.i.cFB;
    GMTrace.o(12861682221056L, 95827);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12861816438784L, 95828);
    super.onCreate(paramBundle);
    this.osl = b.Qu();
    MP();
    GMTrace.o(12861816438784L, 95828);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12862219091968L, 95831);
    super.onDestroy();
    this.euU.stopTimer();
    GMTrace.o(12862219091968L, 95831);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12862487527424L, 95833);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bci();
      GMTrace.o(12862487527424L, 95833);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12862487527424L, 95833);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(12862084874240L, 95830);
    at.wS().b(145, this);
    at.wS().b(132, this);
    super.onPause();
    if (!this.ost) {
      b.b(false, at.wN() + "," + getClass().getName() + ",L600_200," + at.eK("L600_200") + ",2");
    }
    GMTrace.o(12862084874240L, 95830);
  }
  
  protected void onResume()
  {
    GMTrace.i(12861950656512L, 95829);
    at.wS().a(145, this);
    at.wS().a(132, this);
    super.onResume();
    if (!this.ost)
    {
      b.b(true, at.wN() + "," + getClass().getName() + ",L600_200," + at.eK("L600_200") + ",1");
      b.ny("L600_200");
    }
    GMTrace.o(12861950656512L, 95829);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\ui\SecurityAccountVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */