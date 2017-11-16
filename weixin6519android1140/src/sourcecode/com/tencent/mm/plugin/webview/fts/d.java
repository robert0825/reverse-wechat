package com.tencent.mm.plugin.webview.fts;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.fn;
import com.tencent.mm.g.a.fn.a;
import com.tencent.mm.g.a.fn.b;
import com.tencent.mm.g.a.pp;
import com.tencent.mm.g.a.pp.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements com.tencent.mm.sdk.e.j.a
{
  public c ppA;
  private volatile HashMap<String, HashSet<String>> rBY;
  public volatile HashMap<String, HashSet<String>> rBZ;
  public volatile HashMap<String, HashSet<String>> rCa;
  private volatile HashMap<String, Integer> rCb;
  public volatile HashMap<String, Integer> rCc;
  public volatile HashMap<String, Integer> rCd;
  public c<fn> rCe;
  
  public d()
  {
    GMTrace.i(15642539327488L, 116546);
    this.rCe = new c()
    {
      private boolean a(fn paramAnonymousfn)
      {
        GMTrace.i(15643344633856L, 116552);
        if (paramAnonymousfn.eHT.eCx == 2)
        {
          w.i("MicroMsg.FTS.FTSWebViewImageLogic", "Emoji Download callback %s", new Object[] { paramAnonymousfn.eHT.eDW });
          if (!d.this.rCa.containsKey(paramAnonymousfn.eHT.eDW)) {}
        }
        for (;;)
        {
          int i;
          JSONArray localJSONArray;
          String str1;
          String str2;
          JSONObject localJSONObject;
          synchronized (d.this.rCa)
          {
            i = ((Integer)d.this.rCd.get(paramAnonymousfn.eHT.eDW)).intValue();
            Object localObject = (HashSet)d.this.rCa.get(paramAnonymousfn.eHT.eDW);
            localJSONArray = new JSONArray();
            localObject = ((HashSet)localObject).iterator();
            if (((Iterator)localObject).hasNext())
            {
              str1 = (String)((Iterator)localObject).next();
              str2 = "weixin://fts/emoji?path=" + paramAnonymousfn.eHU.path;
              localJSONObject = new JSONObject();
            }
          }
          try
          {
            localJSONObject.put("id", str1);
            localJSONObject.put("src", str2);
            localJSONArray.put(localJSONObject);
            continue;
            paramAnonymousfn = finally;
            throw paramAnonymousfn;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(i).aC(0, localJSONArray.toString());
            d.this.rCa.remove(paramAnonymousfn.eHT.eDW);
            d.this.rCd.remove(paramAnonymousfn.eHT.eDW);
            GMTrace.o(15643344633856L, 116552);
            return false;
          }
          catch (JSONException localJSONException)
          {
            for (;;) {}
          }
        }
      }
    };
    this.ppA = new c()
    {
      private boolean a(pp paramAnonymouspp)
      {
        GMTrace.i(15643747287040L, 116555);
        if (((paramAnonymouspp instanceof pp)) && (paramAnonymouspp.eUr.eCx == 2))
        {
          w.i("MicroMsg.FTS.FTSWebViewImageLogic", "Download callback %s", new Object[] { paramAnonymouspp.eUr.mediaId });
          if (!d.this.rBZ.containsKey(paramAnonymouspp.eUr.mediaId)) {}
        }
        for (;;)
        {
          int i;
          JSONArray localJSONArray;
          String str1;
          String str2;
          JSONObject localJSONObject;
          synchronized (d.this.rBZ)
          {
            i = ((Integer)d.this.rCc.get(paramAnonymouspp.eUr.mediaId)).intValue();
            Object localObject = (HashSet)d.this.rBZ.get(paramAnonymouspp.eUr.mediaId);
            localJSONArray = new JSONArray();
            localObject = ((HashSet)localObject).iterator();
            if (((Iterator)localObject).hasNext())
            {
              str1 = (String)((Iterator)localObject).next();
              str2 = "weixin://fts/sns?path=" + paramAnonymouspp.eUr.path;
              localJSONObject = new JSONObject();
            }
          }
          try
          {
            localJSONObject.put("id", str1);
            localJSONObject.put("src", str2);
            localJSONArray.put(localJSONObject);
            continue;
            paramAnonymouspp = finally;
            throw paramAnonymouspp;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(i).aC(0, localJSONArray.toString());
            d.this.rBZ.remove(paramAnonymouspp.eUr.mediaId);
            d.this.rCc.remove(paramAnonymouspp.eUr.mediaId);
            GMTrace.o(15643747287040L, 116555);
            return false;
          }
          catch (JSONException localJSONException)
          {
            for (;;) {}
          }
        }
      }
    };
    this.rBY = new HashMap();
    this.rBZ = new HashMap();
    this.rCb = new HashMap();
    this.rCc = new HashMap();
    this.rCa = new HashMap();
    this.rCd = new HashMap();
    this.ppA.bPu();
    this.rCe.bPu();
    n.Di().c(this);
    GMTrace.o(15642539327488L, 116546);
  }
  
  public final boolean O(Map<String, Object> paramMap)
  {
    GMTrace.i(15642673545216L, 116547);
    w.i("MicroMsg.FTS.FTSWebViewImageLogic", "getSearchAvatarList");
    Object localObject1 = f.o(paramMap, "data");
    int j = bg.m(paramMap.get("webview_instance_id"), -1);
    for (;;)
    {
      JSONArray localJSONArray2;
      int i;
      String str1;
      String str2;
      try
      {
        JSONArray localJSONArray1 = new JSONArray((String)localObject1);
        localJSONArray2 = new JSONArray();
        localObject1 = null;
        i = 0;
        if (i >= localJSONArray1.length()) {
          break label442;
        }
        paramMap = localJSONArray1.getJSONObject(i);
        str1 = paramMap.optString("id");
        str2 = paramMap.optString("userName");
        int k = paramMap.optInt("type");
        localObject2 = paramMap.optString("imageUrl");
        str3 = paramMap.optString("bigImageUrl");
        paramMap = (Map<String, Object>)localObject2;
        switch (k)
        {
        case 1: 
          n.Dh();
          paramMap = com.tencent.mm.ac.d.t(str2, false);
          if (!FileOp.aZ(paramMap)) {
            break;
          }
          w.i("MicroMsg.FTS.FTSWebViewImageLogic", "avatar file exist %s", new Object[] { paramMap });
          paramMap = "weixin://fts/avatar?path=" + paramMap;
        case 4: 
        case 64: 
          localObject1 = paramMap;
          if (paramMap == null) {
            break label469;
          }
          localObject1 = new JSONObject();
          ((JSONObject)localObject1).put("id", str1);
          ((JSONObject)localObject1).put("src", paramMap);
          localJSONArray2.put(localObject1);
          localObject1 = null;
        }
      }
      catch (JSONException paramMap)
      {
        String str3;
        w.printErrStackTrace("MicroMsg.FTS.FTSWebViewImageLogic", paramMap, "", new Object[0]);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(j).aC(-1, "");
        GMTrace.o(15642673545216L, 116547);
        return false;
      }
      paramMap = new com.tencent.mm.ac.h();
      paramMap.username = str2;
      paramMap.gsU = str3;
      paramMap.gsT = ((String)localObject2);
      paramMap.eQl = -1;
      paramMap.fiZ = 3;
      paramMap.bi(true);
      n.Di().a(paramMap);
      continue;
      w.i("MicroMsg.FTS.FTSWebViewImageLogic", "avatar file not exist %s", new Object[] { paramMap });
      this.rCb.put(str2, Integer.valueOf(j));
      Object localObject2 = (HashSet)this.rBY.get(str2);
      paramMap = (Map<String, Object>)localObject2;
      if (localObject2 == null) {
        paramMap = new HashSet();
      }
      paramMap.add(str1);
      this.rBY.put(str2, paramMap);
      a.b.bKI().bw(str2);
      paramMap = (Map<String, Object>)localObject1;
      continue;
      label442:
      if (localJSONArray2.length() > 0)
      {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(j).aC(0, localJSONArray2.toString());
        continue;
        continue;
        label469:
        i += 1;
      }
    }
  }
  
  public final boolean P(Map<String, Object> paramMap)
  {
    GMTrace.i(15642807762944L, 116548);
    w.i("MicroMsg.FTS.FTSWebViewImageLogic", "getSearchSnsImageList");
    Object localObject1 = f.o(paramMap, "data");
    int j = bg.m(paramMap.get("webview_instance_id"), -1);
    for (;;)
    {
      JSONArray localJSONArray2;
      int i;
      try
      {
        JSONArray localJSONArray1 = new JSONArray((String)localObject1);
        localJSONArray2 = new JSONArray();
        paramMap = null;
        i = 0;
        if (i < localJSONArray1.length())
        {
          localObject1 = localJSONArray1.getJSONObject(i);
          String str = ((JSONObject)localObject1).getString("id");
          Object localObject2 = ((JSONObject)localObject1).getString("objectXmlDesc");
          int k = ((JSONObject)localObject1).getInt("index");
          localObject1 = ((m)com.tencent.mm.kernel.h.h(m.class)).lz((String)localObject2);
          if (((biz)localObject1).uUc.ueW.size() <= k) {
            break label490;
          }
          localObject2 = (anu)((biz)localObject1).uUc.ueW.get(k);
          localObject1 = new pp();
          ((pp)localObject1).eUr.eCx = 3;
          ((pp)localObject1).eUr.mediaId = ((anu)localObject2).mmR;
          a.vgX.m((b)localObject1);
          w.i("MicroMsg.FTS.FTSWebViewImageLogic", "generatePath: %s", new Object[] { ((pp)localObject1).eUr.path });
          if (FileOp.aZ(((pp)localObject1).eUr.path))
          {
            localObject1 = "weixin://fts/sns?path=" + ((pp)localObject1).eUr.path;
            paramMap = (Map<String, Object>)localObject1;
            if (localObject1 == null) {
              break label490;
            }
            paramMap = new JSONObject();
            paramMap.put("id", str);
            paramMap.put("src", localObject1);
            localJSONArray2.put(paramMap);
            paramMap = null;
            break label490;
          }
          synchronized (this.rBZ)
          {
            if (this.rBZ.containsKey(((anu)localObject2).mmR))
            {
              localObject1 = (HashSet)this.rBZ.get(((anu)localObject2).mmR);
              ((HashSet)localObject1).add(str);
              this.rBZ.put(((anu)localObject2).mmR, localObject1);
              this.rCc.put(((anu)localObject2).mmR, Integer.valueOf(j));
              localObject1 = new pp();
              ((pp)localObject1).eUr.eCx = 1;
              ((pp)localObject1).eUr.eUs = ((anu)localObject2);
              a.vgX.m((b)localObject1);
              localObject1 = paramMap;
              continue;
            }
            localObject1 = new HashSet();
          }
        }
        if (localJSONArray2.length() <= 0) {
          continue;
        }
      }
      catch (JSONException paramMap)
      {
        GMTrace.o(15642807762944L, 116548);
        return false;
      }
      com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(j).aC(0, localJSONArray2.toString());
      continue;
      label490:
      i += 1;
    }
  }
  
  public final boolean Q(Map<String, Object> paramMap)
  {
    GMTrace.i(15642941980672L, 116549);
    w.i("MicroMsg.FTS.FTSWebViewImageLogic", "getSearchImageList");
    i = f.c(paramMap, "requestType", 0);
    Object localObject1 = f.o(paramMap, "data");
    int j = bg.m(paramMap.get("webview_instance_id"), -1);
    boolean bool = am.isWifi(ab.getContext());
    switch (i)
    {
    }
    for (;;)
    {
      try
      {
        paramMap = new JSONArray((String)localObject1);
        localObject1 = new JSONArray();
        i = 0;
        if (i >= paramMap.length()) {
          continue;
        }
        localObject4 = paramMap.getJSONObject(i);
        localObject2 = new JSONObject();
        localObject3 = ((JSONObject)localObject4).getString("id");
        localObject4 = ((JSONObject)localObject4).getString("imageUrl");
        ((JSONObject)localObject2).put("id", localObject3);
        ((JSONObject)localObject2).put("src", localObject4);
        ((JSONArray)localObject1).put(localObject2);
        i += 1;
        continue;
      }
      catch (JSONException paramMap)
      {
        Object localObject4;
        Object localObject2;
        Object localObject3;
        int k;
        Object localObject5;
        continue;
        i += 1;
        continue;
      }
      try
      {
        localObject2 = new JSONArray((String)localObject1);
        localObject3 = new JSONArray();
        paramMap = null;
        i = 0;
        if (i < ((JSONArray)localObject2).length())
        {
          localObject1 = ((JSONArray)localObject2).getJSONObject(i);
          k = ((JSONObject)localObject1).optInt("emojiType");
          localObject4 = ((JSONObject)localObject1).optString("id");
          if (k == 2)
          {
            localObject5 = new fn();
            ((fn)localObject5).eHT.eCx = 3;
            ((fn)localObject5).eHT.eDW = ((JSONObject)localObject1).optString("md5");
            ((fn)localObject5).eHT.eHV = ((JSONObject)localObject1).optString("designerId");
            ((fn)localObject5).eHT.aeskey = ((JSONObject)localObject1).optString("aesKey");
            ((fn)localObject5).eHT.eHW = ((JSONObject)localObject1).optString("encryptUrl");
            ((fn)localObject5).eHT.eEa = ((JSONObject)localObject1).optString("productID");
            ((fn)localObject5).eHT.name = ((JSONObject)localObject1).optString("express");
            ((fn)localObject5).eHT.thumbUrl = ((JSONObject)localObject1).optString("imageUrl");
            a.vgX.m((b)localObject5);
            if (FileOp.aZ(((fn)localObject5).eHU.path))
            {
              localObject1 = "weixin://fts/emoji?path=" + ((fn)localObject5).eHU.path;
              w.i("MicroMsg.FTS.FTSWebViewImageLogic", "path=%s", new Object[] { ((fn)localObject5).eHU.path });
              paramMap = (Map<String, Object>)localObject1;
              if (localObject1 == null) {
                continue;
              }
              paramMap = new JSONObject();
              paramMap.put("id", localObject4);
              paramMap.put("src", localObject1);
              ((JSONArray)localObject3).put(paramMap);
              paramMap = null;
              continue;
            }
            if (bool)
            {
              synchronized (this.rCa)
              {
                if (this.rCa.containsKey(((fn)localObject5).eHT.eDW))
                {
                  localObject1 = (HashSet)this.rCa.get(((fn)localObject5).eHT.eDW);
                  ((HashSet)localObject1).add(localObject4);
                  this.rCa.put(((fn)localObject5).eHT.eDW, localObject1);
                  this.rCd.put(((fn)localObject5).eHT.eDW, Integer.valueOf(j));
                  ((fn)localObject5).eHT.eCx = 1;
                  a.vgX.m((b)localObject5);
                  localObject1 = paramMap;
                  continue;
                }
                localObject1 = new HashSet();
              }
              GMTrace.o(15642941980672L, 116549);
            }
          }
        }
      }
      catch (Exception paramMap) {}
    }
    for (;;)
    {
      return false;
      localObject1 = ((JSONObject)localObject1).optString("imageUrl");
      break;
      if (k == 4)
      {
        localObject5 = new JSONObject();
        ((JSONObject)localObject5).put("id", localObject4);
        if (bool) {
          ((JSONObject)localObject5).put("src", ((JSONObject)localObject1).optString("raw"));
        }
        for (;;)
        {
          ((JSONArray)localObject3).put(localObject5);
          break;
          ((JSONObject)localObject5).put("src", ((JSONObject)localObject1).optString("imageUrl"));
        }
      }
      localObject5 = new JSONObject();
      ((JSONObject)localObject5).put("id", localObject4);
      ((JSONObject)localObject5).put("src", ((JSONObject)localObject1).optString("imageUrl"));
      ((JSONArray)localObject3).put(localObject5);
      break label818;
      if (((JSONArray)localObject3).length() > 0)
      {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(j).aC(0, ((JSONArray)localObject3).toString());
        continue;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(j).aC(0, ((JSONArray)localObject1).toString());
      }
    }
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(15643076198400L, 116550);
    if ((paraml == null) || (paraml.obj == null))
    {
      GMTrace.o(15643076198400L, 116550);
      return;
    }
    for (;;)
    {
      int i;
      String str1;
      Object localObject2;
      String str2;
      synchronized (this.rBY)
      {
        w.i("MicroMsg.FTS.FTSWebViewImageLogic", "event %s，eventData %s", new Object[] { paramString, paraml.toString() });
        paramString = paraml.obj.toString();
        if ((this.rBY.containsKey(paramString)) && (this.rCb.containsKey(paramString)))
        {
          w.i("MicroMsg.FTS.FTSWebViewImageLogic", "notify avatar changed %s", new Object[] { paramString });
          i = ((Integer)this.rCb.get(paramString)).intValue();
          Object localObject1 = (HashSet)this.rBY.get(paramString);
          paraml = new JSONArray();
          localObject1 = ((HashSet)localObject1).iterator();
          if (((Iterator)localObject1).hasNext())
          {
            str1 = (String)((Iterator)localObject1).next();
            n.Dh();
            localObject2 = com.tencent.mm.ac.d.t(paramString, false);
            str2 = "weixin://fts/avatar?path=" + (String)localObject2;
            localObject2 = new JSONObject();
          }
        }
      }
      try
      {
        ((JSONObject)localObject2).put("id", str1);
        ((JSONObject)localObject2).put("src", str2);
        paraml.put(localObject2);
        continue;
        paramString = finally;
        throw paramString;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(i).aC(0, paraml.toString());
        this.rBY.remove(paramString);
        this.rCb.remove(paramString);
        GMTrace.o(15643076198400L, 116550);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */