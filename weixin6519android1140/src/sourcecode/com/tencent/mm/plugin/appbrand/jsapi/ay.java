package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ay
  extends a
{
  public static final int CTRL_INDEX = 192;
  public static final String NAME = "openSetting";
  
  public ay()
  {
    GMTrace.i(10324161855488L, 76921);
    GMTrace.o(10324161855488L, 76921);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10324296073216L, 76922);
    w.d("MicroMsg.JsApiOpenSetting", "jumpToSettingView!");
    Object localObject = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiOpenSetting", "config is null!");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10324296073216L, 76922);
      return;
    }
    paramJSONObject = a(paramj);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiOpenSetting", "mmActivity is null, invoke fail!");
      GMTrace.o(10324296073216L, 76922);
      return;
    }
    paramJSONObject.vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(10415161475072L, 77599);
        if (paramAnonymousInt1 == 1) {
          if (paramAnonymousIntent == null) {
            break label144;
          }
        }
        label144:
        for (paramAnonymousIntent = paramAnonymousIntent.getStringExtra("key_app_authorize_state");; paramAnonymousIntent = "") {
          try
          {
            paramAnonymousIntent = new JSONArray(paramAnonymousIntent);
            localJSONObject = new JSONObject();
          }
          catch (JSONException paramAnonymousIntent)
          {
            try
            {
              JSONObject localJSONObject;
              localJSONObject.put("errMsg", ay.this.getName() + ":ok");
              localJSONObject.put("authSetting", paramAnonymousIntent);
              paramj.v(paramInt, localJSONObject.toString());
              GMTrace.o(10415161475072L, 77599);
              return;
              paramAnonymousIntent = paramAnonymousIntent;
              paramAnonymousIntent = new JSONArray();
            }
            catch (JSONException paramAnonymousIntent)
            {
              for (;;)
              {
                w.e("MicroMsg.JsApiOpenSetting", "set json error!");
                w.printErrStackTrace("MicroMsg.JsApiOpenSetting", paramAnonymousIntent, "", new Object[0]);
              }
            }
          }
        }
      }
    };
    localObject = ((AppBrandSysConfig)localObject).eAr;
    paramj = new Intent(paramj.mContext, AppBrandAuthorizeUI.class).putExtra("key_username", (String)localObject);
    paramj.putExtra("key_app_authorize_jsapi", true);
    com.tencent.mm.bj.d.b(paramJSONObject, "appbrand", ".ui.AppBrandAuthorizeUI", paramj, 1);
    GMTrace.o(10324296073216L, 76922);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */