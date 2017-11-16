package com.tencent.mm.plugin.sns.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  implements a
{
  public b()
  {
    GMTrace.i(20051323256832L, 149394);
    GMTrace.o(20051323256832L, 149394);
  }
  
  public final int baI()
  {
    GMTrace.i(20051457474560L, 149395);
    GMTrace.o(20051457474560L, 149395);
    return 11855;
  }
  
  public final void i(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20051725910016L, 149397);
    switch (paramInt)
    {
    default: 
      w.e("Kv_11855", "unknown type %d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20051725910016L, 149397);
      return;
    case 0: 
    case 1: 
      g.ork.i(11855, paramVarArgs);
      GMTrace.o(20051725910016L, 149397);
      return;
    }
    g.ork.i(14646, paramVarArgs);
    GMTrace.o(20051725910016L, 149397);
  }
  
  public final void k(Object... paramVarArgs)
  {
    GMTrace.i(20051591692288L, 149396);
    i(0, paramVarArgs);
    GMTrace.o(20051591692288L, 149396);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */