package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.j.c;

public final class g
  implements b<f>
{
  protected f hoL;
  public final a hoM;
  
  public g()
  {
    this(new f());
    GMTrace.i(5600503136256L, 41727);
    GMTrace.o(5600503136256L, 41727);
  }
  
  private g(f paramf)
  {
    GMTrace.i(5600637353984L, 41728);
    this.hoM = new a();
    this.hoL = paramf;
    GMTrace.o(5600637353984L, 41728);
  }
  
  public final f PO()
  {
    GMTrace.i(5600771571712L, 41729);
    f localf = this.hoL;
    GMTrace.o(5600771571712L, 41729);
    return localf;
  }
  
  public final class a
    implements com.tencent.mm.vending.h.e<c<String, String>, com.tencent.mm.vending.j.e<String, Long, Integer, String>>
  {
    public a()
    {
      GMTrace.i(5586007621632L, 41619);
      GMTrace.o(5586007621632L, 41619);
    }
    
    public final String PJ()
    {
      GMTrace.i(5586141839360L, 41620);
      GMTrace.o(5586141839360L, 41620);
      return "Vending.LOGIC";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */