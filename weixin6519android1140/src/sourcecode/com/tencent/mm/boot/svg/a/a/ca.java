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

public final class ca
  extends c
{
  private final int height;
  private final int width;
  
  public ca()
  {
    GMTrace.i(15845073879040L, 118055);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15845073879040L, 118055);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15845208096768L, 118056);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15845208096768L, 118056);
      return 0;
      GMTrace.o(15845208096768L, 118056);
      return 96;
      GMTrace.o(15845208096768L, 118056);
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
      ((Paint)localObject2).setColor(-9473160);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 15.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(33.0F, 66.0F);
      ((Path)localObject3).cubicTo(51.225395F, 66.0F, 66.0F, 51.225395F, 66.0F, 33.0F);
      ((Path)localObject3).cubicTo(66.0F, 14.774603F, 51.225395F, 0.0F, 33.0F, 0.0F);
      ((Path)localObject3).cubicTo(14.774603F, 0.0F, 0.0F, 14.774603F, 0.0F, 33.0F);
      ((Path)localObject3).cubicTo(0.0F, 51.225395F, 14.774603F, 66.0F, 33.0F, 66.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(33.0F, 63.0F);
      ((Path)localObject3).cubicTo(49.568542F, 63.0F, 63.0F, 49.568542F, 63.0F, 33.0F);
      ((Path)localObject3).cubicTo(63.0F, 16.431458F, 49.568542F, 3.0F, 33.0F, 3.0F);
      ((Path)localObject3).cubicTo(16.431458F, 3.0F, 3.0F, 16.431458F, 3.0F, 33.0F);
      ((Path)localObject3).cubicTo(3.0F, 49.568542F, 16.431458F, 63.0F, 33.0F, 63.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(25.401F, 47.627F);
      ((Path)localObject2).cubicTo(20.217F, 47.627F, 16.0F, 44.08F, 16.0F, 39.72F);
      ((Path)localObject2).cubicTo(16.0F, 35.36F, 20.217F, 31.814F, 25.401F, 31.814F);
      ((Path)localObject2).cubicTo(26.23F, 31.814F, 26.901F, 32.485F, 26.901F, 33.314F);
      ((Path)localObject2).cubicTo(26.901F, 34.142F, 26.23F, 34.814F, 25.401F, 34.814F);
      ((Path)localObject2).cubicTo(21.871F, 34.814F, 19.0F, 37.015F, 19.0F, 39.72F);
      ((Path)localObject2).cubicTo(19.0F, 42.426F, 21.871F, 44.627F, 25.401F, 44.627F);
      ((Path)localObject2).cubicTo(28.931F, 44.627F, 31.802F, 42.426F, 31.802F, 39.72F);
      ((Path)localObject2).lineTo(31.802F, 26.907F);
      ((Path)localObject2).cubicTo(31.802F, 22.547F, 36.02F, 19.0F, 41.204F, 19.0F);
      ((Path)localObject2).cubicTo(46.388F, 19.0F, 50.605F, 22.547F, 50.605F, 26.907F);
      ((Path)localObject2).cubicTo(50.605F, 31.267F, 46.388F, 34.814F, 41.204F, 34.814F);
      ((Path)localObject2).cubicTo(40.375F, 34.814F, 39.704F, 34.142F, 39.704F, 33.314F);
      ((Path)localObject2).cubicTo(39.704F, 32.485F, 40.375F, 31.814F, 41.204F, 31.814F);
      ((Path)localObject2).cubicTo(44.734F, 31.814F, 47.605F, 29.612F, 47.605F, 26.907F);
      ((Path)localObject2).cubicTo(47.605F, 24.201F, 44.734F, 22.0F, 41.204F, 22.0F);
      ((Path)localObject2).cubicTo(37.674F, 22.0F, 34.802F, 24.201F, 34.802F, 26.907F);
      ((Path)localObject2).lineTo(34.802F, 39.72F);
      ((Path)localObject2).cubicTo(34.802F, 44.08F, 30.585F, 47.627F, 25.401F, 47.627F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */