package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.l;
import com.tencent.mm.network.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.account.LanguagePreference;
import com.tencent.mm.ui.account.LanguagePreference.a;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsLanguageUI
  extends MMPreference
{
  private static final String[] oJi;
  private f htU;
  private List<LanguagePreference.a> oJj;
  private String oJk;
  private boolean oJl;
  
  static
  {
    GMTrace.i(4690506940416L, 34947);
    oJi = u.oJi;
    GMTrace.o(4690506940416L, 34947);
  }
  
  public SettingsLanguageUI()
  {
    GMTrace.i(4689298980864L, 34938);
    this.oJl = false;
    GMTrace.o(4689298980864L, 34938);
  }
  
  protected final void MP()
  {
    int i = 0;
    GMTrace.i(4689835851776L, 34942);
    oM(R.l.dZc);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4618700455936L, 34412);
        SettingsLanguageUI.this.aLo();
        SettingsLanguageUI.this.finish();
        GMTrace.o(4618700455936L, 34412);
        return true;
      }
    });
    a(0, getString(R.l.dZb), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4633061752832L, 34519);
        SettingsLanguageUI.this.finish();
        SettingsLanguageUI.a(SettingsLanguageUI.this, SettingsLanguageUI.a(SettingsLanguageUI.this), SettingsLanguageUI.b(SettingsLanguageUI.this));
        GMTrace.o(4633061752832L, 34519);
        return true;
      }
    }, p.b.vLG);
    this.oJl = getIntent().getBooleanExtra("not_auth_setting", false);
    this.htU.removeAll();
    Object localObject1 = getResources().getStringArray(R.c.aMp);
    this.oJk = v.e(getSharedPreferences(ab.bPU(), 0));
    this.oJj = new ArrayList();
    Object localObject2;
    while (i < oJi.length)
    {
      localObject2 = oJi[i];
      this.oJj.add(new LanguagePreference.a(localObject1[i], "", (String)localObject2, this.oJk.equalsIgnoreCase((String)localObject2)));
      i += 1;
    }
    localObject1 = this.oJj.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (LanguagePreference.a)((Iterator)localObject1).next();
      LanguagePreference localLanguagePreference = new LanguagePreference(this);
      localLanguagePreference.a((LanguagePreference.a)localObject2);
      this.htU.a(localLanguagePreference);
    }
    localObject1 = new PreferenceCategory(this);
    this.htU.a((Preference)localObject1);
    this.htU.notifyDataSetChanged();
    GMTrace.o(4689835851776L, 34942);
  }
  
  public final int QI()
  {
    GMTrace.i(4689701634048L, 34941);
    GMTrace.o(4689701634048L, 34941);
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4689970069504L, 34943);
    if ((paramPreference instanceof LanguagePreference))
    {
      paramPreference = ((LanguagePreference)paramPreference).vPZ;
      if (paramPreference == null)
      {
        GMTrace.o(4689970069504L, 34943);
        return false;
      }
      this.oJk = paramPreference.vQc;
      Iterator localIterator = this.oJj.iterator();
      while (localIterator.hasNext()) {
        ((LanguagePreference.a)localIterator.next()).mbA = false;
      }
      paramPreference.mbA = true;
      paramf.notifyDataSetChanged();
      GMTrace.o(4689970069504L, 34943);
      return true;
    }
    GMTrace.o(4689970069504L, 34943);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4689433198592L, 34939);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    MP();
    GMTrace.o(4689433198592L, 34939);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4689567416320L, 34940);
    super.onDestroy();
    GMTrace.o(4689567416320L, 34940);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsLanguageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */