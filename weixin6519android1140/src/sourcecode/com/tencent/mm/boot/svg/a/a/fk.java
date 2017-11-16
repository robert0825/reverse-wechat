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

public final class fk
  extends c
{
  private final int height;
  private final int width;
  
  public fk()
  {
    GMTrace.i(21028696752128L, 156676);
    this.width = 120;
    this.height = 120;
    GMTrace.o(21028696752128L, 156676);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21028830969856L, 156677);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21028830969856L, 156677);
      return 0;
      GMTrace.o(21028830969856L, 156677);
      return 120;
      GMTrace.o(21028830969856L, 156677);
      return 120;
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
      ((Paint)localObject).setColor(-16139513);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(115.8F, 60.68889F);
      localPath.cubicTo(115.8F, 29.181868F, 90.81813F, 4.2F, 59.31111F, 4.2F);
      localPath.cubicTo(29.181868F, 4.2F, 4.2F, 29.181868F, 4.2F, 60.68889F);
      localPath.cubicTo(4.2F, 90.81813F, 29.181868F, 115.8F, 59.31111F, 115.8F);
      localPath.cubicTo(90.81813F, 115.8F, 115.8F, 90.81813F, 115.8F, 60.68889F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(32.582005F, 63.962925F);
      ((Path)localObject).cubicTo(32.19982F, 63.567383F, 32.154182F, 62.887268F, 32.48211F, 62.44106F);
      ((Path)localObject).lineTo(34.52614F, 59.65979F);
      ((Path)localObject).cubicTo(34.853153F, 59.21483F, 35.480194F, 59.131527F, 35.906685F, 59.458405F);
      ((Path)localObject).lineTo(50.22881F, 70.43549F);
      ((Path)localObject).cubicTo(50.66425F, 70.76923F, 51.36269F, 70.752F, 51.77925F, 70.40497F);
      ((Path)localObject).lineTo(87.55628F, 40.59981F);
      ((Path)localObject).cubicTo(87.97712F, 40.249214F, 88.639626F, 40.282352F, 89.03474F, 40.672565F);
      ((Path)localObject).lineTo(90.83008F, 42.44564F);
      ((Path)localObject).cubicTo(91.22577F, 42.836422F, 91.23205F, 43.46271F, 90.83447F, 43.85398F);
      ((Path)localObject).lineTo(51.728115F, 82.340485F);
      ((Path)localObject).cubicTo(51.334854F, 82.72751F, 50.700047F, 82.714195F, 50.32405F, 82.325066F);
      ((Path)localObject).lineTo(32.582005F, 63.962925F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */