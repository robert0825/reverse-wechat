package com.tencent.mm.r;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class i
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private e fUi;
  private c fUj;
  Map<Integer, List<f>> fUk;
  
  static
  {
    GMTrace.i(4510252531712L, 33604);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("FunctionMsgItem".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4508373483520L, 33590);
        String[] arrayOfString = e.fTX;
        GMTrace.o(4508373483520L, 33590);
        return arrayOfString;
      }
    });
    GMTrace.o(4510252531712L, 33604);
  }
  
  public i()
  {
    GMTrace.i(4508776136704L, 33593);
    this.fUj = new c();
    this.fUk = new HashMap();
    GMTrace.o(4508776136704L, 33593);
  }
  
  public static void a(f paramf)
  {
    try
    {
      GMTrace.i(4509313007616L, 33597);
      w.i("MicroMsg.SubCoreFunctionMsg", "removeUpdateCallback, msgType: %s, callback: %s", new Object[] { Integer.valueOf(12399999), paramf });
      if (paramf != null)
      {
        List localList = (List)vE().fUk.get(Integer.valueOf(12399999));
        if ((localList != null) && (localList.contains(paramf)))
        {
          localList.remove(paramf);
          vE().fUk.put(Integer.valueOf(12399999), localList);
        }
      }
      GMTrace.o(4509313007616L, 33597);
      return;
    }
    finally {}
  }
  
  public static void b(f paramf)
  {
    try
    {
      GMTrace.i(4509447225344L, 33598);
      w.i("MicroMsg.SubCoreFunctionMsg", "addUpdateCallback, msgType: %s, callback: %s", new Object[] { Integer.valueOf(12399999), paramf });
      if (paramf != null)
      {
        List localList = (List)vE().fUk.get(Integer.valueOf(12399999));
        Object localObject = localList;
        if (localList == null) {
          localObject = new ArrayList();
        }
        if (!((List)localObject).contains(paramf)) {
          ((List)localObject).add(paramf);
        }
        vE().fUk.put(Integer.valueOf(12399999), localObject);
      }
      GMTrace.o(4509447225344L, 33598);
      return;
    }
    finally {}
  }
  
  static i vE()
  {
    GMTrace.i(4508910354432L, 33594);
    i locali = (i)p.o(i.class);
    GMTrace.o(4508910354432L, 33594);
    return locali;
  }
  
  public static e vF()
  {
    GMTrace.i(4509044572160L, 33595);
    if (vE().fUi == null) {
      vE().fUi = new e(h.xy().fYV);
    }
    e locale = vE().fUi;
    GMTrace.o(4509044572160L, 33595);
    return locale;
  }
  
  public static c vG()
  {
    GMTrace.i(4509178789888L, 33596);
    if (vE().fUj == null) {
      vE().fUj = new c();
    }
    c localc = vE().fUj;
    GMTrace.o(4509178789888L, 33596);
    return localc;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4509849878528L, 33601);
    w.i("MicroMsg.SubCoreFunctionMsg", "onAccountPostReset");
    h.xB().h(new a.1(), 10000L);
    GMTrace.o(4509849878528L, 33601);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4509984096256L, 33602);
    GMTrace.o(4509984096256L, 33602);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4509715660800L, 33600);
    GMTrace.o(4509715660800L, 33600);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4510118313984L, 33603);
    w.d("MicroMsg.SubCoreFunctionMsg", "onAccountRelease");
    GMTrace.o(4510118313984L, 33603);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4509581443072L, 33599);
    w.i("MicroMsg.SubCoreFunctionMsg", "getBaseDBFactories");
    HashMap localHashMap = fIv;
    GMTrace.o(4509581443072L, 33599);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\r\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */