package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

final class h
{
  static void a(a parama, String paramString, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    GMTrace.i(20670201200640L, 154005);
    w.d("MicroMsg.AppBrand.LaunchStepCostReporter", "report %s | %s | %d", new Object[] { parama.name(), paramString, Long.valueOf(paramLong) });
    g.ork.i(13886, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2 + 1), Integer.valueOf(parama.iqq), "", "", Long.valueOf(paramLong), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramInt3), Integer.valueOf(0), Integer.valueOf(0) });
    GMTrace.o(20670201200640L, 154005);
  }
  
  public static enum a
  {
    final int iqq;
    
    static
    {
      GMTrace.i(20677985828864L, 154063);
      iqn = new a("SYNC_GET_ATTRS", 0, 20);
      iqo = new a("SYNC_LAUNCH", 1, 21);
      iqp = new a("GET_DOWNLOAD_URL", 2, 22);
      iqr = new a[] { iqn, iqo, iqp };
      GMTrace.o(20677985828864L, 154063);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(20677851611136L, 154062);
      this.iqq = paramInt;
      GMTrace.o(20677851611136L, 154062);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */