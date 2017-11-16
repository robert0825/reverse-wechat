package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ap.b.a;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.MMKeyboardUperView;
import com.tencent.mm.ui.account.ResizeLayout;
import com.tencent.mm.ui.account.ResizeLayout.a;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.ui.widget.f.a;

public class MobileInputUI
  extends MMActivity
{
  protected String countryCode;
  protected String gLy;
  protected int gns;
  protected EditText kGe;
  protected int[] mGp;
  protected String nLL;
  protected String osl;
  protected TextView qud;
  private com.tencent.mm.sdk.b.c vPG;
  protected r vQR;
  private ResizeLayout vQr;
  protected CheckBox vRE;
  protected LinearLayout vRL;
  protected TextView vRM;
  protected String vRP;
  protected boolean vRQ;
  protected TextView vRU;
  protected Button vRV;
  protected Button vRW;
  protected MMFormInputView vRm;
  private MMKeyboardUperView vRp;
  protected boolean vRq;
  protected MMFormInputView vVH;
  protected EditText vVI;
  protected MMFormVerifyCodeInputView vVJ;
  protected View vVK;
  protected TextView vVL;
  protected TextView vVM;
  protected Button vVN;
  protected String vVO;
  private int vVP;
  private b vVQ;
  
  public MobileInputUI()
  {
    GMTrace.i(2592818069504L, 19318);
    this.vRQ = true;
    this.vVO = null;
    this.nLL = null;
    this.vRP = null;
    this.gLy = null;
    this.countryCode = null;
    this.vVP = 0;
    this.mGp = new int[5];
    this.vRq = false;
    this.vPG = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(2592818069504L, 19318);
  }
  
  private void bYF()
  {
    GMTrace.i(16811173085184L, 125253);
    if ((!bg.nm(this.gLy)) && (!bg.nm(this.countryCode)))
    {
      this.vRM.setText(an.eT(this.gLy, this.countryCode));
      GMTrace.o(16811173085184L, 125253);
      return;
    }
    this.vRM.setText(getString(R.l.dIL));
    GMTrace.o(16811173085184L, 125253);
  }
  
  private boolean bZe()
  {
    GMTrace.i(2593623375872L, 19324);
    if (this.vVP == 2)
    {
      GMTrace.o(2593623375872L, 19324);
      return true;
    }
    GMTrace.o(2593623375872L, 19324);
    return false;
  }
  
  private void bZf()
  {
    GMTrace.i(2593891811328L, 19326);
    aLo();
    this.vVQ.Bv(a.vVU);
    GMTrace.o(2593891811328L, 19326);
  }
  
  private void goBack()
  {
    GMTrace.i(2594026029056L, 19327);
    this.vVQ.Bv(a.vVT);
    com.tencent.mm.plugin.c.b.nz(this.osl);
    aLo();
    finish();
    GMTrace.o(2594026029056L, 19327);
  }
  
  protected final void MP()
  {
    GMTrace.i(2593757593600L, 19325);
    this.vRm = ((MMFormInputView)findViewById(R.h.ccw));
    this.kGe = this.vRm.nUE;
    com.tencent.mm.ui.tools.a.c.d(this.kGe).Ea(16).a(null);
    this.vVH = ((MMFormInputView)findViewById(R.h.bNO));
    this.vVH.setInputType(3);
    this.vVI = this.vVH.nUE;
    this.vVJ = ((MMFormVerifyCodeInputView)findViewById(R.h.cfr));
    this.vVJ.bZK();
    this.vRL = ((LinearLayout)findViewById(R.h.bsh));
    this.vRM = ((TextView)findViewById(R.h.bsj));
    this.vVK = findViewById(R.h.bXV);
    this.vRE = ((CheckBox)findViewById(R.h.bds));
    this.vRU = ((TextView)findViewById(R.h.bdt));
    this.vRV = ((Button)findViewById(R.h.bdr));
    this.vRW = ((Button)findViewById(R.h.bQR));
    this.vVL = ((TextView)findViewById(R.h.bYl));
    this.vVM = ((TextView)findViewById(R.h.bLy));
    this.qud = ((TextView)findViewById(R.h.bNN));
    this.vVN = ((Button)findViewById(R.h.bLr));
    this.vQr = ((ResizeLayout)findViewById(R.h.bYy));
    this.vRp = ((MMKeyboardUperView)findViewById(R.h.scrollView));
    this.vRL.setVisibility(8);
    this.vRm.setVisibility(8);
    this.vVJ.setVisibility(8);
    this.vVH.setVisibility(8);
    this.vVL.setVisibility(8);
    this.vVM.setVisibility(8);
    this.vRW.setVisibility(8);
    this.vVK.setVisibility(8);
    this.vVN.setVisibility(8);
    this.vRE.setVisibility(8);
    this.vRE.setChecked(true);
    this.vQr.vTZ = new ResizeLayout.a()
    {
      public final void bYy()
      {
        GMTrace.i(16814931181568L, 125281);
        MobileInputUI.c(MobileInputUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16810904649728L, 125251);
            MobileInputUI.c(MobileInputUI.this).fullScroll(130);
            GMTrace.o(16810904649728L, 125251);
          }
        });
        GMTrace.o(16814931181568L, 125281);
      }
    };
    this.vRp.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16816541794304L, 125293);
        MobileInputUI.this.aLo();
        GMTrace.o(16816541794304L, 125293);
        return false;
      }
    });
    this.vVI.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(16807683424256L, 125227);
        paramAnonymousEditable = MobileInputUI.this.vVH.getText().toString();
        if (MobileInputUI.a(MobileInputUI.this, paramAnonymousEditable))
        {
          MobileInputUI.this.vRW.setEnabled(true);
          GMTrace.o(16807683424256L, 125227);
          return;
        }
        MobileInputUI.this.vRW.setEnabled(false);
        GMTrace.o(16807683424256L, 125227);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16807817641984L, 125228);
        GMTrace.o(16807817641984L, 125228);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16807951859712L, 125229);
        GMTrace.o(16807951859712L, 125229);
      }
    });
    this.vVI.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16815736487936L, 125287);
        if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
        {
          boolean bool = MobileInputUI.d(MobileInputUI.this);
          GMTrace.o(16815736487936L, 125287);
          return bool;
        }
        GMTrace.o(16815736487936L, 125287);
        return false;
      }
    });
    this.vVI.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16815602270208L, 125286);
        if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
        {
          boolean bool = MobileInputUI.d(MobileInputUI.this);
          GMTrace.o(16815602270208L, 125286);
          return bool;
        }
        GMTrace.o(16815602270208L, 125286);
        return false;
      }
    });
    this.vRW.setEnabled(false);
    this.vRW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16808354512896L, 125232);
        MobileInputUI.e(MobileInputUI.this);
        GMTrace.o(16808354512896L, 125232);
      }
    });
    final Object localObject;
    if ((bg.nm(this.gLy)) || (bg.nm(this.countryCode)))
    {
      localObject = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      w.d("MicroMsg.MobileInputUI", "tm.getSimCountryIso()" + (String)localObject);
      if (!bg.nm((String)localObject)) {
        break label765;
      }
      w.e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
    }
    for (;;)
    {
      if ((bg.nm(this.gLy)) || (bg.nm(this.countryCode)))
      {
        this.gLy = getString(R.l.dlZ);
        this.countryCode = an.Sb(getString(R.l.dlY));
      }
      bYF();
      if (bg.nm(this.vRP)) {
        this.vVI.setText(this.vRP);
      }
      this.vRL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16807549206528L, 125226);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("country_name", MobileInputUI.this.gLy);
          paramAnonymousView.putExtra("couttry_code", MobileInputUI.this.countryCode);
          com.tencent.mm.plugin.c.a.hnH.b(paramAnonymousView, MobileInputUI.this);
          GMTrace.o(16807549206528L, 125226);
        }
      });
      localObject = new f(this, f.xpQ, false);
      ((f)localObject).qik = new p.c()
      {
        public final void a(n paramAnonymousn)
        {
          GMTrace.i(16806743900160L, 125220);
          if (paramAnonymousn.size() == 0)
          {
            paramAnonymousn.e(1, MobileInputUI.this.getString(R.l.dQE));
            paramAnonymousn.e(2, MobileInputUI.this.getString(R.l.dHc));
          }
          GMTrace.o(16806743900160L, 125220);
        }
      };
      ((f)localObject).qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(16812783697920L, 125265);
          switch (paramAnonymousMenuItem.getItemId())
          {
          default: 
            GMTrace.o(16812783697920L, 125265);
            return;
          case 1: 
            paramAnonymousMenuItem = MobileInputUI.this.getString(R.l.dHb) + v.bPK();
            MobileInputUI.bi(MobileInputUI.this, paramAnonymousMenuItem);
            GMTrace.o(16812783697920L, 125265);
            return;
          }
          paramAnonymousMenuItem = MobileInputUI.this.getString(R.l.ekM);
          if (v.bPK().equals("zh_CN")) {}
          for (paramAnonymousMenuItem = paramAnonymousMenuItem + "zh_CN";; paramAnonymousMenuItem = "https://help.wechat.com/cgi-bin/newreadtemplate?t=help_center/w_index&Channel=Client&lang=")
          {
            MobileInputUI.bi(MobileInputUI.this, paramAnonymousMenuItem);
            break;
          }
        }
      };
      ((f)localObject).xqc = new f.a()
      {
        public final void onDismiss()
        {
          GMTrace.i(16814260092928L, 125276);
          localObject.bFl();
          GMTrace.o(16814260092928L, 125276);
        }
      };
      sq("");
      cN().cO().setBackgroundDrawable(getResources().getDrawable(R.e.aOz));
      cN().cO().getCustomView().findViewById(R.h.divider).setVisibility(8);
      a(0, R.l.dgx, R.k.cIO, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(16806475464704L, 125218);
          MobileInputUI.this.aLo();
          localObject.bFk();
          GMTrace.o(16806475464704L, 125218);
          return true;
        }
      });
      GMTrace.o(2593757593600L, 19325);
      return;
      label765:
      localObject = com.tencent.mm.ap.b.h(this, (String)localObject, getString(R.l.bsf));
      if (localObject == null)
      {
        w.e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
      }
      else
      {
        this.countryCode = an.Sb(((b.a)localObject).gLx);
        this.gLy = ((b.a)localObject).gLy;
      }
    }
  }
  
  public void finish()
  {
    GMTrace.i(16811038867456L, 125252);
    super.finish();
    if (this.vVP == 1) {
      overridePendingTransition(R.a.aLj, R.a.aLj);
    }
    g.ork.i(14262, new Object[] { Integer.valueOf(this.mGp[0]), Integer.valueOf(this.mGp[1]), Integer.valueOf(this.mGp[2]), Integer.valueOf(this.mGp[3]), Integer.valueOf(this.mGp[4]) });
    GMTrace.o(16811038867456L, 125252);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2592952287232L, 19319);
    int i = R.i.cCs;
    GMTrace.o(2592952287232L, 19319);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2594294464512L, 19329);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 32047)
    {
      if (paramInt2 == -1)
      {
        if ((this.vVQ instanceof d)) {
          ((d)this.vVQ).vVB = 0;
        }
        for (;;)
        {
          this.vVQ.Bv(a.vVU);
          GMTrace.o(2594294464512L, 19329);
          return;
          if ((this.vVQ instanceof e)) {
            ((e)this.vVQ).vVB = 0;
          }
        }
      }
      if ((this.vVQ instanceof d))
      {
        ((d)this.vVQ).vVB = 1;
        GMTrace.o(2594294464512L, 19329);
        return;
      }
      if ((this.vVQ instanceof e))
      {
        ((e)this.vVQ).vVB = 1;
        GMTrace.o(2594294464512L, 19329);
      }
    }
    else if (paramInt1 == 32046)
    {
      if (paramInt2 == -1)
      {
        if ((this.vVQ instanceof d)) {
          ((d)this.vVQ).vVB = 2;
        }
        if ((this.vVQ instanceof e)) {
          ((e)this.vVQ).vVB = 2;
        }
        this.vVQ.Bv(a.vVU);
        GMTrace.o(2594294464512L, 19329);
      }
    }
    else if (paramInt1 == 32045)
    {
      if ((paramInt2 == -1) && ((this.vVQ instanceof e)))
      {
        if (paramIntent.hasExtra("VoiceLoginAuthPwd")) {
          ((e)this.vVQ).lnX = paramIntent.getStringExtra("VoiceLoginAuthPwd");
        }
        this.vVQ.Bv(a.vVU);
        GMTrace.o(2594294464512L, 19329);
      }
    }
    else
    {
      switch (paramInt2)
      {
      }
    }
    do
    {
      GMTrace.o(2594294464512L, 19329);
      return;
      this.gLy = bg.aq(paramIntent.getStringExtra("country_name"), "");
      this.countryCode = bg.aq(paramIntent.getStringExtra("couttry_code"), "");
      bYF();
      GMTrace.o(2594294464512L, 19329);
      return;
    } while ((paramInt1 != 1024) || (paramIntent == null));
    String str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
    paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
    boolean bool = bg.nm(str);
    if (bg.nm(str)) {}
    for (paramInt1 = 0;; paramInt1 = str.length())
    {
      w.d("MicroMsg.MobileInputUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != 65319) {
        break;
      }
      bZf();
      GMTrace.o(2594294464512L, 19329);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2593086504960L, 19320);
    super.onCreate(paramBundle);
    this.vVP = getIntent().getIntExtra("mobile_input_purpose", 0);
    this.gns = getIntent().getIntExtra("mobile_auth_type", 0);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16816407576576L, 125292);
        MobileInputUI.b(MobileInputUI.this);
        GMTrace.o(16816407576576L, 125292);
        return true;
      }
    }, R.k.cJD);
    switch (this.vVP)
    {
    case 0: 
    default: 
      w.e("MicroMsg.MobileInputUI", "wrong purpose %s", new Object[] { Integer.valueOf(this.vVP) });
      finish();
      GMTrace.o(2593086504960L, 19320);
      return;
    case 1: 
      if (!bg.nm(getIntent().getStringExtra("auth_ticket"))) {
        this.vVQ = new e();
      }
      break;
    }
    for (;;)
    {
      this.countryCode = an.Sb(bg.aq(getIntent().getStringExtra("input_country_code"), ""));
      this.gLy = bg.aq(getIntent().getStringExtra("country_name"), "");
      this.vRP = bg.aq(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
      this.vVO = an.Sc(this.countryCode);
      this.nLL = bg.aq(getIntent().getStringExtra("input_mobile_number"), "");
      this.osl = com.tencent.mm.plugin.c.b.Qu();
      MP();
      this.vRq = getIntent().getBooleanExtra("from_deep_link", false);
      if ((this.vRq) && (!bg.nm(this.vVO)) && (!bg.nm(this.nLL))) {
        this.vVH.setText(this.nLL);
      }
      this.vVQ.a(this);
      GMTrace.o(2593086504960L, 19320);
      return;
      paramBundle = getIntent().getIntArrayExtra("kv_report_login_method_data");
      if (paramBundle != null) {
        this.mGp = paramBundle;
      }
      this.vVQ = new c();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(16813186351104L, 125268);
          MobileInputUI.b(MobileInputUI.this);
          GMTrace.o(16813186351104L, 125268);
          return true;
        }
      }, R.k.cIN);
      overridePendingTransition(R.a.aLj, R.a.aLj);
      continue;
      this.vVQ = new d();
      continue;
      this.vVQ = new b();
      continue;
      this.vVQ = new d();
      continue;
      this.vVQ = new e();
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(2593489158144L, 19323);
    this.vVJ.reset();
    super.onDestroy();
    GMTrace.o(2593489158144L, 19323);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2594160246784L, 19328);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(2594160246784L, 19328);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2594160246784L, 19328);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2593354940416L, 19322);
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.vPG);
    this.vVQ.stop();
    GMTrace.o(2593354940416L, 19322);
  }
  
  public void onResume()
  {
    GMTrace.i(2593220722688L, 19321);
    com.tencent.mm.sdk.b.a.vgX.b(this.vPG);
    super.onResume();
    this.vVQ.start();
    aLs();
    GMTrace.o(2593220722688L, 19321);
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    GMTrace.i(2594428682240L, 19330);
    GMTrace.o(2594428682240L, 19330);
  }
  
  protected static enum a
  {
    static
    {
      GMTrace.i(2627983114240L, 19580);
      vVT = 1;
      vVU = 2;
      vVV = new int[] { vVT, vVU };
      GMTrace.o(2627983114240L, 19580);
    }
    
    public static int[] bZg()
    {
      GMTrace.i(2627848896512L, 19579);
      int[] arrayOfInt = (int[])vVV.clone();
      GMTrace.o(2627848896512L, 19579);
      return arrayOfInt;
    }
  }
  
  public static abstract interface b
  {
    public abstract void Bv(int paramInt);
    
    public abstract void a(MobileInputUI paramMobileInputUI);
    
    public abstract void start();
    
    public abstract void stop();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\MobileInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */