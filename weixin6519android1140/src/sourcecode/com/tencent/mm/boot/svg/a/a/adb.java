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

public final class adb
  extends c
{
  private final int height;
  private final int width;
  
  public adb()
  {
    GMTrace.i(15934462885888L, 118721);
    this.width = 66;
    this.height = 79;
    GMTrace.o(15934462885888L, 118721);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15934597103616L, 118722);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15934597103616L, 118722);
      return 0;
      GMTrace.o(15934597103616L, 118722);
      return 66;
      GMTrace.o(15934597103616L, 118722);
      return 79;
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
      ((Path)localObject).moveTo(10.536117F, 55.789783F);
      ((Path)localObject).cubicTo(4.649229F, 49.98656F, 1.0F, 41.91944F, 1.0F, 33.0F);
      ((Path)localObject).cubicTo(1.0F, 15.326888F, 15.326888F, 1.0F, 33.0F, 1.0F);
      ((Path)localObject).cubicTo(50.67311F, 1.0F, 65.0F, 15.326888F, 65.0F, 33.0F);
      ((Path)localObject).cubicTo(65.0F, 41.959976F, 61.317528F, 50.059868F, 55.383484F, 55.868763F);
      ((Path)localObject).lineTo(55.435028F, 55.92031F);
      ((Path)localObject).lineTo(32.92031F, 78.43503F);
      ((Path)localObject).lineTo(10.405592F, 55.92031F);
      ((Path)localObject).lineTo(10.536117F, 55.789783F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\adb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */