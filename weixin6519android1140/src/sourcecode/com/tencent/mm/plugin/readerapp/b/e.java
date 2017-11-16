package com.tencent.mm.plugin.readerapp.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.r.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bi;
import com.tencent.mm.y.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class e
  implements f
{
  public static e ocx;
  
  static
  {
    GMTrace.i(11748480385024L, 87533);
    ocx = new e();
    GMTrace.o(11748480385024L, 87533);
  }
  
  private e()
  {
    GMTrace.i(11748077731840L, 87530);
    GMTrace.o(11748077731840L, 87530);
  }
  
  private static List<com.tencent.mm.y.bh> a(bu parambu, String paramString)
  {
    GMTrace.i(11748346167296L, 87532);
    Object localObject2 = com.tencent.mm.platformtools.n.a(parambu.tPY).trim();
    Object localObject1 = localObject2;
    if (((String)localObject2).indexOf("<") != -1) {
      localObject1 = ((String)localObject2).substring(((String)localObject2).indexOf("<"));
    }
    long l = parambu.nFd;
    w.d("MicroMsg.ReaderFuncMsgUpdateMgr", "parseMsg, createTime: %s, content: %s", new Object[] { Integer.valueOf(parambu.nFd), localObject1 });
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
    ArrayList localArrayList = new ArrayList();
    Map localMap;
    int i;
    int m;
    String str2;
    String str3;
    String str1;
    int n;
    for (;;)
    {
      try
      {
        localMap = com.tencent.mm.sdk.platformtools.bh.q((String)localObject1, "mmreader");
        i = 0;
        if (i <= 0)
        {
          localObject2 = new StringBuilder(".mmreader.category");
          if (i > 0)
          {
            localObject1 = Integer.valueOf(i);
            localObject1 = localObject1;
            m = bg.getInt((String)localMap.get((String)localObject1 + ".$type"), 0);
            if (m != 0) {
              continue;
            }
            w.e("MicroMsg.ReaderFuncMsgUpdateMgr", "get " + (String)localObject1 + ".$type  error");
          }
        }
        else
        {
          GMTrace.o(11748346167296L, 87532);
          return localArrayList;
        }
        localObject1 = "";
        continue;
        if ((m != 20) && (m != 11))
        {
          w.e("MicroMsg.ReaderFuncMsgUpdateMgr", "get " + (String)localObject1 + ".$type  error Type:" + m);
          continue;
        }
        str2 = (String)localMap.get((String)localObject1 + ".name");
      }
      catch (Exception parambu)
      {
        w.printErrStackTrace("MicroMsg.ReaderFuncMsgUpdateMgr", parambu, "", new Object[0]);
        w.e("MicroMsg.ReaderFuncMsgUpdateMgr", "parseMsg error: %s", new Object[] { parambu.getMessage() });
        GMTrace.o(11748346167296L, 87532);
        return null;
      }
      if (bg.nm(str2))
      {
        w.e("MicroMsg.ReaderFuncMsgUpdateMgr", "get " + (String)localObject1 + ".name  error");
      }
      else
      {
        str3 = (String)localMap.get((String)localObject1 + ".topnew.cover");
        str1 = (String)localMap.get((String)localObject1 + ".topnew.digest");
        n = bg.getInt((String)localMap.get((String)localObject1 + ".$count"), 0);
        if (n != 0) {
          break;
        }
        w.e("MicroMsg.ReaderFuncMsgUpdateMgr", "get " + (String)localObject1 + ".$count  error");
      }
    }
    label562:
    label577:
    int j;
    Object localObject3;
    label607:
    String str4;
    com.tencent.mm.y.bh localbh;
    if (n > 1)
    {
      localObject2 = new StringBuilder().append((String)localObject1);
      if (m != 20) {
        break label1330;
      }
      localObject1 = ".newitem";
      localObject1 = (String)localObject1;
      break label1325;
      if (j >= n) {
        break label1318;
      }
      localObject3 = new StringBuilder().append((String)localObject1);
      if (j <= 0) {
        break label1338;
      }
      localObject2 = Integer.valueOf(j);
      str4 = localObject2;
      localbh = new com.tencent.mm.y.bh();
      localbh.T(parambu.tPV);
      localbh.title = ((String)localMap.get(str4 + ".title"));
      if (j != 0) {
        break label1238;
      }
      localbh.goI = 1;
      localbh.glx = str3;
      if (!bg.nm(str1)) {
        break label1345;
      }
    }
    label737:
    label1238:
    label1318:
    label1325:
    label1330:
    label1338:
    label1345:
    for (localObject2 = (String)localMap.get(str4 + ".digest");; localObject2 = str1)
    {
      localbh.glz = ((String)localObject2);
      if (localMap.containsKey(str4 + ".vedio")) {}
      for (int k = 1;; k = 0)
      {
        localbh.goJ = k;
        localbh.url = ((String)localMap.get(str4 + ".url"));
        localbh.goD = ((String)localMap.get(str4 + ".shorturl"));
        localbh.goE = ((String)localMap.get(str4 + ".longurl"));
        localbh.goF = bg.getLong((String)localMap.get(str4 + ".pub_time"), 0L);
        localObject3 = (String)localMap.get(str4 + ".tweetid");
        if (localObject3 != null)
        {
          localObject2 = localObject3;
          if (!"".equals(localObject3)) {}
        }
        else
        {
          localObject2 = new Date(System.currentTimeMillis() + j);
          localObject2 = "N" + localSimpleDateFormat.format((Date)localObject2);
          w.d("MicroMsg.ReaderFuncMsgUpdateMgr", "create tweetID = " + (String)localObject2);
        }
        localbh.goC = ((String)localObject2);
        localbh.goG = ((String)localMap.get(str4 + ".sources.source.name"));
        localbh.goH = ((String)localMap.get(str4 + ".sources.source.icon"));
        localbh.time = (i + l * 1000L);
        localbh.type = m;
        localbh.name = str2;
        localbh.goL = paramString;
        localArrayList.add(localbh);
        w.d("MicroMsg.ReaderFuncMsgUpdateMgr", "parse info, pubtime: %s, time: %s", new Object[] { com.tencent.mm.pluginsdk.i.n.ac(ab.getContext().getString(R.l.dwA), localbh.goF), com.tencent.mm.pluginsdk.i.n.c(ab.getContext(), localbh.time, false) });
        j += 1;
        break;
        localObject1 = (String)localObject1 + ".item";
        break label1325;
        localbh.glx = ((String)localMap.get(str4 + ".cover"));
        localbh.glz = ((String)localMap.get(str4 + ".digest"));
        break label737;
      }
      i += 1;
      break;
      j = 0;
      break label577;
      localObject1 = ".item";
      break label562;
      localObject2 = "";
      break label607;
    }
  }
  
  public final void a(int paramInt, Map<String, bu> paramMap, boolean paramBoolean)
  {
    GMTrace.i(11748211949568L, 87531);
    w.i("MicroMsg.ReaderFuncMsgUpdateMgr", "onFunctionMsgUpdate, op: %s, msgIdMap.size: %s, needUpdateTime: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramMap.size()), Boolean.valueOf(paramBoolean) });
    Iterator localIterator1 = paramMap.keySet().iterator();
    Object localObject3;
    Object localObject1;
    Object localObject4;
    long l;
    Object localObject2;
    int i;
    int k;
    while (localIterator1.hasNext())
    {
      localObject3 = (String)localIterator1.next();
      localObject1 = (bu)paramMap.get(localObject3);
      localObject4 = a((bu)localObject1, (String)localObject3);
      if (localObject4 != null)
      {
        l = ((bu)localObject1).nFd * 1000L;
        if ((localObject4 != null) && (((List)localObject4).size() != 0))
        {
          w.i("MicroMsg.ReaderFuncMsgUpdateMgr", "processInfoList, op: %s, infoList.size: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(((List)localObject4).size()) });
          if (paramInt == 1)
          {
            localObject1 = ((List)localObject4).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (com.tencent.mm.y.bh)((Iterator)localObject1).next();
              w.i("MicroMsg.ReaderFuncMsgUpdateMgr", "delete info, functionMsgId: %s", new Object[] { ((com.tencent.mm.y.bh)localObject2).BB() });
              g.bah().a(((com.tencent.mm.y.bh)localObject2).BB(), ((com.tencent.mm.y.bh)localObject2).type, true, true);
            }
          }
          else if (paramInt == 0)
          {
            localObject2 = null;
            List localList = g.bah().x((String)localObject3, ((com.tencent.mm.y.bh)((List)localObject4).get(0)).type);
            localObject1 = null;
            w.i("MicroMsg.ReaderFuncMsgUpdateMgr", "update info, functionMsgId: %s, oldInfoList: %s", new Object[] { localObject3, localList });
            int j = 0;
            Iterator localIterator2 = ((List)localObject4).iterator();
            i = 0;
            k = 0;
            for (;;)
            {
              if (localIterator2.hasNext())
              {
                localObject4 = (com.tencent.mm.y.bh)localIterator2.next();
                localObject3 = localObject2;
                if (localObject2 == null)
                {
                  k = ((com.tencent.mm.y.bh)localObject4).type;
                  ((com.tencent.mm.y.bh)localObject4).goI = 1;
                  localObject3 = localObject4;
                }
                if (localList == null)
                {
                  w.i("MicroMsg.ReaderFuncMsgUpdateMgr", "update info, insert new msg, functionMsgId: %s", new Object[] { ((com.tencent.mm.y.bh)localObject4).BB() });
                  i += 1;
                  g.bah().a((com.tencent.mm.y.bh)localObject4);
                  localObject2 = localObject3;
                }
                else if (paramBoolean)
                {
                  ((com.tencent.mm.y.bh)localObject4).time = l;
                  if (localObject3 != null) {
                    ((com.tencent.mm.y.bh)localObject3).time = l;
                  }
                  i += 1;
                  label443:
                  w.i("MicroMsg.ReaderFuncMsgUpdateMgr", "update info, update the exist one, functionMsgId: %s, time: %s", new Object[] { ((com.tencent.mm.y.bh)localObject4).BB(), Long.valueOf(((com.tencent.mm.y.bh)localObject4).time) });
                  if (j != 0) {
                    break label880;
                  }
                  g.bah().a(((com.tencent.mm.y.bh)localObject4).BB(), ((com.tencent.mm.y.bh)localObject4).type, false, false);
                  j = 1;
                  label500:
                  g.bah().a((com.tencent.mm.y.bh)localObject4);
                  localObject2 = localObject3;
                }
                else
                {
                  localObject2 = localObject1;
                  if (localObject1 == null)
                  {
                    localObject1 = (com.tencent.mm.y.bh)localList.get(0);
                    Iterator localIterator3 = localList.iterator();
                    label547:
                    localObject2 = localObject1;
                    if (localIterator3.hasNext())
                    {
                      localObject2 = (com.tencent.mm.y.bh)localIterator3.next();
                      if (((com.tencent.mm.y.bh)localObject2).goI != 1) {
                        break label883;
                      }
                      localObject1 = localObject2;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label694:
    label711:
    label754:
    label764:
    label774:
    label880:
    label883:
    for (;;)
    {
      break label547;
      ((com.tencent.mm.y.bh)localObject4).time = ((com.tencent.mm.y.bh)localObject2).time;
      if (localObject3 != null) {
        ((com.tencent.mm.y.bh)localObject3).time = ((com.tencent.mm.y.bh)localObject2).time;
      }
      localObject1 = localObject2;
      break label443;
      if (i > 0)
      {
        at.AR();
        localObject1 = c.yP().TO(com.tencent.mm.y.bh.fw(k));
        if ((localObject1 != null) && (((aj)localObject1).field_username.equals(com.tencent.mm.y.bh.fw(k)))) {
          break label774;
        }
        localObject3 = new ae();
        ((ae)localObject3).setUsername(com.tencent.mm.y.bh.fw(k));
        if (localObject2 != null) {
          break label754;
        }
        localObject1 = "";
        ((ae)localObject3).setContent((String)localObject1);
        if (localObject2 != null) {
          break label764;
        }
        l = bg.Pv();
        ((ae)localObject3).x(l);
        ((ae)localObject3).dC(0);
        ((ae)localObject3).dz(1);
        at.AR();
        c.yP().d((ae)localObject3);
      }
      for (;;)
      {
        g.bah().doNotify();
        break;
        localObject1 = ((com.tencent.mm.y.bh)localObject2).getTitle();
        break label694;
        l = ((com.tencent.mm.y.bh)localObject2).time;
        break label711;
        ((ae)localObject1).x(((com.tencent.mm.y.bh)localObject2).time);
        ((ae)localObject1).dC(0);
        if (((!bg.nm(((com.tencent.mm.y.bh)localObject2).getTitle())) && (!((com.tencent.mm.y.bh)localObject2).getTitle().equals(((aj)localObject1).field_content))) || (((aj)localObject1).field_unReadCount == 0))
        {
          ((ae)localObject1).setContent(((com.tencent.mm.y.bh)localObject2).getTitle());
          ((ae)localObject1).dz(((aj)localObject1).field_unReadCount + 1);
        }
        at.AR();
        c.yP().a((ae)localObject1, com.tencent.mm.y.bh.fw(k));
      }
      GMTrace.o(11748211949568L, 87531);
      return;
      break label500;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */