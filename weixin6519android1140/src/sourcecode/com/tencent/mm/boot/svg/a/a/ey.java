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

public final class ey
  extends c
{
  private final int height;
  private final int width;
  
  public ey()
  {
    GMTrace.i(15722398875648L, 117141);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15722398875648L, 117141);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15722533093376L, 117142);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15722533093376L, 117142);
      return 0;
      GMTrace.o(15722533093376L, 117142);
      return 96;
      GMTrace.o(15722533093376L, 117142);
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
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(45.0513F, 58.846F);
      ((Path)localObject3).lineTo(48.5133F, 60.0F);
      ((Path)localObject3).lineTo(32.4863F, 60.0F);
      ((Path)localObject3).lineTo(35.9483F, 58.846F);
      ((Path)localObject3).lineTo(38.0003F, 58.162F);
      ((Path)localObject3).lineTo(38.0003F, 56.0F);
      ((Path)localObject3).lineTo(38.0003F, 52.0F);
      ((Path)localObject3).lineTo(43.0003F, 52.0F);
      ((Path)localObject3).lineTo(43.0003F, 56.0F);
      ((Path)localObject3).lineTo(43.0003F, 58.162F);
      ((Path)localObject3).lineTo(45.0513F, 58.846F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(35.0003F, 49.0F);
      ((Path)localObject3).lineTo(3.0003F, 49.0F);
      ((Path)localObject3).lineTo(3.0003F, 3.0F);
      ((Path)localObject3).lineTo(77.0003F, 3.0F);
      ((Path)localObject3).lineTo(77.0003F, 18.0F);
      ((Path)localObject3).lineTo(80.0003F, 18.0F);
      ((Path)localObject3).lineTo(80.0003F, 2.87F);
      ((Path)localObject3).cubicTo(80.0003F, 1.285F, 78.7143F, 0.0F, 77.1293F, 0.0F);
      ((Path)localObject3).lineTo(2.8713F, 0.0F);
      ((Path)localObject3).cubicTo(1.2893F, 0.0F, 3.0E-4F, 1.285F, 3.0E-4F, 2.87F);
      ((Path)localObject3).lineTo(3.0E-4F, 49.13F);
      ((Path)localObject3).cubicTo(3.0E-4F, 50.715F, 1.2853F, 52.0F, 2.8713F, 52.0F);
      ((Path)localObject3).lineTo(35.0003F, 52.0F);
      ((Path)localObject3).lineTo(35.0003F, 56.0F);
      ((Path)localObject3).lineTo(23.0003F, 60.0F);
      ((Path)localObject3).lineTo(23.0003F, 63.0F);
      ((Path)localObject3).lineTo(58.0003F, 63.0F);
      ((Path)localObject3).lineTo(58.0003F, 60.0F);
      ((Path)localObject3).lineTo(46.0003F, 56.0F);
      ((Path)localObject3).lineTo(46.0003F, 52.0F);
      ((Path)localObject3).lineTo(61.5F, 52.0F);
      ((Path)localObject3).lineTo(61.5F, 49.0F);
      ((Path)localObject3).lineTo(46.0003F, 49.0F);
      ((Path)localObject3).lineTo(35.0003F, 49.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(68.0F, 59.028194F);
      ((Path)localObject2).lineTo(68.0F, 24.971806F);
      ((Path)localObject2).cubicTo(68.0F, 24.435892F, 68.40374F, 24.0F, 68.9F, 24.0F);
      ((Path)localObject2).lineTo(85.1F, 24.0F);
      ((Path)localObject2).cubicTo(85.59626F, 24.0F, 86.0F, 24.435892F, 86.0F, 24.971806F);
      ((Path)localObject2).lineTo(86.0F, 59.028194F);
      ((Path)localObject2).cubicTo(86.0F, 59.56411F, 85.59626F, 60.0F, 85.1F, 60.0F);
      ((Path)localObject2).lineTo(68.9F, 60.0F);
      ((Path)localObject2).cubicTo(68.40374F, 60.0F, 68.0F, 59.56411F, 68.0F, 59.028194F);
      ((Path)localObject2).lineTo(68.0F, 59.028194F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(87.18868F, 63.0F);
      ((Path)localObject2).cubicTo(88.18898F, 63.0F, 89.0F, 62.212334F, 89.0F, 61.242157F);
      ((Path)localObject2).lineTo(89.0F, 22.757843F);
      ((Path)localObject2).cubicTo(89.0F, 21.787004F, 88.18762F, 21.0F, 87.18868F, 21.0F);
      ((Path)localObject2).lineTo(66.81132F, 21.0F);
      ((Path)localObject2).cubicTo(65.81102F, 21.0F, 65.0F, 21.787664F, 65.0F, 22.757843F);
      ((Path)localObject2).lineTo(65.0F, 61.242157F);
      ((Path)localObject2).cubicTo(65.0F, 62.212994F, 65.81238F, 63.0F, 66.81132F, 63.0F);
      ((Path)localObject2).lineTo(87.18868F, 63.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */