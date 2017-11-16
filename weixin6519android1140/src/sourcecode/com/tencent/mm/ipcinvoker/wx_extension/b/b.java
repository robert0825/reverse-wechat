package com.tencent.mm.ipcinvoker.wx_extension.b;

import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  private final List<b<a>> fVZ;
  private final List<Object> fWa;
  
  public b()
  {
    GMTrace.i(20277748563968L, 151081);
    this.fVZ = new LinkedList();
    this.fWa = new LinkedList();
    GMTrace.o(20277748563968L, 151081);
  }
  
  private void vW()
  {
    try
    {
      GMTrace.i(20278285434880L, 151085);
      Iterator localIterator = this.fWa.iterator();
      while (localIterator.hasNext()) {
        localIterator.next();
      }
      GMTrace.o(20278285434880L, 151085);
    }
    finally {}
  }
  
  private void vX()
  {
    try
    {
      GMTrace.i(20278419652608L, 151086);
      Iterator localIterator = this.fWa.iterator();
      while (localIterator.hasNext()) {
        localIterator.next();
      }
      GMTrace.o(20278419652608L, 151086);
    }
    finally {}
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(20277882781696L, 151082);
    if (c(parama))
    {
      GMTrace.o(20277882781696L, 151082);
      return false;
    }
    synchronized (this.fVZ)
    {
      this.fVZ.add(new b(parama));
      vW();
      GMTrace.o(20277882781696L, 151082);
      return true;
    }
  }
  
  public final boolean b(a parama)
  {
    GMTrace.i(20278016999424L, 151083);
    if (parama == null)
    {
      GMTrace.o(20278016999424L, 151083);
      return false;
    }
    synchronized (this.fVZ)
    {
      boolean bool = this.fVZ.remove(new b(parama));
      vX();
      GMTrace.o(20278016999424L, 151083);
      return bool;
    }
  }
  
  public final boolean c(a parama)
  {
    GMTrace.i(20278151217152L, 151084);
    if (parama == null)
    {
      GMTrace.o(20278151217152L, 151084);
      return false;
    }
    synchronized (this.fVZ)
    {
      Iterator localIterator = this.fVZ.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (b)localIterator.next();
        if (localObject != null)
        {
          localObject = (a)((b)localObject).get();
          if ((localObject != null) && (parama.equals(localObject)))
          {
            GMTrace.o(20278151217152L, 151084);
            return true;
          }
        }
      }
      GMTrace.o(20278151217152L, 151084);
      return false;
    }
  }
  
  public final int size()
  {
    GMTrace.i(20378411859968L, 151831);
    synchronized (this.fVZ)
    {
      int i = this.fVZ.size();
      GMTrace.o(20378411859968L, 151831);
      return i;
    }
  }
  
  private static final class a
  {
    public static b fWb;
    
    static
    {
      GMTrace.i(20278553870336L, 151087);
      fWb = new b();
      GMTrace.o(20278553870336L, 151087);
    }
  }
  
  private static final class b<T>
    extends WeakReference<T>
  {
    public b(T paramT)
    {
      super();
      GMTrace.i(20277480128512L, 151079);
      GMTrace.o(20277480128512L, 151079);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(20277614346240L, 151080);
      if (paramObject == this)
      {
        GMTrace.o(20277614346240L, 151080);
        return true;
      }
      if (!(paramObject instanceof b))
      {
        GMTrace.o(20277614346240L, 151080);
        return false;
      }
      paramObject = ((b)paramObject).get();
      Object localObject = get();
      if ((paramObject == localObject) || ((localObject != null) && (localObject.equals(paramObject))))
      {
        GMTrace.o(20277614346240L, 151080);
        return true;
      }
      GMTrace.o(20277614346240L, 151080);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\wx_extension\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */