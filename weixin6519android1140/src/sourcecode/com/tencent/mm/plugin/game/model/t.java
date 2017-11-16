package com.tencent.mm.plugin.game.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lx;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class t
{
  public t()
  {
    GMTrace.i(12588549144576L, 93792);
    GMTrace.o(12588549144576L, 93792);
  }
  
  static void a(q paramq1, q paramq2)
  {
    GMTrace.i(20408476631040L, 152055);
    paramq2.aFr();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("oldNoticeId", paramq2.lNw);
      localJSONObject.put("oldMsgId", paramq2.field_gameMsgId);
      if (paramq1.field_weight.compareTo(paramq2.field_weight) >= 0) {
        localJSONObject.put("coverType", 1);
      }
      for (;;)
      {
        int i = paramq1.field_msgType;
        if (paramq1.field_msgType == 100) {
          i = paramq1.lNv;
        }
        ai.a(ab.getContext(), 0, 0, 0, 31, 0, paramq1.field_appId, 0, i, paramq1.field_gameMsgId, paramq1.lNw, ai.zJ(localJSONObject.toString()));
        GMTrace.o(20408476631040L, 152055);
        return;
        localJSONObject.put("coverType", 2);
      }
    }
    catch (Exception paramq2)
    {
      for (;;)
      {
        w.e("MicroMsg.GameMessageService", "reportMsgCover: " + paramq2.getMessage());
      }
    }
  }
  
  public static q aFs()
  {
    GMTrace.i(12588951797760L, 93795);
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vsC, Long.valueOf(0L))).longValue();
    if (l != 0L) {}
    for (q localq = SubCoreGameCenter.aGf().cA(l);; localq = null)
    {
      if ((localq == null) || (localq.field_isHidden) || (d(localq)))
      {
        ai.zL("");
        GMTrace.o(12588951797760L, 93795);
        return null;
      }
      GMTrace.o(12588951797760L, 93795);
      return localq;
    }
  }
  
  public static void aFt()
  {
    GMTrace.i(12589086015488L, 93796);
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vsC, Long.valueOf(0L))).longValue();
    q localq = null;
    if (l != 0L) {
      localq = SubCoreGameCenter.aGf().cA(l);
    }
    if ((localq == null) || (localq.field_isHidden))
    {
      GMTrace.o(12589086015488L, 93796);
      return;
    }
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vsC, Long.valueOf(0L));
    GMTrace.o(12589086015488L, 93796);
  }
  
  public static q aFu()
  {
    GMTrace.i(12589220233216L, 93797);
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vsG, Long.valueOf(0L))).longValue();
    if (l == 0L)
    {
      GMTrace.o(12589220233216L, 93797);
      return null;
    }
    q localq = SubCoreGameCenter.aGf().cA(l);
    if ((localq == null) || (localq.field_isHidden) || (d(localq)))
    {
      GMTrace.o(12589220233216L, 93797);
      return null;
    }
    GMTrace.o(12589220233216L, 93797);
    return localq;
  }
  
  public static void aFv()
  {
    GMTrace.i(12589354450944L, 93798);
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vsG, Long.valueOf(0L))).longValue();
    q localq = null;
    if (l != 0L) {
      localq = SubCoreGameCenter.aGf().cA(l);
    }
    if ((localq == null) || (localq.field_isHidden))
    {
      GMTrace.o(12589354450944L, 93798);
      return;
    }
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vsG, Long.valueOf(0L));
    GMTrace.o(12589354450944L, 93798);
  }
  
  public static q aFw()
  {
    GMTrace.i(12589488668672L, 93799);
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vsD, Long.valueOf(0L))).longValue();
    if (l == 0L)
    {
      GMTrace.o(12589488668672L, 93799);
      return null;
    }
    q localq = SubCoreGameCenter.aGf().cA(l);
    if ((localq == null) || (localq.field_isHidden) || (d(localq)))
    {
      GMTrace.o(12589488668672L, 93799);
      return null;
    }
    GMTrace.o(12589488668672L, 93799);
    return localq;
  }
  
  public static void aFx()
  {
    GMTrace.i(12589622886400L, 93800);
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vsD, Long.valueOf(0L))).longValue();
    q localq = null;
    if (l != 0L) {
      localq = SubCoreGameCenter.aGf().cA(l);
    }
    if ((localq == null) || (localq.field_isHidden))
    {
      GMTrace.o(12589622886400L, 93800);
      return;
    }
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vsD, Long.valueOf(0L));
    GMTrace.o(12589622886400L, 93800);
  }
  
  public static q aFy()
  {
    GMTrace.i(12589757104128L, 93801);
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vsF, Long.valueOf(0L))).longValue();
    q localq = SubCoreGameCenter.aGf().cA(l);
    GMTrace.o(12589757104128L, 93801);
    return localq;
  }
  
  private static boolean d(q paramq)
  {
    GMTrace.i(12589891321856L, 93802);
    long l = System.currentTimeMillis() / 1000L;
    if (paramq.field_expireTime < l)
    {
      GMTrace.o(12589891321856L, 93802);
      return true;
    }
    GMTrace.o(12589891321856L, 93802);
    return false;
  }
  
  static void e(q paramq)
  {
    GMTrace.i(12590025539584L, 93803);
    if (bg.nm(paramq.field_mergerId))
    {
      GMTrace.o(12590025539584L, 93803);
      return;
    }
    Object localObject2 = SubCoreGameCenter.aGf();
    Object localObject1 = paramq.field_mergerId;
    int i = paramq.field_msgType;
    String str = "select * from GameRawMessage where msgType=" + i + " and mergerId= \"" + (String)localObject1 + "\" order by createTime desc limit 1";
    localObject1 = new q();
    localObject2 = ((u)localObject2).rawQuery(str, new String[0]);
    if (localObject2 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        ((q)localObject1).aFr();
        if (!bg.cc(((q)localObject1).lMM))
        {
          paramq.aFr();
          localObject2 = new LinkedList(((q)localObject1).lMM);
          if (!bg.cc(paramq.lMM))
          {
            str = ((q.h)paramq.lMM.get(0)).userName;
            if (!bg.nm(str))
            {
              Iterator localIterator = ((q)localObject1).lMM.iterator();
              while (localIterator.hasNext())
              {
                q.h localh = (q.h)localIterator.next();
                if (localh.userName.equals(str)) {
                  ((LinkedList)localObject2).remove(localh);
                }
              }
            }
          }
          if (!bg.cc((List)localObject2)) {
            paramq.field_rawXML = aj.a(paramq.field_rawXML, (LinkedList)localObject2, ((q)localObject1).lMR);
          }
          SubCoreGameCenter.aGf().a((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
        }
      }
      GMTrace.o(12590025539584L, 93803);
      return;
      if (((Cursor)localObject2).moveToFirst()) {
        ((q)localObject1).b((Cursor)localObject2);
      }
      ((Cursor)localObject2).close();
    }
  }
  
  public final void a(lx paramlx)
  {
    GMTrace.i(12588817580032L, 93794);
    q localq = aFs();
    if (localq == null)
    {
      GMTrace.o(12588817580032L, 93794);
      return;
    }
    localq.aFr();
    ai.zL(localq.lNw);
    paramlx.eQz.showType = localq.lMO.lND;
    paramlx.eQz.appId = localq.field_appId;
    paramlx.eQz.appName = localq.lMO.iJz;
    paramlx.eQz.eQA = localq.lMO.lNB;
    paramlx.eQz.msgType = localq.field_msgType;
    if (localq.field_msgType == 100) {
      paramlx.eQz.msgType = localq.lNv;
    }
    paramlx.eQz.eQB = localq.field_gameMsgId;
    paramlx.eQz.eBv = localq.lNw;
    GMTrace.o(12588817580032L, 93794);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */