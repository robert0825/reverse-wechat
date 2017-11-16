package com.tencent.mm.r;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.y.p;

public final class h
  extends p
  implements c
{
  private static h fUh;
  
  private h()
  {
    super(i.class);
    GMTrace.i(14586245808128L, 108676);
    GMTrace.o(14586245808128L, 108676);
  }
  
  public static h vD()
  {
    try
    {
      GMTrace.i(14586111590400L, 108675);
      if (fUh == null) {
        fUh = new h();
      }
      h localh = fUh;
      GMTrace.o(14586111590400L, 108675);
      return localh;
    }
    finally {}
  }
  
  public final void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(14586380025856L, 108677);
    super.onAccountInitialized(paramf);
    GMTrace.o(14586380025856L, 108677);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\r\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */