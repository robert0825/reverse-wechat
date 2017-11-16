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

public final class lu
  extends c
{
  private final int height;
  private final int width;
  
  public lu()
  {
    GMTrace.i(20326872252416L, 151447);
    this.width = 63;
    this.height = 63;
    GMTrace.o(20326872252416L, 151447);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20327006470144L, 151448);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20327006470144L, 151448);
      return 0;
      GMTrace.o(20327006470144L, 151448);
      return 63;
      GMTrace.o(20327006470144L, 151448);
      return 63;
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
      localPaint1.setColor(-14624737);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(51.0F, 0.0F);
      ((Path)localObject2).lineTo(51.0F, 3.0F);
      ((Path)localObject2).lineTo(0.0F, 3.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(9.0F, 0.0F);
      ((Path)localObject2).lineTo(9.0F, 41.0F);
      ((Path)localObject2).lineTo(0.0F, 41.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(3.0F, 18.0F);
      ((Path)localObject2).lineTo(3.0F, 24.074074F);
      ((Path)localObject2).lineTo(6.0F, 24.074074F);
      ((Path)localObject2).lineTo(6.0F, 18.0F);
      ((Path)localObject2).lineTo(3.0F, 18.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(42.0F, 0.0F);
      ((Path)localObject2).lineTo(51.0F, 0.0F);
      ((Path)localObject2).lineTo(51.0F, 41.0F);
      ((Path)localObject2).lineTo(42.0F, 41.0F);
      ((Path)localObject2).lineTo(42.0F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(45.0F, 18.0F);
      ((Path)localObject2).lineTo(45.0F, 24.074074F);
      ((Path)localObject2).lineTo(48.0F, 24.074074F);
      ((Path)localObject2).lineTo(48.0F, 18.0F);
      ((Path)localObject2).lineTo(45.0F, 18.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(0.0F, 38.0F);
      ((Path)localObject1).lineTo(51.0F, 38.0F);
      ((Path)localObject1).lineTo(51.0F, 41.0F);
      ((Path)localObject1).lineTo(0.0F, 41.0F);
      ((Path)localObject1).lineTo(0.0F, 38.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\lu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */