package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class q
{
  public HashMap<Integer, a> rAL;
  
  public q()
  {
    GMTrace.i(9204249133056L, 68577);
    this.rAL = new HashMap();
    GMTrace.o(9204249133056L, 68577);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(9204383350784L, 68578);
    Iterator localIterator = parama.bBA().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      w.d("MicroMsg.Wear.WearHttpServerLogic", "add funId %d %s", new Object[] { Integer.valueOf(i), parama });
      this.rAL.put(Integer.valueOf(i), parama);
    }
    GMTrace.o(9204383350784L, 68578);
  }
  
  public final a xm(int paramInt)
  {
    GMTrace.i(9204517568512L, 68579);
    a locala = (a)this.rAL.get(Integer.valueOf(paramInt));
    GMTrace.o(9204517568512L, 68579);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */