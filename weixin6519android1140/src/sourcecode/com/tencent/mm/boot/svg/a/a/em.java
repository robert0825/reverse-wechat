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

public final class em
  extends c
{
  private final int height;
  private final int width;
  
  public em()
  {
    GMTrace.i(15746558066688L, 117321);
    this.width = 100;
    this.height = 100;
    GMTrace.o(15746558066688L, 117321);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15746692284416L, 117322);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15746692284416L, 117322);
      return 0;
      GMTrace.o(15746692284416L, 117322);
      return 100;
      GMTrace.o(15746692284416L, 117322);
      return 100;
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-9473160);
      localPaint1.setStrokeWidth(6.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 59.0F, 0.0F, 1.0F, 38.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 1.9734219F);
      ((Path)localObject2).cubicTo(0.0F, 0.8835311F, 0.8835311F, 0.0F, 1.9734219F, 0.0F);
      ((Path)localObject2).lineTo(28.026579F, 0.0F);
      ((Path)localObject2).cubicTo(29.11647F, 0.0F, 30.0F, 0.8835311F, 30.0F, 1.9734219F);
      ((Path)localObject2).lineTo(30.0F, 46.026577F);
      ((Path)localObject2).cubicTo(30.0F, 47.116467F, 29.11647F, 48.0F, 28.026579F, 48.0F);
      ((Path)localObject2).lineTo(1.9734219F, 48.0F);
      ((Path)localObject2).cubicTo(0.8835311F, 48.0F, 0.0F, 47.116467F, 0.0F, 46.026577F);
      ((Path)localObject2).lineTo(0.0F, 1.9734219F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(69.0F, 35.0F);
      ((Path)localObject2).lineTo(69.0F, 15.980916F);
      ((Path)localObject2).cubicTo(69.0F, 14.886887F, 68.12216F, 14.0F, 67.02344F, 14.0F);
      ((Path)localObject2).lineTo(24.976562F, 14.0F);
      ((Path)localObject2).cubicTo(23.884937F, 14.0F, 23.0F, 14.88437F, 23.0F, 15.981961F);
      ((Path)localObject2).lineTo(23.0F, 84.018036F);
      ((Path)localObject2).cubicTo(23.0F, 85.11265F, 23.873781F, 86.0F, 24.969942F, 86.0F);
      ((Path)localObject2).lineTo(56.0F, 86.0F);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */