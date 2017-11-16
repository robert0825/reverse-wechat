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

public final class ta
  extends c
{
  private final int height;
  private final int width;
  
  public ta()
  {
    GMTrace.i(15824672784384L, 117903);
    this.width = 30;
    this.height = 30;
    GMTrace.o(15824672784384L, 117903);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15824807002112L, 117904);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15824807002112L, 117904);
      return 0;
      GMTrace.o(15824807002112L, 117904);
      return 30;
      GMTrace.o(15824807002112L, 117904);
      return 30;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -3870.0F, 0.0F, 1.0F, -1497.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3855.0F, 0.0F, 1.0F, 1485.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(42.0F, 15.0F);
      ((Path)localObject2).lineTo(42.0F, 27.0F);
      ((Path)localObject2).lineTo(45.0F, 27.0F);
      ((Path)localObject2).lineTo(45.0F, 13.5F);
      ((Path)localObject2).lineTo(45.0F, 12.0F);
      ((Path)localObject2).lineTo(30.0F, 12.0F);
      ((Path)localObject2).lineTo(30.0F, 15.0F);
      ((Path)localObject2).lineTo(42.0F, 15.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(18.0F, 39.0F);
      ((Path)localObject2).lineTo(18.0F, 27.0F);
      ((Path)localObject2).lineTo(15.0F, 27.0F);
      ((Path)localObject2).lineTo(15.0F, 40.5F);
      ((Path)localObject2).lineTo(15.0F, 42.0F);
      ((Path)localObject2).lineTo(30.0F, 42.0F);
      ((Path)localObject2).lineTo(30.0F, 39.0F);
      ((Path)localObject2).lineTo(18.0F, 39.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */