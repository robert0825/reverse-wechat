package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.widget.a;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.base.g;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public class v
  extends c
{
  public static final int CTRL_INDEX = 69;
  public static final String NAME = "drawCanvas";
  
  public v()
  {
    GMTrace.i(10351139618816L, 77122);
    GMTrace.o(10351139618816L, 77122);
  }
  
  protected final boolean VS()
  {
    GMTrace.i(20704158285824L, 154258);
    GMTrace.o(20704158285824L, 154258);
    return true;
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject, final g paramg)
  {
    GMTrace.i(20704024068096L, 154257);
    if (!(paramView instanceof CoverViewContainer))
    {
      w.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of CoverViewContainer.(%s)", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20704024068096L, 154257);
      return false;
    }
    Object localObject = ((CoverViewContainer)paramView).J(View.class);
    w.d("MicroMsg.JsApiDrawCanvas", "drawCanvas(id : %s)", new Object[] { Integer.valueOf(paramInt) });
    if (!(localObject instanceof a))
    {
      w.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of AppBrandDrawableView.(%s)", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20704024068096L, 154257);
      return false;
    }
    long l = System.currentTimeMillis();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("actions");
    boolean bool = paramJSONObject.optBoolean("reserve");
    localObject = (a)localObject;
    if (bool) {
      ((a)localObject).b(localJSONArray, new a.a()
      {
        public final void TU()
        {
          GMTrace.i(20748047482880L, 154585);
          paramg.qp(v.this.d("ok", null));
          GMTrace.o(20748047482880L, 154585);
        }
      });
    }
    for (;;)
    {
      ((a)localObject).TM();
      w.v("MicroMsg.JsApiDrawCanvas", "post drawCanvas cost : %sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      bool = super.a(paramAppBrandPageView, paramInt, paramView, paramJSONObject, paramg);
      GMTrace.o(20704024068096L, 154257);
      return bool;
      ((a)localObject).a(localJSONArray, new a.a()
      {
        public final void TU()
        {
          GMTrace.i(20748315918336L, 154587);
          paramg.qp(v.this.d("ok", null));
          GMTrace.o(20748315918336L, 154587);
        }
      });
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10351408054272L, 77124);
    int i = paramJSONObject.getInt("canvasId");
    GMTrace.o(10351408054272L, 77124);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */