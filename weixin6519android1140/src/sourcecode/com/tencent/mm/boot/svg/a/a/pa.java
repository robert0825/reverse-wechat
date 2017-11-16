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

public final class pa
  extends c
{
  private final int height;
  private final int width;
  
  public pa()
  {
    GMTrace.i(15813398495232L, 117819);
    this.width = 135;
    this.height = 135;
    GMTrace.o(15813398495232L, 117819);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15813532712960L, 117820);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15813532712960L, 117820);
      return 0;
      GMTrace.o(15813532712960L, 117820);
      return 135;
      GMTrace.o(15813532712960L, 117820);
      return 135;
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
      localPaint.setColor(-16743362);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(36.0F, 102.0F);
      ((Path)localObject).lineTo(62.74134F, 66.040924F);
      ((Path)localObject).lineTo(39.159912F, 33.0F);
      ((Path)localObject).lineTo(50.05453F, 33.0F);
      ((Path)localObject).lineTo(62.599854F, 50.697136F);
      ((Path)localObject).cubicTo(65.20954F, 54.368366F, 67.0646F, 57.19235F, 68.16507F, 59.169167F);
      ((Path)localObject).cubicTo(69.705734F, 56.658924F, 71.52934F, 54.038895F, 73.63596F, 51.309006F);
      ((Path)localObject).lineTo(87.549F, 33.0F);
      ((Path)localObject).lineTo(97.50037F, 33.0F);
      ((Path)localObject).lineTo(73.211494F, 65.52319F);
      ((Path)localObject).lineTo(99.38689F, 102.0F);
      ((Path)localObject).lineTo(88.067795F, 102.0F);
      ((Path)localObject).lineTo(70.6647F, 77.38404F);
      ((Path)localObject).cubicTo(69.689995F, 75.97202F, 68.68387F, 74.434525F, 67.64628F, 72.771484F);
      ((Path)localObject).cubicTo(66.10561F, 75.28173F, 65.005165F, 77.0075F, 64.34488F, 77.94884F);
      ((Path)localObject).lineTo(46.988945F, 102.0F);
      ((Path)localObject).lineTo(36.0F, 102.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\pa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */