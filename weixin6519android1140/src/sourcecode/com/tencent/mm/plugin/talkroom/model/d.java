package com.tencent.mm.plugin.talkroom.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.l.a;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bir;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class d
  implements com.tencent.mm.ad.d
{
  public d()
  {
    GMTrace.i(5152887013376L, 38392);
    GMTrace.o(5152887013376L, 38392);
  }
  
  private static int JC(String paramString)
  {
    int j = 0;
    GMTrace.i(5153289666560L, 38395);
    int i = j;
    if (!bg.nm(paramString)) {}
    try
    {
      i = Integer.valueOf(paramString).intValue();
      GMTrace.o(5153289666560L, 38395);
      return i;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TalkRoomExtension", paramString, "", new Object[0]);
        i = j;
      }
    }
  }
  
  private static String aO(List<bir> paramList)
  {
    GMTrace.i(5153423884288L, 38396);
    List localList = b.bsf().aKv();
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    label195:
    for (;;)
    {
      bir localbir;
      if (paramList.hasNext())
      {
        localbir = (bir)paramList.next();
        Iterator localIterator = localList.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((bir)localIterator.next()).jhi.equals(localbir.jhi));
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label195;
        }
        localLinkedList.add(localbir.jhi);
        break;
        if (localLinkedList.isEmpty())
        {
          GMTrace.o(5153423884288L, 38396);
          return null;
        }
        i = 0;
        while (i < localLinkedList.size())
        {
          paramList = (String)localLinkedList.get(i);
          if (!paramList.equals(q.zE()))
          {
            GMTrace.o(5153423884288L, 38396);
            return paramList;
          }
          i += 1;
        }
        GMTrace.o(5153423884288L, 38396);
        return null;
      }
    }
  }
  
  private static String aP(List<bir> paramList)
  {
    GMTrace.i(5153558102016L, 38397);
    Object localObject = b.bsf().aKv();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    label195:
    for (;;)
    {
      bir localbir;
      if (((Iterator)localObject).hasNext())
      {
        localbir = (bir)((Iterator)localObject).next();
        Iterator localIterator = paramList.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((bir)localIterator.next()).jhi.equals(localbir.jhi));
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label195;
        }
        localLinkedList.add(localbir.jhi);
        break;
        if (localLinkedList.isEmpty())
        {
          GMTrace.o(5153558102016L, 38397);
          return null;
        }
        i = 0;
        while (i < localLinkedList.size())
        {
          paramList = (String)localLinkedList.get(i);
          if (!paramList.equals(q.zE()))
          {
            GMTrace.o(5153558102016L, 38397);
            return paramList;
          }
          i += 1;
        }
        GMTrace.o(5153558102016L, 38397);
        return null;
      }
    }
  }
  
  public final d.b b(d.a parama)
  {
    int k = 1;
    GMTrace.i(5153021231104L, 38393);
    Object localObject2 = parama.gtM;
    if (localObject2 == null)
    {
      w.e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM is null");
      GMTrace.o(5153021231104L, 38393);
      return null;
    }
    if (((bu)localObject2).lQc != 56)
    {
      w.e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM.type:%d", new Object[] { Integer.valueOf(((bu)localObject2).lQc) });
      GMTrace.o(5153021231104L, 38393);
      return null;
    }
    Object localObject1 = n.a(((bu)localObject2).tPW);
    parama = n.a(((bu)localObject2).tPX);
    at.AR();
    if (((String)c.xh().get(2, null)).equals(localObject1)) {
      localObject1 = parama;
    }
    for (;;)
    {
      at.AR();
      parama = c.yK().TE((String)localObject1);
      if ((parama == null) || ((int)parama.fTq == 0))
      {
        at.AR();
        c.yK().R(new x((String)localObject1));
      }
      parama = n.a(((bu)localObject2).tPY);
      w.d("MicroMsg.TalkRoomExtension", "talkroom xml:" + parama);
      localObject2 = bh.q(parama, "talkroominfo");
      if (localObject2 != null) {}
      for (;;)
      {
        try
        {
          if (JC((String)((Map)localObject2).get(".talkroominfo.tracksysmsgtype")) != 0) {
            break label547;
          }
          JC((String)((Map)localObject2).get(".talkroominfo.sysmsgtype"));
          i = 1;
          LinkedList localLinkedList = new LinkedList();
          JC((String)((Map)localObject2).get(".talkroominfo.membersize"));
          int j = 0;
          Object localObject3 = new StringBuilder(".talkroominfo.memberlist.member");
          if (j == 0)
          {
            parama = "";
            localObject3 = parama;
            parama = (String)((Map)localObject2).get((String)localObject3 + ".username");
            if (!bg.nm(parama))
            {
              int m = JC((String)((Map)localObject2).get((String)localObject3 + ".memberid"));
              localObject3 = new bir();
              ((bir)localObject3).jhi = parama;
              ((bir)localObject3).uTS = m;
              localLinkedList.add(localObject3);
              j += 1;
            }
          }
          else
          {
            parama = Integer.valueOf(j);
            continue;
          }
          if (!((String)localObject1).equals(b.bsf().qxO)) {
            break label539;
          }
          localObject2 = aO(localLinkedList);
          if (!bg.nm((String)localObject2)) {
            break label534;
          }
          parama = aP(localLinkedList);
          localObject3 = b.bsg();
          j = k;
          if (i != 0) {
            j = 0;
          }
          ((e)localObject3).a((String)localObject1, localLinkedList, (String)localObject2, parama, j);
          GMTrace.o(5153021231104L, 38393);
          return null;
        }
        catch (Exception parama)
        {
          w.e("MicroMsg.TalkRoomExtension", "parsing memList xml failed");
          w.printErrStackTrace("MicroMsg.TalkRoomExtension", parama, "", new Object[0]);
        }
        GMTrace.o(5153021231104L, 38393);
        return null;
        label534:
        parama = null;
        continue;
        label539:
        parama = null;
        localObject2 = null;
        continue;
        label547:
        int i = 0;
      }
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(5153155448832L, 38394);
    GMTrace.o(5153155448832L, 38394);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */