package com.tencent.mm.plugin.appbrand.p;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.d.d.a;
import com.tencent.mm.plugin.appbrand.p.e.i;
import java.net.InetSocketAddress;

public abstract class b
  implements d
{
  public b()
  {
    GMTrace.i(10167932420096L, 75757);
    GMTrace.o(10167932420096L, 75757);
  }
  
  public final String a(a parama)
  {
    GMTrace.i(10168469291008L, 75761);
    parama = parama.abF();
    if (parama == null) {
      throw new com.tencent.mm.plugin.appbrand.p.c.d("socket not bound");
    }
    StringBuffer localStringBuffer = new StringBuffer(90);
    localStringBuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
    localStringBuffer.append(parama.getPort());
    localStringBuffer.append("\" /></cross-domain-policy>\000");
    parama = localStringBuffer.toString();
    GMTrace.o(10168469291008L, 75761);
    return parama;
  }
  
  public final void a(a parama, com.tencent.mm.plugin.appbrand.p.d.d paramd)
  {
    GMTrace.i(10168335073280L, 75760);
    paramd = new com.tencent.mm.plugin.appbrand.p.d.e(paramd);
    paramd.a(d.a.iIn);
    parama.b(paramd);
    GMTrace.o(10168335073280L, 75760);
  }
  
  public final i abG()
  {
    GMTrace.i(10168066637824L, 75758);
    com.tencent.mm.plugin.appbrand.p.e.e locale = new com.tencent.mm.plugin.appbrand.p.e.e();
    GMTrace.o(10168066637824L, 75758);
    return locale;
  }
  
  public void c(com.tencent.mm.plugin.appbrand.p.d.d paramd)
  {
    GMTrace.i(10168200855552L, 75759);
    GMTrace.o(10168200855552L, 75759);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */