package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.appcache.t;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.sdk.platformtools.bg;

final class r
{
  static String an(String paramString, int paramInt)
  {
    GMTrace.i(17667750625280L, 131635);
    Object localObject = null;
    t localt = com.tencent.mm.plugin.appbrand.app.e.Sl().a(paramString, paramInt, new String[] { "versionMd5", "pkgPath" });
    paramString = (String)localObject;
    if (localt != null)
    {
      paramString = (String)localObject;
      if (!bg.nm(localt.field_pkgPath))
      {
        paramString = (String)localObject;
        if (com.tencent.mm.a.e.aZ(localt.field_pkgPath))
        {
          paramString = (String)localObject;
          if (!bg.nm(localt.field_versionMd5))
          {
            paramString = (String)localObject;
            if (localt.field_pkgPath.equals(g.bg(localt.field_pkgPath))) {
              paramString = localt.field_versionMd5;
            }
          }
        }
      }
    }
    GMTrace.o(17667750625280L, 131635);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */