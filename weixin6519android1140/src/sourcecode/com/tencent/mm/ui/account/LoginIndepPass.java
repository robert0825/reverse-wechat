package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.ui.account.mobile.MobileVerifyUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;

public class LoginIndepPass
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private String eVw;
  private String gUy;
  private ProgressDialog htG;
  private String osh;
  private String osl;
  private SecurityImage vMf;
  private com.tencent.mm.sdk.b.c vPG;
  private EditText vQO;
  private String vQP;
  private Button vQQ;
  private r vQR;
  private f vQl;
  private String vQn;
  private String vQo;
  
  public LoginIndepPass()
  {
    GMTrace.i(2666637819904L, 19868);
    this.htG = null;
    this.vMf = null;
    this.vQl = new f();
    this.vPG = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(2666637819904L, 19868);
  }
  
  private void Wg()
  {
    GMTrace.i(2667577344000L, 19875);
    final Object localObject = this.vQO.getText().toString();
    if (bg.nm(this.gUy))
    {
      h.h(this, R.l.ege, R.l.dHa);
      GMTrace.o(2667577344000L, 19875);
      return;
    }
    if (((String)localObject).equals(""))
    {
      h.h(this, R.l.egb, R.l.dHa);
      GMTrace.o(2667577344000L, 19875);
      return;
    }
    aLo();
    at.wS().a(701, this);
    localObject = new u(this.gUy, (String)localObject, null, 1);
    at.wS().a((k)localObject, 0);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2671201222656L, 19902);
        at.wS().c(localObject);
        GMTrace.o(2671201222656L, 19902);
      }
    });
    GMTrace.o(2667577344000L, 19875);
  }
  
  private boolean q(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(2667845779456L, 19877);
    if (com.tencent.mm.plugin.c.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2667845779456L, 19877);
      return true;
    }
    if (paramInt1 == 4) {}
    switch (paramInt2)
    {
    default: 
      GMTrace.o(2667845779456L, 19877);
      return false;
    case -1: 
      if (at.wS().DN() == 5)
      {
        h.h(this, R.l.dLj, R.l.dLi);
        GMTrace.o(2667845779456L, 19877);
        return true;
      }
      GMTrace.o(2667845779456L, 19877);
      return false;
    case -4: 
    case -3: 
      h.h(this, R.l.dqu, R.l.dHa);
      GMTrace.o(2667845779456L, 19877);
      return true;
    case -9: 
      h.h(this, R.l.dGZ, R.l.dHa);
      GMTrace.o(2667845779456L, 19877);
      return true;
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
            GMTrace.i(2753610907648L, 20516);
            GMTrace.o(2753610907648L, 20516);
          }
        }, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(2660329586688L, 19821);
            GMTrace.o(2660329586688L, 19821);
          }
        });
        GMTrace.o(2667845779456L, 19877);
        return true;
      }
    }
    if (!bg.nm(this.eVw)) {
      com.tencent.mm.platformtools.m.j(this.vKB.vKW, paramString, this.eVw);
    }
    GMTrace.o(2667845779456L, 19877);
    return true;
  }
  
  protected final void MP()
  {
    GMTrace.i(2667443126272L, 19874);
    this.vQO = ((EditText)findViewById(R.h.bHl));
    this.vQQ = ((Button)findViewById(R.h.bLx));
    lf(false);
    a(0, getString(R.l.dHf), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2712137629696L, 20207);
        LoginIndepPass.a(LoginIndepPass.this);
        GMTrace.o(2712137629696L, 20207);
        return true;
      }
    });
    this.vQO.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(2743544578048L, 20441);
        LoginIndepPass.b(LoginIndepPass.this);
        GMTrace.o(2743544578048L, 20441);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2743678795776L, 20442);
        GMTrace.o(2743678795776L, 20442);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2743813013504L, 20443);
        GMTrace.o(2743813013504L, 20443);
      }
    });
    this.vQO.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(2642747064320L, 19690);
        if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
        {
          LoginIndepPass.a(LoginIndepPass.this);
          GMTrace.o(2642747064320L, 19690);
          return true;
        }
        GMTrace.o(2642747064320L, 19690);
        return false;
      }
    });
    this.vQO.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(2749987028992L, 20489);
        if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
        {
          LoginIndepPass.a(LoginIndepPass.this);
          GMTrace.o(2749987028992L, 20489);
          return true;
        }
        GMTrace.o(2749987028992L, 20489);
        return false;
      }
    });
    this.vQQ.setText(getString(R.l.dHi));
    this.vQQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2652813393920L, 19765);
        h.a(LoginIndepPass.this, LoginIndepPass.this.getString(R.l.dRJ) + LoginIndepPass.c(LoginIndepPass.this), LoginIndepPass.this.getString(R.l.dRK), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(final DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(2719116951552L, 20259);
            at.wS().a(145, LoginIndepPass.this);
            paramAnonymous2DialogInterface = new s(LoginIndepPass.d(LoginIndepPass.this), 16, "", 0, "");
            at.wS().a(paramAnonymous2DialogInterface, 0);
            LoginIndepPass localLoginIndepPass1 = LoginIndepPass.this;
            LoginIndepPass localLoginIndepPass2 = LoginIndepPass.this;
            LoginIndepPass.this.getString(R.l.cUG);
            LoginIndepPass.a(localLoginIndepPass1, h.a(localLoginIndepPass2, LoginIndepPass.this.getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous3DialogInterface)
              {
                GMTrace.i(2732941377536L, 20362);
                at.wS().c(paramAnonymous2DialogInterface);
                at.wS().b(701, LoginIndepPass.this);
                GMTrace.o(2732941377536L, 20362);
              }
            }));
            GMTrace.o(2719116951552L, 20259);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(2760724447232L, 20569);
            GMTrace.o(2760724447232L, 20569);
          }
        });
        GMTrace.o(2652813393920L, 19765);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2678583197696L, 19957);
        b.nz("L200_100");
        paramAnonymousMenuItem = new Intent(LoginIndepPass.this, MobileInputUI.class);
        paramAnonymousMenuItem.putExtra("mobile_input_purpose", 1);
        paramAnonymousMenuItem.addFlags(67108864);
        LoginIndepPass.this.startActivity(paramAnonymousMenuItem);
        LoginIndepPass.this.finish();
        GMTrace.o(2678583197696L, 19957);
        return true;
      }
    });
    this.osh = getIntent().getStringExtra("auth_ticket");
    if (!bg.nm(this.osh)) {
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2783273025536L, 20737);
          LoginIndepPass.a(LoginIndepPass.this, f.bYz(), f.bYA());
          GMTrace.o(2783273025536L, 20737);
        }
      }, 500L);
    }
    GMTrace.o(2667443126272L, 19874);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2667711561728L, 19876);
    w.i("MicroMsg.LoginIndepPass", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (this.vQR != null)
    {
      this.vQR.dismiss();
      this.vQR = null;
    }
    if (paramk.getType() == 701)
    {
      this.eVw = ((u)paramk).Lu();
      at.wS().b(701, this);
      this.vQl.vRa = ((u)paramk).HQ();
      this.vQl.vRc = ((u)paramk).HP();
      this.vQl.vRb = ((u)paramk).Lw();
      this.vQl.vRd = ((u)paramk).Lv();
      this.vQl.gUy = this.gUy;
      this.vQl.vQY = this.vQO.getText().toString();
      int j = 0;
      if (paramInt2 == -75)
      {
        com.tencent.mm.platformtools.m.bw(this.vKB.vKW);
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.m.b(this, paramString, 0);
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      if (paramInt2 == 65319)
      {
        com.tencent.mm.platformtools.m.a(this, com.tencent.mm.pluginsdk.a.a.a((u)paramk), paramInt2);
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      if (paramInt2 == 65331)
      {
        this.osh = ((u)paramk).Hy();
        this.vQn = ((u)paramk).Lx();
        this.vQo = ((u)paramk).LA();
        w.i("MicroMsg.LoginIndepPass", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bg.SJ(this.osh), this.vQo });
        f.a(this.vQl);
        paramString = new Intent();
        paramString.putExtra("auth_ticket", this.osh);
        paramString.putExtra("binded_mobile", this.vQn);
        paramString.putExtra("close_safe_device_style", this.vQo);
        paramString.putExtra("from_source", 5);
        com.tencent.mm.plugin.c.a.hnH.f(this, paramString);
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      if (paramInt2 == 65396)
      {
        if (!bg.nm(this.eVw)) {
          com.tencent.mm.platformtools.m.j(this, paramString, this.eVw);
        }
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      int i = j;
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
              GMTrace.i(2733880901632L, 20369);
              if (paramAnonymouse == null)
              {
                GMTrace.o(2733880901632L, 20369);
                return;
              }
              paramAnonymouse = paramAnonymouse.DY();
              at.AR();
              int i = com.tencent.mm.y.c.ww();
              paramAnonymouse.i(new byte[0], i);
              GMTrace.o(2733880901632L, 20369);
            }
          }), 0);
        }
      }
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        at.wS().a(701, this);
        if (this.vMf == null)
        {
          this.vMf = SecurityImage.a.a(this.vKB.vKW, R.l.dRU, this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb, new DialogInterface.OnClickListener()
          {
            public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2679925374976L, 19967);
              w.d("MicroMsg.LoginIndepPass", "imgSid:" + LoginIndepPass.e(LoginIndepPass.this).vRa + " img len" + LoginIndepPass.e(LoginIndepPass.this).vRc.length + " " + g.tC());
              paramAnonymousDialogInterface = new u(LoginIndepPass.e(LoginIndepPass.this).gUy, LoginIndepPass.e(LoginIndepPass.this).vQY, LoginIndepPass.e(LoginIndepPass.this).vRd, LoginIndepPass.f(LoginIndepPass.this).bZo(), LoginIndepPass.f(LoginIndepPass.this).vRa, LoginIndepPass.f(LoginIndepPass.this).vRb, 1, "", false, false);
              at.wS().a(paramAnonymousDialogInterface, 0);
              LoginIndepPass localLoginIndepPass1 = LoginIndepPass.this;
              LoginIndepPass localLoginIndepPass2 = LoginIndepPass.this;
              LoginIndepPass.this.getString(R.l.cUG);
              LoginIndepPass.a(localLoginIndepPass1, h.a(localLoginIndepPass2, LoginIndepPass.this.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(2669590609920L, 19890);
                  at.wS().c(paramAnonymousDialogInterface);
                  at.wS().b(701, LoginIndepPass.this);
                  GMTrace.o(2669590609920L, 19890);
                }
              }));
              GMTrace.o(2679925374976L, 19967);
            }
          }, null, new DialogInterface.OnDismissListener()
          {
            public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(2671469658112L, 19904);
              LoginIndepPass.g(LoginIndepPass.this);
              GMTrace.o(2671469658112L, 19904);
            }
          }, this.vQl);
          GMTrace.o(2667711561728L, 19876);
          return;
        }
        w.d("MicroMsg.LoginIndepPass", "imgSid:" + this.vQl.vRa + " img len" + this.vQl.vRc.length + " " + g.tC());
        this.vMf.a(this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb);
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        at.unhold();
        com.tencent.mm.platformtools.m.nh(this.vQl.gUy);
        com.tencent.mm.modelsimple.d.bk(this);
        com.tencent.mm.platformtools.m.a(this, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2711063887872L, 20199);
            w.d("MicroMsg.LoginIndepPass", "onSceneEnd, in runnable");
            Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(LoginIndepPass.this);
            localIntent.addFlags(67108864);
            LoginIndepPass.this.startActivity(localIntent);
            LoginIndepPass.this.finish();
            GMTrace.o(2711063887872L, 20199);
          }
        }, false, 2);
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      if (q(paramInt1, paramInt2, paramString))
      {
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      if (paramk.getType() == 701)
      {
        paramString = com.tencent.mm.h.a.dH(paramString);
        if ((paramString != null) && (paramString.a(this, null, null)))
        {
          GMTrace.o(2667711561728L, 19876);
          return;
        }
      }
      Toast.makeText(this, getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(2667711561728L, 19876);
      return;
    }
    if (paramk.getType() == 145)
    {
      at.wS().b(145, this);
      paramString = ((s)paramk).Hz();
      if (paramInt2 == -41)
      {
        h.h(this, R.l.dRp, R.l.dRq);
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      if (paramInt2 == -75)
      {
        h.b(this, getString(R.l.cRF), "", true);
        GMTrace.o(2667711561728L, 19876);
        return;
      }
      b.nz("L3");
      b.b(true, at.wN() + "," + getClass().getName() + ",L3," + at.eK("L3") + ",1");
      Intent localIntent = new Intent();
      localIntent.putExtra("bindmcontact_mobile", this.vQP);
      localIntent.putExtra("bindmcontact_shortmobile", paramString);
      localIntent.putExtra("mobile_verify_purpose", 1);
      localIntent.putExtra("login_type", 3);
      localIntent.putExtra("mobileverify_countdownsec", ((s)paramk).HE());
      localIntent.putExtra("mobileverify_countdownstyle", ((s)paramk).HF());
      localIntent.putExtra("mobileverify_fb", ((s)paramk).HG());
      a(MobileVerifyUI.class, localIntent);
      GMTrace.o(2667711561728L, 19876);
      return;
    }
    if (q(paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2667711561728L, 19876);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      Toast.makeText(this, getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
    GMTrace.o(2667711561728L, 19876);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2666772037632L, 19869);
    int i = R.i.cAU;
    GMTrace.o(2666772037632L, 19869);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    GMTrace.i(2667979997184L, 19878);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      w.d("MicroMsg.LoginIndepPass", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 != -1) || (paramInt1 != 1024) || (paramIntent == null)) {
        break label184;
      }
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bg.nm(str);
      if (!bg.nm(str)) {
        break label175;
      }
    }
    label175:
    for (paramInt1 = i;; paramInt1 = str.length())
    {
      w.d("MicroMsg.LoginIndepPass", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != 65319) {
        break label184;
      }
      Wg();
      GMTrace.o(2667979997184L, 19878);
      return;
      bool = false;
      break;
    }
    label184:
    GMTrace.o(2667979997184L, 19878);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2666906255360L, 19870);
    super.onCreate(paramBundle);
    paramBundle = getString(R.l.dHd);
    if (com.tencent.mm.protocal.d.tJF) {
      paramBundle = getString(R.l.app_name) + getString(R.l.cRD);
    }
    sq(paramBundle);
    this.vQP = getIntent().getStringExtra("bindmcontact_mobile");
    if (this.vQP != null) {
      this.gUy = an.Sa(this.vQP);
    }
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.osl = b.Qu();
    MP();
    GMTrace.o(2666906255360L, 19870);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2667308908544L, 19873);
    at.wS().b(701, this);
    super.onDestroy();
    GMTrace.o(2667308908544L, 19873);
  }
  
  public void onPause()
  {
    GMTrace.i(2667174690816L, 19872);
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.vPG);
    b.b(false, at.wN() + "," + getClass().getName() + ",L200_200," + at.eK("L200_200") + ",2");
    GMTrace.o(2667174690816L, 19872);
  }
  
  public void onResume()
  {
    GMTrace.i(2667040473088L, 19871);
    com.tencent.mm.sdk.b.a.vgX.b(this.vPG);
    super.onResume();
    b.b(true, at.wN() + "," + getClass().getName() + ",L200_200," + at.eK("L200_200") + ",1");
    b.ny("L200_200");
    GMTrace.o(2667040473088L, 19871);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\LoginIndepPass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */