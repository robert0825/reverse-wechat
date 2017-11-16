package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.HorizontalScrollView;
import com.tencent.gmtrace.GMTrace;

public class BouncyHScrollView
  extends HorizontalScrollView
{
  private int lTK;
  private Context mContext;
  
  public BouncyHScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12779540971520L, 95215);
    this.mContext = paramContext;
    GMTrace.o(12779540971520L, 95215);
  }
  
  public BouncyHScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12779675189248L, 95216);
    this.mContext = paramContext;
    GMTrace.o(12779675189248L, 95216);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12779809406976L, 95217);
    super.onFinishInflate();
    this.lTK = ((int)(this.mContext.getResources().getDisplayMetrics().density * 300.0F));
    setOverScrollMode(0);
    setSmoothScrollingEnabled(true);
    setHorizontalFadingEdgeEnabled(false);
    GMTrace.o(12779809406976L, 95217);
  }
  
  protected boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    GMTrace.i(12779943624704L, 95218);
    paramBoolean = super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, this.lTK, paramInt8, paramBoolean);
    GMTrace.o(12779943624704L, 95218);
    return paramBoolean;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\game\ui\BouncyHScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */