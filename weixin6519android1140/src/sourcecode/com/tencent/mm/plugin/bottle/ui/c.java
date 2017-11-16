package com.tencent.mm.plugin.bottle.ui;

import android.content.Intent;
import android.text.Html;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.ChoicePreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.Preference.a;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.r;

public final class c
{
  private MMActivity ezR;
  private f htU;
  
  public c(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7629740965888L, 56846);
    this.ezR = paramMMActivity;
    this.htU = paramf;
    paramMMActivity = (ChoicePreference)this.htU.VG("settings_sex");
    paramMMActivity.wjv = new Preference.a()
    {
      public final boolean a(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        GMTrace.i(7653363286016L, 57022);
        paramAnonymousPreference = (String)paramAnonymousObject;
        int i = -1;
        if ("male".equalsIgnoreCase(paramAnonymousPreference)) {
          i = 1;
        }
        for (;;)
        {
          if (i > 0)
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(12290, Integer.valueOf(i));
          }
          GMTrace.o(7653363286016L, 57022);
          return false;
          if ("female".equalsIgnoreCase(paramAnonymousPreference)) {
            i = 2;
          }
        }
      }
    };
    paramMMActivity.setTitle(Html.fromHtml(this.ezR.getString(R.l.eat) + "<font color='red'>*</font>"));
    ((KeyValuePreference)this.htU.VG("settings_district")).setTitle(Html.fromHtml(this.ezR.getString(R.l.dYK) + "<font color='red'>*</font>"));
    GMTrace.o(7629740965888L, 56846);
  }
  
  public static void ahF()
  {
    GMTrace.i(7629875183616L, 56847);
    bk localbk = bk.BE();
    at.AR();
    com.tencent.mm.y.c.yJ().b(new e.a(1, bk.a(localbk)));
    a.hnI.pr();
    GMTrace.o(7629875183616L, 56847);
  }
  
  public final boolean ahG()
  {
    GMTrace.i(7630143619072L, 56849);
    Intent localIntent = new Intent();
    localIntent.putExtra("persist_signature", false);
    a.hnH.c(localIntent, this.ezR);
    GMTrace.o(7630143619072L, 56849);
    return true;
  }
  
  public final boolean ahH()
  {
    GMTrace.i(7630277836800L, 56850);
    a.hnH.b(new Intent(), this.ezR);
    GMTrace.o(7630277836800L, 56850);
    return true;
  }
  
  public final void update()
  {
    GMTrace.i(7630009401344L, 56848);
    at.AR();
    int i = bg.a((Integer)com.tencent.mm.y.c.xh().get(12290, null), 0);
    Object localObject1 = (ChoicePreference)this.htU.VG("settings_sex");
    switch (i)
    {
    default: 
      ((ChoicePreference)localObject1).setValue("unknown");
    }
    for (;;)
    {
      Object localObject2 = bk.BE();
      localObject1 = ((bk)localObject2).getProvince();
      localObject2 = ((bk)localObject2).getCity();
      this.htU.VG("settings_district").setSummary(r.fu((String)localObject1) + " " + (String)localObject2);
      KeyValuePreference localKeyValuePreference = (KeyValuePreference)this.htU.VG("settings_signature");
      localKeyValuePreference.wko = false;
      at.AR();
      localObject2 = bg.nl((String)com.tencent.mm.y.c.xh().get(12291, null));
      MMActivity localMMActivity = this.ezR;
      localObject1 = localObject2;
      if (((String)localObject2).length() <= 0) {
        localObject1 = this.ezR.getString(R.l.eaz);
      }
      localKeyValuePreference.setSummary(h.a(localMMActivity, (CharSequence)localObject1));
      this.htU.notifyDataSetChanged();
      GMTrace.o(7630009401344L, 56848);
      return;
      ((ChoicePreference)localObject1).setValue("male");
      continue;
      ((ChoicePreference)localObject1).setValue("female");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */