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
import com.tencent.mm.svg.c;

public final class tr
  extends c
{
  private final int height;
  private final int width;
  
  public tr()
  {
    GMTrace.i(15903055937536L, 118487);
    this.width = 144;
    this.height = 144;
    GMTrace.o(15903055937536L, 118487);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15903190155264L, 118488);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15903190155264L, 118488);
      return 0;
      GMTrace.o(15903190155264L, 118488);
      return 144;
      GMTrace.o(15903190155264L, 118488);
      return 144;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-344005);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(60.0F, 0.0F);
      ((Path)localObject2).cubicTo(93.137085F, 0.0F, 120.0F, 26.862915F, 120.0F, 60.0F);
      ((Path)localObject2).cubicTo(120.0F, 93.137085F, 93.137085F, 120.0F, 60.0F, 120.0F);
      ((Path)localObject2).cubicTo(26.862915F, 120.0F, 0.0F, 93.137085F, 0.0F, 60.0F);
      ((Path)localObject2).cubicTo(0.0F, 26.862915F, 26.862915F, 0.0F, 60.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-274608);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(60.0F, 6.0F);
      ((Path)localObject1).cubicTo(89.82338F, 6.0F, 114.0F, 30.176622F, 114.0F, 60.0F);
      ((Path)localObject1).cubicTo(114.0F, 89.82338F, 89.82338F, 114.0F, 60.0F, 114.0F);
      ((Path)localObject1).cubicTo(30.176622F, 114.0F, 6.0F, 89.82338F, 6.0F, 60.0F);
      ((Path)localObject1).cubicTo(6.0F, 30.176622F, 30.176622F, 6.0F, 60.0F, 6.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */