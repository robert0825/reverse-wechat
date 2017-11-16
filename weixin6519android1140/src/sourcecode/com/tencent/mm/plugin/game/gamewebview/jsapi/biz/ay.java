package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pn;
import com.tencent.mm.plugin.game.gamewebview.model.h;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.y.s;
import org.json.JSONObject;

public final class ay
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 4;
  public static final String NAME = "shareTimeline";
  
  public ay()
  {
    GMTrace.i(17032632336384L, 126903);
    GMTrace.o(17032632336384L, 126903);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17032766554112L, 126904);
    w.i("MicroMsg.GameJsApiSendAppMessage", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.aEo();
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.GameJsApiSendAppMessage", "sendAppMessage fail, appmsg is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("share_timeline:fail_null_params", null));
      GMTrace.o(17032766554112L, 126904);
      return;
    }
    Object localObject = paramJSONObject.optString("link");
    if (bg.nm((String)localObject))
    {
      w.e("MicroMsg.GameJsApiSendAppMessage", "link is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("share_timeline:fail_invalid_params", null));
      GMTrace.o(17032766554112L, 126904);
      return;
    }
    h.a(paramd, paramJSONObject);
    String str1 = paramJSONObject.optString("desc");
    if (str1 != null)
    {
      if (!str1.startsWith("http://")) {
        break label846;
      }
      str1.substring(7);
    }
    for (;;)
    {
      int k = 1;
      str1 = "";
      int j = 0;
      if (this.lGy != null)
      {
        this.lGy.setClassLoader(getClass().getClassLoader());
        k = this.lGy.getInt("snsWebSource", 1);
        str1 = this.lGy.getString("jsapi_args_appid");
        j = bg.getInt(this.lGy.getString("urlAttribute"), 0);
        this.lGy.remove("urlAttribute");
      }
      String str2 = str1;
      if (bg.nm(str1)) {
        str2 = paramJSONObject.optString("appid");
      }
      String str8 = paramJSONObject.optString("img_width");
      String str9 = paramJSONObject.optString("img_height");
      str1 = paramd.zA((String)localObject);
      w.i("MicroMsg.GameJsApiSendAppMessage", "doTimeline, rawUrl:[%s], shareUrl:[%s]", new Object[] { localObject, str1 });
      String str3 = paramJSONObject.optString("type");
      String str4 = paramJSONObject.optString("title");
      String str5 = paramJSONObject.optString("img_url");
      String str6 = paramJSONObject.optString("src_username");
      String str7 = paramJSONObject.optString("src_displayname");
      i = -1;
      try
      {
        m = Integer.valueOf(str8).intValue();
        i = m;
        Integer.valueOf(str9);
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          int m = i;
          continue;
          boolean bool = false;
        }
      }
      paramJSONObject = new Intent();
      paramJSONObject.putExtra("Ksnsupload_width", m);
      paramJSONObject.putExtra("Ksnsupload_height", m);
      paramJSONObject.putExtra("Ksnsupload_link", str1);
      paramJSONObject.putExtra("Ksnsupload_title", str4);
      paramJSONObject.putExtra("Ksnsupload_imgurl", str5);
      paramJSONObject.putExtra("Ksnsupload_contentattribute", j);
      if (s.fD(str6))
      {
        paramJSONObject.putExtra("src_username", str6);
        paramJSONObject.putExtra("src_displayname", str7);
      }
      paramJSONObject.putExtra("Ksnsupload_source", k);
      paramJSONObject.putExtra("Ksnsupload_type", 1);
      if ((!bg.nm(str3)) && (str3.equals("music"))) {
        paramJSONObject.putExtra("ksnsis_music", true);
      }
      if ((!bg.nm(str3)) && (str3.equals("video"))) {
        paramJSONObject.putExtra("ksnsis_video", true);
      }
      if ((str2 != null) && (str2.length() > 0)) {
        paramJSONObject.putExtra("Ksnsupload_appid", str2);
      }
      if (this.lGy != null) {
        break;
      }
      bool = true;
      w.i("MicroMsg.GameJsApiSendAppMessage", "doTimeline, init intent, jsapiArgs == null ? %b", new Object[] { Boolean.valueOf(bool) });
      if (this.lGy != null)
      {
        str3 = this.lGy.getString("K_sns_thumb_url");
        str4 = this.lGy.getString("K_sns_raw_url");
        str1 = bg.aq(this.lGy.getString("KSnsStrId"), "");
        str2 = bg.aq(this.lGy.getString("KSnsLocalId"), "");
        paramJSONObject.putExtra("key_snsad_statextstr", this.lGy.getString("key_snsad_statextstr"));
        w.i("MicroMsg.GameJsApiSendAppMessage", "currentUrl %s contentUrl %s thumbUrl %s", new Object[] { localObject, str4, str3 });
        if ((str4 != null) && (localObject != null) && (str4.equals(localObject))) {
          paramJSONObject.putExtra("KlinkThumb_url", str3);
        }
        paramJSONObject.putExtra("KSnsStrId", str1);
        paramJSONObject.putExtra("KSnsLocalId", str2);
        if ((str1 != null) && (this.lGy.getBoolean("KFromTimeline", false)))
        {
          localObject = new pn();
          ((pn)localObject).eUn.eUg = str1;
          ((pn)localObject).eUn.eEM = str2;
          com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
        }
      }
      paramJSONObject.putExtra("ShareUrlOriginal", bg.nl(paramd.lID));
      paramJSONObject.putExtra("ShareUrlOpen", paramd.aEr());
      paramJSONObject.putExtra("JsAppId", paramd.aEs());
      paramJSONObject.putExtra("need_result", true);
      w.i("MicroMsg.GameJsApiSendAppMessage", "doTimeline, start activity");
      localGameWebViewUI.vKC = new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(17040014311424L, 126958);
          if (paramAnonymousInt1 == 2)
          {
            if (paramAnonymousInt2 == -1)
            {
              paramAnonymousIntent = paramd;
              paramAnonymousInt1 = paramInt;
              localay = ay.this;
              paramAnonymousIntent.v(paramAnonymousInt1, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("share_timeline:ok", null));
              GMTrace.o(17040014311424L, 126958);
              return;
            }
            paramAnonymousIntent = paramd;
            paramAnonymousInt1 = paramInt;
            ay localay = ay.this;
            paramAnonymousIntent.v(paramAnonymousInt1, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("share_timeline:cancel", null));
          }
          GMTrace.o(17040014311424L, 126958);
        }
      };
      com.tencent.mm.bj.d.a(localGameWebViewUI, "sns", ".ui.En_c4f742e5", paramJSONObject, 2, false);
      GMTrace.o(17032766554112L, 126904);
      return;
      label846:
      if (str1.startsWith("https://")) {
        str1.substring(8);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */