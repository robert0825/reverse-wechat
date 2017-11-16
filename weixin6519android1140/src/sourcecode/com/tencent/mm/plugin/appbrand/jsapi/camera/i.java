package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class i
  extends b
{
  private static final int CTRL_INDEX = 330;
  public static final String NAME = "removeCamera";
  
  public i()
  {
    GMTrace.i(19836306456576L, 147792);
    GMTrace.o(19836306456576L, 147792);
  }
  
  protected final boolean b(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(19836574892032L, 147794);
    super.b(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    w.i("MicroMsg.JsApiRemoveCamera", "onRemoveView cameraId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiRemoveCamera", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(19836574892032L, 147794);
      return false;
    }
    paramView = (AppBrandCameraView)((CoverViewContainer)paramView).J(AppBrandCameraView.class);
    if (paramView == null)
    {
      w.w("MicroMsg.JsApiRemoveCamera", "the camera view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(19836574892032L, 147794);
      return false;
    }
    paramAppBrandPageView.b(paramView);
    paramAppBrandPageView.b(paramView);
    paramAppBrandPageView.b(paramView);
    paramView.release();
    GMTrace.o(19836574892032L, 147794);
    return true;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(19836440674304L, 147793);
    int i = paramJSONObject.optInt("cameraId", 0);
    GMTrace.o(19836440674304L, 147793);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\camera\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */