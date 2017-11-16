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

public final class yu
  extends c
{
  private final int height;
  private final int width;
  
  public yu()
  {
    GMTrace.i(15840778911744L, 118023);
    this.width = 180;
    this.height = 240;
    GMTrace.o(15840778911744L, 118023);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15840913129472L, 118024);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15840913129472L, 118024);
      return 0;
      GMTrace.o(15840913129472L, 118024);
      return 180;
      GMTrace.o(15840913129472L, 118024);
      return 240;
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
      localCanvas.saveLayerAlpha(null, 230, 4);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(90.0F, 180.0F);
      ((Path)localObject).cubicTo(139.70563F, 180.0F, 180.0F, 139.70563F, 180.0F, 90.0F);
      ((Path)localObject).cubicTo(180.0F, 40.294373F, 139.70563F, 0.0F, 90.0F, 0.0F);
      ((Path)localObject).cubicTo(40.294373F, 0.0F, 0.0F, 40.294373F, 0.0F, 90.0F);
      ((Path)localObject).cubicTo(0.0F, 139.70563F, 40.294373F, 180.0F, 90.0F, 180.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(44.0F, 67.99653F);
      ((Path)localObject).cubicTo(44.0F, 66.34159F, 45.34499F, 65.0F, 46.99624F, 65.0F);
      ((Path)localObject).lineTo(104.00376F, 65.0F);
      ((Path)localObject).cubicTo(105.65854F, 65.0F, 107.0F, 66.33738F, 107.0F, 67.99653F);
      ((Path)localObject).lineTo(107.0F, 112.00347F);
      ((Path)localObject).cubicTo(107.0F, 113.65841F, 105.65501F, 115.0F, 104.00376F, 115.0F);
      ((Path)localObject).lineTo(46.99624F, 115.0F);
      ((Path)localObject).cubicTo(45.34146F, 115.0F, 44.0F, 113.66262F, 44.0F, 112.00347F);
      ((Path)localObject).lineTo(44.0F, 67.99653F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(131.5F, 116.79712F);
      ((Path)localObject).cubicTo(133.91545F, 117.568535F, 136.0F, 116.05244F, 136.0F, 113.73276F);
      ((Path)localObject).lineTo(136.0F, 66.235054F);
      ((Path)localObject).cubicTo(136.0F, 63.63856F, 133.69482F, 62.548866F, 131.5F, 63.170685F);
      ((Path)localObject).cubicTo(130.19809F, 64.306465F, 119.559074F, 74.1768F, 112.0F, 81.05712F);
      ((Path)localObject).lineTo(112.0F, 98.72812F);
      ((Path)localObject).cubicTo(119.74342F, 105.702545F, 130.61983F, 115.864586F, 131.5F, 116.79712F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\yu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */