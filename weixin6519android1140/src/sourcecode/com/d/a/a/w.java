package com.d.a.a;

import android.content.Context;
import android.os.Handler;

final class w
  extends n
{
  private static w aJs;
  private boolean aJt;
  private int aJu;
  private long aJv;
  private long aJw;
  
  static w og()
  {
    if (aJs == null) {
      aJs = new w();
    }
    return aJs;
  }
  
  final void a(int paramInt, String paramString, long paramLong1, long paramLong2)
  {
    if (this.aJt) {
      stop();
    }
    super.a(paramInt, paramString, paramLong1, paramLong2);
  }
  
  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    if (this.aJt) {
      if (k.nJ().isReady) {
        k.nJ().nF();
      }
    }
    for (;;)
    {
      super.a(paramContext, paramHandler, parama);
      return;
      if (!k.nJ().isReady) {
        try
        {
          k.nJ().a(paramContext, new m[] { this });
        }
        catch (Exception localException) {}
      }
    }
  }
  
  final void a(Handler paramHandler, d.a parama)
  {
    try
    {
      this.aJt = false;
      super.a(paramHandler, parama);
      return;
    }
    finally
    {
      paramHandler = finally;
      throw paramHandler;
    }
  }
  
  public final void a(p paramp)
  {
    long l = paramp.aGA;
    if ((this.aJt) && (l - this.aJw > this.aJv)) {
      stop();
    }
    for (int i = 1; i != 0; i = 0) {
      return;
    }
    super.a(paramp);
  }
  
  final void a(x paramx, long paramLong1, long paramLong2)
  {
    if (paramx.aJB == null) {
      paramx.aJB = new x.a();
    }
    float f = paramx.aJB.aJE;
    if ((this.aJt) && (f >= this.aJu)) {
      stop();
    }
    for (int i = 1; i != 0; i = 0) {
      return;
    }
    super.a(paramx, paramLong1, paramLong2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */