package com.tencent.mm.sdk;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ay;

public class b<T>
  extends ay<T>
{
  private final Object mLock;
  
  public b()
  {
    super(20);
    GMTrace.i(13979581677568L, 104156);
    this.mLock = new Object();
    GMTrace.o(13979581677568L, 104156);
  }
  
  public final T bE()
  {
    GMTrace.i(13979715895296L, 104157);
    synchronized (this.mLock)
    {
      Object localObject2 = super.bE();
      GMTrace.o(13979715895296L, 104157);
      return (T)localObject2;
    }
  }
  
  public final boolean i(T paramT)
  {
    GMTrace.i(13979850113024L, 104158);
    synchronized (this.mLock)
    {
      boolean bool = super.i(paramT);
      GMTrace.o(13979850113024L, 104158);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */