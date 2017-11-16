package com.tencent.mm.plugin.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.y.c.c;
import com.tencent.mm.y.p;

public final class b
  extends p
{
  private static b hsT;
  
  private b()
  {
    super(c.class);
    GMTrace.i(14603291459584L, 108803);
    GMTrace.o(14603291459584L, 108803);
  }
  
  public static b Qt()
  {
    try
    {
      GMTrace.i(14603425677312L, 108804);
      if (hsT == null) {
        hsT = new b();
      }
      b localb = hsT;
      GMTrace.o(14603425677312L, 108804);
      return localb;
    }
    finally {}
  }
  
  public final void eO(String paramString)
  {
    GMTrace.i(14603559895040L, 108805);
    super.eO(paramString);
    GMTrace.o(14603559895040L, 108805);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */