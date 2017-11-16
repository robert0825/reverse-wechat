package com.tencent.mm.plugin.product.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.rz;
import com.tencent.mm.sdk.platformtools.bg;

public final class b
{
  public static String a(Context paramContext, rz paramrz)
  {
    GMTrace.i(5995908562944L, 44673);
    if (paramrz.tXI > 0)
    {
      paramContext = paramrz.lPi + " " + c(paramrz.tXI, paramrz.uhq);
      GMTrace.o(5995908562944L, 44673);
      return paramContext;
    }
    paramContext = paramContext.getString(a.i.sWb);
    GMTrace.o(5995908562944L, 44673);
    return paramContext;
  }
  
  public static String c(double paramDouble, String paramString)
  {
    GMTrace.i(5995774345216L, 44672);
    if (("CNY".equals(paramString)) || ("1".equals(paramString)) || (bg.nm(paramString)))
    {
      paramString = String.format("¥%.2f", new Object[] { Double.valueOf(paramDouble / 100.0D) });
      GMTrace.o(5995774345216L, 44672);
      return paramString;
    }
    paramString = String.format("%s%.2f", new Object[] { paramString, Double.valueOf(paramDouble / 100.0D) });
    GMTrace.o(5995774345216L, 44672);
    return paramString;
  }
  
  public static String n(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(5995640127488L, 44671);
    if (paramInt1 == paramInt2)
    {
      paramString = c(paramInt1, paramString);
      GMTrace.o(5995640127488L, 44671);
      return paramString;
    }
    paramString = String.format("%s~%s", new Object[] { c(paramInt2, paramString), c(paramInt1, paramString) });
    GMTrace.o(5995640127488L, 44671);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */