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

public final class iq
  extends c
{
  private final int height;
  private final int width;
  
  public iq()
  {
    GMTrace.i(17583864545280L, 131010);
    this.width = 69;
    this.height = 69;
    GMTrace.o(17583864545280L, 131010);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17583998763008L, 131011);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17583998763008L, 131011);
      return 0;
      GMTrace.o(17583998763008L, 131011);
      return 69;
      GMTrace.o(17583998763008L, 131011);
      return 69;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -66.0F, 0.0F, 1.0F, -459.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 72.0F, 0.0F, 1.0F, 465.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(3.0F);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(28.5F, 1.5F);
      ((Path)localObject2).cubicTo(43.41169F, 1.5F, 55.5F, 13.588311F, 55.5F, 28.5F);
      ((Path)localObject2).cubicTo(55.5F, 43.41169F, 43.41169F, 55.5F, 28.5F, 55.5F);
      ((Path)localObject2).cubicTo(13.588311F, 55.5F, 1.5F, 43.41169F, 1.5F, 28.5F);
      ((Path)localObject2).cubicTo(1.5F, 13.588311F, 13.588311F, 1.5F, 28.5F, 1.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(39.81111F, 30.250793F);
      ((Path)localObject1).lineTo(23.24421F, 39.717594F);
      ((Path)localObject1).lineTo(23.24421F, 39.717594F);
      ((Path)localObject1).cubicTo(22.524933F, 40.12861F, 21.60865F, 39.878716F, 21.197636F, 39.15944F);
      ((Path)localObject1).cubicTo(21.068123F, 38.932793F, 21.0F, 38.67627F, 21.0F, 38.41523F);
      ((Path)localObject1).lineTo(21.0F, 18.692726F);
      ((Path)localObject1).lineTo(21.0F, 18.692726F);
      ((Path)localObject1).cubicTo(21.0F, 17.8643F, 21.671574F, 17.192726F, 22.5F, 17.192726F);
      ((Path)localObject1).cubicTo(22.778942F, 17.192726F, 23.052357F, 17.270508F, 23.289532F, 17.41733F);
      ((Path)localObject1).lineTo(39.856434F, 27.67303F);
      ((Path)localObject1).lineTo(39.856434F, 27.67303F);
      ((Path)localObject1).cubicTo(40.560818F, 28.109077F, 40.778347F, 29.033579F, 40.3423F, 29.73796F);
      ((Path)localObject1).cubicTo(40.21073F, 29.950493F, 40.028137F, 30.126778F, 39.81111F, 30.250793F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\iq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */