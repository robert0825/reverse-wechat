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

public final class anq
  extends c
{
  private final int height;
  private final int width;
  
  public anq()
  {
    GMTrace.i(17580106448896L, 130982);
    this.width = 222;
    this.height = 265;
    GMTrace.o(17580106448896L, 130982);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17580240666624L, 130983);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17580240666624L, 130983);
      return 0;
      GMTrace.o(17580240666624L, 130983);
      return 222;
      GMTrace.o(17580240666624L, 130983);
      return 265;
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
      localCanvas.saveLayerAlpha(null, 25, 4);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 0.6293204F, -0.777146F, 114.51628F, 0.777146F, 0.6293204F, 1.1047013F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(129.8682F, 161.8563F);
      ((Path)localObject2).lineTo(40.530926F, 161.8563F);
      ((Path)localObject2).cubicTo(26.720047F, 141.8038F, 1.1368684E-12F, 120.81583F, 1.1368684E-12F, 86.32336F);
      ((Path)localObject2).cubicTo(1.1368684E-12F, 38.648285F, 38.14514F, -1.409827E-12F, 85.199554F, -1.3926638E-12F);
      ((Path)localObject2).cubicTo(132.25397F, -1.3902678E-12F, 170.39911F, 38.648285F, 170.39911F, 86.32336F);
      ((Path)localObject2).cubicTo(170.39911F, 120.81583F, 143.67906F, 141.8038F, 129.8682F, 161.8563F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(55.37971F, 173.21463F);
      ((Path)localObject2).lineTo(115.0194F, 173.21463F);
      ((Path)localObject2).cubicTo(117.37212F, 173.21463F, 119.27938F, 175.12161F, 119.27938F, 177.47401F);
      ((Path)localObject2).lineTo(119.27938F, 180.3136F);
      ((Path)localObject2).cubicTo(119.27938F, 182.66599F, 117.37212F, 184.57297F, 115.0194F, 184.57297F);
      ((Path)localObject2).lineTo(55.37971F, 184.57297F);
      ((Path)localObject2).cubicTo(53.026993F, 184.57297F, 51.11973F, 182.66599F, 51.11973F, 180.3136F);
      ((Path)localObject2).lineTo(51.11973F, 177.47401F);
      ((Path)localObject2).cubicTo(51.11973F, 175.12161F, 53.026993F, 173.21463F, 55.37971F, 173.21463F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(63.899666F, 195.9313F);
      ((Path)localObject2).lineTo(106.49944F, 195.9313F);
      ((Path)localObject2).cubicTo(108.852165F, 195.9313F, 110.75942F, 197.83829F, 110.75942F, 200.19069F);
      ((Path)localObject2).lineTo(110.75942F, 203.03027F);
      ((Path)localObject2).cubicTo(110.75942F, 205.38266F, 108.852165F, 207.28964F, 106.49944F, 207.28964F);
      ((Path)localObject2).lineTo(63.899666F, 207.28964F);
      ((Path)localObject2).cubicTo(61.546947F, 207.28964F, 59.63969F, 205.38266F, 59.63969F, 203.03027F);
      ((Path)localObject2).lineTo(59.63969F, 200.19069F);
      ((Path)localObject2).cubicTo(59.63969F, 197.83829F, 61.546947F, 195.9313F, 63.899666F, 195.9313F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(87.99253F, 105.08893F);
      ((Path)localObject2).cubicTo(90.35236F, 109.80792F, 97.08666F, 109.80792F, 99.446495F, 105.08893F);
      ((Path)localObject2).lineTo(110.75942F, 82.46626F);
      ((Path)localObject2).lineTo(122.07235F, 105.08893F);
      ((Path)localObject2).cubicTo(123.65404F, 108.25185F, 127.500305F, 109.5337F, 130.66322F, 107.95201F);
      ((Path)localObject2).cubicTo(133.82616F, 106.37032F, 135.108F, 102.524055F, 133.52632F, 99.36113F);
      ((Path)localObject2).lineTo(116.486404F, 65.286125F);
      ((Path)localObject2).cubicTo(114.12657F, 60.567127F, 107.39227F, 60.567127F, 105.03244F, 65.286125F);
      ((Path)localObject2).lineTo(93.71951F, 87.90878F);
      ((Path)localObject2).lineTo(82.406586F, 65.286125F);
      ((Path)localObject2).cubicTo(80.04675F, 60.567127F, 73.31245F, 60.567127F, 70.95262F, 65.286125F);
      ((Path)localObject2).lineTo(59.63969F, 87.90878F);
      ((Path)localObject2).lineTo(48.32676F, 65.286125F);
      ((Path)localObject2).cubicTo(46.745075F, 62.1232F, 42.898808F, 60.84135F, 39.73588F, 62.42304F);
      ((Path)localObject2).cubicTo(36.572956F, 64.00472F, 35.29111F, 67.85099F, 36.872795F, 71.013916F);
      ((Path)localObject2).lineTo(53.91271F, 105.08893F);
      ((Path)localObject2).cubicTo(56.272537F, 109.80792F, 63.00684F, 109.80792F, 65.36667F, 105.08893F);
      ((Path)localObject2).lineTo(76.6796F, 82.46626F);
      ((Path)localObject2).lineTo(87.99253F, 105.08893F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\anq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */