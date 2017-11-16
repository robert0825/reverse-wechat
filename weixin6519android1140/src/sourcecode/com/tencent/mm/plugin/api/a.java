package com.tencent.mm.plugin.api;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.s;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.mmsight.api.a.a;
import com.tencent.mm.plugin.mmsight.model.b.b;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  implements a.a
{
  public a()
  {
    GMTrace.i(20179366969344L, 150348);
    GMTrace.o(20179366969344L, 150348);
  }
  
  public final com.tencent.mm.plugin.mmsight.api.a a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(20179769622528L, 150351);
    if (paramInt1 == 1)
    {
      paramString1 = new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5);
      GMTrace.o(20179769622528L, 150351);
      return paramString1;
    }
    if (paramInt1 == 2)
    {
      paramString1 = new b(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5);
      GMTrace.o(20179769622528L, 150351);
      return paramString1;
    }
    GMTrace.o(20179769622528L, 150351);
    return null;
  }
  
  public final com.tencent.mm.plugin.mmsight.api.a a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2)
  {
    GMTrace.i(20179903840256L, 150352);
    if (paramInt1 == 1)
    {
      paramString1 = new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5, paramLong1, paramLong2);
      GMTrace.o(20179903840256L, 150352);
      return paramString1;
    }
    if (paramInt1 == 2)
    {
      paramString1 = new b(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5, paramLong1, paramLong2);
      GMTrace.o(20179903840256L, 150352);
      return paramString1;
    }
    GMTrace.o(20179903840256L, 150352);
    return null;
  }
  
  public final com.tencent.mm.plugin.mmsight.api.a a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20179501187072L, 150349);
    int i = p.fQJ.fQZ;
    w.i("MicroMsg.MMSightPresendRemuxerImpl", "get, configRemuxerType: %s", new Object[] { Integer.valueOf(i) });
    if (i != -1)
    {
      if (i == 1)
      {
        paramString1 = new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
        GMTrace.o(20179501187072L, 150349);
        return paramString1;
      }
      if (i == 2)
      {
        paramString1 = new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
        GMTrace.o(20179501187072L, 150349);
        return paramString1;
      }
    }
    if (d.et(19))
    {
      paramString1 = new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
      GMTrace.o(20179501187072L, 150349);
      return paramString1;
    }
    paramString1 = new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(20179501187072L, 150349);
    return paramString1;
  }
  
  public final com.tencent.mm.plugin.mmsight.api.a a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    GMTrace.i(20179635404800L, 150350);
    int i = p.fQJ.fQZ;
    w.i("MicroMsg.MMSightPresendRemuxerImpl", "get, configRemuxerType: %s", new Object[] { Integer.valueOf(i) });
    if (i != -1)
    {
      if (i == 1)
      {
        paramString1 = new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
        GMTrace.o(20179635404800L, 150350);
        return paramString1;
      }
      if (i == 2)
      {
        paramString1 = new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
        GMTrace.o(20179635404800L, 150350);
        return paramString1;
      }
    }
    if (d.et(19))
    {
      paramString1 = new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
      GMTrace.o(20179635404800L, 150350);
      return paramString1;
    }
    paramString1 = new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
    GMTrace.o(20179635404800L, 150350);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\api\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */