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

public final class ajt
  extends c
{
  private final int height;
  private final int width;
  
  public ajt()
  {
    GMTrace.i(15750047727616L, 117347);
    this.width = 80;
    this.height = 80;
    GMTrace.o(15750047727616L, 117347);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15750181945344L, 117348);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15750181945344L, 117348);
      return 0;
      GMTrace.o(15750181945344L, 117348);
      return 80;
      GMTrace.o(15750181945344L, 117348);
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
      localObject2 = c.a((float[])localObject2, 1.3333334F, 0.0F, 0.0F, 0.0F, 1.3333334F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-6626030);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(36.83F, 10.18F);
      ((Path)localObject2).cubicTo(38.71F, 8.29F, 40.59F, 6.41F, 42.48F, 4.54F);
      ((Path)localObject2).cubicTo(53.62F, 15.45F, 56.31F, 33.8F, 48.53F, 47.35F);
      ((Path)localObject2).cubicTo(46.75F, 50.69F, 44.3F, 53.6F, 41.66F, 56.28F);
      ((Path)localObject2).cubicTo(39.84F, 54.34F, 38.0F, 52.42F, 36.19F, 50.48F);
      ((Path)localObject2).cubicTo(41.15F, 45.64F, 44.46F, 39.07F, 44.9F, 32.11F);
      ((Path)localObject2).cubicTo(45.62F, 24.06F, 42.44F, 15.94F, 36.83F, 10.18F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-6626030);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(29.09F, 17.92F);
      ((Path)localObject2).cubicTo(30.73F, 16.27F, 32.37F, 14.63F, 34.02F, 12.99F);
      ((Path)localObject2).cubicTo(39.1F, 18.26F, 41.84F, 25.78F, 40.78F, 33.09F);
      ((Path)localObject2).cubicTo(40.19F, 38.61F, 37.33F, 43.62F, 33.49F, 47.54F);
      ((Path)localObject2).cubicTo(31.88F, 45.86F, 30.27F, 44.18F, 28.68F, 42.48F);
      ((Path)localObject2).cubicTo(35.5F, 36.1F, 35.71F, 24.52F, 29.09F, 17.92F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-6626030);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(13.42F, 19.61F);
      ((Path)localObject1).cubicTo(19.82F, 17.14F, 27.45F, 22.12F, 27.94F, 28.9F);
      ((Path)localObject1).cubicTo(28.83F, 35.53F, 22.57F, 41.8F, 15.94F, 40.95F);
      ((Path)localObject1).cubicTo(9.72F, 40.5F, 4.88F, 34.08F, 6.19F, 27.96F);
      ((Path)localObject1).cubicTo(6.92F, 24.17F, 9.75F, 20.85F, 13.42F, 19.61F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ajt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */