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

public final class x
  extends c
{
  private final int height;
  private final int width;
  
  public x()
  {
    GMTrace.i(15789239304192L, 117639);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15789239304192L, 117639);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15789373521920L, 117640);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15789373521920L, 117640);
      return 0;
      GMTrace.o(15789373521920L, 117640);
      return 96;
      GMTrace.o(15789373521920L, 117640);
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
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.0F, 5.270896F);
      ((Path)localObject2).cubicTo(2.4202743F, 3.8405488F, 3.8405488F, 2.4202743F, 5.270896F, 1.0F);
      ((Path)localObject2).cubicTo(11.687312F, 7.3962708F, 18.083584F, 13.812688F, 24.5F, 20.21903F);
      ((Path)localObject2).cubicTo(30.916416F, 13.822761F, 37.312687F, 7.3962708F, 43.729103F, 1.0F);
      ((Path)localObject2).cubicTo(45.15945F, 2.4202743F, 46.579727F, 3.8405488F, 48.0F, 5.270896F);
      ((Path)localObject2).cubicTo(41.60373F, 11.687312F, 35.17724F, 18.083584F, 28.78097F, 24.5F);
      ((Path)localObject2).cubicTo(35.17724F, 30.916416F, 41.60373F, 37.312687F, 48.0F, 43.739178F);
      ((Path)localObject2).cubicTo(46.579727F, 45.15945F, 45.15945F, 46.579727F, 43.739178F, 48.0F);
      ((Path)localObject2).cubicTo(37.312687F, 41.60373F, 30.916416F, 35.17724F, 24.5F, 28.78097F);
      ((Path)localObject2).cubicTo(18.083584F, 35.17724F, 11.687312F, 41.60373F, 5.270896F, 48.0F);
      ((Path)localObject2).cubicTo(3.8405488F, 46.579727F, 2.4202743F, 45.15945F, 1.0F, 43.739178F);
      ((Path)localObject2).cubicTo(7.3962708F, 37.312687F, 13.822761F, 30.916416F, 20.21903F, 24.5F);
      ((Path)localObject2).cubicTo(13.822761F, 18.083584F, 7.3962708F, 11.687312F, 1.0F, 5.270896F);
      ((Path)localObject2).lineTo(1.0F, 5.270896F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */