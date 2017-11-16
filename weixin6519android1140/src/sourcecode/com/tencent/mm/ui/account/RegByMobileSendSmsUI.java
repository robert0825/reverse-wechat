package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.modelsimple.x;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.ui.d.i;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileLoginOrForceReg;
import com.tencent.mm.ui.account.mobile.a.a;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bj;
import java.io.File;

public class RegByMobileSendSmsUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private String aDn;
  private String eEU;
  private aj ikv;
  private String lnX;
  private String vPx;
  private String vQG;
  private boolean vRY;
  private int vSA;
  private SecurityImage vSB;
  private String vSu;
  private String vSv;
  private com.tencent.mm.ui.account.mobile.a vSw;
  private ProgressDialog vSx;
  private int vSy;
  private Button vSz;
  
  public RegByMobileSendSmsUI()
  {
    GMTrace.i(19229776543744L, 143273);
    this.vSu = "";
    this.vPx = "";
    this.vSv = "";
    this.vQG = "";
    this.vSA = 10;
    GMTrace.o(19229776543744L, 143273);
  }
  
  private i Vs(String paramString)
  {
    GMTrace.i(19230179196928L, 143276);
    i locali = new i(paramString);
    w.d("MicroMsg.RegByMobileSendSmsUI", "content: %s", new Object[] { paramString });
    int i = paramString.indexOf('\n') + 1;
    locali.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.f.aQp)), i, paramString.length(), 33);
    locali.setSpan(new ForegroundColorSpan(getResources().getColor(R.e.aNQ)), i, paramString.length(), 33);
    GMTrace.o(19230179196928L, 143276);
    return locali;
  }
  
  private void bYJ()
  {
    GMTrace.i(20331972526080L, 151485);
    this.vSz.setEnabled(false);
    if (this.ikv != null)
    {
      this.ikv.stopTimer();
      this.vSA = 10;
      this.vSy = 0;
      this.ikv.z(0L, 1000L);
      GMTrace.o(20331972526080L, 151485);
      return;
    }
    this.ikv = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(20330227695616L, 151472);
        if (RegByMobileSendSmsUI.m(RegByMobileSendSmsUI.this) > 0)
        {
          RegByMobileSendSmsUI.n(RegByMobileSendSmsUI.this).setText(RegByMobileSendSmsUI.this.getString(R.l.dRz, new Object[] { Integer.valueOf(RegByMobileSendSmsUI.m(RegByMobileSendSmsUI.this)) }));
          RegByMobileSendSmsUI.o(RegByMobileSendSmsUI.this);
          if (RegByMobileSendSmsUI.m(RegByMobileSendSmsUI.this) % 4 == 0) {
            RegByMobileSendSmsUI.p(RegByMobileSendSmsUI.this);
          }
          GMTrace.o(20330227695616L, 151472);
          return true;
        }
        RegByMobileSendSmsUI.n(RegByMobileSendSmsUI.this).setText(RegByMobileSendSmsUI.this.getString(R.l.dRy));
        RegByMobileSendSmsUI.n(RegByMobileSendSmsUI.this).setEnabled(true);
        GMTrace.o(20330227695616L, 151472);
        return false;
      }
    }, true);
    this.ikv.z(0L, 1000L);
    GMTrace.o(20331972526080L, 151485);
  }
  
  private void goBack()
  {
    GMTrace.i(19231118721024L, 143283);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.dRt), "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20335059533824L, 151508);
        RegByMobileSendSmsUI.q(RegByMobileSendSmsUI.this);
        RegByMobileSendSmsUI.this.finish();
        GMTrace.o(20335059533824L, 151508);
      }
    }, null);
    GMTrace.o(19231118721024L, 143283);
  }
  
  private void stopTimer()
  {
    GMTrace.i(19230984503296L, 143282);
    if (this.ikv != null) {
      this.ikv.stopTimer();
    }
    this.vSz.setText(getString(R.l.dRy));
    this.vSz.setEnabled(true);
    GMTrace.o(19230984503296L, 143282);
  }
  
  protected final void MP()
  {
    GMTrace.i(19230044979200L, 143275);
    super.MP();
    ((TextView)findViewById(R.h.cch)).setText(getString(R.l.dRv, new Object[] { this.vSu }));
    ((TextView)findViewById(R.h.ccg)).setText(Vs(getString(R.l.dRu, new Object[] { this.vPx })));
    ((TextView)findViewById(R.h.cci)).setText(Vs(getString(R.l.dRx, new Object[] { this.vSv })));
    this.vSz = ((Button)findViewById(R.h.ccf));
    if (bg.E(new String[] { this.vSu, this.vSv, this.vPx })) {
      this.vSz.setEnabled(false);
    }
    if (bg.nm(com.tencent.mm.compatible.d.p.getSimCountryIso()))
    {
      this.vSz.setText(R.l.dRr);
      this.vSz.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19226286882816L, 143247);
          RegByMobileSendSmsUI.a(RegByMobileSendSmsUI.this);
          GMTrace.o(19226286882816L, 143247);
        }
      });
    }
    for (;;)
    {
      oM(R.l.dRw);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20331569872896L, 151482);
          RegByMobileSendSmsUI.d(RegByMobileSendSmsUI.this);
          GMTrace.o(20331569872896L, 151482);
          return true;
        }
      });
      GMTrace.o(19230044979200L, 143275);
      return;
      this.vSz.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20335193751552L, 151509);
          paramAnonymousView = new Intent();
          paramAnonymousView.setAction("android.intent.action.SENDTO");
          paramAnonymousView.setData(Uri.parse("smsto:" + RegByMobileSendSmsUI.b(RegByMobileSendSmsUI.this)));
          paramAnonymousView.putExtra("sms_body", RegByMobileSendSmsUI.c(RegByMobileSendSmsUI.this));
          try
          {
            RegByMobileSendSmsUI.this.startActivityForResult(paramAnonymousView, 32536);
            GMTrace.o(20335193751552L, 151509);
            return;
          }
          catch (Exception paramAnonymousView)
          {
            w.e("MicroMsg.RegByMobileSendSmsUI", paramAnonymousView.getMessage());
            GMTrace.o(20335193751552L, 151509);
          }
        }
      });
    }
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, final k paramk)
  {
    GMTrace.i(19230716067840L, 143280);
    w.i("MicroMsg.RegByMobileSendSmsUI", "errType %s, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.vSx != null) {
      this.vSx.dismiss();
    }
    if ((paramk.getType() == 145) && (((s)paramk).CD() == 15))
    {
      paramk = (s)paramk;
      this.eEU = paramk.Hx();
      if (paramInt2 == 0)
      {
        stopTimer();
        if (bj.BC().BD() > 0)
        {
          at.wS().a(126, this);
          paramString = new x("", this.lnX, this.aDn, 0, "", this.vSu, "", "", this.eEU, 1, "", "", "", true, this.vRY);
          paramString.lq(this.vQG);
          paramString.gY(1);
          at.wS().a(paramString, 0);
          getString(R.l.cUG);
          this.vSx = com.tencent.mm.ui.base.h.a(this, getString(R.l.dRT), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(20329690824704L, 151468);
              at.wS().c(paramString);
              at.wS().b(126, RegByMobileSendSmsUI.this);
              GMTrace.o(20329690824704L, 151468);
            }
          });
          GMTrace.o(19230716067840L, 143280);
          return;
        }
        paramString = new Intent();
        paramString.putExtra("regsetinfo_ticket", this.eEU);
        paramString.putExtra("regsetinfo_user", this.vSu);
        paramString.putExtra("regsession_id", this.vQG);
        paramString.putExtra("mobile_check_type", 1);
        paramString.putExtra("regsetinfo_ismobile", 1);
        paramString.putExtra("regsetinfo_NextControl", paramk.HD());
        paramString.setClass(this, RegSetInfoUI.class);
        startActivity(paramString);
        GMTrace.o(19230716067840L, 143280);
        return;
      }
      if (paramInt2 == -35)
      {
        stopTimer();
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19225481576448L, 143241);
              at.wS().a(701, RegByMobileSendSmsUI.this);
              RegByMobileSendSmsUI.a(RegByMobileSendSmsUI.this, paramk.getUsername(), paramk.Hw());
              GMTrace.o(19225481576448L, 143241);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19225750011904L, 143243);
              GMTrace.o(19225750011904L, 143243);
            }
          });
          GMTrace.o(19230716067840L, 143280);
          return;
        }
        com.tencent.mm.ui.base.h.a(this, getString(R.l.cZa), null, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19225213140992L, 143239);
            RegByMobileSendSmsUI.a(RegByMobileSendSmsUI.this, paramk.getUsername(), paramk.Hw());
            GMTrace.o(19225213140992L, 143239);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(20331301437440L, 151480);
            GMTrace.o(20331301437440L, 151480);
          }
        });
        GMTrace.o(19230716067840L, 143280);
        return;
      }
      if (paramInt2 == 65324)
      {
        stopTimer();
        paramString = new Intent(this, MobileLoginOrForceReg.class);
        paramString.putExtra("ticket", this.eEU);
        paramString.putExtra("moble", this.vSu);
        paramString.putExtra("regsession_id", this.vQG);
        paramString.putExtra("next_controll", paramk.HD());
        paramString.putExtra("username", paramk.getUsername());
        paramString.putExtra("password", paramk.Hw());
        paramString.putExtra("nickname", paramk.HK());
        paramString.putExtra("avatar_url", paramk.HJ());
        paramString.putExtra("mobile_check_type", 1);
        paramString.putExtra("kintent_hasavatar", this.vRY);
        paramString.putExtra("kintent_nickname", this.aDn);
        paramString.putExtra("kintent_password", this.lnX);
        startActivity(paramString);
        GMTrace.o(19230716067840L, 143280);
        return;
      }
      if ((!bg.nm(paramString)) && (this.vSy >= 3))
      {
        paramString = com.tencent.mm.h.a.dH(paramString);
        if ((paramString != null) && (paramString.a(this, null, null)))
        {
          GMTrace.o(19230716067840L, 143280);
          return;
        }
      }
      GMTrace.o(19230716067840L, 143280);
      return;
    }
    if (paramk.getType() == 126)
    {
      final x localx = (x)paramk;
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        if (this.vSB == null)
        {
          this.vSB = SecurityImage.a.a(this, R.l.dRU, 0, localx.HP(), localx.HQ(), "", new DialogInterface.OnClickListener()
          {
            public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(20335462187008L, 151511);
              paramAnonymousDialogInterface = new x("", RegByMobileSendSmsUI.e(RegByMobileSendSmsUI.this), RegByMobileSendSmsUI.f(RegByMobileSendSmsUI.this), 0, "", RegByMobileSendSmsUI.g(RegByMobileSendSmsUI.this), "", "", RegByMobileSendSmsUI.h(RegByMobileSendSmsUI.this), 1, "", localx.HQ(), RegByMobileSendSmsUI.i(RegByMobileSendSmsUI.this).bZo(), true, RegByMobileSendSmsUI.j(RegByMobileSendSmsUI.this));
              paramAnonymousDialogInterface.lq(RegByMobileSendSmsUI.k(RegByMobileSendSmsUI.this));
              paramAnonymousDialogInterface.gY(1);
              at.wS().a(paramAnonymousDialogInterface, 0);
              RegByMobileSendSmsUI localRegByMobileSendSmsUI = RegByMobileSendSmsUI.this;
              ActionBarActivity localActionBarActivity = RegByMobileSendSmsUI.this.vKB.vKW;
              RegByMobileSendSmsUI.this.getString(R.l.cUG);
              RegByMobileSendSmsUI.a(localRegByMobileSendSmsUI, com.tencent.mm.ui.base.h.a(localActionBarActivity, RegByMobileSendSmsUI.this.getString(R.l.dRT), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(20330630348800L, 151475);
                  at.wS().c(paramAnonymousDialogInterface);
                  GMTrace.o(20330630348800L, 151475);
                }
              }));
              GMTrace.o(20335462187008L, 151511);
            }
          }, null, new DialogInterface.OnDismissListener()new SecurityImage.b
          {
            public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(20335596404736L, 151512);
              RegByMobileSendSmsUI.l(RegByMobileSendSmsUI.this);
              GMTrace.o(20335596404736L, 151512);
            }
          }, new SecurityImage.b()
          {
            public final void bYp()
            {
              GMTrace.i(20329959260160L, 151470);
              RegByMobileSendSmsUI.this.aLo();
              x localx = new x("", RegByMobileSendSmsUI.e(RegByMobileSendSmsUI.this), RegByMobileSendSmsUI.f(RegByMobileSendSmsUI.this), 0, "", RegByMobileSendSmsUI.g(RegByMobileSendSmsUI.this), "", "", RegByMobileSendSmsUI.h(RegByMobileSendSmsUI.this), 1, "", localx.HQ(), RegByMobileSendSmsUI.i(RegByMobileSendSmsUI.this).bZo(), true, RegByMobileSendSmsUI.j(RegByMobileSendSmsUI.this));
              localx.lq(RegByMobileSendSmsUI.k(RegByMobileSendSmsUI.this));
              localx.gY(1);
              at.wS().a(localx, 0);
              GMTrace.o(20329959260160L, 151470);
            }
          });
          GMTrace.o(19230716067840L, 143280);
          return;
        }
        this.vSB.a(0, ((x)paramk).HP(), ((x)paramk).HQ(), "");
        GMTrace.o(19230716067840L, 143280);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.vSu;
        at.unhold();
        at.bg(true);
        if (this.vRY)
        {
          paramk = com.tencent.mm.compatible.util.e.fSg + "temp.avatar";
          String str = com.tencent.mm.compatible.util.e.fSg + "temp.avatar.hd";
          new File(paramk).renameTo(new File(str));
          com.tencent.mm.loader.stub.b.deleteFile(paramk);
          d.b(str, 96, 96, Bitmap.CompressFormat.JPEG, 90, paramk);
          new o(this, com.tencent.mm.compatible.util.e.fSg + "temp.avatar").a(new Runnable()new Runnable
          {
            public final void run()
            {
              GMTrace.i(20331033001984L, 151478);
              RegByMobileSendSmsUI.a(RegByMobileSendSmsUI.this, localx.LD());
              as.gnb.M("login_user_name", paramString);
              com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.compatible.util.e.fSg + "temp.avatar");
              Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(RegByMobileSendSmsUI.this);
              localIntent.addFlags(67108864);
              RegByMobileSendSmsUI.this.startActivity(localIntent);
              com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R200_600," + at.eK("R200_600") + ",4");
              RegByMobileSendSmsUI.this.finish();
              GMTrace.o(20331033001984L, 151478);
            }
          }, new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20334791098368L, 151506);
              RegByMobileSendSmsUI.a(RegByMobileSendSmsUI.this, localx.LD());
              as.gnb.M("login_user_name", paramString);
              Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(RegByMobileSendSmsUI.this);
              localIntent.addFlags(67108864);
              RegByMobileSendSmsUI.this.startActivity(localIntent);
              com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R200_600," + at.eK("R200_600") + ",4");
              RegByMobileSendSmsUI.this.finish();
              GMTrace.o(20334791098368L, 151506);
            }
          });
          GMTrace.o(19230716067840L, 143280);
          return;
        }
        this.eEU = localx.LD();
        as.gnb.M("login_user_name", paramString);
        paramString = com.tencent.mm.plugin.c.a.hnH.ao(this);
        paramString.addFlags(67108864);
        paramString.putExtra("LauncherUI.enter_from_reg", true);
        startActivity(paramString);
        finish();
        com.tencent.mm.plugin.c.b.nz("RE900_100");
        com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R200_600," + at.eK("R200_600") + ",4");
        GMTrace.o(19230716067840L, 143280);
        return;
      }
      paramString = com.tencent.mm.h.a.dH(paramString);
      if (paramString != null)
      {
        paramString.a(this, null, null);
        GMTrace.o(19230716067840L, 143280);
        return;
      }
    }
    GMTrace.o(19230716067840L, 143280);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19230313414656L, 143277);
    int i = R.i.cEL;
    GMTrace.o(19230313414656L, 143277);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19230850285568L, 143281);
    if (paramInt1 == 32536) {
      bYJ();
    }
    GMTrace.o(19230850285568L, 143281);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19229910761472L, 143274);
    super.onCreate(paramBundle);
    this.vSu = bg.nl(getIntent().getStringExtra("from_mobile"));
    this.vSv = bg.nl(getIntent().getStringExtra("to_mobile"));
    this.vPx = bg.nl(getIntent().getStringExtra("verify_code"));
    this.vQG = bg.nl(getIntent().getStringExtra("regsession_id"));
    this.aDn = bg.nl(getIntent().getStringExtra("kintent_nickname"));
    this.lnX = bg.nl(getIntent().getStringExtra("kintent_password"));
    this.vRY = getIntent().getBooleanExtra("kintent_hasavatar", false);
    MP();
    GMTrace.o(19229910761472L, 143274);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(19231252938752L, 143284);
    if (paramInt == 4)
    {
      goBack();
      GMTrace.o(19231252938752L, 143284);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(19231252938752L, 143284);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(19230447632384L, 143278);
    super.onResume();
    com.tencent.mm.kernel.h.wS().a(145, this);
    GMTrace.o(19230447632384L, 143278);
  }
  
  protected void onStop()
  {
    GMTrace.i(19230581850112L, 143279);
    super.onStop();
    com.tencent.mm.kernel.h.wS().b(145, this);
    GMTrace.o(19230581850112L, 143279);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\RegByMobileSendSmsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */