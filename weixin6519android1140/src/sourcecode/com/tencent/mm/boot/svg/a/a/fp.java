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

public final class fp
  extends c
{
  private final int height;
  private final int width;
  
  public fp()
  {
    GMTrace.i(15917283016704L, 118593);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15917283016704L, 118593);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15917417234432L, 118594);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15917417234432L, 118594);
      return 0;
      GMTrace.o(15917417234432L, 118594);
      return 60;
      GMTrace.o(15917417234432L, 118594);
      return 60;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-5592406);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -154.0F, 0.0F, 1.0F, -132.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 160.0F, 0.0F, 1.0F, 141.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 6.0063868F);
      ((Path)localObject2).cubicTo(0.0F, 2.6891508F, 2.6835413F, 0.0F, 6.0063868F, 0.0F);
      ((Path)localObject2).lineTo(41.993614F, 0.0F);
      ((Path)localObject2).cubicTo(45.31085F, 0.0F, 48.0F, 2.6835413F, 48.0F, 6.0063868F);
      ((Path)localObject2).lineTo(48.0F, 41.993614F);
      ((Path)localObject2).cubicTo(48.0F, 45.31085F, 45.31646F, 48.0F, 41.993614F, 48.0F);
      ((Path)localObject2).lineTo(6.0063868F, 48.0F);
      ((Path)localObject2).cubicTo(2.6891508F, 48.0F, 0.0F, 45.31646F, 0.0F, 41.993614F);
      ((Path)localObject2).lineTo(0.0F, 6.0063868F);
      ((Path)localObject2).lineTo(0.0F, 6.0063868F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(4.0F, 5.9972916F);
      ((Path)localObject2).cubicTo(4.0F, 4.894218F, 4.89154F, 4.0F, 5.9972916F, 4.0F);
      ((Path)localObject2).lineTo(42.00271F, 4.0F);
      ((Path)localObject2).cubicTo(43.10578F, 4.0F, 44.0F, 4.89154F, 44.0F, 5.9972916F);
      ((Path)localObject2).lineTo(44.0F, 42.00271F);
      ((Path)localObject2).cubicTo(44.0F, 43.10578F, 43.10846F, 44.0F, 42.00271F, 44.0F);
      ((Path)localObject2).lineTo(5.9972916F, 44.0F);
      ((Path)localObject2).cubicTo(4.894218F, 44.0F, 4.0F, 43.10846F, 4.0F, 42.00271F);
      ((Path)localObject2).lineTo(4.0F, 5.9972916F);
      ((Path)localObject2).lineTo(4.0F, 5.9972916F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */