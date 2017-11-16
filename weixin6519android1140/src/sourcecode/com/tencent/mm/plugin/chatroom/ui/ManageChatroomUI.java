package com.tencent.mm.plugin.chatroom.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aom;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.m;

public class ManageChatroomUI
  extends MMPreference
{
  private SharedPreferences ghC;
  private f htU;
  CheckBoxPreference jOQ;
  private String jOR;
  private String jOS;
  
  public ManageChatroomUI()
  {
    GMTrace.i(9113115295744L, 67898);
    this.ghC = null;
    GMTrace.o(9113115295744L, 67898);
  }
  
  public final int QI()
  {
    GMTrace.i(9113652166656L, 67902);
    int i = R.o.eoX;
    GMTrace.o(9113652166656L, 67902);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(9113786384384L, 67903);
    paramf = paramPreference.hiu;
    w.d("MicroMsg.ManageChatroomUI", "[onPreferenceTreeClick] key:%s", new Object[] { paramf });
    if (paramf.equals("room_transfer_room_ower"))
    {
      w.i("MicroMsg.ManageChatroomUI", "[selectNewRoomOwner] roomId:%s", new Object[] { this.jOR });
      paramf = bg.c(m.fi(this.jOR), ",");
      paramPreference = new Intent();
      paramPreference.putExtra("Block_list", com.tencent.mm.y.q.zE());
      paramPreference.putExtra("Chatroom_member_list", paramf);
      paramPreference.putExtra("frome_scene", 2);
      paramPreference.putExtra("RoomInfo_Id", this.jOR);
      paramPreference.putExtra("is_show_owner", false);
      paramPreference.putExtra("title", getString(R.l.dTJ));
      paramPreference.setClass(this, SelectMemberUI.class);
      startActivity(paramPreference);
    }
    while (!paramf.equals("allow_by_identity"))
    {
      GMTrace.o(9113786384384L, 67903);
      return false;
    }
    boolean bool = this.jOQ.isChecked();
    g.ork.a(219L, 22L, 1L, true);
    w.i("MicroMsg.ManageChatroomUI", "[selectAllowByIdentity] roomId:%s isOpen:%s", new Object[] { this.jOR, Boolean.valueOf(bool) });
    paramf = new aom();
    paramf.ufz = bg.nl(this.jOR);
    if (bool == true) {}
    for (int i = 2;; i = 0)
    {
      paramf.oqH = i;
      paramf = new e.a(66, paramf);
      at.AR();
      c.yJ().b(paramf);
      break;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9113920602112L, 67904);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(9113920602112L, 67904);
      return;
      if (paramIntent == null)
      {
        GMTrace.o(9113920602112L, 67904);
        return;
      }
      paramInt1 = paramIntent.getIntExtra("into_room_type", -1);
      w.i("MicroMsg.ManageChatroomUI", "[openVerify] roomId:%s, type:%s", new Object[] { this.jOR, Integer.valueOf(paramInt1) });
      paramIntent = new aom();
      paramIntent.ufz = bg.nl(this.jOR);
      paramIntent.oqH = paramInt1;
      paramIntent = new e.a(66, paramIntent);
      at.AR();
      c.yJ().b(paramIntent);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9113249513472L, 67899);
    super.onCreate(paramBundle);
    w.i("MicroMsg.ManageChatroomUI", "[onCreate]");
    this.jOR = getIntent().getStringExtra("RoomInfo_Id");
    this.jOS = getIntent().getStringExtra("room_owner_name");
    this.htU = this.wky;
    if (this.htU == null)
    {
      GMTrace.o(9113249513472L, 67899);
      return;
    }
    oM(R.l.dIh);
    this.jOQ = ((CheckBoxPreference)this.htU.VG("allow_by_identity"));
    this.htU.bc("select_enable_qrcode", true);
    this.htU.bc("select_into_room_type", true);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9109491417088L, 67871);
        ManageChatroomUI.this.finish();
        GMTrace.o(9109491417088L, 67871);
        return true;
      }
    });
    GMTrace.o(9113249513472L, 67899);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9113517948928L, 67901);
    super.onDestroy();
    GMTrace.o(9113517948928L, 67901);
  }
  
  protected void onResume()
  {
    boolean bool = false;
    GMTrace.i(9113383731200L, 67900);
    at.AR();
    com.tencent.mm.storage.q localq = c.yT().gC(this.jOR);
    if ((localq != null) && (this.ghC == null))
    {
      this.ghC = getSharedPreferences(getPackageName() + "_preferences", 0);
      SharedPreferences.Editor localEditor = this.ghC.edit();
      if (localq.bSr() == 2) {
        bool = true;
      }
      localEditor.putBoolean("allow_by_identity", bool).commit();
    }
    super.onResume();
    GMTrace.o(9113383731200L, 67900);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\ManageChatroomUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */