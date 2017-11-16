package com.tencent.mm.plugin.label;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class c
{
  public static String aN(List<String> paramList)
  {
    GMTrace.i(7322113933312L, 54554);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramList != null) && (paramList.size() > 0))
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append((String)paramList.get(i));
        if (i < j - 1) {
          localStringBuilder.append(",");
        }
        i += 1;
      }
      localStringBuilder.append("\000");
    }
    paramList = localStringBuilder.toString();
    GMTrace.o(7322113933312L, 54554);
    return paramList;
  }
  
  public static String cK(String paramString1, String paramString2)
  {
    GMTrace.i(7321845497856L, 54552);
    w.d("MicroMsg.Label.LabelUtils", "original:%s,waitToAddLabel:%s", new Object[] { paramString1, paramString2 });
    if (bg.nm(paramString2))
    {
      GMTrace.o(7321845497856L, 54552);
      return paramString1;
    }
    if (bg.nm(paramString1))
    {
      paramString1 = paramString2 + "\000";
      GMTrace.o(7321845497856L, 54552);
      return paramString1;
    }
    String str = paramString1;
    if (paramString1.endsWith("\000")) {
      str = paramString1.replace("\000", "");
    }
    if (bg.g(str.split(",")).contains(paramString2))
    {
      paramString1 = str + "\000";
      GMTrace.o(7321845497856L, 54552);
      return paramString1;
    }
    paramString1 = str + "," + paramString2 + "\000";
    GMTrace.o(7321845497856L, 54552);
    return paramString1;
  }
  
  public static String cL(String paramString1, String paramString2)
  {
    GMTrace.i(7321979715584L, 54553);
    w.d("MicroMsg.Label.LabelUtils", "original:%s,waitToDelLabel:%s", new Object[] { paramString1, paramString2 });
    if (bg.nm(paramString2))
    {
      GMTrace.o(7321979715584L, 54553);
      return paramString1;
    }
    if (bg.nm(paramString1))
    {
      GMTrace.o(7321979715584L, 54553);
      return "";
    }
    String str = paramString1;
    if (paramString1.endsWith("\000")) {
      str = paramString1.replace("\000", "");
    }
    paramString1 = bg.g(str.split(","));
    if (paramString1.contains(paramString2))
    {
      paramString1.remove(paramString2);
      paramString1 = aN(paramString1);
      GMTrace.o(7321979715584L, 54553);
      return paramString1;
    }
    GMTrace.o(7321979715584L, 54553);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */