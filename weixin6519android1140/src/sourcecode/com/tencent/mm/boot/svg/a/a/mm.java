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

public final class mm
  extends c
{
  private final int height;
  private final int width;
  
  public mm()
  {
    GMTrace.i(15897150357504L, 118443);
    this.width = 191;
    this.height = 191;
    GMTrace.o(15897150357504L, 118443);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15897284575232L, 118444);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15897284575232L, 118444);
      return 0;
      GMTrace.o(15897284575232L, 118444);
      return 191;
      GMTrace.o(15897284575232L, 118444);
      return 191;
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
      localPaint.setColor(-686547);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(71.7024F, 113.94841F);
      ((Path)localObject).lineTo(70.50466F, 117.91833F);
      ((Path)localObject).cubicTo(68.771225F, 123.66382F, 71.968994F, 129.74753F, 77.638115F, 131.50388F);
      ((Path)localObject).lineTo(96.88131F, 137.46565F);
      ((Path)localObject).cubicTo(102.55444F, 139.22325F, 108.55855F, 135.99077F, 110.29208F, 130.24493F);
      ((Path)localObject).lineTo(111.371895F, 126.665886F);
      ((Path)localObject).lineTo(143.50204F, 136.96637F);
      ((Path)localObject).cubicTo(146.29303F, 137.86111F, 148.55556F, 136.22597F, 148.55556F, 133.26476F);
      ((Path)localObject).lineTo(148.55556F, 55.65808F);
      ((Path)localObject).cubicTo(148.55556F, 52.718987F, 146.2936F, 51.04703F, 143.50204F, 51.92406F);
      ((Path)localObject).lineTo(55.177776F, 79.67322F);
      ((Path)localObject).lineTo(55.177776F, 108.65085F);
      ((Path)localObject).lineTo(71.7024F, 113.94841F);
      ((Path)localObject).lineTo(71.7024F, 113.94841F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(105.589226F, 124.81204F);
      ((Path)localObject).lineTo(104.67921F, 127.869804F);
      ((Path)localObject).cubicTo(103.85574F, 130.63673F, 101.00234F, 132.19417F, 98.304535F, 131.34686F);
      ((Path)localObject).lineTo(80.01574F, 125.60284F);
      ((Path)localObject).cubicTo(77.32027F, 124.756256F, 75.80068F, 121.823364F, 76.6236F, 119.05828F);
      ((Path)localObject).lineTo(77.58325F, 115.833725F);
      ((Path)localObject).lineTo(105.589226F, 124.81204F);
      ((Path)localObject).lineTo(105.589226F, 124.81204F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(191.0F, 0.0F);
      ((Path)localObject).lineTo(191.0F, 191.0F);
      ((Path)localObject).lineTo(0.0F, 191.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(47.03692F, 77.76699F);
      ((Path)localObject).cubicTo(44.500565F, 76.31182F, 42.444443F, 77.51847F, 42.444443F, 80.42022F);
      ((Path)localObject).lineTo(42.444443F, 108.45738F);
      ((Path)localObject).cubicTo(42.444443F, 111.37789F, 44.49037F, 112.57163F, 47.03692F, 111.11062F);
      ((Path)localObject).lineTo(53.055557F, 107.65758F);
      ((Path)localObject).lineTo(53.055557F, 81.22003F);
      ((Path)localObject).lineTo(47.03692F, 77.76699F);
      ((Path)localObject).lineTo(47.03692F, 77.76699F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\mm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */