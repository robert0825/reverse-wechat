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

public final class hf
  extends c
{
  private final int height;
  private final int width;
  
  public hf()
  {
    GMTrace.i(15870575247360L, 118245);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15870575247360L, 118245);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15870709465088L, 118246);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15870709465088L, 118246);
      return 0;
      GMTrace.o(15870709465088L, 118246);
      return 96;
      GMTrace.o(15870709465088L, 118246);
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(48.0F, 72.0F);
      ((Path)localObject).cubicTo(34.745335F, 72.0F, 24.0F, 61.254665F, 24.0F, 48.0F);
      ((Path)localObject).cubicTo(24.0F, 34.745335F, 34.745335F, 24.0F, 48.0F, 24.0F);
      ((Path)localObject).cubicTo(61.254665F, 24.0F, 72.0F, 34.745335F, 72.0F, 48.0F);
      ((Path)localObject).cubicTo(72.0F, 61.254665F, 61.254665F, 72.0F, 48.0F, 72.0F);
      ((Path)localObject).moveTo(84.0F, 55.0F);
      ((Path)localObject).cubicTo(81.99446F, 53.280666F, 80.68781F, 51.20543F, 80.0F, 49.0F);
      ((Path)localObject).cubicTo(80.16416F, 45.77458F, 81.55951F, 43.011635F, 84.0F, 41.0F);
      ((Path)localObject).cubicTo(83.86168F, 41.38516F, 83.86033F, 41.374397F, 84.0F, 41.0F);
      ((Path)localObject).lineTo(84.0F, 41.0F);
      ((Path)localObject).cubicTo(84.53887F, 40.971813F, 84.63342F, 40.913532F, 85.0F, 41.0F);
      ((Path)localObject).lineTo(88.0F, 39.0F);
      ((Path)localObject).lineTo(76.0F, 18.0F);
      ((Path)localObject).lineTo(72.0F, 20.0F);
      ((Path)localObject).cubicTo(71.67275F, 20.391605F, 71.65744F, 20.37726F, 72.0F, 20.0F);
      ((Path)localObject).cubicTo(69.576805F, 21.307058F, 67.130554F, 21.391342F, 65.0F, 20.0F);
      ((Path)localObject).cubicTo(62.163757F, 19.135885F, 60.461334F, 16.563023F, 60.0F, 14.0F);
      ((Path)localObject).cubicTo(60.185326F, 13.773625F, 60.170918F, 13.76959F, 60.0F, 14.0F);
      ((Path)localObject).lineTo(60.0F, 9.0F);
      ((Path)localObject).lineTo(36.0F, 9.0F);
      ((Path)localObject).lineTo(36.0F, 14.0F);
      ((Path)localObject).cubicTo(35.82548F, 13.770487F, 35.80837F, 13.77766F, 36.0F, 14.0F);
      ((Path)localObject).cubicTo(35.57739F, 16.033117F, 34.42788F, 18.18098F, 32.0F, 20.0F);
      ((Path)localObject).cubicTo(29.993292F, 21.329027F, 26.91668F, 21.51418F, 24.0F, 20.0F);
      ((Path)localObject).cubicTo(24.35021F, 20.375916F, 24.330849F, 20.390709F, 24.0F, 20.0F);
      ((Path)localObject).lineTo(20.0F, 18.0F);
      ((Path)localObject).lineTo(8.0F, 39.0F);
      ((Path)localObject).lineTo(11.0F, 41.0F);
      ((Path)localObject).cubicTo(11.374231F, 40.91219F, 11.548482F, 41.0153F, 12.0F, 41.0F);
      ((Path)localObject).lineTo(12.0F, 41.0F);
      ((Path)localObject).cubicTo(12.142371F, 41.375294F, 12.141021F, 41.385605F, 12.0F, 41.0F);
      ((Path)localObject).cubicTo(13.99113F, 42.70454F, 15.286522F, 44.77081F, 16.0F, 47.0F);
      ((Path)localObject).cubicTo(15.808371F, 50.181038F, 14.4215765F, 52.935467F, 12.0F, 55.0F);
      ((Path)localObject).cubicTo(12.135167F, 54.580772F, 12.138319F, 54.608566F, 12.0F, 55.0F);
      ((Path)localObject).lineTo(8.0F, 57.0F);
      ((Path)localObject).lineTo(20.0F, 78.0F);
      ((Path)localObject).lineTo(23.0F, 76.0F);
      ((Path)localObject).cubicTo(23.531641F, 76.013664F, 23.863031F, 75.81821F, 24.0F, 76.0F);
      ((Path)localObject).lineTo(24.0F, 76.0F);
      ((Path)localObject).cubicTo(24.31194F, 75.59943F, 24.31599F, 75.60256F, 24.0F, 76.0F);
      ((Path)localObject).cubicTo(26.386726F, 74.657074F, 28.83838F, 74.571F, 31.0F, 76.0F);
      ((Path)localObject).cubicTo(33.82003F, 76.83273F, 35.52606F, 79.42039F, 36.0F, 82.0F);
      ((Path)localObject).cubicTo(35.799816F, 82.22503F, 35.820976F, 82.23399F, 36.0F, 82.0F);
      ((Path)localObject).lineTo(36.0F, 87.0F);
      ((Path)localObject).lineTo(60.0F, 87.0F);
      ((Path)localObject).lineTo(60.0F, 83.0F);
      ((Path)localObject).cubicTo(60.14255F, 83.06158F, 60.14075F, 82.77466F, 60.0F, 82.0F);
      ((Path)localObject).lineTo(60.0F, 82.0F);
      ((Path)localObject).cubicTo(60.163715F, 82.23399F, 60.170017F, 82.23131F, 60.0F, 82.0F);
      ((Path)localObject).cubicTo(60.378036F, 79.9624F, 61.531147F, 77.793465F, 64.0F, 76.0F);
      ((Path)localObject).cubicTo(65.9968F, 74.62345F, 69.09953F, 74.44592F, 72.0F, 76.0F);
      ((Path)localObject).cubicTo(71.6696F, 75.61646F, 71.682205F, 75.6075F, 72.0F, 76.0F);
      ((Path)localObject).lineTo(76.0F, 78.0F);
      ((Path)localObject).lineTo(88.0F, 57.0F);
      ((Path)localObject).lineTo(84.0F, 55.0F);
      ((Path)localObject).cubicTo(83.85628F, 54.618427F, 83.85808F, 54.603188F, 84.0F, 55.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */