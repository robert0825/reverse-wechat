package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.b;

public final class e
  extends a
{
  public e()
  {
    GMTrace.i(10655545425920L, 79390);
    GMTrace.o(10655545425920L, 79390);
  }
  
  public final i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16546898378752L, 123284);
    paramContext = new f(paramContext, paramb, paramInt);
    GMTrace.o(16546898378752L, 123284);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(10655948079104L, 79393);
    GMTrace.o(10655948079104L, 79393);
    return Integer.MAX_VALUE;
  }
  
  public final int getType()
  {
    GMTrace.i(10655813861376L, 79392);
    GMTrace.o(10655813861376L, 79392);
    return 4208;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */