package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;

public class IPCallPayButtonLayout
  extends RelativeLayout
{
  public IPCallPayButtonLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11654125322240L, 86830);
    GMTrace.o(11654125322240L, 86830);
  }
  
  public IPCallPayButtonLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11653991104512L, 86829);
    GMTrace.o(11653991104512L, 86829);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11654259539968L, 86831);
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec((int)(getMeasuredWidth() * 0.62D), 1073741824));
    GMTrace.o(11654259539968L, 86831);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallPayButtonLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */