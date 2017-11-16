package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class gw
  extends c
{
  private final int height;
  private final int width;
  
  public gw()
  {
    GMTrace.i(15943321255936L, 118787);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15943321255936L, 118787);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15943455473664L, 118788);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15943455473664L, 118788);
      return 0;
      GMTrace.o(15943455473664L, 118788);
      return 96;
      GMTrace.o(15943455473664L, 118788);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 40.0F, 0.0F, 1.0F, 8.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-8617851);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(8.0F, 65.0F);
      ((Path)localObject2).cubicTo(3.5817778F, 65.0F, 0.0F, 68.58178F, 0.0F, 73.0F);
      ((Path)localObject2).cubicTo(0.0F, 77.41822F, 3.5817778F, 81.0F, 8.0F, 81.0F);
      ((Path)localObject2).cubicTo(12.418222F, 81.0F, 16.0F, 77.41822F, 16.0F, 73.0F);
      ((Path)localObject2).cubicTo(16.0F, 68.58178F, 12.418222F, 65.0F, 8.0F, 65.0F);
      ((Path)localObject2).moveTo(8.0F, 32.0F);
      ((Path)localObject2).cubicTo(3.5817778F, 32.0F, 0.0F, 35.58178F, 0.0F, 40.0F);
      ((Path)localObject2).cubicTo(0.0F, 44.41822F, 3.5817778F, 48.0F, 8.0F, 48.0F);
      ((Path)localObject2).cubicTo(12.418222F, 48.0F, 16.0F, 44.41822F, 16.0F, 40.0F);
      ((Path)localObject2).cubicTo(16.0F, 35.58178F, 12.418222F, 32.0F, 8.0F, 32.0F);
      ((Path)localObject2).moveTo(16.0F, 8.0F);
      ((Path)localObject2).cubicTo(16.0F, 3.5817778F, 12.418222F, 0.0F, 8.0F, 0.0F);
      ((Path)localObject2).cubicTo(3.5817778F, 0.0F, 0.0F, 3.5817778F, 0.0F, 8.0F);
      ((Path)localObject2).cubicTo(0.0F, 12.418222F, 3.5817778F, 16.0F, 8.0F, 16.0F);
      ((Path)localObject2).cubicTo(12.418222F, 16.0F, 16.0F, 12.418222F, 16.0F, 8.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */