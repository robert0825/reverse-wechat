package com.tencent.mm.plugin.remittance.bankcard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.math.BigDecimal;

public final class a
{
  public static char Fz(String paramString)
  {
    GMTrace.i(20950716252160L, 156095);
    paramString = SpellMap.f(paramString.charAt(0));
    w.d("MicroMsg.BankRemitUtil", "pinyin: %s", new Object[] { paramString });
    if (!bg.nm(paramString))
    {
      char c = paramString.toUpperCase().charAt(0);
      GMTrace.o(20950716252160L, 156095);
      return c;
    }
    GMTrace.o(20950716252160L, 156095);
    return '#';
  }
  
  public static long dp(String paramString1, String paramString2)
  {
    GMTrace.i(20950179381248L, 156091);
    try
    {
      if (bg.getDouble(paramString1.trim(), 0.0D) == 0.0D) {}
      for (paramString1 = "0";; paramString1 = paramString1.trim())
      {
        long l = new BigDecimal(paramString1).divide(new BigDecimal(paramString2.trim()), 0, 4).longValue();
        GMTrace.o(20950179381248L, 156091);
        return l;
      }
      return 0L;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.BankRemitUtil", paramString1, "", new Object[0]);
      GMTrace.o(20950179381248L, 156091);
    }
  }
  
  public static double dq(String paramString1, String paramString2)
  {
    GMTrace.i(20950313598976L, 156092);
    try
    {
      if (bg.getDouble(paramString1.trim(), 0.0D) == 0.0D) {}
      for (paramString1 = "0";; paramString1 = paramString1.trim())
      {
        double d = new BigDecimal(paramString1).divide(new BigDecimal(paramString2.trim()), 2, 4).doubleValue();
        GMTrace.o(20950313598976L, 156092);
        return d;
      }
      return 0.0D;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.BankRemitUtil", paramString1, "", new Object[0]);
      GMTrace.o(20950313598976L, 156092);
    }
  }
  
  public static double dr(String paramString1, String paramString2)
  {
    GMTrace.i(20950447816704L, 156093);
    try
    {
      double d1 = bg.getDouble(paramString1, 0.0D);
      double d2 = bg.getDouble(paramString2, 0.0D);
      if (d1 == 0.0D) {
        paramString1 = "0";
      }
      paramString1 = new BigDecimal(paramString1);
      if (d2 == 0.0D) {
        paramString2 = "0";
      }
      d1 = paramString1.multiply(new BigDecimal(paramString2)).doubleValue();
      GMTrace.o(20950447816704L, 156093);
      return d1;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.BankRemitUtil", paramString1, "", new Object[0]);
      GMTrace.o(20950447816704L, 156093);
    }
    return 0.0D;
  }
  
  public static double tk(int paramInt)
  {
    GMTrace.i(20950582034432L, 156094);
    double d = dq(String.valueOf(paramInt), "100");
    GMTrace.o(20950582034432L, 156094);
    return d;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */