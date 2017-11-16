package com.tencent.mm.plugin.appbrand.dynamic.j;

import com.tencent.gmtrace.GMTrace;

public final class a
{
  public static int bp(int paramInt1, int paramInt2)
  {
    GMTrace.i(18343000014848L, 136666);
    int i = Integer.MIN_VALUE;
    if (paramInt1 == 0) {
      switch (paramInt2)
      {
      default: 
        i = 10002;
      }
    }
    for (;;)
    {
      GMTrace.o(18343000014848L, 136666);
      return i;
      i = 10001;
      continue;
      i = 10000;
      continue;
      if (paramInt1 == 1) {
        switch (paramInt2)
        {
        default: 
          i = 10102;
          break;
        case 2: 
          i = 10101;
          break;
        case 1: 
          i = 10100;
        }
      }
    }
  }
  
  public static int ix(int paramInt)
  {
    GMTrace.i(18343134232576L, 136667);
    switch (paramInt)
    {
    default: 
      GMTrace.o(18343134232576L, 136667);
      return 0;
    case 10001: 
    case 10101: 
      GMTrace.o(18343134232576L, 136667);
      return 2;
    }
    GMTrace.o(18343134232576L, 136667);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\j\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */