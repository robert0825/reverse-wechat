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

public final class wj
  extends c
{
  private final int height;
  private final int width;
  
  public wj()
  {
    GMTrace.i(15875407085568L, 118281);
    this.width = 40;
    this.height = 56;
    GMTrace.o(15875407085568L, 118281);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15875541303296L, 118282);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15875541303296L, 118282);
      return 0;
      GMTrace.o(15875541303296L, 118282);
      return 40;
      GMTrace.o(15875541303296L, 118282);
      return 56;
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
      localPaint.setColor(-8355712);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(0.53F, 0.0F);
      ((Path)localObject).cubicTo(4.16F, 3.26F, 8.39F, 5.74F, 12.27F, 8.67F);
      ((Path)localObject).cubicTo(21.58F, 15.0F, 30.72F, 21.59F, 40.0F, 27.97F);
      ((Path)localObject).lineTo(40.0F, 27.98F);
      ((Path)localObject).cubicTo(26.85F, 37.4F, 13.29F, 46.35F, 0.36F, 56.0F);
      ((Path)localObject).lineTo(0.0F, 56.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\wj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */