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

public final class at
  extends c
{
  private final int height;
  private final int width;
  
  public at()
  {
    GMTrace.i(15788970868736L, 117637);
    this.width = 180;
    this.height = 180;
    GMTrace.o(15788970868736L, 117637);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15789105086464L, 117638);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15789105086464L, 117638);
      return 0;
      GMTrace.o(15789105086464L, 117638);
      return 180;
      GMTrace.o(15789105086464L, 117638);
      return 180;
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
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-12206054);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(180.0F, 0.0F);
      localPath.lineTo(180.0F, 180.0F);
      localPath.lineTo(0.0F, 180.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(120.74788F, 68.80034F);
      ((Path)localObject).lineTo(98.46802F, 46.520485F);
      ((Path)localObject).cubicTo(93.788185F, 41.840652F, 86.1861F, 41.841553F, 81.49671F, 46.530937F);
      ((Path)localObject).lineTo(46.530937F, 81.49671F);
      ((Path)localObject).cubicTo(41.838837F, 86.18881F, 41.836876F, 93.78441F, 46.520485F, 98.46802F);
      ((Path)localObject).lineTo(81.53198F, 133.47952F);
      ((Path)localObject).cubicTo(86.211815F, 138.15935F, 93.8139F, 138.15845F, 98.50329F, 133.46907F);
      ((Path)localObject).lineTo(133.46907F, 98.50329F);
      ((Path)localObject).cubicTo(138.16116F, 93.81119F, 138.16313F, 86.21559F, 133.47952F, 81.53198F);
      ((Path)localObject).lineTo(132.41515F, 80.467606F);
      ((Path)localObject).lineTo(90.010124F, 122.87262F);
      ((Path)localObject).lineTo(84.1765F, 117.03899F);
      ((Path)localObject).lineTo(62.963295F, 95.82578F);
      ((Path)localObject).lineTo(57.12966F, 89.99215F);
      ((Path)localObject).lineTo(89.99443F, 57.127384F);
      ((Path)localObject).lineTo(101.66169F, 68.79465F);
      ((Path)localObject).lineTo(80.45862F, 89.99772F);
      ((Path)localObject).lineTo(90.004555F, 99.54366F);
      ((Path)localObject).lineTo(120.74788F, 68.80034F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */