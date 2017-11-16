package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ad;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.xweb.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class w
  extends a
{
  public static final int CTRL_BYTE = 1;
  public static final String NAME = "imagePreview";
  
  public w()
  {
    GMTrace.i(17033974513664L, 126913);
    GMTrace.o(17033974513664L, 126913);
  }
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17034108731392L, 126914);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameJsApiSendAppMessage", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.aEo();
    if (localGameWebViewUI == null)
    {
      GMTrace.o(17034108731392L, 126914);
      return;
    }
    if (paramJSONObject == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameJsApiSendAppMessage", "fail, data is null");
      paramd.v(paramInt, a.d("imagePreview:fail_invalid_data", null));
      GMTrace.o(17034108731392L, 126914);
      return;
    }
    Object localObject1 = paramJSONObject.optString("current");
    Object localObject3 = paramJSONObject.optJSONArray("urls");
    ArrayList localArrayList = new ArrayList();
    if ((localObject3 == null) || (((JSONArray)localObject3).length() == 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameJsApiSendAppMessage", "fail, urls is null");
      paramd.v(paramInt, a.d("imagePreview:fail_invalid_url", null));
      GMTrace.o(17034108731392L, 126914);
      return;
    }
    int i = 0;
    if (i < ((JSONArray)localObject3).length())
    {
      localObject2 = ((JSONArray)localObject3).optString(i);
      if ((bg.nm((String)localObject2)) || (((String)localObject2).equalsIgnoreCase("null"))) {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameJsApiSendAppMessage", "null url, i = %d", new Object[] { Integer.valueOf(i) });
      }
      for (;;)
      {
        i += 1;
        break;
        paramJSONObject = (JSONObject)localObject2;
        if (bg.nl((String)localObject2).startsWith("weixin://resourceid/"))
        {
          paramJSONObject = f.bCW().Lk((String)localObject2);
          if (paramJSONObject != null) {
            paramJSONObject = paramJSONObject.hOo;
          }
        }
        else
        {
          localArrayList.add(paramJSONObject);
        }
      }
    }
    Object localObject2 = (String[])localArrayList.toArray(new String[localArrayList.size()]);
    if (bg.nm((String)localObject1)) {
      paramJSONObject = localObject2[0];
    }
    for (;;)
    {
      localObject1 = new Intent();
      localObject3 = b.crS().getCookie(paramd.aEr());
      if (!bg.nm((String)localObject3)) {
        ((Intent)localObject1).putExtra("cookie", (String)localObject3);
      }
      ((Intent)localObject1).putExtra("nowUrl", paramJSONObject);
      ((Intent)localObject1).putExtra("urlList", (String[])localObject2);
      ((Intent)localObject1).putExtra("type", 65281);
      ((Intent)localObject1).putExtra("isFromWebView", true);
      com.tencent.mm.bj.d.b(localGameWebViewUI, "subapp", ".ui.gallery.GestureGalleryUI", (Intent)localObject1);
      paramd.v(paramInt, a.d("imagePreview:ok", null));
      GMTrace.o(17034108731392L, 126914);
      return;
      if (((String)localObject1).startsWith("weixin://resourceid/"))
      {
        paramJSONObject = f.bCW().Lk((String)localObject1);
        if (paramJSONObject != null) {
          paramJSONObject = paramJSONObject.hOo;
        } else {
          paramJSONObject = "";
        }
      }
      else
      {
        paramJSONObject = (JSONObject)localObject1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */