package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bu.g;
import com.tencent.mm.modelstat.j;
import com.tencent.mm.modelstat.l;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;

public class SettingsNetStatUI
  extends MMPreference
{
  private f htU;
  private long period;
  
  public SettingsNetStatUI()
  {
    GMTrace.i(4684601360384L, 34903);
    GMTrace.o(4684601360384L, 34903);
  }
  
  private void beB()
  {
    GMTrace.i(4685406666752L, 34909);
    Object localObject2 = p.Mu().hg((int)(this.period / 86400000L));
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new j();
    }
    this.period = p.Mu().Mo();
    localObject2 = this.htU.VG("settings_netstat_info");
    String str = DateFormat.format(getString(R.l.dwM, new Object[] { "" }), this.period).toString();
    ((Preference)localObject2).setTitle(getString(R.l.eaO, new Object[] { str }));
    localObject2 = this.htU.VG("settings_netstat_mobile");
    w.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic mobile out:%d in:%d", new Object[] { Integer.valueOf(((j)localObject1).gYL), Integer.valueOf(((j)localObject1).gYz) });
    ((Preference)localObject2).setSummary(h(this, ((j)localObject1).gYL + ((j)localObject1).gYz));
    localObject2 = this.htU.VG("settings_netstat_wifi");
    w.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic wifi out:%d in:%d", new Object[] { Integer.valueOf(((j)localObject1).gYM), Integer.valueOf(((j)localObject1).gYA) });
    ((Preference)localObject2).setSummary(h(this, ((j)localObject1).gYM + ((j)localObject1).gYA));
    ((NetStatPreference)this.htU.VG("settings_netstat_mobile_detail")).oGG = false;
    ((NetStatPreference)this.htU.VG("settings_netstat_wifi_detail")).oGG = true;
    this.htU.notifyDataSetChanged();
    GMTrace.o(4685406666752L, 34909);
  }
  
  private static String h(Context paramContext, long paramLong)
  {
    GMTrace.i(4685675102208L, 34911);
    paramContext = paramContext.getString(R.l.eaN, new Object[] { bg.aF(paramLong) });
    GMTrace.o(4685675102208L, 34911);
    return paramContext;
  }
  
  protected final void MP()
  {
    GMTrace.i(4685272449024L, 34908);
    oM(R.l.eaP);
    Object localObject1 = p.Mu();
    int i = (int)(bg.bQQ() / 86400000L);
    if (((l)localObject1).hf(i) == null)
    {
      localObject2 = new j();
      ((j)localObject2).gYq = i;
      ((j)localObject2).id = -1;
      ((l)localObject1).b((j)localObject2);
    }
    this.htU = this.wky;
    this.period = p.Mu().Mo();
    localObject1 = this.htU.VG("settings_netstat_info");
    Object localObject2 = new SimpleDateFormat(getString(R.l.dwM), Locale.US).format(new Date(this.period));
    ((Preference)localObject1).setTitle(getString(R.l.eaO, new Object[] { localObject2 }));
    w.i("MicroMsg.SettingsNetStatUI", "title datatime = " + (String)localObject2);
    w.d("MicroMsg.SettingsNetStatUI", "title datatime = " + (String)localObject2);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4669166321664L, 34788);
        SettingsNetStatUI.this.aLo();
        SettingsNetStatUI.this.finish();
        GMTrace.o(4669166321664L, 34788);
        return true;
      }
    });
    a(0, getString(R.l.eaQ), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4674266595328L, 34826);
        SettingsNetStatUI.a(SettingsNetStatUI.this);
        GMTrace.o(4674266595328L, 34826);
        return true;
      }
    });
    GMTrace.o(4685272449024L, 34908);
  }
  
  protected final boolean QH()
  {
    GMTrace.i(4684869795840L, 34905);
    GMTrace.o(4684869795840L, 34905);
    return false;
  }
  
  public final int QI()
  {
    GMTrace.i(4684735578112L, 34904);
    int i = R.o.ept;
    GMTrace.o(4684735578112L, 34904);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4685540884480L, 34910);
    GMTrace.o(4685540884480L, 34910);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4685004013568L, 34906);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4685004013568L, 34906);
  }
  
  public void onResume()
  {
    GMTrace.i(4685138231296L, 34907);
    super.onResume();
    beB();
    GMTrace.o(4685138231296L, 34907);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsNetStatUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */