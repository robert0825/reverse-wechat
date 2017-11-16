package com.tencent.mm.vending.g;

import com.tencent.gmtrace.GMTrace;
import java.util.Stack;

final class f
{
  private static f xyE;
  ThreadLocal<Stack<c>> xyF;
  
  static
  {
    GMTrace.i(288031244288L, 2146);
    xyE = null;
    xyE = new f();
    GMTrace.o(288031244288L, 2146);
  }
  
  private f()
  {
    GMTrace.i(287762808832L, 2144);
    this.xyF = new ThreadLocal();
    GMTrace.o(287762808832L, 2144);
  }
  
  public static f cko()
  {
    GMTrace.i(287897026560L, 2145);
    f localf = xyE;
    GMTrace.o(287897026560L, 2145);
    return localf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\g\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */