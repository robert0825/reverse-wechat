package com.tencent.mm.pluginsdk.j.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public enum b
{
  static
  {
    GMTrace.i(843021549568L, 6281);
    trH = new b[0];
    GMTrace.o(843021549568L, 6281);
  }
  
  public static String ae(Map<String, List<String>> paramMap)
  {
    GMTrace.i(842887331840L, 6280);
    if (paramMap == null)
    {
      GMTrace.o(842887331840L, 6280);
      return "null";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      localStringBuilder.append(bg.aq((String)((Map.Entry)localObject).getKey(), "null"));
      localStringBuilder.append(" : ");
      localObject = (List)((Map.Entry)localObject).getValue();
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localStringBuilder.append(bg.nl((String)((Iterator)localObject).next())).append("|");
        }
      }
      localStringBuilder.append("\n");
    }
    paramMap = localStringBuilder.toString();
    GMTrace.o(842887331840L, 6280);
    return paramMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */