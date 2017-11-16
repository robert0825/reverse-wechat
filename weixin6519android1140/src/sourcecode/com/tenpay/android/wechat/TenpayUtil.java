package com.tenpay.android.wechat;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.bg;
import com.tenpay.android.jni.Encrypt;
import java.lang.reflect.Field;
import java.security.MessageDigest;

public class TenpayUtil
{
  public static final int getResourceDeclareStyleableIndex(Context paramContext, String paramString)
  {
    int k = 0;
    try
    {
      paramContext = Class.forName(paramContext.getPackageName() + ".R$styleable").getFields();
      int m = paramContext.length;
      int i = 0;
      for (;;)
      {
        int j = k;
        if (i < m)
        {
          Object localObject = paramContext[i];
          if (((Field)localObject).getName().equals(paramString)) {
            j = ((Field)localObject).getInt(null);
          }
        }
        else
        {
          return j;
        }
        i += 1;
      }
      return 0;
    }
    catch (Throwable paramContext) {}
  }
  
  public static final int[] getResourceDeclareStyleableIntArray(Context paramContext, String paramString)
  {
    try
    {
      paramContext = Class.forName(paramContext.getPackageName() + ".R$styleable").getFields();
      int j = paramContext.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramContext[i];
        if (((Field)localObject).getName().equals(paramString))
        {
          paramContext = (int[])((Field)localObject).get(null);
          return paramContext;
        }
        i += 1;
      }
      return null;
    }
    catch (Throwable paramContext)
    {
      return null;
    }
  }
  
  public static boolean invalidateID(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return false;
      if (paramString.length() == 18)
      {
        int i = 0;
        int j = 0;
        try
        {
          while (i < paramString.length() - 1)
          {
            int k = bg.Sy(paramString.substring(i, i + 1));
            int m = new int[] { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 }[i];
            j += k * m;
            i += 1;
          }
          i = j % 11;
          j = paramString.charAt(17);
          if (i == 2)
          {
            if ((j != 88) && (j != 120)) {}
          }
          else
          {
            while (j == new char[] { 49, 48, 88, 57, 56, 55, 54, 53, 52, 51, 50 }[i]) {
              return true;
            }
            return false;
          }
        }
        catch (NumberFormatException paramString) {}
      }
    }
    return false;
  }
  
  public static String md5HexDigest(String paramString)
  {
    int i = 0;
    char[] arrayOfChar = new char[16];
    char[] tmp10_8 = arrayOfChar;
    tmp10_8[0] = 48;
    char[] tmp15_10 = tmp10_8;
    tmp15_10[1] = 49;
    char[] tmp20_15 = tmp15_10;
    tmp20_15[2] = 50;
    char[] tmp25_20 = tmp20_15;
    tmp25_20[3] = 51;
    char[] tmp30_25 = tmp25_20;
    tmp30_25[4] = 52;
    char[] tmp35_30 = tmp30_25;
    tmp35_30[5] = 53;
    char[] tmp40_35 = tmp35_30;
    tmp40_35[6] = 54;
    char[] tmp46_40 = tmp40_35;
    tmp46_40[7] = 55;
    char[] tmp52_46 = tmp46_40;
    tmp52_46[8] = 56;
    char[] tmp58_52 = tmp52_46;
    tmp58_52[9] = 57;
    char[] tmp64_58 = tmp58_52;
    tmp64_58[10] = 65;
    char[] tmp70_64 = tmp64_58;
    tmp70_64[11] = 66;
    char[] tmp76_70 = tmp70_64;
    tmp76_70[12] = 67;
    char[] tmp82_76 = tmp76_70;
    tmp82_76[13] = 68;
    char[] tmp88_82 = tmp82_76;
    tmp88_82[14] = 69;
    char[] tmp94_88 = tmp88_82;
    tmp94_88[15] = 70;
    tmp94_88;
    for (;;)
    {
      Object localObject;
      int j;
      try
      {
        localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramString.getBytes());
        paramString = ((MessageDigest)localObject).digest();
        localObject = new char[32];
        j = 0;
      }
      catch (Exception paramString)
      {
        return null;
      }
      paramString = new String((char[])localObject);
      return paramString;
      while (i < 16)
      {
        int k = paramString[i];
        int m = j + 1;
        localObject[j] = arrayOfChar[(k >>> 4 & 0xF)];
        j = m + 1;
        localObject[m] = arrayOfChar[(k & 0xF)];
        i += 1;
      }
    }
  }
  
  public static String signWith3Des(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = md5HexDigest(paramString);
    return new Encrypt().desedeEncode(paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tenpay\android\wechat\TenpayUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */