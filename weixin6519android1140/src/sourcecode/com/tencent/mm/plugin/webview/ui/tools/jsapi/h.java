package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.modelcache.q;
import com.tencent.mm.plugin.webview.modelcache.q.a;
import com.tencent.mm.sdk.platformtools.w;

public final class h
{
  private static final SparseArray<g> rUQ;
  private static volatile g rUR;
  
  static
  {
    GMTrace.i(12252467953664L, 91288);
    rUQ = new SparseArray();
    rUR = null;
    GMTrace.o(12252467953664L, 91288);
  }
  
  private h()
  {
    GMTrace.i(12251931082752L, 91284);
    GMTrace.o(12251931082752L, 91284);
  }
  
  @Deprecated
  public static g bFN()
  {
    GMTrace.i(12252065300480L, 91285);
    if (rUR == null) {
      rUR = new g(0);
    }
    g localg = rUR;
    GMTrace.o(12252065300480L, 91285);
    return localg;
  }
  
  public static void detach()
  {
    GMTrace.i(12252333735936L, 91287);
    w.i("MicroMsg.MsgHandlerHolder", "detach");
    int i = 0;
    for (;;)
    {
      try
      {
        if (i < rUQ.size())
        {
          g localg = (g)rUQ.valueAt(i);
          int j = rUQ.keyAt(i);
          if (localg != null) {
            q.a.rGn.xB(j);
          }
        }
        else
        {
          rUQ.clear();
          if (rUR != null)
          {
            q.a.rGn.xB(0);
            rUR = null;
          }
          GMTrace.o(12252333735936L, 91287);
          return;
        }
      }
      finally {}
      i += 1;
    }
  }
  
  public static g yp(int paramInt)
  {
    GMTrace.i(12252199518208L, 91286);
    try
    {
      if (rUQ.get(paramInt) == null)
      {
        localg = new g(paramInt);
        rUQ.put(paramInt, localg);
      }
      g localg = (g)rUQ.get(paramInt);
      rUR = localg;
      GMTrace.o(12252199518208L, 91286);
      return localg;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */