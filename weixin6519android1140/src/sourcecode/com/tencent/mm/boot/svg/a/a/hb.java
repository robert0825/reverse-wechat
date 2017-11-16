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

public final class hb
  extends c
{
  private final int height;
  private final int width;
  
  public hb()
  {
    GMTrace.i(15875943956480L, 118285);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15875943956480L, 118285);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15876078174208L, 118286);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15876078174208L, 118286);
      return 0;
      GMTrace.o(15876078174208L, 118286);
      return 96;
      GMTrace.o(15876078174208L, 118286);
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(77.0F, 71.0F);
      ((Path)localObject).lineTo(53.0F, 76.0F);
      ((Path)localObject).lineTo(53.0F, 26.0F);
      ((Path)localObject).lineTo(77.0F, 21.0F);
      ((Path)localObject).lineTo(77.0F, 71.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(20.0F, 21.0F);
      ((Path)localObject).lineTo(44.0F, 26.0F);
      ((Path)localObject).lineTo(44.0F, 76.0F);
      ((Path)localObject).lineTo(20.0F, 71.0F);
      ((Path)localObject).lineTo(20.0F, 21.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(85.0F, 18.0F);
      ((Path)localObject).cubicTo(85.0F, 14.723531F, 82.27647F, 12.0F, 79.0F, 12.0F);
      ((Path)localObject).cubicTo(78.840515F, 12.0F, 78.76661F, 12.008562F, 79.0F, 12.0F);
      ((Path)localObject).lineTo(79.0F, 12.0F);
      ((Path)localObject).lineTo(79.0F, 12.0F);
      ((Path)localObject).cubicTo(77.96046F, 12.0468645F, 77.32959F, 12.18205F, 77.0F, 12.0F);
      ((Path)localObject).lineTo(49.0F, 18.0F);
      ((Path)localObject).lineTo(20.0F, 12.0F);
      ((Path)localObject).cubicTo(19.670408F, 12.18205F, 19.039543F, 12.0468645F, 18.0F, 12.0F);
      ((Path)localObject).lineTo(18.0F, 12.0F);
      ((Path)localObject).lineTo(18.0F, 12.0F);
      ((Path)localObject).cubicTo(18.233389F, 12.008562F, 18.159487F, 12.0F, 18.0F, 12.0F);
      ((Path)localObject).cubicTo(14.723531F, 12.0F, 12.0F, 14.723531F, 12.0F, 18.0F);
      ((Path)localObject).cubicTo(12.0F, 18.159487F, 12.008562F, 18.233389F, 12.0F, 18.0F);
      ((Path)localObject).lineTo(12.0F, 18.0F);
      ((Path)localObject).lineTo(12.0F, 72.0F);
      ((Path)localObject).lineTo(12.0F, 72.0F);
      ((Path)localObject).cubicTo(12.008562F, 72.45797F, 12.0F, 72.53187F, 12.0F, 73.0F);
      ((Path)localObject).cubicTo(12.0F, 75.96783F, 14.723531F, 78.69136F, 18.0F, 79.0F);
      ((Path)localObject).cubicTo(18.159487F, 78.69136F, 18.233389F, 78.68279F, 18.0F, 79.0F);
      ((Path)localObject).lineTo(18.0F, 79.0F);
      ((Path)localObject).lineTo(49.0F, 85.0F);
      ((Path)localObject).lineTo(79.0F, 79.0F);
      ((Path)localObject).lineTo(79.0F, 79.0F);
      ((Path)localObject).cubicTo(78.76661F, 78.68279F, 78.840515F, 78.69136F, 79.0F, 79.0F);
      ((Path)localObject).cubicTo(82.27647F, 78.69136F, 85.0F, 75.96783F, 85.0F, 73.0F);
      ((Path)localObject).cubicTo(85.0F, 72.53187F, 84.99144F, 72.45797F, 85.0F, 72.0F);
      ((Path)localObject).lineTo(85.0F, 72.0F);
      ((Path)localObject).lineTo(85.0F, 18.0F);
      ((Path)localObject).lineTo(85.0F, 18.0F);
      ((Path)localObject).cubicTo(84.99144F, 18.233389F, 85.0F, 18.159487F, 85.0F, 18.0F);
      ((Path)localObject).lineTo(85.0F, 18.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */