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

public final class dd
  extends c
{
  private final int height;
  private final int width;
  
  public dd()
  {
    GMTrace.i(17578495836160L, 130970);
    this.width = 55;
    this.height = 62;
    GMTrace.o(17578495836160L, 130970);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17578630053888L, 130971);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17578630053888L, 130971);
      return 0;
      GMTrace.o(17578630053888L, 130971);
      return 55;
      GMTrace.o(17578630053888L, 130971);
      return 62;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -377.0F, 0.0F, 1.0F, -393.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(377.0F, 449.61288F);
      ((Path)localObject2).cubicTo(377.0F, 453.58984F, 379.7965F, 455.20892F, 383.24622F, 453.2292F);
      ((Path)localObject2).lineTo(428.73413F, 427.1242F);
      ((Path)localObject2).cubicTo(432.1838F, 425.14447F, 432.1838F, 421.9347F, 428.73413F, 419.95496F);
      ((Path)localObject2).lineTo(383.24622F, 393.84995F);
      ((Path)localObject2).cubicTo(379.7965F, 391.87024F, 377.0F, 393.4976F, 377.0F, 397.46625F);
      ((Path)localObject2).lineTo(377.0F, 449.61288F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */