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

public final class cc
  extends c
{
  private final int height;
  private final int width;
  
  public cc()
  {
    GMTrace.i(15861985312768L, 118181);
    this.width = 120;
    this.height = 120;
    GMTrace.o(15861985312768L, 118181);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15862119530496L, 118182);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15862119530496L, 118182);
      return 0;
      GMTrace.o(15862119530496L, 118182);
      return 120;
      GMTrace.o(15862119530496L, 118182);
      return 120;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -134.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 134.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-789517);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 60.0F);
      ((Path)localObject2).cubicTo(0.0F, 26.862915F, 26.862915F, 0.0F, 60.0F, 0.0F);
      ((Path)localObject2).lineTo(60.0F, 0.0F);
      ((Path)localObject2).cubicTo(93.137085F, 0.0F, 120.0F, 26.862915F, 120.0F, 60.0F);
      ((Path)localObject2).lineTo(120.0F, 60.0F);
      ((Path)localObject2).cubicTo(120.0F, 93.137085F, 93.137085F, 120.0F, 60.0F, 120.0F);
      ((Path)localObject2).lineTo(60.0F, 120.0F);
      ((Path)localObject2).cubicTo(26.862915F, 120.0F, 0.0F, 93.137085F, 0.0F, 60.0F);
      ((Path)localObject2).lineTo(0.0F, 60.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-3552823);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(51.0F, 61.0F);
      ((Path)localObject1).cubicTo(54.70148F, 67.45833F, 48.275417F, 70.24223F, 45.0F, 72.0F);
      ((Path)localObject1).cubicTo(34.045288F, 78.35749F, 29.0F, 80.81769F, 29.0F, 84.0F);
      ((Path)localObject1).lineTo(29.0F, 88.0F);
      ((Path)localObject1).cubicTo(29.0F, 89.78397F, 30.049908F, 91.0F, 32.0F, 91.0F);
      ((Path)localObject1).lineTo(88.0F, 91.0F);
      ((Path)localObject1).cubicTo(89.950096F, 91.0F, 91.0F, 89.78397F, 91.0F, 88.0F);
      ((Path)localObject1).lineTo(91.0F, 84.0F);
      ((Path)localObject1).cubicTo(91.0F, 80.81769F, 85.95471F, 78.35749F, 75.0F, 72.0F);
      ((Path)localObject1).cubicTo(71.72459F, 70.24223F, 65.29852F, 67.45833F, 69.0F, 61.0F);
      ((Path)localObject1).cubicTo(72.606285F, 56.20543F, 75.28835F, 54.126183F, 76.0F, 45.0F);
      ((Path)localObject1).cubicTo(75.28835F, 37.48938F, 69.29668F, 29.0F, 60.0F, 29.0F);
      ((Path)localObject1).cubicTo(50.703327F, 29.0F, 44.711647F, 37.48938F, 45.0F, 45.0F);
      ((Path)localObject1).cubicTo(44.711647F, 54.126183F, 47.393715F, 56.20543F, 51.0F, 61.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */