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

public final class iv
  extends c
{
  private final int height;
  private final int width;
  
  public iv()
  {
    GMTrace.i(15921309548544L, 118623);
    this.width = 42;
    this.height = 42;
    GMTrace.o(15921309548544L, 118623);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15921443766272L, 118624);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15921443766272L, 118624);
      return 0;
      GMTrace.o(15921443766272L, 118624);
      return 42;
      GMTrace.o(15921443766272L, 118624);
      return 42;
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
      localCanvas.saveLayerAlpha(null, 102, 4);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1491.0F, 0.0F, 1.0F, -387.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1492.763F, 389.7632F);
      ((Path)localObject2).cubicTo(1492.5024F, 389.2075F, 1492.6007F, 388.5263F, 1493.0635F, 388.06348F);
      ((Path)localObject2).cubicTo(1493.6508F, 387.47614F, 1494.6017F, 387.4747F, 1495.1901F, 388.0631F);
      ((Path)localObject2).lineTo(1501.127F, 394.0F);
      ((Path)localObject2).lineTo(1523.9926F, 394.0F);
      ((Path)localObject2).cubicTo(1525.6536F, 394.0F, 1527.0F, 395.3431F, 1527.0F, 397.00793F);
      ((Path)localObject2).lineTo(1527.0F, 416.99207F);
      ((Path)localObject2).cubicTo(1527.0F, 417.79025F, 1526.6876F, 418.51584F, 1526.1813F, 419.05432F);
      ((Path)localObject2).lineTo(1530.607F, 423.48016F);
      ((Path)localObject2).cubicTo(1531.1942F, 424.0673F, 1531.1981F, 425.01532F, 1530.6067F, 425.60675F);
      ((Path)localObject2).cubicTo(1530.147F, 426.06656F, 1529.4644F, 426.16727F, 1528.9072F, 425.907F);
      ((Path)localObject2).cubicTo(1528.8348F, 425.75256F, 1528.7347F, 425.60782F, 1528.607F, 425.48016F);
      ((Path)localObject2).lineTo(1493.1901F, 390.0631F);
      ((Path)localObject2).cubicTo(1493.0623F, 389.93536F, 1492.9175F, 389.8354F, 1492.763F, 389.7632F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(1493.0339F, 394.16092F);
      ((Path)localObject2).cubicTo(1491.8503F, 394.56543F, 1491.0F, 395.6873F, 1491.0F, 397.00793F);
      ((Path)localObject2).lineTo(1491.0F, 416.99207F);
      ((Path)localObject2).cubicTo(1491.0F, 418.6569F, 1492.3418F, 420.0F, 1493.9968F, 420.0F);
      ((Path)localObject2).lineTo(1500.0F, 420.0F);
      ((Path)localObject2).lineTo(1500.0F, 426.8875F);
      ((Path)localObject2).cubicTo(1500.0F, 428.08762F, 1500.6836F, 428.36902F, 1501.5267F, 427.5205F);
      ((Path)localObject2).lineTo(1509.0F, 420.0F);
      ((Path)localObject2).lineTo(1518.873F, 420.0F);
      ((Path)localObject2).lineTo(1493.0339F, 394.16092F);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\iv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */