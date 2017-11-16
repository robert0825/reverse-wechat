package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements b
{
  private static final int rRT;
  public com.tencent.mm.plugin.webview.stub.d ioh;
  public int rHv;
  public MMWebView rRU;
  public final List<String> rRV;
  private final LinkedList<i> rRW;
  private ae rRX;
  Map<String, Object> rRY;
  public Map<String, Object> rRZ;
  public boolean rSa;
  private e rSb;
  public boolean rSc;
  public String rSd;
  public final List<String> rSe;
  public volatile String rSf;
  public volatile int rSg;
  public JSONObject rSh;
  public JSONArray rSi;
  public List<String> rSj;
  private aj rSk;
  public long rSl;
  
  static
  {
    GMTrace.i(12157576019968L, 90581);
    if (com.tencent.mm.compatible.util.d.eu(19)) {}
    for (int i = 200;; i = 20)
    {
      rRT = i;
      GMTrace.o(12157576019968L, 90581);
      return;
    }
  }
  
  public d(MMWebView paramMMWebView, e parame, Map<String, Object> paramMap, com.tencent.mm.plugin.webview.stub.d paramd, int paramInt)
  {
    GMTrace.i(12150865133568L, 90531);
    this.rRV = new LinkedList();
    this.rRW = new LinkedList();
    this.rRX = null;
    this.rSa = false;
    this.rSc = false;
    this.rSd = "";
    this.rSe = new LinkedList();
    this.rSf = null;
    this.rSg = 0;
    this.rSh = new JSONObject();
    this.rSi = new JSONArray();
    this.rSj = new LinkedList();
    this.rSk = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(15140967677952L, 112809);
        String str = i.a.a("onBeaconsInRange", d.this.rSh, d.this.rSc, d.this.rSd);
        d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str + ")", null);
        d.this.rSj.clear();
        d.this.rSh = new JSONObject();
        d.this.rSi = new JSONArray();
        GMTrace.o(15140967677952L, 112809);
        return false;
      }
    }, false);
    this.rSl = 0L;
    this.rRU = paramMMWebView;
    this.rSb = parame;
    this.rRX = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12251528429568L, 91281);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(12251528429568L, 91281);
          return;
          paramAnonymousMessage = (String)paramAnonymousMessage.obj;
          if (!bg.nm(paramAnonymousMessage)) {
            d.this.rRV.add(paramAnonymousMessage);
          }
          d.this.bFo();
          GMTrace.o(12251528429568L, 91281);
          return;
          w.v("MicroMsg.JsApiHandler", "handle msg from wx done, msg = " + paramAnonymousMessage.obj);
        }
      }
    };
    this.ioh = paramd;
    this.rRY = paramMap;
    this.rHv = paramInt;
    GMTrace.o(12150865133568L, 90531);
  }
  
  public static String Mv(String paramString)
  {
    GMTrace.i(12154623229952L, 90559);
    paramString = String.format("javascript:WeixinJSBridge._handleMessageFromWeixin(%s)", new Object[] { bg.nl(paramString) });
    GMTrace.o(12154623229952L, 90559);
    return paramString;
  }
  
  public final void Mt(String paramString)
  {
    GMTrace.i(12153549488128L, 90551);
    try
    {
      Bundle localBundle = new Bundle();
      JsapiPermissionWrapper localJsapiPermissionWrapper = this.rSb.bDM();
      if (localJsapiPermissionWrapper != null) {
        localJsapiPermissionWrapper.toBundle(localBundle);
      }
      this.ioh.a(paramString, localBundle, this.rHv);
      GMTrace.o(12153549488128L, 90551);
      return;
    }
    catch (Exception paramString)
    {
      w.w("MicroMsg.JsApiHandler", "doProfile, ex = " + paramString.getMessage());
      GMTrace.o(12153549488128L, 90551);
    }
  }
  
  public final void Mu(String paramString)
  {
    GMTrace.i(16203972083712L, 120729);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady fail, not ready");
      GMTrace.o(16203972083712L, 120729);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady success, ready");
    HashMap localHashMap = new HashMap();
    localHashMap.put("json", paramString);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16205180043264L, 120738);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(16205180043264L, 120738);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(16205180043264L, 120738);
        }
      }
    });
    GMTrace.o(16203972083712L, 120729);
  }
  
  public final void Mw(String paramString)
  {
    GMTrace.i(16601793429504L, 123693);
    if (bg.nm(paramString))
    {
      GMTrace.o(16601793429504L, 123693);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("netType", paramString);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18153887236096L, 135257);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(18153887236096L, 135257);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(18153887236096L, 135257);
        }
      }
    });
    GMTrace.o(16601793429504L, 123693);
  }
  
  public final void Z(Map<String, Object> paramMap)
  {
    GMTrace.i(12152609964032L, 90544);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onVoicePlayEnd fail, not ready");
      GMTrace.o(12152609964032L, 90544);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onVoicePlayEnd");
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12258105098240L, 91330);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12258105098240L, 91330);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onVoicePlayEnd fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12258105098240L, 91330);
        }
      }
    });
    GMTrace.o(12152609964032L, 90544);
  }
  
  /* Error */
  public final void a(String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, float paramFloat)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 382
    //   5: ldc_w 384
    //   8: invokestatic 159	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 223	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSk	Lcom/tencent/mm/sdk/platformtools/aj;
    //   15: invokevirtual 388	com/tencent/mm/sdk/platformtools/aj:bQn	()Z
    //   18: ifeq +16 -> 34
    //   21: aload_0
    //   22: getfield 223	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSk	Lcom/tencent/mm/sdk/platformtools/aj;
    //   25: ldc2_w 389
    //   28: ldc2_w 389
    //   31: invokevirtual 394	com/tencent/mm/sdk/platformtools/aj:z	(JJ)V
    //   34: new 203	org/json/JSONObject
    //   37: dup
    //   38: invokespecial 204	org/json/JSONObject:<init>	()V
    //   41: astore 11
    //   43: iconst_0
    //   44: istore 10
    //   46: iload 10
    //   48: istore 9
    //   50: dload 4
    //   52: dconst_0
    //   53: dcmpl
    //   54: ifle +19 -> 73
    //   57: iload 10
    //   59: istore 9
    //   61: dload 4
    //   63: ldc2_w 395
    //   66: dcmpg
    //   67: ifge +6 -> 73
    //   70: iconst_1
    //   71: istore 9
    //   73: aload_0
    //   74: getfield 213	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSj	Ljava/util/List;
    //   77: new 296	java/lang/StringBuilder
    //   80: dup
    //   81: invokespecial 397	java/lang/StringBuilder:<init>	()V
    //   84: aload_1
    //   85: invokestatic 401	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   88: invokevirtual 308	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: iload_2
    //   92: invokestatic 404	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   95: invokevirtual 308	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: iload_3
    //   99: invokestatic 404	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   102: invokevirtual 308	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokeinterface 410 2 0
    //   113: ifne +178 -> 291
    //   116: aload_0
    //   117: getfield 213	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSj	Ljava/util/List;
    //   120: new 296	java/lang/StringBuilder
    //   123: dup
    //   124: invokespecial 397	java/lang/StringBuilder:<init>	()V
    //   127: aload_1
    //   128: invokestatic 401	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   131: invokevirtual 308	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: iload_2
    //   135: invokestatic 404	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   138: invokevirtual 308	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: iload_3
    //   142: invokestatic 404	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   145: invokevirtual 308	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   151: invokeinterface 413 2 0
    //   156: pop
    //   157: aload 11
    //   159: ldc_w 415
    //   162: aload_1
    //   163: invokestatic 401	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   166: invokevirtual 418	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   169: pop
    //   170: aload 11
    //   172: ldc_w 420
    //   175: iload_2
    //   176: invokestatic 404	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   179: invokevirtual 418	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   182: pop
    //   183: aload 11
    //   185: ldc_w 422
    //   188: iload_3
    //   189: invokestatic 404	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   192: invokevirtual 418	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   195: pop
    //   196: aload 11
    //   198: ldc_w 424
    //   201: dload 4
    //   203: invokestatic 427	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   206: invokevirtual 418	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   209: pop
    //   210: aload 11
    //   212: ldc_w 429
    //   215: dload 6
    //   217: invokestatic 427	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   220: invokevirtual 418	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   223: pop
    //   224: aload 11
    //   226: ldc_w 431
    //   229: fload 8
    //   231: invokestatic 434	java/lang/String:valueOf	(F)Ljava/lang/String;
    //   234: invokevirtual 418	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   237: pop
    //   238: aload 11
    //   240: ldc_w 436
    //   243: iload 9
    //   245: invokestatic 404	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   248: invokevirtual 418	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   251: pop
    //   252: aload_0
    //   253: getfield 211	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSi	Lorg/json/JSONArray;
    //   256: aload 11
    //   258: invokevirtual 439	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   261: pop
    //   262: aload_0
    //   263: getfield 206	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSh	Lorg/json/JSONObject;
    //   266: ldc_w 441
    //   269: aload_0
    //   270: getfield 211	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSi	Lorg/json/JSONArray;
    //   273: invokevirtual 418	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   276: pop
    //   277: aload_0
    //   278: getfield 206	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSh	Lorg/json/JSONObject;
    //   281: ldc_w 443
    //   284: ldc_w 445
    //   287: invokevirtual 418	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   290: pop
    //   291: ldc_w 447
    //   294: aload_0
    //   295: getfield 206	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSh	Lorg/json/JSONObject;
    //   298: aload_0
    //   299: getfield 191	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSc	Z
    //   302: aload_0
    //   303: getfield 195	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:rSd	Ljava/lang/String;
    //   306: invokestatic 450	com/tencent/mm/plugin/webview/ui/tools/jsapi/i$a:a	(Ljava/lang/String;Lorg/json/JSONObject;ZLjava/lang/String;)Ljava/lang/String;
    //   309: pop
    //   310: ldc2_w 382
    //   313: ldc_w 384
    //   316: invokestatic 170	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   319: aload_0
    //   320: monitorexit
    //   321: return
    //   322: astore_1
    //   323: ldc_w 294
    //   326: ldc_w 452
    //   329: iconst_1
    //   330: anewarray 4	java/lang/Object
    //   333: dup
    //   334: iconst_0
    //   335: aload_1
    //   336: invokevirtual 304	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   339: aastore
    //   340: invokestatic 455	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   343: goto -52 -> 291
    //   346: astore_1
    //   347: aload_0
    //   348: monitorexit
    //   349: aload_1
    //   350: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	351	0	this	d
    //   0	351	1	paramString	String
    //   0	351	2	paramInt1	int
    //   0	351	3	paramInt2	int
    //   0	351	4	paramDouble1	double
    //   0	351	6	paramDouble2	double
    //   0	351	8	paramFloat	float
    //   48	196	9	i	int
    //   44	14	10	j	int
    //   41	216	11	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   73	291	322	java/lang/Exception
    //   2	34	346	finally
    //   34	43	346	finally
    //   73	291	346	finally
    //   291	319	346	finally
    //   323	343	346	finally
  }
  
  public final void a(final String paramString1, String paramString2, Map<String, Object> paramMap, boolean paramBoolean)
  {
    GMTrace.i(12154086359040L, 90555);
    if (!bg.nm(paramString1))
    {
      if ((paramString2 != null) && (paramString2.length() != 0) && (paramString1 != null)) {
        break label73;
      }
      w.e("MicroMsg.JsApiHandler", "doCallback, invalid args, ret = " + paramString2);
    }
    for (;;)
    {
      if (paramBoolean) {
        bDj();
      }
      GMTrace.o(12154086359040L, 90555);
      return;
      label73:
      HashMap localHashMap = new HashMap();
      localHashMap.put("err_msg", paramString2);
      if ((paramMap != null) && (paramMap.size() > 0))
      {
        w.i("MicroMsg.JsApiHandler", "doCallback, retValue size = " + paramMap.size());
        localHashMap.putAll(paramMap);
      }
      paramString1 = i.a.a("callback", paramString1, localHashMap, null, this.rSc, this.rSd);
      w.i("MicroMsg.JsApiHandler", "doCallback, ret = " + paramString2 + ", cb = " + paramString1);
      if ((paramString1 != null) && (this.rRU != null)) {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12146972819456L, 90502);
            try
            {
              d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + paramString1 + ")", null);
              GMTrace.o(12146972819456L, 90502);
              return;
            }
            catch (Exception localException)
            {
              w.w("MicroMsg.JsApiHandler", "doCallback, ex = %s", new Object[] { localException.getMessage() });
              GMTrace.o(12146972819456L, 90502);
            }
          }
        });
      }
    }
  }
  
  public final void a(String paramString1, String paramString2, JSONArray paramJSONArray)
  {
    GMTrace.i(19453517496320L, 144940);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onSearchInputChange fail, not ready");
      GMTrace.o(19453517496320L, 144940);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onSearchInputChange success, ready %s %s %s", new Object[] { paramString1, paramString2, paramJSONArray.toString() });
    HashMap localHashMap = new HashMap();
    localHashMap.put("query", paramString1);
    localHashMap.put("custom", paramString2);
    localHashMap.put("tagList", paramJSONArray);
    localHashMap.put("isCancelButtonClick", Integer.valueOf(0));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12248172986368L, 91256);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12248172986368L, 91256);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onSearchInputChange fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12248172986368L, 91256);
        }
      }
    });
    GMTrace.o(19453517496320L, 144940);
  }
  
  public final void a(String paramString1, String paramString2, JSONArray paramJSONArray, int paramInt, Map<String, Object> paramMap)
  {
    GMTrace.i(19454188584960L, 144945);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onSearchInputConfirm fail, not ready");
      GMTrace.o(19454188584960L, 144945);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onSearchInputConfirm success, ready %s %s %s", new Object[] { paramString1, paramString2, paramJSONArray.toString() });
    JSONObject localJSONObject = new JSONObject();
    if (paramMap != null)
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (localEntry.getValue() != null) {
          try
          {
            localJSONObject.put((String)localEntry.getKey(), new JSONObject(localEntry.getValue().toString()));
          }
          catch (JSONException localJSONException1)
          {
            try
            {
              localJSONObject.put((String)localEntry.getKey(), new JSONArray(localEntry.getValue().toString()));
            }
            catch (JSONException localJSONException3)
            {
              try
              {
                localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
              }
              catch (JSONException localJSONException2)
              {
                w.printErrStackTrace("MicroMsg.JsApiHandler", localJSONException1, "", new Object[0]);
              }
            }
          }
        }
      }
    }
    try
    {
      localJSONObject.put("query", paramString1);
      localJSONObject.put("custom", paramString2);
      localJSONObject.put("tagList", paramJSONArray);
      localJSONObject.put("isBackButtonClick", paramInt);
      localJSONObject.put("sugId", "");
      localJSONObject.put("sugClickType", 0);
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15126337945600L, 112700);
          try
          {
            d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
            GMTrace.o(15126337945600L, 112700);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.JsApiHandler", "onSearchInputConfirm fail, ex = %s", new Object[] { localException.getMessage() });
            GMTrace.o(15126337945600L, 112700);
          }
        }
      });
      GMTrace.o(19454188584960L, 144945);
      return;
    }
    catch (JSONException paramString1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.JsApiHandler", paramString1, "", new Object[0]);
      }
    }
  }
  
  public final void a(final String paramString, final Map<String, Object> paramMap, JSONObject paramJSONObject)
  {
    GMTrace.i(19453920149504L, 144943);
    if ((!this.rSa) || ((paramMap == null) && (paramJSONObject == null)))
    {
      w.e("MicroMsg.JsApiHandler", "onSendEventToJSBridge fail, event=%s", new Object[] { paramString });
      GMTrace.o(19453920149504L, 144943);
      return;
    }
    String str1;
    String str2;
    if (paramMap == null)
    {
      str1 = "";
      if (paramJSONObject != null) {
        break label144;
      }
      str2 = "";
      label67:
      w.i("MicroMsg.JsApiHandler", "onSendEventToJSBridge success, event=%s, params=%s, jsonParams=%s", new Object[] { paramString, str1, str2 });
      if (paramMap == null) {
        break label153;
      }
    }
    label144:
    label153:
    for (paramMap = i.a.a(paramString, paramMap, this.rSc, this.rSd);; paramMap = i.a.a(paramString, paramJSONObject, this.rSc, this.rSd))
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12159186632704L, 90593);
          try
          {
            d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + paramMap + ")", null);
            GMTrace.o(12159186632704L, 90593);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.JsApiHandler", "onSendEventToJSBridge fail, event=%s, ex=%s", new Object[] { paramString, localException.getMessage() });
            GMTrace.o(12159186632704L, 90593);
          }
        }
      });
      GMTrace.o(19453920149504L, 144943);
      return;
      str1 = paramMap.toString();
      break;
      str2 = paramJSONObject.toString();
      break label67;
    }
  }
  
  public final void a(String paramString1, boolean paramBoolean, String paramString2, String paramString3)
  {
    GMTrace.i(19453383278592L, 144939);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback fail, not ready");
      GMTrace.o(19453383278592L, 144939);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback success, ready");
    HashMap localHashMap = new HashMap();
    localHashMap.put("eventId", paramString1);
    localHashMap.put("widgetId", paramString3);
    localHashMap.put("hitTest", Boolean.valueOf(paramBoolean));
    localHashMap.put("err_msg", paramString2);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12135564312576L, 90417);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12135564312576L, 90417);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12135564312576L, 90417);
        }
      }
    });
    GMTrace.o(19453383278592L, 144939);
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, JSONArray paramJSONArray, String paramString8, int paramInt, Map<String, Object> paramMap)
  {
    GMTrace.i(19454054367232L, 144944);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "switchToTabSearch fail, not ready");
      GMTrace.o(19454054367232L, 144944);
      return false;
    }
    w.i("MicroMsg.JsApiHandler", "switchToTabSearch success, ready %s %s %s %s %s", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5 });
    JSONObject localJSONObject = new JSONObject();
    if (paramMap != null)
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (localEntry.getValue() != null) {
          try
          {
            localJSONObject.put((String)localEntry.getKey(), new JSONObject(localEntry.getValue().toString()));
          }
          catch (JSONException localJSONException1)
          {
            try
            {
              localJSONObject.put((String)localEntry.getKey(), new JSONArray(localEntry.getValue().toString()));
            }
            catch (JSONException localJSONException3)
            {
              try
              {
                localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
              }
              catch (JSONException localJSONException2)
              {
                w.printErrStackTrace("MicroMsg.JsApiHandler", localJSONException1, "", new Object[0]);
              }
            }
          }
        }
      }
    }
    try
    {
      localJSONObject.put("type", paramString1);
      localJSONObject.put("isMostSearchBiz", paramString2);
      localJSONObject.put("isSug", paramString3);
      localJSONObject.put("isLocalSug", paramString5);
      localJSONObject.put("scene", paramString4);
      localJSONObject.put("query", paramString6);
      localJSONObject.put("custom", paramString7);
      localJSONObject.put("tagList", paramJSONArray);
      localJSONObject.put("isBackButtonClick", 0);
      localJSONObject.put("sugId", paramString8);
      localJSONObject.put("sugClickType", paramInt);
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12145899077632L, 90494);
          try
          {
            d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
            GMTrace.o(12145899077632L, 90494);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.JsApiHandler", "switchToTabSearch fail, ex = %s", new Object[] { localException.getMessage() });
            GMTrace.o(12145899077632L, 90494);
          }
        }
      });
      GMTrace.o(19454054367232L, 144944);
      return true;
    }
    catch (JSONException paramString1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.JsApiHandler", paramString1, "", new Object[0]);
      }
    }
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Map<String, Object> paramMap1, Map<String, Object> paramMap2)
  {
    GMTrace.i(19453785931776L, 144942);
    localJSONObject = new JSONObject();
    if (paramMap2 != null)
    {
      paramMap2 = paramMap2.entrySet().iterator();
      while (paramMap2.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap2.next();
        if (localEntry.getValue() != null) {
          try
          {
            localJSONObject.put((String)localEntry.getKey(), new JSONObject(localEntry.getValue().toString()));
          }
          catch (JSONException localJSONException1)
          {
            try
            {
              localJSONObject.put((String)localEntry.getKey(), new JSONArray(localEntry.getValue().toString()));
            }
            catch (JSONException localJSONException3)
            {
              try
              {
                localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
              }
              catch (JSONException localJSONException2)
              {
                w.printErrStackTrace("MicroMsg.JsApiHandler", localJSONException1, "", new Object[0]);
              }
            }
          }
        }
      }
    }
    try
    {
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        paramMap2 = (Map.Entry)paramMap1.next();
        localJSONObject.put((String)paramMap2.getKey(), paramMap2.getValue());
      }
      try
      {
        localJSONObject.put("scene", paramString1);
        localJSONObject.put("type", paramString2);
        localJSONObject.put("isSug", paramString3);
        localJSONObject.put("isLocalSug", paramString4);
        localJSONObject.put("sessionId", paramString5);
        a("switchToTabSearch", null, localJSONObject);
        GMTrace.o(19453785931776L, 144942);
        return true;
      }
      catch (JSONException paramString1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.JsApiHandler", paramString1, "", new Object[0]);
        }
      }
    }
    catch (Exception paramMap1)
    {
      w.printErrStackTrace("MicroMsg.JsApiHandler", paramMap1, "", new Object[0]);
    }
  }
  
  public final void aC(int paramInt, String paramString)
  {
    GMTrace.i(16204106301440L, 120730);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onSearchImageListReady fail, not ready");
      GMTrace.o(16204106301440L, 120730);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("ret", Integer.valueOf(paramInt));
    localHashMap.put("data", paramString);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16602732953600L, 123700);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(16602732953600L, 123700);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onSearchImageListReady fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(16602732953600L, 123700);
        }
      }
    });
    GMTrace.o(16204106301440L, 120730);
  }
  
  public final void aG(String paramString, boolean paramBoolean)
  {
    GMTrace.i(12150999351296L, 90532);
    try
    {
      this.ioh.i(paramString, paramBoolean, this.rHv);
      GMTrace.o(12150999351296L, 90532);
      return;
    }
    catch (Exception paramString)
    {
      w.w("MicroMsg.JsApiHandler", "addInvokedJsApiFromMenu, ex = " + paramString);
      GMTrace.o(12150999351296L, 90532);
    }
  }
  
  public final void aH(String paramString, boolean paramBoolean)
  {
    GMTrace.i(16203703648256L, 120727);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onSearchDataReady fail, not ready");
      GMTrace.o(16203703648256L, 120727);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onSearchDataReady success, ready");
    HashMap localHashMap = new HashMap();
    localHashMap.put("json", paramString);
    localHashMap.put("newQuery", Boolean.valueOf(paramBoolean));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12149388738560L, 90520);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12149388738560L, 90520);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onSearchDataReady fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12149388738560L, 90520);
        }
      }
    });
    GMTrace.o(16203703648256L, 120727);
  }
  
  public final void aa(final Map<String, Object> paramMap)
  {
    GMTrace.i(12152744181760L, 90545);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onVoiceRecordEnd fail, not ready");
      GMTrace.o(12152744181760L, 90545);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onVoiceRecordEnd");
    paramMap = i.a.a("onVoiceRecordEnd", paramMap, this.rSc, this.rSd);
    w.i("MicroMsg.JsApiHandler", "onVoiceRecordEnd event : %s", new Object[] { paramMap });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12158112890880L, 90585);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + paramMap + ")", null);
          GMTrace.o(12158112890880L, 90585);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onVoiceRecordEnd fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12158112890880L, 90585);
        }
      }
    });
    GMTrace.o(12152744181760L, 90545);
  }
  
  public final void ab(Map<String, Object> paramMap)
  {
    GMTrace.i(16924318629888L, 126096);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onSelectContact fail, not ready");
      GMTrace.o(16924318629888L, 126096);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onSelectContact success, ready");
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12170058268672L, 90674);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12170058268672L, 90674);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onSelectContact fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12170058268672L, 90674);
        }
      }
    });
    GMTrace.o(16924318629888L, 126096);
  }
  
  public final void b(String paramString1, String paramString2, JSONArray paramJSONArray)
  {
    GMTrace.i(20448607731712L, 152354);
    HashMap localHashMap = new HashMap();
    localHashMap.put("query", paramString1);
    localHashMap.put("custom", paramString2);
    localHashMap.put("tagList", paramJSONArray);
    a("onSearchInputChange", localHashMap, null);
    GMTrace.o(20448607731712L, 152354);
  }
  
  public final void bDi()
  {
    GMTrace.i(12154354794496L, 90557);
    if (this.rRW != null) {
      this.rRW.clear();
    }
    GMTrace.o(12154354794496L, 90557);
  }
  
  public final void bDj()
  {
    GMTrace.i(12154220576768L, 90556);
    if (this.rRX != null) {
      this.rRX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12250052034560L, 91270);
          d locald = d.this;
          while (locald.bFq()) {}
          GMTrace.o(12250052034560L, 91270);
        }
      });
    }
    GMTrace.o(12154220576768L, 90556);
  }
  
  public final void bFn()
  {
    GMTrace.i(12151402004480L, 90535);
    w.v("MicroMsg.JsApiHandler", "doAttachRunOn3rdApis, ready(%s).", new Object[] { Boolean.valueOf(this.rSa) });
    if ((this.rRU != null) && (this.rSa))
    {
      MMWebView localMMWebView = this.rRU;
      StringBuilder localStringBuilder = new StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
      HashMap localHashMap = new HashMap();
      JsapiPermissionWrapper localJsapiPermissionWrapper = this.rSb.bDM();
      LinkedList localLinkedList = new LinkedList();
      if (localJsapiPermissionWrapper != null)
      {
        if (localJsapiPermissionWrapper.eS(88)) {
          localLinkedList.add("menu:share:timeline");
        }
        if (localJsapiPermissionWrapper.eS(89)) {
          localLinkedList.add("menu:share:appmessage");
        }
        if (localJsapiPermissionWrapper.eS(94)) {
          localLinkedList.add("menu:share:qq");
        }
        if (localJsapiPermissionWrapper.eS(109)) {
          localLinkedList.add("menu:share:weiboApp");
        }
        if (localJsapiPermissionWrapper.eS(134)) {
          localLinkedList.add("menu:share:QZone");
        }
        localLinkedList.add("onVoiceRecordEnd");
        localLinkedList.add("onVoicePlayBegin");
        localLinkedList.add("onVoicePlayEnd");
        localLinkedList.add("onLocalImageUploadProgress");
        localLinkedList.add("onImageDownloadProgress");
        localLinkedList.add("onVoiceUploadProgress");
        localLinkedList.add("onVoiceDownloadProgress");
        localLinkedList.add("onVideoUploadProgress");
        localLinkedList.add("onMediaFileUploadProgress");
        localLinkedList.add("menu:setfont");
        localLinkedList.add("menu:share:weibo");
        localLinkedList.add("menu:share:email");
        localLinkedList.add("wxdownload:state_change");
        localLinkedList.add("wxdownload:progress_change");
        localLinkedList.add("hdOnDeviceStateChanged");
        localLinkedList.add("activity:state_change");
        localLinkedList.add("onWXDeviceBluetoothStateChange");
        localLinkedList.add("onWXDeviceLanStateChange");
        localLinkedList.add("onWXDeviceBindStateChange");
        localLinkedList.add("onReceiveDataFromWXDevice");
        localLinkedList.add("onScanWXDeviceResult");
        localLinkedList.add("onWXDeviceStateChange");
        localLinkedList.add("onNfcTouch");
        localLinkedList.add("onBeaconMonitoring");
        localLinkedList.add("onBeaconsInRange");
        localLinkedList.add("menu:custom");
        localLinkedList.add("onSearchWAWidgetOpenApp");
        localLinkedList.add("onSearchDataReady");
        localLinkedList.add("onSearchHistoryReady");
        localLinkedList.add("onSearchWAWidgetOnTapCallback");
        localLinkedList.add("onSearchImageListReady");
        localLinkedList.add("onTeachSearchDataReady");
        localLinkedList.add("onSearchGuideDataReady");
        localLinkedList.add("onSearchInputChange");
        localLinkedList.add("onSearchInputConfirm");
        localLinkedList.add("onSearchSuggestionDataReady");
        localLinkedList.add("onMusicStatusChanged");
        localLinkedList.add("switchToTabSearch");
        localLinkedList.add("onVideoPlayerCallback");
        localLinkedList.add("onSelectContact");
        localLinkedList.add("onSearchWAWidgetAttrChanged");
        localLinkedList.add("onPullDownRefresh");
        localLinkedList.add("onPageStateChange");
        localLinkedList.add("onGetKeyboardHeight");
        localLinkedList.add("onGetSmiley");
        localLinkedList.add("onAddShortcutStatus");
        localLinkedList.add("onFocusSearchInput");
        localLinkedList.add("onGetA8KeyUrl");
        localLinkedList.add("deleteAccountSuccess");
        localLinkedList.add("onGetMsgProofItems");
        localLinkedList.add("WNJSHandlerInsert");
        localLinkedList.add("WNJSHandlerMultiInsert");
        localLinkedList.add("WNJSHandlerExportData");
        localLinkedList.add("WNJSHandlerHeaderAndFooterChange");
        localLinkedList.add("WNJSHandlerEditableChange");
        localLinkedList.add("WNJSHandlerEditingChange");
        localLinkedList.add("WNJSHandlerSaveSelectionRange");
        localLinkedList.add("WNJSHandlerLoadSelectionRange");
        localLinkedList.add("onCustomGameMenuClicked");
        localLinkedList.add("showLoading");
        localLinkedList.add("getSearchEmotionDataCallBack");
        localLinkedList.add("onNavigationBarRightButtonClick");
        localLinkedList.add("onSearchActionSheetClick");
        localLinkedList.add("onGetMatchContactList");
        localLinkedList.add("onNetWorkChange");
        localLinkedList.add("onBackgroundAudioStateChange");
        if (!bg.cc(null)) {
          localLinkedList.addAll(null);
        }
      }
      localHashMap.put("__runOn3rd_apis", new JSONArray(localLinkedList));
      localMMWebView.evaluateJavascript(i.a.a("sys:attach_runOn3rd_apis", localHashMap, this.rSc, this.rSd) + ")", null);
    }
    GMTrace.o(12151402004480L, 90535);
  }
  
  public final void bFo()
  {
    GMTrace.i(16065727823872L, 119699);
    if (this.rRV.size() <= 0)
    {
      w.i("MicroMsg.JsApiHandler", "dealMsgQueue fail, resultValueList is empty");
      GMTrace.o(16065727823872L, 119699);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "dealMsgQueue, pre msgList = " + this.rRW.size());
    List localList = i.a.b((String)this.rRV.remove(0), this.rSc, this.rSd);
    if (!bg.cc(localList))
    {
      this.rRW.addAll(localList);
      w.i("MicroMsg.JsApiHandler", "now msg list size : %d", new Object[] { Integer.valueOf(this.rRW.size()) });
    }
    w.i("MicroMsg.JsApiHandler", "dealMsgQueue, post msgList = " + this.rRW.size());
    bFp();
    if (this.rRX != null) {
      this.rRX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12253273260032L, 91294);
          d.this.bFo();
          GMTrace.o(12253273260032L, 91294);
        }
      });
    }
    GMTrace.o(16065727823872L, 119699);
  }
  
  public final void bFp()
  {
    GMTrace.i(12151536222208L, 90536);
    while (bFq()) {}
    GMTrace.o(12151536222208L, 90536);
  }
  
  boolean bFq()
  {
    GMTrace.i(12151670439936L, 90537);
    if (bg.cc(this.rRW))
    {
      w.i("MicroMsg.JsApiHandler", "dealNextMsg stop, msgList is empty");
      GMTrace.o(12151670439936L, 90537);
      return false;
    }
    boolean bool;
    try
    {
      bool = this.ioh.xE(this.rHv);
      if (bool)
      {
        w.w("MicroMsg.JsApiHandler", "dealNextMsg fail, msgHandler is busy now");
        GMTrace.o(12151670439936L, 90537);
        return false;
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        w.w("MicroMsg.JsApiHandler", "isBusy, ex = " + localException1.getMessage());
        bool = false;
      }
      if (this.rRW.size() == 0)
      {
        w.w("MicroMsg.JsApiHandler", "msgList size is 0.");
        GMTrace.o(12151670439936L, 90537);
        return false;
      }
      i locali = (i)this.rRW.remove(0);
      if (locali == null)
      {
        w.e("MicroMsg.JsApiHandler", "dealNextMsg fail, msg is null");
        GMTrace.o(12151670439936L, 90537);
        return true;
      }
      if ((locali.rUU == null) || (locali.nSp == null) || (locali.type == null) || (this.rRU == null))
      {
        w.e("MicroMsg.JsApiHandler", "dealNextMsg fail, can cause nullpointer, function = " + locali.rUU + ", params = " + locali.nSp + ", type = " + locali.type + ", wv = " + this.rRU);
        GMTrace.o(12151670439936L, 90537);
        return true;
      }
      if ((this.rRZ != null) && (this.rRZ.get("srcUsername") != null) && (!bg.nm(this.rRZ.get("srcUsername").toString()))) {
        locali.nSp.put("src_username", this.rRZ.get("srcUsername").toString());
      }
      if ((this.rRZ != null) && (this.rRZ.get("srcDisplayname") != null) && (!bg.nm(this.rRZ.get("srcDisplayname").toString()))) {
        locali.nSp.put("src_displayname", this.rRZ.get("srcDisplayname").toString());
      }
      if ((this.rRZ != null) && (this.rRZ.get("KTemplateId") != null) && (!bg.nm(this.rRZ.get("KTemplateId").toString()))) {
        locali.nSp.put("tempalate_id", this.rRZ.get("KTemplateId").toString());
      }
      Object localObject1;
      Object localObject2;
      if (this.rRZ != null)
      {
        locali.nSp.put("message_id", this.rRZ.get("message_id"));
        locali.nSp.put("message_index", this.rRZ.get("message_index"));
        locali.nSp.put("webview_scene", this.rRZ.get("scene"));
        locali.nSp.put("pay_channel", this.rRZ.get("pay_channel"));
        locali.nSp.put("pay_scene", this.rRZ.get("pay_scene"));
        locali.nSp.put("stastic_scene", this.rRZ.get("stastic_scene"));
        locali.nSp.put("open_from_scene", this.rRZ.get("from_scence"));
        localObject1 = locali.nSp;
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("__jsapi_fw_ext_info_key_current_url", this.rRU.getUrl());
        ((Map)localObject1).put("__jsapi_fw_ext_info", localObject2);
      }
      if ((!locali.rUU.equals("shareWeibo")) && (!locali.rUU.equals("openUrlByExtBrowser")) && (!locali.rUU.equals("openUrlWithExtraWebview")) && (!locali.rUU.equals("openCustomWebview")) && (!locali.rUU.equals("openGameWebView")) && (!locali.rUU.equals("addToEmoticon")) && (!locali.rUU.equals("shareEmoticon")) && (!locali.rUU.equals("openGameUrlWithExtraWebView")))
      {
        locali.nSp.put("url", this.rRU.getUrl());
        w.i("MicroMsg.JsApiHandler", "cuiqi wv.getUrl" + this.rRU.getUrl());
      }
      if ((locali.rUU.equalsIgnoreCase("openDesignerEmojiView")) || (locali.rUU.equalsIgnoreCase("openEmotionDetailViewLocal")) || (locali.rUU.equalsIgnoreCase("openDesignerEmojiView")) || (locali.rUU.equalsIgnoreCase("openDesignerEmojiViewLocal")) || (locali.rUU.equalsIgnoreCase("openDesignerEmojiView")) || (locali.rUU.equalsIgnoreCase("openDesignerProfile")) || (locali.rUU.equalsIgnoreCase("openDesignerProfileLocal")) || (locali.rUU.equalsIgnoreCase("getSearchEmotionData")))
      {
        locali.nSp.put("searchID", Long.valueOf(bFt()));
        w.d("MicroMsg.JsApiHandler", "emoji search id:%d", new Object[] { Long.valueOf(bFt()) });
      }
      try
      {
        localObject2 = this.rSb.bDM();
        localObject1 = new Bundle();
        if (localObject2 != null) {
          ((JsapiPermissionWrapper)localObject2).toBundle((Bundle)localObject1);
        }
        localObject2 = i.ac(locali.nSp);
        bool = this.ioh.a(locali.type, locali.rUU, locali.rUS, (Bundle)localObject1, (Bundle)localObject2, this.rHv);
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.JsApiHandler", localException2, "", new Object[0]);
          w.w("MicroMsg.JsApiHandler", "handleMsg, ex = " + localException2.getMessage());
          bool = false;
        }
        GMTrace.o(12151670439936L, 90537);
      }
      w.i("MicroMsg.JsApiHandler", "dealNextMsg, %s, handleRet = %s", new Object[] { locali.rUU, Boolean.valueOf(bool) });
      if (!bool)
      {
        GMTrace.o(12151670439936L, 90537);
        return true;
      }
    }
    return false;
  }
  
  public final void bFr()
  {
    GMTrace.i(12152073093120L, 90540);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onSendToFriend fail, not ready");
      GMTrace.o(12152073093120L, 90540);
      return;
    }
    Object localObject = new HashMap();
    ((HashMap)localObject).put("scene", "friend");
    localObject = i.a.a("menu:share:appmessage", (Map)localObject, this.rSc, this.rSd);
    this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + (String)localObject + ")", null);
    try
    {
      this.ioh.E("scene", "friend", this.rHv);
      GMTrace.o(12152073093120L, 90540);
      return;
    }
    catch (Exception localException)
    {
      w.w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + localException.getMessage());
      GMTrace.o(12152073093120L, 90540);
    }
  }
  
  public final void bFs()
  {
    GMTrace.i(12154891665408L, 90561);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onEmojiStoreShowLoading fail, not ready");
      GMTrace.o(12154891665408L, 90561);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onEmojiStoreShowLoading success, ready");
    HashMap localHashMap = new HashMap();
    localHashMap.put("needShow", Boolean.valueOf(true));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18937316114432L, 141094);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(18937316114432L, 141094);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(18937316114432L, 141094);
        }
      }
    });
    GMTrace.o(12154891665408L, 90561);
  }
  
  public final long bFt()
  {
    GMTrace.i(12155696971776L, 90567);
    w.d("MicroMsg.JsApiHandler", "cpan emoji get SearchID:%d", new Object[] { Long.valueOf(this.rSl) });
    long l = this.rSl;
    GMTrace.o(12155696971776L, 90567);
    return l;
  }
  
  public final void cn(String paramString, int paramInt)
  {
    GMTrace.i(12152475746304L, 90543);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onExdeviceStateChange fail, not ready");
      GMTrace.o(12152475746304L, 90543);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onExdeviceStateChange: device id = %s, state = %s", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.JsApiHandler", "parameter error!!!");
      GMTrace.o(12152475746304L, 90543);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("deviceId", paramString);
    if (paramInt == 2) {
      localHashMap.put("state", "connected");
    }
    for (;;)
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12174353235968L, 90706);
          try
          {
            d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
            GMTrace.o(12174353235968L, 90706);
            return;
          }
          catch (Exception localException)
          {
            w.w("MicroMsg.JsApiHandler", "onExdeviceStateChange, %s", new Object[] { localException.getMessage() });
            GMTrace.o(12174353235968L, 90706);
          }
        }
      });
      GMTrace.o(12152475746304L, 90543);
      return;
      if (paramInt == 1) {
        localHashMap.put("state", "connecting");
      } else {
        localHashMap.put("state", "disconnected");
      }
    }
  }
  
  public final void co(String paramString, int paramInt)
  {
    GMTrace.i(12152878399488L, 90546);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onImageUploadProgress fail, not ready");
      GMTrace.o(12152878399488L, 90546);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onImageUploadProgress, local id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    HashMap localHashMap = new HashMap();
    localHashMap.put("localId", paramString);
    localHashMap.put("percent", Integer.valueOf(paramInt));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12242133188608L, 91211);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12242133188608L, 91211);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onLocalImageUploadProgress fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12242133188608L, 91211);
        }
      }
    });
    GMTrace.o(12152878399488L, 90546);
  }
  
  public final void cp(String paramString, int paramInt)
  {
    GMTrace.i(12153012617216L, 90547);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onImageDownloadProgress fail, not ready");
      GMTrace.o(12153012617216L, 90547);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onImageDownloadProgress, serverId id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    HashMap localHashMap = new HashMap();
    localHashMap.put("serverId", paramString);
    localHashMap.put("percent", Integer.valueOf(paramInt));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12134624788480L, 90410);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12134624788480L, 90410);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onImageDownloadProgress fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12134624788480L, 90410);
        }
      }
    });
    GMTrace.o(12153012617216L, 90547);
  }
  
  public final void cq(String paramString, int paramInt)
  {
    GMTrace.i(12153146834944L, 90548);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onVoiceUploadProgress fail, not ready");
      GMTrace.o(12153146834944L, 90548);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onVoiceUploadProgress, local id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    HashMap localHashMap = new HashMap();
    localHashMap.put("localId", paramString);
    localHashMap.put("percent", Integer.valueOf(paramInt));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12257568227328L, 91326);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12257568227328L, 91326);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onVoiceUploadProgress fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12257568227328L, 91326);
        }
      }
    });
    GMTrace.o(12153146834944L, 90548);
  }
  
  public final void cr(String paramString, int paramInt)
  {
    GMTrace.i(12153281052672L, 90549);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onVoiceDownloadProgress fail, not ready");
      GMTrace.o(12153281052672L, 90549);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onVoiceDownloadProgress, serverId id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    HashMap localHashMap = new HashMap();
    localHashMap.put("serverId", paramString);
    localHashMap.put("percent", Integer.valueOf(paramInt));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12149657174016L, 90522);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12149657174016L, 90522);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onVoiceDownloadProgress fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12149657174016L, 90522);
        }
      }
    });
    GMTrace.o(12153281052672L, 90549);
  }
  
  public final void cs(String paramString, int paramInt)
  {
    GMTrace.i(12153415270400L, 90550);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onVideoUploadoadProgress fail, not ready");
      GMTrace.o(12153415270400L, 90550);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onVideoUploadoadProgress, local id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    HashMap localHashMap = new HashMap();
    localHashMap.put("localId", paramString);
    localHashMap.put("percent", Integer.valueOf(paramInt));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12164689559552L, 90634);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12164689559552L, 90634);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onVideoUploadoadProgress fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12164689559552L, 90634);
        }
      }
    });
    GMTrace.o(12153415270400L, 90550);
  }
  
  final String ct(String paramString, int paramInt)
  {
    GMTrace.i(16601659211776L, 123692);
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("url", paramString);
    localHashMap.put("set_cookie", Integer.valueOf(paramInt));
    paramString = Mv(i.a.a("onGetA8KeyUrl", localHashMap, this.rSc, this.rSd));
    GMTrace.o(16601659211776L, 123692);
    return paramString;
  }
  
  public final void cu(String paramString, int paramInt)
  {
    GMTrace.i(16204374736896L, 120732);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onMusicStatusChanged fail, not ready");
      GMTrace.o(16204374736896L, 120732);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onMusicStatusChanged success, ready");
    HashMap localHashMap = new HashMap();
    localHashMap.put("snsid", paramString);
    localHashMap.put("status", Integer.valueOf(paramInt));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18936645025792L, 141089);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(18936645025792L, 141089);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onMusicStatusChanged fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(18936645025792L, 141089);
        }
      }
    });
    GMTrace.o(16204374736896L, 120732);
  }
  
  public final void d(int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(16204240519168L, 120731);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onTeachSearchDataReady fail, not ready");
      GMTrace.o(16204240519168L, 120731);
      return;
    }
    w.i("MicroMsg.JsApiHandler", "onTeachSearchDataReady success, ready");
    HashMap localHashMap = new HashMap();
    localHashMap.put("requestType", Integer.valueOf(paramInt1));
    localHashMap.put("json", paramString);
    localHashMap.put("isCacheData", Integer.valueOf(paramInt2));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16925795024896L, 126107);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(16925795024896L, 126107);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onTeachSearchDataReady fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(16925795024896L, 126107);
        }
      }
    });
    GMTrace.o(16204240519168L, 120731);
  }
  
  public final void detach()
  {
    GMTrace.i(12151804657664L, 90538);
    this.rSa = false;
    this.rRW.clear();
    this.rRV.clear();
    this.rRX = null;
    GMTrace.o(12151804657664L, 90538);
  }
  
  public final void f(Bundle paramBundle, String paramString)
  {
    GMTrace.i(16601390776320L, 123690);
    if ((!this.rSa) || (paramBundle == null))
    {
      w.e("MicroMsg.JsApiHandler", "onDownloadStateChange fail, not ready");
      GMTrace.o(16601390776320L, 123690);
      return;
    }
    long l = paramBundle.getLong("download_manager_downloadid");
    String str = paramBundle.getString("download_manager_appid", "");
    int i = paramBundle.getInt("download_manager_errcode");
    w.i("MicroMsg.JsApiHandler", "onDownloadStateChange, downloadId = " + l + ", state = " + paramString + ", errCode = " + i);
    paramBundle = new HashMap();
    paramBundle.put("appid", str);
    paramBundle.put("download_id", Long.valueOf(l));
    paramBundle.put("err_code", Integer.valueOf(i));
    paramBundle.put("state", paramString);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12145630642176L, 90492);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12145630642176L, 90492);
          return;
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.JsApiHandler", "onDownloadStateChange, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12145630642176L, 90492);
        }
      }
    });
    GMTrace.o(16601390776320L, 123690);
  }
  
  public final void g(String paramString, long paramLong, int paramInt)
  {
    GMTrace.i(12152341528576L, 90542);
    if (!this.rSa)
    {
      w.e("MicroMsg.JsApiHandler", "onDownloadStateChange fail, not ready");
      GMTrace.o(12152341528576L, 90542);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("appid", paramString);
    localHashMap.put("download_id", Long.valueOf(paramLong));
    localHashMap.put("progress", Integer.valueOf(paramInt));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12247367680000L, 91250);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12247367680000L, 91250);
          return;
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.JsApiHandler", "onDownloadStateChange, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12247367680000L, 91250);
        }
      }
    });
    GMTrace.o(12152341528576L, 90542);
  }
  
  public final void jD(boolean paramBoolean)
  {
    GMTrace.i(18158719074304L, 135293);
    HashMap localHashMap = new HashMap();
    localHashMap.put("success", Boolean.valueOf(paramBoolean));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12179050856448L, 90741);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12179050856448L, 90741);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onGetSmiley fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12179050856448L, 90741);
        }
      }
    });
    GMTrace.o(18158719074304L, 135293);
  }
  
  public final void jE(boolean paramBoolean)
  {
    GMTrace.i(12154757447680L, 90560);
    w.i("MicroMsg.JsApiHandler", "getHtmlContent, ready(%s).", new Object[] { Boolean.valueOf(this.rSa) });
    if ((this.rRU != null) && (this.ioh != null) && (this.rSa)) {
      if (paramBoolean)
      {
        this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + i.a.a("sys:get_html_content", new HashMap(), this.rSc, this.rSd) + ")", null);
        GMTrace.o(12154757447680L, 90560);
        return;
      }
    }
    try
    {
      List localList = this.ioh.bDw();
      Uri localUri = Uri.parse(this.rRU.getUrl());
      if (localUri != null) {
        w.d("MicroMsg.JsApiHandler", "wv hijack url host" + localUri.getHost());
      }
      if ((localList != null) && (localUri != null) && (localList.contains(localUri.getHost()))) {
        this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + i.a.a("sys:get_html_content", new HashMap(), this.rSc, this.rSd) + ")", null);
      }
      GMTrace.o(12154757447680L, 90560);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.JsApiHandler", localRemoteException, "", new Object[0]);
        Object localObject = null;
      }
    }
  }
  
  public final void keep_setReturnValue(String paramString1, String paramString2)
  {
    GMTrace.i(12151938875392L, 90539);
    w.i("MicroMsg.JsApiHandler", "setResultValue, scene = " + paramString1 + ", resultValue = " + paramString2);
    w.i("MicroMsg.JsApiHandler", "edw setResultValue = threadId = " + Thread.currentThread().getId() + ", threadName = " + Thread.currentThread().getName());
    Message localMessage;
    if (this.rRX != null)
    {
      localMessage = Message.obtain();
      localMessage.obj = paramString2;
      if (!paramString1.equals("SCENE_FETCHQUEUE")) {
        break label135;
      }
      localMessage.what = 1;
    }
    for (;;)
    {
      this.rRX.sendMessage(localMessage);
      GMTrace.o(12151938875392L, 90539);
      return;
      label135:
      if (paramString1.equals("SCENE_HANDLEMSGFROMWX")) {
        localMessage.what = 2;
      }
    }
  }
  
  public final void m(final String paramString, final Map<String, String> paramMap)
  {
    GMTrace.i(16601524994048L, 123691);
    w.d("MicroMsg.JsApiHandler", "onGetA8KeyUrl, fullUrl = %s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      GMTrace.o(16601524994048L, 123691);
      return;
    }
    this.rSf = paramString;
    if ((paramMap != null) && (paramMap.size() != 0)) {}
    for (this.rSg = 1;; this.rSg = 0)
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15123787808768L, 112681);
          try
          {
            if ((paramMap == null) || (paramMap.size() == 0)) {
              break label194;
            }
            c.io(ab.getContext());
            com.tencent.xweb.b localb = com.tencent.xweb.b.crS();
            Iterator localIterator = paramMap.keySet().iterator();
            while (localIterator.hasNext())
            {
              String str = (String)localIterator.next();
              localb.setCookie(bg.SP(paramString), str + "=" + (String)paramMap.get(str));
            }
            localException.setCookie(bg.SP(paramString), "httponly");
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.JsApiHandler", "onGetA8KeyUrl fail, ex = %s", new Object[] { localException.getMessage() });
            GMTrace.o(15123787808768L, 112681);
            return;
          }
          c.crU();
          c.sync();
          w.i("MicroMsg.JsApiHandler", "cookies:%s", new Object[] { localException.getCookie(bg.SP(paramString)) });
          label194:
          d.this.rRU.evaluateJavascript(String.format("javascript:(function(){ window.getA8KeyUrl='%s'; })()", new Object[] { paramString }), null);
          d.this.rRU.evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", null);
          if (d.this.rSa)
          {
            d.this.rRU.evaluateJavascript(this.rSn, null);
            d.this.rSf = null;
            d.this.rSg = 0;
          }
          GMTrace.o(15123787808768L, 112681);
        }
      });
      GMTrace.o(16601524994048L, 123691);
      return;
    }
  }
  
  public final void yk(int paramInt)
  {
    GMTrace.i(18962414829568L, 141281);
    HashMap localHashMap = new HashMap();
    localHashMap.put("height", Integer.valueOf(a.Y(ab.getContext(), paramInt)));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12247099244544L, 91248);
        try
        {
          d.this.rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.hXw + ")", null);
          GMTrace.o(12247099244544L, 91248);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiHandler", "onGetKeyboardHeight fail, ex = %s", new Object[] { localException.getMessage() });
          GMTrace.o(12247099244544L, 91248);
        }
      }
    });
    GMTrace.o(18962414829568L, 141281);
  }
  
  public final boolean zE(String paramString)
  {
    GMTrace.i(12151133569024L, 90533);
    if (bg.nm(paramString))
    {
      GMTrace.o(12151133569024L, 90533);
      return false;
    }
    boolean bool = s.eK(paramString, "weixin://dispatch_message/");
    GMTrace.o(12151133569024L, 90533);
    return bool;
  }
  
  public final boolean zF(String paramString)
  {
    GMTrace.i(12151267786752L, 90534);
    this.rRU.evaluateJavascript("javascript:WeixinJSBridge._fetchQueue()", null);
    GMTrace.o(12151267786752L, 90534);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */