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

public final class kr
  extends c
{
  private final int height;
  private final int width;
  
  public kr()
  {
    GMTrace.i(15766422290432L, 117469);
    this.width = 162;
    this.height = 162;
    GMTrace.o(15766422290432L, 117469);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15766556508160L, 117470);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15766556508160L, 117470);
      return 0;
      GMTrace.o(15766556508160L, 117470);
      return 162;
      GMTrace.o(15766556508160L, 117470);
      return 162;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.333333F, 0.0F, 1.0F, 0.333333F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.6666667F, 80.666664F);
      ((Path)localObject2).cubicTo(0.6666667F, 36.554592F, 36.554333F, 0.6666667F, 80.666664F, 0.6666667F);
      ((Path)localObject2).cubicTo(124.779F, 0.6666667F, 160.66667F, 36.554592F, 160.66667F, 80.666664F);
      ((Path)localObject2).cubicTo(160.66667F, 124.77874F, 124.779F, 160.66667F, 80.666664F, 160.66667F);
      ((Path)localObject2).cubicTo(36.554333F, 160.66667F, 0.6666667F, 124.77874F, 0.6666667F, 80.666664F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-11711155);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(106.666664F, 96.666664F);
      ((Path)localObject2).cubicTo(106.666664F, 101.28787F, 104.28978F, 103.666664F, 99.666664F, 103.666664F);
      ((Path)localObject2).lineTo(60.666668F, 103.666664F);
      ((Path)localObject2).cubicTo(56.043552F, 103.666664F, 53.666668F, 101.28787F, 53.666668F, 96.666664F);
      ((Path)localObject2).lineTo(53.666668F, 57.666668F);
      ((Path)localObject2).lineTo(71.666664F, 57.666668F);
      ((Path)localObject2).lineTo(77.666664F, 64.666664F);
      ((Path)localObject2).lineTo(106.666664F, 64.666664F);
      ((Path)localObject2).lineTo(106.666664F, 98.666664F);
      ((Path)localObject2).lineTo(106.666664F, 96.666664F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(79.666664F, 61.666668F);
      ((Path)localObject2).lineTo(73.666664F, 54.666668F);
      ((Path)localObject2).lineTo(53.666668F, 54.666668F);
      ((Path)localObject2).cubicTo(52.0857F, 54.666668F, 50.666668F, 56.086094F, 50.666668F, 57.666668F);
      ((Path)localObject2).lineTo(50.666668F, 96.666664F);
      ((Path)localObject2).cubicTo(50.666668F, 102.8492F, 54.57398F, 106.666664F, 60.666668F, 106.666664F);
      ((Path)localObject2).lineTo(99.666664F, 106.666664F);
      ((Path)localObject2).cubicTo(105.75935F, 106.666664F, 109.666664F, 102.8492F, 109.666664F, 96.666664F);
      ((Path)localObject2).lineTo(109.666664F, 64.666664F);
      ((Path)localObject2).cubicTo(109.666664F, 62.701645F, 108.24101F, 61.27891F, 106.666664F, 61.666668F);
      ((Path)localObject2).lineTo(79.666664F, 61.666668F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-11711155);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(59.666668F, 78.666664F);
      ((Path)localObject1).lineTo(100.666664F, 78.666664F);
      ((Path)localObject1).lineTo(100.666664F, 75.666664F);
      ((Path)localObject1).lineTo(59.666668F, 75.666664F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\kr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */