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

public final class yy
  extends c
{
  private final int height;
  private final int width;
  
  public yy()
  {
    GMTrace.i(15746826502144L, 117323);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15746826502144L, 117323);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15746960719872L, 117324);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15746960719872L, 117324);
      return 0;
      GMTrace.o(15746960719872L, 117324);
      return 96;
      GMTrace.o(15746960719872L, 117324);
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-9473160);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 20.0F, 0.0F, 1.0F, 16.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(53.0F, 46.7158F);
      ((Path)localObject2).cubicTo(53.0F, 48.5108F, 51.705F, 50.4728F, 49.974F, 51.3188F);
      ((Path)localObject2).cubicTo(49.355F, 51.5178F, 46.938F, 52.0728F, 46.36F, 52.1898F);
      ((Path)localObject2).cubicTo(45.499F, 52.3608F, 44.713F, 52.1748F, 44.02F, 51.6328F);
      ((Path)localObject2).cubicTo(43.17F, 50.9718F, 42.587F, 49.8498F, 42.534F, 48.7778F);
      ((Path)localObject2).cubicTo(42.435F, 46.7368F, 43.718F, 45.0968F, 44.979F, 44.8438F);
      ((Path)localObject2).lineTo(50.365F, 43.7648F);
      ((Path)localObject2).cubicTo(51.329F, 43.5708F, 52.227F, 43.1428F, 53.0F, 42.5478F);
      ((Path)localObject2).lineTo(53.0F, 46.7158F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(13.471F, 55.4638F);
      ((Path)localObject2).cubicTo(13.471F, 57.2588F, 12.174F, 59.2228F, 10.446F, 60.0668F);
      ((Path)localObject2).cubicTo(9.822F, 60.2678F, 7.39F, 60.8258F, 6.832F, 60.9378F);
      ((Path)localObject2).cubicTo(5.972F, 61.1088F, 5.185F, 60.9208F, 4.489F, 60.3808F);
      ((Path)localObject2).cubicTo(3.641F, 59.7188F, 3.058F, 58.5988F, 3.006F, 57.5248F);
      ((Path)localObject2).cubicTo(2.906F, 55.4858F, 4.187F, 53.8458F, 5.449F, 53.5928F);
      ((Path)localObject2).lineTo(10.835F, 52.5128F);
      ((Path)localObject2).cubicTo(11.8F, 52.3198F, 12.697F, 51.8908F, 13.471F, 51.2958F);
      ((Path)localObject2).lineTo(13.471F, 55.4638F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(13.161F, 9.3678F);
      ((Path)localObject2).lineTo(13.161F, 13.2228F);
      ((Path)localObject2).lineTo(13.178F, 13.2188F);
      ((Path)localObject2).lineTo(13.178F, 45.9798F);
      ((Path)localObject2).cubicTo(13.178F, 47.6388F, 11.86F, 49.2478F, 10.245F, 49.5708F);
      ((Path)localObject2).lineTo(4.859F, 50.6508F);
      ((Path)localObject2).cubicTo(2.161F, 51.1918F, -0.164F, 54.1378F, 0.009F, 57.6718F);
      ((Path)localObject2).cubicTo(0.182F, 61.2058F, 3.328F, 64.6998F, 7.421F, 63.8788F);
      ((Path)localObject2).cubicTo(7.847F, 63.7938F, 11.11F, 63.0668F, 11.626F, 62.8268F);
      ((Path)localObject2).cubicTo(14.405F, 61.5358F, 16.471F, 58.5378F, 16.471F, 55.4638F);
      ((Path)localObject2).lineTo(16.471F, 52.1628F);
      ((Path)localObject2).lineTo(16.471F, 12.4988F);
      ((Path)localObject2).lineTo(52.708F, 4.5748F);
      ((Path)localObject2).lineTo(52.708F, 37.2318F);
      ((Path)localObject2).cubicTo(52.708F, 38.8898F, 51.389F, 40.4988F, 49.775F, 40.8228F);
      ((Path)localObject2).lineTo(44.388F, 41.9028F);
      ((Path)localObject2).cubicTo(41.691F, 42.4438F, 39.365F, 45.3898F, 39.539F, 48.9238F);
      ((Path)localObject2).cubicTo(39.712F, 52.4568F, 42.857F, 55.9518F, 46.951F, 55.1308F);
      ((Path)localObject2).cubicTo(47.377F, 55.0448F, 50.639F, 54.3188F, 51.156F, 54.0788F);
      ((Path)localObject2).cubicTo(53.934F, 52.7868F, 56.0F, 49.7898F, 56.0F, 46.7158F);
      ((Path)localObject2).lineTo(56.0F, 43.4148F);
      ((Path)localObject2).lineTo(56.0F, 3.3078F);
      ((Path)localObject2).lineTo(56.0F, -2.0E-4F);
      ((Path)localObject2).lineTo(13.161F, 9.3678F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\yy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */