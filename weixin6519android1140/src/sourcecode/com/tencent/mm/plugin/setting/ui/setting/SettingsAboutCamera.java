package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class SettingsAboutCamera
  extends MMPreference
{
  private f htU;
  
  public SettingsAboutCamera()
  {
    GMTrace.i(4633464406016L, 34522);
    GMTrace.o(4633464406016L, 34522);
  }
  
  protected final void MP()
  {
    GMTrace.i(4634135494656L, 34527);
    this.htU = this.wky;
    oM(R.l.dZK);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16575889408000L, 123500);
        SettingsAboutCamera.this.aLo();
        SettingsAboutCamera.this.finish();
        GMTrace.o(16575889408000L, 123500);
        return true;
      }
    });
    at.AR();
    boolean bool = ((Boolean)c.xh().get(w.a.vwi, Boolean.valueOf(true))).booleanValue();
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.htU.VG("settings_take_photo_auto_save_photo");
    localCheckBoxPreference.wlc = false;
    localCheckBoxPreference.sdM = bool;
    at.AR();
    bool = ((Boolean)c.xh().get(w.a.vwj, Boolean.valueOf(true))).booleanValue();
    localCheckBoxPreference = (CheckBoxPreference)this.htU.VG("settings_take_photo_auto_save_video");
    localCheckBoxPreference.sdM = bool;
    localCheckBoxPreference.wlc = false;
    this.htU.notifyDataSetChanged();
    GMTrace.o(4634135494656L, 34527);
  }
  
  public final int QI()
  {
    GMTrace.i(4633867059200L, 34525);
    int i = R.o.epr;
    GMTrace.o(4633867059200L, 34525);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = true;
    GMTrace.i(4634001276928L, 34526);
    paramf = paramPreference.hiu;
    if (paramf.equals("settings_take_photo_auto_save_photo"))
    {
      at.AR();
      bool1 = ((Boolean)c.xh().get(w.a.vwi, Boolean.valueOf(true))).booleanValue();
      at.AR();
      paramPreference = c.xh();
      w.a locala = w.a.vwi;
      if (!bool1)
      {
        bool1 = true;
        paramPreference.a(locala, Boolean.valueOf(bool1));
      }
    }
    else if (paramf.equals("settings_take_photo_auto_save_video"))
    {
      at.AR();
      bool1 = ((Boolean)c.xh().get(w.a.vwj, Boolean.valueOf(true))).booleanValue();
      at.AR();
      paramf = c.xh();
      paramPreference = w.a.vwj;
      if (bool1) {
        break label154;
      }
    }
    label154:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramf.a(paramPreference, Boolean.valueOf(bool1));
      GMTrace.o(4634001276928L, 34526);
      return false;
      bool1 = false;
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4633598623744L, 34523);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4633598623744L, 34523);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsAboutCamera.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */