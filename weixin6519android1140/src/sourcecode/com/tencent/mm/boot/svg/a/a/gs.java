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

public final class gs
  extends c
{
  private final int height;
  private final int width;
  
  public gs()
  {
    GMTrace.i(15917014581248L, 118591);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15917014581248L, 118591);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15917148798976L, 118592);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15917148798976L, 118592);
      return 0;
      GMTrace.o(15917148798976L, 118592);
      return 96;
      GMTrace.o(15917148798976L, 118592);
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
      ((Path)localObject).moveTo(69.0F, 73.0F);
      ((Path)localObject).cubicTo(69.0F, 75.18871F, 67.16411F, 77.0F, 65.0F, 77.0F);
      ((Path)localObject).lineTo(57.0F, 77.0F);
      ((Path)localObject).lineTo(57.0F, 57.0F);
      ((Path)localObject).lineTo(40.0F, 57.0F);
      ((Path)localObject).lineTo(40.0F, 77.0F);
      ((Path)localObject).lineTo(32.0F, 77.0F);
      ((Path)localObject).cubicTo(29.835434F, 77.0F, 28.0F, 75.18871F, 28.0F, 73.0F);
      ((Path)localObject).lineTo(28.0F, 38.0F);
      ((Path)localObject).lineTo(49.0F, 18.0F);
      ((Path)localObject).lineTo(69.0F, 38.0F);
      ((Path)localObject).lineTo(69.0F, 73.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(52.0F, 9.0F);
      ((Path)localObject).lineTo(52.0F, 9.0F);
      ((Path)localObject).cubicTo(50.78988F, 8.532246F, 49.708397F, 8.0F, 49.0F, 8.0F);
      ((Path)localObject).cubicTo(47.291603F, 8.0F, 46.21012F, 8.532246F, 45.0F, 9.0F);
      ((Path)localObject).lineTo(45.0F, 9.0F);
      ((Path)localObject).lineTo(8.0F, 47.0F);
      ((Path)localObject).lineTo(14.0F, 53.0F);
      ((Path)localObject).lineTo(20.0F, 46.0F);
      ((Path)localObject).lineTo(20.0F, 73.0F);
      ((Path)localObject).cubicTo(20.146534F, 79.55686F, 25.5868F, 85.0F, 32.0F, 85.0F);
      ((Path)localObject).lineTo(40.0F, 85.0F);
      ((Path)localObject).lineTo(57.0F, 85.0F);
      ((Path)localObject).lineTo(65.0F, 85.0F);
      ((Path)localObject).cubicTo(71.4132F, 85.0F, 76.85346F, 79.55686F, 77.0F, 73.0F);
      ((Path)localObject).lineTo(77.0F, 46.0F);
      ((Path)localObject).lineTo(83.0F, 53.0F);
      ((Path)localObject).lineTo(89.0F, 47.0F);
      ((Path)localObject).lineTo(52.0F, 9.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */