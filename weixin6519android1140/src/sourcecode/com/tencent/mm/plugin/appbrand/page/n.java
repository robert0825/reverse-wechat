package com.tencent.mm.plugin.appbrand.page;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.h;
import com.tencent.mm.plugin.appbrand.report.a.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class n
{
  private final String hyD;
  private final e hzM;
  public Intent iuR;
  public com.tencent.mm.plugin.appbrand.report.a.a iuS;
  c iuT;
  boolean iuq;
  
  n(e parame)
  {
    GMTrace.i(17298249220096L, 128882);
    this.iuq = false;
    this.iuS = null;
    this.iuT = null;
    this.hyD = parame.hyD;
    this.hzM = parame;
    Uv();
    GMTrace.o(17298249220096L, 128882);
  }
  
  public final void Uv()
  {
    GMTrace.i(16152029822976L, 120342);
    if (!bg.nm(this.hyD))
    {
      localObject1 = h.f(this.hzM);
      if (localObject1 != null) {}
    }
    else
    {
      w.e("MicroMsg.AppBrandPageContainerReporter", "resetSession with dummy model, stack %s", new Object[] { bg.f(new Throwable()) });
      this.iuT = c.aae();
      this.iuS = com.tencent.mm.plugin.appbrand.report.a.a.aad();
      GMTrace.o(16152029822976L, 120342);
      return;
    }
    String str = ((h)localObject1).hzG;
    Object localObject2 = ((h)localObject1).RS();
    Object localObject1 = "";
    if ((1 == ((AppBrandLaunchReferrer)localObject2).hQF) || (3 == ((AppBrandLaunchReferrer)localObject2).hQF))
    {
      localObject1 = ((AppBrandLaunchReferrer)localObject2).appId;
      if (this.iuS == null) {
        break label190;
      }
      localObject2 = this.iuS.iyx;
      ((LinkedList)localObject2).pollFirst();
    }
    for (;;)
    {
      ((LinkedList)localObject2).push(bg.nl((String)localObject1));
      this.iuS = com.tencent.mm.plugin.appbrand.report.a.a.a(this.hzM, str, (LinkedList)localObject2);
      this.iuT = c.a(this.hzM, str, (String)localObject1);
      GMTrace.o(16152029822976L, 120342);
      return;
      if (2 != ((AppBrandLaunchReferrer)localObject2).hQF) {
        break;
      }
      localObject1 = ((AppBrandLaunchReferrer)localObject2).url;
      break;
      label190:
      localObject2 = new LinkedList();
    }
  }
  
  final void b(final AppBrandPageView paramAppBrandPageView, final String paramString)
  {
    GMTrace.i(16152164040704L, 120343);
    this.iuT.f(paramAppBrandPageView);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18358166618112L, 136779);
        com.tencent.mm.plugin.appbrand.report.a.a locala = n.this.iuS;
        AppBrandPageView localAppBrandPageView = paramAppBrandPageView;
        String str = paramString;
        locala.iyC = ((String)locala.iyx.pollFirst());
        locala.iyD = 2;
        locala.iyE = str;
        locala.iyx.push(localAppBrandPageView.ivj.hZo);
        locala.e(localAppBrandPageView);
        locala.rw();
        GMTrace.o(18358166618112L, 136779);
      }
    });
    GMTrace.o(16152164040704L, 120343);
  }
  
  public final void b(final k paramk)
  {
    GMTrace.i(16152298258432L, 120344);
    this.iuq = true;
    if (paramk != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18359777230848L, 136791);
          com.tencent.mm.plugin.appbrand.report.a.a locala = n.this.iuS;
          k localk = paramk;
          locala.iyC = ((String)locala.iyx.peekFirst());
          locala.iyE = null;
          Intent localIntent;
          Object localObject;
          switch (com.tencent.mm.plugin.appbrand.report.a.a.2.hLp[com.tencent.mm.plugin.appbrand.c.nW(locala.appId).ordinal()])
          {
          default: 
            localIntent = locala.hzM.hyJ.iuy.iuR;
            if (localIntent != null) {
              if (localIntent.getComponent() == null)
              {
                localObject = "";
                w.e("MicroMsg.AppBrand.Report.kv_13536", "onBackground, intent %s, get null cmp name", new Object[] { localIntent });
                if (!((String)localObject).contains("WebViewUI")) {
                  break label274;
                }
                locala.iyD = 10;
                locala.iyE = localIntent.getStringExtra("appbrand_report_key_target_url");
                label153:
                localObject = locala.iyE;
                locala.iyx.pollFirst();
                locala.iyx.push(bg.nl((String)localObject));
              }
            }
            break;
          }
          for (;;)
          {
            localObject = com.tencent.mm.plugin.appbrand.ui.g.bR(localk.getContext());
            if ((localObject != null) && (((Activity)localObject).isFinishing())) {
              locala.iyy = true;
            }
            locala.e(localk.Zh());
            locala.rw();
            GMTrace.o(18359777230848L, 136791);
            return;
            if (localk.Zh().ivu.ZA()) {}
            for (int i = 4;; i = 3)
            {
              locala.iyD = i;
              break;
            }
            locala.iyD = 6;
            continue;
            localObject = localIntent.getComponent().getClassName();
            break;
            label274:
            locala.iyD = 8;
            locala.iyE = bg.aq(localIntent.getStringExtra("appbrand_report_key_target_activity"), (String)localObject);
            break label153;
            locala.iyD = 7;
          }
        }
      });
    }
    GMTrace.o(16152298258432L, 120344);
  }
  
  public final void c(k paramk)
  {
    GMTrace.i(16280878841856L, 121302);
    this.iuR = null;
    c localc = this.iuT;
    localc.eAw = paramk.Zh().ivj.hZo;
    localc.rw();
    GMTrace.o(16280878841856L, 121302);
  }
  
  final void d(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(16255109038080L, 121110);
    c localc = this.iuT;
    localc.eAw = paramAppBrandPageView.ivj.hZo;
    localc.rw();
    GMTrace.o(16255109038080L, 121110);
  }
  
  final void g(long paramLong, int paramInt)
  {
    GMTrace.i(16152432476160L, 120345);
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(this.hyD);
    if (localAppBrandSysConfig == null) {}
    for (int i = 0;; i = localAppBrandSysConfig.hRg.hKC)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(13543, new Object[] { this.hyD, Integer.valueOf(i), Long.valueOf(paramLong), Integer.valueOf(paramInt) });
      GMTrace.o(16152432476160L, 120345);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */