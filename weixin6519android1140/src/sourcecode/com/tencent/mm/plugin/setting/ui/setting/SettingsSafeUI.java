package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.modelsimple.aj;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.setting.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class SettingsSafeUI
  extends MMPreference
  implements e
{
  private ProgressDialog htG;
  private f htU;
  private final String oId;
  private final String oIe;
  private final String oIf;
  private final int oIg;
  private final int oIh;
  private final int oIi;
  private int oIk;
  private View oIl;
  private TextView oIm;
  private EditText oIn;
  private i oIo;
  private boolean oIp;
  private String oJY;
  
  public SettingsSafeUI()
  {
    GMTrace.i(4667018838016L, 34772);
    this.oId = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe";
    this.oIe = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=1";
    this.oIf = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=0";
    this.oIg = 0;
    this.oIh = 1;
    this.oIi = 2;
    this.oIk = 0;
    GMTrace.o(4667018838016L, 34772);
  }
  
  private void hg(boolean paramBoolean)
  {
    GMTrace.i(4668092579840L, 34780);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsSafeUI", "handlePassword " + paramBoolean);
    if (paramBoolean)
    {
      if (this.oIo != null)
      {
        this.oIo.show();
        GMTrace.o(4668092579840L, 34780);
        return;
      }
      this.oIo = h.a(this, null, this.oIl, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4592930652160L, 34220);
          paramAnonymousDialogInterface = SettingsSafeUI.a(SettingsSafeUI.this).getText().toString();
          SettingsSafeUI.a(SettingsSafeUI.this).setText("");
          SettingsSafeUI.a(SettingsSafeUI.this).clearFocus();
          SettingsSafeUI.this.db(SettingsSafeUI.a(SettingsSafeUI.this));
          if ((paramAnonymousDialogInterface == null) || (paramAnonymousDialogInterface.equals("")))
          {
            h.a(SettingsSafeUI.this, R.l.egb, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(4723658719232L, 35194);
                GMTrace.o(4723658719232L, 35194);
              }
            });
            GMTrace.o(4592930652160L, 34220);
            return;
          }
          paramAnonymousDialogInterface = new aj(paramAnonymousDialogInterface, "", "", "");
          at.wS().a(paramAnonymousDialogInterface, 0);
          SettingsSafeUI localSettingsSafeUI1 = SettingsSafeUI.this;
          SettingsSafeUI localSettingsSafeUI2 = SettingsSafeUI.this;
          SettingsSafeUI.this.getString(R.l.cUG);
          SettingsSafeUI.a(localSettingsSafeUI1, h.a(localSettingsSafeUI2, SettingsSafeUI.this.getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(4668897886208L, 34786);
              at.wS().c(paramAnonymousDialogInterface);
              GMTrace.o(4668897886208L, 34786);
            }
          }));
          GMTrace.o(4592930652160L, 34220);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4720974364672L, 35174);
          SettingsSafeUI.a(SettingsSafeUI.this).setText("");
          SettingsSafeUI.b(SettingsSafeUI.this).dismiss();
          GMTrace.o(4720974364672L, 35174);
        }
      });
      GMTrace.o(4668092579840L, 34780);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("kintent_hint", getString(R.l.dZu));
    d.b(this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", localIntent);
    GMTrace.o(4668092579840L, 34780);
  }
  
  protected final void MP()
  {
    GMTrace.i(4667421491200L, 34775);
    oM(R.l.ear);
    this.htU = this.wky;
    this.oIl = View.inflate(this, R.i.cFS, null);
    this.oIm = ((TextView)this.oIl.findViewById(R.h.ccl));
    this.oIm.setText(getString(R.l.dYY));
    this.oIn = ((EditText)this.oIl.findViewById(R.h.cck));
    this.oIn.setInputType(129);
    this.oJY = getString(R.l.ekM);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4671313805312L, 34804);
        SettingsSafeUI.this.aLo();
        SettingsSafeUI.this.finish();
        GMTrace.o(4671313805312L, 34804);
        return true;
      }
    });
    GMTrace.o(4667421491200L, 34775);
  }
  
  public final boolean QH()
  {
    GMTrace.i(4667287273472L, 34774);
    GMTrace.o(4667287273472L, 34774);
    return true;
  }
  
  public final int QI()
  {
    GMTrace.i(4667555708928L, 34776);
    int i = R.o.epy;
    GMTrace.o(4667555708928L, 34776);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4668226797568L, 34781);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsSafeUI", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramk.getType());
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (paramk.getType() == 255)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        hg(true);
        GMTrace.o(4668226797568L, 34781);
        return;
      }
      if (a.hnI.a(this, paramInt1, paramInt2, paramString))
      {
        GMTrace.o(4668226797568L, 34781);
        return;
      }
      hg(false);
      GMTrace.o(4668226797568L, 34781);
      return;
    }
    if (paramk.getType() == 384)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        at.AR();
        c.xh().set(77830, ((aj)paramk).Hx());
        GMTrace.o(4668226797568L, 34781);
        return;
      }
      this.oIp = true;
      h.a(this, R.l.dZH, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4601520586752L, 34284);
          GMTrace.o(4601520586752L, 34284);
        }
      });
    }
    GMTrace.o(4668226797568L, 34781);
  }
  
  public final boolean a(final f paramf, Preference paramPreference)
  {
    GMTrace.i(4667958362112L, 34779);
    paramf = paramPreference.hiu;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsSafeUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_independent_password")) {
      if (this.oIp) {
        hg(true);
      }
    }
    for (;;)
    {
      GMTrace.o(4667958362112L, 34779);
      return false;
      paramf = new com.tencent.mm.modelsimple.w(1);
      at.wS().a(paramf, 0);
      getString(R.l.cUG);
      this.htG = h.a(this, getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(4594004393984L, 34228);
          at.wS().c(paramf);
          GMTrace.o(4594004393984L, 34228);
        }
      });
      continue;
      if (paramf.equals("settings_safe_device"))
      {
        at.AR();
        paramf = (String)c.xh().get(6, "");
        at.AR();
        paramPreference = (String)c.xh().get(4097, "");
        if (!bg.nm(paramf))
        {
          d.x(this, "safedevice", ".ui.MySafeDeviceListUI");
        }
        else if (!bg.nm(paramPreference))
        {
          paramf = new Intent(this, BindMContactIntroUI.class);
          paramf.putExtra("is_bind_for_safe_device", true);
          MMWizardActivity.A(this, paramf);
        }
        else
        {
          d.a(this, "safedevice", ".ui.BindSafeDeviceUI", new Intent());
        }
      }
      else
      {
        if (paramf.equals("settings_room_right"))
        {
          d.x(this, "chatroom", ".ui.RoomRightUI");
          GMTrace.o(4667958362112L, 34779);
          return true;
        }
        if (paramf.equals("settings_phone_security"))
        {
          paramf = new Intent();
          if (this.oIk == 0) {
            paramf.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe");
          }
          for (;;)
          {
            g.ork.i(10939, new Object[] { Integer.valueOf(this.oIk) });
            paramf.putExtra("show_bottom", false);
            paramf.putExtra("showShare", false);
            d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramf);
            break;
            if (this.oIk == 1) {
              paramf.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=0");
            } else if (this.oIk == 2) {
              paramf.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=1");
            }
          }
        }
        if (paramf.equals("settings_security_center"))
        {
          paramf = this.vKB.vKW;
          paramPreference = this.oJY;
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramPreference);
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("show_bottom", false);
          localIntent.putExtra("needRedirect", false);
          localIntent.putExtra("neverGetA8Key", true);
          localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          d.b(paramf, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4667153055744L, 34773);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4667153055744L, 34773);
  }
  
  protected void onPause()
  {
    GMTrace.i(4667824144384L, 34778);
    super.onPause();
    at.wS().b(255, this);
    at.wS().b(384, this);
    GMTrace.o(4667824144384L, 34778);
  }
  
  protected void onResume()
  {
    GMTrace.i(4667689926656L, 34777);
    at.wS().a(255, this);
    at.wS().a(384, this);
    this.htU.bc("settings_room_right", true);
    if (!v.bPH())
    {
      this.htU.VH("settings_security_center");
      this.htU.VH("settings_security_center_tip");
    }
    super.onResume();
    GMTrace.o(4667689926656L, 34777);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsSafeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */