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

public final class gh
  extends c
{
  private final int height;
  private final int width;
  
  public gh()
  {
    GMTrace.i(15751926775808L, 117361);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15751926775808L, 117361);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15752060993536L, 117362);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15752060993536L, 117362);
      return 0;
      GMTrace.o(15752060993536L, 117362);
      return 96;
      GMTrace.o(15752060993536L, 117362);
      return 96;
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-8617851);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 16.0F, 0.0F, 1.0F, 8.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(53.00009F, 8.0F);
      ((Path)localObject2).lineTo(45.00009F, 0.0F);
      ((Path)localObject2).lineTo(20.00009F, 0.0F);
      ((Path)localObject2).lineTo(12.000091F, 8.0F);
      ((Path)localObject2).lineTo(9.0277776E-5F, 8.0F);
      ((Path)localObject2).lineTo(9.0277776E-5F, 16.0F);
      ((Path)localObject2).lineTo(65.00009F, 16.0F);
      ((Path)localObject2).lineTo(65.00009F, 8.0F);
      ((Path)localObject2).lineTo(53.00009F, 8.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(12.000091F, 67.0F);
      ((Path)localObject2).lineTo(20.00009F, 67.0F);
      ((Path)localObject2).lineTo(20.00009F, 31.0F);
      ((Path)localObject2).lineTo(12.000091F, 31.0F);
      ((Path)localObject2).lineTo(12.000091F, 67.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(28.00009F, 67.0F);
      ((Path)localObject2).lineTo(36.00009F, 67.0F);
      ((Path)localObject2).lineTo(36.00009F, 31.0F);
      ((Path)localObject2).lineTo(28.00009F, 31.0F);
      ((Path)localObject2).lineTo(28.00009F, 67.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(45.00009F, 67.0F);
      ((Path)localObject2).lineTo(53.00009F, 67.0F);
      ((Path)localObject2).lineTo(53.00009F, 31.0F);
      ((Path)localObject2).lineTo(45.00009F, 31.0F);
      ((Path)localObject2).lineTo(45.00009F, 67.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(4.00009F, 68.0F);
      ((Path)localObject2).cubicTo(4.00009F, 74.53162F, 9.468924F, 80.0F, 16.00009F, 80.0F);
      ((Path)localObject2).lineTo(49.00009F, 80.0F);
      ((Path)localObject2).cubicTo(55.531708F, 80.0F, 61.00009F, 74.53162F, 61.00009F, 68.0F);
      ((Path)localObject2).lineTo(61.00009F, 23.0F);
      ((Path)localObject2).lineTo(4.00009F, 23.0F);
      ((Path)localObject2).lineTo(4.00009F, 68.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */