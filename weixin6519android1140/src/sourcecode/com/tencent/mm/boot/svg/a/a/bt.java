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

public final class bt
  extends c
{
  private final int height;
  private final int width;
  
  public bt()
  {
    GMTrace.i(15704413700096L, 117007);
    this.width = 68;
    this.height = 61;
    GMTrace.o(15704413700096L, 117007);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15704547917824L, 117008);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15704547917824L, 117008);
      return 0;
      GMTrace.o(15704547917824L, 117008);
      return 68;
      GMTrace.o(15704547917824L, 117008);
      return 61;
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
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -296.0F, 0.0F, 1.0F, -485.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 295.0F, 0.0F, 1.0F, 485.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(53.0F, 31.0F);
      ((Path)localObject3).lineTo(59.0F, 31.0F);
      ((Path)localObject3).lineTo(38.0F, 9.956522F);
      ((Path)localObject3).lineTo(36.0F, 8.043478F);
      ((Path)localObject3).lineTo(12.0F, 31.0F);
      ((Path)localObject3).lineTo(17.0F, 31.0F);
      ((Path)localObject3).lineTo(17.0F, 55.04348F);
      ((Path)localObject3).lineTo(53.0F, 55.04348F);
      ((Path)localObject3).lineTo(53.0F, 31.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(59.0F, 37.0F);
      ((Path)localObject3).lineTo(59.0F, 59.001785F);
      ((Path)localObject3).cubicTo(59.0F, 60.10537F, 58.10506F, 61.0F, 56.99861F, 61.0F);
      ((Path)localObject3).lineTo(13.0013895F, 61.0F);
      ((Path)localObject3).cubicTo(11.896052F, 61.0F, 11.0F, 60.105663F, 11.0F, 59.001785F);
      ((Path)localObject3).lineTo(11.0F, 37.0F);
      ((Path)localObject3).lineTo(3.993048F, 37.0F);
      ((Path)localObject3).cubicTo(0.68317896F, 37.0F, -0.102572955F, 35.102573F, 2.2484722F, 32.75153F);
      ((Path)localObject3).lineTo(33.17487F, 1.825131F);
      ((Path)localObject3).cubicTo(34.735146F, 0.26485425F, 37.228786F, 0.29705298F, 38.750225F, 1.9030144F);
      ((Path)localObject3).lineTo(67.870346F, 32.640915F);
      ((Path)localObject3).cubicTo(70.15109F, 35.04837F, 69.322586F, 37.0F, 66.00695F, 37.0F);
      ((Path)localObject3).lineTo(59.0F, 37.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(40.0F, 42.0F);
      ((Path)localObject2).lineTo(40.0F, 58.0F);
      ((Path)localObject2).lineTo(30.0F, 58.0F);
      ((Path)localObject2).lineTo(30.0F, 42.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */