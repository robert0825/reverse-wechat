package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class aa
  extends a
{
  public static final int CTRL_INDEX = 169;
  public static final String NAME = "getClipboardData";
  
  public aa()
  {
    GMTrace.i(10361742819328L, 77201);
    GMTrace.o(10361742819328L, 77201);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10361877037056L, 77202);
    paramJSONObject = (ClipboardManager)paramj.mContext.getSystemService("clipboard");
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.JsApiGetClipboardData", "getSystemService(CLIPBOARD_SERVICE) failed.");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10361877037056L, 77202);
      return;
    }
    Object localObject2 = paramJSONObject.getPrimaryClip();
    Object localObject1 = "";
    paramJSONObject = (JSONObject)localObject1;
    if (localObject2 != null)
    {
      paramJSONObject = (JSONObject)localObject1;
      if (((ClipData)localObject2).getItemCount() > 0)
      {
        localObject2 = ((ClipData)localObject2).getItemAt(0);
        paramJSONObject = (JSONObject)localObject1;
        if (((ClipData.Item)localObject2).getText() != null) {
          paramJSONObject = ((ClipData.Item)localObject2).getText().toString();
        }
      }
    }
    w.d("MicroMsg.JsApiGetClipboardData", "stevyang retData %s", new Object[] { paramJSONObject });
    localObject1 = new HashMap();
    ((Map)localObject1).put("data", paramJSONObject);
    paramj.v(paramInt, d("ok", (Map)localObject1));
    GMTrace.o(10361877037056L, 77202);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */