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

public final class dv
  extends c
{
  private final int height;
  private final int width;
  
  public dv()
  {
    GMTrace.i(15802929512448L, 117741);
    this.width = 192;
    this.height = 192;
    GMTrace.o(15802929512448L, 117741);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15803063730176L, 117742);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15803063730176L, 117742);
      return 0;
      GMTrace.o(15803063730176L, 117742);
      return 192;
      GMTrace.o(15803063730176L, 117742);
      return 192;
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
      localPaint.setColor(-8421505);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(101.0F, 91.0F);
      ((Path)localObject).lineTo(101.0F, 55.997814F);
      ((Path)localObject).cubicTo(101.0F, 54.350853F, 99.65671F, 53.0F, 97.99967F, 53.0F);
      ((Path)localObject).lineTo(94.00033F, 53.0F);
      ((Path)localObject).cubicTo(92.34865F, 53.0F, 91.0F, 54.342167F, 91.0F, 55.997814F);
      ((Path)localObject).lineTo(91.0F, 91.0F);
      ((Path)localObject).lineTo(55.997814F, 91.0F);
      ((Path)localObject).cubicTo(54.350853F, 91.0F, 53.0F, 92.34329F, 53.0F, 94.00033F);
      ((Path)localObject).lineTo(53.0F, 97.99967F);
      ((Path)localObject).cubicTo(53.0F, 99.65135F, 54.342167F, 101.0F, 55.997814F, 101.0F);
      ((Path)localObject).lineTo(91.0F, 101.0F);
      ((Path)localObject).lineTo(91.0F, 136.00218F);
      ((Path)localObject).cubicTo(91.0F, 137.64914F, 92.34329F, 139.0F, 94.00033F, 139.0F);
      ((Path)localObject).lineTo(97.99967F, 139.0F);
      ((Path)localObject).cubicTo(99.65135F, 139.0F, 101.0F, 137.65784F, 101.0F, 136.00218F);
      ((Path)localObject).lineTo(101.0F, 101.0F);
      ((Path)localObject).lineTo(136.00218F, 101.0F);
      ((Path)localObject).cubicTo(137.64914F, 101.0F, 139.0F, 99.65671F, 139.0F, 97.99967F);
      ((Path)localObject).lineTo(139.0F, 94.00033F);
      ((Path)localObject).cubicTo(139.0F, 92.34865F, 137.65784F, 91.0F, 136.00218F, 91.0F);
      ((Path)localObject).lineTo(101.0F, 91.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */