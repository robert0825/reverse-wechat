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

public final class um
  extends c
{
  private final int height;
  private final int width;
  
  public um()
  {
    GMTrace.i(15950300577792L, 118839);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15950300577792L, 118839);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15950434795520L, 118840);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15950434795520L, 118840);
      return 0;
      GMTrace.o(15950434795520L, 118840);
      return 96;
      GMTrace.o(15950434795520L, 118840);
      return 96;
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
      ((Paint)localObject3).setColor(637534208);
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 8.0F, 0.0F, 1.0F, 8.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject3 = c.a((float[])localObject4, 0.70710677F, 0.70710677F, -16.568542F, -0.70710677F, 0.70710677F, 40.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(37.0F, 37.0F);
      ((Path)localObject1).lineTo(37.0F, 12.995752F);
      ((Path)localObject1).cubicTo(37.0F, 12.450768F, 37.44359F, 12.0F, 37.99078F, 12.0F);
      ((Path)localObject1).lineTo(42.00922F, 12.0F);
      ((Path)localObject1).cubicTo(42.549026F, 12.0F, 43.0F, 12.445813F, 43.0F, 12.995752F);
      ((Path)localObject1).lineTo(43.0F, 37.0F);
      ((Path)localObject1).lineTo(67.00425F, 37.0F);
      ((Path)localObject1).cubicTo(67.54923F, 37.0F, 68.0F, 37.44359F, 68.0F, 37.99078F);
      ((Path)localObject1).lineTo(68.0F, 42.00922F);
      ((Path)localObject1).cubicTo(68.0F, 42.549026F, 67.554184F, 43.0F, 67.00425F, 43.0F);
      ((Path)localObject1).lineTo(43.0F, 43.0F);
      ((Path)localObject1).lineTo(43.0F, 67.00425F);
      ((Path)localObject1).cubicTo(43.0F, 67.54923F, 42.55641F, 68.0F, 42.00922F, 68.0F);
      ((Path)localObject1).lineTo(37.99078F, 68.0F);
      ((Path)localObject1).cubicTo(37.450974F, 68.0F, 37.0F, 67.554184F, 37.0F, 67.00425F);
      ((Path)localObject1).lineTo(37.0F, 43.0F);
      ((Path)localObject1).lineTo(12.995752F, 43.0F);
      ((Path)localObject1).cubicTo(12.450768F, 43.0F, 12.0F, 42.55641F, 12.0F, 42.00922F);
      ((Path)localObject1).lineTo(12.0F, 37.99078F);
      ((Path)localObject1).cubicTo(12.0F, 37.450974F, 12.445813F, 37.0F, 12.995752F, 37.0F);
      ((Path)localObject1).lineTo(37.0F, 37.0F);
      ((Path)localObject1).lineTo(37.0F, 37.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\um.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */