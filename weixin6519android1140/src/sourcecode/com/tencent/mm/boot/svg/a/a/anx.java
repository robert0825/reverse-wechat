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

public final class anx
  extends c
{
  private final int height;
  private final int width;
  
  public anx()
  {
    GMTrace.i(15747631808512L, 117329);
    this.width = 132;
    this.height = 116;
    GMTrace.o(15747631808512L, 117329);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15747766026240L, 117330);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15747766026240L, 117330);
      return 0;
      GMTrace.o(15747766026240L, 117330);
      return 132;
      GMTrace.o(15747766026240L, 117330);
      return 116;
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
      localPaint.setColor(-15028967);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(48.0F, 73.0F);
      ((Path)localObject).cubicTo(47.41073F, 73.67583F, 46.739857F, 73.84797F, 46.0F, 74.0F);
      ((Path)localObject).cubicTo(44.37787F, 73.84797F, 42.943207F, 72.94284F, 42.0F, 71.0F);
      ((Path)localObject).lineTo(42.0F, 71.0F);
      ((Path)localObject).lineTo(30.0F, 45.0F);
      ((Path)localObject).cubicTo(29.756216F, 44.430573F, 29.674448F, 44.108505F, 30.0F, 44.0F);
      ((Path)localObject).cubicTo(29.674448F, 42.58331F, 30.659384F, 41.6023F, 32.0F, 41.0F);
      ((Path)localObject).cubicTo(32.369083F, 41.6023F, 32.824383F, 41.763332F, 33.0F, 42.0F);
      ((Path)localObject).lineTo(48.0F, 52.0F);
      ((Path)localObject).cubicTo(48.406815F, 52.767323F, 49.64449F, 53.16343F, 51.0F, 53.0F);
      ((Path)localObject).cubicTo(51.768604F, 53.16343F, 52.52682F, 53.01535F, 53.0F, 53.0F);
      ((Path)localObject).lineTo(120.0F, 23.0F);
      ((Path)localObject).cubicTo(107.96013F, 9.1696825F, 88.276276F, 0.0F, 66.0F, 0.0F);
      ((Path)localObject).cubicTo(29.548079F, 0.0F, 0.0F, 24.525291F, 0.0F, 54.0F);
      ((Path)localObject).cubicTo(0.0F, 71.28993F, 8.890441F, 86.14763F, 23.0F, 96.0F);
      ((Path)localObject).cubicTo(23.920935F, 96.98503F, 24.651274F, 98.28811F, 25.0F, 100.0F);
      ((Path)localObject).cubicTo(24.651274F, 100.24644F, 24.547205F, 100.69251F, 25.0F, 101.0F);
      ((Path)localObject).cubicTo(23.307673F, 105.28476F, 21.529213F, 111.89641F, 21.0F, 112.0F);
      ((Path)localObject).cubicTo(21.308067F, 112.72379F, 21.090637F, 113.264275F, 21.0F, 114.0F);
      ((Path)localObject).cubicTo(21.090637F, 115.01899F, 22.075573F, 116.0F, 23.0F, 116.0F);
      ((Path)localObject).cubicTo(23.768549F, 116.0F, 24.158806F, 115.8223F, 25.0F, 116.0F);
      ((Path)localObject).lineTo(39.0F, 107.0F);
      ((Path)localObject).cubicTo(40.09804F, 106.65818F, 41.248375F, 106.271324F, 42.0F, 106.0F);
      ((Path)localObject).cubicTo(43.19037F, 106.271324F, 43.84266F, 106.37498F, 45.0F, 106.0F);
      ((Path)localObject).cubicTo(51.198086F, 108.492485F, 58.469887F, 109.56605F, 66.0F, 110.0F);
      ((Path)localObject).cubicTo(102.450066F, 109.56605F, 132.0F, 85.0389F, 132.0F, 54.0F);
      ((Path)localObject).cubicTo(132.0F, 45.617043F, 129.27563F, 36.987843F, 124.0F, 29.0F);
      ((Path)localObject).lineTo(48.0F, 73.0F);
      ((Path)localObject).lineTo(48.0F, 73.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\anx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */