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

public final class zk
  extends c
{
  private final int height;
  private final int width;
  
  public zk()
  {
    GMTrace.i(15916746145792L, 118589);
    this.width = 96;
    this.height = 84;
    GMTrace.o(15916746145792L, 118589);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15916880363520L, 118590);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15916880363520L, 118590);
      return 0;
      GMTrace.o(15916880363520L, 118590);
      return 96;
      GMTrace.o(15916880363520L, 118590);
      return 84;
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
      ((Paint)localObject2).setColor(-12206054);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 14.0F, 0.0F, 1.0F, 8.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(31.552F, 0.089F);
      ((Path)localObject3).cubicTo(36.477F, -0.264F, 41.481F, 0.453F, 46.096F, 2.217F);
      ((Path)localObject3).cubicTo(52.452F, 4.625F, 58.037F, 9.004F, 61.913F, 14.586F);
      ((Path)localObject3).cubicTo(63.992F, 17.566F, 65.588F, 20.883F, 66.615F, 24.369F);
      ((Path)localObject3).cubicTo(68.773F, 31.659F, 68.4F, 39.674F, 65.539F, 46.72F);
      ((Path)localObject3).cubicTo(63.273F, 52.354F, 59.455F, 57.347F, 54.627F, 61.029F);
      ((Path)localObject3).cubicTo(49.385F, 65.052F, 42.943F, 67.485F, 36.348F, 67.918F);
      ((Path)localObject3).cubicTo(31.984F, 68.218F, 27.561F, 67.681F, 23.404F, 66.314F);
      ((Path)localObject3).cubicTo(17.003F, 64.229F, 11.27F, 60.173F, 7.147F, 54.854F);
      ((Path)localObject3).cubicTo(4.738F, 51.759F, 2.868F, 48.244F, 1.658F, 44.512F);
      ((Path)localObject3).cubicTo(0.025F, 39.504F, -0.4F, 34.114F, 0.381F, 28.907F);
      ((Path)localObject3).cubicTo(1.448F, 21.662F, 4.972F, 14.819F, 10.213F, 9.709F);
      ((Path)localObject3).cubicTo(15.02F, 4.983F, 21.263F, 1.734F, 27.902F, 0.548F);
      ((Path)localObject3).cubicTo(29.109F, 0.329F, 30.328F, 0.176F, 31.552F, 0.089F);
      ((Path)localObject3).lineTo(31.552F, 0.089F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(30.439F, 26.843F);
      ((Path)localObject3).cubicTo(28.893F, 27.609F, 27.609F, 28.891F, 26.842F, 30.437F);
      ((Path)localObject3).cubicTo(23.199F, 37.657F, 19.553F, 44.875F, 15.911F, 52.096F);
      ((Path)localObject3).cubicTo(23.174F, 48.431F, 30.436F, 44.765F, 37.699F, 41.1F);
      ((Path)localObject3).cubicTo(39.147F, 40.347F, 40.354F, 39.139F, 41.103F, 37.688F);
      ((Path)localObject3).cubicTo(44.772F, 30.427F, 48.437F, 23.165F, 52.104F, 15.904F);
      ((Path)localObject3).cubicTo(44.882F, 19.55F, 37.66F, 23.195F, 30.439F, 26.843F);
      ((Path)localObject3).lineTo(30.439F, 26.843F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(33.346F, 31.079F);
      ((Path)localObject2).cubicTo(34.928F, 30.679F, 36.668F, 31.815F, 36.943F, 33.421F);
      ((Path)localObject2).cubicTo(37.306F, 35.014F, 36.122F, 36.729F, 34.507F, 36.961F);
      ((Path)localObject2).cubicTo(32.928F, 37.277F, 31.267F, 36.087F, 31.044F, 34.497F);
      ((Path)localObject2).cubicTo(30.753F, 32.98F, 31.835F, 31.384F, 33.346F, 31.079F);
      ((Path)localObject2).lineTo(33.346F, 31.079F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */