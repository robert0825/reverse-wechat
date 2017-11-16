package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bm.a;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsNotificationUI
  extends MMPreference
{
  private com.tencent.mm.ui.base.preference.f htU;
  private HashMap<Integer, Integer> jqC;
  private int status;
  
  public SettingsNotificationUI()
  {
    GMTrace.i(4682588094464L, 34888);
    this.jqC = new HashMap();
    GMTrace.o(4682588094464L, 34888);
  }
  
  private void beC()
  {
    GMTrace.i(4683393400832L, 34894);
    Preference localPreference = this.htU.VG("settings_notification_ringtone");
    if (localPreference != null) {
      localPreference.setSummary(this.ghC.getString("settings.ringtone.name", getString(R.l.dZE)));
    }
    this.htU.notifyDataSetChanged();
    GMTrace.o(4683393400832L, 34894);
  }
  
  private static boolean beD()
  {
    GMTrace.i(18375480705024L, 136908);
    try
    {
      at.AR();
      bool1 = ((Boolean)c.xh().get(73217, Boolean.valueOf(true))).booleanValue();
      bool2 = bool1;
      if (bool1) {}
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        label55:
        bool2 = true;
      }
    }
    try
    {
      at.AR();
      c.xh().set(73218, Boolean.valueOf(false));
      bool2 = bool1;
    }
    catch (Exception localException2)
    {
      bool2 = bool1;
      break label55;
    }
    GMTrace.o(18375480705024L, 136908);
    return bool2;
  }
  
  private boolean hi(boolean paramBoolean)
  {
    GMTrace.i(4683661836288L, 34896);
    Preference localPreference1 = this.htU.VG("settings_sound");
    Preference localPreference2 = this.htU.VG("settings_shake");
    Preference localPreference3 = this.htU.VG("settings_show_detail");
    if (localPreference1 != null) {
      localPreference1.setEnabled(paramBoolean);
    }
    if (localPreference2 != null) {
      localPreference2.setEnabled(paramBoolean);
    }
    if (localPreference3 != null) {
      localPreference3.setEnabled(paramBoolean);
    }
    GMTrace.o(4683661836288L, 34896);
    return true;
  }
  
  protected final void MP()
  {
    GMTrace.i(4682990747648L, 34891);
    oM(R.l.dZD);
    this.htU = this.wky;
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(R.o.epu);
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.htU.VG("settings_new_msg_notification");
    if (com.tencent.mm.k.f.tK()) {
      localCheckBoxPreference1.sdM = true;
    }
    hi(localCheckBoxPreference1.isChecked());
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.htU.VG("settings_new_voip_msg_notification");
    if (com.tencent.mm.k.f.tL()) {
      localCheckBoxPreference2.sdM = true;
    }
    ((CheckBoxPreference)this.htU.VG("settings_voip_notification_sound")).sdM = beD();
    if (localCheckBoxPreference1.isChecked())
    {
      localCheckBoxPreference1 = (CheckBoxPreference)this.htU.VG("settings_sound");
      if (com.tencent.mm.k.f.tN())
      {
        localCheckBoxPreference1.sdM = true;
        beC();
        localCheckBoxPreference1 = (CheckBoxPreference)this.htU.VG("settings_shake");
        if (com.tencent.mm.k.f.tP()) {
          localCheckBoxPreference1.sdM = true;
        }
        localCheckBoxPreference1 = (CheckBoxPreference)this.htU.VG("settings_show_detail");
        if (com.tencent.mm.k.f.tM()) {
          localCheckBoxPreference1.sdM = true;
        }
      }
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4721242800128L, 35176);
          SettingsNotificationUI.this.aLo();
          SettingsNotificationUI.this.finish();
          GMTrace.o(4721242800128L, 35176);
          return true;
        }
      });
      GMTrace.o(4682990747648L, 34891);
      return;
      this.htU.VH("settings_notification_ringtone");
      break;
      this.htU.VH("settings_show_detail");
      this.htU.VH("settings_sound");
      this.htU.VH("settings_notification_ringtone");
      this.htU.VH("settings_shake");
      this.htU.VH("settings_active_time");
    }
  }
  
  public final int QI()
  {
    GMTrace.i(4682722312192L, 34889);
    int i = R.o.epu;
    GMTrace.o(4682722312192L, 34889);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(4683527618560L, 34895);
    paramf = paramPreference.hiu;
    boolean bool;
    if (paramf.equals("settings_new_msg_notification"))
    {
      com.tencent.mm.k.f.aQ(((CheckBoxPreference)paramPreference).isChecked());
      MP();
      if (((CheckBoxPreference)paramPreference).isChecked()) {
        g.ork.a(500L, 0L, 1L, false);
      }
      for (;;)
      {
        bool = hi(((CheckBoxPreference)paramPreference).isChecked());
        GMTrace.o(4683527618560L, 34895);
        return bool;
        g.ork.a(500L, 1L, 1L, false);
      }
    }
    if (paramf.equals("settings_new_voip_msg_notification"))
    {
      if (!((CheckBoxPreference)paramPreference).isChecked()) {
        h.a(this.vKB.vKW, false, this.vKB.vKW.getString(R.l.dZB), "", this.vKB.vKW.getString(R.l.dZA), this.vKB.vKW.getString(R.l.dZi), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4598030925824L, 34258);
            com.tencent.mm.k.f.aR(false);
            paramAnonymousDialogInterface = new au();
            paramAnonymousDialogInterface.dC(2);
            paramAnonymousDialogInterface.E(System.currentTimeMillis());
            paramAnonymousDialogInterface.setType(1);
            paramAnonymousDialogInterface.db("weixin");
            paramAnonymousDialogInterface.setContent(SettingsNotificationUI.this.vKB.vKW.getString(R.l.dZC, new Object[] { Build.MODEL }));
            bc.i(paramAnonymousDialogInterface);
            at.AR();
            paramAnonymousDialogInterface = c.yP().TO("weixin");
            if (paramAnonymousDialogInterface != null)
            {
              paramAnonymousDialogInterface.setContent(SettingsNotificationUI.this.vKB.vKW.getString(R.l.dZC, new Object[] { Build.MODEL }));
              paramAnonymousDialogInterface.dz(paramAnonymousDialogInterface.field_unReadCount + 1);
              at.AR();
              c.yP().a(paramAnonymousDialogInterface, "weixin");
            }
            for (;;)
            {
              g.ork.a(500L, 3L, 1L, false);
              GMTrace.o(4598030925824L, 34258);
              return;
              paramAnonymousDialogInterface = new ae();
              paramAnonymousDialogInterface.setContent(SettingsNotificationUI.this.vKB.vKW.getString(R.l.dZC, new Object[] { Build.MODEL }));
              paramAnonymousDialogInterface.setUsername("weixin");
              paramAnonymousDialogInterface.dz(1);
              at.AR();
              c.yP().d(paramAnonymousDialogInterface);
            }
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4665139789824L, 34758);
            com.tencent.mm.k.f.aR(true);
            ((CheckBoxPreference)SettingsNotificationUI.a(SettingsNotificationUI.this).VG("settings_new_voip_msg_notification")).sdM = true;
            SettingsNotificationUI.this.MP();
            GMTrace.o(4665139789824L, 34758);
          }
        }, R.e.aMJ, 0);
      }
      for (;;)
      {
        MP();
        GMTrace.o(4683527618560L, 34895);
        return true;
        com.tencent.mm.k.f.aR(true);
        g.ork.a(500L, 2L, 1L, false);
      }
    }
    if (paramf.equals("settings_voip_notification_sound"))
    {
      bool = ((CheckBoxPreference)paramPreference).isChecked();
      at.AR();
      c.xh().set(73217, Boolean.valueOf(bool));
      at.AR();
      c.xh().set(73218, Boolean.valueOf(bool));
      paramf = g.ork;
      if (bool) {}
      for (long l = 8L;; l = 9L)
      {
        paramf.a(500L, l, 1L, false);
        w.i("MicroMsg.SettingsNotificationUI", "void sound checkbox %b", new Object[] { Boolean.valueOf(bool) });
        GMTrace.o(4683527618560L, 34895);
        return true;
      }
    }
    if (paramf.equals("settings_sound"))
    {
      com.tencent.mm.k.f.aU(((CheckBoxPreference)paramPreference).isChecked());
      MP();
      GMTrace.o(4683527618560L, 34895);
      return true;
    }
    if (paramf.equals("settings_shake"))
    {
      com.tencent.mm.k.f.aV(((CheckBoxPreference)paramPreference).isChecked());
      bg.l(this, ((CheckBoxPreference)paramPreference).isChecked());
      GMTrace.o(4683527618560L, 34895);
      return true;
    }
    label492:
    final int i;
    if (paramf.equals("settings_show_detail"))
    {
      bool = ((CheckBoxPreference)paramPreference).isChecked();
      com.tencent.mm.k.f.aS(bool);
      if (!bool)
      {
        bool = true;
        w.d("MicroMsg.SettingsNotificationUI", "switch change : open = " + bool + " item value = 2048 functionId = 10");
        if (!bool) {
          break label532;
        }
        this.status |= 0x800;
        if (!bool) {
          break label547;
        }
      }
      label532:
      label547:
      for (i = 1;; i = 2)
      {
        this.jqC.put(Integer.valueOf(10), Integer.valueOf(i));
        GMTrace.o(4683527618560L, 34895);
        return true;
        bool = false;
        break;
        this.status &= 0xF7FF;
        break label492;
      }
    }
    if (paramf.equals("settings_notification_ringtone"))
    {
      startActivity(new Intent(this.vKB.vKW, SettingsRingtoneUI.class));
      GMTrace.o(4683527618560L, 34895);
      return true;
    }
    if (paramf.equals("settings_active_time"))
    {
      startActivity(new Intent(this, SettingsActiveTimeUI.class));
      GMTrace.o(4683527618560L, 34895);
      return true;
    }
    int j;
    int k;
    if (paramf.equals("settings_plugings_notify"))
    {
      paramf = new LinkedList();
      paramf.add(getString(R.l.dZN));
      paramf.add(getString(R.l.dZO));
      paramf.add(getString(R.l.dZM));
      paramPreference = Boolean.valueOf(q.Aa());
      j = q.Ai();
      k = q.Aj();
      if (!paramPreference.booleanValue()) {
        break label829;
      }
      if (j != k) {
        break label824;
      }
      i = 0;
    }
    for (;;)
    {
      w.d("MicroMsg.SettingsNotificationUI", paramPreference + "st " + j + " ed " + k + "  state " + i);
      paramPreference = this.vKB.vKW;
      String str = getString(R.l.dZQ);
      getString(R.l.dZP);
      h.a(paramPreference, str, paramf, i, new h.a()
      {
        public final void te(int paramAnonymousInt)
        {
          GMTrace.i(4673461288960L, 34820);
          if (i != paramAnonymousInt) {
            SettingsNotificationUI.tJ(paramAnonymousInt);
          }
          GMTrace.o(4673461288960L, 34820);
        }
      });
      GMTrace.o(4683527618560L, 34895);
      return false;
      label824:
      i = 1;
      continue;
      label829:
      i = 2;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4682856529920L, 34890);
    super.onCreate(paramBundle);
    this.status = q.zI();
    MP();
    GMTrace.o(4682856529920L, 34890);
  }
  
  protected void onPause()
  {
    GMTrace.i(4683124965376L, 34892);
    super.onPause();
    at.AR();
    c.xh().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.jqC.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new uu();
      ((uu)localObject).umY = i;
      ((uu)localObject).umZ = j;
      at.AR();
      c.yJ().b(new e.a(23, (a)localObject));
      w.d("MicroMsg.SettingsNotificationUI", "switch  " + i + " " + j);
    }
    this.jqC.clear();
    GMTrace.o(4683124965376L, 34892);
  }
  
  public void onResume()
  {
    GMTrace.i(4683259183104L, 34893);
    super.onResume();
    beC();
    GMTrace.o(4683259183104L, 34893);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsNotificationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */