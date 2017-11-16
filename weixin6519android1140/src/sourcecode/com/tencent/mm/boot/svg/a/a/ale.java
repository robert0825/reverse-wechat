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

public final class ale
  extends c
{
  private final int height;
  private final int width;
  
  public ale()
  {
    GMTrace.i(15917819887616L, 118597);
    this.width = 63;
    this.height = 63;
    GMTrace.o(15917819887616L, 118597);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15917954105344L, 118598);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15917954105344L, 118598);
      return 0;
      GMTrace.o(15917954105344L, 118598);
      return 63;
      GMTrace.o(15917954105344L, 118598);
      return 63;
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
      localPaint.setColor(-14624737);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(21.0F, 21.0F);
      ((Path)localObject).lineTo(43.5F, 21.0F);
      ((Path)localObject).lineTo(43.5F, 21.127842F);
      ((Path)localObject).cubicTo(51.115696F, 22.108934F, 57.0F, 28.61729F, 57.0F, 36.5F);
      ((Path)localObject).cubicTo(57.0F, 44.209316F, 51.37172F, 50.604076F, 44.0F, 51.79944F);
      ((Path)localObject).lineTo(44.0F, 52.0F);
      ((Path)localObject).lineTo(20.0F, 52.0F);
      ((Path)localObject).lineTo(20.0F, 46.0F);
      ((Path)localObject).lineTo(44.0F, 46.0F);
      ((Path)localObject).lineTo(44.0F, 46.16791F);
      ((Path)localObject).cubicTo(47.53181F, 44.624798F, 50.0F, 41.10064F, 50.0F, 37.0F);
      ((Path)localObject).cubicTo(50.0F, 32.07876F, 46.445118F, 27.987804F, 41.763157F, 27.15494F);
      ((Path)localObject).lineTo(41.763157F, 27.0F);
      ((Path)localObject).lineTo(21.0F, 27.0F);
      ((Path)localObject).lineTo(21.0F, 32.99984F);
      ((Path)localObject).cubicTo(21.0F, 34.664913F, 19.933712F, 35.176052F, 18.61838F, 34.159657F);
      ((Path)localObject).lineTo(6.88162F, 25.090343F);
      ((Path)localObject).cubicTo(5.5572495F, 24.066965F, 5.5662875F, 22.42605F, 6.88162F, 21.409657F);
      ((Path)localObject).lineTo(18.61838F, 12.3403425F);
      ((Path)localObject).cubicTo(19.94275F, 11.316965F, 21.0F, 11.843217F, 21.0F, 13.500159F);
      ((Path)localObject).lineTo(21.0F, 21.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */