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

public final class pf
  extends c
{
  private final int height;
  private final int width;
  
  public pf()
  {
    GMTrace.i(15816082849792L, 117839);
    this.width = 66;
    this.height = 66;
    GMTrace.o(15816082849792L, 117839);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15816217067520L, 117840);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15816217067520L, 117840);
      return 0;
      GMTrace.o(15816217067520L, 117840);
      return 66;
      GMTrace.o(15816217067520L, 117840);
      return 66;
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
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-564640);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(57.0F, 30.37037F);
      ((Path)localObject3).cubicTo(57.0F, 15.087965F, 44.912033F, 3.0F, 29.62963F, 3.0F);
      ((Path)localObject3).cubicTo(14.985957F, 3.0F, 3.0F, 15.1921425F, 3.0F, 30.37037F);
      ((Path)localObject3).cubicTo(3.0F, 44.912033F, 15.087965F, 57.0F, 29.62963F, 57.0F);
      ((Path)localObject3).cubicTo(44.807858F, 57.0F, 57.0F, 45.01404F, 57.0F, 30.37037F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(60.0F, 30.37037F);
      ((Path)localObject3).cubicTo(60.0F, 46.56889F, 46.56889F, 60.0F, 29.62963F, 60.0F);
      ((Path)localObject3).cubicTo(13.431111F, 60.0F, 0.0F, 46.56889F, 0.0F, 30.37037F);
      ((Path)localObject3).cubicTo(0.0F, 13.431111F, 13.431111F, 0.0F, 29.62963F, 0.0F);
      ((Path)localObject3).cubicTo(46.56889F, 0.0F, 60.0F, 13.431111F, 60.0F, 30.37037F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(30.0F, 45.0F);
      ((Path)localObject2).cubicTo(31.656855F, 45.0F, 33.0F, 43.656853F, 33.0F, 42.0F);
      ((Path)localObject2).cubicTo(33.0F, 40.343147F, 31.656855F, 39.0F, 30.0F, 39.0F);
      ((Path)localObject2).cubicTo(28.343145F, 39.0F, 27.0F, 40.343147F, 27.0F, 42.0F);
      ((Path)localObject2).cubicTo(27.0F, 43.656853F, 28.343145F, 45.0F, 30.0F, 45.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(28.498575F, 15.0F);
      ((Path)localObject2).cubicTo(27.670935F, 15.0F, 27.032139F, 15.674923F, 27.071115F, 16.493433F);
      ((Path)localObject2).lineTo(28.0F, 36.0F);
      ((Path)localObject2).lineTo(32.0F, 36.0F);
      ((Path)localObject2).lineTo(32.928883F, 16.493433F);
      ((Path)localObject2).cubicTo(32.96816F, 15.6686325F, 32.33497F, 15.0F, 31.501425F, 15.0F);
      ((Path)localObject2).lineTo(28.498575F, 15.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\pf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */