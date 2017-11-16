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

public final class vq
  extends c
{
  private final int height;
  private final int width;
  
  public vq()
  {
    GMTrace.i(15843731701760L, 118045);
    this.width = 180;
    this.height = 180;
    GMTrace.o(15843731701760L, 118045);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15843865919488L, 118046);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15843865919488L, 118046);
      return 0;
      GMTrace.o(15843865919488L, 118046);
      return 180;
      GMTrace.o(15843865919488L, 118046);
      return 180;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      c.a((Paint)localObject1, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject1).setColor(1711276032);
      Object localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(90.0F, 0.0F);
      ((Path)localObject2).cubicTo(139.70563F, 0.0F, 180.0F, 40.29437F, 180.0F, 90.0F);
      ((Path)localObject2).cubicTo(180.0F, 139.70563F, 139.70563F, 180.0F, 90.0F, 180.0F);
      ((Path)localObject2).cubicTo(40.29437F, 180.0F, 0.0F, 139.70563F, 0.0F, 90.0F);
      ((Path)localObject2).cubicTo(0.0F, 40.29437F, 40.29437F, 0.0F, 90.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(69.0F, 59.64535F);
      ((Path)localObject1).cubicTo(69.0F, 56.333775F, 71.31589F, 54.997013F, 74.19147F, 56.67054F);
      ((Path)localObject1).lineTo(126.27224F, 86.98049F);
      ((Path)localObject1).cubicTo(129.1394F, 88.649124F, 129.14781F, 91.349625F, 126.27224F, 93.023155F);
      ((Path)localObject1).lineTo(74.19147F, 123.33311F);
      ((Path)localObject1).cubicTo(71.3243F, 125.00174F, 69.0F, 123.65884F, 69.0F, 120.35829F);
      ((Path)localObject1).lineTo(69.0F, 59.64535F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 204, 4);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-855638017);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(90.0F, 174.0F);
      ((Path)localObject1).cubicTo(136.39192F, 174.0F, 174.0F, 136.39192F, 174.0F, 90.0F);
      ((Path)localObject1).cubicTo(174.0F, 43.60808F, 136.39192F, 6.0F, 90.0F, 6.0F);
      ((Path)localObject1).cubicTo(43.60808F, 6.0F, 6.0F, 43.60808F, 6.0F, 90.0F);
      ((Path)localObject1).cubicTo(6.0F, 136.39192F, 43.60808F, 174.0F, 90.0F, 174.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(90.0F, 180.0F);
      ((Path)localObject1).cubicTo(40.294373F, 180.0F, 0.0F, 139.70563F, 0.0F, 90.0F);
      ((Path)localObject1).cubicTo(0.0F, 40.294373F, 40.294373F, 0.0F, 90.0F, 0.0F);
      ((Path)localObject1).cubicTo(139.70563F, 0.0F, 180.0F, 40.294373F, 180.0F, 90.0F);
      ((Path)localObject1).cubicTo(180.0F, 139.70563F, 139.70563F, 180.0F, 90.0F, 180.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\vq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */