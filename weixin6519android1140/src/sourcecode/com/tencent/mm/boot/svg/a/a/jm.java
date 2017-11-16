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

public final class jm
  extends c
{
  private final int height;
  private final int width;
  
  public jm()
  {
    GMTrace.i(15903592808448L, 118491);
    this.width = 300;
    this.height = 135;
    GMTrace.o(15903592808448L, 118491);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15903727026176L, 118492);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15903727026176L, 118492);
      return 0;
      GMTrace.o(15903727026176L, 118492);
      return 300;
      GMTrace.o(15903727026176L, 118492);
      return 135;
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
      localPaint2.setColor(-921103);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(300.0F, 0.0F);
      localPath.lineTo(300.0F, 136.0F);
      localPath.lineTo(0.0F, 136.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-3552823);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 111.0F, 0.0F, 1.0F, 39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 3.004289F);
      ((Path)localObject2).cubicTo(0.0F, 1.345066F, 1.3380457F, 0.0F, 3.0004263F, 0.0F);
      ((Path)localObject2).lineTo(75.99957F, 0.0F);
      ((Path)localObject2).cubicTo(77.65666F, 0.0F, 79.0F, 1.3527762F, 79.0F, 3.004289F);
      ((Path)localObject2).lineTo(79.0F, 53.995712F);
      ((Path)localObject2).cubicTo(79.0F, 55.654934F, 77.66196F, 57.0F, 75.99957F, 57.0F);
      ((Path)localObject2).lineTo(3.0004263F, 57.0F);
      ((Path)localObject2).cubicTo(1.3433366F, 57.0F, 0.0F, 55.647224F, 0.0F, 53.995712F);
      ((Path)localObject2).lineTo(0.0F, 3.004289F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(4.0F, 4.0F);
      ((Path)localObject2).lineTo(75.0F, 4.0F);
      ((Path)localObject2).lineTo(75.0F, 53.0F);
      ((Path)localObject2).lineTo(4.0F, 53.0F);
      ((Path)localObject2).lineTo(4.0F, 4.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(60.92106F, 30.279995F);
      ((Path)localObject2).lineTo(50.039062F, 38.768322F);
      ((Path)localObject2).lineTo(53.85942F, 46.690155F);
      ((Path)localObject2).lineTo(27.17777F, 22.0F);
      ((Path)localObject2).lineTo(2.0F, 45.710293F);
      ((Path)localObject2).lineTo(2.0F, 56.5F);
      ((Path)localObject2).lineTo(77.96154F, 56.5F);
      ((Path)localObject2).lineTo(77.96154F, 45.710293F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */