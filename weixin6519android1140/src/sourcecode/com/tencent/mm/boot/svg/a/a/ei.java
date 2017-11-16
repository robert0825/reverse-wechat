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

public final class ei
  extends c
{
  private final int height;
  private final int width;
  
  public ei()
  {
    GMTrace.i(15848026669056L, 118077);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15848026669056L, 118077);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15848160886784L, 118078);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15848160886784L, 118078);
      return 0;
      GMTrace.o(15848160886784L, 118078);
      return 96;
      GMTrace.o(15848160886784L, 118078);
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
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 23.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.0F, 25.019958F);
      ((Path)localObject2).cubicTo(9.014991F, 17.016632F, 17.029982F, 9.003326F, 25.054966F, 1.0F);
      ((Path)localObject2).cubicTo(26.47408F, 2.4370062F, 27.893192F, 3.8740125F, 29.292316F, 5.3209977F);
      ((Path)localObject2).cubicTo(23.73579F, 10.869439F, 18.179262F, 16.4079F, 12.63273F, 21.95634F);
      ((Path)localObject2).cubicTo(24.755154F, 21.96632F, 36.877575F, 21.95634F, 49.0F, 21.96632F);
      ((Path)localObject2).lineTo(49.0F, 28.013721F);
      ((Path)localObject2).lineTo(12.582761F, 28.013721F);
      ((Path)localObject2).cubicTo(18.129293F, 33.612057F, 23.725796F, 39.15052F, 29.292316F, 44.728897F);
      ((Path)localObject2).cubicTo(27.873203F, 46.155926F, 26.444098F, 47.57297F, 25.01499F, 49.0F);
      ((Path)localObject2).cubicTo(17.009995F, 41.006653F, 9.004997F, 33.013306F, 1.0F, 25.019958F);
      ((Path)localObject2).lineTo(1.0F, 25.019958F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */