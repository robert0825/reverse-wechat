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

public final class pr
  extends c
{
  private final int height;
  private final int width;
  
  public pr()
  {
    GMTrace.i(15720788262912L, 117129);
    this.width = 135;
    this.height = 135;
    GMTrace.o(15720788262912L, 117129);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15720922480640L, 117130);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15720922480640L, 117130);
      return 0;
      GMTrace.o(15720922480640L, 117130);
      return 135;
      GMTrace.o(15720922480640L, 117130);
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
      localPath.moveTo(64.43F, 0.0F);
      localPath.lineTo(70.36F, 0.0F);
      localPath.cubicTo(86.61F, 0.76F, 102.53F, 7.46F, 114.22F, 18.81F);
      localPath.cubicTo(126.68F, 30.6F, 134.12F, 47.3F, 135.0F, 64.4F);
      localPath.lineTo(135.0F, 70.04F);
      localPath.cubicTo(134.31F, 87.59F, 126.58F, 104.75F, 113.69F, 116.7F);
      localPath.cubicTo(102.12F, 127.7F, 86.53F, 134.17F, 70.61F, 135.0F);
      localPath.lineTo(64.61F, 135.0F);
      localPath.cubicTo(48.61F, 134.24F, 32.93F, 127.74F, 21.3F, 116.69F);
      localPath.cubicTo(8.43F, 104.77F, 0.74F, 87.65F, 0.0F, 70.15F);
      localPath.lineTo(0.0F, 64.68F);
      localPath.cubicTo(0.8F, 47.25F, 8.47F, 30.21F, 21.28F, 18.33F);
      localPath.cubicTo(32.87F, 7.3F, 48.48F, 0.83F, 64.43F, 0.0F);
      localPath.lineTo(64.43F, 0.0F);
      localPath.close();
      localPath.moveTo(52.66F, 42.66F);
      localPath.cubicTo(44.71F, 48.71F, 41.53F, 59.9F, 44.75F, 69.31F);
      localPath.cubicTo(48.78F, 81.4F, 57.88F, 91.02F, 67.52F, 99.0F);
      localPath.cubicTo(77.11F, 90.99F, 86.23F, 81.41F, 90.25F, 69.31F);
      localPath.cubicTo(93.47F, 59.92F, 90.3F, 48.73F, 82.36F, 42.67F);
      localPath.cubicTo(74.01F, 35.84F, 61.01F, 35.84F, 52.66F, 42.66F);
      localPath.lineTo(52.66F, 42.66F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(63.25F, 50.28F);
      ((Path)localObject).cubicTo(69.49F, 47.7F, 77.27F, 51.6F, 79.0F, 58.1F);
      ((Path)localObject).cubicTo(81.0F, 64.22F, 77.06F, 71.37F, 70.86F, 73.02F);
      ((Path)localObject).cubicTo(64.78F, 74.97F, 57.7F, 71.09F, 56.01F, 64.96F);
      ((Path)localObject).cubicTo(54.11F, 59.14F, 57.5F, 52.33F, 63.25F, 50.28F);
      ((Path)localObject).lineTo(63.25F, 50.28F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\pr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */