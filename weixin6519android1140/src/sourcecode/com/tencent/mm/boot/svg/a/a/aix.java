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

public final class aix
  extends c
{
  private final int height;
  private final int width;
  
  public aix()
  {
    GMTrace.i(18802427297792L, 140089);
    this.width = 14;
    this.height = 24;
    GMTrace.o(18802427297792L, 140089);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18802561515520L, 140090);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(18802561515520L, 140090);
      return 0;
      GMTrace.o(18802561515520L, 140090);
      return 14;
      GMTrace.o(18802561515520L, 140090);
      return 24;
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
      localPaint1.setStrokeCap(Paint.Cap.SQUARE);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-7039852);
      localPaint1.setStrokeWidth(1.3333334F);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -297.0F, 0.0F, 1.0F, -1097.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(309.1949F, 1109.0F);
      ((Path)localObject2).lineTo(309.33334F, 1108.8616F);
      ((Path)localObject2).lineTo(309.09744F, 1108.6256F);
      ((Path)localObject2).lineTo(298.70767F, 1098.2358F);
      ((Path)localObject2).lineTo(298.47177F, 1098.0F);
      ((Path)localObject2).lineTo(298.0F, 1098.4718F);
      ((Path)localObject2).lineTo(298.2359F, 1098.7076F);
      ((Path)localObject2).lineTo(308.52823F, 1109.0F);
      ((Path)localObject2).lineTo(298.2359F, 1119.2924F);
      ((Path)localObject2).lineTo(298.0F, 1119.5282F);
      ((Path)localObject2).lineTo(298.47177F, 1120.0F);
      ((Path)localObject2).lineTo(298.70767F, 1119.7642F);
      ((Path)localObject2).lineTo(309.09744F, 1109.3744F);
      ((Path)localObject2).lineTo(309.33334F, 1109.1384F);
      ((Path)localObject2).lineTo(309.1949F, 1109.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */