package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.u;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.qn;
import com.tencent.mm.protocal.c.qo;
import com.tencent.mm.protocal.p.a;
import com.tencent.mm.protocal.p.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoSwitchEditText;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView.a;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;

public class EmailVerifyUI
  extends MMActivity
  implements e
{
  private ProgressDialog htG;
  private String osl;
  private TextView vPp;
  private TextView vPq;
  private MMAutoSwitchEditTextView vPr;
  private Button vPs;
  private Button vPt;
  private String vPu;
  private String vPv;
  private String vPw;
  private String vPx;
  private boolean vPy;
  
  public EmailVerifyUI()
  {
    GMTrace.i(2671872311296L, 19907);
    this.htG = null;
    this.vPy = false;
    GMTrace.o(2671872311296L, 19907);
  }
  
  private void goBack()
  {
    GMTrace.i(2672811835392L, 19914);
    b.nz(this.osl);
    finish();
    GMTrace.o(2672811835392L, 19914);
  }
  
  protected final void MP()
  {
    GMTrace.i(2672543399936L, 19912);
    oM(R.l.dRc);
    this.vPp = ((TextView)findViewById(R.h.cjW));
    String str = getString(R.l.dQP);
    this.vPp.setText(Html.fromHtml(str));
    this.vPq = ((TextView)findViewById(R.h.bvD));
    this.vPu = getIntent().getStringExtra("email_address");
    if (!bg.nm(this.vPu))
    {
      this.vPq.setText(this.vPu);
      this.vPw = getIntent().getStringExtra("password");
      this.vPv = getIntent().getStringExtra("email_login_page");
      w.i("MicroMsg.EmailVerifyUI", "user register:email add:[%s], password not allowed to printf, login page:[%s]", new Object[] { this.vPu, this.vPv });
      this.vPr = ((MMAutoSwitchEditTextView)findViewById(R.h.bfh));
      this.vPr.wbg = new MMAutoSwitchEditTextView.a()
      {
        public final void Vm(String paramAnonymousString)
        {
          GMTrace.i(2684488777728L, 20001);
          EmailVerifyUI.this.lf(true);
          EmailVerifyUI.a(EmailVerifyUI.this, paramAnonymousString);
          GMTrace.o(2684488777728L, 20001);
        }
      };
      this.vPr.wbh = new MMAutoSwitchEditTextView.b()
      {
        public final void bYq()
        {
          GMTrace.i(2767166898176L, 20617);
          EmailVerifyUI.this.lf(false);
          GMTrace.o(2767166898176L, 20617);
        }
      };
      this.vPt = ((Button)findViewById(R.h.bWp));
      this.vPt.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2680730681344L, 19973);
          b.nA(at.wN() + "," + getClass().getName() + ",R500_250," + at.eK("R500_250") + ",3");
          h.a(EmailVerifyUI.this, R.l.dQT, R.l.dQN, R.l.cTM, R.l.cSk, new DialogInterface.OnClickListener()
          {
            public final void onClick(final DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(2783004590080L, 20735);
              paramAnonymous2DialogInterface = new u(EmailVerifyUI.a(EmailVerifyUI.this), EmailVerifyUI.b(EmailVerifyUI.this));
              at.wS().a(paramAnonymous2DialogInterface, 0);
              EmailVerifyUI localEmailVerifyUI1 = EmailVerifyUI.this;
              EmailVerifyUI localEmailVerifyUI2 = EmailVerifyUI.this;
              EmailVerifyUI.this.getString(R.l.cUG);
              EmailVerifyUI.a(localEmailVerifyUI1, h.a(localEmailVerifyUI2, EmailVerifyUI.this.getString(R.l.dRb), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous3DialogInterface)
                {
                  GMTrace.i(2666235166720L, 19865);
                  at.wS().c(paramAnonymous2DialogInterface);
                  GMTrace.o(2666235166720L, 19865);
                }
              }));
              GMTrace.o(2783004590080L, 20735);
            }
          }, null);
          GMTrace.o(2680730681344L, 19973);
        }
      });
      this.vPs = ((Button)findViewById(R.h.bSr));
      if ((!bg.nm(this.vPv)) && (!bg.nm(this.vPu))) {
        break label322;
      }
      this.vPs.setVisibility(8);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2718311645184L, 20253);
          EmailVerifyUI.d(EmailVerifyUI.this);
          GMTrace.o(2718311645184L, 20253);
          return true;
        }
      });
      a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2707305791488L, 20171);
          EmailVerifyUI localEmailVerifyUI = EmailVerifyUI.this;
          Object localObject = EmailVerifyUI.e(EmailVerifyUI.this);
          paramAnonymousMenuItem = "";
          localObject = ((MMAutoSwitchEditTextView)localObject).wbe.iterator();
          if (((Iterator)localObject).hasNext())
          {
            MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)((Iterator)localObject).next();
            if (bg.nm(localMMAutoSwitchEditText.getText().toString().trim())) {
              break label172;
            }
            paramAnonymousMenuItem = paramAnonymousMenuItem + localMMAutoSwitchEditText.getText().toString().trim();
          }
          label172:
          for (;;)
          {
            break;
            EmailVerifyUI.b(localEmailVerifyUI, paramAnonymousMenuItem);
            if ((!bg.nm(EmailVerifyUI.f(EmailVerifyUI.this))) && (EmailVerifyUI.f(EmailVerifyUI.this).length() == 12)) {
              EmailVerifyUI.a(EmailVerifyUI.this, EmailVerifyUI.f(EmailVerifyUI.this));
            }
            for (;;)
            {
              GMTrace.o(2707305791488L, 20171);
              return true;
              EmailVerifyUI.this.lf(false);
            }
          }
        }
      });
      lf(false);
      GMTrace.o(2672543399936L, 19912);
      return;
      w.w("MicroMsg.EmailVerifyUI", "email add is null or nill");
      break;
      label322:
      this.vPs.setVisibility(0);
      this.vPs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2663013941248L, 19841);
          bg.E(EmailVerifyUI.this, EmailVerifyUI.c(EmailVerifyUI.this));
          GMTrace.o(2663013941248L, 19841);
        }
      });
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2672946053120L, 19915);
    w.i("MicroMsg.EmailVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    this.vPy = false;
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (paramk.getType() != 481)
    {
      w.e("MicroMsg.EmailVerifyUI", "error cgi type callback:[%d]", new Object[] { Integer.valueOf(paramk.getType()) });
      GMTrace.o(2672946053120L, 19915);
      return;
    }
    int j = ((p.a)((u)paramk).guL.DC()).tKF.tSK;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (j == 2)
      {
        b.nz("R200_900_email");
        paramString = new Intent(this, RegSetInfoUI.class);
        paramString.putExtra("regsetinfo_ticket", ((p.b)((u)paramk).guL.AZ()).tKG.ugx);
        paramString.putExtra("regsetinfo_user", this.vPu);
        paramString.putExtra("regsetinfo_ismobile", 3);
        paramString.putExtra("regsetinfo_NextStyle", ((u)paramk).HH());
        paramString.putExtra("regsetinfo_pwd", this.vPw);
        paramString.putExtra("regsetinfo_bind_email", this.vPu);
        startActivity(paramString);
        GMTrace.o(2672946053120L, 19915);
        return;
      }
      if (j == 1)
      {
        b.nA(at.wN() + "," + getClass().getName() + ",R22_resend_email_code_alert," + at.eK("R22_resend_email_code_alert") + ",3");
        h.bm(this, getString(R.l.dQV));
        GMTrace.o(2672946053120L, 19915);
        return;
      }
      w.e("MicroMsg.EmailVerifyUI", "err opcode");
      GMTrace.o(2672946053120L, 19915);
      return;
    }
    int i;
    if (a.hnI.a(this, paramInt1, paramInt2, paramString)) {
      i = 1;
    }
    while (i != 0)
    {
      GMTrace.o(2672946053120L, 19915);
      return;
      switch (paramInt2)
      {
      default: 
        i = 0;
        break;
      case -32: 
        h.a(this, R.l.dQO, R.l.dQN, null);
        b.nA(at.wN() + "," + getClass().getName() + ",R500_260," + at.eK("R500_260") + ",3");
        i = 1;
        break;
      case -33: 
        h.a(this, R.l.dQM, R.l.dQN, null);
        i = 1;
        break;
      case -34: 
        Toast.makeText(this, R.l.dQL, 0).show();
        i = 1;
      }
    }
    if (j == 2)
    {
      Toast.makeText(this, getString(R.l.dRd, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(2672946053120L, 19915);
      return;
    }
    if (j == 1) {
      Toast.makeText(this, getString(R.l.dQU, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
    GMTrace.o(2672946053120L, 19915);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2672409182208L, 19911);
    int i = R.i.cHl;
    GMTrace.o(2672409182208L, 19911);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2672006529024L, 19908);
    super.onCreate(paramBundle);
    MP();
    this.osl = b.Qu();
    GMTrace.o(2672006529024L, 19908);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2672677617664L, 19913);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(2672677617664L, 19913);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2672677617664L, 19913);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(2672274964480L, 19910);
    super.onPause();
    at.wS().b(481, this);
    b.b(false, at.wN() + "," + getClass().getName() + ",R500_200," + at.eK("R500_200") + ",2");
    GMTrace.o(2672274964480L, 19910);
  }
  
  protected void onResume()
  {
    GMTrace.i(2672140746752L, 19909);
    super.onResume();
    at.wS().a(481, this);
    b.b(true, at.wN() + "," + getClass().getName() + ",R500_200," + at.eK("R500_200") + ",1");
    b.ny("R500_200");
    GMTrace.o(2672140746752L, 19909);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\EmailVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */