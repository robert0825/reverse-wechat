package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class SettingsHideUsernameUI
  extends MMPreference
{
  private f htU;
  private boolean ism;
  private long jZy;
  private int oIF;
  private CheckBoxPreference oJg;
  private String username;
  
  public SettingsHideUsernameUI()
  {
    GMTrace.i(16884724400128L, 125801);
    GMTrace.o(16884724400128L, 125801);
  }
  
  private void bez()
  {
    GMTrace.i(16885395488768L, 125806);
    if (this.ism)
    {
      this.oJg.setSummary(getString(R.l.eaw));
      GMTrace.o(16885395488768L, 125806);
      return;
    }
    if (this.oJg.isEnabled())
    {
      this.oJg.setSummary(getString(R.l.eau));
      GMTrace.o(16885395488768L, 125806);
      return;
    }
    this.oJg.setSummary(getString(R.l.eav));
    GMTrace.o(16885395488768L, 125806);
  }
  
  protected final void MP()
  {
    boolean bool2 = true;
    GMTrace.i(16884992835584L, 125803);
    oM(R.l.ebi);
    this.htU.VG("settings_my_username").setSummary(this.username);
    CheckBoxPreference localCheckBoxPreference;
    if ((this.jZy & 0x4000) != 0L)
    {
      bool1 = true;
      this.ism = bool1;
      w.d("MicroMsg.SettingsHideUsernameUI", "is hide: %s", new Object[] { Boolean.valueOf(bool1) });
      this.oJg = ((CheckBoxPreference)this.htU.VG("settings_show_username"));
      this.oJg.wlc = false;
      localCheckBoxPreference = this.oJg;
      if (bool1) {
        break label155;
      }
    }
    label155:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localCheckBoxPreference.sdM = bool1;
      if (bg.nm(q.zG())) {
        this.oJg.setEnabled(false);
      }
      this.htU.notifyDataSetChanged();
      GMTrace.o(16884992835584L, 125803);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(16885127053312L, 125804);
    int i = R.o.epm;
    GMTrace.o(16885127053312L, 125804);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = false;
    GMTrace.i(16885261271040L, 125805);
    if (paramPreference.hiu.equals("settings_show_username"))
    {
      if (!((CheckBoxPreference)paramPreference).isChecked()) {
        bool = true;
      }
      this.ism = bool;
      bez();
      GMTrace.o(16885261271040L, 125805);
      return true;
    }
    GMTrace.o(16885261271040L, 125805);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16884858617856L, 125802);
    super.onCreate(paramBundle);
    this.username = q.zF();
    if (bg.nm(this.username)) {
      this.username = q.zE();
    }
    this.htU = this.wky;
    this.jZy = q.zJ();
    this.oIF = q.zK();
    MP();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16883516440576L, 125792);
        SettingsHideUsernameUI.this.finish();
        GMTrace.o(16883516440576L, 125792);
        return true;
      }
    });
    GMTrace.o(16884858617856L, 125802);
  }
  
  protected void onPause()
  {
    int j = 0;
    int i = 1;
    GMTrace.i(16885663924224L, 125808);
    super.onPause();
    w.d("MicroMsg.SettingsHideUsernameUI", "hide: %s", new Object[] { Boolean.valueOf(this.ism) });
    if ((this.jZy & 0x4000) != 0L) {
      j = 1;
    }
    if (j != this.ism)
    {
      if (!this.ism) {
        break label194;
      }
      this.jZy |= 0x4000;
    }
    for (this.oIF |= 0x200;; this.oIF &= 0xFDFF)
    {
      h.xz();
      h.xy().xh().set(147457, Long.valueOf(this.jZy));
      h.xz();
      h.xy().xh().set(40, Integer.valueOf(this.oIF));
      uu localuu = new uu();
      localuu.umY = 46;
      if (this.ism) {
        i = 2;
      }
      localuu.umZ = i;
      at.AR();
      c.yJ().b(new e.a(23, localuu));
      GMTrace.o(16885663924224L, 125808);
      return;
      label194:
      this.jZy &= 0xFFFFFFFFFFFFBFFF;
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(16885529706496L, 125807);
    super.onResume();
    bez();
    GMTrace.o(16885529706496L, 125807);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsHideUsernameUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */