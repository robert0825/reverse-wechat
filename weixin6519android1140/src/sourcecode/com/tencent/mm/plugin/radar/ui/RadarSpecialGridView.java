package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;

public class RadarSpecialGridView
  extends RadarSpecialSmoothScrollView
{
  protected a oaM;
  protected RadarSpecialTableLayout oaN;
  private int oaO;
  private int oaP;
  
  public RadarSpecialGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8903064551424L, 66333);
    this.oaM = null;
    this.oaN = null;
    this.oaO = 0;
    this.oaP = 0;
    aZR();
    GMTrace.o(8903064551424L, 66333);
  }
  
  public RadarSpecialGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8902930333696L, 66332);
    this.oaM = null;
    this.oaN = null;
    this.oaO = 0;
    this.oaP = 0;
    aZR();
    GMTrace.o(8902930333696L, 66332);
  }
  
  private void aZR()
  {
    GMTrace.i(8903198769152L, 66334);
    this.oaN = new RadarSpecialTableLayout(getContext());
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2);
    localLayoutParams.gravity = 80;
    this.oaN.setLayoutParams(localLayoutParams);
    this.oaN.setStretchAllColumns(true);
    this.oaN.setShrinkAllColumns(true);
    this.oaN.setGravity(80);
    addView(this.oaN);
    GMTrace.o(8903198769152L, 66334);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(8903332986880L, 66335);
    if (this.oaM == null) {
      this.oaM = parama;
    }
    GMTrace.o(8903332986880L, 66335);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    GMTrace.i(8903467204608L, 66336);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      paramInt1 = getScrollX() + localView.getWidth() - this.oaP;
      this.oaP = localView.getWidth();
      if (paramInt1 > 0)
      {
        if (getChildCount() <= 0) {
          break label144;
        }
        localView = getChildAt(0);
        paramInt3 = getScrollY() + localView.getHeight() - this.oaO;
        this.oaO = localView.getHeight();
        paramInt2 = i;
        if (paramInt3 <= 0) {}
      }
    }
    label144:
    for (paramInt2 = paramInt3;; paramInt2 = getScrollY())
    {
      scrollTo(paramInt1, paramInt2);
      GMTrace.o(8903467204608L, 66336);
      return;
      paramInt1 = 0;
      break;
      paramInt1 = getScrollX();
      break;
    }
  }
  
  public static abstract interface a
  {
    public abstract void e(int paramInt, View paramView);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarSpecialGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */