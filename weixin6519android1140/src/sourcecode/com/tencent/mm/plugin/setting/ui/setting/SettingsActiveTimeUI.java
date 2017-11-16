package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TimePicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import java.sql.Time;
import java.text.DateFormat;

public class SettingsActiveTimeUI
  extends MMPreference
{
  private boolean eAo;
  private com.tencent.mm.ui.base.preference.f htU;
  private Preference jcR;
  private Preference jcS;
  private int oIA;
  private int oIB;
  private boolean oIC;
  private final TimePickerDialog.OnTimeSetListener oID;
  private int oIy;
  private int oIz;
  
  public SettingsActiveTimeUI()
  {
    GMTrace.i(4634672365568L, 34531);
    this.oIC = false;
    this.eAo = false;
    this.oID = new TimePickerDialog.OnTimeSetListener()
    {
      public final void onTimeSet(TimePicker paramAnonymousTimePicker, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(4658294685696L, 34707);
        if (SettingsActiveTimeUI.a(SettingsActiveTimeUI.this))
        {
          SettingsActiveTimeUI.a(SettingsActiveTimeUI.this, paramAnonymousInt1);
          SettingsActiveTimeUI.b(SettingsActiveTimeUI.this, paramAnonymousInt2);
          SettingsActiveTimeUI.b(SettingsActiveTimeUI.this);
        }
        for (;;)
        {
          SettingsActiveTimeUI.this.MP();
          GMTrace.o(4658294685696L, 34707);
          return;
          SettingsActiveTimeUI.c(SettingsActiveTimeUI.this, paramAnonymousInt1);
          SettingsActiveTimeUI.d(SettingsActiveTimeUI.this, paramAnonymousInt2);
          SettingsActiveTimeUI.c(SettingsActiveTimeUI.this);
        }
      }
    };
    GMTrace.o(4634672365568L, 34531);
  }
  
  private static String e(Context paramContext, int paramInt1, int paramInt2)
  {
    GMTrace.i(4635611889664L, 34538);
    String str1 = v.e(paramContext.getSharedPreferences(ab.bPU(), 0));
    String str2 = v.bPK();
    if ((!str1.equalsIgnoreCase("zh_CN")) && ((!str1.equalsIgnoreCase("language_default")) || (!"zh_CN".equalsIgnoreCase(str2))))
    {
      paramContext = DateFormat.getTimeInstance(3, v.RN(str1)).format(new Time(paramInt1, paramInt2, 0));
      GMTrace.o(4635611889664L, 34538);
      return paramContext;
    }
    if (paramInt1 > 12) {}
    for (int i = paramInt1 - 12;; i = paramInt1)
    {
      paramContext = n.o(paramContext, paramInt1 * 3600000L + paramInt2 * 60000L) + String.format("%02d:%02d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
      GMTrace.o(4635611889664L, 34538);
      return paramContext;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(4634940801024L, 34533);
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(R.o.epq);
    this.jcS = this.htU.VG("settings_active_begin_time");
    this.oIy = com.tencent.mm.k.f.tS();
    this.oIz = com.tencent.mm.k.f.tU();
    this.jcS.setSummary(e(this, this.oIy, this.oIz));
    this.jcR = this.htU.VG("settings_active_end_time");
    this.oIA = com.tencent.mm.k.f.tR();
    this.oIB = com.tencent.mm.k.f.tT();
    this.jcR.setSummary(e(this, this.oIA, this.oIB));
    boolean bool;
    if (!com.tencent.mm.k.f.tQ())
    {
      bool = true;
      this.eAo = bool;
      ((CheckBoxPreference)this.htU.VG("settings_active_silence_time")).sdM = this.eAo;
      if (!this.eAo) {
        break label264;
      }
      this.jcS.setEnabled(true);
      this.jcR.setEnabled(true);
    }
    for (;;)
    {
      if (!this.eAo)
      {
        this.htU.c(this.jcS);
        this.htU.c(this.jcR);
      }
      this.htU.bc("settings_active_time_full", true);
      this.htU.notifyDataSetChanged();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4657489379328L, 34701);
          SettingsActiveTimeUI.this.aLo();
          SettingsActiveTimeUI.this.finish();
          GMTrace.o(4657489379328L, 34701);
          return true;
        }
      });
      GMTrace.o(4634940801024L, 34533);
      return;
      bool = false;
      break;
      label264:
      this.jcS.setEnabled(false);
      this.jcR.setEnabled(false);
    }
  }
  
  public final int QI()
  {
    GMTrace.i(4635075018752L, 34534);
    int i = R.o.epq;
    GMTrace.o(4635075018752L, 34534);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(4635209236480L, 34535);
    if (paramPreference.hiu.equals("settings_active_begin_time"))
    {
      this.oIC = true;
      showDialog(1);
      GMTrace.o(4635209236480L, 34535);
      return true;
    }
    if (paramPreference.hiu.equals("settings_active_end_time"))
    {
      this.oIC = false;
      showDialog(1);
      GMTrace.o(4635209236480L, 34535);
      return true;
    }
    if (paramPreference.hiu.equals("settings_active_silence_time"))
    {
      paramf = (CheckBoxPreference)this.htU.VG("settings_active_silence_time");
      boolean bool;
      if (!paramf.isChecked())
      {
        bool = true;
        com.tencent.mm.k.f.aW(bool);
        paramPreference = g.ork;
        if (!paramf.isChecked()) {
          break label176;
        }
      }
      label176:
      for (int i = 1;; i = 2)
      {
        paramPreference.i(11351, new Object[] { Integer.valueOf(0), Integer.valueOf(i) });
        MP();
        GMTrace.o(4635209236480L, 34535);
        return true;
        bool = false;
        break;
      }
    }
    GMTrace.o(4635209236480L, 34535);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4634806583296L, 34532);
    super.onCreate(paramBundle);
    oM(R.l.dYu);
    this.htU = this.wky;
    MP();
    GMTrace.o(4634806583296L, 34532);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(4635343454208L, 34536);
    switch (paramInt)
    {
    default: 
      GMTrace.o(4635343454208L, 34536);
      return null;
    }
    if (this.oIC)
    {
      localTimePickerDialog = new TimePickerDialog(this.vKB.vKW, this.oID, this.oIy, this.oIz, false);
      GMTrace.o(4635343454208L, 34536);
      return localTimePickerDialog;
    }
    TimePickerDialog localTimePickerDialog = new TimePickerDialog(this.vKB.vKW, this.oID, this.oIA, this.oIB, false);
    GMTrace.o(4635343454208L, 34536);
    return localTimePickerDialog;
  }
  
  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    GMTrace.i(4635477671936L, 34537);
    switch (paramInt)
    {
    default: 
      GMTrace.o(4635477671936L, 34537);
      return;
    }
    if (this.oIC)
    {
      ((TimePickerDialog)paramDialog).updateTime(this.oIy, this.oIz);
      GMTrace.o(4635477671936L, 34537);
      return;
    }
    ((TimePickerDialog)paramDialog).updateTime(this.oIA, this.oIB);
    GMTrace.o(4635477671936L, 34537);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsActiveTimeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */