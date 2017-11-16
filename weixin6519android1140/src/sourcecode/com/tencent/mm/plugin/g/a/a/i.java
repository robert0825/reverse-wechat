package com.tencent.mm.plugin.g.a.a;

import com.tencent.gmtrace.GMTrace;
import java.math.BigDecimal;

public final class i
{
  public static double d(int[] paramArrayOfInt, int paramInt)
  {
    paramInt = 0;
    GMTrace.i(4801236566016L, 35772);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      throw new NullPointerException("null == dataGroup || 0 == dataGroup.length");
    }
    int j = paramArrayOfInt.length;
    int i = 0;
    while (paramInt < j)
    {
      i += paramArrayOfInt[paramInt];
      paramInt += 1;
    }
    double d1 = i;
    double d2 = paramArrayOfInt.length;
    d1 = new BigDecimal(d1).divide(new BigDecimal(d2), 5, 4).doubleValue();
    GMTrace.o(4801236566016L, 35772);
    return d1;
  }
  
  public static double g(int[] paramArrayOfInt)
  {
    GMTrace.i(4801370783744L, 35773);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      throw new NullPointerException("null == dataGroup || 0 == dataGroup.length");
    }
    double d = d(paramArrayOfInt, 5);
    BigDecimal localBigDecimal = new BigDecimal(0.0D);
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      localBigDecimal = localBigDecimal.add(new BigDecimal(paramArrayOfInt[i]).subtract(new BigDecimal(d)).pow(2));
      i += 1;
    }
    d = Math.pow(localBigDecimal.divide(new BigDecimal(paramArrayOfInt.length - 1), 5, 4).doubleValue(), 0.5D);
    GMTrace.o(4801370783744L, 35773);
    return d;
  }
  
  public static BigDecimal g(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(4801102348288L, 35771);
    BigDecimal localBigDecimal = new BigDecimal(paramDouble1).multiply(new BigDecimal(paramDouble2));
    GMTrace.o(4801102348288L, 35771);
    return localBigDecimal;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */