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

public final class xn
  extends c
{
  private final int height;
  private final int width;
  
  public xn()
  {
    GMTrace.i(15779844063232L, 117569);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15779844063232L, 117569);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15779978280960L, 117570);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15779978280960L, 117570);
      return 0;
      GMTrace.o(15779978280960L, 117570);
      return 108;
      GMTrace.o(15779978280960L, 117570);
      return 108;
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
      localPaint.setColor(-15683841);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(87.115F, 33.87689F);
      ((Path)localObject).cubicTo(87.115F, 30.632847F, 84.48362F, 28.0F, 81.23811F, 28.0F);
      ((Path)localObject).lineTo(26.876888F, 28.0F);
      ((Path)localObject).cubicTo(23.631376F, 28.0F, 21.0F, 30.632847F, 21.0F, 33.87689F);
      ((Path)localObject).lineTo(21.0F, 75.01658F);
      ((Path)localObject).cubicTo(21.0F, 78.26209F, 23.631376F, 80.892F, 26.876888F, 80.892F);
      ((Path)localObject).lineTo(81.23811F, 80.892F);
      ((Path)localObject).cubicTo(84.48362F, 80.892F, 87.115F, 78.26209F, 87.115F, 75.01658F);
      ((Path)localObject).lineTo(87.115F, 66.199776F);
      ((Path)localObject).lineTo(72.422775F, 66.199776F);
      ((Path)localObject).cubicTo(65.931755F, 66.199776F, 60.669F, 60.937023F, 60.669F, 54.446F);
      ((Path)localObject).cubicTo(60.669F, 47.954975F, 65.931755F, 42.692223F, 72.422775F, 42.692223F);
      ((Path)localObject).lineTo(87.115F, 42.692223F);
      ((Path)localObject).lineTo(87.115F, 33.87689F);
      ((Path)localObject).lineTo(87.115F, 33.87689F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(66.54589F, 54.446F);
      ((Path)localObject).cubicTo(66.54589F, 57.69298F, 69.17727F, 60.322887F, 72.422775F, 60.322887F);
      ((Path)localObject).cubicTo(75.66829F, 60.322887F, 78.29967F, 57.69298F, 78.29967F, 54.446F);
      ((Path)localObject).cubicTo(78.29967F, 51.20049F, 75.66829F, 48.56911F, 72.422775F, 48.56911F);
      ((Path)localObject).cubicTo(69.17727F, 48.56911F, 66.54589F, 51.20049F, 66.54589F, 54.446F);
      ((Path)localObject).lineTo(66.54589F, 54.446F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */