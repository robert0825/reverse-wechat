package com.tencent.smtt.utils;

import java.security.MessageDigest;

public final class i
{
  public static String bg(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return null;
      try
      {
        paramString = paramString.getBytes();
        Object localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramString);
        paramString = ((MessageDigest)localObject).digest();
        if ((paramString != null) && (paramString.length > 0))
        {
          localObject = new StringBuffer(paramString.length * 2);
          int i = 0;
          while (i < paramString.length)
          {
            if ((paramString[i] & 0xFF) < 16) {
              ((StringBuffer)localObject).append("0");
            }
            ((StringBuffer)localObject).append(Long.toString(paramString[i] & 0xFF, 16));
            i += 1;
          }
          paramString = ((StringBuffer)localObject).toString();
          return paramString;
        }
      }
      catch (Exception paramString) {}
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */