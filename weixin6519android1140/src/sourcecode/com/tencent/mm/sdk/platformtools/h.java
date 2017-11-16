package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import java.io.File;
import java.io.IOException;

public final class h
{
  public static boolean Nj(String paramString)
  {
    GMTrace.i(13910191112192L, 103639);
    try
    {
      File localFile = new File(paramString);
      if (!localFile.exists())
      {
        localFile.mkdirs();
        paramString = new File(paramString + ".nomedia");
        boolean bool = paramString.exists();
        if (bool) {}
      }
      try
      {
        paramString.createNewFile();
        GMTrace.o(13910191112192L, 103639);
        return true;
      }
      catch (IOException paramString)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FilePathGenerator", paramString, "", new Object[0]);
        }
      }
      return false;
    }
    catch (Exception paramString)
    {
      GMTrace.o(13910191112192L, 103639);
    }
  }
  
  private static String RE(String paramString)
  {
    GMTrace.i(13910056894464L, 103638);
    if (bg.nm(paramString))
    {
      GMTrace.o(13910056894464L, 103638);
      return null;
    }
    if (paramString.length() <= 4)
    {
      GMTrace.o(13910056894464L, 103638);
      return null;
    }
    paramString = paramString.substring(0, 2) + "/" + paramString.substring(2, 4) + "/";
    GMTrace.o(13910056894464L, 103638);
    return paramString;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    GMTrace.i(13910459547648L, 103641);
    paramString1 = a(paramString1, paramString2, paramString3, paramString4, paramInt, true);
    GMTrace.o(13910459547648L, 103641);
    return paramString1;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(13910325329920L, 103640);
    if (bg.nm(paramString1))
    {
      GMTrace.o(13910325329920L, 103640);
      return null;
    }
    if (!paramString1.endsWith("/"))
    {
      GMTrace.o(13910325329920L, 103640);
      return null;
    }
    String str = "";
    if (paramInt == 1) {
      str = RE(paramString3);
    }
    while (bg.nm(str))
    {
      GMTrace.o(13910325329920L, 103640);
      return null;
      if (paramInt == 2) {
        if (bg.nm(paramString3)) {
          str = null;
        } else {
          str = RE(g.n(paramString3.getBytes()));
        }
      }
    }
    paramString1 = paramString1 + str;
    if ((paramBoolean) && (!Nj(paramString1)))
    {
      GMTrace.o(13910325329920L, 103640);
      return null;
    }
    paramString1 = paramString1 + bg.nl(paramString2) + paramString3 + bg.nl(paramString4);
    GMTrace.o(13910325329920L, 103640);
    return paramString1;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(13910593765376L, 103642);
    paramString1 = paramString1 + paramString3 + paramString4 + paramString5;
    paramString2 = a(paramString2, paramString3, paramString4, paramString5, 1, paramBoolean);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(13910593765376L, 103642);
      return null;
    }
    paramString3 = new File(paramString2);
    paramString4 = new File(paramString1);
    if (paramString3.exists())
    {
      GMTrace.o(13910593765376L, 103642);
      return paramString2;
    }
    if (paramString4.exists()) {
      j.r(paramString1, paramString2, false);
    }
    GMTrace.o(13910593765376L, 103642);
    return paramString2;
  }
  
  public static String e(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(13910727983104L, 103643);
    paramString1 = a(paramString1, paramString2, paramString3, paramString4, paramString5, 1, true);
    GMTrace.o(13910727983104L, 103643);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */