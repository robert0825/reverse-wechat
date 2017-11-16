package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class k
{
  public int backgroundColor;
  public Object data;
  public int end;
  public String hNz;
  public int linkColor;
  public int start;
  public int type;
  public String url;
  public String username;
  
  public k(String paramString, int paramInt, Object paramObject)
  {
    GMTrace.i(938853007360L, 6995);
    this.url = paramString;
    this.data = paramObject;
    this.type = paramInt;
    GMTrace.o(938853007360L, 6995);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(939255660544L, 6998);
    if ((paramObject instanceof k))
    {
      if (hashCode() == ((k)paramObject).hashCode())
      {
        GMTrace.o(939255660544L, 6998);
        return true;
      }
      GMTrace.o(939255660544L, 6998);
      return false;
    }
    boolean bool = super.equals(paramObject);
    GMTrace.o(939255660544L, 6998);
    return bool;
  }
  
  public final int hashCode()
  {
    GMTrace.i(939121442816L, 6997);
    int j = super.hashCode();
    int i = j;
    if (!bg.nm(this.url)) {
      i = j + this.url.hashCode();
    }
    j = i + this.type + this.end + this.start;
    i = j;
    if (this.data != null) {
      i = j + this.data.hashCode();
    }
    GMTrace.o(939121442816L, 6997);
    return i;
  }
  
  public final <T> T t(Class<T> paramClass)
  {
    GMTrace.i(938987225088L, 6996);
    if (paramClass.isInstance(this.data))
    {
      paramClass = paramClass.cast(this.data);
      GMTrace.o(938987225088L, 6996);
      return paramClass;
    }
    GMTrace.o(938987225088L, 6996);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */