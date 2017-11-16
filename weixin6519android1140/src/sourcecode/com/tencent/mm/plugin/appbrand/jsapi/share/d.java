package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 74;
  public static final String NAME = "shareTimeline";
  private static boolean ikQ;
  
  static
  {
    GMTrace.i(18229988687872L, 135824);
    ikQ = false;
    GMTrace.o(18229988687872L, 135824);
  }
  
  public d()
  {
    GMTrace.i(18229183381504L, 135818);
    GMTrace.o(18229183381504L, 135818);
  }
  
  public static void Xf()
  {
    GMTrace.i(18229586034688L, 135821);
    ikQ = true;
    GMTrace.o(18229586034688L, 135821);
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(18229451816960L, 135820);
    com.tencent.mm.plugin.appbrand.report.a.a(paramString1, paramString2, 3, paramString3, bg.Pu(), paramInt1, paramInt2);
    GMTrace.o(18229451816960L, 135820);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18229317599232L, 135819);
    if (!ikQ)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(18229317599232L, 135819);
      return;
    }
    ikQ = false;
    if (paramJSONObject != null)
    {
      Object localObject1 = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
      final MMActivity localMMActivity = a(paramj);
      if (localMMActivity == null)
      {
        paramj.v(paramInt, d("fail", null));
        GMTrace.o(18229317599232L, 135819);
        return;
      }
      final String str2;
      final String str1;
      String str3;
      try
      {
        Iterator localIterator = paramJSONObject.keys();
        while (localIterator.hasNext())
        {
          str2 = (String)localIterator.next();
          w.i("MicroMsg.JsApiShareTimeline", "%s, %s", new Object[] { str2, paramJSONObject.get(str2) });
        }
        String str4;
        String str5;
        if (!s.eK(paramJSONObject, "https://")) {
          break label547;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.JsApiShareTimeline", localException, "", new Object[0]);
        str1 = paramJSONObject.optString("path");
        str2 = paramj.hyD;
        str4 = paramJSONObject.optString("desc");
        localObject2 = paramJSONObject.optString("title");
        str3 = ((AppBrandSysConfig)localObject1).eAr;
        paramJSONObject = paramJSONObject.optString("imgUrl");
        str5 = l.oh(paramj.hyD);
        localObject1 = ((AppBrandSysConfig)localObject1).hQJ;
        w.i("MicroMsg.JsApiShareTimeline", "doSendMessage, title = %s, description = %s ,username = %s , path = %s ,thumbIconUrl = %s", new Object[] { localObject2, str4, str3, str1, paramJSONObject });
        w.i("MicroMsg.JsApiShareTimeline", "doTimeline, errorUrl:[%s]", new Object[] { str5 });
        w.i("MicroMsg.JsApiShareTimeline", "doTimeline, init intent");
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("Ksnsupload_link", str5);
        ((Intent)localObject1).putExtra("Ksnsupload_title", (String)localObject2);
        ((Intent)localObject1).putExtra("Ksnsupload_contentattribute", 0);
        if (s.eK(paramJSONObject, "http://")) {}
      }
      ((Intent)localObject1).putExtra("Ksnsupload_imgurl", paramJSONObject);
      ((Intent)localObject1).putExtra("ksnsis_appbrand", true);
      ((Intent)localObject1).putExtra("Ksnsupload_source", 1);
      ((Intent)localObject1).putExtra("Ksnsupload_type", 1);
      ((Intent)localObject1).putExtra("KsnsUpload_BrandUsername", str3);
      ((Intent)localObject1).putExtra("KsnsUpload_BrandPath", str1);
      w.d("MicroMsg.JsApiShareTimeline", "report, appId : %s, path: %s", new Object[] { str2, str1 });
      paramJSONObject = u.gy("wxapp_" + str2 + str1);
      u.Av().p(paramJSONObject, true).o("prePublishId", "wxapp_" + str2 + str1);
      ((Intent)localObject1).putExtra("reportSessionId", paramJSONObject);
      w.i("MicroMsg.JsApiShareTimeline", "doTimeline, start activity");
      if ((localMMActivity instanceof MMActivity))
      {
        ((Intent)localObject1).putExtra("need_result", true);
        localMMActivity.vKC = new MMActivity.a()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
          {
            GMTrace.i(18234149437440L, 135855);
            if (paramAnonymousInt1 == 0)
            {
              if (paramAnonymousInt2 == -1)
              {
                h.bm(localMMActivity, localMMActivity.getResources().getString(o.i.cUy));
                d.b(str2, str1, "", 1, paramAnonymousInt2);
                w.i("MicroMsg.JsApiShareTimeline", "result is success");
                paramj.v(paramInt, d.this.d("success", null));
                GMTrace.o(18234149437440L, 135855);
                return;
              }
              w.i("MicroMsg.JsApiShareTimeline", "result is cancel");
              paramj.v(paramInt, d.this.d("cancel", null));
              d.b(str2, str1, "", 3, paramAnonymousInt2);
            }
            GMTrace.o(18234149437440L, 135855);
          }
        };
        com.tencent.mm.bj.d.a(localMMActivity, "sns", ".ui.En_c4f742e5", (Intent)localObject1, 0, false);
      }
      GMTrace.o(18229317599232L, 135819);
      return;
      label547:
      Object localObject2 = o.g(paramj.hzM, paramJSONObject);
      paramJSONObject = new byte[0];
      if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
      {
        w.i("MicroMsg.JsApiShareTimeline", "thumb image is not null");
        paramJSONObject = new ByteArrayOutputStream();
        ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, paramJSONObject);
        paramJSONObject = paramJSONObject.toByteArray();
      }
      for (;;)
      {
        ((Intent)localObject1).putExtra("Ksnsupload_imgbuf", paramJSONObject);
        break;
        w.e("MicroMsg.JsApiShareTimeline", "thumb image is null");
      }
    }
    w.i("MicroMsg.JsApiShareTimeline", "data is null");
    paramj.v(paramInt, d("fail", null));
    GMTrace.o(18229317599232L, 135819);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\share\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */