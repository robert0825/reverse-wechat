package com.tencent.mm.plugin.chatroom.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.ui.preference.SignaturePreference;
import com.tencent.mm.pluginsdk.wallet.e;
import com.tencent.mm.protocal.c.aoo;
import com.tencent.mm.protocal.c.aop;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.e.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.s;

@Deprecated
public class RoomInfoDetailUI
  extends MMPreference
  implements j.a
{
  private boolean eMr;
  private f htU;
  private x iBi;
  private String jNA;
  private boolean jNE;
  private String jNS;
  private SignaturePreference jNo;
  private CheckBoxPreference jNt;
  private int jPG;
  private CheckBoxPreference jPH;
  private CheckBoxPreference jPI;
  private boolean jqh;
  
  public RoomInfoDetailUI()
  {
    GMTrace.i(9091640459264L, 67738);
    this.jqh = false;
    this.jNE = false;
    GMTrace.o(9091640459264L, 67738);
  }
  
  private void anI()
  {
    GMTrace.i(9092982636544L, 67748);
    if ((this.iBi != null) && (this.jNo != null))
    {
      Object localObject2 = anq();
      Object localObject1 = localObject2;
      if (bg.nm((String)localObject2)) {
        localObject1 = com.tencent.mm.y.q.zG();
      }
      if (!bg.nm((String)localObject1))
      {
        SignaturePreference localSignaturePreference = this.jNo;
        localObject2 = localObject1;
        if (((String)localObject1).length() <= 0) {
          localObject2 = getString(R.l.eaz);
        }
        localSignaturePreference.setSummary(com.tencent.mm.pluginsdk.ui.d.h.a(this, (CharSequence)localObject2));
        GMTrace.o(9092982636544L, 67748);
        return;
      }
      this.jNo.setSummary("");
    }
    GMTrace.o(9092982636544L, 67748);
  }
  
  private String anq()
  {
    GMTrace.i(9092848418816L, 67747);
    at.AR();
    Object localObject = com.tencent.mm.y.c.yT().gC(this.jNA);
    if (localObject == null)
    {
      GMTrace.o(9092848418816L, 67747);
      return "";
    }
    localObject = ((com.tencent.mm.storage.q)localObject).field_selfDisplayName;
    GMTrace.o(9092848418816L, 67747);
    return (String)localObject;
  }
  
  private void any()
  {
    boolean bool = true;
    GMTrace.i(9093116854272L, 67749);
    if (!this.eMr)
    {
      GMTrace.o(9093116854272L, 67749);
      return;
    }
    Object localObject = getSharedPreferences(this.jNS, 0);
    if (this.jPG == 0)
    {
      Ba(0);
      if (this.jNt != null)
      {
        this.jNt.sdM = true;
        ((SharedPreferences)localObject).edit().putBoolean("room_msg_notify", true).commit();
      }
      if (this.jPI != null) {
        this.jPI.sdM = vd();
      }
      localObject = this.htU;
      if (this.jPG != 1) {
        break label184;
      }
    }
    for (;;)
    {
      ((f)localObject).bc("room_show_msg_count", bool);
      GMTrace.o(9093116854272L, 67749);
      return;
      if (this.jPG != 1) {
        break;
      }
      Ba(8);
      if (this.jNt == null) {
        break;
      }
      this.jNt.sdM = false;
      ((SharedPreferences)localObject).edit().putBoolean("room_msg_notify", false).commit();
      break;
      label184:
      bool = false;
    }
  }
  
  private boolean vd()
  {
    GMTrace.i(9092714201088L, 67746);
    at.AR();
    if ((com.tencent.mm.y.c.yT().gC(this.jNA).field_chatroomdataflag & 0x2) == 0)
    {
      GMTrace.o(9092714201088L, 67746);
      return true;
    }
    GMTrace.o(9092714201088L, 67746);
    return false;
  }
  
  protected final void MP()
  {
    GMTrace.i(9092043112448L, 67741);
    oM(R.l.dUe);
    this.htU = this.wky;
    this.jNS = (getPackageName() + "_preferences");
    this.eMr = getIntent().getBooleanExtra("Is_Chatroom", true);
    this.jNA = getIntent().getStringExtra("RoomInfo_Id");
    if (this.jNA == null) {
      this.jNA = getIntent().getStringExtra("Single_Chat_Talker");
    }
    at.AR();
    this.iBi = com.tencent.mm.y.c.yK().TE(this.jNA);
    if (this.eMr)
    {
      this.jPG = this.iBi.fji;
      this.jNo = ((SignaturePreference)this.htU.VG("room_name"));
      this.jNt = ((CheckBoxPreference)this.htU.VG("room_msg_notify"));
      this.jPI = ((CheckBoxPreference)this.htU.VG("room_show_msg_count"));
      this.jPH = ((CheckBoxPreference)this.htU.VG("room_msg_show_username"));
      this.jPI.wlc = false;
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9099156652032L, 67794);
          RoomInfoDetailUI.this.finish();
          GMTrace.o(9099156652032L, 67794);
          return true;
        }
      });
      GMTrace.o(9092043112448L, 67741);
      return;
      this.jPG = 1;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(9092311547904L, 67743);
    int i = R.o.epd;
    GMTrace.o(9092311547904L, 67743);
    return i;
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(9092177330176L, 67742);
    GMTrace.o(9092177330176L, 67742);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(9092445765632L, 67744);
    paramPreference = paramPreference.hiu;
    w.d("MicroMsg.RoomInfoDetailUI", "click key : %s", new Object[] { paramPreference });
    String str;
    if (paramPreference.equals("room_name"))
    {
      paramf = new Intent();
      paramf.setClass(this, e.c.class);
      paramf.putExtra("Contact_mode_name_type", 4);
      str = com.tencent.mm.y.q.zE();
      paramf.putExtra("Contact_Nick", anq());
      paramf.putExtra("Contact_User", str);
      paramf.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
      paramf.putExtra("MMActivity.OverrideExitAnimation", R.a.aLE);
      this.vKB.vKW.startActivityForResult(paramf, 2);
    }
    int i;
    if (paramPreference.equals("room_msg_show_username"))
    {
      at.AR();
      paramf = com.tencent.mm.y.c.yT().gC(this.jNA);
      if (!paramf.bSt())
      {
        bool1 = true;
        paramf.kK(bool1);
        this.jNE = true;
      }
    }
    else
    {
      if (paramPreference.equals("room_msg_notify"))
      {
        if (this.jPG != 0) {
          break label763;
        }
        i = 1;
        label195:
        this.jPG = i;
        at.AR();
        com.tencent.mm.y.c.yJ().b(new k(this.jNA, this.jPG));
        at.AR();
        this.iBi = com.tencent.mm.y.c.yK().TE(this.jNA);
        this.iBi.ds(this.jPG);
        at.AR();
        com.tencent.mm.y.c.yK().a(this.jNA, this.iBi);
        any();
        at.AR();
        this.iBi = com.tencent.mm.y.c.yK().TE(this.jNA);
        this.htU.notifyDataSetChanged();
      }
      if (paramPreference.equals("room_set_chatting_background"))
      {
        paramf = new Intent();
        paramf.putExtra("isApplyToAll", false);
        paramf.putExtra("username", this.iBi.field_username);
        com.tencent.mm.bj.d.b(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", paramf, 1);
      }
      if (paramPreference.equals("room_clear_chatting_history"))
      {
        if (!this.eMr) {
          break label768;
        }
        paramf = getString(R.l.dwD);
        label391:
        str = getString(R.l.dSC);
        h.c local2 = new h.c()
        {
          public final void hQ(int paramAnonymousInt)
          {
            GMTrace.i(9075400114176L, 67617);
            switch (paramAnonymousInt)
            {
            default: 
              GMTrace.o(9075400114176L, 67617);
              return;
            }
            RoomInfoDetailUI.a(RoomInfoDetailUI.this, false);
            Object localObject = RoomInfoDetailUI.this;
            RoomInfoDetailUI.this.getString(R.l.cUG);
            final r localr = com.tencent.mm.ui.base.h.a((Context)localObject, RoomInfoDetailUI.this.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(9086137532416L, 67697);
                RoomInfoDetailUI.a(RoomInfoDetailUI.this, true);
                GMTrace.o(9086137532416L, 67697);
              }
            });
            if (com.tencent.mm.y.l.eZ(RoomInfoDetailUI.a(RoomInfoDetailUI.this).field_username)) {
              com.tencent.mm.plugin.chatroom.a.hnI.bK(RoomInfoDetailUI.a(RoomInfoDetailUI.this).field_username);
            }
            if (!RoomInfoDetailUI.b(RoomInfoDetailUI.this)) {}
            for (localObject = e.PT(RoomInfoDetailUI.a(RoomInfoDetailUI.this).field_username);; localObject = null)
            {
              if (!bg.nm((String)localObject))
              {
                localr.dismiss();
                com.tencent.mm.ui.base.h.a(RoomInfoDetailUI.this, false, RoomInfoDetailUI.this.getString(R.l.ejt, new Object[] { localObject }), null, RoomInfoDetailUI.this.getString(R.l.dBn), RoomInfoDetailUI.this.getString(R.l.dij), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(19553912356864L, 145688);
                    RoomInfoDetailUI.a(RoomInfoDetailUI.this, true);
                    paramAnonymous2DialogInterface = new Intent();
                    paramAnonymous2DialogInterface.putExtra("Chat_User", RoomInfoDetailUI.a(RoomInfoDetailUI.this).field_username);
                    paramAnonymous2DialogInterface.addFlags(67108864);
                    com.tencent.mm.bj.d.a(RoomInfoDetailUI.this, ".ui.chatting.En_5b8fbb1e", paramAnonymous2DialogInterface);
                    GMTrace.o(19553912356864L, 145688);
                  }
                }, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(19554180792320L, 145690);
                    localr.show();
                    RoomInfoDetailUI.a(RoomInfoDetailUI.this, false);
                    RoomInfoDetailUI.a(RoomInfoDetailUI.this, localr);
                    GMTrace.o(19554180792320L, 145690);
                  }
                }, -1, R.e.aMJ);
                GMTrace.o(9075400114176L, 67617);
                return;
              }
              RoomInfoDetailUI.a(RoomInfoDetailUI.this, localr);
              break;
            }
          }
        };
        com.tencent.mm.ui.base.h.a(this, paramf, new String[] { str }, null, local2);
      }
      if (paramPreference.equals("room_placed_to_the_top"))
      {
        paramf = getSharedPreferences(this.jNS, 0);
        if (this.iBi != null)
        {
          at.AR();
          if (!com.tencent.mm.y.c.yP().TV(this.iBi.field_username)) {
            break label793;
          }
          s.o(this.iBi.field_username, true);
          label488:
          paramf = paramf.edit();
          at.AR();
          paramf.putBoolean("room_placed_to_the_top", com.tencent.mm.y.c.yP().TV(this.iBi.field_username)).commit();
        }
      }
      if ("room_show_msg_count".equals(paramPreference))
      {
        boolean bool2 = vd();
        w.d("MicroMsg.RoomInfoDetailUI", "old value undeliver[%B], now set show msg count[%B]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool2) });
        if (bool2) {
          break label807;
        }
        bool1 = true;
        label581:
        at.AR();
        paramf = com.tencent.mm.y.c.yT().gC(this.jNA);
        if (!bool1) {
          break label813;
        }
        paramf.eF(0);
        label608:
        w.d("MicroMsg.RoomInfoDetailUI", "update show msg count[%B]", new Object[] { Boolean.valueOf(bool1) });
        at.AR();
        com.tencent.mm.y.c.yT().c(paramf, new String[0]);
        paramf = com.tencent.mm.y.q.zE();
        paramPreference = new aop();
        paramPreference.ufz = this.jNA;
        paramPreference.jhi = paramf;
        paramPreference.uEm = 2;
        if (!bool1) {
          break label821;
        }
        i = 2;
        label684:
        paramPreference.oqH = i;
        at.AR();
        com.tencent.mm.y.c.yJ().b(new e.a(49, paramPreference));
        if (this.jPI != null)
        {
          paramf = this.jPI;
          if (bool2) {
            break label826;
          }
        }
      }
    }
    label763:
    label768:
    label793:
    label807:
    label813:
    label821:
    label826:
    for (boolean bool1 = true;; bool1 = false)
    {
      paramf.sdM = bool1;
      this.htU.notifyDataSetChanged();
      GMTrace.o(9092445765632L, 67744);
      return false;
      bool1 = false;
      break;
      i = 0;
      break label195;
      paramf = getString(R.l.dwC, new Object[] { this.iBi.vk() });
      break label391;
      s.n(this.iBi.field_username, true);
      break label488;
      bool1 = false;
      break label581;
      paramf.eF(2);
      break label608;
      i = 1;
      break label684;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9093251072000L, 67750);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(9093251072000L, 67750);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(9093251072000L, 67750);
      return;
      if (paramInt2 == -1)
      {
        setResult(-1);
        finish();
        GMTrace.o(9093251072000L, 67750);
        return;
        if (paramIntent == null)
        {
          GMTrace.o(9093251072000L, 67750);
          return;
        }
        String str1 = bg.aq(paramIntent.getStringExtra("Contact_Nick"), "");
        if (!bg.nm(str1))
        {
          String str2 = com.tencent.mm.y.q.zE();
          at.AR();
          com.tencent.mm.storage.q localq = com.tencent.mm.y.c.yT().gC(this.jNA);
          paramIntent = localq;
          if (localq == null) {
            paramIntent = new com.tencent.mm.storage.q();
          }
          paramIntent.field_chatroomname = this.jNA;
          paramIntent.field_selfDisplayName = str1;
          at.AR();
          com.tencent.mm.y.c.yT().c(paramIntent, new String[0]);
          paramIntent = new aoo();
          paramIntent.ufz = this.jNA;
          paramIntent.jhi = str2;
          paramIntent.ubU = bg.nl(str1);
          at.AR();
          com.tencent.mm.y.c.yJ().b(new e.a(48, paramIntent));
          anI();
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9091774676992L, 67739);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(9091774676992L, 67739);
  }
  
  public void onPause()
  {
    int i = 1;
    GMTrace.i(9092579983360L, 67745);
    super.onPause();
    Object localObject;
    if (this.jNE)
    {
      at.AR();
      localObject = com.tencent.mm.y.c.yT().gC(this.jNA);
      at.AR();
      com.tencent.mm.y.c.yT().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
      String str = com.tencent.mm.y.q.zE();
      boolean bool = ((com.tencent.mm.storage.q)localObject).bSt();
      localObject = new aop();
      ((aop)localObject).ufz = this.jNA;
      ((aop)localObject).jhi = str;
      ((aop)localObject).uEm = 1;
      if (!bool) {
        break label142;
      }
    }
    for (;;)
    {
      ((aop)localObject).oqH = i;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(49, (com.tencent.mm.bm.a)localObject));
      GMTrace.o(9092579983360L, 67745);
      return;
      label142:
      i = 0;
    }
  }
  
  public void onResume()
  {
    GMTrace.i(9091908894720L, 67740);
    super.onResume();
    any();
    anI();
    SharedPreferences localSharedPreferences;
    if ((this.iBi != null) && (this.jPH != null))
    {
      at.AR();
      com.tencent.mm.storage.q localq = com.tencent.mm.y.c.yT().gD(this.jNA);
      localSharedPreferences = getSharedPreferences(this.jNS, 0);
      if (!localq.bSt()) {
        break label117;
      }
      this.jPH.sdM = true;
      localSharedPreferences.edit().putBoolean("room_msg_show_username", true).commit();
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(9091908894720L, 67740);
      return;
      label117:
      this.jPH.sdM = false;
      localSharedPreferences.edit().putBoolean("room_msg_show_username", false).commit();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\RoomInfoDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */