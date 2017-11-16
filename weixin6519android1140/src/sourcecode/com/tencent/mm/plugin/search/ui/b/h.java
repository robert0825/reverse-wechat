package com.tencent.mm.plugin.search.ui.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.b;

public final class h
  extends a
{
  public h()
  {
    GMTrace.i(16485292441600L, 122825);
    GMTrace.o(16485292441600L, 122825);
  }
  
  public final i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16485426659328L, 122826);
    paramContext = new com.tencent.mm.plugin.search.ui.c.h(paramContext, paramb, paramInt);
    GMTrace.o(16485426659328L, 122826);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(16485695094784L, 122828);
    GMTrace.o(16485695094784L, 122828);
    return 80;
  }
  
  public final int getType()
  {
    GMTrace.i(16485560877056L, 122827);
    GMTrace.o(16485560877056L, 122827);
    return 80;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */