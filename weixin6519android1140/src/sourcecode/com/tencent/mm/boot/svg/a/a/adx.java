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

public final class adx
  extends c
{
  private final int height;
  private final int width;
  
  public adx()
  {
    GMTrace.i(20324456333312L, 151429);
    this.width = 1080;
    this.height = 125;
    GMTrace.o(20324456333312L, 151429);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20324590551040L, 151430);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20324590551040L, 151430);
      return 0;
      GMTrace.o(20324590551040L, 151430);
      return 1080;
      GMTrace.o(20324590551040L, 151430);
      return 125;
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
      localPaint.setColor(-2664127);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(0.08785249F, -2.7755576E-16F);
      ((Path)localObject).cubicTo(0.029366853F, 0.41979796F, 0.0F, 0.8405075F, 0.0F, 1.2620968F);
      ((Path)localObject).cubicTo(0.0F, 39.514496F, 150.4436F, 125.0F, 540.0F, 125.0F);
      ((Path)localObject).cubicTo(929.5564F, 125.0F, 1080.0F, 39.514496F, 1080.0F, 1.2620968F);
      ((Path)localObject).cubicTo(1080.0F, 0.8405075F, 1079.9706F, 0.41979796F, 1079.9121F, 2.220446E-16F);
      ((Path)localObject).lineTo(0.08785249F, 0.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\adx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */