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

public final class ahh
  extends c
{
  private final int height;
  private final int width;
  
  public ahh()
  {
    GMTrace.i(15740652486656L, 117277);
    this.width = 22;
    this.height = 36;
    GMTrace.o(15740652486656L, 117277);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15740786704384L, 117278);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15740786704384L, 117278);
      return 0;
      GMTrace.o(15740786704384L, 117278);
      return 22;
      GMTrace.o(15740786704384L, 117278);
      return 36;
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
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(10.0F, 0.0F);
      ((Path)localObject).lineTo(11.59F, 0.0F);
      ((Path)localObject).cubicTo(14.44F, 4.26F, 18.06F, 8.06F, 22.0F, 11.34F);
      ((Path)localObject).lineTo(22.0F, 11.75F);
      ((Path)localObject).cubicTo(19.0F, 11.97F, 16.0F, 12.05F, 13.0F, 12.02F);
      ((Path)localObject).cubicTo(13.05F, 20.01F, 12.89F, 28.01F, 13.09F, 36.0F);
      ((Path)localObject).lineTo(9.0F, 36.0F);
      ((Path)localObject).lineTo(9.0F, 12.03F);
      ((Path)localObject).cubicTo(6.0F, 12.04F, 3.0F, 11.98F, 0.0F, 11.77F);
      ((Path)localObject).lineTo(0.0F, 11.38F);
      ((Path)localObject).cubicTo(3.84F, 8.02F, 7.68F, 4.33F, 10.39F, 0.0F);
      ((Path)localObject).lineTo(10.0F, 0.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ahh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */