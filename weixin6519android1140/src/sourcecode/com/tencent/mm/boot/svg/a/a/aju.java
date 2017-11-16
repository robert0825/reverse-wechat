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

public final class aju
  extends c
{
  private final int height;
  private final int width;
  
  public aju()
  {
    GMTrace.i(15928825741312L, 118679);
    this.width = 63;
    this.height = 63;
    GMTrace.o(15928825741312L, 118679);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15928959959040L, 118680);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15928959959040L, 118680);
      return 0;
      GMTrace.o(15928959959040L, 118680);
      return 63;
      GMTrace.o(15928959959040L, 118680);
      return 63;
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
      localPaint.setColor(-14624737);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(35.0F, 20.0F);
      ((Path)localObject).lineTo(50.492165F, 20.0F);
      ((Path)localObject).cubicTo(51.322575F, 20.0F, 52.0F, 19.326305F, 52.0F, 18.495262F);
      ((Path)localObject).lineTo(52.0F, 13.504739F);
      ((Path)localObject).cubicTo(52.0F, 12.668316F, 51.324917F, 12.0F, 50.492165F, 12.0F);
      ((Path)localObject).lineTo(12.507836F, 12.0F);
      ((Path)localObject).cubicTo(11.677424F, 12.0F, 11.0F, 12.673695F, 11.0F, 13.504739F);
      ((Path)localObject).lineTo(11.0F, 18.495262F);
      ((Path)localObject).cubicTo(11.0F, 19.331684F, 11.675081F, 20.0F, 12.507836F, 20.0F);
      ((Path)localObject).lineTo(27.0F, 20.0F);
      ((Path)localObject).lineTo(27.0F, 52.5052F);
      ((Path)localObject).cubicTo(27.0F, 53.32327F, 27.673695F, 54.0F, 28.504738F, 54.0F);
      ((Path)localObject).lineTo(33.495262F, 54.0F);
      ((Path)localObject).cubicTo(34.331684F, 54.0F, 35.0F, 53.330753F, 35.0F, 52.5052F);
      ((Path)localObject).lineTo(35.0F, 20.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */