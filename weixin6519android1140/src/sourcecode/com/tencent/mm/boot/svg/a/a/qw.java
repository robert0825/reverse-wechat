package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class qw
  extends c
{
  private final int height;
  private final int width;
  
  public qw()
  {
    GMTrace.i(15768838209536L, 117487);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15768838209536L, 117487);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15768972427264L, 117488);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15768972427264L, 117488);
      return 0;
      GMTrace.o(15768972427264L, 117488);
      return 96;
      GMTrace.o(15768972427264L, 117488);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-7368817);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 15.269435F);
      ((Path)localObject2).cubicTo(9.8166485F, 5.6009107F, 23.567987F, -0.087618165F, 37.479923F, 0.0012651015F);
      ((Path)localObject2).cubicTo(51.411938F, -0.09749408F, 65.17332F, 5.591035F, 75.0F, 15.269435F);
      ((Path)localObject2).cubicTo(73.404045F, 16.839706F, 71.79804F, 18.419853F, 70.21213F, 20.0F);
      ((Path)localObject2).cubicTo(61.65016F, 11.536338F, 49.65538F, 6.539123F, 37.5F, 6.6280065F);
      ((Path)localObject2).cubicTo(25.354658F, 6.548999F, 13.349839F, 11.526462F, 4.8079495F, 20.0F);
      ((Path)localObject2).cubicTo(3.222029F, 18.4001F, 1.5658458F, 16.869333F, 0.0F, 15.269435F);
      ((Path)localObject2).lineTo(0.0F, 15.269435F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(10.0F, 26.154007F);
      ((Path)localObject2).cubicTo(17.026365F, 19.148605F, 26.678946F, 14.890619F, 36.52973F, 15.002138F);
      ((Path)localObject2).cubicTo(46.360695F, 14.910895F, 55.983543F, 19.168882F, 63.0F, 26.143867F);
      ((Path)localObject2).cubicTo(61.42427F, 27.765959F, 59.84854F, 29.37791F, 58.27281F, 31.0F);
      ((Path)localObject2).cubicTo(52.505047F, 25.271996F, 44.616493F, 21.693258F, 36.51982F, 21.804777F);
      ((Path)localObject2).cubicTo(28.413239F, 21.68312F, 20.504862F, 25.251719F, 14.727188F, 31.0F);
      ((Path)localObject2).cubicTo(13.151459F, 29.388048F, 11.575729F, 27.776096F, 10.0F, 26.154007F);
      ((Path)localObject2).lineTo(10.0F, 26.154007F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(21.0F, 36.39119F);
      ((Path)localObject2).cubicTo(26.48116F, 31.299276F, 34.513546F, 28.796799F, 41.967922F, 30.564959F);
      ((Path)localObject2).cubicTo(46.1635F, 31.386234F, 49.84086F, 33.676147F, 53.0F, 36.39119F);
      ((Path)localObject2).cubicTo(51.42541F, 37.917797F, 49.880722F, 39.46373F, 48.29617F, 40.990337F);
      ((Path)localObject2).cubicTo(42.246964F, 35.08681F, 31.763002F, 35.08681F, 25.713797F, 41.0F);
      ((Path)localObject2).cubicTo(24.13921F, 39.473392F, 22.584553F, 37.917797F, 21.0F, 36.39119F);
      ((Path)localObject2).lineTo(21.0F, 36.39119F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(31.0F, 47.010326F);
      ((Path)localObject1).cubicTo(34.274048F, 44.367195F, 38.80581F, 44.26062F, 42.0F, 47.106247F);
      ((Path)localObject1).cubicTo(40.193283F, 49.088593F, 38.356625F, 51.038967F, 36.529945F, 53.0F);
      ((Path)localObject1).cubicTo(34.61343F, 51.070942F, 32.82668F, 49.01399F, 31.0F, 47.010326F);
      ((Path)localObject1).lineTo(31.0F, 47.010326F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\qw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */