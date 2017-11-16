package com.tencent.mm.plugin.webview.fts;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e.b;
import com.tencent.mm.az.r;
import com.tencent.mm.g.a.ht;
import com.tencent.mm.g.a.ht.a;
import com.tencent.mm.modelappbrand.m;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.webview.fts.a.e.a;
import com.tencent.mm.pluginsdk.j.a.b.b.c;
import com.tencent.mm.protocal.c.aqm;
import com.tencent.mm.protocal.c.bil;
import com.tencent.mm.protocal.c.bms;
import com.tencent.mm.protocal.c.btj;
import com.tencent.mm.protocal.c.bvf;
import com.tencent.mm.protocal.c.nq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  implements com.tencent.mm.ad.e
{
  public btj gRA;
  public com.tencent.mm.plugin.fts.a.a.a lwZ;
  private j nLu;
  public int rBN;
  public com.tencent.mm.plugin.webview.fts.a.c rBO;
  public a rBP;
  public b rBQ;
  
  public c()
  {
    GMTrace.i(12465605705728L, 92876);
    this.rBN = 0;
    this.rBO = new com.tencent.mm.plugin.webview.fts.a.b();
    this.rBP = new a();
    this.rBQ = new b();
    this.nLu = new j()
    {
      public final void a(com.tencent.mm.plugin.fts.a.a.g paramAnonymousg)
      {
        GMTrace.i(18176167378944L, 135423);
        switch (paramAnonymousg.aGY)
        {
        }
        for (;;)
        {
          GMTrace.o(18176167378944L, 135423);
          return;
          if ((paramAnonymousg.lxb == null) || (paramAnonymousg.lxb.size() == 0))
          {
            w.i("MicroMsg.FTS.FTSWebSearchLogic", "local contact search size 0");
            com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(((Integer)c.this.lwZ.lwD).intValue()).Mu("");
            GMTrace.o(18176167378944L, 135423);
            return;
          }
          JSONObject localJSONObject1;
          JSONArray localJSONArray1;
          JSONObject localJSONObject2;
          JSONArray localJSONArray2;
          try
          {
            localJSONObject1 = new JSONObject();
            localJSONArray1 = new JSONArray();
            localJSONObject2 = new JSONObject();
            localJSONArray2 = new JSONArray();
            Iterator localIterator = paramAnonymousg.lxb.iterator();
            while (localIterator.hasNext())
            {
              com.tencent.mm.plugin.fts.a.a.i locali = (com.tencent.mm.plugin.fts.a.a.i)localIterator.next();
              if (locali.type == 131072) {
                localJSONArray2.put(f.a(locali, paramAnonymousg.luZ.eQb, bg.g(paramAnonymousg.lxa)));
              }
            }
            localJSONObject2.put("items", localJSONArray2);
          }
          catch (Exception paramAnonymousg)
          {
            w.printErrStackTrace("MicroMsg.FTS.FTSWebSearchLogic", paramAnonymousg, "onSearchDone", new Object[0]);
            GMTrace.o(18176167378944L, 135423);
            return;
          }
          localJSONObject2.put("title", ab.getContext().getString(R.l.dyB));
          localJSONObject2.put("count", localJSONArray2.length());
          localJSONObject2.put("type", 3);
          localJSONArray1.put(localJSONObject2);
          localJSONObject1.put("data", localJSONArray1);
          localJSONObject1.put("ret", 0);
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(((Integer)c.this.lwZ.lwD).intValue()).Mu(localJSONObject1.toString());
          GMTrace.o(18176167378944L, 135423);
          return;
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(((Integer)c.this.lwZ.lwD).intValue()).Mu("");
        }
      }
    };
    w.d("MicroMsg.FTS.FTSWebSearchLogic", "create FTSWebSearchLogic");
    GMTrace.o(12465605705728L, 92876);
  }
  
  private static void cg(String paramString, int paramInt)
  {
    GMTrace.i(20454513311744L, 152398);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(20454513311744L, 152398);
      return;
    }
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString).getJSONArray("data");
        if (paramString == null) {
          break;
        }
        int i = 0;
        if (i >= paramString.length()) {
          break;
        }
        Object localObject1 = paramString.getJSONObject(i);
        if ((localObject1 != null) && (((JSONObject)localObject1).optInt("type") == 262144))
        {
          w.i("MicroMsg.FTS.FTSWebSearchLogic", "reportRecvWidget found widget");
          localObject1 = ((JSONObject)localObject1).getJSONArray("items");
          if (localObject1 != null)
          {
            int j = 0;
            if (j < ((JSONArray)localObject1).length())
            {
              Object localObject2 = ((JSONArray)localObject1).getJSONObject(j);
              com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg;
              Bundle localBundle;
              if (localObject2 != null)
              {
                localObject2 = ((JSONObject)localObject2).optString("appID");
                w.i("MicroMsg.FTS.FTSWebSearchLogic", "reportRecvWidget found widget appid %s", new Object[] { localObject2 });
                localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(paramInt);
                localBundle = new Bundle();
                localBundle.putString("appid", (String)localObject2);
              }
              try
              {
                if (localg.rEM != null) {
                  localg.rEM.m(144, localBundle);
                }
                j += 1;
              }
              catch (RemoteException localRemoteException)
              {
                w.w("MicroMsg.MsgHandler", "onRecvWidget exception" + localRemoteException.getMessage());
                continue;
              }
            }
          }
        }
        i += 1;
      }
      catch (JSONException paramString)
      {
        w.e("MicroMsg.FTS.FTSWebSearchLogic", "", new Object[] { paramString });
        GMTrace.o(20454513311744L, 152398);
        return;
      }
    }
    GMTrace.o(20454513311744L, 152398);
  }
  
  public static boolean xn(int paramInt)
  {
    GMTrace.i(16083578781696L, 119832);
    if (paramInt == 201)
    {
      GMTrace.o(16083578781696L, 119832);
      return true;
    }
    GMTrace.o(16083578781696L, 119832);
    return false;
  }
  
  public final boolean M(Map<String, Object> paramMap)
  {
    GMTrace.i(12465739923456L, 92877);
    w.i("MicroMsg.FTS.FTSWebSearchLogic", "getSearchData: %s", new Object[] { paramMap.toString() });
    Object localObject1 = new e.b();
    ((e.b)localObject1).eBj = f.o(paramMap, "query");
    ((e.b)localObject1).offset = f.c(paramMap, "offset", 0);
    ((e.b)localObject1).gRj = f.c(paramMap, "type", 0);
    ((e.b)localObject1).scene = f.c(paramMap, "scene", 3);
    ((e.b)localObject1).gRo = f.o(paramMap, "sugId");
    ((e.b)localObject1).gRq = f.c(paramMap, "sugType", 0);
    ((e.b)localObject1).gRp = f.o(paramMap, "prefixSug");
    int i;
    if (f.q(paramMap, "isHomePage")) {
      i = 1;
    }
    Object localObject6;
    Object localObject7;
    for (;;)
    {
      ((e.b)localObject1).gRi = i;
      ((e.b)localObject1).gRm = f.o(paramMap, "searchId");
      ((e.b)localObject1).gRn = f.c(paramMap, "sceneActionType", 1);
      ((e.b)localObject1).gRs = f.c(paramMap, "displayPattern", 2);
      ((e.b)localObject1).gRt = f.c(paramMap, "sugPosition", 0);
      ((e.b)localObject1).gRu = f.o(paramMap, "sugBuffer");
      Object localObject2 = f.o(paramMap, "extReqParams");
      if (!bg.nm((String)localObject2)) {
        try
        {
          localObject2 = new JSONArray((String)localObject2);
          i = 0;
          while (i < ((JSONArray)localObject2).length())
          {
            localObject6 = ((JSONArray)localObject2).getJSONObject(i);
            localObject7 = new nq();
            ((nq)localObject7).amf = ((JSONObject)localObject6).optString("key", "");
            ((nq)localObject7).ueq = ((JSONObject)localObject6).optInt("uintValue", 0);
            ((nq)localObject7).uer = ((JSONObject)localObject6).optString("textValue", "");
            ((e.b)localObject1).gRw.add(localObject7);
            i += 1;
            continue;
            i = 0;
          }
        }
        catch (Exception localException1)
        {
          w.printErrStackTrace("MicroMsg.FTS.FTSWebSearchLogic", localException1, "commKvJSONArray", new Object[0]);
        }
      }
    }
    Object localObject3 = f.o(paramMap, "matchUser");
    if (!bg.nm((String)localObject3)) {}
    Object localObject5;
    try
    {
      localObject3 = new JSONObject((String)localObject3);
      localObject6 = new bms();
      ((bms)localObject6).jhi = ((JSONObject)localObject3).optString("userName");
      ((bms)localObject6).uWW = ((JSONObject)localObject3).optString("matchWord");
      if (!TextUtils.isEmpty(((bms)localObject6).jhi)) {
        ((e.b)localObject1).gRl.add(localObject6);
      }
      localObject3 = f.o(paramMap, "prefixQuery");
      if (bg.nm((String)localObject3)) {}
    }
    catch (Exception localException2)
    {
      try
      {
        localObject3 = new JSONArray((String)localObject3);
        i = 0;
        while (i < ((JSONArray)localObject3).length())
        {
          localObject6 = ((JSONArray)localObject3).getString(i);
          ((e.b)localObject1).gRr.add(localObject6);
          i += 1;
          continue;
          localException2 = localException2;
          w.printErrStackTrace("MicroMsg.FTS.FTSWebSearchLogic", localException2, "matchUserJSONArray", new Object[0]);
        }
      }
      catch (Exception localException3)
      {
        w.printErrStackTrace("MicroMsg.FTS.FTSWebSearchLogic", localException3, "prefixQueryJSONArray", new Object[0]);
      }
      Object localObject4 = f.o(paramMap, "tagInfo");
      if (!bg.nm((String)localObject4)) {}
      try
      {
        localObject4 = new JSONObject((String)localObject4);
        ((e.b)localObject1).gRv = new bil();
        ((e.b)localObject1).gRv.uTO = ((JSONObject)localObject4).optString("tagText");
        ((e.b)localObject1).gRv.uTN = ((JSONObject)localObject4).optInt("tagType");
        ((e.b)localObject1).gRv.uTP = ((JSONObject)localObject4).optString("tagExtValue");
        localObject4 = f.o(paramMap, "numConditions");
        if (bg.nm((String)localObject4)) {}
      }
      catch (Exception localException4)
      {
        try
        {
          localObject4 = new JSONArray((String)localObject4);
          i = 0;
          while (i < ((JSONArray)localObject4).length())
          {
            localObject6 = ((JSONArray)localObject4).optJSONObject(i);
            localObject7 = new aqm();
            ((aqm)localObject7).uGJ = ((JSONObject)localObject6).optLong("from");
            ((aqm)localObject7).uGK = ((JSONObject)localObject6).optLong("to");
            ((aqm)localObject7).uGI = ((JSONObject)localObject6).optInt("field");
            ((e.b)localObject1).gRx.add(localObject7);
            i += 1;
            continue;
            localException4 = localException4;
            w.printErrStackTrace("MicroMsg.FTS.FTSWebSearchLogic", localException4, "tagInfoObj", new Object[0]);
          }
        }
        catch (Exception localException5)
        {
          w.printErrStackTrace("MicroMsg.FTS.FTSWebSearchLogic", localException5, "numConditionsArray", new Object[0]);
        }
        ((e.b)localObject1).eQd = bg.m(paramMap.get("webview_instance_id"), -1);
        ((e.b)localObject1).aKB = v.eq(ab.getContext());
        ((e.b)localObject1).gRk = f.c(paramMap, "subType", 0);
        if (r.KL())
        {
          ((e.b)localObject1).gRy = f.c(paramMap, "isWeAppMore", 0);
          if (((e.b)localObject1).gRy == 1)
          {
            ((e.b)localObject1).gRz = new bvf();
            localObject5 = new ht();
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject5);
            ((e.b)localObject1).gRz.vdu = ((ht)localObject5).eLh.eLi;
            ((e.b)localObject1).gRz.vdw = com.tencent.mm.modelappbrand.b.gqX;
            ((e.b)localObject1).gRz.vdv = f.c(paramMap, "subType", 0);
            ((e.b)localObject1).gRz.uVo = com.tencent.mm.modelappbrand.b.gqW;
            ((e.b)localObject1).gRz.vdy = ((e.b)localObject1).gRt;
            at.AR();
            localObject5 = com.tencent.mm.y.c.xh().get(w.a.vws, null);
            if ((localObject5 != null) && ((localObject5 instanceof String))) {
              ((e.b)localObject1).gRz.vdx = ((String)localObject5);
            }
          }
        }
        if (this.rBN != 1) {
          break label1102;
        }
      }
      ((e.b)localObject1).gRA = this.gRA;
    }
    for (;;)
    {
      localObject5 = this.rBP;
      if (((a)localObject5).rBU != null) {
        ((a)localObject5).rBU.mFj = true;
      }
      ((a)localObject5).rBU = new c.a.a((a)localObject5);
      ((a)localObject5).rBU.rBV = ((e.b)localObject1);
      ((a)localObject5).rBT.execute(((a)localObject5).rBU);
      localObject5 = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(((e.b)localObject1).eQd);
      i = ((e.b)localObject1).gRj;
      localObject1 = ((e.b)localObject1).eBj;
      localObject6 = new Bundle();
      ((Bundle)localObject6).putInt("FTS_KEY_onStartWebSearch_type", i);
      ((Bundle)localObject6).putString("FTS_KEY_onStartWebSearch_query", (String)localObject1);
      ((Bundle)localObject6).putSerializable("FTS_KEY_onStartWebSearch_params", new HashMap(paramMap));
      try
      {
        if (((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject5).rEM != null) {
          ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject5).rEM.m(135, (Bundle)localObject6);
        }
        GMTrace.o(12465739923456L, 92877);
        return false;
        label1102:
        ((e.b)localObject1).gRA = null;
      }
      catch (RemoteException paramMap)
      {
        for (;;)
        {
          w.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + paramMap.getMessage());
        }
      }
    }
  }
  
  public final boolean N(Map<String, Object> paramMap)
  {
    GMTrace.i(12466008358912L, 92879);
    w.i("MicroMsg.FTS.FTSWebSearchLogic", "getSuggestionData %s", new Object[] { paramMap });
    Object localObject1 = new e.b();
    ((e.b)localObject1).eBj = f.o(paramMap, "query");
    try
    {
      ((e.b)localObject1).eBj = URLDecoder.decode(((e.b)localObject1).eBj, "UTF-8");
      ((e.b)localObject1).gRj = f.c(paramMap, "type", 0);
      ((e.b)localObject1).scene = f.c(paramMap, "scene", 3);
      int i;
      Object localObject2;
      if (f.q(paramMap, "isHomePage"))
      {
        i = 1;
        ((e.b)localObject1).gRi = i;
        ((e.b)localObject1).eQd = bg.m(paramMap.get("webview_instance_id"), -1);
        ((e.b)localObject1).gRr.add(f.o(paramMap, "prefixQuery"));
        i = f.c(paramMap, "requestType", 0);
        ((e.b)localObject1).gRk = f.c(paramMap, "subtype", 0);
        w.i("MicroMsg.FTS.FTSWebSearchLogic", "getSearchData, webviewID = %d", new Object[] { Integer.valueOf(((e.b)localObject1).eQd) });
        if (r.KL())
        {
          ((e.b)localObject1).gRy = f.c(paramMap, "isWeAppMore", 0);
          if (((e.b)localObject1).gRy == 1)
          {
            ((e.b)localObject1).gRz = new bvf();
            localObject2 = new ht();
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
            ((e.b)localObject1).gRz.vdu = ((ht)localObject2).eLh.eLi;
            ((e.b)localObject1).gRz.vdw = com.tencent.mm.modelappbrand.b.gqX;
            ((e.b)localObject1).gRz.vdv = f.c(paramMap, "subType", 0);
            ((e.b)localObject1).gRz.uVo = com.tencent.mm.modelappbrand.b.gqW;
            at.AR();
            paramMap = com.tencent.mm.y.c.xh().get(w.a.vws, null);
            if ((paramMap != null) && ((paramMap instanceof String))) {
              ((e.b)localObject1).gRz.vdx = ((String)paramMap);
            }
          }
        }
        switch (i)
        {
        }
      }
      int j;
      do
      {
        for (;;)
        {
          GMTrace.o(12466008358912L, 92879);
          return false;
          i = 0;
          break;
          localObject2 = this.rBQ;
          if (((b)localObject2).rBX != null)
          {
            at.wS().b(((b)localObject2).rBX.getType(), ((b)localObject2).rBR);
            at.wS().c(((b)localObject2).rBX);
            ((b)localObject2).rBX = null;
          }
          if (((b)localObject2).rBX == null)
          {
            if (!r.KL()) {
              if (xn(((e.b)localObject1).scene)) {
                paramMap = new com.tencent.mm.modelappbrand.n(((e.b)localObject1).eBj, ((e.b)localObject1).scene, ((e.b)localObject1).eQd);
              }
            }
            for (;;)
            {
              ((b)localObject2).rBX = paramMap;
              at.wS().a(((b)localObject2).rBX.getType(), ((b)localObject2).rBR);
              at.wS().a(((b)localObject2).rBX, 0);
              break;
              paramMap = new k((e.b)localObject1);
              continue;
              paramMap = new k((e.b)localObject1);
            }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(((e.b)localObject1).eQd).Mu(com.tencent.mm.az.f.KA());
          }
        }
        localObject2 = ((e.b)localObject1).eBj;
        i = ((e.b)localObject1).gRj;
        j = ((e.b)localObject1).eQd;
      } while (bg.nm((String)localObject2));
      if (this.lwZ != null)
      {
        ((l)com.tencent.mm.kernel.h.j(l.class)).cancelSearchTask(this.lwZ);
        this.lwZ = null;
      }
      switch (i)
      {
      default: 
        paramMap = null;
      }
      while (paramMap != null)
      {
        localObject1 = new com.tencent.mm.plugin.fts.a.a.f();
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).lwS = 16;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).eQb = ((String)localObject2);
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).lwT = paramMap;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).lwV = 5;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).lwX = com.tencent.mm.plugin.fts.a.b.b.lxs;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).lwW = new HashSet();
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).lwY = this.nLu;
        this.lwZ = ((l)com.tencent.mm.kernel.h.j(l.class)).search(2, (com.tencent.mm.plugin.fts.a.a.f)localObject1);
        this.lwZ.lwD = Integer.valueOf(j);
        break;
        paramMap = new int[1];
        paramMap[0] = 131072;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;) {}
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12465874141184L, 92878);
    int i;
    if (paramk != null) {
      i = paramk.getType();
    }
    for (;;)
    {
      w.v("MicroMsg.FTS.FTSWebSearchLogic", "onSceneEnd(type : %s), errType : %s, errCode : %s, errMsg : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
      if ((paramk instanceof com.tencent.mm.az.a))
      {
        at.wS().b(paramk.getType(), this);
        paramString = (com.tencent.mm.az.a)paramk;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          w.i("MicroMsg.FTS.FTSWebSearchLogic", "net scene fail %s", new Object[] { paramString.gRa });
          paramk = new JSONObject();
        }
      }
      try
      {
        paramk.put("ret", -1);
        paramk = paramk.toString();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(paramString.gQZ).aH(paramk, true);
        GMTrace.o(12465874141184L, 92878);
        return;
        i = 0;
        continue;
        paramk = paramString.CM();
        cg(paramk, paramString.gQZ);
        paramInt1 = paramString.CN();
        w.i("MicroMsg.FTS.FTSWebSearchLogic", "callback %s", new Object[] { paramString.gRa });
        com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(paramString.gQZ);
        if (paramString.vq == 0) {}
        for (boolean bool = true;; bool = false)
        {
          localg.aH(paramk, bool);
          if (paramInt1 > 0)
          {
            w.i("MicroMsg.FTS.FTSWebSearchLogic", "updateCode %d, need update", new Object[] { Integer.valueOf(paramInt1) });
            paramString = b.c.tqk;
            com.tencent.mm.pluginsdk.j.a.b.b.yR(27);
          }
          GMTrace.o(12465874141184L, 92878);
          return;
        }
        if ((paramk instanceof com.tencent.mm.az.b))
        {
          at.wS().b(paramk.getType(), this);
          paramString = (com.tencent.mm.az.b)paramk;
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            w.i("MicroMsg.FTS.FTSWebSearchLogic", "net scene fail %s", new Object[] { paramString.gRc });
            com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(paramString.gQZ).Mu("{}");
            GMTrace.o(12465874141184L, 92878);
            return;
          }
          paramk = paramString.CM();
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(paramString.gQZ).Mu(paramk);
        }
        GMTrace.o(12465874141184L, 92878);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
  }
  
  private final class a
    implements Comparable
  {
    public com.tencent.mm.az.a rBS;
    ThreadPoolExecutor rBT;
    public a rBU;
    
    public a()
    {
      GMTrace.i(12468692713472L, 92899);
      this.rBT = new ThreadPoolExecutor(0, 10, 120L, TimeUnit.SECONDS, new ArrayBlockingQueue(32));
      GMTrace.o(12468692713472L, 92899);
    }
    
    public static com.tencent.mm.az.a a(e.b paramb)
    {
      GMTrace.i(19473381720064L, 145088);
      Object localObject;
      if ((c.xn(paramb.scene)) && (!r.KL())) {
        localObject = new m(paramb);
      }
      for (;;)
      {
        ((com.tencent.mm.az.a)localObject).gQZ = paramb.eQd;
        GMTrace.o(19473381720064L, 145088);
        return (com.tencent.mm.az.a)localObject;
        if (paramb.scene == 21) {}
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label83;
          }
          localObject = new h(paramb);
          break;
        }
        label83:
        localObject = new i(paramb);
      }
    }
    
    public final int compareTo(Object paramObject)
    {
      GMTrace.i(19473515937792L, 145089);
      GMTrace.o(19473515937792L, 145089);
      return 0;
    }
    
    private final class a
      implements Runnable
    {
      public volatile boolean mFj;
      e.b rBV;
      
      public a()
      {
        GMTrace.i(19472844849152L, 145084);
        GMTrace.o(19472844849152L, 145084);
      }
      
      public final void run()
      {
        GMTrace.i(19472979066880L, 145085);
        if (Thread.interrupted())
        {
          GMTrace.o(19472979066880L, 145085);
          return;
        }
        if (bg.nm(this.rBV.eBj))
        {
          w.i("MicroMsg.FTS.FTSWebSearchLogic", "error query %d %d %d %d %s %d", new Object[] { Integer.valueOf(this.rBV.gRj), Integer.valueOf(this.rBV.scene), Integer.valueOf(this.rBV.gRi), Integer.valueOf(this.rBV.gRn), this.rBV.gRm, Integer.valueOf(this.rBV.offset) });
          GMTrace.o(19472979066880L, 145085);
          return;
        }
        Object localObject1;
        int j;
        int k;
        int i;
        switch (this.rBV.scene)
        {
        default: 
          w.i("MicroMsg.FTS.FTSWebSearchLogic", "start New NetScene %s ,  %d", new Object[] { this.rBV.eBj, Integer.valueOf(this.rBV.eQd) });
          if (c.a.this.rBS != null) {
            at.wS().c(c.a.this.rBS);
          }
          if ((this.rBV.gRl == null) || (this.rBV.gRl.isEmpty()))
          {
            localObject1 = this.rBV.eBj;
            j = this.rBV.scene;
            k = this.rBV.gRj;
            if (this.rBV.gRi == 1)
            {
              i = 1;
              label274:
              if ((TextUtils.isEmpty((CharSequence)localObject1)) || (!com.tencent.mm.az.e.Kw())) {
                break label548;
              }
              int m = com.tencent.mm.az.e.Kx();
              if ((m > 0) && (((String)localObject1).length() > m)) {
                break label548;
              }
              if (((j != 3) && (j != 20)) || ((i == 0) && (k != 8))) {
                break label514;
              }
              i = 1;
              label331:
              if (i == 0) {
                break label852;
              }
              long l = System.currentTimeMillis();
              localObject1 = (com.tencent.mm.plugin.webview.fts.a.e)c.this.rBO.Ld(this.rBV.eBj);
              l = System.currentTimeMillis() - l;
              w.i("MicroMsg.FTS.FTSWebSearchLogic", "match contact cost %d ms", new Object[] { Long.valueOf(l) });
              com.tencent.mm.plugin.report.service.g.ork.i(14717, new Object[] { this.rBV.eBj, Integer.valueOf(s.Au()), Integer.valueOf(((com.tencent.mm.plugin.webview.fts.a.e)localObject1).lzI.size()), Long.valueOf(l), Integer.valueOf(this.rBV.scene) });
            }
          }
          break;
        }
        for (;;)
        {
          if (this.mFj)
          {
            w.i("MicroMsg.FTS.FTSWebSearchLogic", "was cancelled");
            GMTrace.o(19472979066880L, 145085);
            return;
            ((l)com.tencent.mm.kernel.h.j(l.class)).addSOSHistory(this.rBV.eBj);
            break;
            i = 0;
            break label274;
            label514:
            if (((j == 14) || (j == 22)) && (k == 8))
            {
              i = 1;
              break label331;
            }
            if (j == 16)
            {
              i = 1;
              break label331;
            }
            label548:
            i = 0;
            break label331;
          }
          Object localObject2 = com.tencent.mm.plugin.webview.modeltools.f.bCT().rCn;
          i = this.rBV.scene;
          Object localObject3 = this.rBV.eBj;
          j = this.rBV.gRj;
          ((e.e)localObject2).eQb = ((String)localObject3);
          ((e.e)localObject2).scene = i;
          ((e.e)localObject2).eBn = false;
          ((e.e)localObject2).lzX = j;
          ((e.e)localObject2).rCH = false;
          ((e.e)localObject2).rCG = false;
          c.a.this.rBS = c.a.a(this.rBV);
          if (localObject1 != null)
          {
            localObject2 = new LinkedList();
            localObject1 = ((com.tencent.mm.plugin.webview.fts.a.e)localObject1).lzI.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (e.a)((Iterator)localObject1).next();
              bms localbms = new bms();
              localbms.jhi = ((e.a)localObject3).userName;
              localbms.uWW = ((e.a)localObject3).rCR;
              localbms.jio = ((e.a)localObject3).aDn;
              localbms.ueH = ((e.a)localObject3).hLO;
              localbms.gCC = ((e.a)localObject3).fsF;
              localbms.tRP = ((e.a)localObject3).desc;
              ((LinkedList)localObject2).add(localbms);
            }
            c.a.this.rBS.p((LinkedList)localObject2);
          }
          at.wS().a(c.a.this.rBS.getType(), c.this);
          at.wS().a(c.a.this.rBS, 0);
          w.i("MicroMsg.FTS.FTSWebSearchLogic", "doScene(type : %s)", new Object[] { Integer.valueOf(c.a.this.rBS.getType()) });
          GMTrace.o(19472979066880L, 145085);
          return;
          label852:
          localObject1 = null;
        }
      }
    }
  }
  
  private final class b
  {
    public com.tencent.mm.az.b rBX;
    
    public b()
    {
      GMTrace.i(12466545229824L, 92883);
      GMTrace.o(12466545229824L, 92883);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */