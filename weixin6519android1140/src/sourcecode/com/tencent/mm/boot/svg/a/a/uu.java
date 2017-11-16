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

public final class uu
  extends c
{
  private final int height;
  private final int width;
  
  public uu()
  {
    GMTrace.i(18802158862336L, 140087);
    this.width = 750;
    this.height = 1227;
    GMTrace.o(18802158862336L, 140087);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18802293080064L, 140088);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(18802293080064L, 140088);
      return 0;
      GMTrace.o(18802293080064L, 140088);
      return 750;
      GMTrace.o(18802293080064L, 140088);
      return 1227;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject2 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -2000.0F, 0.0F, 1.0F, -904.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.restore();
      localObject3 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject3).setColor(-16352813);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(68.52344F, 1227.0F);
      ((Path)localObject2).lineTo(849.0469F, 270.4297F);
      ((Path)localObject2).lineTo(5.891446E-14F, 92.80469F);
      ((Path)localObject2).lineTo(0.0F, 1227.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.saveLayerAlpha(null, 69, 4);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localObject3 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject3).setColor(-13648396);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(801.0469F, -5.0F);
      ((Path)localObject2).lineTo(-62.109375F, 268.08594F);
      ((Path)localObject2).lineTo(-62.109375F, 550.77344F);
      ((Path)localObject2).lineTo(785.65625F, 1216.5469F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.saveLayerAlpha(null, 39, 4);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-16473373);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(-88.0F, 1110.8438F);
      ((Path)localObject1).lineTo(903.0781F, 1334.7344F);
      ((Path)localObject1).lineTo(855.39844F, 564.83594F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.saveLayerAlpha(null, 103, 4);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\uu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */