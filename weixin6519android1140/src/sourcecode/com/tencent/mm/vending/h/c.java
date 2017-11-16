package com.tencent.mm.vending.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.f.a;

public final class c
  extends d
{
  public c()
  {
    GMTrace.i(291520905216L, 2172);
    a.printErrStackTrace("Vending.NoLooperScheduler", new Exception("This is not a handler thread!"), "This is not a handler thread!", new Object[0]);
    GMTrace.o(291520905216L, 2172);
  }
  
  public final void D(Runnable paramRunnable)
  {
    GMTrace.i(291655122944L, 2173);
    a.w("Vending.NoLooperScheduler", "This is not a handler thread!", new Object[0]);
    paramRunnable.run();
    GMTrace.o(291655122944L, 2173);
  }
  
  public final void cancel()
  {
    GMTrace.i(292057776128L, 2176);
    GMTrace.o(292057776128L, 2176);
  }
  
  public final void g(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(291789340672L, 2174);
    a.w("Vending.NoLooperScheduler", "This is not a handler thread!", new Object[0]);
    paramRunnable.run();
    GMTrace.o(291789340672L, 2174);
  }
  
  public final String getType()
  {
    GMTrace.i(291923558400L, 2175);
    String str = Thread.currentThread().toString();
    GMTrace.o(291923558400L, 2175);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */