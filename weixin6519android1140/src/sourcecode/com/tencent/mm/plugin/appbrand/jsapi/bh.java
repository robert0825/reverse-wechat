package com.tencent.mm.plugin.appbrand.jsapi;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

public final class bh
  extends a
{
  private static final int CTRL_INDEX = 45;
  private static final String NAME = "reportAction";
  
  public bh()
  {
    GMTrace.i(10346978869248L, 77091);
    GMTrace.o(10346978869248L, 77091);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10347113086976L, 77092);
    Object localObject6 = paramJSONObject.optString("key");
    String str2 = paramJSONObject.optString("value");
    w.i("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey =  %s, actionValue =  %s", new Object[] { localObject6, str2 });
    if ((bg.nm((String)localObject6)) || (bg.nm(str2)))
    {
      w.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue is null");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10347113086976L, 77092);
      return;
    }
    if ((((String)localObject6).length() <= 0) || (((String)localObject6).length() > 32) || (str2.length() <= 0) || (str2.length() > 1024))
    {
      w.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue size is bad");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10347113086976L, 77092);
      return;
    }
    String str1 = paramj.hyD;
    if (TextUtils.isEmpty(str1))
    {
      w.e("MicroMsg.JsApiReportAction", "doReportActionInfo, appId is empty");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10347113086976L, 77092);
      return;
    }
    w.i("MicroMsg.JsApiReportAction", "doReportActionInfo, appId %s", new Object[] { str1 });
    int i = 0;
    int j = 0;
    long l;
    Object localObject2;
    Object localObject5;
    if (am.isConnected(paramj.mContext))
    {
      if (am.isWifi(paramj.mContext))
      {
        i = 1;
        w.i("MicroMsg.JsApiReportAction", "doReportActionInfo, get networkType %d", new Object[] { Integer.valueOf(i) });
      }
    }
    else
    {
      l = bg.Pu();
      w.d("MicroMsg.JsApiReportAction", "report(%s), clickTimestamp : %d, appID %s, networkType %d, userAgent %s, url : %s, sessionID : %s, actionKey : %s, actionValue : %s", new Object[] { Long.valueOf(l), Integer.valueOf(13579), str1, Integer.valueOf(i), "", "", "", localObject6, str2 });
      localObject4 = "";
      localObject2 = "";
      localObject5 = "";
      localObject1 = localObject2;
    }
    for (;;)
    {
      try
      {
        paramJSONObject = URLEncoder.encode(bg.nl(""), "UTF-8");
        localObject1 = localObject2;
        localObject4 = paramJSONObject;
        localObject2 = URLEncoder.encode("", "UTF-8");
        localObject1 = localObject2;
        localObject4 = paramJSONObject;
        localObject6 = URLEncoder.encode((String)localObject6, "UTF-8");
        localObject1 = localObject6;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        localObject6 = "";
        paramJSONObject = (JSONObject)localObject4;
        localObject4 = localObject6;
      }
      try
      {
        localObject4 = URLEncoder.encode(str2, "UTF-8");
        localObject6 = localObject2;
        localObject5 = localObject1;
        localObject2 = localObject4;
        g.ork.i(13579, new Object[] { str1, Integer.valueOf(i), paramJSONObject, localObject6, "", localObject5, localObject2, Long.valueOf(l), Long.valueOf(l) });
        paramj.v(paramInt, d("ok", null));
        GMTrace.o(10347113086976L, 77092);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        for (;;)
        {
          localObject4 = localObject1;
          localObject1 = localObject3;
          Object localObject3 = localUnsupportedEncodingException2;
        }
      }
      if (am.is4G(paramj.mContext))
      {
        i = 4;
        break;
      }
      if (am.is3G(paramj.mContext))
      {
        i = 3;
        break;
      }
      i = j;
      if (!am.is2G(paramj.mContext)) {
        break;
      }
      i = 2;
      break;
      w.printErrStackTrace("MicroMsg.JsApiReportAction", localUnsupportedEncodingException1, "", new Object[0]);
      localObject3 = localObject5;
      localObject5 = localObject4;
      localObject6 = localObject1;
    }
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10347247304704L, 77093);
    Object localObject6 = paramJSONObject.optString("key");
    String str2 = paramJSONObject.optString("value");
    w.i("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey =  %s, actionValue =  %s", new Object[] { localObject6, str2 });
    if ((bg.nm((String)localObject6)) || (bg.nm(str2)))
    {
      w.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue is null");
      paramAppBrandPageView.v(paramInt, d("fail", null));
      GMTrace.o(10347247304704L, 77093);
      return;
    }
    if ((((String)localObject6).length() <= 0) || (((String)localObject6).length() > 32) || (str2.length() <= 0) || (str2.length() > 1024))
    {
      w.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue size is bad");
      paramAppBrandPageView.v(paramInt, d("fail", null));
      GMTrace.o(10347247304704L, 77093);
      return;
    }
    String str1 = paramAppBrandPageView.hyD;
    if (TextUtils.isEmpty(str1))
    {
      w.e("MicroMsg.JsApiReportAction", "doReportActionInfo, appId is empty");
      paramAppBrandPageView.v(paramInt, d("fail", null));
      GMTrace.o(10347247304704L, 77093);
      return;
    }
    w.i("MicroMsg.JsApiReportAction", "doReportActionInfo, appId %s", new Object[] { str1 });
    int i = 0;
    int j = 0;
    long l;
    Object localObject2;
    Object localObject5;
    if (am.isConnected(paramAppBrandPageView.mContext))
    {
      if (am.isWifi(paramAppBrandPageView.mContext))
      {
        i = 1;
        w.i("MicroMsg.JsApiReportAction", "doReportActionInfo, get networkType %d", new Object[] { Integer.valueOf(i) });
      }
    }
    else
    {
      l = bg.Pu();
      w.d("MicroMsg.JsApiReportAction", "report(%s), clickTimestamp : %d, appID %s, networkType %d, userAgent %s, url : %s, sessionID : %s, actionKey : %s, actionValue : %s", new Object[] { Long.valueOf(l), Integer.valueOf(13579), str1, Integer.valueOf(i), "", "", "", localObject6, str2 });
      localObject4 = "";
      localObject2 = "";
      localObject5 = "";
      localObject1 = localObject2;
    }
    for (;;)
    {
      try
      {
        paramJSONObject = URLEncoder.encode(bg.nl(""), "UTF-8");
        localObject1 = localObject2;
        localObject4 = paramJSONObject;
        localObject2 = URLEncoder.encode("", "UTF-8");
        localObject1 = localObject2;
        localObject4 = paramJSONObject;
        localObject6 = URLEncoder.encode((String)localObject6, "UTF-8");
        localObject1 = localObject6;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        localObject6 = "";
        paramJSONObject = (JSONObject)localObject4;
        localObject4 = localObject6;
      }
      try
      {
        localObject4 = URLEncoder.encode(str2, "UTF-8");
        localObject6 = localObject2;
        localObject5 = localObject1;
        localObject2 = localObject4;
        g.ork.i(13579, new Object[] { str1, Integer.valueOf(i), paramJSONObject, localObject6, "", localObject5, localObject2, Long.valueOf(l), Long.valueOf(l) });
        paramAppBrandPageView.v(paramInt, d("ok", null));
        GMTrace.o(10347247304704L, 77093);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        for (;;)
        {
          localObject4 = localObject1;
          localObject1 = localObject3;
          Object localObject3 = localUnsupportedEncodingException2;
        }
      }
      if (am.is4G(paramAppBrandPageView.mContext))
      {
        i = 4;
        break;
      }
      if (am.is3G(paramAppBrandPageView.mContext))
      {
        i = 3;
        break;
      }
      i = j;
      if (!am.is2G(paramAppBrandPageView.mContext)) {
        break;
      }
      i = 2;
      break;
      w.printErrStackTrace("MicroMsg.JsApiReportAction", localUnsupportedEncodingException1, "", new Object[0]);
      localObject3 = localObject5;
      localObject5 = localObject4;
      localObject6 = localObject1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */