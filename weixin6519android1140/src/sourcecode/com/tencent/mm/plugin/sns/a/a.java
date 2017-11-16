package com.tencent.mm.plugin.sns.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements c
{
  private Map<Integer, com.tencent.mm.plugin.sns.a.a.a> pmz;
  
  public a()
  {
    GMTrace.i(20052396998656L, 149402);
    this.pmz = new HashMap();
    GMTrace.o(20052396998656L, 149402);
  }
  
  public final void a(int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    GMTrace.i(20052665434112L, 149404);
    com.tencent.mm.plugin.sns.a.a.a locala = (com.tencent.mm.plugin.sns.a.a.a)this.pmz.get(Integer.valueOf(paramInt1));
    if (locala == null)
    {
      w.w("SnsAdReportService", "can not find %s implementation for kv %d", new Object[] { com.tencent.mm.plugin.sns.a.a.a.class, Integer.valueOf(paramInt1) });
      GMTrace.o(20052665434112L, 149404);
      return;
    }
    locala.i(paramInt2, paramVarArgs);
    GMTrace.o(20052665434112L, 149404);
  }
  
  public final void a(com.tencent.mm.plugin.sns.a.a.a parama)
  {
    GMTrace.i(20052531216384L, 149403);
    this.pmz.put(Integer.valueOf(parama.baI()), parama);
    GMTrace.o(20052531216384L, 149403);
  }
  
  public final void i(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20052799651840L, 149405);
    com.tencent.mm.plugin.sns.a.a.a locala = (com.tencent.mm.plugin.sns.a.a.a)this.pmz.get(Integer.valueOf(paramInt));
    if (locala == null)
    {
      w.w("SnsAdReportService", "can not find %s implementation for kv %d", new Object[] { com.tencent.mm.plugin.sns.a.a.a.class, Integer.valueOf(paramInt) });
      GMTrace.o(20052799651840L, 149405);
      return;
    }
    locala.k(paramVarArgs);
    GMTrace.o(20052799651840L, 149405);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */