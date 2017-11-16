package com.tencent.mm.ui.account;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.a.a;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f.a;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class LoginHistoryUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private String eVw;
  private SharedPreferences ghC;
  protected ProgressDialog htG;
  protected int ibA;
  protected EditText kGe;
  protected int[] mGp;
  protected String osh;
  protected String qBY;
  protected LinearLayout sjB;
  private SecurityImage vMf;
  private com.tencent.mm.sdk.b.c vPG;
  private int vQA;
  private int vQB;
  private boolean vQC;
  private String vQD;
  private int vQE;
  private String vQF;
  private String vQG;
  private String vQH;
  private int vQI;
  private int vQJ;
  protected TextView vQf;
  protected Button vQg;
  protected Button vQh;
  protected View vQi;
  protected View vQj;
  protected View vQk;
  protected f vQl;
  protected String vQm;
  protected String vQn;
  private String vQo;
  private ImageView vQp;
  private MMKeyboardUperView vQq;
  private ResizeLayout vQr;
  protected String vQs;
  private com.tencent.mm.pluginsdk.i.a vQt;
  protected LinearLayout vQu;
  protected LinearLayout vQv;
  protected MMFormInputView vQw;
  protected MMFormVerifyCodeInputView vQx;
  protected boolean vQy;
  protected boolean vQz;
  
  public LoginHistoryUI()
  {
    GMTrace.i(2644626112512L, 19704);
    this.htG = null;
    this.vMf = null;
    this.vQl = new f();
    this.eVw = "";
    this.qBY = "";
    this.vQy = false;
    this.vQC = false;
    this.mGp = new int[5];
    this.vPG = new com.tencent.mm.sdk.b.c() {};
    this.vQJ = 0;
    GMTrace.o(2644626112512L, 19704);
  }
  
  private void Vn(String paramString)
  {
    GMTrace.i(2645968289792L, 19714);
    this.qBY = paramString;
    Wg();
    GMTrace.o(2645968289792L, 19714);
  }
  
  private void b(u paramu)
  {
    GMTrace.i(2646236725248L, 19716);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LoginHistoryUI", "checktask LoginHistoryUI startLauncher 0x%x, stack: %s", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(this);
    localIntent.addFlags(67108864);
    if (paramu != null)
    {
      localIntent.putExtra("kstyle_show_bind_mobile_afterauth", paramu.Ly());
      localIntent.putExtra("kstyle_bind_recommend_show", paramu.LB());
      localIntent.putExtra("kstyle_bind_wording", paramu.Lz());
    }
    startActivity(localIntent);
    finish();
    GMTrace.o(2646236725248L, 19716);
  }
  
  private void bYv()
  {
    GMTrace.i(19228434366464L, 143263);
    Intent localIntent = new Intent();
    localIntent.putExtra("regsetinfo_ticket", this.vQH);
    localIntent.putExtra("regsetinfo_user", this.vQn);
    localIntent.putExtra("regsetinfo_ismobile", 1);
    localIntent.putExtra("regsetinfo_NextControl", this.vQI);
    localIntent.putExtra("regsession_id", this.vQG);
    localIntent.setClass(this, RegSetInfoUI.class);
    com.tencent.mm.plugin.c.b.nz("R200_950_olduser");
    startActivity(localIntent);
    com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",L200_900_phone," + at.eK("L200_900_phone") + ",2");
    GMTrace.o(19228434366464L, 143263);
  }
  
  private void bYw()
  {
    GMTrace.i(19228568584192L, 143264);
    Intent localIntent = new Intent(this, ShowAgreementsUI.class);
    localIntent.putExtra("agreement_type", 0);
    startActivityForResult(localIntent, 31687);
    GMTrace.o(19228568584192L, 143264);
  }
  
  public static void bg(Context paramContext, String paramString)
  {
    GMTrace.i(2646773596160L, 19720);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
    com.tencent.mm.bj.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    GMTrace.o(2646773596160L, 19720);
  }
  
  private boolean q(final int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(16844056428544L, 125498);
    if (paramInt1 == 4) {}
    switch (paramInt2)
    {
    default: 
      if (!com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString)) {
        break label814;
      }
      if (this.vMf != null) {
        this.vMf.dismiss();
      }
      GMTrace.o(16844056428544L, 125498);
      return true;
    case -4: 
    case -3: 
      if (this.vQJ <= 0)
      {
        h.h(this, R.l.dqu, R.l.dHa);
        this.vQJ += 1;
      }
      for (;;)
      {
        GMTrace.o(16844056428544L, 125498);
        return true;
        h.a(this, getString(R.l.dqv), getString(R.l.dHa), getString(R.l.dqw), getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(16824997511168L, 125356);
            LoginHistoryUI.g(LoginHistoryUI.this);
            GMTrace.o(16824997511168L, 125356);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(16826608123904L, 125368);
            LoginHistoryUI.h(LoginHistoryUI.this);
            GMTrace.o(16826608123904L, 125368);
          }
        });
      }
    case -1: 
      if (at.wS().DN() == 5)
      {
        h.h(this, R.l.dLj, R.l.dLi);
        GMTrace.o(16844056428544L, 125498);
        return true;
      }
    case -9: 
      h.h(this, R.l.dGZ, R.l.dHa);
      GMTrace.o(16844056428544L, 125498);
      return true;
    case -72: 
      h.h(this, R.l.dRN, R.l.cUG);
      GMTrace.o(16844056428544L, 125498);
      return true;
    case -75: 
      com.tencent.mm.platformtools.m.bw(this);
      GMTrace.o(16844056428544L, 125498);
      return true;
    case -32: 
      h.a(this, getString(R.l.cZZ), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16847546089472L, 125524);
          GMTrace.o(16847546089472L, 125524);
        }
      });
      GMTrace.o(16844056428544L, 125498);
      return true;
    case -33: 
      h.a(this, R.l.cZX, R.l.bhd, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2784480985088L, 20746);
          GMTrace.o(2784480985088L, 20746);
        }
      });
      GMTrace.o(16844056428544L, 125498);
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
            GMTrace.i(19240379744256L, 143352);
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LoginHistoryUI", "imgSid:" + LoginHistoryUI.this.vQl.vRa + " img len" + LoginHistoryUI.this.vQl.vRc.length + " " + com.tencent.mm.compatible.util.g.tC());
            int j = paramInt1;
            if (LoginHistoryUI.this.qBY == null)
            {
              paramAnonymousInt = -1;
              paramAnonymousDialogInterface = bg.SJ(LoginHistoryUI.this.qBY);
              if (LoginHistoryUI.this.vQl.vQY != null) {
                break label387;
              }
            }
            label387:
            for (int i = -1;; i = LoginHistoryUI.this.vQl.vQY.length())
            {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LoginHistoryUI", "summervoice errType:%d, mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(paramAnonymousInt), paramAnonymousDialogInterface, Integer.valueOf(i), bg.SJ(LoginHistoryUI.this.vQl.vQY) });
              paramAnonymousDialogInterface = new u(LoginHistoryUI.this.vQl.gUy, LoginHistoryUI.this.vQl.vQY, LoginHistoryUI.this.vQl.vRd, LoginHistoryUI.i(LoginHistoryUI.this).bZo(), LoginHistoryUI.i(LoginHistoryUI.this).vRa, LoginHistoryUI.i(LoginHistoryUI.this).vRb, 0, "", false, false);
              if ((bg.nm(LoginHistoryUI.this.vQl.vQY)) && (!bg.nm(LoginHistoryUI.this.qBY)))
              {
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LoginHistoryUI", "summervoice resetMd5BeforeDoSceneByVoice mAuthPwd:", new Object[] { bg.SJ(LoginHistoryUI.this.qBY) });
                paramAnonymousDialogInterface.lp(LoginHistoryUI.this.qBY);
              }
              at.wS().a(paramAnonymousDialogInterface, 0);
              LoginHistoryUI localLoginHistoryUI1 = LoginHistoryUI.this;
              LoginHistoryUI localLoginHistoryUI2 = LoginHistoryUI.this;
              LoginHistoryUI.this.getString(R.l.cUG);
              localLoginHistoryUI1.htG = h.a(localLoginHistoryUI2, LoginHistoryUI.this.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(19240782397440L, 143355);
                  at.wS().c(paramAnonymousDialogInterface);
                  at.wS().b(701, LoginHistoryUI.this);
                  GMTrace.o(19240782397440L, 143355);
                }
              });
              GMTrace.o(19240379744256L, 143352);
              return;
              paramAnonymousInt = LoginHistoryUI.this.qBY.length();
              break;
            }
          }
        }, null, new DialogInterface.OnDismissListener()
        {
          public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(19233400422400L, 143300);
            LoginHistoryUI.j(LoginHistoryUI.this);
            GMTrace.o(19233400422400L, 143300);
          }
        }, this.vQl);
      }
      for (;;)
      {
        GMTrace.o(16844056428544L, 125498);
        return true;
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LoginHistoryUI", "imgSid:" + this.vQl.vRa + " img len" + this.vQl.vRc.length + " " + com.tencent.mm.compatible.util.g.tC());
        this.vMf.a(this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb);
      }
    case -100: 
      at.hold();
      if (TextUtils.isEmpty(at.wy())) {}
      for (paramString = com.tencent.mm.br.a.X(this, R.l.dHY);; paramString = at.wy())
      {
        h.a(this, paramString, getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19240513961984L, 143353);
            GMTrace.o(19240513961984L, 143353);
          }
        }, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(19224944705536L, 143237);
            GMTrace.o(19224944705536L, 143237);
          }
        });
        GMTrace.o(16844056428544L, 125498);
        return true;
      }
    case -205: 
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LoginHistoryUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bg.SJ(this.osh), this.vQo });
      f.a(this.vQl);
      paramString = new Intent();
      paramString.putExtra("auth_ticket", this.osh);
      paramString.putExtra("binded_mobile", this.vQn);
      paramString.putExtra("close_safe_device_style", this.vQo);
      paramString.putExtra("from_source", 2);
      com.tencent.mm.plugin.c.a.hnH.f(this, paramString);
      GMTrace.o(16844056428544L, 125498);
      return true;
    }
    if (!bg.nm(this.eVw)) {
      com.tencent.mm.platformtools.m.j(this, paramString, this.eVw);
    }
    GMTrace.o(16844056428544L, 125498);
    return true;
    label814:
    paramString = new com.tencent.mm.pluginsdk.i.o(paramInt1, paramInt2, paramString);
    boolean bool = this.vQt.a(this, paramString);
    GMTrace.o(16844056428544L, 125498);
    return bool;
  }
  
  protected final String Fp(String paramString)
  {
    GMTrace.i(16843653775360L, 125495);
    new an();
    String str1 = "86";
    Object localObject = paramString;
    if (this.vQs.startsWith("+"))
    {
      String str2 = paramString.replace("+", "");
      paramString = an.AL(str2);
      str1 = paramString;
      localObject = str2;
      if (paramString != null)
      {
        localObject = str2.substring(paramString.length());
        str1 = paramString;
      }
    }
    paramString = an.formatNumber(str1, (String)localObject);
    GMTrace.o(16843653775360L, 125495);
    return paramString;
  }
  
  protected final void MP()
  {
    GMTrace.i(2645431418880L, 19710);
    this.sjB = ((LinearLayout)findViewById(R.h.clB));
    this.vQv = ((LinearLayout)findViewById(R.h.byf));
    this.vQu = ((LinearLayout)findViewById(R.h.bAc));
    this.vQw = ((MMFormInputView)findViewById(R.h.bLv));
    this.vQx = ((MMFormVerifyCodeInputView)findViewById(R.h.cfr));
    this.vQs = as.gnb.B("login_user_name", "");
    final Object localObject = as.gnb.ghC.getString("last_avatar_path", "");
    if ((((String)localObject).length() == 0) || (((String)localObject).endsWith("last_avatar"))) {}
    for (;;)
    {
      this.vQB = bg.Sy(as.gnb.B("last_bind_info", "0"));
      if ((this.vQB & 0x1) != 0) {
        this.vQm = as.gnb.B("last_login_bind_qq", "");
      }
      if ((this.vQB & 0x4) != 0) {
        this.vQn = as.gnb.B("last_login_bind_mobile", "");
      }
      String str1 = getIntent().getStringExtra("email_address");
      if ((!bg.nm(str1)) && (!str1.equalsIgnoreCase(this.vQs))) {
        this.vQs = str1;
      }
      this.vQp = ((ImageView)findViewById(R.h.bJG));
      if (!bg.nm((String)localObject))
      {
        localObject = com.tencent.mm.ac.d.ia((String)localObject);
        if ((localObject != null) && (((Bitmap)localObject).getWidth() > 10)) {
          this.vQp.setImageBitmap(Bitmap.createBitmap((Bitmap)localObject, 5, 5, ((Bitmap)localObject).getWidth() - 10, ((Bitmap)localObject).getHeight() - 10, null, false));
        }
      }
      if ((!at.AT()) || (this.vQs.equals(""))) {
        break;
      }
      this.vQy = true;
      b(null);
      GMTrace.o(2645431418880L, 19710);
      return;
      String str2 = (String)localObject + ".bm";
      str1 = com.tencent.mm.compatible.util.e.ghv + "last_avatar";
      String str3 = str1 + ".bm";
      if ((FileOp.o((String)localObject, str1) > 0L) || (FileOp.o(str2, str3) > 0L))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LastLoginInfo", "Copy avatar: %s -> %s", new Object[] { str2, str3 });
        localObject = str1;
      }
      else
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.LastLoginInfo", "Can't find avatar file: " + str2);
      }
    }
    this.vQA = bg.Sy(as.gnb.B("last_login_use_voice", ""));
    this.vQq = ((MMKeyboardUperView)findViewById(R.h.scrollView));
    this.vQf = ((TextView)findViewById(R.h.bLp));
    this.kGe = this.vQw.nUE;
    this.vQg = ((Button)findViewById(R.h.bLq));
    this.vQi = findViewById(R.h.bLz);
    this.vQj = findViewById(R.h.bLt);
    this.vQk = ((Button)findViewById(R.h.ceQ));
    this.vQh = ((Button)findViewById(R.h.bLs));
    this.vQw.setVisibility(8);
    this.sjB.setVisibility(8);
    this.vQv.setVisibility(8);
    this.vQu.setVisibility(8);
    this.vQg.setVisibility(8);
    this.vQi.setVisibility(8);
    this.vQj.setVisibility(8);
    this.vQk.setVisibility(8);
    this.vQh.setVisibility(8);
    com.tencent.mm.ui.tools.a.c.d(this.kGe).eE(4, 16).a(null);
    this.vQr = ((ResizeLayout)findViewById(R.h.bYy));
    if ((bg.SH(this.vQs).booleanValue()) && (!this.vQs.equals(this.vQm)))
    {
      this.mGp[2] = 1;
      this.vQf.setText(Fp(this.vQs));
    }
    for (;;)
    {
      this.vQr.vTZ = new ResizeLayout.a()
      {
        public final void bYy()
        {
          GMTrace.i(16838150848512L, 125454);
          LoginHistoryUI.b(LoginHistoryUI.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16837211324416L, 125447);
              LoginHistoryUI.b(LoginHistoryUI.this).fullScroll(130);
              GMTrace.o(16837211324416L, 125447);
            }
          });
          GMTrace.o(16838150848512L, 125454);
        }
      };
      this.vQq.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(16805938593792L, 125214);
          LoginHistoryUI.this.aLo();
          GMTrace.o(16805938593792L, 125214);
          return false;
        }
      });
      localObject = new com.tencent.mm.ui.widget.f(this, com.tencent.mm.ui.widget.f.xpQ, false);
      ((com.tencent.mm.ui.widget.f)localObject).qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(16821105197056L, 125327);
          if (paramAnonymousn.size() == 0)
          {
            paramAnonymousn.em(7002, R.l.dGX);
            paramAnonymousn.em(7009, R.l.dQE);
            paramAnonymousn.em(7004, R.l.dHc);
            paramAnonymousn.em(7003, R.l.dDg);
          }
          GMTrace.o(16821105197056L, 125327);
        }
      };
      ((com.tencent.mm.ui.widget.f)localObject).qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(16846472347648L, 125516);
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(16846472347648L, 125516);
            return;
            paramAnonymousMenuItem = LoginHistoryUI.this.getString(R.l.dHb) + v.bPK();
            LoginHistoryUI.bg(LoginHistoryUI.this, paramAnonymousMenuItem);
            GMTrace.o(16846472347648L, 125516);
            return;
            LoginHistoryUI.c(LoginHistoryUI.this);
            GMTrace.o(16846472347648L, 125516);
            return;
            LoginHistoryUI.d(LoginHistoryUI.this);
            GMTrace.o(16846472347648L, 125516);
            return;
            LoginHistoryUI.e(LoginHistoryUI.this);
          }
        }
      };
      ((com.tencent.mm.ui.widget.f)localObject).xqc = new f.a()
      {
        public final void onDismiss()
        {
          GMTrace.i(16824594857984L, 125353);
          localObject.bFl();
          GMTrace.o(16824594857984L, 125353);
        }
      };
      sq("");
      bXw();
      cN().cO().setBackgroundDrawable(getResources().getDrawable(R.e.aOz));
      cN().cO().getCustomView().findViewById(R.h.divider).setVisibility(8);
      a(7000, R.l.dgx, R.k.cIO, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(16817212882944L, 125298);
          LoginHistoryUI.this.aLo();
          localObject.bFk();
          GMTrace.o(16817212882944L, 125298);
          return true;
        }
      });
      if (com.tencent.mm.sdk.platformtools.f.vhu) {
        com.tencent.mm.plugin.c.a.hnI.e(this);
      }
      GMTrace.o(2645431418880L, 19710);
      return;
      this.mGp[2] = 2;
      this.vQf.setText(this.vQs);
    }
  }
  
  protected void Wg()
  {
    GMTrace.i(2645565636608L, 19711);
    this.vQl.gUy = this.vQs.trim();
    GMTrace.o(2645565636608L, 19711);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, final k paramk)
  {
    GMTrace.i(2646102507520L, 19715);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LoginHistoryUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LoginHistoryUI", "Scene Type " + paramk.getType());
    if (paramk.getType() == 145)
    {
      if ((this.htG != null) && (this.htG.isShowing()))
      {
        this.htG.dismiss();
        this.htG = null;
      }
      i = ((s)paramk).CD();
      if (i == 16)
      {
        if (paramInt2 == -41)
        {
          h.h(this, R.l.dRp, R.l.dRq);
          this.vQx.reset();
          GMTrace.o(2646102507520L, 19715);
          return;
        }
        if (paramInt2 == -75)
        {
          h.b(this, getString(R.l.cRF), "", true);
          this.vQx.reset();
          GMTrace.o(2646102507520L, 19715);
        }
      }
      else if (i == 17)
      {
        this.vQE = paramInt2;
        this.vQF = paramString;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          new com.tencent.mm.ui.account.mobile.a(new a.a()
          {
            public final void b(ProgressDialog paramAnonymousProgressDialog)
            {
              GMTrace.i(16829829349376L, 125392);
              LoginHistoryUI.this.htG = paramAnonymousProgressDialog;
              GMTrace.o(16829829349376L, 125392);
            }
          }, ((s)paramk).getUsername(), ((s)paramk).Hw(), this.vQn).i(this);
          GMTrace.o(2646102507520L, 19715);
          return;
        }
        if (paramInt2 == -51)
        {
          paramString = com.tencent.mm.h.a.dH(paramString);
          if (paramString != null)
          {
            paramString.a(this, null, null);
            GMTrace.o(2646102507520L, 19715);
            return;
          }
          h.h(this, R.l.dQM, R.l.bhd);
          GMTrace.o(2646102507520L, 19715);
          return;
        }
        if ((paramInt2 == 65181) || (paramInt2 == -30))
        {
          com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",L200_900_phone," + at.eK("L200_900_phone") + ",1");
          this.vQH = ((s)paramk).Hx();
          this.vQI = ((s)paramk).HD();
          this.vQG = ((s)paramk).HL();
          if (com.tencent.mm.protocal.d.tJF)
          {
            paramString = getString(R.l.dmb, new Object[] { "0x" + Integer.toHexString(com.tencent.mm.protocal.d.tJC), v.bPK() });
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LoginHistoryUI", "url " + paramString);
            paramk = new Intent();
            paramk.putExtra("rawUrl", paramString);
            paramk.putExtra("showShare", false);
            paramk.putExtra("show_bottom", false);
            paramk.putExtra("needRedirect", false);
            paramk.putExtra("neverGetA8Key", true);
            paramk.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
            paramk.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
            com.tencent.mm.plugin.c.a.hnH.j(paramk, this);
            GMTrace.o(2646102507520L, 19715);
            return;
          }
          if (paramInt2 == 65181)
          {
            bYw();
            GMTrace.o(2646102507520L, 19715);
            return;
          }
          paramString = com.tencent.mm.h.a.dH(paramString);
          if (paramString != null) {
            paramString.a(this, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(19235547906048L, 143316);
                LoginHistoryUI.f(LoginHistoryUI.this);
                GMTrace.o(19235547906048L, 143316);
              }
            }, null);
          }
          GMTrace.o(2646102507520L, 19715);
        }
      }
    }
    else
    {
      if (paramk.getType() != 701) {
        break label1304;
      }
      this.eVw = ((u)paramk).Lu();
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LoginHistoryUI", "url " + this.eVw);
      at.wS().b(701, this);
      this.vQl.vRd = ((u)paramk).Lv();
      this.vQl.vRa = ((u)paramk).HQ();
      this.vQl.vRc = ((u)paramk).HP();
      this.vQl.vRb = ((u)paramk).Lw();
      if (paramInt2 == 65331)
      {
        this.osh = ((u)paramk).Hy();
        this.vQn = ((u)paramk).Lx();
        this.vQo = ((u)paramk).LA();
      }
      if ((paramInt1 != 4) || ((paramInt2 != -16) && (paramInt2 != -17))) {
        break label1430;
      }
      at.wS().a(new bf(new bf.a()
      {
        public final void a(com.tencent.mm.network.e paramAnonymouse)
        {
          GMTrace.i(19238769131520L, 143340);
          if (paramAnonymouse == null)
          {
            GMTrace.o(19238769131520L, 143340);
            return;
          }
          paramAnonymouse = paramAnonymouse.DY();
          at.AR();
          int i = com.tencent.mm.y.c.ww();
          paramAnonymouse.i(new byte[0], i);
          GMTrace.o(19238769131520L, 143340);
        }
      }), 0);
    }
    label1304:
    label1430:
    for (int i = 1;; i = 0)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        at.unhold();
        com.tencent.mm.modelsimple.d.bk(this);
        com.tencent.mm.platformtools.m.nh(this.vQl.gUy);
        if ((this.htG != null) && (this.htG.isShowing())) {
          this.htG.setMessage(getString(R.l.dZg));
        }
        b((u)paramk);
        if (this.ibA == 3)
        {
          this.vQz = ((u)paramk).LC();
          at.wS().a(255, this);
          paramString = new com.tencent.mm.modelsimple.w(1);
          at.wS().a(paramString, 0);
          getString(R.l.cUG);
          this.htG = h.a(this, getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(19235413688320L, 143315);
              at.wS().c(paramString);
              at.wS().b(255, LoginHistoryUI.this);
              GMTrace.o(19235413688320L, 143315);
            }
          });
        }
        GMTrace.o(2646102507520L, 19715);
        return;
      }
      if ((this.htG != null) && (this.htG.isShowing()))
      {
        this.htG.dismiss();
        this.htG = null;
      }
      if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.m.b(this, paramString, 31685);
        GMTrace.o(2646102507520L, 19715);
        return;
      }
      if (paramInt2 == 65319)
      {
        com.tencent.mm.platformtools.m.a(this, com.tencent.mm.pluginsdk.a.a.a((u)paramk), paramInt2);
        GMTrace.o(2646102507520L, 19715);
        return;
      }
      if (paramInt2 == -30)
      {
        if (com.tencent.mm.protocal.d.tJF)
        {
          bg(this.vKB.vKW, this.eVw);
          GMTrace.o(2646102507520L, 19715);
          return;
        }
        h.a(this, getString(R.l.dHn), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(16816944447488L, 125296);
            com.tencent.mm.plugin.c.b.nz("R400_100_login");
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.putExtra("regsetinfo_binduin", LoginHistoryUI.this.vQl.gUy);
            paramAnonymousDialogInterface.putExtra("regsetinfo_pwd", LoginHistoryUI.this.vQl.vQY);
            paramAnonymousDialogInterface.putExtra("regsetinfo_ismobile", 0);
            paramAnonymousDialogInterface.putExtra("regsetinfo_NextControl", ((u)paramk).HD());
            paramAnonymousDialogInterface.setClass(LoginHistoryUI.this, RegSetInfoUI.class);
            LoginHistoryUI.this.vKB.vKW.startActivity(paramAnonymousDialogInterface);
            GMTrace.o(16816944447488L, 125296);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(16825802817536L, 125362);
            GMTrace.o(16825802817536L, 125362);
          }
        });
        GMTrace.o(2646102507520L, 19715);
        return;
      }
      if (q(paramInt1, paramInt2, paramString))
      {
        GMTrace.o(2646102507520L, 19715);
        return;
      }
      paramk = com.tencent.mm.h.a.dH(paramString);
      if ((paramk != null) && (paramk.a(this, null, null)))
      {
        GMTrace.o(2646102507520L, 19715);
        return;
      }
      Toast.makeText(this, getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      while (q(paramInt1, paramInt2, paramString))
      {
        GMTrace.o(2646102507520L, 19715);
        return;
        if (paramk.getType() == 255)
        {
          if ((this.htG != null) && (this.htG.isShowing()))
          {
            this.htG.dismiss();
            this.htG = null;
          }
          at.wS().b(255, this);
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            boolean bool = this.vQz;
            paramString = new Intent(this, RegByMobileSetPwdUI.class);
            paramString.putExtra("kintent_hint", getString(R.l.dZu));
            paramString.putExtra("kintent_cancelable", bool);
            startActivity(paramString);
          }
          GMTrace.o(2646102507520L, 19715);
          return;
        }
      }
      GMTrace.o(2646102507520L, 19715);
      return;
    }
  }
  
  public final void aLo()
  {
    GMTrace.i(2645699854336L, 19712);
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(2645699854336L, 19712);
      return;
    }
    Object localObject = getCurrentFocus();
    if (localObject == null)
    {
      GMTrace.o(2645699854336L, 19712);
      return;
    }
    localObject = ((View)localObject).getWindowToken();
    if (localObject == null)
    {
      GMTrace.o(2645699854336L, 19712);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
    GMTrace.o(2645699854336L, 19712);
  }
  
  protected final void bYt()
  {
    GMTrace.i(16843787993088L, 125496);
    at.wS().a(701, this);
    GMTrace.o(16843787993088L, 125496);
  }
  
  protected final void bYu()
  {
    GMTrace.i(16843922210816L, 125497);
    at.wS().b(701, this);
    GMTrace.o(16843922210816L, 125497);
  }
  
  public boolean bYx()
  {
    GMTrace.i(2646907813888L, 19721);
    GMTrace.o(2646907813888L, 19721);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2646370942976L, 19717);
    int i = R.i.cAT;
    GMTrace.o(2646370942976L, 19717);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int j = 0;
    int i = 0;
    GMTrace.i(2645834072064L, 19713);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LoginHistoryUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (paramInt1 != 31687) {
        break label127;
      }
      if (paramInt2 != -1) {
        break label117;
      }
      if (this.vQE != 65181) {
        break;
      }
      com.tencent.mm.platformtools.m.b(this, this.vQF, 31686);
      GMTrace.o(2645834072064L, 19713);
      return;
    }
    bYv();
    label117:
    GMTrace.o(2645834072064L, 19713);
    return;
    label127:
    if ((paramInt1 == 1024) && (paramIntent != null))
    {
      if (paramInt2 == -1)
      {
        String str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
        paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
        bool = bg.nm(str);
        if (bg.nm(str)) {}
        for (paramInt1 = i;; paramInt1 = str.length())
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LoginHistoryUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          Vn(str);
          GMTrace.o(2645834072064L, 19713);
          return;
        }
      }
    }
    else if ((paramInt1 == 1025) && (paramIntent != null))
    {
      if (paramInt2 == 2)
      {
        paramIntent = paramIntent.getStringExtra("KFaceLoginAuthPwd");
        bool = bg.nm(paramIntent);
        if (bg.nm(paramIntent)) {}
        for (paramInt1 = j;; paramInt1 = paramIntent.length())
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LoginHistoryUI", "hy: onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
          Vn(paramIntent);
          GMTrace.o(2645834072064L, 19713);
          return;
        }
      }
    }
    else if (paramInt1 == 31686)
    {
      if (paramInt2 == -1)
      {
        bYv();
        GMTrace.o(2645834072064L, 19713);
      }
    }
    else if (paramInt1 == 31685)
    {
      if ((paramIntent != null) && (paramIntent.hasExtra("VoiceLoginAuthPwd"))) {
        this.qBY = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      }
      if (paramInt2 == -1) {
        Wg();
      }
    }
    GMTrace.o(2645834072064L, 19713);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2644760330240L, 19705);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LoginHistoryUI", "AccountSyncApplication.modelCallback %s", new Object[] { com.tencent.mm.plugin.c.a.hnI });
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.ghC = ab.getContext().getSharedPreferences(ab.bPU(), 0);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.vQC = paramBundle.getBooleanExtra("login_success_need_bind_fingerprint", false);
      this.vQC = this.vQC;
      if (this.vQC) {
        this.vQD = paramBundle.getStringExtra("bind_login_fingerprint_info");
      }
    }
    MP();
    this.vQt = new com.tencent.mm.pluginsdk.i.a();
    GMTrace.o(2644760330240L, 19705);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2644894547968L, 19706);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LoginHistoryUI", "onDestroy");
    at.wS().b(701, this);
    if (this.vQt != null) {
      this.vQt.close();
    }
    com.tencent.mm.plugin.report.service.g.ork.i(14262, new Object[] { Integer.valueOf(this.mGp[0]), Integer.valueOf(this.mGp[1]), Integer.valueOf(this.mGp[2]), Integer.valueOf(this.mGp[3]), Integer.valueOf(this.mGp[4]) });
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    super.onDestroy();
    GMTrace.o(2644894547968L, 19706);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2645297201152L, 19709);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
      com.tencent.mm.ui.base.b.fm(this);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2645297201152L, 19709);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2645162983424L, 19708);
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.vPG);
    GMTrace.o(2645162983424L, 19708);
  }
  
  public void onResume()
  {
    GMTrace.i(2645028765696L, 19707);
    super.onResume();
    final Object localObject1 = new ArrayList();
    final Object localObject2;
    if ((bYx()) && (this.ibA != 1) && ((this.vQA & 0x20000) != 0))
    {
      localObject2 = new com.tencent.mm.ui.base.o(7001, 0);
      ((com.tencent.mm.ui.base.o)localObject2).setTitle(R.l.dHj);
      ((List)localObject1).add(localObject2);
    }
    if ((this.ibA != 5) && ((this.vQA & 0x40000) != 0))
    {
      localObject2 = new com.tencent.mm.ui.base.o(7005, 0);
      ((com.tencent.mm.ui.base.o)localObject2).setTitle(R.l.dHg);
      ((List)localObject1).add(localObject2);
    }
    if (!bg.nm(this.vQs))
    {
      if ((!bg.nm(this.vQn)) && (this.ibA != 3))
      {
        localObject2 = new com.tencent.mm.ui.base.o(7008, 0);
        ((com.tencent.mm.ui.base.o)localObject2).setTitle(getString(R.l.dHi));
        ((List)localObject1).add(localObject2);
      }
      if (this.ibA != 2)
      {
        localObject2 = new com.tencent.mm.ui.base.o(7007, 0);
        ((com.tencent.mm.ui.base.o)localObject2).setTitle(getString(R.l.dHh));
        ((List)localObject1).add(localObject2);
      }
      if (this.vQs.equalsIgnoreCase(this.vQm)) {
        this.kGe.setHint(getString(R.l.dRS));
      }
    }
    if (((List)localObject1).size() > 1)
    {
      localObject2 = new com.tencent.mm.ui.widget.f(this, com.tencent.mm.ui.widget.f.xpQ, false);
      ((com.tencent.mm.ui.widget.f)localObject2).qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(19234876817408L, 143311);
          if (paramAnonymousn.size() == 0)
          {
            Iterator localIterator = localObject1.iterator();
            while (localIterator.hasNext())
            {
              com.tencent.mm.ui.base.o localo = (com.tencent.mm.ui.base.o)localIterator.next();
              if (localo != null) {
                paramAnonymousn.wdA.add(localo);
              }
            }
          }
          GMTrace.o(19234876817408L, 143311);
        }
      };
      ((com.tencent.mm.ui.widget.f)localObject2).qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(19229373890560L, 143270);
          LoginHistoryUI.a(LoginHistoryUI.this, paramAnonymousMenuItem.getItemId());
          GMTrace.o(19229373890560L, 143270);
        }
      };
      ((com.tencent.mm.ui.widget.f)localObject2).xqc = new f.a()
      {
        public final void onDismiss()
        {
          GMTrace.i(19241721921536L, 143362);
          localObject2.bFl();
          GMTrace.o(19241721921536L, 143362);
        }
      };
      this.vQh.setVisibility(0);
      this.vQh.setText(R.l.dGW);
      this.vQh.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17776869638144L, 132448);
          localObject2.bFk();
          GMTrace.o(17776869638144L, 132448);
        }
      });
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.vgX.b(this.vPG);
      at.wO();
      localObject1 = as.gnb.B("login_user_name", "");
      if ((!at.AT()) || (((String)localObject1).equals(""))) {
        break label496;
      }
      if ((this.htG == null) || (!this.htG.isShowing())) {
        break;
      }
      GMTrace.o(2645028765696L, 19707);
      return;
      if (((List)localObject1).size() > 0)
      {
        this.vQh.setVisibility(0);
        this.vQh.setText(((com.tencent.mm.ui.base.o)((List)localObject1).get(0)).getTitle());
        this.vQh.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(19232997769216L, 143297);
            LoginHistoryUI.a(LoginHistoryUI.this, ((com.tencent.mm.ui.base.o)localObject1.get(0)).getItemId());
            GMTrace.o(19232997769216L, 143297);
          }
        });
      }
      else
      {
        this.vQh.setVisibility(8);
      }
    }
    b(null);
    GMTrace.o(2645028765696L, 19707);
    return;
    label496:
    if (com.tencent.mm.o.a.vp() == 2)
    {
      localObject1 = new i.a(this);
      ((i.a)localObject1).BN(R.l.dhM);
      ((i.a)localObject1).VA(getString(R.l.dhL));
      ((i.a)localObject1).lz(false);
      ((i.a)localObject1).BQ(R.l.dhJ).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16838553501696L, 125457);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LoginHistoryUI", "db dangerous and auto logout");
          LoginHistoryUI.a(LoginHistoryUI.this);
          GMTrace.o(16838553501696L, 125457);
        }
      });
      ((i.a)localObject1).aax().show();
      com.tencent.mm.o.a.i(this, System.currentTimeMillis());
    }
    GMTrace.o(2645028765696L, 19707);
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    GMTrace.i(2646505160704L, 19718);
    GMTrace.o(2646505160704L, 19718);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\LoginHistoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */