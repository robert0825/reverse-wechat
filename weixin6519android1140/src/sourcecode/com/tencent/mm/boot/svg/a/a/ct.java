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

public final class ct
  extends c
{
  private final int height;
  private final int width;
  
  public ct()
  {
    GMTrace.i(15803197947904L, 117743);
    this.width = 84;
    this.height = 80;
    GMTrace.o(15803197947904L, 117743);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15803332165632L, 117744);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15803332165632L, 117744);
      return 0;
      GMTrace.o(15803332165632L, 117744);
      return 84;
      GMTrace.o(15803332165632L, 117744);
      return 80;
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
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-13882324);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1347.0F, 0.0F, 1.0F, -215.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1250.0F, 0.0F, 1.0F, 215.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(131.0F, 51.0F);
      ((Path)localObject2).lineTo(131.0F, 64.0F);
      ((Path)localObject2).cubicTo(131.0F, 65.044205F, 132.50389F, 66.62656F, 134.0F, 66.0F);
      ((Path)localObject2).lineTo(158.0F, 66.0F);
      ((Path)localObject2).lineTo(169.0F, 76.0F);
      ((Path)localObject2).cubicTo(169.0921F, 76.41986F, 169.86208F, 76.09059F, 170.0F, 74.0F);
      ((Path)localObject2).lineTo(170.0F, 66.0F);
      ((Path)localObject2).lineTo(177.0F, 66.0F);
      ((Path)localObject2).cubicTo(178.48862F, 66.62656F, 180.0F, 65.03394F, 180.0F, 64.0F);
      ((Path)localObject2).lineTo(180.0F, 29.0F);
      ((Path)localObject2).cubicTo(180.0F, 27.582346F, 178.4798F, 26.0F, 177.0F, 26.0F);
      ((Path)localObject2).lineTo(156.0F, 26.0F);
      ((Path)localObject2).lineTo(156.0F, 46.0F);
      ((Path)localObject2).cubicTo(154.65517F, 48.362537F, 152.38159F, 50.729206F, 150.0F, 51.0F);
      ((Path)localObject2).lineTo(131.0F, 51.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(149.02345F, 4.0F);
      ((Path)localObject2).cubicTo(150.66736F, 4.0F, 152.0F, 5.334057F, 152.0F, 6.97253F);
      ((Path)localObject2).lineTo(152.0F, 44.02747F);
      ((Path)localObject2).cubicTo(152.0F, 45.66915F, 150.66797F, 47.0F, 149.02759F, 47.0F);
      ((Path)localObject2).lineTo(121.0F, 47.0F);
      ((Path)localObject2).lineTo(110.64339F, 55.630512F);
      ((Path)localObject2).cubicTo(109.73577F, 56.38686F, 109.0F, 56.041157F, 109.0F, 54.854748F);
      ((Path)localObject2).lineTo(109.0F, 47.0F);
      ((Path)localObject2).lineTo(99.96629F, 47.0F);
      ((Path)localObject2).cubicTo(98.32806F, 47.0F, 97.0F, 45.665943F, 97.0F, 44.02747F);
      ((Path)localObject2).lineTo(97.0F, 6.97253F);
      ((Path)localObject2).cubicTo(97.0F, 5.330847F, 98.332306F, 4.0F, 99.97654F, 4.0F);
      ((Path)localObject2).lineTo(149.02345F, 4.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */