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

public final class abe
  extends c
{
  private final int height;
  private final int width;
  
  public abe()
  {
    GMTrace.i(15872991166464L, 118263);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15872991166464L, 118263);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15873125384192L, 118264);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15873125384192L, 118264);
      return 0;
      GMTrace.o(15873125384192L, 118264);
      return 96;
      GMTrace.o(15873125384192L, 118264);
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
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(44.10407F, 48.572086F);
      ((Path)localObject).lineTo(20.999926F, 35.23115F);
      ((Path)localObject).cubicTo(19.958965F, 34.62973F, 19.004F, 35.25858F, 19.0F, 36.462433F);
      ((Path)localObject).lineTo(19.004F, 62.93198F);
      ((Path)localObject).cubicTo(19.0F, 64.13482F, 19.846968F, 65.615F, 20.88693F, 66.21947F);
      ((Path)localObject).lineTo(44.10907F, 79.74022F);
      ((Path)localObject).cubicTo(45.149033F, 80.345695F, 46.0F, 79.85603F, 46.0F, 78.65319F);
      ((Path)localObject).lineTo(46.0F, 51.85246F);
      ((Path)localObject).cubicTo(45.999F, 50.648605F, 45.14603F, 49.17249F, 44.10407F, 48.572086F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(73.216934F, 29.458399F);
      ((Path)localObject).lineTo(50.073246F, 16.4451F);
      ((Path)localObject).cubicTo(49.02697F, 15.856779F, 47.311195F, 15.850846F, 46.259857F, 16.432247F);
      ((Path)localObject).lineTo(22.789015F, 29.413904F);
      ((Path)localObject).cubicTo(21.738686F, 29.994316F, 21.73666F, 30.948486F, 22.784964F, 31.533842F);
      ((Path)localObject).lineTo(46.14338F, 44.56098F);
      ((Path)localObject).cubicTo(47.19168F, 45.14634F, 48.90745F, 45.14634F, 49.956768F, 44.56098F);
      ((Path)localObject).lineTo(73.21288F, 31.591192F);
      ((Path)localObject).cubicTo(74.261185F, 31.006824F, 74.2622F, 30.046722F, 73.216934F, 29.458399F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(76.997F, 36.350918F);
      ((Path)localObject).cubicTo(77.001F, 35.14774F, 76.151F, 34.6553F, 75.11F, 35.256382F);
      ((Path)localObject).lineTo(51.895F, 48.66497F);
      ((Path)localObject).cubicTo(50.853F, 49.267067F, 50.0F, 50.74337F, 50.0F, 51.94655F);
      ((Path)localObject).lineTo(50.0F, 78.64493F);
      ((Path)localObject).cubicTo(50.0F, 79.84912F, 50.854F, 80.34461F, 51.898F, 79.74556F);
      ((Path)localObject).lineTo(74.994F, 66.51567F);
      ((Path)localObject).cubicTo(76.037F, 65.91763F, 76.996F, 64.287F, 77.0F, 63.082806F);
      ((Path)localObject).lineTo(76.997F, 36.350918F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\abe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */