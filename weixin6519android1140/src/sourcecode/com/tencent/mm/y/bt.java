package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.messenger.foundation.a.l;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bt
  implements com.tencent.mm.ad.d
{
  private Map<String, List<a>> gpr;
  private Map<String, List<a>> gps;
  private Map<String, List<m>> gpt;
  private Map<String, l> gpu;
  
  public bt()
  {
    GMTrace.i(628138967040L, 4680);
    this.gpr = new HashMap();
    this.gps = new HashMap();
    this.gpt = new HashMap();
    this.gpu = new ConcurrentHashMap();
    GMTrace.o(628138967040L, 4680);
  }
  
  @Deprecated
  private void a(String paramString, d.a parama, boolean paramBoolean)
  {
    GMTrace.i(628675837952L, 4684);
    if (paramBoolean) {}
    for (Map localMap = this.gps;; localMap = this.gpr)
    {
      paramString = (List)localMap.get(paramString);
      if ((paramString != null) && (!paramString.isEmpty())) {
        break;
      }
      w.w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
      GMTrace.o(628675837952L, 4684);
      return;
    }
    w.i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", new Object[] { Integer.valueOf(paramString.size()) });
    paramString = paramString.iterator();
    while (paramString.hasNext()) {
      ((a)paramString.next()).a(parama);
    }
    GMTrace.o(628675837952L, 4684);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(14607720644608L, 108836);
    if ((bg.nm(paramString)) || (paraml == null))
    {
      GMTrace.o(14607720644608L, 108836);
      return;
    }
    if (this.gpu.containsKey(paramString)) {
      w.w("MicroMsg.SysCmdMsgExtension", "NewXmlConsumer for %s has exist! %s", new Object[] { paramString, bg.bQW() });
    }
    this.gpu.put(paramString, paraml);
    GMTrace.o(14607720644608L, 108836);
  }
  
  public final void a(String paramString, m paramm)
  {
    GMTrace.i(16766478581760L, 124920);
    if ((bg.nm(paramString)) || (paramm == null))
    {
      GMTrace.o(16766478581760L, 124920);
      return;
    }
    for (;;)
    {
      Object localObject;
      synchronized (this.gpt)
      {
        localObject = (List)this.gpt.get(paramString);
        if (localObject != null) {
          break label122;
        }
        localObject = new LinkedList();
        this.gpt.put(paramString, localObject);
        paramString = (String)localObject;
      }
      try
      {
        if (!paramString.contains(paramm)) {
          paramString.add(paramm);
        }
        GMTrace.o(16766478581760L, 124920);
        return;
      }
      finally {}
      paramString = finally;
      throw paramString;
      label122:
      paramString = (String)localObject;
    }
  }
  
  @Deprecated
  public final void a(String paramString, a parama, boolean paramBoolean)
  {
    GMTrace.i(628273184768L, 4681);
    if ((bg.nm(paramString)) || (parama == null))
    {
      GMTrace.o(628273184768L, 4681);
      return;
    }
    if (paramBoolean) {}
    for (Map localMap = this.gps;; localMap = this.gpr)
    {
      List localList = (List)localMap.get(paramString);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new LinkedList();
        localMap.put(paramString, localObject);
      }
      if (!((List)localObject).contains(parama)) {
        ((List)localObject).add(parama);
      }
      GMTrace.o(628273184768L, 4681);
      return;
    }
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(628541620224L, 4683);
    Object localObject1 = parama.gtM;
    String str;
    switch (((bu)localObject1).lQc)
    {
    default: 
      w.w("MicroMsg.SysCmdMsgExtension", "cmdAM msgType is %d, ignore, return now", new Object[] { Integer.valueOf(((bu)localObject1).lQc) });
      GMTrace.o(628541620224L, 4683);
      return null;
    case 10001: 
      str = n.a(((bu)localObject1).tPW);
      n.a(((bu)localObject1).tPY);
      a(str, parama, false);
      com.tencent.mm.plugin.report.d.oqe.A(10395, String.valueOf(((bu)localObject1).tQd));
      GMTrace.o(628541620224L, 4683);
      return null;
    }
    Object localObject2 = n.a(((bu)localObject1).tPY);
    if (bg.nm((String)localObject2))
    {
      w.e("MicroMsg.SysCmdMsgExtension", "null msg content");
      GMTrace.o(628541620224L, 4683);
      return null;
    }
    if (((String)localObject2).startsWith("~SEMI_XML~"))
    {
      localObject1 = aw.Se((String)localObject2);
      if (localObject1 == null)
      {
        w.e("MicroMsg.SysCmdMsgExtension", "SemiXml values is null, msgContent %s", new Object[] { localObject2 });
        GMTrace.o(628541620224L, 4683);
        return null;
      }
      str = "brand_service";
      w.d("MicroMsg.SysCmdMsgExtension", "recieve a syscmd_newxml %s subType %s", new Object[] { localObject2, str });
      if (str != null) {
        a(str, parama, true);
      }
    }
    else
    {
      for (;;)
      {
        synchronized (this.gpt)
        {
          localObject2 = (List)this.gpt.get(str);
          if ((localObject2 == null) || (((List)localObject2).isEmpty()))
          {
            w.w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
            localObject2 = (l)this.gpu.get(str);
            if (localObject2 == null) {
              break;
            }
            parama = ((l)localObject2).a(str, (Map)localObject1, parama);
            GMTrace.o(628541620224L, 4683);
            return parama;
            int i = ((String)localObject2).indexOf("<sysmsg");
            if (i == -1)
            {
              w.e("MicroMsg.SysCmdMsgExtension", "msgContent not start with <sysmsg");
              GMTrace.o(628541620224L, 4683);
              return null;
            }
            localObject1 = ((String)localObject2).substring(i);
            w.d("MicroMsg.SysCmdMsgExtension", "oneliang, msg content:%s,sub content:%s", new Object[] { localObject2, localObject1 });
            localObject1 = bh.q((String)localObject1, "sysmsg");
            if (localObject1 == null)
            {
              w.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", new Object[] { localObject2 });
              GMTrace.o(628541620224L, 4683);
              return null;
            }
            str = (String)((Map)localObject1).get(".sysmsg.$type");
          }
        }
        w.i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", new Object[] { Integer.valueOf(((List)localObject2).size()) });
        try
        {
          ??? = ((List)localObject2).iterator();
          while (((Iterator)???).hasNext()) {
            ((m)((Iterator)???).next()).b(str, (Map)localObject1);
          }
        }
        finally {}
      }
      w.e("MicroMsg.SysCmdMsgExtension", "no NewXmlConsumer to consume cmd %s!!", new Object[] { str });
    }
    GMTrace.o(628541620224L, 4683);
    return null;
  }
  
  public final void b(String paramString, l arg2)
  {
    GMTrace.i(20306336940032L, 151294);
    if ((bg.nm(paramString)) || (??? == null))
    {
      GMTrace.o(20306336940032L, 151294);
      return;
    }
    synchronized (this.gpu)
    {
      this.gpu.remove(paramString);
      GMTrace.o(20306336940032L, 151294);
      return;
    }
  }
  
  public final void b(String paramString, m paramm)
  {
    GMTrace.i(16766612799488L, 124921);
    if ((bg.nm(paramString)) || (paramm == null))
    {
      GMTrace.o(16766612799488L, 124921);
      return;
    }
    synchronized (this.gpt)
    {
      paramString = (List)this.gpt.get(paramString);
      if (paramString == null) {}
    }
    GMTrace.o(16766612799488L, 124921);
  }
  
  @Deprecated
  public final void b(String paramString, a parama, boolean paramBoolean)
  {
    GMTrace.i(628407402496L, 4682);
    if ((bg.nm(paramString)) || (parama == null))
    {
      GMTrace.o(628407402496L, 4682);
      return;
    }
    if (paramBoolean) {}
    for (Map localMap = this.gps;; localMap = this.gpr)
    {
      paramString = (List)localMap.get(paramString);
      if (paramString != null) {
        paramString.remove(parama);
      }
      GMTrace.o(628407402496L, 4682);
      return;
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(628810055680L, 4685);
    GMTrace.o(628810055680L, 4685);
  }
  
  public static abstract interface a
  {
    public abstract void a(d.a parama);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */