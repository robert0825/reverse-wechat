package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.bindgooglecontact.BindGoogleContactUI;
import com.tencent.mm.ui.bindgooglecontact.GoogleFriendUI;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindmobile.MobileFriendUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class AddMoreFriendsByOtherWayUI
  extends MMPreference
{
  private f htU;
  
  public AddMoreFriendsByOtherWayUI()
  {
    GMTrace.i(5785455165440L, 43105);
    GMTrace.o(5785455165440L, 43105);
  }
  
  protected final void MP()
  {
    GMTrace.i(5786260471808L, 43111);
    oM(R.l.cQu);
    this.htU = this.wky;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5774583529472L, 43024);
        AddMoreFriendsByOtherWayUI.this.finish();
        GMTrace.o(5774583529472L, 43024);
        return true;
      }
    });
    GMTrace.o(5786260471808L, 43111);
  }
  
  public final int QI()
  {
    GMTrace.i(5785589383168L, 43106);
    int i = R.o.eol;
    GMTrace.o(5785589383168L, 43106);
    return i;
  }
  
  public final int Qf()
  {
    GMTrace.i(5785723600896L, 43107);
    GMTrace.o(5785723600896L, 43107);
    return 1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    int i = 0;
    GMTrace.i(5786126254080L, 43110);
    w.d("MicroMsg.AddMoreFriendsByOthersUI", "click %s", new Object[] { paramPreference.hiu });
    if ("find_friends_by_mobile".equals(paramPreference.hiu))
    {
      if (m.Ho() != m.a.gDm)
      {
        paramf = new Intent(this, BindMContactIntroUI.class);
        paramf.putExtra("key_upload_scene", 6);
        MMWizardActivity.A(this, paramf);
        GMTrace.o(5786126254080L, 43110);
        return true;
      }
      startActivity(new Intent(this, MobileFriendUI.class));
      GMTrace.o(5786126254080L, 43110);
      return true;
    }
    if ("find_friends_by_google_account".equals(paramPreference.hiu))
    {
      at.AR();
      if (TextUtils.isEmpty((String)c.xh().get(208903, null))) {}
      while (i == 0)
      {
        paramf = new Intent(this, BindGoogleContactUI.class);
        paramf.putExtra("enter_scene", 1);
        MMWizardActivity.A(this, paramf);
        GMTrace.o(5786126254080L, 43110);
        return true;
        i = 1;
      }
      paramf = new Intent(this, GoogleFriendUI.class);
      paramf.putExtra("enter_scene", 1);
      startActivity(paramf);
      GMTrace.o(5786126254080L, 43110);
      return true;
    }
    GMTrace.o(5786126254080L, 43110);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5785857818624L, 43108);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(5785857818624L, 43108);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5786394689536L, 43112);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5786394689536L, 43112);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(5785992036352L, 43109);
    super.onResume();
    if ((IconPreference)this.htU.VG("find_friends_by_google_account") != null) {
      if ((q.zP() & 0x800000) != 0) {
        break label80;
      }
    }
    label80:
    for (int i = 1;; i = 0)
    {
      if ((i == 0) || (!bg.Jw())) {
        this.htU.VH("find_friends_by_google_account");
      }
      this.htU.notifyDataSetChanged();
      GMTrace.o(5785992036352L, 43109);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\pluginapp\AddMoreFriendsByOtherWayUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */