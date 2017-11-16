package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class n
  extends JsApiUploadWeRunData
{
  public static final int CTRL_INDEX = 324;
  public static final String NAME = "addWeRunData";
  
  public n()
  {
    GMTrace.i(19711483969536L, 146862);
    GMTrace.o(19711483969536L, 146862);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19711618187264L, 146863);
    w.d("MicroMsg.JsApiAddWeRunData", "JsApiAddWeRunData!");
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiAddWeRunData", "data is null");
      GMTrace.o(19711618187264L, 146863);
      return;
    }
    a(this, paramj, paramInt, paramJSONObject.optInt("step"), true);
    GMTrace.o(19711618187264L, 146863);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */