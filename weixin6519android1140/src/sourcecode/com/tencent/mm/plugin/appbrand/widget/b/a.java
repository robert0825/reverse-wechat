package com.tencent.mm.plugin.appbrand.widget.b;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.f;

public final class a
{
  public static boolean a(ViewGroup paramViewGroup, MotionEvent paramMotionEvent, View paramView, int paramInt)
  {
    GMTrace.i(19883685314560L, 148145);
    if ((paramViewGroup == null) || (paramMotionEvent == null))
    {
      GMTrace.o(19883685314560L, 148145);
      return false;
    }
    int i = paramMotionEvent.getAction();
    if (i == 3)
    {
      paramMotionEvent.setAction(3);
      if (paramView == null)
      {
        GMTrace.o(19883685314560L, 148145);
        return false;
      }
      bool = paramView.dispatchTouchEvent(paramMotionEvent);
      paramMotionEvent.setAction(i);
      GMTrace.o(19883685314560L, 148145);
      return bool;
    }
    i = ((Integer)f.e("getPointerIdBits", paramMotionEvent, Integer.valueOf(0))).intValue();
    paramInt = i & paramInt;
    if (paramInt == 0)
    {
      GMTrace.o(19883685314560L, 148145);
      return false;
    }
    if (paramInt == i) {
      if ((paramView == null) || (((Boolean)f.e("hasIdentityMatrix", paramView, Boolean.valueOf(false))).booleanValue()))
      {
        if (paramView == null)
        {
          GMTrace.o(19883685314560L, 148145);
          return false;
        }
        float f1 = paramViewGroup.getScrollX() - paramView.getLeft();
        float f2 = paramViewGroup.getScrollY() - paramView.getTop();
        paramMotionEvent.offsetLocation(f1, f2);
        bool = paramView.dispatchTouchEvent(paramMotionEvent);
        paramMotionEvent.offsetLocation(-f1, -f2);
        GMTrace.o(19883685314560L, 148145);
        return bool;
      }
    }
    MotionEvent localMotionEvent;
    for (paramMotionEvent = MotionEvent.obtain(paramMotionEvent); paramView == null; paramMotionEvent = (MotionEvent)f.a("split", paramMotionEvent, new Class[] { Integer.class }, new Object[] { Integer.valueOf(paramInt) }, localMotionEvent))
    {
      GMTrace.o(19883685314560L, 148145);
      return false;
      localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    }
    paramMotionEvent.offsetLocation(paramViewGroup.getScrollX() - paramView.getLeft(), paramViewGroup.getScrollY() - paramView.getTop());
    if (!((Boolean)f.e("hasIdentityMatrix", paramView, Boolean.valueOf(false))).booleanValue()) {
      paramMotionEvent.transform((Matrix)f.e("getInverseMatrix", paramView, new Matrix()));
    }
    boolean bool = paramView.dispatchTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
    GMTrace.o(19883685314560L, 148145);
    return bool;
  }
  
  public static boolean bM(View paramView)
  {
    GMTrace.i(19883551096832L, 148144);
    if ((paramView != null) && ((paramView instanceof d)) && (((d)paramView).acc()))
    {
      GMTrace.o(19883551096832L, 148144);
      return true;
    }
    GMTrace.o(19883551096832L, 148144);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */