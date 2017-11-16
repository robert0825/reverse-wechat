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

public final class h
  extends c
{
  private final int height;
  private final int width;
  
  public h()
  {
    GMTrace.i(21026012397568L, 156656);
    this.width = 96;
    this.height = 96;
    GMTrace.o(21026012397568L, 156656);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21026146615296L, 156657);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21026146615296L, 156657);
      return 0;
      GMTrace.o(21026146615296L, 156657);
      return 96;
      GMTrace.o(21026146615296L, 156657);
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
      localPaint.setColor(-8617594);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(48.0F, 30.0F);
      ((Path)localObject).cubicTo(45.238575F, 30.0F, 43.0F, 27.761423F, 43.0F, 25.0F);
      ((Path)localObject).cubicTo(43.0F, 22.238577F, 45.238575F, 20.0F, 48.0F, 20.0F);
      ((Path)localObject).cubicTo(50.761425F, 20.0F, 53.0F, 22.238577F, 53.0F, 25.0F);
      ((Path)localObject).cubicTo(53.0F, 27.761423F, 50.761425F, 30.0F, 48.0F, 30.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 53.0F);
      ((Path)localObject).cubicTo(45.238575F, 53.0F, 43.0F, 50.761425F, 43.0F, 48.0F);
      ((Path)localObject).cubicTo(43.0F, 45.238575F, 45.238575F, 43.0F, 48.0F, 43.0F);
      ((Path)localObject).cubicTo(50.761425F, 43.0F, 53.0F, 45.238575F, 53.0F, 48.0F);
      ((Path)localObject).cubicTo(53.0F, 50.761425F, 50.761425F, 53.0F, 48.0F, 53.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 76.0F);
      ((Path)localObject).cubicTo(45.238575F, 76.0F, 43.0F, 73.76142F, 43.0F, 71.0F);
      ((Path)localObject).cubicTo(43.0F, 68.23858F, 45.238575F, 66.0F, 48.0F, 66.0F);
      ((Path)localObject).cubicTo(50.761425F, 66.0F, 53.0F, 68.23858F, 53.0F, 71.0F);
      ((Path)localObject).cubicTo(53.0F, 73.76142F, 50.761425F, 76.0F, 48.0F, 76.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */