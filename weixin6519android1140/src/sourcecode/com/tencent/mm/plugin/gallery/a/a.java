package com.tencent.mm.plugin.gallery.a;

import com.tencent.gmtrace.GMTrace;
import java.util.Collections;
import java.util.List;

public final class a
{
  public static void swap(List<?> paramList, int paramInt1, int paramInt2)
  {
    GMTrace.i(15076543168512L, 112329);
    int i = paramInt1;
    if (paramInt1 > paramInt2)
    {
      while (paramInt1 > paramInt2)
      {
        Collections.swap(paramList, paramInt1, paramInt1 - 1);
        paramInt1 -= 1;
      }
      GMTrace.o(15076543168512L, 112329);
      return;
    }
    while (i < paramInt2)
    {
      Collections.swap(paramList, i, i + 1);
      i += 1;
    }
    GMTrace.o(15076543168512L, 112329);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */