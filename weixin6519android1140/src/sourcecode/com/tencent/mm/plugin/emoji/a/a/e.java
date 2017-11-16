package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.rh;

public final class e
{
  public static boolean a(rh paramrh)
  {
    GMTrace.i(11348779991040L, 84555);
    if (paramrh == null)
    {
      GMTrace.o(11348779991040L, 84555);
      return false;
    }
    boolean bool = bU(paramrh.uhj, 1);
    GMTrace.o(11348779991040L, 84555);
    return bool;
  }
  
  public static boolean b(rh paramrh)
  {
    GMTrace.i(11348914208768L, 84556);
    if (paramrh == null)
    {
      bool = false;
      if (!bool) {
        if (paramrh != null) {
          break label50;
        }
      }
    }
    label50:
    for (boolean bool = false;; bool = bU(paramrh.uhi, 8))
    {
      if (!bool) {
        break label63;
      }
      GMTrace.o(11348914208768L, 84556);
      return true;
      bool = bU(paramrh.uhi, 4);
      break;
    }
    label63:
    GMTrace.o(11348914208768L, 84556);
    return false;
  }
  
  public static boolean bU(int paramInt1, int paramInt2)
  {
    GMTrace.i(11349182644224L, 84558);
    if ((paramInt1 & paramInt2) == paramInt2)
    {
      GMTrace.o(11349182644224L, 84558);
      return true;
    }
    GMTrace.o(11349182644224L, 84558);
    return false;
  }
  
  public static boolean mG(int paramInt)
  {
    GMTrace.i(11349048426496L, 84557);
    if ((bU(paramInt, 4)) || (bU(paramInt, 8)))
    {
      GMTrace.o(11349048426496L, 84557);
      return true;
    }
    GMTrace.o(11349048426496L, 84557);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */