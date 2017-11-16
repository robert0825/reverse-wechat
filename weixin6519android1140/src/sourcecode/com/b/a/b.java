package com.b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
  extends h
  implements Iterable<h>
{
  public final List<h> aaw = new ArrayList();
  
  public final b a(h paramh)
  {
    if (paramh == null) {
      throw new NullPointerException("value is null");
    }
    this.aaw.add(paramh);
    return this;
  }
  
  final void a(i parami)
  {
    parami.hF();
    Iterator localIterator = iterator();
    for (int i = 1; localIterator.hasNext(); i = 0)
    {
      if (i == 0) {
        parami.hH();
      }
      ((h)localIterator.next()).a(parami);
    }
    parami.hG();
  }
  
  public final b ac(boolean paramBoolean)
  {
    this.aaw.add(a.ab(paramBoolean));
    return this;
  }
  
  public final b bM(int paramInt)
  {
    this.aaw.add(a.bL(paramInt));
    return this;
  }
  
  public final h bN(int paramInt)
  {
    return (h)this.aaw.get(paramInt);
  }
  
  public final b e(double paramDouble)
  {
    this.aaw.add(a.d(paramDouble));
    return this;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramObject == null);
      bool1 = bool2;
    } while (getClass() != paramObject.getClass());
    paramObject = (b)paramObject;
    return this.aaw.equals(((b)paramObject).aaw);
  }
  
  public final b h(long paramLong)
  {
    this.aaw.add(a.g(paramLong));
    return this;
  }
  
  public final int hashCode()
  {
    return this.aaw.hashCode();
  }
  
  public final b hn()
  {
    return this;
  }
  
  public final boolean isArray()
  {
    return true;
  }
  
  public final Iterator<h> iterator()
  {
    new Iterator()
    {
      public final boolean hasNext()
      {
        return this.aax.hasNext();
      }
      
      public final void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */