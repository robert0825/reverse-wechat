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

public final class tb
  extends c
{
  private final int height;
  private final int width;
  
  public tb()
  {
    GMTrace.i(15795950190592L, 117689);
    this.width = 240;
    this.height = 175;
    GMTrace.o(15795950190592L, 117689);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15796084408320L, 117690);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15796084408320L, 117690);
      return 0;
      GMTrace.o(15796084408320L, 117690);
      return 240;
      GMTrace.o(15796084408320L, 117690);
      return 175;
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
      localPaint.setColor(-7829368);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(203.52F, 57.660694F);
      ((Path)localObject).lineTo(203.52F, 15.384615F);
      ((Path)localObject).lineTo(15.36F, 15.384615F);
      ((Path)localObject).lineTo(15.36F, 105.37835F);
      ((Path)localObject).lineTo(74.236595F, 50.650925F);
      ((Path)localObject).lineTo(125.95681F, 97.89139F);
      ((Path)localObject).cubicTo(122.740204F, 105.88419F, 120.96F, 114.66317F, 120.96F, 123.90788F);
      ((Path)localObject).cubicTo(120.96F, 141.31677F, 127.86343F, 157.30098F, 139.04478F, 169.23077F);
      ((Path)localObject).lineTo(11.193079F, 169.23077F);
      ((Path)localObject).cubicTo(5.0091143F, 169.23077F, 0.0F, 164.20079F, 0.0F, 157.996F);
      ((Path)localObject).lineTo(0.0F, 11.234769F);
      ((Path)localObject).cubicTo(0.0F, 5.018827F, 5.0113125F, 0.0F, 11.193079F, 0.0F);
      ((Path)localObject).lineTo(207.68692F, 0.0F);
      ((Path)localObject).cubicTo(213.87088F, 0.0F, 218.88F, 5.0299807F, 218.88F, 11.234769F);
      ((Path)localObject).lineTo(218.88F, 63.36721F);
      ((Path)localObject).cubicTo(214.07797F, 60.88269F, 208.93094F, 58.95344F, 203.52F, 57.660694F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(240.0F, 123.71794F);
      ((Path)localObject).cubicTo(240.0F, 151.75385F, 216.79105F, 175.0F, 187.52F, 175.0F);
      ((Path)localObject).cubicTo(159.52896F, 175.0F, 136.32F, 151.75385F, 136.32F, 123.71794F);
      ((Path)localObject).cubicTo(136.32F, 94.4F, 159.52896F, 71.15385F, 187.52F, 71.15385F);
      ((Path)localObject).cubicTo(216.79105F, 71.15385F, 240.0F, 94.4F, 240.0F, 123.71794F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(185.67625F, 92.14744F);
      ((Path)localObject).cubicTo(185.58711F, 92.14744F, 185.49799F, 92.15041F, 185.40904F, 92.15637F);
      ((Path)localObject).cubicTo(183.20485F, 92.30395F, 181.53761F, 94.210434F, 181.68518F, 96.41464F);
      ((Path)localObject).lineTo(183.95256F, 130.28104F);
      ((Path)localObject).cubicTo(184.02289F, 131.33139F, 184.89539F, 132.14743F, 185.9481F, 132.14743F);
      ((Path)localObject).lineTo(191.13371F, 132.14743F);
      ((Path)localObject).cubicTo(192.18643F, 132.14743F, 193.05893F, 131.33139F, 193.12926F, 130.28104F);
      ((Path)localObject).lineTo(195.39664F, 96.41464F);
      ((Path)localObject).cubicTo(195.40259F, 96.3257F, 195.40556F, 96.23658F, 195.40556F, 96.14744F);
      ((Path)localObject).cubicTo(195.40556F, 93.93829F, 193.6147F, 92.14744F, 191.40556F, 92.14744F);
      ((Path)localObject).lineTo(185.67625F, 92.14744F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(188.16F, 155.76923F);
      ((Path)localObject).cubicTo(192.40155F, 155.76923F, 195.84F, 152.32527F, 195.84F, 148.07692F);
      ((Path)localObject).cubicTo(195.84F, 143.82858F, 192.40155F, 140.38461F, 188.16F, 140.38461F);
      ((Path)localObject).cubicTo(183.91846F, 140.38461F, 180.48F, 143.82858F, 180.48F, 148.07692F);
      ((Path)localObject).cubicTo(180.48F, 152.32527F, 183.91846F, 155.76923F, 188.16F, 155.76923F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */