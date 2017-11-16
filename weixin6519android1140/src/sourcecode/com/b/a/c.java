package com.b.a;

final class c
  extends h
{
  private final boolean aaA;
  private final boolean aaB;
  private final boolean aaz;
  private final String value;
  
  c(String paramString)
  {
    this.value = paramString;
    this.aaz = "null".equals(paramString);
    this.aaA = "true".equals(paramString);
    this.aaB = "false".equals(paramString);
  }
  
  final void a(i parami)
  {
    parami.B(this.value);
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
    paramObject = (c)paramObject;
    return this.value.equals(((c)paramObject).value);
  }
  
  public final int hashCode()
  {
    return this.value.hashCode();
  }
  
  public final boolean ho()
  {
    return (this.aaA) || (this.aaB);
  }
  
  public final boolean hp()
  {
    if (this.aaz) {
      return super.hp();
    }
    return this.aaA;
  }
  
  public final String toString()
  {
    return this.value;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */