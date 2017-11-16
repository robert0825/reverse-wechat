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

public final class acc
  extends c
{
  private final int height;
  private final int width;
  
  public acc()
  {
    GMTrace.i(15764006371328L, 117451);
    this.width = 168;
    this.height = 168;
    GMTrace.o(15764006371328L, 117451);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15764140589056L, 117452);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15764140589056L, 117452);
      return 0;
      GMTrace.o(15764140589056L, 117452);
      return 168;
      GMTrace.o(15764140589056L, 117452);
      return 168;
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
      localPaint.setColor(-8617594);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(42.9994F, 66.0F);
      ((Path)localObject).cubicTo(41.342876F, 66.0F, 40.0F, 67.33791F, 40.0F, 68.99988F);
      ((Path)localObject).lineTo(40.0F, 114.00012F);
      ((Path)localObject).cubicTo(40.0F, 115.656906F, 41.34472F, 117.0F, 42.9994F, 117.0F);
      ((Path)localObject).lineTo(126.0006F, 117.0F);
      ((Path)localObject).cubicTo(127.65712F, 117.0F, 129.0F, 115.66209F, 129.0F, 114.00012F);
      ((Path)localObject).lineTo(129.0F, 68.99988F);
      ((Path)localObject).cubicTo(129.0F, 67.343094F, 127.65528F, 66.0F, 126.0006F, 66.0F);
      ((Path)localObject).lineTo(42.9994F, 66.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(58.95212F, 66.0F);
      ((Path)localObject).cubicTo(65.85957F, 66.0F, 69.57021F, 52.0F, 76.2964F, 52.0F);
      ((Path)localObject).lineTo(85.0F, 52.0F);
      ((Path)localObject).lineTo(85.0F, 66.0F);
      ((Path)localObject).lineTo(58.95212F, 66.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(111.047874F, 66.0F);
      ((Path)localObject).cubicTo(104.14043F, 66.0F, 100.42979F, 52.0F, 93.7021F, 52.0F);
      ((Path)localObject).lineTo(85.0F, 52.0F);
      ((Path)localObject).lineTo(85.0F, 66.0F);
      ((Path)localObject).lineTo(111.047874F, 66.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(84.5F, 70.0F);
      ((Path)localObject).cubicTo(95.27F, 70.0F, 104.0F, 78.73F, 104.0F, 89.5F);
      ((Path)localObject).cubicTo(104.0F, 100.27F, 95.27F, 109.0F, 84.5F, 109.0F);
      ((Path)localObject).cubicTo(73.73F, 109.0F, 65.0F, 100.27F, 65.0F, 89.5F);
      ((Path)localObject).cubicTo(65.0F, 78.73F, 73.73F, 70.0F, 84.5F, 70.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(84.5F, 74.0F);
      ((Path)localObject).cubicTo(93.06065F, 74.0F, 100.0F, 80.93935F, 100.0F, 89.5F);
      ((Path)localObject).cubicTo(100.0F, 98.06065F, 93.06065F, 105.0F, 84.5F, 105.0F);
      ((Path)localObject).cubicTo(75.93935F, 105.0F, 69.0F, 98.06065F, 69.0F, 89.5F);
      ((Path)localObject).cubicTo(69.0F, 80.93935F, 75.93935F, 74.0F, 84.5F, 74.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(47.0F, 58.0F);
      ((Path)localObject).lineTo(58.0F, 58.0F);
      ((Path)localObject).lineTo(58.0F, 63.0F);
      ((Path)localObject).lineTo(47.0F, 63.0F);
      ((Path)localObject).lineTo(47.0F, 58.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\acc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */