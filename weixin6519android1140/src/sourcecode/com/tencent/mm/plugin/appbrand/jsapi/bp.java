package com.tencent.mm.plugin.appbrand.jsapi;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.14;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.24;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.9;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class bp
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "setNavigationBarColor";
  
  public bp()
  {
    GMTrace.i(17395154419712L, 129604);
    GMTrace.o(17395154419712L, 129604);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17395288637440L, 129605);
    try
    {
      l = g.sr(paramJSONObject.getString("frontColor"));
      if (l == -1L) {
        throw new Exception();
      }
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiSetNavigationBarColor", "Color parse error");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(17395288637440L, 129605);
      return;
    }
    int j = (int)l;
    long l = g.sr(paramJSONObject.getString("backgroundColor"));
    if (l == -1L) {
      throw new Exception();
    }
    int k = (int)l;
    int i = 0;
    final Object localObject1 = "";
    Object localObject2 = paramJSONObject.optJSONObject("animation");
    paramJSONObject = (JSONObject)localObject1;
    if (localObject2 != null)
    {
      i = ((JSONObject)localObject2).optInt("duration");
      paramJSONObject = ((JSONObject)localObject2).optString("timingFunc");
    }
    localObject1 = b(paramj);
    if (localObject1 == null)
    {
      paramj.v(paramInt, d("fail:no page for now", null));
      GMTrace.o(17395288637440L, 129605);
      return;
    }
    int m = ((AppBrandPageView)localObject1).ivf.Cj;
    int n = ((AppBrandPageView)localObject1).ivf.iIP;
    if ("linear".equals(paramJSONObject)) {
      paramJSONObject = new LinearInterpolator();
    }
    for (;;)
    {
      localObject2 = new ValueAnimator();
      ((ValueAnimator)localObject2).setIntValues(new int[] { m, k });
      ((ValueAnimator)localObject2).setEvaluator(new ArgbEvaluator());
      ((ValueAnimator)localObject2).setDuration(i);
      ((ValueAnimator)localObject2).setInterpolator(paramJSONObject);
      ((ValueAnimator)localObject2).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(17338380320768L, 129181);
          AppBrandPageView localAppBrandPageView = localObject1;
          int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          localAppBrandPageView.ivo = true;
          localAppBrandPageView.ivp = i;
          localAppBrandPageView.runOnUiThread(new AppBrandPageView.24(localAppBrandPageView));
          localAppBrandPageView = localObject1;
          localAppBrandPageView.runOnUiThread(new AppBrandPageView.9(localAppBrandPageView, ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue()));
          GMTrace.o(17338380320768L, 129181);
        }
      });
      ValueAnimator localValueAnimator = new ValueAnimator();
      localValueAnimator.setIntValues(new int[] { n, j });
      localValueAnimator.setEvaluator(new ArgbEvaluator());
      localValueAnimator.setDuration(i);
      localValueAnimator.setInterpolator(paramJSONObject);
      localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(17339319844864L, 129188);
          AppBrandPageView localAppBrandPageView = localObject1;
          localAppBrandPageView.runOnUiThread(new AppBrandPageView.14(localAppBrandPageView, ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue()));
          GMTrace.o(17339319844864L, 129188);
        }
      });
      ((ValueAnimator)localObject2).start();
      localValueAnimator.start();
      paramj.v(paramInt, d("ok", null));
      GMTrace.o(17395288637440L, 129605);
      return;
      if ("easeIn".equals(paramJSONObject)) {
        paramJSONObject = new AccelerateInterpolator();
      } else if ("easeOut".equals(paramJSONObject)) {
        paramJSONObject = new DecelerateInterpolator();
      } else if ("easeInOut".equals(paramJSONObject)) {
        paramJSONObject = new AccelerateDecelerateInterpolator();
      } else {
        paramJSONObject = null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */