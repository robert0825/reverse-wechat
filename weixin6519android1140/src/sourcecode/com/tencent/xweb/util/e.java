package com.tencent.xweb.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.xweb.o;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.xwalk.core.XWalkEnvironment;

public final class e
{
  static o yop = null;
  
  public static void a(o paramo)
  {
    yop = paramo;
  }
  
  public static void csi()
  {
    Object localObject = "";
    int i = XWalkEnvironment.getAvailableVersion();
    if (i <= 0) {}
    String str2;
    do
    {
      return;
      str2 = new SimpleDateFormat("yyyyMMdd").format(new Date());
      if ("".isEmpty())
      {
        String str1 = XWalkEnvironment.getSharedPreferences().getString("REPORT_APK_VER_TIME", "");
        localObject = str1;
        if (str1 == null) {
          localObject = "";
        }
      }
    } while ((str2.equals(localObject)) || (yop == null));
    yop.c(i % 50 + 100, 1L);
    XWalkEnvironment.getSharedPreferences().edit().putString("REPORT_APK_VER_TIME", str2).apply();
  }
  
  public static void csj()
  {
    if (yop != null) {
      yop.c(0L, 1L);
    }
  }
  
  public static void csk()
  {
    if (yop != null) {
      yop.c(1L, 1L);
    }
  }
  
  public static void csl()
  {
    if (yop != null) {
      yop.c(4L, 1L);
    }
  }
  
  public static void csm()
  {
    if (yop != null) {
      yop.c(5L, 1L);
    }
  }
  
  public static void csn()
  {
    if (yop != null) {
      yop.c(9L, 1L);
    }
  }
  
  public static void cso()
  {
    if (yop != null) {
      yop.c(10L, 1L);
    }
  }
  
  public static void csp()
  {
    if (yop != null) {
      yop.c(20L, 1L);
    }
  }
  
  public static void csq()
  {
    if (yop != null) {
      yop.c(21L, 1L);
    }
  }
  
  public static void csr()
  {
    if (yop != null) {
      yop.c(25L, 1L);
    }
  }
  
  public static void css()
  {
    if (yop != null) {
      yop.c(26L, 1L);
    }
  }
  
  public static void cst()
  {
    if (yop != null) {
      yop.c(14L, 1L);
    }
  }
  
  public static void csu()
  {
    if (yop != null) {
      yop.c(15L, 1L);
    }
  }
  
  public static void fA(long paramLong)
  {
    if ((yop != null) && (yop != null) && (paramLong > 0L) && (paramLong < 600000L)) {
      yop.o(11, 12, (int)paramLong);
    }
  }
  
  public static void fB(long paramLong)
  {
    if ((yop != null) && (yop != null) && (paramLong > 0L) && (paramLong < 600000L)) {
      yop.o(22, 23, (int)paramLong);
    }
  }
  
  public static void fC(long paramLong)
  {
    if ((yop != null) && (yop != null) && (paramLong > 0L) && (paramLong < 600000L)) {
      yop.o(27, 28, (int)paramLong);
    }
  }
  
  public static void fD(long paramLong)
  {
    if ((yop != null) && (yop != null) && (paramLong > 0L) && (paramLong < 120000L)) {
      yop.o(16, 17, (int)paramLong);
    }
  }
  
  public static void fx(long paramLong)
  {
    if (yop != null) {
      yop.c(paramLong, 1L);
    }
  }
  
  public static void fy(long paramLong)
  {
    if ((yop != null) && (paramLong > 0L) && (paramLong < 300000L)) {
      yop.o(2, 3, (int)paramLong);
    }
  }
  
  public static void fz(long paramLong)
  {
    if ((yop != null) && (paramLong > 0L) && (paramLong < 300000L)) {
      yop.o(6, 7, (int)paramLong);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\util\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */