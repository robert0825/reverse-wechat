package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask;
import com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask.a;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.k;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

final class d
{
  static void a(final j paramj, String paramString1, int paramInt, final String paramString2, JSONObject paramJSONObject, a parama)
  {
    GMTrace.i(19831608836096L, 147757);
    String str = "";
    final Object localObject1 = paramj.hzM.hyJ;
    final Object localObject2;
    if ((localObject1 != null) && (((m)localObject1).Zs() != null))
    {
      localObject1 = ((m)localObject1).Zs().Zh();
      if (localObject1 != null) {
        str = ((AppBrandPageView)localObject1).ivj.iwc;
      }
      localObject2 = paramj.hyD + ":" + bg.nl(p.encode(str));
      localObject1 = new AppBrandStatObject();
      ((AppBrandStatObject)localObject1).scene = 1037;
      ((AppBrandStatObject)localObject1).eVh = com.tencent.mm.plugin.appbrand.a.nL(paramj.hyD).eVh;
      ((AppBrandStatObject)localObject1).eAv = ((String)localObject2);
      localObject2 = new AppBrandLaunchReferrer();
      ((AppBrandLaunchReferrer)localObject2).appId = paramj.hyD;
      if (paramJSONObject != null) {
        break label230;
      }
    }
    label230:
    for (paramJSONObject = "{}";; paramJSONObject = paramJSONObject.toString())
    {
      ((AppBrandLaunchReferrer)localObject2).hQG = paramJSONObject;
      ((AppBrandLaunchReferrer)localObject2).hQF = 1;
      ((AppBrandLaunchReferrer)localObject2).url = str;
      paramj = new AppBrandPreInitTask(paramString1, paramInt, (AppBrandStatObject)localObject1, new AppBrandPreInitTask.a()
      {
        public final void a(AppBrandInitConfig paramAnonymousAppBrandInitConfig)
        {
          GMTrace.i(19830266658816L, 147747);
          if (paramAnonymousAppBrandInitConfig == null)
          {
            if (this.iiG != null) {
              this.iiG.ch(false);
            }
            GMTrace.o(19830266658816L, 147747);
            return;
          }
          if (this.iiG != null) {
            this.iiG.ch(true);
          }
          paramAnonymousAppBrandInitConfig.startTime = System.currentTimeMillis();
          paramAnonymousAppBrandInitConfig.hQy = com.tencent.mm.plugin.appbrand.appcache.a.oj(paramString2);
          paramAnonymousAppBrandInitConfig.hQB.a(localObject2);
          c.a(paramj.hyD, c.c.hyy);
          e locale = paramj.hzM;
          AppBrandStatObject localAppBrandStatObject = localObject1;
          locale.hyC.a(locale, paramAnonymousAppBrandInitConfig, localAppBrandStatObject);
          GMTrace.o(19830266658816L, 147747);
        }
      });
      paramj.VM();
      AppBrandMainProcessService.a(paramj);
      GMTrace.o(19831608836096L, 147757);
      return;
      localObject1 = null;
      break;
    }
  }
  
  static abstract interface a
  {
    public abstract void ch(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\miniprogram_navigator\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */