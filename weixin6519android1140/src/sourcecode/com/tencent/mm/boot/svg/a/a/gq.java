package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class gq
  extends c
{
  private final int height;
  private final int width;
  
  public gq()
  {
    GMTrace.i(15950032142336L, 118837);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15950032142336L, 118837);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15950166360064L, 118838);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15950166360064L, 118838);
      return 0;
      GMTrace.o(15950166360064L, 118838);
      return 96;
      GMTrace.o(15950166360064L, 118838);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(79.0F, 54.0F);
      ((Path)localObject).cubicTo(78.25857F, 56.12818F, 77.36423F, 57.0F, 75.0F, 57.0F);
      ((Path)localObject).lineTo(41.0F, 57.0F);
      ((Path)localObject).cubicTo(38.447094F, 57.0F, 36.622643F, 55.168636F, 37.0F, 53.0F);
      ((Path)localObject).lineTo(33.0F, 32.0F);
      ((Path)localObject).lineTo(81.0F, 39.0F);
      ((Path)localObject).cubicTo(81.0F, 38.81818F, 79.41102F, 50.549545F, 79.0F, 54.0F);
      ((Path)localObject).lineTo(79.0F, 54.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(31.0F, 24.0F);
      ((Path)localObject).lineTo(30.0F, 14.0F);
      ((Path)localObject).lineTo(30.0F, 14.0F);
      ((Path)localObject).cubicTo(29.09645F, 10.765857F, 26.07245F, 8.0F, 22.0F, 8.0F);
      ((Path)localObject).lineTo(8.0F, 8.0F);
      ((Path)localObject).lineTo(8.0F, 16.0F);
      ((Path)localObject).lineTo(12.0F, 16.0F);
      ((Path)localObject).lineTo(15.0F, 16.0F);
      ((Path)localObject).lineTo(20.0F, 16.0F);
      ((Path)localObject).cubicTo(20.94245F, 16.142857F, 21.95F, 17.155739F, 22.0F, 18.0F);
      ((Path)localObject).lineTo(22.0F, 18.0F);
      ((Path)localObject).lineTo(29.0F, 56.0F);
      ((Path)localObject).lineTo(29.0F, 56.0F);
      ((Path)localObject).cubicTo(30.31235F, 61.371452F, 34.9343F, 65.0F, 40.0F, 65.0F);
      ((Path)localObject).lineTo(77.0F, 65.0F);
      ((Path)localObject).cubicTo(82.3562F, 65.0F, 84.95F, 60.92857F, 85.0F, 57.0F);
      ((Path)localObject).cubicTo(85.6574F, 54.530094F, 89.0F, 32.42857F, 89.0F, 32.0F);
      ((Path)localObject).lineTo(31.0F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(77.0F, 73.0F);
      ((Path)localObject).cubicTo(72.58178F, 73.0F, 69.0F, 76.58178F, 69.0F, 81.0F);
      ((Path)localObject).cubicTo(69.0F, 85.41822F, 72.58178F, 89.0F, 77.0F, 89.0F);
      ((Path)localObject).cubicTo(81.41822F, 89.0F, 85.0F, 85.41822F, 85.0F, 81.0F);
      ((Path)localObject).cubicTo(85.0F, 76.58178F, 81.41822F, 73.0F, 77.0F, 73.0F);
      ((Path)localObject).lineTo(77.0F, 73.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 73.0F);
      ((Path)localObject).cubicTo(31.581778F, 73.0F, 28.0F, 76.58178F, 28.0F, 81.0F);
      ((Path)localObject).cubicTo(28.0F, 85.41822F, 31.581778F, 89.0F, 36.0F, 89.0F);
      ((Path)localObject).cubicTo(40.41822F, 89.0F, 44.0F, 85.41822F, 44.0F, 81.0F);
      ((Path)localObject).cubicTo(44.0F, 76.58178F, 40.41822F, 73.0F, 36.0F, 73.0F);
      ((Path)localObject).lineTo(36.0F, 73.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */