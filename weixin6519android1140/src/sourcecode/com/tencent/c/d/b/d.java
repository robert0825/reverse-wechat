package com.tencent.c.d.b;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class d
{
  private static String EZ(int paramInt)
  {
    String str = "";
    Object localObject;
    try
    {
      localObject = a.dp(String.format(Locale.ENGLISH, "/proc/%d/cmdline", new Object[] { Integer.valueOf(paramInt) }), 100);
      if (localObject != null) {
        str = new String((byte[])localObject, 0, a((byte[])localObject, 0, '\000'));
      }
      localObject = str;
      if (TextUtils.isEmpty(str))
      {
        byte[] arrayOfByte = a.dp(String.format(Locale.ENGLISH, "/proc/%d/status", new Object[] { Integer.valueOf(paramInt) }), 150);
        localObject = str;
        if (arrayOfByte != null)
        {
          paramInt = a(arrayOfByte, 7, '\n');
          if (paramInt == 0) {
            return "";
          }
          str = new String(arrayOfByte, 6, paramInt - 6);
          return str;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      localObject = "";
    }
    return (String)localObject;
  }
  
  private static a Fa(int paramInt)
  {
    try
    {
      str1 = EZ(paramInt);
    }
    catch (Exception localException1)
    {
      try
      {
        for (;;)
        {
          String str1;
          Object localObject = new String(a.XS(String.format(Locale.ENGLISH, "/proc/%d/attr/current", new Object[] { Integer.valueOf(paramInt) }))).trim();
          if ((str1 != null) && (i != -1) && (k != -1)) {
            break;
          }
          return null;
          localException1 = localException1;
          i = -1;
          str2 = null;
          label230:
          k = -1;
        }
      }
      catch (Exception localException2)
      {
        int k;
        String str2;
        String str3;
        for (;;)
        {
          str3 = null;
        }
        return new a(paramInt, i, str2, k, str3);
      }
    }
    for (;;)
    {
      try
      {
        localObject = a.dp(String.format(Locale.ENGLISH, "/proc/%d/status", new Object[] { Integer.valueOf(paramInt) }), 150);
        if (localObject == null) {
          continue;
        }
        i = a((byte[])localObject, 7, '\n');
        if (i == 0) {
          continue;
        }
        i = a((byte[])localObject, a((byte[])localObject, a((byte[])localObject, i + 1, '\n') + 1, '\n') + 1, '\n');
        if (i == 0) {
          continue;
        }
        j = i + 7;
        i = a((byte[])localObject, i + 1, '\n');
        if (i == 0) {
          continue;
        }
        j = Integer.parseInt(new String((byte[])localObject, j, i - j));
      }
      catch (Exception localException3)
      {
        i = -1;
        break label230;
        i = -1;
        j = -1;
        break;
      }
      try
      {
        i = a((byte[])localObject, i + 1, '\n');
        if (i == 0) {
          continue;
        }
        i += 6;
        i = Integer.parseInt(new String((byte[])localObject, i, a((byte[])localObject, i + 1, '\t') - i));
      }
      catch (Exception localException4)
      {
        i = j;
        break label230;
        i = -1;
        break;
      }
    }
    k = i;
    i = j;
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt, char paramChar)
  {
    paramInt -= 1;
    for (;;)
    {
      int i = paramInt + 1;
      if (paramInt < paramArrayOfByte.length)
      {
        if ((i == paramArrayOfByte.length) || (paramArrayOfByte[i] == paramChar)) {
          return i;
        }
      }
      else {
        return 0;
      }
      paramInt = i;
    }
  }
  
  public static List<a> cnv()
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = new File("/proc").list();
    if (arrayOfString == null) {}
    for (;;)
    {
      return localArrayList;
      int j = arrayOfString.length;
      while (i < j)
      {
        Object localObject = arrayOfString[i];
        if (!TextUtils.isEmpty((CharSequence)localObject)) {
          try
          {
            int k = ((String)localObject).charAt(0);
            if ((k <= 57) && (k >= 48))
            {
              localObject = Fa(Integer.parseInt((String)localObject));
              if (localObject != null) {
                localArrayList.add(localObject);
              }
            }
          }
          catch (Exception localException) {}
        }
        i += 1;
      }
    }
  }
  
  public static final class a
  {
    public String name = "";
    public int pid;
    public int uid;
    public int xRG;
    public String xRH;
    
    a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2)
    {
      this.pid = paramInt1;
      this.xRG = paramInt2;
      this.name = paramString1;
      this.uid = paramInt3;
      this.xRH = paramString2;
    }
    
    public final String toString()
    {
      return "PID=" + this.pid + " PPID=" + this.xRG + " NAME=" + this.name + " UID=" + this.uid + " CONTEXT=" + this.xRH;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */