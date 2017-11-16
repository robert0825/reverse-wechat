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

public final class pp
  extends c
{
  private final int height;
  private final int width;
  
  public pp()
  {
    GMTrace.i(15817425027072L, 117849);
    this.width = 75;
    this.height = 75;
    GMTrace.o(15817425027072L, 117849);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15817559244800L, 117850);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15817559244800L, 117850);
      return 0;
      GMTrace.o(15817559244800L, 117850);
      return 75;
      GMTrace.o(15817559244800L, 117850);
      return 75;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-14105561);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 7.0F, 0.0F, 1.0F, 7.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(31.0F, 62.0F);
      ((Path)localObject3).cubicTo(13.879172F, 62.0F, 0.0F, 48.120827F, 0.0F, 31.0F);
      ((Path)localObject3).cubicTo(0.0F, 13.879172F, 13.879172F, 0.0F, 31.0F, 0.0F);
      ((Path)localObject3).cubicTo(48.120827F, 0.0F, 62.0F, 13.879172F, 62.0F, 31.0F);
      ((Path)localObject3).cubicTo(62.0F, 48.120827F, 48.120827F, 62.0F, 31.0F, 62.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(31.0F, 56.833332F);
      ((Path)localObject3).cubicTo(45.267357F, 56.833332F, 56.833332F, 45.267357F, 56.833332F, 31.0F);
      ((Path)localObject3).cubicTo(56.833332F, 16.732643F, 45.267357F, 5.1666665F, 31.0F, 5.1666665F);
      ((Path)localObject3).cubicTo(16.732643F, 5.1666665F, 5.1666665F, 16.732643F, 5.1666665F, 31.0F);
      ((Path)localObject3).cubicTo(5.1666665F, 45.267357F, 16.732643F, 56.833332F, 31.0F, 56.833332F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(21.958334F, 23.458334F);
      ((Path)localObject2).cubicTo(21.958334F, 22.629908F, 22.629908F, 21.958334F, 23.458334F, 21.958334F);
      ((Path)localObject2).lineTo(38.541668F, 21.958334F);
      ((Path)localObject2).cubicTo(39.370094F, 21.958334F, 40.041668F, 22.629908F, 40.041668F, 23.458334F);
      ((Path)localObject2).lineTo(40.041668F, 38.541668F);
      ((Path)localObject2).cubicTo(40.041668F, 39.370094F, 39.370094F, 40.041668F, 38.541668F, 40.041668F);
      ((Path)localObject2).lineTo(23.458334F, 40.041668F);
      ((Path)localObject2).cubicTo(22.629908F, 40.041668F, 21.958334F, 39.370094F, 21.958334F, 38.541668F);
      ((Path)localObject2).lineTo(21.958334F, 23.458334F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\pp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */