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
import com.tencent.mm.svg.c;

public final class ck
  extends c
{
  private final int height;
  private final int width;
  
  public ck()
  {
    GMTrace.i(15781991546880L, 117585);
    this.width = 45;
    this.height = 57;
    GMTrace.o(15781991546880L, 117585);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15782125764608L, 117586);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15782125764608L, 117586);
      return 0;
      GMTrace.o(15782125764608L, 117586);
      return 45;
      GMTrace.o(15782125764608L, 117586);
      return 57;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
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
      localPaint1 = c.a(localPaint2, paramVarArgs);
      localPaint1.setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-11184811);
      localPaint1.setStrokeWidth(3.0F);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1450.0F, 0.0F, 1.0F, -602.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1470.9163F, 655.8485F);
      ((Path)localObject2).cubicTo(1472.067F, 657.03674F, 1473.9164F, 657.02386F, 1475.0333F, 655.7881F);
      ((Path)localObject2).cubicTo(1475.0333F, 655.7881F, 1492.0F, 638.46387F, 1492.0F, 624.0F);
      ((Path)localObject2).cubicTo(1492.0F, 612.767F, 1483.2695F, 604.0F, 1473.0F, 604.0F);
      ((Path)localObject2).cubicTo(1461.7305F, 604.0F, 1453.0F, 612.767F, 1453.0F, 624.0F);
      ((Path)localObject2).cubicTo(1453.0F, 638.46387F, 1470.9163F, 655.8485F, 1470.9163F, 655.8485F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(1473.0F, 630.0F);
      ((Path)localObject2).cubicTo(1476.0898F, 630.0F, 1479.0F, 627.08984F, 1479.0F, 624.0F);
      ((Path)localObject2).cubicTo(1479.0F, 619.91016F, 1476.0898F, 617.0F, 1473.0F, 617.0F);
      ((Path)localObject2).cubicTo(1468.9102F, 617.0F, 1466.0F, 619.91016F, 1466.0F, 624.0F);
      ((Path)localObject2).cubicTo(1466.0F, 627.08984F, 1468.9102F, 630.0F, 1473.0F, 630.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */