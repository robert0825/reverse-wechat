package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.protocal.c.ael;
import com.tencent.mm.protocal.c.aem;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 204;
  public static final String NAME = "getUserAutoFillData";
  
  public d()
  {
    GMTrace.i(19759131262976L, 147217);
    GMTrace.o(19759131262976L, 147217);
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19759265480704L, 147218);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData data is invalid");
      paramAppBrandPageView.v(paramInt, d("fail:data is invalid", null));
      GMTrace.o(19759265480704L, 147218);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject = paramJSONObject.optJSONArray("fields");
    if ((localObject != null) && (((JSONArray)localObject).length() > 0))
    {
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        localLinkedList.add(((JSONArray)localObject).optString(i));
        i += 1;
      }
    }
    if (localLinkedList.size() == 0)
    {
      w.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData fields is empty");
      paramAppBrandPageView.v(paramInt, d("fail:fields is empty", null));
      GMTrace.o(19759265480704L, 147218);
      return;
    }
    localObject = paramAppBrandPageView.hyD;
    w.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData appId:%s, data:%s", new Object[] { localObject, paramJSONObject.toString() });
    paramJSONObject = new com.tencent.mm.ad.b.a();
    paramJSONObject.gtF = new ael();
    paramJSONObject.gtG = new aem();
    paramJSONObject.uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo";
    paramJSONObject.gtE = 1191;
    paramJSONObject.gtH = 0;
    paramJSONObject.gtI = 0;
    paramJSONObject = paramJSONObject.DA();
    ael localael = (ael)paramJSONObject.gtC.gtK;
    localael.uui = localLinkedList;
    localael.eSd = ((String)localObject);
    localael.uuh = false;
    localael.cfz = 1;
    com.tencent.mm.ipcinvoker.wx_extension.b.a(paramJSONObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
      {
        GMTrace.i(19764097318912L, 147254);
        HashMap localHashMap = new HashMap();
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.gtD.gtK == null))
        {
          w.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.gtD.gtK });
          localHashMap.put("ret", Integer.valueOf(paramAnonymousInt2));
          if (!TextUtils.isEmpty(paramAnonymousString))
          {
            paramAppBrandPageView.v(paramInt, d.this.d("fail: ErrMsg:" + paramAnonymousString, localHashMap));
            GMTrace.o(19764097318912L, 147254);
            return;
          }
          paramAppBrandPageView.v(paramInt, d.this.d("fail: ErrMsg: cgi fail", localHashMap));
          GMTrace.o(19764097318912L, 147254);
          return;
        }
        Object localObject = (aem)paramAnonymousb.gtD.gtK;
        w.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData success");
        paramAnonymousString = "";
        if (!TextUtils.isEmpty(((aem)localObject).uuj)) {
          paramAnonymousString = ((aem)localObject).uuj;
        }
        paramAnonymousb = "";
        if (!TextUtils.isEmpty(((aem)localObject).uuk)) {
          paramAnonymousb = ((aem)localObject).uuk;
        }
        paramAnonymousInt1 = ((aem)localObject).tSt;
        localObject = ((aem)localObject).uul;
        w.i("MicroMsg.JsApiGetUserAutoFillData", "auth_info:%s, auth_status:%d", new Object[] { paramAnonymousb, Integer.valueOf(paramAnonymousInt1) });
        w.i("MicroMsg.JsApiGetUserAutoFillData", "user_info_json:%s", new Object[] { paramAnonymousString });
        localHashMap.put("userData", paramAnonymousString);
        localHashMap.put("authStatus", Integer.valueOf(paramAnonymousInt1));
        localHashMap.put("authInfo", paramAnonymousb);
        if ((localObject != null) && (((LinkedList)localObject).size() > 0))
        {
          localHashMap.put("authGroupList", new JSONArray((Collection)localObject));
          w.i("MicroMsg.JsApiGetUserAutoFillData", "authGroupList:%s", new Object[] { new JSONArray((Collection)localObject).toString() });
        }
        paramAppBrandPageView.v(paramInt, d.this.d("ok", localHashMap));
        GMTrace.o(19764097318912L, 147254);
      }
    });
    GMTrace.o(19759265480704L, 147218);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */