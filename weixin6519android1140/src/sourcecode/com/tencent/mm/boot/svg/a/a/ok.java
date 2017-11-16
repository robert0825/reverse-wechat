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

public final class ok
  extends c
{
  private final int height;
  private final int width;
  
  public ok()
  {
    GMTrace.i(15753537388544L, 117373);
    this.width = 84;
    this.height = 84;
    GMTrace.o(15753537388544L, 117373);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15753671606272L, 117374);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15753671606272L, 117374);
      return 0;
      GMTrace.o(15753671606272L, 117374);
      return 84;
      GMTrace.o(15753671606272L, 117374);
      return 84;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-12632257);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 11.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(35.22F, 1.24F);
      ((Path)localObject2).cubicTo(37.07F, 0.38F, 38.78F, 1.74F, 39.99F, 3.02F);
      ((Path)localObject2).cubicTo(46.3F, 9.37F, 52.64F, 15.71F, 59.0F, 22.03F);
      ((Path)localObject2).cubicTo(60.28F, 23.24F, 61.63F, 24.96F, 60.75F, 26.81F);
      ((Path)localObject2).cubicTo(59.45F, 28.82F, 57.57F, 30.34F, 55.92F, 32.03F);
      ((Path)localObject2).cubicTo(46.93F, 41.02F, 37.93F, 50.0F, 28.97F, 59.01F);
      ((Path)localObject2).cubicTo(27.92F, 60.06F, 26.73F, 61.17F, 25.11F, 60.97F);
      ((Path)localObject2).cubicTo(18.37F, 61.03F, 11.64F, 61.03F, 4.91F, 60.97F);
      ((Path)localObject2).cubicTo(2.69F, 61.26F, 0.76F, 59.27F, 1.03F, 57.08F);
      ((Path)localObject2).cubicTo(0.97F, 50.36F, 0.97F, 43.63F, 1.03F, 36.91F);
      ((Path)localObject2).cubicTo(0.83F, 35.27F, 1.97F, 34.09F, 3.01F, 33.02F);
      ((Path)localObject2).cubicTo(12.02F, 24.05F, 21.0F, 15.05F, 29.99F, 6.06F);
      ((Path)localObject2).cubicTo(31.69F, 4.41F, 33.2F, 2.52F, 35.22F, 1.24F);
      ((Path)localObject2).lineTo(35.22F, 1.24F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(16.19F, 38.29F);
      ((Path)localObject2).cubicTo(12.01F, 39.42F, 10.56F, 45.34F, 13.77F, 48.25F);
      ((Path)localObject2).cubicTo(16.68F, 51.44F, 22.61F, 49.99F, 23.71F, 45.81F);
      ((Path)localObject2).cubicTo(25.36F, 41.43F, 20.56F, 36.65F, 16.19F, 38.29F);
      ((Path)localObject2).lineTo(16.19F, 38.29F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */