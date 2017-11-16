package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.k.g;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.shake.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;

public class ShakePersonalInfoUI
  extends MMPreference
{
  private f htU;
  
  public ShakePersonalInfoUI()
  {
    GMTrace.i(6535463829504L, 48693);
    GMTrace.o(6535463829504L, 48693);
  }
  
  protected final void MP()
  {
    GMTrace.i(6536000700416L, 48697);
    oM(R.l.ebR);
    this.htU = this.wky;
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.htU.VG("shake_item_sound");
    at.AR();
    if (com.tencent.mm.y.c.xh().get(4112, null) == null)
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(4112, Boolean.valueOf(true));
    }
    at.AR();
    localCheckBoxPreference.sdM = bg.a((Boolean)com.tencent.mm.y.c.xh().get(4112, null));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6583245340672L, 49049);
        ShakePersonalInfoUI.this.finish();
        GMTrace.o(6583245340672L, 49049);
        return true;
      }
    });
    if (!com.tencent.mm.at.c.JX()) {
      this.htU.VH("shake_item_shake_music_list");
    }
    GMTrace.o(6536000700416L, 48697);
  }
  
  public final int QI()
  {
    GMTrace.i(6535598047232L, 48694);
    int i = R.o.epC;
    GMTrace.o(6535598047232L, 48694);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(6536403353600L, 48700);
    paramf = paramPreference.hiu;
    if ("shake_item_default_bgimg".equals(paramf))
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(4110, Boolean.valueOf(true));
      h.bm(this, getResources().getString(R.l.eco));
    }
    if ("shake_item_change_bgimg".equals(paramf)) {
      k.a(this, 1, null);
    }
    if ("shake_item_sound".equals(paramf))
    {
      at.AR();
      bool = bg.a((Boolean)com.tencent.mm.y.c.xh().get(4112, null));
      at.AR();
      paramPreference = com.tencent.mm.y.c.xh();
      if (bool) {
        break label263;
      }
    }
    label263:
    for (boolean bool = true;; bool = false)
    {
      paramPreference.set(4112, Boolean.valueOf(bool));
      if ("say_hi_list_shake_title".equals(paramf))
      {
        paramPreference = new Intent(this, ShakeSayHiListUI.class);
        paramPreference.putExtra("IntentSayHiType", 1);
        startActivity(paramPreference);
      }
      if ("shake_item_histoty_list".equals(paramf))
      {
        paramPreference = new Intent(this, ShakeItemListUI.class);
        paramPreference.putExtra("_key_show_type_", 100);
        paramPreference.putExtra("_key_title_", getString(R.l.ebQ));
        startActivity(paramPreference);
      }
      if ("shake_msg_list".equals(paramf))
      {
        paramf = new Intent(this, ShakeMsgListUI.class);
        paramf.putExtra("shake_msg_from", 2);
        paramf.putExtra("shake_msg_list_title", getString(R.l.ecv));
        startActivity(paramf);
      }
      GMTrace.o(6536403353600L, 48700);
      return false;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6536537571328L, 48701);
    switch (paramInt1)
    {
    default: 
      GMTrace.o(6536537571328L, 48701);
      return;
    case 1: 
      if (paramIntent == null)
      {
        GMTrace.o(6536537571328L, 48701);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 4);
      localIntent.putExtra("CropImage_Filter", true);
      localIntent.putExtra("CropImage_DirectlyIntoFilter", true);
      StringBuilder localStringBuilder = new StringBuilder();
      at.AR();
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.y.c.yU() + "custom_shake_img_filename.jpg");
      a.hnH.a(localIntent, 2, this, paramIntent);
      GMTrace.o(6536537571328L, 48701);
      return;
    }
    if (paramIntent == null)
    {
      GMTrace.o(6536537571328L, 48701);
      return;
    }
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    at.AR();
    com.tencent.mm.y.c.xh().set(4110, Boolean.valueOf(false));
    at.AR();
    com.tencent.mm.y.c.xh().set(4111, paramIntent);
    GMTrace.o(6536537571328L, 48701);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6535732264960L, 48695);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(6535732264960L, 48695);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6535866482688L, 48696);
    a.hnI.pr();
    super.onDestroy();
    GMTrace.o(6535866482688L, 48696);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6536269135872L, 48699);
    if (paramInt == 4)
    {
      finish();
      GMTrace.o(6536269135872L, 48699);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6536269135872L, 48699);
    return bool;
  }
  
  public void onResume()
  {
    boolean bool = false;
    GMTrace.i(6536134918144L, 48698);
    super.onResume();
    if (at.AU()) {
      a.hnI.pr();
    }
    if (this.htU.VG("shake_item_shake_tv_list") == null)
    {
      w.e("MicroMsg.mmui.MMPreference", "shake_tv_list preference is null");
      GMTrace.o(6536134918144L, 48698);
      return;
    }
    if (bg.getInt(g.uu().z("ShowConfig", "showShakeTV"), 0) == 1) {
      bool = true;
    }
    w.d("MicroMsg.ConfigListDecoder", "isShowShakeTV : " + bool);
    if ((!bool) && (!r.hka)) {
      this.htU.bc("shake_item_shake_tv_list", true);
    }
    GMTrace.o(6536134918144L, 48698);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\ShakePersonalInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */