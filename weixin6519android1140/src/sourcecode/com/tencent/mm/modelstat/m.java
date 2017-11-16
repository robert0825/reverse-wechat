package com.tencent.mm.modelstat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.sdk.platformtools.w;

public final class m
{
  static
  {
    GMTrace.i(1403246346240L, 10455);
    bf.reset();
    GMTrace.o(1403246346240L, 10455);
  }
  
  private static void a(j paramj, int paramInt)
  {
    GMTrace.i(1403112128512L, 10454);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(1403112128512L, 10454);
      return;
      paramj.gYE = (paramj.gYL + paramj.gYM);
      paramj.eQl |= 0x8000;
      GMTrace.o(1403112128512L, 10454);
      return;
      paramj.gYs = (paramj.gYz + paramj.gYA);
      paramj.eQl |= 0x8;
      GMTrace.o(1403112128512L, 10454);
      return;
      paramj.gYG = (paramj.gYL + paramj.gYM);
      paramj.eQl |= 0x20000;
      GMTrace.o(1403112128512L, 10454);
      return;
      paramj.gYu = (paramj.gYz + paramj.gYA);
      paramj.eQl |= 0x20;
      GMTrace.o(1403112128512L, 10454);
      return;
      paramj.gYI = (paramj.gYL + paramj.gYM);
      paramj.eQl |= 0x80000;
      GMTrace.o(1403112128512L, 10454);
      return;
      paramj.gYw = (paramj.gYz + paramj.gYA);
      paramj.eQl |= 0x80;
      GMTrace.o(1403112128512L, 10454);
      return;
      paramj.gYK = (paramj.gYL + paramj.gYM);
      paramj.eQl |= 0x200000;
      GMTrace.o(1403112128512L, 10454);
      return;
      paramj.gYy = (paramj.gYz + paramj.gYA);
      paramj.eQl |= 0x200;
    }
  }
  
  private static void c(j paramj)
  {
    GMTrace.i(1402977910784L, 10453);
    bf.update();
    paramj.gYB = ((int)bf.bQI());
    paramj.gYN = ((int)bf.bQH());
    paramj.gYC = ((int)bf.bQG());
    paramj.gYO = ((int)bf.bQF());
    paramj.gYP = ((int)bf.bQM());
    paramj.gYR = ((int)bf.bQL());
    paramj.gYQ = ((int)bf.bQK());
    paramj.gYS = ((int)bf.bQJ());
    paramj.eQl = (paramj.eQl | 0x2000 | 0x2000000 | 0x1000 | 0x1000000 | 0x8000000 | 0x20000000 | 0x4000000 | 0x10000000);
    GMTrace.o(1402977910784L, 10453);
  }
  
  public static void s(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1402575257600L, 10450);
    if (com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext()))
    {
      w.i("MicroMsg.NetStatStorageLogic", "dknetflow wifi recv:%d send:%d type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0) });
      t(paramInt1, paramInt2, 0);
      GMTrace.o(1402575257600L, 10450);
      return;
    }
    w.i("MicroMsg.NetStatStorageLogic", "dknetflow mobile recv:%d send:%d type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0) });
    u(paramInt1, paramInt2, 0);
    GMTrace.o(1402575257600L, 10450);
  }
  
  public static void t(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1402709475328L, 10451);
    j localj = new j();
    localj.gYA = paramInt1;
    localj.gYM = paramInt2;
    localj.eQl = 8390656;
    c(localj);
    a(localj, paramInt3);
    p.Mu().a(localj);
    GMTrace.o(1402709475328L, 10451);
  }
  
  public static void u(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1402843693056L, 10452);
    j localj = new j();
    localj.gYz = paramInt1;
    localj.gYL = paramInt2;
    localj.eQl = 4195328;
    c(localj);
    a(localj, paramInt3);
    p.Mu().a(localj);
    GMTrace.o(1402843693056L, 10452);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */