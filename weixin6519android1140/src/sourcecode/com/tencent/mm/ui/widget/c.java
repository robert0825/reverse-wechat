package com.tencent.mm.ui.widget;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import com.tencent.gmtrace.GMTrace;

public class c
  extends ViewGroup
{
  int tl;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(13052808265728L, 97251);
    this.tl = 48;
    setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    GMTrace.o(13052808265728L, 97251);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(13052942483456L, 97252);
    View localView = getChildAt(0);
    if (localView == null)
    {
      GMTrace.o(13052942483456L, 97252);
      return;
    }
    if (this.tl == 48)
    {
      localView.layout(0, 0, getMeasuredWidth(), localView.getMeasuredHeight());
      GMTrace.o(13052942483456L, 97252);
      return;
    }
    localView.layout(0, getMeasuredHeight() - localView.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    GMTrace.o(13052942483456L, 97252);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(13053076701184L, 97253);
    int i = View.MeasureSpec.getSize(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getMode(paramInt2);
    View localView = getChildAt(0);
    if (localView == null)
    {
      setMeasuredDimension(0, j);
      GMTrace.o(13053076701184L, 97253);
      return;
    }
    if (localView.isLayoutRequested()) {
      measureChild(localView, paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
    }
    paramInt1 = i;
    ViewGroup.LayoutParams localLayoutParams;
    if (paramInt2 == 0)
    {
      localLayoutParams = getLayoutParams();
      if (localLayoutParams.height <= 0) {
        break label114;
      }
    }
    label114:
    for (paramInt1 = localLayoutParams.height;; paramInt1 = localView.getMeasuredHeight())
    {
      setMeasuredDimension(j, paramInt1);
      GMTrace.o(13053076701184L, 97253);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */