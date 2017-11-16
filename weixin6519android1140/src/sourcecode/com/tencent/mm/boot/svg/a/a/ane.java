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

public final class ane
  extends c
{
  private final int height;
  private final int width;
  
  public ane()
  {
    GMTrace.i(15882923278336L, 118337);
    this.width = 84;
    this.height = 67;
    GMTrace.o(15882923278336L, 118337);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15883057496064L, 118338);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15883057496064L, 118338);
      return 0;
      GMTrace.o(15883057496064L, 118338);
      return 84;
      GMTrace.o(15883057496064L, 118338);
      return 67;
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 16.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-9538696);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(66.83F, 3.1693F);
      ((Path)localObject2).cubicTo(66.65F, 2.9883F, 66.452F, 2.8253F, 66.239F, 2.6813F);
      ((Path)localObject2).cubicTo(65.814F, 2.3943F, 65.331F, 2.1873F, 64.811F, 2.0813F);
      ((Path)localObject2).cubicTo(64.551F, 2.0283F, 64.282F, 2.0003F, 64.006F, 2.0003F);
      ((Path)localObject2).lineTo(19.994F, 2.0003F);
      ((Path)localObject2).cubicTo(19.443F, 2.0003F, 18.918F, 2.1123F, 18.44F, 2.3143F);
      ((Path)localObject2).cubicTo(17.007F, 2.9213F, 16.0F, 4.3433F, 16.0F, 6.0003F);
      ((Path)localObject2).lineTo(16.0F, 60.9993F);
      ((Path)localObject2).cubicTo(16.0F, 63.2163F, 17.788F, 65.0003F, 19.994F, 65.0003F);
      ((Path)localObject2).lineTo(64.006F, 65.0003F);
      ((Path)localObject2).cubicTo(66.21F, 65.0003F, 68.0F, 63.2093F, 68.0F, 60.9993F);
      ((Path)localObject2).lineTo(68.0F, 6.0003F);
      ((Path)localObject2).cubicTo(68.0F, 4.8923F, 67.553F, 3.8923F, 66.83F, 3.1693F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(65.0F, 60.9993F);
      ((Path)localObject2).cubicTo(65.0F, 61.5513F, 64.554F, 62.0003F, 64.006F, 62.0003F);
      ((Path)localObject2).lineTo(19.994F, 62.0003F);
      ((Path)localObject2).cubicTo(19.446F, 62.0003F, 19.0F, 61.5513F, 19.0F, 60.9993F);
      ((Path)localObject2).lineTo(19.0F, 6.0003F);
      ((Path)localObject2).cubicTo(19.0F, 5.5093F, 19.329F, 5.1963F, 19.611F, 5.0763F);
      ((Path)localObject2).cubicTo(19.731F, 5.0253F, 19.86F, 5.0003F, 19.994F, 5.0003F);
      ((Path)localObject2).lineTo(64.006F, 5.0003F);
      ((Path)localObject2).cubicTo(64.076F, 5.0003F, 64.145F, 5.0073F, 64.211F, 5.0203F);
      ((Path)localObject2).cubicTo(64.336F, 5.0463F, 64.453F, 5.0953F, 64.56F, 5.1673F);
      ((Path)localObject2).cubicTo(64.613F, 5.2033F, 64.663F, 5.2443F, 64.708F, 5.2903F);
      ((Path)localObject2).cubicTo(64.841F, 5.4233F, 65.0F, 5.6543F, 65.0F, 6.0003F);
      ((Path)localObject2).lineTo(65.0F, 60.9993F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(27.0F, 12.0F);
      ((Path)localObject2).cubicTo(25.3425F, 12.0F, 24.0F, 13.3425F, 24.0F, 15.0F);
      ((Path)localObject2).cubicTo(24.0F, 16.6575F, 25.3425F, 18.0F, 27.0F, 18.0F);
      ((Path)localObject2).cubicTo(28.6575F, 18.0F, 30.0F, 16.6575F, 30.0F, 15.0F);
      ((Path)localObject2).cubicTo(30.0F, 13.3425F, 28.6575F, 12.0F, 27.0F, 12.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(24.0F, 42.0F);
      ((Path)localObject2).lineTo(39.0F, 42.0F);
      ((Path)localObject2).lineTo(39.0F, 45.0F);
      ((Path)localObject2).lineTo(24.0F, 45.0F);
      ((Path)localObject2).lineTo(24.0F, 42.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(24.0F, 33.0F);
      ((Path)localObject2).lineTo(39.0F, 33.0F);
      ((Path)localObject2).lineTo(39.0F, 36.0F);
      ((Path)localObject2).lineTo(24.0F, 36.0F);
      ((Path)localObject2).lineTo(24.0F, 33.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(24.0F, 24.0F);
      ((Path)localObject2).lineTo(51.0F, 24.0F);
      ((Path)localObject2).lineTo(51.0F, 27.0F);
      ((Path)localObject2).lineTo(24.0F, 27.0F);
      ((Path)localObject2).lineTo(24.0F, 24.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ane.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */