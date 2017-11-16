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

public final class ahn
  extends c
{
  private final int height;
  private final int width;
  
  public ahn()
  {
    GMTrace.i(16008148418560L, 119270);
    this.width = 584;
    this.height = 96;
    GMTrace.o(16008148418560L, 119270);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16008282636288L, 119271);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16008282636288L, 119271);
      return 0;
      GMTrace.o(16008282636288L, 119271);
      return 584;
      GMTrace.o(16008282636288L, 119271);
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
      localPaint.setColor(419430400);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 9.00051F);
      ((Path)localObject).cubicTo(0.0F, 4.0296655F, 4.0212784F, 0.0F, 8.997707F, 0.0F);
      ((Path)localObject).lineTo(575.0023F, 0.0F);
      ((Path)localObject).cubicTo(579.9716F, 0.0F, 584.0F, 4.0326095F, 584.0F, 9.00051F);
      ((Path)localObject).lineTo(584.0F, 76.99949F);
      ((Path)localObject).cubicTo(584.0F, 81.97034F, 579.9787F, 86.0F, 575.0023F, 86.0F);
      ((Path)localObject).lineTo(8.997707F, 86.0F);
      ((Path)localObject).cubicTo(4.028411F, 86.0F, 0.0F, 81.96739F, 0.0F, 76.99949F);
      ((Path)localObject).lineTo(0.0F, 9.00051F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(113.04867F, 96.0F);
      ((Path)localObject).lineTo(104.0F, 86.0F);
      ((Path)localObject).lineTo(122.09733F, 86.0F);
      ((Path)localObject).lineTo(113.04867F, 96.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ahn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */