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

public final class aja
  extends c
{
  private final int height;
  private final int width;
  
  public aja()
  {
    GMTrace.i(17580911755264L, 130988);
    this.width = 42;
    this.height = 42;
    GMTrace.o(17580911755264L, 130988);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17581045972992L, 130989);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17581045972992L, 130989);
      return 0;
      GMTrace.o(17581045972992L, 130989);
      return 42;
      GMTrace.o(17581045972992L, 130989);
      return 42;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setStrokeWidth(1.0F);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      localPaint = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(-4210753);
      localPaint.setColor(-4210753);
      localPaint.setStrokeWidth(0.5F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramVarArgs);
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(20.0F, 40.0F);
      ((Path)localObject3).cubicTo(8.954305F, 40.0F, 0.0F, 31.045694F, 0.0F, 20.0F);
      ((Path)localObject3).cubicTo(0.0F, 8.954305F, 8.954305F, 0.0F, 20.0F, 0.0F);
      ((Path)localObject3).cubicTo(31.045694F, 0.0F, 40.0F, 8.954305F, 40.0F, 20.0F);
      ((Path)localObject3).cubicTo(40.0F, 31.045694F, 31.045694F, 40.0F, 20.0F, 40.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(20.0F, 25.384615F);
      ((Path)localObject3).cubicTo(22.97384F, 25.384615F, 25.384615F, 22.97384F, 25.384615F, 20.0F);
      ((Path)localObject3).cubicTo(25.384615F, 17.02616F, 22.97384F, 14.615385F, 20.0F, 14.615385F);
      ((Path)localObject3).cubicTo(17.02616F, 14.615385F, 14.615385F, 17.02616F, 14.615385F, 20.0F);
      ((Path)localObject3).cubicTo(14.615385F, 22.97384F, 17.02616F, 25.384615F, 20.0F, 25.384615F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(2.841629F, 13.025641F);
      ((Path)localObject3).lineTo(20.217196F, 13.025641F);
      ((Path)localObject3).lineTo(11.095022F, 3.7104073F);
      ((Path)localObject3).cubicTo(7.4411893F, 5.695587F, 4.4904046F, 8.919444F, 2.841629F, 13.025641F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(19.806938F, 1.5384616F);
      ((Path)localObject3).cubicTo(17.431908F, 1.5384616F, 15.042355F, 2.0230188F, 12.856712F, 2.841629F);
      ((Path)localObject3).lineTo(25.333334F, 15.438914F);
      ((Path)localObject3).lineTo(25.333334F, 2.40724F);
      ((Path)localObject3).cubicTo(23.70856F, 1.8235183F, 21.855545F, 1.5384616F, 19.806938F, 1.5384616F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(1.5384616F, 20.217196F);
      ((Path)localObject3).cubicTo(1.5384616F, 22.586182F, 2.0253615F, 24.979147F, 2.8461537F, 27.167421F);
      ((Path)localObject3).lineTo(15.48718F, 14.666667F);
      ((Path)localObject3).lineTo(2.4102564F, 14.666667F);
      ((Path)localObject3).cubicTo(1.8229419F, 16.312695F, 1.5384616F, 18.162403F, 1.5384616F, 20.217196F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(13.025641F, 37.15837F);
      ((Path)localObject3).lineTo(13.025641F, 19.782804F);
      ((Path)localObject3).lineTo(3.7104073F, 28.904978F);
      ((Path)localObject3).cubicTo(5.695056F, 32.564972F, 8.915772F, 35.512318F, 13.025641F, 37.15837F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(20.217196F, 38.46154F);
      ((Path)localObject3).cubicTo(22.583342F, 38.46154F, 24.97778F, 37.974F, 27.167421F, 37.15837F);
      ((Path)localObject3).lineTo(14.666667F, 24.561087F);
      ((Path)localObject3).lineTo(14.666667F, 37.592762F);
      ((Path)localObject3).cubicTo(16.31146F, 38.177578F, 18.159653F, 38.46154F, 20.217196F, 38.46154F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(37.15837F, 26.923077F);
      ((Path)localObject3).lineTo(19.782804F, 26.923077F);
      ((Path)localObject3).lineTo(28.904978F, 36.289593F);
      ((Path)localObject3).cubicTo(32.56479F, 34.306225F, 35.51124F, 31.088493F, 37.15837F, 26.923077F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(38.46154F, 20.217196F);
      ((Path)localObject3).cubicTo(38.46154F, 17.845076F, 37.973F, 15.454035F, 37.153847F, 13.266969F);
      ((Path)localObject3).lineTo(24.512821F, 25.384615F);
      ((Path)localObject3).lineTo(37.589745F, 25.384615F);
      ((Path)localObject3).cubicTo(38.175034F, 24.120005F, 38.46154F, 22.268494F, 38.46154F, 20.217196F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(26.97436F, 3.2518854F);
      ((Path)localObject3).lineTo(26.97436F, 20.62745F);
      ((Path)localObject3).lineTo(36.289593F, 11.505279F);
      ((Path)localObject3).cubicTo(34.305107F, 7.851749F, 31.083288F, 4.901771F, 26.97436F, 3.2518854F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */