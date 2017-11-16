package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class aw
{
  public static Map<String, String> Se(String paramString)
  {
    GMTrace.i(13904017096704L, 103593);
    if ((paramString == null) || (!paramString.startsWith("~SEMI_XML~")))
    {
      GMTrace.o(13904017096704L, 103593);
      return null;
    }
    String str1 = paramString.substring(10);
    paramString = new HashMap();
    int j = str1.length();
    int i = 0;
    for (;;)
    {
      if (i < j - 4)
      {
        int k = i + 1;
        try
        {
          int m = str1.charAt(i);
          i = k + 1;
          k = (m << 16) + str1.charAt(k) + i;
          String str2 = str1.substring(i, k);
          i = k + 1;
          m = str1.charAt(k);
          k = i + 1;
          i = (m << 16) + str1.charAt(i) + k;
          paramString.put(str2, str1.substring(k, i));
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.SemiXml", localException, "", new Object[0]);
        }
      }
    }
    GMTrace.o(13904017096704L, 103593);
    return paramString;
  }
  
  public static String ah(Map<String, String> paramMap)
  {
    GMTrace.i(13903882878976L, 103592);
    if (paramMap == null)
    {
      GMTrace.o(13903882878976L, 103592);
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("~SEMI_XML~");
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      if (localObject != null)
      {
        int i = str.length();
        int j = ((String)localObject).length();
        localStringBuilder.append((char)(i >> 16)).append((char)i).append(str);
        localStringBuilder.append((char)(j >> 16)).append((char)j).append((String)localObject);
      }
    }
    paramMap = localStringBuilder.toString();
    GMTrace.o(13903882878976L, 103592);
    return paramMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */