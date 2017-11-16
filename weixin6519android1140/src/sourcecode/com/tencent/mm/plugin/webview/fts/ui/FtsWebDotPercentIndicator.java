package com.tencent.mm.plugin.webview.fts.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.sdk.platformtools.w;

public class FtsWebDotPercentIndicator
  extends LinearLayout
{
  LayoutInflater CJ;
  int ilo;
  
  public FtsWebDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20484980736000L, 152625);
    init(paramContext);
    GMTrace.o(20484980736000L, 152625);
  }
  
  public FtsWebDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20485114953728L, 152626);
    init(paramContext);
    GMTrace.o(20485114953728L, 152626);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(20485249171456L, 152627);
    this.CJ = LayoutInflater.from(paramContext);
    GMTrace.o(20485249171456L, 152627);
  }
  
  public final void Q(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    GMTrace.i(20485383389184L, 152628);
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
        ((ImageView)getChildAt(i)).setImageResource(R.g.aWP);
        i += 1;
      }
      break;
    }
    while (j < getChildCount())
    {
      ((ImageView)getChildAt(j)).setImageResource(R.g.aWO);
      j += 1;
    }
    GMTrace.o(20485383389184L, 152628);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\ui\FtsWebDotPercentIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */