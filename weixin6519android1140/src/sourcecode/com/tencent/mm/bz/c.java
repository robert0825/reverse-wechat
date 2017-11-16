package com.tencent.mm.bz;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.vending.h.a;

public final class c
  implements a
{
  private ae mHandler;
  
  private c(ae paramae)
  {
    GMTrace.i(13617059594240L, 101455);
    this.mHandler = paramae;
    GMTrace.o(13617059594240L, 101455);
  }
  
  public static c c(ae paramae)
  {
    GMTrace.i(13617193811968L, 101456);
    paramae = new c(paramae);
    GMTrace.o(13617193811968L, 101456);
    return paramae;
  }
  
  public final void ck()
  {
    GMTrace.i(13617730682880L, 101460);
    this.mHandler.removeCallbacksAndMessages(null);
    GMTrace.o(13617730682880L, 101460);
  }
  
  public final Looper getLooper()
  {
    GMTrace.i(13617596465152L, 101459);
    Looper localLooper = this.mHandler.getLooper();
    GMTrace.o(13617596465152L, 101459);
    return localLooper;
  }
  
  public final void j(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(13617462247424L, 101458);
    this.mHandler.postDelayed(paramRunnable, paramLong);
    GMTrace.o(13617462247424L, 101458);
  }
  
  public final void post(Runnable paramRunnable)
  {
    GMTrace.i(13617328029696L, 101457);
    this.mHandler.post(paramRunnable);
    GMTrace.o(13617328029696L, 101457);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bz\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */