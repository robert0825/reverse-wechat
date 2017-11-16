package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.mm.plugin.webview.model.ai;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.tools.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 254;
  public static final String NAME = "chooseMedia";
  public int hXU;
  private MMActivity.a lGq;
  public GameWebViewUI lHd;
  public com.tencent.mm.plugin.game.gamewebview.ui.d lHe;
  
  public i()
  {
    GMTrace.i(17034645602304L, 126918);
    this.lGq = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(17066320986112L, 127154);
        if (paramAnonymousInt1 == (i.this.hashCode() & 0xFFFF)) {
          switch (paramAnonymousInt2)
          {
          }
        }
        Object localObject1;
        for (;;)
        {
          i.this.lHe.v(i.this.hXU, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseMedia:fail", null));
          GMTrace.o(17066320986112L, 127154);
          return;
          i.this.lHe.v(i.this.hXU, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseMedia:cancel", null));
          GMTrace.o(17066320986112L, 127154);
          return;
          if (paramAnonymousIntent == null)
          {
            w.e("MicroMsg.GameJsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA bundle is null,");
            i.this.lHe.v(i.this.hXU, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseMedia:fail", null));
            GMTrace.o(17066320986112L, 127154);
            return;
          }
          paramAnonymousInt1 = paramAnonymousIntent.getIntExtra("key_pick_local_media_callback_type", 0);
          if (paramAnonymousInt1 != 1) {
            break;
          }
          localObject1 = paramAnonymousIntent.getStringExtra("key_pick_local_media_local_id");
          paramAnonymousIntent = paramAnonymousIntent.getStringExtra("key_pick_local_media_thumb_local_id");
          w.i("MicroMsg.GameJsApiChooseMedia", "video localId:%s", new Object[] { localObject1 });
          w.i("MicroMsg.GameJsApiChooseMedia", "video thumbLocalId:%s", new Object[] { paramAnonymousIntent });
          if (bg.nm((String)localObject1))
          {
            w.e("MicroMsg.GameJsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA video localId is null");
            i.this.lHe.v(i.this.hXU, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseMedia:fail", null));
            GMTrace.o(17066320986112L, 127154);
            return;
          }
          Object localObject2 = com.tencent.mm.plugin.game.gamewebview.a.d.zm((String)localObject1);
          if ((localObject2 != null) && ((localObject2 instanceof WebViewJSSDKVideoItem)))
          {
            localObject2 = (WebViewJSSDKVideoItem)localObject2;
            paramAnonymousIntent = ai.b((String)localObject1, paramAnonymousIntent, ((WebViewJSSDKVideoItem)localObject2).duration, ((WebViewJSSDKVideoItem)localObject2).height, ((WebViewJSSDKVideoItem)localObject2).width, ((WebViewJSSDKVideoItem)localObject2).size);
            w.i("MicroMsg.GameJsApiChooseMedia", "after parse to json data : %s", new Object[] { paramAnonymousIntent });
            localObject1 = new HashMap();
            ((HashMap)localObject1).put("type", Integer.valueOf(1));
            ((HashMap)localObject1).put("localIds", paramAnonymousIntent);
            i.this.lHe.v(i.this.hXU, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseMedia:ok", (Map)localObject1));
            GMTrace.o(17066320986112L, 127154);
            return;
          }
          w.e("MicroMsg.GameJsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA nor the videoitem");
        }
        if (paramAnonymousInt1 == 2)
        {
          paramAnonymousIntent = paramAnonymousIntent.getStringExtra("key_pick_local_media_local_ids");
          w.i("MicroMsg.GameJsApiChooseMedia", "chooseMedia localIds:%s", new Object[] { paramAnonymousIntent });
          if (bg.nm(paramAnonymousIntent))
          {
            w.e("MicroMsg.GameJsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA image localIds is null");
            i.this.lHe.v(i.this.hXU, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseMedia:fail", null));
            GMTrace.o(17066320986112L, 127154);
            return;
          }
          localObject1 = new HashMap();
          ((HashMap)localObject1).put("type", Integer.valueOf(2));
          ((HashMap)localObject1).put("localIds", paramAnonymousIntent);
          i.this.lHe.v(i.this.hXU, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseMedia:ok", (Map)localObject1));
          GMTrace.o(17066320986112L, 127154);
          return;
        }
        w.e("MicroMsg.GameJsApiChooseMedia", "type:%d is error", new Object[] { Integer.valueOf(paramAnonymousInt1) });
        i.this.lHe.v(i.this.hXU, com.tencent.mm.plugin.game.gamewebview.a.d.d("chooseMedia:fail", null));
        GMTrace.o(17066320986112L, 127154);
      }
    };
    GMTrace.o(17034645602304L, 126918);
  }
  
  public final void I(Intent paramIntent)
  {
    GMTrace.i(17035048255488L, 126921);
    w.i("MicroMsg.GameJsApiChooseMedia", "chooseMediaFromAlbum");
    paramIntent.putExtra("key_pick_local_pic_capture", 4096);
    this.lHd.vKC = this.lGq;
    com.tencent.mm.bj.d.a(this.lHd, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 0xFFFF & hashCode(), false);
    GMTrace.o(17035048255488L, 126921);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17034779820032L, 126919);
    w.i("MicroMsg.GameJsApiChooseMedia", "invoke");
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.GameJsApiChooseMedia", "data is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("doChooseMedia:fail_invalid_data", null));
      GMTrace.o(17034779820032L, 126919);
      return;
    }
    this.lHe = paramd;
    this.hXU = paramInt;
    this.lHd = paramd.aEo();
    boolean bool1 = com.tencent.mm.pluginsdk.h.a.a(this.lHd, "android.permission.CAMERA", 119, "", "");
    w.i("MicroMsg.GameJsApiChooseMedia", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool1) });
    boolean bool2 = com.tencent.mm.pluginsdk.h.a.a(this.lHd, "android.permission.RECORD_AUDIO", 120, "", "");
    w.i("MicroMsg.GameJsApiChooseMedia", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool2) });
    if ((!bool2) || (!bool1))
    {
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("doChooseMedia:fail_no_user_permission", null));
      GMTrace.o(17034779820032L, 126919);
      return;
    }
    String str1 = bg.nl(paramJSONObject.optString("sourceType"));
    String str3 = paramJSONObject.optString("mediaType", "");
    int j = Math.min(paramJSONObject.optInt("maxDuration", 10), 10);
    final String str2 = paramJSONObject.optString("camera", "");
    int i = paramJSONObject.optInt("count", 1);
    paramJSONObject = paramJSONObject.optString("sizeType", "");
    w.i("MicroMsg.GameJsApiChooseMedia", "doChooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s", new Object[] { str1, str3, Integer.valueOf(j), str2, Integer.valueOf(i), paramJSONObject });
    final Intent localIntent = new Intent();
    localIntent.putExtra("key_pick_local_pic_count", i);
    i = j;
    if (j <= 0) {
      i = 10;
    }
    localIntent.putExtra("key_pick_local_media_duration", i);
    localIntent.putExtra("query_media_type", 3);
    localIntent.putExtra("key_pick_local_media_video_type", 2);
    localIntent.putExtra("key_pick_local_media_sight_type", str3);
    if ((paramJSONObject.contains("original") ^ paramJSONObject.contains("compressed")))
    {
      i = 7;
      localIntent.putExtra("key_pick_local_pic_query_source_type", i);
      if (!paramJSONObject.contains("compressed")) {
        break label503;
      }
      bool1 = true;
      label389:
      localIntent.putExtra("key_pick_local_pic_send_raw", Boolean.valueOf(bool1));
      if (!bg.nm(str1)) {
        break label580;
      }
    }
    label503:
    label580:
    for (paramJSONObject = "album|camera";; paramJSONObject = str1)
    {
      if ((paramJSONObject.contains("album")) && (paramJSONObject.contains("camera")))
      {
        paramJSONObject = new l(this.lHd);
        paramJSONObject.b(null, new View.OnCreateContextMenuListener()new p.d
        {
          public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
          {
            GMTrace.i(17044846149632L, 126994);
            paramAnonymousContextMenu.add(0, 1, 0, i.this.lHd.getString(R.l.cSS));
            paramAnonymousContextMenu.add(0, 2, 1, i.this.lHd.getString(R.l.cSW));
            GMTrace.o(17044846149632L, 126994);
          }
        }, new p.d()
        {
          public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
          {
            GMTrace.i(17032095465472L, 126899);
            switch (paramAnonymousMenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(17032095465472L, 126899);
              return;
              i.this.a(str2, localIntent);
              GMTrace.o(17032095465472L, 126899);
              return;
              i.this.I(localIntent);
            }
          }
        });
        paramJSONObject.e(new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(17068065816576L, 127167);
            paramAnonymousDialogInterface = paramd;
            int i = paramInt;
            i locali = i.this;
            paramAnonymousDialogInterface.v(i, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("doChooseMedia:cancel", null));
            GMTrace.o(17068065816576L, 127167);
          }
        });
        paramJSONObject.bpI();
        GMTrace.o(17034779820032L, 126919);
        return;
        i = 8;
        break;
        bool1 = false;
        break label389;
      }
      if (paramJSONObject.contains("album"))
      {
        I(localIntent);
        GMTrace.o(17034779820032L, 126919);
        return;
      }
      if (paramJSONObject.contains("camera"))
      {
        a(str2, localIntent);
        GMTrace.o(17034779820032L, 126919);
        return;
      }
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("chooseMedia:fail_sourceType_error", null));
      GMTrace.o(17034779820032L, 126919);
      return;
    }
  }
  
  public final void a(String paramString, Intent paramIntent)
  {
    GMTrace.i(17034914037760L, 126920);
    w.i("MicroMsg.GameJsApiChooseMedia", "chooseMediaFromCamera");
    if (paramString.equals("front")) {}
    for (int i = 16;; i = 256)
    {
      paramIntent.putExtra("key_pick_local_pic_capture", i);
      this.lHd.vKC = this.lGq;
      com.tencent.mm.bj.d.a(this.lHd, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 0xFFFF & hashCode(), false);
      GMTrace.o(17034914037760L, 126920);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */