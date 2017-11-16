package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  private static final int CTRL_INDEX = 331;
  public static final String NAME = "updateCamera";
  
  public j()
  {
    GMTrace.i(19844225302528L, 147851);
    GMTrace.o(19844225302528L, 147851);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(19844493737984L, 147853);
    w.i("MicroMsg.JsApiUpdateCamera", "onUpdateView : cameraId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiUpdateCamera", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(19844493737984L, 147853);
      return false;
    }
    paramView = (AppBrandCameraView)((CoverViewContainer)paramView).J(AppBrandCameraView.class);
    if (paramView == null)
    {
      w.w("MicroMsg.JsApiUpdateCamera", "the camera view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(19844493737984L, 147853);
      return false;
    }
    paramInt = paramJSONObject.optInt("cameraId");
    String str1 = paramJSONObject.optString("devicePosition", "back");
    String str2 = paramJSONObject.optString("flash", "auto");
    boolean bool1 = paramJSONObject.optBoolean("needOutput", false);
    paramView.hyD = paramAppBrandPageView.hyD;
    paramView.M(str1, false);
    paramView.qr(str2);
    paramView.idB = bool1;
    paramAppBrandPageView = paramJSONObject.optJSONObject("position");
    int i = com.tencent.mm.plugin.appbrand.n.c.b(paramAppBrandPageView, "width");
    int j = com.tencent.mm.plugin.appbrand.n.c.b(paramAppBrandPageView, "height");
    w.d("MicroMsg.JsApiUpdateCamera", "onUpdateView cameraId: %d, devicePosition: %s,flash: %s,width： %d,height： %d", new Object[] { Integer.valueOf(paramInt), str1, str2, Integer.valueOf(i), Integer.valueOf(j) });
    boolean bool2 = false;
    bool1 = bool2;
    if (i != 0)
    {
      bool1 = bool2;
      if (j != 0) {
        bool1 = paramView.bq(i, j);
      }
    }
    if (bool1)
    {
      paramView.release();
      paramView.MP();
    }
    for (;;)
    {
      GMTrace.o(19844493737984L, 147853);
      return true;
      paramView.WB();
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(19844359520256L, 147852);
    int i = paramJSONObject.optInt("cameraId");
    GMTrace.o(19844359520256L, 147852);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\camera\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */