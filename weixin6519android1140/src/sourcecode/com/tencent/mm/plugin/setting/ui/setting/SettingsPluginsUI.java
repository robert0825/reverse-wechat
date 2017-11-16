package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bj.d;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.PluginTextPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SettingsPluginsUI
  extends MMPreference
{
  private static int oJG;
  private static HashMap<String, Integer> oJH;
  private f htU;
  private boolean oJI;
  
  static
  {
    GMTrace.i(4712787083264L, 35113);
    oJG = 1;
    oJH = new HashMap() {};
    GMTrace.o(4712787083264L, 35113);
  }
  
  public SettingsPluginsUI()
  {
    GMTrace.i(4711713341440L, 35105);
    GMTrace.o(4711713341440L, 35105);
  }
  
  protected final void MP()
  {
    GMTrace.i(4712250212352L, 35109);
    oM(R.l.dZR);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4599641538560L, 34270);
        SettingsPluginsUI.this.aLo();
        SettingsPluginsUI.this.finish();
        GMTrace.o(4599641538560L, 34270);
        return true;
      }
    });
    GMTrace.o(4712250212352L, 35109);
  }
  
  public final int QI()
  {
    GMTrace.i(4711847559168L, 35106);
    int i = R.o.epx;
    GMTrace.o(4711847559168L, 35106);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4712652865536L, 35112);
    String str = paramPreference.hiu;
    if ((str != null) && (str.equals("display_in_addr_book")))
    {
      boolean bool = ((CheckBoxPreference)paramf.VG(str)).isChecked();
      at.AR();
      c.xh().set(35, Boolean.valueOf(bool));
      GMTrace.o(4712652865536L, 35112);
      return true;
    }
    if ((paramPreference instanceof PluginPreference))
    {
      paramf = ((PluginPreference)paramPreference).oGN;
      if (("feedsapp".equals(paramf)) && (this.oJI))
      {
        at.AR();
        c.xh().set(-2046825369, Boolean.valueOf(false));
      }
      d.b(this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramf));
      com.tencent.mm.plugin.report.service.g.ork.i(12846, new Object[] { oJH.get(paramf) });
      w.i("MicroMsg.SettingsPluginsUI", "click id:%s, kvID:%d", new Object[] { paramf, oJH.get(paramf) });
      GMTrace.o(4712652865536L, 35112);
      return true;
    }
    GMTrace.o(4712652865536L, 35112);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4711981776896L, 35107);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    MP();
    com.tencent.mm.plugin.report.service.g.ork.i(14098, new Object[] { Integer.valueOf(5) });
    com.tencent.mm.plugin.report.service.g.ork.i(12846, new Object[] { Integer.valueOf(oJG) });
    ak.a.gmX.K("gh_43f2581f6fd6", "");
    GMTrace.o(4711981776896L, 35107);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4712115994624L, 35108);
    super.onDestroy();
    GMTrace.o(4712115994624L, 35108);
  }
  
  public void onPause()
  {
    GMTrace.i(4712518647808L, 35111);
    super.onPause();
    GMTrace.o(4712518647808L, 35111);
  }
  
  public void onResume()
  {
    int j = 0;
    GMTrace.i(4712384430080L, 35110);
    super.onResume();
    this.htU.removeAll();
    Object localObject1 = new PreferenceSmallCategory(this);
    this.htU.a((Preference)localObject1);
    localObject1 = new ArrayList();
    Object localObject4 = new ArrayList();
    boolean bool2 = q.Al();
    boolean bool1 = bool2;
    label160:
    label174:
    label225:
    label239:
    label291:
    label305:
    label357:
    label371:
    label423:
    label437:
    label480:
    label494:
    label546:
    label560:
    label613:
    label627:
    Object localObject3;
    if (!bool2)
    {
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("BindQQSwitch"), 1) == 1) {
        bool1 = true;
      }
    }
    else
    {
      if (!bool1) {
        w.i("MicroMsg.SettingsPluginsUI", "summerqq BindQQSwitch off");
      }
      if ((bool1) && (d.LL("qqmail")))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).Gl("qqmail"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
          if ((q.zP() & 0x1) != 0) {
            break label1007;
          }
          i = 1;
          if (i == 0) {
            break label1012;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      if (d.LL("bottle"))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).Gl("floatbottle"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
          if ((q.zP() & 0x40) != 0) {
            break label1031;
          }
          i = 1;
          if (i == 0) {
            break label1036;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      if (d.LL("nearby"))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).Gl("lbsapp"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
          if ((q.zP() & 0x200) != 0) {
            break label1049;
          }
          i = 1;
          if (i == 0) {
            break label1054;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      if (d.LL("shake"))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).Gl("shakeapp"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
          if ((q.zP() & 0x100) != 0) {
            break label1067;
          }
          i = 1;
          if (i == 0) {
            break label1072;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      if (d.LL("readerapp"))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).Gl("newsapp"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
          if ((q.zP() & 0x80000) != 0) {
            break label1085;
          }
          i = 1;
          if (i == 0) {
            break label1090;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      localObject2 = new PluginPreference(this);
      if (((PluginPreference)localObject2).Gl("facebookapp"))
      {
        ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
        if ((q.zP() & 0x2000) != 0) {
          break label1109;
        }
        i = 1;
        if (i == 0) {
          break label1114;
        }
        ((List)localObject1).add(localObject2);
      }
      if (d.LL("masssend"))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).Gl("masssendapp"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
          if ((q.zP() & 0x10000) != 0) {
            break label1133;
          }
          i = 1;
          if (i == 0) {
            break label1138;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      d.bNA();
      if (!com.tencent.mm.ap.b.Js())
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).Gl("voiceinputapp"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
          if ((q.zP() & 0x2000000) != 0) {
            break label1151;
          }
          i = 1;
          if (i == 0) {
            break label1156;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      localObject2 = new PluginPreference(this);
      localObject3 = getString(R.l.dsd);
      ((PluginPreference)localObject2).oGN = "gh_43f2581f6fd6";
      ((PluginPreference)localObject2).oGO = ((String)localObject3);
      ((PluginPreference)localObject2).setKey("settings_plugins_list_#" + ((PluginPreference)localObject2).oGN);
      ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
      if (!((com.tencent.mm.plugin.sport.b.b)h.h(com.tencent.mm.plugin.sport.b.b.class)).bqR()) {
        break label1169;
      }
      ((List)localObject1).add(localObject2);
      label723:
      localObject2 = com.tencent.mm.k.g.ut().getValue("LinkedinPluginClose");
      if ((bg.nm((String)localObject2)) || (Integer.valueOf((String)localObject2).intValue() == 0))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).Gl("linkedinplugin"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).oGO);
          if ((q.zP() & 0x1000000) != 0) {
            break label1182;
          }
        }
      }
    }
    String str;
    label1007:
    label1012:
    label1031:
    label1036:
    label1049:
    label1054:
    label1067:
    label1072:
    label1085:
    label1090:
    label1109:
    label1114:
    label1133:
    label1138:
    label1151:
    label1156:
    label1169:
    label1182:
    for (int i = 1;; i = 0)
    {
      at.AR();
      if (!bg.nm((String)c.xh().get(286721, null))) {
        j = 1;
      }
      if ((i != 0) && (j != 0)) {
        ((List)localObject1).add(localObject2);
      }
      if (!((List)localObject1).isEmpty())
      {
        localObject2 = new PluginTextPreference(this);
        ((PluginTextPreference)localObject2).wkU = R.k.cOE;
        ((PluginTextPreference)localObject2).Cu(R.l.dZY);
        this.htU.a((Preference)localObject2);
      }
      at.AR();
      str = (String)c.xh().get(w.a.vxS, "");
      Iterator localIterator = ((List)localObject1).iterator();
      for (localObject1 = null; localIterator.hasNext(); localObject1 = localObject2)
      {
        localObject3 = (PluginPreference)localIterator.next();
        ((PluginPreference)localObject3).kXa = 255;
        localObject2 = localObject1;
        if (str.contains(((PluginPreference)localObject3).oGN))
        {
          ((PluginPreference)localObject3).oGS = true;
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localObject3;
          }
        }
        this.htU.a((Preference)localObject3);
      }
      bool1 = false;
      break;
      i = 0;
      break label160;
      if (!com.tencent.mm.ap.b.Ju()) {
        break label174;
      }
      ((List)localObject4).add(localObject2);
      break label174;
      i = 0;
      break label225;
      ((List)localObject4).add(localObject2);
      break label239;
      i = 0;
      break label291;
      ((List)localObject4).add(localObject2);
      break label305;
      i = 0;
      break label357;
      ((List)localObject4).add(localObject2);
      break label371;
      i = 0;
      break label423;
      if (!com.tencent.mm.ap.b.Ju()) {
        break label437;
      }
      ((List)localObject4).add(localObject2);
      break label437;
      i = 0;
      break label480;
      if (!com.tencent.mm.ap.b.Jt()) {
        break label494;
      }
      ((List)localObject4).add(localObject2);
      break label494;
      i = 0;
      break label546;
      ((List)localObject4).add(localObject2);
      break label560;
      i = 0;
      break label613;
      ((List)localObject4).add(localObject2);
      break label627;
      ((List)localObject4).add(localObject2);
      break label723;
    }
    Object localObject2 = new PreferenceSmallCategory(this);
    this.htU.a((Preference)localObject2);
    localObject2 = new PluginTextPreference(this);
    ((PluginTextPreference)localObject2).wkU = R.k.cOF;
    ((PluginTextPreference)localObject2).Cu(R.l.eaf);
    this.htU.a((Preference)localObject2);
    if (((List)localObject4).isEmpty())
    {
      localObject2 = new PluginEmptyTextPreference(this, R.l.dZS);
      this.htU.a((Preference)localObject2);
    }
    localObject4 = ((List)localObject4).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = (PluginPreference)((Iterator)localObject4).next();
      ((PluginPreference)localObject3).kXa = 136;
      localObject2 = localObject1;
      if (str.contains(((PluginPreference)localObject3).oGN))
      {
        ((PluginPreference)localObject3).oGS = true;
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = localObject3;
        }
      }
      this.htU.a((Preference)localObject3);
      localObject1 = localObject2;
    }
    localObject2 = new PreferenceSmallCategory(this);
    this.htU.a((Preference)localObject2);
    if (localObject1 != null) {
      setSelection(this.htU.VI(((Preference)localObject1).hiu));
    }
    GMTrace.o(4712384430080L, 35110);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsPluginsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */