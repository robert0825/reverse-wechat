package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.a.ed;
import com.tencent.mm.g.a.ed.a;
import com.tencent.mm.g.a.iv;
import com.tencent.mm.g.a.z;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.modelsimple.ak;
import com.tencent.mm.network.aa;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.e;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.s.a.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.SwitchKeyValuePreference;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

public class SettingsUI
  extends MMPreference
  implements m.b
{
  private com.tencent.mm.sdk.platformtools.aj gOu;
  private com.tencent.mm.ad.e gWn;
  private com.tencent.mm.ui.base.preference.f htU;
  private com.tencent.mm.sdk.platformtools.aj htb;
  private View mHj;
  private ProgressDialog oHE;
  private com.tencent.mm.sdk.platformtools.aj oHF;
  private com.tencent.mm.ad.e oHG;
  private Dialog oKA;
  private com.tencent.mm.ad.e oKB;
  private PersonalPreference oKu;
  private com.tencent.mm.ad.e oKv;
  private a.a oKw;
  private Dialog oKx;
  private i oKy;
  private CheckBox oKz;
  
  public SettingsUI()
  {
    GMTrace.i(4697754697728L, 35001);
    this.oKu = null;
    this.oHE = null;
    this.gWn = null;
    this.oKv = null;
    this.oHG = null;
    this.oKw = new a.a()
    {
      public final void a(w.a paramAnonymousa)
      {
        GMTrace.i(4616552972288L, 34396);
        GMTrace.o(4616552972288L, 34396);
      }
      
      public final void eJ(int paramAnonymousInt)
      {
        GMTrace.i(4616284536832L, 34394);
        if ((paramAnonymousInt == 262145) || (paramAnonymousInt == 262157) || (paramAnonymousInt == 262158)) {
          SettingsUI.a(SettingsUI.this);
        }
        GMTrace.o(4616284536832L, 34394);
      }
      
      public final void eK(int paramAnonymousInt)
      {
        GMTrace.i(4616418754560L, 34395);
        GMTrace.o(4616418754560L, 34395);
      }
    };
    this.oKx = null;
    this.oKA = null;
    this.gOu = null;
    this.oKB = null;
    GMTrace.o(4697754697728L, 35001);
  }
  
  private void beK()
  {
    GMTrace.i(4698694221824L, 35008);
    IconSwitchKeyValuePreference localIconSwitchKeyValuePreference = (IconSwitchKeyValuePreference)this.htU.VG("settings_account_info");
    if (localIconSwitchKeyValuePreference == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsUI", "safedevicesate preference is null");
      GMTrace.o(4698694221824L, 35008);
      return;
    }
    localIconSwitchKeyValuePreference.Cp(8);
    at.AR();
    if (((Integer)com.tencent.mm.y.c.xh().get(9, Integer.valueOf(0))).intValue() == 0)
    {
      GMTrace.o(4698694221824L, 35008);
      return;
    }
    if (q.zM())
    {
      localIconSwitchKeyValuePreference.setSummary(R.l.dUh);
      localIconSwitchKeyValuePreference.Cs(1);
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("VoiceprintEntry"), 0) == 1)
      {
        at.AR();
        if (!((Boolean)com.tencent.mm.y.c.xh().get(w.a.vqz, Boolean.valueOf(true))).booleanValue()) {
          break label223;
        }
        at.AR();
        if ((com.tencent.mm.y.c.xh().getInt(40, 0) & 0x20000) == 0)
        {
          localIconSwitchKeyValuePreference.cS(getString(R.l.cTH), R.g.aYs);
          localIconSwitchKeyValuePreference.Ck(0);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "show voiceprint dot");
        }
      }
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(4698694221824L, 35008);
      return;
      localIconSwitchKeyValuePreference.setSummary(R.l.dUi);
      localIconSwitchKeyValuePreference.Cs(2);
      break;
      label223:
      localIconSwitchKeyValuePreference.Ck(8);
    }
  }
  
  private void beL()
  {
    GMTrace.i(4699231092736L, 35012);
    IconPreference localIconPreference = (IconPreference)this.htU.VG("settings_about_privacy");
    if (localIconPreference != null)
    {
      at.AR();
      int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwY, Integer.valueOf(0))).intValue();
      at.AR();
      if (i > ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwZ, Integer.valueOf(0))).intValue())
      {
        localIconPreference.Cm(0);
        GMTrace.o(4699231092736L, 35012);
        return;
      }
      localIconPreference.Cm(8);
    }
    GMTrace.o(4699231092736L, 35012);
  }
  
  private void beM()
  {
    GMTrace.i(4699365310464L, 35013);
    m.a locala = com.tencent.mm.modelfriend.m.Ho();
    SwitchKeyValuePreference localSwitchKeyValuePreference = (SwitchKeyValuePreference)this.htU.VG("settings_bind_mobile");
    boolean bool;
    if (localSwitchKeyValuePreference != null)
    {
      if ((locala != m.a.gDm) && (locala != m.a.gDn)) {
        break label96;
      }
      bool = true;
      localSwitchKeyValuePreference.eDU = bool;
      localSwitchKeyValuePreference.ar();
      if ((locala != m.a.gDm) && (locala != m.a.gDn)) {
        break label101;
      }
    }
    label96:
    label101:
    for (int i = R.l.dZU;; i = R.l.dZT)
    {
      localSwitchKeyValuePreference.setSummary(i);
      GMTrace.o(4699365310464L, 35013);
      return;
      bool = false;
      break;
    }
  }
  
  private void beN()
  {
    GMTrace.i(4699633745920L, 35015);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "oneliang logout mm");
    com.tencent.mm.plugin.setting.a.hnI.px();
    at.AR();
    com.tencent.mm.y.c.xh().b(this);
    Object localObject = new iv();
    ((iv)localObject).eMv.status = 0;
    ((iv)localObject).eMv.eMw = 0;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new z();
    ((z)localObject).eAW.eAX = true;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    ad.RT("show_whatsnew");
    com.tencent.mm.kernel.k.d(this, true);
    localObject = new Intent();
    ((Intent)localObject).addFlags(67108864);
    ((Intent)localObject).putExtra("Intro_Switch", true);
    com.tencent.mm.plugin.setting.a.hnH.s((Intent)localObject, this.vKB.vKW);
    com.tencent.mm.modelsimple.d.A(this, null);
    finish();
    GMTrace.o(4699633745920L, 35015);
  }
  
  private boolean beO()
  {
    GMTrace.i(4699767963648L, 35016);
    com.tencent.mm.plugin.report.service.g.ork.i(11545, new Object[] { Integer.valueOf(1) });
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
    if (this.oKx != null)
    {
      this.oKx.show();
      GMTrace.o(4699767963648L, 35016);
      return true;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
    this.oKx = com.tencent.mm.ui.base.h.a(this, getString(R.l.dZj), "", getString(R.l.dZh), getString(R.l.dZi), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(4708089462784L, 35078);
        com.tencent.mm.plugin.report.service.g.ork.i(11545, new Object[] { Integer.valueOf(3) });
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutConfirm");
        com.tencent.mm.plugin.report.service.g.ork.a(99L, 145L, 1L, false);
        if ((at.wS() != null) && (at.wS().gus != null)) {
          at.wS().gus.bn(false);
        }
        if (SettingsUI.b(SettingsUI.this) != null) {
          SettingsUI.b(SettingsUI.this).dismiss();
        }
        SettingsUI.c(SettingsUI.this);
        GMTrace.o(4708089462784L, 35078);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(4671582240768L, 34806);
        com.tencent.mm.plugin.report.service.g.ork.i(11545, new Object[] { Integer.valueOf(2) });
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutCancel");
        if (SettingsUI.b(SettingsUI.this) != null) {
          SettingsUI.b(SettingsUI.this).dismiss();
        }
        GMTrace.o(4671582240768L, 34806);
      }
    });
    GMTrace.o(4699767963648L, 35016);
    return true;
  }
  
  private boolean beP()
  {
    GMTrace.i(4699902181376L, 35017);
    com.tencent.mm.plugin.report.service.g.ork.i(11545, new Object[] { Integer.valueOf(4) });
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseWeChat");
    if (this.mHj == null)
    {
      this.mHj = View.inflate(this.vKB.vKW, R.i.cGc, null);
      this.oKz = ((CheckBox)this.mHj.findViewById(R.h.cdd));
      this.oKz.setChecked(true);
    }
    if (this.oKy == null) {
      this.oKy = com.tencent.mm.ui.base.h.a(this.vKB.vKW, null, this.mHj, getString(R.l.dHo), getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4674535030784L, 34828);
          com.tencent.mm.modelstat.c.Mh().Mi();
          if ((SettingsUI.d(SettingsUI.this) != null) && (SettingsUI.d(SettingsUI.this).isChecked()))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "push notify mode exit");
            com.tencent.mm.plugin.report.service.g.ork.a(99L, 143L, 1L, false);
            com.tencent.mm.plugin.report.service.g.ork.i(11545, new Object[] { Integer.valueOf(6) });
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
            aa.OR().edit().putBoolean("is_in_notify_mode", true).commit();
            SettingsUI.e(SettingsUI.this);
            GMTrace.o(4674535030784L, 34828);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "normally exit");
          com.tencent.mm.plugin.report.service.g.ork.a(99L, 144L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.i(11545, new Object[] { Integer.valueOf(7) });
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
          if ((at.wS() != null) && (at.wS().gus != null)) {
            at.wS().gus.bn(false);
          }
          SettingsUI.f(SettingsUI.this);
          GMTrace.o(4674535030784L, 34828);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4665676660736L, 34762);
          com.tencent.mm.plugin.report.service.g.ork.i(11545, new Object[] { Integer.valueOf(5) });
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseCancel");
          GMTrace.o(4665676660736L, 34762);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(4699902181376L, 35017);
      return true;
      this.oKy.show();
    }
  }
  
  private void beQ()
  {
    GMTrace.i(15007957909504L, 111818);
    Object localObject = at.wS();
    com.tencent.mm.ad.e local17 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(15007018385408L, 111811);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15006615732224L, 111808);
            at.wS().b(282, SettingsUI.u(SettingsUI.this));
            SettingsUI.x(SettingsUI.this);
            GMTrace.o(15006615732224L, 111808);
          }
        });
        GMTrace.o(15007018385408L, 111811);
      }
    };
    this.oKv = local17;
    ((com.tencent.mm.ad.n)localObject).a(282, local17);
    localObject = new com.tencent.mm.modelsimple.t();
    at.wS().a((com.tencent.mm.ad.k)localObject, 0);
    GMTrace.o(15007957909504L, 111818);
  }
  
  private void beR()
  {
    GMTrace.i(4700170616832L, 35019);
    final Object localObject1 = at.wS();
    Object localObject2 = new com.tencent.mm.ad.e()
    {
      public final void a(final int paramAnonymousInt1, final int paramAnonymousInt2, String paramAnonymousString, final com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(15008763215872L, 111824);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsUI", "onSceneEnd " + paramAnonymousInt1 + " errCode " + paramAnonymousInt2 + " errMsg " + paramAnonymousString + "  " + paramAnonymousk.getType());
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15009031651328L, 111826);
            at.wS().b(255, SettingsUI.p(SettingsUI.this));
            SettingsUI.q(SettingsUI.this);
            if (SettingsUI.r(SettingsUI.this) != null)
            {
              SettingsUI.r(SettingsUI.this).stopTimer();
              SettingsUI.s(SettingsUI.this);
            }
            if (SettingsUI.n(SettingsUI.this) != null) {
              SettingsUI.n(SettingsUI.this).dismiss();
            }
            if ((paramAnonymousk.getType() == 255) && (((com.tencent.mm.modelsimple.w)paramAnonymousk).gUN == 1))
            {
              if ((paramAnonymousInt2 == -3) && (paramAnonymousInt1 == 4))
              {
                Intent localIntent = new Intent(SettingsUI.this.vKB.vKW, RegByMobileSetPwdUI.class);
                localIntent.putExtra("kintent_hint", SettingsUI.this.getString(R.l.dRF));
                SettingsUI.this.startActivityForResult(localIntent, 0);
                GMTrace.o(15009031651328L, 111826);
                return;
              }
              SettingsUI.A(SettingsUI.this);
            }
            GMTrace.o(15009031651328L, 111826);
          }
        });
        GMTrace.o(15008763215872L, 111824);
      }
    };
    this.oHG = ((com.tencent.mm.ad.e)localObject2);
    ((com.tencent.mm.ad.n)localObject1).a(255, (com.tencent.mm.ad.e)localObject2);
    localObject1 = new com.tencent.mm.modelsimple.w(2);
    ((com.tencent.mm.modelsimple.w)localObject1).gUN = 1;
    at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
    this.oHF = new com.tencent.mm.sdk.platformtools.aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(15007555256320L, 111815);
        at.wS().c(localObject1);
        at.wS().b(255, SettingsUI.p(SettingsUI.this));
        SettingsUI.q(SettingsUI.this);
        if (SettingsUI.r(SettingsUI.this) != null)
        {
          SettingsUI.r(SettingsUI.this).stopTimer();
          SettingsUI.s(SettingsUI.this);
        }
        if (SettingsUI.n(SettingsUI.this) != null) {
          SettingsUI.n(SettingsUI.this).cancel();
        }
        SettingsUI.A(SettingsUI.this);
        GMTrace.o(15007555256320L, 111815);
        return false;
      }
    }, false);
    this.oHF.z(3000L, 3000L);
    localObject2 = this.vKB.vKW;
    getString(R.l.cUG);
    this.oHE = com.tencent.mm.ui.base.h.a((Context)localObject2, getString(R.l.elP), false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(15007823691776L, 111817);
        at.wS().c(localObject1);
        at.wS().b(255, SettingsUI.p(SettingsUI.this));
        SettingsUI.q(SettingsUI.this);
        if (SettingsUI.r(SettingsUI.this) != null)
        {
          SettingsUI.r(SettingsUI.this).stopTimer();
          SettingsUI.s(SettingsUI.this);
        }
        if (SettingsUI.n(SettingsUI.this) != null) {
          SettingsUI.n(SettingsUI.this).dismiss();
        }
        GMTrace.o(15007823691776L, 111817);
      }
    });
    GMTrace.o(4700170616832L, 35019);
  }
  
  private void bem()
  {
    int i = 0;
    GMTrace.i(4699096875008L, 35011);
    IconPreference localIconPreference = (IconPreference)this.htU.VG("settings_about_micromsg");
    boolean bool1 = bg.a(Boolean.valueOf(com.tencent.mm.s.c.vK().aD(262145, 266243)), false);
    boolean bool2 = com.tencent.mm.s.c.vK().aE(262157, 266262);
    if (com.tencent.mm.sdk.platformtools.f.vhv)
    {
      localIconPreference.cS("", -1);
      localIconPreference.Ck(8);
      bool1 = com.tencent.mm.s.c.vK().aE(262158, 266265);
      localIconPreference = (IconPreference)this.htU.VG("settings_about_system");
      if (!bool1) {
        break label200;
      }
    }
    for (;;)
    {
      localIconPreference.Cm(i);
      GMTrace.o(4699096875008L, 35011);
      return;
      if (bool1)
      {
        localIconPreference.Ck(0);
        localIconPreference.cS(getString(R.l.cTH), R.g.aYs);
        break;
      }
      if (bool2)
      {
        localIconPreference.Cm(0);
        break;
      }
      localIconPreference.Cm(8);
      localIconPreference.cS("", -1);
      localIconPreference.Ck(8);
      break;
      label200:
      i = 8;
    }
  }
  
  private void hj(boolean paramBoolean)
  {
    GMTrace.i(4700036399104L, 35018);
    ad.RT("welcome_page_show");
    if (paramBoolean) {
      at.getNotification().rB();
    }
    for (;;)
    {
      z localz = new z();
      localz.eAW.eAX = false;
      com.tencent.mm.sdk.b.a.vgX.m(localz);
      com.tencent.mm.plugin.setting.a.hnI.pu();
      at.getNotification().ry();
      finish();
      if (p.a.tlX != null) {
        p.a.tlX.a(this.vKB.vKW, paramBoolean);
      }
      GMTrace.o(4700036399104L, 35018);
      return;
      at.getNotification().i(-1, null);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(4698828439552L, 35009);
    oM(R.l.eaM);
    this.htU = this.wky;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4706210414592L, 35064);
        SettingsUI.this.finish();
        GMTrace.o(4706210414592L, 35064);
        return true;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4723390283776L, 35192);
        BackwardSupportUtil.c.a(SettingsUI.this.mqO);
        GMTrace.o(4723390283776L, 35192);
      }
    };
    beM();
    bem();
    beL();
    GMTrace.o(4698828439552L, 35009);
  }
  
  public final int QI()
  {
    GMTrace.i(4697888915456L, 35002);
    int i = R.o.epn;
    GMTrace.o(4697888915456L, 35002);
    return i;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(4698962657280L, 35010);
    int i = bg.m(paramObject, 0);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != com.tencent.mm.y.c.xh()) || (i <= 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(4698962657280L, 35010);
      return;
    }
    if (4 == i)
    {
      at.AR();
      com.tencent.mm.y.c.xh().get(2, null);
      at.AR();
      com.tencent.mm.y.c.xh().get(4, null);
    }
    if (6 == i)
    {
      beM();
      GMTrace.o(4698962657280L, 35010);
      return;
    }
    if (64 == i) {
      beK();
    }
    GMTrace.o(4698962657280L, 35010);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(4699499528192L, 35014);
    paramf = paramPreference.hiu;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", paramf + " item has been clicked!");
    if ("settings_welab".equals(paramf))
    {
      ((com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.welab.a.a.c.class)).u(this, new Intent());
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if ("settings_account_info".equals(paramf))
    {
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("VoiceprintEntry"), 0) == 1)
      {
        at.AR();
        if ((com.tencent.mm.y.c.xh().getInt(40, 0) & 0x20000) == 0)
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vqz, Boolean.valueOf(false));
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "unset setting account info dot show");
        }
      }
      z(SettingsAccountInfoUI.class);
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if ("settings_account".equals(paramf))
    {
      this.vKB.vKW.startActivity(new Intent(this, SettingsPersonalInfoUI.class));
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_bind_mobile"))
    {
      paramf = new Intent(this, BindMContactIntroUI.class);
      paramf.putExtra("key_upload_scene", 4);
      MMWizardActivity.A(this, paramf);
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_about_privacy"))
    {
      at.AR();
      int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwY, Integer.valueOf(0))).intValue();
      at.AR();
      if (i > ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwZ, Integer.valueOf(0))).intValue())
      {
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vwZ, Integer.valueOf(i));
      }
      startActivity(new Intent(this, SettingsPrivacyUI.class));
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_about_system"))
    {
      com.tencent.mm.s.c.vK().aF(262158, 266265);
      startActivity(new Intent(this, SettingsAboutSystemUI.class));
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_about_micromsg"))
    {
      com.tencent.mm.s.c.vK().aF(262145, 266243);
      com.tencent.mm.s.c.vK().aF(262157, 266262);
      this.vKB.vKW.startActivity(new Intent(this, SettingsAboutMicroMsgUI.class));
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4630645833728L, 34501);
          Intent localIntent = new Intent();
          localIntent.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
          localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
          SettingsUI.this.sendBroadcast(localIntent);
          GMTrace.o(4630645833728L, 34501);
        }
      }, 100L);
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_about_device"))
    {
      paramf = new Intent();
      com.tencent.mm.bj.d.b(this.vKB.vKW, "exdevice", ".ui.ExdeviceManageDeviceUI", paramf);
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_logout"))
    {
      if (com.tencent.mm.ap.b.Jw())
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "oversea user logout");
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, true, getResources().getString(R.l.dZj), "", getResources().getString(R.l.dZh), getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4670776934400L, 34800);
            SettingsUI.c(SettingsUI.this);
            GMTrace.o(4670776934400L, 34800);
          }
        }, null);
        GMTrace.o(4699499528192L, 35014);
        return true;
      }
      com.tencent.mm.plugin.report.service.g.ork.i(11545, new Object[] { Integer.valueOf(8) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutCloseEntrance");
      paramf = new i.a(this.vKB.vKW);
      paramPreference = View.inflate(this.vKB.vKW, R.i.cAV, null);
      paramPreference.findViewById(R.h.bMT).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4618968891392L, 34414);
          SettingsUI.g(SettingsUI.this).dismiss();
          SettingsUI.h(SettingsUI.this);
          GMTrace.o(4618968891392L, 34414);
        }
      });
      paramPreference.findViewById(R.h.bMS).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4691043811328L, 34951);
          SettingsUI.g(SettingsUI.this).dismiss();
          SettingsUI.i(SettingsUI.this);
          GMTrace.o(4691043811328L, 34951);
        }
      });
      paramf.dg(paramPreference);
      this.oKA = paramf.aax();
      this.oKA.show();
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    boolean bool;
    if (paramf.equals("settings_exit"))
    {
      bool = beP();
      GMTrace.o(4699499528192L, 35014);
      return bool;
    }
    if (paramf.equals("settings_logout_option"))
    {
      bool = beO();
      GMTrace.o(4699499528192L, 35014);
      return bool;
    }
    if (paramf.equals("settings_notification_preference"))
    {
      startActivity(new Intent(this, SettingsNotificationUI.class));
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_chatting"))
    {
      z(SettingsChattingUI.class);
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_active_time"))
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11351, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
      z(SettingsActiveTimeUI.class);
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_safe"))
    {
      z(SettingsSafeUI.class);
      GMTrace.o(4699499528192L, 35014);
      return true;
    }
    if (paramf.equals("settings_feedback"))
    {
      if ((com.tencent.mm.sdk.platformtools.f.vhv) || (!v.bPK().equals("zh_CN"))) {
        break label1068;
      }
      paramf = getString(R.l.ekG);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsUI", "using faq webpage");
      paramPreference = new Intent();
      paramPreference.putExtra("showShare", false);
      paramPreference.putExtra("rawUrl", paramf);
      paramPreference.putExtra("show_feedback", false);
      com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramPreference);
      GMTrace.o(4699499528192L, 35014);
      return false;
      label1068:
      if (v.bPK().equals("zh_HK")) {
        paramf = getString(R.l.ekH);
      } else if (v.bPK().equals("zh_TW")) {
        paramf = getString(R.l.ekI);
      } else {
        paramf = getString(R.l.ekJ);
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4698291568640L, 35005);
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.SettingsUI", "settings handle");
    switch (paramInt1)
    {
    default: 
      GMTrace.o(4698291568640L, 35005);
      return;
    case 5: 
      if (paramInt2 == -1) {
        beN();
      }
      GMTrace.o(4698291568640L, 35005);
      return;
    case 3: 
      localObject1 = getApplicationContext();
      at.AR();
      paramIntent = com.tencent.mm.pluginsdk.ui.tools.k.b((Context)localObject1, paramIntent, com.tencent.mm.y.c.yU());
      if (paramIntent == null)
      {
        GMTrace.o(4698291568640L, 35005);
        return;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("CropImageMode", 1);
      ((Intent)localObject1).putExtra("CropImage_OutputPath", paramIntent);
      ((Intent)localObject1).putExtra("CropImage_ImgPath", paramIntent);
      com.tencent.mm.plugin.setting.a.hnH.a(this.vKB.vKW, (Intent)localObject1, 4);
      GMTrace.o(4698291568640L, 35005);
      return;
    case 2: 
      if (paramIntent == null)
      {
        GMTrace.o(4698291568640L, 35005);
        return;
      }
      localObject1 = getApplicationContext();
      at.AR();
      Object localObject2 = com.tencent.mm.pluginsdk.ui.tools.k.b((Context)localObject1, paramIntent, com.tencent.mm.y.c.yU());
      if (localObject2 == null)
      {
        GMTrace.o(4698291568640L, 35005);
        return;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("CropImageMode", 1);
      com.tencent.mm.ac.n.Dh();
      ((Intent)localObject1).putExtra("CropImage_OutputPath", com.tencent.mm.ac.d.t(q.zE(), true));
      ((Intent)localObject1).putExtra("CropImage_ImgPath", (String)localObject2);
      localObject2 = com.tencent.mm.plugin.setting.a.hnH;
      at.AR();
      ((com.tencent.mm.pluginsdk.m)localObject2).a(this, paramIntent, (Intent)localObject1, com.tencent.mm.y.c.yU(), 4, null);
      GMTrace.o(4698291568640L, 35005);
      return;
    }
    if (paramIntent == null)
    {
      GMTrace.o(4698291568640L, 35005);
      return;
    }
    Object localObject1 = paramIntent.getStringExtra("CropImage_OutputPath");
    if (localObject1 == null) {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsUI", "crop picture failed");
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(4698291568640L, 35005);
      return;
      new o(this.vKB.vKW, (String)localObject1).b(1, null);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4698023133184L, 35003);
    super.onCreate(paramBundle);
    MP();
    at.AR();
    com.tencent.mm.y.c.xh().a(this);
    com.tencent.mm.s.c.vK().a(this.oKw);
    if (bg.getInt(com.tencent.mm.k.g.ut().getValue("VoiceprintEntry"), 0) == 1)
    {
      at.AR();
      if ((com.tencent.mm.y.c.xh().getInt(40, 0) & 0x20000) == 0)
      {
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vqx, Boolean.valueOf(false));
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsUI", "unset more tab dot");
      }
    }
    GMTrace.o(4698023133184L, 35003);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4698157350912L, 35004);
    if (at.AU())
    {
      at.AR();
      com.tencent.mm.y.c.xh().b(this);
      com.tencent.mm.s.c.vK().b(this.oKw);
    }
    if (this.gWn != null) {
      at.wS().b(281, this.gWn);
    }
    if (this.oHG != null) {
      at.wS().b(255, this.oHG);
    }
    if (this.oKB != null) {
      at.wS().b(281, this.oKB);
    }
    super.onDestroy();
    GMTrace.o(4698157350912L, 35004);
  }
  
  public void onPause()
  {
    GMTrace.i(4698425786368L, 35006);
    super.onPause();
    at.xB().E(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4678158909440L, 34855);
        at.AR();
        com.tencent.mm.y.c.xh().kL(true);
        GMTrace.o(4678158909440L, 34855);
      }
    });
    GMTrace.o(4698425786368L, 35006);
  }
  
  public void onResume()
  {
    GMTrace.i(4698560004096L, 35007);
    Object localObject1 = (PersonalPreference)this.htU.VG("settings_account");
    if (localObject1 != null)
    {
      localObject2 = q.zE();
      ((PersonalPreference)localObject1).gsp = null;
      ((PersonalPreference)localObject1).oGK = -1;
      ((PersonalPreference)localObject1).oGL = ((String)localObject2);
      if (((PersonalPreference)localObject1).ljR != null) {
        a.b.a(((PersonalPreference)localObject1).ljR, ((PersonalPreference)localObject1).oGL);
      }
    }
    localObject1 = new ed();
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    if (!((ed)localObject1).eFT.eEu)
    {
      localObject1 = this.htU.VG("settings_about_device");
      this.htU.c((Preference)localObject1);
    }
    beK();
    beM();
    bem();
    beL();
    localObject1 = (IconPreference)this.htU.VG("settings_welab");
    Object localObject2 = (com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.welab.a.a.c.class);
    if (((com.tencent.mm.plugin.welab.a.a.c)localObject2).bGz())
    {
      ((IconPreference)localObject1).Ck(0);
      ((IconPreference)localObject1).cS(getString(R.l.cTH), R.g.aYs);
      if (!((com.tencent.mm.plugin.welab.a.a.c)localObject2).bGA()) {
        break label254;
      }
      if (!((com.tencent.mm.plugin.welab.a.a.c)localObject2).bGy()) {
        break label243;
      }
      ((IconPreference)localObject1).es(0, R.k.cPJ);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.SettingsUI", "on resume");
      super.onResume();
      GMTrace.o(4698560004096L, 35007);
      return;
      ((IconPreference)localObject1).Ck(8);
      break;
      label243:
      ((IconPreference)localObject1).es(0, R.k.cPI);
      continue;
      label254:
      ((IconPreference)localObject1).es(8, -1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */