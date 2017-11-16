package com.tencent.mm.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.re;
import com.tencent.mm.sdk.b.a;

public final class ac
{
  public static void aI(int paramInt, String paramString)
  {
    GMTrace.i(1604304502784L, 11953);
    if (a.vgX != null)
    {
      re localre = new re();
      localre.eWc.className = paramString;
      localre.eWc.eWd = paramInt;
      a.vgX.m(localre);
    }
    GMTrace.o(1604304502784L, 11953);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */