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

public final class gl
  extends c
{
  private final int height;
  private final int width;
  
  public gl()
  {
    GMTrace.i(15717030166528L, 117101);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15717030166528L, 117101);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15717164384256L, 117102);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15717164384256L, 117102);
      return 0;
      GMTrace.o(15717164384256L, 117102);
      return 96;
      GMTrace.o(15717164384256L, 117102);
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
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(72.0F, 44.0F);
      ((Path)localObject).lineTo(47.0F, 44.0F);
      ((Path)localObject).lineTo(47.0F, 52.0F);
      ((Path)localObject).lineTo(72.0F, 52.0F);
      ((Path)localObject).lineTo(72.0F, 60.0F);
      ((Path)localObject).lineTo(87.39076F, 48.0F);
      ((Path)localObject).lineTo(72.0F, 36.0F);
      ((Path)localObject).lineTo(72.0F, 44.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(80.0F, 26.0F);
      ((Path)localObject).lineTo(80.0F, 23.990396F);
      ((Path)localObject).cubicTo(80.0F, 17.382257F, 74.62726F, 12.0F, 67.99965F, 12.0F);
      ((Path)localObject).lineTo(28.00035F, 12.0F);
      ((Path)localObject).cubicTo(21.373957F, 12.0F, 16.0F, 17.368282F, 16.0F, 23.990396F);
      ((Path)localObject).lineTo(16.0F, 72.009605F);
      ((Path)localObject).cubicTo(16.0F, 78.617744F, 21.37274F, 84.0F, 28.00035F, 84.0F);
      ((Path)localObject).lineTo(67.99965F, 84.0F);
      ((Path)localObject).cubicTo(74.626045F, 84.0F, 80.0F, 78.631714F, 80.0F, 72.009605F);
      ((Path)localObject).lineTo(80.0F, 70.0F);
      ((Path)localObject).lineTo(72.0F, 70.0F);
      ((Path)localObject).lineTo(72.0F, 71.995094F);
      ((Path)localObject).cubicTo(72.0F, 74.20694F, 70.20595F, 76.0F, 67.990105F, 76.0F);
      ((Path)localObject).lineTo(28.009893F, 76.0F);
      ((Path)localObject).cubicTo(25.79529F, 76.0F, 24.0F, 74.2002F, 24.0F, 71.995094F);
      ((Path)localObject).lineTo(24.0F, 24.004908F);
      ((Path)localObject).cubicTo(24.0F, 21.793058F, 25.794052F, 20.0F, 28.009893F, 20.0F);
      ((Path)localObject).lineTo(67.990105F, 20.0F);
      ((Path)localObject).cubicTo(70.20471F, 20.0F, 72.0F, 21.799795F, 72.0F, 24.004908F);
      ((Path)localObject).lineTo(72.0F, 26.0F);
      ((Path)localObject).lineTo(80.0F, 26.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */