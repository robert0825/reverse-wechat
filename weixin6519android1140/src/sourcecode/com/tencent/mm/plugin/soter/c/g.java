package com.tencent.mm.plugin.soter.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public enum g
{
  private String appId;
  private int errCode;
  private int errType;
  
  static
  {
    GMTrace.i(18501511151616L, 137847);
    qpi = new g("INSTANCE");
    qpj = new g[] { qpi };
    GMTrace.o(18501511151616L, 137847);
  }
  
  private g()
  {
    GMTrace.i(18501242716160L, 137845);
    this.appId = null;
    this.errType = 0;
    this.errCode = 0;
    GMTrace.o(18501242716160L, 137845);
  }
  
  public static void l(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(18501376933888L, 137846);
    w.d("MicroMsg.SoterReportManager", "SoterReportManager functionName: %s, appId: %s, errType: %d, errCode: %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    int i;
    switch (paramString1.hashCode())
    {
    default: 
      i = -1;
      switch (i)
      {
      default: 
        label75:
        w.e("MicroMsg.SoterReportManager", "unknown soter jsapi function name");
        i = -1;
      }
      break;
    }
    for (;;)
    {
      w.i("MicroMsg.SoterReportManager", "functionNameCode: %d", new Object[] { Integer.valueOf(i) });
      if (i != -1) {
        com.tencent.mm.plugin.report.service.g.ork.i(13711, new Object[] { Integer.valueOf(i), paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      }
      GMTrace.o(18501376933888L, 137846);
      return;
      if (!paramString1.equals("requireSoterBiometricAuthentication")) {
        break;
      }
      i = 0;
      break label75;
      if (!paramString1.equals("getSupportSoter")) {
        break;
      }
      i = 1;
      break label75;
      i = 0;
      continue;
      i = 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\soter\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */