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

public final class oz
  extends c
{
  private final int height;
  private final int width;
  
  public oz()
  {
    GMTrace.i(15821183123456L, 117877);
    this.width = 135;
    this.height = 135;
    GMTrace.o(15821183123456L, 117877);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15821317341184L, 117878);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15821317341184L, 117878);
      return 0;
      GMTrace.o(15821317341184L, 117878);
      return 135;
      GMTrace.o(15821317341184L, 117878);
      return 135;
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
      localPaint.setColor(-16754776);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(43.703125F, 99.5F);
      ((Path)localObject).lineTo(25.0F, 35.0F);
      ((Path)localObject).lineTo(35.6875F, 35.0F);
      ((Path)localObject).lineTo(45.484375F, 72.625F);
      ((Path)localObject).lineTo(49.046875F, 86.0625F);
      ((Path)localObject).cubicTo(49.428513F, 85.38936F, 50.493137F, 80.95579F, 52.609375F, 72.625F);
      ((Path)localObject).lineTo(62.40625F, 35.0F);
      ((Path)localObject).lineTo(73.09375F, 35.0F);
      ((Path)localObject).lineTo(82.0F, 72.625F);
      ((Path)localObject).lineTo(85.5625F, 85.166664F);
      ((Path)localObject).lineTo(89.125F, 72.625F);
      ((Path)localObject).lineTo(99.8125F, 35.0F);
      ((Path)localObject).lineTo(109.609375F, 35.0F);
      ((Path)localObject).lineTo(90.015625F, 99.5F);
      ((Path)localObject).lineTo(79.328125F, 99.5F);
      ((Path)localObject).lineTo(69.53125F, 60.979168F);
      ((Path)localObject).lineTo(66.859375F, 50.229168F);
      ((Path)localObject).lineTo(54.390625F, 99.5F);
      ((Path)localObject).lineTo(43.703125F, 99.5F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\oz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */