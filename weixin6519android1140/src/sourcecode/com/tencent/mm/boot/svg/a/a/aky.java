package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class aky
  extends c
{
  private final int height;
  private final int width;
  
  public aky()
  {
    GMTrace.i(16771310419968L, 124956);
    this.width = 96;
    this.height = 96;
    GMTrace.o(16771310419968L, 124956);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16771444637696L, 124957);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16771444637696L, 124957);
      return 0;
      GMTrace.o(16771444637696L, 124957);
      return 96;
      GMTrace.o(16771444637696L, 124957);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(96.0F, 0.0F);
      ((Path)localObject).lineTo(96.0F, 96.0F);
      ((Path)localObject).lineTo(0.0F, 96.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-15028967);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(49.161392F, 74.975655F);
      ((Path)localObject).cubicTo(39.768036F, 74.367F, 36.311947F, 66.23743F, 36.28125F, 60.92039F);
      ((Path)localObject).cubicTo(36.263256F, 57.915203F, 34.37908F, 55.430813F, 32.38482F, 52.801407F);
      ((Path)localObject).cubicTo(31.95294F, 52.23191F, 31.52212F, 51.664536F, 31.111412F, 51.092926F);
      ((Path)localObject).cubicTo(29.10233F, 48.29627F, 28.026867F, 44.694065F, 28.000404F, 40.67374F);
      ((Path)localObject).cubicTo(27.942184F, 31.61689F, 34.17796F, 23.572004F, 42.82929F, 21.543846F);
      ((Path)localObject).cubicTo(48.813137F, 20.142342F, 54.945175F, 21.479275F, 59.654556F, 25.21168F);
      ((Path)localObject).cubicTo(64.36076F, 28.943026F, 67.060005F, 34.524693F, 67.060005F, 40.524487F);
      ((Path)localObject).cubicTo(67.060005F, 44.38709F, 65.93056F, 48.12267F, 63.793392F, 51.32898F);
      ((Path)localObject).lineTo(62.913757F, 52.650036F);
      ((Path)localObject).lineTo(60.27062F, 50.889687F);
      ((Path)localObject).lineTo(61.15131F, 49.567574F);
      ((Path)localObject).cubicTo(62.93916F, 46.88524F, 63.884426F, 43.75726F, 63.884426F, 40.524487F);
      ((Path)localObject).cubicTo(63.884426F, 35.499607F, 61.623413F, 30.826162F, 57.681465F, 27.700302F);
      ((Path)localObject).cubicTo(53.738457F, 24.57444F, 48.58767F, 23.456623F, 43.55332F, 24.635836F);
      ((Path)localObject).cubicTo(36.332058F, 26.328436F, 31.12623F, 33.06391F, 31.175982F, 40.65257F);
      ((Path)localObject).cubicTo(31.19821F, 44.01131F, 32.06726F, 46.980507F, 33.69104F, 49.239426F);
      ((Path)localObject).cubicTo(34.08587F, 49.788807F, 34.49869F, 50.335014F, 34.914696F, 50.88228F);
      ((Path)localObject).cubicTo(37.031746F, 53.674698F, 39.43248F, 56.83867F, 39.45683F, 60.902393F);
      ((Path)localObject).cubicTo(39.477997F, 64.45273F, 41.575996F, 71.30147F, 49.365685F, 71.805336F);
      ((Path)localObject).cubicTo(54.184093F, 72.13348F, 57.47399F, 68.59373F, 58.239307F, 64.954475F);
      ((Path)localObject).cubicTo(59.367695F, 59.583458F, 56.01323F, 55.48586F, 49.036484F, 53.713867F);
      ((Path)localObject).lineTo(48.86077F, 53.657764F);
      ((Path)localObject).cubicTo(47.005173F, 52.947483F, 37.7526F, 48.977966F, 37.7526F, 40.524487F);
      ((Path)localObject).cubicTo(37.7526F, 34.676064F, 41.681847F, 30.746773F, 47.5302F, 30.746773F);
      ((Path)localObject).cubicTo(52.830242F, 30.746773F, 57.307804F, 35.22439F, 57.307804F, 40.524487F);
      ((Path)localObject).cubicTo(57.307804F, 42.870205F, 56.567894F, 44.732174F, 55.923252F, 46.092396F);
      ((Path)localObject).lineTo(55.242622F, 47.526714F);
      ((Path)localObject).lineTo(52.37296F, 46.166492F);
      ((Path)localObject).lineTo(53.05359F, 44.732174F);
      ((Path)localObject).cubicTo(53.587086F, 43.60695F, 54.13223F, 42.226616F, 54.13223F, 40.524487F);
      ((Path)localObject).cubicTo(54.13223F, 37.006966F, 51.046623F, 33.922386F, 47.5302F, 33.922386F);
      ((Path)localObject).cubicTo(43.395603F, 33.922386F, 40.928177F, 36.38984F, 40.928177F, 40.524487F);
      ((Path)localObject).cubicTo(40.928177F, 46.87148F, 48.669178F, 50.17094F, 49.912945F, 50.659985F);
      ((Path)localObject).cubicTo(62.740158F, 53.96368F, 61.909214F, 62.93267F, 61.347137F, 65.6076F);
      ((Path)localObject).cubicTo(60.1817F, 71.15539F, 55.447975F, 75.0F, 49.932F, 75.0F);
      ((Path)localObject).cubicTo(49.67689F, 75.0F, 49.41967F, 74.99153F, 49.161392F, 74.975655F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */