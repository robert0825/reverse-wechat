package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.av.l;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class SettingsPluginsNotifyUI
  extends MMPreference
{
  private f htU;
  private int state;
  
  public SettingsPluginsNotifyUI()
  {
    GMTrace.i(4696412520448L, 34991);
    GMTrace.o(4696412520448L, 34991);
  }
  
  private void beF()
  {
    GMTrace.i(4697083609088L, 34996);
    this.htU.removeAll();
    Preference localPreference = new Preference(this);
    localPreference.setTitle(R.l.dZN);
    localPreference.setKey("settings_plugings_disturb_on");
    localPreference.setLayoutResource(R.i.cBA);
    if (this.state == 0)
    {
      localPreference.setWidgetLayoutResource(R.i.cCf);
      this.htU.a(localPreference);
      localPreference = new Preference(this);
      localPreference.setTitle(R.l.dZO);
      localPreference.setKey("settings_plugings_disturb_on_night");
      localPreference.setLayoutResource(R.i.cBA);
      if (this.state != 1) {
        break label239;
      }
      localPreference.setWidgetLayoutResource(R.i.cCf);
      label114:
      this.htU.a(localPreference);
      localPreference = new Preference(this);
      localPreference.setTitle(R.l.dZM);
      localPreference.setKey("settings_plugings_disturb_off");
      localPreference.setLayoutResource(R.i.cBA);
      if (this.state != 2) {
        break label249;
      }
      localPreference.setWidgetLayoutResource(R.i.cCf);
    }
    for (;;)
    {
      this.htU.a(localPreference);
      localPreference = new Preference(this);
      localPreference.setTitle(R.l.dZP);
      localPreference.setLayoutResource(R.i.cCc);
      this.htU.a(localPreference);
      this.htU.notifyDataSetChanged();
      GMTrace.o(4697083609088L, 34996);
      return;
      localPreference.setWidgetLayoutResource(R.i.cCg);
      break;
      label239:
      localPreference.setWidgetLayoutResource(R.i.cCg);
      break label114;
      label249:
      localPreference.setWidgetLayoutResource(R.i.cCg);
    }
  }
  
  private void tK(int paramInt)
  {
    GMTrace.i(4697217826816L, 34997);
    this.state = paramInt;
    if ((this.state == 1) || (this.state == 0))
    {
      at.AR();
      c.xh().set(8200, Boolean.valueOf(true));
      if (this.state == 1)
      {
        at.AR();
        c.xh().set(8201, Integer.valueOf(22));
        at.AR();
        c.xh().set(8208, Integer.valueOf(8));
        at.AR();
        c.yJ().b(new l(true, 22, 8));
      }
    }
    for (;;)
    {
      beF();
      GMTrace.o(4697217826816L, 34997);
      return;
      at.AR();
      c.xh().set(8201, Integer.valueOf(0));
      at.AR();
      c.xh().set(8208, Integer.valueOf(0));
      at.AR();
      c.yJ().b(new l(true, 0, 0));
      continue;
      at.AR();
      c.xh().set(8200, Boolean.valueOf(false));
      at.AR();
      c.yJ().b(new l());
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(4697352044544L, 34998);
    Boolean localBoolean = Boolean.valueOf(q.Aa());
    int j = q.Ai();
    int k = q.Aj();
    int i;
    if (localBoolean.booleanValue()) {
      if (j == k) {
        i = 0;
      }
    }
    for (this.state = i;; this.state = 2)
    {
      w.d("ui.settings.SettingsPlugingsNotify", localBoolean + "st " + j + " ed " + k + "  state " + this.state);
      this.state = this.state;
      this.htU = this.wky;
      oM(R.l.dZQ);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4709431640064L, 35088);
          SettingsPluginsNotifyUI.this.aLo();
          SettingsPluginsNotifyUI.this.finish();
          GMTrace.o(4709431640064L, 35088);
          return true;
        }
      });
      GMTrace.o(4697352044544L, 34998);
      return;
      i = 1;
      break;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(4696815173632L, 34994);
    GMTrace.o(4696815173632L, 34994);
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4696949391360L, 34995);
    paramf = paramPreference.hiu;
    if (paramf.equals("settings_plugings_disturb_on")) {
      tK(0);
    }
    if (paramf.equals("settings_plugings_disturb_on_night")) {
      tK(1);
    }
    if (paramf.equals("settings_plugings_disturb_off")) {
      tK(2);
    }
    GMTrace.o(4696949391360L, 34995);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4696546738176L, 34992);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4696546738176L, 34992);
  }
  
  public void onResume()
  {
    GMTrace.i(4696680955904L, 34993);
    super.onResume();
    beF();
    GMTrace.o(4696680955904L, 34993);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsPluginsNotifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */