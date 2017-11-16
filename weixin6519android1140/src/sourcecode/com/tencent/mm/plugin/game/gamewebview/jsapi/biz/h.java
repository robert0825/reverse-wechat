package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 104;
  public static final String NAME = "chooseImage";
  
  public h()
  {
    GMTrace.i(17059878535168L, 127106);
    GMTrace.o(17059878535168L, 127106);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17060012752896L, 127107);
    w.i("MicroMsg.GameJsApiChooseImage", "invoke");
    final GameWebViewUI localGameWebViewUI = paramd.aEo();
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.GameJsApiChooseImage", "data is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("chooseImage:fail_invalid_data", null));
      GMTrace.o(17060012752896L, 127107);
      return;
    }
    Object localObject1 = paramJSONObject.optJSONArray("sourceType");
    int j = 0;
    int i = 0;
    if (localObject1 != null)
    {
      w.i("MicroMsg.GameJsApiChooseImage", "sourceType = " + ((JSONArray)localObject1).toString());
      k = 0;
      j = i;
      if (k < ((JSONArray)localObject1).length())
      {
        if (((JSONArray)localObject1).optString(k).equals("album")) {
          j = i | 0x1;
        }
        for (;;)
        {
          k += 1;
          i = j;
          break;
          j = i;
          if (((JSONArray)localObject1).optString(k).equals("camera")) {
            j = i | 0x2;
          }
        }
      }
    }
    i = j;
    j = i;
    if (i == 0) {
      j = 3;
    }
    w.i("MicroMsg.GameJsApiChooseImage", "real scene = %d", new Object[] { Integer.valueOf(j) });
    if ((j == 2) || (j == 3))
    {
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(localGameWebViewUI, "android.permission.CAMERA", 113, "", "");
      w.d("MicroMsg.GameJsApiChooseImage", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("chooseImage:fail_android_permission_denied", null));
        GMTrace.o(17060012752896L, 127107);
        return;
      }
    }
    int k = paramJSONObject.optInt("count", 0);
    Boolean localBoolean = Boolean.valueOf(false);
    localObject1 = Boolean.valueOf(false);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("sizeType");
    Object localObject2 = localObject1;
    Object localObject3 = localBoolean;
    if (localJSONArray != null)
    {
      i = 0;
      paramJSONObject = localBoolean;
      localObject2 = localObject1;
      localObject3 = paramJSONObject;
      if (i < localJSONArray.length())
      {
        if (localJSONArray.optString(i).equals("original")) {
          localObject2 = Boolean.valueOf(true);
        }
        for (;;)
        {
          i += 1;
          paramJSONObject = (JSONObject)localObject2;
          break;
          localObject2 = paramJSONObject;
          if (localJSONArray.optString(i).equals("compressed"))
          {
            localObject1 = Boolean.valueOf(true);
            localObject2 = paramJSONObject;
          }
        }
      }
    }
    if ((((Boolean)localObject3).booleanValue()) && (!((Boolean)localObject2).booleanValue()))
    {
      i = 7;
      paramJSONObject = Boolean.valueOf(true);
    }
    for (;;)
    {
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("key_pick_local_pic_capture", j);
      ((Intent)localObject1).putExtra("key_pick_local_pic_count", k);
      ((Intent)localObject1).putExtra("key_pick_local_pic_query_source_type", i);
      ((Intent)localObject1).putExtra("key_pick_local_pic_send_raw", paramJSONObject);
      ((Intent)localObject1).putExtra("query_media_type", 1);
      w.i("MicroMsg.GameJsApiChooseImage", "doChooseImage: realScene: %d, count: %d, querySourceType: %d, sendRaw: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), paramJSONObject });
      localGameWebViewUI.vKC = new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(17029813764096L, 126882);
          boolean bool;
          HashMap localHashMap;
          if (paramAnonymousInt1 == 14)
          {
            if (paramAnonymousIntent != null) {
              break label131;
            }
            bool = false;
            w.i("MicroMsg.GameJsApiChooseImage", "request to open file chooser, result code = %d, hasShowMemoryWarning = %b", new Object[] { Integer.valueOf(paramAnonymousInt2), Boolean.valueOf(bool) });
            localHashMap = new HashMap();
            if (bool) {
              localHashMap.put("memoryWarning", Boolean.valueOf(true));
            }
            switch (paramAnonymousInt2)
            {
            default: 
              paramd.v(paramInt, h.d("chooseImage:fail", localHashMap));
            }
          }
          for (;;)
          {
            label114:
            localGameWebViewUI.vKC = null;
            GMTrace.o(17029813764096L, 126882);
            return;
            label131:
            bool = paramAnonymousIntent.getBooleanExtra("key_pick_local_media_show_memory_warning", false);
            break;
            if (paramAnonymousIntent != null) {}
            for (String str = paramAnonymousIntent.getStringExtra("key_pick_local_pic_callback_local_ids"); !bg.nm(str); str = null)
            {
              w.i("MicroMsg.GameJsApiChooseImage", "localIds = %s", new Object[] { str });
              localHashMap.put("localIds", str);
              paramAnonymousIntent = paramAnonymousIntent.getStringExtra("key_pick_local_pic_source_type");
              if (paramAnonymousIntent != null) {
                localHashMap.put("sourceType", paramAnonymousIntent);
              }
              paramd.v(paramInt, h.d("chooseImage:ok", localHashMap));
              break label114;
            }
            paramd.v(paramInt, h.d("chooseImage:cancel", localHashMap));
          }
        }
      };
      com.tencent.mm.bj.d.a(localGameWebViewUI, "webview", ".ui.tools.OpenFileChooserUI", (Intent)localObject1, 14, false);
      GMTrace.o(17060012752896L, 127107);
      return;
      if ((!((Boolean)localObject3).booleanValue()) && (((Boolean)localObject2).booleanValue()))
      {
        i = 7;
        paramJSONObject = Boolean.valueOf(false);
      }
      else
      {
        i = 8;
        paramJSONObject = Boolean.valueOf(false);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */