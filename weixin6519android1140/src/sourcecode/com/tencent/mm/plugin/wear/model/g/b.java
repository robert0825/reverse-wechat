package com.tencent.mm.plugin.wear.model.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.g.a.tg;
import com.tencent.mm.g.a.tg.b;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedHashMap;

public final class b
  implements d
{
  public b()
  {
    GMTrace.i(9174721232896L, 68357);
    GMTrace.o(9174721232896L, 68357);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(9174855450624L, 68358);
    ??? = parama.gtM;
    at.AR();
    if (bg.nm((String)c.xh().get(2, "")))
    {
      GMTrace.o(9174855450624L, 68358);
      return null;
    }
    parama = n.a(((bu)???).tPW);
    Object localObject2 = n.a(((bu)???).tPX);
    if ((bg.nm(parama)) || (bg.nm((String)localObject2)))
    {
      w.e("MicroMsg.YoExtension", "neither from-user nor to-user can be empty");
      GMTrace.o(9174855450624L, 68358);
      return null;
    }
    Object localObject3 = n.a(((bu)???).tPY);
    w.i("MicroMsg.YoExtension", "from  " + parama + "content " + (String)localObject3);
    localObject2 = com.tencent.mm.plugin.wear.model.a.bBm().rzA;
    synchronized (((a)localObject2).rAO)
    {
      tg localtg = a.KZ(parama);
      if ((!((a)localObject2).rAO.containsKey(parama)) && (localtg.eYN.eYO != 1))
      {
        w.i("MicroMsg.wear.WearYoLogic", "Can add Yo Message %s", new Object[] { parama });
        localObject3 = new a.a((a)localObject2, parama, (String)localObject3);
        ((a)localObject2).rAO.put(parama, localObject3);
        com.tencent.mm.plugin.wear.model.a.bBm().rzA.bBD();
        GMTrace.o(9174855450624L, 68358);
        return null;
      }
      w.i("MicroMsg.wear.WearYoLogic", "Can not add Yo Message %s", new Object[] { parama });
      localObject2 = new tg();
      ((tg)localObject2).eYM.eCx = 2;
      ((tg)localObject2).eYM.username = parama;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(9174989668352L, 68359);
    GMTrace.o(9174989668352L, 68359);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */