package com.b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
  extends h
  implements Iterable<b>
{
  public final List<String> aaD = new ArrayList();
  public transient a aaE = new a();
  public final List<h> aaw = new ArrayList();
  
  public final e a(String paramString, h paramh)
  {
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    if (paramh == null) {
      throw new NullPointerException("value is null");
    }
    this.aaE.d(paramString, this.aaD.size());
    this.aaD.add(paramString);
    this.aaw.add(paramh);
    return this;
  }
  
  final void a(i parami)
  {
    parami.hI();
    Iterator localIterator1 = this.aaD.iterator();
    Iterator localIterator2 = this.aaw.iterator();
    for (int i = 1; localIterator1.hasNext(); i = 0)
    {
      if (i == 0) {
        parami.hL();
      }
      parami.D((String)localIterator1.next());
      parami.hK();
      ((h)localIterator2.next()).a(parami);
    }
    parami.hJ();
  }
  
  public final e b(String paramString, h paramh)
  {
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    if (paramh == null) {
      throw new NullPointerException("value is null");
    }
    int i = indexOf(paramString);
    if (i != -1)
    {
      this.aaw.set(i, paramh);
      return this;
    }
    this.aaE.d(paramString, this.aaD.size());
    this.aaD.add(paramString);
    this.aaw.add(paramh);
    return this;
  }
  
  public final e c(String paramString, int paramInt)
  {
    b(paramString, a.bL(paramInt));
    return this;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (e)paramObject;
    } while ((this.aaD.equals(((e)paramObject).aaD)) && (this.aaw.equals(((e)paramObject).aaw)));
    return false;
  }
  
  public final int hashCode()
  {
    return (this.aaD.hashCode() + 31) * 31 + this.aaw.hashCode();
  }
  
  public final boolean ht()
  {
    return true;
  }
  
  public final e hu()
  {
    return this;
  }
  
  public final int indexOf(String paramString)
  {
    a locala = this.aaE;
    int i = locala.S(paramString);
    i = (locala.aaI[i] & 0xFF) - 1;
    if ((i != -1) && (paramString.equals(this.aaD.get(i)))) {
      return i;
    }
    return this.aaD.lastIndexOf(paramString);
  }
  
  public final Iterator<b> iterator()
  {
    new Iterator()
    {
      public final boolean hasNext()
      {
        return this.aaF.hasNext();
      }
      
      public final void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
  }
  
  public final h y(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    int i = indexOf(paramString);
    if (i != -1) {
      return (h)this.aaw.get(i);
    }
    return null;
  }
  
  public static final class a
  {
    final byte[] aaI = new byte[32];
    
    final int S(Object paramObject)
    {
      return paramObject.hashCode() & this.aaI.length - 1;
    }
    
    final void d(String paramString, int paramInt)
    {
      int i = S(paramString);
      if (paramInt < 255)
      {
        this.aaI[i] = ((byte)(paramInt + 1));
        return;
      }
      this.aaI[i] = 0;
    }
    
    public final void remove(int paramInt)
    {
      int i = 0;
      if (i < this.aaI.length)
      {
        if (this.aaI[i] == paramInt + 1) {
          this.aaI[i] = 0;
        }
        for (;;)
        {
          i += 1;
          break;
          if (this.aaI[i] > paramInt + 1)
          {
            byte[] arrayOfByte = this.aaI;
            arrayOfByte[i] = ((byte)(arrayOfByte[i] - 1));
          }
        }
      }
    }
  }
  
  public static final class b
  {
    public final h aaJ;
    public final String name;
    
    b(String paramString, h paramh)
    {
      this.name = paramString;
      this.aaJ = paramh;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (b)paramObject;
      } while ((this.name.equals(((b)paramObject).name)) && (this.aaJ.equals(((b)paramObject).aaJ)));
      return false;
    }
    
    public final int hashCode()
    {
      return (this.name.hashCode() + 31) * 31 + this.aaJ.hashCode();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */