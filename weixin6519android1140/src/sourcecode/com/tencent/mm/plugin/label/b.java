package com.tencent.mm.plugin.label;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.label.b.a;
import com.tencent.mm.plugin.label.b.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bmt;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.z;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
  implements com.tencent.mm.plugin.label.a.b
{
  public ArrayList<String> muG;
  public ArrayList<String> muH;
  private com.tencent.mm.ad.e muI;
  public String username;
  
  public b()
  {
    GMTrace.i(7318758490112L, 54529);
    this.muI = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(7318624272384L, 54528);
        w.e("MicroMsg.Label.ContactLabelManagerImpl", "onSceneEnd");
        switch (paramAnonymousk.getType())
        {
        }
        for (;;)
        {
          GMTrace.o(7318624272384L, 54528);
          return;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            b.f(b.this.username, b.this.muG);
            GMTrace.o(7318624272384L, 54528);
            return;
          }
          b.this.aJL();
          w.e("MicroMsg.Label.ContactLabelManagerImpl", "add contact lable faild");
          GMTrace.o(7318624272384L, 54528);
          return;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousInt2 = 0;
            int i = 0;
            paramAnonymousInt1 = paramAnonymousInt2;
            if (b.this.muH != null)
            {
              paramAnonymousInt1 = paramAnonymousInt2;
              if (!b.this.muH.isEmpty()) {
                paramAnonymousInt1 = b.this.muH.size();
              }
            }
            paramAnonymousInt2 = i;
            if (b.this.muG != null)
            {
              paramAnonymousInt2 = i;
              if (!b.this.muG.isEmpty()) {
                paramAnonymousInt2 = b.this.muG.size() - paramAnonymousInt1;
              }
            }
            if ((paramAnonymousInt1 > 0) || (paramAnonymousInt2 > 0))
            {
              w.d("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveContact]addLabelNum:%d,updateLabelNum:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
              g.ork.i(11220, new Object[] { q.zE(), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(0) });
            }
          }
          b.this.aJL();
        }
      }
    };
    GMTrace.o(7318758490112L, 54529);
  }
  
  public static void f(String paramString, ArrayList<String> paramArrayList)
  {
    GMTrace.i(7320234885120L, 54540);
    if (paramArrayList == null) {}
    for (Object localObject1 = "";; localObject1 = paramArrayList.toString())
    {
      w.d("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveContact] username:%s,list:%s", new Object[] { paramString, localObject1 });
      if ((!bg.nm(paramString)) && (paramArrayList != null) && (paramArrayList.size() > 0)) {
        break;
      }
      w.e("MicroMsg.Label.ContactLabelManagerImpl", "add contact label faild.");
      GMTrace.o(7320234885120L, 54540);
      return;
    }
    Object localObject2 = "";
    localObject1 = localObject2;
    if (paramArrayList != null)
    {
      localObject1 = localObject2;
      if (paramArrayList.size() > 0) {
        localObject1 = c.aN(e.aJO().ae(paramArrayList));
      }
    }
    paramArrayList = new LinkedList();
    localObject2 = new bmt();
    ((bmt)localObject2).ufB = ((String)localObject1);
    ((bmt)localObject2).jhi = paramString;
    paramArrayList.add(localObject2);
    paramString = new d(paramArrayList);
    at.wS().a(paramString, 0);
    GMTrace.o(7320234885120L, 54540);
  }
  
  public final String AU(String paramString)
  {
    GMTrace.i(7319026925568L, 54531);
    paramString = e.aJO().AU(paramString);
    GMTrace.o(7319026925568L, 54531);
    return paramString;
  }
  
  public final String AV(String paramString)
  {
    GMTrace.i(7319161143296L, 54532);
    paramString = e.aJO().AV(paramString);
    GMTrace.o(7319161143296L, 54532);
    return paramString;
  }
  
  public final List<String> AW(String paramString)
  {
    GMTrace.i(7319698014208L, 54536);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.Label.ContactLabelManagerImpl", "labels is null.");
      GMTrace.o(7319698014208L, 54536);
      return null;
    }
    paramString = paramString.split(",");
    if ((paramString != null) && (paramString.length > 0))
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(Arrays.asList(paramString));
      GMTrace.o(7319698014208L, 54536);
      return localArrayList;
    }
    GMTrace.o(7319698014208L, 54536);
    return null;
  }
  
  public final void a(j.a parama)
  {
    GMTrace.i(7319295361024L, 54533);
    e.aJO().c(parama);
    GMTrace.o(7319295361024L, 54533);
  }
  
  public final void aJJ()
  {
    GMTrace.i(7318892707840L, 54530);
    e.aJO().aJJ();
    GMTrace.o(7318892707840L, 54530);
  }
  
  public final List<String> aJK()
  {
    GMTrace.i(7319563796480L, 54535);
    ac localac = e.aJO();
    long l = bg.Pv();
    ArrayList localArrayList1 = localac.bSH();
    if (localArrayList1 == null)
    {
      GMTrace.o(7319563796480L, 54535);
      return null;
    }
    localac.bSI();
    ArrayList localArrayList2 = new ArrayList();
    int i = 0;
    while (i < localArrayList1.size())
    {
      ArrayList localArrayList3 = (ArrayList)localac.vAc.get(Integer.valueOf(((z)localArrayList1.get(i)).field_labelID));
      if ((localArrayList3 != null) && (localArrayList3.size() > 0)) {
        localArrayList2.add(((z)localArrayList1.get(i)).field_labelName);
      }
      i += 1;
    }
    w.i("MicroMsg.Label.ContactLabelStorage", "getAllLabelHasContact time:%s all:%s hascontact:%s stack:%s", new Object[] { Long.valueOf(bg.aH(l)), Integer.valueOf(localArrayList1.size()), Integer.valueOf(localArrayList2.size()), bg.bQW() });
    GMTrace.o(7319563796480L, 54535);
    return localArrayList2;
  }
  
  public final void aJL()
  {
    GMTrace.i(7320100667392L, 54539);
    this.username = null;
    this.muG = null;
    this.muH = null;
    at.wS().b(635, this.muI);
    at.wS().b(638, this.muI);
    GMTrace.o(7320100667392L, 54539);
  }
  
  public final String aL(List<String> paramList)
  {
    GMTrace.i(7319832231936L, 54537);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.Label.ContactLabelManagerImpl", "labelList is empty");
      GMTrace.o(7319832231936L, 54537);
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append((String)paramList.get(i));
      if (i < j - 1) {
        localStringBuilder.append(",");
      }
      i += 1;
    }
    paramList = localStringBuilder.toString();
    GMTrace.o(7319832231936L, 54537);
    return paramList;
  }
  
  public final void aM(List<String> paramList)
  {
    GMTrace.i(7320369102848L, 54541);
    paramList = new a(paramList);
    at.wS().a(paramList, 0);
    GMTrace.o(7320369102848L, 54541);
  }
  
  public final void b(j.a parama)
  {
    GMTrace.i(7319429578752L, 54534);
    e.aJO().j(parama);
    GMTrace.o(7319429578752L, 54534);
  }
  
  public final void cJ(String paramString1, String paramString2)
  {
    try
    {
      GMTrace.i(7319966449664L, 54538);
      w.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] user:%s labels:%s", new Object[] { paramString1, paramString2 });
      if (bg.nm(paramString2))
      {
        w.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labels is null.");
        GMTrace.o(7319966449664L, 54538);
      }
      for (;;)
      {
        return;
        paramString2 = (ArrayList)AW(paramString2);
        if ((paramString2 != null) && (!paramString2.isEmpty())) {
          break;
        }
        w.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labelList is null.");
        GMTrace.o(7319966449664L, 54538);
      }
      this.username = paramString1;
    }
    finally {}
    this.muG = paramString2;
    int j = paramString2.size();
    this.muH = new ArrayList();
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        z localz = e.aJO().Tv((String)paramString2.get(i));
        if ((localz != null) && (localz.field_isTemporary)) {
          this.muH.add(paramString2.get(i));
        }
      }
      else
      {
        at.wS().a(635, this.muI);
        at.wS().a(638, this.muI);
        if ((this.muH == null) || (this.muH.isEmpty()))
        {
          f(paramString1, paramString2);
          aJL();
          GMTrace.o(7319966449664L, 54538);
          break;
        }
        w.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel]addList:%s", new Object[] { this.muH.toString() });
        paramString1 = new a(this.muH);
        at.wS().a(paramString1, 0);
        GMTrace.o(7319966449664L, 54538);
        break;
      }
      i += 1;
    }
  }
  
  public final void h(List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(7320503320576L, 54542);
    Object localObject1 = new HashMap();
    LinkedList localLinkedList = new LinkedList();
    Object localObject2;
    if (paramList1.size() > 0)
    {
      paramList1 = paramList1.iterator();
      paramList2 = paramList2.iterator();
      while (paramList1.hasNext())
      {
        localObject2 = (String)paramList1.next();
        Object localObject3 = bg.g(((String)paramList2.next()).split(","));
        if ((localObject3 != null) && (((List)localObject3).size() > 0))
        {
          localObject3 = ((List)localObject3).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            String str1 = (String)((Iterator)localObject3).next();
            Object localObject4;
            String str2;
            if (((Map)localObject1).containsKey(str1))
            {
              localObject4 = (String)((Map)localObject1).get(str1);
              str2 = c.cK((String)localObject4, (String)localObject2);
              if (!str2.equalsIgnoreCase((String)localObject4)) {
                ((Map)localObject1).put(str1, str2);
              }
            }
            else
            {
              at.AR();
              localObject4 = com.tencent.mm.y.c.yK().TE(str1);
              if (localObject4 != null)
              {
                localObject4 = ((af)localObject4).field_contactLabelIds;
                str2 = c.cK((String)localObject4, (String)localObject2);
                if (!str2.equalsIgnoreCase((String)localObject4)) {
                  ((Map)localObject1).put(str1, str2);
                }
              }
            }
          }
        }
      }
    }
    paramList1 = ((Map)localObject1).entrySet().iterator();
    while (paramList1.hasNext())
    {
      localObject1 = (Map.Entry)paramList1.next();
      paramList2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = (String)((Map.Entry)localObject1).getValue();
      localObject2 = new bmt();
      ((bmt)localObject2).jhi = paramList2;
      ((bmt)localObject2).ufB = ((String)localObject1);
      localLinkedList.add(localObject2);
    }
    if (localLinkedList.size() > 0)
    {
      paramList1 = new d(localLinkedList);
      at.wS().a(paramList1, 0);
    }
    GMTrace.o(7320503320576L, 54542);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */