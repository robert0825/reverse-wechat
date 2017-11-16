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

public final class di
  extends c
{
  private final int height;
  private final int width;
  
  public di()
  {
    GMTrace.i(17573395562496L, 130932);
    this.width = 72;
    this.height = 75;
    GMTrace.o(17573395562496L, 130932);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17573529780224L, 130933);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17573529780224L, 130933);
      return 0;
      GMTrace.o(17573529780224L, 130933);
      return 72;
      GMTrace.o(17573529780224L, 130933);
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
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -482.0F, 0.0F, 1.0F, -537.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 482.0F, 0.0F, 1.0F, 537.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(29.0F, 26.032377F);
      ((Path)localObject3).lineTo(4.2026215F, 1.2349988F);
      ((Path)localObject3).cubicTo(3.2408514F, 0.2732287F, 1.6913689F, 0.2762538F, 0.7338114F, 1.2338114F);
      ((Path)localObject3).cubicTo(-0.23042212F, 2.1980448F, -0.22321457F, 3.7444081F, 0.7349988F, 4.7026215F);
      ((Path)localObject3).lineTo(25.532377F, 29.5F);
      ((Path)localObject3).lineTo(5.754876F, 29.5F);
      ((Path)localObject3).cubicTo(4.4981537F, 29.5F, 3.5F, 30.507359F, 3.5F, 31.75F);
      ((Path)localObject3).cubicTo(3.5F, 33.001305F, 4.5095425F, 34.0F, 5.754876F, 34.0F);
      ((Path)localObject3).lineTo(31.245125F, 34.0F);
      ((Path)localObject3).cubicTo(31.245937F, 34.0F, 31.24675F, 34.0F, 31.247562F, 34.0F);
      ((Path)localObject3).cubicTo(31.248375F, 34.0F, 31.249187F, 34.0F, 31.25F, 34.0F);
      ((Path)localObject3).cubicTo(31.874836F, 34.0F, 32.436684F, 33.748272F, 32.842648F, 33.34116F);
      ((Path)localObject3).cubicTo(33.251106F, 32.932365F, 33.5F, 32.370518F, 33.5F, 31.75F);
      ((Path)localObject3).cubicTo(33.5F, 31.749187F, 33.5F, 31.748375F, 33.5F, 31.747562F);
      ((Path)localObject3).cubicTo(33.5F, 31.74675F, 33.5F, 31.745937F, 33.5F, 31.745125F);
      ((Path)localObject3).lineTo(33.5F, 6.254876F);
      ((Path)localObject3).cubicTo(33.5F, 4.9981537F, 32.49264F, 4.0F, 31.25F, 4.0F);
      ((Path)localObject3).cubicTo(29.998695F, 4.0F, 29.0F, 5.0095425F, 29.0F, 6.254876F);
      ((Path)localObject3).lineTo(29.0F, 26.032377F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(44.0F, 49.468422F);
      ((Path)localObject2).lineTo(67.828835F, 73.29726F);
      ((Path)localObject2).cubicTo(68.79079F, 74.25921F, 70.34059F, 74.25615F, 71.29837F, 73.29837F);
      ((Path)localObject2).cubicTo(72.262825F, 72.333916F, 72.25565F, 70.787224F, 71.29726F, 69.828835F);
      ((Path)localObject2).lineTo(47.468422F, 46.0F);
      ((Path)localObject2).lineTo(67.245125F, 46.0F);
      ((Path)localObject2).cubicTo(68.50185F, 46.0F, 69.5F, 44.99264F, 69.5F, 43.75F);
      ((Path)localObject2).cubicTo(69.5F, 42.498695F, 68.490456F, 41.5F, 67.245125F, 41.5F);
      ((Path)localObject2).lineTo(41.754875F, 41.5F);
      ((Path)localObject2).cubicTo(41.754063F, 41.5F, 41.75325F, 41.5F, 41.752438F, 41.5F);
      ((Path)localObject2).cubicTo(41.751625F, 41.5F, 41.750813F, 41.5F, 41.75F, 41.5F);
      ((Path)localObject2).cubicTo(41.129482F, 41.5F, 40.567635F, 41.748894F, 40.16059F, 42.15459F);
      ((Path)localObject2).cubicTo(39.748894F, 42.567635F, 39.5F, 43.129482F, 39.5F, 43.75F);
      ((Path)localObject2).cubicTo(39.5F, 43.750813F, 39.5F, 43.751625F, 39.5F, 43.752438F);
      ((Path)localObject2).cubicTo(39.5F, 43.75325F, 39.5F, 43.754063F, 39.5F, 43.754875F);
      ((Path)localObject2).lineTo(39.5F, 69.245125F);
      ((Path)localObject2).cubicTo(39.5F, 70.490456F, 40.498695F, 71.5F, 41.75F, 71.5F);
      ((Path)localObject2).cubicTo(42.99264F, 71.5F, 44.0F, 70.50185F, 44.0F, 69.245125F);
      ((Path)localObject2).lineTo(44.0F, 49.468422F);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */