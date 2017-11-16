package com.tencent.mm.plugin.appbrand.widget.input.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class d
{
  public static Integer aU(Object paramObject)
  {
    GMTrace.i(17283485270016L, 128772);
    if (paramObject == null)
    {
      GMTrace.o(17283485270016L, 128772);
      return null;
    }
    if ((paramObject instanceof Integer))
    {
      paramObject = (Integer)paramObject;
      GMTrace.o(17283485270016L, 128772);
      return (Integer)paramObject;
    }
    int i;
    if ((paramObject instanceof Number))
    {
      i = ((Number)paramObject).intValue();
      GMTrace.o(17283485270016L, 128772);
      return Integer.valueOf(i);
    }
    if ((paramObject instanceof String)) {
      try
      {
        i = (int)Double.parseDouble((String)paramObject);
        GMTrace.o(17283485270016L, 128772);
        return Integer.valueOf(i);
      }
      catch (NumberFormatException paramObject) {}
    }
    GMTrace.o(17283485270016L, 128772);
    return null;
  }
  
  static <T extends Enum> T g(String paramString, Class<T> paramClass)
  {
    GMTrace.i(17283351052288L, 128771);
    if (!paramClass.isEnum()) {
      i = 0;
    }
    Object[] arrayOfObject;
    while ((bg.nm(paramString)) || (paramString.length() > i))
    {
      GMTrace.o(17283351052288L, 128771);
      return null;
      arrayOfObject = paramClass.getEnumConstants();
      int k = arrayOfObject.length;
      j = 0;
      i = 0;
      while (j < k)
      {
        i = Math.max(((Enum)arrayOfObject[j]).name().length(), i);
        j += 1;
      }
    }
    paramString = paramString.toUpperCase();
    paramClass = (Enum[])paramClass.getEnumConstants();
    int j = paramClass.length;
    int i = 0;
    while (i < j)
    {
      arrayOfObject = paramClass[i];
      if (paramString.equals(((Enum)arrayOfObject).name()))
      {
        paramString = (Enum)arrayOfObject;
        GMTrace.o(17283351052288L, 128771);
        return paramString;
      }
      i += 1;
    }
    GMTrace.o(17283351052288L, 128771);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */