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

public final class ii
  extends c
{
  private final int height;
  private final int width;
  
  public ii()
  {
    GMTrace.i(15939294724096L, 118757);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15939294724096L, 118757);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15939428941824L, 118758);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15939428941824L, 118758);
      return 0;
      GMTrace.o(15939428941824L, 118758);
      return 96;
      GMTrace.o(15939428941824L, 118758);
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
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-3289392);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(17.0F, 48.02F);
      ((Path)localObject).cubicTo(27.66F, 37.34F, 38.34F, 26.66F, 49.02F, 16.0F);
      ((Path)localObject).cubicTo(50.92F, 17.88F, 52.82F, 19.78F, 54.7F, 21.68F);
      ((Path)localObject).cubicTo(47.27F, 29.13F, 39.82F, 36.56F, 32.39F, 44.01F);
      ((Path)localObject).cubicTo(48.6F, 44.03F, 64.81F, 44.01F, 81.02F, 44.02F);
      ((Path)localObject).cubicTo(81.02F, 46.71F, 81.02F, 49.39F, 81.01F, 52.08F);
      ((Path)localObject).cubicTo(64.83F, 52.1F, 48.64F, 52.07F, 32.45F, 52.09F);
      ((Path)localObject).cubicTo(39.86F, 59.52F, 47.29F, 66.93F, 54.7F, 74.36F);
      ((Path)localObject).cubicTo(52.82F, 76.26F, 50.92F, 78.16F, 49.02F, 80.04F);
      ((Path)localObject).cubicTo(38.34F, 69.38F, 27.66F, 58.7F, 17.0F, 48.02F);
      ((Path)localObject).lineTo(17.0F, 48.02F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */