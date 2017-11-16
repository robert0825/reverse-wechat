package com.b.a;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;

public abstract class h
  implements Serializable
{
  @Deprecated
  public static final h aat = a.aat;
  @Deprecated
  public static final h aau = a.aau;
  @Deprecated
  public static final h aav = a.aav;
  
  private String a(l paraml)
  {
    StringWriter localStringWriter = new StringWriter();
    if (paraml == null) {
      try
      {
        throw new NullPointerException("config is null");
      }
      catch (IOException paraml)
      {
        throw new RuntimeException(paraml);
      }
    }
    m localm = new m(localStringWriter);
    a(paraml.a(localm));
    localm.flush();
    return localStringWriter.toString();
  }
  
  abstract void a(i parami);
  
  public int asInt()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }
  
  public boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public boolean hD()
  {
    return false;
  }
  
  public String hE()
  {
    throw new UnsupportedOperationException("Not a string: " + toString());
  }
  
  public int hashCode()
  {
    return super.hashCode();
  }
  
  public b hn()
  {
    throw new UnsupportedOperationException("Not an array: " + toString());
  }
  
  public boolean ho()
  {
    return false;
  }
  
  public boolean hp()
  {
    throw new UnsupportedOperationException("Not a boolean: " + toString());
  }
  
  public boolean hq()
  {
    return false;
  }
  
  public long hr()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }
  
  public double hs()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }
  
  public boolean ht()
  {
    return false;
  }
  
  public e hu()
  {
    throw new UnsupportedOperationException("Not an object: " + toString());
  }
  
  public boolean isArray()
  {
    return false;
  }
  
  public String toString()
  {
    return a(l.abd);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */