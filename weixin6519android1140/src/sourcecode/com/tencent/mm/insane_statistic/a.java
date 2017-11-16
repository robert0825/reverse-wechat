package com.tencent.mm.insane_statistic;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelstat.b;
import com.tencent.mm.modelstat.q.a;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.g;

public final class a
  implements q.a
{
  public a()
  {
    GMTrace.i(16312017354752L, 121534);
    GMTrace.o(16312017354752L, 121534);
  }
  
  public final void f(au paramau)
  {
    GMTrace.i(16312151572480L, 121535);
    if (paramau.aCp())
    {
      b.gWv.a(paramau, g.g(paramau));
      GMTrace.o(16312151572480L, 121535);
      return;
    }
    b.gWv.f(paramau);
    GMTrace.o(16312151572480L, 121535);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\insane_statistic\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */