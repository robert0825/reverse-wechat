package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.o;

public final class p
  extends l<WxaPkgWrappingInfo>
{
  public static boolean SF()
  {
    GMTrace.i(20680535965696L, 154082);
    boolean bool = o.SF();
    GMTrace.o(20680535965696L, 154082);
    return bool;
  }
  
  final String getTag()
  {
    GMTrace.i(17330327257088L, 129121);
    GMTrace.o(17330327257088L, 129121);
    return "MicroMsg.AppBrand.PrepareStepCheckPublicLibrary";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */