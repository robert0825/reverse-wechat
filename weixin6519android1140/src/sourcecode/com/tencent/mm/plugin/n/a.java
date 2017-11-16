package com.tencent.mm.plugin.n;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.storage.at;
import com.tencent.mm.y.p;

public final class a
  extends p
{
  private static a mhN;
  
  private a()
  {
    super(n.class);
    GMTrace.i(14599801798656L, 108777);
    GMTrace.o(14599801798656L, 108777);
  }
  
  public static a aHB()
  {
    try
    {
      GMTrace.i(14599936016384L, 108778);
      if (mhN == null) {
        mhN = new a();
      }
      a locala = mhN;
      GMTrace.o(14599936016384L, 108778);
      return locala;
    }
    finally {}
  }
  
  public static at yR()
  {
    GMTrace.i(16423820722176L, 122367);
    h.xw().wG();
    at localat = ((com.tencent.mm.plugin.r.a.a)h.h(com.tencent.mm.plugin.r.a.a.class)).yR();
    GMTrace.o(16423820722176L, 122367);
    return localat;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\n\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */