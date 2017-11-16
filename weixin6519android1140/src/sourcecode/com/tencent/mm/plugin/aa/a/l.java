package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.h.e;
import com.tencent.mm.vending.j.c;
import com.tencent.mm.vending.j.d;
import java.util.Map;

public final class l
  implements b<k>
{
  protected k hpd;
  public final a hpe;
  public final b hpf;
  
  public l()
  {
    this(new k());
    GMTrace.i(5603321708544L, 41748);
    GMTrace.o(5603321708544L, 41748);
  }
  
  private l(k paramk)
  {
    GMTrace.i(5603455926272L, 41749);
    this.hpe = new a();
    this.hpf = new b();
    this.hpd = paramk;
    GMTrace.o(5603455926272L, 41749);
  }
  
  public final k PR()
  {
    GMTrace.i(5603590144000L, 41750);
    k localk = this.hpd;
    GMTrace.o(5603590144000L, 41750);
    return localk;
  }
  
  public final class a
    implements e<Boolean, c<Integer, Map<String, Object>>>
  {
    public a()
    {
      GMTrace.i(5582920613888L, 41596);
      GMTrace.o(5582920613888L, 41596);
    }
    
    public final String PJ()
    {
      GMTrace.i(5583054831616L, 41597);
      GMTrace.o(5583054831616L, 41597);
      return "Vending.LOGIC";
    }
  }
  
  public final class b
    implements e<d<Boolean, String, Long>, Map<String, Object>>
  {
    public b()
    {
      GMTrace.i(5595402862592L, 41689);
      GMTrace.o(5595402862592L, 41689);
    }
    
    public final String PJ()
    {
      GMTrace.i(5595537080320L, 41690);
      GMTrace.o(5595537080320L, 41690);
      return "Vending.LOGIC";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */