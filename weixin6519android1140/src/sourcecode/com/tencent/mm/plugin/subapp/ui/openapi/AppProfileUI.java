package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.i.a;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class AppProfileUI
  extends MMPreference
  implements j.a
{
  private ae handler;
  private com.tencent.mm.ui.base.preference.f htU;
  private com.tencent.mm.pluginsdk.model.app.f lUp;
  private AppHeaderPreference.a qtH;
  
  public AppProfileUI()
  {
    GMTrace.i(5804916736000L, 43250);
    this.handler = null;
    GMTrace.o(5804916736000L, 43250);
  }
  
  private static void a(com.tencent.mm.pluginsdk.model.app.f paramf, boolean paramBoolean)
  {
    GMTrace.i(5806258913280L, 43260);
    LinkedList localLinkedList = new LinkedList();
    StringBuilder localStringBuilder = new StringBuilder().append(paramf.field_appId).append(",");
    if (paramBoolean) {}
    for (paramf = "1";; paramf = "2")
    {
      localLinkedList.add(new i.a(10165, paramf));
      at.AR();
      c.yJ().b(new com.tencent.mm.av.i(localLinkedList));
      GMTrace.o(5806258913280L, 43260);
      return;
    }
  }
  
  private void brJ()
  {
    GMTrace.i(5805856260096L, 43257);
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(5797668978688L, 43196);
        AppProfileUI.this.finish();
        GMTrace.o(5797668978688L, 43196);
      }
    };
    this.handler.sendEmptyMessageDelayed(0, 30L);
    GMTrace.o(5805856260096L, 43257);
  }
  
  private void refresh()
  {
    boolean bool2 = true;
    GMTrace.i(5805722042368L, 43256);
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(R.o.eon);
    AppHeaderPreference localAppHeaderPreference;
    AppHeaderPreference.a locala;
    boolean bool1;
    if (this.lUp.field_status == 1)
    {
      this.htU.VH("app_profile_add");
      localAppHeaderPreference = (AppHeaderPreference)this.htU.VG("app_profile_header");
      locala = this.qtH;
      if (this.lUp.field_status != 1) {
        break label132;
      }
      bool1 = true;
      label88:
      if (locala == null) {
        break label137;
      }
    }
    for (;;)
    {
      Assert.assertTrue(bool2);
      localAppHeaderPreference.qty = locala;
      localAppHeaderPreference.eWB = bool1;
      GMTrace.o(5805722042368L, 43256);
      return;
      this.htU.VH("app_profile_remove");
      break;
      label132:
      bool1 = false;
      break label88;
      label137:
      bool2 = false;
    }
  }
  
  protected final void MP()
  {
    boolean bool = true;
    GMTrace.i(5805587824640L, 43255);
    this.qtH = new AppHeaderPreference.a()
    {
      public final String brH()
      {
        GMTrace.i(5808137961472L, 43274);
        String str = g.a(AppProfileUI.this.vKB.vKW, AppProfileUI.a(AppProfileUI.this), null);
        GMTrace.o(5808137961472L, 43274);
        return str;
      }
      
      public final Bitmap brI()
      {
        GMTrace.i(5808272179200L, 43275);
        Bitmap localBitmap = g.b(AppProfileUI.a(AppProfileUI.this).field_appId, 1, a.getDensity(AppProfileUI.this));
        GMTrace.o(5808272179200L, 43275);
        return localBitmap;
      }
      
      public final String getHint()
      {
        GMTrace.i(5808540614656L, 43277);
        Object localObject2 = AppProfileUI.this.vKB.vKW;
        Object localObject1 = AppProfileUI.a(AppProfileUI.this);
        if ((localObject2 == null) || (localObject1 == null))
        {
          GMTrace.o(5808540614656L, 43277);
          return null;
        }
        localObject2 = g.dO((Context)localObject2);
        if (((String)localObject2).equalsIgnoreCase("zh_CN"))
        {
          localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription;
          GMTrace.o(5808540614656L, 43277);
          return (String)localObject1;
        }
        if ((((String)localObject2).equalsIgnoreCase("zh_TW")) || (((String)localObject2).equalsIgnoreCase("zh_HK")))
        {
          if (bg.nm(((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription_tw))
          {
            localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription;
            GMTrace.o(5808540614656L, 43277);
            return (String)localObject1;
          }
          localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription_tw;
          GMTrace.o(5808540614656L, 43277);
          return (String)localObject1;
        }
        if (((String)localObject2).equalsIgnoreCase("en"))
        {
          if (bg.nm(((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription_en))
          {
            localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription;
            GMTrace.o(5808540614656L, 43277);
            return (String)localObject1;
          }
          localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription_en;
          GMTrace.o(5808540614656L, 43277);
          return (String)localObject1;
        }
        if (bg.nm(((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription_en))
        {
          localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription;
          GMTrace.o(5808540614656L, 43277);
          return (String)localObject1;
        }
        localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appDiscription_en;
        GMTrace.o(5808540614656L, 43277);
        return (String)localObject1;
      }
      
      public final String ik(boolean paramAnonymousBoolean)
      {
        GMTrace.i(5808406396928L, 43276);
        if (paramAnonymousBoolean) {}
        for (int i = R.l.dZX;; i = R.l.eae)
        {
          String str = AppProfileUI.this.vKB.vKW.getString(i);
          GMTrace.o(5808406396928L, 43276);
          return str;
        }
      }
    };
    this.lUp = g.aP(getIntent().getStringExtra("AppProfileUI_AppId"), true);
    if (this.lUp != null) {}
    for (;;)
    {
      Assert.assertTrue("initView : appInfo does not exist", bool);
      oM(R.l.cUh);
      this.htU = this.wky;
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5811090751488L, 43296);
          AppProfileUI.this.finish();
          GMTrace.o(5811090751488L, 43296);
          return true;
        }
      });
      refresh();
      GMTrace.o(5805587824640L, 43255);
      return;
      bool = false;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(5805050953728L, 43251);
    int i = R.o.eon;
    GMTrace.o(5805050953728L, 43251);
    return i;
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(5806124695552L, 43259);
    if (paramString.equals(this.lUp.field_appId)) {
      MP();
    }
    GMTrace.o(5806124695552L, 43259);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(5805990477824L, 43258);
    paramf = paramPreference.hiu;
    w.i("MicroMsg.AppProfileUI", paramf + " item has been clicked!");
    if (paramf.equals("app_profile_add"))
    {
      this.lUp.field_status = 1;
      this.lUp.field_modifyTime = System.currentTimeMillis();
      an.aWy().a(this.lUp, new String[0]);
      refresh();
      a(this.lUp, true);
      brJ();
      GMTrace.o(5805990477824L, 43258);
      return true;
    }
    if (paramf.equals("app_profile_remove"))
    {
      this.lUp.field_status = 0;
      this.lUp.field_modifyTime = System.currentTimeMillis();
      an.aWy().a(this.lUp, new String[0]);
      refresh();
      a(this.lUp, false);
      brJ();
      GMTrace.o(5805990477824L, 43258);
      return true;
    }
    GMTrace.o(5805990477824L, 43258);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5805185171456L, 43252);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(5805185171456L, 43252);
  }
  
  protected void onPause()
  {
    GMTrace.i(5805453606912L, 43254);
    an.aWy().j(this);
    super.onPause();
    GMTrace.o(5805453606912L, 43254);
  }
  
  protected void onResume()
  {
    GMTrace.i(5805319389184L, 43253);
    super.onResume();
    an.aWy().c(this);
    GMTrace.o(5805319389184L, 43253);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\openapi\AppProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */