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

public final class uz
  extends c
{
  private final int height;
  private final int width;
  
  public uz()
  {
    GMTrace.i(15946274045952L, 118809);
    this.width = 90;
    this.height = 70;
    GMTrace.o(15946274045952L, 118809);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15946408263680L, 118810);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15946408263680L, 118810);
      return 0;
      GMTrace.o(15946408263680L, 118810);
      return 90;
      GMTrace.o(15946408263680L, 118810);
      return 70;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a((Paint)localObject, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(69.0F, 50.0F);
      ((Path)localObject).lineTo(21.0F, 50.0F);
      ((Path)localObject).lineTo(21.0F, 52.008118F);
      ((Path)localObject).cubicTo(21.0F, 53.108204F, 20.113445F, 54.0F, 18.994081F, 54.0F);
      ((Path)localObject).lineTo(16.005919F, 54.0F);
      ((Path)localObject).cubicTo(14.898081F, 54.0F, 14.0F, 53.1066F, 14.0F, 52.008118F);
      ((Path)localObject).lineTo(14.0F, 50.0F);
      ((Path)localObject).lineTo(0.0F, 50.0F);
      ((Path)localObject).lineTo(0.0F, 43.0F);
      ((Path)localObject).lineTo(14.0F, 43.0F);
      ((Path)localObject).lineTo(14.0F, 43.0F);
      ((Path)localObject).lineTo(14.0F, 40.991882F);
      ((Path)localObject).cubicTo(14.0F, 39.891796F, 14.886555F, 39.0F, 16.005919F, 39.0F);
      ((Path)localObject).lineTo(18.994081F, 39.0F);
      ((Path)localObject).cubicTo(20.10192F, 39.0F, 21.0F, 39.8934F, 21.0F, 40.991882F);
      ((Path)localObject).lineTo(21.0F, 43.0F);
      ((Path)localObject).lineTo(69.0F, 43.0F);
      ((Path)localObject).lineTo(69.0F, 40.991882F);
      ((Path)localObject).cubicTo(69.0F, 39.891796F, 69.88656F, 39.0F, 71.00592F, 39.0F);
      ((Path)localObject).lineTo(73.99408F, 39.0F);
      ((Path)localObject).cubicTo(75.10192F, 39.0F, 76.0F, 39.8934F, 76.0F, 40.991882F);
      ((Path)localObject).lineTo(76.0F, 43.0F);
      ((Path)localObject).lineTo(90.0F, 43.0F);
      ((Path)localObject).lineTo(90.0F, 50.0F);
      ((Path)localObject).lineTo(76.0F, 50.0F);
      ((Path)localObject).lineTo(76.0F, 52.008118F);
      ((Path)localObject).cubicTo(76.0F, 53.108204F, 75.11344F, 54.0F, 73.99408F, 54.0F);
      ((Path)localObject).lineTo(71.00592F, 54.0F);
      ((Path)localObject).cubicTo(69.89808F, 54.0F, 69.0F, 53.1066F, 69.0F, 52.008118F);
      ((Path)localObject).lineTo(69.0F, 50.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(0.0F, 3.99323F);
      ((Path)localObject).cubicTo(0.0F, 2.8923995F, 0.8907616F, 2.0F, 2.0059645F, 2.0F);
      ((Path)localObject).lineTo(87.99403F, 2.0F);
      ((Path)localObject).cubicTo(89.1019F, 2.0F, 90.0F, 2.8954434F, 90.0F, 3.99323F);
      ((Path)localObject).lineTo(90.0F, 66.00677F);
      ((Path)localObject).cubicTo(90.0F, 67.1076F, 89.10924F, 68.0F, 87.99403F, 68.0F);
      ((Path)localObject).lineTo(2.0059645F, 68.0F);
      ((Path)localObject).cubicTo(0.898101F, 68.0F, 0.0F, 67.10455F, 0.0F, 66.00677F);
      ((Path)localObject).lineTo(0.0F, 3.99323F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 128, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\uz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */