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

public final class aci
  extends c
{
  private final int height;
  private final int width;
  
  public aci()
  {
    GMTrace.i(15848831975424L, 118083);
    this.width = 168;
    this.height = 168;
    GMTrace.o(15848831975424L, 118083);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15848966193152L, 118084);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15848966193152L, 118084);
      return 0;
      GMTrace.o(15848966193152L, 118084);
      return 168;
      GMTrace.o(15848966193152L, 118084);
      return 168;
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
      localPaint1.setColor(-8617594);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 39.0F, 0.0F, 1.0F, 51.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(84.0F, 42.34183F);
      ((Path)localObject2).lineTo(84.0F, 6.0F);
      ((Path)localObject2).lineTo(6.0F, 6.0F);
      ((Path)localObject2).lineTo(6.0F, 40.335194F);
      ((Path)localObject2).lineTo(29.0F, 18.0F);
      ((Path)localObject2).lineTo(60.023453F, 46.799316F);
      ((Path)localObject2).lineTo(56.0F, 38.0F);
      ((Path)localObject2).lineTo(68.1287F, 27.99035F);
      ((Path)localObject2).lineTo(84.0F, 42.34183F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2.994461F, 0.0F);
      ((Path)localObject2).cubicTo(1.3406659F, 0.0F, 0.0F, 1.3482827F, 0.0F, 3.007385F);
      ((Path)localObject2).lineTo(0.0F, 62.992615F);
      ((Path)localObject2).cubicTo(0.0F, 64.65355F, 1.3420956F, 66.0F, 2.994461F, 66.0F);
      ((Path)localObject2).lineTo(87.00554F, 66.0F);
      ((Path)localObject2).cubicTo(88.65933F, 66.0F, 90.0F, 64.65172F, 90.0F, 62.992615F);
      ((Path)localObject2).lineTo(90.0F, 3.007385F);
      ((Path)localObject2).cubicTo(90.0F, 1.3464521F, 88.657906F, 0.0F, 87.00554F, 0.0F);
      ((Path)localObject2).lineTo(2.994461F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */