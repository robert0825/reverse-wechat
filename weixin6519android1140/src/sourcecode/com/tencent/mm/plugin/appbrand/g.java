package com.tencent.mm.plugin.appbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.task.c;

public final class g
{
  int afp;
  int gRb;
  private int hzA;
  boolean hzB;
  boolean hzC;
  long[] hzy;
  int hzz;
  int mType;
  
  public g()
  {
    GMTrace.i(18854369558528L, 140476);
    this.hzA = 0;
    GMTrace.o(18854369558528L, 140476);
  }
  
  public final void k(int paramInt, long paramLong)
  {
    GMTrace.i(18854503776256L, 140477);
    if (paramInt == 0)
    {
      this.hzy = new long[6];
      if (!c.aao()) {
        break label64;
      }
    }
    label64:
    for (int i = 1;; i = 0)
    {
      this.hzA = i;
      if ((paramInt < this.hzy.length) && (this.hzy[paramInt] == 0L)) {
        break;
      }
      GMTrace.o(18854503776256L, 140477);
      return;
    }
    this.hzy[paramInt] = paramLong;
    GMTrace.o(18854503776256L, 140477);
  }
  
  final void m(String paramString, int paramInt1, int paramInt2)
  {
    int i = 1;
    GMTrace.i(18854637993984L, 140478);
    com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
    int j = this.afp;
    int k = this.mType;
    long l = this.hzy[paramInt2];
    int m = this.hzz;
    int n = this.hzA;
    int i1 = this.gRb;
    if (this.hzB)
    {
      paramInt2 = 1;
      if (!this.hzC) {
        break label187;
      }
    }
    for (;;)
    {
      localg.i(13886, new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt1), "", "", Long.valueOf(l), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      GMTrace.o(18854637993984L, 140478);
      return;
      paramInt2 = 0;
      break;
      label187:
      i = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */