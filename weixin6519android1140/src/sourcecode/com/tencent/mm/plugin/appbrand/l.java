package com.tencent.mm.plugin.appbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public enum l
{
  static
  {
    GMTrace.i(10193836441600L, 75950);
    hzT = new l[0];
    GMTrace.o(10193836441600L, 75950);
  }
  
  public static String a(WxaExposedParams paramWxaExposedParams)
  {
    GMTrace.i(18185831055360L, 135495);
    if ((paramWxaExposedParams == null) || (bg.nm(paramWxaExposedParams.appId)))
    {
      w.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl fail, null or nil appId");
      GMTrace.o(18185831055360L, 135495);
      return "";
    }
    try
    {
      paramWxaExposedParams = String.format("https://mp.weixin.qq.com/mp/wacomplain?action=show&appid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect", new Object[] { paramWxaExposedParams.appId, p.encode(bg.nl(paramWxaExposedParams.ePf), "UTF-8"), Integer.valueOf(paramWxaExposedParams.eDj), Integer.valueOf(bg.m(Integer.valueOf(paramWxaExposedParams.hKB), -1)), Integer.valueOf(bg.m(Integer.valueOf(paramWxaExposedParams.hKC), -1)) });
      GMTrace.o(18185831055360L, 135495);
      return paramWxaExposedParams;
    }
    catch (UnsupportedEncodingException paramWxaExposedParams)
    {
      w.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl encode fail, invalid arguments");
      GMTrace.o(18185831055360L, 135495);
    }
    return "";
  }
  
  public static String of(String paramString)
  {
    GMTrace.i(10192896917504L, 75943);
    paramString = String.format(Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=overseas#wechat_redirect", new Object[] { paramString });
    GMTrace.o(10192896917504L, 75943);
    return paramString;
  }
  
  public static String og(String paramString)
  {
    GMTrace.i(10193568006144L, 75948);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.AppBrandUrlBuilders", "buildEntityUrl fail, null or nil appId");
      GMTrace.o(10193568006144L, 75948);
      return "";
    }
    paramString = String.format("https://mp.weixin.qq.com/mp/waverifyinfo?action=get&appid=%s#wechat_redirect", new Object[] { paramString });
    GMTrace.o(10193568006144L, 75948);
    return paramString;
  }
  
  public static String oh(String paramString)
  {
    GMTrace.i(10193702223872L, 75949);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.AppBrandUrlBuilders", "buildLowVersionUrl fail, invalid arguments");
      GMTrace.o(10193702223872L, 75949);
      return "";
    }
    paramString = String.format(Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect", new Object[] { paramString, Integer.valueOf(3) });
    GMTrace.o(10193702223872L, 75949);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */