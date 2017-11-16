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

public final class aip
  extends c
{
  private final int height;
  private final int width;
  
  public aip()
  {
    GMTrace.i(17569369030656L, 130902);
    this.width = 42;
    this.height = 42;
    GMTrace.o(17569369030656L, 130902);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17569503248384L, 130903);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17569503248384L, 130903);
      return 0;
      GMTrace.o(17569503248384L, 130903);
      return 42;
      GMTrace.o(17569503248384L, 130903);
      return 42;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject2 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 4.307692F, 0.0F, 1.0F, 2.076923F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-4210753);
      ((Paint)localObject2).setStrokeWidth(2.3F);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 1.6488063F);
      ((Path)localObject3).cubicTo(0.0F, 0.7381957F, 0.7381957F, 0.0F, 1.6488063F, 0.0F);
      ((Path)localObject3).lineTo(30.658888F, 0.0F);
      ((Path)localObject3).cubicTo(31.569498F, 0.0F, 32.307693F, 0.7381957F, 32.307693F, 1.6488063F);
      ((Path)localObject3).lineTo(32.307693F, 36.351192F);
      ((Path)localObject3).cubicTo(32.307693F, 37.261803F, 31.569498F, 38.0F, 30.658888F, 38.0F);
      ((Path)localObject3).lineTo(1.6488063F, 38.0F);
      ((Path)localObject3).cubicTo(0.7381957F, 38.0F, 0.0F, 37.261803F, 0.0F, 36.351192F);
      ((Path)localObject3).lineTo(0.0F, 1.6488063F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-4737097);
      ((Paint)localObject3).setColor(-4737097);
      ((Paint)localObject3).setStrokeWidth(0.6F);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(4.0384617F, 14.942307F);
      localPath.lineTo(21.0F, 14.942307F);
      localPath.lineTo(21.0F, 16.602564F);
      localPath.lineTo(4.0384617F, 16.602564F);
      localPath.lineTo(4.0384617F, 14.942307F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-4737097);
      ((Paint)localObject3).setColor(-4737097);
      ((Paint)localObject3).setStrokeWidth(0.6F);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(4.0384617F, 19.923077F);
      localPath.lineTo(12.923077F, 19.923077F);
      localPath.lineTo(12.923077F, 21.583332F);
      localPath.lineTo(4.0384617F, 21.583332F);
      localPath.lineTo(4.0384617F, 19.923077F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-4737097);
      ((Paint)localObject1).setColor(-4737097);
      ((Paint)localObject1).setStrokeWidth(0.6F);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(4.0384617F, 24.903847F);
      ((Path)localObject3).lineTo(14.538462F, 24.903847F);
      ((Path)localObject3).lineTo(14.538462F, 26.564102F);
      ((Path)localObject3).lineTo(4.0384617F, 26.564102F);
      ((Path)localObject3).lineTo(4.0384617F, 24.903847F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-4737097);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(6.3695426F, 6.0F);
      ((Path)localObject1).cubicTo(7.6569633F, 6.0F, 8.7006235F, 7.072651F, 8.7006235F, 8.395833F);
      ((Path)localObject1).cubicTo(8.7006235F, 9.719015F, 7.6569633F, 10.791666F, 6.3695426F, 10.791666F);
      ((Path)localObject1).cubicTo(5.082122F, 10.791666F, 4.0384617F, 9.719015F, 4.0384617F, 8.395833F);
      ((Path)localObject1).cubicTo(4.0384617F, 7.072651F, 5.082122F, 6.0F, 6.3695426F, 6.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */