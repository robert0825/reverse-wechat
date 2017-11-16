package com.tencent.mm.ipcinvoker.extension;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.e.b;
import junit.framework.Assert;

public final class e<T>
{
  private volatile T fVM;
  private Class<T> targetClass;
  
  public e(Class<T> paramClass)
  {
    GMTrace.i(18715588427776L, 139442);
    Assert.assertNotNull(paramClass);
    this.targetClass = paramClass;
    GMTrace.o(18715588427776L, 139442);
  }
  
  public final T get()
  {
    GMTrace.i(18715722645504L, 139443);
    if (this.fVM == null) {}
    try
    {
      if (this.fVM == null) {
        this.fVM = b.e(this.targetClass);
      }
      Object localObject1 = this.fVM;
      GMTrace.o(18715722645504L, 139443);
      return (T)localObject1;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\extension\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */