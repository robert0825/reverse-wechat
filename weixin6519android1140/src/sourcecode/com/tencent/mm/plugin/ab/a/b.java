package com.tencent.mm.plugin.ab.a;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
  implements a.a
{
  public List<String> gJM;
  public ae iAX;
  public Map<String, List<a>> nYO;
  public Map<String, Set<Integer>> nYP;
  String nYQ;
  a nYR;
  
  public b()
  {
    GMTrace.i(6669547339776L, 49692);
    this.iAX = new ae(Looper.getMainLooper());
    this.gJM = new LinkedList();
    this.nYO = new HashMap();
    this.nYP = new HashMap();
    GMTrace.o(6669547339776L, 49692);
  }
  
  public final int a(final d paramd)
  {
    GMTrace.i(6669949992960L, 49695);
    this.iAX.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6673976524800L, 49725);
        b localb = b.this;
        Object localObject1 = paramd;
        w.i("MicroMsg.FileScanQueueService", "onFinishScan fileUri: %s, result: %s", new Object[] { localb.nYQ, localObject1 });
        Object localObject2 = (List)localb.nYO.get(localb.nYQ);
        if ((localObject2 != null) && (localObject1 != null))
        {
          w.d("MicroMsg.FileScanQueueService", "onFinishScan, callback size: %d", new Object[] { Integer.valueOf(((List)localObject2).size()) });
          localObject2 = ((List)localObject2).iterator();
        }
        while (((Iterator)localObject2).hasNext())
        {
          ((b.a)((Iterator)localObject2).next()).i(localb.nYQ, ((d)localObject1).result, ((d)localObject1).eDg, ((d)localObject1).eDh);
          continue;
          if (localObject2 != null)
          {
            localObject1 = ((List)localObject2).iterator();
            while (((Iterator)localObject1).hasNext()) {
              ((b.a)((Iterator)localObject1).next()).Fk(localb.nYQ);
            }
          }
        }
        localb.nYO.remove(localb.nYQ);
        localb.nYP.remove(localb.nYQ);
        localb.nYQ = null;
        localb.nYR = null;
        localb.aZE();
        GMTrace.o(6673976524800L, 49725);
      }
    });
    GMTrace.o(6669949992960L, 49695);
    return 0;
  }
  
  public final void a(final String paramString, final a parama, final Set<Integer> paramSet)
  {
    GMTrace.i(14312710078464L, 106638);
    w.i("MicroMsg.FileScanQueueService", "startDecodeBlockLoop, fileUri: %s, callback: %x", new Object[] { paramString, Integer.valueOf(parama.hashCode()) });
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FileScanQueueService", "start failed, uri is null or nil");
      GMTrace.o(14312710078464L, 106638);
      return;
    }
    this.iAX.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6670755299328L, 49701);
        b localb = b.this;
        Object localObject1 = paramString;
        b.a locala1 = parama;
        Object localObject2 = paramSet;
        localb.nYP.put(localObject1, localObject2);
        if (localb.nYO.containsKey(localObject1))
        {
          localObject1 = (List)localb.nYO.get(localObject1);
          label106:
          int i;
          if (localObject1 != null)
          {
            if (localObject1 != null)
            {
              if ((localObject1 != null) && (((List)localObject1).size() != 0)) {
                break label132;
              }
              w.e("MicroMsg.FileScanQueueService", "isCallbackInList, list is null or nil");
              break label141;
              i = 0;
              label108:
              if (i == 0) {
                break label179;
              }
            }
            w.e("MicroMsg.FileScanQueueService", "addToCallbackList, list is null or callback is already in list");
          }
          for (;;)
          {
            localb.aZE();
            GMTrace.o(6670755299328L, 49701);
            return;
            label132:
            localObject2 = ((List)localObject1).iterator();
            label141:
            if (!((Iterator)localObject2).hasNext()) {
              break label106;
            }
            b.a locala2 = (b.a)((Iterator)localObject2).next();
            if ((locala2 == null) || (locala2 != locala1)) {
              break;
            }
            i = 1;
            break label108;
            label179:
            ((List)localObject1).add(locala1);
          }
        }
        localObject2 = new LinkedList();
        ((List)localObject2).add(locala1);
        localb.nYO.put(localObject1, localObject2);
        localb.gJM.add(localObject1);
        localb.aZE();
        GMTrace.o(6670755299328L, 49701);
      }
    });
    GMTrace.o(14312710078464L, 106638);
  }
  
  final void aZE()
  {
    GMTrace.i(6669815775232L, 49694);
    if (this.nYR != null)
    {
      w.d("MicroMsg.FileScanQueueService", "it is scanning");
      GMTrace.o(6669815775232L, 49694);
      return;
    }
    if (this.nYO.isEmpty())
    {
      w.d("MicroMsg.FileScanQueueService", "queue is empty");
      GMTrace.o(6669815775232L, 49694);
      return;
    }
    this.nYQ = ((String)this.gJM.get(0));
    this.gJM.remove(0);
    this.nYR = new a();
    this.nYR.eRr = ((Set)this.nYP.get(this.nYQ));
    a locala = this.nYR;
    String str = this.nYQ;
    w.i("MicroMsg.scanner.DecodeFile", "start decode file: " + str);
    locala.nYK = this;
    af.t(new a.1(locala, str));
    GMTrace.o(6669815775232L, 49694);
  }
  
  public static abstract interface a
  {
    public abstract void Fk(String paramString);
    
    public abstract void i(String paramString1, String paramString2, int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ab\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */