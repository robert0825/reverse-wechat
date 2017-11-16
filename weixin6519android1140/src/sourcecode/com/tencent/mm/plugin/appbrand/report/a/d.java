package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;

public final class d
{
  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(18355079610368L, 136756);
    Object localObject = com.tencent.mm.plugin.appbrand.a.nK(paramString1);
    if (localObject != null)
    {
      try
      {
        str = p.encode(paramString4, "utf-8");
        paramString4 = str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          String str;
          int i;
          int j;
          w.w("MicroMsg.AppBrand.Report.kv_14510", "kv_14510 report UnsupportedEncodingException");
        }
      }
      i = ((AppBrandSysConfig)localObject).hRg.hKC;
      j = ((AppBrandSysConfig)localObject).hRg.hKB + 1;
      str = com.tencent.mm.plugin.appbrand.report.a.bP(ab.getContext());
      g.ork.i(14510, new Object[] { paramString1, Integer.valueOf(i), Integer.valueOf(j), str, paramString2, paramString4, paramString3, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      localObject = new StringBuilder("report kv_14510{");
      ((StringBuilder)localObject).append("appId='").append(paramString1).append('\'').append(", appVersion=").append(i).append(", appState=").append(j).append(", networkType='").append(str).append('\'').append(", functionName='").append(paramString2).append('\'').append(", url='").append(paramString4).append('\'').append(", method='").append(paramString3).append('\'').append(", sentsize=").append(paramLong1).append(", receivedsize=").append(paramLong2).append(", statusCode=").append(paramInt1).append(", result=").append(paramInt2).append(", costtime=").append(paramInt3).append('}');
      w.d("MicroMsg.AppBrand.Report.kv_14510", ((StringBuilder)localObject).toString());
      GMTrace.o(18355079610368L, 136756);
      return;
    }
    w.w("MicroMsg.AppBrand.Report.kv_14510", "kv_14510 report config is null. %s", new Object[] { paramString1 });
    GMTrace.o(18355079610368L, 136756);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */