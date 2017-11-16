package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class IPCallFeedbackScrollView
  extends ScrollView
{
  public IPCallFeedbackScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11722039492608L, 87336);
    GMTrace.o(11722039492608L, 87336);
  }
  
  public IPCallFeedbackScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11722173710336L, 87337);
    GMTrace.o(11722173710336L, 87337);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11722307928064L, 87338);
    try
    {
      Display localDisplay = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      localDisplay.getMetrics(localDisplayMetrics);
      int i = View.MeasureSpec.makeMeasureSpec(localDisplayMetrics.heightPixels / 2, Integer.MIN_VALUE);
      paramInt2 = i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.IPCallFeedbackScrollView", localException, "", new Object[0]);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(11722307928064L, 87338);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallFeedbackScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */