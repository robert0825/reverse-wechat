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

public final class aly
  extends c
{
  private final int height;
  private final int width;
  
  public aly()
  {
    GMTrace.i(16770236678144L, 124948);
    this.width = 189;
    this.height = 189;
    GMTrace.o(16770236678144L, 124948);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16770370895872L, 124949);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16770370895872L, 124949);
      return 0;
      GMTrace.o(16770370895872L, 124949);
      return 189;
      GMTrace.o(16770370895872L, 124949);
      return 189;
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
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-13917627);
      localCanvas.save();
      localObject = c.a((Paint)localObject, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(94.5F, 0.45215607F);
      localPath.cubicTo(146.4412F, 0.45215607F, 188.54785F, 42.558807F, 188.54785F, 94.5F);
      localPath.cubicTo(188.54785F, 146.4412F, 146.4412F, 188.54785F, 94.5F, 188.54785F);
      localPath.cubicTo(42.558807F, 188.54785F, 0.45215607F, 146.4412F, 0.45215607F, 94.5F);
      localPath.cubicTo(0.45215607F, 42.558807F, 42.558807F, 0.45215607F, 94.5F, 0.45215607F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(73.00249F, 72.605316F);
      ((Path)localObject).lineTo(67.42785F, 69.406975F);
      ((Path)localObject).lineTo(64.84446F, 73.8535F);
      ((Path)localObject).cubicTo(56.051033F, 88.9887F, 59.218388F, 107.78604F, 71.60051F, 118.51587F);
      ((Path)localObject).lineTo(65.47644F, 129.0566F);
      ((Path)localObject).lineTo(76.6257F, 135.45328F);
      ((Path)localObject).lineTo(82.74977F, 124.91256F);
      ((Path)localObject).lineTo(82.74977F, 124.91256F);
      ((Path)localObject).cubicTo(98.29174F, 130.20367F, 116.257065F, 123.530815F, 125.05048F, 108.395615F);
      ((Path)localObject).lineTo(127.63388F, 103.94909F);
      ((Path)localObject).lineTo(122.05925F, 100.75075F);
      ((Path)localObject).lineTo(119.47585F, 105.19727F);
      ((Path)localObject).cubicTo(111.18062F, 119.475F, 93.6396F, 124.46423F, 80.63803F, 117.004814F);
      ((Path)localObject).cubicTo(66.5463F, 108.919945F, 62.12385F, 91.32957F, 70.41909F, 77.05184F);
      ((Path)localObject).lineTo(73.00249F, 72.605316F);
      ((Path)localObject).lineTo(73.00249F, 72.605316F);
      ((Path)localObject).lineTo(73.00249F, 72.605316F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(118.84387F, 49.994183F);
      ((Path)localObject).cubicTo(108.99176F, 44.341713F, 96.38864F, 47.70522F, 90.71172F, 57.476303F);
      ((Path)localObject).lineTo(77.0684F, 80.95914F);
      ((Path)localObject).cubicTo(71.383545F, 90.74387F, 74.75962F, 103.25695F, 84.61389F, 108.91067F);
      ((Path)localObject).cubicTo(94.466F, 114.56313F, 107.06912F, 111.19963F, 112.74604F, 101.42854F);
      ((Path)localObject).lineTo(126.38937F, 77.94571F);
      ((Path)localObject).cubicTo(132.07422F, 68.16097F, 128.69815F, 55.647892F, 118.84387F, 49.994183F);
      ((Path)localObject).lineTo(118.84387F, 49.994183F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(64.33125F, 132.80655F);
      ((Path)localObject).cubicTo(64.250336F, 131.96338F, 64.78417F, 131.62376F, 65.5296F, 132.05144F);
      ((Path)localObject).lineTo(73.98914F, 136.90495F);
      ((Path)localObject).cubicTo(74.731895F, 137.33109F, 74.702484F, 137.96323F, 73.93026F, 138.3138F);
      ((Path)localObject).lineTo(66.64218F, 141.62236F);
      ((Path)localObject).cubicTo(65.86691F, 141.9743F, 65.17252F, 141.57278F, 65.09193F, 140.73293F);
      ((Path)localObject).lineTo(64.33125F, 132.80655F);
      ((Path)localObject).lineTo(64.33125F, 132.80655F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */