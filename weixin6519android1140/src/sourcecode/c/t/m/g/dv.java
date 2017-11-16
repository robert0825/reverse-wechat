package c.t.m.g;

import java.util.Iterator;

public final class dv
{
  private final String a;
  
  public dv(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.a = paramString;
  }
  
  public final StringBuilder a(StringBuilder paramStringBuilder, Iterator<?> paramIterator)
  {
    Object localObject;
    if (paramIterator.hasNext())
    {
      localObject = paramIterator.next();
      if (localObject != null) {
        paramStringBuilder.append(localObject.toString());
      }
    }
    while (paramIterator.hasNext())
    {
      localObject = paramIterator.next();
      if (localObject != null)
      {
        paramStringBuilder.append(this.a);
        paramStringBuilder.append(localObject.toString());
      }
    }
    return paramStringBuilder;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */