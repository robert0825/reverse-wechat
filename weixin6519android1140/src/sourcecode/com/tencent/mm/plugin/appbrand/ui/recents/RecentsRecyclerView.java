package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;

class RecentsRecyclerView
  extends LoadMoreRecyclerView
{
  private View iFX;
  
  public RecentsRecyclerView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(16365704445952L, 121934);
    setChildrenDrawingOrderEnabled(true);
    GMTrace.o(16365704445952L, 121934);
  }
  
  public RecentsRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16365838663680L, 121935);
    setChildrenDrawingOrderEnabled(true);
    GMTrace.o(16365838663680L, 121935);
  }
  
  public RecentsRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16365972881408L, 121936);
    setChildrenDrawingOrderEnabled(true);
    GMTrace.o(16365972881408L, 121936);
  }
  
  final void bK(View paramView)
  {
    GMTrace.i(16366643970048L, 121941);
    if (paramView.getParent() != this)
    {
      GMTrace.o(16366643970048L, 121941);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramView.setZ(1.0F);
      GMTrace.o(16366643970048L, 121941);
      return;
    }
    this.iFX = paramView;
    GMTrace.o(16366643970048L, 121941);
  }
  
  final void bL(View paramView)
  {
    GMTrace.i(16366778187776L, 121942);
    if (paramView.getParent() != this)
    {
      GMTrace.o(16366778187776L, 121942);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramView.setZ(0.0F);
      GMTrace.o(16366778187776L, 121942);
      return;
    }
    if (this.iFX == paramView) {
      this.iFX = null;
    }
    GMTrace.o(16366778187776L, 121942);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(16366375534592L, 121939);
    if ((this.Ts != null) && (this.Ts.isRunning()))
    {
      GMTrace.o(16366375534592L, 121939);
      return false;
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(16366375534592L, 121939);
    return bool;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    GMTrace.i(16366107099136L, 121937);
    if (this.iFX == null)
    {
      paramInt1 = super.getChildDrawingOrder(paramInt1, paramInt2);
      GMTrace.o(16366107099136L, 121937);
      return paramInt1;
    }
    int i = indexOfChild(this.iFX);
    if (i < 0)
    {
      paramInt1 = super.getChildDrawingOrder(paramInt1, paramInt2);
      GMTrace.o(16366107099136L, 121937);
      return paramInt1;
    }
    if (paramInt2 == paramInt1 - 1)
    {
      GMTrace.o(16366107099136L, 121937);
      return i;
    }
    if (paramInt2 == i)
    {
      GMTrace.o(16366107099136L, 121937);
      return paramInt1 - 1;
    }
    paramInt1 = super.getChildDrawingOrder(paramInt1, paramInt2);
    GMTrace.o(16366107099136L, 121937);
    return paramInt1;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(16366241316864L, 121938);
    if ((this.Ts != null) && (this.Ts.isRunning()))
    {
      GMTrace.o(16366241316864L, 121938);
      return false;
    }
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(16366241316864L, 121938);
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(16366509752320L, 121940);
    if ((this.Ts != null) && (this.Ts.isRunning()))
    {
      GMTrace.o(16366509752320L, 121940);
      return false;
    }
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(16366509752320L, 121940);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\recents\RecentsRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */