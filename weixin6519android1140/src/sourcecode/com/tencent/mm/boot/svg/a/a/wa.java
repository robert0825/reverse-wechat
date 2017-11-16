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

public final class wa
  extends c
{
  private final int height;
  private final int width;
  
  public wa()
  {
    GMTrace.i(15863327490048L, 118191);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15863327490048L, 118191);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15863461707776L, 118192);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15863461707776L, 118192);
      return 0;
      GMTrace.o(15863461707776L, 118192);
      return 96;
      GMTrace.o(15863461707776L, 118192);
      return 96;
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(44.5F, 40.321075F);
      ((Path)localObject2).lineTo(23.613749F, 19.430162F);
      ((Path)localObject2).cubicTo(23.041075F, 18.85736F, 22.09352F, 18.853842F, 21.511253F, 19.436235F);
      ((Path)localObject2).lineTo(19.44183F, 21.506123F);
      ((Path)localObject2).cubicTo(18.850626F, 22.097458F, 18.856846F, 23.030046F, 19.435757F, 23.609087F);
      ((Path)localObject2).lineTo(40.322006F, 44.5F);
      ((Path)localObject2).lineTo(19.435757F, 65.390915F);
      ((Path)localObject2).cubicTo(18.856846F, 65.969955F, 18.850626F, 66.90254F, 19.44183F, 67.49387F);
      ((Path)localObject2).lineTo(21.511253F, 69.56377F);
      ((Path)localObject2).cubicTo(22.09352F, 70.14616F, 23.041075F, 70.14264F, 23.613749F, 69.56984F);
      ((Path)localObject2).lineTo(44.5F, 48.678925F);
      ((Path)localObject2).lineTo(65.38625F, 69.56984F);
      ((Path)localObject2).cubicTo(65.95892F, 70.14264F, 66.90648F, 70.14616F, 67.48875F, 69.56377F);
      ((Path)localObject2).lineTo(69.558174F, 67.49387F);
      ((Path)localObject2).cubicTo(70.149376F, 66.90254F, 70.14316F, 65.969955F, 69.56425F, 65.390915F);
      ((Path)localObject2).lineTo(48.677994F, 44.5F);
      ((Path)localObject2).lineTo(69.56425F, 23.609087F);
      ((Path)localObject2).cubicTo(70.14316F, 23.030046F, 70.149376F, 22.097458F, 69.558174F, 21.506123F);
      ((Path)localObject2).lineTo(67.48875F, 19.436235F);
      ((Path)localObject2).cubicTo(66.90648F, 18.853842F, 65.95892F, 18.85736F, 65.38625F, 19.430162F);
      ((Path)localObject2).lineTo(44.5F, 40.321075F);
      ((Path)localObject2).lineTo(44.5F, 40.321075F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\wa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */