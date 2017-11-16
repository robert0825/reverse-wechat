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

public final class ec
  extends c
{
  private final int height;
  private final int width;
  
  public ec()
  {
    GMTrace.i(18803232604160L, 140095);
    this.width = 45;
    this.height = 45;
    GMTrace.o(18803232604160L, 140095);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18803366821888L, 140096);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(18803366821888L, 140096);
      return 0;
      GMTrace.o(18803366821888L, 140096);
      return 45;
      GMTrace.o(18803366821888L, 140096);
      return 45;
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramVarArgs);
      ((Paint)localObject1).setColor(-11048043);
      ((Paint)localObject1).setStrokeWidth(3.0F);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.5F, 4.5F);
      ((Path)localObject2).cubicTo(1.5F, 2.8431456F, 2.8431456F, 1.5F, 4.5F, 1.5F);
      ((Path)localObject2).lineTo(40.5F, 1.5F);
      ((Path)localObject2).cubicTo(42.156853F, 1.5F, 43.5F, 2.8431456F, 43.5F, 4.5F);
      ((Path)localObject2).lineTo(43.5F, 28.5F);
      ((Path)localObject2).cubicTo(43.5F, 30.156855F, 42.156853F, 31.5F, 40.5F, 31.5F);
      ((Path)localObject2).lineTo(4.5F, 31.5F);
      ((Path)localObject2).cubicTo(2.8431456F, 31.5F, 1.5F, 30.156855F, 1.5F, 28.5F);
      ((Path)localObject2).lineTo(1.5F, 4.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-11048043);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(6.0F, 17.0F);
      ((Path)localObject2).cubicTo(6.0F, 16.447716F, 6.4477153F, 16.0F, 7.0F, 16.0F);
      ((Path)localObject2).lineTo(11.0F, 16.0F);
      ((Path)localObject2).cubicTo(11.552285F, 16.0F, 12.0F, 16.447716F, 12.0F, 17.0F);
      ((Path)localObject2).lineTo(12.0F, 21.0F);
      ((Path)localObject2).cubicTo(12.0F, 21.552284F, 11.552285F, 22.0F, 11.0F, 22.0F);
      ((Path)localObject2).lineTo(7.0F, 22.0F);
      ((Path)localObject2).cubicTo(6.4477153F, 22.0F, 6.0F, 21.552284F, 6.0F, 21.0F);
      ((Path)localObject2).lineTo(6.0F, 17.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-11048043);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(6.0F, 9.0F);
      ((Path)localObject1).lineTo(39.0F, 9.0F);
      ((Path)localObject1).lineTo(39.0F, 12.0F);
      ((Path)localObject1).lineTo(6.0F, 12.0F);
      ((Path)localObject1).lineTo(6.0F, 9.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */