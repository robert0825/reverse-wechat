package com.tencent.mm.plugin.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.c;
import com.tencent.mm.y.p;

public final class a
  extends p
{
  private static a nHo;
  
  private a()
  {
    super(c.class);
    GMTrace.i(14586648461312L, 108679);
    GMTrace.o(14586648461312L, 108679);
  }
  
  public static a aWV()
  {
    try
    {
      GMTrace.i(14586514243584L, 108678);
      if (nHo == null) {
        nHo = new a();
      }
      a locala = nHo;
      GMTrace.o(14586514243584L, 108678);
      return locala;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\y\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */