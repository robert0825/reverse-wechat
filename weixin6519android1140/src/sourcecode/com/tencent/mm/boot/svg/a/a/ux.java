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

public final class ux
  extends c
{
  private final int height;
  private final int width;
  
  public ux()
  {
    GMTrace.i(15885070761984L, 118353);
    this.width = 90;
    this.height = 70;
    GMTrace.o(15885070761984L, 118353);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15885204979712L, 118354);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15885204979712L, 118354);
      return 0;
      GMTrace.o(15885204979712L, 118354);
      return 90;
      GMTrace.o(15885204979712L, 118354);
      return 70;
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
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 4.4922566F);
      ((Path)localObject2).cubicTo(0.46F, 1.6837293F, 3.04F, -0.3052276F, 5.88F, 0.044588927F);
      ((Path)localObject2).cubicTo(31.95F, 0.02459941F, 58.02F, 0.03459417F, 84.09F, 0.044588927F);
      ((Path)localObject2).cubicTo(86.85F, -0.31522238F, 89.24F, 1.5438027F, 90.0F, 4.1324453F);
      ((Path)localObject2).lineTo(90.0F, 61.532345F);
      ((Path)localObject2).cubicTo(89.6F, 63.73119F, 88.0F, 65.33035F, 85.92F, 66.0F);
      ((Path)localObject2).lineTo(4.35F, 66.0F);
      ((Path)localObject2).cubicTo(2.2F, 65.55024F, 0.66F, 63.94108F, 0.0F, 61.892155F);
      ((Path)localObject2).lineTo(0.0F, 4.4922566F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(7.0F, 14.0F);
      ((Path)localObject2).lineTo(83.0F, 14.0F);
      ((Path)localObject2).lineTo(83.0F, 26.0F);
      ((Path)localObject2).lineTo(7.0F, 26.0F);
      ((Path)localObject2).lineTo(7.0F, 14.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */