package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.config.i;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 51;
  public static final String NAME = "saveFile";
  
  public e()
  {
    GMTrace.i(10389525889024L, 77408);
    GMTrace.o(10389525889024L, 77408);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10389660106752L, 77409);
    String str = paramj.hyD;
    paramJSONObject = paramJSONObject.optString("tempFilePath");
    if (bg.nm(paramJSONObject))
    {
      w.e("MicroMsg.JsApiSaveFile", "temp localId is null or nil");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10389660106752L, 77409);
      return;
    }
    paramJSONObject = c.aJ(str, paramJSONObject);
    if ((paramJSONObject != null) && (com.tencent.mm.a.e.aZ(paramJSONObject.gpy))) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.JsApiSaveFile", "get temp obj = %s, fileExists = %b", new Object[] { paramJSONObject, Boolean.valueOf(bool) });
      if ((bool) && (!bg.nm(paramJSONObject.gpy))) {
        break;
      }
      paramj.v(paramInt, d("fail:file doesn't exist", null));
      GMTrace.o(10389660106752L, 77409);
      return;
    }
    if (paramJSONObject.hLz)
    {
      paramj.v(paramInt, d("ok", null));
      GMTrace.o(10389660106752L, 77409);
      return;
    }
    long l1 = i.pm(str);
    long l2 = c.oB(str);
    long l3 = new File(paramJSONObject.gpy).length();
    w.i("MicroMsg.JsApiSaveFile", "before markPermanent, quota = %d, occupation = %d, fileLength = %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
    if (l2 + l3 > l1)
    {
      paramj.v(paramInt, d(String.format(Locale.US, "fail:exceed quota %dM", new Object[] { Long.valueOf(l1 / 1048576L) }), null));
      GMTrace.o(10389660106752L, 77409);
      return;
    }
    AppBrandLocalMediaObject localAppBrandLocalMediaObject = c.a(paramJSONObject);
    if (localAppBrandLocalMediaObject == null)
    {
      bool = true;
      if (localAppBrandLocalMediaObject != null) {
        break label426;
      }
      paramJSONObject = null;
      label313:
      if (localAppBrandLocalMediaObject != null) {
        break label435;
      }
    }
    label426:
    label435:
    for (str = null;; str = localAppBrandLocalMediaObject.gpy)
    {
      w.i("MicroMsg.JsApiSaveFile", "after markPermanent, (obj==null): %b, obj.localId: %s, obj.path: %s", new Object[] { Boolean.valueOf(bool), paramJSONObject, str });
      if ((localAppBrandLocalMediaObject == null) || (bg.nm(localAppBrandLocalMediaObject.eHy)) || (bg.nm(localAppBrandLocalMediaObject.gpy))) {
        break label445;
      }
      paramJSONObject = new HashMap(1);
      paramJSONObject.put("savedFilePath", localAppBrandLocalMediaObject.eHy);
      paramj.v(paramInt, d("ok", paramJSONObject));
      GMTrace.o(10389660106752L, 77409);
      return;
      bool = false;
      break;
      paramJSONObject = localAppBrandLocalMediaObject.eHy;
      break label313;
    }
    label445:
    paramj.v(paramInt, d("fail", null));
    GMTrace.o(10389660106752L, 77409);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\file\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */