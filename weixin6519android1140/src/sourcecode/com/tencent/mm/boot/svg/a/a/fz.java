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

public final class fz
  extends c
{
  private final int height;
  private final int width;
  
  public fz()
  {
    GMTrace.i(15805613867008L, 117761);
    this.width = 144;
    this.height = 144;
    GMTrace.o(15805613867008L, 117761);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15805748084736L, 117762);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15805748084736L, 117762);
      return 0;
      GMTrace.o(15805748084736L, 117762);
      return 144;
      GMTrace.o(15805748084736L, 117762);
      return 144;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-9276814);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(15.052474F, 8.0F);
      ((Path)localObject).cubicTo(11.166417F, 8.0F, 8.0F, 11.165231F, 8.0F, 15.049831F);
      ((Path)localObject).lineTo(8.0F, 128.9022F);
      ((Path)localObject).cubicTo(8.0F, 132.78682F, 11.166417F, 135.95204F, 15.052474F, 135.95204F);
      ((Path)localObject).lineTo(76.365814F, 135.95204F);
      ((Path)localObject).lineTo(76.365814F, 86.41139F);
      ((Path)localObject).lineTo(59.670166F, 86.41139F);
      ((Path)localObject).lineTo(59.670166F, 67.084305F);
      ((Path)localObject).lineTo(76.365814F, 67.084305F);
      ((Path)localObject).lineTo(76.365814F, 52.840763F);
      ((Path)localObject).cubicTo(76.365814F, 36.295242F, 86.488754F, 27.32709F, 101.21739F, 27.32709F);
      ((Path)localObject).cubicTo(108.26987F, 27.32709F, 114.362816F, 27.854628F, 116.13793F, 28.094418F);
      ((Path)localObject).lineTo(116.13793F, 45.35931F);
      ((Path)localObject).lineTo(105.91904F, 45.35931F);
      ((Path)localObject).cubicTo(97.90704F, 45.35931F, 96.32384F, 49.147995F, 96.32384F, 54.759087F);
      ((Path)localObject).lineTo(96.32384F, 67.084305F);
      ((Path)localObject).lineTo(115.46627F, 67.084305F);
      ((Path)localObject).lineTo(112.97151F, 86.41139F);
      ((Path)localObject).lineTo(96.32384F, 86.41139F);
      ((Path)localObject).lineTo(96.32384F, 136.0F);
      ((Path)localObject).lineTo(128.94753F, 136.0F);
      ((Path)localObject).cubicTo(132.83359F, 136.0F, 136.0F, 132.83476F, 136.0F, 128.95016F);
      ((Path)localObject).lineTo(136.0F, 15.049831F);
      ((Path)localObject).cubicTo(136.0F, 11.117272F, 132.88156F, 8.0F, 128.94753F, 8.0F);
      ((Path)localObject).lineTo(15.052474F, 8.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */