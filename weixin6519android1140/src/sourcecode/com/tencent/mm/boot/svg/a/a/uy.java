package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class uy
  extends c
{
  private final int height;
  private final int width;
  
  public uy()
  {
    GMTrace.i(15849100410880L, 118085);
    this.width = 105;
    this.height = 105;
    GMTrace.o(15849100410880L, 118085);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15849234628608L, 118086);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15849234628608L, 118086);
      return 0;
      GMTrace.o(15849234628608L, 118086);
      return 105;
      GMTrace.o(15849234628608L, 118086);
      return 105;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -257.0F, 0.0F, 1.0F, -137.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 259.0F, 0.0F, 1.0F, 151.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(4.0F, 0.0F);
      ((Path)localObject3).cubicTo(2.511144F, 0.0F, 0.0F, 2.6525173F, 0.0F, 6.0F);
      ((Path)localObject3).lineTo(0.0F, 71.0F);
      ((Path)localObject3).cubicTo(0.0F, 74.34748F, 2.511144F, 77.0F, 4.0F, 77.0F);
      ((Path)localObject3).lineTo(97.0F, 77.0F);
      ((Path)localObject3).cubicTo(98.487595F, 77.0F, 101.0F, 74.34748F, 101.0F, 71.0F);
      ((Path)localObject3).lineTo(101.0F, 6.0F);
      ((Path)localObject3).cubicTo(101.0F, 2.6525173F, 98.487595F, 0.0F, 97.0F, 0.0F);
      ((Path)localObject3).lineTo(4.0F, 0.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(11.046512F, 7.0F);
      ((Path)localObject3).cubicTo(9.163065F, 7.0F, 7.0F, 9.170241F, 7.0F, 11.064516F);
      ((Path)localObject3).lineTo(7.0F, 65.935486F);
      ((Path)localObject3).cubicTo(7.0F, 67.82976F, 9.163065F, 70.0F, 11.046512F, 70.0F);
      ((Path)localObject3).lineTo(89.95349F, 70.0F);
      ((Path)localObject3).cubicTo(91.835846F, 70.0F, 94.0F, 67.82976F, 94.0F, 65.935486F);
      ((Path)localObject3).lineTo(94.0F, 11.064516F);
      ((Path)localObject3).cubicTo(94.0F, 9.170241F, 91.835846F, 7.0F, 89.95349F, 7.0F);
      ((Path)localObject3).lineTo(11.046512F, 7.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(15.0F, 21.0F);
      ((Path)localObject2).lineTo(86.0F, 21.0F);
      ((Path)localObject2).lineTo(86.0F, 30.0F);
      ((Path)localObject2).lineTo(15.0F, 30.0F);
      ((Path)localObject2).lineTo(15.0F, 21.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\uy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */