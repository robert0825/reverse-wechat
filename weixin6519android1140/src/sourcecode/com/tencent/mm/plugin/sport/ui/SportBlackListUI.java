package com.tencent.mm.plugin.sport.ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SportBlackListUI
  extends MMPreference
{
  private ContactListExpandPreference jNs;
  private List<String> qqW;
  private ContactListExpandPreference.a qqX;
  
  public SportBlackListUI()
  {
    GMTrace.i(16646487932928L, 124026);
    this.qqX = new ContactListExpandPreference.a()
    {
      public final void anE()
      {
        GMTrace.i(16648635416576L, 124042);
        SportBlackListUI.a(SportBlackListUI.this).bLL();
        GMTrace.o(16648635416576L, 124042);
      }
      
      public final void ma(int paramAnonymousInt)
      {
        GMTrace.i(16648232763392L, 124039);
        String str = SportBlackListUI.a(SportBlackListUI.this).zk(paramAnonymousInt);
        SportBlackListUI.b(SportBlackListUI.this).remove(str);
        SportBlackListUI.a(SportBlackListUI.this).m(null, SportBlackListUI.b(SportBlackListUI.this));
        SportBlackListUI.a(SportBlackListUI.this).refresh();
        at.AR();
        s.g(c.yK().TE(str));
        com.tencent.mm.plugin.sport.b.d.nU(40);
        GMTrace.o(16648232763392L, 124039);
      }
      
      public final void mb(int paramAnonymousInt)
      {
        GMTrace.i(16648501198848L, 124041);
        String str = SportBlackListUI.a(SportBlackListUI.this).zk(paramAnonymousInt);
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_User", str);
        com.tencent.mm.bj.d.b(SportBlackListUI.this, "profile", ".ui.ContactInfoUI", localIntent);
        GMTrace.o(16648501198848L, 124041);
      }
      
      public final void mc(int paramAnonymousInt)
      {
        GMTrace.i(16648366981120L, 124040);
        SportBlackListUI.c(SportBlackListUI.this);
        GMTrace.o(16648366981120L, 124040);
      }
    };
    GMTrace.o(16646487932928L, 124026);
  }
  
  public final int QI()
  {
    GMTrace.i(16646756368384L, 124028);
    int i = R.o.epE;
    GMTrace.o(16646756368384L, 124028);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(16646890586112L, 124029);
    GMTrace.o(16646890586112L, 124029);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(16647024803840L, 124030);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 0)
    {
      if (paramIntent == null)
      {
        GMTrace.o(16647024803840L, 124030);
        return;
      }
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (bg.nm(paramIntent))
      {
        GMTrace.o(16647024803840L, 124030);
        return;
      }
      paramIntent = bg.g(paramIntent.split(","));
      if (paramIntent == null)
      {
        GMTrace.o(16647024803840L, 124030);
        return;
      }
      this.qqW.addAll(paramIntent);
      this.jNs.m(null, this.qqW);
      this.jNs.refresh();
      paramIntent = paramIntent.iterator();
      while (paramIntent.hasNext())
      {
        String str = (String)paramIntent.next();
        at.AR();
        s.f(c.yK().TE(str));
      }
    }
    GMTrace.o(16647024803840L, 124030);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16646622150656L, 124027);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.sport.b.d.nU(39);
    if (this.qqW == null) {
      this.qqW = new ArrayList();
    }
    at.AR();
    paramBundle = c.yK().c("@werun.black.android", "", null);
    while (paramBundle.moveToNext())
    {
      String str = paramBundle.getString(0);
      this.qqW.add(str);
    }
    paramBundle.close();
    this.jNs = ((ContactListExpandPreference)this.wky.VG("black_contact_list_pref"));
    this.jNs.a(this.wky, this.jNs.hiu);
    this.jNs.kf(true).kg(true);
    this.jNs.m(null, this.qqW);
    this.jNs.a(this.qqX);
    this.jNs.setSummary(R.l.dsc);
    sq(getString(R.l.drF));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16647695892480L, 124035);
        SportBlackListUI.this.finish();
        GMTrace.o(16647695892480L, 124035);
        return false;
      }
    });
    GMTrace.o(16646622150656L, 124027);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sport\ui\SportBlackListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */