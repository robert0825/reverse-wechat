package com.tencent.mm.plugin.appbrand.jsapi.base;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.c;

public final class g
{
  int hYL;
  c icI;
  
  g(c paramc, int paramInt)
  {
    GMTrace.i(20737041629184L, 154503);
    this.icI = paramc;
    this.hYL = paramInt;
    GMTrace.o(20737041629184L, 154503);
  }
  
  public final void qp(String paramString)
  {
    GMTrace.i(20737175846912L, 154504);
    this.icI.v(this.hYL, paramString);
    GMTrace.o(20737175846912L, 154504);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\base\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */