package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class aw
  extends a
{
  public static final int CTRL_INDEX = 247;
  public static final String NAME = "openDeliveryList";
  
  public aw()
  {
    GMTrace.i(16369999413248L, 121966);
    GMTrace.o(16369999413248L, 121966);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(16370133630976L, 121967);
    paramJSONObject = paramJSONObject.optString("query");
    if (bg.nm(paramJSONObject))
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(16370133630976L, 121967);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", "https://mp.weixin.qq.com/bizmall/expressentry" + paramJSONObject);
    localIntent.putExtra("show_native_web_view", true);
    localIntent.putExtra("KRightBtn", true);
    if (paramj.mContext != null)
    {
      com.tencent.mm.bj.d.b(paramj.mContext, "webview", ".ui.tools.WebViewUI", localIntent);
      paramj.v(paramInt, d("ok", null));
      GMTrace.o(16370133630976L, 121967);
      return;
    }
    paramj.v(paramInt, d("fail", null));
    GMTrace.o(16370133630976L, 121967);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */