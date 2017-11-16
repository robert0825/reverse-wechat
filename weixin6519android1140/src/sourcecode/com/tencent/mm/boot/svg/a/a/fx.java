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

public final class fx
  extends c
{
  private final int height;
  private final int width;
  
  public fx()
  {
    GMTrace.i(15707903361024L, 117033);
    this.width = 144;
    this.height = 144;
    GMTrace.o(15707903361024L, 117033);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15708037578752L, 117034);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15708037578752L, 117034);
      return 0;
      GMTrace.o(15708037578752L, 117034);
      return 144;
      GMTrace.o(15708037578752L, 117034);
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
      ((Path)localObject).moveTo(90.0F, 38.572F);
      ((Path)localObject).cubicTo(90.0F, 40.466F, 91.536F, 42.0F, 93.428F, 42.0F);
      ((Path)localObject).lineTo(122.0F, 42.0F);
      ((Path)localObject).lineTo(90.0F, 10.0F);
      ((Path)localObject).lineTo(90.0F, 38.572F);
      ((Path)localObject).lineTo(90.0F, 38.572F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(84.0F, 10.0F);
      ((Path)localObject).lineTo(40.0F, 10.0F);
      ((Path)localObject).cubicTo(36.686F, 10.0F, 34.0F, 12.686F, 34.0F, 16.0F);
      ((Path)localObject).lineTo(34.0F, 116.0F);
      ((Path)localObject).cubicTo(34.0F, 119.314F, 36.686F, 122.0F, 40.0F, 122.0F);
      ((Path)localObject).lineTo(116.0F, 122.0F);
      ((Path)localObject).cubicTo(119.314F, 122.0F, 122.0F, 119.314F, 122.0F, 116.0F);
      ((Path)localObject).lineTo(122.0F, 48.0F);
      ((Path)localObject).lineTo(90.0F, 48.0F);
      ((Path)localObject).cubicTo(86.686F, 48.002F, 84.0F, 45.316F, 84.0F, 42.0F);
      ((Path)localObject).lineTo(84.0F, 10.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(28.0F, 34.0F);
      ((Path)localObject).cubicTo(24.686F, 34.0F, 22.0F, 36.686F, 22.0F, 40.0F);
      ((Path)localObject).lineTo(22.0F, 128.0F);
      ((Path)localObject).cubicTo(22.0F, 131.314F, 24.686F, 134.0F, 28.0F, 134.0F);
      ((Path)localObject).lineTo(96.0F, 134.0F);
      ((Path)localObject).cubicTo(99.314F, 134.0F, 102.0F, 131.314F, 102.0F, 128.0F);
      ((Path)localObject).lineTo(34.0F, 128.0F);
      ((Path)localObject).cubicTo(30.686F, 128.0F, 28.0F, 125.314F, 28.0F, 122.0F);
      ((Path)localObject).lineTo(28.0F, 34.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */