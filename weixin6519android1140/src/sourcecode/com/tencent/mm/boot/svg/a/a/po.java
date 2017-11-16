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

public final class po
  extends c
{
  private final int height;
  private final int width;
  
  public po()
  {
    GMTrace.i(15849905717248L, 118091);
    this.width = 75;
    this.height = 75;
    GMTrace.o(15849905717248L, 118091);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15850039934976L, 118092);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15850039934976L, 118092);
      return 0;
      GMTrace.o(15850039934976L, 118092);
      return 75;
      GMTrace.o(15850039934976L, 118092);
      return 75;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject2 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-9473160);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(23.94F, 60.0F);
      ((Path)localObject3).lineTo(23.94F, 54.18F);
      ((Path)localObject3).lineTo(21.42F, 54.18F);
      ((Path)localObject3).lineTo(21.42F, 60.0F);
      ((Path)localObject3).lineTo(9.5F, 60.0F);
      ((Path)localObject3).lineTo(9.5F, 60.0F);
      ((Path)localObject3).cubicTo(8.671573F, 60.0F, 8.0F, 60.671574F, 8.0F, 61.5F);
      ((Path)localObject3).cubicTo(8.0F, 62.328426F, 8.671573F, 63.0F, 9.5F, 63.0F);
      ((Path)localObject3).lineTo(36.5F, 63.0F);
      ((Path)localObject3).cubicTo(37.328426F, 63.0F, 38.0F, 62.328426F, 38.0F, 61.5F);
      ((Path)localObject3).cubicTo(38.0F, 60.671574F, 37.328426F, 60.0F, 36.5F, 60.0F);
      ((Path)localObject3).lineTo(23.94F, 60.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setColor(-9473160);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(45.36F, 23.94F);
      ((Path)localObject2).lineTo(45.36F, 31.74326F);
      ((Path)localObject2).cubicTo(45.36F, 44.134727F, 35.20582F, 54.18F, 22.68F, 54.18F);
      ((Path)localObject2).cubicTo(10.1541815F, 54.18F, 0.0F, 44.134727F, 0.0F, 31.74326F);
      ((Path)localObject2).lineTo(0.0F, 23.94F);
      ((Path)localObject2).lineTo(3.0F, 23.94F);
      ((Path)localObject2).lineTo(3.0F, 31.74326F);
      ((Path)localObject2).cubicTo(3.0F, 42.47059F, 11.803838F, 51.18F, 22.68F, 51.18F);
      ((Path)localObject2).cubicTo(33.556164F, 51.18F, 42.36F, 42.47059F, 42.36F, 31.74326F);
      ((Path)localObject2).lineTo(42.36F, 23.94F);
      ((Path)localObject2).lineTo(45.36F, 23.94F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(45.36F, 23.94F);
      ((Path)localObject2).lineTo(45.36F, 31.74326F);
      ((Path)localObject2).cubicTo(45.36F, 44.134727F, 35.20582F, 54.18F, 22.68F, 54.18F);
      ((Path)localObject2).cubicTo(10.1541815F, 54.18F, 0.0F, 44.134727F, 0.0F, 31.74326F);
      ((Path)localObject2).lineTo(0.0F, 23.94F);
      ((Path)localObject2).lineTo(3.0F, 23.94F);
      ((Path)localObject2).lineTo(3.0F, 31.74326F);
      ((Path)localObject2).cubicTo(3.0F, 42.47059F, 11.803838F, 51.18F, 22.68F, 51.18F);
      ((Path)localObject2).cubicTo(33.556164F, 51.18F, 42.36F, 42.47059F, 42.36F, 31.74326F);
      ((Path)localObject2).lineTo(42.36F, 23.94F);
      ((Path)localObject2).lineTo(45.36F, 23.94F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-9473160);
      localPaint.setStrokeWidth(3.0F);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(11.58F, 12.6F);
      ((Path)localObject1).cubicTo(11.58F, 6.4696393F, 16.549639F, 1.5F, 22.68F, 1.5F);
      ((Path)localObject1).lineTo(22.679998F, 1.5F);
      ((Path)localObject1).cubicTo(28.81036F, 1.5F, 33.78F, 6.4696393F, 33.78F, 12.6F);
      ((Path)localObject1).lineTo(33.78F, 31.499998F);
      ((Path)localObject1).cubicTo(33.78F, 37.63036F, 28.81036F, 42.6F, 22.679998F, 42.6F);
      ((Path)localObject1).lineTo(22.68F, 42.6F);
      ((Path)localObject1).cubicTo(16.549639F, 42.6F, 11.58F, 37.63036F, 11.58F, 31.499998F);
      ((Path)localObject1).lineTo(11.58F, 12.6F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\po.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */