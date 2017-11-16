package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.agc;
import com.tencent.mm.protocal.c.agd;
import com.tencent.mm.protocal.c.bup;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.List;

public enum g
{
  public static Integer hMX;
  
  static
  {
    GMTrace.i(10029419724800L, 74725);
    hMY = new g[0];
    hMX = null;
    GMTrace.o(10029419724800L, 74725);
  }
  
  static void a(int paramInt1, int paramInt2, b paramb)
  {
    GMTrace.i(16370402066432L, 121969);
    if (paramb == null)
    {
      GMTrace.o(16370402066432L, 121969);
      return;
    }
    if ((((agc)paramb.gtC.gtK).condition & 0x2) == 0)
    {
      GMTrace.o(16370402066432L, 121969);
      return;
    }
    paramb = (agd)paramb.gtD.gtK;
    Object localObject1;
    Object localObject2;
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramb != null))
    {
      if (com.tencent.mm.plugin.appbrand.app.e.Sk() != null)
      {
        localObject1 = com.tencent.mm.plugin.appbrand.app.e.Sk();
        localObject2 = paramb.uvR;
        long l = ((f)localObject1).hKn.cE(Thread.currentThread().getId());
        ((f)localObject1).hKn.delete("AppBrandStarApp", "", null);
        f.a locala = new f.a();
        Iterator localIterator = ((List)localObject2).iterator();
        while (localIterator.hasNext())
        {
          bup localbup = (bup)localIterator.next();
          if (!bg.nm(localbup.username))
          {
            locala.field_username = localbup.username;
            locala.field_versionType = localbup.tWR;
            locala.field_updateTime = localbup.ubf;
            ((f)localObject1).hKn.insert("AppBrandStarApp", null, locala.qL());
          }
        }
        ((f)localObject1).hKn.aL(l);
        ((f)localObject1).a("batch", 3, localObject2);
        h.r(paramb.uvR);
      }
      localObject1 = com.tencent.mm.kernel.h.xy().xh();
      localObject2 = w.a.vuA;
      if ((paramb.status & 0x1) <= 0) {
        break label292;
      }
    }
    label292:
    for (boolean bool = true;; bool = false)
    {
      ((t)localObject1).a((w.a)localObject2, Boolean.valueOf(bool));
      GMTrace.o(16370402066432L, 121969);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */