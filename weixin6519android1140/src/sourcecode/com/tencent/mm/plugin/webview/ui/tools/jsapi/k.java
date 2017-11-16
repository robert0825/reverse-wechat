package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

public final class k
{
  public static void a(Map<String, Object> paramMap, boolean paramBoolean, String paramString1, String paramString2)
  {
    GMTrace.i(12241596317696L, 91207);
    if (paramMap != null)
    {
      paramMap.put("fromMenu", Boolean.valueOf(paramBoolean));
      paramMap.put("keyParam", paramString1);
      if (bg.nm((String)paramMap.get("appId"))) {
        paramMap.put("appId", paramString2);
      }
    }
    GMTrace.o(12241596317696L, 91207);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */