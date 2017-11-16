package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.ak;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.e;
import com.tencent.mm.pluginsdk.p.s;
import com.tencent.mm.pluginsdk.p.t;
import com.tencent.mm.pluginsdk.p.u;
import com.tencent.mm.pluginsdk.p.x;
import com.tencent.mm.protocal.c.aei;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSummaryPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.s;
import com.tencent.mm.y.at;

public class SettingsAboutMicroMsgUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private com.tencent.mm.ui.base.preference.f htU;
  private boolean oHA;
  private aei oHB;
  private int oHC;
  Intent oHD;
  private ProgressDialog oHE;
  private aj oHF;
  private com.tencent.mm.ad.e oHG;
  
  public SettingsAboutMicroMsgUI()
  {
    GMTrace.i(4641920122880L, 34585);
    this.oHA = false;
    this.oHC = 0;
    this.oHD = null;
    this.oHG = null;
    GMTrace.o(4641920122880L, 34585);
  }
  
  private void bel()
  {
    GMTrace.i(4642725429248L, 34591);
    this.htU = this.wky;
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(R.o.epo);
    SettingsAboutMMHeaderPreference localSettingsAboutMMHeaderPreference = (SettingsAboutMMHeaderPreference)this.htU.VG("settings_about_mm_header");
    String str = com.tencent.mm.sdk.platformtools.f.ab(this.vKB.vKW, com.tencent.mm.protocal.d.tJC);
    Object localObject = str;
    if (com.tencent.mm.protocal.d.tJF) {
      localObject = str + " " + getString(R.l.cRD);
    }
    localSettingsAboutMMHeaderPreference.oHx = ((String)localObject);
    int i;
    if (com.tencent.mm.sdk.platformtools.v.bPH())
    {
      at.AR();
      i = bg.e((Integer)com.tencent.mm.y.c.xh().get(12304, null));
      localObject = (IconPreference)this.htU.VG("settings_update");
      if (i > 0)
      {
        ((IconPreference)localObject).Ck(0);
        ((IconPreference)localObject).cS(String.valueOf(i), s.fH(this.vKB.vKW));
      }
    }
    else
    {
      if ((com.tencent.mm.sdk.platformtools.f.eqX & 0x1) == 0) {
        break label426;
      }
      i = 1;
      label191:
      if ((!this.oHA) || (com.tencent.mm.sdk.platformtools.f.vhv)) {
        break label431;
      }
      localObject = (IconSummaryPreference)this.htU.VG("funtion_update");
      ((IconSummaryPreference)localObject).oGR = 0;
      str = com.tencent.mm.sdk.platformtools.f.ab(null, this.oHC);
      ((IconSummaryPreference)localObject).cS(getString(R.l.cTH), R.g.aYs);
      ((IconSummaryPreference)localObject).setSummary(str);
      ((IconSummaryPreference)localObject).wke = 0;
      if (((IconSummaryPreference)localObject).wkf != null) {
        ((IconSummaryPreference)localObject).wkf.setVisibility(((IconSummaryPreference)localObject).wke);
      }
      this.htU.VH("funtion_check_update");
      label289:
      if (!com.tencent.mm.sdk.platformtools.v.bPH()) {
        this.htU.bc("settings_report", true);
      }
      if (!p.a.tlX.pG()) {
        this.htU.bc("funtion_about_wechat", true);
      }
      at.AR();
      if (bg.nm((String)com.tencent.mm.y.c.xh().get(w.a.vxP, null))) {
        break label600;
      }
      localObject = (IconPreference)this.htU.VG("funtion_crowdtest_update");
      if (com.tencent.mm.s.c.vK().aE(262157, 266263)) {
        ((IconPreference)localObject).Cm(0);
      }
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(4642725429248L, 34591);
      return;
      ((IconPreference)localObject).Ck(8);
      ((IconPreference)localObject).cS("", -1);
      break;
      label426:
      i = 0;
      break label191;
      label431:
      if ((i == 0) && (this.oHB != null) && (this.oHB.uud != 0) && (!bg.nm(this.oHB.uue)) && (!com.tencent.mm.sdk.platformtools.f.vhv))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAboutMicroMsgUI", "show alpha update. url:%s, hint:%d", new Object[] { this.oHB.uue, Integer.valueOf(this.oHB.uuf) });
        if (this.oHB.uuf != 0)
        {
          localObject = (IconSummaryPreference)this.htU.VG("funtion_update");
          ((IconSummaryPreference)localObject).oGR = 0;
          ((IconSummaryPreference)localObject).cS(getString(R.l.cTH), R.g.aYs);
          this.htU.VH("funtion_check_update");
          break label289;
        }
        this.htU.VH("funtion_update");
        break label289;
      }
      this.htU.VH("funtion_update");
      break label289;
      label600:
      this.htU.VH("funtion_crowdtest_update");
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(4642591211520L, 34590);
    oM(R.l.ebo);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16883650658304L, 125793);
        SettingsAboutMicroMsgUI.this.aLo();
        SettingsAboutMicroMsgUI.this.finish();
        GMTrace.o(16883650658304L, 125793);
        return true;
      }
    });
    bel();
    GMTrace.o(4642591211520L, 34590);
  }
  
  public final int QI()
  {
    GMTrace.i(4642054340608L, 34586);
    int i = R.o.epo;
    GMTrace.o(4642054340608L, 34586);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4642993864704L, 34593);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAboutMicroMsgUI", "onSceneEnd " + paramInt2 + " errType " + paramInt1);
    paramString = (p.t)paramk;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAboutMicroMsgUI", "updateInfo.getDownloadUrls() " + paramString.bIT());
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAboutMicroMsgUI", "updateInfo.getPackVersion() " + paramString.bIS());
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAboutMicroMsgUI", "updateInfo.now getPackVersion() " + com.tencent.mm.protocal.d.tJC);
    if ((p.x.tmi) || ((paramInt1 == 0) && (paramInt2 == 0)))
    {
      this.oHC = paramString.bIS();
      if ((this.oHC <= 0) || (this.oHC <= com.tencent.mm.protocal.d.tJC)) {
        break label230;
      }
      this.oHA = true;
      if (!com.tencent.mm.kernel.h.xw().wL()) {
        break label218;
      }
      com.tencent.mm.s.c.vK().k(262145, true);
    }
    for (;;)
    {
      this.oHB = paramString.bIU();
      bel();
      GMTrace.o(4642993864704L, 34593);
      return;
      label218:
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAboutMicroMsgUI", "SubCoreHub.getNewBadge() uin not ready!");
      continue;
      label230:
      this.oHA = false;
      if (com.tencent.mm.kernel.h.xw().wL()) {
        com.tencent.mm.s.c.vK().k(262145, false);
      } else {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAboutMicroMsgUI", "SubCoreHub.getNewBadge() uin not ready!");
      }
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(4642859646976L, 34592);
    paramf = paramPreference.hiu;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAboutMicroMsgUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_update"))
    {
      if (com.tencent.mm.sdk.platformtools.v.bPH())
      {
        com.tencent.mm.kernel.h.xw();
        int i = com.tencent.mm.kernel.a.ww();
        at.AR();
        int j = bg.e((Integer)com.tencent.mm.y.c.xh().get(12304, null));
        paramf = getString(R.l.eaK, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (paramf == null)
        {
          GMTrace.o(4642859646976L, 34592);
          return true;
        }
        at.AR();
        com.tencent.mm.y.c.xh().set(12304, Integer.valueOf(0));
        paramPreference = new Intent();
        paramPreference.putExtra("title", getString(R.l.eaJ));
        paramPreference.putExtra("rawUrl", paramf);
        paramPreference.putExtra("showShare", false);
        com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramPreference);
        GMTrace.o(4642859646976L, 34592);
        return true;
      }
      if (com.tencent.mm.sdk.platformtools.v.bPH()) {}
      for (paramf = getString(R.l.dYW, new Object[] { com.tencent.mm.sdk.platformtools.v.bPK(), Integer.valueOf(com.tencent.mm.protocal.d.tJC) });; paramf = "http://blog.wechat.com/")
      {
        paramPreference = new Intent();
        paramPreference.putExtra("rawUrl", paramf);
        paramPreference.putExtra("showShare", false);
        paramPreference.putExtra("show_bottom", false);
        com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramPreference);
        GMTrace.o(4642859646976L, 34592);
        return true;
      }
    }
    if (paramf.equals("funtion_update"))
    {
      g.ork.a(405L, 16L, 1L, true);
      paramPreference = "";
      if (this.oHA) {
        paramf = getString(R.l.dYX, new Object[] { com.tencent.mm.sdk.platformtools.v.bPK(), Integer.valueOf(this.oHC) });
      }
      for (;;)
      {
        paramPreference = new Intent();
        paramPreference.putExtra("rawUrl", paramf);
        paramPreference.putExtra("showShare", true);
        paramPreference.putExtra("show_bottom", false);
        com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramPreference);
        GMTrace.o(4642859646976L, 34592);
        return true;
        paramf = paramPreference;
        if (this.oHB != null)
        {
          paramf = paramPreference;
          if (this.oHB.uud != 0)
          {
            paramf = paramPreference;
            if (!bg.nm(this.oHB.uue)) {
              paramf = this.oHB.uue;
            }
          }
        }
      }
    }
    if (paramf.equals("funtion_check_update"))
    {
      g.ork.a(405L, 17L, 1L, true);
      if (p.x.bIV() != null)
      {
        p.x.bIV().bcj();
        if ((com.tencent.mm.sdk.platformtools.f.eqX & 0x1) != 0)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAboutMicroMsgUI", "package has set external update mode");
          paramf = Uri.parse(com.tencent.mm.sdk.platformtools.f.vhr);
          paramPreference = new Intent("android.intent.action.VIEW", paramf).addFlags(268435456);
          if ((paramf == null) || (paramPreference == null) || (!bg.j(this.vKB.vKW, paramPreference)))
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAboutMicroMsgUI", "parse market uri failed, jump to weixin.qq.com");
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456));
            g.ork.a(405L, 18L, 1L, true);
          }
          for (;;)
          {
            GMTrace.o(4642859646976L, 34592);
            return true;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAboutMicroMsgUI", "parse market uri ok");
            startActivity(paramPreference);
            g.ork.a(405L, 19L, 1L, true);
          }
        }
        if ((this.oHB != null) && (this.oHB.uud != 0) && (!bg.nm(this.oHB.uue)))
        {
          paramf = this.oHB.uue;
          paramPreference = new Intent();
          paramPreference.putExtra("rawUrl", paramf);
          paramPreference.putExtra("showShare", false);
          paramPreference.putExtra("show_bottom", false);
          com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramPreference);
          g.ork.a(405L, 20L, 1L, true);
          GMTrace.o(4642859646976L, 34592);
          return true;
        }
        ab.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bg.Pu()).commit();
        paramf = p.x.bIV().a(this, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(16883919093760L, 125795);
            g.ork.a(405L, 23L, 1L, true);
            GMTrace.o(16883919093760L, 125795);
          }
        });
        if (paramf == null) {
          g.ork.a(405L, 21L, 1L, true);
        }
      }
      else
      {
        GMTrace.o(4642859646976L, 34592);
        return false;
      }
      g.ork.a(405L, 22L, 1L, true);
      paramf.update(3);
      GMTrace.o(4642859646976L, 34592);
      return true;
    }
    if (paramf.equals("funtion_about_wechat"))
    {
      com.tencent.mm.bj.d.b(this, "whatsnew", ".ui.WhatsNewUI", new Intent());
      GMTrace.o(4642859646976L, 34592);
      return true;
    }
    if (paramf.equals("settings_report"))
    {
      paramf = new Intent();
      paramf.putExtra("showShare", false);
      paramf.putExtra("show_feedback", false);
      paramf.putExtra("rawUrl", "https://support.weixin.qq.com/security/readtemplate?t=complaints/index");
      com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramf);
      GMTrace.o(4642859646976L, 34592);
      return true;
    }
    if (paramf.equals("settings_quit_wechat"))
    {
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, R.l.dIc, R.l.dIb, R.l.cUW, R.l.cTJ, new DialogInterface.OnClickListener()
      {
        public aj gOu;
        public com.tencent.mm.ad.e gWn;
        
        public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16884590182400L, 125800);
          com.tencent.mm.modelstat.c.Mh().Mi();
          at.AR();
          if (com.tencent.mm.y.c.yF())
          {
            paramAnonymousDialogInterface = at.wS();
            Object localObject = new com.tencent.mm.ad.e()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
              {
                GMTrace.i(4650912710656L, 34652);
                at.wS().b(281, SettingsAboutMicroMsgUI.2.this.gWn);
                SettingsAboutMicroMsgUI.2.this.gWn = null;
                if (SettingsAboutMicroMsgUI.2.this.gOu != null)
                {
                  SettingsAboutMicroMsgUI.2.this.gOu.stopTimer();
                  SettingsAboutMicroMsgUI.2.this.gOu = null;
                }
                if (SettingsAboutMicroMsgUI.a(SettingsAboutMicroMsgUI.this) != null) {
                  SettingsAboutMicroMsgUI.a(SettingsAboutMicroMsgUI.this).dismiss();
                }
                SettingsAboutMicroMsgUI.b(SettingsAboutMicroMsgUI.this);
                GMTrace.o(4650912710656L, 34652);
              }
            };
            this.gWn = ((com.tencent.mm.ad.e)localObject);
            paramAnonymousDialogInterface.a(281, (com.tencent.mm.ad.e)localObject);
            paramAnonymousDialogInterface = new ak(2);
            at.wS().a(paramAnonymousDialogInterface, 0);
            this.gOu = new aj(new aj.a()
            {
              public final boolean pM()
              {
                GMTrace.i(4614271270912L, 34379);
                at.wS().c(paramAnonymousDialogInterface);
                at.wS().b(281, SettingsAboutMicroMsgUI.2.this.gWn);
                SettingsAboutMicroMsgUI.2.this.gWn = null;
                if (SettingsAboutMicroMsgUI.2.this.gOu != null)
                {
                  SettingsAboutMicroMsgUI.2.this.gOu.stopTimer();
                  SettingsAboutMicroMsgUI.2.this.gOu = null;
                }
                if (SettingsAboutMicroMsgUI.a(SettingsAboutMicroMsgUI.this) != null) {
                  SettingsAboutMicroMsgUI.a(SettingsAboutMicroMsgUI.this).dismiss();
                }
                SettingsAboutMicroMsgUI.b(SettingsAboutMicroMsgUI.this);
                GMTrace.o(4614271270912L, 34379);
                return false;
              }
            }, false);
            this.gOu.z(5000L, 5000L);
            localObject = SettingsAboutMicroMsgUI.this;
            ActionBarActivity localActionBarActivity = SettingsAboutMicroMsgUI.this.vKB.vKW;
            SettingsAboutMicroMsgUI.this.getString(R.l.cUG);
            SettingsAboutMicroMsgUI.a((SettingsAboutMicroMsgUI)localObject, com.tencent.mm.ui.base.h.a(localActionBarActivity, SettingsAboutMicroMsgUI.this.getString(R.l.ekz), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(4629437874176L, 34492);
                at.wS().c(paramAnonymousDialogInterface);
                at.wS().b(281, SettingsAboutMicroMsgUI.2.this.gWn);
                SettingsAboutMicroMsgUI.2.this.gWn = null;
                if (SettingsAboutMicroMsgUI.2.this.gOu != null)
                {
                  SettingsAboutMicroMsgUI.2.this.gOu.stopTimer();
                  SettingsAboutMicroMsgUI.2.this.gOu = null;
                }
                if (SettingsAboutMicroMsgUI.a(SettingsAboutMicroMsgUI.this) != null) {
                  SettingsAboutMicroMsgUI.a(SettingsAboutMicroMsgUI.this).dismiss();
                }
                GMTrace.o(4629437874176L, 34492);
              }
            }));
            GMTrace.o(16884590182400L, 125800);
            return;
          }
          SettingsAboutMicroMsgUI.b(SettingsAboutMicroMsgUI.this);
          GMTrace.o(16884590182400L, 125800);
        }
      }, null);
      GMTrace.o(4642859646976L, 34592);
      return true;
    }
    if (paramf.equals("funtion_crowdtest_update"))
    {
      com.tencent.mm.s.c.vK().aF(262157, 266263);
      at.AR();
      paramf = (String)com.tencent.mm.y.c.xh().get(w.a.vxP, null);
      paramPreference = new Intent();
      paramPreference.putExtra("rawUrl", paramf);
      paramPreference.putExtra("showShare", false);
      paramPreference.putExtra("show_bottom", false);
      com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramPreference);
      GMTrace.o(4642859646976L, 34592);
      return true;
    }
    GMTrace.o(4642859646976L, 34592);
    return false;
  }
  
  public final View bek()
  {
    GMTrace.i(16577634238464L, 123513);
    LinearLayout localLinearLayout = (LinearLayout)com.tencent.mm.ui.v.fb(this.vKB.vKW).inflate(R.i.cFZ, null);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(R.h.cgM);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(R.h.cgL);
    String str2 = com.tencent.mm.kernel.h.xy().xh().get(274436, "").toString();
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = com.tencent.mm.sdk.platformtools.v.bPJ();
    }
    str1 = getString(R.l.dGv, new Object[] { com.tencent.mm.sdk.platformtools.v.bPK(), str1 });
    localTextView1.setText(String.format("<a href='%s'>%s</a>", new Object[] { getString(R.l.efA), getString(R.l.dGq) }));
    localTextView2.setText(String.format("<a href='%s'>%s</a>", new Object[] { str1, getString(R.l.dOA) }));
    com.tencent.mm.pluginsdk.ui.d.h.e(localTextView1, 1);
    com.tencent.mm.pluginsdk.ui.d.h.e(localTextView2, 1);
    ((TextView)localLinearLayout.findViewById(R.h.bsc)).setText(localLinearLayout.getResources().getString(R.l.cSr, new Object[] { Integer.valueOf(2017) }));
    GMTrace.o(16577634238464L, 123513);
    return localLinearLayout;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4642188558336L, 34587);
    super.onCreate(paramBundle);
    MP();
    at.wS().a(11, this);
    if (p.x.bIV() != null)
    {
      paramBundle = p.x.bIV().bck();
      at.wS().a((k)paramBundle, 0);
      g.ork.a(405L, 15L, 1L, true);
    }
    GMTrace.o(4642188558336L, 34587);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4642456993792L, 34589);
    at.wS().b(11, this);
    super.onDestroy();
    GMTrace.o(4642456993792L, 34589);
  }
  
  public void onResume()
  {
    GMTrace.i(4642322776064L, 34588);
    super.onResume();
    bel();
    GMTrace.o(4642322776064L, 34588);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsAboutMicroMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */