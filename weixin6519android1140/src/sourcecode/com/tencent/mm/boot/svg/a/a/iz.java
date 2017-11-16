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

public final class iz
  extends c
{
  private final int height;
  private final int width;
  
  public iz()
  {
    GMTrace.i(15836483944448L, 117991);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15836483944448L, 117991);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15836618162176L, 117992);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15836618162176L, 117992);
      return 0;
      GMTrace.o(15836618162176L, 117992);
      return 60;
      GMTrace.o(15836618162176L, 117992);
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
      localPaint1.setColor(-6118750);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.0777197F, 0.738578F);
      ((Path)localObject2).cubicTo(2.1650724F, -0.2380024F, 4.146697F, -0.2770656F, 5.1730766F, 0.8069386F);
      ((Path)localObject2).cubicTo(9.786705F, 5.7386694F, 10.426922F, 13.834521F, 6.0063753F, 19.068993F);
      ((Path)localObject2).cubicTo(4.268643F, 21.139343F, 0.3358808F, 19.46939F, 0.6813948F, 16.871687F);
      ((Path)localObject2).cubicTo(1.3012875F, 14.48883F, 3.912967F, 12.809112F, 3.4455068F, 10.133282F);
      ((Path)localObject2).cubicTo(3.6284258F, 6.7250156F, -2.3875825F, 3.9612932F, 1.0777197F, 0.738578F);
      ((Path)localObject2).lineTo(1.0777197F, 0.738578F);
      ((Path)localObject2).lineTo(1.0777197F, 0.738578F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\iz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */