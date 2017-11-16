package org.a.g;

import java.util.regex.Pattern;

public final class d
{
  private static final Pattern yup = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*://\\S+");
  
  public static void e(Object paramObject, String paramString)
  {
    if (paramObject != null) {}
    for (boolean bool = true;; bool = false)
    {
      o(bool, paramString);
      return;
    }
  }
  
  public static void fP(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!paramString1.trim().equals(""))) {}
    for (boolean bool = true;; bool = false)
    {
      o(bool, paramString2);
      return;
    }
  }
  
  private static void o(boolean paramBoolean, String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.trim().length() > 0) {}
    }
    else
    {
      str = "Received an invalid parameter";
    }
    if (!paramBoolean) {
      throw new IllegalArgumentException(str);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\g\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */