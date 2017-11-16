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

public final class ht
  extends c
{
  private final int height;
  private final int width;
  
  public ht()
  {
    GMTrace.i(15805882302464L, 117763);
    this.width = 102;
    this.height = 102;
    GMTrace.o(15805882302464L, 117763);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15806016520192L, 117764);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15806016520192L, 117764);
      return 0;
      GMTrace.o(15806016520192L, 117764);
      return 102;
      GMTrace.o(15806016520192L, 117764);
      return 102;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -2644.0F, 0.0F, 1.0F, -2054.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(2697.9246F, 2114.546F);
      ((Path)localObject2).lineTo(2690.5F, 2121.9705F);
      ((Path)localObject2).lineTo(2692.6213F, 2124.0918F);
      ((Path)localObject2).lineTo(2700.046F, 2116.6672F);
      ((Path)localObject2).lineTo(2707.4705F, 2124.0918F);
      ((Path)localObject2).lineTo(2709.5918F, 2121.9705F);
      ((Path)localObject2).lineTo(2702.1672F, 2114.546F);
      ((Path)localObject2).lineTo(2709.5918F, 2107.1213F);
      ((Path)localObject2).lineTo(2707.4705F, 2105.0F);
      ((Path)localObject2).lineTo(2700.046F, 2112.4246F);
      ((Path)localObject2).lineTo(2692.6213F, 2105.0F);
      ((Path)localObject2).lineTo(2690.5F, 2107.1213F);
      ((Path)localObject2).lineTo(2697.9246F, 2114.546F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2695.0F, 2156.0F);
      ((Path)localObject2).cubicTo(2666.8335F, 2156.0F, 2644.0F, 2133.1665F, 2644.0F, 2105.0F);
      ((Path)localObject2).cubicTo(2644.0F, 2076.8335F, 2666.8335F, 2054.0F, 2695.0F, 2054.0F);
      ((Path)localObject2).cubicTo(2723.1665F, 2054.0F, 2746.0F, 2076.8335F, 2746.0F, 2105.0F);
      ((Path)localObject2).cubicTo(2746.0F, 2133.1665F, 2723.1665F, 2156.0F, 2695.0F, 2156.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2695.0F, 2153.0F);
      ((Path)localObject2).cubicTo(2668.4902F, 2153.0F, 2647.0F, 2131.5098F, 2647.0F, 2105.0F);
      ((Path)localObject2).cubicTo(2647.0F, 2078.4902F, 2668.4902F, 2057.0F, 2695.0F, 2057.0F);
      ((Path)localObject2).cubicTo(2721.5098F, 2057.0F, 2743.0F, 2078.4902F, 2743.0F, 2105.0F);
      ((Path)localObject2).cubicTo(2743.0F, 2131.5098F, 2721.5098F, 2153.0F, 2695.0F, 2153.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2674.0F, 2081.4993F);
      ((Path)localObject2).cubicTo(2674.0F, 2080.395F, 2674.8967F, 2079.5F, 2675.9976F, 2079.5F);
      ((Path)localObject2).lineTo(2714.0024F, 2079.5F);
      ((Path)localObject2).cubicTo(2715.1057F, 2079.5F, 2716.0F, 2080.396F, 2716.0F, 2081.4993F);
      ((Path)localObject2).lineTo(2716.0F, 2128.5007F);
      ((Path)localObject2).cubicTo(2716.0F, 2129.605F, 2715.1033F, 2130.5F, 2714.0024F, 2130.5F);
      ((Path)localObject2).lineTo(2675.9976F, 2130.5F);
      ((Path)localObject2).cubicTo(2674.8943F, 2130.5F, 2674.0F, 2129.604F, 2674.0F, 2128.5007F);
      ((Path)localObject2).lineTo(2674.0F, 2081.4993F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2677.0F, 2082.5F);
      ((Path)localObject2).lineTo(2713.0F, 2082.5F);
      ((Path)localObject2).lineTo(2713.0F, 2127.5F);
      ((Path)localObject2).lineTo(2677.0F, 2127.5F);
      ((Path)localObject2).lineTo(2677.0F, 2082.5F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2681.5F, 2087.0F);
      ((Path)localObject2).lineTo(2696.5F, 2087.0F);
      ((Path)localObject2).lineTo(2696.5F, 2090.0F);
      ((Path)localObject2).lineTo(2681.5F, 2090.0F);
      ((Path)localObject2).lineTo(2681.5F, 2087.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2681.5F, 2094.5F);
      ((Path)localObject2).lineTo(2696.5F, 2094.5F);
      ((Path)localObject2).lineTo(2696.5F, 2097.5F);
      ((Path)localObject2).lineTo(2681.5F, 2097.5F);
      ((Path)localObject2).lineTo(2681.5F, 2094.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */