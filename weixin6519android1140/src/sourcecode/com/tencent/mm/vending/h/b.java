package com.tencent.mm.vending.h;

import android.os.Handler;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;

public final class b
  implements a
{
  public Handler mHandler;
  
  public b(Handler paramHandler)
  {
    GMTrace.i(290849816576L, 2167);
    this.mHandler = paramHandler;
    GMTrace.o(290849816576L, 2167);
  }
  
  public final void ck()
  {
    GMTrace.i(291386687488L, 2171);
    this.mHandler.removeCallbacksAndMessages(null);
    GMTrace.o(291386687488L, 2171);
  }
  
  public final Looper getLooper()
  {
    GMTrace.i(291252469760L, 2170);
    Looper localLooper = this.mHandler.getLooper();
    GMTrace.o(291252469760L, 2170);
    return localLooper;
  }
  
  public final void j(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(291118252032L, 2169);
    this.mHandler.postDelayed(paramRunnable, paramLong);
    GMTrace.o(291118252032L, 2169);
  }
  
  public final void post(Runnable paramRunnable)
  {
    GMTrace.i(290984034304L, 2168);
    this.mHandler.post(paramRunnable);
    GMTrace.o(290984034304L, 2168);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */