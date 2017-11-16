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

public final class agt
  extends c
{
  private final int height;
  private final int width;
  
  public agt()
  {
    GMTrace.i(15729915068416L, 117197);
    this.width = 64;
    this.height = 12;
    GMTrace.o(15729915068416L, 117197);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15730049286144L, 117198);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15730049286144L, 117198);
      return 0;
      GMTrace.o(15730049286144L, 117198);
      return 64;
      GMTrace.o(15730049286144L, 117198);
      return 12;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Matrix localMatrix = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      c.a((Paint)localObject1, paramVarArgs).setStrokeWidth(1.0F);
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-2565928);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      Object localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(6.0F, 12.0F);
      ((Path)localObject2).cubicTo(9.313708F, 12.0F, 12.0F, 9.313708F, 12.0F, 6.0F);
      ((Path)localObject2).cubicTo(12.0F, 2.6862915F, 9.313708F, 0.0F, 6.0F, 0.0F);
      ((Path)localObject2).cubicTo(2.6862915F, 0.0F, 0.0F, 2.6862915F, 0.0F, 6.0F);
      ((Path)localObject2).cubicTo(0.0F, 9.313708F, 2.6862915F, 12.0F, 6.0F, 12.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(32.0F, 12.0F);
      ((Path)localObject2).cubicTo(35.31371F, 12.0F, 38.0F, 9.313708F, 38.0F, 6.0F);
      ((Path)localObject2).cubicTo(38.0F, 2.6862915F, 35.31371F, 0.0F, 32.0F, 0.0F);
      ((Path)localObject2).cubicTo(28.68629F, 0.0F, 26.0F, 2.6862915F, 26.0F, 6.0F);
      ((Path)localObject2).cubicTo(26.0F, 9.313708F, 28.68629F, 12.0F, 32.0F, 12.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(58.0F, 12.0F);
      ((Path)localObject2).cubicTo(61.31371F, 12.0F, 64.0F, 9.313708F, 64.0F, 6.0F);
      ((Path)localObject2).cubicTo(64.0F, 2.6862915F, 61.31371F, 0.0F, 58.0F, 0.0F);
      ((Path)localObject2).cubicTo(54.68629F, 0.0F, 52.0F, 2.6862915F, 52.0F, 6.0F);
      ((Path)localObject2).cubicTo(52.0F, 9.313708F, 54.68629F, 12.0F, 58.0F, 12.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(6.0F, 12.0F);
      ((Path)localObject1).cubicTo(9.313708F, 12.0F, 12.0F, 9.313708F, 12.0F, 6.0F);
      ((Path)localObject1).cubicTo(12.0F, 2.6862915F, 9.313708F, 0.0F, 6.0F, 0.0F);
      ((Path)localObject1).cubicTo(2.6862915F, 0.0F, 0.0F, 2.6862915F, 0.0F, 6.0F);
      ((Path)localObject1).cubicTo(0.0F, 9.313708F, 2.6862915F, 12.0F, 6.0F, 12.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(32.0F, 12.0F);
      ((Path)localObject1).cubicTo(35.31371F, 12.0F, 38.0F, 9.313708F, 38.0F, 6.0F);
      ((Path)localObject1).cubicTo(38.0F, 2.6862915F, 35.31371F, 0.0F, 32.0F, 0.0F);
      ((Path)localObject1).cubicTo(28.68629F, 0.0F, 26.0F, 2.6862915F, 26.0F, 6.0F);
      ((Path)localObject1).cubicTo(26.0F, 9.313708F, 28.68629F, 12.0F, 32.0F, 12.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(58.0F, 12.0F);
      ((Path)localObject1).cubicTo(61.31371F, 12.0F, 64.0F, 9.313708F, 64.0F, 6.0F);
      ((Path)localObject1).cubicTo(64.0F, 2.6862915F, 61.31371F, 0.0F, 58.0F, 0.0F);
      ((Path)localObject1).cubicTo(54.68629F, 0.0F, 52.0F, 2.6862915F, 52.0F, 6.0F);
      ((Path)localObject1).cubicTo(52.0F, 9.313708F, 54.68629F, 12.0F, 58.0F, 12.0F);
      ((Path)localObject1).close();
      localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 64.0F, 0.0F, 0.0F, 0.0F, 12.0F, 0.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient(localPaint1, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -6556649, -9903790 }, new float[] { 0.0F, 1.0F }, localMatrix, 0);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\agt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */