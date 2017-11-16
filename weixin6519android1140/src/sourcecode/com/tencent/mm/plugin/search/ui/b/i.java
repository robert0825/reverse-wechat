package com.tencent.mm.plugin.search.ui.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a;
import com.tencent.mm.plugin.fts.d.i.b;

public final class i
  extends a
{
  public i()
  {
    GMTrace.i(11830353199104L, 88143);
    GMTrace.o(11830353199104L, 88143);
  }
  
  public final com.tencent.mm.plugin.fts.d.i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16484487135232L, 122819);
    paramContext = new com.tencent.mm.plugin.search.ui.c.i(paramContext, paramb, paramInt);
    GMTrace.o(16484487135232L, 122819);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(11830755852288L, 88146);
    GMTrace.o(11830755852288L, 88146);
    return Integer.MAX_VALUE;
  }
  
  public final int getType()
  {
    GMTrace.i(11830621634560L, 88145);
    GMTrace.o(11830621634560L, 88145);
    return 4160;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */