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

public final class gk
  extends c
{
  private final int height;
  private final int width;
  
  public gk()
  {
    GMTrace.i(15913793355776L, 118567);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15913793355776L, 118567);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15913927573504L, 118568);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15913927573504L, 118568);
      return 0;
      GMTrace.o(15913927573504L, 118568);
      return 96;
      GMTrace.o(15913927573504L, 118568);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 7.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-8617851);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(40.5001F, 1.0E-4F);
      ((Path)localObject2).cubicTo(16.1941F, 1.0E-4F, 1.0E-4F, 14.5371F, 1.0E-4F, 32.4701F);
      ((Path)localObject2).cubicTo(1.0E-4F, 42.0741F, 4.6671F, 50.7011F, 12.7231F, 56.6461F);
      ((Path)localObject2).lineTo(8.1001F, 69.0001F);
      ((Path)localObject2).lineTo(23.6971F, 62.3011F);
      ((Path)localObject2).cubicTo(28.6931F, 63.9971F, 34.3371F, 64.9411F, 40.5001F, 64.9411F);
      ((Path)localObject2).cubicTo(64.7401F, 64.9411F, 81.0001F, 50.4031F, 81.0001F, 32.4701F);
      ((Path)localObject2).cubicTo(81.0001F, 14.5371F, 64.8061F, 1.0E-4F, 40.5001F, 1.0E-4F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(70.6401F, 39.7451F);
      ((Path)localObject2).lineTo(68.6931F, 45.4211F);
      ((Path)localObject2).cubicTo(66.3191F, 44.6061F, 61.0241F, 42.3231F, 56.2901F, 37.0491F);
      ((Path)localObject2).cubicTo(49.8301F, 45.3031F, 42.3131F, 46.0001F, 40.0001F, 46.0001F);
      ((Path)localObject2).cubicTo(37.6871F, 46.0001F, 30.1701F, 45.3031F, 23.7101F, 37.0491F);
      ((Path)localObject2).cubicTo(18.9761F, 42.3231F, 13.6811F, 44.6061F, 11.3071F, 45.4211F);
      ((Path)localObject2).lineTo(9.3601F, 39.7451F);
      ((Path)localObject2).cubicTo(11.3931F, 39.0471F, 16.1241F, 36.9871F, 20.1311F, 32.0001F);
      ((Path)localObject2).cubicTo(16.1241F, 27.0121F, 11.3931F, 24.9531F, 9.3601F, 24.2551F);
      ((Path)localObject2).lineTo(11.3071F, 18.5791F);
      ((Path)localObject2).cubicTo(13.6811F, 19.3941F, 18.9761F, 21.6771F, 23.7101F, 26.9511F);
      ((Path)localObject2).cubicTo(30.1701F, 18.6971F, 37.6871F, 18.0001F, 40.0001F, 18.0001F);
      ((Path)localObject2).cubicTo(42.3131F, 18.0001F, 49.8301F, 18.6971F, 56.2901F, 26.9511F);
      ((Path)localObject2).cubicTo(61.0241F, 21.6771F, 66.3191F, 19.3941F, 68.6931F, 18.5791F);
      ((Path)localObject2).lineTo(70.6401F, 24.2551F);
      ((Path)localObject2).cubicTo(68.6071F, 24.9531F, 63.8751F, 27.0121F, 59.8681F, 32.0001F);
      ((Path)localObject2).cubicTo(63.8751F, 36.9871F, 68.6071F, 39.0471F, 70.6401F, 39.7451F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(40.0F, 24.0F);
      ((Path)localObject2).cubicTo(38.298F, 24.0F, 32.505F, 24.612F, 27.463F, 32.0F);
      ((Path)localObject2).cubicTo(32.505F, 39.388F, 38.298F, 40.0F, 40.0F, 40.0F);
      ((Path)localObject2).cubicTo(41.702F, 40.0F, 47.495F, 39.388F, 52.537F, 32.0F);
      ((Path)localObject2).cubicTo(47.495F, 24.612F, 41.702F, 24.0F, 40.0F, 24.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */