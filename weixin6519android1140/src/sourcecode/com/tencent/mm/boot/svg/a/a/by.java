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

public final class by
  extends c
{
  private final int height;
  private final int width;
  
  public by()
  {
    GMTrace.i(15776891273216L, 117547);
    this.width = 42;
    this.height = 42;
    GMTrace.o(15776891273216L, 117547);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15777025490944L, 117548);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15777025490944L, 117548);
      return 0;
      GMTrace.o(15777025490944L, 117548);
      return 42;
      GMTrace.o(15777025490944L, 117548);
      return 42;
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -275.0F, 0.0F, 1.0F, -1626.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 126.0F, 0.0F, 1.0F, 1626.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 149.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      ((Paint)localObject1).setColor(-70474);
      localPaint2.setColor(-36352);
      localPaint2.setStrokeWidth(5.4F);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(42.0F, 21.25926F);
      ((Path)localObject2).cubicTo(42.0F, 9.401778F, 32.59822F, 0.0F, 20.74074F, 0.0F);
      ((Path)localObject2).cubicTo(9.401778F, 0.0F, 0.0F, 9.401778F, 0.0F, 21.25926F);
      ((Path)localObject2).cubicTo(0.0F, 32.59822F, 9.401778F, 42.0F, 20.74074F, 42.0F);
      ((Path)localObject2).cubicTo(32.59822F, 42.0F, 42.0F, 32.59822F, 42.0F, 21.25926F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-36352);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(7.1932015F, 22.069902F);
      ((Path)localObject1).cubicTo(7.0209723F, 21.90468F, 7.0013413F, 21.619408F, 7.147708F, 21.434807F);
      ((Path)localObject1).lineTo(8.144134F, 20.17808F);
      ((Path)localObject1).cubicTo(8.291237F, 19.992548F, 8.567782F, 19.95389F, 8.763619F, 20.093018F);
      ((Path)localObject1).lineTo(15.588285F, 24.941442F);
      ((Path)localObject1).cubicTo(15.783314F, 25.079996F, 16.094162F, 25.074368F, 16.278591F, 24.931952F);
      ((Path)localObject1).lineTo(33.272747F, 11.8091545F);
      ((Path)localObject1).cubicTo(33.45896F, 11.6653595F, 33.751038F, 11.677971F, 33.93421F, 11.845651F);
      ((Path)localObject1).lineTo(34.814766F, 12.651727F);
      ((Path)localObject1).cubicTo(34.993866F, 12.815679F, 34.995564F, 13.079486F, 34.821854F, 13.237947F);
      ((Path)localObject1).lineTo(16.258057F, 30.172258F);
      ((Path)localObject1).cubicTo(16.08287F, 30.332067F, 15.798551F, 30.325104F, 15.629005F, 30.162458F);
      ((Path)localObject1).lineTo(7.1932015F, 22.069902F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */