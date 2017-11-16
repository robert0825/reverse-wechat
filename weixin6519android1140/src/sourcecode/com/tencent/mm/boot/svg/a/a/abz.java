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

public final class abz
  extends c
{
  private final int height;
  private final int width;
  
  public abz()
  {
    GMTrace.i(15808835092480L, 117785);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15808835092480L, 117785);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15808969310208L, 117786);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15808969310208L, 117786);
      return 0;
      GMTrace.o(15808969310208L, 117786);
      return 96;
      GMTrace.o(15808969310208L, 117786);
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
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(57.0F, 48.0F);
      ((Path)localObject).cubicTo(57.0F, 50.762F, 59.238F, 53.0F, 62.0F, 53.0F);
      ((Path)localObject).cubicTo(64.762F, 53.0F, 67.0F, 50.762F, 67.0F, 48.0F);
      ((Path)localObject).cubicTo(67.0F, 45.239F, 64.762F, 43.0F, 62.0F, 43.0F);
      ((Path)localObject).cubicTo(59.238F, 43.0F, 57.0F, 45.239F, 57.0F, 48.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(77.0F, 25.0F);
      ((Path)localObject).lineTo(19.0F, 25.0F);
      ((Path)localObject).cubicTo(17.344F, 25.0F, 16.0F, 26.343F, 16.0F, 28.0F);
      ((Path)localObject).lineTo(16.0F, 68.0F);
      ((Path)localObject).cubicTo(16.0F, 69.657F, 17.344F, 71.0F, 19.0F, 71.0F);
      ((Path)localObject).lineTo(77.0F, 71.0F);
      ((Path)localObject).cubicTo(78.656F, 71.0F, 80.0F, 69.657F, 80.0F, 68.0F);
      ((Path)localObject).lineTo(80.0F, 58.0F);
      ((Path)localObject).lineTo(62.0F, 58.0F);
      ((Path)localObject).cubicTo(56.477F, 58.0F, 52.0F, 53.523F, 52.0F, 48.0F);
      ((Path)localObject).cubicTo(52.0F, 42.478F, 56.477F, 38.0F, 62.0F, 38.0F);
      ((Path)localObject).lineTo(80.0F, 38.0F);
      ((Path)localObject).lineTo(80.0F, 28.0F);
      ((Path)localObject).cubicTo(80.0F, 26.344F, 78.656F, 25.0F, 77.0F, 25.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\abz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */