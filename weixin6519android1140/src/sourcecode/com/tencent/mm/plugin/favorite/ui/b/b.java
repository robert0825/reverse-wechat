package com.tencent.mm.plugin.favorite.ui.b;

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
    GMTrace.i(6437619105792L, 47964);
    GMTrace.o(6437619105792L, 47964);
  }
  
  public final i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16649843376128L, 124051);
    paramContext = new c(paramContext, paramb, paramInt);
    GMTrace.o(16649843376128L, 124051);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(6438021758976L, 47967);
    GMTrace.o(6438021758976L, 47967);
    return Integer.MAX_VALUE;
  }
  
  public final int getType()
  {
    GMTrace.i(6437887541248L, 47966);
    GMTrace.o(6437887541248L, 47966);
    return 4176;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */