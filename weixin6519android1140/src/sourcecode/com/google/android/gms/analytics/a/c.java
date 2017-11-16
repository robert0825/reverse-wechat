package com.google.android.gms.analytics.a;

import com.google.android.gms.c.af;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  Map<String, String> abJ = new HashMap();
  
  public final Map<String, String> G(String paramString)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.abJ.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(paramString + (String)localEntry.getKey(), localEntry.getValue());
    }
    return localHashMap;
  }
  
  public final String toString()
  {
    return af.c(this.abJ);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */