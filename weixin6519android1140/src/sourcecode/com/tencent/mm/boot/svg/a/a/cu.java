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

public final class cu
  extends c
{
  private final int height;
  private final int width;
  
  public cu()
  {
    GMTrace.i(15796755496960L, 117695);
    this.width = 84;
    this.height = 80;
    GMTrace.o(15796755496960L, 117695);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15796889714688L, 117696);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15796889714688L, 117696);
      return 0;
      GMTrace.o(15796889714688L, 117696);
      return 84;
      GMTrace.o(15796889714688L, 117696);
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
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1250.0F, 0.0F, 1.0F, -215.0F);
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
      ((Path)localObject2).moveTo(34.0F, 51.0F);
      ((Path)localObject2).lineTo(34.0F, 64.0F);
      ((Path)localObject2).cubicTo(34.0F, 65.044205F, 35.50389F, 66.62656F, 37.0F, 66.0F);
      ((Path)localObject2).lineTo(61.0F, 66.0F);
      ((Path)localObject2).lineTo(72.0F, 76.0F);
      ((Path)localObject2).cubicTo(72.0921F, 76.41986F, 72.86207F, 76.09059F, 73.0F, 74.0F);
      ((Path)localObject2).lineTo(73.0F, 66.0F);
      ((Path)localObject2).lineTo(80.0F, 66.0F);
      ((Path)localObject2).cubicTo(81.48861F, 66.62656F, 83.0F, 65.03394F, 83.0F, 64.0F);
      ((Path)localObject2).lineTo(83.0F, 29.0F);
      ((Path)localObject2).cubicTo(83.0F, 27.582346F, 81.4798F, 26.0F, 80.0F, 26.0F);
      ((Path)localObject2).lineTo(59.0F, 26.0F);
      ((Path)localObject2).lineTo(59.0F, 46.0F);
      ((Path)localObject2).cubicTo(57.655174F, 48.362537F, 55.381588F, 50.729206F, 53.0F, 51.0F);
      ((Path)localObject2).lineTo(34.0F, 51.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(52.02346F, 4.0F);
      ((Path)localObject2).cubicTo(53.66736F, 4.0F, 55.0F, 5.334057F, 55.0F, 6.97253F);
      ((Path)localObject2).lineTo(55.0F, 44.02747F);
      ((Path)localObject2).cubicTo(55.0F, 45.66915F, 53.66797F, 47.0F, 52.027588F, 47.0F);
      ((Path)localObject2).lineTo(24.0F, 47.0F);
      ((Path)localObject2).lineTo(13.643388F, 55.630512F);
      ((Path)localObject2).cubicTo(12.735769F, 56.38686F, 12.0F, 56.041157F, 12.0F, 54.854748F);
      ((Path)localObject2).lineTo(12.0F, 47.0F);
      ((Path)localObject2).lineTo(2.9662929F, 47.0F);
      ((Path)localObject2).cubicTo(1.3280545F, 47.0F, 0.0F, 45.665943F, 0.0F, 44.02747F);
      ((Path)localObject2).lineTo(0.0F, 6.97253F);
      ((Path)localObject2).cubicTo(0.0F, 5.330847F, 1.332306F, 4.0F, 2.97654F, 4.0F);
      ((Path)localObject2).lineTo(52.02346F, 4.0F);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */