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

public final class br
  extends c
{
  private final int height;
  private final int width;
  
  public br()
  {
    GMTrace.i(15724546359296L, 117157);
    this.width = 280;
    this.height = 280;
    GMTrace.o(15724546359296L, 117157);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15724680577024L, 117158);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15724680577024L, 117158);
      return 0;
      GMTrace.o(15724680577024L, 117158);
      return 280;
      GMTrace.o(15724680577024L, 117158);
      return 280;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -10.0F, 0.0F, 1.0F, -10.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(48640);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(289.5F, 151.72223F);
      ((Path)localObject2).cubicTo(289.5F, 72.954666F, 227.04533F, 10.5F, 148.27777F, 10.5F);
      ((Path)localObject2).cubicTo(72.954666F, 10.5F, 10.5F, 72.954666F, 10.5F, 151.72223F);
      ((Path)localObject2).cubicTo(10.5F, 227.04533F, 72.954666F, 289.5F, 148.27777F, 289.5F);
      ((Path)localObject2).cubicTo(227.04533F, 289.5F, 289.5F, 227.04533F, 289.5F, 151.72223F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(141.49457F, 85.5F);
      ((Path)localObject1).cubicTo(140.39299F, 85.5F, 139.53296F, 86.39243F, 139.57391F, 87.50098F);
      ((Path)localObject1).lineTo(142.96306F, 179.25606F);
      ((Path)localObject1).cubicTo(142.98346F, 179.80836F, 143.44995F, 180.2561F, 144.00685F, 180.2561F);
      ((Path)localObject1).lineTo(155.99315F, 180.2561F);
      ((Path)localObject1).cubicTo(156.54922F, 180.2561F, 157.01639F, 179.81255F, 157.03694F, 179.25606F);
      ((Path)localObject1).lineTo(160.42609F, 87.50098F);
      ((Path)localObject1).cubicTo(160.4669F, 86.39587F, 159.59766F, 85.5F, 158.50543F, 85.5F);
      ((Path)localObject1).lineTo(141.49457F, 85.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(150.0F, 214.5F);
      ((Path)localObject1).cubicTo(155.799F, 214.5F, 160.5F, 209.799F, 160.5F, 204.0F);
      ((Path)localObject1).cubicTo(160.5F, 198.201F, 155.799F, 193.5F, 150.0F, 193.5F);
      ((Path)localObject1).cubicTo(144.201F, 193.5F, 139.5F, 198.201F, 139.5F, 204.0F);
      ((Path)localObject1).cubicTo(139.5F, 209.799F, 144.201F, 214.5F, 150.0F, 214.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */