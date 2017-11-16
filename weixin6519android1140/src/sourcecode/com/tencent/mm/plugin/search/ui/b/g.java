package com.tencent.mm.plugin.search.ui.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.b;

public final class g
  extends a
{
  public g()
  {
    GMTrace.i(16485829312512L, 122829);
    GMTrace.o(16485829312512L, 122829);
  }
  
  public final i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16485963530240L, 122830);
    paramContext = new com.tencent.mm.plugin.search.ui.c.g(paramContext, paramb, paramInt);
    GMTrace.o(16485963530240L, 122830);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(16486231965696L, 122832);
    GMTrace.o(16486231965696L, 122832);
    return Integer.MAX_VALUE;
  }
  
  public final int getType()
  {
    GMTrace.i(16486097747968L, 122831);
    GMTrace.o(16486097747968L, 122831);
    return 4144;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */