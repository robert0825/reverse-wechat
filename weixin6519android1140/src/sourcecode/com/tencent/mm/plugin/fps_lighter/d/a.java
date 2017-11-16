package com.tencent.mm.plugin.fps_lighter.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fps_lighter.c.b;
import com.tencent.mm.plugin.fps_lighter.c.b.a;
import com.tencent.mm.plugin.fps_lighter.c.c;
import com.tencent.mm.plugin.fps_lighter.c.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public final class a
  implements Runnable
{
  int kZJ;
  private com.tencent.mm.plugin.fps_lighter.c.a lnC;
  private long[] lnD;
  int lnE;
  public a lnF;
  
  public a(long[] paramArrayOfLong, int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, boolean paramBoolean1, long paramLong4, boolean paramBoolean2)
  {
    GMTrace.i(5232075472896L, 38982);
    this.lnD = paramArrayOfLong;
    this.kZJ = paramInt1;
    this.lnE = paramInt2;
    paramArrayOfLong = new com.tencent.mm.plugin.fps_lighter.c.a();
    paramArrayOfLong.scene = paramInt4;
    paramArrayOfLong.lnk = paramLong3;
    paramArrayOfLong.lnl = paramLong2;
    paramArrayOfLong.lnm = paramBoolean1;
    paramArrayOfLong.lno = paramInt3;
    paramArrayOfLong.lnn = ((int)paramLong1);
    paramArrayOfLong.lnp = 1;
    paramArrayOfLong.lnq = paramLong4;
    paramArrayOfLong.lnr = paramBoolean2;
    w.i("MicroMsg.AsyncAnalyseTask", "[generateFpsInfoItem] %s", new Object[] { paramArrayOfLong.toString() });
    this.lnC = paramArrayOfLong;
    GMTrace.o(5232075472896L, 38982);
  }
  
  private LinkedList<d> a(com.tencent.mm.plugin.fps_lighter.c.a parama, List<c> paramList)
  {
    GMTrace.i(5232746561536L, 38987);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    HashMap localHashMap3 = new HashMap();
    HashMap localHashMap4 = new HashMap();
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    if (paramList.hasNext())
    {
      c localc = (c)paramList.next();
      d locald1 = new d(parama, localc);
      localHashMap2.put(localc.getKey(), localc);
      if (((float)localc.lnz >= (float)parama.aAm() * 0.4F) && (localc.gLU == 0))
      {
        locald1.cy(localc.lns);
        localHashMap1.put(Long.valueOf(localc.lnt), locald1);
      }
      label157:
      Object localObject;
      long l;
      for (;;)
      {
        if ((localHashMap3.containsKey(localc.aAn())) && ((float)((d)localHashMap3.get(localc.aAn())).lnz * 0.9F <= (float)localc.lnz))
        {
          locald1.a(((d)localHashMap3.get(localc.aAn())).lnB);
          locald1.cy(localc.lnt);
          localHashMap3.remove(localc.getKey());
          localHashMap3.put(localc.getKey(), locald1);
          break;
          if (((float)localc.lnz < (float)parama.aAm() * 0.4F) && (localc.gLU == 0) && (localHashMap1.size() == 0))
          {
            if ((localc.lnz >= 16.6D) && (localHashMap3.size() <= 6)) {
              locald1.cy(localc.lns);
            }
          }
          else if (localHashMap1.containsKey(Long.valueOf(localc.lns)))
          {
            locald1.a(((d)localHashMap1.get(Long.valueOf(localc.lns))).lnB);
            locald1.cy(localc.lns);
            if ((float)localc.lnz >= (float)parama.aAm() * 0.4F)
            {
              localHashMap1.remove(Long.valueOf(localc.lns));
              localHashMap1.put(Long.valueOf(localc.lnt), locald1);
            }
            else
            {
              if (!localHashMap4.containsKey(localc.aAn())) {
                localHashMap4.put(localc.aAn(), new ArrayList());
              }
              localObject = (List)localHashMap4.get(localc.aAn());
              ((List)localObject).add(locald1);
              if ((6 >= ((List)localObject).size()) && (((List)localObject).size() >= 2))
              {
                Collections.sort((List)localObject, new Comparator() {});
                l = 0L;
                localObject = ((List)localObject).iterator();
              }
            }
          }
        }
      }
      label695:
      for (;;)
      {
        if (((Iterator)localObject).hasNext())
        {
          d locald2 = (d)((Iterator)localObject).next();
          l = locald2.lnz + l;
          if ((!localHashMap2.containsKey(localc.aAn())) || ((float)l < (float)((c)localHashMap2.get(localc.aAn())).lnz * 0.8F)) {
            break label695;
          }
          if ((float)locald2.lnz >= 1.0F)
          {
            if (localHashMap1.containsKey(Long.valueOf(localc.lns))) {
              localHashMap1.remove(Long.valueOf(localc.lns));
            }
            localHashMap3.put(locald2.lnt + ">" + locald2.gLU, locald2);
          }
        }
        localHashMap4.remove(localc.aAn());
        break label157;
        break;
      }
    }
    w.i("MicroMsg.AsyncAnalyseTask", "[findEvilMethod] root size:%s", new Object[] { Integer.valueOf(localHashMap1.size()) });
    parama = localHashMap1.entrySet().iterator();
    while (parama.hasNext()) {
      localLinkedList.add(((Map.Entry)parama.next()).getValue());
    }
    w.i("MicroMsg.AsyncAnalyseTask", "[findEvilMethod] nextHashMap size:%s", new Object[] { Integer.valueOf(localHashMap3.size()) });
    parama = localHashMap3.entrySet().iterator();
    while (parama.hasNext()) {
      localLinkedList.add(((Map.Entry)parama.next()).getValue());
    }
    w.i("MicroMsg.AsyncAnalyseTask", "[findEvilMethod] reportList size:%s", new Object[] { Integer.valueOf(localLinkedList.size()) });
    localHashMap1.clear();
    localHashMap3.clear();
    localHashMap2.clear();
    GMTrace.o(5232746561536L, 38987);
    return localLinkedList;
  }
  
  private List<b> a(List<b.a> paramList, com.tencent.mm.plugin.fps_lighter.c.a parama)
  {
    GMTrace.i(5232209690624L, 38983);
    w.i("MicroMsg.AsyncAnalyseTask", "[parseTrace] size:%s fpsInfoItem:%s", new Object[] { Integer.valueOf(paramList.size()), parama });
    long l = System.currentTimeMillis();
    LinkedList localLinkedList = new LinkedList();
    Stack localStack = new Stack();
    Iterator localIterator = paramList.iterator();
    int m = 0;
    int i = 0;
    int j = 1;
    int k = 0;
    b.a locala;
    int n;
    if (localIterator.hasNext())
    {
      locala = (b.a)localIterator.next();
      if (locala.lnv == true)
      {
        locala.lnu = j;
        m = k + 1;
        localStack.push(locala);
        n = j + 1;
        k = i;
        j = m;
        i = n;
      }
    }
    for (;;)
    {
      m = localLinkedList.size() + k;
      n = k;
      k = j;
      j = i;
      i = n;
      break;
      if (localStack.size() <= 0)
      {
        w.w("MicroMsg.AsyncAnalyseTask", "Empty stack, item:%s", new Object[] { locala });
        break;
      }
      Object localObject2 = (b.a)localStack.peek();
      Object localObject1 = localObject2;
      n = k;
      if (((b.a)localObject2).lnt != locala.lnt)
      {
        w.w("MicroMsg.AsyncAnalyseTask", "No match in rawItem:%s topRawItem:%s", new Object[] { locala, localObject2 });
        localStack.pop();
        k -= 1;
        localObject1 = localObject2;
        for (;;)
        {
          if (localStack.size() > 0)
          {
            localObject1 = (b.a)localStack.peek();
            if (locala.lnt == ((b.a)localObject1).lnt) {
              w.w("MicroMsg.AsyncAnalyseTask", "Find it");
            }
          }
          else
          {
            n = k;
            if (localStack.size() != 0) {
              break label361;
            }
            w.w("MicroMsg.AsyncAnalyseTask", "Still can't find it, ignore this out %s", new Object[] { locala });
            break;
          }
          localStack.pop();
          k -= 1;
        }
      }
      label361:
      localStack.pop();
      k = n - 1;
      localObject2 = new b();
      ((b)localObject2).gLU = k;
      if (localStack.size() == 0) {}
      for (((b)localObject2).lns = -1L;; ((b)localObject2).lns = ((b.a)localStack.peek()).lnt)
      {
        ((b)localObject2).beginTime = ((b.a)localObject1).gVB;
        ((b)localObject2).lnt = ((b.a)localObject1).lnt;
        ((b)localObject2).iyA = (locala.gVB - ((b.a)localObject1).gVB);
        ((b)localObject2).lnu = ((b.a)localObject1).lnu;
        if ((((b)localObject2).beginTime < parama.lnl) || (((b)localObject2).beginTime > parama.lnk)) {
          break label523;
        }
        localLinkedList.add(localObject2);
        m = i;
        i = j;
        j = k;
        k = m;
        break;
      }
      label523:
      if (((b)localObject2).beginTime <= parama.lnl)
      {
        m = i + 1;
        i = j;
        j = k;
        k = m;
        continue;
        w.i("MicroMsg.AsyncAnalyseTask", "[parseGmTraceItem] startIndex:%s endIndex:%s pre:%s cur:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(m), Long.valueOf(parama.lnl), Long.valueOf(parama.lnk) });
        Collections.sort(localLinkedList, new Comparator() {});
        w.i("MicroMsg.AsyncAnalyseTask", "[parseTrace]result size:%s rawItemList:%s costTime:%s", new Object[] { Integer.valueOf(localLinkedList.size()), Integer.valueOf(paramList.size()), Long.valueOf(System.currentTimeMillis() - l) });
        paramList.clear();
        GMTrace.o(5232209690624L, 38983);
        return localLinkedList;
      }
      else
      {
        m = i;
        i = j;
        j = k;
        k = m;
      }
    }
  }
  
  private static void a(HashMap<String, c> paramHashMap, List<b> paramList)
  {
    GMTrace.i(5232478126080L, 38985);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      c localc;
      if (paramHashMap.containsKey(localb.getKey()))
      {
        localc = (c)paramHashMap.get(localb.getKey());
        localc.gZW += 1;
        localc.lnx.add(localb.iyA);
        localc.lny.add(localb.beginTime);
        localc.lnz += localb.iyA;
      }
      else
      {
        localc = new c(localb);
        paramHashMap.put(localb.getKey(), localc);
      }
    }
    GMTrace.o(5232478126080L, 38985);
  }
  
  private List<c> aE(List<b> paramList)
  {
    GMTrace.i(5232343908352L, 38984);
    long l = System.currentTimeMillis();
    w.i("MicroMsg.AsyncAnalyseTask", "[sortBySameMethod] list size:%s", new Object[] { Integer.valueOf(paramList.size()) });
    LinkedList localLinkedList = new LinkedList();
    Object localObject = aF(paramList);
    HashMap localHashMap = new HashMap(600);
    localObject = ((HashMap)localObject).entrySet().iterator();
    while (((Iterator)localObject).hasNext()) {
      a(localHashMap, (List)((Map.Entry)((Iterator)localObject).next()).getValue());
    }
    localObject = localHashMap.entrySet().iterator();
    while (((Iterator)localObject).hasNext()) {
      localLinkedList.add(((Map.Entry)((Iterator)localObject).next()).getValue());
    }
    Collections.sort(localLinkedList, new Comparator() {});
    localHashMap.clear();
    paramList.clear();
    w.i("MicroMsg.AsyncAnalyseTask", "[sortBySameMethod] cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(5232343908352L, 38984);
    return localLinkedList;
  }
  
  private static HashMap<Integer, List<b>> aF(List<b> paramList)
  {
    GMTrace.i(5232612343808L, 38986);
    HashMap localHashMap = new HashMap();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      if (!localHashMap.containsKey(Integer.valueOf(localb.gLU))) {
        localHashMap.put(Integer.valueOf(localb.gLU), new ArrayList());
      }
      ((List)localHashMap.get(Integer.valueOf(localb.gLU))).add(localb);
    }
    GMTrace.o(5232612343808L, 38986);
    return localHashMap;
  }
  
  public final void run()
  {
    GMTrace.i(5232880779264L, 38988);
    long l1 = System.currentTimeMillis();
    Object localObject1 = this.lnD;
    int j = this.lnE;
    int k = this.kZJ;
    w.i("MicroMsg.AsyncAnalyseTask", "[parseGmTraceRawData] start:%s, end:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
    long l2 = System.currentTimeMillis();
    Object localObject2 = new LinkedList();
    int i = j;
    if (k < j)
    {
      i = localObject1.length - j;
      w.d("MicroMsg.AsyncAnalyseTask", "end < start start:%s", new Object[] { Integer.valueOf(i) });
    }
    long l3;
    Object localObject3;
    boolean bool;
    if (i < 0)
    {
      i += localObject1.length;
      if (i < localObject1.length)
      {
        if (localObject1[i] != 0L)
        {
          l3 = localObject1[i];
          localObject3 = new b.a();
          if ((l3 >> 63 & 1L) != 1L) {
            break label221;
          }
        }
        label221:
        for (bool = true;; bool = false)
        {
          ((b.a)localObject3).lnv = bool;
          ((b.a)localObject3).lnw = (l3 >> 46 & 0x1FFFF);
          ((b.a)localObject3).lnt = (l3 >> 27 & 0x7FFFF);
          ((b.a)localObject3).gVB = (l3 & 0x7FFFFFF);
          ((List)localObject2).add(localObject3);
          i += 1;
          break;
        }
      }
      i = 0;
      if (i < k)
      {
        if (localObject1[i] != 0L)
        {
          l3 = localObject1[i];
          localObject3 = new b.a();
          if ((l3 >> 63 & 1L) != 1L) {
            break label336;
          }
        }
        label336:
        for (bool = true;; bool = false)
        {
          ((b.a)localObject3).lnv = bool;
          ((b.a)localObject3).lnw = (l3 >> 46 & 0x1FFFF);
          ((b.a)localObject3).lnt = (l3 >> 27 & 0x7FFFF);
          ((b.a)localObject3).gVB = (l3 & 0x7FFFFFF);
          ((List)localObject2).add(localObject3);
          i += 1;
          break;
        }
      }
    }
    for (;;)
    {
      if (i < k)
      {
        if (localObject1[i] != 0L)
        {
          l3 = localObject1[i];
          localObject3 = new b.a();
          if ((l3 >> 63 & 1L) != 1L) {
            break label449;
          }
        }
        label449:
        for (bool = true;; bool = false)
        {
          ((b.a)localObject3).lnv = bool;
          ((b.a)localObject3).lnw = (l3 >> 46 & 0x1FFFF);
          ((b.a)localObject3).lnt = (l3 >> 27 & 0x7FFFF);
          ((b.a)localObject3).gVB = (l3 & 0x7FFFFFF);
          ((List)localObject2).add(localObject3);
          i += 1;
          break;
        }
      }
      w.i("MicroMsg.AsyncAnalyseTask", "[parseGmTraceRawData] size:%s costTime:%s", new Object[] { Integer.valueOf(((List)localObject2).size()), Long.valueOf(System.currentTimeMillis() - l2) });
      localObject1 = a((List)localObject2, this.lnC);
      localObject2 = aE((List)localObject1);
      localObject3 = a(this.lnC, (List)localObject2);
      if (this.lnF != null) {
        this.lnF.L((LinkedList)localObject3);
      }
      for (;;)
      {
        ((List)localObject1).clear();
        ((List)localObject2).clear();
        w.i("MicroMsg.AsyncAnalyseTask", "cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        GMTrace.o(5232880779264L, 38988);
        return;
        w.e("MicroMsg.AsyncAnalyseTask", "mIFPSAnalyse is null!");
        ((LinkedList)localObject3).clear();
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void L(LinkedList<d> paramLinkedList);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */