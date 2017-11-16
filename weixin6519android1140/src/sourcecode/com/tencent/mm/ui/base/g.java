package com.tencent.mm.ui.base;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;

public final class g
{
  private static boolean F(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3285918416896L, 24482);
    if (bZs())
    {
      if (paramMotionEvent.getPointerCount() >= 2)
      {
        GMTrace.o(3285918416896L, 24482);
        return true;
      }
      GMTrace.o(3285918416896L, 24482);
      return false;
    }
    GMTrace.o(3285918416896L, 24482);
    return false;
  }
  
  public static float G(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3286052634624L, 24483);
    float f1 = i(paramMotionEvent, 0) - i(paramMotionEvent, 1);
    float f2 = j(paramMotionEvent, 0) - j(paramMotionEvent, 1);
    f1 = (float)Math.sqrt(f1 * f1 + f2 * f2);
    GMTrace.o(3286052634624L, 24483);
    return f1;
  }
  
  public static int H(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3286723723264L, 24488);
    if (bZs())
    {
      new f();
      int i = paramMotionEvent.getPointerCount();
      GMTrace.o(3286723723264L, 24488);
      return i;
    }
    GMTrace.o(3286723723264L, 24488);
    return 1;
  }
  
  public static void a(PointF paramPointF, Bitmap paramBitmap)
  {
    GMTrace.i(3286321070080L, 24485);
    if ((paramPointF == null) || (paramBitmap == null))
    {
      GMTrace.o(3286321070080L, 24485);
      return;
    }
    paramPointF.set(paramBitmap.getWidth() / 2.0F, paramBitmap.getHeight() / 2.0F);
    GMTrace.o(3286321070080L, 24485);
  }
  
  public static void a(PointF paramPointF, MotionEvent paramMotionEvent)
  {
    GMTrace.i(3286186852352L, 24484);
    if ((paramPointF == null) || (paramMotionEvent == null))
    {
      GMTrace.o(3286186852352L, 24484);
      return;
    }
    float f1 = i(paramMotionEvent, 0);
    float f2 = i(paramMotionEvent, 1);
    float f3 = j(paramMotionEvent, 0);
    float f4 = j(paramMotionEvent, 1);
    paramPointF.set((f1 + f2) / 2.0F, (f3 + f4) / 2.0F);
    GMTrace.o(3286186852352L, 24484);
  }
  
  public static boolean bZs()
  {
    GMTrace.i(3285784199168L, 24481);
    if (Build.VERSION.SDK_INT >= 5)
    {
      GMTrace.o(3285784199168L, 24481);
      return true;
    }
    GMTrace.o(3285784199168L, 24481);
    return false;
  }
  
  public static float i(MotionEvent paramMotionEvent, int paramInt)
  {
    GMTrace.i(3286455287808L, 24486);
    if (F(paramMotionEvent))
    {
      new f();
      f = paramMotionEvent.getX(paramInt);
      GMTrace.o(3286455287808L, 24486);
      return f;
    }
    float f = paramMotionEvent.getX();
    GMTrace.o(3286455287808L, 24486);
    return f;
  }
  
  public static float j(MotionEvent paramMotionEvent, int paramInt)
  {
    GMTrace.i(3286589505536L, 24487);
    if (F(paramMotionEvent))
    {
      new f();
      f = paramMotionEvent.getY(paramInt);
      GMTrace.o(3286589505536L, 24487);
      return f;
    }
    float f = paramMotionEvent.getY();
    GMTrace.o(3286589505536L, 24487);
    return f;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */