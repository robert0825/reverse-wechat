package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.share.i;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.c.adt;
import com.tencent.mm.protocal.c.adu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 145;
  public static final String NAME = "enterContact";
  public static int iaO;
  public AppBrandPageView ibO;
  private String iee;
  public String ief;
  public String ieg;
  public String ieh;
  public boolean iei;
  public int iej;
  private String sessionFrom;
  
  static
  {
    GMTrace.i(18210795552768L, 135681);
    iaO = 0;
    GMTrace.o(18210795552768L, 135681);
  }
  
  public c()
  {
    GMTrace.i(18210124464128L, 135676);
    this.iej = 1;
    GMTrace.o(18210124464128L, 135676);
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18210258681856L, 135677);
    if (paramJSONObject == null)
    {
      paramAppBrandPageView.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiEnterContact", "data is null");
      GMTrace.o(18210258681856L, 135677);
      return;
    }
    w.i("MicroMsg.JsApiEnterContact", "enterContact appId:%s, data:%s", new Object[] { paramAppBrandPageView.hyD, paramJSONObject.toString() });
    this.ibO = paramAppBrandPageView;
    this.sessionFrom = paramJSONObject.optString("sessionFrom");
    this.iee = paramJSONObject.optString("businessId");
    this.ief = paramJSONObject.optString("sendMessageTitle");
    this.ieg = paramJSONObject.optString("sendMessagePath");
    this.ieh = paramJSONObject.optString("sendMessageImg");
    this.iei = paramJSONObject.optBoolean("showMessageCard", false);
    this.iej = 1;
    if (this.sessionFrom.length() > 1024)
    {
      this.sessionFrom = this.sessionFrom.substring(0, 1024);
      w.i("MicroMsg.JsApiEnterContact", "sessionFrom length is large than 1024!");
    }
    if (this.iei)
    {
      if ((!s.eK(this.ieh, "http://")) && (!s.eK(this.ieh, "https://"))) {
        break label300;
      }
      this.iej = 4;
    }
    for (;;)
    {
      if ((this.iei) && (this.iej == 1))
      {
        this.ieh = com.tencent.mm.plugin.appbrand.appstorage.c.aE(paramAppBrandPageView.hyD, "share_" + System.currentTimeMillis());
        com.tencent.mm.plugin.appbrand.c.a(paramAppBrandPageView.hyD, new c.b()
        {
          public final void a(c.c paramAnonymousc)
          {
            GMTrace.i(18211063988224L, 135683);
            com.tencent.mm.plugin.appbrand.c.b(paramAppBrandPageView.hyD, this);
            paramAnonymousc = i.b(paramAppBrandPageView);
            if (paramAnonymousc != null) {}
            try
            {
              com.tencent.mm.sdk.platformtools.d.a(paramAnonymousc, 100, Bitmap.CompressFormat.PNG, c.this.ieh, true);
              if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled()))
              {
                paramAnonymousc.recycle();
                GMTrace.o(18211063988224L, 135683);
                return;
              }
            }
            catch (IOException localIOException)
            {
              w.w("MicroMsg.JsApiEnterContact", "save temp bitmap to file failed, . exception : %s", new Object[] { localIOException });
              if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled()))
              {
                paramAnonymousc.recycle();
                GMTrace.o(18211063988224L, 135683);
                return;
              }
            }
            catch (Exception localException)
            {
              w.w("MicroMsg.JsApiEnterContact", "save temp bitmap to file failed, . exception : %s", new Object[] { localException });
              if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled()))
              {
                paramAnonymousc.recycle();
                GMTrace.o(18211063988224L, 135683);
                return;
              }
            }
            finally
            {
              if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled())) {
                paramAnonymousc.recycle();
              }
            }
            GMTrace.o(18211063988224L, 135683);
          }
        });
      }
      if (TextUtils.isEmpty(this.iee))
      {
        w.i("MicroMsg.JsApiEnterContact", "businessId is empty, enter to chatting");
        aj("", paramInt);
        GMTrace.o(18210258681856L, 135677);
        return;
        label300:
        if ((!bg.nm(this.ieh)) && (this.ieh.startsWith("wxfile://")))
        {
          paramJSONObject = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(paramAppBrandPageView.hyD, this.ieh);
          if ((paramJSONObject == null) || (TextUtils.isEmpty(paramJSONObject.gpy))) {
            continue;
          }
          this.ieh = paramJSONObject.gpy;
          this.iej = 2;
          continue;
        }
        if (bg.nm(this.ieh)) {
          continue;
        }
        paramJSONObject = o.g(paramAppBrandPageView.hzM, this.ieh);
        if (paramJSONObject == null) {
          continue;
        }
        this.ieh = com.tencent.mm.plugin.appbrand.appstorage.c.aE(paramAppBrandPageView.hyD, "share_" + System.currentTimeMillis());
        try
        {
          com.tencent.mm.sdk.platformtools.d.a(paramJSONObject, 100, Bitmap.CompressFormat.PNG, this.ieh, true);
          this.iej = 3;
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
        }
        catch (IOException localIOException)
        {
          w.w("MicroMsg.JsApiEnterContact", "save temp bitmap to file failed, . exception : %s", new Object[] { localIOException });
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.JsApiEnterContact", "save temp bitmap to file failed, . exception : %s", new Object[] { localException });
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
        }
        finally
        {
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
        }
      }
    }
    w.i("MicroMsg.JsApiEnterContact", "do GetSubBusinessInfo cgi");
    paramJSONObject = new com.tencent.mm.ad.b.a();
    paramJSONObject.gtF = new adt();
    paramJSONObject.gtG = new adu();
    paramJSONObject.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
    paramJSONObject.gtE = 1303;
    paramJSONObject.gtH = 0;
    paramJSONObject.gtI = 0;
    paramJSONObject = paramJSONObject.DA();
    adt localadt = (adt)paramJSONObject.gtC.gtK;
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramAppBrandPageView.hyD);
    if (localAppBrandSysConfig != null)
    {
      localadt.username = localAppBrandSysConfig.eAr;
      w.i("MicroMsg.JsApiEnterContact", "req.username:%s", new Object[] { localadt.username });
    }
    for (;;)
    {
      localadt.utA = this.iee;
      com.tencent.mm.ipcinvoker.wx_extension.b.a(paramJSONObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
        {
          GMTrace.i(18209990246400L, 135675);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.gtD.gtK == null))
          {
            w.e("MicroMsg.JsApiEnterContact", "getsubbusinessinfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.gtD.gtK });
            paramAppBrandPageView.v(paramInt, c.this.d("fail:cgi fail", null));
            GMTrace.o(18209990246400L, 135675);
            return;
          }
          paramAnonymousString = (adu)paramAnonymousb.gtD.gtK;
          w.i("MicroMsg.JsApiEnterContact", "getsubbusinessinfo success, subBusinessUsername:%s", new Object[] { paramAnonymousString.utB });
          paramAppBrandPageView.iuf.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18207708545024L, 135658);
              c.this.aj(paramAnonymousString.utB, c.2.this.fXx);
              GMTrace.o(18207708545024L, 135658);
            }
          });
          GMTrace.o(18209990246400L, 135675);
        }
      });
      GMTrace.o(18210258681856L, 135677);
      return;
      w.e("MicroMsg.JsApiEnterContact", "getSysConfig is null, username is empty");
    }
  }
  
  public final void aj(String paramString, final int paramInt)
  {
    GMTrace.i(18210392899584L, 135678);
    String str2 = "";
    String str1 = "";
    final Object localObject = "";
    final WxaExposedParams.a locala = new WxaExposedParams.a();
    if (this.ibO.ivj != null) {
      localObject = this.ibO.ivj.iwc;
    }
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(this.ibO.hyD);
    if (localAppBrandSysConfig != null)
    {
      str2 = localAppBrandSysConfig.eAr;
      str1 = localAppBrandSysConfig.eEs;
      locala.appId = this.ibO.hyD;
      locala.username = localAppBrandSysConfig.eAr;
      locala.eCQ = localAppBrandSysConfig.eEs;
      locala.iconUrl = localAppBrandSysConfig.hQJ;
      locala.hKB = localAppBrandSysConfig.hRg.hKB;
      locala.hKC = localAppBrandSysConfig.hRg.hKC;
      locala.hRZ = localAppBrandSysConfig.hRg.hKF;
      locala.eDj = 5;
      locala.ePf = ((String)localObject);
      locala.hSa = l.oh(this.ibO.hyD);
    }
    if (bg.nm(str2)) {
      w.e("MicroMsg.JsApiEnterContact", "onInsertView username is empty!!!");
    }
    localObject = new JsApiChattingTask();
    if (!TextUtils.isEmpty(paramString)) {
      ((JsApiChattingTask)localObject).username = paramString;
    }
    for (((JsApiChattingTask)localObject).eCQ = "";; ((JsApiChattingTask)localObject).eCQ = str1)
    {
      ((JsApiChattingTask)localObject).sessionFrom = this.sessionFrom;
      ((JsApiChattingTask)localObject).hYr = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18208916504576L, 135667);
          w.i("MicroMsg.JsApiEnterContact", "go to the chattingUI");
          Intent localIntent = new Intent();
          localIntent.setFlags(67108864);
          localIntent.putExtra("Chat_User", localObject.username);
          localIntent.putExtra("app_brand_chatting_from_scene", 2);
          localIntent.putExtra("app_brand_chatting_expose_params", locala.UI());
          localIntent.putExtra("key_temp_session_from", localObject.sessionFrom);
          localIntent.putExtra("finish_direct", true);
          localIntent.putExtra("key_need_send_video", false);
          if (c.this.iei)
          {
            localIntent.putExtra("sendMessageTitle", c.this.ief);
            localIntent.putExtra("sendMessagePath", c.this.ieg);
            localIntent.putExtra("sendMessageImg", c.this.ieh);
            localIntent.putExtra("isBitmapFrom", c.this.iej);
          }
          localIntent.putExtra("showMessageCard", c.this.iei);
          MMActivity localMMActivity = (MMActivity)c.this.ibO.mContext;
          if (localMMActivity == null)
          {
            c.this.ibO.v(paramInt, c.this.d("fail", null));
            w.e("MicroMsg.JsApiEnterContact", "mmActivity is null, invoke fail!");
            GMTrace.o(18208916504576L, 135667);
            return;
          }
          localMMActivity.vKC = new MMActivity.a()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, Intent paramAnonymous2Intent)
            {
              GMTrace.i(18207037456384L, 135653);
              if (paramAnonymous2Int1 == 1)
              {
                if (c.iaO > 0)
                {
                  c.iaO -= 1;
                  c.this.ibO.hzM.RJ();
                }
                w.i("MicroMsg.JsApiEnterContact", "mmOnActivityResult lockCount:%d", new Object[] { Integer.valueOf(c.iaO) });
                c.3.this.ien.VN();
                HashMap localHashMap2 = new HashMap();
                String str2 = "";
                HashMap localHashMap1 = new HashMap();
                Object localObject = localHashMap1;
                String str1 = str2;
                if (paramAnonymous2Int2 == -1)
                {
                  localObject = localHashMap1;
                  str1 = str2;
                  if (paramAnonymous2Intent != null)
                  {
                    paramAnonymous2Intent = bg.aq(paramAnonymous2Intent.getStringExtra("keyOutPagePath"), "");
                    str1 = h.sv(paramAnonymous2Intent);
                    localObject = h.sw(paramAnonymous2Intent);
                  }
                }
                localHashMap2.put("path", str1);
                localHashMap2.put("query", localObject);
                w.i("MicroMsg.JsApiEnterContact", "onBackFromContact path:%s, query:%s", new Object[] { str1, localObject.toString() });
                c.this.ibO.v(c.3.this.fXx, c.this.d("ok", localHashMap2));
              }
              GMTrace.o(18207037456384L, 135653);
            }
          };
          com.tencent.mm.bj.d.a(c.this.ibO.mContext, ".ui.chatting.AppBrandServiceChattingUI", localIntent, 1);
          if (c.iaO > 0)
          {
            c.iaO -= 1;
            c.this.ibO.hzM.RJ();
          }
          if (c.iaO == 0)
          {
            c.iaO += 1;
            c.this.ibO.hzM.RI();
          }
          com.tencent.mm.plugin.appbrand.c.a(c.this.ibO.hyD, new c.b()
          {
            public final void onDestroy()
            {
              GMTrace.i(18207440109568L, 135656);
              w.i("MicroMsg.JsApiEnterContact", "onDestroy");
              if (c.iaO > 0)
              {
                c.iaO -= 1;
                c.this.ibO.hzM.RJ();
              }
              c.3.this.ien.VN();
              com.tencent.mm.plugin.appbrand.c.b(c.this.ibO.hyD, this);
              GMTrace.o(18207440109568L, 135656);
            }
          });
          w.i("MicroMsg.JsApiEnterContact", "doEnterChatting lockCount:%d", new Object[] { Integer.valueOf(c.iaO) });
          GMTrace.o(18208916504576L, 135667);
        }
      };
      ((JsApiChattingTask)localObject).VM();
      AppBrandMainProcessService.a((MainProcessTask)localObject);
      GMTrace.o(18210392899584L, 135678);
      return;
      ((JsApiChattingTask)localObject).username = str2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\contact\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */