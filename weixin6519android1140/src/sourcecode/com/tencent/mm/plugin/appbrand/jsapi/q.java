package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class q
  extends a
{
  public static final int CTRL_INDEX = 250;
  public static final String NAME = "captureScreen";
  
  public q()
  {
    GMTrace.i(17338514538496L, 129182);
    GMTrace.o(17338514538496L, 129182);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17338648756224L, 129183);
    Object localObject1 = paramj.hyD;
    w.i("MicroMsg.JsApiCaptureScreen", "captureScreen, appId:%s", new Object[] { localObject1 });
    paramJSONObject = b(paramj);
    if (paramJSONObject != null)
    {
      paramJSONObject = com.tencent.mm.sdk.platformtools.d.cY(paramJSONObject.iui);
      Object localObject2 = c.aE((String)localObject1, "appbrand_capture_" + System.currentTimeMillis());
      w.i("MicroMsg.JsApiCaptureScreen", "capture bitmap path:%s", new Object[] { localObject2 });
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramJSONObject, 100, Bitmap.CompressFormat.PNG, (String)localObject2, true);
        localObject1 = c.b((String)localObject1, (String)localObject2, "png", true);
        if (localObject1 == null)
        {
          w.w("MicroMsg.JsApiCaptureScreen", "create temp file failed, path:%s", new Object[] { localObject2 });
          paramj.v(paramInt, d("fail:gen temp file failed", null));
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
          GMTrace.o(17338648756224L, 129183);
          return;
        }
        localObject2 = new HashMap();
        ((HashMap)localObject2).put("tempFilePath", ((AppBrandLocalMediaObject)localObject1).eHy);
        w.i("MicroMsg.JsApiCaptureScreen", "capture bitmap tempFilePath:%s", new Object[] { ((AppBrandLocalMediaObject)localObject1).eHy });
        paramj.v(paramInt, d("ok", (Map)localObject2));
        if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
          paramJSONObject.recycle();
        }
        GMTrace.o(17338648756224L, 129183);
        return;
      }
      catch (IOException localIOException)
      {
        w.w("MicroMsg.JsApiCaptureScreen", "save bitmap to file failed, . exception : %s", new Object[] { localIOException });
        paramj.v(paramInt, d("fail:IOException", null));
        if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
          paramJSONObject.recycle();
        }
        GMTrace.o(17338648756224L, 129183);
        return;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.JsApiCaptureScreen", "save bitmap to file failed, . exception : %s", new Object[] { localException });
        paramj.v(paramInt, d("fail:Exception", null));
        if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
          paramJSONObject.recycle();
        }
        GMTrace.o(17338648756224L, 129183);
        return;
      }
      finally
      {
        if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
          paramJSONObject.recycle();
        }
      }
    }
    w.e("MicroMsg.JsApiCaptureScreen", "captureScreen, container or pageView is null");
    paramj.v(paramInt, d("fail:container or pageView is null", null));
    GMTrace.o(17338648756224L, 129183);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */