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

public final class nq
  extends c
{
  private final int height;
  private final int width;
  
  public nq()
  {
    GMTrace.i(15758637662208L, 117411);
    this.width = 20;
    this.height = 36;
    GMTrace.o(15758637662208L, 117411);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15758771879936L, 117412);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15758771879936L, 117412);
      return 0;
      GMTrace.o(15758771879936L, 117412);
      return 20;
      GMTrace.o(15758771879936L, 117412);
      return 36;
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
      localPaint1.setColor(-6710887);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.21F, 2.83F);
      ((Path)localObject2).cubicTo(1.15F, 1.89F, 2.09F, 0.94F, 3.03F, 0.0F);
      ((Path)localObject2).cubicTo(8.69F, 5.66F, 14.34F, 11.31F, 19.99F, 16.97F);
      ((Path)localObject2).cubicTo(14.34F, 22.63F, 8.69F, 28.29F, 3.03F, 33.94F);
      ((Path)localObject2).cubicTo(2.09F, 33.0F, 1.15F, 32.06F, 0.21F, 31.12F);
      ((Path)localObject2).cubicTo(4.91F, 26.39F, 9.64F, 21.7F, 14.33F, 16.97F);
      ((Path)localObject2).cubicTo(9.64F, 12.25F, 4.91F, 7.55F, 0.21F, 2.83F);
      ((Path)localObject2).lineTo(0.21F, 2.83F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\nq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */