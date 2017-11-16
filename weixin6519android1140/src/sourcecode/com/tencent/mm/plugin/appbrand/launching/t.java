package com.tencent.mm.plugin.appbrand.launching;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.f.a;
import junit.framework.Assert;

public final class t
  implements c
{
  public t()
  {
    GMTrace.i(15445507702784L, 115078);
    GMTrace.o(15445507702784L, 115078);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(19675782053888L, 146596);
    AppBrandLaunchProxyUI.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, null, null);
    GMTrace.o(19675782053888L, 146596);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject, String paramString4)
  {
    GMTrace.i(19675916271616L, 146597);
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    switch (paramAppBrandStatObject.scene)
    {
    }
    for (;;)
    {
      localAppBrandLaunchReferrer.appId = paramString4;
      AppBrandLaunchProxyUI.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, localAppBrandLaunchReferrer, null);
      GMTrace.o(19675916271616L, 146597);
      return;
      localAppBrandLaunchReferrer.hQF = 4;
      continue;
      localAppBrandLaunchReferrer.hQF = 2;
      continue;
      localAppBrandLaunchReferrer.hQF = 5;
    }
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    GMTrace.i(15445641920512L, 115079);
    if (bg.nm(paramString3))
    {
      GMTrace.o(15445641920512L, 115079);
      return;
    }
    if ((bg.nm(paramString3)) || (bg.nm(paramString2)))
    {
      w.e("MicroMsg.WeAppLauncher", "targetAppId %s referrerAppId %s, Null Or Nil");
      GMTrace.o(15445641920512L, 115079);
      return;
    }
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1055;
    localAppBrandStatObject.eAv = (p.encode(bg.nl(paramString1)) + ":" + paramString2);
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    localAppBrandLaunchReferrer.appId = paramString2;
    localAppBrandLaunchReferrer.hQF = 2;
    localAppBrandLaunchReferrer.url = paramString1;
    AppBrandLaunchProxyUI.a(paramContext, null, paramString3, paramString4, paramInt, -1, localAppBrandStatObject, localAppBrandLaunchReferrer, null);
    Assert.assertTrue(true);
    GMTrace.o(15445641920512L, 115079);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, f.a parama)
  {
    GMTrace.i(19676050489344L, 146598);
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1036;
    localAppBrandStatObject.eAv = (bg.nl(parama.appId) + ":" + bg.nl(p.encode(parama.url)));
    if (paramBoolean) {}
    for (int i = 2;; i = 1)
    {
      localAppBrandStatObject.eVi = i;
      if (paramBoolean) {
        paramString2 = paramString1;
      }
      localAppBrandStatObject.eVj = paramString2;
      paramString2 = null;
      if (!bg.nm(parama.gkX))
      {
        paramString2 = new LaunchParamsOptional();
        paramString2.gqY = paramString1;
        paramString2.gqZ = parama.gkX;
      }
      paramString1 = new AppBrandLaunchReferrer();
      paramString1.hQF = 4;
      paramString1.appId = parama.appId;
      AppBrandLaunchProxyUI.a(paramContext, parama.gkR, parama.gkS, parama.gkQ, parama.gkY, parama.gkZ, localAppBrandStatObject, paramString1, paramString2);
      GMTrace.o(19676050489344L, 146598);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */