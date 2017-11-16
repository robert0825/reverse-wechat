package com.tencent.mm.jsapi.core;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  final Map<String, b> fXB;
  
  public d()
  {
    GMTrace.i(20020990050304L, 149168);
    this.fXB = new HashMap();
    GMTrace.o(20020990050304L, 149168);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(20828309684224L, 155183);
    this.fXB.put(paramb.name, paramb);
    GMTrace.o(20828309684224L, 155183);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\core\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */