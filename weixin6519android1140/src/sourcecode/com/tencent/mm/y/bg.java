package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.k;

public final class bg
{
  public static a goB;
  
  static
  {
    GMTrace.i(13488344793088L, 100496);
    goB = null;
    GMTrace.o(13488344793088L, 100496);
  }
  
  public static k a(k paramk)
  {
    GMTrace.i(13488210575360L, 100495);
    if (goB == null)
    {
      GMTrace.o(13488210575360L, 100495);
      return paramk;
    }
    paramk = goB.Bt();
    GMTrace.o(13488210575360L, 100495);
    return paramk;
  }
  
  public static abstract interface a
  {
    public abstract k Bt();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */