package com.tencent.mm.plugin.readerapp.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bi;
import com.tencent.mm.y.q;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
  implements d
{
  public c()
  {
    GMTrace.i(11749285691392L, 87539);
    GMTrace.o(11749285691392L, 87539);
  }
  
  public static boolean baf()
  {
    GMTrace.i(11749554126848L, 87541);
    if ((q.zK() & 0x400) == 0)
    {
      GMTrace.o(11749554126848L, 87541);
      return true;
    }
    GMTrace.o(11749554126848L, 87541);
    return false;
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(11749419909120L, 87540);
    bu localbu = parama.gtM;
    if (localbu == null)
    {
      w.e("MicroMsg.ReaderAppMsgExtension", "onPreAddMessage cmdAM is null");
      GMTrace.o(11749419909120L, 87540);
      return null;
    }
    g.bah().U(localbu.tPV);
    parama = n.a(localbu.tPY);
    long l1 = bg.Pv();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
    int m = 0;
    ArrayList localArrayList = new ArrayList();
    k = 0;
    try
    {
      localMap = com.tencent.mm.sdk.platformtools.bh.q(parama, "mmreader");
      i = 0;
      k = 0;
    }
    catch (Exception parama)
    {
      for (;;)
      {
        Map localMap;
        j = m;
        i = k;
        w.printErrStackTrace("MicroMsg.ReaderAppMsgExtension", parama, "", new Object[0]);
        k = j;
        j = i;
        i = k;
        continue;
        label1725:
        i1 = 0;
        continue;
        i += 1;
        k = j;
        continue;
        j = k;
        continue;
        if (bg.nm(((com.tencent.mm.y.bh)localObject1).getUrl()))
        {
          w.e("MicroMsg.ReaderAppMsgExtension", "readerAppInfo.getUrl() is null, appInfo.tweetid = " + ((com.tencent.mm.y.bh)localObject1).Bv() + ", type = " + ((com.tencent.mm.y.bh)localObject1).type);
          k = 0;
        }
      }
      if (k <= 0) {
        break label2068;
      }
      at.AR();
      localObject1 = com.tencent.mm.y.c.yP().TO(com.tencent.mm.y.bh.fw(j));
      if ((localObject1 != null) && (((aj)localObject1).field_username.equals(com.tencent.mm.y.bh.fw(j)))) {
        break label2010;
      }
      localObject2 = new ae();
      ((ae)localObject2).setUsername(com.tencent.mm.y.bh.fw(j));
      if (parama != null) {
        break label1992;
      }
      localObject1 = "";
      ((ae)localObject2).setContent((String)localObject1);
      if (parama != null) {
        break label2001;
      }
      l1 = bg.Pv();
      label1888:
      ((ae)localObject2).x(l1);
      ((ae)localObject2).dC(0);
      ((ae)localObject2).dz(i);
      at.AR();
      com.tencent.mm.y.c.yP().d((ae)localObject2);
      for (;;)
      {
        g.bah().doNotify();
        parama = parama.getTitle();
        localObject1 = new au();
        ((au)localObject1).setContent(parama);
        ((au)localObject1).db(com.tencent.mm.y.bh.fw(j));
        ((au)localObject1).setType(1);
        ((au)localObject1).C(7377812L);
        parama = new d.b((au)localObject1, true);
        GMTrace.o(11749419909120L, 87540);
        return parama;
        label1992:
        localObject1 = parama.getTitle();
        break;
        label2001:
        l1 = parama.time;
        break label1888;
        label2010:
        ((ae)localObject1).setContent(parama.getTitle());
        ((ae)localObject1).x(parama.time);
        ((ae)localObject1).dC(0);
        ((ae)localObject1).dz(i + ((aj)localObject1).field_unReadCount);
        at.AR();
        com.tencent.mm.y.c.yP().a((ae)localObject1, com.tencent.mm.y.bh.fw(j));
      }
      label2068:
      w.e("MicroMsg.ReaderAppMsgExtension", "insert error");
      GMTrace.o(11749419909120L, 87540);
      return null;
    }
    if (i <= 0) {
      for (;;)
      {
        try
        {
          localObject1 = new StringBuilder(".mmreader.category");
          if (i <= 0) {
            continue;
          }
          parama = Integer.valueOf(i);
          parama = parama;
          j = bg.getInt((String)localMap.get(parama + ".$type"), 0);
          if (j != 0) {
            continue;
          }
          w.e("MicroMsg.ReaderAppMsgExtension", "get " + parama + ".$type  error");
          j = k;
          boolean bool = baf();
          w.d("MicroMsg.ReaderAppMsgExtension", "type = " + j + ", want to receive news? " + bool);
          parama = localArrayList.iterator();
          if (!parama.hasNext()) {
            continue;
          }
          localObject1 = (com.tencent.mm.y.bh)parama.next();
          if (!bg.nm(((com.tencent.mm.y.bh)localObject1).getTitle())) {
            continue;
          }
          w.e("MicroMsg.ReaderAppMsgExtension", "readerAppInfo.getTitle() is null, appInfo.tweetid = " + ((com.tencent.mm.y.bh)localObject1).Bv() + ", type = " + ((com.tencent.mm.y.bh)localObject1).type);
          k = 0;
        }
        catch (Exception parama)
        {
          String str1;
          String str2;
          Object localObject2;
          int i2;
          Object localObject3;
          String str3;
          com.tencent.mm.y.bh localbh;
          long l2;
          int i1;
          int j = i;
          i = k;
          continue;
          continue;
          continue;
          k = 1;
          continue;
          int n = 0;
          continue;
          parama = ".item";
          continue;
          Object localObject1 = "";
          continue;
          localObject1 = localObject2;
          continue;
        }
        if ((localArrayList.size() > 0) && (k != 0))
        {
          k = 0;
          parama = null;
          m = 0;
          if (m < localArrayList.size())
          {
            if (!g.bah().a((com.tencent.mm.y.bh)localArrayList.get(m))) {
              continue;
            }
            if (parama != null) {
              continue;
            }
            parama = (com.tencent.mm.y.bh)localArrayList.get(m);
            parama.goI = 1;
            k += 1;
            m += 1;
            continue;
            parama = "";
            continue;
            if ((j != 20) && (j != 11))
            {
              w.e("MicroMsg.ReaderAppMsgExtension", "get " + parama + ".$type  error Type:" + j);
              j = k;
              continue;
            }
            k = j;
            m = i;
            str1 = (String)localMap.get(parama + ".name");
            k = j;
            m = i;
            if (bg.nm(str1))
            {
              k = j;
              m = i;
              w.e("MicroMsg.ReaderAppMsgExtension", "get " + parama + ".name  error");
              continue;
            }
            k = j;
            m = i;
            str2 = (String)localMap.get(parama + ".topnew.cover");
            k = j;
            m = i;
            localObject2 = (String)localMap.get(parama + ".topnew.digest");
            k = j;
            m = i;
            i2 = bg.getInt((String)localMap.get(parama + ".$count"), 0);
            if (i2 == 0)
            {
              k = j;
              m = i;
              w.e("MicroMsg.ReaderAppMsgExtension", "get " + parama + ".$count  error");
              continue;
            }
            if (i2 > 1)
            {
              k = j;
              m = i;
              localObject1 = new StringBuilder().append(parama);
              if (j != 20) {
                continue;
              }
              parama = ".newitem";
              k = j;
              m = i;
              parama = parama;
              continue;
              if (n >= i2) {
                continue;
              }
              k = j;
              m = i;
              localObject3 = new StringBuilder().append(parama);
              if (n <= 0) {
                continue;
              }
              k = j;
              m = i;
              localObject1 = Integer.valueOf(n);
              k = j;
              m = i;
              str3 = localObject1;
              k = j;
              m = i;
              localbh = new com.tencent.mm.y.bh();
              k = j;
              m = i;
              localbh.T(localbu.tPV);
              k = j;
              m = i;
              localbh.title = ((String)localMap.get(str3 + ".title"));
              if (n != 0) {
                continue;
              }
              k = j;
              m = i;
              l2 = bg.getLong((String)localMap.get(str3 + ".pub_time"), 0L);
              if (l2 > 0L) {
                l1 = 1000L * l2;
              }
              k = j;
              m = i;
              localbh.goI = 1;
              k = j;
              m = i;
              localbh.glx = str2;
              k = j;
              m = i;
              if (!bg.nm((String)localObject2)) {
                continue;
              }
              k = j;
              m = i;
              localObject1 = (String)localMap.get(str3 + ".digest");
              k = j;
              m = i;
            }
            for (localbh.glz = ((String)localObject1);; localbh.glz = ((String)localMap.get(str3 + ".digest")))
            {
              k = j;
              m = i;
              if (!localMap.containsKey(str3 + ".vedio")) {
                break label1725;
              }
              i1 = 1;
              k = j;
              m = i;
              localbh.goJ = i1;
              k = j;
              m = i;
              localbh.url = ((String)localMap.get(str3 + ".url"));
              k = j;
              m = i;
              localbh.goD = ((String)localMap.get(str3 + ".shorturl"));
              k = j;
              m = i;
              localbh.goE = ((String)localMap.get(str3 + ".longurl"));
              k = j;
              m = i;
              localbh.goF = bg.getLong((String)localMap.get(str3 + ".pub_time"), 0L);
              k = j;
              m = i;
              localObject3 = (String)localMap.get(str3 + ".tweetid");
              if (localObject3 != null)
              {
                localObject1 = localObject3;
                k = j;
                m = i;
                if (!"".equals(localObject3)) {}
              }
              else
              {
                k = j;
                m = i;
                localObject1 = new Date(System.currentTimeMillis() + n);
                k = j;
                m = i;
                localObject1 = "N" + localSimpleDateFormat.format((Date)localObject1);
                k = j;
                m = i;
                w.d("MicroMsg.ReaderAppMsgExtension", "create tweetID = " + (String)localObject1);
              }
              k = j;
              m = i;
              localbh.goC = ((String)localObject1);
              k = j;
              m = i;
              localbh.goG = ((String)localMap.get(str3 + ".sources.source.name"));
              k = j;
              m = i;
              localbh.goH = ((String)localMap.get(str3 + ".sources.source.icon"));
              k = j;
              m = i;
              localbh.time = (i + l1);
              k = j;
              m = i;
              localbh.type = j;
              k = j;
              m = i;
              localbh.name = str1;
              k = j;
              m = i;
              localArrayList.add(localbh);
              n += 1;
              break;
              k = j;
              m = i;
              parama = parama + ".item";
              break label2117;
              k = j;
              m = i;
              localbh.glx = ((String)localMap.get(str3 + ".cover"));
              k = j;
              m = i;
            }
          }
        }
      }
    }
    GMTrace.o(11749419909120L, 87540);
    return null;
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(11749688344576L, 87542);
    GMTrace.o(11749688344576L, 87542);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */