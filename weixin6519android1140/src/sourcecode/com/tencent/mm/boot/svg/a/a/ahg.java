package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ahg
  extends c
{
  private final int height;
  private final int width;
  
  public ahg()
  {
    GMTrace.i(15733136293888L, 117221);
    this.width = 144;
    this.height = 144;
    GMTrace.o(15733136293888L, 117221);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15733270511616L, 117222);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15733270511616L, 117222);
      return 0;
      GMTrace.o(15733270511616L, 117222);
      return 144;
      GMTrace.o(15733270511616L, 117222);
      return 144;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Matrix localMatrix = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      c.a((Paint)localObject1, paramVarArgs).setStrokeWidth(1.0F);
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-2565928);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      Object localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(6.0F, 51.08541F);
      ((Path)localObject2).cubicTo(5.843611F, 51.030075F, 5.675318F, 51.0F, 5.5F, 51.0F);
      ((Path)localObject2).cubicTo(4.665797F, 51.0F, 4.0F, 51.674454F, 4.0F, 52.50644F);
      ((Path)localObject2).lineTo(4.0F, 60.49356F);
      ((Path)localObject2).cubicTo(4.0F, 61.32846F, 4.6715727F, 62.0F, 5.5F, 62.0F);
      ((Path)localObject2).cubicTo(5.6756845F, 62.0F, 5.8439F, 61.970085F, 6.0F, 61.915085F);
      ((Path)localObject2).lineTo(6.0F, 62.0F);
      ((Path)localObject2).lineTo(9.0F, 62.0F);
      ((Path)localObject2).lineTo(9.0F, 51.0F);
      ((Path)localObject2).lineTo(6.0F, 51.0F);
      ((Path)localObject2).lineTo(6.0F, 51.08541F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(103.0F, 62.0F);
      ((Path)localObject2).lineTo(132.0F, 44.0F);
      ((Path)localObject2).lineTo(132.0F, 101.0F);
      ((Path)localObject2).lineTo(103.0F, 84.0F);
      ((Path)localObject2).lineTo(103.0F, 62.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(11.0F, 42.00439F);
      ((Path)localObject2).cubicTo(11.0F, 37.583687F, 14.586183F, 34.0F, 19.00362F, 34.0F);
      ((Path)localObject2).lineTo(90.99638F, 34.0F);
      ((Path)localObject2).cubicTo(95.41666F, 34.0F, 99.0F, 37.584976F, 99.0F, 42.00439F);
      ((Path)localObject2).lineTo(99.0F, 102.995605F);
      ((Path)localObject2).cubicTo(99.0F, 107.41631F, 95.41382F, 111.0F, 90.99638F, 111.0F);
      ((Path)localObject2).lineTo(19.00362F, 111.0F);
      ((Path)localObject2).cubicTo(14.583343F, 111.0F, 11.0F, 107.41502F, 11.0F, 102.995605F);
      ((Path)localObject2).lineTo(11.0F, 42.00439F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(134.0F, 43.0F);
      ((Path)localObject2).lineTo(139.0F, 43.0F);
      ((Path)localObject2).lineTo(139.0F, 103.0F);
      ((Path)localObject2).lineTo(134.0F, 103.0F);
      ((Path)localObject2).lineTo(134.0F, 43.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(6.0F, 51.08541F);
      ((Path)localObject1).cubicTo(5.843611F, 51.030075F, 5.675318F, 51.0F, 5.5F, 51.0F);
      ((Path)localObject1).cubicTo(4.665797F, 51.0F, 4.0F, 51.674454F, 4.0F, 52.50644F);
      ((Path)localObject1).lineTo(4.0F, 60.49356F);
      ((Path)localObject1).cubicTo(4.0F, 61.32846F, 4.6715727F, 62.0F, 5.5F, 62.0F);
      ((Path)localObject1).cubicTo(5.6756845F, 62.0F, 5.8439F, 61.970085F, 6.0F, 61.915085F);
      ((Path)localObject1).lineTo(6.0F, 62.0F);
      ((Path)localObject1).lineTo(9.0F, 62.0F);
      ((Path)localObject1).lineTo(9.0F, 51.0F);
      ((Path)localObject1).lineTo(6.0F, 51.0F);
      ((Path)localObject1).lineTo(6.0F, 51.08541F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(103.0F, 62.0F);
      ((Path)localObject1).lineTo(132.0F, 44.0F);
      ((Path)localObject1).lineTo(132.0F, 101.0F);
      ((Path)localObject1).lineTo(103.0F, 84.0F);
      ((Path)localObject1).lineTo(103.0F, 62.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(11.0F, 42.00439F);
      ((Path)localObject1).cubicTo(11.0F, 37.583687F, 14.586183F, 34.0F, 19.00362F, 34.0F);
      ((Path)localObject1).lineTo(90.99638F, 34.0F);
      ((Path)localObject1).cubicTo(95.41666F, 34.0F, 99.0F, 37.584976F, 99.0F, 42.00439F);
      ((Path)localObject1).lineTo(99.0F, 102.995605F);
      ((Path)localObject1).cubicTo(99.0F, 107.41631F, 95.41382F, 111.0F, 90.99638F, 111.0F);
      ((Path)localObject1).lineTo(19.00362F, 111.0F);
      ((Path)localObject1).cubicTo(14.583343F, 111.0F, 11.0F, 107.41502F, 11.0F, 102.995605F);
      ((Path)localObject1).lineTo(11.0F, 42.00439F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(134.0F, 43.0F);
      ((Path)localObject1).lineTo(139.0F, 43.0F);
      ((Path)localObject1).lineTo(139.0F, 103.0F);
      ((Path)localObject1).lineTo(134.0F, 103.0F);
      ((Path)localObject1).lineTo(134.0F, 43.0F);
      ((Path)localObject1).close();
      localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 139.0F, 0.0F, 4.0F, 0.0F, 111.0F, 34.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient(localPaint1, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -9772465, -6687207 }, new float[] { 0.0F, 1.0F }, localMatrix, 0);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ahg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */