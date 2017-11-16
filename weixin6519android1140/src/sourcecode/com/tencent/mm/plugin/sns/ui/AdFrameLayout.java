package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.MMFrameLayout;

public class AdFrameLayout
  extends MMFrameLayout
{
  public AdFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8343242407936L, 62162);
    GMTrace.o(8343242407936L, 62162);
  }
  
  public void addView(View paramView)
  {
    GMTrace.i(8343376625664L, 62163);
    super.addView(paramView);
    GMTrace.o(8343376625664L, 62163);
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(8344181932032L, 62169);
    super.draw(paramCanvas);
    GMTrace.o(8344181932032L, 62169);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(8343779278848L, 62166);
    super.onDetachedFromWindow();
    GMTrace.o(8343779278848L, 62166);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8343913496576L, 62167);
    System.currentTimeMillis();
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8343913496576L, 62167);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8344047714304L, 62168);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8344047714304L, 62168);
  }
  
  public void removeView(View paramView)
  {
    GMTrace.i(8343510843392L, 62164);
    super.removeView(paramView);
    GMTrace.o(8343510843392L, 62164);
  }
  
  public void requestLayout()
  {
    GMTrace.i(8343645061120L, 62165);
    super.requestLayout();
    GMTrace.o(8343645061120L, 62165);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\AdFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */