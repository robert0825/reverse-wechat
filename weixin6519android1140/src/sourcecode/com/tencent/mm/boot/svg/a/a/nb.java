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

public final class nb
  extends c
{
  private final int height;
  private final int width;
  
  public nb()
  {
    GMTrace.i(15824941219840L, 117905);
    this.width = 100;
    this.height = 100;
    GMTrace.o(15824941219840L, 117905);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15825075437568L, 117906);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15825075437568L, 117906);
      return 0;
      GMTrace.o(15825075437568L, 117906);
      return 100;
      GMTrace.o(15825075437568L, 117906);
      return 100;
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
      localPaint.setColor(-10329502);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(50.0F, 98.0F);
      ((Path)localObject).cubicTo(76.50967F, 98.0F, 98.0F, 76.50967F, 98.0F, 50.0F);
      ((Path)localObject).cubicTo(98.0F, 23.490332F, 76.50967F, 2.0F, 50.0F, 2.0F);
      ((Path)localObject).cubicTo(23.490332F, 2.0F, 2.0F, 23.490332F, 2.0F, 50.0F);
      ((Path)localObject).cubicTo(2.0F, 76.50967F, 23.490332F, 98.0F, 50.0F, 98.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(50.0F, 94.0F);
      ((Path)localObject).cubicTo(74.30053F, 94.0F, 94.0F, 74.30053F, 94.0F, 50.0F);
      ((Path)localObject).cubicTo(94.0F, 25.69947F, 74.30053F, 6.0F, 50.0F, 6.0F);
      ((Path)localObject).cubicTo(25.69947F, 6.0F, 6.0F, 25.69947F, 6.0F, 50.0F);
      ((Path)localObject).cubicTo(6.0F, 74.30053F, 25.69947F, 94.0F, 50.0F, 94.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */