package com.tencent.mm.plugin.fps_lighter.b;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fps_lighter.c.d;
import com.tencent.mm.plugin.fps_lighter.d.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.report.service.g.5;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

public final class b
  implements a.a
{
  boolean isInit;
  public HashMap<String, LinkedList<d>> lmy;
  Timer lmz;
  
  public b()
  {
    GMTrace.i(5226840981504L, 38943);
    this.isInit = false;
    this.lmy = new HashMap();
    this.lmz = new Timer();
    GMTrace.o(5226840981504L, 38943);
  }
  
  public final void L(LinkedList<d> paramLinkedList)
  {
    GMTrace.i(5226975199232L, 38944);
    synchronized (this.lmy)
    {
      Iterator localIterator = paramLinkedList.iterator();
      if (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        w.i("MicroMsg.FPSAnalyser.result", locald.toString());
        String str = locald.aAo();
        if (!this.lmy.containsKey(str)) {
          this.lmy.put(str, new LinkedList());
        }
        ((LinkedList)this.lmy.get(str)).add(locald);
      }
    }
    paramLinkedList.clear();
    new ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14422500179968L, 107456);
        GMTrace.releaseBuffer();
        GMTrace.o(14422500179968L, 107456);
      }
    });
    GMTrace.o(5226975199232L, 38944);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */