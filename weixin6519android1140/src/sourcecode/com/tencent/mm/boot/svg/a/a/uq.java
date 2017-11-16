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

public final class uq
  extends c
{
  private final int height;
  private final int width;
  
  public uq()
  {
    GMTrace.i(15820377817088L, 117871);
    this.width = 48;
    this.height = 48;
    GMTrace.o(15820377817088L, 117871);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15820512034816L, 117872);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15820512034816L, 117872);
      return 0;
      GMTrace.o(15820512034816L, 117872);
      return 48;
      GMTrace.o(15820512034816L, 117872);
      return 48;
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
      localPaint1.setColor(-5592406);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -70.0F, 0.0F, 1.0F, -268.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 69.0F, 0.0F, 1.0F, 98.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(25.0F, 179.67346F);
      ((Path)localObject2).cubicTo(17.16F, 179.67346F, 11.0F, 185.83347F, 11.0F, 193.67346F);
      ((Path)localObject2).cubicTo(11.0F, 201.51347F, 17.16F, 207.67346F, 25.0F, 207.67346F);
      ((Path)localObject2).cubicTo(32.84F, 207.67346F, 39.0F, 201.51347F, 39.0F, 193.67346F);
      ((Path)localObject2).cubicTo(39.0F, 185.83347F, 32.84F, 179.67346F, 25.0F, 179.67346F);
      ((Path)localObject2).lineTo(25.0F, 179.67346F);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\uq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */