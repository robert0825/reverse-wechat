package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.sdk.platformtools.w;

public enum i
{
  static
  {
    GMTrace.i(10594073706496L, 78932);
    hRk = new i[0];
    GMTrace.o(10594073706496L, 78932);
  }
  
  public static long pm(String paramString)
  {
    GMTrace.i(10593939488768L, 78931);
    paramString = a.nK(paramString);
    boolean bool;
    if (paramString == null)
    {
      bool = true;
      if (paramString != null) {
        break label89;
      }
      l = -1L;
      label27:
      w.i("MicroMsg.AppServiceSettingRemoteManager", "getMaxFileStorageSize, (null == config) = %b, MaxFileStorageSize = %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(l) });
      if ((paramString == null) || (paramString.hQV <= 0L)) {
        break label97;
      }
    }
    label89:
    label97:
    for (long l = paramString.hQV;; l = 10L)
    {
      GMTrace.o(10593939488768L, 78931);
      return l * 1048576L;
      bool = false;
      break;
      l = paramString.hQV;
      break label27;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */