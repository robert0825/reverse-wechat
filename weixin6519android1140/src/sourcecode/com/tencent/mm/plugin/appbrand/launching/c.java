package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements Runnable
{
  private final String appId;
  private final int hKC;
  private final String hQy;
  private final int hZb;
  private final a ipD;
  private AppBrandStatObject ipE;
  private final String username;
  
  c(AppBrandLaunchProxyUI.LaunchParcel paramLaunchParcel, a parama)
  {
    GMTrace.i(17329790386176L, 129117);
    this.ipD = parama;
    this.hZb = paramLaunchParcel.hZb;
    this.appId = paramLaunchParcel.appId;
    this.username = paramLaunchParcel.username;
    this.hKC = paramLaunchParcel.version;
    this.ipE = paramLaunchParcel.ipx;
    this.hQy = paramLaunchParcel.hQy;
    GMTrace.o(17329790386176L, 129117);
  }
  
  public c(String paramString, int paramInt, AppBrandStatObject paramAppBrandStatObject, a parama)
  {
    GMTrace.i(17329924603904L, 129118);
    this.ipD = parama;
    this.appId = paramString;
    this.hZb = paramInt;
    this.username = null;
    this.hKC = 0;
    this.ipE = paramAppBrandStatObject;
    this.hQy = null;
    GMTrace.o(17329924603904L, 129118);
  }
  
  private void onError()
  {
    GMTrace.i(17330193039360L, 129120);
    if (this.ipD != null) {
      this.ipD.b(null, null);
    }
    GMTrace.o(17330193039360L, 129120);
  }
  
  public final void run()
  {
    GMTrace.i(17330058821632L, 129119);
    int i;
    for (;;)
    {
      try
      {
        localObject1 = this.username;
        localObject2 = this.appId;
        int j = this.hZb;
        int k = this.hKC;
        if (this.ipE == null)
        {
          i = 0;
          localObject1 = new q((String)localObject1, (String)localObject2, j, k, i, this.hQy).Yw();
        }
      }
      catch (Exception localException1)
      {
        Object localObject2;
        localObject1 = null;
      }
      try
      {
        localObject2 = (WxaAttributes)((Pair)localObject1).first;
        if (localObject2 != null) {
          break;
        }
        w.i("MicroMsg.AppBrandPreLaunchProcess", "onGetWxaAttr null return");
        onError();
        GMTrace.o(17330058821632L, 129119);
        return;
      }
      catch (Exception localException2)
      {
        Object localObject3;
        String str;
        Object localObject4;
        Context localContext;
        for (;;) {}
      }
      i = this.ipE.scene;
      continue;
      w.printErrStackTrace("MicroMsg.AppBrandPreLaunchProcess", localException1, "get attr ", new Object[0]);
      localObject3 = null;
    }
    str = ((WxaAttributes)localObject3).field_appId;
    localObject4 = new k(str);
    if (g.ut().getInt("WeAppForbiddenSwitch", 0) == 1)
    {
      w.i("MicroMsg.AppBrand.PreLaunchCheckForOversea", "startApp, WeAppForbiddenSwitch == 1, go webview, appId %s", new Object[] { ((k)localObject4).appId });
      localObject4 = new Intent().putExtra("rawUrl", l.of(((k)localObject4).appId)).putExtra("forceHideShare", true);
      localContext = ab.getContext();
      if (!(localContext instanceof Activity)) {
        ((Intent)localObject4).addFlags(268435456);
      }
      com.tencent.mm.bj.d.b(localContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject4);
      i = 1;
      if (i == 0) {
        break label272;
      }
      i = 1;
    }
    for (;;)
    {
      if (i == 0) {
        break label612;
      }
      onError();
      GMTrace.o(17330058821632L, 129119);
      return;
      i = 0;
      break;
      label272:
      if (2 == this.hZb)
      {
        boolean bool = com.tencent.mm.plugin.appbrand.task.d.sn(str);
        i = new s(str, r.an(str, 2), r.an(str, 10001), bool).Vk();
        w.i("MicroMsg.AppBrand.PrepareStepOpBan", "checkDemoInfo, appId %s, ret %d, ignoreCgiError %b", new Object[] { str, Integer.valueOf(i), Boolean.valueOf(bool) });
        localObject4 = s.a.iV(i);
        if (localObject4 == null) {
          switch (i)
          {
          default: 
            if (bool) {
              i = 1;
            }
            break;
          }
        }
        for (;;)
        {
          if (i != 0) {
            break label555;
          }
          i = 1;
          break;
          m.iU(o.i.hEx);
          a.x(str, 13, 3);
          i = 0;
          continue;
          m.iU(o.i.hEy);
          a.x(str, 12, 3);
          i = 0;
          continue;
          m.rb(ab.getResources().getString(o.i.hGl, new Object[] { Integer.valueOf(3), Integer.valueOf(i) }));
          i = 0;
          continue;
          if (bool) {
            i = 1;
          } else {
            switch (r.1.iqD[localObject4.ordinal()])
            {
            default: 
              m.iU(o.i.hEv);
              a.x(str, 13, 3);
              i = 0;
              break;
            case 1: 
              i = 1;
              break;
            case 2: 
              m.iU(o.i.hEw);
              a.x(str, 13, 3);
              i = 0;
            }
          }
        }
      }
      label555:
      if (this.hZb == 0)
      {
        if (1 == ((WxaAttributes)localObject3).UF().hRY)
        {
          AppBrand404PageUI.show(o.i.hFy);
          a.x(((WxaAttributes)localObject3).field_appId, 14, 1);
        }
        for (i = 0;; i = 1)
        {
          if (i != 0) {
            break label607;
          }
          i = 1;
          break;
        }
      }
      label607:
      i = 0;
    }
    label612:
    com.tencent.mm.plugin.appbrand.config.e.Ux();
    localObject3 = com.tencent.mm.plugin.appbrand.config.e.a((WxaAttributes)localObject3);
    ((AppBrandInitConfig)localObject3).hKs = this.hZb;
    ((AppBrandInitConfig)localObject3).hQA = ((Boolean)((Pair)localObject1).second).booleanValue();
    if (this.ipE == null) {
      this.ipE = new AppBrandStatObject();
    }
    Object localObject1 = this.ipE;
    if (this.ipD != null) {
      this.ipD.b((AppBrandInitConfig)localObject3, (AppBrandStatObject)localObject1);
    }
    GMTrace.o(17330058821632L, 129119);
  }
  
  public static abstract interface a
  {
    public abstract void b(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */