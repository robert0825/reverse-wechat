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

public final class xi
  extends c
{
  private final int height;
  private final int width;
  
  public xi()
  {
    GMTrace.i(15704950571008L, 117011);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15704950571008L, 117011);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15705084788736L, 117012);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15705084788736L, 117012);
      return 0;
      GMTrace.o(15705084788736L, 117012);
      return 108;
      GMTrace.o(15705084788736L, 117012);
      return 108;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 22.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(24.69F, 2.57F);
      ((Path)localObject2).cubicTo(26.63F, 1.61F, 28.56F, -0.09F, 30.86F, 0.24F);
      ((Path)localObject2).cubicTo(34.72F, 1.77F, 38.08F, 4.28F, 41.73F, 6.21F);
      ((Path)localObject2).cubicTo(46.53F, 9.13F, 51.66F, 11.54F, 56.18F, 14.91F);
      ((Path)localObject2).cubicTo(48.5F, 19.8F, 40.44F, 24.06F, 32.58F, 28.62F);
      ((Path)localObject2).cubicTo(30.48F, 30.19F, 27.98F, 29.12F, 26.04F, 27.89F);
      ((Path)localObject2).cubicTo(18.64F, 23.47F, 10.99F, 19.49F, 3.71F, 14.88F);
      ((Path)localObject2).cubicTo(10.38F, 10.25F, 17.76F, 6.79F, 24.69F, 2.57F);
      ((Path)localObject2).lineTo(24.69F, 2.57F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.0F, 29.05F);
      ((Path)localObject2).cubicTo(1.08F, 25.67F, 0.52F, 22.16F, 1.76F, 18.92F);
      ((Path)localObject2).cubicTo(9.31F, 23.12F, 16.77F, 27.47F, 24.31F, 31.67F);
      ((Path)localObject2).cubicTo(25.89F, 32.62F, 27.97F, 33.72F, 27.91F, 35.87F);
      ((Path)localObject2).cubicTo(28.18F, 45.12F, 27.86F, 54.39F, 28.05F, 63.66F);
      ((Path)localObject2).cubicTo(25.05F, 63.22F, 22.58F, 61.36F, 20.01F, 59.91F);
      ((Path)localObject2).cubicTo(14.93F, 56.99F, 9.85F, 54.07F, 4.74F, 51.2F);
      ((Path)localObject2).cubicTo(3.21F, 50.24F, 1.11F, 49.24F, 1.1F, 47.14F);
      ((Path)localObject2).cubicTo(0.81F, 41.12F, 1.1F, 35.08F, 1.0F, 29.05F);
      ((Path)localObject2).lineTo(1.0F, 29.05F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(51.1F, 23.01F);
      ((Path)localObject1).cubicTo(53.64F, 21.58F, 56.08F, 19.79F, 59.04F, 19.34F);
      ((Path)localObject1).cubicTo(58.91F, 28.27F, 59.09F, 37.21F, 58.98F, 46.14F);
      ((Path)localObject1).cubicTo(59.12F, 47.96F, 58.24F, 49.72F, 56.59F, 50.56F);
      ((Path)localObject1).cubicTo(50.29F, 54.31F, 43.77F, 57.71F, 37.45F, 61.45F);
      ((Path)localObject1).cubicTo(35.75F, 62.48F, 33.95F, 63.38F, 31.95F, 63.64F);
      ((Path)localObject1).cubicTo(32.15F, 54.4F, 31.82F, 45.15F, 32.08F, 35.92F);
      ((Path)localObject1).cubicTo(32.03F, 33.78F, 34.13F, 32.69F, 35.7F, 31.73F);
      ((Path)localObject1).cubicTo(40.87F, 28.88F, 45.97F, 25.91F, 51.1F, 23.01F);
      ((Path)localObject1).lineTo(51.1F, 23.01F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\xi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */