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

public final class yd
  extends c
{
  private final int height;
  private final int width;
  
  public yd()
  {
    GMTrace.i(21024133349376L, 156642);
    this.width = 180;
    this.height = 180;
    GMTrace.o(21024133349376L, 156642);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21024267567104L, 156643);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21024267567104L, 156643);
      return 0;
      GMTrace.o(21024267567104L, 156643);
      return 180;
      GMTrace.o(21024267567104L, 156643);
      return 180;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 126, 4);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 30.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 30.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-855310);
      ((Paint)localObject1).setStrokeWidth(4.0F);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(6.0097566F, 12.0F);
      ((Path)localObject2).cubicTo(3.7951674F, 12.0F, 2.0F, 13.792681F, 2.0F, 16.000319F);
      ((Path)localObject2).lineTo(2.0F, 54.999683F);
      ((Path)localObject2).cubicTo(2.0F, 57.20863F, 3.789142F, 59.0F, 5.991014F, 59.0F);
      ((Path)localObject2).lineTo(72.00899F, 59.0F);
      ((Path)localObject2).cubicTo(74.21183F, 59.0F, 76.0F, 57.208717F, 76.0F, 54.999683F);
      ((Path)localObject2).lineTo(76.0F, 16.000319F);
      ((Path)localObject2).cubicTo(76.0F, 13.79181F, 74.205315F, 12.0F, 71.99024F, 12.0F);
      ((Path)localObject2).lineTo(57.5F, 12.0F);
      ((Path)localObject2).lineTo(51.196438F, 3.5952492F);
      ((Path)localObject2).cubicTo(50.5825F, 2.7766662F, 49.029545F, 2.0F, 48.00891F, 2.0F);
      ((Path)localObject2).lineTo(29.99109F, 2.0F);
      ((Path)localObject2).cubicTo(28.967781F, 2.0F, 27.419127F, 2.7744992F, 26.803562F, 3.5952492F);
      ((Path)localObject2).lineTo(20.5F, 12.0F);
      ((Path)localObject2).lineTo(6.0097566F, 12.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject1).setColor(-855310);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(6.0F, 2.0F);
      ((Path)localObject2).lineTo(16.0F, 2.0F);
      ((Path)localObject2).lineTo(16.0F, 6.0F);
      ((Path)localObject2).lineTo(6.0F, 6.0F);
      ((Path)localObject2).lineTo(6.0F, 2.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-855310);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(21.0F, 33.0F);
      ((Path)localObject1).lineTo(15.0F, 33.0F);
      ((Path)localObject1).lineTo(23.25F, 24.75F);
      ((Path)localObject1).lineTo(31.5F, 33.0F);
      ((Path)localObject1).lineTo(25.0F, 33.0F);
      ((Path)localObject1).cubicTo(25.0F, 40.731987F, 31.268013F, 47.0F, 39.0F, 47.0F);
      ((Path)localObject1).cubicTo(42.931446F, 47.0F, 46.484406F, 45.379486F, 49.027344F, 42.769985F);
      ((Path)localObject1).lineTo(51.855957F, 45.598595F);
      ((Path)localObject1).cubicTo(48.588997F, 48.93187F, 44.03602F, 51.0F, 39.0F, 51.0F);
      ((Path)localObject1).cubicTo(29.058874F, 51.0F, 21.0F, 42.941124F, 21.0F, 33.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(57.0F, 33.0F);
      ((Path)localObject1).lineTo(63.0F, 33.0F);
      ((Path)localObject1).lineTo(54.75F, 41.25F);
      ((Path)localObject1).lineTo(46.5F, 33.0F);
      ((Path)localObject1).lineTo(53.0F, 33.0F);
      ((Path)localObject1).cubicTo(53.0F, 25.268013F, 46.731987F, 19.0F, 39.0F, 19.0F);
      ((Path)localObject1).cubicTo(35.068554F, 19.0F, 31.515596F, 20.620514F, 28.972656F, 23.230017F);
      ((Path)localObject1).lineTo(26.144045F, 20.401403F);
      ((Path)localObject1).cubicTo(29.411005F, 17.068129F, 33.96398F, 15.0F, 39.0F, 15.0F);
      ((Path)localObject1).cubicTo(48.941124F, 15.0F, 57.0F, 23.058874F, 57.0F, 33.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\yd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */