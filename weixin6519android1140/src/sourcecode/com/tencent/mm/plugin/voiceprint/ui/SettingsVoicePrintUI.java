package com.tencent.mm.plugin.voiceprint.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.voiceprint.model.i;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class SettingsVoicePrintUI
  extends MMPreference
  implements e
{
  private ProgressDialog htG;
  private f htU;
  private boolean kXo;
  private View koX;
  private VoiceHeaderPreference qCU;
  
  public SettingsVoicePrintUI()
  {
    GMTrace.i(12527748513792L, 93339);
    this.htG = null;
    this.kXo = false;
    GMTrace.o(12527748513792L, 93339);
  }
  
  private void bto()
  {
    GMTrace.i(12528822255616L, 93347);
    g.ork.i(11390, new Object[] { Integer.valueOf(3) });
    Intent localIntent = new Intent();
    localIntent.setClass(this, VoiceCreateUI.class);
    localIntent.putExtra("kscene_type", 71);
    localIntent.putExtra("createVoicePrint", true);
    startActivityForResult(localIntent, 1);
    this.kXo = false;
    GMTrace.o(12528822255616L, 93347);
  }
  
  public final void MP()
  {
    GMTrace.i(12528285384704L, 93343);
    at.AR();
    int i = bg.m(c.xh().get(40, Integer.valueOf(0)), 0);
    w.i("MicroMsg.VoiceSettingsUI", "plugSwitch " + i + " " + (i & 0x20000));
    this.htU = this.wky;
    this.qCU = ((VoiceHeaderPreference)this.htU.VG("settings_voiceprint_header"));
    ((CheckBoxPreference)this.htU.VG("settings_voiceprint_title")).lN(true);
    this.htU.notifyDataSetChanged();
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    getString(R.l.cUG);
    this.htG = h.a(localActionBarActivity, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12524258852864L, 93313);
        GMTrace.o(12524258852864L, 93313);
      }
    });
    at.wS().a(new i(0), 0);
    this.htU.bc("settings_voiceprint_unlock", true);
    this.htU.bc("settings_voiceprint_reset", true);
    this.htU.bc("settings_voiceprint_create", true);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12536741101568L, 93406);
        SettingsVoicePrintUI.this.finish();
        GMTrace.o(12536741101568L, 93406);
        return true;
      }
    });
    GMTrace.o(12528285384704L, 93343);
  }
  
  public final int QI()
  {
    GMTrace.i(12528419602432L, 93344);
    int i = R.o.epB;
    GMTrace.o(12528419602432L, 93344);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12528688037888L, 93346);
    w.d("MicroMsg.VoiceSettingsUI", "onSceneEnd, errType:%d, errCode:%d, sceneType:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramk.getType()) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      this.htU.bc("settings_voiceprint_unlock", true);
      this.htU.bc("settings_voiceprint_reset", true);
      this.htU.bc("settings_voiceprint_create", true);
      ((CheckBoxPreference)this.htU.VG("settings_voiceprint_title")).lN(false);
      this.qCU.cf(getString(R.l.ehf), "");
      this.htU.notifyDataSetChanged();
      if (this.htG != null) {
        this.htG.dismiss();
      }
      GMTrace.o(12528688037888L, 93346);
      return;
    }
    if (paramk.getType() == 615)
    {
      paramString = (i)paramk;
      if (paramString.mStatus != 1) {
        break label498;
      }
      w.d("MicroMsg.VoiceSettingsUI", "voiceprint exist");
      this.htU.bc("settings_voiceprint_unlock", false);
      this.htU.notifyDataSetChanged();
      paramInt1 = q.zK();
      paramk = (CheckBoxPreference)this.htU.VG("settings_voiceprint_title");
      w.d("MicroMsg.VoiceSettingsUI", "opScene.getSwitch:%d", new Object[] { Integer.valueOf(paramString.qCb) });
      if (paramString.qCb <= 0) {
        break label434;
      }
      w.d("MicroMsg.VoiceSettingsUI", "voiceprint open");
      paramk.lN(true);
      this.htU.bc("settings_voiceprint_reset", false);
      this.htU.bc("settings_voiceprint_unlock", false);
      paramInt1 = 0x20000 | paramInt1;
      this.qCU.cf(getString(R.l.ehg), "");
      w.i("MicroMsg.VoiceSettingsUI", "scene end plugSwitch %d", new Object[] { Integer.valueOf(paramInt1) });
      as.gnb.M("last_login_use_voice", String.valueOf(paramInt1));
      at.AR();
      c.xh().set(40, Integer.valueOf(paramInt1));
      this.htU.bc("settings_voiceprint_create", true);
      this.htU.bc("settings_voiceprint_title", false);
      this.qCU.a(null);
      this.htU.notifyDataSetChanged();
    }
    for (;;)
    {
      if (this.htG != null) {
        this.htG.dismiss();
      }
      GMTrace.o(12528688037888L, 93346);
      return;
      label434:
      w.d("MicroMsg.VoiceSettingsUI", "voiceprint close");
      paramk.lN(false);
      this.htU.bc("settings_voiceprint_reset", true);
      this.htU.bc("settings_voiceprint_unlock", true);
      paramInt1 = 0xFFFDFFFF & paramInt1;
      this.qCU.cf(getString(R.l.ehf), "");
      break;
      label498:
      w.d("MicroMsg.VoiceSettingsUI", "voiceprint not exist");
      g.ork.i(11390, new Object[] { Integer.valueOf(2) });
      this.htU.bc("settings_voiceprint_unlock", true);
      this.htU.bc("settings_voiceprint_reset", true);
      this.htU.bc("settings_voiceprint_create", true);
      this.htU.bc("settings_voiceprint_title", true);
      this.qCU.cf(getString(R.l.ehi), getString(R.l.ehh));
      this.qCU.a(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12507347419136L, 93187);
          boolean bool = a.a(SettingsVoicePrintUI.this, "android.permission.RECORD_AUDIO", 80, "", "");
          w.i("MicroMsg.VoiceSettingsUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), SettingsVoicePrintUI.this });
          if (!bool)
          {
            GMTrace.o(12507347419136L, 93187);
            return;
          }
          SettingsVoicePrintUI.a(SettingsVoicePrintUI.this);
          GMTrace.o(12507347419136L, 93187);
        }
      });
      this.htU.notifyDataSetChanged();
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(12528553820160L, 93345);
    paramPreference = paramPreference.hiu;
    Intent localIntent = new Intent();
    if (paramPreference.equals("settings_voiceprint_title"))
    {
      paramf = (CheckBoxPreference)paramf.VG("settings_voiceprint_title");
      w.d("MicroMsg.VoiceSettingsUI", "checkPref.isChecked() " + paramf.isChecked());
      if ((this.htG != null) && (this.htG.isShowing())) {
        this.htG.dismiss();
      }
      paramPreference = this.vKB.vKW;
      getString(R.l.cUG);
      this.htG = h.a(paramPreference, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(12507078983680L, 93185);
          GMTrace.o(12507078983680L, 93185);
        }
      });
      if (paramf.isChecked()) {
        at.wS().a(new i(1), 0);
      }
      for (;;)
      {
        GMTrace.o(12528553820160L, 93345);
        return true;
        at.wS().a(new i(2), 0);
      }
    }
    if (paramPreference.equals("settings_voiceprint_unlock"))
    {
      localIntent.setClass(this, VoiceUnLockUI.class);
      localIntent.putExtra("kscene_type", 73);
      startActivity(localIntent);
      GMTrace.o(12528553820160L, 93345);
      return true;
    }
    if (paramPreference.equals("settings_voiceprint_reset"))
    {
      localIntent.setClass(this, VoiceCreateUI.class);
      localIntent.putExtra("KvoicePrintReset", true);
      localIntent.putExtra("kscene_type", 73);
      startActivityForResult(localIntent, 1);
      GMTrace.o(12528553820160L, 93345);
      return true;
    }
    GMTrace.o(12528553820160L, 93345);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12528956473344L, 93348);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 1) && (paramIntent != null)) {
      this.kXo = paramIntent.getBooleanExtra("KIsCreateSuccess", false);
    }
    GMTrace.o(12528956473344L, 93348);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12527882731520L, 93340);
    super.onCreate(paramBundle);
    oM(R.l.ebj);
    at.wS().a(615, this);
    this.koX = findViewById(R.h.bNs);
    MP();
    this.koX.setBackgroundResource(R.e.white);
    at.AR();
    c.xh().a(w.a.vqx, Boolean.valueOf(false));
    at.AR();
    c.xh().a(w.a.vqy, Boolean.valueOf(false));
    at.AR();
    c.xh().a(w.a.vqz, Boolean.valueOf(false));
    at.AR();
    c.xh().a(w.a.vqA, Boolean.valueOf(false));
    w.i("MicroMsg.VoiceSettingsUI", "unset all voiceprint config");
    GMTrace.o(12527882731520L, 93340);
  }
  
  public void onDestroy()
  {
    GMTrace.i(12528151166976L, 93342);
    super.onDestroy();
    at.wS().b(615, this);
    if (this.htG != null) {
      this.htG.dismiss();
    }
    GMTrace.o(12528151166976L, 93342);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(12529090691072L, 93349);
    w.i("MicroMsg.VoiceSettingsUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(12529090691072L, 93349);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        bto();
        GMTrace.o(12529090691072L, 93349);
        return;
      }
      h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12525064159232L, 93319);
          paramAnonymousDialogInterface.dismiss();
          SettingsVoicePrintUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(12525064159232L, 93319);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12511910821888L, 93221);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(12511910821888L, 93221);
        }
      });
    }
  }
  
  public void onResume()
  {
    GMTrace.i(12528016949248L, 93341);
    super.onResume();
    if (this.kXo)
    {
      this.kXo = false;
      if ((this.htG != null) && (this.htG.isShowing())) {
        this.htG.dismiss();
      }
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      getString(R.l.cUG);
      this.htG = h.a(localActionBarActivity, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(12534727835648L, 93391);
          GMTrace.o(12534727835648L, 93391);
        }
      });
      w.d("MicroMsg.VoiceSettingsUI", "resume after create voiceprint, get switch status");
      at.wS().a(new i(1), 0);
    }
    GMTrace.o(12528016949248L, 93341);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\SettingsVoicePrintUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */