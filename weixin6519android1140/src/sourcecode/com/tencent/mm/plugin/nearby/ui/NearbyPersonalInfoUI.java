package com.tencent.mm.plugin.nearby.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.nearby.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.preference.ChoicePreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.Preference.a;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;

public class NearbyPersonalInfoUI
  extends MMPreference
{
  private int fja;
  private f htU;
  
  public NearbyPersonalInfoUI()
  {
    GMTrace.i(6691022176256L, 49852);
    this.fja = -1;
    GMTrace.o(6691022176256L, 49852);
  }
  
  protected final void MP()
  {
    GMTrace.i(6691424829440L, 49855);
    oM(R.l.dKY);
    this.htU = this.wky;
    ((KeyValuePreference)this.htU.VG("settings_signature")).wko = false;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6710886400000L, 50000);
        NearbyPersonalInfoUI.this.finish();
        GMTrace.o(6710886400000L, 50000);
        return true;
      }
    });
    a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6682566459392L, 49789);
        if (NearbyPersonalInfoUI.a(NearbyPersonalInfoUI.this) != -1)
        {
          paramAnonymousMenuItem = bk.BE();
          paramAnonymousMenuItem.fja = NearbyPersonalInfoUI.a(NearbyPersonalInfoUI.this);
          bk.a(paramAnonymousMenuItem);
        }
        paramAnonymousMenuItem = bk.BF();
        if (paramAnonymousMenuItem == null) {
          NearbyPersonalInfoUI.b(NearbyPersonalInfoUI.this);
        }
        for (;;)
        {
          GMTrace.o(6682566459392L, 49789);
          return true;
          String str = bg.nl(paramAnonymousMenuItem.getProvince());
          bg.nl(paramAnonymousMenuItem.getCity());
          int i = paramAnonymousMenuItem.fja;
          if ((bg.nm(str)) || (i == 0))
          {
            NearbyPersonalInfoUI.b(NearbyPersonalInfoUI.this);
          }
          else
          {
            NearbyPersonalInfoUI.this.startActivity(new Intent(NearbyPersonalInfoUI.this, NearbyFriendsUI.class));
            paramAnonymousMenuItem = bk.BE();
            if (i != -1) {
              paramAnonymousMenuItem.fja = i;
            }
            at.AR();
            c.yJ().b(new e.a(1, bk.a(paramAnonymousMenuItem)));
            NearbyPersonalInfoUI.this.finish();
          }
        }
      }
    });
    ((ChoicePreference)this.htU.VG("settings_sex")).wjv = new Preference.a()
    {
      public final boolean a(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        GMTrace.i(6707530956800L, 49975);
        paramAnonymousPreference = (String)paramAnonymousObject;
        if ("male".equalsIgnoreCase(paramAnonymousPreference)) {
          NearbyPersonalInfoUI.a(NearbyPersonalInfoUI.this, 1);
        }
        for (;;)
        {
          GMTrace.o(6707530956800L, 49975);
          return false;
          if ("female".equalsIgnoreCase(paramAnonymousPreference)) {
            NearbyPersonalInfoUI.a(NearbyPersonalInfoUI.this, 2);
          }
        }
      }
    };
    at.AR();
    int i = bg.a((Integer)c.xh().get(12290, null), 0);
    ChoicePreference localChoicePreference = (ChoicePreference)this.htU.VG("settings_sex");
    localChoicePreference.setTitle(Html.fromHtml(getString(R.l.eat) + "<font color='red'>*</font>"));
    switch (i)
    {
    default: 
      localChoicePreference.setValue("unknown");
      GMTrace.o(6691424829440L, 49855);
      return;
    case 1: 
      localChoicePreference.setValue("male");
      GMTrace.o(6691424829440L, 49855);
      return;
    }
    localChoicePreference.setValue("female");
    GMTrace.o(6691424829440L, 49855);
  }
  
  public final int QI()
  {
    GMTrace.i(6691693264896L, 49857);
    int i = R.o.dKY;
    GMTrace.o(6691693264896L, 49857);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(6691827482624L, 49858);
    paramf = paramPreference.hiu;
    if ("settings_district".equals(paramf))
    {
      a.hnH.b(null, this);
      GMTrace.o(6691827482624L, 49858);
      return true;
    }
    if ("settings_signature".equals(paramf))
    {
      a.hnH.c(null, this);
      overridePendingTransition(R.a.aLG, R.a.aLF);
      GMTrace.o(6691827482624L, 49858);
      return true;
    }
    GMTrace.o(6691827482624L, 49858);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6691156393984L, 49853);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(6691156393984L, 49853);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6691290611712L, 49854);
    super.onDestroy();
    GMTrace.o(6691290611712L, 49854);
  }
  
  public void onResume()
  {
    GMTrace.i(6691559047168L, 49856);
    Object localObject2 = bk.BE();
    Object localObject1 = ((bk)localObject2).getProvince();
    localObject2 = ((bk)localObject2).getCity();
    Preference localPreference = this.htU.VG("settings_district");
    localPreference.setSummary(r.fu((String)localObject1) + " " + (String)localObject2);
    localPreference.setTitle(Html.fromHtml(getString(R.l.dYK) + "<font color='red'>*</font>"));
    localPreference = this.htU.VG("settings_signature");
    at.AR();
    localObject2 = bg.nl((String)c.xh().get(12291, null));
    localObject1 = localObject2;
    if (((String)localObject2).length() <= 0) {
      localObject1 = getString(R.l.eaz);
    }
    localPreference.setSummary(h.a(this, (CharSequence)localObject1));
    super.onResume();
    GMTrace.o(6691559047168L, 49856);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\ui\NearbyPersonalInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */