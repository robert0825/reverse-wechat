package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.DialogPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.Preference.a;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;

public class SettingsPersonalMoreUI
  extends MMPreference
  implements m.b
{
  private int fja;
  private f htU;
  
  public SettingsPersonalMoreUI()
  {
    GMTrace.i(16579915939840L, 123530);
    this.fja = -1;
    GMTrace.o(16579915939840L, 123530);
  }
  
  private void beE()
  {
    GMTrace.i(16580721246208L, 123536);
    Preference localPreference = this.htU.VG("settings_signature");
    at.AR();
    String str2 = bg.nl((String)c.xh().get(12291, null));
    String str1 = str2;
    if (str2.length() <= 0) {
      str1 = getString(R.l.eaz);
    }
    localPreference.setSummary(com.tencent.mm.pluginsdk.ui.d.h.a(this, str1));
    GMTrace.o(16580721246208L, 123536);
  }
  
  protected final void MP()
  {
    GMTrace.i(16580318593024L, 123533);
    oM(R.l.dZJ);
    this.htU = this.wky;
    ((DialogPreference)this.htU.VG("settings_sex")).wjv = new Preference.a()
    {
      public final boolean a(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        GMTrace.i(16579781722112L, 123529);
        paramAnonymousPreference = (String)paramAnonymousObject;
        if ("male".equalsIgnoreCase(paramAnonymousPreference)) {
          SettingsPersonalMoreUI.a(SettingsPersonalMoreUI.this, 1);
        }
        for (;;)
        {
          GMTrace.o(16579781722112L, 123529);
          return false;
          if ("female".equalsIgnoreCase(paramAnonymousPreference)) {
            SettingsPersonalMoreUI.a(SettingsPersonalMoreUI.this, 2);
          }
        }
      }
    };
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16574949883904L, 123493);
        SettingsPersonalMoreUI.this.aLo();
        SettingsPersonalMoreUI.this.finish();
        GMTrace.o(16574949883904L, 123493);
        return true;
      }
    });
    GMTrace.o(16580318593024L, 123533);
  }
  
  public final int QI()
  {
    GMTrace.i(16580184375296L, 123532);
    int i = R.o.epv;
    GMTrace.o(16580184375296L, 123532);
    return i;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(16580989681664L, 123538);
    int i = bg.m(paramObject, 0);
    w.d("SettingsPersonalMoreUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      w.e("SettingsPersonalMoreUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(16580989681664L, 123538);
      return;
    }
    if (12291 == i) {
      beE();
    }
    GMTrace.o(16580989681664L, 123538);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(16580855463936L, 123537);
    paramf = paramPreference.hiu;
    if (paramf.equals("settings_district"))
    {
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
      w.i("SettingsPersonalMoreUI", "settings district,checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        GMTrace.o(16580855463936L, 123537);
        return false;
      }
      com.tencent.mm.plugin.setting.a.hnH.b(new Intent(), this.vKB.vKW);
      GMTrace.o(16580855463936L, 123537);
      return true;
    }
    if (paramf.equals("settings_signature"))
    {
      startActivity(new Intent(this, EditSignatureUI.class));
      GMTrace.o(16580855463936L, 123537);
      return true;
    }
    if (paramf.equals("settings_linkedin"))
    {
      paramf = new Intent();
      paramf.putExtra("oversea_entry", true);
      com.tencent.mm.bj.d.b(this, "accountsync", "com.tencent.mm.ui.bindlinkedin.BindLinkedInUI", paramf);
      GMTrace.o(16580855463936L, 123537);
      return true;
    }
    GMTrace.o(16580855463936L, 123537);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16580050157568L, 123531);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(16580050157568L, 123531);
  }
  
  public void onPause()
  {
    GMTrace.i(16580587028480L, 123535);
    super.onPause();
    bk localbk = bk.BE();
    if (this.fja != -1) {
      localbk.fja = this.fja;
    }
    at.AR();
    c.yJ().b(new e.a(1, bk.a(localbk)));
    GMTrace.o(16580587028480L, 123535);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(16581123899392L, 123539);
    w.i("SettingsPersonalMoreUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16581123899392L, 123539);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        com.tencent.mm.plugin.setting.a.hnH.b(new Intent(), this.vKB.vKW);
        GMTrace.o(16581123899392L, 123539);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16578573762560L, 123520);
          SettingsPersonalMoreUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(16578573762560L, 123520);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16576694714368L, 123506);
          GMTrace.o(16576694714368L, 123506);
        }
      });
    }
  }
  
  protected void onResume()
  {
    int k = 1;
    GMTrace.i(16580452810752L, 123534);
    super.onResume();
    at.AR();
    int i = bg.a((Integer)c.xh().get(12290, null), 0);
    Object localObject1 = (DialogPreference)this.htU.VG("settings_sex");
    switch (i)
    {
    default: 
      ((DialogPreference)localObject1).setValue("unknown");
      Object localObject2 = bk.BE();
      localObject1 = bg.nl(((bk)localObject2).getProvince());
      localObject2 = bg.nl(((bk)localObject2).getCity());
      this.htU.VG("settings_district").setSummary(r.fu((String)localObject1) + " " + (String)localObject2);
      beE();
      if ((q.zP() & 0x1000000) == 0)
      {
        i = 1;
        label168:
        localObject1 = g.ut().getValue("LinkedinPluginClose");
        if ((!bg.nm((String)localObject1)) && (Integer.valueOf((String)localObject1).intValue() != 0)) {
          break label257;
        }
      }
      break;
    }
    label257:
    for (int j = 1;; j = 0)
    {
      if ((i != 0) && (j != 0)) {
        break label262;
      }
      this.htU.bc("settings_linkedin", true);
      GMTrace.o(16580452810752L, 123534);
      return;
      ((DialogPreference)localObject1).setValue("male");
      break;
      ((DialogPreference)localObject1).setValue("female");
      break;
      i = 0;
      break label168;
    }
    label262:
    localObject1 = this.htU.VG("settings_linkedin");
    at.AR();
    if (!bg.nm((String)c.xh().get(286721, null))) {}
    for (i = k; i == 0; i = 0)
    {
      ((Preference)localObject1).setSummary(getString(R.l.dZd));
      GMTrace.o(16580452810752L, 123534);
      return;
    }
    if ((q.zI() & 0x400000) == 0)
    {
      ((Preference)localObject1).setSummary(getString(R.l.dZe));
      GMTrace.o(16580452810752L, 123534);
      return;
    }
    ((Preference)localObject1).setSummary(getString(R.l.dZf));
    GMTrace.o(16580452810752L, 123534);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsPersonalMoreUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */