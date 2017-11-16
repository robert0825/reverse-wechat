package com.tencent.mm.plugin.emoji.sync;

import com.tencent.gmtrace.GMTrace;

public abstract class d<T>
  implements Runnable
{
  public d()
  {
    GMTrace.i(11328781549568L, 84406);
    GMTrace.o(11328781549568L, 84406);
  }
  
  public abstract void a(e parame);
  
  public abstract void cancel();
  
  public abstract boolean equals(Object paramObject);
  
  public abstract String getKey();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\sync\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */