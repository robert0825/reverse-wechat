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

public final class aag
  extends c
{
  private final int height;
  private final int width;
  
  public aag()
  {
    GMTrace.i(15794876448768L, 117681);
    this.width = 73;
    this.height = 73;
    GMTrace.o(15794876448768L, 117681);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15795010666496L, 117682);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15795010666496L, 117682);
      return 0;
      GMTrace.o(15795010666496L, 117682);
      return 73;
      GMTrace.o(15795010666496L, 117682);
      return 73;
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
      ((Path)localObject).moveTo(54.0F, 36.33741F);
      ((Path)localObject).lineTo(54.0F, 15.0F);
      ((Path)localObject).lineTo(20.0F, 15.0F);
      ((Path)localObject).lineTo(20.0F, 57.0F);
      ((Path)localObject).lineTo(54.0F, 57.0F);
      ((Path)localObject).lineTo(54.0F, 40.860947F);
      ((Path)localObject).cubicTo(46.617874F, 45.131622F, 36.955612F, 50.721386F, 36.955612F, 50.721386F);
      ((Path)localObject).lineTo(36.77752F, 50.824207F);
      ((Path)localObject).cubicTo(36.557053F, 50.935654F, 36.30878F, 51.0F, 36.04528F, 51.0F);
      ((Path)localObject).cubicTo(35.43552F, 51.0F, 34.90521F, 50.66301F, 34.626484F, 50.16615F);
      ((Path)localObject).lineTo(34.51989F, 49.93198F);
      ((Path)localObject).lineTo(30.078123F, 40.165905F);
      ((Path)localObject).cubicTo(30.029793F, 40.059105F, 30.0F, 39.939034F, 30.0F, 39.82228F);
      ((Path)localObject).cubicTo(30.0F, 39.37252F, 30.364134F, 39.007004F, 30.813673F, 39.007004F);
      ((Path)localObject).cubicTo(30.996403F, 39.007004F, 31.164566F, 39.06737F, 31.300287F, 39.168865F);
      ((Path)localObject).lineTo(36.541824F, 42.90826F);
      ((Path)localObject).cubicTo(36.92516F, 43.159676F, 37.38264F, 43.306942F, 37.874554F, 43.306942F);
      ((Path)localObject).cubicTo(38.167847F, 43.306942F, 38.4479F, 43.251884F, 38.70875F, 43.157024F);
      ((Path)localObject).cubicTo(38.70875F, 43.157024F, 46.71709F, 39.585453F, 53.33591F, 36.633583F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(16.0F, 13.996532F);
      ((Path)localObject).cubicTo(16.0F, 12.341594F, 17.349846F, 11.0F, 19.003681F, 11.0F);
      ((Path)localObject).lineTo(54.99632F, 11.0F);
      ((Path)localObject).cubicTo(56.655205F, 11.0F, 58.0F, 12.337379F, 58.0F, 13.996532F);
      ((Path)localObject).lineTo(58.0F, 58.003468F);
      ((Path)localObject).cubicTo(58.0F, 59.658405F, 56.650154F, 61.0F, 54.99632F, 61.0F);
      ((Path)localObject).lineTo(19.003681F, 61.0F);
      ((Path)localObject).cubicTo(17.344793F, 61.0F, 16.0F, 59.66262F, 16.0F, 58.003468F);
      ((Path)localObject).lineTo(16.0F, 13.996532F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.0F, 21.0F);
      ((Path)localObject).lineTo(39.0F, 21.0F);
      ((Path)localObject).lineTo(39.0F, 24.0F);
      ((Path)localObject).lineTo(24.0F, 24.0F);
      ((Path)localObject).lineTo(24.0F, 21.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.0F, 28.0F);
      ((Path)localObject).lineTo(39.0F, 28.0F);
      ((Path)localObject).lineTo(39.0F, 31.0F);
      ((Path)localObject).lineTo(24.0F, 31.0F);
      ((Path)localObject).lineTo(24.0F, 28.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */