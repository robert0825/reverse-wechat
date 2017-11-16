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

public final class aga
  extends c
{
  private final int height;
  private final int width;
  
  public aga()
  {
    GMTrace.i(15838362992640L, 118005);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15838362992640L, 118005);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15838497210368L, 118006);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15838497210368L, 118006);
      return 0;
      GMTrace.o(15838497210368L, 118006);
      return 96;
      GMTrace.o(15838497210368L, 118006);
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-5592406);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 18.0F, 0.0F, 1.0F, 18.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(3.35F, 12.4F);
      ((Path)localObject2).cubicTo(7.25F, 5.36F, 14.93F, 0.63F, 22.96F, 0.27F);
      ((Path)localObject2).cubicTo(31.48F, -0.27F, 40.05F, 4.2F, 44.53F, 11.46F);
      ((Path)localObject2).cubicTo(49.92F, 19.74F, 49.24F, 31.19F, 43.22F, 38.97F);
      ((Path)localObject2).cubicTo(48.42F, 44.2F, 53.65F, 49.4F, 58.86F, 54.62F);
      ((Path)localObject2).cubicTo(57.46F, 56.07F, 56.03F, 57.5F, 54.53F, 58.84F);
      ((Path)localObject2).cubicTo(49.4F, 53.57F, 44.14F, 48.41F, 38.95F, 43.2F);
      ((Path)localObject2).cubicTo(34.16F, 46.84F, 28.05F, 48.71F, 22.04F, 48.11F);
      ((Path)localObject2).cubicTo(13.48F, 47.41F, 5.55F, 41.7F, 2.22F, 33.77F);
      ((Path)localObject2).cubicTo(-0.77F, 26.99F, -0.35F, 18.82F, 3.35F, 12.4F);
      ((Path)localObject2).lineTo(3.35F, 12.4F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(22.25F, 6.34F);
      ((Path)localObject2).cubicTo(12.73F, 7.14F, 5.11F, 16.55F, 6.33F, 26.04F);
      ((Path)localObject2).cubicTo(7.03F, 35.6F, 16.43F, 43.3F, 25.94F, 42.13F);
      ((Path)localObject2).cubicTo(35.7F, 41.45F, 43.55F, 31.72F, 42.08F, 22.03F);
      ((Path)localObject2).cubicTo(41.15F, 12.55F, 31.71F, 5.05F, 22.25F, 6.34F);
      ((Path)localObject2).lineTo(22.25F, 6.34F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */