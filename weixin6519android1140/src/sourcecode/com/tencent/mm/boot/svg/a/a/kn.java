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

public final class kn
  extends c
{
  private final int height;
  private final int width;
  
  public kn()
  {
    GMTrace.i(15805345431552L, 117759);
    this.width = 162;
    this.height = 162;
    GMTrace.o(15805345431552L, 117759);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15805479649280L, 117760);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15805479649280L, 117760);
      return 0;
      GMTrace.o(15805479649280L, 117760);
      return 162;
      GMTrace.o(15805479649280L, 117760);
      return 162;
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
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 80.0F);
      ((Path)localObject2).cubicTo(0.0F, 35.887928F, 35.887665F, 0.0F, 80.0F, 0.0F);
      ((Path)localObject2).cubicTo(124.112335F, 0.0F, 160.0F, 35.887928F, 160.0F, 80.0F);
      ((Path)localObject2).cubicTo(160.0F, 124.112076F, 124.112335F, 160.0F, 80.0F, 160.0F);
      ((Path)localObject2).cubicTo(35.887665F, 160.0F, 0.0F, 124.112076F, 0.0F, 80.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-11711155);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(63.284435F, 77.0F);
      ((Path)localObject1).lineTo(89.0F, 104.0F);
      ((Path)localObject1).lineTo(58.0F, 104.0F);
      ((Path)localObject1).cubicTo(60.590897F, 100.16911F, 63.478912F, 93.10176F, 62.938694F, 80.91711F);
      ((Path)localObject1).cubicTo(63.001358F, 79.552414F, 63.116966F, 78.244446F, 63.284435F, 77.0F);
      ((Path)localObject1).moveTo(60.032513F, 81.31762F);
      ((Path)localObject1).cubicTo(60.91131F, 99.65149F, 53.0F, 104.66564F, 53.0F, 104.66564F);
      ((Path)localObject1).lineTo(53.0F, 107.0F);
      ((Path)localObject1).lineTo(97.0F, 107.0F);
      ((Path)localObject1).lineTo(61.79871F, 71.0F);
      ((Path)localObject1).cubicTo(60.848923F, 73.81619F, 60.213223F, 77.21763F, 60.032513F, 81.31762F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(84.02051F, 58.95267F);
      ((Path)localObject1).lineTo(84.02051F, 57.067513F);
      ((Path)localObject1).cubicTo(84.02051F, 54.063652F, 81.875374F, 52.031452F, 78.88457F, 52.031452F);
      ((Path)localObject1).cubicTo(75.90136F, 52.031452F, 74.00952F, 54.103878F, 74.00952F, 57.096867F);
      ((Path)localObject1).lineTo(74.00952F, 58.95267F);
      ((Path)localObject1).cubicTo(71.48619F, 59.716953F, 68.18386F, 61.1031F, 65.88232F, 63.578594F);
      ((Path)localObject1).lineTo(53.30372F, 51.0F);
      ((Path)localObject1).lineTo(51.0F, 53.30372F);
      ((Path)localObject1).lineTo(108.69628F, 111.0F);
      ((Path)localObject1).lineTo(111.0F, 108.69628F);
      ((Path)localObject1).lineTo(100.0663F, 97.76258F);
      ((Path)localObject1).cubicTo(98.537735F, 94.18687F, 97.3201F, 88.87494F, 97.69735F, 81.20276F);
      ((Path)localObject1).cubicTo(97.02982F, 66.39329F, 90.03693F, 60.812824F, 84.02051F, 58.95267F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(68.19256F, 66.0466F);
      ((Path)localObject1).lineTo(68.270584F, 65.963394F);
      ((Path)localObject1).cubicTo(69.93996F, 64.19877F, 71.999466F, 62.94311F, 74.38978F, 62.230995F);
      ((Path)localObject1).lineTo(76.99048F, 61.549137F);
      ((Path)localObject1).lineTo(76.99048F, 59.14372F);
      ((Path)localObject1).lineTo(76.99048F, 57.299133F);
      ((Path)localObject1).cubicTo(76.99048F, 56.115875F, 77.7955F, 54.989075F, 78.99451F, 54.989075F);
      ((Path)localObject1).cubicTo(80.19461F, 54.989075F, 81.000916F, 56.115875F, 81.000916F, 57.299133F);
      ((Path)localObject1).lineTo(81.000916F, 59.15777F);
      ((Path)localObject1).lineTo(81.000916F, 61.549137F);
      ((Path)localObject1).lineTo(83.40482F, 62.25477F);
      ((Path)localObject1).cubicTo(86.330345F, 63.144104F, 88.738235F, 64.84173F, 90.56147F, 67.300095F);
      ((Path)localObject1).cubicTo(93.02761F, 70.62295F, 94.42553F, 75.32356F, 94.71676F, 81.27227F);
      ((Path)localObject1).cubicTo(94.51565F, 85.521194F, 94.77281F, 89.40163F, 95.48276F, 92.88008F);
      ((Path)localObject1).lineTo(68.19256F, 66.0466F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\kn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */