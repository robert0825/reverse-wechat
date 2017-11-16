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

public final class act
  extends c
{
  private final int height;
  private final int width;
  
  public act()
  {
    GMTrace.i(15768569774080L, 117485);
    this.width = 120;
    this.height = 120;
    GMTrace.o(15768569774080L, 117485);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15768703991808L, 117486);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15768703991808L, 117486);
      return 0;
      GMTrace.o(15768703991808L, 117486);
      return 120;
      GMTrace.o(15768703991808L, 117486);
      return 120;
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
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 15.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(8.001439F, 18.0F);
      ((Path)localObject2).cubicTo(3.5823665F, 18.0F, 0.0F, 21.582798F, 0.0F, 25.997679F);
      ((Path)localObject2).lineTo(0.0F, 82.00232F);
      ((Path)localObject2).cubicTo(0.0F, 86.41932F, 3.5913615F, 90.0F, 8.001439F, 90.0F);
      ((Path)localObject2).lineTo(111.99856F, 90.0F);
      ((Path)localObject2).cubicTo(116.41763F, 90.0F, 120.0F, 86.4172F, 120.0F, 82.00232F);
      ((Path)localObject2).lineTo(120.0F, 25.997679F);
      ((Path)localObject2).cubicTo(120.0F, 21.580683F, 116.40864F, 18.0F, 111.99856F, 18.0F);
      ((Path)localObject2).lineTo(8.001439F, 18.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(47.750492F, 0.0F);
      ((Path)localObject2).lineTo(60.0F, 0.0F);
      ((Path)localObject2).lineTo(60.0F, 18.0F);
      ((Path)localObject2).lineTo(23.340025F, 18.0F);
      ((Path)localObject2).cubicTo(33.061623F, 18.0F, 38.284004F, 0.0F, 47.750492F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(96.65997F, 18.0F);
      ((Path)localObject2).cubicTo(86.93838F, 18.0F, 81.715996F, 0.0F, 72.2474F, 0.0F);
      ((Path)localObject2).lineTo(60.0F, 0.0F);
      ((Path)localObject2).lineTo(60.0F, 18.0F);
      ((Path)localObject2).lineTo(96.65997F, 18.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(60.0F, 27.0F);
      ((Path)localObject2).cubicTo(74.91231F, 27.0F, 87.0F, 39.087692F, 87.0F, 54.0F);
      ((Path)localObject2).cubicTo(87.0F, 68.91231F, 74.91231F, 81.0F, 60.0F, 81.0F);
      ((Path)localObject2).cubicTo(45.087692F, 81.0F, 33.0F, 68.91231F, 33.0F, 54.0F);
      ((Path)localObject2).cubicTo(33.0F, 39.087692F, 45.087692F, 27.0F, 60.0F, 27.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(78.0F, 54.0F);
      ((Path)localObject2).cubicTo(78.0F, 63.9414F, 69.9414F, 72.0F, 60.0F, 72.0F);
      ((Path)localObject2).cubicTo(50.0586F, 72.0F, 42.0F, 63.9414F, 42.0F, 54.0F);
      ((Path)localObject2).cubicTo(42.0F, 44.0586F, 50.0586F, 36.0F, 60.0F, 36.0F);
      ((Path)localObject2).cubicTo(69.9414F, 36.0F, 78.0F, 44.0586F, 78.0F, 54.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(5.4545455F, 6.4315085F);
      ((Path)localObject2).lineTo(21.818182F, 6.4315085F);
      ((Path)localObject2).lineTo(21.818182F, 12.407947F);
      ((Path)localObject2).lineTo(5.4545455F, 12.407947F);
      ((Path)localObject2).lineTo(5.4545455F, 6.4315085F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\act.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */