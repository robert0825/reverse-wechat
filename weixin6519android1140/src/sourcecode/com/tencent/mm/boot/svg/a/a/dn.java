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
import com.tencent.mm.svg.c;

public final class dn
  extends c
{
  private final int height;
  private final int width;
  
  public dn()
  {
    GMTrace.i(17576616787968L, 130956);
    this.width = 50;
    this.height = 50;
    GMTrace.o(17576616787968L, 130956);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17576751005696L, 130957);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17576751005696L, 130957);
      return 0;
      GMTrace.o(17576751005696L, 130957);
      return 50;
      GMTrace.o(17576751005696L, 130957);
      return 50;
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
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -289.0F, 0.0F, 1.0F, -369.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 302.0F, 0.0F, 1.0F, 370.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 1.5F);
      ((Path)localObject3).cubicTo(0.0F, 0.6715728F, 0.6715728F, 0.0F, 1.5F, 0.0F);
      ((Path)localObject3).lineTo(2.5F, 0.0F);
      ((Path)localObject3).cubicTo(3.3284273F, 0.0F, 4.0F, 0.6715728F, 4.0F, 1.5F);
      ((Path)localObject3).lineTo(4.0F, 46.5F);
      ((Path)localObject3).cubicTo(4.0F, 47.328426F, 3.3284273F, 48.0F, 2.5F, 48.0F);
      ((Path)localObject3).lineTo(1.5F, 48.0F);
      ((Path)localObject3).cubicTo(0.6715728F, 48.0F, 0.0F, 47.328426F, 0.0F, 46.5F);
      ((Path)localObject3).lineTo(0.0F, 1.5F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(20.0F, 1.5F);
      ((Path)localObject2).cubicTo(20.0F, 0.6715728F, 20.671574F, 0.0F, 21.5F, 0.0F);
      ((Path)localObject2).lineTo(22.5F, 0.0F);
      ((Path)localObject2).cubicTo(23.328426F, 0.0F, 24.0F, 0.6715728F, 24.0F, 1.5F);
      ((Path)localObject2).lineTo(24.0F, 46.5F);
      ((Path)localObject2).cubicTo(24.0F, 47.328426F, 23.328426F, 48.0F, 22.5F, 48.0F);
      ((Path)localObject2).lineTo(21.5F, 48.0F);
      ((Path)localObject2).cubicTo(20.671574F, 48.0F, 20.0F, 47.328426F, 20.0F, 46.5F);
      ((Path)localObject2).lineTo(20.0F, 1.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */