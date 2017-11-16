package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ji
  extends c
{
  private final int height;
  private final int width;
  
  public ji()
  {
    GMTrace.i(15768301338624L, 117483);
    this.width = 10;
    this.height = 56;
    GMTrace.o(15768301338624L, 117483);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15768435556352L, 117484);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15768435556352L, 117484);
      return 0;
      GMTrace.o(15768435556352L, 117484);
      return 10;
      GMTrace.o(15768435556352L, 117484);
      return 56;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-3684404);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -273.0F, 0.0F, 1.0F, -165.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(278.0F, 175.0F);
      ((Path)localObject2).cubicTo(280.7614F, 175.0F, 283.0F, 172.76143F, 283.0F, 170.0F);
      ((Path)localObject2).cubicTo(283.0F, 167.23857F, 280.7614F, 165.0F, 278.0F, 165.0F);
      ((Path)localObject2).cubicTo(275.2386F, 165.0F, 273.0F, 167.23857F, 273.0F, 170.0F);
      ((Path)localObject2).cubicTo(273.0F, 172.76143F, 275.2386F, 175.0F, 278.0F, 175.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(278.0F, 198.0F);
      ((Path)localObject2).cubicTo(280.7614F, 198.0F, 283.0F, 195.76143F, 283.0F, 193.0F);
      ((Path)localObject2).cubicTo(283.0F, 190.23857F, 280.7614F, 188.0F, 278.0F, 188.0F);
      ((Path)localObject2).cubicTo(275.2386F, 188.0F, 273.0F, 190.23857F, 273.0F, 193.0F);
      ((Path)localObject2).cubicTo(273.0F, 195.76143F, 275.2386F, 198.0F, 278.0F, 198.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(278.0F, 221.0F);
      ((Path)localObject2).cubicTo(280.7614F, 221.0F, 283.0F, 218.76143F, 283.0F, 216.0F);
      ((Path)localObject2).cubicTo(283.0F, 213.23857F, 280.7614F, 211.0F, 278.0F, 211.0F);
      ((Path)localObject2).cubicTo(275.2386F, 211.0F, 273.0F, 213.23857F, 273.0F, 216.0F);
      ((Path)localObject2).cubicTo(273.0F, 218.76143F, 275.2386F, 221.0F, 278.0F, 221.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */