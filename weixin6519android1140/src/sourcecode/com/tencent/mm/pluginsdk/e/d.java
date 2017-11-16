package com.tencent.mm.pluginsdk.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.iz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;

public abstract class d
  implements j.a
{
  public int tmr;
  
  public d()
  {
    GMTrace.i(903151091712L, 6729);
    this.tmr = 0;
    GMTrace.o(903151091712L, 6729);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(903822180352L, 6734);
    paraml = new iz();
    paraml.eMB.eMC = zO(paramString);
    a.vgX.m(paraml);
    GMTrace.o(903822180352L, 6734);
  }
  
  public abstract j aGn();
  
  public final void register()
  {
    GMTrace.i(903553744896L, 6732);
    if (this.tmr == 0)
    {
      j localj = aGn();
      if (localj != null) {
        localj.c(this);
      }
    }
    this.tmr += 1;
    GMTrace.o(903553744896L, 6732);
  }
  
  public final void unregister()
  {
    GMTrace.i(903687962624L, 6733);
    if (this.tmr == 0)
    {
      GMTrace.o(903687962624L, 6733);
      return;
    }
    this.tmr -= 1;
    if (this.tmr == 0)
    {
      j localj = aGn();
      if (localj != null) {
        localj.j(this);
      }
    }
    GMTrace.o(903687962624L, 6733);
  }
  
  public abstract b zO(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */