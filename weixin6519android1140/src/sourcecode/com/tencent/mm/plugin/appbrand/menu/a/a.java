package com.tencent.mm.plugin.appbrand.menu.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.menu.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.ui.base.n;

public abstract class a
{
  public int isD;
  
  public a(int paramInt)
  {
    GMTrace.i(15560129642496L, 115932);
    this.isD = paramInt;
    GMTrace.o(15560129642496L, 115932);
  }
  
  public abstract void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString);
  
  public abstract void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */