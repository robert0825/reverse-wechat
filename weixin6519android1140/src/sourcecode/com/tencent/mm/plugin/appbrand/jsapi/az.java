package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class az
  extends a
{
  public static final int CTRL_INDEX = 201;
  public static final String NAME = "openUrl";
  
  public az()
  {
    GMTrace.i(14338211446784L, 106828);
    GMTrace.o(14338211446784L, 106828);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14338345664512L, 106829);
    paramJSONObject = paramJSONObject.optString("url");
    if (bg.nm(paramJSONObject))
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14338345664512L, 106829);
      return;
    }
    paramJSONObject = new Intent().putExtra("rawUrl", paramJSONObject).putExtra("appbrand_report_key_target_url", paramJSONObject);
    if (paramj.mContext != null)
    {
      com.tencent.mm.bj.d.b(paramj.mContext, "webview", ".ui.tools.WebViewUI", paramJSONObject);
      paramj.v(paramInt, d("ok", null));
      GMTrace.o(14338345664512L, 106829);
      return;
    }
    paramj.v(paramInt, d("fail", null));
    GMTrace.o(14338345664512L, 106829);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */