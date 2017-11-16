package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.sns.b.e;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class SettingsAboutTimelineUI
  extends MMPreference
{
  private String fJS;
  private f htU;
  private boolean oIa;
  private boolean oIb;
  
  public SettingsAboutTimelineUI()
  {
    GMTrace.i(4621250592768L, 34431);
    this.fJS = "";
    this.oIa = false;
    this.oIb = false;
    GMTrace.o(4621250592768L, 34431);
  }
  
  protected final void MP()
  {
    GMTrace.i(4622055899136L, 34437);
    this.htU = this.wky;
    oM(R.l.dZL);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4707015720960L, 35070);
        SettingsAboutTimelineUI.this.aLo();
        SettingsAboutTimelineUI.this.finish();
        GMTrace.o(4707015720960L, 35070);
        return true;
      }
    });
    this.fJS = q.zE();
    GMTrace.o(4622055899136L, 34437);
  }
  
  public final int QI()
  {
    GMTrace.i(4621384810496L, 34432);
    int i = R.o.epj;
    GMTrace.o(4621384810496L, 34432);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4621787463680L, 34435);
    paramf = paramPreference.hiu;
    if (paramf.equals("timline_outside_permiss"))
    {
      paramPreference = new Intent();
      paramPreference.putExtra("k_sns_tag_id", 4L);
      paramPreference.putExtra("k_sns_from_settings_about_sns", 1);
      com.tencent.mm.bj.d.b(this, "sns", ".ui.SnsBlackDetailUI", paramPreference);
    }
    if (paramf.equals("timeline_black_permiss"))
    {
      paramPreference = new Intent();
      paramPreference.putExtra("k_sns_tag_id", 5L);
      paramPreference.putExtra("k_sns_from_settings_about_sns", 2);
      com.tencent.mm.bj.d.b(this, "sns", ".ui.SnsTagDetailUI", paramPreference);
    }
    if (paramf.equals("timeline_stranger_show")) {
      if (this.oIb) {
        break label162;
      }
    }
    label162:
    for (boolean bool = true;; bool = false)
    {
      this.oIb = bool;
      if (n.poP != null) {
        n.poP.at(this.fJS, this.oIb);
      }
      this.oIa = true;
      GMTrace.o(4621787463680L, 34435);
      return false;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4621519028224L, 34433);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4621519028224L, 34433);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4621921681408L, 34436);
    super.onDestroy();
    if ((this.oIa) && (n.poP != null))
    {
      bgm localbgm = n.poP.au(this.fJS, this.oIb);
      if (localbgm == null)
      {
        GMTrace.o(4621921681408L, 34436);
        return;
      }
      w.d("MicroMsg.SettingsAboutTimelineUI", "userinfo " + localbgm.toString());
      at.AR();
      c.yJ().b(new e.a(51, localbgm));
    }
    GMTrace.o(4621921681408L, 34436);
  }
  
  public void onResume()
  {
    GMTrace.i(4621653245952L, 34434);
    super.onResume();
    Object localObject = new bgm();
    if (n.poP != null) {
      localObject = n.poP.GI(this.fJS);
    }
    if (localObject == null) {
      w.e("MicroMsg.SettingsAboutTimelineUI", "userinfo is null");
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(4621653245952L, 34434);
      return;
      int i = ((bgm)localObject).uSi;
      localObject = (CheckBoxPreference)this.htU.VG("timeline_stranger_show");
      if (localObject != null)
      {
        if ((i & 0x1) > 0) {}
        SharedPreferences localSharedPreferences;
        for (boolean bool = true;; bool = false)
        {
          this.oIb = bool;
          localSharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
          if (this.oIb) {
            break label175;
          }
          ((CheckBoxPreference)localObject).sdM = true;
          localSharedPreferences.edit().putBoolean("timeline_stranger_show", true).commit();
          break;
        }
        label175:
        ((CheckBoxPreference)localObject).sdM = false;
        localSharedPreferences.edit().putBoolean("timeline_stranger_show", false).commit();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsAboutTimelineUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */