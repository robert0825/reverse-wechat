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

public final class anp
  extends c
{
  private final int height;
  private final int width;
  
  public anp()
  {
    GMTrace.i(15886144503808L, 118361);
    this.width = 80;
    this.height = 70;
    GMTrace.o(15886144503808L, 118361);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15886278721536L, 118362);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15886278721536L, 118362);
      return 0;
      GMTrace.o(15886278721536L, 118362);
      return 80;
      GMTrace.o(15886278721536L, 118362);
      return 70;
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
      localPaint.setColor(-1);
      localCanvas.saveLayerAlpha(null, 204, 4);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(37.23F, 0.0F);
      ((Path)localObject).lineTo(41.05F, 0.0F);
      ((Path)localObject).cubicTo(52.9F, 0.29F, 64.78F, 5.01F, 72.74F, 13.96F);
      ((Path)localObject).cubicTo(59.87F, 19.69F, 46.95F, 25.31F, 34.09F, 31.06F);
      ((Path)localObject).cubicTo(32.6F, 31.58F, 30.87F, 32.65F, 29.33F, 31.68F);
      ((Path)localObject).cubicTo(25.68F, 29.77F, 22.78F, 26.7F, 19.05F, 24.94F);
      ((Path)localObject).cubicTo(18.77F, 25.22F, 18.22F, 25.77F, 17.95F, 26.05F);
      ((Path)localObject).cubicTo(20.11F, 31.91F, 22.96F, 37.53F, 25.64F, 43.17F);
      ((Path)localObject).cubicTo(26.77F, 45.57F, 29.46F, 44.2F, 31.07F, 43.18F);
      ((Path)localObject).cubicTo(45.87F, 34.65F, 60.7F, 26.18F, 75.53F, 17.7F);
      ((Path)localObject).cubicTo(77.88F, 21.83F, 79.57F, 26.35F, 80.0F, 31.1F);
      ((Path)localObject).lineTo(80.0F, 34.4F);
      ((Path)localObject).cubicTo(79.53F, 43.48F, 74.44F, 51.87F, 67.24F, 57.24F);
      ((Path)localObject).cubicTo(56.19F, 65.76F, 41.1F, 68.0F, 27.75F, 64.53F);
      ((Path)localObject).cubicTo(22.08F, 62.87F, 18.26F, 70.19F, 12.88F, 69.67F);
      ((Path)localObject).cubicTo(12.94F, 66.33F, 14.52F, 63.28F, 14.9F, 60.0F);
      ((Path)localObject).cubicTo(14.76F, 58.48F, 13.17F, 57.74F, 12.22F, 56.75F);
      ((Path)localObject).cubicTo(5.34F, 51.41F, 0.51F, 43.26F, 0.0F, 34.47F);
      ((Path)localObject).lineTo(0.0F, 31.4F);
      ((Path)localObject).cubicTo(0.54F, 23.87F, 4.14F, 16.76F, 9.59F, 11.6F);
      ((Path)localObject).cubicTo(16.98F, 4.47F, 27.11F, 0.76F, 37.23F, 0.0F);
      ((Path)localObject).lineTo(37.23F, 0.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\anp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */