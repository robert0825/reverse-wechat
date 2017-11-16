package com.tencent.mm.plugin.search.ui.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.b;

public final class a
  extends com.tencent.mm.plugin.fts.d.a
{
  public a()
  {
    GMTrace.i(11828742586368L, 88131);
    GMTrace.o(11828742586368L, 88131);
  }
  
  public final i a(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16484755570688L, 122821);
    paramContext = new com.tencent.mm.plugin.search.ui.c.a(paramContext, paramb, paramInt);
    GMTrace.o(16484755570688L, 122821);
    return paramContext;
  }
  
  public final int getPriority()
  {
    GMTrace.i(11829145239552L, 88134);
    GMTrace.o(11829145239552L, 88134);
    return Integer.MAX_VALUE;
  }
  
  public final int getType()
  {
    GMTrace.i(11829011021824L, 88133);
    GMTrace.o(11829011021824L, 88133);
    return 8192;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */