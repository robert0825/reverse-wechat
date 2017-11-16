package com.tencent.mm.plugin.appbrand.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService.StopBackgroundMusicTask;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService.b;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

abstract class f
  extends g
{
  int hLl;
  private final AppBrandMusicClientService.b hLm;
  private final com.tencent.mm.plugin.appbrand.ui.banner.e hLn;
  public final com.tencent.mm.plugin.appbrand.e hzM;
  
  f(h paramh, com.tencent.mm.plugin.appbrand.e parame)
  {
    super(paramh);
    GMTrace.i(18870341468160L, 140595);
    this.hLl = 0;
    this.hLm = new AppBrandMusicClientService.b()
    {
      public final void Ti()
      {
        GMTrace.i(18869536161792L, 140589);
        f.this.id(1);
        GMTrace.o(18869536161792L, 140589);
      }
      
      public final void onStop()
      {
        GMTrace.i(18869670379520L, 140590);
        f.this.id(1);
        GMTrace.o(18869670379520L, 140590);
      }
    };
    this.hLn = new com.tencent.mm.plugin.appbrand.ui.banner.e()
    {
      public final void Y(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(18875307524096L, 140632);
        if (f.this.hzM.hyD.equals(paramAnonymousString))
        {
          GMTrace.o(18875307524096L, 140632);
          return;
        }
        f.this.id(2);
        GMTrace.o(18875307524096L, 140632);
      }
    };
    this.hzM = parame;
    GMTrace.o(18870341468160L, 140595);
  }
  
  private void ic(int paramInt)
  {
    GMTrace.i(18870744121344L, 140598);
    this.hLl |= paramInt;
    GMTrace.o(18870744121344L, 140598);
  }
  
  abstract void Te();
  
  public void enter()
  {
    GMTrace.i(18870475685888L, 140596);
    super.enter();
    this.hLl = 0;
    Object localObject1 = this.hzM.hyD;
    int j = this.hzM.hyF.hKs;
    int i;
    Object localObject2;
    AppBrandMusicClientService.b localb;
    if ((this.hzM.hyG != null) && (this.hzM.hyG.hRd))
    {
      i = 1;
      if (i == 0) {
        break label247;
      }
      if (AppBrandMusicClientService.rg((String)localObject1))
      {
        ic(1);
        localObject2 = AppBrandMusicClientService.irl;
        localb = this.hLm;
        if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (localb != null)) {
          break label195;
        }
      }
      label100:
      if ((c.nW((String)localObject1) == c.c.hyv) || (AppBrandStickyBannerLogic.a.av((String)localObject1, j)))
      {
        ic(2);
        AppBrandStickyBannerLogic.a.d(this.hLn);
      }
      localObject1 = c.nW((String)localObject1);
      switch (3.hLp[localObject1.ordinal()])
      {
      }
    }
    for (;;)
    {
      this.hLl = this.hLl;
      id(0);
      GMTrace.o(18870475685888L, 140596);
      return;
      i = 0;
      break;
      label195:
      if (!((AppBrandMusicClientService)localObject2).irk.containsKey(localObject1))
      {
        ((AppBrandMusicClientService)localObject2).irk.put(localObject1, localb);
        break label100;
      }
      ((AppBrandMusicClientService)localObject2).irk.remove(localObject1);
      ((AppBrandMusicClientService)localObject2).irk.put(localObject1, localb);
      break label100;
      label247:
      localObject2 = AppBrandMusicClientService.irl;
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label100;
      }
      if (!((String)localObject1).equalsIgnoreCase(((AppBrandMusicClientService)localObject2).irm))
      {
        w.e("MicroMsg.AppBrandMusicClientService", "appId is diff, can't stop music");
        break label100;
      }
      localObject2 = new AppBrandMusicClientService.StopBackgroundMusicTask();
      ((AppBrandMusicClientService.StopBackgroundMusicTask)localObject2).appId = ((String)localObject1);
      AppBrandMainProcessService.a((MainProcessTask)localObject2);
      break label100;
      ic(16);
      continue;
      ic(4);
      continue;
      ic(8);
    }
  }
  
  public void exit()
  {
    GMTrace.i(18870609903616L, 140597);
    super.exit();
    this.hLl = 0;
    AppBrandMusicClientService localAppBrandMusicClientService = AppBrandMusicClientService.irl;
    String str = this.hzM.hyD;
    if ((!TextUtils.isEmpty(str)) && (localAppBrandMusicClientService.irk.containsKey(str))) {
      localAppBrandMusicClientService.irk.remove(str);
    }
    AppBrandStickyBannerLogic.a.c(this.hLn);
    GMTrace.o(18870609903616L, 140597);
  }
  
  public final void id(int paramInt)
  {
    GMTrace.i(18870878339072L, 140599);
    this.hLl &= (paramInt ^ 0xFFFFFFFF);
    if (this.hLl == 0) {
      Te();
    }
    GMTrace.o(18870878339072L, 140599);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */