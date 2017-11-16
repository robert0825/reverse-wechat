package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import java.util.ArrayList;
import java.util.Map;

public final class i
{
  public static final class a
    implements bt.a
  {
    private static final a hNa;
    
    static
    {
      GMTrace.i(10024587886592L, 74689);
      hNa = new a();
      GMTrace.o(10024587886592L, 74689);
    }
    
    public a()
    {
      GMTrace.i(10023916797952L, 74684);
      GMTrace.o(10023916797952L, 74684);
    }
    
    public static void oF(String paramString)
    {
      GMTrace.i(16052574486528L, 119601);
      boolean bool = h.xw().wL();
      w.i("MicroMsg.AppBrandUsagePushingUpdateLogic", "parseThenProcess, accReady %b, received xml %s", new Object[] { Boolean.valueOf(bool), paramString });
      if (!bool)
      {
        GMTrace.o(16052574486528L, 119601);
        return;
      }
      Map localMap = bh.q(paramString, "sysmsg");
      if ((localMap == null) || (localMap.size() <= 0))
      {
        GMTrace.o(16052574486528L, 119601);
        return;
      }
      int j = bg.getInt((String)localMap.get(".sysmsg.UpdateWxaUsageListNotify.Type"), 0);
      int k = bg.getInt((String)localMap.get(".sysmsg.UpdateWxaUsageListNotify.DeleteCount"), 0);
      ArrayList localArrayList3;
      ArrayList localArrayList1;
      ArrayList localArrayList2;
      int i;
      if (k > 0)
      {
        localArrayList3 = new ArrayList();
        localArrayList1 = new ArrayList();
        localArrayList2 = new ArrayList();
        i = 0;
        if (i < k)
        {
          Object localObject = new StringBuilder(".sysmsg.UpdateWxaUsageListNotify.DeleteList.DeleteAppInfo");
          if (i == 0) {}
          for (paramString = "";; paramString = Integer.valueOf(i))
          {
            paramString = paramString;
            localObject = (String)localMap.get(paramString + ".UserName");
            String str = (String)localMap.get(paramString + ".AppID");
            int m = bg.getInt((String)localMap.get(paramString + ".AppType"), 0);
            if ((!bg.nm((String)localObject)) && (!bg.nm(str)))
            {
              localArrayList3.add(localObject);
              localArrayList1.add(str);
              localArrayList2.add(Integer.valueOf(m));
            }
            i += 1;
            break;
          }
        }
      }
      for (paramString = localArrayList3;; paramString = null)
      {
        switch (j)
        {
        }
        for (;;)
        {
          GMTrace.o(16052574486528L, 119601);
          return;
          new l(4, 1, Integer.MAX_VALUE, 30).Dy();
          GMTrace.o(16052574486528L, 119601);
          return;
          new l(4, 2, 0, 0).Dy();
          GMTrace.o(16052574486528L, 119601);
          return;
          if (!bg.cc(paramString))
          {
            i = 0;
            while (i < paramString.size())
            {
              n.i((String)paramString.get(i), (String)localArrayList1.get(i), ((Integer)localArrayList2.get(i)).intValue());
              i += 1;
            }
            GMTrace.o(16052574486528L, 119601);
            return;
            if (!bg.cc(paramString))
            {
              i = 0;
              while (i < paramString.size())
              {
                e.Sk().h((String)paramString.get(i), ((Integer)localArrayList2.get(i)).intValue(), false);
                i += 1;
              }
            }
          }
        }
        localArrayList2 = null;
        localArrayList1 = null;
      }
    }
    
    public static void register()
    {
      GMTrace.i(10024051015680L, 74685);
      ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("UpdateWxaUsageListNotify", hNa, true);
      GMTrace.o(10024051015680L, 74685);
    }
    
    public static void unregister()
    {
      GMTrace.i(10024185233408L, 74686);
      ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("UpdateWxaUsageListNotify", hNa, true);
      GMTrace.o(10024185233408L, 74686);
    }
    
    public final void a(final d.a parama)
    {
      GMTrace.i(10024319451136L, 74687);
      parama = com.tencent.mm.platformtools.n.a(parama.gtM.tPY);
      if (bg.nm(parama))
      {
        GMTrace.o(10024319451136L, 74687);
        return;
      }
      d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10024856322048L, 74691);
          i.a.oF(parama);
          GMTrace.o(10024856322048L, 74691);
        }
      });
      GMTrace.o(10024319451136L, 74687);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */