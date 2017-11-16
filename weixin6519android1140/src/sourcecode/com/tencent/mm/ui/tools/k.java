package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  implements GestureDetector.OnGestureListener
{
  private final Context context;
  private final int vR;
  private final int vS;
  private final float xhA;
  public final GestureDetector xhx;
  public a xhy;
  private final float xhz;
  
  public k(Context paramContext)
  {
    GMTrace.i(2030580006912L, 15129);
    this.context = paramContext;
    this.xhx = new GestureDetector(this.context, this);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    this.vR = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.vS = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.xhz = BackwardSupportUtil.b.a(paramContext, 70.0F);
    this.xhA = BackwardSupportUtil.b.a(paramContext, 50.0F);
    GMTrace.o(2030580006912L, 15129);
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    GMTrace.i(2030848442368L, 15131);
    GMTrace.o(2030848442368L, 15131);
    return false;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(2030714224640L, 15130);
    if (this.xhy == null)
    {
      GMTrace.o(2030714224640L, 15130);
      return true;
    }
    w.v("MicroMsg.MMGestureDetector", "lastX:%f, curX:%f, lastY:%f, curY:%f, vX:%f, vY:%f", new Object[] { Float.valueOf(paramMotionEvent1.getX()), Float.valueOf(paramMotionEvent2.getX()), Float.valueOf(paramMotionEvent1.getY()), Float.valueOf(paramMotionEvent2.getY()), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    float f1 = Math.abs(paramMotionEvent2.getY() - paramMotionEvent1.getY());
    float f2 = Math.abs(paramMotionEvent2.getX() - paramMotionEvent1.getX());
    if ((f1 < this.xhA) && (paramFloat1 > 800.0F) && (f2 > this.xhz))
    {
      GMTrace.o(2030714224640L, 15130);
      return true;
    }
    if ((f1 < this.xhA) && (paramFloat1 < -800.0F) && (f2 < -this.xhz))
    {
      GMTrace.o(2030714224640L, 15130);
      return true;
    }
    if ((f2 < this.xhA) && (paramFloat2 > 800.0F))
    {
      GMTrace.o(2030714224640L, 15130);
      return true;
    }
    if ((f2 < this.xhA) && (paramFloat2 < -800.0F))
    {
      GMTrace.o(2030714224640L, 15130);
      return true;
    }
    GMTrace.o(2030714224640L, 15130);
    return false;
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    GMTrace.i(2031385313280L, 15135);
    GMTrace.o(2031385313280L, 15135);
  }
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(2031251095552L, 15134);
    GMTrace.o(2031251095552L, 15134);
    return false;
  }
  
  public final void onShowPress(MotionEvent paramMotionEvent)
  {
    GMTrace.i(2030982660096L, 15132);
    GMTrace.o(2030982660096L, 15132);
  }
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    GMTrace.i(2031116877824L, 15133);
    GMTrace.o(2031116877824L, 15133);
    return false;
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */