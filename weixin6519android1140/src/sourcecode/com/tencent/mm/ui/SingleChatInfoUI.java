package com.tencent.mm.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelmulti.q;
import com.tencent.mm.modelmulti.r;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.appbrand.ui.widget.AppBrandLoadIconPreference;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.l;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.contact.e;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.s;
import java.util.LinkedList;
import java.util.List;

public class SingleChatInfoUI
  extends MMPreference
  implements p.l
{
  private static boolean jqh;
  private String eDs;
  private SharedPreferences ghC;
  private ae handler;
  private f htU;
  private x iBi;
  private boolean jGN;
  private int jNG;
  private boolean jNI;
  private com.tencent.mm.pluginsdk.ui.d jNJ;
  boolean jNK;
  private String jNS;
  private ContactListExpandPreference jNs;
  private CheckBoxPreference jNt;
  private CheckBoxPreference jNv;
  private AppBrandLoadIconPreference jNy;
  
  static
  {
    GMTrace.i(3469662486528L, 25851);
    jqh = false;
    GMTrace.o(3469662486528L, 25851);
  }
  
  public SingleChatInfoUI()
  {
    GMTrace.i(3467246567424L, 25833);
    this.handler = new ae(Looper.getMainLooper());
    this.ghC = null;
    this.jNG = -1;
    this.jNI = false;
    this.jNJ = new com.tencent.mm.pluginsdk.ui.d(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2832262496256L, 21102);
        GMTrace.o(2832262496256L, 21102);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(2832128278528L, 21101);
        GMTrace.o(2832128278528L, 21101);
      }
    });
    this.jNK = false;
    this.jNS = "";
    GMTrace.o(3467246567424L, 25833);
  }
  
  private void a(final ProgressDialog paramProgressDialog)
  {
    GMTrace.i(19243735187456L, 143377);
    bc.a(this.iBi.field_username, new bc.a()
    {
      public final void Bk()
      {
        GMTrace.i(19244943147008L, 143386);
        if (paramProgressDialog != null) {
          paramProgressDialog.dismiss();
        }
        GMTrace.o(19244943147008L, 143386);
      }
      
      public final boolean Bl()
      {
        GMTrace.i(19244808929280L, 143385);
        boolean bool = SingleChatInfoUI.bYk();
        GMTrace.o(19244808929280L, 143385);
        return bool;
      }
    });
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19242258792448L, 143366);
        q.JF().gE(7);
        GMTrace.o(19242258792448L, 143366);
      }
    });
    GMTrace.o(19243735187456L, 143377);
  }
  
  private void any()
  {
    GMTrace.i(3468454526976L, 25842);
    if (this.ghC == null) {
      this.ghC = getSharedPreferences(getPackageName() + "_preferences", 0);
    }
    this.jGN = this.iBi.vc();
    if (this.jGN)
    {
      Ba(0);
      if (this.jNt != null) {
        this.ghC.edit().putBoolean("room_notify_new_msg", true).commit();
      }
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(3468454526976L, 25842);
      return;
      Ba(8);
      if (this.jNt != null) {
        this.ghC.edit().putBoolean("room_notify_new_msg", false).commit();
      }
    }
  }
  
  public final void E(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(3468588744704L, 25843);
    if ((paramString1.equals(this.eDs)) && (this.jNs != null)) {
      this.jNs.notifyChanged();
    }
    GMTrace.o(3468588744704L, 25843);
  }
  
  protected final void MP()
  {
    GMTrace.i(3468186091520L, 25840);
    this.htU = this.wky;
    sq(getString(R.l.dUf));
    this.jNs = ((ContactListExpandPreference)this.htU.VG("roominfo_contact_anchor"));
    this.jNs.a(this.htU, this.jNs.hiu);
    this.jNs.kf(true).kg(false);
    if ((this.iBi != null) && (this.iBi.field_deleteFlag == 1)) {
      this.jNs.kf(false);
    }
    this.jNt = ((CheckBoxPreference)this.htU.VG("room_notify_new_msg"));
    this.jNv = ((CheckBoxPreference)this.htU.VG("room_placed_to_the_top"));
    if (this.ghC == null) {
      this.ghC = getSharedPreferences(getPackageName() + "_preferences", 0);
    }
    Object localObject;
    if (this.iBi != null)
    {
      localObject = this.ghC.edit();
      at.AR();
      ((SharedPreferences.Editor)localObject).putBoolean("room_placed_to_the_top", com.tencent.mm.y.c.yP().TV(this.iBi.field_username)).commit();
      this.jGN = this.iBi.vc();
      this.ghC.edit().putBoolean("room_notify_new_msg", this.jGN).commit();
    }
    for (;;)
    {
      at.AR();
      this.jNG = com.tencent.mm.y.c.yM().Cs(this.eDs);
      this.jNy = ((AppBrandLoadIconPreference)this.htU.VG("chat_app_brand"));
      this.jNy.iGc = this.eDs;
      this.htU.notifyDataSetChanged();
      if (this.jNs != null)
      {
        localObject = new LinkedList();
        ((List)localObject).add(this.eDs);
        this.jNs.m(this.eDs, (List)localObject);
        this.mqO.setOnScrollListener(this.jNJ);
        this.jNs.a(this.jNJ);
        this.jNs.a(new ContactListExpandPreference.a()
        {
          public final void anE()
          {
            GMTrace.i(2831725625344L, 21098);
            if (SingleChatInfoUI.b(SingleChatInfoUI.this) != null) {
              SingleChatInfoUI.b(SingleChatInfoUI.this).bLL();
            }
            GMTrace.o(2831725625344L, 21098);
          }
          
          public final void ma(int paramAnonymousInt)
          {
            GMTrace.i(2831457189888L, 21096);
            GMTrace.o(2831457189888L, 21096);
          }
          
          public final void mb(int paramAnonymousInt)
          {
            GMTrace.i(2831591407616L, 21097);
            String str = SingleChatInfoUI.b(SingleChatInfoUI.this).zk(paramAnonymousInt);
            Object localObject2 = t.nl(SingleChatInfoUI.b(SingleChatInfoUI.this).zm(paramAnonymousInt));
            Object localObject1 = localObject2;
            if (t.nm((String)localObject2))
            {
              at.AR();
              bb localbb = com.tencent.mm.y.c.yL().CC(str);
              localObject1 = localObject2;
              if (localbb != null)
              {
                localObject1 = localObject2;
                if (!t.nm(localbb.field_encryptUsername)) {
                  localObject1 = localbb.field_conRemark;
                }
              }
            }
            if (t.nm(str))
            {
              GMTrace.o(2831591407616L, 21097);
              return;
            }
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("Contact_User", str);
            ((Intent)localObject2).putExtra("Contact_RemarkName", (String)localObject1);
            ((Intent)localObject2).putExtra("Contact_Nick", t.nl(SingleChatInfoUI.b(SingleChatInfoUI.this).zl(paramAnonymousInt)));
            ((Intent)localObject2).putExtra("Contact_RoomMember", true);
            at.AR();
            localObject1 = com.tencent.mm.y.c.yK().TE(str);
            if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).fTq > 0) && (com.tencent.mm.l.a.eE(((af)localObject1).field_type))) {
              e.a((Intent)localObject2, str);
            }
            ((Intent)localObject2).putExtra("Kdel_from", 0);
            com.tencent.mm.bj.d.b(SingleChatInfoUI.this, "profile", ".ui.ContactInfoUI", (Intent)localObject2, 0);
            GMTrace.o(2831591407616L, 21097);
          }
          
          public final void mc(int paramAnonymousInt)
          {
            GMTrace.i(2831859843072L, 21099);
            SingleChatInfoUI.c(SingleChatInfoUI.this);
            GMTrace.o(2831859843072L, 21099);
          }
        });
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2880044007424L, 21458);
          SingleChatInfoUI.this.finish();
          GMTrace.o(2880044007424L, 21458);
          return true;
        }
      });
      GMTrace.o(3468186091520L, 25840);
      return;
      this.ghC.edit().putBoolean("room_notify_new_msg", false).commit();
      this.jGN = false;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(3468051873792L, 25839);
    int i = R.o.epf;
    GMTrace.o(3468051873792L, 25839);
    return i;
  }
  
  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    GMTrace.i(3468722962432L, 25844);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, paramSharedPreferences);
    GMTrace.o(3468722962432L, 25844);
    return paramSharedPreferences;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(3468320309248L, 25841);
    paramf = paramPreference.hiu;
    boolean bool;
    if (paramf.equals("room_notify_new_msg")) {
      if (!this.jGN)
      {
        bool = true;
        this.jGN = bool;
        if (!this.jGN) {
          break label155;
        }
        s.n(this.iBi);
        label51:
        at.AR();
        this.iBi = com.tencent.mm.y.c.yK().TE(this.eDs);
        if (this.ghC == null) {
          this.ghC = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        this.ghC.edit().putBoolean("room_notify_new_msg", this.jGN).commit();
        any();
      }
    }
    for (;;)
    {
      GMTrace.o(3468320309248L, 25841);
      return false;
      bool = false;
      break;
      label155:
      s.o(this.iBi);
      break label51;
      if (paramf.equals("room_placed_to_the_top"))
      {
        paramf = getSharedPreferences(this.jNS, 0);
        if (this.iBi != null)
        {
          at.AR();
          if (com.tencent.mm.y.c.yP().TV(this.iBi.field_username)) {
            s.o(this.iBi.field_username, true);
          }
          for (;;)
          {
            paramf = paramf.edit();
            at.AR();
            paramf.putBoolean("room_placed_to_the_top", com.tencent.mm.y.c.yP().TV(this.iBi.field_username)).commit();
            break;
            s.n(this.iBi.field_username, true);
          }
        }
      }
      else if (paramf.equals("room_set_chatting_background"))
      {
        paramf = new Intent();
        paramf.putExtra("isApplyToAll", false);
        paramf.putExtra("username", this.iBi.field_username);
        com.tencent.mm.bj.d.b(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", paramf, 2);
      }
      else if (paramf.equals("room_search_chatting_content"))
      {
        paramf = new Intent();
        paramf.putExtra("detail_username", this.eDs);
        com.tencent.mm.bj.d.b(this, "search", ".ui.FTSChattingTalkerUI", paramf);
        com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      }
      else if (paramf.equals("room_clear_chatting_history"))
      {
        paramf = getString(R.l.dwC, new Object[] { this.iBi.vk() });
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, paramf, "", getString(R.l.cSl), getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19222394568704L, 143218);
            SingleChatInfoUI.g(SingleChatInfoUI.this);
            GMTrace.o(19222394568704L, 143218);
          }
        }, null, R.e.aMJ);
      }
      else if (paramf.equals("room_expose"))
      {
        paramf = new Intent();
        paramf.putExtra("k_username", this.eDs);
        paramf.putExtra("showShare", false);
        paramf.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(39) }));
        com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
      }
      else if (paramf.equals("chat_app_brand"))
      {
        paramf = new Intent();
        paramf.putExtra("Chat_User", this.eDs);
        com.tencent.mm.bj.d.a(this, ".ui.chatting.gallery.AppBrandHistoryListUI", paramf);
        com.tencent.mm.plugin.report.service.g.ork.a(219L, 25L, 1L, true);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(3467917656064L, 25838);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(3467917656064L, 25838);
      return;
    }
    switch (paramInt1)
    {
    default: 
      GMTrace.o(3467917656064L, 25838);
      return;
    }
    if (paramInt2 == -1)
    {
      finish();
      GMTrace.o(3467917656064L, 25838);
      return;
    }
    GMTrace.o(3467917656064L, 25838);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3467380785152L, 25834);
    super.onCreate(paramBundle);
    if (p.a.tlV != null) {
      p.a.tlV.a(this);
    }
    this.eDs = getIntent().getStringExtra("Single_Chat_Talker");
    this.jNI = getIntent().getBooleanExtra("fromChatting", false);
    at.AR();
    this.iBi = com.tencent.mm.y.c.yK().TE(this.eDs);
    this.jNS = (getPackageName() + "_preferences");
    MP();
    GMTrace.o(3467380785152L, 25834);
  }
  
  public void onDestroy()
  {
    GMTrace.i(3467783438336L, 25837);
    com.tencent.mm.ui.h.a.dismiss();
    if (p.a.tlV != null) {
      p.a.tlV.b(this);
    }
    if (this.jNy != null) {
      AppBrandLoadIconPreference.onDestroy();
    }
    super.onDestroy();
    GMTrace.o(3467783438336L, 25837);
  }
  
  public void onPause()
  {
    GMTrace.i(3467649220608L, 25836);
    super.onPause();
    GMTrace.o(3467649220608L, 25836);
  }
  
  public void onResume()
  {
    GMTrace.i(3467515002880L, 25835);
    any();
    Object localObject;
    if (this.jNs != null)
    {
      localObject = new LinkedList();
      ((List)localObject).add(this.eDs);
      this.jNs.m(this.eDs, (List)localObject);
    }
    this.htU.notifyDataSetChanged();
    super.onResume();
    if (!this.jNK)
    {
      localObject = getIntent().getStringExtra("need_matte_high_light_item");
      if (!t.nm((String)localObject))
      {
        final int i = this.htU.VI((String)localObject);
        setSelection(i - 3);
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3476104937472L, 25899);
            View localView = ((com.tencent.mm.ui.base.preference.a)SingleChatInfoUI.a(SingleChatInfoUI.this)).a(i, SingleChatInfoUI.this.mqO);
            if (localView != null) {
              com.tencent.mm.ui.h.a.b(SingleChatInfoUI.this.vKB.vKW, localView);
            }
            GMTrace.o(3476104937472L, 25899);
          }
        }, 10L);
      }
      this.jNK = true;
    }
    GMTrace.o(3467515002880L, 25835);
  }
  
  private static final class a
    implements DialogInterface.OnCancelListener
  {
    public a()
    {
      GMTrace.i(2087488323584L, 15553);
      GMTrace.o(2087488323584L, 15553);
    }
    
    public final void onCancel(DialogInterface paramDialogInterface)
    {
      GMTrace.i(2087622541312L, 15554);
      SingleChatInfoUI.lp(true);
      GMTrace.o(2087622541312L, 15554);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\SingleChatInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */