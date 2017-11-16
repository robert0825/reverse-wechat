package com.tencent.mm.modelcontrol;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class b
{
  public static boolean B(String paramString, int paramInt)
  {
    GMTrace.i(20353850015744L, 151648);
    if (bg.nm(paramString))
    {
      GMTrace.o(20353850015744L, 151648);
      return false;
    }
    try
    {
      int j = Gq();
      paramString = paramString.split(";");
      int i = 0;
      while (i < paramString.length)
      {
        String[] arrayOfString1 = paramString[i].split("-");
        String[] arrayOfString2 = arrayOfString1[0].split(":");
        int k = bg.Sy(arrayOfString2[0]);
        int m = bg.Sy(arrayOfString2[1]);
        arrayOfString1 = arrayOfString1[1].split(":");
        int n = bg.Sy(arrayOfString1[0]);
        boolean bool = q(m + k * 60, bg.Sy(arrayOfString1[1]) + n * 60 + paramInt, j);
        if (bool)
        {
          GMTrace.o(20353850015744L, 151648);
          return true;
        }
        i += 1;
      }
      return false;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.BusyTimeControlLogic", paramString, "", new Object[0]);
      w.e("MicroMsg.BusyTimeControlLogic", "checkNeedToControl error : " + paramString.toString());
      GMTrace.o(20353850015744L, 151648);
    }
  }
  
  private static int Gq()
  {
    GMTrace.i(20353984233472L, 151649);
    String[] arrayOfString = new SimpleDateFormat("HH:mm").format(new Date()).split(":");
    int i = bg.Sy(arrayOfString[0]);
    int j = bg.Sy(arrayOfString[1]) + i * 60 - ((int)Gr() - 8) * 60;
    if (j < 0) {
      i = j + 1440;
    }
    for (;;)
    {
      GMTrace.o(20353984233472L, 151649);
      return i;
      i = j;
      if (j >= 1440) {
        i = j - 1440;
      }
    }
  }
  
  public static long Gr()
  {
    GMTrace.i(4105049210880L, 30585);
    long l = (int)(TimeZone.getDefault().getRawOffset() / 60000L) / 60L;
    GMTrace.o(4105049210880L, 30585);
    return l;
  }
  
  public static boolean jD(String paramString)
  {
    GMTrace.i(4104646557696L, 30582);
    if (bg.nm(paramString))
    {
      GMTrace.o(4104646557696L, 30582);
      return false;
    }
    try
    {
      int j = Gq();
      paramString = paramString.split(";");
      int i = 0;
      while (i < paramString.length)
      {
        String[] arrayOfString1 = paramString[i].split("-");
        String[] arrayOfString2 = arrayOfString1[0].split(":");
        int k = bg.Sy(arrayOfString2[0]);
        int m = bg.Sy(arrayOfString2[1]);
        arrayOfString1 = arrayOfString1[1].split(":");
        int n = bg.Sy(arrayOfString1[0]);
        boolean bool = q(m + k * 60, bg.Sy(arrayOfString1[1]) + n * 60, j);
        if (bool)
        {
          GMTrace.o(4104646557696L, 30582);
          return true;
        }
        i += 1;
      }
      return false;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.BusyTimeControlLogic", paramString, "", new Object[0]);
      w.e("MicroMsg.BusyTimeControlLogic", "checkNeedToControl error : " + paramString.toString());
      GMTrace.o(4104646557696L, 30582);
    }
  }
  
  private static boolean q(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20354118451200L, 151650);
    if (paramInt1 < paramInt2)
    {
      if ((paramInt3 < paramInt2) && (paramInt3 >= paramInt1))
      {
        GMTrace.o(20354118451200L, 151650);
        return true;
      }
      GMTrace.o(20354118451200L, 151650);
      return false;
    }
    if ((paramInt3 <= 1440) && (paramInt3 >= paramInt1))
    {
      GMTrace.o(20354118451200L, 151650);
      return true;
    }
    if ((paramInt3 < paramInt2) && (paramInt3 >= 0))
    {
      GMTrace.o(20354118451200L, 151650);
      return true;
    }
    GMTrace.o(20354118451200L, 151650);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcontrol\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */