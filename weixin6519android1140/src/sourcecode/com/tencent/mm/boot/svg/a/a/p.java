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

public final class p
  extends c
{
  private final int height;
  private final int width;
  
  public p()
  {
    GMTrace.i(17570442772480L, 130910);
    this.width = 96;
    this.height = 96;
    GMTrace.o(17570442772480L, 130910);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17570576990208L, 130911);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17570576990208L, 130911);
      return 0;
      GMTrace.o(17570576990208L, 130911);
      return 96;
      GMTrace.o(17570576990208L, 130911);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      localPaint1.setColor(-16777216);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 0.70710677F, -0.70710677F, 48.0F, 0.70710677F, 0.70710677F, -19.882248F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(46.0F, 46.0F);
      ((Path)localObject).lineTo(18.0F, 46.0F);
      ((Path)localObject).lineTo(18.0F, 50.0F);
      ((Path)localObject).lineTo(46.0F, 50.0F);
      ((Path)localObject).lineTo(46.0F, 78.0F);
      ((Path)localObject).lineTo(50.0F, 78.0F);
      ((Path)localObject).lineTo(50.0F, 50.0F);
      ((Path)localObject).lineTo(78.0F, 50.0F);
      ((Path)localObject).lineTo(78.0F, 46.0F);
      ((Path)localObject).lineTo(50.0F, 46.0F);
      ((Path)localObject).lineTo(50.0F, 18.0F);
      ((Path)localObject).lineTo(46.0F, 18.0F);
      ((Path)localObject).lineTo(46.0F, 46.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */