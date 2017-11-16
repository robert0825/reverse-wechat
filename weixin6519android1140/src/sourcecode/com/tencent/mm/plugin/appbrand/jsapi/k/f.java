package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.a;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.Set;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  public static final int CTRL_INDEX = 298;
  public static final String NAME = "insertHTMLWebView";
  
  public f()
  {
    GMTrace.i(19752823029760L, 147170);
    GMTrace.o(19752823029760L, 147170);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, final JSONObject paramJSONObject)
  {
    GMTrace.i(19752957247488L, 147171);
    if (paramAppBrandPageView.Zx() != null)
    {
      GMTrace.o(19752957247488L, 147171);
      return null;
    }
    paramJSONObject = new a(paramAppBrandPageView.mContext, paramAppBrandPageView.hzM, paramAppBrandPageView);
    AppBrandPageView.a local1 = new AppBrandPageView.a()
    {
      public final boolean Yb()
      {
        GMTrace.i(19750943981568L, 147156);
        if (paramJSONObject.inX.canGoBack())
        {
          paramJSONObject.inX.goBack();
          GMTrace.o(19750943981568L, 147156);
          return true;
        }
        GMTrace.o(19750943981568L, 147156);
        return false;
      }
    };
    paramAppBrandPageView.ive.add(local1);
    GMTrace.o(19752957247488L, 147171);
    return paramJSONObject;
  }
  
  protected final void a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(19753225682944L, 147173);
    GMTrace.o(19753225682944L, 147173);
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(19753091465216L, 147172);
    int i = paramJSONObject.getInt("htmlId");
    GMTrace.o(19753091465216L, 147172);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\k\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */