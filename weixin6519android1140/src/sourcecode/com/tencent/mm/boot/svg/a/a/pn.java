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

public final class pn
  extends c
{
  private final int height;
  private final int width;
  
  public pn()
  {
    GMTrace.i(15933120708608L, 118711);
    this.width = 75;
    this.height = 75;
    GMTrace.o(15933120708608L, 118711);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15933254926336L, 118712);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15933254926336L, 118712);
      return 0;
      GMTrace.o(15933254926336L, 118712);
      return 75;
      GMTrace.o(15933254926336L, 118712);
      return 75;
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
      ((Paint)localObject2).setColor(-14105561);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(3.0F, 4.5F);
      ((Path)localObject3).lineTo(3.0F, 48.5F);
      ((Path)localObject3).cubicTo(3.0F, 49.328426F, 3.671573F, 50.0F, 4.5F, 50.0F);
      ((Path)localObject3).lineTo(64.5F, 50.0F);
      ((Path)localObject3).cubicTo(65.32843F, 50.0F, 66.0F, 49.328426F, 66.0F, 48.5F);
      ((Path)localObject3).lineTo(66.0F, 4.5F);
      ((Path)localObject3).cubicTo(66.0F, 3.671573F, 65.32843F, 3.0F, 64.5F, 3.0F);
      ((Path)localObject3).lineTo(4.5F, 3.0F);
      ((Path)localObject3).cubicTo(3.671573F, 3.0F, 3.0F, 3.671573F, 3.0F, 4.5F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(0.0F, 4.5F);
      ((Path)localObject3).cubicTo(-3.043592E-16F, 2.0147185F, 2.0147185F, 4.565388E-16F, 4.5F, 0.0F);
      ((Path)localObject3).lineTo(64.5F, 0.0F);
      ((Path)localObject3).cubicTo(66.98528F, -4.565388E-16F, 69.0F, 2.0147185F, 69.0F, 4.5F);
      ((Path)localObject3).lineTo(69.0F, 48.5F);
      ((Path)localObject3).cubicTo(69.0F, 50.985283F, 66.98528F, 53.0F, 64.5F, 53.0F);
      ((Path)localObject3).lineTo(4.5F, 53.0F);
      ((Path)localObject3).cubicTo(2.0147185F, 53.0F, 3.043592E-16F, 50.985283F, 0.0F, 48.5F);
      ((Path)localObject3).lineTo(0.0F, 4.5F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(3.0F, 39.1F);
      ((Path)localObject2).lineTo(2.1045086F, 41.238F);
      ((Path)localObject2).lineTo(3.0F, 40.356537F);
      ((Path)localObject2).lineTo(3.0F, 39.1F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(24.29576F, 19.394367F);
      ((Path)localObject2).lineTo(20.107151F, 19.414267F);
      ((Path)localObject2).lineTo(22.211155F, 21.446318F);
      ((Path)localObject2).lineTo(24.29576F, 19.394367F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(53.27519F, 25.504337F);
      ((Path)localObject2).lineTo(49.165787F, 25.641262F);
      ((Path)localObject2).lineTo(51.28491F, 27.506187F);
      ((Path)localObject2).lineTo(53.27519F, 25.504337F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(67.01806F, 41.35209F);
      ((Path)localObject2).lineTo(66.0F, 39.1F);
      ((Path)localObject2).lineTo(66.0F, 40.45615F);
      ((Path)localObject2).lineTo(67.01806F, 41.35209F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(3.0F, 40.356537F);
      ((Path)localObject2).lineTo(22.211155F, 21.446318F);
      ((Path)localObject2).lineTo(40.1166F, 38.73941F);
      ((Path)localObject2).lineTo(51.28491F, 27.506187F);
      ((Path)localObject2).lineTo(66.0F, 40.45615F);
      ((Path)localObject2).lineTo(66.0F, 43.37143F);
      ((Path)localObject2).lineTo(69.0F, 43.37143F);
      ((Path)localObject2).lineTo(69.0F, 39.1F);
      ((Path)localObject2).lineTo(51.147728F, 23.389174F);
      ((Path)localObject2).lineTo(40.07386F, 34.52741F);
      ((Path)localObject2).lineTo(22.19125F, 17.256369F);
      ((Path)localObject2).lineTo(0.0F, 39.1F);
      ((Path)localObject2).lineTo(0.0F, 43.37143F);
      ((Path)localObject2).lineTo(3.0F, 43.37143F);
      ((Path)localObject2).lineTo(3.0F, 40.356537F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(66.0F, 39.1F);
      ((Path)localObject2).lineTo(67.01806F, 41.35209F);
      ((Path)localObject2).lineTo(66.0F, 40.45615F);
      ((Path)localObject2).lineTo(66.0F, 39.1F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(53.27519F, 25.504337F);
      ((Path)localObject2).lineTo(49.165787F, 25.641262F);
      ((Path)localObject2).lineTo(51.28491F, 27.506187F);
      ((Path)localObject2).lineTo(53.27519F, 25.504337F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(20.107151F, 19.414267F);
      ((Path)localObject2).lineTo(24.29576F, 19.394367F);
      ((Path)localObject2).lineTo(22.211155F, 21.446318F);
      ((Path)localObject2).lineTo(20.107151F, 19.414267F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(3.0F, 39.1F);
      ((Path)localObject2).lineTo(2.1045086F, 41.238F);
      ((Path)localObject2).lineTo(3.0F, 40.356537F);
      ((Path)localObject2).lineTo(3.0F, 39.1F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(66.0F, 43.37143F);
      ((Path)localObject2).lineTo(69.0F, 43.37143F);
      ((Path)localObject2).lineTo(69.0F, 39.1F);
      ((Path)localObject2).lineTo(51.147728F, 23.389174F);
      ((Path)localObject2).lineTo(40.07386F, 34.52741F);
      ((Path)localObject2).lineTo(22.19125F, 17.256369F);
      ((Path)localObject2).lineTo(0.0F, 39.1F);
      ((Path)localObject2).lineTo(0.0F, 43.37143F);
      ((Path)localObject2).lineTo(3.0F, 43.37143F);
      ((Path)localObject2).lineTo(3.0F, 40.356537F);
      ((Path)localObject2).lineTo(22.211155F, 21.446318F);
      ((Path)localObject2).lineTo(40.1166F, 38.73941F);
      ((Path)localObject2).lineTo(51.28491F, 27.506187F);
      ((Path)localObject2).lineTo(66.0F, 40.45615F);
      ((Path)localObject2).lineTo(66.0F, 43.37143F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\pn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */