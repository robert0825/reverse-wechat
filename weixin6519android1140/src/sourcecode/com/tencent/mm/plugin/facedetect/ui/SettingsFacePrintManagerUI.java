package com.tencent.mm.plugin.facedetect.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.facedetect.a.b;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.a.i;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.as;

public class SettingsFacePrintManagerUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private ProgressDialog htG;
  private f htU;
  private FaceHeaderPreference kXn;
  private boolean kXo;
  private View koX;
  
  public SettingsFacePrintManagerUI()
  {
    GMTrace.i(5904103636992L, 43989);
    this.htG = null;
    this.kXo = false;
    GMTrace.o(5904103636992L, 43989);
  }
  
  public final void MP()
  {
    GMTrace.i(5904640507904L, 43993);
    int i = bg.m(com.tencent.mm.kernel.h.xy().xh().get(40, Integer.valueOf(0)), 0);
    w.i("MicroMsg.FaceSettingsManagerUI", "plugSwitch " + i + " " + (i & 0x400000));
    this.htU = this.wky;
    this.kXn = ((FaceHeaderPreference)this.htU.VG("settings_faceprint_header"));
    ((CheckBoxPreference)this.htU.VG("settings_faceprint_title")).lN(true);
    this.htU.notifyDataSetChanged();
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    getString(a.h.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(a.h.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(5897258532864L, 43938);
        GMTrace.o(5897258532864L, 43938);
      }
    });
    com.tencent.mm.kernel.h.wS().a(new com.tencent.mm.plugin.facedetect.b.q(3), 0);
    this.htU.bc("settings_faceprint_create", true);
    this.htU.bc("settings_faceeprint_reset", true);
    this.htU.bc("settings_faceprint_unlock", true);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5894305742848L, 43916);
        SettingsFacePrintManagerUI.this.finish();
        GMTrace.o(5894305742848L, 43916);
        return true;
      }
    });
    GMTrace.o(5904640507904L, 43993);
  }
  
  public final int QI()
  {
    GMTrace.i(5904774725632L, 43994);
    int i = a.i.kRn;
    GMTrace.o(5904774725632L, 43994);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5905043161088L, 43996);
    w.d("MicroMsg.FaceSettingsManagerUI", "hy: onSceneEnd, errType:%d, errCode:%d, sceneType:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramk.getType()) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      this.htU.bc("settings_faceprint_create", true);
      this.htU.bc("settings_faceprint_unlock", true);
      this.htU.bc("settings_faceeprint_reset", true);
      ((CheckBoxPreference)this.htU.VG("settings_faceprint_title")).lN(false);
      this.kXn.setTitle(getString(a.h.kQX));
      this.htU.notifyDataSetChanged();
      if (this.htG != null) {
        this.htG.dismiss();
      }
      GMTrace.o(5905043161088L, 43996);
      return;
    }
    if (paramk.getType() == 938)
    {
      paramString = (com.tencent.mm.plugin.facedetect.b.q)paramk;
      if (!paramString.kSc) {
        break label493;
      }
      w.d("MicroMsg.FaceSettingsManagerUI", "faceprint exist");
      this.htU.bc("settings_faceprint_unlock", false);
      this.htU.notifyDataSetChanged();
      paramInt1 = com.tencent.mm.y.q.zK();
      paramk = (CheckBoxPreference)this.htU.VG("settings_faceprint_title");
      w.d("MicroMsg.FaceSettingsManagerUI", "opScene.isOpenSwitch:%b", new Object[] { Boolean.valueOf(paramString.kSd) });
      if (!paramString.kSd) {
        break label429;
      }
      w.d("MicroMsg.FaceSettingsManagerUI", "hy: faceprint open");
      paramk.lN(true);
      this.htU.bc("settings_faceeprint_reset", false);
      this.htU.bc("settings_faceprint_unlock", false);
      paramInt1 = 0x400000 | paramInt1;
      this.kXn.cf(getString(a.h.kQY), "");
      w.i("MicroMsg.FaceSettingsManagerUI", "scene end plugSwitch %d", new Object[] { Integer.valueOf(paramInt1) });
      as.gnb.M("last_login_use_voice", String.valueOf(paramInt1));
      com.tencent.mm.kernel.h.xy().xh().set(40, Integer.valueOf(paramInt1));
      this.htU.bc("settings_faceprint_create", true);
      this.htU.bc("settings_faceprint_title", false);
      this.kXn.a(null);
      this.htU.notifyDataSetChanged();
    }
    for (;;)
    {
      if (this.htG != null) {
        this.htG.dismiss();
      }
      GMTrace.o(5905043161088L, 43996);
      return;
      label429:
      w.d("MicroMsg.FaceSettingsManagerUI", "hy: faceprint close");
      paramk.lN(false);
      this.htU.bc("settings_faceeprint_reset", true);
      this.htU.bc("settings_faceprint_unlock", true);
      paramInt1 = 0xFFBFFFFF & paramInt1;
      this.kXn.cf(getString(a.h.kQX), "");
      break;
      label493:
      w.d("MicroMsg.FaceSettingsManagerUI", "faceprint not exist");
      g.ork.i(11390, new Object[] { Integer.valueOf(2) });
      this.htU.bc("settings_faceprint_create", true);
      this.htU.bc("settings_faceprint_title", true);
      this.htU.bc("settings_faceprint_unlock", true);
      this.htU.bc("settings_faceeprint_reset", true);
      this.kXn.setTitle(getString(a.h.kQW));
      this.kXn.a(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5896990097408L, 43936);
          SettingsFacePrintManagerUI.a(SettingsFacePrintManagerUI.this);
          GMTrace.o(5896990097408L, 43936);
        }
      });
      this.htU.notifyDataSetChanged();
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(5904908943360L, 43995);
    paramPreference = paramPreference.hiu;
    Intent localIntent = new Intent();
    if (paramPreference.equals("settings_faceprint_title"))
    {
      paramf = (CheckBoxPreference)paramf.VG("settings_faceprint_title");
      w.d("MicroMsg.FaceSettingsManagerUI", "hy: checkPref.isChecked() " + paramf.isChecked());
      if ((this.htG != null) && (this.htG.isShowing())) {
        this.htG.dismiss();
      }
      paramPreference = this.vKB.vKW;
      getString(a.h.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(paramPreference, getString(a.h.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(5900613976064L, 43963);
          GMTrace.o(5900613976064L, 43963);
        }
      });
      if (paramf.isChecked()) {
        com.tencent.mm.kernel.h.wS().a(new com.tencent.mm.plugin.facedetect.b.q(1), 0);
      }
      for (;;)
      {
        GMTrace.o(5904908943360L, 43995);
        return true;
        com.tencent.mm.kernel.h.wS().a(new com.tencent.mm.plugin.facedetect.b.q(2), 0);
      }
    }
    if (paramPreference.equals("settings_faceprint_unlock"))
    {
      localIntent.setClass(this, FaceDetectUI.class);
      localIntent.putExtra("k_need_signature", true);
      localIntent.putExtra("k_user_name", com.tencent.mm.y.q.zH());
      localIntent.putExtra("k_purpose", 2);
      startActivity(localIntent);
      GMTrace.o(5904908943360L, 43995);
      return true;
    }
    if (paramPreference.equals("settings_faceeprint_reset"))
    {
      localIntent.setClass(this, FaceDetectUI.class);
      localIntent.putExtra("k_need_signature", true);
      localIntent.putExtra("k_user_name", com.tencent.mm.y.q.zH());
      localIntent.putExtra("k_purpose", 1);
      startActivityForResult(localIntent, 1);
      GMTrace.o(5904908943360L, 43995);
      return true;
    }
    GMTrace.o(5904908943360L, 43995);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5905177378816L, 43997);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      if ((paramIntent != null) && (paramIntent.getIntExtra("err_code", 10) == 0)) {
        this.kXo = true;
      }
      w.i("MicroMsg.FaceSettingsManagerUI", "hy: is reg ok: %b", new Object[] { Boolean.valueOf(this.kXo) });
    }
    GMTrace.o(5905177378816L, 43997);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5904237854720L, 43990);
    super.onCreate(paramBundle);
    oM(a.h.kQK);
    com.tencent.mm.kernel.h.wS().a(938, this);
    this.koX = findViewById(a.e.bNs);
    MP();
    this.koX.setBackgroundResource(a.b.white);
    com.tencent.mm.plugin.facedetect.model.n.n(this);
    GMTrace.o(5904237854720L, 43990);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5904506290176L, 43992);
    super.onDestroy();
    com.tencent.mm.kernel.h.wS().b(938, this);
    if (this.htG != null) {
      this.htG.dismiss();
    }
    GMTrace.o(5904506290176L, 43992);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(5905311596544L, 43998);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 1))
    {
      GMTrace.o(5905311596544L, 43998);
      return;
    }
    w.d("MicroMsg.FaceSettingsManagerUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults0[%d] grantResults1[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Integer.valueOf(paramArrayOfInt[1]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5905311596544L, 43998);
      return;
      if ((paramArrayOfInt[0] != 0) || (paramArrayOfInt[1] != 0))
      {
        w.w("MicroMsg.FaceSettingsManagerUI", "hy: permission not granted");
        finish();
      }
    }
  }
  
  public void onResume()
  {
    GMTrace.i(5904372072448L, 43991);
    super.onResume();
    if (this.kXo)
    {
      this.kXo = false;
      if ((this.htG != null) && (this.htG.isShowing())) {
        this.htG.dismiss();
      }
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      getString(a.h.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(a.h.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(5891218735104L, 43893);
          GMTrace.o(5891218735104L, 43893);
        }
      });
      w.d("MicroMsg.FaceSettingsManagerUI", "hy: resume after create face, get switch status");
      com.tencent.mm.kernel.h.wS().a(new com.tencent.mm.plugin.facedetect.b.q(1), 0);
    }
    GMTrace.o(5904372072448L, 43991);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\ui\SettingsFacePrintManagerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */