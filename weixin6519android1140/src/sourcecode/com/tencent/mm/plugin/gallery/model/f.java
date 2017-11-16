package com.tencent.mm.plugin.gallery.model;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class f<E>
  extends LinkedList<E>
{
  private byte[] gCf;
  
  public f()
  {
    GMTrace.i(11898938458112L, 88654);
    this.gCf = new byte[0];
    GMTrace.o(11898938458112L, 88654);
  }
  
  public final E aDe()
  {
    GMTrace.i(11899072675840L, 88655);
    synchronized (this.gCf)
    {
      if (size() > 0)
      {
        Object localObject1 = super.poll();
        GMTrace.o(11899072675840L, 88655);
        return (E)localObject1;
      }
      GMTrace.o(11899072675840L, 88655);
      return null;
    }
  }
  
  public final boolean add(E paramE)
  {
    GMTrace.i(11899475329024L, 88658);
    synchronized (this.gCf)
    {
      boolean bool = super.add(paramE);
      GMTrace.o(11899475329024L, 88658);
      return bool;
    }
  }
  
  public final boolean ba(E paramE)
  {
    GMTrace.i(11899206893568L, 88656);
    synchronized (this.gCf)
    {
      boolean bool = super.contains(paramE);
      GMTrace.o(11899206893568L, 88656);
      return bool;
    }
  }
  
  public final void bb(E paramE)
  {
    GMTrace.i(11899341111296L, 88657);
    synchronized (this.gCf)
    {
      if (ba(paramE)) {
        super.remove(paramE);
      }
      GMTrace.o(11899341111296L, 88657);
      return;
    }
  }
  
  public final int size()
  {
    GMTrace.i(11899609546752L, 88659);
    synchronized (this.gCf)
    {
      int i = super.size();
      GMTrace.o(11899609546752L, 88659);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */