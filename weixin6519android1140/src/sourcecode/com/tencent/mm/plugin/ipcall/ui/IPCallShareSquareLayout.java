package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;

public class IPCallShareSquareLayout
  extends RelativeLayout
{
  public IPCallShareSquareLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11655199064064L, 86838);
    GMTrace.o(11655199064064L, 86838);
  }
  
  public IPCallShareSquareLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11655064846336L, 86837);
    GMTrace.o(11655064846336L, 86837);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11655333281792L, 86839);
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824));
    GMTrace.o(11655333281792L, 86839);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallShareSquareLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */