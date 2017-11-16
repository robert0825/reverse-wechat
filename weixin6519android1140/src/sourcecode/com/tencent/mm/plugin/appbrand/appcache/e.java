package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  static int u(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(19993609633792L, 148964);
    try
    {
      int i = WABSPatch.bspatch(paramString1, paramString2, paramString3);
      GMTrace.o(19993609633792L, 148964);
      return i;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "mergeDiffPkg e = %s, old[%s], new[%s], diff[%s]", new Object[] { localException, paramString1, paramString2, paramString3 });
      GMTrace.o(19993609633792L, 148964);
    }
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */