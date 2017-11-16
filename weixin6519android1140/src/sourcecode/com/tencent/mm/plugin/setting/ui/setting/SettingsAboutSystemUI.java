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
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.k.e;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import java.util.List;

public class SettingsAboutSystemUI
  extends MMPreference
{
  private com.tencent.mm.ui.base.preference.f htU;
  private boolean jqh;
  private ProgressDialog oHE;
  private boolean oHM;
  private int oHN;
  private int oHO;
  private boolean oHP;
  
  public SettingsAboutSystemUI()
  {
    GMTrace.i(4714263478272L, 35124);
    this.oHM = false;
    this.oHE = null;
    this.jqh = false;
    this.oHN = -1;
    this.oHO = -1;
    this.oHP = false;
    GMTrace.o(4714263478272L, 35124);
  }
  
  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(4715874091008L, 35136);
    TextView localTextView = (TextView)View.inflate(this.vKB.vKW, R.i.cEd, null);
    localTextView.setText(paramInt1);
    localTextView.setTag(Integer.valueOf(paramInt2));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramBoolean) {
      localTextView.setCompoundDrawablesWithIntrinsicBounds(R.k.cOv, 0, 0, 0);
    }
    GMTrace.o(4715874091008L, 35136);
  }
  
  private void bem()
  {
    GMTrace.i(4715203002368L, 35131);
    IconPreference localIconPreference = (IconPreference)this.htU.VG("settings_plugins");
    at.AR();
    if (bg.a((Boolean)com.tencent.mm.y.c.xh().get(-2046825377, null), false))
    {
      localIconPreference.Ck(0);
      localIconPreference.cS(getString(R.l.cTH), R.g.aYs);
      if (!com.tencent.mm.s.c.vK().aE(262158, 266266)) {
        break label119;
      }
    }
    label119:
    for (int i = 0;; i = 8)
    {
      localIconPreference.Cm(i);
      this.htU.notifyDataSetChanged();
      GMTrace.o(4715203002368L, 35131);
      return;
      localIconPreference.Ck(8);
      localIconPreference.cS("", -1);
      break;
    }
  }
  
  private boolean ben()
  {
    GMTrace.i(4715337220096L, 35132);
    startActivity(new Intent(this, SettingsFontUI.class));
    GMTrace.o(4715337220096L, 35132);
    return true;
  }
  
  private void beo()
  {
    int j = 1;
    GMTrace.i(4715739873280L, 35135);
    if (bg.Sy(com.tencent.mm.k.g.ut().getValue("SilentDownloadApkAtWiFi")) != 0) {}
    for (int i = 1;; i = 0)
    {
      if ((com.tencent.mm.sdk.platformtools.f.eqX & 0x1) != 0)
      {
        w.d("MicroMsg.SettingsAboutSystemUI", "channel pack, not silence download.");
        i = 1;
      }
      if (i == 0) {
        break;
      }
      this.htU.bc("settings_silence_update_mode", true);
      GMTrace.o(4715739873280L, 35135);
      return;
    }
    this.htU.bc("settings_silence_update_mode", false);
    at.AR();
    Preference localPreference;
    if ((((Integer)com.tencent.mm.y.c.xh().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
    {
      i = j;
      localPreference = this.htU.VG("settings_silence_update_mode");
      if (i == 0) {
        break label177;
      }
    }
    label177:
    for (i = R.l.eaC;; i = R.l.eaB)
    {
      localPreference.setSummary(getString(i));
      this.htU.notifyDataSetChanged();
      GMTrace.o(4715739873280L, 35135);
      return;
      i = 0;
      break;
    }
  }
  
  private void bep()
  {
    GMTrace.i(4716008308736L, 35137);
    int i = bg.getInt(com.tencent.mm.k.g.ut().getValue("SIGHTAutoLoadNetwork"), 1);
    at.AR();
    int j = bg.a((Integer)com.tencent.mm.y.c.xh().get(327686, null), i);
    w.i("MicroMsg.SettingsAboutSystemUI", "auto getSightViewSummary %d, %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if (this.oHN == -1) {
      this.oHN = j;
    }
    this.oHO = j;
    if (3 == j) {
      i = R.l.eaE;
    }
    for (;;)
    {
      Preference localPreference = this.htU.VG("settings_sns_sight_auto_download");
      if ((localPreference != null) && (i != 0)) {
        localPreference.setSummary(getString(i));
      }
      this.htU.notifyDataSetChanged();
      GMTrace.o(4716008308736L, 35137);
      return;
      if (2 == j) {
        i = R.l.eaG;
      } else {
        i = R.l.eaD;
      }
    }
  }
  
  private void gt(boolean paramBoolean)
  {
    GMTrace.i(4715471437824L, 35133);
    if (paramBoolean)
    {
      getPackageManager().setComponentEnabledSetting(new ComponentName(ab.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vrN, Integer.valueOf(1));
      GMTrace.o(4715471437824L, 35133);
      return;
    }
    getPackageManager().setComponentEnabledSetting(new ComponentName(ab.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vrN, Integer.valueOf(2));
    GMTrace.o(4715471437824L, 35133);
  }
  
  private void hf(boolean paramBoolean)
  {
    GMTrace.i(4715605655552L, 35134);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.htU.VG("settings_nfc_switch");
    ab.getContext().getSharedPreferences(ab.bPU(), 0).edit().putBoolean("settings_nfc_switch", paramBoolean).commit();
    localCheckBoxPreference.sdM = paramBoolean;
    this.htU.notifyDataSetChanged();
    GMTrace.o(4715605655552L, 35134);
  }
  
  protected final void MP()
  {
    GMTrace.i(4714666131456L, 35127);
    oM(R.l.dYs);
    this.htU = this.wky;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4658831556608L, 34711);
        SettingsAboutSystemUI.this.aLo();
        SettingsAboutSystemUI.this.finish();
        GMTrace.o(4658831556608L, 34711);
        return true;
      }
    });
    com.tencent.mm.ui.base.preference.f localf = this.htU;
    if (!com.tencent.mm.compatible.util.d.et(19)) {}
    for (boolean bool = true;; bool = false)
    {
      localf.bc("settings_swipeback_mode", bool);
      if (!com.tencent.mm.bj.d.LL("backup")) {
        this.htU.bc("settings_bak_chat", true);
      }
      bem();
      this.htU.bc("settings_traffic_statistic", com.tencent.mm.bj.d.bNA());
      if (r.hlf) {
        this.htU.bc("settings_take_photo", true);
      }
      GMTrace.o(4714666131456L, 35127);
      return;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(4714397696000L, 35125);
    int i = R.o.epz;
    GMTrace.o(4714397696000L, 35125);
    return i;
  }
  
  public final boolean a(final com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(4715068784640L, 35130);
    paramf = paramPreference.hiu;
    if (paramf.equals("settings_landscape_mode"))
    {
      if (this.ghC.getBoolean("settings_landscape_mode", false)) {
        setRequestedOrientation(-1);
      }
      for (;;)
      {
        GMTrace.o(4715068784640L, 35130);
        return true;
        setRequestedOrientation(1);
      }
    }
    final boolean bool1;
    if (paramf.equals("settings_voicerecorder_mode"))
    {
      if (com.tencent.mm.compatible.d.p.fQD.fNx == 1) {}
      for (bool1 = false;; bool1 = true)
      {
        if (!this.ghC.getBoolean("settings_voicerecorder_mode", bool1)) {
          com.tencent.mm.ui.base.h.a(this.vKB.vKW, R.l.ebm, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4648228356096L, 34632);
              GMTrace.o(4648228356096L, 34632);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4595615006720L, 34240);
              SettingsAboutSystemUI.this.ghC.edit().putBoolean("settings_voicerecorder_mode", true).commit();
              ((CheckBoxPreference)SettingsAboutSystemUI.a(SettingsAboutSystemUI.this).VG("settings_voicerecorder_mode")).sdM = true;
              SettingsAboutSystemUI.a(SettingsAboutSystemUI.this).notifyDataSetChanged();
              GMTrace.o(4595615006720L, 34240);
            }
          });
        }
        GMTrace.o(4715068784640L, 35130);
        return true;
      }
    }
    final int i;
    int j;
    if (paramf.equals("settings_nfc_switch"))
    {
      paramf = NfcAdapter.getDefaultAdapter(this);
      if (paramf == null) {
        w.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch phone not suppot nfc");
      }
      for (;;)
      {
        GMTrace.o(4715068784640L, 35130);
        return true;
        at.AR();
        i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vrN, Integer.valueOf(0))).intValue();
        at.AR();
        j = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vrO, Integer.valueOf(0))).intValue();
        if (((i == 2) || ((i == 0) && (j != 1))) && (!paramf.isEnabled()) && (this.ghC.getBoolean("settings_nfc_switch", false)))
        {
          hf(false);
          com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dLu), "", getString(R.l.dLv), getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4641517469696L, 34582);
              w.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch user go set system nfc switch");
              SettingsAboutSystemUI.d(SettingsAboutSystemUI.this);
              SettingsAboutSystemUI.this.startActivity(new Intent("android.settings.NFC_SETTINGS"));
              GMTrace.o(4641517469696L, 34582);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4659099992064L, 34713);
              w.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch user cancel go set system nfc switch");
              GMTrace.o(4659099992064L, 34713);
            }
          });
        }
        else
        {
          gt(this.ghC.getBoolean("settings_nfc_switch", false));
        }
      }
    }
    if (paramf.equals("settings_voice_play_mode"))
    {
      at.AR();
      boolean bool2 = ((Boolean)com.tencent.mm.y.c.xh().get(26, Boolean.valueOf(false))).booleanValue();
      if (!bool2)
      {
        bool1 = true;
        w.d("MicroMsg.SettingsAboutSystemUI", "set voice mode from %B to %B", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        at.AR();
        paramf = com.tencent.mm.y.c.xh();
        if (bool2) {
          break label473;
        }
      }
      label473:
      for (bool1 = true;; bool1 = false)
      {
        paramf.set(26, Boolean.valueOf(bool1));
        GMTrace.o(4715068784640L, 35130);
        return true;
        bool1 = false;
        break;
      }
    }
    if (paramf.equals("settings_enter_button_send"))
    {
      paramf = (CheckBoxPreference)this.htU.VG("settings_enter_button_send");
      if (paramf != null)
      {
        bool1 = paramf.isChecked();
        w.d("MicroMsg.SettingsAboutSystemUI", "set enter button send : %s", new Object[] { Boolean.valueOf(bool1) });
        at.AR();
        com.tencent.mm.y.c.xh().set(66832, Boolean.valueOf(bool1));
      }
      GMTrace.o(4715068784640L, 35130);
      return true;
    }
    View localView;
    Object localObject;
    if (paramf.equals("settings_sns_sight_auto_download"))
    {
      paramPreference = new i.a(this.vKB.vKW);
      paramPreference.BR(R.l.cSk);
      paramPreference.BN(R.l.eaF);
      localView = View.inflate(this.vKB.vKW, R.i.cBv, null);
      paramf = (LinearLayout)localView.findViewById(R.h.cgk);
      i = bg.getInt(com.tencent.mm.k.g.ut().getValue("SIGHTAutoLoadNetwork"), 1);
      at.AR();
      i = bg.a((Integer)com.tencent.mm.y.c.xh().get(327686, null), i);
      localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4620311068672L, 34424);
          final int i = 0;
          while (i < paramf.getChildCount())
          {
            TextView localTextView = (TextView)paramf.getChildAt(i);
            if (R.h.chF != localTextView.getId()) {
              localTextView.setCompoundDrawablesWithIntrinsicBounds(R.k.cOu, 0, 0, 0);
            }
            i += 1;
          }
          ((TextView)paramAnonymousView).setCompoundDrawablesWithIntrinsicBounds(R.k.cOv, 0, 0, 0);
          i = ((Integer)paramAnonymousView.getTag()).intValue();
          w.i("MicroMsg.SettingsAboutSystemUI", "choice: %d, %d", new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
          if (i == i)
          {
            GMTrace.o(4620311068672L, 34424);
            return;
          }
          paramAnonymousView.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4624874471424L, 34458);
              ((Dialog)SettingsAboutSystemUI.2.this.oHR.getTag()).dismiss();
              at.AR();
              com.tencent.mm.y.c.xh().set(327686, Integer.valueOf(i));
              at.AR();
              com.tencent.mm.y.c.xh().kL(true);
              SettingsAboutSystemUI.f(SettingsAboutSystemUI.this);
              GMTrace.o(4624874471424L, 34458);
            }
          });
          GMTrace.o(4620311068672L, 34424);
        }
      };
      j = R.l.eaD;
      if (1 == i)
      {
        bool1 = true;
        a(paramf, j, 1, bool1, (View.OnClickListener)localObject);
        j = R.l.eaG;
        if (2 != i) {
          break label805;
        }
        bool1 = true;
        label720:
        a(paramf, j, 2, bool1, (View.OnClickListener)localObject);
        j = R.l.eaE;
        if (3 != i) {
          break label811;
        }
      }
      label805:
      label811:
      for (bool1 = true;; bool1 = false)
      {
        a(paramf, j, 3, bool1, (View.OnClickListener)localObject);
        paramPreference.dg(localView);
        paramPreference = paramPreference.aax();
        paramf.setTag(paramPreference);
        paramPreference.show();
        a(paramPreference);
        this.oHP = true;
        GMTrace.o(4715068784640L, 35130);
        return true;
        bool1 = false;
        break;
        bool1 = false;
        break label720;
      }
    }
    if (paramf.equals("settings_silence_update_mode"))
    {
      paramPreference = new i.a(this.vKB.vKW);
      paramPreference.BR(R.l.cSk);
      paramPreference.BN(R.l.eaA);
      localView = View.inflate(this.vKB.vKW, R.i.cBv, null);
      paramf = (LinearLayout)localView.findViewById(R.h.cgk);
      localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          int k = 0;
          GMTrace.i(4660173733888L, 34721);
          int i = 0;
          Object localObject;
          while (i < paramf.getChildCount())
          {
            localObject = (TextView)paramf.getChildAt(i);
            if (R.h.chF != ((TextView)localObject).getId()) {
              ((TextView)localObject).setCompoundDrawablesWithIntrinsicBounds(R.k.cOu, 0, 0, 0);
            }
            i += 1;
          }
          ((TextView)paramAnonymousView).setCompoundDrawablesWithIntrinsicBounds(R.k.cOv, 0, 0, 0);
          at.AR();
          int m = ((Integer)com.tencent.mm.y.c.xh().get(7, Integer.valueOf(0))).intValue();
          int n = ((Integer)paramAnonymousView.getTag()).intValue();
          w.d("MicroMsg.SettingsAboutSystemUI", "settings_silence_update_mode choice: %d", new Object[] { Integer.valueOf(n) });
          if (n == 0)
          {
            i = 1;
            if ((0x1000000 & m) != 0) {
              break label170;
            }
          }
          label170:
          for (int j = 1;; j = 0)
          {
            if (i != j) {
              break label175;
            }
            GMTrace.o(4660173733888L, 34721);
            return;
            i = 0;
            break;
          }
          label175:
          i = k;
          if (n == 0) {
            i = 1;
          }
          if (i != 0)
          {
            j = 0xFEFFFFFF & m;
            if (i != 0) {
              break label301;
            }
          }
          label301:
          for (i = 1;; i = 2)
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(7, Integer.valueOf(j));
            localObject = new uu();
            ((uu)localObject).umY = 35;
            ((uu)localObject).umZ = i;
            at.AR();
            com.tencent.mm.y.c.yJ().b(new e.a(23, (com.tencent.mm.bm.a)localObject));
            com.tencent.mm.plugin.setting.a.hnI.pr();
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(4634538147840L, 34530);
                ((Dialog)SettingsAboutSystemUI.10.this.oHR.getTag()).dismiss();
                SettingsAboutSystemUI.e(SettingsAboutSystemUI.this);
                GMTrace.o(4634538147840L, 34530);
              }
            });
            GMTrace.o(4660173733888L, 34721);
            return;
            j = 0x1000000 | m;
            break;
          }
        }
      };
      at.AR();
      if ((((Integer)com.tencent.mm.y.c.xh().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
      {
        bool1 = true;
        a(paramf, R.l.eaC, 0, bool1, (View.OnClickListener)localObject);
        i = R.l.eaB;
        if (bool1) {
          break label1008;
        }
      }
      label1008:
      for (bool1 = true;; bool1 = false)
      {
        a(paramf, i, 1, bool1, (View.OnClickListener)localObject);
        paramPreference.dg(localView);
        paramPreference = paramPreference.aax();
        paramf.setTag(paramPreference);
        paramPreference.show();
        a(paramPreference);
        GMTrace.o(4715068784640L, 35130);
        return true;
        bool1 = false;
        break;
      }
    }
    if (paramf.equals("settings_language"))
    {
      startActivity(new Intent(this.vKB.vKW, SettingsLanguageUI.class));
      GMTrace.o(4715068784640L, 35130);
      return true;
    }
    if (paramf.equals("settings_text_size"))
    {
      bool1 = ben();
      GMTrace.o(4715068784640L, 35130);
      return bool1;
    }
    if (paramf.equals("settings_chatting_bg"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsChattingBackgroundUI.class);
      this.vKB.vKW.startActivity(paramf);
      GMTrace.o(4715068784640L, 35130);
      return true;
    }
    if (paramf.equals("settings_plugins"))
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(-2046825377, Boolean.valueOf(false));
      paramf = new Intent();
      paramf.setClass(this, SettingsPluginsUI.class);
      startActivity(paramf);
      com.tencent.mm.s.c.vK().aF(262158, 266266);
      GMTrace.o(4715068784640L, 35130);
      return true;
    }
    if (paramf.equals("settings_reset"))
    {
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, getResources().getString(R.l.eao), "", getString(R.l.cSl), getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4670508498944L, 34798);
          SettingsAboutSystemUI.a(SettingsAboutSystemUI.this, false);
          paramAnonymousDialogInterface = SettingsAboutSystemUI.this;
          Object localObject = SettingsAboutSystemUI.this;
          SettingsAboutSystemUI.this.getString(R.l.cUG);
          SettingsAboutSystemUI.a(paramAnonymousDialogInterface, com.tencent.mm.ui.base.h.a((Context)localObject, SettingsAboutSystemUI.this.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(4663394959360L, 34745);
              SettingsAboutSystemUI.a(SettingsAboutSystemUI.this, true);
              GMTrace.o(4663394959360L, 34745);
            }
          }));
          at.AR();
          paramAnonymousDialogInterface = com.tencent.mm.y.c.yP().bTd();
          if (paramAnonymousDialogInterface.size() > 0)
          {
            localObject = com.tencent.mm.y.l.s(paramAnonymousDialogInterface);
            if (localObject != null)
            {
              paramAnonymousInt = 0;
              while (paramAnonymousInt < ((List)localObject).size())
              {
                if (((Boolean)((List)localObject).get(paramAnonymousInt)).booleanValue()) {
                  com.tencent.mm.plugin.setting.a.hnI.bK((String)paramAnonymousDialogInterface.get(paramAnonymousInt));
                }
                paramAnonymousInt += 1;
              }
            }
          }
          bc.a(new bc.a()
          {
            public final void Bk()
            {
              GMTrace.i(4646617743360L, 34620);
              if (SettingsAboutSystemUI.c(SettingsAboutSystemUI.this) != null)
              {
                SettingsAboutSystemUI.c(SettingsAboutSystemUI.this).dismiss();
                SettingsAboutSystemUI.a(SettingsAboutSystemUI.this, null);
              }
              GMTrace.o(4646617743360L, 34620);
            }
            
            public final boolean Bl()
            {
              GMTrace.i(4646483525632L, 34619);
              boolean bool = SettingsAboutSystemUI.b(SettingsAboutSystemUI.this);
              GMTrace.o(4646483525632L, 34619);
              return bool;
            }
          });
          GMTrace.o(4670508498944L, 34798);
        }
      }, null);
      GMTrace.o(4715068784640L, 35130);
      return true;
    }
    if (paramf.equals("settings_emoji_manager"))
    {
      paramf = new Intent();
      paramf.putExtra("10931", 2);
      com.tencent.mm.bj.d.b(this.vKB.vKW, "emoji", ".ui.EmojiMineUI", paramf);
      GMTrace.o(4715068784640L, 35130);
      return true;
    }
    if (paramf.equals("settngs_clean"))
    {
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        u.fo(this.vKB.vKW);
        GMTrace.o(4715068784640L, 35130);
        return true;
      }
      com.tencent.mm.bj.d.b(this.vKB.vKW, "clean", ".ui.CleanUI", new Intent());
      GMTrace.o(4715068784640L, 35130);
      return true;
    }
    if (paramf.equals("settings_traffic_statistic"))
    {
      startActivity(new Intent(this, SettingsNetStatUI.class));
      GMTrace.o(4715068784640L, 35130);
      return true;
    }
    if (paramf.equals("settings_text_size"))
    {
      bool1 = ben();
      GMTrace.o(4715068784640L, 35130);
      return bool1;
    }
    if (paramf.equals("settings_swipeback_mode"))
    {
      paramf = (CheckBoxPreference)paramPreference;
      bool1 = com.tencent.mm.compatible.h.a.tw();
      if (!bool1) {}
      for (i = R.l.eaI;; i = R.l.eaH)
      {
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(i), null, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4664468701184L, 34753);
            if (!com.tencent.mm.compatible.h.a.tw()) {}
            for (boolean bool = true;; bool = false)
            {
              com.tencent.mm.compatible.h.a.aP(bool);
              com.tencent.mm.kernel.h.xz().releaseAll();
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(4610378956800L, 34350);
                  Process.killProcess(Process.myPid());
                  GMTrace.o(4610378956800L, 34350);
                }
              });
              GMTrace.o(4664468701184L, 34753);
              return;
            }
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4593467523072L, 34224);
            paramf.sdM = bool1;
            SettingsAboutSystemUI.a(SettingsAboutSystemUI.this).notifyDataSetChanged();
            GMTrace.o(4593467523072L, 34224);
          }
        });
        GMTrace.o(4715068784640L, 35130);
        return true;
      }
    }
    if (paramf.equals("settings_take_photo")) {
      startActivity(new Intent(this, SettingsAboutCamera.class));
    }
    GMTrace.o(4715068784640L, 35130);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4714531913728L, 35126);
    super.onCreate(paramBundle);
    this.oHM = false;
    MP();
    GMTrace.o(4714531913728L, 35126);
  }
  
  protected void onDestroy()
  {
    boolean bool2 = true;
    GMTrace.i(4714934566912L, 35129);
    super.onDestroy();
    int i;
    com.tencent.mm.plugin.report.service.g localg;
    if (this.oHP)
    {
      i = this.oHO;
      if (this.oHN != this.oHO) {
        break label133;
      }
      bool1 = true;
      w.i("MicroMsg.SettingsAboutSystemUI", "kvstat, autodownload sight change: %d, %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1) });
      localg = com.tencent.mm.plugin.report.service.g.ork;
      i = this.oHO;
      if (this.oHN != this.oHO) {
        break label138;
      }
    }
    label133:
    label138:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localg.i(11437, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Boolean.valueOf(bool1) });
      GMTrace.o(4714934566912L, 35129);
      return;
      bool1 = false;
      break;
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(4714800349184L, 35128);
    super.onResume();
    Object localObject = (CheckBoxPreference)this.htU.VG("settings_voice_play_mode");
    if (localObject != null)
    {
      at.AR();
      ((CheckBoxPreference)localObject).sdM = ((Boolean)com.tencent.mm.y.c.xh().get(26, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).wlc = false;
    }
    localObject = (CheckBoxPreference)this.htU.VG("settings_enter_button_send");
    if (localObject != null)
    {
      at.AR();
      ((CheckBoxPreference)localObject).sdM = ((Boolean)com.tencent.mm.y.c.xh().get(66832, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).wlc = false;
    }
    localObject = (CheckBoxPreference)this.htU.VG("settings_swipeback_mode");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).sdM = com.tencent.mm.compatible.h.a.tw();
      ((Preference)localObject).wlc = false;
    }
    localObject = this.htU.VG("settings_language");
    if (localObject != null) {
      ((Preference)localObject).setSummary(v.g(this.vKB.vKW, R.c.aMp, R.l.cTr));
    }
    bem();
    bep();
    bep();
    beo();
    localObject = NfcAdapter.getDefaultAdapter(this);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.htU.VG("settings_nfc_switch");
    if (localObject == null)
    {
      this.htU.bc("settings_nfc_switch", true);
      GMTrace.o(4714800349184L, 35128);
      return;
    }
    this.htU.bc("settings_nfc_switch", false);
    at.AR();
    localCheckBoxPreference.setSummary(bg.nl((String)com.tencent.mm.y.c.xh().get(w.a.vrR, null)));
    if (this.oHM)
    {
      w.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-updateNfcOpenSwitch go setSystemNfc and back");
      if (((NfcAdapter)localObject).isEnabled())
      {
        gt(true);
        hf(true);
        GMTrace.o(4714800349184L, 35128);
        return;
      }
    }
    at.AR();
    int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vrN, Integer.valueOf(0))).intValue();
    if (i == 0)
    {
      at.AR();
      if (((Integer)com.tencent.mm.y.c.xh().get(w.a.vrO, Integer.valueOf(0))).intValue() == 1) {
        hf(true);
      }
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(4714800349184L, 35128);
      return;
      hf(false);
      continue;
      if (i == 1) {
        hf(true);
      } else {
        hf(false);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsAboutSystemUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */