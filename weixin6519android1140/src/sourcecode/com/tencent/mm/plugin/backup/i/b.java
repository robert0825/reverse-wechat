package com.tencent.mm.plugin.backup.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.x;
import com.tencent.mm.g.a.z;
import com.tencent.mm.sdk.b.c;

public final class b
{
  private static b jiL;
  c hPq;
  c jiJ;
  c jiK;
  
  public b()
  {
    GMTrace.i(14719121358848L, 109666);
    GMTrace.o(14719121358848L, 109666);
  }
  
  public static b agH()
  {
    GMTrace.i(14719255576576L, 109667);
    if (jiL == null) {
      jiL = new b();
    }
    b localb = jiL;
    GMTrace.o(14719255576576L, 109667);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */