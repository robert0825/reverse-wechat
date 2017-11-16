package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.c;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.d;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.aiy;
import com.tencent.mm.protocal.c.aje;
import com.tencent.mm.protocal.c.ajf;
import com.tencent.mm.protocal.c.bnd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ak
  extends a
{
  public static final int CTRL_BYTE = -3;
  public static final String NAME = "preVerifyJSAPI";
  
  public ak()
  {
    GMTrace.i(17032363900928L, 126901);
    GMTrace.o(17032363900928L, 126901);
  }
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17032498118656L, 126902);
    w.i("MicroMsg.GameJsApiPreVerify", "invoke");
    String str1 = paramJSONObject.optString("verifyAppId");
    String str2 = paramJSONObject.optString("verifySignature");
    String str3 = paramJSONObject.optString("verifyNonceStr");
    String str4 = paramJSONObject.optString("verifyTimestamp");
    String str5 = paramJSONObject.optString("verifySignType");
    Object localObject1 = paramJSONObject.optJSONArray("verifyJsApiList");
    w.i("MicroMsg.GameJsApiPreVerify", "appid : %s, %s, %s, %s, %s", new Object[] { str1, str2, str3, str4, str5 });
    paramJSONObject = paramd.aEr();
    LinkedList localLinkedList = new LinkedList();
    try
    {
      w.i("MicroMsg.GameJsApiPreVerify", "jsItem length %s", new Object[] { Integer.valueOf(((JSONArray)localObject1).length()) });
      if (((JSONArray)localObject1).length() == 0)
      {
        paramd.v(paramInt, "checkJsApi:param is empty");
        GMTrace.o(17032498118656L, 126902);
        return;
      }
      int i = 0;
      while (i < ((JSONArray)localObject1).length())
      {
        localObject2 = ((JSONArray)localObject1).getString(i);
        if (!bg.nm((String)localObject2)) {
          localLinkedList.add(localObject2);
        }
        i += 1;
      }
      if (bg.nm(str1)) {
        break label270;
      }
    }
    catch (Exception paramJSONObject)
    {
      w.w("MicroMsg.GameJsApiPreVerify", "exception occur " + paramJSONObject.getMessage());
      paramd.v(paramInt, "pre_verify_jsapi:fail");
      GMTrace.o(17032498118656L, 126902);
      return;
    }
    if ((localLinkedList.size() <= 0) || (bg.nm(paramJSONObject)))
    {
      label270:
      w.e("MicroMsg.GameJsApiPreVerify", "handlePreVerify wrong args, %s", new Object[] { str1 });
      paramd.v(paramInt, a.d("pre_verify_jsapi:fail_invalid_args", null));
      GMTrace.o(17032498118656L, 126902);
      return;
    }
    localObject1 = new com.tencent.mm.ad.b.a();
    ((com.tencent.mm.ad.b.a)localObject1).gtF = new aje();
    ((com.tencent.mm.ad.b.a)localObject1).gtG = new ajf();
    ((com.tencent.mm.ad.b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/jsapi-preverify";
    ((com.tencent.mm.ad.b.a)localObject1).gtE = 1093;
    ((com.tencent.mm.ad.b.a)localObject1).gtH = 0;
    ((com.tencent.mm.ad.b.a)localObject1).gtI = 0;
    localObject1 = ((com.tencent.mm.ad.b.a)localObject1).DA();
    Object localObject2 = (aje)((com.tencent.mm.ad.b)localObject1).gtC.gtK;
    ((aje)localObject2).url = paramJSONObject;
    ((aje)localObject2).eSd = str1;
    ((aje)localObject2).uym = localLinkedList;
    ((aje)localObject2).eDJ = str4;
    ((aje)localObject2).uxY = str3;
    ((aje)localObject2).signature = str2;
    ((aje)localObject2).uxZ = str5;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ad.b)localObject1, new a(paramd, paramInt, str1));
    GMTrace.o(17032498118656L, 126902);
  }
  
  private static final class a
    implements com.tencent.mm.ipcinvoker.wx_extension.b.a
  {
    private String appId;
    private int hYL;
    private com.tencent.mm.plugin.game.gamewebview.ui.d lGz;
    
    a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, int paramInt, String paramString)
    {
      GMTrace.i(20361500426240L, 151705);
      this.lGz = paramd;
      this.hYL = paramInt;
      this.appId = paramString;
      GMTrace.o(20361500426240L, 151705);
    }
    
    private void qp(String paramString)
    {
      GMTrace.i(20361768861696L, 151707);
      this.lGz.v(this.hYL, paramString);
      this.lGz = null;
      this.appId = null;
      GMTrace.o(20361768861696L, 151707);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.b paramb)
    {
      GMTrace.i(20361634643968L, 151706);
      if (this.lGz == null)
      {
        GMTrace.o(20361634643968L, 151706);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.GameJsApiPreVerify", "errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        qp(com.tencent.mm.plugin.game.gamewebview.a.d.zl("pre_verify_jsapi:fail_" + paramString));
        GMTrace.o(20361634643968L, 151706);
        return;
      }
      paramb = (ajf)paramb.gtD.gtK;
      if ((paramb == null) || (paramb.uyc == null) || (paramb.uyc.eGy != 0))
      {
        qp(com.tencent.mm.plugin.game.gamewebview.a.d.zl("pre_verify_jsapi:fail_" + paramString));
        GMTrace.o(20361634643968L, 151706);
        return;
      }
      paramString = this.lGz;
      Object localObject = this.appId;
      if ((!bg.nm((String)localObject)) && (!bg.nm(paramString.aEr()))) {
        paramString.lKb.put(com.tencent.mm.plugin.game.gamewebview.ui.d.zB(paramString.aEr()), localObject);
      }
      paramString = new c.d();
      paramString.appId = this.appId;
      paramString.rRS = paramb.uyp;
      localObject = this.lGz;
      if (!bg.nm(((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject).aEr())) {
        ((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject).lKc.put(((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject).aEr(), paramString);
      }
      paramb = paramb.uyo;
      paramString = this.lGz;
      if (paramString.lJA != null) {}
      for (paramString = paramString.lJA.Mf(paramString.aEr()); paramString == null; paramString = null)
      {
        qp(com.tencent.mm.plugin.game.gamewebview.a.d.zl("pre_verify_jsapi:ok"));
        GMTrace.o(20361634643968L, 151706);
        return;
      }
      if (!bg.cc(paramb))
      {
        paramb = paramb.iterator();
        while (paramb.hasNext())
        {
          localObject = (bnd)paramb.next();
          c localc = (c)com.tencent.mm.plugin.game.gamewebview.jsapi.d.aDS().get(((bnd)localObject).uxW);
          if ((localc != null) && (paramString.zN(localc.aDO()) != ((bnd)localObject).state)) {
            paramString.a(localc.aDO(), (byte)((bnd)localObject).state);
          }
        }
      }
      qp(com.tencent.mm.plugin.game.gamewebview.a.d.zl("pre_verify_jsapi:ok"));
      GMTrace.o(20361634643968L, 151706);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */