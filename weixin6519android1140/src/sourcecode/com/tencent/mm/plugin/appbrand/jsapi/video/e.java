package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  implements AppBrandPageView.c
{
  public AppBrandVideoView imI;
  private AppBrandPageView imJ;
  aj imK;
  public int imL;
  
  public e(AppBrandVideoView paramAppBrandVideoView, AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(17343346376704L, 129218);
    this.imI = paramAppBrandVideoView;
    this.imJ = paramAppBrandPageView;
    this.imJ.a(this);
    GMTrace.o(17343346376704L, 129218);
  }
  
  public final JSONObject XK()
  {
    GMTrace.i(17344017465344L, 129223);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("data", this.imI.ilT);
    GMTrace.o(17344017465344L, 129223);
    return localJSONObject;
  }
  
  final void XL()
  {
    GMTrace.i(17344151683072L, 129224);
    if (this.imK != null) {
      this.imK.stopTimer();
    }
    GMTrace.o(17344151683072L, 129224);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.jsapi.e parame, JSONObject paramJSONObject)
  {
    GMTrace.i(17343883247616L, 129222);
    if (!(parame instanceof g)) {
      w.i("MicroMsg.JsApiVideoCallback", "dispatchEvent event %s", new Object[] { parame.getName() });
    }
    parame = parame.ai(this.imJ.hyD, this.imJ.hashCode());
    parame.mData = paramJSONObject.toString();
    parame.VR();
    GMTrace.o(17343883247616L, 129222);
  }
  
  public final void clean()
  {
    GMTrace.i(17343614812160L, 129220);
    this.imJ.b(this);
    XL();
    GMTrace.o(17343614812160L, 129220);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(17343480594432L, 129219);
    w.d("MicroMsg.JsApiVideoCallback", "onDestroy clean");
    clean();
    this.imI.ilW = null;
    GMTrace.o(17343480594432L, 129219);
  }
  
  private static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 131;
    private static final String NAME = "onVideoClickDanmuBtn";
    
    public a()
    {
      GMTrace.i(17343212158976L, 129217);
      GMTrace.o(17343212158976L, 129217);
    }
  }
  
  private static final class b
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 138;
    private static final String NAME = "onVideoEnded";
    
    public b()
    {
      GMTrace.i(17376632373248L, 129466);
      GMTrace.o(17376632373248L, 129466);
    }
  }
  
  private static final class c
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 349;
    private static final String NAME = "onVideoError";
    
    public c()
    {
      GMTrace.i(20742007685120L, 154540);
      GMTrace.o(20742007685120L, 154540);
    }
  }
  
  private static final class d
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 130;
    private static final String NAME = "onVideoFullScreenChange";
    
    public d()
    {
      GMTrace.i(17362807947264L, 129363);
      GMTrace.o(17362807947264L, 129363);
    }
  }
  
  private static final class e
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 128;
    private static final String NAME = "onVideoPause";
    
    public e()
    {
      GMTrace.i(17363479035904L, 129368);
      GMTrace.o(17363479035904L, 129368);
    }
  }
  
  private static final class f
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 127;
    private static final String NAME = "onVideoPlay";
    
    public f()
    {
      GMTrace.i(17343077941248L, 129216);
      GMTrace.o(17343077941248L, 129216);
    }
  }
  
  private static final class g
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 127;
    private static final String NAME = "onVideoTimeUpdate";
    
    public g()
    {
      GMTrace.i(17372874276864L, 129438);
      GMTrace.o(17372874276864L, 129438);
    }
  }
  
  private static final class h
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 350;
    private static final String NAME = "onVideoWaiting";
    
    public h()
    {
      GMTrace.i(20741873467392L, 154539);
      GMTrace.o(20741873467392L, 154539);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */