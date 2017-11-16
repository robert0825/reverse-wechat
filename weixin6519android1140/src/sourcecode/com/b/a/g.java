package com.b.a;

final class g
  extends h
{
  private final String aaC;
  
  g(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("string is null");
    }
    this.aaC = paramString;
  }
  
  final void a(i parami)
  {
    parami.writeString(this.aaC);
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
    paramObject = (g)paramObject;
    return this.aaC.equals(((g)paramObject).aaC);
  }
  
  public final boolean hD()
  {
    return true;
  }
  
  public final String hE()
  {
    return this.aaC;
  }
  
  public final int hashCode()
  {
    return this.aaC.hashCode();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */