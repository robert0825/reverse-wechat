package com.tencent.mm.plugin.accountsync.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.friend.RecommendFriendUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class InviteRecommendChoiceUI
  extends MMPreference
{
  private com.tencent.mm.ui.base.preference.f htU;
  
  public InviteRecommendChoiceUI()
  {
    GMTrace.i(7837241573376L, 58392);
    GMTrace.o(7837241573376L, 58392);
  }
  
  protected final void MP()
  {
    GMTrace.i(7837912662016L, 58397);
    oM(R.l.dXq);
    this.htU = this.wky;
    IconPreference localIconPreference = (IconPreference)this.htU.VG("settings_invite_facebook_friends");
    this.htU.c(localIconPreference);
    localIconPreference = (IconPreference)this.htU.VG("settings_invite_qq_friends");
    if (q.zD() == 0) {
      this.htU.c(localIconPreference);
    }
    localIconPreference = (IconPreference)this.htU.VG("settings_recommend_by_mail");
    if (q.zD() == 0) {
      this.htU.c(localIconPreference);
    }
    localIconPreference = (IconPreference)this.htU.VG("settings_recommend_by_mb");
    at.AR();
    if (c.yS().CB("@t.qq.com") == null) {
      this.htU.c(localIconPreference);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7843415588864L, 58438);
        InviteRecommendChoiceUI.this.aLo();
        InviteRecommendChoiceUI.this.finish();
        GMTrace.o(7843415588864L, 58438);
        return true;
      }
    });
    GMTrace.o(7837912662016L, 58397);
  }
  
  protected final boolean QH()
  {
    GMTrace.i(7837375791104L, 58393);
    GMTrace.o(7837375791104L, 58393);
    return false;
  }
  
  public final int QI()
  {
    GMTrace.i(7837510008832L, 58394);
    int i = R.o.eoU;
    GMTrace.o(7837510008832L, 58394);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(7837778444288L, 58396);
    paramf = paramPreference.hiu;
    if (paramf.equals("settings_invite_qq_friends"))
    {
      paramf = new Intent(this, RecommendFriendUI.class);
      paramf.putExtra("recommend_type", Integer.toString(0));
      startActivity(paramf);
    }
    for (;;)
    {
      GMTrace.o(7837778444288L, 58396);
      return false;
      if (paramf.equals("settings_recommend_by_mail"))
      {
        paramf = new Intent(this, RecommendFriendUI.class);
        paramf.putExtra("recommend_type", Integer.toString(2));
        startActivity(paramf);
      }
      else if (paramf.equals("settings_recommend_by_mb"))
      {
        paramf = new Intent(this, RecommendFriendUI.class);
        paramf.putExtra("recommend_type", Integer.toString(1));
        startActivity(paramf);
      }
      else if (paramf.equals("settings_invite_mobile_friends"))
      {
        paramf = new Intent("android.intent.action.VIEW");
        int i = R.l.dDA;
        at.AR();
        paramf.putExtra("sms_body", getString(i, new Object[] { c.xh().get(2, null) }));
        paramf.setType("vnd.android-dir/mms-sms");
        if (bg.j(this, paramf)) {
          startActivity(paramf);
        } else {
          Toast.makeText(this, R.l.dWZ, 1).show();
        }
      }
      else if (paramf.equals("settings_invite_facebook_friends"))
      {
        startActivity(new Intent(this, InviteFacebookFriendsUI.class));
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7837644226560L, 58395);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(7837644226560L, 58395);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\accountsync\ui\InviteRecommendChoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */