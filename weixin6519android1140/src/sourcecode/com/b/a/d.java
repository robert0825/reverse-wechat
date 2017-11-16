package com.b.a;

final class d
  extends h
{
  private final String aaC;
  
  d(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("string is null");
    }
    this.aaC = paramString;
  }
  
  final void a(i parami)
  {
    parami.C(this.aaC);
  }
  
  public final int asInt()
  {
    return Integer.parseInt(this.aaC, 10);
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
    paramObject = (d)paramObject;
    return this.aaC.equals(((d)paramObject).aaC);
  }
  
  public final int hashCode()
  {
    return this.aaC.hashCode();
  }
  
  public final boolean hq()
  {
    return true;
  }
  
  public final long hr()
  {
    return Long.parseLong(this.aaC, 10);
  }
  
  public final double hs()
  {
    return Double.parseDouble(this.aaC);
  }
  
  public final String toString()
  {
    return this.aaC;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */