package com.tencent.mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import org.json.JSONObject;

final class aj
  extends k
{
  public static final int CTRL_INDEX = 40;
  public static final String NAME = "getSystemInfo";
  
  aj()
  {
    GMTrace.i(10361340166144L, 77198);
    GMTrace.o(10361340166144L, 77198);
  }
  
  private static View c(j paramj)
  {
    GMTrace.i(19771881947136L, 147312);
    paramj = b(paramj);
    if (paramj == null)
    {
      GMTrace.o(19771881947136L, 147312);
      return null;
    }
    paramj = paramj.iui;
    GMTrace.o(19771881947136L, 147312);
    return paramj;
  }
  
  public final String a(j paramj, JSONObject paramJSONObject)
  {
    GMTrace.i(10361474383872L, 77199);
    HashMap localHashMap = new HashMap();
    localHashMap.put("brand", Build.BRAND);
    localHashMap.put("model", Build.MODEL);
    localHashMap.put("pixelRatio", Float.valueOf(paramj.mContext.getResources().getDisplayMetrics().density));
    if (c(paramj) != null)
    {
      w.i("MicroMsg.JsApiGetSystemInfo", "Method: normal");
      paramJSONObject = new int[2];
      paramJSONObject[0] = c(paramj).getWidth();
      paramJSONObject[1] = c(paramj).getHeight();
    }
    for (;;)
    {
      localHashMap.put("windowWidth", Integer.valueOf(c.jL(paramJSONObject[0])));
      localHashMap.put("windowHeight", Integer.valueOf(c.jL(paramJSONObject[1])));
      localHashMap.put("screenWidth", Integer.valueOf(c.jL(paramj.mContext.getResources().getDisplayMetrics().widthPixels)));
      localHashMap.put("screenHeight", Integer.valueOf(c.jL(paramj.mContext.getResources().getDisplayMetrics().heightPixels)));
      localHashMap.put("language", v.eq(paramj.mContext));
      localHashMap.put("version", f.ab(null, d.tJC));
      localHashMap.put("system", "Android " + Build.VERSION.RELEASE);
      localHashMap.put("fontSizeSetting", Integer.valueOf((int)(MultiProcessSharedPreferences.getSharedPreferences(paramj.mContext, ab.bPU(), 0).getFloat("text_size_scale_key", 1.0F) * 16.0F)));
      paramj = d("ok", localHashMap);
      GMTrace.o(10361474383872L, 77199);
      return paramj;
      if ((paramj.mContext instanceof Activity))
      {
        w.i("MicroMsg.JsApiGetSystemInfo", "Method: DecorView");
        paramJSONObject = ((Activity)paramj.mContext).getWindow().getDecorView();
        Rect localRect = new Rect();
        paramJSONObject.getWindowVisibleDisplayFrame(localRect);
        paramJSONObject = new int[2];
        paramJSONObject[0] = (localRect.right - localRect.left);
        paramJSONObject[1] = (localRect.bottom - localRect.top - a.fromDPToPix(paramj.mContext, 48));
      }
      else
      {
        w.i("MicroMsg.JsApiGetSystemInfo", "Method: Screen");
        paramJSONObject = new int[2];
        paramJSONObject[0] = paramj.mContext.getResources().getDisplayMetrics().widthPixels;
        paramJSONObject[1] = paramj.mContext.getResources().getDisplayMetrics().heightPixels;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */