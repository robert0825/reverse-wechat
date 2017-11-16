package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.protocal.c.ps;
import com.tencent.mm.protocal.c.pt;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 206;
  public static final String NAME = "deleteUserAutoFillData";
  
  public b()
  {
    GMTrace.i(19761278746624L, 147233);
    GMTrace.o(19761278746624L, 147233);
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19761412964352L, 147234);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData data is invalid");
      paramAppBrandPageView.v(paramInt, d("fail:data is invalid", null));
      GMTrace.o(19761412964352L, 147234);
      return;
    }
    String str = paramJSONObject.optString("groupKey");
    int i = paramJSONObject.optInt("groupId", 0);
    if (TextUtils.isEmpty(str))
    {
      w.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData groupKey is invalid");
      paramAppBrandPageView.v(paramInt, d("fail:groupKey is invalid", null));
      GMTrace.o(19761412964352L, 147234);
      return;
    }
    paramJSONObject = paramAppBrandPageView.hyD;
    w.i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData appId:%s, groupId:%d, groupKey:%s", new Object[] { paramJSONObject, Integer.valueOf(i), str });
    Object localObject = new com.tencent.mm.ad.b.a();
    ((com.tencent.mm.ad.b.a)localObject).gtF = new ps();
    ((com.tencent.mm.ad.b.a)localObject).gtG = new pt();
    ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo";
    ((com.tencent.mm.ad.b.a)localObject).gtE = 1194;
    ((com.tencent.mm.ad.b.a)localObject).gtH = 0;
    ((com.tencent.mm.ad.b.a)localObject).gtI = 0;
    localObject = ((com.tencent.mm.ad.b.a)localObject).DA();
    ps localps = (ps)((com.tencent.mm.ad.b)localObject).gtC.gtK;
    localps.ufN = str;
    localps.eSd = paramJSONObject;
    localps.ufO = i;
    localps.cfz = 1;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ad.b)localObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
      {
        GMTrace.i(19765171060736L, 147262);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.gtD.gtK == null))
        {
          w.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.gtD.gtK });
          paramAppBrandPageView.v(paramInt, b.this.d("fail:cgi fail", null));
          GMTrace.o(19765171060736L, 147262);
          return;
        }
        w.i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData success");
        paramAppBrandPageView.v(paramInt, b.this.d("ok", null));
        GMTrace.o(19765171060736L, 147262);
      }
    });
    GMTrace.o(19761412964352L, 147234);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */