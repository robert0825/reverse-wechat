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

public final class gi
  extends c
{
  private final int height;
  private final int width;
  
  public gi()
  {
    GMTrace.i(15776354402304L, 117543);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15776354402304L, 117543);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15776488620032L, 117544);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15776488620032L, 117544);
      return 0;
      GMTrace.o(15776488620032L, 117544);
      return 96;
      GMTrace.o(15776488620032L, 117544);
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
      ((Path)localObject).moveTo(77.0F, 40.0F);
      ((Path)localObject).lineTo(77.0F, 48.0F);
      ((Path)localObject).cubicTo(79.00536F, 48.166668F, 80.833336F, 49.995094F, 81.0F, 52.0F);
      ((Path)localObject).lineTo(81.0F, 77.0F);
      ((Path)localObject).cubicTo(80.833336F, 79.00536F, 79.00536F, 80.833336F, 77.0F, 81.0F);
      ((Path)localObject).lineTo(52.0F, 81.0F);
      ((Path)localObject).cubicTo(49.99464F, 80.833336F, 48.166668F, 79.00536F, 48.0F, 77.0F);
      ((Path)localObject).lineTo(40.0F, 77.0F);
      ((Path)localObject).cubicTo(40.0F, 83.51563F, 45.48437F, 89.0F, 52.0F, 89.0F);
      ((Path)localObject).lineTo(77.0F, 89.0F);
      ((Path)localObject).cubicTo(83.51563F, 89.0F, 89.0F, 83.51563F, 89.0F, 77.0F);
      ((Path)localObject).lineTo(89.0F, 52.0F);
      ((Path)localObject).cubicTo(89.0F, 45.48437F, 83.51563F, 40.0F, 77.0F, 40.0F);
      ((Path)localObject).moveTo(16.0F, 57.0F);
      ((Path)localObject).lineTo(16.0F, 20.0F);
      ((Path)localObject).cubicTo(16.0F, 17.831364F, 17.831364F, 16.0F, 20.0F, 16.0F);
      ((Path)localObject).lineTo(57.0F, 16.0F);
      ((Path)localObject).cubicTo(59.168636F, 16.0F, 61.0F, 17.831364F, 61.0F, 20.0F);
      ((Path)localObject).lineTo(61.0F, 57.0F);
      ((Path)localObject).cubicTo(61.0F, 59.168636F, 59.168636F, 61.0F, 57.0F, 61.0F);
      ((Path)localObject).lineTo(20.0F, 61.0F);
      ((Path)localObject).cubicTo(17.831364F, 61.0F, 16.0F, 59.168636F, 16.0F, 57.0F);
      ((Path)localObject).moveTo(69.0F, 57.0F);
      ((Path)localObject).lineTo(69.0F, 20.0F);
      ((Path)localObject).cubicTo(69.0F, 13.462437F, 63.538013F, 8.0F, 57.0F, 8.0F);
      ((Path)localObject).lineTo(20.0F, 8.0F);
      ((Path)localObject).cubicTo(13.461986F, 8.0F, 8.0F, 13.462437F, 8.0F, 20.0F);
      ((Path)localObject).lineTo(8.0F, 57.0F);
      ((Path)localObject).cubicTo(8.0F, 63.538013F, 13.461986F, 69.0F, 20.0F, 69.0F);
      ((Path)localObject).lineTo(57.0F, 69.0F);
      ((Path)localObject).cubicTo(63.538013F, 69.0F, 69.0F, 63.538013F, 69.0F, 57.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */