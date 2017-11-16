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

public final class we
  extends c
{
  private final int height;
  private final int width;
  
  public we()
  {
    GMTrace.i(15816888156160L, 117845);
    this.width = 138;
    this.height = 138;
    GMTrace.o(15816888156160L, 117845);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15817022373888L, 117846);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15817022373888L, 117846);
      return 0;
      GMTrace.o(15817022373888L, 117846);
      return 138;
      GMTrace.o(15817022373888L, 117846);
      return 138;
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
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(138.0F, 0.0F);
      localPath.lineTo(138.0F, 138.0F);
      localPath.lineTo(0.0F, 138.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(50.543278F, 90.04454F);
      ((Path)localObject).lineTo(53.041294F, 91.67629F);
      ((Path)localObject).cubicTo(57.280224F, 94.44525F, 62.87948F, 95.92082F, 69.52F, 95.92082F);
      ((Path)localObject).cubicTo(87.80456F, 95.92082F, 102.0F, 83.83496F, 102.0F, 68.50467F);
      ((Path)localObject).cubicTo(102.0F, 52.329258F, 87.46037F, 39.0F, 69.52F, 39.0F);
      ((Path)localObject).cubicTo(50.67776F, 39.0F, 36.0F, 52.210297F, 36.0F, 68.50467F);
      ((Path)localObject).cubicTo(36.0F, 73.42558F, 37.42558F, 77.22104F, 41.231678F, 82.927864F);
      ((Path)localObject).lineTo(42.85777F, 85.36601F);
      ((Path)localObject).lineTo(40.05615F, 93.80527F);
      ((Path)localObject).lineTo(50.543278F, 90.04454F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(35.2F, 101.92082F);
      ((Path)localObject).cubicTo(32.567047F, 102.34957F, 31.283272F, 100.9991F, 32.08F, 98.78806F);
      ((Path)localObject).lineTo(36.24F, 86.257F);
      ((Path)localObject).cubicTo(32.320972F, 80.380844F, 30.0F, 75.34051F, 30.0F, 68.50467F);
      ((Path)localObject).cubicTo(30.0F, 48.779522F, 47.46108F, 33.0F, 69.52F, 33.0F);
      ((Path)localObject).cubicTo(90.53892F, 33.0F, 108.0F, 48.779522F, 108.0F, 68.50467F);
      ((Path)localObject).cubicTo(108.0F, 87.70929F, 90.53892F, 101.92082F, 69.52F, 101.92082F);
      ((Path)localObject).cubicTo(61.798603F, 101.92082F, 55.05305F, 100.15708F, 49.76F, 96.69955F);
      ((Path)localObject).lineTo(35.2F, 101.92082F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\we.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */