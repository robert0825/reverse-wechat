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

public final class alh
  extends c
{
  private final int height;
  private final int width;
  
  public alh()
  {
    GMTrace.i(15889365729280L, 118385);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15889365729280L, 118385);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15889499947008L, 118386);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15889499947008L, 118386);
      return 0;
      GMTrace.o(15889499947008L, 118386);
      return 96;
      GMTrace.o(15889499947008L, 118386);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
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
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-11286452);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(45.0F, 3.0F);
      ((Path)localObject3).lineTo(45.0F, 59.0F);
      ((Path)localObject3).lineTo(9.0F, 59.0F);
      ((Path)localObject3).lineTo(9.0F, 3.0F);
      ((Path)localObject3).lineTo(45.0F, 3.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(42.0F, 6.0F);
      ((Path)localObject3).lineTo(42.0F, 53.0F);
      ((Path)localObject3).lineTo(12.0F, 53.0F);
      ((Path)localObject3).lineTo(12.0F, 6.0F);
      ((Path)localObject3).lineTo(42.0F, 6.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(27.0F, 59.0F);
      ((Path)localObject3).cubicTo(28.10457F, 59.0F, 29.0F, 58.10457F, 29.0F, 57.0F);
      ((Path)localObject3).cubicTo(29.0F, 55.89543F, 28.10457F, 55.0F, 27.0F, 55.0F);
      ((Path)localObject3).cubicTo(25.89543F, 55.0F, 25.0F, 55.89543F, 25.0F, 57.0F);
      ((Path)localObject3).cubicTo(25.0F, 58.10457F, 25.89543F, 59.0F, 27.0F, 59.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(44.321014F, 3.0F);
      ((Path)localObject2).cubicTo(42.295044F, 1.3283027F, 35.97658F, 0.20756736F, 28.648415F, 0.025989328F);
      ((Path)localObject2).cubicTo(27.95361F, 0.008773398F, 27.24973F, 0.0F, 26.53957F, 0.0F);
      ((Path)localObject2).cubicTo(18.339287F, 0.0F, 10.921131F, 1.1698043F, 8.684801F, 3.0F);
      ((Path)localObject2).lineTo(44.321014F, 3.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(44.321014F, 59.0F);
      ((Path)localObject2).cubicTo(42.295044F, 60.671696F, 35.97658F, 61.79243F, 28.648415F, 61.97401F);
      ((Path)localObject2).cubicTo(27.95361F, 61.991226F, 27.24973F, 62.0F, 26.53957F, 62.0F);
      ((Path)localObject2).cubicTo(18.339287F, 62.0F, 10.921131F, 60.830196F, 8.684801F, 59.0F);
      ((Path)localObject2).lineTo(44.321014F, 59.0F);
      ((Path)localObject2).lineTo(44.321014F, 59.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\alh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */