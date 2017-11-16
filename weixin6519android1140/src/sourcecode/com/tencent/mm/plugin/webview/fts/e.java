package com.tencent.mm.plugin.webview.fts;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.az.l;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.g.a.jn.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.plugin.webview.fts.a.c.a;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.ana;
import com.tencent.mm.protocal.c.anb;
import com.tencent.mm.protocal.c.and;
import com.tencent.mm.protocal.c.apq;
import com.tencent.mm.protocal.c.apr;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.ayr;
import com.tencent.mm.protocal.c.bau;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.brc;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  implements com.tencent.mm.ad.e
{
  public com.tencent.mm.sdk.b.c ian;
  private long ipr;
  public com.tencent.mm.plugin.fts.a.a.a lwZ;
  public com.tencent.mm.plugin.fts.a.j nLu;
  public Set<Integer> rCg;
  public com.tencent.mm.plugin.fts.a.a.a rCh;
  public com.tencent.mm.plugin.fts.a.j rCi;
  private HashMap<String, b> rCj;
  public k rCk;
  private com.tencent.mm.az.n rCl;
  private Map<Integer, f> rCm;
  public e rCn;
  public List<apv> rCo;
  private com.tencent.mm.plugin.webview.fts.a.c rCp;
  public com.tencent.mm.plugin.webview.fts.a.d rCq;
  
  public e()
  {
    GMTrace.i(12471377068032L, 92919);
    this.rCi = new com.tencent.mm.plugin.fts.a.j()
    {
      public final void a(final com.tencent.mm.plugin.fts.a.a.g paramAnonymousg)
      {
        GMTrace.i(20497060331520L, 152715);
        w.i("MicroMsg.FTS.FTSWebViewLogic", "historySearchResultListener ret %d, webViewId %s", new Object[] { Integer.valueOf(paramAnonymousg.aGY), e.this.lwZ.lwD });
        if (paramAnonymousg.aGY == 0)
        {
          final ArrayList localArrayList = new ArrayList();
          Iterator localIterator = paramAnonymousg.lxb.iterator();
          while (localIterator.hasNext()) {
            localArrayList.add(((i)localIterator.next()).content);
          }
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20495718154240L, 152705);
              JSONObject localJSONObject1;
              JSONArray localJSONArray;
              if ((e.this.lwZ != null) && (e.this.lwZ.lwD != null))
              {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(((Integer)e.this.lwZ.lwD).intValue());
                localObject2 = localArrayList;
                try
                {
                  localJSONObject1 = new JSONObject();
                  localJSONObject1.put("ret", 0);
                  localObject1 = new JSONArray();
                  localJSONArray = new JSONArray();
                  localObject2 = ((ArrayList)localObject2).iterator();
                  while (((Iterator)localObject2).hasNext())
                  {
                    String str = (String)((Iterator)localObject2).next();
                    JSONObject localJSONObject2 = new JSONObject();
                    localJSONObject2.put("word", str);
                    localJSONObject2.put("id", System.currentTimeMillis());
                    localJSONObject2.put("timeStamp", System.currentTimeMillis());
                    localJSONArray.put(localJSONObject2);
                  }
                  GMTrace.o(20495718154240L, 152705);
                }
                catch (JSONException localJSONException)
                {
                  w.printErrStackTrace("MicroMsg.MsgHandler", localJSONException, "", new Object[0]);
                }
              }
              else
              {
                return;
              }
              Object localObject2 = new JSONObject();
              ((JSONObject)localObject2).put("items", localJSONArray);
              ((JSONArray)localObject1).put(localObject2);
              localJSONObject1.put("data", localObject1);
              Object localObject1 = new Bundle();
              ((Bundle)localObject1).putString("data", localJSONObject1.toString());
              try
              {
                if (localJSONException.rEM != null) {
                  localJSONException.rEM.m(143, (Bundle)localObject1);
                }
                GMTrace.o(20495718154240L, 152705);
                return;
              }
              catch (RemoteException localRemoteException)
              {
                w.w("MicroMsg.MsgHandler", "onGetSearchHistory exception" + localRemoteException.getMessage());
                GMTrace.o(20495718154240L, 152705);
              }
            }
          });
        }
        GMTrace.o(20497060331520L, 152715);
      }
    };
    this.rCm = new HashMap();
    this.rCn = new e();
    this.ian = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(jn paramAnonymousjn)
      {
        GMTrace.i(20495315501056L, 152702);
        apv localapv = paramAnonymousjn.eNp.eNl;
        if ((localapv != null) && (com.tencent.mm.at.b.d(localapv))) {
          switch (paramAnonymousjn.eNp.action)
          {
          }
        }
        for (;;)
        {
          GMTrace.o(20495315501056L, 152702);
          return false;
          paramAnonymousjn = e.this.rCg.iterator();
          while (paramAnonymousjn.hasNext()) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(((Integer)paramAnonymousjn.next()).intValue()).cu(localapv.ucY, 0);
          }
          paramAnonymousjn = e.this.rCg.iterator();
          while (paramAnonymousjn.hasNext()) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(((Integer)paramAnonymousjn.next()).intValue()).cu(localapv.ucY, 1);
          }
        }
      }
    };
    this.nLu = new com.tencent.mm.plugin.fts.a.j()
    {
      public final void a(final com.tencent.mm.plugin.fts.a.a.g paramAnonymousg)
      {
        GMTrace.i(20487665090560L, 152645);
        if (paramAnonymousg.aGY == 0)
        {
          final ArrayList localArrayList = new ArrayList();
          Iterator localIterator = paramAnonymousg.lxb.iterator();
          while (localIterator.hasNext()) {
            localArrayList.add(((i)localIterator.next()).content);
          }
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20496926113792L, 152714);
              if ((e.this.lwZ != null) && (e.this.lwZ.lwD != null))
              {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(((Integer)e.this.lwZ.lwD).intValue());
                String str = paramAnonymousg.luZ.eQb;
                ArrayList localArrayList = localArrayList;
                w.i("MicroMsg.MsgHandler", "onSearchHistoryCallback: %s", new Object[] { localArrayList.toString() });
                Bundle localBundle = new Bundle();
                localBundle.putString("query", str);
                localBundle.putStringArrayList("result", localArrayList);
                try
                {
                  if (localg.rEM != null) {
                    localg.rEM.m(126, localBundle);
                  }
                  GMTrace.o(20496926113792L, 152714);
                  return;
                }
                catch (RemoteException localRemoteException)
                {
                  w.w("MicroMsg.MsgHandler", "onSearchHistoryCallback exception" + localRemoteException.getMessage());
                }
              }
              GMTrace.o(20496926113792L, 152714);
            }
          });
        }
        GMTrace.o(20487665090560L, 152645);
      }
    };
    w.i("MicroMsg.FTS.FTSWebViewLogic", "create FTSWebViewLogic");
    this.rCj = new HashMap();
    this.rCg = Collections.synchronizedSet(new HashSet());
    com.tencent.mm.sdk.b.a.vgX.b(this.ian);
    GMTrace.o(12471377068032L, 92919);
  }
  
  private c V(Map<String, Object> paramMap)
  {
    GMTrace.i(12472987680768L, 92931);
    c localc = new c();
    localc.username = f.o(paramMap, "userName");
    localc.eCQ = f.o(paramMap, "nickName");
    localc.nLE = f.o(paramMap, "headHDImgUrl");
    localc.rCC = f.c(paramMap, "verifyFlag", 0);
    localc.signature = f.o(paramMap, "signature");
    localc.scene = f.c(paramMap, "scene", 0);
    localc.gRn = f.c(paramMap, "sceneActionType", 1);
    localc.nMF = new oo();
    localc.nMF.gCL = f.c(paramMap, "brandFlag", 0);
    localc.nMF.gCO = f.o(paramMap, "iconUrl");
    localc.nMF.gCN = f.o(paramMap, "brandInfo");
    localc.nMF.gCM = f.o(paramMap, "externalInfo");
    localc.hSv = f.o(paramMap, "searchId");
    localc.eQb = f.o(paramMap, "query");
    localc.position = f.c(paramMap, "position", 0);
    localc.rCD = f.q(paramMap, "isCurrentDetailPage");
    localc.rCE = f.o(paramMap, "extraParams");
    GMTrace.o(12472987680768L, 92931);
    return localc;
  }
  
  private d W(Map<String, Object> paramMap)
  {
    int i = 3;
    GMTrace.i(19467207704576L, 145042);
    d locald = new d();
    locald.username = f.o(paramMap, "userName");
    locald.eCQ = f.o(paramMap, "nickName");
    locald.fsF = f.o(paramMap, "alias");
    locald.signature = f.o(paramMap, "signature");
    locald.fja = f.c(paramMap, "sex", 0);
    locald.country = f.o(paramMap, "country");
    locald.fjl = f.o(paramMap, "city");
    locald.fjk = f.o(paramMap, "province");
    locald.rCF = f.c(paramMap, "snsFlag", 0);
    String str = f.o(paramMap, "query");
    if (!bg.nm(str))
    {
      if (Character.isDigit(str.charAt(0))) {
        i = 15;
      }
      locald.scene = i;
      if (locald.scene == 15)
      {
        if (!"mobile".equals(f.o(paramMap, "matchType"))) {
          break label193;
        }
        locald.eQb = str;
      }
    }
    for (;;)
    {
      GMTrace.o(19467207704576L, 145042);
      return locald;
      label193:
      locald.scene = 1;
      continue;
      locald.scene = 3;
    }
  }
  
  public static boolean X(Map<String, Object> paramMap)
  {
    GMTrace.i(12473390333952L, 92934);
    w.i("MicroMsg.FTS.FTSWebViewLogic", "setSearchInputWord %s", new Object[] { paramMap });
    String str1 = f.o(paramMap, "word");
    boolean bool = f.q(paramMap, "isInputChange");
    String str2 = f.o(paramMap, "custom");
    String str3 = f.o(paramMap, "tagList");
    paramMap = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(bg.m(paramMap.get("webview_instance_id"), -1));
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_new_query", str1);
    localBundle.putString("fts_key_custom_query", str2);
    localBundle.putBoolean("fts_key_need_keyboard", bool);
    localBundle.putString("fts_key_tag_list", str3);
    try
    {
      if (paramMap.rEM != null) {
        paramMap.rEM.m(122, localBundle);
      }
      GMTrace.o(12473390333952L, 92934);
      return false;
    }
    catch (RemoteException paramMap)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "onFTSSearchQueryChange exception" + paramMap.getMessage());
      }
    }
  }
  
  public static void a(com.tencent.mm.plugin.webview.fts.a.d paramd, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(19467476140032L, 145044);
    paramd = paramd.dF(paramInt1, paramInt2);
    com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(paramInt3);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", paramd.toString());
    try
    {
      if (localg.rEM != null) {
        localg.rEM.m(137, localBundle);
      }
      GMTrace.o(19467476140032L, 145044);
      return;
    }
    catch (RemoteException paramd)
    {
      w.w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + paramd.getMessage());
      GMTrace.o(19467476140032L, 145044);
    }
  }
  
  private static void a(c paramc, boolean paramBoolean)
  {
    GMTrace.i(12472182374400L, 92925);
    int i;
    if (paramc.gRn == 2) {
      i = 89;
    }
    for (;;)
    {
      com.tencent.mm.az.g.kJ(paramc.username);
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", paramc.username);
      localIntent.putExtra("Contact_Nick", paramc.eCQ);
      localIntent.putExtra("Contact_BrandIconURL", paramc.nLE);
      localIntent.putExtra("Contact_Signature", paramc.signature);
      localIntent.putExtra("Contact_VUser_Info_Flag", paramc.rCC);
      localIntent.putExtra("Contact_Scene", i);
      if (paramc.nMF != null) {}
      try
      {
        localIntent.putExtra("Contact_customInfo", paramc.nMF.toByteArray());
        Bundle localBundle = new Bundle();
        localBundle.putString("Contact_Ext_Args_Search_Id", paramc.hSv);
        localBundle.putString("Contact_Ext_Args_Query_String", paramc.eQb);
        localBundle.putInt("Contact_Scene", i);
        localBundle.putInt("Contact_Ext_Args_Index", paramc.position);
        localBundle.putString("Contact_Ext_Extra_Params", paramc.rCE);
        localIntent.putExtra("Contact_Ext_Args", localBundle);
        com.tencent.mm.bj.d.b(ab.getContext(), "profile", ".ui.ContactInfoUI", localIntent);
        GMTrace.o(12472182374400L, 92925);
        return;
        if (paramBoolean)
        {
          i = 85;
          continue;
        }
        if ((paramc.scene == 3) || (paramc.scene == 16))
        {
          if (paramc.rCD)
          {
            i = 88;
            continue;
          }
          i = 87;
          continue;
        }
        i = 39;
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
  }
  
  private static void a(d paramd)
  {
    GMTrace.i(19467073486848L, 145041);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramd.username);
    localIntent.putExtra("Contact_Nick", paramd.eCQ);
    localIntent.putExtra("Contact_Alias", paramd.fsF);
    localIntent.putExtra("Contact_Sex", paramd.fja);
    localIntent.putExtra("Contact_Scene", paramd.scene);
    localIntent.putExtra("Contact_KHideExpose", true);
    localIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.ai(paramd.country, paramd.fjk, paramd.fjl));
    localIntent.putExtra("Contact_Signature", paramd.signature);
    localIntent.putExtra("Contact_KSnsIFlag", paramd.rCF);
    localIntent.putExtra("Contact_full_Mobile_MD5", paramd.eQb);
    com.tencent.mm.bj.d.b(ab.getContext(), "profile", ".ui.ContactInfoUI", localIntent);
    GMTrace.o(19467073486848L, 145041);
  }
  
  private static void a(String paramString1, Bundle paramBundle, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(20454379094016L, 152397);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("convertActivityFromTranslucent", false);
    localIntent.putExtra("customize_status_bar_color", paramInt1);
    localIntent.putExtra("status_bar_style", paramString2);
    if (!bg.nm(paramString3))
    {
      localIntent.putExtra("prePublishId", paramString3);
      localIntent.putExtra("KPublisherId", paramString3);
    }
    for (;;)
    {
      if (paramInt2 > 0) {
        localIntent.putExtra("pay_channel", paramInt2);
      }
      com.tencent.mm.bj.d.b(ab.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
      GMTrace.o(20454379094016L, 152397);
      return;
      if ((paramBundle != null) && (!bg.nm(paramString1)))
      {
        paramString1 = paramBundle.getString("publishIdPrefix", "gs") + "_" + com.tencent.mm.a.g.n(paramString1.getBytes());
        localIntent.putExtra("prePublishId", paramString1);
        localIntent.putExtra("KPublisherId", paramString1);
      }
    }
  }
  
  public static int b(Map<String, Object> paramMap1, Map<String, Object> paramMap2)
  {
    GMTrace.i(12472316592128L, 92926);
    paramMap1 = f.o(paramMap1, "data");
    for (;;)
    {
      try
      {
        JSONArray localJSONArray1 = new JSONArray(paramMap1);
        localJSONArray2 = new JSONArray();
        i = 0;
        if (i >= localJSONArray1.length()) {
          continue;
        }
        localObject = localJSONArray1.getJSONObject(i);
        if (!((JSONObject)localObject).has("id")) {
          continue;
        }
        paramMap1 = ((JSONObject)localObject).getString("id");
      }
      catch (JSONException paramMap1)
      {
        JSONArray localJSONArray2;
        int i;
        String str;
        JSONObject localJSONObject;
        w.printErrStackTrace("MicroMsg.FTS.FTSWebViewLogic", paramMap1, "", new Object[0]);
        continue;
        paramMap1 = "";
        continue;
        Object localObject = "";
        continue;
      }
      if (!((JSONObject)localObject).has("userName")) {
        continue;
      }
      localObject = ((JSONObject)localObject).getString("userName");
      str = com.tencent.mm.y.r.fs((String)localObject);
      localJSONObject = new JSONObject();
      localJSONObject.put("id", paramMap1);
      localJSONObject.put("userName", localObject);
      localJSONObject.put("displayName", str);
      localJSONArray2.put(localJSONObject);
      i += 1;
    }
    paramMap2.put("ret", Integer.valueOf(0));
    paramMap2.put("data", localJSONArray2.toString());
    GMTrace.o(12472316592128L, 92926);
    return 0;
  }
  
  private static void d(String paramString, Bundle paramBundle)
  {
    GMTrace.i(12472048156672L, 92924);
    a(paramString, paramBundle, 0, "", "", 0);
    GMTrace.o(12472048156672L, 92924);
  }
  
  public static Bundle n(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(16231352500224L, 120933);
    Bundle localBundle = new Bundle();
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16231352500224L, 120933);
      return localBundle;
      try
      {
        paramBundle = paramBundle.getString("key");
        localBundle.putString("result", l.kM(paramBundle).toString());
        if (!"educationTab".equals(paramBundle)) {
          continue;
        }
        paramBundle = l.kM("discoverSearchGuide");
        if (paramBundle.optJSONArray("items").length() <= 0) {
          continue;
        }
        localBundle.putString("result_1", paramBundle.toString());
      }
      catch (Exception paramBundle) {}
      continue;
      paramBundle = com.tencent.mm.az.e.a(paramBundle.getInt("scene"), paramBundle.getBoolean("isHomePage"), paramBundle.getInt("type"));
      localBundle.putString("type", (String)paramBundle.get("type"));
      localBundle.putString("isMostSearchBiz", (String)paramBundle.get("isMostSearchBiz"));
      localBundle.putString("isLocalSug", (String)paramBundle.get("isLocalSug"));
      localBundle.putString("isSug", (String)paramBundle.get("isSug"));
      localBundle.putString("scene", (String)paramBundle.get("scene"));
      continue;
      try
      {
        localBundle.putString("result", l.kN(paramBundle.getString("key")));
      }
      catch (Exception paramBundle) {}
    }
  }
  
  static String n(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(18175764725760L, 135420);
    String str1 = "FTS_BizCacheObj" + paramInt1 + "-" + paramInt2;
    String str2 = v.eq(ab.getContext());
    str2 = str1 + "-" + str2;
    if (paramBoolean)
    {
      GMTrace.o(18175764725760L, 135420);
      return str2;
    }
    at.AR();
    if (new File(com.tencent.mm.y.c.yZ(), str2).exists())
    {
      GMTrace.o(18175764725760L, 135420);
      return str2;
    }
    GMTrace.o(18175764725760L, 135420);
    return str1;
  }
  
  private static void p(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(19466939269120L, 145040);
    biz localbiz = ((m)com.tencent.mm.kernel.h.h(m.class)).lz(paramString1);
    paramString1 = new Intent();
    paramString1.putExtra("INTENT_TALKER", paramString2);
    paramString1.putExtra("INTENT_SNSID", new BigInteger(localbiz.mmR).longValue());
    paramString1.putExtra("SNS_FROM_MUSIC_ITEM", paramBoolean);
    try
    {
      paramString1.putExtra("INTENT_SNS_TIMELINEOBJECT", localbiz.toByteArray());
      com.tencent.mm.bj.d.b(ab.getContext(), "sns", ".ui.SnsCommentDetailUI", paramString1);
      GMTrace.o(19466939269120L, 145040);
      return;
    }
    catch (IOException paramString2)
    {
      for (;;) {}
    }
  }
  
  public final boolean R(Map<String, Object> paramMap)
  {
    GMTrace.i(15644149940224L, 116558);
    switch (f.c(paramMap, "action", 0))
    {
    }
    for (;;)
    {
      GMTrace.o(15644149940224L, 116558);
      return false;
      if (com.tencent.mm.az.f.gRB == null) {
        com.tencent.mm.az.f.Ky();
      }
      com.tencent.mm.az.f.gRB.jhd.clear();
      paramMap = ab.getContext().getSharedPreferences("fts_history_search_sp", 0);
      Object localObject1;
      Object localObject2;
      try
      {
        localObject1 = com.tencent.mm.az.f.Kz();
        localObject2 = Base64.encodeToString(com.tencent.mm.az.f.gRB.toByteArray(), 0);
        paramMap.edit().putString((String)localObject1, (String)localObject2).apply();
        w.i("MicroMsg.FTS.FTSHistorySearchLogic", "addHistory pbListString %s", new Object[] { localObject2 });
      }
      catch (IOException paramMap) {}
      continue;
      int i = f.c(paramMap, "type", 0);
      int j = f.c(paramMap, "scene", 0);
      if (System.currentTimeMillis() - this.ipr > 1000L)
      {
        this.ipr = System.currentTimeMillis();
        if (!com.tencent.mm.az.e.Kr())
        {
          w.e("MicroMsg.FTS.FTSWebViewLogic", "fts h5 template not avail");
        }
        else
        {
          com.tencent.mm.az.k.b(i, j, l.kN("searchID"));
          paramMap = com.tencent.mm.az.e.Kv();
          paramMap.putExtra("ftsneedkeyboard", true);
          paramMap.putExtra("ftsbizscene", j);
          paramMap.putExtra("ftsType", i);
          paramMap.putExtra("rawUrl", com.tencent.mm.az.e.n(com.tencent.mm.az.e.a(j, true, i)));
          paramMap.putExtra("key_load_js_without_delay", true);
          com.tencent.mm.bj.d.b(ab.getContext(), "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", paramMap);
          continue;
          localObject1 = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(f.c(paramMap, "webview_instance_id", -1));
          i = f.c(paramMap, "scene", 0);
          paramMap = f.o(paramMap, "query");
          if ((i != 20) || (bg.nm(paramMap)))
          {
            w.w("MicroMsg.MsgHandler", "doSearchHotWordOperation warning, scene=%d, query=%s", new Object[] { Integer.valueOf(i), paramMap });
          }
          else
          {
            localObject2 = new Bundle();
            ((Bundle)localObject2).putString("fts_key_new_query", paramMap);
            try
            {
              if (((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject1).rEM != null) {
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject1).rEM.m(136, (Bundle)localObject2);
              }
            }
            catch (Exception paramMap)
            {
              w.w("MicroMsg.MsgHandler", "doSearchHotWordOperation exception" + paramMap.getMessage());
            }
          }
        }
      }
    }
  }
  
  public final boolean S(Map<String, Object> paramMap)
  {
    GMTrace.i(12471511285760L, 92920);
    w.i("MicroMsg.FTS.FTSWebViewLogic", "getTeachSearchData: %s", new Object[] { paramMap });
    int i = f.c(paramMap, "scene", 0);
    int k = f.c(paramMap, "type", 0);
    int m = f.c(paramMap, "requestType", 0);
    int j = bg.m(paramMap.get("webview_instance_id"), -1);
    boolean bool = f.q(paramMap, "ignoreCache");
    Object localObject1;
    if (m == 0)
    {
      bBJ();
      paramMap = n(i, k, true);
      if (this.rCj.get(paramMap) == null)
      {
        localObject1 = new b();
        ((b)localObject1).dE(i, k);
        this.rCj.put(paramMap, localObject1);
      }
      paramMap = (b)this.rCj.get(paramMap);
      if ((!bg.nm(paramMap.eJI)) && (!bool))
      {
        w.i("MicroMsg.FTS.FTSWebViewLogic", "getTeachSearchData, webviewID = %d", new Object[] { Integer.valueOf(j) });
        if ((paramMap.scene != 20) || (paramMap.type != 0) || ((!paramMap.gTo) && (paramMap.isAvailable()))) {
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(j).d(m, paramMap.eJI, 1);
        }
      }
      if ((paramMap.isAvailable()) && (!bool))
      {
        w.i("MicroMsg.FTS.FTSWebViewLogic", "hit the cache: %d %d %d %d", new Object[] { Integer.valueOf(paramMap.scene), Long.valueOf(paramMap.rCz), Long.valueOf(paramMap.rCA), Integer.valueOf(paramMap.type) });
        if ((paramMap.scene == 20) && (paramMap.type == 0)) {
          com.tencent.mm.az.k.a(paramMap.scene, 0, paramMap.gRm, paramMap.type, 2, paramMap.bBL(), 1);
        }
        for (;;)
        {
          GMTrace.o(12471511285760L, 92920);
          return false;
          com.tencent.mm.az.k.a(paramMap.scene, 0, paramMap.gRm, paramMap.type, 1, "", 0);
        }
      }
      at.wS().a(1048, this);
      w.i("MicroMsg.FTS.FTSWebViewLogic", "getTeachSearchData, webviewID = %d", new Object[] { Integer.valueOf(j) });
      paramMap = v.eq(ab.getContext());
      long l = l.kM("discoverSearchEntry").optLong("guideParam");
      this.rCl = new com.tencent.mm.az.n(i, k, com.tencent.mm.az.e.GL(), j, paramMap, l);
      at.wS().a(this.rCl, 0);
      GMTrace.o(12471511285760L, 92920);
      return false;
    }
    paramMap = com.tencent.mm.az.g.KB();
    for (;;)
    {
      try
      {
        localObject1 = new JSONObject();
        JSONArray localJSONArray1 = new JSONArray();
        JSONObject localJSONObject1 = new JSONObject();
        JSONArray localJSONArray2 = new JSONArray();
        i = paramMap.jhd.size() - 1;
        if (i >= 0)
        {
          JSONObject localJSONObject2 = new JSONObject();
          Object localObject2 = (apq)paramMap.jhd.get(i);
          if (!s.fC(((apq)localObject2).tRz)) {
            break label714;
          }
          localObject2 = com.tencent.mm.af.f.iK(((apq)localObject2).tRz);
          if (localObject2 == null) {
            break label714;
          }
          localJSONObject2.put("avatarUrl", ((com.tencent.mm.af.d)localObject2).field_brandIconURL);
          localJSONObject2.put("userName", ((com.tencent.mm.af.d)localObject2).field_username);
          localJSONObject2.put("nickName", com.tencent.mm.y.r.fs(((com.tencent.mm.af.d)localObject2).field_username));
          localJSONArray2.put(localJSONObject2);
          break label714;
        }
        localJSONObject1.put("items", localJSONArray2);
        localJSONObject1.put("type", 5);
        localJSONObject1.put("title", "");
        localJSONArray1.put(localJSONObject1);
        ((JSONObject)localObject1).put("data", localJSONArray1);
        paramMap = ((JSONObject)localObject1).toString();
        w.d("MicroMsg.FTS.FTSWebViewLogic", "getTeachSearchData returnString=%s", new Object[] { paramMap });
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(j).d(1, paramMap, 1);
      }
      catch (Exception paramMap)
      {
        w.printErrStackTrace("MicroMsg.FTS.FTSWebViewLogic", paramMap, "gen mostSearchBizContactList error", new Object[0]);
      }
      break;
      label714:
      i -= 1;
    }
  }
  
  public final boolean T(Map<String, Object> paramMap)
  {
    boolean bool = true;
    GMTrace.i(19466402398208L, 145036);
    int i = bg.m(paramMap.get("webview_instance_id"), -1);
    if (this.rCm.get(Integer.valueOf(201)) == null)
    {
      localObject = f.xo(201);
      if (localObject != null) {
        this.rCm.put(Integer.valueOf(201), localObject);
      }
    }
    Object localObject = (f)this.rCm.get(Integer.valueOf(201));
    com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg;
    String str;
    if (localObject != null)
    {
      localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(i);
      str = ((f)localObject).eJI;
      if (!((f)localObject).bBM()) {
        break label198;
      }
    }
    label198:
    for (i = 1;; i = 0)
    {
      localg.Q(str, 1, i);
      bool = ((f)localObject).bBM();
      if (bool)
      {
        at.wS().a(1866, this);
        localObject = new g();
        if (paramMap != null) {
          ((g)localObject).eQd = f.c(paramMap, "webview_instance_id", -1);
        }
        at.wS().a((com.tencent.mm.ad.k)localObject, 0);
      }
      GMTrace.o(19466402398208L, 145036);
      return false;
    }
  }
  
  public final boolean U(Map<String, Object> paramMap)
  {
    GMTrace.i(12471913938944L, 92923);
    w.i("MicroMsg.FTS.FTSWebViewLogic", "reportSearchRealTimeReport: %s", new Object[] { paramMap.toString() });
    ayr localayr = new ayr();
    localayr.uNa = f.o(paramMap, "logString");
    at.wS().a(1134, this);
    paramMap = new j(localayr);
    at.wS().a(paramMap, 0);
    GMTrace.o(12471913938944L, 92923);
    return false;
  }
  
  public final boolean Y(Map<String, Object> paramMap)
  {
    GMTrace.i(19467341922304L, 145043);
    String str = (String)paramMap.get("query");
    Object localObject = (String)paramMap.get("sortedContacts");
    final int j = bg.Sy((String)paramMap.get("offset"));
    final int k = bg.Sy((String)paramMap.get("count"));
    final int m = bg.m(paramMap.get("webview_instance_id"), -1);
    paramMap = (Map<String, Object>)localObject;
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      paramMap = "";
    }
    localObject = new ArrayList();
    try
    {
      paramMap = new JSONArray(paramMap);
      int i = 0;
      while (i < paramMap.length())
      {
        ((List)localObject).add(paramMap.optString(i));
        i += 1;
      }
      if (this.rCq.equals(paramMap)) {
        break label248;
      }
    }
    catch (JSONException paramMap)
    {
      w.printErrStackTrace("MicroMsg.FTS.FTSWebViewLogic", paramMap, "", new Object[0]);
      if (this.rCp == null) {
        this.rCp = new com.tencent.mm.plugin.webview.fts.a.b();
      }
      paramMap = new com.tencent.mm.plugin.webview.fts.a.d(str, (List)localObject);
      if (this.rCq == null) {}
    }
    this.rCq = paramMap;
    this.rCp.a(paramMap, new c.a()
    {
      public final void bBK()
      {
        GMTrace.i(20497462984704L, 152718);
        e.a(e.this.rCq, j, k, m);
        GMTrace.o(20497462984704L, 152718);
      }
    });
    for (;;)
    {
      GMTrace.o(19467341922304L, 145043);
      return false;
      label248:
      if (this.rCq.eBn) {
        a(this.rCq, j, k, m);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12472853463040L, 92930);
    Object localObject;
    if ((paramk instanceof com.tencent.mm.az.n))
    {
      at.wS().b(1048, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(12472853463040L, 92930);
        return;
      }
      paramString = (com.tencent.mm.az.n)paramk;
      localObject = new b();
      ((b)localObject).scene = paramString.scene;
      ((b)localObject).rCz = paramString.gSe.uBV;
      ((b)localObject).eJI = paramString.gSe.tWC;
      ((b)localObject).rCA = (System.currentTimeMillis() / 1000L);
      ((b)localObject).gRm = paramString.gSe.uBW;
      ((b)localObject).type = paramString.gRj;
      paramk = n(((b)localObject).scene, ((b)localObject).type, true);
      if (!bg.nm(((b)localObject).eJI))
      {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(paramString.eQd).d(0, ((b)localObject).eJI, 0);
        w.i("MicroMsg.FTS.FTSWebViewLogic", "onTeachSearchDataReady, %s", new Object[] { ((b)localObject).eJI });
      }
      this.rCj.put(paramk, localObject);
      if (((b)localObject).rCz == 0L)
      {
        paramInt1 = ((b)localObject).scene;
        paramInt2 = ((b)localObject).type;
        w.i("MicroMsg.FTS.FTSWebViewLogic", "delete biz cache %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        at.AR();
        paramString = com.tencent.mm.y.c.yZ();
        paramk = new File(paramString, n(paramInt1, paramInt2, true));
        if (paramk.exists()) {
          paramk.delete();
        }
        paramString = new File(paramString, n(paramInt1, paramInt2, false));
        if (paramString.exists()) {
          paramString.delete();
        }
      }
      while ((((b)localObject).scene == 20) && (((b)localObject).type == 0))
      {
        com.tencent.mm.az.k.a(((b)localObject).scene, 1, ((b)localObject).gRm, ((b)localObject).type, 2, ((b)localObject).bBL(), 1);
        GMTrace.o(12472853463040L, 92930);
        return;
        paramk = new ana();
        paramk.scene = ((b)localObject).scene;
        paramk.tWC = ((b)localObject).eJI;
        paramk.uBO = ((b)localObject).rCz;
        paramk.uBP = ((b)localObject).rCA;
        paramk.tXx = ((b)localObject).gRm;
        paramk.jib = ((b)localObject).type;
        paramString = null;
        try
        {
          paramk = paramk.toByteArray();
          paramString = paramk;
        }
        catch (IOException paramk)
        {
          for (;;)
          {
            final ArrayList localArrayList;
            JSONArray localJSONArray;
            continue;
            paramInt1 += 1;
          }
        }
        if (paramString != null)
        {
          at.AR();
          paramk = new File(com.tencent.mm.y.c.yZ(), n(((b)localObject).scene, ((b)localObject).type, true));
          if (!paramk.getParentFile().exists()) {
            paramk.getParentFile().mkdirs();
          }
          if (paramk.exists()) {
            paramk.delete();
          }
          com.tencent.mm.a.e.b(paramk.getAbsolutePath(), paramString, paramString.length);
          w.i("MicroMsg.FTS.FTSWebViewLogic", "save bizCacheFile %s %d", new Object[] { paramk.getAbsolutePath(), Integer.valueOf(paramString.length) });
        }
        else
        {
          w.i("MicroMsg.FTS.FTSWebViewLogic", "save bizCacheFile fail");
        }
      }
      com.tencent.mm.az.k.a(((b)localObject).scene, 1, ((b)localObject).gRm, ((b)localObject).type, 1, "", 0);
      GMTrace.o(12472853463040L, 92930);
    }
    else
    {
      if ((paramk instanceof j))
      {
        at.wS().b(1134, this);
        GMTrace.o(12472853463040L, 92930);
        return;
      }
      if ((paramk instanceof k))
      {
        at.wS().b(1161, this);
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          GMTrace.o(12472853463040L, 92930);
          return;
        }
        paramString = this.rCk.CM();
        localArrayList = new ArrayList();
        try
        {
          paramString = new JSONObject(paramString);
          localJSONArray = paramString.optJSONArray("data");
          paramk = paramString.optString("suggestionID", "");
          paramString = null;
          paramInt1 = 0;
          if (paramInt1 < localJSONArray.length())
          {
            localObject = localJSONArray.optJSONObject(paramInt1);
            if (((JSONObject)localObject).optInt("type") != 1) {
              break label1175;
            }
            paramString = (String)localObject;
            break label1175;
          }
          if (paramString != null)
          {
            paramString = paramString.optJSONArray("items");
            paramInt1 = 0;
            while (paramInt1 < paramString.length())
            {
              localObject = paramString.optJSONObject(paramInt1).optString("word");
              if (!bg.nm((String)localObject)) {
                localArrayList.add(localObject);
              }
              paramInt1 += 1;
            }
          }
          paramString = paramk;
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            paramString = "";
          }
        }
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20487933526016L, 152647);
            com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(e.this.rCk.rBV.eQd);
            String str1 = e.this.rCk.rBV.eBj;
            String str2 = paramString;
            ArrayList localArrayList = localArrayList;
            w.i("MicroMsg.MsgHandler", "onSearchSuggestCallback: %s", new Object[] { localArrayList.toString() });
            Bundle localBundle = new Bundle();
            localBundle.putString("query", str1);
            localBundle.putString("suggestionId", str2);
            localBundle.putStringArrayList("result", localArrayList);
            try
            {
              if (localg.rEM != null) {
                localg.rEM.m(127, localBundle);
              }
              GMTrace.o(20487933526016L, 152647);
              return;
            }
            catch (RemoteException localRemoteException)
            {
              w.w("MicroMsg.MsgHandler", "onSearchSuggestCallback exception" + localRemoteException.getMessage());
              GMTrace.o(20487933526016L, 152647);
            }
          }
        });
        GMTrace.o(12472853463040L, 92930);
        return;
      }
      if ((paramk instanceof g))
      {
        at.wS().b(1866, this);
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          GMTrace.o(12472853463040L, 92930);
          return;
        }
        paramString = (g)paramk;
        if (paramString.eQd != -1) {
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(paramString.eQd).Q(((brc)paramString.fUa.gtD.gtK).eJI, 0, 0);
        }
        localObject = new f((brc)paramString.fUa.gtD.gtK);
        paramk = new anb();
        paramk.tOG = ((f)localObject).scene;
        paramk.tWC = ((f)localObject).eJI;
        paramk.uBQ = ((f)localObject).qPW;
        paramk.uBP = ((f)localObject).rCA;
        paramString = null;
      }
      try
      {
        paramk = paramk.toByteArray();
        paramString = paramk;
      }
      catch (IOException paramk)
      {
        for (;;) {}
      }
      if (paramString != null)
      {
        at.AR();
        paramk = new File(com.tencent.mm.y.c.yZ(), f.xp(((f)localObject).scene));
        if (!paramk.getParentFile().exists()) {
          paramk.getParentFile().mkdirs();
        }
        if (paramk.exists()) {
          paramk.delete();
        }
        com.tencent.mm.a.e.b(paramk.getAbsolutePath(), paramString, paramString.length);
        w.i("MicroMsg.FTS.FTSWebViewLogic", "SearchGuideCacheObj saved, scene:%d", new Object[] { Integer.valueOf(((f)localObject).scene) });
      }
      for (;;)
      {
        this.rCm.put(Integer.valueOf(((f)localObject).scene), localObject);
        GMTrace.o(12472853463040L, 92930);
        return;
        w.w("MicroMsg.FTS.FTSWebViewLogic", "SearchGuideCacheObj toBytes fail, scene:%d!", new Object[] { Integer.valueOf(((f)localObject).scene) });
      }
    }
  }
  
  public final boolean a(Map<String, Object> paramMap, com.tencent.mm.plugin.webview.ui.tools.jsapi.g paramg)
  {
    GMTrace.i(19466536615936L, 145037);
    int j = bg.Sy((String)paramMap.get("actionType"));
    int k = f.c(paramMap, "type", 0);
    String str1 = (String)paramMap.get("extParams");
    String str2 = (String)paramMap.get("jumpTo");
    String str3 = (String)paramMap.get("navBarColor");
    Object localObject1 = (String)paramMap.get("nativeConfig");
    if (!TextUtils.isEmpty((CharSequence)localObject1)) {}
    for (;;)
    {
      int i;
      try
      {
        localObject1 = new JSONObject((String)localObject1);
        if (!((JSONObject)localObject1).has("title")) {
          break label1094;
        }
        localObject1 = ((JSONObject)localObject1).optString("title");
        i = 0;
        if (!bg.nm(str3)) {}
        localObject2 = null;
      }
      catch (JSONException localJSONException)
      {
        try
        {
          i = Color.parseColor(str3);
          str3 = (String)paramMap.get("statusBarStyle");
          switch (j)
          {
          default: 
            GMTrace.o(19466536615936L, 145037);
            return false;
          }
        }
        catch (IllegalArgumentException paramMap)
        {
          w.e("MicroMsg.FTS.FTSWebViewLogic", "startSearchItemDetailPage: " + paramMap.getMessage());
          GMTrace.o(19466536615936L, 145037);
          return true;
        }
        localJSONException = localJSONException;
        w.printErrStackTrace("MicroMsg.FTS.FTSWebViewLogic", localJSONException, "", new Object[0]);
      }
      Object localObject2;
      continue;
      switch (k)
      {
      default: 
        localObject2 = f.o(paramMap, "jumpUrl");
        w.i("MicroMsg.FTS.FTSWebViewLogic", "jump url = %s", new Object[] { localObject2 });
        paramMap = null;
        if (paramg != null) {
          paramMap = paramg.bFM();
        }
        if (!bg.nm((String)localObject2))
        {
          com.tencent.mm.plugin.webview.modeltools.f.bCT();
          a((String)localObject2, paramMap, i, str3, "", 0);
        }
        break;
      case 8: 
        f.o(paramMap, "snsid");
        paramg = f.o(paramMap, "objectXmlDesc");
        localObject2 = f.o(paramMap, "userName");
        boolean bool = f.q(paramMap, "fromMusicItem");
        com.tencent.mm.plugin.webview.modeltools.f.bCT();
        p(paramg, (String)localObject2, bool);
        break;
      case 1: 
        a(V(paramMap), false);
        break;
      case 32: 
        a(W(paramMap));
        continue;
        localObject2 = f.o(paramMap, "jumpUrl");
        w.i("MicroMsg.FTS.FTSWebViewLogic", "jump url = %s", new Object[] { localObject2 });
        paramMap = null;
        if (paramg != null) {
          paramMap = paramg.bFM();
        }
        if (!bg.nm((String)localObject2))
        {
          com.tencent.mm.plugin.webview.modeltools.f.bCT();
          a((String)localObject2, paramMap, i, str3, "", 0);
          continue;
          String str4 = f.o(paramMap, "query");
          int m = f.c(paramMap, "scene", 0);
          String str5 = f.o(paramMap, "searchId");
          paramg = new Intent();
          paramg.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          paramg.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          paramg.putExtra("neverGetA8Key", true);
          paramg.putExtra("key_load_js_without_delay", true);
          paramg.putExtra("ftsQuery", str4);
          paramg.putExtra("ftsType", k);
          paramg.putExtra("customize_status_bar_color", i);
          paramg.putExtra("status_bar_style", str3);
          paramg.putExtra("jumpto_sns_contact_page", "snsContactPage".equalsIgnoreCase(str2));
          if (localObject2 != null) {
            paramg.putExtra("title", (String)localObject2);
          }
          if (!com.tencent.mm.az.r.KL())
          {
            paramMap = com.tencent.mm.az.e.aW(m, k);
            paramMap.put("query", str4);
            paramMap.put("searchId", str5);
            paramg.putExtra("rawUrl", com.tencent.mm.az.e.c(m, paramMap));
            if ((m == 20) || (m == 22)) {}
            for (paramMap = ".ui.tools.fts.FTSSOSMoreWebViewUI";; paramMap = ".ui.tools.fts.FTSSearchTabWebViewUI")
            {
              com.tencent.mm.bj.d.b(ab.getContext(), "webview", paramMap, paramg);
              break;
            }
          }
          label748:
          int n;
          if (f.c(paramMap, "isWeAppMore", 0) == 1)
          {
            j = 1;
            n = f.c(paramMap, "tabPageType", 0);
            if (j == 0) {
              break label941;
            }
            localObject2 = com.tencent.mm.az.r.a(m, false, k, str1);
            ((Map)localObject2).put("query", str4);
            ((Map)localObject2).put("searchId", str5);
            ((Map)localObject2).put("subType", String.valueOf(f.c(paramMap, "subType", 0)));
            ((Map)localObject2).put("isWeAppMore", String.valueOf(f.c(paramMap, "isWeAppMore", 0)));
            paramg.putExtra("key_session_id", com.tencent.mm.modelappbrand.b.CE());
            paramg.putExtra("rawUrl", com.tencent.mm.az.r.n((Map)localObject2));
            paramg.putExtra("ftsbizscene", m);
            paramg.putExtra("customize_status_bar_color", i);
            paramg.putExtra("status_bar_style", str3);
            if ((m != 20) && (m != 22)) {
              break label934;
            }
          }
          label934:
          for (paramMap = ".ui.AppBrandSOSUI";; paramMap = ".ui.AppBrandSearchUI")
          {
            com.tencent.mm.bj.d.b(ab.getContext(), "appbrand", paramMap, paramg);
            break;
            j = 0;
            break label748;
          }
          label941:
          paramMap = com.tencent.mm.az.e.a(m, false, k, str1);
          paramMap.put("query", str4);
          paramMap.put("searchId", str5);
          paramg.putExtra("rawUrl", com.tencent.mm.az.e.c(m, paramMap));
          paramg.putExtra("customize_status_bar_color", i);
          paramg.putExtra("status_bar_style", str3);
          if (n == 1)
          {
            paramg.putExtra("ftscaneditable", false);
            com.tencent.mm.az.e.a(ab.getContext(), str4, paramg, (String)localObject2, str1, str5);
            GMTrace.o(19466536615936L, 145037);
            return false;
          }
          if ((m == 20) || (m == 22)) {}
          for (paramMap = ".ui.tools.fts.FTSSOSMoreWebViewUI";; paramMap = ".ui.tools.fts.FTSSearchTabWebViewUI")
          {
            if (TextUtils.isEmpty(paramMap)) {
              break label1092;
            }
            com.tencent.mm.bj.d.b(ab.getContext(), "webview", paramMap, paramg);
            break;
          }
          label1092:
          continue;
          label1094:
          localObject2 = null;
        }
        break;
      }
    }
  }
  
  public final boolean a(Map<String, Object> paramMap, com.tencent.mm.plugin.webview.ui.tools.jsapi.g paramg, String paramString)
  {
    GMTrace.i(19466670833664L, 145038);
    this.rCn.rCH = true;
    boolean bool1 = f.q(paramMap, "isTeachPage");
    boolean bool2 = f.q(paramMap, "isMoreButton");
    int j;
    int i;
    label65:
    String str1;
    int k;
    if (f.c(paramMap, "isFeedBack", 0) == 1)
    {
      j = 1;
      if (f.c(paramMap, "isWeAppMore", 0) != 1) {
        break label161;
      }
      i = 1;
      str1 = (String)paramMap.get("navBarColor");
      k = 0;
      if (bg.nm(str1)) {}
    }
    for (;;)
    {
      try
      {
        k = Color.parseColor(str1);
        str1 = (String)paramMap.get("statusBarStyle");
        if (j == 0) {
          break label204;
        }
        paramString = f.o(paramMap, "jumpUrl");
        paramMap = null;
        if (paramg != null) {
          paramMap = paramg.bFM();
        }
        com.tencent.mm.plugin.webview.modeltools.f.bCT();
        d(paramString, paramMap);
        GMTrace.o(19466670833664L, 145038);
        return false;
      }
      catch (IllegalArgumentException paramMap)
      {
        label161:
        w.e("MicroMsg.FTS.FTSWebViewLogic", "startSearchItemDetailPage: " + paramMap.getMessage());
        GMTrace.o(19466670833664L, 145038);
        return true;
      }
      j = 0;
      break;
      i = 0;
      break label65;
      label204:
      j = f.c(paramMap, "type", 0);
      int m = f.c(paramMap, "opType", 0);
      if (m > 0)
      {
        switch (m)
        {
        default: 
          break;
        case 2: 
          a(V(paramMap), bool1);
          break;
        case 3: 
          paramMap = V(paramMap);
          if (!s.fC(paramMap.username))
          {
            a(paramMap, bool1);
            continue;
          }
          com.tencent.mm.az.g.kJ(paramMap.username);
          paramg = new Intent();
          paramg.putExtra("Chat_User", paramMap.username);
          paramg.putExtra("finish_direct", true);
          paramg.putExtra("key_temp_session_show_type", 0);
          com.tencent.mm.bj.d.a(ab.getContext(), ".ui.chatting.En_5b8fbb1e", paramg);
          break;
        case 4: 
          paramString = f.o(paramMap, "jumpUrl");
          paramMap = null;
          if (paramg != null) {
            paramMap = paramg.bFM();
          }
          com.tencent.mm.plugin.webview.modeltools.f.bCT();
          d(paramString, paramMap);
          break;
        }
      }
      else
      {
        String str2;
        if (bool2)
        {
          str1 = f.o(paramMap, "query");
          k = f.c(paramMap, "scene", 0);
          str2 = f.o(paramMap, "searchId");
          paramg = new Intent();
          paramg.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          paramg.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          paramg.putExtra("neverGetA8Key", true);
          paramg.putExtra("key_load_js_without_delay", true);
          paramg.putExtra("ftsQuery", str1);
          paramg.putExtra("ftsType", j);
          if (!com.tencent.mm.az.r.KL())
          {
            paramMap = com.tencent.mm.az.e.aW(k, j);
            paramMap.put("query", str1);
            paramMap.put("searchId", str2);
            paramg.putExtra("rawUrl", com.tencent.mm.az.e.c(k, paramMap));
            if ((k == 20) || (k == 22) || (k == 24)) {}
            for (paramMap = ".ui.tools.fts.FTSSOSMoreWebViewUI";; paramMap = ".ui.tools.fts.FTSSearchTabWebViewUI")
            {
              com.tencent.mm.bj.d.b(ab.getContext(), "webview", paramMap, paramg);
              break;
            }
          }
          if (i != 0)
          {
            paramString = com.tencent.mm.az.r.a(k, false, j, paramString);
            paramString.put("query", str1);
            paramString.put("searchId", str2);
            paramString.put("subType", String.valueOf(f.c(paramMap, "subType", 0)));
            paramString.put("isWeAppMore", String.valueOf(f.c(paramMap, "isWeAppMore", 0)));
            paramg.putExtra("key_session_id", com.tencent.mm.modelappbrand.b.CE());
            paramg.putExtra("rawUrl", com.tencent.mm.az.r.n(paramString));
            paramg.putExtra("ftsbizscene", k);
            if ((k == 20) || (k == 22) || (k == 24)) {}
            for (paramMap = ".ui.AppBrandSOSUI";; paramMap = ".ui.AppBrandSearchUI")
            {
              com.tencent.mm.bj.d.b(ab.getContext(), "appbrand", paramMap, paramg);
              break;
            }
          }
          paramMap = com.tencent.mm.az.e.a(k, false, j, paramString);
          paramMap.put("query", str1);
          paramMap.put("searchId", str2);
          paramg.putExtra("rawUrl", com.tencent.mm.az.e.c(k, paramMap));
          if ((k == 20) || (k == 22) || (k == 24)) {}
          for (paramMap = ".ui.tools.fts.FTSSOSMoreWebViewUI";; paramMap = ".ui.tools.fts.FTSSearchTabWebViewUI")
          {
            com.tencent.mm.bj.d.b(ab.getContext(), "webview", paramMap, paramg);
            break;
          }
        }
        w.i("MicroMsg.FTS.FTSWebViewLogic", "doStartSearchItemDetailPage: type=%d link=%s", new Object[] { Integer.valueOf(j), (String)paramMap.get("url") });
        switch (j)
        {
        default: 
          paramString = f.o(paramMap, "jumpUrl");
          str2 = f.o(paramMap, "publishId");
          i = f.c(paramMap, "payScene", 0);
          w.i("MicroMsg.FTS.FTSWebViewLogic", "jump url = %s, publishId = %s, payScene = %d", new Object[] { paramString, str2, Integer.valueOf(i) });
          paramMap = null;
          if (paramg != null) {
            paramMap = paramg.bFM();
          }
          if (!bg.nm(paramString))
          {
            com.tencent.mm.plugin.webview.modeltools.f.bCT();
            a(paramString, paramMap, k, str1, str2, i);
          }
          break;
        case 8: 
          f.o(paramMap, "snsid");
          paramg = f.o(paramMap, "objectXmlDesc");
          paramString = f.o(paramMap, "userName");
          bool1 = f.q(paramMap, "fromMusicItem");
          com.tencent.mm.plugin.webview.modeltools.f.bCT();
          p(paramg, paramString, bool1);
          break;
        case 1: 
          a(V(paramMap), false);
          break;
        case 32: 
          a(W(paramMap));
        }
      }
    }
  }
  
  public final String bBI()
  {
    GMTrace.i(19466268180480L, 145035);
    Object localObject = n(20, 0, true);
    if (this.rCj.get(localObject) == null)
    {
      b localb = new b();
      localb.dE(20, 0);
      this.rCj.put(localObject, localb);
    }
    localObject = (b)this.rCj.get(localObject);
    if (((b)localObject).isAvailable()) {}
    for (localObject = ((b)localObject).eJI; bg.nm((String)localObject); localObject = "")
    {
      GMTrace.o(19466268180480L, 145035);
      return "";
    }
    GMTrace.o(19466268180480L, 145035);
    return (String)localObject;
  }
  
  public final void bBJ()
  {
    GMTrace.i(12471645503488L, 92921);
    if (this.rCl != null)
    {
      at.wS().b(1048, this);
      at.wS().c(this.rCl);
      this.rCl = null;
    }
    GMTrace.o(12471645503488L, 92921);
  }
  
  private final class a
    implements Runnable
  {
    public String data;
    public boolean rCy;
    
    public a()
    {
      GMTrace.i(12473524551680L, 92935);
      GMTrace.o(12473524551680L, 92935);
    }
    
    public final void run()
    {
      GMTrace.i(12473658769408L, 92936);
      ArrayList localArrayList = new ArrayList();
      try
      {
        JSONArray localJSONArray = new JSONArray(this.data);
        int i = 0;
        while (i < localJSONArray.length())
        {
          Object localObject = ((m)com.tencent.mm.kernel.h.h(m.class)).lz(localJSONArray.getString(i));
          com.tencent.mm.at.a.a locala = (com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class);
          at.AR();
          localObject = locala.a(com.tencent.mm.y.c.zo(), (biz)localObject, 9);
          if (localObject != null) {
            localArrayList.add(localObject);
          }
          i += 1;
        }
        if (!this.rCy) {
          break label148;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.FTS.FTSWebViewLogic", localException, "", new Object[0]);
        GMTrace.o(12473658769408L, 92936);
        return;
      }
      if (e.this.rCo == null)
      {
        label148:
        e.this.rCo = localException;
        GMTrace.o(12473658769408L, 92936);
        return;
      }
      e.this.rCo.addAll(localException);
      GMTrace.o(12473658769408L, 92936);
    }
  }
  
  private final class b
  {
    String eJI;
    String gRm;
    boolean gTo;
    long rCA;
    private String rCB;
    long rCz;
    int scene;
    int type;
    
    public b()
    {
      GMTrace.i(12466276794368L, 92881);
      this.gTo = false;
      this.rCB = null;
      GMTrace.o(12466276794368L, 92881);
    }
    
    final String bBL()
    {
      GMTrace.i(18176033161216L, 135422);
      if (this.rCB == null) {
        this.rCB = "";
      }
      try
      {
        localObject = new JSONObject(this.eJI).optJSONObject("data").optJSONObject("hotwords").optJSONArray("items");
        ArrayList localArrayList = new ArrayList();
        int i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          localArrayList.add(Uri.encode(((JSONArray)localObject).optJSONObject(i).optString("hotword")));
          i += 1;
        }
        this.rCB = TextUtils.join("|", localArrayList);
      }
      catch (Exception localException)
      {
        Object localObject;
        for (;;) {}
      }
      localObject = this.rCB;
      GMTrace.o(18176033161216L, 135422);
      return (String)localObject;
    }
    
    final void dE(int paramInt1, int paramInt2)
    {
      GMTrace.i(19470026276864L, 145063);
      ana localana = new ana();
      at.AR();
      Object localObject1 = com.tencent.mm.y.c.yZ();
      Object localObject2 = e.n(paramInt1, paramInt2, false);
      if (!((String)localObject2).equals(e.n(paramInt1, paramInt2, true))) {
        this.gTo = true;
      }
      localObject1 = new File((String)localObject1, (String)localObject2);
      localObject2 = com.tencent.mm.a.e.c(((File)localObject1).getAbsolutePath(), 0, (int)((File)localObject1).length());
      if (localObject2 != null) {
        try
        {
          localana.aD((byte[])localObject2);
          this.scene = localana.scene;
          this.eJI = localana.tWC;
          this.rCz = localana.uBO;
          this.rCA = localana.uBP;
          this.gRm = localana.tXx;
          this.type = localana.jib;
          w.i("MicroMsg.FTS.FTSWebViewLogic", "load bizCacheFile %s %d", new Object[] { ((File)localObject1).getAbsolutePath(), Integer.valueOf(localObject2.length) });
          GMTrace.o(19470026276864L, 145063);
          return;
        }
        catch (IOException localIOException) {}
      }
      GMTrace.o(19470026276864L, 145063);
    }
    
    final boolean isAvailable()
    {
      GMTrace.i(20487262437376L, 152642);
      if (this.gTo)
      {
        GMTrace.o(20487262437376L, 152642);
        return false;
      }
      if ((bg.nm(this.eJI)) || (System.currentTimeMillis() / 1000L - this.rCA > this.rCz))
      {
        GMTrace.o(20487262437376L, 152642);
        return false;
      }
      GMTrace.o(20487262437376L, 152642);
      return true;
    }
  }
  
  private final class c
  {
    public String eCQ;
    public String eQb;
    public int gRn;
    public String hSv;
    public String nLE;
    public oo nMF;
    public int position;
    public int rCC;
    public boolean rCD;
    public String rCE;
    public int scene;
    public String signature;
    public String username;
    
    public c()
    {
      GMTrace.i(12471108632576L, 92917);
      GMTrace.o(12471108632576L, 92917);
    }
  }
  
  private final class d
  {
    public String country;
    public String eCQ;
    public String eQb;
    public int fja;
    public String fjk;
    public String fjl;
    public String fsF;
    public int rCF;
    public int scene;
    public String signature;
    public String username;
    
    public d()
    {
      GMTrace.i(12473927204864L, 92938);
      GMTrace.o(12473927204864L, 92938);
    }
  }
  
  public final class e
  {
    public boolean eBn;
    public String eQb;
    public int lzX;
    public boolean rCG;
    public boolean rCH;
    public int scene;
    
    public e()
    {
      GMTrace.i(12468558495744L, 92898);
      this.rCG = true;
      GMTrace.o(12468558495744L, 92898);
    }
  }
  
  private static final class f
  {
    public String eJI;
    public long qPW;
    public long rCA;
    public int scene;
    
    public f()
    {
      GMTrace.i(19470563147776L, 145067);
      this.scene = 0;
      this.eJI = "";
      this.qPW = 0L;
      this.rCA = 0L;
      GMTrace.o(19470563147776L, 145067);
    }
    
    public f(brc parambrc)
    {
      GMTrace.i(19470697365504L, 145068);
      this.scene = 0;
      this.eJI = "";
      this.qPW = 0L;
      this.rCA = 0L;
      this.scene = 201;
      this.eJI = parambrc.eJI;
      this.qPW = parambrc.heG;
      this.rCA = (System.currentTimeMillis() / 1000L);
      GMTrace.o(19470697365504L, 145068);
    }
    
    /* Error */
    public static f xo(int paramInt)
    {
      // Byte code:
      //   0: ldc2_w 64
      //   3: ldc 66
      //   5: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: invokestatic 72	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
      //   11: pop
      //   12: new 74	java/io/File
      //   15: dup
      //   16: invokestatic 80	com/tencent/mm/y/c:yZ	()Ljava/lang/String;
      //   19: sipush 201
      //   22: invokestatic 84	com/tencent/mm/plugin/webview/fts/e$f:xp	(I)Ljava/lang/String;
      //   25: invokespecial 87	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   28: astore_1
      //   29: aload_1
      //   30: invokevirtual 90	java/io/File:getAbsolutePath	()Ljava/lang/String;
      //   33: iconst_0
      //   34: aload_1
      //   35: invokevirtual 93	java/io/File:length	()J
      //   38: l2i
      //   39: invokestatic 99	com/tencent/mm/a/e:c	(Ljava/lang/String;II)[B
      //   42: astore_1
      //   43: new 101	com/tencent/mm/protocal/c/anb
      //   46: dup
      //   47: invokespecial 102	com/tencent/mm/protocal/c/anb:<init>	()V
      //   50: astore_2
      //   51: aload_2
      //   52: aload_1
      //   53: invokevirtual 106	com/tencent/mm/protocal/c/anb:aD	([B)Lcom/tencent/mm/bm/a;
      //   56: pop
      //   57: new 2	com/tencent/mm/plugin/webview/fts/e$f
      //   60: dup
      //   61: invokespecial 107	com/tencent/mm/plugin/webview/fts/e$f:<init>	()V
      //   64: astore_1
      //   65: aload_1
      //   66: aload_2
      //   67: getfield 110	com/tencent/mm/protocal/c/anb:tOG	I
      //   70: putfield 29	com/tencent/mm/plugin/webview/fts/e$f:scene	I
      //   73: aload_1
      //   74: aload_2
      //   75: getfield 113	com/tencent/mm/protocal/c/anb:tWC	Ljava/lang/String;
      //   78: putfield 33	com/tencent/mm/plugin/webview/fts/e$f:eJI	Ljava/lang/String;
      //   81: aload_1
      //   82: aload_2
      //   83: getfield 116	com/tencent/mm/protocal/c/anb:uBQ	J
      //   86: putfield 35	com/tencent/mm/plugin/webview/fts/e$f:qPW	J
      //   89: aload_1
      //   90: aload_2
      //   91: getfield 119	com/tencent/mm/protocal/c/anb:uBP	J
      //   94: putfield 37	com/tencent/mm/plugin/webview/fts/e$f:rCA	J
      //   97: ldc2_w 64
      //   100: ldc 66
      //   102: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   105: aload_1
      //   106: areturn
      //   107: astore_1
      //   108: aconst_null
      //   109: astore_1
      //   110: goto -13 -> 97
      //   113: astore_2
      //   114: goto -17 -> 97
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	117	0	paramInt	int
      //   28	78	1	localObject1	Object
      //   107	1	1	localException1	Exception
      //   109	1	1	localObject2	Object
      //   50	41	2	localanb	anb
      //   113	1	2	localException2	Exception
      // Exception table:
      //   from	to	target	type
      //   43	65	107	java/lang/Exception
      //   65	97	113	java/lang/Exception
    }
    
    static String xp(int paramInt)
    {
      GMTrace.i(19470965800960L, 145070);
      String str = v.eq(ab.getContext());
      str = "SearchGuide_" + paramInt + "-" + str;
      GMTrace.o(19470965800960L, 145070);
      return str;
    }
    
    public final boolean bBM()
    {
      GMTrace.i(19471100018688L, 145071);
      if (this.rCA + this.qPW <= System.currentTimeMillis() / 1000L)
      {
        GMTrace.o(19471100018688L, 145071);
        return true;
      }
      GMTrace.o(19471100018688L, 145071);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */