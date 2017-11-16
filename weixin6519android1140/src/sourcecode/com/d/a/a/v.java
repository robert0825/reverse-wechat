package com.d.a.a;

import android.net.wifi.ScanResult;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

final class v
{
  static String a(String paramString1, long paramLong, String paramString2)
  {
    if ((paramString1 == null) || (!paramString1.startsWith("|"))) {
      return null;
    }
    return "&OD[]=ST," + String.valueOf(paramLong) + ',' + paramString2 + paramString1;
  }
  
  static String a(List<ScanResult> paramList, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator;
    if (paramList != null) {
      localIterator = paramList.iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localStringBuilder.toString();
      }
      paramList = (ScanResult)localIterator.next();
      if ((paramList.capabilities != null) && (!paramList.capabilities.contains("IBSS"))) {
        try
        {
          String str1 = new BigInteger(aO(paramList.BSSID), 16).toString();
          String str2 = String.valueOf(paramList.level);
          if (paramBoolean) {}
          for (paramList = "&WD[]=";; paramList = "|WD,")
          {
            localStringBuilder.append(paramList);
            localStringBuilder.append(str1);
            localStringBuilder.append(',');
            localStringBuilder.append(str2);
            localStringBuilder.append(',');
            localStringBuilder.append(str2);
            localStringBuilder.append(',');
            localStringBuilder.append(str2);
            localStringBuilder.append(',');
            localStringBuilder.append(1);
            localStringBuilder.append(',');
            localStringBuilder.append(1);
            localStringBuilder.append(',');
            localStringBuilder.append(0);
            localStringBuilder.append(',');
            localStringBuilder.append("");
            break;
          }
        }
        catch (Error paramList) {}catch (NumberFormatException paramList) {}catch (NullPointerException paramList) {}
      }
    }
  }
  
  private static String aO(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("trying to manipulate null string");
    }
    Object localObject1 = "";
    int i = 0;
    for (;;)
    {
      if (i >= paramString.length()) {
        return (String)localObject1;
      }
      Object localObject2 = localObject1;
      if (paramString.charAt(i) != ':') {
        localObject2 = localObject1 + paramString.charAt(i);
      }
      i += 1;
      localObject1 = localObject2;
    }
  }
  
  static String aP(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return paramString.replace("&SD=", "|SD,");
  }
  
  static String aQ(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return paramString.replace("&GD=", "|GD,");
  }
  
  static boolean c(double paramDouble1, double paramDouble2)
  {
    return (Math.abs(paramDouble1) <= 90.0D) && (Math.abs(paramDouble2) <= 180.0D);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */