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

public final class yx
  extends c
{
  private final int height;
  private final int width;
  
  public yx()
  {
    GMTrace.i(15765885419520L, 117465);
    this.width = 107;
    this.height = 107;
    GMTrace.o(15765885419520L, 117465);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15766019637248L, 117466);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15766019637248L, 117466);
      return 0;
      GMTrace.o(15766019637248L, 117466);
      return 107;
      GMTrace.o(15766019637248L, 117466);
      return 107;
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
      ((Path)localObject).moveTo(29.0F, 22.005177F);
      ((Path)localObject).cubicTo(29.0F, 20.897749F, 29.90195F, 20.0F, 31.00853F, 20.0F);
      ((Path)localObject).lineTo(38.99147F, 20.0F);
      ((Path)localObject).cubicTo(40.10075F, 20.0F, 41.0F, 20.89647F, 41.0F, 22.005177F);
      ((Path)localObject).lineTo(41.0F, 84.99482F);
      ((Path)localObject).cubicTo(41.0F, 86.10225F, 40.09805F, 87.0F, 38.99147F, 87.0F);
      ((Path)localObject).lineTo(31.00853F, 87.0F);
      ((Path)localObject).cubicTo(29.89925F, 87.0F, 29.0F, 86.10353F, 29.0F, 84.99482F);
      ((Path)localObject).lineTo(29.0F, 22.005177F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(66.0F, 22.005177F);
      ((Path)localObject).cubicTo(66.0F, 20.897749F, 66.90195F, 20.0F, 68.00853F, 20.0F);
      ((Path)localObject).lineTo(75.99147F, 20.0F);
      ((Path)localObject).cubicTo(77.10075F, 20.0F, 78.0F, 20.89647F, 78.0F, 22.005177F);
      ((Path)localObject).lineTo(78.0F, 84.99482F);
      ((Path)localObject).cubicTo(78.0F, 86.10225F, 77.09805F, 87.0F, 75.99147F, 87.0F);
      ((Path)localObject).lineTo(68.00853F, 87.0F);
      ((Path)localObject).cubicTo(66.89925F, 87.0F, 66.0F, 86.10353F, 66.0F, 84.99482F);
      ((Path)localObject).lineTo(66.0F, 22.005177F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\yx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */