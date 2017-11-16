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

public final class ri
  extends c
{
  private final int height;
  private final int width;
  
  public ri()
  {
    GMTrace.i(15758369226752L, 117409);
    this.width = 54;
    this.height = 48;
    GMTrace.o(15758369226752L, 117409);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15758503444480L, 117410);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15758503444480L, 117410);
      return 0;
      GMTrace.o(15758503444480L, 117410);
      return 54;
      GMTrace.o(15758503444480L, 117410);
      return 48;
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
      localPaint.setColor(58033);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(21.993774F, 38.0F);
      ((Path)localObject).lineTo(51.00044F, 38.0F);
      ((Path)localObject).cubicTo(52.66516F, 38.0F, 54.0F, 36.6579F, 54.0F, 35.00234F);
      ((Path)localObject).lineTo(54.0F, 2.99766F);
      ((Path)localObject).cubicTo(54.0F, 1.3524401F, 52.65705F, 0.0F, 51.00044F, 0.0F);
      ((Path)localObject).lineTo(2.9995608F, 0.0F);
      ((Path)localObject).cubicTo(1.3348389F, 0.0F, 0.0F, 1.342098F, 0.0F, 2.99766F);
      ((Path)localObject).lineTo(0.0F, 35.00234F);
      ((Path)localObject).cubicTo(0.0F, 36.64756F, 1.3429492F, 38.0F, 2.9995608F, 38.0F);
      ((Path)localObject).lineTo(9.0F, 38.0F);
      ((Path)localObject).lineTo(9.0F, 47.950085F);
      ((Path)localObject).lineTo(21.993774F, 38.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(19.0F, 32.0F);
      ((Path)localObject).lineTo(48.0F, 32.0F);
      ((Path)localObject).lineTo(48.0F, 6.0F);
      ((Path)localObject).lineTo(6.0F, 6.0F);
      ((Path)localObject).lineTo(6.0F, 32.0F);
      ((Path)localObject).lineTo(15.0F, 32.0F);
      ((Path)localObject).lineTo(15.0F, 36.0F);
      ((Path)localObject).lineTo(19.0F, 32.0F);
      ((Path)localObject).lineTo(19.0F, 32.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */