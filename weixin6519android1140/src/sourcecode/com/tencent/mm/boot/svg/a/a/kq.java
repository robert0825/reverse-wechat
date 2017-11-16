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

public final class kq
  extends c
{
  private final int height;
  private final int width;
  
  public kq()
  {
    GMTrace.i(15744142147584L, 117303);
    this.width = 162;
    this.height = 162;
    GMTrace.o(15744142147584L, 117303);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15744276365312L, 117304);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15744276365312L, 117304);
      return 0;
      GMTrace.o(15744276365312L, 117304);
      return 162;
      GMTrace.o(15744276365312L, 117304);
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
      localCanvas.saveLayerAlpha(null, 128, 4);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-16139513);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(62.284435F, 76.0F);
      ((Path)localObject1).lineTo(88.0F, 103.0F);
      ((Path)localObject1).lineTo(57.0F, 103.0F);
      ((Path)localObject1).cubicTo(59.590897F, 99.16911F, 62.478912F, 92.10176F, 61.938694F, 79.91711F);
      ((Path)localObject1).cubicTo(62.001358F, 78.552414F, 62.116966F, 77.244446F, 62.284435F, 76.0F);
      ((Path)localObject1).moveTo(59.032513F, 80.31762F);
      ((Path)localObject1).cubicTo(59.91131F, 98.65149F, 52.0F, 103.66564F, 52.0F, 103.66564F);
      ((Path)localObject1).lineTo(52.0F, 106.0F);
      ((Path)localObject1).lineTo(96.0F, 106.0F);
      ((Path)localObject1).lineTo(60.79871F, 70.0F);
      ((Path)localObject1).cubicTo(59.848923F, 72.81619F, 59.213223F, 76.21763F, 59.032513F, 80.31762F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(83.02051F, 57.95267F);
      ((Path)localObject1).lineTo(83.02051F, 56.067513F);
      ((Path)localObject1).cubicTo(83.02051F, 53.063652F, 80.875374F, 51.031452F, 77.88457F, 51.031452F);
      ((Path)localObject1).cubicTo(74.90136F, 51.031452F, 73.00952F, 53.103878F, 73.00952F, 56.096867F);
      ((Path)localObject1).lineTo(73.00952F, 57.95267F);
      ((Path)localObject1).cubicTo(70.48619F, 58.716953F, 67.18386F, 60.1031F, 64.88232F, 62.578594F);
      ((Path)localObject1).lineTo(52.30372F, 50.0F);
      ((Path)localObject1).lineTo(50.0F, 52.30372F);
      ((Path)localObject1).lineTo(107.69628F, 110.0F);
      ((Path)localObject1).lineTo(110.0F, 107.69628F);
      ((Path)localObject1).lineTo(99.0663F, 96.76258F);
      ((Path)localObject1).cubicTo(97.537735F, 93.18687F, 96.3201F, 87.87494F, 96.69735F, 80.20276F);
      ((Path)localObject1).cubicTo(96.02982F, 65.39329F, 89.03693F, 59.812824F, 83.02051F, 57.95267F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(67.19256F, 65.0466F);
      ((Path)localObject1).lineTo(67.270584F, 64.963394F);
      ((Path)localObject1).cubicTo(68.93996F, 63.198772F, 70.999466F, 61.94311F, 73.38978F, 61.230995F);
      ((Path)localObject1).lineTo(75.99048F, 60.549137F);
      ((Path)localObject1).lineTo(75.99048F, 58.14372F);
      ((Path)localObject1).lineTo(75.99048F, 56.299133F);
      ((Path)localObject1).cubicTo(75.99048F, 55.115875F, 76.7955F, 53.989075F, 77.99451F, 53.989075F);
      ((Path)localObject1).cubicTo(79.19461F, 53.989075F, 80.000916F, 55.115875F, 80.000916F, 56.299133F);
      ((Path)localObject1).lineTo(80.000916F, 58.15777F);
      ((Path)localObject1).lineTo(80.000916F, 60.549137F);
      ((Path)localObject1).lineTo(82.40482F, 61.25477F);
      ((Path)localObject1).cubicTo(85.330345F, 62.144104F, 87.738235F, 63.84173F, 89.56147F, 66.300095F);
      ((Path)localObject1).cubicTo(92.02761F, 69.62295F, 93.42553F, 74.32356F, 93.71676F, 80.27227F);
      ((Path)localObject1).cubicTo(93.51565F, 84.521194F, 93.77281F, 88.40163F, 94.48276F, 91.88008F);
      ((Path)localObject1).lineTo(67.19256F, 65.0466F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\kq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */