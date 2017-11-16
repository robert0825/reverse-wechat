package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

final class ax
  extends a
{
  public static final int CTRL_INDEX = 0;
  public static final String NAME = "openLink";
  
  ax()
  {
    GMTrace.i(10330872741888L, 76971);
    GMTrace.o(10330872741888L, 76971);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10331006959616L, 76972);
    paramJSONObject = paramJSONObject.optString("url");
    if (bg.nm(paramJSONObject))
    {
      paramAppBrandPageView.v(paramInt, d("fail", null));
      GMTrace.o(10331006959616L, 76972);
      return;
    }
    Intent localIntent = new Intent().putExtra("rawUrl", paramJSONObject).putExtra("appbrand_report_key_target_url", paramJSONObject);
    localIntent.putExtra("rawUrl", paramJSONObject);
    com.tencent.mm.bj.d.b(paramAppBrandPageView.mContext, "webview", ".ui.tools.WebViewUI", localIntent);
    paramAppBrandPageView.v(paramInt, d("ok", null));
    GMTrace.o(10331006959616L, 76972);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */