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

public final class ahm
  extends c
{
  private final int height;
  private final int width;
  
  public ahm()
  {
    GMTrace.i(16007074676736L, 119262);
    this.width = 72;
    this.height = 72;
    GMTrace.o(16007074676736L, 119262);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16007208894464L, 119263);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16007208894464L, 119263);
      return 0;
      GMTrace.o(16007208894464L, 119263);
      return 72;
      GMTrace.o(16007208894464L, 119263);
      return 72;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localPaint.setStrokeWidth(4.5F);
      Object localObject4 = c.i(paramVarArgs);
      ((Path)localObject4).moveTo(7.25F, 23.25F);
      ((Path)localObject4).lineTo(40.75F, 23.25F);
      ((Path)localObject4).lineTo(40.75F, 65.75F);
      ((Path)localObject4).lineTo(7.25F, 65.75F);
      ((Path)localObject4).lineTo(7.25F, 23.25F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 17.0F, 0.0F, 1.0F, 32.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject4 = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 1.0F);
      localPath.cubicTo(0.0F, 0.44771522F, 0.44771522F, -2.6645353E-15F, 1.0F, -2.6645353E-15F);
      localPath.lineTo(2.0F, -2.6645353E-15F);
      localPath.cubicTo(2.5522847F, -2.6645353E-15F, 3.0F, 0.44771522F, 3.0F, 1.0F);
      localPath.lineTo(3.0F, 21.0F);
      localPath.cubicTo(3.0F, 21.552284F, 2.5522847F, 22.0F, 2.0F, 22.0F);
      localPath.lineTo(1.0F, 22.0F);
      localPath.cubicTo(0.44771522F, 22.0F, 0.0F, 21.552284F, 0.0F, 21.0F);
      localPath.lineTo(0.0F, 1.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject4 = c.i(paramVarArgs);
      ((Path)localObject4).moveTo(11.998957F, -1.7763568E-15F);
      ((Path)localObject4).cubicTo(11.447248F, -1.7763568E-15F, 11.0F, 0.43945834F, 11.0F, 1.0024617F);
      ((Path)localObject4).lineTo(11.0F, 20.997538F);
      ((Path)localObject4).cubicTo(11.0F, 21.551182F, 11.44266F, 22.0F, 11.998957F, 22.0F);
      ((Path)localObject4).lineTo(13.001043F, 22.0F);
      ((Path)localObject4).cubicTo(13.552752F, 22.0F, 14.0F, 21.560541F, 14.0F, 20.997538F);
      ((Path)localObject4).lineTo(14.0F, 1.0024617F);
      ((Path)localObject4).cubicTo(14.0F, 0.44881737F, 13.55734F, -1.7763568E-15F, 13.001043F, -1.7763568E-15F);
      ((Path)localObject4).lineTo(11.998957F, -1.7763568E-15F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setColor(-1);
      localObject4 = c.i(paramVarArgs);
      ((Path)localObject4).moveTo(0.0F, 22.0F);
      ((Path)localObject4).cubicTo(0.0F, 21.447716F, 0.44771522F, 21.0F, 1.0F, 21.0F);
      ((Path)localObject4).lineTo(47.0F, 21.0F);
      ((Path)localObject4).cubicTo(47.552284F, 21.0F, 48.0F, 21.447716F, 48.0F, 22.0F);
      ((Path)localObject4).lineTo(48.0F, 23.0F);
      ((Path)localObject4).cubicTo(48.0F, 23.552284F, 47.552284F, 24.0F, 47.0F, 24.0F);
      ((Path)localObject4).lineTo(1.0F, 24.0F);
      ((Path)localObject4).cubicTo(0.44771522F, 24.0F, 0.0F, 23.552284F, 0.0F, 23.0F);
      ((Path)localObject4).lineTo(0.0F, 22.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 0.9659258F, -0.25881904F, 3.58819F, 0.25881904F, 0.9659258F, -2.3841858E-7F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(15.0F, 1.0F);
      ((Path)localObject3).cubicTo(15.0F, 0.44771522F, 15.447715F, -6.82121E-13F, 16.0F, -6.82121E-13F);
      ((Path)localObject3).lineTo(32.0F, -6.82121E-13F);
      ((Path)localObject3).cubicTo(32.552284F, -6.82121E-13F, 33.0F, 0.44771522F, 33.0F, 1.0F);
      ((Path)localObject3).lineTo(33.0F, 6.0F);
      ((Path)localObject3).cubicTo(33.0F, 6.5522847F, 32.552284F, 7.0F, 32.0F, 7.0F);
      ((Path)localObject3).lineTo(16.0F, 7.0F);
      ((Path)localObject3).cubicTo(15.447715F, 7.0F, 15.0F, 6.5522847F, 15.0F, 6.0F);
      ((Path)localObject3).lineTo(15.0F, 1.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(-4.5474735E-13F, 7.0F);
      ((Path)localObject2).cubicTo(-4.5474735E-13F, 6.4477153F, 0.44771522F, 6.0F, 1.0F, 6.0F);
      ((Path)localObject2).lineTo(47.0F, 6.0F);
      ((Path)localObject2).cubicTo(47.552284F, 6.0F, 48.0F, 6.4477153F, 48.0F, 7.0F);
      ((Path)localObject2).lineTo(48.0F, 9.0F);
      ((Path)localObject2).cubicTo(48.0F, 9.552285F, 47.552284F, 10.0F, 47.0F, 10.0F);
      ((Path)localObject2).lineTo(1.0F, 10.0F);
      ((Path)localObject2).cubicTo(0.44771522F, 10.0F, -4.5474735E-13F, 9.552285F, -4.5474735E-13F, 9.0F);
      ((Path)localObject2).lineTo(-4.5474735E-13F, 7.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ahm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */