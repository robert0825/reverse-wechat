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

public final class ahl
  extends c
{
  private final int height;
  private final int width;
  
  public ahl()
  {
    GMTrace.i(16007343112192L, 119264);
    this.width = 60;
    this.height = 60;
    GMTrace.o(16007343112192L, 119264);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16007477329920L, 119265);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16007477329920L, 119265);
      return 0;
      GMTrace.o(16007477329920L, 119265);
      return 60;
      GMTrace.o(16007477329920L, 119265);
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 4.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Object localObject3 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject3).setColor(-1);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(15.0F, 1.0F);
      localPath.cubicTo(15.0F, 0.44771522F, 15.447715F, 0.0F, 16.0F, 0.0F);
      localPath.lineTo(32.0F, 0.0F);
      localPath.cubicTo(32.552284F, 0.0F, 33.0F, 0.44771522F, 33.0F, 1.0F);
      localPath.lineTo(33.0F, 6.0F);
      localPath.cubicTo(33.0F, 6.5522847F, 32.552284F, 7.0F, 32.0F, 7.0F);
      localPath.lineTo(16.0F, 7.0F);
      localPath.cubicTo(15.447715F, 7.0F, 15.0F, 6.5522847F, 15.0F, 6.0F);
      localPath.lineTo(15.0F, 1.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setColor(-1);
      localPaint2.setStrokeWidth(4.5F);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(7.25F, 8.25F);
      ((Path)localObject3).lineTo(40.75F, 8.25F);
      ((Path)localObject3).lineTo(40.75F, 50.75F);
      ((Path)localObject3).lineTo(7.25F, 50.75F);
      ((Path)localObject3).lineTo(7.25F, 8.25F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 17.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 1.0F);
      ((Path)localObject2).cubicTo(0.0F, 0.44771522F, 0.44771522F, -2.6645353E-15F, 1.0F, -2.6645353E-15F);
      ((Path)localObject2).lineTo(2.0F, -2.6645353E-15F);
      ((Path)localObject2).cubicTo(2.5522847F, -2.6645353E-15F, 3.0F, 0.44771522F, 3.0F, 1.0F);
      ((Path)localObject2).lineTo(3.0F, 21.0F);
      ((Path)localObject2).cubicTo(3.0F, 21.552284F, 2.5522847F, 22.0F, 2.0F, 22.0F);
      ((Path)localObject2).lineTo(1.0F, 22.0F);
      ((Path)localObject2).cubicTo(0.44771522F, 22.0F, 0.0F, 21.552284F, 0.0F, 21.0F);
      ((Path)localObject2).lineTo(0.0F, 1.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(11.998957F, -1.7763568E-15F);
      ((Path)localObject2).cubicTo(11.447248F, -1.7763568E-15F, 11.0F, 0.43945834F, 11.0F, 1.0024617F);
      ((Path)localObject2).lineTo(11.0F, 20.997538F);
      ((Path)localObject2).cubicTo(11.0F, 21.551182F, 11.44266F, 22.0F, 11.998957F, 22.0F);
      ((Path)localObject2).lineTo(13.001043F, 22.0F);
      ((Path)localObject2).cubicTo(13.552752F, 22.0F, 14.0F, 21.560541F, 14.0F, 20.997538F);
      ((Path)localObject2).lineTo(14.0F, 1.0024617F);
      ((Path)localObject2).cubicTo(14.0F, 0.44881737F, 13.55734F, -1.7763568E-15F, 13.001043F, -1.7763568E-15F);
      ((Path)localObject2).lineTo(11.998957F, -1.7763568E-15F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(0.0F, 7.0F);
      ((Path)localObject1).cubicTo(0.0F, 6.4477153F, 0.44771522F, 6.0F, 1.0F, 6.0F);
      ((Path)localObject1).lineTo(47.0F, 6.0F);
      ((Path)localObject1).cubicTo(47.552284F, 6.0F, 48.0F, 6.4477153F, 48.0F, 7.0F);
      ((Path)localObject1).lineTo(48.0F, 8.0F);
      ((Path)localObject1).cubicTo(48.0F, 8.552285F, 47.552284F, 9.0F, 47.0F, 9.0F);
      ((Path)localObject1).lineTo(1.0F, 9.0F);
      ((Path)localObject1).cubicTo(0.44771522F, 9.0F, 0.0F, 8.552285F, 0.0F, 8.0F);
      ((Path)localObject1).lineTo(0.0F, 7.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ahl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */