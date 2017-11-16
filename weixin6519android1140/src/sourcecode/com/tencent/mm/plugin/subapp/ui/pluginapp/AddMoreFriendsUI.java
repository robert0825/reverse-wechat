package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bj.d;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.p.a;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceInfoCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindmobile.MobileFriendUI;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class AddMoreFriendsUI
  extends MMPreference
{
  private f htU;
  private final int quh;
  private final int qui;
  
  public AddMoreFriendsUI()
  {
    GMTrace.i(5777402101760L, 43045);
    this.quh = 4;
    this.qui = 9;
    GMTrace.o(5777402101760L, 43045);
  }
  
  protected final void MP()
  {
    GMTrace.i(5778475843584L, 43053);
    oM(R.l.cQu);
    this.htU = this.wky;
    AddFriendItemPreference localAddFriendItemPreference = new AddFriendItemPreference(this.vKB.vKW);
    localAddFriendItemPreference.setKey("find_friends_by_invite");
    localAddFriendItemPreference.setTitle(R.l.dvv);
    int i = R.k.cIX;
    localAddFriendItemPreference.Jx = i;
    Drawable localDrawable = localAddFriendItemPreference.mContext.getResources().getDrawable(i);
    if (((localDrawable == null) && (localAddFriendItemPreference.jd != null)) || ((localDrawable != null) && (localAddFriendItemPreference.jd != localDrawable)))
    {
      localAddFriendItemPreference.jd = localDrawable;
      localAddFriendItemPreference.notifyChanged();
    }
    localAddFriendItemPreference.setSummary(R.l.dvw);
    if ((bg.getInt(com.tencent.mm.k.g.ut().getValue("InviteFriendsControlFlags"), 0) & 0x4) > 0) {
      this.htU.a(localAddFriendItemPreference, 4);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5784247205888L, 43096);
        AddMoreFriendsUI.this.finish();
        GMTrace.o(5784247205888L, 43096);
        return true;
      }
    });
    GMTrace.o(5778475843584L, 43053);
  }
  
  public final int QI()
  {
    GMTrace.i(5777536319488L, 43046);
    int i = R.o.eok;
    GMTrace.o(5777536319488L, 43046);
    return i;
  }
  
  public final int Qf()
  {
    GMTrace.i(5777670537216L, 43047);
    GMTrace.o(5777670537216L, 43047);
    return 1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(5778341625856L, 43052);
    if ("find_friends_by_qrcode".equals(paramPreference.hiu))
    {
      paramf = new Intent();
      paramf.putExtra("BaseScanUI_select_scan_mode", 1);
      paramf.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
      paramf.setFlags(65536);
      com.tencent.mm.plugin.report.service.g.ork.i(11265, new Object[] { Integer.valueOf(1) });
      if ((!a.aQ(this)) && (!a.aP(this))) {
        d.b(this, "scanner", ".ui.BaseScanUI", paramf);
      }
      GMTrace.o(5778341625856L, 43052);
      return true;
    }
    if ("find_friends_by_other_way".equals(paramPreference.hiu))
    {
      if (m.Ho() != m.a.gDm)
      {
        paramf = new Intent(this, BindMContactIntroUI.class);
        paramf.putExtra("key_upload_scene", 6);
        MMWizardActivity.A(this, paramf);
        GMTrace.o(5778341625856L, 43052);
        return true;
      }
      startActivity(new Intent(this, MobileFriendUI.class));
      GMTrace.o(5778341625856L, 43052);
      return true;
    }
    if ("find_friends_by_web".equals(paramPreference.hiu))
    {
      if (com.tencent.mm.az.e.Kr())
      {
        paramf = com.tencent.mm.az.e.Kv();
        paramf.putExtra("KRightBtn", true);
        paramf.putExtra("ftsneedkeyboard", true);
        paramf.putExtra("key_load_js_without_delay", true);
        paramf.putExtra("ftsType", 1);
        paramf.putExtra("ftsbizscene", 9);
        paramf.putExtra("rawUrl", com.tencent.mm.az.e.n(com.tencent.mm.az.e.a(9, true, 0)));
        d.b(this, "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", paramf);
        paramPreference.setEnabled(false);
      }
      for (;;)
      {
        GMTrace.o(5778341625856L, 43052);
        return true;
        w.e("MicroMsg.AddMoreFriendsUI", "fts h5 template not avail");
      }
    }
    if ("find_friends_by_radar".equals(paramPreference.hiu))
    {
      d.x(this, "radar", ".ui.RadarSearchUI");
      GMTrace.o(5778341625856L, 43052);
      return true;
    }
    if ("find_friends_create_pwdgroup".equals(paramPreference.hiu))
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11140, new Object[] { Integer.valueOf(1) });
      d.x(this, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
      GMTrace.o(5778341625856L, 43052);
      return true;
    }
    if ("find_friends_by_invite".equals(paramPreference.hiu))
    {
      int i = getIntent().getIntExtra("invite_friend_scene", 4);
      com.tencent.mm.plugin.report.service.g.ork.i(14034, new Object[] { Integer.valueOf(i) });
      paramf = new Intent(this, InviteFriendsBy3rdUI.class);
      paramf.putExtra("Invite_friends", i);
      startActivity(paramf);
      GMTrace.o(5778341625856L, 43052);
      return true;
    }
    GMTrace.o(5778341625856L, 43052);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5777804754944L, 43048);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(5777804754944L, 43048);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5778207408128L, 43051);
    super.onDestroy();
    GMTrace.o(5778207408128L, 43051);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5778610061312L, 43054);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5778610061312L, 43054);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(5778073190400L, 43050);
    super.onPause();
    GMTrace.o(5778073190400L, 43050);
  }
  
  public void onResume()
  {
    GMTrace.i(5777938972672L, 43049);
    super.onResume();
    Object localObject;
    PreferenceInfoCategory localPreferenceInfoCategory;
    String str2;
    if (!d.LL("brandservice"))
    {
      this.htU.bc("find_friends_by_web", true);
      this.htU.notifyDataSetChanged();
      localObject = (AddFriendSearchPreference)this.htU.VG("find_friends_by_input");
      ((AddFriendSearchPreference)localObject).qtX = getString(R.l.dlC);
      ((AddFriendSearchPreference)localObject).qtZ = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5774851964928L, 43026);
          paramAnonymousView = new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
          d.b(AddMoreFriendsUI.this, "search", ".ui.FTSAddFriendUI", paramAnonymousView);
          GMTrace.o(5774851964928L, 43026);
        }
      };
      localPreferenceInfoCategory = (PreferenceInfoCategory)this.htU.VG("find_friends_info");
      localObject = q.zE();
      String str1 = q.zF();
      at.AR();
      str2 = an.Sa((String)c.xh().get(6, null));
      if (bg.nm(str1)) {
        break label299;
      }
      localObject = getString(R.l.dvC, new Object[] { str1 });
    }
    for (;;)
    {
      localPreferenceInfoCategory.setTitle((CharSequence)localObject);
      localPreferenceInfoCategory.vLA = R.g.aXr;
      localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5782368157696L, 43082);
          com.tencent.mm.plugin.report.service.g.ork.i(11264, new Object[] { Integer.valueOf(1) });
          paramAnonymousView = new Intent();
          paramAnonymousView.setClassName(AddMoreFriendsUI.this, "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI");
          AddMoreFriendsUI.this.vKB.vKW.startActivity(paramAnonymousView);
          GMTrace.o(5782368157696L, 43082);
        }
      };
      localPreferenceInfoCategory.wll = ((View.OnClickListener)localObject);
      localPreferenceInfoCategory.wlm = ((View.OnClickListener)localObject);
      ((AddFriendItemPreference)this.htU.VG("find_friends_create_pwdgroup")).oGR = 8;
      localObject = new Intent();
      ((Intent)localObject).setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
      ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
      sendBroadcast((Intent)localObject);
      if (this.wky != null)
      {
        localObject = this.wky.VG("find_friends_by_web");
        if (localObject != null) {
          ((Preference)localObject).setEnabled(true);
        }
      }
      GMTrace.o(5777938972672L, 43049);
      return;
      this.htU.bc("find_friends_by_web", false);
      break;
      label299:
      if (!x.Ts((String)localObject)) {
        localObject = getString(R.l.dvC, new Object[] { localObject });
      } else if (!bg.nm(str2)) {
        localObject = getString(R.l.dvD, new Object[] { an.RZ(str2) });
      } else {
        localObject = getString(R.l.dvE);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\pluginapp\AddMoreFriendsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */