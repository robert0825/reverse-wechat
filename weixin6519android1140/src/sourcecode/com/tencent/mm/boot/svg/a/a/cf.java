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

public final class cf
  extends c
{
  private final int height;
  private final int width;
  
  public cf()
  {
    GMTrace.i(15777428144128L, 117551);
    this.width = 58;
    this.height = 58;
    GMTrace.o(15777428144128L, 117551);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15777562361856L, 117552);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15777562361856L, 117552);
      return 0;
      GMTrace.o(15777562361856L, 117552);
      return 58;
      GMTrace.o(15777562361856L, 117552);
      return 58;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.h(paramVarArgs);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject3).setColor(-1);
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, -249.0F, 0.0F, 1.0F, -79.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject3 = c.a((float[])localObject4, 0.70710677F, 0.70710677F, 4.6425705F, -0.70710677F, 0.70710677F, 229.20816F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(277.0F, 118.906F);
      ((Path)localObject1).lineTo(277.0F, 141.0F);
      ((Path)localObject1).lineTo(283.0F, 141.0F);
      ((Path)localObject1).lineTo(283.0F, 118.61951F);
      ((Path)localObject1).cubicTo(292.68488F, 116.751785F, 300.0F, 108.23016F, 300.0F, 98.0F);
      ((Path)localObject1).cubicTo(300.0F, 86.40202F, 290.598F, 77.0F, 279.0F, 77.0F);
      ((Path)localObject1).cubicTo(267.402F, 77.0F, 258.0F, 86.40202F, 258.0F, 98.0F);
      ((Path)localObject1).cubicTo(258.0F, 108.92341F, 266.34015F, 117.89888F, 277.0F, 118.906F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(279.0F, 113.0F);
      ((Path)localObject1).cubicTo(287.28427F, 113.0F, 294.0F, 106.28427F, 294.0F, 98.0F);
      ((Path)localObject1).cubicTo(294.0F, 89.71573F, 287.28427F, 83.0F, 279.0F, 83.0F);
      ((Path)localObject1).cubicTo(270.71573F, 83.0F, 264.0F, 89.71573F, 264.0F, 98.0F);
      ((Path)localObject1).cubicTo(264.0F, 106.28427F, 270.71573F, 113.0F, 279.0F, 113.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */