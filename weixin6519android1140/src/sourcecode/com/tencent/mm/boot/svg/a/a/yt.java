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
import com.tencent.mm.svg.c;

public final class yt
  extends c
{
  private final int height;
  private final int width;
  
  public yt()
  {
    GMTrace.i(15923188596736L, 118637);
    this.width = 180;
    this.height = 240;
    GMTrace.o(15923188596736L, 118637);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15923322814464L, 118638);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15923322814464L, 118638);
      return 0;
      GMTrace.o(15923322814464L, 118638);
      return 180;
      GMTrace.o(15923322814464L, 118638);
      return 240;
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
      localPaint1 = c.a(localPaint2, paramVarArgs);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localPaint1.setStrokeWidth(4.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 44.0F, 0.0F, 1.0F, 63.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 4.9965324F);
      ((Path)localObject2).cubicTo(0.0F, 3.3415933F, 1.3449905F, 2.0F, 2.9962382F, 2.0F);
      ((Path)localObject2).lineTo(60.00376F, 2.0F);
      ((Path)localObject2).cubicTo(61.65854F, 2.0F, 63.0F, 3.3373792F, 63.0F, 4.9965324F);
      ((Path)localObject2).lineTo(63.0F, 49.003468F);
      ((Path)localObject2).cubicTo(63.0F, 50.658405F, 61.65501F, 52.0F, 60.00376F, 52.0F);
      ((Path)localObject2).lineTo(2.9962382F, 52.0F);
      ((Path)localObject2).cubicTo(1.3414615F, 52.0F, 0.0F, 50.66262F, 0.0F, 49.003468F);
      ((Path)localObject2).lineTo(0.0F, 4.9965324F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(87.5F, 53.797123F);
      ((Path)localObject2).cubicTo(89.91545F, 54.568535F, 92.0F, 53.05244F, 92.0F, 50.732754F);
      ((Path)localObject2).lineTo(92.0F, 3.235053F);
      ((Path)localObject2).cubicTo(92.0F, 0.6385606F, 89.694824F, -0.4511346F, 87.5F, 0.17068519F);
      ((Path)localObject2).cubicTo(86.19809F, 1.3064651F, 75.559074F, 11.176803F, 68.0F, 18.05712F);
      ((Path)localObject2).lineTo(68.0F, 35.728115F);
      ((Path)localObject2).cubicTo(75.74342F, 42.702545F, 86.61983F, 52.864586F, 87.5F, 53.797123F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\yt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */