package com.tencent.mm.plugin.search.ui.b;

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
    GMTrace.i(11826595102720L, 88115);
    GMTrace.o(11826595102720L, 88115);
  }
  
  public final i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16484621352960L, 122820);
    paramContext = new com.tencent.mm.plugin.search.ui.c.e(paramContext, paramb, paramInt);
    GMTrace.o(16484621352960L, 122820);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(11826997755904L, 88118);
    GMTrace.o(11826997755904L, 88118);
    return 32;
  }
  
  public final int getType()
  {
    GMTrace.i(11826863538176L, 88117);
    GMTrace.o(11826863538176L, 88117);
    return 32;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */