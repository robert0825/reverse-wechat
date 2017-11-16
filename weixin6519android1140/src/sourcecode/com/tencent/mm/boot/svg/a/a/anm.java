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

public final class anm
  extends c
{
  private final int height;
  private final int width;
  
  public anm()
  {
    GMTrace.i(15736894390272L, 117249);
    this.width = 72;
    this.height = 72;
    GMTrace.o(15736894390272L, 117249);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15737028608000L, 117250);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15737028608000L, 117250);
      return 0;
      GMTrace.o(15737028608000L, 117250);
      return 72;
      GMTrace.o(15737028608000L, 117250);
      return 72;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 4.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 31.994999F);
      ((Path)localObject2).cubicTo(10.501568F, 21.323332F, 21.023138F, 10.661666F, 31.534706F, 0.0F);
      ((Path)localObject2).cubicTo(33.36498F, 1.830286F, 35.185253F, 3.6805751F, 36.99552F, 5.5308642F);
      ((Path)localObject2).cubicTo(29.674429F, 13.022035F, 22.323332F, 20.493202F, 15.002239F, 27.994373F);
      ((Path)localObject2).lineTo(67.0F, 27.994373F);
      ((Path)localObject2).lineTo(67.0F, 35.995625F);
      ((Path)localObject2).cubicTo(49.66741F, 35.995625F, 32.334827F, 35.985622F, 15.002239F, 36.005627F);
      ((Path)localObject2).cubicTo(22.333334F, 43.486794F, 29.664427F, 50.967964F, 37.005524F, 58.44913F);
      ((Path)localObject2).cubicTo(35.185253F, 60.299423F, 33.36498F, 62.14971F, 31.534706F, 64.0F);
      ((Path)localObject2).cubicTo(21.023138F, 53.32833F, 10.501568F, 42.666668F, 0.0F, 31.994999F);
      ((Path)localObject2).lineTo(0.0F, 31.994999F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\anm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */