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

public final class xl
  extends c
{
  private final int height;
  private final int width;
  
  public xl()
  {
    GMTrace.i(15863864360960L, 118195);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15863864360960L, 118195);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15863998578688L, 118196);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15863998578688L, 118196);
      return 0;
      GMTrace.o(15863998578688L, 118196);
      return 108;
      GMTrace.o(15863998578688L, 118196);
      return 108;
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
      localPaint1.setColor(-12632257);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 45.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(4.01F, 2.09F);
      ((Path)localObject2).cubicTo(8.12F, -0.49F, 14.14F, 1.78F, 15.55F, 6.41F);
      ((Path)localObject2).cubicTo(17.46F, 11.32F, 13.29F, 17.17F, 8.03F, 16.99F);
      ((Path)localObject2).cubicTo(4.07F, 17.15F, 1.01F, 13.98F, 0.0F, 10.38F);
      ((Path)localObject2).lineTo(0.0F, 7.82F);
      ((Path)localObject2).cubicTo(0.82F, 5.62F, 1.75F, 3.18F, 4.01F, 2.09F);
      ((Path)localObject2).lineTo(4.01F, 2.09F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(30.32F, 1.48F);
      ((Path)localObject2).cubicTo(35.94F, -0.86F, 42.46F, 4.98F, 40.77F, 10.82F);
      ((Path)localObject2).cubicTo(39.73F, 16.46F, 32.05F, 19.0F, 27.84F, 15.09F);
      ((Path)localObject2).cubicTo(23.14F, 11.47F, 24.67F, 3.21F, 30.32F, 1.48F);
      ((Path)localObject2).lineTo(30.32F, 1.48F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(50.0F, 9.01F);
      ((Path)localObject1).cubicTo(49.85F, 4.09F, 54.96F, -0.04F, 59.74F, 1.21F);
      ((Path)localObject1).cubicTo(63.02F, 1.76F, 65.01F, 4.65F, 66.0F, 7.6F);
      ((Path)localObject1).lineTo(66.0F, 10.11F);
      ((Path)localObject1).cubicTo(65.19F, 12.9F, 63.56F, 15.73F, 60.57F, 16.56F);
      ((Path)localObject1).cubicTo(55.65F, 18.47F, 49.83F, 14.26F, 50.0F, 9.01F);
      ((Path)localObject1).lineTo(50.0F, 9.01F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\xl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */