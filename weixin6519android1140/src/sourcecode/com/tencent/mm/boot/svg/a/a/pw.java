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

public final class pw
  extends c
{
  private final int height;
  private final int width;
  
  public pw()
  {
    GMTrace.i(15714882682880L, 117085);
    this.width = 135;
    this.height = 135;
    GMTrace.o(15714882682880L, 117085);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15715016900608L, 117086);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15715016900608L, 117086);
      return 0;
      GMTrace.o(15715016900608L, 117086);
      return 135;
      GMTrace.o(15715016900608L, 117086);
      return 135;
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
      localPaint.setColor(-10589839);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(64.01F, 0.0F);
      localPath.lineTo(70.7F, 0.0F);
      localPath.cubicTo(86.61F, 0.87F, 102.17F, 7.34F, 113.73F, 18.34F);
      localPath.cubicTo(126.38F, 30.07F, 133.97F, 46.81F, 135.0F, 63.99F);
      localPath.lineTo(135.0F, 70.74F);
      localPath.cubicTo(134.07F, 88.04F, 126.42F, 104.91F, 113.68F, 116.71F);
      localPath.cubicTo(102.21F, 127.63F, 86.78F, 134.04F, 71.01F, 135.0F);
      localPath.lineTo(64.24F, 135.0F);
      localPath.cubicTo(48.16F, 134.11F, 32.42F, 127.48F, 20.83F, 116.25F);
      localPath.cubicTo(8.42F, 104.55F, 1.02F, 87.98F, 0.0F, 71.0F);
      localPath.lineTo(0.0F, 64.29F);
      localPath.cubicTo(0.93F, 46.98F, 8.57F, 30.09F, 21.32F, 18.3F);
      localPath.cubicTo(32.8F, 7.38F, 48.23F, 0.96F, 64.01F, 0.0F);
      localPath.lineTo(64.01F, 0.0F);
      localPath.close();
      localPath.moveTo(57.54F, 3.77F);
      localPath.cubicTo(42.29F, 6.1F, 28.02F, 14.16F, 18.14F, 26.0F);
      localPath.cubicTo(8.29F, 37.61F, 2.83F, 52.81F, 3.01F, 68.03F);
      localPath.cubicTo(3.07F, 82.86F, 8.49F, 97.59F, 18.07F, 108.92F);
      localPath.cubicTo(28.45F, 121.4F, 43.71F, 129.71F, 59.86F, 131.54F);
      localPath.cubicTo(73.7F, 133.21F, 88.08F, 130.27F, 100.09F, 123.16F);
      localPath.cubicTo(112.84F, 115.72F, 122.91F, 103.76F, 127.99F, 89.89F);
      localPath.cubicTo(133.52F, 75.08F, 133.31F, 58.23F, 127.4F, 43.57F);
      localPath.cubicTo(121.37F, 28.32F, 109.24F, 15.61F, 94.31F, 8.83F);
      localPath.cubicTo(82.91F, 3.57F, 69.94F, 1.85F, 57.54F, 3.77F);
      localPath.lineTo(57.54F, 3.77F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(31.05F, 68.1F);
      localPath.cubicTo(30.3F, 60.46F, 36.39F, 53.09F, 43.97F, 52.18F);
      localPath.cubicTo(49.99F, 51.77F, 56.04F, 52.11F, 62.07F, 51.99F);
      localPath.cubicTo(72.02F, 52.05F, 79.69F, 63.4F, 75.56F, 72.62F);
      localPath.cubicTo(73.67F, 73.73F, 71.31F, 72.55F, 69.52F, 71.66F);
      localPath.cubicTo(71.15F, 67.92F, 70.84F, 63.13F, 67.59F, 60.37F);
      localPath.cubicTo(63.89F, 56.95F, 58.53F, 58.22F, 53.99F, 58.0F);
      localPath.cubicTo(49.01F, 58.21F, 42.79F, 56.78F, 39.21F, 61.25F);
      localPath.cubicTo(35.06F, 65.77F, 37.43F, 73.88F, 43.31F, 75.52F);
      localPath.cubicTo(48.01F, 76.54F, 52.9F, 75.75F, 57.67F, 76.01F);
      localPath.cubicTo(59.24F, 78.32F, 61.16F, 80.34F, 63.38F, 82.02F);
      localPath.cubicTo(57.21F, 81.9F, 51.04F, 82.15F, 44.87F, 81.91F);
      localPath.cubicTo(37.71F, 81.5F, 31.45F, 75.27F, 31.05F, 68.1F);
      localPath.lineTo(31.05F, 68.1F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(71.78F, 51.99F);
      ((Path)localObject).cubicTo(77.89F, 52.05F, 84.01F, 51.94F, 90.13F, 52.02F);
      ((Path)localObject).cubicTo(98.38F, 52.58F, 105.3F, 60.83F, 103.84F, 69.11F);
      ((Path)localObject).cubicTo(102.87F, 77.07F, 94.81F, 82.98F, 86.94F, 82.02F);
      ((Path)localObject).cubicTo(79.39F, 81.39F, 70.7F, 83.89F, 64.22F, 78.81F);
      ((Path)localObject).cubicTo(58.78F, 74.83F, 57.16F, 67.31F, 59.35F, 61.12F);
      ((Path)localObject).cubicTo(61.38F, 60.93F, 63.5F, 61.01F, 65.25F, 62.19F);
      ((Path)localObject).cubicTo(65.22F, 64.45F, 63.93F, 66.69F, 64.71F, 68.98F);
      ((Path)localObject).cubicTo(65.53F, 73.18F, 69.7F, 76.18F, 73.91F, 75.98F);
      ((Path)localObject).cubicTo(79.3F, 75.96F, 84.7F, 76.15F, 90.09F, 75.88F);
      ((Path)localObject).cubicTo(96.55F, 75.34F, 100.28F, 66.93F, 96.22F, 61.81F);
      ((Path)localObject).cubicTo(91.84F, 55.82F, 83.59F, 58.66F, 77.33F, 57.99F);
      ((Path)localObject).cubicTo(75.78F, 55.72F, 73.88F, 53.74F, 71.78F, 51.99F);
      ((Path)localObject).lineTo(71.78F, 51.99F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\pw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */