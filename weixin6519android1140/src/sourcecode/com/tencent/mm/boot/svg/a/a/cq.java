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

public final class cq
  extends c
{
  private final int height;
  private final int width;
  
  public cq()
  {
    GMTrace.i(15756221743104L, 117393);
    this.width = 57;
    this.height = 75;
    GMTrace.o(15756221743104L, 117393);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15756355960832L, 117394);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15756355960832L, 117394);
      return 0;
      GMTrace.o(15756355960832L, 117394);
      return 57;
      GMTrace.o(15756355960832L, 117394);
      return 75;
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-11184811);
      localPaint1.setStrokeWidth(3.0F);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1448.0F, 0.0F, 1.0F, -685.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1474.4348F, 755.2621F);
      ((Path)localObject2).cubicTo(1475.5754F, 756.4586F, 1477.4377F, 756.46204F, 1478.5652F, 755.2621F);
      ((Path)localObject2).cubicTo(1478.5652F, 755.2621F, 1502.0F, 731.94885F, 1502.0F, 712.67706F);
      ((Path)localObject2).cubicTo(1502.0F, 698.43427F, 1490.5833F, 687.0F, 1476.8696F, 687.0F);
      ((Path)localObject2).cubicTo(1462.4167F, 687.0F, 1451.0F, 698.43427F, 1451.0F, 712.67706F);
      ((Path)localObject2).cubicTo(1451.0F, 731.94885F, 1474.4348F, 755.2621F, 1474.4348F, 755.2621F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(1476.5F, 721.0F);
      ((Path)localObject2).cubicTo(1481.1945F, 721.0F, 1485.0F, 717.1944F, 1485.0F, 712.5F);
      ((Path)localObject2).cubicTo(1485.0F, 707.8056F, 1481.1945F, 704.0F, 1476.5F, 704.0F);
      ((Path)localObject2).cubicTo(1471.8055F, 704.0F, 1468.0F, 707.8056F, 1468.0F, 712.5F);
      ((Path)localObject2).cubicTo(1468.0F, 717.1944F, 1471.8055F, 721.0F, 1476.5F, 721.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */