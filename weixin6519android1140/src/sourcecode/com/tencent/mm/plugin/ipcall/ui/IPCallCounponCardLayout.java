package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;

public class IPCallCounponCardLayout
  extends RelativeLayout
{
  public IPCallCounponCardLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11656138588160L, 86845);
    GMTrace.o(11656138588160L, 86845);
  }
  
  public IPCallCounponCardLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11656004370432L, 86844);
    GMTrace.o(11656004370432L, 86844);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11656272805888L, 86846);
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() * 3 / 5, 1073741824));
    GMTrace.o(11656272805888L, 86846);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallCounponCardLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */