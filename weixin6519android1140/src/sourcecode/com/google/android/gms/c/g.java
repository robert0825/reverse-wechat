package com.google.android.gms.c;

import com.google.android.gms.common.internal.w;
import java.util.HashMap;
import java.util.Map;

public final class g
  extends af<g>
{
  public final Map<String, Object> abX = new HashMap();
  
  public static String aq(String paramString)
  {
    w.af(paramString);
    String str = paramString;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.startsWith("&")) {
        str = paramString.substring(1);
      }
    }
    w.h(str, "Name can not be empty or \"&\"");
    return str;
  }
  
  public final String toString()
  {
    return af.l(this.abX, 0);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */