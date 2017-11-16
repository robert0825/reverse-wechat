package com.tencent.mm.plugin.appbrand.p.b;

import com.tencent.gmtrace.GMTrace;

public class c
  extends b
{
  public c()
  {
    GMTrace.i(10171422081024L, 75783);
    GMTrace.o(10171422081024L, 75783);
  }
  
  public final a.b a(com.tencent.mm.plugin.appbrand.p.e.a parama)
  {
    GMTrace.i(10171556298752L, 75784);
    if (c(parama) == 13)
    {
      parama = a.b.iHX;
      GMTrace.o(10171556298752L, 75784);
      return parama;
    }
    parama = a.b.iHY;
    GMTrace.o(10171556298752L, 75784);
    return parama;
  }
  
  public final com.tencent.mm.plugin.appbrand.p.e.b a(com.tencent.mm.plugin.appbrand.p.e.b paramb)
  {
    GMTrace.i(10171690516480L, 75785);
    super.a(paramb);
    paramb.put("Sec-WebSocket-Version", "13");
    GMTrace.o(10171690516480L, 75785);
    return paramb;
  }
  
  public a abM()
  {
    GMTrace.i(10171824734208L, 75786);
    c localc = new c();
    GMTrace.o(10171824734208L, 75786);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */