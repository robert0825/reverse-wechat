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

public final class dm
  extends c
{
  private final int height;
  private final int width;
  
  public dm()
  {
    GMTrace.i(17581448626176L, 130992);
    this.width = 50;
    this.height = 50;
    GMTrace.o(17581448626176L, 130992);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17581582843904L, 130993);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17581582843904L, 130993);
      return 0;
      GMTrace.o(17581582843904L, 130993);
      return 50;
      GMTrace.o(17581582843904L, 130993);
      return 50;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -213.0F, 0.0F, 1.0F, -368.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(217.0F, 415.1404F);
      ((Path)localObject2).cubicTo(217.0F, 417.34564F, 218.55235F, 418.2308F, 220.46626F, 417.11807F);
      ((Path)localObject2).lineTo(259.40042F, 394.48193F);
      ((Path)localObject2).cubicTo(261.31476F, 393.36893F, 261.3011F, 391.59286F, 259.38156F, 390.52148F);
      ((Path)localObject2).lineTo(220.4851F, 368.81183F);
      ((Path)localObject2).cubicTo(218.56033F, 367.73755F, 217.0F, 368.6658F, 217.0F, 370.8596F);
      ((Path)localObject2).lineTo(217.0F, 415.1404F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */