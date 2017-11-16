package com.tencent.mm.plugin.brandservice.ui.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.b;

public final class b
  extends a
{
  public b()
  {
    GMTrace.i(10880225902592L, 81064);
    GMTrace.o(10880225902592L, 81064);
  }
  
  public final i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16569044303872L, 123449);
    paramContext = new c(paramContext, paramb, paramInt);
    GMTrace.o(16569044303872L, 123449);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(10880628555776L, 81067);
    GMTrace.o(10880628555776L, 81067);
    return Integer.MAX_VALUE;
  }
  
  public final int getType()
  {
    GMTrace.i(10880494338048L, 81066);
    GMTrace.o(10880494338048L, 81066);
    return 4192;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */