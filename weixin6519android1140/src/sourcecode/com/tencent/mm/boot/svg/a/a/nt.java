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

public final class nt
  extends c
{
  private final int height;
  private final int width;
  
  public nt()
  {
    GMTrace.i(15777159708672L, 117549);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15777159708672L, 117549);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15777293926400L, 117550);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15777293926400L, 117550);
      return 0;
      GMTrace.o(15777293926400L, 117550);
      return 60;
      GMTrace.o(15777293926400L, 117550);
      return 60;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(18.11F, 25.83F);
      ((Path)localObject2).cubicTo(26.56F, 17.39F, 35.0F, 8.92F, 43.47F, 0.49F);
      ((Path)localObject2).cubicTo(44.61F, 1.63F, 45.83F, 2.71F, 46.84F, 3.98F);
      ((Path)localObject2).cubicTo(46.51F, 5.07F, 45.35F, 5.72F, 44.65F, 6.58F);
      ((Path)localObject2).cubicTo(35.76F, 15.37F, 26.97F, 24.25F, 18.11F, 33.07F);
      ((Path)localObject2).cubicTo(12.07F, 27.04F, 6.03F, 21.01F, 0.0F, 14.97F);
      ((Path)localObject2).cubicTo(1.21F, 13.76F, 2.42F, 12.56F, 3.62F, 11.35F);
      ((Path)localObject2).cubicTo(8.45F, 16.18F, 13.28F, 21.01F, 18.11F, 25.83F);
      ((Path)localObject2).lineTo(18.11F, 25.83F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\nt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */