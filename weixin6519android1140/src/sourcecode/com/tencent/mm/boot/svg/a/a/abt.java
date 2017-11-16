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

public final class abt
  extends c
{
  private final int height;
  private final int width;
  
  public abt()
  {
    GMTrace.i(15890439471104L, 118393);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15890439471104L, 118393);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15890573688832L, 118394);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15890573688832L, 118394);
      return 0;
      GMTrace.o(15890573688832L, 118394);
      return 96;
      GMTrace.o(15890573688832L, 118394);
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
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(68.0F, 71.0F);
      ((Path)localObject).lineTo(22.0F, 71.0F);
      ((Path)localObject).lineTo(22.0F, 37.0F);
      ((Path)localObject).lineTo(31.521F, 37.0F);
      ((Path)localObject).cubicTo(32.823F, 34.063F, 34.368F, 31.769F, 36.079F, 30.0F);
      ((Path)localObject).lineTo(18.0F, 30.0F);
      ((Path)localObject).cubicTo(16.343F, 30.0F, 15.0F, 31.343F, 15.0F, 33.0F);
      ((Path)localObject).lineTo(15.0F, 75.0F);
      ((Path)localObject).cubicTo(15.0F, 76.657F, 16.343F, 78.0F, 18.0F, 78.0F);
      ((Path)localObject).lineTo(72.0F, 78.0F);
      ((Path)localObject).cubicTo(73.656F, 78.0F, 75.0F, 76.657F, 75.0F, 75.0F);
      ((Path)localObject).lineTo(75.0F, 53.22F);
      ((Path)localObject).lineTo(68.0F, 59.13F);
      ((Path)localObject).lineTo(68.0F, 71.0F);
      ((Path)localObject).lineTo(68.0F, 71.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(60.0F, 19.0F);
      ((Path)localObject).lineTo(60.0F, 30.019F);
      ((Path)localObject).cubicTo(58.325F, 30.008F, 56.583F, 30.0F, 55.0F, 30.0F);
      ((Path)localObject).cubicTo(41.334F, 30.0F, 32.055F, 43.333F, 32.055F, 61.0F);
      ((Path)localObject).cubicTo(36.721F, 50.16F, 41.284F, 45.0F, 60.0F, 45.0F);
      ((Path)localObject).lineTo(60.0F, 56.0F);
      ((Path)localObject).lineTo(74.452F, 43.848F);
      ((Path)localObject).lineTo(75.0F, 44.357F);
      ((Path)localObject).lineTo(75.0F, 43.386F);
      ((Path)localObject).lineTo(82.0F, 37.5F);
      ((Path)localObject).lineTo(60.0F, 19.0F);
      ((Path)localObject).lineTo(60.0F, 19.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\abt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */