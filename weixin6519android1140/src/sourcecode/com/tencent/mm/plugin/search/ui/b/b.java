package com.tencent.mm.plugin.search.ui.b;

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
    GMTrace.i(11829279457280L, 88135);
    GMTrace.o(11829279457280L, 88135);
  }
  
  public final i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16484352917504L, 122818);
    paramContext = new com.tencent.mm.plugin.search.ui.c.b(paramContext, paramb, paramInt);
    GMTrace.o(16484352917504L, 122818);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(11829682110464L, 88138);
    GMTrace.o(11829682110464L, 88138);
    return Integer.MAX_VALUE;
  }
  
  public final int getType()
  {
    GMTrace.i(11829547892736L, 88137);
    GMTrace.o(11829547892736L, 88137);
    return 4128;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */