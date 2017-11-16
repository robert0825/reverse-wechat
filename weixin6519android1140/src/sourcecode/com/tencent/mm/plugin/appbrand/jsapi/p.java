package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class p
  extends a
{
  public static final int CTRL_INDEX = 100;
  public static final String NAME = "canvasToTempFilePath";
  
  public p()
  {
    GMTrace.i(10408047935488L, 77546);
    GMTrace.o(10408047935488L, 77546);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10408182153216L, 77547);
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10294231302144L, 76698);
        com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10431938691072L, 77724);
            p.this.b(p.1.this.hXV, p.1.this.hXZ, p.1.this.fXx);
            GMTrace.o(10431938691072L, 77724);
          }
        });
        GMTrace.o(10294231302144L, 76698);
      }
    }, 100L);
    GMTrace.o(10408182153216L, 77547);
  }
  
  public final void b(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(16055661494272L, 119624);
    super.a(paramj, paramJSONObject, paramInt);
    AppBrandPageView localAppBrandPageView = b(paramj);
    if (localAppBrandPageView == null)
    {
      w.w("MicroMsg.JsApiCanvasToTempFilePath", "invoke JsApi insertView failed, current page view is null.");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(16055661494272L, 119624);
      return;
    }
    int i;
    try
    {
      i = paramJSONObject.getInt("canvasId");
      localObject1 = localAppBrandPageView.ivh.jr(i);
      if (localObject1 == null)
      {
        w.w("MicroMsg.JsApiCanvasToTempFilePath", "get view by viewId(%s) return null.", new Object[] { Integer.valueOf(i) });
        paramj.v(paramInt, d("fail:get canvas by canvasId failed", null));
        GMTrace.o(16055661494272L, 119624);
        return;
      }
    }
    catch (JSONException paramJSONObject)
    {
      w.w("MicroMsg.JsApiCanvasToTempFilePath", "canvasId do not exist. exception : %s", new Object[] { paramJSONObject });
      paramj.v(paramInt, d("fail:canvasId do not exist", null));
      GMTrace.o(16055661494272L, 119624);
      return;
    }
    if (!(localObject1 instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiCanvasToTempFilePath", "the view(%s) is not a instance of CoverViewContainer.", new Object[] { Integer.valueOf(i) });
      paramj.v(paramInt, d("fail:the view is not a instance of CoverViewContainer", null));
      GMTrace.o(16055661494272L, 119624);
      return;
    }
    Object localObject1 = ((CoverViewContainer)localObject1).J(View.class);
    if (localObject1 == null)
    {
      w.w("MicroMsg.JsApiCanvasToTempFilePath", "getTargetView return null, viewId(%s).", new Object[] { Integer.valueOf(i) });
      paramj.v(paramInt, d("fail:target view is null.", null));
      GMTrace.o(16055661494272L, 119624);
      return;
    }
    int j = ((View)localObject1).getMeasuredWidth();
    int k = ((View)localObject1).getMeasuredHeight();
    label936:
    label943:
    label1016:
    label1019:
    for (;;)
    {
      Object localObject2;
      float f3;
      float f4;
      float f1;
      float f2;
      float f5;
      float f6;
      try
      {
        localObject2 = Bitmap.createBitmap(j, k, Bitmap.Config.ARGB_8888);
        f3 = com.tencent.mm.plugin.appbrand.n.c.c(paramJSONObject, "x");
        f4 = com.tencent.mm.plugin.appbrand.n.c.c(paramJSONObject, "y");
        f1 = com.tencent.mm.plugin.appbrand.n.c.a(paramJSONObject, "width", j);
        f2 = com.tencent.mm.plugin.appbrand.n.c.a(paramJSONObject, "height", k);
        if (f3 + f1 <= j) {
          break label1019;
        }
        f1 = j - f3;
        if (f4 + f2 <= k) {
          break label1016;
        }
        f2 = k - f4;
        f5 = (float)paramJSONObject.optDouble("destWidth", f1);
        f6 = (float)paramJSONObject.optDouble("destHeight", f2);
        if ((f3 < 0.0F) || (f4 < 0.0F) || (f1 <= 0.0F) || (f2 <= 0.0F) || (f3 + f1 > j) || (f4 + f2 > k) || (f5 <= 0.0F) || (f6 <= 0.0F))
        {
          w.e("MicroMsg.JsApiCanvasToTempFilePath", "illegal arguments(x : %s, y : %s, width : %s, height : %s) failed, viewId(%s).", new Object[] { Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i) });
          paramj.v(paramInt, d("fail:illegal arguments", null));
          GMTrace.o(16055661494272L, 119624);
          return;
        }
      }
      catch (Exception paramJSONObject)
      {
        w.w("MicroMsg.JsApiCanvasToTempFilePath", "create bitmap failed, viewId(%s). Exception : %s", new Object[] { Integer.valueOf(i), paramJSONObject });
        paramj.v(paramInt, d("fail:create bitmap failed", null));
        GMTrace.o(16055661494272L, 119624);
        return;
      }
      String str;
      if ((localObject1 instanceof com.tencent.mm.plugin.appbrand.canvas.widget.a))
      {
        ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1).d(new f((Bitmap)localObject2));
        if (f1 == j)
        {
          localObject1 = localObject2;
          if (f2 == k) {}
        }
        else
        {
          localObject1 = Bitmap.createBitmap((Bitmap)localObject2, (int)f3, (int)f4, (int)f1, (int)f2, null, false);
          ((Bitmap)localObject2).recycle();
        }
        if (f1 == f5)
        {
          localObject2 = localObject1;
          if (f2 == f6) {}
        }
        else
        {
          localObject2 = Bitmap.createScaledBitmap((Bitmap)localObject1, (int)f5, (int)f6, false);
          ((Bitmap)localObject1).recycle();
        }
        str = com.tencent.mm.plugin.appbrand.appstorage.c.aE(localAppBrandPageView.hyD, "canvas_" + i);
        localObject1 = Bitmap.CompressFormat.PNG;
        if ("jpg".equalsIgnoreCase(paramJSONObject.optString("fileType"))) {
          localObject1 = Bitmap.CompressFormat.JPEG;
        }
      }
      for (;;)
      {
        try
        {
          f1 = (float)paramJSONObject.optDouble("quality", 1.0D);
          if (f1 < 0.0F)
          {
            f1 = 0.0F;
            com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject2, (int)f1, (Bitmap.CompressFormat)localObject1, str, true);
            localObject2 = localAppBrandPageView.hyD;
            if (localObject1 != Bitmap.CompressFormat.JPEG) {
              break label936;
            }
            paramJSONObject = "jpg";
            paramJSONObject = com.tencent.mm.plugin.appbrand.appstorage.c.b((String)localObject2, str, paramJSONObject, true);
            if (paramJSONObject != null) {
              break label943;
            }
            w.w("MicroMsg.JsApiCanvasToTempFilePath", "gen temp file failed, canvasId : %s.", new Object[] { Integer.valueOf(i) });
            paramj.v(paramInt, d("fail:gen temp file failed", null));
            GMTrace.o(16055661494272L, 119624);
            return;
            ((View)localObject1).draw(new f((Bitmap)localObject2));
            break;
          }
          if (f1 > 1.0F)
          {
            f1 = 100.0F;
          }
          else
          {
            f1 *= 100.0F;
            continue;
            paramJSONObject = "png";
          }
        }
        catch (IOException paramJSONObject)
        {
          w.w("MicroMsg.JsApiCanvasToTempFilePath", "save bitmap to file failed, viewId(%s). exception : %s", new Object[] { Integer.valueOf(i), paramJSONObject });
          paramj.v(paramInt, d("fail:write file failed", null));
          GMTrace.o(16055661494272L, 119624);
          return;
        }
      }
      localObject1 = new HashMap();
      ((Map)localObject1).put("tempFilePath", paramJSONObject.eHy);
      paramj.v(paramInt, d("ok", (Map)localObject1));
      w.v("MicroMsg.JsApiCanvasToTempFilePath", "save file(id : %s) to path : %s", new Object[] { paramJSONObject.eHy, paramJSONObject.gpy });
      GMTrace.o(16055661494272L, 119624);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */