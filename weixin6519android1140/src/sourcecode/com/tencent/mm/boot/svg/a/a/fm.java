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

public final class fm
  extends c
{
  private final int height;
  private final int width;
  
  public fm()
  {
    GMTrace.i(21021717430272L, 156624);
    this.width = 120;
    this.height = 120;
    GMTrace.o(21021717430272L, 156624);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21021851648000L, 156625);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21021851648000L, 156625);
      return 0;
      GMTrace.o(21021851648000L, 156625);
      return 120;
      GMTrace.o(21021851648000L, 156625);
      return 120;
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
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-15683841);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(115.8F, 60.68889F);
      localPath.cubicTo(115.8F, 29.181868F, 90.81813F, 4.2F, 59.31111F, 4.2F);
      localPath.cubicTo(29.181868F, 4.2F, 4.2F, 29.181868F, 4.2F, 60.68889F);
      localPath.cubicTo(4.2F, 90.81813F, 29.181868F, 115.8F, 59.31111F, 115.8F);
      localPath.cubicTo(90.81813F, 115.8F, 115.8F, 90.81813F, 115.8F, 60.68889F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(62.12374F, 65.15995F);
      ((Path)localObject).lineTo(60.59251F, 27.389608F);
      ((Path)localObject).cubicTo(60.57021F, 26.839443F, 60.108807F, 26.4F, 59.561615F, 26.4F);
      ((Path)localObject).lineTo(55.54317F, 26.4F);
      ((Path)localObject).cubicTo(55.00337F, 26.4F, 54.53443F, 26.843063F, 54.51227F, 27.389608F);
      ((Path)localObject).lineTo(52.833233F, 68.80597F);
      ((Path)localObject).cubicTo(52.807594F, 69.43838F, 53.077152F, 69.998924F, 53.51898F, 70.363365F);
      ((Path)localObject).cubicTo(53.700817F, 70.78672F, 54.031994F, 71.146774F, 54.481876F, 71.3614F);
      ((Path)localObject).lineTo(81.584015F, 84.290726F);
      ((Path)localObject).cubicTo(82.09355F, 84.5338F, 82.71503F, 84.33845F, 82.98967F, 83.862755F);
      ((Path)localObject).lineTo(84.3951F, 81.42847F);
      ((Path)localObject).cubicTo(84.6709F, 80.95077F, 84.51857F, 80.31419F, 84.05744F, 80.00215F);
      ((Path)localObject).lineTo(62.12374F, 65.15995F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */