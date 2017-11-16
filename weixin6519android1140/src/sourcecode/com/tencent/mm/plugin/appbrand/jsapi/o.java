package com.tencent.mm.plugin.appbrand.jsapi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.g;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class o
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 342;
  public static final String NAME = "animateCoverView";
  
  public o()
  {
    GMTrace.i(19826105909248L, 147716);
    GMTrace.o(19826105909248L, 147716);
  }
  
  protected final boolean VS()
  {
    GMTrace.i(19826508562432L, 147719);
    GMTrace.o(19826508562432L, 147719);
    return true;
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject, final g paramg)
  {
    GMTrace.i(20747510611968L, 154581);
    for (;;)
    {
      String str;
      try
      {
        paramAppBrandPageView = paramJSONObject.getJSONObject("finalStyle");
        float f1 = com.tencent.mm.plugin.appbrand.n.c.a(paramAppBrandPageView, "left", com.tencent.mm.plugin.appbrand.n.c.V(paramView.getX()));
        float f2 = com.tencent.mm.plugin.appbrand.n.c.a(paramAppBrandPageView, "top", com.tencent.mm.plugin.appbrand.n.c.V(paramView.getY()));
        double d = paramAppBrandPageView.optDouble("opacity", paramView.getAlpha());
        float f3 = (float)d;
        paramInt = paramJSONObject.optInt("duration", 300);
        str = paramJSONObject.optString("easing", "linear");
        paramJSONObject = ObjectAnimator.ofFloat(paramView, "x", new float[] { paramView.getX(), f1 });
        ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(paramView, "y", new float[] { paramView.getY(), f2 });
        ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(paramView, "alpha", new float[] { paramView.getAlpha(), f3 });
        AnimatorSet localAnimatorSet = new AnimatorSet();
        localAnimatorSet.setDuration(paramInt);
        paramView = null;
        paramAppBrandPageView = paramView;
        if (str != null)
        {
          if (str.equals("ease")) {
            paramAppBrandPageView = new AccelerateDecelerateInterpolator();
          }
        }
        else
        {
          paramView = paramAppBrandPageView;
          if (paramAppBrandPageView == null) {
            paramView = new LinearInterpolator();
          }
          localAnimatorSet.setInterpolator(paramView);
          localAnimatorSet.addListener(new AnimatorListenerAdapter()
          {
            public final void onAnimationEnd(Animator paramAnonymousAnimator)
            {
              GMTrace.i(19825569038336L, 147712);
              paramg.qp(o.this.d("ok", null));
              GMTrace.o(19825569038336L, 147712);
            }
          });
          localAnimatorSet.playTogether(new Animator[] { paramJSONObject, localObjectAnimator1, localObjectAnimator2 });
          localAnimatorSet.start();
          GMTrace.o(20747510611968L, 154581);
          return true;
        }
      }
      catch (JSONException paramAppBrandPageView)
      {
        w.w("MicroMsg.JsApiAnimateCoverView", "get finalStyle error : %s", new Object[] { Log.getStackTraceString(paramAppBrandPageView) });
        paramg.qp(d("fail:missing finalStyle", null));
        GMTrace.o(20747510611968L, 154581);
        return false;
      }
      if (str.equals("ease-in"))
      {
        paramAppBrandPageView = new AccelerateInterpolator();
      }
      else
      {
        paramAppBrandPageView = paramView;
        if (str.equals("ease-out")) {
          paramAppBrandPageView = new DecelerateInterpolator();
        }
      }
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(19826240126976L, 147717);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(19826240126976L, 147717);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */