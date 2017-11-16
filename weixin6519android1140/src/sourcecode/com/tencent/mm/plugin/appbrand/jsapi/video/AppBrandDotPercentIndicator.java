package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.sdk.platformtools.w;

public class AppBrandDotPercentIndicator
  extends LinearLayout
{
  LayoutInflater CJ;
  int ilo;
  
  public AppBrandDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17344285900800L, 129225);
    init(paramContext);
    GMTrace.o(17344285900800L, 129225);
  }
  
  public AppBrandDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17344420118528L, 129226);
    init(paramContext);
    GMTrace.o(17344420118528L, 129226);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(17344554336256L, 129227);
    this.CJ = LayoutInflater.from(paramContext);
    GMTrace.o(17344554336256L, 129227);
  }
  
  public final void Q(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    GMTrace.i(17344688553984L, 129228);
    if (paramFloat < 0.0F)
    {
      paramFloat = f2;
      if (paramFloat <= 1.0F) {
        break label122;
      }
      paramFloat = f1;
    }
    int j;
    label122:
    for (;;)
    {
      int k = (int)Math.rint(this.ilo * paramFloat);
      w.v("MicroMsg.AppBrandDotPercentIndicator", "setPercent percent:%s dotsOnNum:%d", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(k) });
      int i = 0;
      for (;;)
      {
        j = i;
        if (i >= k) {
          break;
        }
        j = i;
        if (i >= getChildCount()) {
          break;
        }
        ((ImageView)getChildAt(i)).setImageResource(o.e.hAq);
        i += 1;
      }
      break;
    }
    while (j < getChildCount())
    {
      ((ImageView)getChildAt(j)).setImageResource(o.e.hAp);
      j += 1;
    }
    GMTrace.o(17344688553984L, 129228);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\AppBrandDotPercentIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */