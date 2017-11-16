package com.tencent.mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.n;

public final class f
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public f()
  {
    super(l.ist - 1);
    GMTrace.i(15560934948864L, 115938);
    GMTrace.o(15560934948864L, 115938);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(17667079536640L, 131630);
    if (b.bPq()) {
      paramn.a(this.isD, paramContext.getResources().getColor(o.c.aOM), paramContext.getString(o.i.hEm));
    }
    GMTrace.o(17667079536640L, 131630);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15561203384320L, 115940);
    c.a(paramString, c.c.hys);
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).finish();
      com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramAppBrandPageView.ivj.hZo, 10, "", bg.Pu(), 1, 0);
    }
    GMTrace.o(15561203384320L, 115940);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */