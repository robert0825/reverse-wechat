package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import org.json.JSONObject;

public final class bd
  extends a
{
  public static final int CTRL_BYTE = 237;
  public static final String NAME = "uploadMediaFile";
  public UploadMediaFileHelp lHP;
  private GameWebViewUI lHd;
  
  public bd()
  {
    GMTrace.i(17069944864768L, 127181);
    this.lHP = new UploadMediaFileHelp();
    GMTrace.o(17069944864768L, 127181);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17070079082496L, 127182);
    w.i("MicroMsg.GameJsApiUploadMediaFile", "invoke");
    if (paramJSONObject == null)
    {
      paramd.v(paramInt, a.d("chooseVideo:fail_invalid_data", null));
      GMTrace.o(17070079082496L, 127182);
      return;
    }
    this.lHd = paramd.aEo();
    String str1 = paramJSONObject.optString("appId");
    String str2 = paramJSONObject.optString("localId");
    if (paramJSONObject.optInt("isShowProgressTips", 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.GameJsApiUploadMediaFile", "uploadMediaFile, appid = %s, localid = %s, isShowProgressTips = %b", new Object[] { str1, str2, Boolean.valueOf(bool) });
      if ((!bg.nm(str1)) && (!bg.nm(str2))) {
        break;
      }
      w.e("MicroMsg.GameJsApiUploadMediaFile", "appId or localid is null or nil.");
      paramd.v(paramInt, a.d("uploadMediaFile:fail_missing arguments", null));
      GMTrace.o(17070079082496L, 127182);
      return;
    }
    paramJSONObject = this.lHP;
    GameWebViewUI localGameWebViewUI = this.lHd;
    UploadMediaFileHelp.b local1 = new UploadMediaFileHelp.b()
    {
      public final void a(boolean paramAnonymousBoolean, HashMap<String, Object> paramAnonymousHashMap)
      {
        GMTrace.i(17063233978368L, 127131);
        w.i("MicroMsg.GameJsApiUploadMediaFile", "sucess = %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (paramAnonymousBoolean) {
          paramd.v(paramInt, bd.d("uploadMediaFile:ok", paramAnonymousHashMap));
        }
        for (;;)
        {
          paramAnonymousHashMap = bd.this.lHP;
          paramAnonymousHashMap.hyB = null;
          paramAnonymousHashMap.lHe = null;
          paramAnonymousHashMap.hyD = null;
          paramAnonymousHashMap.lHS = null;
          paramAnonymousHashMap.lHU = null;
          GMTrace.o(17063233978368L, 127131);
          return;
          paramAnonymousHashMap = paramd;
          int i = paramInt;
          bd localbd = bd.this;
          paramAnonymousHashMap.v(i, a.d("uploadMediaFile:fail", null));
        }
      }
    };
    paramJSONObject.hyB = localGameWebViewUI;
    paramJSONObject.lHe = paramd;
    paramJSONObject.hyD = str1;
    paramJSONObject.lHS = str2;
    paramJSONObject.lHT = bool;
    paramJSONObject.lHU = local1;
    paramd = this.lHP;
    paramJSONObject = com.tencent.mm.plugin.game.gamewebview.a.d.zm(paramd.lHS);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.UploadMediaFileHelp", "item is null");
      paramd.lHU.a(false, null);
      GMTrace.o(17070079082496L, 127182);
      return;
    }
    if (paramJSONObject.eGK != 1)
    {
      if ((bg.nm(paramJSONObject.hOo)) || (!e.aZ(paramJSONObject.hOo)))
      {
        w.e("MicroMsg.UploadMediaFileHelp", "origFilePath is not exist");
        paramd.lHU.a(false, null);
        GMTrace.o(17070079082496L, 127182);
        return;
      }
      if (!ab.bv(paramd.hyB))
      {
        paramJSONObject = bg.eL(e.aY(paramJSONObject.hOo));
        h.a(paramd.hyB, paramd.hyB.getString(R.l.eki, new Object[] { paramJSONObject }), paramd.hyB.getString(R.l.cUG), false, new UploadMediaFileHelp.1(paramd), new UploadMediaFileHelp.2(paramd));
        GMTrace.o(17070079082496L, 127182);
        return;
      }
      paramd.aDU();
      GMTrace.o(17070079082496L, 127182);
      return;
    }
    paramd.aDV();
    GMTrace.o(17070079082496L, 127182);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */