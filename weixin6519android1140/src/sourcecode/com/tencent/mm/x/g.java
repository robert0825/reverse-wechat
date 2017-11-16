package com.tencent.mm.x;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.storage.au;

public final class g
{
  public static int g(au paramau)
  {
    GMTrace.i(14451491209216L, 107672);
    if (paramau.aCp())
    {
      paramau = f.a.C(paramau.field_content, paramau.field_reserved);
      if (paramau == null)
      {
        GMTrace.o(14451491209216L, 107672);
        return 0;
      }
      int i = paramau.type;
      GMTrace.o(14451491209216L, 107672);
      return i;
    }
    GMTrace.o(14451491209216L, 107672);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\x\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */