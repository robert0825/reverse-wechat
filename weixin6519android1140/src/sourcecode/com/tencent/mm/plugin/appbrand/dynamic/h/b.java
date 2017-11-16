package com.tencent.mm.plugin.appbrand.dynamic.h;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  private static a hUY;
  private static a hUZ;
  
  static
  {
    GMTrace.i(19985288134656L, 148902);
    hUY = new a();
    hUZ = new a();
    GMTrace.o(19985288134656L, 148902);
  }
  
  public static void Vp()
  {
    GMTrace.i(19984885481472L, 148899);
    a(5, 6, 7, 8, hUZ);
    a(0, 1, 2, 3, hUY);
    hUZ.reset();
    hUY.reset();
    GMTrace.o(19984885481472L, 148899);
  }
  
  private static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, a parama)
  {
    GMTrace.i(19985153916928L, 148901);
    int i = parama.count;
    long l1 = parama.hVa;
    long l2 = parama.hVb;
    long l3 = parama.hVc;
    if ((l1 <= 0L) || (l2 <= 0L) || (i <= 0) || (l3 <= 0L))
    {
      GMTrace.o(19985153916928L, 148901);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.a(690L, paramInt1, l1, false);
    com.tencent.mm.plugin.report.service.g.ork.a(690L, paramInt2, l2, false);
    com.tencent.mm.plugin.report.service.g.ork.a(690L, paramInt3, i, false);
    com.tencent.mm.plugin.report.service.g.ork.a(690L, paramInt4, l3, false);
    GMTrace.o(19985153916928L, 148901);
  }
  
  private static void a(a parama, long paramLong, int paramInt)
  {
    GMTrace.i(19985019699200L, 148900);
    try
    {
      parama.hVa += paramLong / 1000L;
      parama.hVb += paramInt;
      parama.hVc += paramLong / paramInt;
      parama.count += 1;
      GMTrace.o(19985019699200L, 148900);
      return;
    }
    finally {}
  }
  
  public static void f(long paramLong, int paramInt)
  {
    GMTrace.i(19984751263744L, 148898);
    if ((paramLong <= 0L) || (paramInt <= 0))
    {
      GMTrace.o(19984751263744L, 148898);
      return;
    }
    switch (com.tencent.mm.u.g.wv())
    {
    default: 
      a(hUY, paramLong, paramInt);
      GMTrace.o(19984751263744L, 148898);
      return;
    }
    a(hUZ, paramLong, paramInt);
    GMTrace.o(19984751263744L, 148898);
  }
  
  private static final class a
  {
    volatile int count;
    volatile long hVa;
    volatile long hVb;
    volatile long hVc;
    
    public a()
    {
      GMTrace.i(19985825005568L, 148906);
      GMTrace.o(19985825005568L, 148906);
    }
    
    final void reset()
    {
      try
      {
        GMTrace.i(19985959223296L, 148907);
        this.hVa = 0L;
        this.hVb = 0L;
        this.count = 0;
        GMTrace.o(19985959223296L, 148907);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */