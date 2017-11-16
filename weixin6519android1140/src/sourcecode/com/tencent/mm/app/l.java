package com.tencent.mm.app;

import com.tencent.gmtrace.GMTrace;
import java.util.HashSet;
import java.util.Set;

public final class l
{
  private static final Set<String> esS;
  
  static
  {
    GMTrace.i(19120389095424L, 142458);
    HashSet localHashSet = new HashSet();
    esS = localHashSet;
    localHashSet.add(":nospace");
    esS.add(":cuploader");
    esS.add(":dexopt");
    esS.add(":recovery");
    esS.add(":fallback");
    GMTrace.o(19120389095424L, 142458);
  }
  
  public static boolean bD(String paramString)
  {
    GMTrace.i(19120120659968L, 142456);
    int i = paramString.indexOf(':');
    if (i != -1) {}
    for (paramString = paramString.substring(i);; paramString = "")
    {
      boolean bool = esS.contains(paramString);
      GMTrace.o(19120120659968L, 142456);
      return bool;
    }
  }
  
  public static boolean pk()
  {
    GMTrace.i(19120254877696L, 142457);
    GMTrace.o(19120254877696L, 142457);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */