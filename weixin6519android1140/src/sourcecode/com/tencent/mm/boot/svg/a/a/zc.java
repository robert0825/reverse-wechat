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

public final class zc
  extends c
{
  private final int height;
  private final int width;
  
  public zc()
  {
    GMTrace.i(16432142221312L, 122429);
    this.width = 210;
    this.height = 210;
    GMTrace.o(16432142221312L, 122429);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16432276439040L, 122430);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16432276439040L, 122430);
      return 0;
      GMTrace.o(16432276439040L, 122430);
      return 210;
      GMTrace.o(16432276439040L, 122430);
      return 210;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -335.0F, 0.0F, 1.0F, -284.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 335.0F, 0.0F, 1.0F, 284.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-2565928);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 12.0F);
      ((Path)localObject2).cubicTo(0.0F, 5.3725824F, 5.3725824F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject2).lineTo(198.0F, 0.0F);
      ((Path)localObject2).cubicTo(204.62741F, 0.0F, 210.0F, 5.3725824F, 210.0F, 12.0F);
      ((Path)localObject2).lineTo(210.0F, 198.0F);
      ((Path)localObject2).cubicTo(210.0F, 204.62741F, 204.62741F, 210.0F, 198.0F, 210.0F);
      ((Path)localObject2).lineTo(12.0F, 210.0F);
      ((Path)localObject2).cubicTo(5.3725824F, 210.0F, 0.0F, 204.62741F, 0.0F, 198.0F);
      ((Path)localObject2).lineTo(0.0F, 12.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(157.64894F, 92.3088F);
      ((Path)localObject1).lineTo(144.74844F, 105.2093F);
      ((Path)localObject1).lineTo(138.95433F, 99.41519F);
      ((Path)localObject1).lineTo(151.85483F, 86.514694F);
      ((Path)localObject1).cubicTo(159.84056F, 78.52897F, 159.70537F, 65.69745F, 151.70346F, 57.695538F);
      ((Path)localObject1).cubicTo(143.70525F, 49.697327F, 130.86548F, 49.56299F, 122.88431F, 57.544167F);
      ((Path)localObject1).lineTo(97.083305F, 83.34517F);
      ((Path)localObject1).cubicTo(89.09758F, 91.33089F, 89.232765F, 104.162415F, 97.23468F, 112.16432F);
      ((Path)localObject1).lineTo(91.50112F, 117.89788F);
      ((Path)localObject1).cubicTo(80.298676F, 106.695435F, 80.20087F, 88.6394F, 91.2892F, 77.55106F);
      ((Path)localObject1).lineTo(117.0902F, 51.75006F);
      ((Path)localObject1).cubicTo(128.17189F, 40.668373F, 146.23703F, 40.761997F, 157.43701F, 51.961983F);
      ((Path)localObject1).cubicTo(168.63947F, 63.16443F, 168.73727F, 81.22047F, 157.64894F, 92.3088F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(51.753483F, 117.08678F);
      ((Path)localObject1).lineTo(64.653984F, 104.18628F);
      ((Path)localObject1).lineTo(70.44809F, 109.980385F);
      ((Path)localObject1).lineTo(57.54759F, 122.88088F);
      ((Path)localObject1).cubicTo(49.56187F, 130.86661F, 49.697052F, 143.69812F, 57.698963F, 151.70004F);
      ((Path)localObject1).cubicTo(65.697174F, 159.69824F, 78.53694F, 159.83258F, 86.51812F, 151.85141F);
      ((Path)localObject1).lineTo(112.31912F, 126.05041F);
      ((Path)localObject1).cubicTo(120.30484F, 118.06469F, 120.16966F, 105.23316F, 112.16775F, 97.231255F);
      ((Path)localObject1).lineTo(117.901306F, 91.497696F);
      ((Path)localObject1).cubicTo(129.10376F, 102.70014F, 129.20155F, 120.75618F, 118.11323F, 131.84451F);
      ((Path)localObject1).lineTo(92.312225F, 157.64552F);
      ((Path)localObject1).cubicTo(81.23054F, 168.7272F, 63.165394F, 168.63358F, 51.965405F, 157.4336F);
      ((Path)localObject1).cubicTo(40.76296F, 146.23114F, 40.665154F, 128.17511F, 51.753483F, 117.08678F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */