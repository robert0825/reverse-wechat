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

public final class vb
  extends c
{
  private final int height;
  private final int width;
  
  public vb()
  {
    GMTrace.i(15779575627776L, 117567);
    this.width = 152;
    this.height = 152;
    GMTrace.o(15779575627776L, 117567);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15779709845504L, 117568);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15779709845504L, 117568);
      return 0;
      GMTrace.o(15779709845504L, 117568);
      return 152;
      GMTrace.o(15779709845504L, 117568);
      return 152;
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
      localObject2 = c.a((float[])localObject2, 1.3333334F, 0.0F, 0.0F, 0.0F, 1.3333334F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(47.3F, 27.26F);
      ((Path)localObject2).cubicTo(55.29F, 19.99F, 66.32F, 16.26F, 77.08F, 17.15F);
      ((Path)localObject2).cubicTo(87.25F, 17.87F, 97.03F, 22.73F, 103.79F, 30.35F);
      ((Path)localObject2).cubicTo(110.22F, 37.44F, 113.83F, 46.9F, 114.0F, 56.44F);
      ((Path)localObject2).lineTo(114.0F, 57.54F);
      ((Path)localObject2).cubicTo(113.83F, 67.35F, 110.01F, 77.06F, 103.27F, 84.22F);
      ((Path)localObject2).cubicTo(95.39F, 92.8F, 83.6F, 97.59F, 71.96F, 96.92F);
      ((Path)localObject2).cubicTo(61.45F, 96.45F, 51.24F, 91.56F, 44.25F, 83.69F);
      ((Path)localObject2).cubicTo(37.23F, 75.96F, 33.5F, 65.38F, 34.08F, 54.95F);
      ((Path)localObject2).cubicTo(34.56F, 44.44F, 39.44F, 34.24F, 47.3F, 27.26F);
      ((Path)localObject2).moveTo(67.42F, 24.68F);
      ((Path)localObject2).cubicTo(59.03F, 26.35F, 51.42F, 31.46F, 46.66F, 38.56F);
      ((Path)localObject2).cubicTo(38.14F, 50.73F, 39.47F, 68.57F, 49.73F, 79.32F);
      ((Path)localObject2).cubicTo(59.87F, 90.78F, 78.27F, 93.36F, 91.17F, 85.15F);
      ((Path)localObject2).cubicTo(104.25F, 77.49F, 110.42F, 60.23F, 105.1F, 46.02F);
      ((Path)localObject2).cubicTo(100.08F, 30.86F, 83.02F, 21.15F, 67.42F, 24.68F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 28.78F);
      ((Path)localObject2).cubicTo(0.29F, 26.23F, 2.33F, 23.98F, 5.01F, 24.07F);
      ((Path)localObject2).cubicTo(17.78F, 23.89F, 30.56F, 24.07F, 43.34F, 23.99F);
      ((Path)localObject2).cubicTo(40.33F, 27.05F, 37.59F, 30.37F, 35.3F, 34.0F);
      ((Path)localObject2).cubicTo(25.22F, 33.94F, 15.13F, 34.11F, 5.05F, 33.93F);
      ((Path)localObject2).cubicTo(2.51F, 34.04F, 0.62F, 32.02F, 0.0F, 29.71F);
      ((Path)localObject2).lineTo(0.0F, 28.78F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(60.31F, 75.0F);
      ((Path)localObject2).cubicTo(60.32F, 63.57F, 60.3F, 52.15F, 60.32F, 40.73F);
      ((Path)localObject2).cubicTo(66.5F, 40.79F, 72.69F, 40.61F, 78.87F, 40.8F);
      ((Path)localObject2).cubicTo(82.05F, 40.88F, 85.35F, 42.19F, 87.13F, 44.93F);
      ((Path)localObject2).cubicTo(90.27F, 49.46F, 88.84F, 56.75F, 83.42F, 58.81F);
      ((Path)localObject2).cubicTo(90.19F, 61.42F, 87.36F, 69.71F, 89.71F, 75.02F);
      ((Path)localObject2).cubicTo(87.23F, 75.0F, 84.74F, 74.99F, 82.26F, 74.99F);
      ((Path)localObject2).cubicTo(81.03F, 71.02F, 82.07F, 66.2F, 79.34F, 62.82F);
      ((Path)localObject2).cubicTo(75.95F, 60.69F, 71.64F, 61.93F, 67.85F, 61.61F);
      ((Path)localObject2).cubicTo(67.85F, 66.08F, 67.85F, 70.54F, 67.85F, 75.0F);
      ((Path)localObject2).cubicTo(65.34F, 75.0F, 62.82F, 75.0F, 60.31F, 75.0F);
      ((Path)localObject2).moveTo(67.85F, 46.59F);
      ((Path)localObject2).cubicTo(67.85F, 49.8F, 67.85F, 53.01F, 67.85F, 56.23F);
      ((Path)localObject2).cubicTo(71.21F, 56.17F, 74.59F, 56.45F, 77.92F, 55.99F);
      ((Path)localObject2).cubicTo(82.3F, 55.38F, 82.47F, 47.76F, 78.18F, 46.86F);
      ((Path)localObject2).cubicTo(74.76F, 46.34F, 71.29F, 46.66F, 67.85F, 46.59F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 49.79F);
      ((Path)localObject2).cubicTo(0.29F, 47.24F, 2.32F, 44.98F, 5.0F, 45.07F);
      ((Path)localObject2).cubicTo(13.52F, 44.88F, 22.06F, 45.07F, 30.59F, 45.0F);
      ((Path)localObject2).cubicTo(29.83F, 48.29F, 29.31F, 51.63F, 29.01F, 55.0F);
      ((Path)localObject2).cubicTo(21.01F, 54.94F, 12.99F, 55.12F, 4.99F, 54.93F);
      ((Path)localObject2).cubicTo(2.48F, 55.01F, 0.63F, 53.0F, 0.0F, 50.73F);
      ((Path)localObject2).lineTo(0.0F, 49.79F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 70.79F);
      ((Path)localObject2).cubicTo(0.29F, 68.24F, 2.32F, 65.97F, 5.01F, 66.07F);
      ((Path)localObject2).cubicTo(13.29F, 65.88F, 21.59F, 66.06F, 29.88F, 66.0F);
      ((Path)localObject2).cubicTo(30.72F, 69.41F, 31.82F, 72.76F, 33.17F, 76.0F);
      ((Path)localObject2).cubicTo(23.8F, 75.94F, 14.42F, 76.11F, 5.05F, 75.93F);
      ((Path)localObject2).cubicTo(2.51F, 76.03F, 0.61F, 74.02F, 0.0F, 71.71F);
      ((Path)localObject2).lineTo(0.0F, 70.79F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(0.0F, 91.79F);
      ((Path)localObject1).cubicTo(0.29F, 89.23F, 2.33F, 86.97F, 5.02F, 87.07F);
      ((Path)localObject1).cubicTo(16.82F, 86.91F, 28.63F, 87.03F, 40.44F, 87.02F);
      ((Path)localObject1).cubicTo(44.15F, 91.03F, 48.5F, 94.41F, 53.31F, 97.02F);
      ((Path)localObject1).cubicTo(37.21F, 96.92F, 21.1F, 97.12F, 5.0F, 96.93F);
      ((Path)localObject1).cubicTo(2.48F, 97.02F, 0.61F, 95.0F, 0.0F, 92.71F);
      ((Path)localObject1).lineTo(0.0F, 91.79F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\vb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */