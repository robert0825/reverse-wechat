package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

@Deprecated
final class m
{
  public static final String[] hRp;
  final g hKn;
  private final a hRq;
  
  static
  {
    GMTrace.i(10580517715968L, 78831);
    hRp = new String[] { a.hRr };
    GMTrace.o(10580517715968L, 78831);
  }
  
  m(g paramg)
  {
    GMTrace.i(10579309756416L, 78822);
    this.hRq = new a(paramg);
    this.hKn = paramg;
    d.xB();
    GMTrace.o(10579309756416L, 78822);
  }
  
  private static final class a
    extends i<n>
  {
    public static final String hRr;
    
    static
    {
      GMTrace.i(10572330434560L, 78770);
      hRr = i.a(n.hJW, "AppBrandWxaAppInfo");
      GMTrace.o(10572330434560L, 78770);
    }
    
    a(e parame)
    {
      super(n.hJW, "AppBrandWxaAppInfo", n.eZt);
      GMTrace.i(10571659345920L, 78765);
      GMTrace.o(10571659345920L, 78765);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */