package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;

public final class q
{
  public static Map<String, String> RK(String paramString)
  {
    GMTrace.i(13907104104448L, 103616);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(13907104104448L, 103616);
      return null;
    }
    HashMap localHashMap = new HashMap();
    paramString = paramString.split("\n");
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      Object localObject1 = paramString[i];
      if ((localObject1 != null) && (((String)localObject1).length() > 0))
      {
        Object localObject2 = ((String)localObject1).trim().split("=", 2);
        if ((localObject2 != null) && (localObject2.length >= 2))
        {
          localObject1 = localObject2[0];
          localObject2 = localObject2[1];
          if ((localObject1 != null) && (((String)localObject1).length() > 0) && (((String)localObject1).matches("^[a-zA-Z0-9_.]*"))) {
            localHashMap.put(localObject1, localObject2);
          }
        }
      }
      i += 1;
    }
    GMTrace.o(13907104104448L, 103616);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */