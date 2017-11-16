package com.tencent.mm.plugin.location.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.e;
import com.tencent.mm.y.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class n
  extends e
{
  public n()
  {
    GMTrace.i(9642201579520L, 71840);
    GMTrace.o(9642201579520L, 71840);
  }
  
  private static double Bg(String paramString)
  {
    GMTrace.i(9642470014976L, 71842);
    if (paramString == null)
    {
      GMTrace.o(9642470014976L, 71842);
      return 0.0D;
    }
    double d = bg.getDouble(paramString, 0.0D);
    GMTrace.o(9642470014976L, 71842);
    return d;
  }
  
  private static String aO(List<String> paramList)
  {
    GMTrace.i(9642604232704L, 71843);
    List localList = l.aKn().aKv();
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    label186:
    for (;;)
    {
      String str;
      if (paramList.hasNext())
      {
        str = (String)paramList.next();
        Iterator localIterator = localList.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((String)localIterator.next()).equals(str));
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label186;
        }
        localLinkedList.add(str);
        break;
        if (localLinkedList.isEmpty())
        {
          GMTrace.o(9642604232704L, 71843);
          return null;
        }
        i = 0;
        while (i < localLinkedList.size())
        {
          paramList = (String)localLinkedList.get(i);
          if (!paramList.equals(q.zE()))
          {
            GMTrace.o(9642604232704L, 71843);
            return paramList;
          }
          i += 1;
        }
        GMTrace.o(9642604232704L, 71843);
        return null;
      }
    }
  }
  
  private static String aP(List<String> paramList)
  {
    GMTrace.i(9642738450432L, 71844);
    Object localObject = l.aKn().aKv();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    label186:
    for (;;)
    {
      String str;
      if (((Iterator)localObject).hasNext())
      {
        str = (String)((Iterator)localObject).next();
        Iterator localIterator = paramList.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((String)localIterator.next()).equals(str));
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label186;
        }
        localLinkedList.add(str);
        break;
        if (localLinkedList.isEmpty())
        {
          GMTrace.o(9642738450432L, 71844);
          return null;
        }
        i = 0;
        while (i < localLinkedList.size())
        {
          paramList = (String)localLinkedList.get(i);
          if (!paramList.equals(q.zE()))
          {
            GMTrace.o(9642738450432L, 71844);
            return paramList;
          }
          i += 1;
        }
        GMTrace.o(9642738450432L, 71844);
        return null;
      }
    }
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(9642335797248L, 71841);
    Object localObject3 = parama.gtM;
    if (localObject3 == null)
    {
      w.e("MicroMsg.TrackMsgExtension", "onPreAddMessage cmdAM is null");
      GMTrace.o(9642335797248L, 71841);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = com.tencent.mm.platformtools.n.a(((bu)localObject3).tPW);
    Object localObject2 = com.tencent.mm.platformtools.n.a(((bu)localObject3).tPX);
    at.AR();
    Object localObject4;
    String str;
    double d1;
    double d2;
    int i;
    if (((String)c.xh().get(2, null)).equals(localObject1))
    {
      parama = (d.a)localObject2;
      localObject3 = com.tencent.mm.platformtools.n.a(((bu)localObject3).tPY);
      w.d("MicroMsg.TrackMsgExtension", "cmd " + (String)localObject3);
      localObject3 = bh.q((String)localObject3, "sysmsg");
      if (localObject3 != null) {
        try
        {
          localObject4 = new StringBuffer();
          ((StringBuffer)localObject4).append("talk  " + parama + "\r\n");
          ((StringBuffer)localObject4).append("from fromUser " + (String)localObject1 + "\r\n");
          ((StringBuffer)localObject4).append("from toUser " + (String)localObject2 + "\r\n");
          str = (String)((Map)localObject3).get(".sysmsg.trackmsg.trackroominfo.trackroompoi.addr");
          d1 = Bg((String)((Map)localObject3).get(".sysmsg.trackmsg.trackroominfo.trackroompoi.latitude"));
          ((StringBuffer)localObject4).append("lat " + d1 + "\r\n");
          d2 = Bg((String)((Map)localObject3).get(".sysmsg.trackmsg.trackroominfo.trackroompoi.longitude"));
          ((StringBuffer)localObject4).append("lng " + d2 + "\r\n");
          i = bg.getInt((String)((Map)localObject3).get(".sysmsg.trackmsg.trackroominfo.timestamp"), 0);
          ((StringBuffer)localObject4).append("times " + i + "\r\n");
          i = 0;
          for (;;)
          {
            localObject2 = new StringBuilder(".sysmsg.trackmsg.trackroominfo.trackmemberlist.member");
            if (i != 0) {
              break;
            }
            localObject1 = "";
            label400:
            localObject1 = localObject1;
            localObject1 = (String)((Map)localObject3).get((String)localObject1 + ".username");
            if (bg.nm((String)localObject1)) {
              break label508;
            }
            i += 1;
            localLinkedList.add(localObject1);
          }
          GMTrace.o(9642335797248L, 71841);
        }
        catch (Exception parama)
        {
          w.printErrStackTrace("MicroMsg.TrackMsgExtension", parama, "", new Object[0]);
        }
      }
    }
    for (;;)
    {
      return null;
      parama = (d.a)localObject1;
      break;
      localObject1 = Integer.valueOf(i);
      break label400;
      label508:
      ((StringBuffer)localObject4).append("userNameList size " + localLinkedList.size() + "\r\n");
      w.i("MicroMsg.TrackMsgExtension", "xml : " + ((StringBuffer)localObject4).toString());
      localObject1 = null;
      localObject3 = null;
      localObject2 = localObject3;
      if (parama.equals(l.aKn().myb))
      {
        localObject4 = aO(localLinkedList);
        localObject1 = localObject4;
        localObject2 = localObject3;
        if (bg.nm((String)localObject4))
        {
          localObject2 = aP(localLinkedList);
          localObject1 = localObject4;
        }
      }
      l.aKo().a(parama, localLinkedList, d1, d2, str, (String)localObject1, (String)localObject2);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */