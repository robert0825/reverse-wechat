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

public final class rb
  extends c
{
  private final int height;
  private final int width;
  
  public rb()
  {
    GMTrace.i(15915135533056L, 118577);
    this.width = 66;
    this.height = 46;
    GMTrace.o(15915135533056L, 118577);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15915269750784L, 118578);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15915269750784L, 118578);
      return 0;
      GMTrace.o(15915269750784L, 118578);
      return 66;
      GMTrace.o(15915269750784L, 118578);
      return 46;
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
      localPaint.setColor(-9537135);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(66.0F, 0.0F);
      ((Path)localObject).lineTo(66.0F, 46.0F);
      ((Path)localObject).lineTo(12.0F, 46.0F);
      ((Path)localObject).cubicTo(12.01F, 41.1F, 11.99F, 36.19F, 12.01F, 31.29F);
      ((Path)localObject).cubicTo(8.14F, 28.86F, 0.15407985F, 23.0F, 0.15407985F, 23.0F);
      ((Path)localObject).cubicTo(3.3064237F, 20.753471F, 8.0F, 17.27F, 12.0F, 14.71F);
      ((Path)localObject).cubicTo(11.99F, 9.81F, 12.01F, 4.9F, 12.0F, 0.0F);
      ((Path)localObject).lineTo(66.0F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(25.162472F, 17.326578F);
      ((Path)localObject).cubicTo(21.008757F, 18.444845F, 19.530993F, 24.33572F, 22.736143F, 27.251204F);
      ((Path)localObject).cubicTo(25.651731F, 30.486193F, 31.642666F, 28.988512F, 32.69108F, 24.765055F);
      ((Path)localObject).cubicTo(34.268692F, 20.401814F, 29.5059F, 15.709083F, 25.162472F, 17.326578F);
      ((Path)localObject).lineTo(25.162472F, 17.326578F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(49.15318F, 17.331114F);
      ((Path)localObject).cubicTo(45.00983F, 18.449194F, 43.542187F, 24.3291F, 46.71709F, 27.234114F);
      ((Path)localObject).cubicTo(49.622425F, 30.478544F, 55.602825F, 29.011063F, 56.681095F, 24.798294F);
      ((Path)localObject).cubicTo(58.288513F, 20.435783F, 53.516174F, 15.693925F, 49.15318F, 17.331114F);
      ((Path)localObject).lineTo(49.15318F, 17.331114F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\rb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */