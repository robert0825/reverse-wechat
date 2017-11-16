package com.tencent.mm.plugin.translate.a;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.protocal.c.bjw;
import com.tencent.mm.protocal.c.bjx;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public final class c
  implements a
{
  public ArrayList<a> fUn;
  public int jxh;
  public final d[] qBl;
  public Queue<c> qBm;
  public HashMap<String, Integer> qBn;
  
  public c()
  {
    GMTrace.i(7270708543488L, 54171);
    this.jxh = 0;
    this.fUn = new ArrayList(1);
    this.qBm = new LinkedList();
    this.qBn = new HashMap();
    this.qBl = new d[1];
    GMTrace.o(7270708543488L, 54171);
  }
  
  private void b(int paramInt, SparseArray<c> paramSparseArray)
  {
    GMTrace.i(7270842761216L, 54172);
    Iterator localIterator = this.fUn.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).a(paramInt, paramSparseArray);
    }
    GMTrace.o(7270842761216L, 54172);
  }
  
  public final boolean JJ(String paramString)
  {
    GMTrace.i(7271111196672L, 54174);
    boolean bool = this.qBn.containsKey(paramString);
    GMTrace.o(7271111196672L, 54174);
    return bool;
  }
  
  public final void a(int paramInt, SparseArray<c> paramSparseArray, LinkedList<bjx> paramLinkedList)
  {
    GMTrace.i(7271245414400L, 54175);
    this.jxh -= 1;
    Object localObject;
    int i;
    if ((paramLinkedList == null) || (paramSparseArray.size() != paramLinkedList.size()))
    {
      w.d("MicroMsg.TranslateServiceManager", "originals.size() != translatedMsg.size()");
      localObject = new HashMap();
      i = 0;
      while (i < paramSparseArray.size())
      {
        ((HashMap)localObject).put(((c)paramSparseArray.valueAt(i)).id, Integer.valueOf(((c)paramSparseArray.valueAt(i)).qBp));
        i += 1;
      }
    }
    for (;;)
    {
      if (paramLinkedList != null)
      {
        Iterator localIterator = paramLinkedList.iterator();
        while (localIterator.hasNext())
        {
          bjx localbjx = (bjx)localIterator.next();
          c localc = (c)paramSparseArray.get(localbjx.uUL);
          String str = localbjx.uUO;
          paramLinkedList = str;
          if (localc.type == 1)
          {
            paramLinkedList = bc.N(str, localc.qBq);
            localc.eWg = bc.N(localc.eWg, localc.qBq);
          }
          localc.eWm = paramLinkedList;
          localc.ret = localbjx.tST;
          localc.eUL = localbjx.uUP;
          this.qBn.remove(localc.id);
          if (localObject != null) {
            ((HashMap)localObject).remove(localc.id);
          }
        }
      }
      i = 0;
      while (i < paramSparseArray.size())
      {
        paramLinkedList = (c)paramSparseArray.valueAt(i);
        if (paramLinkedList.type == 1) {
          paramLinkedList.eWg = bc.N(paramLinkedList.eWg, paramLinkedList.qBq);
        }
        i += 1;
      }
      if ((localObject != null) && (((HashMap)localObject).size() > 0))
      {
        paramLinkedList = ((HashMap)localObject).entrySet().iterator();
        while (paramLinkedList.hasNext())
        {
          localObject = (Map.Entry)paramLinkedList.next();
          this.qBn.remove(((Map.Entry)localObject).getKey());
          w.d("MicroMsg.TranslateServiceManager", "we found missing translate, msgId : %s, clientId : %s", new Object[] { ((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue() });
        }
      }
      b(paramInt, paramSparseArray);
      bsX();
      GMTrace.o(7271245414400L, 54175);
      return;
      localObject = null;
    }
  }
  
  public final void bsX()
  {
    GMTrace.i(7270976978944L, 54173);
    w.d("MicroMsg.TranslateServiceManager", "current waitings : %s", new Object[] { Integer.valueOf(this.qBm.size()) });
    if (this.qBm.size() == 0)
    {
      GMTrace.o(7270976978944L, 54173);
      return;
    }
    if (this.jxh <= this.qBl.length)
    {
      int j = 0;
      if (j < this.qBl.length)
      {
        d locald;
        if (this.qBl[j] == null)
        {
          this.qBl[j] = new d(j, this);
          locald = this.qBl[j];
          at.wS().a(631, locald);
        }
        Queue localQueue;
        int i;
        if (!this.qBl[j].qBt)
        {
          locald = this.qBl[j];
          localQueue = this.qBm;
          if (!locald.qBt) {
            break label178;
          }
          i = 0;
        }
        for (;;)
        {
          if (i != 0) {
            this.jxh += 1;
          }
          j += 1;
          break;
          label178:
          locald.qBs = new SparseArray();
          if (localQueue.size() == 0)
          {
            i = 0;
          }
          else
          {
            locald.qBt = true;
            LinkedList localLinkedList = new LinkedList();
            i = 0;
            if ((i < 512) && (localQueue.size() > 0))
            {
              c localc = (c)localQueue.peek();
              int k = localc.eWg.getBytes().length;
              bjw localbjw;
              if ((i == 0) || (i + k <= 512))
              {
                localQueue.poll();
                localbjw = new bjw();
                localbjw.uUL = localc.qBp;
                localbjw.uUM = localc.eWg;
                if ((localc.type == 1) || (s.eb(localc.aEe))) {
                  localbjw.uUN = localc.aEe;
                }
                switch (localc.type)
                {
                }
              }
              for (;;)
              {
                w.d("MicroMsg.WorkingTranslate", "eventMsg.type: %d, msg.Scene:%d, id: %s", new Object[] { Integer.valueOf(localc.type), Integer.valueOf(localbjw.tOG), localc.id });
                localLinkedList.add(localbjw);
                locald.qBs.put(localc.qBp, localc);
                i += k;
                break;
                localbjw.tOG = 4;
                continue;
                localbjw.tOG = 1;
                continue;
                localbjw.tOG = 2;
                continue;
                localbjw.tOG = 3;
              }
            }
            locald.qBu = new b(localLinkedList);
            at.wS().a(locald.qBu, 0);
            locald.start = System.currentTimeMillis();
            locald.qBw.z(60000L, 60000L);
            i = 1;
          }
        }
      }
    }
    GMTrace.o(7270976978944L, 54173);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt, SparseArray<c.c> paramSparseArray);
  }
  
  private static final class b
  {
    public static final c qBo;
    
    static
    {
      GMTrace.i(7271648067584L, 54178);
      qBo = new c();
      GMTrace.o(7271648067584L, 54178);
    }
  }
  
  public static final class c
  {
    private static int qBr;
    public String aEe;
    public String eUL;
    public String eWg;
    public String eWm;
    public String id;
    public int qBp;
    public String qBq;
    public int ret;
    public int type;
    
    static
    {
      GMTrace.i(7272990244864L, 54188);
      qBr = 0;
      GMTrace.o(7272990244864L, 54188);
    }
    
    public c(String paramString1, String paramString2, int paramInt, String paramString3)
    {
      GMTrace.i(7272856027136L, 54187);
      this.eWg = paramString1;
      this.id = paramString2;
      this.type = paramInt;
      this.aEe = paramString3;
      if (qBr == Integer.MAX_VALUE) {
        qBr = 0;
      }
      int i = qBr + 1;
      qBr = i;
      this.qBp = i;
      if (paramInt == 1)
      {
        paramInt = bc.gO(paramString1);
        if (paramInt != -1)
        {
          paramString2 = paramString1.substring(0, paramInt).trim();
          if ((paramString2 != null) && (paramString2.length() > 0))
          {
            this.qBq = paramString2;
            this.eWg = paramString1.substring(paramInt + 1).trim();
          }
        }
      }
      GMTrace.o(7272856027136L, 54187);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\translate\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */