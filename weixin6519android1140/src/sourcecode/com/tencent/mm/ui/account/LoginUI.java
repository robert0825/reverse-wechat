package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
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
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.pluginsdk.i.o;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.MMClearEditText;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;

public class LoginUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private TextWatcher WD;
  private String eEU;
  private String eVw;
  private ProgressDialog htG;
  private int nvM;
  private String osh;
  private String osl;
  private SecurityImage vMf;
  private com.tencent.mm.sdk.b.c vPG;
  private f vQl;
  private String vQn;
  private String vQo;
  private ResizeLayout vQr;
  private com.tencent.mm.pluginsdk.i.a vQt;
  private MMClearEditText vRj;
  private MMClearEditText vRk;
  private MMFormInputView vRl;
  private MMFormInputView vRm;
  private Button vRn;
  private Button vRo;
  private MMKeyboardUperView vRp;
  private boolean vRq;
  
  public LoginUI()
  {
    GMTrace.i(2738712739840L, 20405);
    this.htG = null;
    this.eEU = null;
    this.vMf = null;
    this.vQl = new f();
    this.eVw = "";
    this.nvM = 0;
    this.WD = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(2710527016960L, 20195);
        LoginUI.a(LoginUI.this);
        GMTrace.o(2710527016960L, 20195);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2710661234688L, 20196);
        GMTrace.o(2710661234688L, 20196);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2710795452416L, 20197);
        GMTrace.o(2710795452416L, 20197);
      }
    };
    this.vRq = false;
    this.vPG = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(2738712739840L, 20405);
  }
  
  private void Wg()
  {
    GMTrace.i(2740189134848L, 20416);
    this.vQl.gUy = this.vRj.getText().toString().trim();
    this.vQl.vQY = this.vRk.getText().toString();
    if (this.vQl.gUy.equals(""))
    {
      h.h(this, R.l.ege, R.l.dHa);
      GMTrace.o(2740189134848L, 20416);
      return;
    }
    if (this.vQl.vQY.equals(""))
    {
      h.h(this, R.l.egb, R.l.dHa);
      GMTrace.o(2740189134848L, 20416);
      return;
    }
    aLo();
    at.wS().a(701, this);
    final u localu = new u(this.vQl.gUy, this.vQl.vQY, this.osh, 2);
    at.wS().a(localu, 0);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(16826205470720L, 125365);
        at.wS().c(localu);
        at.wS().b(701, LoginUI.this);
        GMTrace.o(16826205470720L, 125365);
      }
    });
    GMTrace.o(2740189134848L, 20416);
  }
  
  private void goBack()
  {
    GMTrace.i(2739786481664L, 20413);
    aLo();
    com.tencent.mm.plugin.c.b.nz(this.osl);
    com.tencent.mm.pluginsdk.model.app.p.bJC();
    finish();
    GMTrace.o(2739786481664L, 20413);
  }
  
  private boolean q(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(2739920699392L, 20414);
    if (com.tencent.mm.plugin.c.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2739920699392L, 20414);
      return true;
    }
    if (paramInt1 == 4) {}
    switch (paramInt2)
    {
    default: 
      paramString = new o(paramInt1, paramInt2, paramString);
      boolean bool = this.vQt.a(this, paramString);
      GMTrace.o(2739920699392L, 20414);
      return bool;
    case -1: 
      if (at.wS().DN() == 5)
      {
        h.h(this, R.l.dLj, R.l.dLi);
        GMTrace.o(2739920699392L, 20414);
        return true;
      }
      GMTrace.o(2739920699392L, 20414);
      return false;
    case -4: 
    case -3: 
      h.h(this, R.l.dqu, R.l.dHa);
      GMTrace.o(2739920699392L, 20414);
      return true;
    case -9: 
      h.h(this, R.l.dGZ, R.l.dHa);
      GMTrace.o(2739920699392L, 20414);
      return true;
    case -72: 
      h.h(this.vKB.vKW, R.l.dRN, R.l.cUG);
      GMTrace.o(2739920699392L, 20414);
      return true;
    case -75: 
      com.tencent.mm.platformtools.m.bw(this.vKB.vKW);
      GMTrace.o(2739920699392L, 20414);
      return true;
    case -311: 
    case -310: 
    case -6: 
      at.wS().a(701, this);
      if (this.vMf == null) {
        this.vMf = SecurityImage.a.a(this, R.l.dRU, this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb, new DialogInterface.OnClickListener()
        {
          public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(16826473906176L, 125367);
            if (LoginUI.g(LoginUI.this) == null)
            {
              w.e("MicroMsg.LoginUI", "secimg is null!");
              GMTrace.o(16826473906176L, 125367);
              return;
            }
            w.d("MicroMsg.LoginUI", "imgSid:" + LoginUI.h(LoginUI.this).vRa + " img len" + LoginUI.h(LoginUI.this).vRc.length + " " + com.tencent.mm.compatible.util.g.tC());
            paramAnonymousDialogInterface = new u(LoginUI.h(LoginUI.this).gUy, LoginUI.h(LoginUI.this).vQY, LoginUI.h(LoginUI.this).vRd, LoginUI.g(LoginUI.this).bZo(), LoginUI.g(LoginUI.this).vRa, LoginUI.g(LoginUI.this).vRb, 2, "", false, false);
            at.wS().a(paramAnonymousDialogInterface, 0);
            LoginUI localLoginUI1 = LoginUI.this;
            LoginUI localLoginUI2 = LoginUI.this;
            LoginUI.this.getString(R.l.cUG);
            LoginUI.a(localLoginUI1, h.a(localLoginUI2, LoginUI.this.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(2637915226112L, 19654);
                at.wS().c(paramAnonymousDialogInterface);
                at.wS().b(701, LoginUI.this);
                GMTrace.o(2637915226112L, 19654);
              }
            }));
            GMTrace.o(16826473906176L, 125367);
          }
        }, null, new DialogInterface.OnDismissListener()
        {
          public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(16823923769344L, 125348);
            LoginUI.i(LoginUI.this);
            GMTrace.o(16823923769344L, 125348);
          }
        }, this.vQl);
      }
      for (;;)
      {
        GMTrace.o(2739920699392L, 20414);
        return true;
        w.d("MicroMsg.LoginUI", "imgSid:" + this.vQl.vRa + " img len" + this.vQl.vRc.length + " " + com.tencent.mm.compatible.util.g.tC());
        this.vMf.a(this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb);
      }
    case -100: 
      at.hold();
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      if (TextUtils.isEmpty(at.wy())) {}
      for (paramString = com.tencent.mm.br.a.X(this.vKB.vKW, R.l.dHY);; paramString = at.wy())
      {
        h.a(localActionBarActivity, paramString, this.vKB.vKW.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(16842714251264L, 125488);
            LoginUI.j(LoginUI.this);
            GMTrace.o(16842714251264L, 125488);
          }
        }, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(16820434108416L, 125322);
            LoginUI.j(LoginUI.this);
            GMTrace.o(16820434108416L, 125322);
          }
        });
        GMTrace.o(2739920699392L, 20414);
        return true;
      }
    case -205: 
      w.i("MicroMsg.LoginUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bg.SJ(this.osh), this.vQo });
      f.a(this.vQl);
      com.tencent.mm.plugin.c.b.nz("L600_100");
      paramString = new Intent();
      paramString.putExtra("auth_ticket", this.osh);
      paramString.putExtra("binded_mobile", this.vQn);
      paramString.putExtra("close_safe_device_style", this.vQo);
      paramString.putExtra("from_source", 1);
      com.tencent.mm.plugin.c.a.hnH.f(this, paramString);
      GMTrace.o(2739920699392L, 20414);
      return true;
    }
    if (!bg.nm(this.eVw)) {
      com.tencent.mm.platformtools.m.j(this, paramString, this.eVw);
    }
    GMTrace.o(2739920699392L, 20414);
    return true;
  }
  
  protected final void MP()
  {
    GMTrace.i(2739518046208L, 20411);
    this.vRl = ((MMFormInputView)findViewById(R.h.bLp));
    this.vRm = ((MMFormInputView)findViewById(R.h.bLu));
    this.vRj = ((MMClearEditText)this.vRl.nUE);
    this.vRj.setFocusableInTouchMode(false);
    this.vRj.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16834124316672L, 125424);
        LoginUI.b(LoginUI.this).setFocusableInTouchMode(true);
        boolean bool = LoginUI.b(LoginUI.this).qLG.onTouch(paramAnonymousView, paramAnonymousMotionEvent);
        GMTrace.o(16834124316672L, 125424);
        return bool;
      }
    });
    this.vRk = ((MMClearEditText)this.vRm.nUE);
    this.vRk.setFocusableInTouchMode(false);
    this.vRk.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16820031455232L, 125319);
        LoginUI.c(LoginUI.this).setFocusableInTouchMode(true);
        LoginUI.b(LoginUI.this).setFocusableInTouchMode(false);
        boolean bool = LoginUI.c(LoginUI.this).qLG.onTouch(paramAnonymousView, paramAnonymousMotionEvent);
        GMTrace.o(16820031455232L, 125319);
        return bool;
      }
    });
    com.tencent.mm.ui.tools.a.c.d(this.vRk).Ea(16).a(null);
    this.vRn = ((Button)findViewById(R.h.bLq));
    this.vRn.setEnabled(false);
    this.vRo = ((Button)findViewById(R.h.bLr));
    this.vQr = ((ResizeLayout)findViewById(R.h.bYy));
    this.vRp = ((MMKeyboardUperView)findViewById(R.h.scrollView));
    this.vQr.vTZ = new ResizeLayout.a()
    {
      public final void bYy()
      {
        GMTrace.i(16827144994816L, 125372);
        LoginUI.d(LoginUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16817481318400L, 125300);
            LoginUI.d(LoginUI.this).fullScroll(130);
            GMTrace.o(16817481318400L, 125300);
          }
        });
        GMTrace.o(16827144994816L, 125372);
      }
    };
    this.vRp.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16805133287424L, 125208);
        LoginUI.this.aLo();
        GMTrace.o(16805133287424L, 125208);
        return false;
      }
    });
    boolean bool = com.tencent.mm.ap.b.Jt();
    final Object localObject = findViewById(R.h.bzF);
    if (!bool) {}
    for (int i = 8;; i = 0)
    {
      ((View)localObject).setVisibility(i);
      ((View)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16827681865728L, 125376);
          LoginUI.this.startActivity(new Intent(LoginUI.this, FacebookLoginUI.class));
          GMTrace.o(16827681865728L, 125376);
        }
      });
      localObject = new com.tencent.mm.ui.widget.f(this, com.tencent.mm.ui.widget.f.xpQ, false);
      ((com.tencent.mm.ui.widget.f)localObject).qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(16838285066240L, 125455);
          if (paramAnonymousn.size() == 0)
          {
            paramAnonymousn.e(1, LoginUI.this.getString(R.l.dQE));
            paramAnonymousn.e(2, LoginUI.this.getString(R.l.dHc));
          }
          GMTrace.o(16838285066240L, 125455);
        }
      };
      ((com.tencent.mm.ui.widget.f)localObject).qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(16836808671232L, 125444);
          switch (paramAnonymousMenuItem.getItemId())
          {
          default: 
            GMTrace.o(16836808671232L, 125444);
            return;
          case 1: 
            ActionBarActivity localActionBarActivity = LoginUI.this.vKB.vKW;
            String str = bg.eC(localActionBarActivity) + "_" + System.currentTimeMillis();
            w.d("MicroMsg.ForgotPwdMenu", "cpan showProblemH5 randomID:%s", new Object[] { str });
            paramAnonymousMenuItem = localActionBarActivity.getString(R.l.dGY);
            if (v.bPK().equals("zh_CN")) {
              paramAnonymousMenuItem = paramAnonymousMenuItem + "zh_CN";
            }
            for (;;)
            {
              e.i(localActionBarActivity, paramAnonymousMenuItem + "&rid=" + str, false);
              com.tencent.mm.plugin.report.service.g.ork.i(11930, new Object[] { str, Integer.valueOf(3) });
              ab.getContext().getSharedPreferences("randomid_prefs", 4).edit().putString("randomID", str).commit();
              GMTrace.o(16836808671232L, 125444);
              return;
              if ((v.bPK().equals("zh_TW")) || (v.bPK().equals("zh_HK"))) {
                paramAnonymousMenuItem = paramAnonymousMenuItem + "zh_TW";
              } else {
                paramAnonymousMenuItem = paramAnonymousMenuItem + "en";
              }
            }
          }
          paramAnonymousMenuItem = LoginUI.this.getString(R.l.ekM);
          if (v.bPK().equals("zh_CN")) {}
          for (paramAnonymousMenuItem = paramAnonymousMenuItem + "zh_CN";; paramAnonymousMenuItem = "https://help.wechat.com/cgi-bin/newreadtemplate?t=help_center/w_index&Channel=Client&lang=")
          {
            LoginUI.bh(LoginUI.this, paramAnonymousMenuItem);
            break;
          }
        }
      };
      ((com.tencent.mm.ui.widget.f)localObject).xqc = new f.a()
      {
        public final void onDismiss()
        {
          GMTrace.i(16823386898432L, 125344);
          localObject.bFl();
          GMTrace.o(16823386898432L, 125344);
        }
      };
      sq("");
      cN().cO().setBackgroundDrawable(getResources().getDrawable(R.e.aOz));
      cN().cO().getCustomView().findViewById(R.h.divider).setVisibility(8);
      a(0, R.l.dgx, R.k.cIO, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(16822984245248L, 125341);
          LoginUI.this.aLo();
          localObject.bFk();
          GMTrace.o(16822984245248L, 125341);
          return true;
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(16847009218560L, 125520);
          LoginUI.e(LoginUI.this);
          GMTrace.o(16847009218560L, 125520);
          return true;
        }
      }, R.k.cIN);
      this.vRn.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16838956154880L, 125460);
          LoginUI.f(LoginUI.this);
          GMTrace.o(16838956154880L, 125460);
        }
      });
      this.vRo.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16805401722880L, 125210);
          paramAnonymousView = new Intent(LoginUI.this, MobileInputUI.class);
          int[] arrayOfInt = new int[5];
          arrayOfInt[0] = 2;
          paramAnonymousView.putExtra("mobile_input_purpose", 1);
          paramAnonymousView.putExtra("kv_report_login_method_data", arrayOfInt);
          LoginUI.this.startActivity(paramAnonymousView);
          LoginUI.this.finish();
          GMTrace.o(16805401722880L, 125210);
        }
      });
      this.osh = getIntent().getStringExtra("auth_ticket");
      if (!bg.nm(this.osh))
      {
        this.vRj.setText(bg.nl(f.bYz()));
        this.vRk.setText(bg.nl(f.bYA()));
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2660061151232L, 19819);
            LoginUI.f(LoginUI.this);
            GMTrace.o(2660061151232L, 19819);
          }
        }, 500L);
      }
      this.vRj.addTextChangedListener(this.WD);
      this.vRk.addTextChangedListener(this.WD);
      this.vRk.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(16845398605824L, 125508);
          if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
          {
            LoginUI.f(LoginUI.this);
            GMTrace.o(16845398605824L, 125508);
            return true;
          }
          GMTrace.o(16845398605824L, 125508);
          return false;
        }
      });
      this.vRk.setOnKeyListener(new View.OnKeyListener()
      {
        public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(16820165672960L, 125320);
          if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
          {
            LoginUI.f(LoginUI.this);
            GMTrace.o(16820165672960L, 125320);
            return true;
          }
          GMTrace.o(16820165672960L, 125320);
          return false;
        }
      });
      if (com.tencent.mm.sdk.platformtools.f.vhu) {
        com.tencent.mm.plugin.c.a.hnI.e(this);
      }
      localObject = getIntent().getStringExtra("login_username");
      this.vRq = getIntent().getBooleanExtra("from_deep_link", false);
      if (!bg.nm((String)localObject)) {
        this.vRj.setText((CharSequence)localObject);
      }
      GMTrace.o(2739518046208L, 20411);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(2740054917120L, 20415);
    w.i("MicroMsg.LoginUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (paramk.getType() != 701)
    {
      GMTrace.o(2740054917120L, 20415);
      return;
    }
    at.wS().b(701, this);
    this.eVw = ((u)paramk).Lu();
    this.vQl.vRa = ((u)paramk).HQ();
    this.vQl.vRc = ((u)paramk).HP();
    this.vQl.vRb = ((u)paramk).Lw();
    this.vQl.vRd = ((u)paramk).Lv();
    if (paramInt2 == 65331)
    {
      this.osh = ((u)paramk).Hy();
      this.vQn = ((u)paramk).Lx();
      this.vQo = ((u)paramk).LA();
    }
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17))) {
      at.wS().a(new bf(new bf.a()
      {
        public final void a(com.tencent.mm.network.e paramAnonymouse)
        {
          GMTrace.i(16843251122176L, 125492);
          if (paramAnonymouse == null)
          {
            GMTrace.o(16843251122176L, 125492);
            return;
          }
          paramAnonymouse = paramAnonymouse.DY();
          at.AR();
          int i = com.tencent.mm.y.c.ww();
          paramAnonymouse.i(new byte[0], i);
          GMTrace.o(16843251122176L, 125492);
        }
      }), 0);
    }
    for (int i = 1;; i = 0)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        at.unhold();
        com.tencent.mm.platformtools.m.nh(this.vQl.gUy);
        com.tencent.mm.modelsimple.d.bk(this);
        com.tencent.mm.platformtools.m.a(this, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16848082960384L, 125528);
            w.d("MicroMsg.LoginUI", "onSceneEnd, in runnable");
            Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(LoginUI.this);
            localIntent.addFlags(67108864);
            localIntent.putExtra("kstyle_show_bind_mobile_afterauth", ((u)paramk).Ly());
            localIntent.putExtra("kstyle_bind_wording", ((u)paramk).Lz());
            localIntent.putExtra("kstyle_bind_recommend_show", ((u)paramk).LB());
            LoginUI.this.startActivity(localIntent);
            LoginUI.this.finish();
            GMTrace.o(16848082960384L, 125528);
          }
        }, false, 2);
        com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R200_900_phone," + at.eK("R200_900_phone") + ",4");
        if (this.vRq)
        {
          paramString = ab.getContext().getSharedPreferences("randomid_prefs", 4).getString("randomID", "");
          com.tencent.mm.plugin.report.service.g.ork.i(11930, new Object[] { paramString, Integer.valueOf(4) });
        }
        GMTrace.o(2740054917120L, 20415);
        return;
      }
      if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.m.b(this, paramString, 32644);
        GMTrace.o(2740054917120L, 20415);
        return;
      }
      if (paramInt2 == 65319)
      {
        com.tencent.mm.platformtools.m.a(this, com.tencent.mm.pluginsdk.a.a.a((u)paramk), paramInt2);
        GMTrace.o(2740054917120L, 20415);
        return;
      }
      if (paramInt2 == -30)
      {
        if ((com.tencent.mm.protocal.d.tJF) && (!com.tencent.mm.protocal.d.tJH))
        {
          paramString = new Intent();
          paramString.putExtra("rawUrl", this.eVw);
          paramString.putExtra("showShare", false);
          paramString.putExtra("show_bottom", false);
          paramString.putExtra("needRedirect", false);
          paramString.putExtra("neverGetA8Key", true);
          paramString.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          paramString.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          com.tencent.mm.plugin.c.a.hnH.j(paramString, this);
          GMTrace.o(2740054917120L, 20415);
          return;
        }
        com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R400_100_login," + at.eK("R400_100_login") + ",1");
        h.a(this, getString(R.l.dHn), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(16846069694464L, 125513);
            com.tencent.mm.plugin.c.b.nz("R400_100_login");
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.putExtra("regsetinfo_binduin", LoginUI.h(LoginUI.this).gUy);
            paramAnonymousDialogInterface.putExtra("regsetinfo_pwd", LoginUI.h(LoginUI.this).vQY);
            paramAnonymousDialogInterface.putExtra("regsetinfo_ismobile", 0);
            paramAnonymousDialogInterface.putExtra("regsetinfo_ticket", LoginUI.k(LoginUI.this));
            paramAnonymousDialogInterface.putExtra("regsetinfo_NextControl", ((u)paramk).HD());
            paramAnonymousDialogInterface.setClass(LoginUI.this, RegSetInfoUI.class);
            LoginUI.this.vKB.vKW.startActivity(paramAnonymousDialogInterface);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + LoginUI.this.getClass().getName() + ",R400_100_login," + at.eK("R400_100_login") + ",2");
            GMTrace.o(16846069694464L, 125513);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(16848485613568L, 125531);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + LoginUI.this.getClass().getName() + ",R400_100_login," + at.eK("R400_100_login") + ",2");
            GMTrace.o(16848485613568L, 125531);
          }
        });
        GMTrace.o(2740054917120L, 20415);
        return;
      }
      if (q(paramInt1, paramInt2, paramString))
      {
        GMTrace.o(2740054917120L, 20415);
        return;
      }
      if (paramInt2 == -5)
      {
        Toast.makeText(this, getString(R.l.dHl), 0).show();
        GMTrace.o(2740054917120L, 20415);
        return;
      }
      if (paramk.getType() == 701)
      {
        paramString = com.tencent.mm.h.a.dH(paramString);
        if ((paramString != null) && (paramString.a(this, null, null)))
        {
          GMTrace.o(2740054917120L, 20415);
          return;
        }
      }
      Toast.makeText(this, getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(2740054917120L, 20415);
      return;
    }
  }
  
  public void finish()
  {
    GMTrace.i(16835063840768L, 125431);
    super.finish();
    overridePendingTransition(R.a.aLj, R.a.aLj);
    GMTrace.o(16835063840768L, 125431);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2738846957568L, 20406);
    int i = R.i.cAS;
    GMTrace.o(2738846957568L, 20406);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    GMTrace.i(2740323352576L, 20417);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      w.d("MicroMsg.LoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (paramInt2 != -1) {
        break label242;
      }
      if ((paramInt1 != 1024) || (paramIntent == null)) {
        break label203;
      }
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bg.nm(str);
      if (!bg.nm(str)) {
        break label184;
      }
    }
    label184:
    for (paramInt1 = i;; paramInt1 = str.length())
    {
      w.d("MicroMsg.LoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != 65319) {
        break label193;
      }
      this.vQl.vQY = str;
      Wg();
      GMTrace.o(2740323352576L, 20417);
      return;
      bool = false;
      break;
    }
    label193:
    GMTrace.o(2740323352576L, 20417);
    return;
    label203:
    if (paramInt1 == 32644)
    {
      if ((paramIntent != null) && (paramIntent.hasExtra("VoiceLoginAuthPwd"))) {
        this.vQl.vQY = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      }
      Wg();
    }
    label242:
    GMTrace.o(2740323352576L, 20417);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2738981175296L, 20407);
    super.onCreate(paramBundle);
    paramBundle = "";
    if (com.tencent.mm.protocal.d.tJF) {
      paramBundle = getString(R.l.app_name) + getString(R.l.cRD);
    }
    this.nvM = getIntent().getIntExtra("login_type", 0);
    sq(paramBundle);
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.osl = com.tencent.mm.plugin.c.b.Qu();
    MP();
    this.vQt = new com.tencent.mm.pluginsdk.i.a();
    paramBundle = getIntent().getIntArrayExtra("kv_report_login_method_data");
    if (paramBundle != null) {
      com.tencent.mm.plugin.report.service.g.ork.i(14262, new Object[] { Integer.valueOf(paramBundle[0]), Integer.valueOf(paramBundle[1]), Integer.valueOf(paramBundle[2]), Integer.valueOf(paramBundle[3]), Integer.valueOf(paramBundle[4]) });
    }
    GMTrace.o(2738981175296L, 20407);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2739383828480L, 20410);
    if (this.vQt != null) {
      this.vQt.close();
    }
    at.wS().b(701, this);
    super.onDestroy();
    GMTrace.o(2739383828480L, 20410);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2739652263936L, 20412);
    if (paramInt == 4)
    {
      goBack();
      GMTrace.o(2739652263936L, 20412);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2739652263936L, 20412);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2739249610752L, 20409);
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.vPG);
    if (this.nvM == 0)
    {
      com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",L100_100_logout," + at.eK("L100_100_logout") + ",2");
      GMTrace.o(2739249610752L, 20409);
      return;
    }
    if (this.nvM == 1) {
      com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",L400_100_login," + at.eK("L400_100_login") + ",2");
    }
    GMTrace.o(2739249610752L, 20409);
  }
  
  public void onResume()
  {
    GMTrace.i(2739115393024L, 20408);
    com.tencent.mm.sdk.b.a.vgX.b(this.vPG);
    super.onResume();
    if (this.nvM == 0)
    {
      com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",L100_100_logout," + at.eK("L100_100_logout") + ",1");
      com.tencent.mm.plugin.c.b.ny("L100_100_logout");
      GMTrace.o(2739115393024L, 20408);
      return;
    }
    if (this.nvM == 1)
    {
      com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",L400_100_login," + at.eK("L400_100_login") + ",1");
      com.tencent.mm.plugin.c.b.ny("L400_100_login");
    }
    GMTrace.o(2739115393024L, 20408);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\LoginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */