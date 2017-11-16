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

public final class no
  extends c
{
  private final int height;
  private final int width;
  
  public no()
  {
    GMTrace.i(17853239525376L, 133017);
    this.width = 105;
    this.height = 81;
    GMTrace.o(17853239525376L, 133017);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17853373743104L, 133018);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17853373743104L, 133018);
      return 0;
      GMTrace.o(17853373743104L, 133018);
      return 105;
      GMTrace.o(17853373743104L, 133018);
      return 81;
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
      localPaint1.setColor(-2565928);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -741.0F, 0.0F, 1.0F, -55.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 741.0F, 0.0F, 1.0F, 55.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(86.71151F, 34.642452F);
      ((Path)localObject2).cubicTo(85.82056F, 34.548286F, 84.91592F, 34.5F, 84.0F, 34.5F);
      ((Path)localObject2).cubicTo(75.91176F, 34.5F, 68.7032F, 38.265427F, 64.03162F, 44.138985F);
      ((Path)localObject2).cubicTo(62.99355F, 42.952747F, 62.684723F, 41.290863F, 63.354F, 39.4515F);
      ((Path)localObject2).cubicTo(64.314F, 36.816F, 66.8325F, 34.5915F, 69.906F, 33.561F);
      ((Path)localObject2).cubicTo(74.6715F, 31.824F, 78.0F, 27.861F, 78.0F, 23.25F);
      ((Path)localObject2).cubicTo(78.0F, 17.037F, 71.955F, 12.0F, 64.5F, 12.0F);
      ((Path)localObject2).cubicTo(57.0435F, 12.0F, 51.0F, 17.037F, 51.0F, 23.25F);
      ((Path)localObject2).lineTo(51.0F, 57.75F);
      ((Path)localObject2).cubicTo(51.0F, 66.048F, 46.1925F, 73.323F, 39.0F, 77.439F);
      ((Path)localObject2).cubicTo(35.079F, 79.6815F, 30.4605F, 81.0F, 25.5F, 81.0F);
      ((Path)localObject2).cubicTo(11.439F, 81.0F, 0.0F, 70.5705F, 0.0F, 57.75F);
      ((Path)localObject2).cubicTo(0.0F, 53.67F, 1.167F, 49.8375F, 3.1995F, 46.5F);
      ((Path)localObject2).cubicTo(6.3465F, 41.3355F, 11.589F, 37.3815F, 17.8695F, 35.5785F);
      ((Path)localObject2).cubicTo(17.8755F, 35.577F, 17.88F, 35.5755F, 17.8845F, 35.574F);
      ((Path)localObject2).cubicTo(18.9435F, 35.244F, 20.0415F, 35.061F, 21.1245F, 35.061F);
      ((Path)localObject2).cubicTo(25.4685F, 35.061F, 27.9225F, 37.995F, 26.604F, 41.616F);
      ((Path)localObject2).cubicTo(25.7115F, 44.0685F, 23.307F, 46.1805F, 20.5035F, 47.3055F);
      ((Path)localObject2).cubicTo(20.169F, 47.4165F, 19.8435F, 47.5425F, 19.5225F, 47.6745F);
      ((Path)localObject2).cubicTo(15.069F, 49.5135F, 12.0F, 53.328F, 12.0F, 57.75F);
      ((Path)localObject2).cubicTo(12.0F, 63.963F, 18.0435F, 69.0F, 25.5F, 69.0F);
      ((Path)localObject2).cubicTo(32.955F, 69.0F, 39.0F, 63.963F, 39.0F, 57.75F);
      ((Path)localObject2).lineTo(39.0F, 23.25F);
      ((Path)localObject2).cubicTo(39.0F, 14.952F, 43.8075F, 7.677F, 51.0F, 3.561F);
      ((Path)localObject2).cubicTo(54.921F, 1.3185F, 59.5395F, 0.0F, 64.5F, 0.0F);
      ((Path)localObject2).cubicTo(78.561F, 0.0F, 90.0F, 10.4295F, 90.0F, 23.25F);
      ((Path)localObject2).cubicTo(90.0F, 27.33F, 88.833F, 31.164F, 86.799F, 34.5F);
      ((Path)localObject2).cubicTo(86.77001F, 34.54759F, 86.74085F, 34.59507F, 86.71151F, 34.642452F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(105.0F, 60.0F);
      ((Path)localObject2).cubicTo(105.0F, 71.59822F, 95.59822F, 81.0F, 84.0F, 81.0F);
      ((Path)localObject2).cubicTo(72.40178F, 81.0F, 63.0F, 71.59822F, 63.0F, 60.0F);
      ((Path)localObject2).cubicTo(63.0F, 48.40178F, 72.40178F, 39.0F, 84.0F, 39.0F);
      ((Path)localObject2).cubicTo(95.59822F, 39.0F, 105.0F, 48.40178F, 105.0F, 60.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(81.30608F, 49.484344F);
      ((Path)localObject2).lineTo(83.0F, 66.0F);
      ((Path)localObject2).lineTo(85.0F, 66.0F);
      ((Path)localObject2).lineTo(86.69392F, 49.484344F);
      ((Path)localObject2).cubicTo(86.84651F, 47.996536F, 85.76411F, 46.66673F, 84.2763F, 46.514133F);
      ((Path)localObject2).cubicTo(84.1845F, 46.50472F, 84.09228F, 46.5F, 84.0F, 46.5F);
      ((Path)localObject2).cubicTo(82.50439F, 46.5F, 81.291954F, 47.712433F, 81.291954F, 49.208046F);
      ((Path)localObject2).cubicTo(81.291954F, 49.300327F, 81.29667F, 49.392544F, 81.30608F, 49.484344F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(84.0F, 75.0F);
      ((Path)localObject2).cubicTo(85.65685F, 75.0F, 87.0F, 73.65685F, 87.0F, 72.0F);
      ((Path)localObject2).cubicTo(87.0F, 70.34315F, 85.65685F, 69.0F, 84.0F, 69.0F);
      ((Path)localObject2).cubicTo(82.34315F, 69.0F, 81.0F, 70.34315F, 81.0F, 72.0F);
      ((Path)localObject2).cubicTo(81.0F, 73.65685F, 82.34315F, 75.0F, 84.0F, 75.0F);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\no.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */