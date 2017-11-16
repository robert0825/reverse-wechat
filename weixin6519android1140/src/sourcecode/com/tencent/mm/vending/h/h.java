package com.tencent.mm.vending.h;

import android.os.Handler;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;

public final class h
  extends d
{
  Looper mLooper;
  private String mType;
  public a xyO;
  
  private h(Handler paramHandler, String paramString)
  {
    this(new b(paramHandler), paramString);
    GMTrace.i(295681654784L, 2203);
    GMTrace.o(295681654784L, 2203);
  }
  
  private h(Looper paramLooper, a parama, String paramString)
  {
    GMTrace.i(295547437056L, 2202);
    this.mLooper = paramLooper;
    this.xyO = parama;
    this.mType = paramString;
    GMTrace.o(295547437056L, 2202);
  }
  
  public h(Looper paramLooper, String paramString)
  {
    this(new Handler(paramLooper), paramString);
    GMTrace.i(295950090240L, 2205);
    GMTrace.o(295950090240L, 2205);
  }
  
  public h(a parama, String paramString)
  {
    this(parama.getLooper(), parama, paramString);
    GMTrace.i(295815872512L, 2204);
    GMTrace.o(295815872512L, 2204);
  }
  
  public final void D(Runnable paramRunnable)
  {
    GMTrace.i(296352743424L, 2208);
    this.xyO.post(paramRunnable);
    GMTrace.o(296352743424L, 2208);
  }
  
  public final void cancel()
  {
    GMTrace.i(296218525696L, 2207);
    this.xyO.ck();
    GMTrace.o(296218525696L, 2207);
  }
  
  public final void g(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(296486961152L, 2209);
    if (paramLong >= 0L)
    {
      this.xyO.j(paramRunnable, paramLong);
      GMTrace.o(296486961152L, 2209);
      return;
    }
    this.xyO.post(paramRunnable);
    GMTrace.o(296486961152L, 2209);
  }
  
  public final String getType()
  {
    GMTrace.i(296084307968L, 2206);
    String str = this.mType;
    GMTrace.o(296084307968L, 2206);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\h\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */