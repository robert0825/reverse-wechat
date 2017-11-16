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

public final class hc
  extends c
{
  private final int height;
  private final int width;
  
  public hc()
  {
    GMTrace.i(15833799589888L, 117971);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15833799589888L, 117971);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15833933807616L, 117972);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15833933807616L, 117972);
      return 0;
      GMTrace.o(15833933807616L, 117972);
      return 96;
      GMTrace.o(15833933807616L, 117972);
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
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(47.0F, 87.98775F);
      ((Path)localObject).cubicTo(25.370693F, 87.45702F, 8.0F, 69.75708F, 8.0F, 48.0F);
      ((Path)localObject).cubicTo(8.0F, 34.31184F, 14.875527F, 22.229542F, 25.36142F, 15.018275F);
      ((Path)localObject).lineTo(31.139889F, 20.796743F);
      ((Path)localObject).cubicTo(22.05139F, 26.441599F, 16.0F, 36.51411F, 16.0F, 48.0F);
      ((Path)localObject).cubicTo(16.0F, 65.338554F, 29.789598F, 79.456375F, 47.0F, 79.98467F);
      ((Path)localObject).lineTo(47.0F, 70.0F);
      ((Path)localObject).lineTo(65.0F, 88.0F);
      ((Path)localObject).lineTo(47.0F, 88.0F);
      ((Path)localObject).lineTo(47.0F, 87.98775F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(47.0F, 8.012256F);
      ((Path)localObject).cubicTo(47.332344F, 8.004101F, 47.66569F, 8.0F, 48.0F, 8.0F);
      ((Path)localObject).cubicTo(70.09139F, 8.0F, 88.0F, 25.90861F, 88.0F, 48.0F);
      ((Path)localObject).cubicTo(88.0F, 62.075714F, 80.72963F, 74.45335F, 69.73931F, 81.58246F);
      ((Path)localObject).lineTo(63.921238F, 75.76438F);
      ((Path)localObject).cubicTo(73.52948F, 70.24273F, 80.0F, 59.877F, 80.0F, 48.0F);
      ((Path)localObject).cubicTo(80.0F, 30.326887F, 65.67311F, 16.0F, 48.0F, 16.0F);
      ((Path)localObject).cubicTo(47.665443F, 16.0F, 47.332085F, 16.005135F, 47.0F, 16.015327F);
      ((Path)localObject).lineTo(47.0F, 26.0F);
      ((Path)localObject).lineTo(29.0F, 8.0F);
      ((Path)localObject).lineTo(47.0F, 8.0F);
      ((Path)localObject).lineTo(47.0F, 8.012256F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */