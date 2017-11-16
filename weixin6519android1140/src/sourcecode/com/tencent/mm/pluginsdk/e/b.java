package com.tencent.mm.pluginsdk.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jv;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import java.util.ArrayList;

public abstract class b
  extends c<jv>
{
  protected ArrayList<String> tmq;
  
  public b(int paramInt)
  {
    super(0);
    GMTrace.i(902480003072L, 6724);
    this.tmq = new ArrayList(3);
    this.vhf = jv.class.getName().hashCode();
    GMTrace.o(902480003072L, 6724);
  }
  
  public static void a(String paramString, b paramb)
  {
    GMTrace.i(902748438528L, 6726);
    if (!paramb.tmq.contains(paramString)) {
      paramb.tmq.add(paramString);
    }
    a.vgX.b(paramb);
    e.Od(paramString);
    GMTrace.o(902748438528L, 6726);
  }
  
  public static void b(String paramString, b paramb)
  {
    GMTrace.i(902882656256L, 6727);
    e.Oe(paramString);
    a.vgX.c(paramb);
    if (paramb.tmq.contains(paramString)) {
      paramb.tmq.remove(paramString);
    }
    GMTrace.o(902882656256L, 6727);
  }
  
  public abstract void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.sdk.b.b paramb);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */