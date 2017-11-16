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

public final class ot
  extends c
{
  private final int height;
  private final int width;
  
  public ot()
  {
    GMTrace.i(15871648989184L, 118253);
    this.width = 135;
    this.height = 135;
    GMTrace.o(15871648989184L, 118253);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15871783206912L, 118254);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15871783206912L, 118254);
      return 0;
      GMTrace.o(15871783206912L, 118254);
      return 135;
      GMTrace.o(15871783206912L, 118254);
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
      localPaint.setColor(-831975);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(54.69F, 66.858F);
      ((Path)localObject).lineTo(54.69F, 40.92F);
      ((Path)localObject).lineTo(73.104F, 40.92F);
      ((Path)localObject).cubicTo(78.45003F, 40.92F, 82.36049F, 42.02549F, 84.8355F, 44.2365F);
      ((Path)localObject).cubicTo(87.31051F, 46.44751F, 88.548F, 49.664978F, 88.548F, 53.889F);
      ((Path)localObject).cubicTo(88.548F, 58.11302F, 87.31051F, 61.34699F, 84.8355F, 63.591F);
      ((Path)localObject).cubicTo(82.36049F, 65.835014F, 78.45003F, 66.924F, 73.104F, 66.858F);
      ((Path)localObject).lineTo(54.69F, 66.858F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(45.0F, 33.0F);
      ((Path)localObject).lineTo(45.0F, 103.5F);
      ((Path)localObject).lineTo(54.405F, 103.5F);
      ((Path)localObject).lineTo(54.405F, 74.778F);
      ((Path)localObject).lineTo(75.987F, 74.778F);
      ((Path)localObject).cubicTo(83.115036F, 74.844F, 88.51048F, 73.02902F, 92.1735F, 69.333F);
      ((Path)localObject).cubicTo(95.83652F, 65.63698F, 97.668F, 60.489033F, 97.668F, 53.889F);
      ((Path)localObject).cubicTo(97.668F, 47.288967F, 95.83652F, 42.157516F, 92.1735F, 38.4945F);
      ((Path)localObject).cubicTo(88.51048F, 34.831482F, 83.115036F, 33.0F, 75.987F, 33.0F);
      ((Path)localObject).lineTo(45.0F, 33.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */