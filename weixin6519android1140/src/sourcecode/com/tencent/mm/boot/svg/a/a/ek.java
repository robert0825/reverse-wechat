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

public final class ek
  extends c
{
  private final int height;
  private final int width;
  
  public ek()
  {
    GMTrace.i(15755684872192L, 117389);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15755684872192L, 117389);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15755819089920L, 117390);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15755819089920L, 117390);
      return 0;
      GMTrace.o(15755819089920L, 117390);
      return 96;
      GMTrace.o(15755819089920L, 117390);
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-8355712);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 25.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 128, 4);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(-3.5527137E-15F, 24.0F);
      ((Path)localObject2).cubicTo(8.006664F, 16.0F, 16.013329F, 8.0F, 24.0F, 3.5527137E-15F);
      ((Path)localObject2).cubicTo(25.549355F, 1.3682896F, 26.918783F, 2.8764045F, 28.0F, 4.0F);
      ((Path)localObject2).cubicTo(22.620575F, 9.877653F, 17.152853F, 15.440699F, 12.0F, 21.0F);
      ((Path)localObject2).cubicTo(23.7601F, 20.973783F, 35.875053F, 20.94382F, 48.0F, 21.0F);
      ((Path)localObject2).lineTo(48.0F, 27.0F);
      ((Path)localObject2).cubicTo(35.85506F, 27.026217F, 23.710121F, 26.996254F, 12.0F, 27.0F);
      ((Path)localObject2).cubicTo(17.11287F, 32.5593F, 22.610579F, 38.142323F, 28.0F, 44.0F);
      ((Path)localObject2).cubicTo(26.878801F, 45.133583F, 25.519367F, 46.651684F, 24.0F, 48.0F);
      ((Path)localObject2).cubicTo(15.993336F, 40.019974F, 7.9866724F, 32.019974F, -3.5527137E-15F, 24.0F);
      ((Path)localObject2).lineTo(-3.5527137E-15F, 24.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */