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

public final class anr
  extends c
{
  private final int height;
  private final int width;
  
  public anr()
  {
    GMTrace.i(17570711207936L, 130912);
    this.width = 540;
    this.height = 696;
    GMTrace.o(17570711207936L, 130912);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17570845425664L, 130913);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17570845425664L, 130913);
      return 0;
      GMTrace.o(17570845425664L, 130913);
      return 540;
      GMTrace.o(17570845425664L, 130913);
      return 696;
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
      localCanvas.saveLayerAlpha(null, 51, 4);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 0.70710677F, 0.70710677F, 0.10347748F, -0.70710677F, 0.70710677F, 314.05887F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(338.17682F, 421.62106F);
      ((Path)localObject1).lineTo(105.54254F, 421.62106F);
      ((Path)localObject1).cubicTo(69.57901F, 369.38614F, -1.5916157E-12F, 314.71432F, -1.5916157E-12F, 224.86458F);
      ((Path)localObject1).cubicTo(-1.5916157E-12F, 100.6753F, 99.32996F, 1.3195332E-12F, 221.85968F, 1.364242E-12F);
      ((Path)localObject1).cubicTo(344.3894F, 1.3704833E-12F, 443.71936F, 100.6753F, 443.71936F, 224.86458F);
      ((Path)localObject1).cubicTo(443.71936F, 314.71432F, 374.14035F, 369.38614F, 338.17682F, 421.62106F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(144.20879F, 451.20853F);
      ((Path)localObject1).lineTo(299.51056F, 451.20853F);
      ((Path)localObject1).cubicTo(305.63705F, 451.20853F, 310.60355F, 456.17606F, 310.60355F, 462.3038F);
      ((Path)localObject1).lineTo(310.60355F, 469.70065F);
      ((Path)localObject1).cubicTo(310.60355F, 475.82843F, 305.63705F, 480.79596F, 299.51056F, 480.79596F);
      ((Path)localObject1).lineTo(144.20879F, 480.79596F);
      ((Path)localObject1).cubicTo(138.0823F, 480.79596F, 133.11581F, 475.82843F, 133.11581F, 469.70065F);
      ((Path)localObject1).lineTo(133.11581F, 462.3038F);
      ((Path)localObject1).cubicTo(133.11581F, 456.17606F, 138.0823F, 451.20853F, 144.20879F, 451.20853F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(166.39476F, 510.3834F);
      ((Path)localObject1).lineTo(277.3246F, 510.3834F);
      ((Path)localObject1).cubicTo(283.45108F, 510.3834F, 288.41757F, 515.35095F, 288.41757F, 521.4787F);
      ((Path)localObject1).lineTo(288.41757F, 528.87555F);
      ((Path)localObject1).cubicTo(288.41757F, 535.0033F, 283.45108F, 539.9708F, 277.3246F, 539.9708F);
      ((Path)localObject1).lineTo(166.39476F, 539.9708F);
      ((Path)localObject1).cubicTo(160.26828F, 539.9708F, 155.30177F, 535.0033F, 155.30177F, 528.87555F);
      ((Path)localObject1).lineTo(155.30177F, 521.4787F);
      ((Path)localObject1).cubicTo(155.30177F, 515.35095F, 160.26828F, 510.3834F, 166.39476F, 510.3834F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(228.58931F, 274.01355F);
      ((Path)localObject1).cubicTo(234.95694F, 286.75146F, 253.13435F, 286.75146F, 259.50198F, 274.01355F);
      ((Path)localObject1).lineTo(288.41757F, 216.17035F);
      ((Path)localObject1).lineTo(317.33316F, 274.01355F);
      ((Path)localObject1).cubicTo(321.60043F, 282.54987F, 331.97977F, 286.0106F, 340.51608F, 281.74335F);
      ((Path)localObject1).cubicTo(349.0524F, 277.47607F, 352.51312F, 267.09674F, 348.24585F, 258.56042F);
      ((Path)localObject1).lineTo(303.87393F, 169.7981F);
      ((Path)localObject1).cubicTo(297.5063F, 157.06018F, 279.32886F, 157.06018F, 272.96124F, 169.7981F);
      ((Path)localObject1).lineTo(244.04565F, 227.64131F);
      ((Path)localObject1).lineTo(215.13005F, 169.7981F);
      ((Path)localObject1).cubicTo(208.76242F, 157.06018F, 190.58499F, 157.06018F, 184.21736F, 169.7981F);
      ((Path)localObject1).lineTo(155.30177F, 227.64131F);
      ((Path)localObject1).lineTo(126.386185F, 169.7981F);
      ((Path)localObject1).cubicTo(122.11892F, 161.2618F, 111.73958F, 157.80106F, 103.20328F, 162.06831F);
      ((Path)localObject1).cubicTo(94.66697F, 166.33559F, 91.20623F, 176.71492F, 95.473495F, 185.25122F);
      ((Path)localObject1).lineTo(139.84543F, 274.01355F);
      ((Path)localObject1).cubicTo(146.21306F, 286.75146F, 164.39049F, 286.75146F, 170.75812F, 274.01355F);
      ((Path)localObject1).lineTo(199.6737F, 216.17035F);
      ((Path)localObject1).lineTo(228.58931F, 274.01355F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 127, 4);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\anr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */