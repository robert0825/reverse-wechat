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

public final class ov
  extends c
{
  private final int height;
  private final int width;
  
  public ov()
  {
    GMTrace.i(15729109762048L, 117191);
    this.width = 135;
    this.height = 135;
    GMTrace.o(15729109762048L, 117191);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15729243979776L, 117192);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15729243979776L, 117192);
      return 0;
      GMTrace.o(15729243979776L, 117192);
      return 135;
      GMTrace.o(15729243979776L, 117192);
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
      localPaint.setColor(-13917627);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(39.00101F, 27.0F);
      ((Path)localObject).cubicTo(37.343597F, 27.0F, 36.0F, 28.337994F, 36.0F, 29.991224F);
      ((Path)localObject).lineTo(36.0F, 106.00877F);
      ((Path)localObject).cubicTo(36.0F, 107.66078F, 37.33673F, 109.0F, 39.00101F, 109.0F);
      ((Path)localObject).lineTo(96.998985F, 109.0F);
      ((Path)localObject).cubicTo(98.6564F, 109.0F, 100.0F, 107.66201F, 100.0F, 106.00877F);
      ((Path)localObject).lineTo(100.0F, 29.991224F);
      ((Path)localObject).cubicTo(100.0F, 28.339216F, 98.66327F, 27.0F, 96.998985F, 27.0F);
      ((Path)localObject).lineTo(39.00101F, 27.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(41.0F, 32.0F);
      ((Path)localObject).lineTo(41.0F, 104.0F);
      ((Path)localObject).lineTo(95.0F, 104.0F);
      ((Path)localObject).lineTo(95.0F, 32.0F);
      ((Path)localObject).lineTo(41.0F, 32.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(90.0F, 42.0F);
      ((Path)localObject).lineTo(90.0F, 47.0F);
      ((Path)localObject).lineTo(46.0F, 47.0F);
      ((Path)localObject).lineTo(46.0F, 42.0F);
      ((Path)localObject).lineTo(90.0F, 42.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(80.0F, 56.0F);
      ((Path)localObject).lineTo(80.0F, 61.0F);
      ((Path)localObject).lineTo(46.0F, 61.0F);
      ((Path)localObject).lineTo(46.0F, 56.0F);
      ((Path)localObject).lineTo(80.0F, 56.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(70.0F, 70.0F);
      ((Path)localObject).lineTo(70.0F, 75.0F);
      ((Path)localObject).lineTo(46.0F, 75.0F);
      ((Path)localObject).lineTo(46.0F, 70.0F);
      ((Path)localObject).lineTo(70.0F, 70.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */