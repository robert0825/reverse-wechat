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

public final class ea
  extends c
{
  private final int height;
  private final int width;
  
  public ea()
  {
    GMTrace.i(15703876829184L, 117003);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15703876829184L, 117003);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15704011046912L, 117004);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15704011046912L, 117004);
      return 0;
      GMTrace.o(15704011046912L, 117004);
      return 60;
      GMTrace.o(15704011046912L, 117004);
      return 60;
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
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-3194563);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(28.0F, 0.0F);
      localPath.lineTo(31.91F, 0.0F);
      localPath.cubicTo(46.53F, 0.77F, 59.15F, 13.36F, 60.0F, 27.97F);
      localPath.lineTo(60.0F, 31.8F);
      localPath.cubicTo(59.3F, 46.69F, 46.27F, 59.57F, 31.35F, 60.0F);
      localPath.lineTo(28.48F, 60.0F);
      localPath.cubicTo(13.76F, 59.47F, 0.96F, 46.87F, 0.0F, 32.2F);
      localPath.lineTo(0.0F, 28.26F);
      localPath.cubicTo(0.67F, 13.56F, 13.33F, 0.84F, 28.0F, 0.0F);
      localPath.moveTo(13.35F, 25.51F);
      localPath.cubicTo(11.47F, 26.71F, 12.06F, 29.22F, 11.97F, 31.09F);
      localPath.cubicTo(11.7F, 32.88F, 12.89F, 35.05F, 14.89F, 34.94F);
      localPath.cubicTo(24.63F, 35.08F, 34.38F, 34.97F, 44.13F, 34.99F);
      localPath.cubicTo(45.92F, 35.31F, 47.97F, 34.09F, 47.96F, 32.14F);
      localPath.cubicTo(47.98F, 29.78F, 48.76F, 26.29F, 45.99F, 25.15F);
      localPath.cubicTo(36.69F, 24.77F, 27.35F, 25.14F, 18.04F, 24.98F);
      localPath.cubicTo(16.5F, 25.15F, 14.73F, 24.65F, 13.35F, 25.51F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-665128);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(13.35F, 25.51F);
      ((Path)localObject).cubicTo(14.73F, 24.65F, 16.5F, 25.15F, 18.04F, 24.98F);
      ((Path)localObject).cubicTo(27.35F, 25.14F, 36.69F, 24.77F, 45.99F, 25.15F);
      ((Path)localObject).cubicTo(48.76F, 26.29F, 47.98F, 29.78F, 47.96F, 32.14F);
      ((Path)localObject).cubicTo(47.97F, 34.09F, 45.92F, 35.31F, 44.13F, 34.99F);
      ((Path)localObject).cubicTo(34.38F, 34.97F, 24.63F, 35.08F, 14.89F, 34.94F);
      ((Path)localObject).cubicTo(12.89F, 35.05F, 11.7F, 32.88F, 11.97F, 31.09F);
      ((Path)localObject).cubicTo(12.06F, 29.22F, 11.47F, 26.71F, 13.35F, 25.51F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */