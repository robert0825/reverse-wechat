package com.google.android.gms.analytics.a;

import com.google.android.gms.c.af;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  public Map<String, String> abJ;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.abJ.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((String)localEntry.getKey()).startsWith("&")) {
        localHashMap.put(((String)localEntry.getKey()).substring(1), localEntry.getValue());
      } else {
        localHashMap.put(localEntry.getKey(), localEntry.getValue());
      }
    }
    return af.c(localHashMap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */