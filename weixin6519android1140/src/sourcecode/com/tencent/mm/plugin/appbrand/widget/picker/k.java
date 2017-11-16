package com.tencent.mm.plugin.appbrand.widget.picker;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class k
{
  public static boolean ko(int paramInt)
  {
    GMTrace.i(10124177440768L, 75431);
    if ((paramInt >= 0) && (paramInt <= 59))
    {
      GMTrace.o(10124177440768L, 75431);
      return true;
    }
    GMTrace.o(10124177440768L, 75431);
    return false;
  }
  
  public static boolean kp(int paramInt)
  {
    GMTrace.i(10124311658496L, 75432);
    if ((paramInt >= 0) && (paramInt <= 23))
    {
      GMTrace.o(10124311658496L, 75432);
      return true;
    }
    GMTrace.o(10124311658496L, 75432);
    return false;
  }
  
  public static int[] tb(String paramString)
  {
    GMTrace.i(10124445876224L, 75433);
    if (bg.nm(paramString))
    {
      GMTrace.o(10124445876224L, 75433);
      return null;
    }
    paramString = paramString.split(":");
    if ((paramString == null) || (paramString.length != 2))
    {
      GMTrace.o(10124445876224L, 75433);
      return null;
    }
    int i = tc(paramString[0]);
    int j = tc(paramString[1]);
    if ((!kp(i)) || (!ko(j)))
    {
      GMTrace.o(10124445876224L, 75433);
      return null;
    }
    GMTrace.o(10124445876224L, 75433);
    return new int[] { i, j };
  }
  
  private static int tc(String paramString)
  {
    GMTrace.i(10124580093952L, 75434);
    try
    {
      int i = Integer.parseInt(paramString, 10);
      GMTrace.o(10124580093952L, 75434);
      return i;
    }
    catch (Exception paramString)
    {
      GMTrace.o(10124580093952L, 75434);
    }
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */