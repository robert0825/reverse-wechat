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

public final class uk
  extends c
{
  private final int height;
  private final int width;
  
  public uk()
  {
    GMTrace.i(15942515949568L, 118781);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15942515949568L, 118781);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15942650167296L, 118782);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15942650167296L, 118782);
      return 0;
      GMTrace.o(15942650167296L, 118782);
      return 108;
      GMTrace.o(15942650167296L, 118782);
      return 108;
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
      localPaint.setColor(-499359);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(79.03704F, 25.0F);
      ((Path)localObject).lineTo(29.962963F, 25.0F);
      ((Path)localObject).cubicTo(28.879408F, 25.0F, 28.0F, 25.881067F, 28.0F, 26.966667F);
      ((Path)localObject).lineTo(28.0F, 82.03333F);
      ((Path)localObject).cubicTo(28.0F, 83.118935F, 28.879408F, 84.0F, 29.962963F, 84.0F);
      ((Path)localObject).lineTo(79.03704F, 84.0F);
      ((Path)localObject).cubicTo(80.12059F, 84.0F, 81.0F, 83.118935F, 81.0F, 82.03333F);
      ((Path)localObject).lineTo(81.0F, 26.966667F);
      ((Path)localObject).cubicTo(81.0F, 25.880083F, 80.12059F, 25.0F, 79.03704F, 25.0F);
      ((Path)localObject).lineTo(79.03704F, 25.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(69.22222F, 40.388184F);
      ((Path)localObject).lineTo(69.22222F, 52.533333F);
      ((Path)localObject).cubicTo(69.22222F, 60.679268F, 62.630592F, 67.28333F, 54.5F, 67.28333F);
      ((Path)localObject).cubicTo(46.369408F, 67.28333F, 39.77778F, 60.679268F, 39.77778F, 52.533333F);
      ((Path)localObject).lineTo(39.77778F, 40.388184F);
      ((Path)localObject).cubicTo(38.61963F, 39.83555F, 37.814816F, 38.66145F, 37.814816F, 37.291668F);
      ((Path)localObject).cubicTo(37.814816F, 35.3899F, 39.352795F, 33.85F, 41.25F, 33.85F);
      ((Path)localObject).cubicTo(43.147205F, 33.85F, 44.685184F, 35.3899F, 44.685184F, 37.291668F);
      ((Path)localObject).cubicTo(44.685184F, 38.662434F, 43.88037F, 39.83555F, 42.72222F, 40.388184F);
      ((Path)localObject).lineTo(42.72222F, 52.533333F);
      ((Path)localObject).cubicTo(42.72222F, 59.049885F, 47.99474F, 64.333336F, 54.5F, 64.333336F);
      ((Path)localObject).cubicTo(61.004276F, 64.333336F, 66.27778F, 59.049885F, 66.27778F, 52.533333F);
      ((Path)localObject).lineTo(66.27778F, 40.388184F);
      ((Path)localObject).cubicTo(65.11963F, 39.83555F, 64.31481F, 38.66145F, 64.31481F, 37.291668F);
      ((Path)localObject).cubicTo(64.31481F, 35.3899F, 65.8528F, 33.85F, 67.75F, 33.85F);
      ((Path)localObject).cubicTo(69.6472F, 33.85F, 71.18519F, 35.3899F, 71.18519F, 37.291668F);
      ((Path)localObject).cubicTo(71.18519F, 38.66145F, 70.37939F, 39.83555F, 69.22222F, 40.388184F);
      ((Path)localObject).lineTo(69.22222F, 40.388184F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\uk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */