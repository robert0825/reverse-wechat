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

public final class akz
  extends c
{
  private final int height;
  private final int width;
  
  public akz()
  {
    GMTrace.i(15732062552064L, 117213);
    this.width = 34;
    this.height = 34;
    GMTrace.o(15732062552064L, 117213);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15732196769792L, 117214);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15732196769792L, 117214);
      return 0;
      GMTrace.o(15732196769792L, 117214);
      return 34;
      GMTrace.o(15732196769792L, 117214);
      return 34;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(30.98F, 4.05F);
      ((Path)localObject2).cubicTo(31.64F, 4.75F, 34.0F, 7.01F, 34.0F, 7.01F);
      ((Path)localObject2).cubicTo(26.98F, 16.0F, 19.98F, 25.01F, 12.95F, 33.99F);
      ((Path)localObject2).cubicTo(8.63F, 29.33F, 4.31F, 24.67F, 0.0F, 19.99F);
      ((Path)localObject2).cubicTo(0.5F, 19.25F, 1.51F, 17.76F, 2.01F, 17.01F);
      ((Path)localObject2).cubicTo(5.68F, 19.99F, 9.32F, 23.01F, 12.99F, 25.98F);
      ((Path)localObject2).cubicTo(19.02F, 18.7F, 24.96F, 11.34F, 30.98F, 4.05F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\akz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */