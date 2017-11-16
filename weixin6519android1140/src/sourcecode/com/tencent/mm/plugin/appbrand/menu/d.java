package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.base.n;

public final class d
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public d()
  {
    super(l.isy - 1);
    GMTrace.i(17665603141632L, 131619);
    GMTrace.o(17665603141632L, 131619);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(17665737359360L, 131620);
    if (AppBrandPerformanceManager.rZ(paramString))
    {
      paramContext = paramContext.getString(o.i.hFI);
      paramn.e(l.isy - 1, paramContext);
    }
    GMTrace.o(17665737359360L, 131620);
  }
  
  public final void a(final Context paramContext, AppBrandPageView paramAppBrandPageView, final String paramString, k paramk)
  {
    GMTrace.i(17665871577088L, 131621);
    Toast.makeText(paramContext, o.i.hFK, 0).show();
    com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17665468923904L, 131618);
        com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17666811101184L, 131628);
            if (this.isg) {}
            for (int i = o.i.hFL;; i = o.i.hFJ)
            {
              Toast.makeText(d.1.this.val$context, i, 0).show();
              GMTrace.o(17666811101184L, 131628);
              return;
            }
          }
        });
        GMTrace.o(17665468923904L, 131618);
      }
    });
    GMTrace.o(17665871577088L, 131621);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */