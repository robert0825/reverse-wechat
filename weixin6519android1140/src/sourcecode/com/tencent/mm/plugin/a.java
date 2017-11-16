package com.tencent.mm.plugin;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.y.p
{
  private static a hnG;
  
  private a()
  {
    super(com.tencent.mm.modelstat.p.class);
    GMTrace.i(14602083500032L, 108794);
    GMTrace.o(14602083500032L, 108794);
  }
  
  public static a PD()
  {
    try
    {
      GMTrace.i(14601949282304L, 108793);
      if (hnG == null) {
        hnG = new a();
      }
      a locala = hnG;
      GMTrace.o(14601949282304L, 108793);
      return locala;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */