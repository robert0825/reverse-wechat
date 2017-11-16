package com.tencent.mm.memory;

import com.tencent.gmtrace.GMTrace;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class d<T, S>
{
  protected Queue<T> ghF;
  protected S ghG;
  
  public d(S paramS)
  {
    GMTrace.i(1287819100160L, 9595);
    this.ghF = new ConcurrentLinkedQueue();
    this.ghG = paramS;
    GMTrace.o(1287819100160L, 9595);
  }
  
  public final T pop()
  {
    GMTrace.i(1287953317888L, 9596);
    Object localObject = this.ghF.poll();
    GMTrace.o(1287953317888L, 9596);
    return (T)localObject;
  }
  
  public final void put(T paramT)
  {
    GMTrace.i(1288087535616L, 9597);
    this.ghF.add(paramT);
    GMTrace.o(1288087535616L, 9597);
  }
  
  public final int size()
  {
    GMTrace.i(1288221753344L, 9598);
    int i = this.ghF.size();
    GMTrace.o(1288221753344L, 9598);
    return i;
  }
  
  public final S yf()
  {
    GMTrace.i(1288355971072L, 9599);
    Object localObject = this.ghG;
    GMTrace.o(1288355971072L, 9599);
    return (S)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\memory\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */