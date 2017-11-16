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

public final class gb
  extends c
{
  private final int height;
  private final int width;
  
  public gb()
  {
    GMTrace.i(15812861624320L, 117815);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15812861624320L, 117815);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15812995842048L, 117816);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15812995842048L, 117816);
      return 0;
      GMTrace.o(15812995842048L, 117816);
      return 96;
      GMTrace.o(15812995842048L, 117816);
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
      ((Path)localObject).moveTo(48.0F, 80.0F);
      ((Path)localObject).cubicTo(40.60533F, 80.0F, 33.802223F, 77.48534F, 28.383556F, 73.27333F);
      ((Path)localObject).lineTo(73.27333F, 28.383556F);
      ((Path)localObject).cubicTo(77.48534F, 33.802223F, 80.0F, 40.60533F, 80.0F, 48.0F);
      ((Path)localObject).cubicTo(80.0F, 65.67289F, 65.67289F, 80.0F, 48.0F, 80.0F);
      ((Path)localObject).moveTo(16.0F, 48.0F);
      ((Path)localObject).cubicTo(16.0F, 30.326666F, 30.326666F, 16.0F, 48.0F, 16.0F);
      ((Path)localObject).cubicTo(55.39467F, 16.0F, 62.197777F, 18.514668F, 67.61645F, 22.726667F);
      ((Path)localObject).lineTo(22.726667F, 67.61645F);
      ((Path)localObject).cubicTo(18.514668F, 62.197777F, 16.0F, 55.39467F, 16.0F, 48.0F);
      ((Path)localObject).moveTo(70.627556F, 25.372889F);
      ((Path)localObject).lineTo(70.62711F, 25.372444F);
      ((Path)localObject).lineTo(70.627556F, 25.372889F);
      ((Path)localObject).moveTo(48.0F, 8.0F);
      ((Path)localObject).cubicTo(25.908443F, 8.0F, 8.0F, 25.908443F, 8.0F, 48.0F);
      ((Path)localObject).cubicTo(8.0F, 70.09155F, 25.908443F, 88.0F, 48.0F, 88.0F);
      ((Path)localObject).cubicTo(70.09155F, 88.0F, 88.0F, 70.09155F, 88.0F, 48.0F);
      ((Path)localObject).cubicTo(88.0F, 25.908443F, 70.09155F, 8.0F, 48.0F, 8.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */