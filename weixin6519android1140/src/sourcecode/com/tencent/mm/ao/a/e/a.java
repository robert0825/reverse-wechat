package com.tencent.mm.ao.a.e;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.LinkedBlockingDeque;

public final class a<E>
  extends LinkedBlockingDeque<E>
{
  public a()
  {
    GMTrace.i(13723225817088L, 102246);
    GMTrace.o(13723225817088L, 102246);
  }
  
  public final boolean offer(E paramE)
  {
    GMTrace.i(13723360034816L, 102247);
    boolean bool = super.offerFirst(paramE);
    GMTrace.o(13723360034816L, 102247);
    return bool;
  }
  
  public final E remove()
  {
    GMTrace.i(13723494252544L, 102248);
    Object localObject = super.removeFirst();
    GMTrace.o(13723494252544L, 102248);
    return (E)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */