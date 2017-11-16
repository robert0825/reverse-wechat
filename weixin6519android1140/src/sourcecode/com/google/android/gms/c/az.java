package com.google.android.gms.c;

import java.io.IOException;
import java.lang.reflect.Array;

public final class az<M extends ay<M>, T>
{
  protected final Class<T> awY;
  protected final boolean awZ;
  public final int tag;
  protected final int type;
  
  private int af(Object paramObject)
  {
    int i = bh.cx(this.tag);
    switch (this.type)
    {
    default: 
      throw new IllegalArgumentException("Unknown type " + this.type);
    case 10: 
      paramObject = (be)paramObject;
      return ax.cq(i) * 2 + ((be)paramObject).mf();
    }
    return ax.b(i, (be)paramObject);
  }
  
  private void b(Object paramObject, ax paramax)
  {
    for (;;)
    {
      try
      {
        paramax.cr(this.tag);
        switch (this.type)
        {
        case 10: 
          throw new IllegalArgumentException("Unknown type " + this.type);
        }
      }
      catch (IOException paramObject)
      {
        throw new IllegalStateException((Throwable)paramObject);
      }
      paramObject = (be)paramObject;
      int i = bh.cx(this.tag);
      ((be)paramObject).a(paramax);
      paramax.am(i, 4);
      return;
      paramax.b((be)paramObject);
      return;
    }
  }
  
  final void a(Object paramObject, ax paramax)
  {
    if (this.awZ)
    {
      int j = Array.getLength(paramObject);
      int i = 0;
      while (i < j)
      {
        Object localObject = Array.get(paramObject, i);
        if (localObject != null) {
          b(localObject, paramax);
        }
        i += 1;
      }
    }
    b(paramObject, paramax);
  }
  
  final int ae(Object paramObject)
  {
    int i = 0;
    if (this.awZ)
    {
      int m = Array.getLength(paramObject);
      int j = 0;
      for (;;)
      {
        k = i;
        if (j >= m) {
          break;
        }
        k = i;
        if (Array.get(paramObject, j) != null) {
          k = i + af(Array.get(paramObject, j));
        }
        j += 1;
        i = k;
      }
    }
    int k = af(paramObject);
    return k;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */