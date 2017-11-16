package com.tencent.mm.plugin.bottle.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.bk;

public class BottleWizardStep2
  extends MMPreference
{
  private c jqH;
  
  public BottleWizardStep2()
  {
    GMTrace.i(7649873625088L, 56996);
    GMTrace.o(7649873625088L, 56996);
  }
  
  private void goBack()
  {
    GMTrace.i(7650678931456L, 57002);
    Intent localIntent = new Intent().setClass(this, BottleWizardStep1.class);
    localIntent.addFlags(67108864);
    startActivity(localIntent);
    aLo();
    finish();
    GMTrace.o(7650678931456L, 57002);
  }
  
  protected final void MP()
  {
    GMTrace.i(7650410496000L, 57000);
    oM(R.l.dZI);
    this.jqH = new c(this, this.wky);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7633901715456L, 56877);
        BottleWizardStep2.a(BottleWizardStep2.this);
        GMTrace.o(7633901715456L, 56877);
        return true;
      }
    });
    a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7633096409088L, 56871);
        c.ahF();
        paramAnonymousMenuItem = bk.BE();
        if (bg.a(Integer.valueOf(paramAnonymousMenuItem.fja), 0) <= 0)
        {
          h.b(BottleWizardStep2.this.vKB.vKW, BottleWizardStep2.this.getString(R.l.dbo), BottleWizardStep2.this.getString(R.l.cUG), true);
          GMTrace.o(7633096409088L, 56871);
          return true;
        }
        if (bg.nm(paramAnonymousMenuItem.getProvince()))
        {
          h.b(BottleWizardStep2.this.vKB.vKW, BottleWizardStep2.this.getString(R.l.dbn), BottleWizardStep2.this.getString(R.l.cUG), true);
          GMTrace.o(7633096409088L, 56871);
          return true;
        }
        paramAnonymousMenuItem = new Intent().setClass(BottleWizardStep2.this, BottleBeachUI.class);
        paramAnonymousMenuItem.addFlags(67108864);
        BottleWizardStep2.this.startActivity(paramAnonymousMenuItem);
        BottleWizardStep2.this.finish();
        GMTrace.o(7633096409088L, 56871);
        return true;
      }
    });
    GMTrace.o(7650410496000L, 57000);
  }
  
  public final int QI()
  {
    GMTrace.i(7650007842816L, 56997);
    int i = R.o.eor;
    GMTrace.o(7650007842816L, 56997);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(7651081584640L, 57005);
    paramf = paramPreference.hiu;
    boolean bool;
    if (paramf.equals("settings_district"))
    {
      bool = this.jqH.ahH();
      GMTrace.o(7651081584640L, 57005);
      return bool;
    }
    if (paramf.equals("settings_signature"))
    {
      bool = this.jqH.ahG();
      GMTrace.o(7651081584640L, 57005);
      return bool;
    }
    GMTrace.o(7651081584640L, 57005);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7650142060544L, 56998);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(7650142060544L, 56998);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7650276278272L, 56999);
    super.onDestroy();
    GMTrace.o(7650276278272L, 56999);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7650544713728L, 57001);
    if (paramInt == 4)
    {
      goBack();
      GMTrace.o(7650544713728L, 57001);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7650544713728L, 57001);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(7650947366912L, 57004);
    super.onPause();
    GMTrace.o(7650947366912L, 57004);
  }
  
  public void onResume()
  {
    GMTrace.i(7650813149184L, 57003);
    super.onResume();
    this.jqH.update();
    GMTrace.o(7650813149184L, 57003);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\BottleWizardStep2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */