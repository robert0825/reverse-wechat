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

public final class jt
  extends c
{
  private final int height;
  private final int width;
  
  public jt()
  {
    GMTrace.i(15709245538304L, 117043);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15709245538304L, 117043);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15709379756032L, 117044);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15709379756032L, 117044);
      return 0;
      GMTrace.o(15709379756032L, 117044);
      return 60;
      GMTrace.o(15709379756032L, 117044);
      return 60;
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
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 38.0F, 0.0F, 1.0F, 19.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(4.63F, 1.39F);
      ((Path)localObject2).cubicTo(6.52F, -0.4F, 10.11F, 1.44F, 9.66F, 4.01F);
      ((Path)localObject2).cubicTo(9.07F, 6.61F, 6.21F, 8.23F, 6.25F, 11.08F);
      ((Path)localObject2).cubicTo(5.82F, 13.77F, 8.27F, 15.5F, 8.98F, 17.86F);
      ((Path)localObject2).cubicTo(9.37F, 20.54F, 5.58F, 22.31F, 3.8F, 20.27F);
      ((Path)localObject2).cubicTo(-0.67F, 14.87F, 0.03F, 6.48F, 4.63F, 1.39F);
      ((Path)localObject2).lineTo(4.63F, 1.39F);
      ((Path)localObject2).lineTo(4.63F, 1.39F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\jt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */