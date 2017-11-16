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

public final class mb
  extends c
{
  private final int height;
  private final int width;
  
  public mb()
  {
    GMTrace.i(15802124206080L, 117735);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15802124206080L, 117735);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15802258423808L, 117736);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15802258423808L, 117736);
      return 0;
      GMTrace.o(15802258423808L, 117736);
      return 108;
      GMTrace.o(15802258423808L, 117736);
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
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-14187817);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(108.0F, 0.0F);
      localPath.lineTo(108.0F, 108.0F);
      localPath.lineTo(0.0F, 108.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(59.0F, 27.0F);
      ((Path)localObject).lineTo(80.0F, 27.0F);
      ((Path)localObject).cubicTo(81.327415F, 27.113115F, 82.9685F, 28.671097F, 83.0F, 30.0F);
      ((Path)localObject).lineTo(83.0F, 51.0F);
      ((Path)localObject).cubicTo(82.946F, 51.277657F, 82.61898F, 52.063435F, 81.5F, 52.5F);
      ((Path)localObject).lineTo(48.5F, 85.5F);
      ((Path)localObject).cubicTo(47.35823F, 87.322365F, 45.247627F, 87.3284F, 44.0F, 85.5F);
      ((Path)localObject).lineTo(24.5F, 66.0F);
      ((Path)localObject).cubicTo(23.321037F, 65.400536F, 22.99702F, 64.616264F, 23.0F, 63.0F);
      ((Path)localObject).cubicTo(23.00152F, 62.774742F, 23.328537F, 61.988964F, 24.5F, 61.5F);
      ((Path)localObject).lineTo(57.5F, 28.5F);
      ((Path)localObject).cubicTo(57.912754F, 27.405708F, 59.0F, 27.0F, 59.0F, 27.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(67.77778F, 36.0F);
      ((Path)localObject).cubicTo(70.865555F, 36.0F, 74.0F, 39.134445F, 74.0F, 43.77778F);
      ((Path)localObject).cubicTo(74.0F, 46.865555F, 70.865555F, 50.0F, 67.77778F, 50.0F);
      ((Path)localObject).cubicTo(63.134445F, 50.0F, 60.0F, 46.865555F, 60.0F, 43.77778F);
      ((Path)localObject).cubicTo(60.0F, 39.134445F, 63.134445F, 36.0F, 67.77778F, 36.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */