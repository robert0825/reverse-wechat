package com.tencent.mm.plugin.search.ui.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.b;

public final class d
  extends a
{
  public d()
  {
    GMTrace.i(11827131973632L, 88119);
    GMTrace.o(11827131973632L, 88119);
  }
  
  public final i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16484889788416L, 122822);
    paramContext = new com.tencent.mm.plugin.search.ui.c.d(paramContext, paramb, paramInt);
    GMTrace.o(16484889788416L, 122822);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(11827534626816L, 88122);
    GMTrace.o(11827534626816L, 88122);
    return Integer.MAX_VALUE;
  }
  
  public final int getType()
  {
    GMTrace.i(11827400409088L, 88121);
    GMTrace.o(11827400409088L, 88121);
    return 4112;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */