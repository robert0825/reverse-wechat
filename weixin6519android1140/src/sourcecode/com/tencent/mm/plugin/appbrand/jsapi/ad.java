package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.l;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class ad
  extends k
{
  private static final int CTRL_INDEX = 97;
  private static final String NAME = "getPublicLibVersion";
  
  ad()
  {
    GMTrace.i(10432072908800L, 77725);
    GMTrace.o(10432072908800L, 77725);
  }
  
  private String qj(String paramString)
  {
    boolean bool2 = true;
    GMTrace.i(10432475561984L, 77728);
    Object localObject = a.nK(paramString);
    if (localObject == null)
    {
      paramString = d("fail", null);
      GMTrace.o(10432475561984L, 77728);
      return paramString;
    }
    paramString = new HashMap();
    if (((AppBrandSysConfig)localObject).hRg.hKB != 0)
    {
      bool1 = true;
      paramString.put("appDebug", Boolean.valueOf(bool1));
      paramString.put("appMd5", bg.nl(((AppBrandSysConfig)localObject).hRg.hKF));
      paramString.put("appVersion", Integer.valueOf(((AppBrandSysConfig)localObject).hRg.hKC));
      localObject = l.SC();
      if (((WxaPkgWrappingInfo)localObject).hKB == 0) {
        break label257;
      }
    }
    label257:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramString.put("libDebug", Boolean.valueOf(bool1));
      paramString.put("libMd5", bg.nl(((WxaPkgWrappingInfo)localObject).hKF));
      paramString.put("libVersion", Integer.valueOf(((WxaPkgWrappingInfo)localObject).hKC));
      paramString.put("clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.tJC));
      paramString.put("system", "android");
      paramString.put("systemVersion", Integer.valueOf(Build.VERSION.SDK_INT));
      paramString.put("x5Version", Integer.valueOf(com.tencent.xweb.x5.sdk.d.getTbsVersion(ab.getContext())));
      paramString = d("ok", paramString);
      GMTrace.o(10432475561984L, 77728);
      return paramString;
      bool1 = false;
      break;
    }
  }
  
  public final String a(j paramj, JSONObject paramJSONObject)
  {
    GMTrace.i(10432207126528L, 77726);
    paramj = qj(paramj.hyD);
    GMTrace.o(10432207126528L, 77726);
    return paramj;
  }
  
  public final String a(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(10432341344256L, 77727);
    paramAppBrandPageView = qj(paramAppBrandPageView.hyD);
    GMTrace.o(10432341344256L, 77727);
    return paramAppBrandPageView;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */