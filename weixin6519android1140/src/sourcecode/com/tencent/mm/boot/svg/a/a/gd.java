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

public final class gd
  extends c
{
  private final int height;
  private final int width;
  
  public gd()
  {
    GMTrace.i(15927215128576L, 118667);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15927215128576L, 118667);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15927349346304L, 118668);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15927349346304L, 118668);
      return 0;
      GMTrace.o(15927349346304L, 118668);
      return 96;
      GMTrace.o(15927349346304L, 118668);
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
      localPaint.setColor(-8683387);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(68.0F, 68.0F);
      ((Path)localObject).lineTo(68.0F, 73.0F);
      ((Path)localObject).cubicTo(62.75382F, 77.365776F, 55.755802F, 80.0F, 48.0F, 80.0F);
      ((Path)localObject).cubicTo(43.030067F, 80.0F, 38.205288F, 78.816F, 34.0F, 77.0F);
      ((Path)localObject).lineTo(48.0F, 52.0F);
      ((Path)localObject).lineTo(44.0F, 48.0F);
      ((Path)localObject).lineTo(36.0F, 48.0F);
      ((Path)localObject).lineTo(28.0F, 40.0F);
      ((Path)localObject).lineTo(44.0F, 24.0F);
      ((Path)localObject).lineTo(38.0F, 18.0F);
      ((Path)localObject).cubicTo(40.952587F, 16.616444F, 44.470387F, 16.0F, 48.0F, 16.0F);
      ((Path)localObject).cubicTo(52.40803F, 16.0F, 56.485584F, 16.82889F, 60.0F, 18.0F);
      ((Path)localObject).lineTo(60.0F, 24.0F);
      ((Path)localObject).lineTo(64.0F, 28.0F);
      ((Path)localObject).lineTo(73.0F, 28.0F);
      ((Path)localObject).cubicTo(75.21601F, 30.406666F, 76.81651F, 33.097332F, 78.0F, 36.0F);
      ((Path)localObject).lineTo(64.0F, 36.0F);
      ((Path)localObject).lineTo(56.0F, 44.0F);
      ((Path)localObject).lineTo(56.0F, 56.0F);
      ((Path)localObject).lineTo(68.0F, 68.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.0F, 69.0F);
      ((Path)localObject).cubicTo(19.024445F, 63.343204F, 16.0F, 55.91894F, 16.0F, 48.0F);
      ((Path)localObject).cubicTo(16.0F, 46.501648F, 16.08311F, 45.241016F, 16.0F, 44.0F);
      ((Path)localObject).lineTo(24.0F, 52.0F);
      ((Path)localObject).lineTo(24.0F, 69.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 8.0F);
      ((Path)localObject).cubicTo(25.908443F, 8.0F, 8.0F, 25.908443F, 8.0F, 48.0F);
      ((Path)localObject).cubicTo(8.0F, 70.09155F, 25.908443F, 88.0F, 48.0F, 88.0F);
      ((Path)localObject).cubicTo(70.09155F, 88.0F, 88.0F, 70.09155F, 88.0F, 48.0F);
      ((Path)localObject).cubicTo(88.0F, 25.908443F, 70.09155F, 8.0F, 48.0F, 8.0F);
      ((Path)localObject).lineTo(48.0F, 8.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */