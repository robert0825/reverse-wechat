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

public final class he
  extends c
{
  private final int height;
  private final int width;
  
  public he()
  {
    GMTrace.i(15855811297280L, 118135);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15855811297280L, 118135);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15855945515008L, 118136);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15855945515008L, 118136);
      return 0;
      GMTrace.o(15855945515008L, 118136);
      return 96;
      GMTrace.o(15855945515008L, 118136);
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
      ((Path)localObject).moveTo(41.0F, 65.0F);
      ((Path)localObject).cubicTo(28.297495F, 65.0F, 18.0F, 54.702503F, 18.0F, 42.0F);
      ((Path)localObject).cubicTo(18.0F, 29.297495F, 28.297495F, 19.0F, 41.0F, 19.0F);
      ((Path)localObject).cubicTo(53.702503F, 19.0F, 64.0F, 29.297495F, 64.0F, 42.0F);
      ((Path)localObject).cubicTo(64.0F, 54.702503F, 53.702503F, 65.0F, 41.0F, 65.0F);
      ((Path)localObject).lineTo(41.0F, 65.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(85.0F, 78.0F);
      ((Path)localObject).lineTo(66.0F, 61.0F);
      ((Path)localObject).cubicTo(70.123146F, 55.956898F, 72.5F, 49.400074F, 73.0F, 42.0F);
      ((Path)localObject).cubicTo(72.5F, 25.006767F, 58.508797F, 11.0F, 41.0F, 11.0F);
      ((Path)localObject).cubicTo(23.991203F, 11.0F, 10.0F, 25.006767F, 10.0F, 42.0F);
      ((Path)localObject).cubicTo(10.0F, 59.562756F, 23.991203F, 73.56952F, 41.0F, 74.0F);
      ((Path)localObject).cubicTo(48.358334F, 73.56952F, 54.908794F, 71.18956F, 60.0F, 67.0F);
      ((Path)localObject).lineTo(77.0F, 86.0F);
      ((Path)localObject).lineTo(85.0F, 78.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */