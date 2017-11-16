package com.tencent.mm.plugin.chatroom.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.chatroom.d.j;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class RoomRightUI
  extends MMPreference
  implements e
{
  private ProgressDialog htG;
  private f htU;
  private String jPL;
  private int jPM;
  
  public RoomRightUI()
  {
    GMTrace.i(9071239364608L, 67586);
    this.htG = null;
    this.jPL = "";
    this.jPM = 0;
    GMTrace.o(9071239364608L, 67586);
  }
  
  private void H(final LinkedList<String> paramLinkedList)
  {
    GMTrace.i(9072447324160L, 67595);
    if (paramLinkedList.size() > 0) {}
    String str;
    int i;
    LinkedList localLinkedList;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      str = ab.getContext().getString(R.l.deV);
      paramLinkedList.size();
      i = R.l.dTA;
      localLinkedList = new LinkedList();
      if ((!at.AU()) || (paramLinkedList == null)) {
        break;
      }
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext()) {
        localLinkedList.add(r.fs((String)localIterator.next()));
      }
    }
    h.a(this, getString(i, new Object[] { bg.c(localLinkedList, str) }), getString(R.l.cUG), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(9142643195904L, 68118);
        RoomRightUI.a(RoomRightUI.this, paramLinkedList);
        GMTrace.o(9142643195904L, 68118);
      }
    });
    GMTrace.o(9072447324160L, 67595);
  }
  
  private void anJ()
  {
    GMTrace.i(9071507800064L, 67588);
    at.AR();
    int i = bg.a((Integer)c.xh().get(135175, null), 0);
    Object localObject1 = this.htU.VG("settings_room_size");
    int j;
    if ((localObject1 != null) && (i > 0))
    {
      ((Preference)localObject1).setSummary(getResources().getQuantityString(R.j.cIB, i, new Object[] { Integer.valueOf(i) }));
      ((Preference)localObject1).setEnabled(false);
      this.htU.VG("room_right_max_tip").setTitle(getString(R.l.dTz, new Object[] { Integer.valueOf(i) }));
      at.AR();
      j = bg.a((Integer)c.xh().get(135176, null), 0);
      localObject1 = (RoomGrantPreference)this.htU.VG("settings_room_grant");
      if ((localObject1 == null) || (j > 0)) {
        break label303;
      }
      this.htU.c((Preference)localObject1);
    }
    Preference localPreference;
    Object localObject2;
    for (;;)
    {
      localPreference = this.htU.VG("room_right_tip");
      localObject2 = this.htU.VG("room_right_grant_tip");
      if (j > 0) {
        break label370;
      }
      if (localPreference != null) {
        this.htU.c(localPreference);
      }
      if (localObject2 != null) {
        this.htU.c((Preference)localObject2);
      }
      localObject2 = this.htU.VG("room_grant_to_friend");
      if (localObject2 != null) {
        this.htU.c((Preference)localObject2);
      }
      if (localObject1 != null) {
        this.htU.c((Preference)localObject1);
      }
      GMTrace.o(9071507800064L, 67588);
      return;
      if (localObject1 == null) {
        break;
      }
      this.htU.c((Preference)localObject1);
      break;
      label303:
      if (localObject1 != null)
      {
        ((RoomGrantPreference)localObject1).setEnabled(false);
        localObject2 = getString(R.l.dTB, new Object[] { Integer.valueOf(j) });
        ((RoomGrantPreference)localObject1).jPF = ((String)localObject2);
        if (((RoomGrantPreference)localObject1).jPE != null) {
          ((RoomGrantPreference)localObject1).jPE.setText((CharSequence)localObject2);
        }
      }
    }
    label370:
    localObject1 = getString(R.l.dTC, new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
    if (localPreference != null) {
      localPreference.setTitle((CharSequence)localObject1);
    }
    localObject1 = getString(R.l.dTy, new Object[] { Integer.valueOf(this.jPM) });
    if (localObject2 != null) {
      ((Preference)localObject2).setTitle((CharSequence)localObject1);
    }
    GMTrace.o(9071507800064L, 67588);
  }
  
  protected final void MP()
  {
    GMTrace.i(9072178888704L, 67593);
    this.htU = this.wky;
    oM(R.l.eaq);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9103048966144L, 67823);
        RoomRightUI.this.aLo();
        RoomRightUI.this.finish();
        GMTrace.o(9103048966144L, 67823);
        return true;
      }
    });
    GMTrace.o(9072178888704L, 67593);
  }
  
  public final int QI()
  {
    GMTrace.i(9071373582336L, 67587);
    int i = R.o.epc;
    GMTrace.o(9071373582336L, 67587);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9072581541888L, 67596);
    w.i("MicroMsg.RoomRightUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null) {
      this.htG.dismiss();
    }
    if (paramk.getType() != 339)
    {
      GMTrace.o(9072581541888L, 67596);
      return;
    }
    at.AR();
    paramString = c.yK().TE(this.jPL);
    if ((paramString == null) || ((int)paramString.fTq == 0)) {}
    for (paramString = this.jPL; (paramInt1 == 0) && (paramInt2 == 0); paramString = paramString.vk())
    {
      h.b(this, getString(R.l.dTb, new Object[] { paramString }), getString(R.l.cUG), true);
      if (this.htU != null)
      {
        anJ();
        this.htU.notifyDataSetChanged();
      }
      GMTrace.o(9072581541888L, 67596);
      return;
    }
    if (paramInt2 == 65285)
    {
      h.b(this, getString(R.l.dSZ, new Object[] { paramString, Integer.valueOf(this.jPM) }), getString(R.l.cUG), true);
      GMTrace.o(9072581541888L, 67596);
      return;
    }
    if (paramInt2 == -44)
    {
      paramString = new LinkedList();
      paramString.add(this.jPL);
      H(paramString);
      GMTrace.o(9072581541888L, 67596);
      return;
    }
    if (paramInt2 == -22)
    {
      h.b(this, getString(R.l.dTa, new Object[] { paramString }), getString(R.l.cUG), true);
      GMTrace.o(9072581541888L, 67596);
      return;
    }
    Toast.makeText(this, "err :" + paramInt1 + " ," + paramInt2, 0).show();
    GMTrace.o(9072581541888L, 67596);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(9071910453248L, 67591);
    if (paramPreference.hiu.equals("room_grant_to_friend"))
    {
      paramf = new Intent();
      paramf.setClassName(ab.getPackageName(), ab.getPackageName() + ".ui.contact.SelectContactUI");
      paramf.putExtra("Contact_GroupFilter_Type", "@all.contact.without.chatroom");
      paramf.putExtra("List_Type", 4);
      paramf.putExtra("select_contact_pick_result", true);
      paramPreference = new LinkedList();
      paramPreference.add("officialaccounts");
      paramf.putExtra("Block_list", bg.c(paramPreference, ","));
      paramf.putExtra("Add_SendCard", true);
      paramf.putExtra("is_multi_select", false);
      startActivityForResult(paramf, 1);
    }
    GMTrace.o(9071910453248L, 67591);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(9072313106432L, 67594);
    w.i("MicroMsg.RoomRightUI", "onAcvityResult requestCode: %d", new Object[] { Integer.valueOf(paramInt1) });
    if ((paramInt2 != -1) || (paramIntent == null))
    {
      GMTrace.o(9072313106432L, 67594);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(9072313106432L, 67594);
      return;
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      w.d("MicroMsg.RoomRightUI", "pick user %s", new Object[] { paramIntent });
      if (bg.nm(paramIntent))
      {
        GMTrace.o(9072313106432L, 67594);
        return;
      }
      this.jPL = paramIntent;
      paramIntent = this.jPL;
      at.AR();
      Object localObject = c.yK().TE(paramIntent);
      localObject = getString(R.l.dSY, new Object[] { ((a)localObject).vk(), Integer.valueOf(this.jPM) });
      h.a(this.vKB.vKW, (String)localObject, "", new DialogInterface.OnClickListener()
      {
        public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9136603398144L, 68073);
          paramAnonymousDialogInterface = new j(paramIntent);
          RoomRightUI localRoomRightUI1 = RoomRightUI.this;
          RoomRightUI localRoomRightUI2 = RoomRightUI.this;
          RoomRightUI.this.getString(R.l.cUG);
          RoomRightUI.a(localRoomRightUI1, h.a(localRoomRightUI2, "", true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(9107209715712L, 67854);
              at.wS().c(paramAnonymousDialogInterface);
              GMTrace.o(9107209715712L, 67854);
            }
          }));
          at.wS().a(paramAnonymousDialogInterface, 0);
          GMTrace.o(9136603398144L, 68073);
        }
      }, null);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9071642017792L, 67589);
    super.onCreate(paramBundle);
    at.AR();
    this.jPM = bg.a((Integer)c.xh().get(135177, null), 0);
    at.wS().a(339, this);
    at.wS().a(30, this);
    at.AR();
    c.xh().set(135184, Boolean.valueOf(false));
    MP();
    GMTrace.o(9071642017792L, 67589);
  }
  
  public void onDestroy()
  {
    GMTrace.i(9072044670976L, 67592);
    super.onDestroy();
    at.wS().b(339, this);
    at.wS().b(30, this);
    GMTrace.o(9072044670976L, 67592);
  }
  
  public void onResume()
  {
    GMTrace.i(9071776235520L, 67590);
    super.onResume();
    anJ();
    this.htU.notifyDataSetChanged();
    GMTrace.o(9071776235520L, 67590);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\RoomRightUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */