package com.tencent.mm.plugin.appbrand.widget.input.b;

import com.tencent.gmtrace.GMTrace;

public enum b
{
  public final int iQa;
  
  static
  {
    GMTrace.i(17281874657280L, 128760);
    iPV = new b("DONE", 0, 6);
    iPW = new b("SEARCH", 1, 3);
    iPX = new b("NEXT", 2, 5);
    iPY = new b("GO", 3, 2);
    iPZ = new b("SEND", 4, 4);
    iQb = new b[] { iPV, iPW, iPX, iPY, iPZ };
    GMTrace.o(17281874657280L, 128760);
  }
  
  private b(int paramInt)
  {
    GMTrace.i(17281472004096L, 128757);
    this.iQa = paramInt;
    GMTrace.o(17281472004096L, 128757);
  }
  
  public static b adC()
  {
    GMTrace.i(17281606221824L, 128758);
    b localb = iPV;
    GMTrace.o(17281606221824L, 128758);
    return localb;
  }
  
  public static b sV(String paramString)
  {
    GMTrace.i(17281740439552L, 128759);
    paramString = (b)d.g(paramString, b.class);
    GMTrace.o(17281740439552L, 128759);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */