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

public final class ael
  extends c
{
  private final int height;
  private final int width;
  
  public ael()
  {
    GMTrace.i(15910303694848L, 118541);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15910303694848L, 118541);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15910437912576L, 118542);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15910437912576L, 118542);
      return 0;
      GMTrace.o(15910437912576L, 118542);
      return 60;
      GMTrace.o(15910437912576L, 118542);
      return 60;
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
      localPaint1.setColor(-899014);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -218.0F, 0.0F, 1.0F, -230.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 224.0F, 0.0F, 1.0F, 236.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 24.0F);
      ((Path)localObject2).cubicTo(0.0F, 10.8F, 10.8F, 0.0F, 24.0F, 0.0F);
      ((Path)localObject2).cubicTo(37.2F, 0.0F, 48.0F, 10.8F, 48.0F, 24.0F);
      ((Path)localObject2).cubicTo(48.0F, 37.2F, 37.2F, 48.0F, 24.0F, 48.0F);
      ((Path)localObject2).cubicTo(10.8F, 48.0F, 0.0F, 37.2F, 0.0F, 24.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(4.0F, 24.0F);
      ((Path)localObject2).cubicTo(4.0F, 35.0F, 13.0F, 44.0F, 24.0F, 44.0F);
      ((Path)localObject2).cubicTo(35.0F, 44.0F, 44.0F, 35.0F, 44.0F, 24.0F);
      ((Path)localObject2).cubicTo(44.0F, 13.0F, 35.0F, 4.0F, 24.0F, 4.0F);
      ((Path)localObject2).cubicTo(13.0F, 4.0F, 4.0F, 13.0F, 4.0F, 24.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(10.0F, 24.0F);
      ((Path)localObject2).cubicTo(10.0F, 31.7F, 16.3F, 38.0F, 24.0F, 38.0F);
      ((Path)localObject2).cubicTo(31.7F, 38.0F, 38.0F, 31.7F, 38.0F, 24.0F);
      ((Path)localObject2).cubicTo(38.0F, 16.3F, 31.7F, 10.0F, 24.0F, 10.0F);
      ((Path)localObject2).cubicTo(16.3F, 10.0F, 10.0F, 16.3F, 10.0F, 24.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ael.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */