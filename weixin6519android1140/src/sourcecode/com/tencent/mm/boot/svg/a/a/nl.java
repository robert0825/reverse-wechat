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

public final class nl
  extends c
{
  private final int height;
  private final int width;
  
  public nl()
  {
    GMTrace.i(15892855390208L, 118411);
    this.width = 63;
    this.height = 63;
    GMTrace.o(15892855390208L, 118411);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15892989607936L, 118412);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15892989607936L, 118412);
      return 0;
      GMTrace.o(15892989607936L, 118412);
      return 63;
      GMTrace.o(15892989607936L, 118412);
      return 63;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 0.70710677F, -0.70710677F, 31.39409F, 0.70710677F, 0.70710677F, -12.125177F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(25.405478F, 12.6148405F);
      ((Path)localObject).lineTo(25.645857F, 54.121506F);
      ((Path)localObject).lineTo(30.480642F, 63.385418F);
      ((Path)localObject).lineTo(35.31543F, 54.121506F);
      ((Path)localObject).lineTo(35.21498F, 12.6148405F);
      ((Path)localObject).lineTo(25.405478F, 12.6148405F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(25.389639F, 9.879872F);
      ((Path)localObject).lineTo(25.351372F, 3.272119F);
      ((Path)localObject).cubicTo(25.341805F, 1.6204139F, 26.683146F, 0.28144225F, 28.343227F, 0.28144225F);
      ((Path)localObject).lineTo(32.175957F, 0.28144225F);
      ((Path)localObject).cubicTo(33.83788F, 0.28144225F, 35.188385F, 1.6257602F, 35.19237F, 3.272119F);
      ((Path)localObject).lineTo(35.208363F, 9.879872F);
      ((Path)localObject).lineTo(25.389639F, 9.879872F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\nl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */