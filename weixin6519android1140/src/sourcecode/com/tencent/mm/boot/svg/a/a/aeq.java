package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class aeq
  extends c
{
  private final int height;
  private final int width;
  
  public aeq()
  {
    GMTrace.i(15801855770624L, 117733);
    this.width = 64;
    this.height = 64;
    GMTrace.o(15801855770624L, 117733);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15801989988352L, 117734);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15801989988352L, 117734);
      return 0;
      GMTrace.o(15801989988352L, 117734);
      return 64;
      GMTrace.o(15801989988352L, 117734);
      return 64;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-12082593);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(32.0F, 64.0F);
      ((Path)localObject).cubicTo(49.67311F, 64.0F, 64.0F, 49.67311F, 64.0F, 32.0F);
      ((Path)localObject).cubicTo(64.0F, 14.326888F, 49.67311F, 0.0F, 32.0F, 0.0F);
      ((Path)localObject).cubicTo(14.326888F, 0.0F, 0.0F, 14.326888F, 0.0F, 32.0F);
      ((Path)localObject).cubicTo(0.0F, 49.67311F, 14.326888F, 64.0F, 32.0F, 64.0F);
      ((Path)localObject).lineTo(32.0F, 64.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(3.0553617F, 31.019482F);
      ((Path)localObject).cubicTo(2.559515F, 38.25722F, 5.4354253F, 45.386047F, 10.036881F, 50.881187F);
      ((Path)localObject).cubicTo(14.08299F, 46.57419F, 20.043064F, 45.029606F, 24.71394F, 41.613712F);
      ((Path)localObject).cubicTo(26.132061F, 40.73251F, 26.608074F, 38.811687F, 25.626297F, 37.415623F);
      ((Path)localObject).cubicTo(23.623077F, 34.207653F, 20.757084F, 31.088789F, 21.104177F, 27.009516F);
      ((Path)localObject).cubicTo(20.63808F, 20.05891F, 27.689018F, 13.524151F, 34.63087F, 15.623195F);
      ((Path)localObject).cubicTo(41.850395F, 17.46481F, 45.093235F, 26.979813F, 41.13638F, 33.078922F);
      ((Path)localObject).cubicTo(39.926514F, 35.42549F, 37.06052F, 37.47503F, 38.012543F, 40.415672F);
      ((Path)localObject).cubicTo(42.495F, 45.019707F, 49.63519F, 46.00982F, 53.849884F, 51.0F);
      ((Path)localObject).cubicTo(60.008297F, 43.910778F, 62.497448F, 33.890816F, 60.09755F, 24.80156F);
      ((Path)localObject).cubicTo(57.16214F, 13.048896F, 46.14443F, 3.652706F, 33.9466F, 3.127945F);
      ((Path)localObject).cubicTo(18.21835F, 1.5239588F, 3.015694F, 15.23705F, 3.0553617F, 31.019482F);
      ((Path)localObject).lineTo(3.0553617F, 31.019482F);
      ((Path)localObject).lineTo(3.0553617F, 31.019482F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */