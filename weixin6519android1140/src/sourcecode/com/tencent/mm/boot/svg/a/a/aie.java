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

public final class aie
  extends c
{
  private final int height;
  private final int width;
  
  public aie()
  {
    GMTrace.i(15847758233600L, 118075);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15847758233600L, 118075);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15847892451328L, 118076);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15847892451328L, 118076);
      return 0;
      GMTrace.o(15847892451328L, 118076);
      return 60;
      GMTrace.o(15847892451328L, 118076);
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
      localPaint1.setColor(-2105120);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(4.24F, 9.3F);
      ((Path)localObject2).cubicTo(8.92F, 2.94F, 17.39F, -0.19F, 25.1F, 1.41F);
      ((Path)localObject2).cubicTo(32.66F, 2.78F, 39.15F, 8.72F, 41.17F, 16.14F);
      ((Path)localObject2).cubicTo(43.04F, 22.59F, 41.49F, 29.57F, 38.39F, 35.38F);
      ((Path)localObject2).cubicTo(34.3F, 42.96F, 27.97F, 49.1F, 21.0F, 54.04F);
      ((Path)localObject2).cubicTo(12.64F, 48.07F, 4.94F, 40.33F, 1.47F, 30.46F);
      ((Path)localObject2).cubicTo(-1.06F, 23.52F, -0.39F, 15.22F, 4.24F, 9.3F);
      ((Path)localObject2).lineTo(4.24F, 9.3F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(17.121176F, 14.014381F);
      ((Path)localObject2).cubicTo(11.980267F, 16.542173F, 11.574966F, 24.57351F, 16.44923F, 27.602592F);
      ((Path)localObject2).cubicTo(21.355494F, 31.324953F, 29.25884F, 27.197294F, 28.949532F, 21.032469F);
      ((Path)localObject2).cubicTo(29.25884F, 15.198284F, 22.102098F, 10.963966F, 17.121176F, 14.014381F);
      ((Path)localObject2).lineTo(17.121176F, 14.014381F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */