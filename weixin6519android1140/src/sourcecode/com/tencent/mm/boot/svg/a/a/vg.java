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

public final class vg
  extends c
{
  private final int height;
  private final int width;
  
  public vg()
  {
    GMTrace.i(15904934985728L, 118501);
    this.width = 159;
    this.height = 159;
    GMTrace.o(15904934985728L, 118501);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15905069203456L, 118502);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15905069203456L, 118502);
      return 0;
      GMTrace.o(15905069203456L, 118502);
      return 159;
      GMTrace.o(15905069203456L, 118502);
      return 159;
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
      localPaint.setColor(-16777216);
      localCanvas.saveLayerAlpha(null, 23, 4);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(69.69F, 0.0F);
      ((Path)localObject).lineTo(89.35F, 0.0F);
      ((Path)localObject).cubicTo(106.27F, 2.71F, 122.64F, 9.98F, 134.93F, 22.1F);
      ((Path)localObject).cubicTo(148.15F, 34.62F, 156.22F, 51.83F, 159.0F, 69.7F);
      ((Path)localObject).lineTo(159.0F, 89.29F);
      ((Path)localObject).cubicTo(156.38F, 106.0F, 149.23F, 122.14F, 137.43F, 134.4F);
      ((Path)localObject).cubicTo(124.86F, 147.9F, 107.45F, 156.17F, 89.34F, 159.0F);
      ((Path)localObject).lineTo(69.67F, 159.0F);
      ((Path)localObject).cubicTo(54.38F, 156.5F, 39.5F, 150.47F, 27.73F, 140.23F);
      ((Path)localObject).cubicTo(12.48F, 127.48F, 2.96F, 108.82F, 0.0F, 89.29F);
      ((Path)localObject).lineTo(0.0F, 69.66F);
      ((Path)localObject).cubicTo(2.74F, 52.26F, 10.43F, 35.46F, 23.1F, 23.05F);
      ((Path)localObject).cubicTo(35.51F, 10.39F, 52.3F, 2.75F, 69.69F, 0.0F);
      ((Path)localObject).lineTo(69.69F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(72.39F, 1.64F);
      ((Path)localObject).cubicTo(50.03F, 3.41F, 29.01F, 15.72F, 16.0F, 33.9F);
      ((Path)localObject).cubicTo(5.98F, 47.41F, 1.2F, 64.29F, 1.1F, 80.99F);
      ((Path)localObject).cubicTo(1.79F, 91.02F, 3.49F, 101.11F, 7.59F, 110.36F);
      ((Path)localObject).cubicTo(16.56F, 131.17F, 34.91F, 147.82F, 56.67F, 154.32F);
      ((Path)localObject).cubicTo(67.11F, 157.23F, 78.17F, 158.89F, 88.95F, 157.08F);
      ((Path)localObject).cubicTo(109.53F, 154.89F, 128.7F, 143.65F, 141.32F, 127.36F);
      ((Path)localObject).cubicTo(157.73F, 106.72F, 162.16F, 77.57F, 153.09F, 52.87F);
      ((Path)localObject).cubicTo(144.96F, 30.37F, 125.99F, 12.03F, 103.11F, 4.91F);
      ((Path)localObject).cubicTo(93.2F, 2.07F, 82.69F, 0.28F, 72.39F, 1.64F);
      ((Path)localObject).lineTo(72.39F, 1.64F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\vg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */