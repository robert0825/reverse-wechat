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

public final class uv
  extends c
{
  private final int height;
  private final int width;
  
  public uv()
  {
    GMTrace.i(18802695733248L, 140091);
    this.width = 60;
    this.height = 60;
    GMTrace.o(18802695733248L, 140091);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18802829950976L, 140092);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(18802829950976L, 140092);
      return 0;
      GMTrace.o(18802829950976L, 140092);
      return 60;
      GMTrace.o(18802829950976L, 140092);
      return 60;
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
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-16139513);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -345.0F, 0.0F, 1.0F, -473.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 40.0F, 0.0F, 1.0F, 403.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 305.0F, 0.0F, 1.0F, 70.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(60.0F, 30.37037F);
      ((Path)localObject2).cubicTo(60.0F, 46.56889F, 46.56889F, 60.0F, 29.62963F, 60.0F);
      ((Path)localObject2).cubicTo(13.431111F, 60.0F, 0.0F, 46.56889F, 0.0F, 30.37037F);
      ((Path)localObject2).cubicTo(0.0F, 13.431111F, 13.431111F, 0.0F, 29.62963F, 0.0F);
      ((Path)localObject2).cubicTo(46.56889F, 0.0F, 60.0F, 13.431111F, 60.0F, 30.37037F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(15.577749F, 32.460346F);
      ((Path)localObject2).lineTo(24.47927F, 41.67298F);
      ((Path)localObject2).cubicTo(24.862179F, 42.06927F, 25.488976F, 42.073776F, 25.882545F, 41.686443F);
      ((Path)localObject2).lineTo(46.24788F, 21.643913F);
      ((Path)localObject2).cubicTo(46.63556F, 21.26238F, 46.64444F, 20.630444F, 46.25456F, 20.2454F);
      ((Path)localObject2).lineTo(45.93083F, 19.92568F);
      ((Path)localObject2).cubicTo(45.543224F, 19.542885F, 44.883877F, 19.512583F, 44.46322F, 19.863024F);
      ((Path)localObject2).lineTo(25.932226F, 35.30084F);
      ((Path)localObject2).cubicTo(25.518642F, 35.64539F, 24.817387F, 35.66468F, 24.381721F, 35.33077F);
      ((Path)localObject2).lineTo(17.411554F, 29.988533F);
      ((Path)localObject2).cubicTo(16.979122F, 29.657099F, 16.359636F, 29.7419F, 16.035114F, 30.183472F);
      ((Path)localObject2).lineTo(15.474698F, 30.946018F);
      ((Path)localObject2).cubicTo(15.1507F, 31.386875F, 15.196312F, 32.06558F, 15.577749F, 32.460346F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\uv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */