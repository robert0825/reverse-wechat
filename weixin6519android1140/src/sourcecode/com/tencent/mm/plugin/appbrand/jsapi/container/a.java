package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "insertContainer";
  
  public a()
  {
    GMTrace.i(15466311450624L, 115233);
    GMTrace.o(15466311450624L, 115233);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(15466445668352L, 115234);
    paramAppBrandPageView = new AppBrandNativeContainerView(paramAppBrandPageView.mContext);
    paramAppBrandPageView.setBackgroundColor(0);
    boolean bool1 = paramJSONObject.optBoolean("visible", true);
    boolean bool2 = paramJSONObject.optBoolean("canFullScreenByChild", false);
    int j = com.tencent.mm.plugin.appbrand.n.c.b(paramJSONObject, "contentOffsetLeft");
    int k = com.tencent.mm.plugin.appbrand.n.c.b(paramJSONObject, "contentOffsetTop");
    if (bool1) {}
    for (int i = 0;; i = 4)
    {
      paramAppBrandPageView.setVisibility(i);
      paramAppBrandPageView.setPadding(-j, -k, 0, 0);
      paramAppBrandPageView.setDuplicateParentStateEnabled(true);
      paramAppBrandPageView.ies = bool2;
      GMTrace.o(15466445668352L, 115234);
      return paramAppBrandPageView;
    }
  }
  
  protected final void a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17672716681216L, 131672);
    paramView.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17672985116672L, 131674);
        if (paramAnonymousMotionEvent.getAction() != 0) {
          com.tencent.mm.plugin.appbrand.jsapi.j.c.a((ViewGroup)paramAnonymousView, paramAnonymousMotionEvent);
        }
        GMTrace.o(17672985116672L, 131674);
        return false;
      }
    });
    GMTrace.o(17672716681216L, 131672);
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(15466579886080L, 115235);
    int i = paramJSONObject.getInt("containerId");
    GMTrace.o(15466579886080L, 115235);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\container\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */