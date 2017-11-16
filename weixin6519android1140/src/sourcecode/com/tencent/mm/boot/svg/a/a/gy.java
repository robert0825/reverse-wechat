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

public final class gy
  extends c
{
  private final int height;
  private final int width;
  
  public gy()
  {
    GMTrace.i(15908693082112L, 118529);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15908693082112L, 118529);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15908827299840L, 118530);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15908827299840L, 118530);
      return 0;
      GMTrace.o(15908827299840L, 118530);
      return 96;
      GMTrace.o(15908827299840L, 118530);
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
      ((Path)localObject).moveTo(80.0F, 73.0F);
      ((Path)localObject).lineTo(80.0F, 73.0F);
      ((Path)localObject).lineTo(79.0F, 73.0F);
      ((Path)localObject).cubicTo(79.29834F, 73.19833F, 79.27355F, 73.192024F, 79.0F, 73.0F);
      ((Path)localObject).lineTo(57.0F, 67.0F);
      ((Path)localObject).lineTo(57.0F, 62.0F);
      ((Path)localObject).cubicTo(56.61111F, 60.643684F, 57.962963F, 59.314816F, 58.0F, 59.0F);
      ((Path)localObject).lineTo(58.0F, 59.0F);
      ((Path)localObject).cubicTo(63.88858F, 54.7762F, 67.90448F, 45.9815F, 68.0F, 35.0F);
      ((Path)localObject).cubicTo(67.8842F, 21.389061F, 59.20126F, 12.0F, 49.0F, 12.0F);
      ((Path)localObject).cubicTo(37.79874F, 12.0F, 29.131117F, 21.389061F, 29.0F, 35.0F);
      ((Path)localObject).cubicTo(29.151396F, 45.98015F, 33.179913F, 54.775295F, 39.0F, 59.0F);
      ((Path)localObject).lineTo(39.0F, 59.0F);
      ((Path)localObject).cubicTo(39.037037F, 59.314816F, 40.38889F, 60.643684F, 40.0F, 62.0F);
      ((Path)localObject).lineTo(40.0F, 65.0F);
      ((Path)localObject).cubicTo(40.38889F, 66.18132F, 39.252434F, 66.882484F, 38.0F, 67.0F);
      ((Path)localObject).lineTo(18.0F, 73.0F);
      ((Path)localObject).cubicTo(17.725994F, 73.192024F, 17.70166F, 73.19833F, 18.0F, 73.0F);
      ((Path)localObject).lineTo(17.0F, 73.0F);
      ((Path)localObject).lineTo(17.0F, 73.0F);
      ((Path)localObject).cubicTo(14.2589445F, 74.41951F, 12.0F, 77.41431F, 12.0F, 81.0F);
      ((Path)localObject).lineTo(12.0F, 85.0F);
      ((Path)localObject).lineTo(13.0F, 85.0F);
      ((Path)localObject).lineTo(27.0F, 85.0F);
      ((Path)localObject).lineTo(70.0F, 85.0F);
      ((Path)localObject).lineTo(84.0F, 85.0F);
      ((Path)localObject).lineTo(85.0F, 85.0F);
      ((Path)localObject).lineTo(85.0F, 81.0F);
      ((Path)localObject).cubicTo(85.0F, 77.41431F, 82.74061F, 74.41951F, 80.0F, 73.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */