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

public final class nj
  extends c
{
  private final int height;
  private final int width;
  
  public nj()
  {
    GMTrace.i(15786554949632L, 117619);
    this.width = 235;
    this.height = 160;
    GMTrace.o(15786554949632L, 117619);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15786689167360L, 117620);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15786689167360L, 117620);
      return 0;
      GMTrace.o(15786689167360L, 117620);
      return 235;
      GMTrace.o(15786689167360L, 117620);
      return 160;
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
      localPaint1.setColor(-12206054);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(212.0F, 0.0F);
      ((Path)localObject2).cubicTo(216.63023F, 5.5596924F, 222.31512F, 11.159097F, 228.0F, 16.0F);
      ((Path)localObject2).cubicTo(200.60638F, 43.807625F, 144.0F, 96.0F, 144.0F, 96.0F);
      ((Path)localObject2).cubicTo(144.0F, 96.0F, 103.635574F, 139.2875F, 84.0F, 160.0F);
      ((Path)localObject2).cubicTo(55.03448F, 132.87665F, 27.537401F, 105.75329F, 0.0F, 80.0F);
      ((Path)localObject2).cubicTo(5.6445622F, 72.9511F, 11.329443F, 67.31199F, 16.0F, 60.0F);
      ((Path)localObject2).cubicTo(38.94748F, 83.276245F, 60.719364F, 104.83991F, 84.0F, 128.0F);
      ((Path)localObject2).cubicTo(125.47056F, 84.22934F, 168.12732F, 42.0551F, 212.0F, 0.0F);
      ((Path)localObject2).lineTo(212.0F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\nj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */