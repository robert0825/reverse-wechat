package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.menu.k;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 73;
  public static final String NAME = "shareAppMessage";
  
  public b()
  {
    GMTrace.i(18232673042432L, 135844);
    GMTrace.o(18232673042432L, 135844);
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3)
  {
    GMTrace.i(18232941477888L, 135846);
    com.tencent.mm.plugin.appbrand.report.a.a(paramString1, paramString2, paramInt1, paramString3, bg.Pu(), paramInt2, paramInt3);
    GMTrace.o(18232941477888L, 135846);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18232807260160L, 135845);
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.JsApiShareAppMessage", "data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(18232807260160L, 135845);
      return;
    }
    final AppBrandPageView localAppBrandPageView = b(paramj);
    if (localAppBrandPageView == null)
    {
      w.i("MicroMsg.JsApiShareAppMessage", "share app message fail, pageView is null");
      paramj.v(paramInt, d("fail:current page do not exist", null));
      GMTrace.o(18232807260160L, 135845);
      return;
    }
    final Object localObject1 = localAppBrandPageView.jh(com.tencent.mm.plugin.appbrand.menu.l.isn);
    if (localObject1 == null)
    {
      w.i("MicroMsg.JsApiShareAppMessage", "share app message fail, menuInfo is null.");
      paramj.v(paramInt, d("fail:menu is null", null));
      GMTrace.o(18232807260160L, 135845);
      return;
    }
    final Object localObject2 = ((k)localObject1).hTC;
    if (!((u.b)localObject2).gz("user_clicked_share_btn"))
    {
      w.i("MicroMsg.JsApiShareAppMessage", "share app message fail, not allow to share");
      paramj.v(paramInt, d("fail:not allow to share", null));
      GMTrace.o(18232807260160L, 135845);
      return;
    }
    w.i("MicroMsg.JsApiShareAppMessage", "invoke share app message");
    ((u.b)localObject2).q("user_clicked_share_btn", false);
    localObject1 = a(paramj);
    if (localObject1 == null)
    {
      w.i("MicroMsg.JsApiShareAppMessage", "share app message fail, context is null");
      paramj.v(paramInt, d("fail: page context is null", null));
      GMTrace.o(18232807260160L, 135845);
      return;
    }
    final AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    final boolean bool2 = ((u.b)localObject2).getBoolean("enable_share_with_share_ticket", false);
    final int i;
    final String str1;
    final String str2;
    final String str3;
    final String str4;
    final boolean bool3;
    final String str5;
    final String str6;
    final String str7;
    HashMap localHashMap;
    Intent localIntent;
    if (bool2)
    {
      i = 3;
      str1 = paramJSONObject.optString("title");
      str2 = paramJSONObject.optString("desc", "");
      str3 = paramJSONObject.optString("path");
      str4 = paramJSONObject.optString("imageUrl");
      paramJSONObject = paramJSONObject.optString("cacheKey");
      bool3 = ((u.b)localObject2).gz("enable_share_dynamic");
      localObject2 = paramj.hyD;
      str5 = localAppBrandSysConfig.eAr;
      int j = localAppBrandSysConfig.hRg.hKB;
      int k = localAppBrandSysConfig.hRg.hKC;
      str6 = com.tencent.mm.plugin.appbrand.l.oh(paramj.hyD);
      str7 = i.a(localAppBrandPageView, str4);
      localHashMap = new HashMap();
      localHashMap.put("desc", str2);
      localHashMap.put("type", Integer.valueOf(i));
      localHashMap.put("title", str1);
      localHashMap.put("app_id", localObject2);
      localHashMap.put("pkg_type", Integer.valueOf(j));
      localHashMap.put("pkg_version", Integer.valueOf(k));
      localHashMap.put("img_url", str4);
      localHashMap.put("is_dynamic", Boolean.valueOf(bool3));
      localHashMap.put("cache_key", paramJSONObject);
      localHashMap.put("path", str3);
      if (!bg.nm(str7)) {
        localHashMap.put("delay_load_img_path", "file://" + str7);
      }
      localIntent = new Intent();
      localIntent.putExtra("Select_Conv_Type", 3);
      if (bool2) {
        break label647;
      }
    }
    label647:
    for (boolean bool1 = true;; bool1 = false)
    {
      localIntent.putExtra("mutil_select_is_ret", bool1);
      localIntent.putExtra("select_is_ret", true);
      localIntent.putExtra("scene_from", 3);
      localIntent.putExtra("appbrand_params", localHashMap);
      localIntent.putExtra("Retr_Msg_Type", 2);
      com.tencent.mm.bj.d.a((MMActivity)localObject1, ".ui.transmit.SelectConversationUI", localIntent, 1, new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, final int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(18234820526080L, 135860);
          if (paramAnonymousInt1 != 1)
          {
            w.i("MicroMsg.JsApiShareAppMessage", "requestCode(%d) not corrected.", new Object[] { Integer.valueOf(paramAnonymousInt1) });
            GMTrace.o(18234820526080L, 135860);
            return;
          }
          final String str;
          if (paramAnonymousInt2 != -1)
          {
            w.i("MicroMsg.JsApiShareAppMessage", "resultCode is not RESULT_OK(%d)", new Object[] { Integer.valueOf(paramAnonymousInt2) });
            paramj.v(paramInt, b.this.d("cancel", null));
            paramAnonymousIntent = localObject2;
            str = str3;
            if (bool2) {}
            for (paramAnonymousInt1 = 16;; paramAnonymousInt1 = 2)
            {
              b.a(paramAnonymousIntent, str, paramAnonymousInt1, "", 3, paramAnonymousInt2);
              GMTrace.o(18234820526080L, 135860);
              return;
            }
          }
          if (paramAnonymousIntent == null)
          {
            str = null;
            if ((str != null) && (str.length() != 0)) {
              break label229;
            }
            w.e("MicroMsg.JsApiShareAppMessage", "mmOnActivityResult fail, toUser is null");
            paramj.v(paramInt, b.this.d("fail:selected user is nil", null));
            if (!bool2) {
              break label224;
            }
          }
          label224:
          for (paramAnonymousInt1 = 16;; paramAnonymousInt1 = 2)
          {
            b.a(localObject2, str3, paramAnonymousInt1, "", 2, paramAnonymousInt2);
            GMTrace.o(18234820526080L, 135860);
            return;
            str = paramAnonymousIntent.getStringExtra("Select_Conv_User");
            break;
          }
          label229:
          w.i("MicroMsg.JsApiShareAppMessage", "result success toUser : %s ", new Object[] { str });
          paramAnonymousIntent = paramAnonymousIntent.getStringExtra("custom_send_text");
          final SendAppMessageTask localSendAppMessageTask = new SendAppMessageTask();
          localSendAppMessageTask.ikS = paramAnonymousIntent;
          localSendAppMessageTask.toUser = str;
          localSendAppMessageTask.appId = localObject2;
          localSendAppMessageTask.userName = str5;
          localSendAppMessageTask.title = str1;
          localSendAppMessageTask.description = str2;
          localSendAppMessageTask.url = str6;
          localSendAppMessageTask.path = str3;
          localSendAppMessageTask.type = i;
          localSendAppMessageTask.ikT = str4;
          localSendAppMessageTask.iconUrl = localAppBrandSysConfig.hQJ;
          localSendAppMessageTask.eII = localAppBrandSysConfig.hRg.hKB;
          localSendAppMessageTask.hRZ = localAppBrandSysConfig.hRg.hKF;
          localSendAppMessageTask.version = localAppBrandSysConfig.hRg.hKC;
          localSendAppMessageTask.eCQ = localAppBrandSysConfig.eEs;
          localSendAppMessageTask.ikV = com.tencent.mm.plugin.appbrand.i.oe(localObject2).hzJ.getAndIncrement();
          localSendAppMessageTask.ikX = localAppBrandPageView.ivj.hZo;
          localSendAppMessageTask.ikY = localAppBrandPageView.Zw();
          paramAnonymousIntent = com.tencent.mm.plugin.appbrand.a.nL(localObject2);
          if (paramAnonymousIntent != null)
          {
            if (paramAnonymousIntent.scene == 0)
            {
              paramAnonymousInt1 = 1000;
              localSendAppMessageTask.scene = paramAnonymousInt1;
              localSendAppMessageTask.eAv = bg.nl(paramAnonymousIntent.eAv);
              localSendAppMessageTask.ikW = bg.nl(com.tencent.mm.plugin.appbrand.h.f(paramj.hzM).hzG);
            }
          }
          else
          {
            localSendAppMessageTask.ikU = str7;
            localSendAppMessageTask.withShareTicket = bool2;
            localSendAppMessageTask.ikZ = bool3;
            localSendAppMessageTask.hUt = paramJSONObject;
            paramAnonymousIntent = localAppBrandPageView.Zx();
            if (paramAnonymousIntent != null) {
              break label659;
            }
          }
          label659:
          for (paramAnonymousIntent = "";; paramAnonymousIntent = paramAnonymousIntent.inX.getUrl())
          {
            localSendAppMessageTask.ila = paramAnonymousIntent;
            if (!bool2) {
              break label670;
            }
            localSendAppMessageTask.hYr = new Runnable()
            {
              public final void run()
              {
                GMTrace.i(18231599300608L, 135836);
                w.i("MicroMsg.JsApiShareAppMessage", "task callback");
                localSendAppMessageTask.VN();
                Object localObject = new HashMap();
                JSONArray localJSONArray = new JSONArray();
                try
                {
                  if (!bg.cc(localSendAppMessageTask.ilb))
                  {
                    Iterator localIterator = localSendAppMessageTask.ilb.iterator();
                    while (localIterator.hasNext())
                    {
                      ShareInfo localShareInfo = (ShareInfo)localIterator.next();
                      JSONObject localJSONObject = new JSONObject();
                      localJSONObject.put("shareKey", localShareInfo.gqZ);
                      localJSONObject.put("shareName", localShareInfo.gqY);
                      localJSONArray.put(localJSONObject);
                    }
                  }
                  int i;
                  return;
                }
                catch (JSONException localJSONException)
                {
                  w.e("MicroMsg.JsApiShareAppMessage", Log.getStackTraceString(localJSONException));
                  ((Map)localObject).put("shareInfos", localJSONArray);
                  b.1.this.hXV.v(b.1.this.fXx, b.this.d("ok", (Map)localObject));
                  i = 16;
                  localObject = str + ":";
                  if (str.toLowerCase().endsWith("@chatroom")) {
                    i = 15;
                  }
                  b.a(b.1.this.eud, b.1.this.ikD, i, (String)localObject, 1, paramAnonymousInt2);
                  GMTrace.o(18231599300608L, 135836);
                }
              }
            };
            localSendAppMessageTask.VM();
            AppBrandMainProcessService.a(localSendAppMessageTask);
            if (localObject1 != null) {
              com.tencent.mm.ui.base.h.bm(localObject1, localObject1.getResources().getString(o.i.hEa));
            }
            GMTrace.o(18234820526080L, 135860);
            return;
            paramAnonymousInt1 = paramAnonymousIntent.scene;
            break;
          }
          label670:
          AppBrandMainProcessService.a(localSendAppMessageTask);
          paramj.v(paramInt, b.this.d("ok", null));
          if (str.toLowerCase().endsWith("@chatroom")) {}
          for (paramAnonymousInt1 = 9;; paramAnonymousInt1 = 2)
          {
            b.a(localObject2, str3, paramAnonymousInt1, "", 1, paramAnonymousInt2);
            break;
          }
        }
      });
      GMTrace.o(18232807260160L, 135845);
      return;
      i = 2;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\share\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */