package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 191;
  public static final String NAME = "chooseVideo";
  
  public j()
  {
    GMTrace.i(17069005340672L, 127174);
    GMTrace.o(17069005340672L, 127174);
  }
  
  public static void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt1, int paramInt2)
  {
    GMTrace.i(17069273776128L, 127176);
    GameWebViewUI localGameWebViewUI = paramd.aEo();
    if ((localGameWebViewUI == null) || (localGameWebViewUI.isFinishing()))
    {
      w.e("MicroMsg.GameJsApiChooseVideo", "activity is null");
      GMTrace.o(17069273776128L, 127176);
      return;
    }
    int j = 0;
    String str1 = paramJSONObject.optString("sourceType", "");
    String str2 = paramJSONObject.optString("camera", "");
    w.i("MicroMsg.GameJsApiChooseVideo", "doChooseVideo sourceType = %s, camera = %s, isVideoType:%d", new Object[] { str1, str2, Integer.valueOf(paramInt2) });
    int k = paramJSONObject.optInt("maxDuration", 60);
    if (str1.contains("album")) {
      j = 4096;
    }
    int i = j;
    if (str1.contains("camera"))
    {
      if (k <= 0)
      {
        paramd.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseVideo:fail", null));
        GMTrace.o(17069273776128L, 127176);
        return;
      }
      if (str2.equals("front")) {
        i = j | 0x10;
      }
    }
    else
    {
      if (i != 0) {
        break label615;
      }
      i = 4352;
    }
    label368:
    label615:
    for (;;)
    {
      if ((i == 16) || (i == 256) || (i == 4352))
      {
        if (paramInt2 == 1)
        {
          bool = com.tencent.mm.pluginsdk.h.a.a(localGameWebViewUI, "android.permission.CAMERA", 117, "", "");
          w.d("MicroMsg.GameJsApiChooseVideo", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
          if (!bool)
          {
            GMTrace.o(17069273776128L, 127176);
            return;
            i = j | 0x100;
            break;
          }
          bool = com.tencent.mm.pluginsdk.h.a.a(localGameWebViewUI, "android.permission.RECORD_AUDIO", 118, "", "");
          w.d("MicroMsg.GameJsApiChooseVideo", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool) });
          if (bool) {
            break label368;
          }
          GMTrace.o(17069273776128L, 127176);
          return;
        }
        boolean bool = com.tencent.mm.pluginsdk.h.a.a(localGameWebViewUI, "android.permission.CAMERA", 115, "", "");
        w.d("MicroMsg.GameJsApiChooseVideo", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          GMTrace.o(17069273776128L, 127176);
          return;
        }
      }
      j = paramJSONObject.optInt("quality", 1);
      if ((j != 0) && (j != 1)) {
        j = 1;
      }
      for (;;)
      {
        if (k > 60) {
          k = 60;
        }
        for (;;)
        {
          w.i("MicroMsg.GameJsApiChooseVideo", "doChooseVideo real scene = %d, select count = %d, video quality = %d, duration = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(j), Integer.valueOf(k) });
          paramJSONObject = new Intent();
          paramJSONObject.putExtra("key_pick_local_pic_capture", i);
          paramJSONObject.putExtra("key_pick_local_pic_count", 1);
          paramJSONObject.putExtra("key_pick_local_pic_query_source_type", 7);
          paramJSONObject.putExtra("key_pick_local_media_quality", j);
          paramJSONObject.putExtra("key_pick_local_media_duration", k);
          paramJSONObject.putExtra("query_media_type", 2);
          paramJSONObject.putExtra("key_pick_local_media_video_type", paramInt2);
          w.i("MicroMsg.GameJsApiChooseVideo", "doChooseVideo: realScene: %d, count: %d, querySourceType: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(7) });
          localGameWebViewUI.vKC = new MMActivity.a()
          {
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
            {
              GMTrace.i(17033840295936L, 126912);
              Object localObject2;
              if (paramAnonymousInt1 == 45)
              {
                switch (paramAnonymousInt2)
                {
                default: 
                  this.lGP.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("recordVideo:fail", null));
                  GMTrace.o(17033840295936L, 126912);
                  return;
                case 0: 
                  this.lGP.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("recordVideo:cancel", null));
                  GMTrace.o(17033840295936L, 126912);
                  return;
                }
                localObject1 = paramAnonymousIntent.getStringExtra("key_pick_local_media_local_id");
                paramAnonymousIntent = paramAnonymousIntent.getStringExtra("key_pick_local_media_thumb_local_id");
                w.i("MicroMsg.GameJsApiChooseVideo", "localId:%s", new Object[] { localObject1 });
                w.i("MicroMsg.GameJsApiChooseVideo", "thumbLocalId:%s", new Object[] { paramAnonymousIntent });
                if (bg.nm((String)localObject1))
                {
                  this.lGP.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("recordVideo:fail", null));
                  GMTrace.o(17033840295936L, 126912);
                  return;
                }
                localObject2 = com.tencent.mm.plugin.game.gamewebview.a.d.zm((String)localObject1);
                if ((localObject2 != null) && ((localObject2 instanceof WebViewJSSDKVideoItem)))
                {
                  localObject2 = (WebViewJSSDKVideoItem)localObject2;
                  HashMap localHashMap = new HashMap();
                  localHashMap.put("localId", localObject1);
                  localHashMap.put("duration", Integer.valueOf(((WebViewJSSDKVideoItem)localObject2).duration));
                  localHashMap.put("height", Integer.valueOf(((WebViewJSSDKVideoItem)localObject2).height));
                  localHashMap.put("size", Integer.valueOf(((WebViewJSSDKVideoItem)localObject2).size));
                  localHashMap.put("width", Integer.valueOf(((WebViewJSSDKVideoItem)localObject2).width));
                  localHashMap.put("thumbLocalId", paramAnonymousIntent);
                  this.lGP.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("recordVideo:ok", localHashMap));
                  GMTrace.o(17033840295936L, 126912);
                  return;
                }
                this.lGP.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("recordVideo:fail", null));
                GMTrace.o(17033840295936L, 126912);
                return;
              }
              if (paramAnonymousInt1 == 32) {
                switch (paramAnonymousInt2)
                {
                }
              }
              do
              {
                this.lGP.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseVideo:fail", null));
                GMTrace.o(17033840295936L, 126912);
                return;
                this.lGP.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseVideo:cancel", null));
                GMTrace.o(17033840295936L, 126912);
                return;
                paramAnonymousIntent = paramAnonymousIntent.getStringExtra("key_pick_local_media_local_id");
              } while (bg.nm(paramAnonymousIntent));
              Object localObject1 = com.tencent.mm.plugin.game.gamewebview.a.d.zm(paramAnonymousIntent);
              if ((localObject1 != null) && ((localObject1 instanceof WebViewJSSDKVideoItem)))
              {
                localObject1 = (WebViewJSSDKVideoItem)localObject1;
                localObject2 = new HashMap();
                ((HashMap)localObject2).put("localId", paramAnonymousIntent);
                ((HashMap)localObject2).put("duration", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).duration));
                ((HashMap)localObject2).put("height", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).height));
                ((HashMap)localObject2).put("size", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).size));
                ((HashMap)localObject2).put("width", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).width));
                this.lGP.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseVideo:ok", (Map)localObject2));
                GMTrace.o(17033840295936L, 126912);
                return;
              }
              this.lGP.v(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseVideo:fail", null));
              GMTrace.o(17033840295936L, 126912);
            }
          };
          if (paramInt2 == 1)
          {
            com.tencent.mm.bj.d.a(localGameWebViewUI, "webview", ".ui.tools.OpenFileChooserUI", paramJSONObject, 45, false);
            GMTrace.o(17069273776128L, 127176);
            return;
          }
          com.tencent.mm.bj.d.a(localGameWebViewUI, "webview", ".ui.tools.OpenFileChooserUI", paramJSONObject, 32, false);
          GMTrace.o(17069273776128L, 127176);
          return;
        }
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17069139558400L, 127175);
    w.i("MicroMsg.GameJsApiChooseVideo", "invoke");
    if (paramJSONObject == null)
    {
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("chooseVideo:fail_invalid_data", null));
      GMTrace.o(17069139558400L, 127175);
      return;
    }
    a(paramd, paramJSONObject, paramInt, 0);
    GMTrace.o(17069139558400L, 127175);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */