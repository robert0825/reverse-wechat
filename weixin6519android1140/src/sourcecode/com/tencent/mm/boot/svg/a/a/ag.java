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

public final class ag
  extends c
{
  private final int height;
  private final int width;
  
  public ag()
  {
    GMTrace.i(20323114156032L, 151419);
    this.width = 24;
    this.height = 24;
    GMTrace.o(20323114156032L, 151419);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20323248373760L, 151420);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20323248373760L, 151420);
      return 0;
      GMTrace.o(20323248373760L, 151420);
      return 24;
      GMTrace.o(20323248373760L, 151420);
      return 24;
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
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-5066062);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -54.0F, 0.0F, 1.0F, -710.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 254.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 432.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(34.0F, 34.0F);
      ((Path)localObject2).lineTo(26.004946F, 34.0F);
      ((Path)localObject2).cubicTo(24.897026F, 34.0F, 24.0F, 34.89543F, 24.0F, 36.0F);
      ((Path)localObject2).cubicTo(24.0F, 37.11227F, 24.897646F, 38.0F, 26.004946F, 38.0F);
      ((Path)localObject2).lineTo(34.0F, 38.0F);
      ((Path)localObject2).lineTo(34.0F, 45.995052F);
      ((Path)localObject2).cubicTo(34.0F, 47.102974F, 34.89543F, 48.0F, 36.0F, 48.0F);
      ((Path)localObject2).cubicTo(37.11227F, 48.0F, 38.0F, 47.102356F, 38.0F, 45.995052F);
      ((Path)localObject2).lineTo(38.0F, 38.0F);
      ((Path)localObject2).lineTo(45.995052F, 38.0F);
      ((Path)localObject2).cubicTo(47.102974F, 38.0F, 48.0F, 37.10457F, 48.0F, 36.0F);
      ((Path)localObject2).cubicTo(48.0F, 34.88773F, 47.102356F, 34.0F, 45.995052F, 34.0F);
      ((Path)localObject2).lineTo(38.0F, 34.0F);
      ((Path)localObject2).lineTo(38.0F, 26.004946F);
      ((Path)localObject2).cubicTo(38.0F, 24.897026F, 37.10457F, 24.0F, 36.0F, 24.0F);
      ((Path)localObject2).cubicTo(34.88773F, 24.0F, 34.0F, 24.897646F, 34.0F, 26.004946F);
      ((Path)localObject2).lineTo(34.0F, 34.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */