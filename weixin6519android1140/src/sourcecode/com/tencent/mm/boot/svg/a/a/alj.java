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

public final class alj
  extends c
{
  private final int height;
  private final int width;
  
  public alj()
  {
    GMTrace.i(15794339577856L, 117677);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15794339577856L, 117677);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15794473795584L, 117678);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15794473795584L, 117678);
      return 0;
      GMTrace.o(15794473795584L, 117678);
      return 96;
      GMTrace.o(15794473795584L, 117678);
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
      localPaint.setColor(-9318371);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(47.999F, 15.0F);
      ((Path)localObject).cubicTo(29.773F, 15.0F, 15.0F, 29.774F, 15.0F, 48.0F);
      ((Path)localObject).cubicTo(15.0F, 66.226F, 29.773F, 81.0F, 47.999F, 81.0F);
      ((Path)localObject).cubicTo(66.225F, 81.0F, 81.0F, 66.226F, 81.0F, 48.0F);
      ((Path)localObject).cubicTo(81.0F, 29.774F, 66.225F, 15.0F, 47.999F, 15.0F);
      ((Path)localObject).lineTo(47.999F, 15.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(62.0F, 31.0F);
      ((Path)localObject).cubicTo(64.762F, 31.0F, 67.0F, 33.462F, 67.0F, 36.5F);
      ((Path)localObject).cubicTo(67.0F, 39.538F, 64.762F, 42.0F, 62.0F, 42.0F);
      ((Path)localObject).cubicTo(59.238F, 42.0F, 57.0F, 39.538F, 57.0F, 36.5F);
      ((Path)localObject).cubicTo(57.0F, 33.462F, 59.238F, 31.0F, 62.0F, 31.0F);
      ((Path)localObject).lineTo(62.0F, 31.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(35.0F, 31.0F);
      ((Path)localObject).cubicTo(37.762F, 31.0F, 40.0F, 33.462F, 40.0F, 36.5F);
      ((Path)localObject).cubicTo(40.0F, 39.538F, 37.762F, 42.0F, 35.0F, 42.0F);
      ((Path)localObject).cubicTo(32.238F, 42.0F, 30.0F, 39.538F, 30.0F, 36.5F);
      ((Path)localObject).cubicTo(30.0F, 33.462F, 32.238F, 31.0F, 35.0F, 31.0F);
      ((Path)localObject).lineTo(35.0F, 31.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 71.0F);
      ((Path)localObject).cubicTo(28.667F, 71.0F, 26.0F, 53.0F, 26.0F, 53.0F);
      ((Path)localObject).cubicTo(26.0F, 53.0F, 40.361F, 51.0F, 48.0F, 51.0F);
      ((Path)localObject).cubicTo(55.639F, 51.0F, 70.0F, 53.0F, 70.0F, 53.0F);
      ((Path)localObject).cubicTo(70.0F, 53.0F, 67.333F, 71.0F, 48.0F, 71.0F);
      ((Path)localObject).lineTo(48.0F, 71.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\alj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */