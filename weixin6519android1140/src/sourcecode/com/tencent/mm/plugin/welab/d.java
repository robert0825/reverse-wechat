package com.tencent.mm.plugin.welab;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ca;
import java.util.Map;

public final class d
  implements com.tencent.mm.plugin.welab.a.a.d
{
  public d()
  {
    GMTrace.i(15671933009920L, 116765);
    GMTrace.o(15671933009920L, 116765);
  }
  
  public final ca Nm(String paramString)
  {
    GMTrace.i(15672335663104L, 116768);
    paramString = b.bGu().Nl(paramString);
    GMTrace.o(15672335663104L, 116768);
    return paramString;
  }
  
  public final void a(com.tencent.mm.plugin.welab.a.a.b paramb)
  {
    GMTrace.i(15672201445376L, 116767);
    b.bGu().saM = paramb;
    GMTrace.o(15672201445376L, 116767);
  }
  
  public final void a(String paramString, com.tencent.mm.plugin.welab.a.a.b paramb)
  {
    GMTrace.i(15672067227648L, 116766);
    b.bGu().saL.put(paramString, paramb);
    GMTrace.o(15672067227648L, 116766);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */