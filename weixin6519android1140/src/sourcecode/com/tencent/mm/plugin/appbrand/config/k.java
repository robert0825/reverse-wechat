package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.protocal.c.buv;
import com.tencent.mm.protocal.c.bux;
import com.tencent.mm.sdk.platformtools.bg;

final class k
  extends a<bux>
{
  final com.tencent.mm.ad.b fUa;
  
  k(String paramString1, String paramString2)
  {
    GMTrace.i(17268989755392L, 128664);
    b.a locala = new b.a();
    buv localbuv = new buv();
    localbuv.vdq = paramString1;
    if (bg.nm(paramString1))
    {
      paramString1 = e.Se().e(paramString2, new String[] { "syncVersion" });
      if (paramString1 == null) {
        paramString1 = "";
      }
    }
    for (paramString1 = new com.tencent.mm.bm.b(paramString1.getBytes());; paramString1 = r.pB(paramString1))
    {
      localbuv.tVL = paramString1;
      localbuv.vdr = paramString2;
      locala.gtF = localbuv;
      locala.gtG = new bux();
      locala.gtE = 1151;
      locala.uri = "/cgi-bin/mmbiz-bin/wxaattr/wxaattrsync";
      paramString1 = locala.DA();
      this.fUa = paramString1;
      this.fUa = paramString1;
      GMTrace.o(17268989755392L, 128664);
      return;
      paramString1 = bg.nl(paramString1.field_syncVersion);
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */