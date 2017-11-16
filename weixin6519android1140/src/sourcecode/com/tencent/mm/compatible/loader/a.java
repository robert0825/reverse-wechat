package com.tencent.mm.compatible.loader;

import com.tencent.gmtrace.GMTrace;

public final class a
{
  private static Object[] fRs;
  private static Object[] fRt;
  
  static
  {
    GMTrace.i(13795032301568L, 102781);
    fRs = new Object[0];
    fRt = new Object[73];
    GMTrace.o(13795032301568L, 102781);
  }
  
  public static int P(int paramInt)
  {
    GMTrace.i(13794763866112L, 102779);
    int j = paramInt * 4;
    paramInt = 4;
    for (;;)
    {
      int i = j;
      if (paramInt < 32)
      {
        if (j <= (1 << paramInt) - 12) {
          i = (1 << paramInt) - 12;
        }
      }
      else
      {
        paramInt = i / 4;
        GMTrace.o(13794763866112L, 102779);
        return paramInt;
      }
      paramInt += 1;
    }
  }
  
  public static <T> boolean a(T[] paramArrayOfT, T paramT)
  {
    GMTrace.i(13794898083840L, 102780);
    int j = paramArrayOfT.length;
    int i = 0;
    while (i < j)
    {
      T ? = paramArrayOfT[i];
      if (? == null)
      {
        if (paramT == null)
        {
          GMTrace.o(13794898083840L, 102780);
          return true;
        }
      }
      else if ((paramT != null) && (?.equals(paramT)))
      {
        GMTrace.o(13794898083840L, 102780);
        return true;
      }
      i += 1;
    }
    GMTrace.o(13794898083840L, 102780);
    return false;
  }
  
  public static boolean b(int[] paramArrayOfInt, int paramInt)
  {
    GMTrace.i(15695823765504L, 116943);
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (paramArrayOfInt[i] == paramInt)
      {
        GMTrace.o(15695823765504L, 116943);
        return true;
      }
      i += 1;
    }
    GMTrace.o(15695823765504L, 116943);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\compatible\loader\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */