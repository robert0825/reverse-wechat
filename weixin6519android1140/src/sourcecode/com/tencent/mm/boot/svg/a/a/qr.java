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

public final class qr
  extends c
{
  private final int height;
  private final int width;
  
  public qr()
  {
    GMTrace.i(15795413319680L, 117685);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15795413319680L, 117685);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15795547537408L, 117686);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15795547537408L, 117686);
      return 0;
      GMTrace.o(15795547537408L, 117686);
      return 96;
      GMTrace.o(15795547537408L, 117686);
      return 96;
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
      localPaint.setColor(-9074981);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(61.0F, 21.0F);
      ((Path)localObject).cubicTo(57.693F, 21.0F, 54.614F, 21.879F, 52.0F, 23.374F);
      ((Path)localObject).cubicTo(47.205F, 26.118F, 44.0F, 30.968F, 44.0F, 36.5F);
      ((Path)localObject).lineTo(44.0F, 59.5F);
      ((Path)localObject).cubicTo(44.0F, 63.642F, 39.97F, 67.0F, 35.0F, 67.0F);
      ((Path)localObject).cubicTo(30.029F, 67.0F, 26.0F, 63.642F, 26.0F, 59.5F);
      ((Path)localObject).cubicTo(26.0F, 56.552F, 28.046F, 54.009F, 31.015F, 52.783F);
      ((Path)localObject).cubicTo(31.229F, 52.695F, 31.446F, 52.611F, 31.669F, 52.537F);
      ((Path)localObject).cubicTo(33.538F, 51.787F, 35.141F, 50.379F, 35.736F, 48.744F);
      ((Path)localObject).cubicTo(36.615F, 46.33F, 34.979F, 44.374F, 32.083F, 44.374F);
      ((Path)localObject).cubicTo(31.361F, 44.374F, 30.629F, 44.496F, 29.923F, 44.716F);
      ((Path)localObject).cubicTo(29.92F, 44.717F, 29.917F, 44.718F, 29.913F, 44.719F);
      ((Path)localObject).cubicTo(25.726F, 45.921F, 22.231F, 48.557F, 20.133F, 52.0F);
      ((Path)localObject).cubicTo(18.778F, 54.225F, 18.0F, 56.78F, 18.0F, 59.5F);
      ((Path)localObject).cubicTo(18.0F, 68.047F, 25.626F, 75.0F, 35.0F, 75.0F);
      ((Path)localObject).cubicTo(38.307F, 75.0F, 41.386F, 74.121F, 44.0F, 72.626F);
      ((Path)localObject).cubicTo(48.795F, 69.882F, 52.0F, 65.032F, 52.0F, 59.5F);
      ((Path)localObject).lineTo(52.0F, 36.5F);
      ((Path)localObject).cubicTo(52.0F, 32.358F, 56.029F, 29.0F, 61.0F, 29.0F);
      ((Path)localObject).cubicTo(65.97F, 29.0F, 70.0F, 32.358F, 70.0F, 36.5F);
      ((Path)localObject).cubicTo(70.0F, 39.574F, 67.781F, 42.216F, 64.604F, 43.374F);
      ((Path)localObject).cubicTo(62.555F, 44.061F, 60.876F, 45.544F, 60.236F, 47.301F);
      ((Path)localObject).cubicTo(59.362F, 49.703F, 60.99F, 51.651F, 63.873F, 51.651F);
      ((Path)localObject).cubicTo(64.526F, 51.651F, 65.186F, 51.539F, 65.829F, 51.357F);
      ((Path)localObject).cubicTo(65.934F, 51.328F, 66.038F, 51.296F, 66.142F, 51.265F);
      ((Path)localObject).cubicTo(70.304F, 50.056F, 73.778F, 47.428F, 75.866F, 44.0F);
      ((Path)localObject).cubicTo(77.222F, 41.776F, 78.0F, 39.22F, 78.0F, 36.5F);
      ((Path)localObject).cubicTo(78.0F, 27.953F, 70.374F, 21.0F, 61.0F, 21.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\qr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */