package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Map;

public final class g
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public g()
  {
    super(l.isn - 1);
    GMTrace.i(15550734401536L, 115862);
    GMTrace.o(15550734401536L, 115862);
  }
  
  public static void a(AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15551137054720L, 115865);
    a locala = new a();
    HashMap localHashMap = new HashMap();
    localHashMap.put("title", com.tencent.mm.plugin.appbrand.a.nK(paramString).eEs);
    localHashMap.put("desc", "");
    localHashMap.put("path", paramAppBrandPageView.ivj.iwc);
    Object localObject = paramAppBrandPageView.Zx();
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.plugin.appbrand.jsapi.k.a)localObject).inX.getUrl();
      localHashMap.put("webViewUrl", localObject);
      localHashMap.put("imgUrl", com.tencent.mm.plugin.appbrand.a.nK(paramString).hQJ);
      if (!paramk.hTC.gz("enable_share_with_share_ticket")) {
        break label205;
      }
    }
    label205:
    for (paramString = "withShareTicket";; paramString = "common")
    {
      localHashMap.put("mode", paramString);
      localHashMap.put("dynamic", Boolean.valueOf(paramk.hTC.gz("enable_share_dynamic")));
      paramk.hTC.q("user_clicked_share_btn", true);
      locala.a(paramAppBrandPageView).r(localHashMap).VR();
      GMTrace.o(15551137054720L, 115865);
      return;
      localObject = null;
      break;
    }
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(17666945318912L, 131629);
    paramAppBrandPageView = com.tencent.mm.plugin.appbrand.a.nK(paramString);
    if ((paramAppBrandPageView != null) && (paramAppBrandPageView.hRg.hKB == 0) && ((paramAppBrandPageView.UA() & 0x20) > 0L))
    {
      GMTrace.o(17666945318912L, 131629);
      return;
    }
    paramn.e(this.isD, paramContext.getString(o.i.hGx));
    GMTrace.o(17666945318912L, 131629);
  }
  
  public final void a(Context paramContext, final AppBrandPageView paramAppBrandPageView, final String paramString, final k paramk)
  {
    GMTrace.i(15551002836992L, 115864);
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramString);
    SharedPreferences localSharedPreferences = MultiProcessSharedPreferences.getSharedPreferences(paramContext, "pref_appbrand_" + localAppBrandSysConfig.uin, 4);
    if ((localAppBrandSysConfig.hRg.hKB == 1) && (!localSharedPreferences.contains("has_share_dev_tips")))
    {
      localSharedPreferences.edit().putLong("has_share_dev_tips", System.currentTimeMillis()).commit();
      h.a(paramContext, o.i.hEH, o.i.cUG, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(15559055900672L, 115924);
          g.a(paramAppBrandPageView, paramString, paramk);
          GMTrace.o(15559055900672L, 115924);
        }
      });
      GMTrace.o(15551002836992L, 115864);
      return;
    }
    if ((localAppBrandSysConfig.hRg.hKB == 2) && (!localSharedPreferences.contains("has_share_beta_tips")))
    {
      localSharedPreferences.edit().putLong("has_share_beta_tips", System.currentTimeMillis()).commit();
      h.a(paramContext, o.i.hEG, o.i.cUG, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(15558384812032L, 115919);
          g.a(paramAppBrandPageView, paramString, paramk);
          GMTrace.o(15558384812032L, 115919);
        }
      });
      GMTrace.o(15551002836992L, 115864);
      return;
    }
    a(paramAppBrandPageView, paramString, paramk);
    GMTrace.o(15551002836992L, 115864);
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = 75;
    public static final String NAME = "onShareAppMessage";
    
    public a()
    {
      GMTrace.i(15552479232000L, 115875);
      GMTrace.o(15552479232000L, 115875);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */