package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public final class al
  extends a
{
  public static final int CTRL_BYTE = 252;
  public static final String NAME = "previewVideo";
  
  public al()
  {
    GMTrace.i(17053033431040L, 127055);
    GMTrace.o(17053033431040L, 127055);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17053167648768L, 127056);
    w.i("MicroMsg.GameJsApiPreviewVideo", "invoke");
    if ((paramJSONObject == null) || (bg.nm(paramJSONObject.optString("localId"))))
    {
      w.i("MicroMsg.GameJsApiPreviewVideo", "data is invalid");
      paramd.v(paramInt, a.d("previewVideo:fail_invalid_data", null));
      GMTrace.o(17053167648768L, 127056);
      return;
    }
    Object localObject = paramJSONObject.optString("localId");
    paramJSONObject = com.tencent.mm.plugin.game.gamewebview.a.d.zm((String)localObject);
    if ((paramJSONObject == null) || (TextUtils.isEmpty(paramJSONObject.hOo)) || (!e.aZ(paramJSONObject.hOo)))
    {
      w.e("MicroMsg.GameJsApiPreviewVideo", "the item is null or the File item not exist for localId: %s", new Object[] { localObject });
      paramd.v(paramInt, a.d("previewVideo:fail", null));
      GMTrace.o(17053167648768L, 127056);
      return;
    }
    localObject = new Intent();
    ((Intent)localObject).putExtra("key_video_path", paramJSONObject.hOo);
    paramJSONObject = paramd.aEo();
    paramJSONObject.vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(17048335810560L, 127020);
        if (paramAnonymousInt1 == (al.this.hashCode() & 0xFFFF)) {}
        switch (paramAnonymousInt2)
        {
        default: 
          paramAnonymousIntent = paramd;
          paramAnonymousInt1 = paramInt;
          localal = al.this;
          paramAnonymousIntent.v(paramAnonymousInt1, a.d("previewVideo:fail", null));
          GMTrace.o(17048335810560L, 127020);
          return;
        case 0: 
          paramAnonymousIntent = paramd;
          paramAnonymousInt1 = paramInt;
          localal = al.this;
          paramAnonymousIntent.v(paramAnonymousInt1, a.d("previewVideo:cancel", null));
          GMTrace.o(17048335810560L, 127020);
          return;
        }
        paramAnonymousIntent = paramd;
        paramAnonymousInt1 = paramInt;
        al localal = al.this;
        paramAnonymousIntent.v(paramAnonymousInt1, a.d("previewVideo:ok", null));
        GMTrace.o(17048335810560L, 127020);
      }
    };
    com.tencent.mm.bj.d.b(paramJSONObject, "card", ".ui.CardGiftVideoUI", (Intent)localObject, hashCode() & 0xFFFF);
    GMTrace.o(17053167648768L, 127056);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */