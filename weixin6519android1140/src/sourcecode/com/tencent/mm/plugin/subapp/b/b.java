package com.tencent.mm.plugin.subapp.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public final class b
  implements d, e
{
  private Queue<a> qrZ;
  private boolean qsa;
  
  public b()
  {
    GMTrace.i(5848269062144L, 43573);
    this.qrZ = null;
    this.qsa = false;
    GMTrace.o(5848269062144L, 43573);
  }
  
  private void brC()
  {
    GMTrace.i(5848537497600L, 43575);
    if (this.qsa)
    {
      GMTrace.o(5848537497600L, 43575);
      return;
    }
    if (this.qrZ.size() == 0)
    {
      GMTrace.o(5848537497600L, 43575);
      return;
    }
    Object localObject = (a)this.qrZ.peek();
    if (((a)localObject).qsb.size() == 0)
    {
      this.qrZ.poll();
      at.AR();
      c.xh().set(8193, ((a)localObject).hsF);
      at.AR();
      c.xh().set(8449, Long.valueOf(bg.Pu()));
      GMTrace.o(5848537497600L, 43575);
      return;
    }
    localObject = (String)((a)localObject).qsb.peek();
    if ((localObject == null) || (((String)localObject).length() <= 0))
    {
      GMTrace.o(5848537497600L, 43575);
      return;
    }
    this.qsa = true;
    localObject = new a((String)localObject);
    at.wS().a(141, this);
    at.wS().a((k)localObject, 0);
    GMTrace.o(5848537497600L, 43575);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5848671715328L, 43576);
    if (paramk.getType() != 141)
    {
      this.qsa = false;
      GMTrace.o(5848671715328L, 43576);
      return;
    }
    at.wS().b(141, this);
    paramString = ((a)paramk).url;
    paramk = (a)this.qrZ.peek();
    if ((paramk == null) || (paramk.qsb.size() == 0))
    {
      w.e("MicroMsg.PushMessageExtension", "getDoSceneQueue failed ! reset queue!");
      this.qrZ = new LinkedList();
      this.qsa = false;
      GMTrace.o(5848671715328L, 43576);
      return;
    }
    if (paramk.qsb.size() == 0)
    {
      w.e("MicroMsg.PushMessageExtension", "get imgQueue failed ! ignore this message");
      this.qrZ.poll();
      this.qsa = false;
      GMTrace.o(5848671715328L, 43576);
      return;
    }
    if (!((String)paramk.qsb.peek()).equals(paramString))
    {
      w.e("MicroMsg.PushMessageExtension", "check img url failed ! ignore this message");
      this.qrZ.poll();
      this.qsa = false;
      GMTrace.o(5848671715328L, 43576);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.PushMessageExtension", "down failed [" + paramInt1 + "," + paramInt2 + "] ignore this message : img:[" + paramString + "] ");
      this.qrZ.poll();
      this.qsa = false;
      GMTrace.o(5848671715328L, 43576);
      return;
    }
    paramk.qsb.poll();
    this.qsa = false;
    brC();
    GMTrace.o(5848671715328L, 43576);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(5848403279872L, 43574);
    parama = com.tencent.mm.platformtools.n.a(parama.gtM.tPY);
    if (this.qrZ == null) {
      this.qrZ = new LinkedList();
    }
    parama = new a(parama);
    if (parama.hsF != null)
    {
      this.qrZ.offer(parama);
      brC();
    }
    GMTrace.o(5848403279872L, 43574);
    return null;
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(5848805933056L, 43577);
    GMTrace.o(5848805933056L, 43577);
  }
  
  static final class a
  {
    public String hsF;
    public Queue<String> qsb;
    
    a(String paramString)
    {
      GMTrace.i(5848134844416L, 43572);
      this.hsF = paramString;
      this.qsb = new LinkedList();
      w.d("MicroMsg.PushMessageExtension", "DoSceneStruct:" + paramString);
      paramString = com.tencent.mm.pluginsdk.k.a.a.aU(ab.getContext(), paramString);
      if ((paramString == null) || (paramString.size() <= 0))
      {
        w.e("MicroMsg.PushMessageExtension", "Parse Message Failed !");
        GMTrace.o(5848134844416L, 43572);
        return;
      }
      int i = 0;
      while (i < paramString.size())
      {
        Object localObject = ((com.tencent.mm.pluginsdk.k.a.a)paramString.get(i)).trO;
        if (localObject != null)
        {
          localObject = ((Map)localObject).entrySet().iterator();
          while (((Iterator)localObject).hasNext()) {
            this.qsb.offer(((Map.Entry)((Iterator)localObject).next()).getValue());
          }
        }
        i += 1;
      }
      GMTrace.o(5848134844416L, 43572);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */