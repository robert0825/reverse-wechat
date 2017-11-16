package com.tencent.mm.pluginsdk.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.jv;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public abstract class c<T extends b>
  extends com.tencent.mm.sdk.b.c<T>
  implements e
{
  private static HashMap<b, c<? extends b>> gEO;
  private static HashMap<k, b> tms;
  private int tmr;
  
  static
  {
    GMTrace.i(902345785344L, 6723);
    tms = new HashMap();
    gEO = new HashMap();
    GMTrace.o(902345785344L, 6723);
  }
  
  public c()
  {
    GMTrace.i(901137825792L, 6714);
    this.tmr = 0;
    GMTrace.o(901137825792L, 6714);
  }
  
  public static void k(b paramb)
  {
    GMTrace.i(901808914432L, 6719);
    Iterator localIterator = tms.entrySet().iterator();
    Map.Entry localEntry;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localEntry = (Map.Entry)localIterator.next();
    } while (localEntry.getValue() != paramb);
    for (paramb = (k)localEntry.getKey();; paramb = null)
    {
      if (paramb != null)
      {
        h.wS().c(paramb);
        tms.remove(paramb);
      }
      GMTrace.o(901808914432L, 6719);
      return;
    }
  }
  
  public abstract b a(int paramInt, k paramk, T paramT);
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(901674696704L, 6718);
    if (ann() == paramk.getType())
    {
      b localb = (b)tms.remove(paramk);
      if (localb == null)
      {
        GMTrace.o(901674696704L, 6718);
        return;
      }
      jv localjv = new jv();
      localjv.eOb.eOc = a(paramInt2, paramk, localb);
      localjv.eOb.errType = paramInt1;
      localjv.eOb.errCode = paramInt2;
      localjv.eOb.eAR = paramString;
      a.vgX.m(localjv);
    }
    GMTrace.o(901674696704L, 6718);
  }
  
  public final void aJL()
  {
    GMTrace.i(902077349888L, 6721);
    if (this.tmr == 0)
    {
      GMTrace.o(902077349888L, 6721);
      return;
    }
    this.tmr -= 1;
    if (this.tmr == 0) {
      h.wS().b(ann(), this);
    }
    GMTrace.o(902077349888L, 6721);
  }
  
  public abstract int ann();
  
  public abstract k b(T paramT);
  
  public final void bJb()
  {
    GMTrace.i(901943132160L, 6720);
    if (this.tmr == 0) {
      h.wS().a(ann(), this);
    }
    this.tmr += 1;
    GMTrace.o(901943132160L, 6720);
  }
  
  public final void l(T paramT)
  {
    GMTrace.i(902211567616L, 6722);
    k localk = b(paramT);
    h.wS().a(localk, 0);
    tms.put(localk, paramT);
    GMTrace.o(902211567616L, 6722);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */