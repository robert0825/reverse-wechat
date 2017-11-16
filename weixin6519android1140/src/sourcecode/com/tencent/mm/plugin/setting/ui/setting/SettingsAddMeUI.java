package com.tencent.mm.plugin.setting.ui.setting;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
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
import com.tencent.mm.ui.base.preference.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsAddMeUI
  extends MMPreference
{
  private f htU;
  private long jZy;
  private HashMap<Integer, Integer> jqC;
  private int oIF;
  private int status;
  
  public SettingsAddMeUI()
  {
    GMTrace.i(4721377017856L, 35177);
    this.jqC = new HashMap();
    GMTrace.o(4721377017856L, 35177);
  }
  
  private void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(15698105466880L, 116960);
    w.d("MicroMsg.SettingsAddMeUI", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status |= paramInt1;
      if (!paramBoolean) {
        break label107;
      }
    }
    label107:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      this.jqC.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      GMTrace.o(15698105466880L, 116960);
      return;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  private void b(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(4722316541952L, 35184);
    w.d("MicroMsg.SettingsAddMeUI", "switch ext change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.jZy |= paramInt1;
      if (!paramBoolean) {
        break label109;
      }
    }
    label109:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      this.jqC.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      GMTrace.o(4722316541952L, 35184);
      return;
      this.jZy &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  private boolean sJ(int paramInt)
  {
    GMTrace.i(4722584977408L, 35186);
    if ((this.status & paramInt) != 0)
    {
      GMTrace.o(4722584977408L, 35186);
      return true;
    }
    GMTrace.o(4722584977408L, 35186);
    return false;
  }
  
  protected final void MP()
  {
    GMTrace.i(4722450759680L, 35185);
    oM(R.l.dYw);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4593735958528L, 34226);
        SettingsAddMeUI.this.aLo();
        SettingsAddMeUI.this.finish();
        GMTrace.o(4593735958528L, 34226);
        return true;
      }
    });
    w.d("MicroMsg.SettingsAddMeUI", "plug:" + this.oIF + ",status:" + this.status + ",extstatus:" + this.jZy);
    at.AR();
    Object localObject1 = (Integer)c.xh().get(9, null);
    Object localObject2 = (CheckBoxPreference)this.htU.VG("settings_find_me_by_QQ");
    ((Preference)localObject2).wlc = false;
    boolean bool;
    if ((localObject1 != null) && (((Integer)localObject1).intValue() != 0)) {
      if ((!sJ(8)) || (!sJ(16)))
      {
        bool = true;
        ((CheckBoxPreference)localObject2).sdM = bool;
        label148:
        at.AR();
        localObject1 = (String)c.xh().get(6, null);
        localObject2 = (CheckBoxPreference)this.htU.VG("settings_find_me_by_mobile");
        ((Preference)localObject2).wlc = false;
        if ((localObject1 == null) || (((String)localObject1).length() <= 0)) {
          break label480;
        }
        if (sJ(512)) {
          break label475;
        }
        bool = true;
        label208:
        ((CheckBoxPreference)localObject2).sdM = bool;
        label213:
        localObject1 = (CheckBoxPreference)this.htU.VG("settings_find_me_by_weixin");
        ((Preference)localObject1).wlc = false;
        if ((this.oIF & 0x200) == 0) {
          break label494;
        }
        ((CheckBoxPreference)localObject1).sdM = false;
        label249:
        localObject1 = (CheckBoxPreference)this.htU.VG("settings_find_me_by_google");
        if (sJ(524288)) {
          break label502;
        }
        bool = true;
        label275:
        ((CheckBoxPreference)localObject1).sdM = bool;
        ((Preference)localObject1).wlc = false;
        at.AR();
        localObject2 = (String)c.xh().get(208903, null);
        if ((!bg.Jw()) || (TextUtils.isEmpty((CharSequence)localObject2))) {
          this.htU.c((Preference)localObject1);
        }
        localObject1 = (CheckBoxPreference)this.htU.VG("settings_add_me_by_chatroom");
        ((Preference)localObject1).wlc = false;
        if ((this.jZy & 1L) == 0L) {
          break label507;
        }
        ((CheckBoxPreference)localObject1).sdM = false;
        label362:
        localObject1 = (CheckBoxPreference)this.htU.VG("settings_add_me_by_qrcode");
        ((Preference)localObject1).wlc = false;
        if ((this.jZy & 0x2) == 0L) {
          break label515;
        }
        ((CheckBoxPreference)localObject1).sdM = false;
        label400:
        localObject1 = (CheckBoxPreference)this.htU.VG("settings_add_me_by_namecard");
        ((Preference)localObject1).wlc = false;
        if ((this.jZy & 0x4) == 0L) {
          break label523;
        }
      }
    }
    label475:
    label480:
    label494:
    label502:
    label507:
    label515:
    label523:
    for (((CheckBoxPreference)localObject1).sdM = false;; ((CheckBoxPreference)localObject1).sdM = true)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(4722450759680L, 35185);
      return;
      bool = false;
      break;
      this.htU.c((Preference)localObject2);
      break label148;
      bool = false;
      break label208;
      this.htU.c((Preference)localObject2);
      break label213;
      ((CheckBoxPreference)localObject1).sdM = true;
      break label249;
      bool = false;
      break label275;
      ((CheckBoxPreference)localObject1).sdM = true;
      break label362;
      ((CheckBoxPreference)localObject1).sdM = true;
      break label400;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(4721645453312L, 35179);
    int i = R.o.epk;
    GMTrace.o(4721645453312L, 35179);
    return i;
  }
  
  public final h a(SharedPreferences paramSharedPreferences)
  {
    GMTrace.i(4721511235584L, 35178);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, paramSharedPreferences);
    GMTrace.o(4721511235584L, 35178);
    return paramSharedPreferences;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool1 = false;
    GMTrace.i(4722048106496L, 35182);
    paramPreference = paramPreference.hiu;
    w.i("MicroMsg.SettingsAddMeUI", paramPreference + " item has been clicked!");
    if (paramPreference.equals("settings_find_me_by_QQ"))
    {
      if (!((CheckBoxPreference)paramf.VG("settings_find_me_by_QQ")).isChecked()) {}
      for (bool1 = true;; bool1 = false)
      {
        a(bool1, 8, 2);
        a(bool1, 16, 3);
        GMTrace.o(4722048106496L, 35182);
        return true;
      }
    }
    if (paramPreference.equals("settings_find_me_by_weixin"))
    {
      if (!((CheckBoxPreference)paramf.VG("settings_find_me_by_weixin")).isChecked()) {
        bool1 = true;
      }
      w.d("MicroMsg.SettingsAddMeUI", "switch plug change : open = " + bool1 + " item value = 512 functionId = 25");
      if (bool1)
      {
        this.oIF |= 0x200;
        if (!bool1) {
          break label242;
        }
      }
      label242:
      for (int i = 1;; i = 2)
      {
        this.jqC.put(Integer.valueOf(25), Integer.valueOf(i));
        GMTrace.o(4722048106496L, 35182);
        return true;
        this.oIF &= 0xFDFF;
        break;
      }
    }
    if (paramPreference.equals("settings_find_me_by_mobile"))
    {
      bool1 = bool2;
      if (!((CheckBoxPreference)paramf.VG("settings_find_me_by_mobile")).isChecked()) {
        bool1 = true;
      }
      a(bool1, 512, 8);
      GMTrace.o(4722048106496L, 35182);
      return true;
    }
    if (paramPreference.equals("settings_find_me_by_google"))
    {
      bool1 = bool3;
      if (!((CheckBoxPreference)paramf.VG("settings_find_me_by_google")).isChecked()) {
        bool1 = true;
      }
      a(bool1, 524288, 30);
      GMTrace.o(4722048106496L, 35182);
      return true;
    }
    if (paramPreference.equals("settings_add_me_by_chatroom"))
    {
      bool1 = bool4;
      if (!((CheckBoxPreference)paramf.VG("settings_add_me_by_chatroom")).isChecked()) {
        bool1 = true;
      }
      b(bool1, 1, 38);
      GMTrace.o(4722048106496L, 35182);
      return true;
    }
    if (paramPreference.equals("settings_add_me_by_qrcode"))
    {
      bool1 = bool5;
      if (!((CheckBoxPreference)paramf.VG("settings_add_me_by_qrcode")).isChecked()) {
        bool1 = true;
      }
      b(bool1, 2, 39);
      GMTrace.o(4722048106496L, 35182);
      return true;
    }
    if (paramPreference.equals("settings_add_me_by_namecard"))
    {
      bool1 = bool6;
      if (!((CheckBoxPreference)paramf.VG("settings_add_me_by_namecard")).isChecked()) {
        bool1 = true;
      }
      b(bool1, 4, 40);
      GMTrace.o(4722048106496L, 35182);
      return true;
    }
    GMTrace.o(4722048106496L, 35182);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4721779671040L, 35180);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    this.oIF = q.zK();
    this.status = q.zI();
    this.jZy = q.zJ();
    MP();
    GMTrace.o(4721779671040L, 35180);
  }
  
  public void onPause()
  {
    GMTrace.i(4721913888768L, 35181);
    super.onPause();
    w.d("MicroMsg.SettingsAddMeUI", "plug:" + this.oIF + ",status:" + this.status + ",extstatus:" + this.jZy);
    at.AR();
    c.xh().set(7, Integer.valueOf(this.status));
    at.AR();
    c.xh().set(40, Integer.valueOf(this.oIF));
    at.AR();
    c.xh().set(147457, Long.valueOf(this.jZy));
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
      c.yJ().b(new e.a(23, (com.tencent.mm.bm.a)localObject));
      w.d("MicroMsg.SettingsAddMeUI", "switch  " + i + " " + j);
    }
    this.jqC.clear();
    GMTrace.o(4721913888768L, 35181);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsAddMeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */