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

public final class sr
  extends c
{
  private final int height;
  private final int width;
  
  public sr()
  {
    GMTrace.i(20323651026944L, 151423);
    this.width = 96;
    this.height = 96;
    GMTrace.o(20323651026944L, 151423);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20323785244672L, 151424);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20323785244672L, 151424);
      return 0;
      GMTrace.o(20323785244672L, 151424);
      return 96;
      GMTrace.o(20323785244672L, 151424);
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 24.019958F);
      ((Path)localObject2).cubicTo(8.014991F, 16.016632F, 16.029982F, 8.003326F, 24.054966F, 0.0F);
      ((Path)localObject2).cubicTo(25.47408F, 1.4370062F, 26.893192F, 2.8740125F, 28.292316F, 4.3209977F);
      ((Path)localObject2).cubicTo(22.73579F, 9.869439F, 17.179262F, 15.4079F, 11.63273F, 20.95634F);
      ((Path)localObject2).cubicTo(23.755154F, 20.96632F, 35.877575F, 20.95634F, 48.0F, 20.96632F);
      ((Path)localObject2).lineTo(48.0F, 27.013721F);
      ((Path)localObject2).lineTo(11.582761F, 27.013721F);
      ((Path)localObject2).cubicTo(17.129293F, 32.612057F, 22.725796F, 38.15052F, 28.292316F, 43.728897F);
      ((Path)localObject2).cubicTo(26.873203F, 45.155926F, 25.444098F, 46.57297F, 24.01499F, 48.0F);
      ((Path)localObject2).cubicTo(16.009995F, 40.006653F, 8.004997F, 32.013306F, 0.0F, 24.019958F);
      ((Path)localObject2).lineTo(0.0F, 24.019958F);
      ((Path)localObject2).lineTo(0.0F, 24.019958F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\sr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */