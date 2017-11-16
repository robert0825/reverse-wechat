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

public final class xp
  extends c
{
  private final int height;
  private final int width;
  
  public xp()
  {
    GMTrace.i(15905740292096L, 118507);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15905740292096L, 118507);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15905874509824L, 118508);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15905874509824L, 118508);
      return 0;
      GMTrace.o(15905874509824L, 118508);
      return 108;
      GMTrace.o(15905874509824L, 118508);
      return 108;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 20.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-499359);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(31.785F, 36.737F);
      ((Path)localObject2).lineTo(31.785F, 67.704F);
      ((Path)localObject2).lineTo(59.785F, 52.121F);
      ((Path)localObject2).lineTo(59.785F, 19.704F);
      ((Path)localObject2).lineTo(31.785F, 36.737F);
      ((Path)localObject2).lineTo(31.785F, 36.737F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(49152);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(-0.215F, 51.722668F);
      ((Path)localObject2).lineTo(28.785F, 67.704F);
      ((Path)localObject2).lineTo(28.785F, 36.736355F);
      ((Path)localObject2).lineTo(-0.215F, 19.704F);
      ((Path)localObject2).lineTo(-0.215F, 51.722668F);
      ((Path)localObject2).lineTo(-0.215F, 51.722668F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-12799249);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(30.079521F, -0.296F);
      ((Path)localObject1).lineTo(1.785F, 15.418F);
      ((Path)localObject1).cubicTo(1.785F, 15.418F, 28.857569F, 31.506F, 30.285F, 32.704F);
      ((Path)localObject1).cubicTo(31.01162F, 32.435F, 58.785F, 15.418F, 58.785F, 15.418F);
      ((Path)localObject1).lineTo(30.079521F, -0.296F);
      ((Path)localObject1).lineTo(30.079521F, -0.296F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\xp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */