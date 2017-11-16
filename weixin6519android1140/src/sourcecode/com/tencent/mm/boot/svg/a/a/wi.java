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

public final class wi
  extends c
{
  private final int height;
  private final int width;
  
  public wi()
  {
    GMTrace.i(15737431261184L, 117253);
    this.width = 40;
    this.height = 56;
    GMTrace.o(15737431261184L, 117253);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15737565478912L, 117254);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15737565478912L, 117254);
      return 0;
      GMTrace.o(15737565478912L, 117254);
      return 40;
      GMTrace.o(15737565478912L, 117254);
      return 56;
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
      localPaint.setColor(-7105645);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(1.0F, 0.0F);
      ((Path)localObject).cubicTo(4.17F, 3.36F, 8.43F, 5.76F, 12.0F, 9.0F);
      ((Path)localObject).cubicTo(21.51F, 15.04F, 30.72F, 21.47F, 40.0F, 28.0F);
      ((Path)localObject).lineTo(40.0F, 27.0F);
      ((Path)localObject).lineTo(40.0F, 28.0F);
      ((Path)localObject).cubicTo(26.72F, 37.37F, 13.33F, 46.61F, 0.0F, 56.0F);
      ((Path)localObject).lineTo(0.0F, 56.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\wi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */