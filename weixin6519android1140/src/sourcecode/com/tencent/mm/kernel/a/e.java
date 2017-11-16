package com.tencent.mm.kernel.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.i;
import com.tencent.mm.vending.g.d.b;
import com.tencent.mm.vending.g.g;
import java.util.ArrayList;

public abstract class e
  implements b
{
  public final ArrayList<String> gaj;
  
  public e()
  {
    GMTrace.i(18790750355456L, 140002);
    this.gaj = new ArrayList();
    GMTrace.o(18790750355456L, 140002);
  }
  
  public static void f(Class<? extends com.tencent.mm.kernel.b.d> paramClass)
  {
    GMTrace.i(18791287226368L, 140006);
    i.xD();
    i.xu().f(paramClass);
    GMTrace.o(18791287226368L, 140006);
  }
  
  public void a(final com.tencent.mm.kernel.b.e parame, final com.tencent.mm.vending.h.d paramd, d.b paramb)
  {
    GMTrace.i(18791824097280L, 140010);
    final long l = a.timestamp();
    a.a("boot start to execute task on scheduler [%s]...", new Object[] { paramd.getType() });
    final com.tencent.mm.vending.g.c localc = g.ckp().mN(true);
    localc.d(new com.tencent.mm.vending.c.a() {});
    GMTrace.o(18791824097280L, 140010);
  }
  
  public final void c(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18791153008640L, 140005);
    i.xD();
    i.xu().a(parame);
    GMTrace.o(18791153008640L, 140005);
  }
  
  public final void eQ(String paramString)
  {
    GMTrace.i(18791421444096L, 140007);
    if (!this.gaj.contains(paramString)) {
      this.gaj.add(paramString);
    }
    GMTrace.o(18791421444096L, 140007);
  }
  
  public void pc()
  {
    GMTrace.i(18790884573184L, 140003);
    GMTrace.o(18790884573184L, 140003);
  }
  
  public final void xE()
  {
    GMTrace.i(18791018790912L, 140004);
    i.xD();
    i.xu().wX();
    GMTrace.o(18791018790912L, 140004);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */