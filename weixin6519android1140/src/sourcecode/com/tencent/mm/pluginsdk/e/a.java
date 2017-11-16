package com.tencent.mm.pluginsdk.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.iz;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import java.util.ArrayList;

public abstract class a
  extends c<iz>
{
  protected ArrayList<String> tmq;
  
  public a()
  {
    GMTrace.i(900198301696L, 6707);
    this.tmq = new ArrayList(3);
    this.vhf = iz.class.getName().hashCode();
    GMTrace.o(900198301696L, 6707);
  }
  
  public static void a(String paramString, a parama)
  {
    GMTrace.i(900466737152L, 6709);
    if (!parama.tmq.contains(paramString)) {
      parama.tmq.add(paramString);
    }
    com.tencent.mm.sdk.b.a.vgX.b(parama);
    e.Od(paramString);
    GMTrace.o(900466737152L, 6709);
  }
  
  public static void b(String paramString, a parama)
  {
    GMTrace.i(900600954880L, 6710);
    e.Oe(paramString);
    com.tencent.mm.sdk.b.a.vgX.c(parama);
    if (parama.tmq.contains(paramString)) {
      parama.tmq.remove(paramString);
    }
    GMTrace.o(900600954880L, 6710);
  }
  
  public abstract void j(b paramb);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */