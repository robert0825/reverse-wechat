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

public final class acl
  extends c
{
  private final int height;
  private final int width;
  
  public acl()
  {
    GMTrace.i(15921846419456L, 118627);
    this.width = 168;
    this.height = 168;
    GMTrace.o(15921846419456L, 118627);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15921980637184L, 118628);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15921980637184L, 118628);
      return 0;
      GMTrace.o(15921980637184L, 118628);
      return 168;
      GMTrace.o(15921980637184L, 118628);
      return 168;
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
      localPaint1.setColor(-8617594);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 40.0F, 0.0F, 1.0F, 50.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.7979208F, 0.0F);
      ((Path)localObject2).cubicTo(0.8049566F, 0.0F, 0.0F, 0.8110437F, 0.0F, 1.8013198F);
      ((Path)localObject2).lineTo(0.0F, 66.19868F);
      ((Path)localObject2).cubicTo(0.0F, 67.19352F, 0.8120969F, 68.0F, 1.8074489F, 68.0F);
      ((Path)localObject2).lineTo(75.140465F, 68.0F);
      ((Path)localObject2).cubicTo(76.138695F, 68.0F, 76.947914F, 67.19573F, 76.947914F, 66.19761F);
      ((Path)localObject2).cubicTo(76.947914F, 66.19761F, 76.947914F, 56.10486F, 76.947914F, 49.86667F);
      ((Path)localObject2).cubicTo(76.94792F, 40.74555F, 89.0F, 34.377186F, 89.0F, 29.013332F);
      ((Path)localObject2).cubicTo(89.0F, 23.696405F, 89.0F, 1.8062787F, 89.0F, 1.8062787F);
      ((Path)localObject2).cubicTo(89.0F, 0.8086985F, 88.20341F, 0.0F, 87.20208F, 0.0F);
      ((Path)localObject2).lineTo(1.7979208F, 0.0F);
      ((Path)localObject2).lineTo(1.7979208F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(6.0F, 6.0F);
      ((Path)localObject2).lineTo(6.0F, 12.0F);
      ((Path)localObject2).lineTo(16.0F, 12.0F);
      ((Path)localObject2).lineTo(16.0F, 6.0F);
      ((Path)localObject2).lineTo(6.0F, 6.0F);
      ((Path)localObject2).lineTo(6.0F, 6.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(6.0F, 56.0F);
      ((Path)localObject2).lineTo(6.0F, 62.0F);
      ((Path)localObject2).lineTo(16.0F, 62.0F);
      ((Path)localObject2).lineTo(16.0F, 56.0F);
      ((Path)localObject2).lineTo(6.0F, 56.0F);
      ((Path)localObject2).lineTo(6.0F, 56.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(22.0F, 6.0F);
      ((Path)localObject2).lineTo(22.0F, 12.0F);
      ((Path)localObject2).lineTo(32.0F, 12.0F);
      ((Path)localObject2).lineTo(32.0F, 6.0F);
      ((Path)localObject2).lineTo(22.0F, 6.0F);
      ((Path)localObject2).lineTo(22.0F, 6.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(22.0F, 56.0F);
      ((Path)localObject2).lineTo(22.0F, 62.0F);
      ((Path)localObject2).lineTo(32.0F, 62.0F);
      ((Path)localObject2).lineTo(32.0F, 56.0F);
      ((Path)localObject2).lineTo(22.0F, 56.0F);
      ((Path)localObject2).lineTo(22.0F, 56.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(38.0F, 6.0F);
      ((Path)localObject2).lineTo(38.0F, 12.0F);
      ((Path)localObject2).lineTo(48.0F, 12.0F);
      ((Path)localObject2).lineTo(48.0F, 6.0F);
      ((Path)localObject2).lineTo(38.0F, 6.0F);
      ((Path)localObject2).lineTo(38.0F, 6.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(38.0F, 56.0F);
      ((Path)localObject2).lineTo(38.0F, 62.0F);
      ((Path)localObject2).lineTo(48.0F, 62.0F);
      ((Path)localObject2).lineTo(48.0F, 56.0F);
      ((Path)localObject2).lineTo(38.0F, 56.0F);
      ((Path)localObject2).lineTo(38.0F, 56.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(54.0F, 6.0F);
      ((Path)localObject2).lineTo(54.0F, 12.0F);
      ((Path)localObject2).lineTo(64.0F, 12.0F);
      ((Path)localObject2).lineTo(64.0F, 6.0F);
      ((Path)localObject2).lineTo(54.0F, 6.0F);
      ((Path)localObject2).lineTo(54.0F, 6.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(54.0F, 56.0F);
      ((Path)localObject2).lineTo(54.0F, 62.0F);
      ((Path)localObject2).lineTo(64.0F, 62.0F);
      ((Path)localObject2).lineTo(64.0F, 56.0F);
      ((Path)localObject2).lineTo(54.0F, 56.0F);
      ((Path)localObject2).lineTo(54.0F, 56.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(70.0F, 6.0F);
      ((Path)localObject2).lineTo(70.0F, 12.0F);
      ((Path)localObject2).lineTo(80.0F, 12.0F);
      ((Path)localObject2).lineTo(80.0F, 6.0F);
      ((Path)localObject2).lineTo(70.0F, 6.0F);
      ((Path)localObject2).lineTo(70.0F, 6.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\acl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */