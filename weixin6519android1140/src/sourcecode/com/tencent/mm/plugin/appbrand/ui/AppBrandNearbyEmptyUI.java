package com.tencent.mm.plugin.appbrand.ui;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.report.a.b;
import com.tencent.mm.plugin.appbrand.report.a.b.a;
import com.tencent.mm.plugin.appbrand.report.a.b.b;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public final class AppBrandNearbyEmptyUI
  extends DrawStatusBarActivity
{
  public AppBrandNearbyEmptyUI()
  {
    GMTrace.i(10503208304640L, 78255);
    GMTrace.o(10503208304640L, 78255);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10503342522368L, 78256);
    int i = o.g.hCW;
    GMTrace.o(10503342522368L, 78256);
    return i;
  }
  
  public final int getStatusBarColor()
  {
    GMTrace.i(10503610957824L, 78258);
    if ((Build.VERSION.SDK_INT >= 23) && (g.b(getWindow())))
    {
      GMTrace.o(10503610957824L, 78258);
      return -1052684;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      i = AppBrandLauncherUI.iAN;
      GMTrace.o(10503610957824L, 78258);
      return i;
    }
    int i = super.getStatusBarColor();
    GMTrace.o(10503610957824L, 78258);
    return i;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10503476740096L, 78257);
    super.onCreate(paramBundle);
    j.d(this.vKB.hqF, getStatusBarColor(), true);
    this.vKB.hqF.setBackgroundColor(-1052684);
    cN().cO().getCustomView().setBackgroundColor(-1052684);
    oM(o.i.cRX);
    AV(-16777216);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10526159536128L, 78426);
        AppBrandNearbyEmptyUI.this.onBackPressed();
        GMTrace.o(10526159536128L, 78426);
        return true;
      }
    }, o.e.hAv);
    paramBundle = new b();
    paramBundle.iyM = b.b.iyY;
    paramBundle.iyQ = b.a.iyS;
    paramBundle.rw();
    setResult(-1);
    GMTrace.o(10503476740096L, 78257);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandNearbyEmptyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */