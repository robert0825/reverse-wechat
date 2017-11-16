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

public final class sx
  extends c
{
  private final int height;
  private final int width;
  
  public sx()
  {
    GMTrace.i(15794071142400L, 117675);
    this.width = 22;
    this.height = 13;
    GMTrace.o(15794071142400L, 117675);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15794205360128L, 117676);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15794205360128L, 117676);
      return 0;
      GMTrace.o(15794205360128L, 117676);
      return 22;
      GMTrace.o(15794205360128L, 117676);
      return 13;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setColor(-2565928);
      ((Paint)localObject2).setColor(-6842473);
      ((Paint)localObject2).setStrokeWidth(3.125F);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -1097.0F, 0.0F, 1.0F, -1509.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 988.0F, 0.0F, 1.0F, 1478.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 0.70710677F, 0.70710677F, 11.626389F, -0.70710677F, 0.70710677F, 94.94632F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(115.736046F, 38.224194F);
      ((Path)localObject2).lineTo(115.736046F, 35.24749F);
      ((Path)localObject2).lineTo(115.736046F, 27.069532F);
      ((Path)localObject2).cubicTo(115.736046F, 26.204807F, 115.03649F, 25.504086F, 114.173546F, 25.504086F);
      ((Path)localObject2).cubicTo(113.30458F, 25.504086F, 112.611046F, 26.20479F, 112.611046F, 27.069153F);
      ((Path)localObject2).lineTo(112.611046F, 39.180725F);
      ((Path)localObject2).cubicTo(112.53231F, 39.367065F, 112.48876F, 39.571815F, 112.48876F, 39.786694F);
      ((Path)localObject2).cubicTo(112.48876F, 40.57306F, 113.06137F, 41.215767F, 113.80943F, 41.33084F);
      ((Path)localObject2).cubicTo(113.92626F, 41.358826F, 114.04818F, 41.37365F, 114.173546F, 41.37365F);
      ((Path)localObject2).cubicTo(114.268715F, 41.37365F, 114.36178F, 41.365265F, 114.45206F, 41.349194F);
      ((Path)localObject2).lineTo(118.61492F, 41.349194F);
      ((Path)localObject2).lineTo(126.79288F, 41.349194F);
      ((Path)localObject2).cubicTo(127.65761F, 41.349194F, 128.35832F, 40.64964F, 128.35832F, 39.786694F);
      ((Path)localObject2).cubicTo(128.35832F, 38.917732F, 127.65762F, 38.224194F, 126.79326F, 38.224194F);
      ((Path)localObject2).lineTo(115.736046F, 38.224194F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\sx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */