package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class an
{
  public static ao vjO;
  
  static
  {
    GMTrace.i(13948711600128L, 103926);
    vjO = null;
    GMTrace.o(13948711600128L, 103926);
  }
  
  public an()
  {
    GMTrace.i(13947637858304L, 103918);
    GMTrace.o(13947637858304L, 103918);
  }
  
  public static String AL(String paramString)
  {
    GMTrace.i(13947906293760L, 103920);
    paramString = eS(paramString, null);
    GMTrace.o(13947906293760L, 103920);
    return paramString;
  }
  
  public static String RZ(String paramString)
  {
    GMTrace.i(13948040511488L, 103921);
    if (bg.nm(paramString))
    {
      GMTrace.o(13948040511488L, 103921);
      return paramString;
    }
    if (!bg.SH(paramString).booleanValue())
    {
      GMTrace.o(13948040511488L, 103921);
      return paramString;
    }
    new an();
    String str1 = "86";
    Object localObject = paramString;
    if (paramString.startsWith("+"))
    {
      String str2 = paramString.replace("+", "");
      paramString = eS(str2, null);
      str1 = paramString;
      localObject = str2;
      if (paramString != null)
      {
        localObject = str2.substring(paramString.length());
        str1 = paramString;
      }
    }
    paramString = formatNumber(str1, (String)localObject);
    GMTrace.o(13948040511488L, 103921);
    return paramString;
  }
  
  public static String Sa(String paramString)
  {
    GMTrace.i(13948174729216L, 103922);
    if (bg.nm(paramString))
    {
      GMTrace.o(13948174729216L, 103922);
      return "";
    }
    paramString = paramString.replaceAll("[\\.\\-\\ ]", "").trim();
    GMTrace.o(13948174729216L, 103922);
    return paramString;
  }
  
  public static String Sb(String paramString)
  {
    GMTrace.i(17568295288832L, 130894);
    if (bg.nm(paramString))
    {
      GMTrace.o(17568295288832L, 130894);
      return "";
    }
    paramString = paramString.replace("+", "");
    GMTrace.o(17568295288832L, 130894);
    return paramString;
  }
  
  public static String Sc(String paramString)
  {
    GMTrace.i(17568429506560L, 130895);
    if (bg.nm(paramString))
    {
      GMTrace.o(17568429506560L, 130895);
      return "";
    }
    if (paramString.startsWith("+"))
    {
      GMTrace.o(17568429506560L, 130895);
      return paramString;
    }
    paramString = "+" + paramString;
    GMTrace.o(17568429506560L, 130895);
    return paramString;
  }
  
  private static String ag(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(13948577382400L, 103925);
    paramString1 = Pattern.compile(paramString1).matcher(paramString3);
    if (paramString1.find())
    {
      paramString1 = paramString1.replaceAll(paramString2);
      GMTrace.o(13948577382400L, 103925);
      return paramString1;
    }
    GMTrace.o(13948577382400L, 103925);
    return paramString3;
  }
  
  private static int cH(String paramString, int paramInt)
  {
    GMTrace.i(13948443164672L, 103924);
    Pattern localPattern = Pattern.compile(paramString);
    paramString = "1";
    int i = 0;
    while ((i < paramInt) && (!localPattern.matcher(paramString).find()))
    {
      paramString = paramString + "1";
      i += 1;
    }
    GMTrace.o(13948443164672L, 103924);
    return i + 1;
  }
  
  public static String eS(String paramString1, String paramString2)
  {
    GMTrace.i(13947772076032L, 103919);
    paramString1 = Sa(paramString1).replace("+", "");
    if (vjO == null) {
      vjO = new ao();
    }
    int i;
    if (bg.nm(paramString2))
    {
      paramString2 = vjO.vjP.iterator();
      do
      {
        do
        {
          if (!paramString2.hasNext()) {
            break;
          }
          localObject = (ao.a)paramString2.next();
        } while (!paramString1.startsWith(((ao.a)localObject).vjR));
        i = paramString1.length() - ((ao.a)localObject).vjR.length();
      } while ((i < ((ao.a)localObject).vjS) || (i > ((ao.a)localObject).vjT));
      w.i("MicroMsg.PhoneFormater", "[extractCountryCode] countrycode:%s country isocode: %s country.minlen:%d country.maxlen:%d", new Object[] { ((ao.a)localObject).vjR, ((ao.a)localObject).vjQ, Integer.valueOf(((ao.a)localObject).vjT), Integer.valueOf(((ao.a)localObject).vjT) });
      paramString1 = ((ao.a)localObject).vjR;
      GMTrace.o(13947772076032L, 103919);
      return paramString1;
    }
    Object localObject = vjO.vjP.iterator();
    while (((Iterator)localObject).hasNext())
    {
      ao.a locala = (ao.a)((Iterator)localObject).next();
      if (paramString1.startsWith(locala.vjR))
      {
        i = paramString1.length() - locala.vjR.length();
        if ((i >= locala.vjS) && (i <= locala.vjT) && (paramString2.equalsIgnoreCase(locala.vjQ)))
        {
          w.i("MicroMsg.PhoneFormater", "[extractCountryCode] countrycode:%s country isocode: %s country.minlen:%d country.maxlen:%d", new Object[] { locala.vjR, locala.vjQ, Integer.valueOf(locala.vjT), Integer.valueOf(locala.vjT) });
          paramString1 = locala.vjR;
          GMTrace.o(13947772076032L, 103919);
          return paramString1;
        }
      }
    }
    GMTrace.o(13947772076032L, 103919);
    return null;
  }
  
  public static String eT(String paramString1, String paramString2)
  {
    GMTrace.i(17568563724288L, 130896);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(17568563724288L, 130896);
      return "";
    }
    paramString1 = paramString1 + "（+" + paramString2 + "）";
    GMTrace.o(17568563724288L, 130896);
    return paramString1;
  }
  
  public static String formatNumber(String paramString1, String paramString2)
  {
    GMTrace.i(13948308946944L, 103923);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(13948308946944L, 103923);
      return paramString2;
    }
    if (vjO == null) {
      vjO = new ao();
    }
    Iterator localIterator1 = vjO.vjP.iterator();
    ao.a locala;
    String str;
    ao.b localb;
    int n;
    int k;
    label554:
    do
    {
      StringBuffer localStringBuffer;
      do
      {
        Iterator localIterator2;
        while (!localIterator2.hasNext())
        {
          do
          {
            if (!localIterator1.hasNext()) {
              break;
            }
            locala = (ao.a)localIterator1.next();
          } while ((locala.vjR == null) || (!paramString1.trim().toLowerCase().equals(locala.vjR.trim().toLowerCase())) || (locala.vjU == null));
          str = Sa(paramString2);
          if ((str != null) && (str.length() > locala.vjS))
          {
            GMTrace.o(13948308946944L, 103923);
            return str;
          }
          localIterator2 = locala.vjU.iterator();
        }
        localb = (ao.b)localIterator2.next();
        if (!bg.nm(localb.vjV)) {
          break label554;
        }
        if (locala.vjU.size() <= 1) {
          break;
        }
        localStringBuffer = new StringBuffer();
        localStringBuffer.append(str);
        m = str.length();
      } while (m > cH(localb.vjX, locala.vjT));
      while (localStringBuffer.toString().length() < locala.vjT) {
        localStringBuffer.append("0");
      }
      paramString1 = ag(localb.vjX, localb.vjW, localStringBuffer.toString());
      j = 0;
      i = 0;
      while (i < paramString1.length())
      {
        n = paramString1.charAt(i);
        paramString2 = paramString1;
        if (j >= m) {
          paramString2 = paramString1.substring(0, i);
        }
        k = j;
        if (n != 32)
        {
          k = j;
          if (n != 45)
          {
            k = j;
            if (n != 12290) {
              k = j + 1;
            }
          }
        }
        i += 1;
        j = k;
        paramString1 = paramString2;
      }
      GMTrace.o(13948308946944L, 103923);
      return paramString1;
      paramString1 = new StringBuffer();
      paramString1.append(str);
      m = str.length();
      while (paramString1.toString().length() < locala.vjT) {
        paramString1.append("0");
      }
      paramString1 = ag(localb.vjX, localb.vjW, paramString1.toString());
      j = 0;
      i = 0;
      while (i < paramString1.length())
      {
        n = paramString1.charAt(i);
        paramString2 = paramString1;
        if (j >= m) {
          paramString2 = paramString1.substring(0, i);
        }
        k = j;
        if (n != 32)
        {
          k = j;
          if (n != 45)
          {
            k = j;
            if (n != 12290) {
              k = j + 1;
            }
          }
        }
        i += 1;
        j = k;
        paramString1 = paramString2;
      }
      GMTrace.o(13948308946944L, 103923);
      return paramString1;
    } while (!Pattern.compile(localb.vjV).matcher(str).lookingAt());
    paramString1 = new StringBuffer();
    paramString1.append(str);
    int m = str.length();
    while (paramString1.toString().length() < locala.vjT) {
      paramString1.append(str.charAt(m - 1));
    }
    paramString1 = ag(localb.vjX, localb.vjW, paramString1.toString());
    int j = 0;
    int i = 0;
    while (i < paramString1.length())
    {
      n = paramString1.charAt(i);
      paramString2 = paramString1;
      if (j >= m) {
        paramString2 = paramString1.substring(0, i);
      }
      k = j;
      if (n != 32)
      {
        k = j;
        if (n != 45)
        {
          k = j;
          if (n != 12290) {
            k = j + 1;
          }
        }
      }
      i += 1;
      j = k;
      paramString1 = paramString2;
    }
    GMTrace.o(13948308946944L, 103923);
    return paramString1;
    GMTrace.o(13948308946944L, 103923);
    return paramString2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */