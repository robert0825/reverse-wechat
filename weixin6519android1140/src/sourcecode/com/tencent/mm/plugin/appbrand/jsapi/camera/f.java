package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 329;
  public static final String NAME = "insertCamera";
  
  public f()
  {
    GMTrace.i(19838453940224L, 147808);
    GMTrace.o(19838453940224L, 147808);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(19838588157952L, 147809);
    Context localContext = paramAppBrandPageView.mContext;
    AppBrandCameraView localAppBrandCameraView = new AppBrandCameraView(localContext);
    int i = paramJSONObject.optInt("cameraId");
    String str1 = paramJSONObject.optString("devicePosition", "back");
    String str2 = paramJSONObject.optString("flash", "auto");
    boolean bool = paramJSONObject.optBoolean("needOutput", false);
    localAppBrandCameraView.hyD = paramAppBrandPageView.hyD;
    localAppBrandCameraView.idw = paramAppBrandPageView;
    localAppBrandCameraView.idx = i;
    localAppBrandCameraView.M(str1, true);
    localAppBrandCameraView.qr(str2);
    localAppBrandCameraView.idB = bool;
    paramJSONObject = paramJSONObject.optJSONObject("position");
    int j = com.tencent.mm.plugin.appbrand.n.c.b(paramJSONObject, "width");
    int k = com.tencent.mm.plugin.appbrand.n.c.b(paramJSONObject, "height");
    if ((j != 0) && (k != 0)) {
      localAppBrandCameraView.bq(j, k);
    }
    w.d("MicroMsg.JsApiInsertCamera", "inflateView appId:%s,cameraId: %d,devicePosition: %s,flash: %s,width: %d,height: %d", new Object[] { paramAppBrandPageView.hyD, Integer.valueOf(i), str1, str2, Integer.valueOf(j), Integer.valueOf(k) });
    a(paramAppBrandPageView, localAppBrandCameraView);
    paramAppBrandPageView = new CoverViewContainer(localContext, localAppBrandCameraView);
    GMTrace.o(19838588157952L, 147809);
    return paramAppBrandPageView;
  }
  
  protected final void a(final AppBrandPageView paramAppBrandPageView, final int paramInt, final View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(19838856593408L, 147811);
    w.i("MicroMsg.JsApiInsertCamera", "onInsertView cameraId=%d", new Object[] { Integer.valueOf(paramInt) });
    paramView = (AppBrandCameraView)((CoverViewContainer)paramView).J(AppBrandCameraView.class);
    paramJSONObject = a.a.idv;
    int i = paramView.idx;
    paramJSONObject.idu.put(Integer.valueOf(i), paramView);
    paramAppBrandPageView.a(paramView);
    paramAppBrandPageView.a(paramView);
    paramAppBrandPageView.a(paramView);
    com.tencent.mm.plugin.appbrand.c.a(paramAppBrandPageView.hyD, new c.b()
    {
      public final void onDestroy()
      {
        GMTrace.i(19835769585664L, 147788);
        paramAppBrandPageView.b(paramView);
        paramAppBrandPageView.b(paramView);
        paramAppBrandPageView.b(paramView);
        a.a.idv.g(Integer.valueOf(paramInt));
        com.tencent.mm.plugin.appbrand.c.b(paramAppBrandPageView.hyD, this);
        GMTrace.o(19835769585664L, 147788);
      }
    });
    paramView.idI = new b() {};
    GMTrace.o(19838856593408L, 147811);
  }
  
  public final boolean a(final AppBrandPageView paramAppBrandPageView, final AppBrandCameraView paramAppBrandCameraView)
  {
    GMTrace.i(19838990811136L, 147812);
    com.tencent.mm.plugin.appbrand.a.a(paramAppBrandPageView.hyD, new android.support.v4.app.a.a()
    {
      public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(19844762173440L, 147855);
        if (paramAnonymousInt == 16)
        {
          if (paramAnonymousArrayOfInt[0] == 0)
          {
            a.a.idv.ids = true;
            f.this.a(paramAppBrandPageView, paramAppBrandCameraView);
            GMTrace.o(19844762173440L, 147855);
            return;
          }
          paramAnonymousArrayOfString = new HashMap();
          paramAnonymousArrayOfString.put("cameraId", Integer.valueOf(paramAppBrandCameraView.idx));
          paramAnonymousArrayOfString = new JSONObject(paramAnonymousArrayOfString).toString();
          paramAnonymousArrayOfInt = new d().a(paramAppBrandPageView);
          paramAnonymousArrayOfInt.mData = paramAnonymousArrayOfString;
          paramAnonymousArrayOfInt.VR();
          a.a.idv.ids = false;
          GMTrace.o(19844762173440L, 147855);
          return;
        }
        if (paramAnonymousInt == 18)
        {
          if (paramAnonymousArrayOfInt[0] == 0)
          {
            a.a.idv.idt = true;
            f.this.a(paramAppBrandPageView, paramAppBrandCameraView);
            GMTrace.o(19844762173440L, 147855);
            return;
          }
          paramAnonymousArrayOfString = new HashMap();
          paramAnonymousArrayOfString.put("cameraId", Integer.valueOf(paramAppBrandCameraView.idx));
          paramAnonymousArrayOfString = new JSONObject(paramAnonymousArrayOfString).toString();
          paramAnonymousArrayOfInt = new d().a(paramAppBrandPageView);
          paramAnonymousArrayOfInt.mData = paramAnonymousArrayOfString;
          paramAnonymousArrayOfInt.VR();
          a.a.idv.idt = false;
        }
        GMTrace.o(19844762173440L, 147855);
      }
    });
    Activity localActivity = (Activity)paramAppBrandPageView.mContext;
    if (localActivity == null)
    {
      GMTrace.o(19838990811136L, 147812);
      return false;
    }
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(localActivity, "android.permission.CAMERA", 16, "", "");
    a.a.idv.ids = bool;
    if (!bool)
    {
      GMTrace.o(19838990811136L, 147812);
      return false;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a(localActivity, "android.permission.RECORD_AUDIO", 18, "", "");
    a.a.idv.idt = bool;
    if (!bool)
    {
      GMTrace.o(19838990811136L, 147812);
      return false;
    }
    com.tencent.mm.plugin.appbrand.a.nJ(paramAppBrandPageView.hyD);
    paramAppBrandCameraView.MP();
    GMTrace.o(19838990811136L, 147812);
    return true;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(19838722375680L, 147810);
    int i = paramJSONObject.optInt("cameraId");
    GMTrace.o(19838722375680L, 147810);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\camera\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */