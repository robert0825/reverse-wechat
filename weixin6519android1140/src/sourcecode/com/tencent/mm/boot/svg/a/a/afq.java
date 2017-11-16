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

public final class afq
  extends c
{
  private final int height;
  private final int width;
  
  public afq()
  {
    GMTrace.i(15949495271424L, 118833);
    this.width = 71;
    this.height = 71;
    GMTrace.o(15949495271424L, 118833);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15949629489152L, 118834);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15949629489152L, 118834);
      return 0;
      GMTrace.o(15949629489152L, 118834);
      return 71;
      GMTrace.o(15949629489152L, 118834);
      return 71;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramVarArgs).setStrokeWidth(1.0F);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(85.5F, 0.0F);
      ((Path)localObject3).cubicTo(132.72035F, 0.0F, 171.0F, 38.27965F, 171.0F, 85.5F);
      ((Path)localObject3).cubicTo(171.0F, 132.72035F, 132.72035F, 171.0F, 85.5F, 171.0F);
      ((Path)localObject3).cubicTo(38.27965F, 171.0F, 0.0F, 132.72035F, 0.0F, 85.5F);
      ((Path)localObject3).cubicTo(0.0F, 38.27965F, 38.27965F, 0.0F, 85.5F, 0.0F);
      ((Path)localObject3).close();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-11119016);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 6.99323F);
      localPath.cubicTo(0.0F, 5.8923993F, 0.89770234F, 5.0F, 1.9917458F, 5.0F);
      localPath.lineTo(69.008255F, 5.0F);
      localPath.cubicTo(70.10827F, 5.0F, 71.0F, 5.8954434F, 71.0F, 6.99323F);
      localPath.lineTo(71.0F, 69.00677F);
      localPath.cubicTo(71.0F, 70.1076F, 70.102295F, 71.0F, 69.008255F, 71.0F);
      localPath.lineTo(1.9917458F, 71.0F);
      localPath.cubicTo(0.89173496F, 71.0F, 0.0F, 70.10455F, 0.0F, 69.00677F);
      localPath.lineTo(0.0F, 6.99323F);
      localPath.close();
      localPath.moveTo(3.0F, 8.0F);
      localPath.lineTo(68.0F, 8.0F);
      localPath.lineTo(68.0F, 68.0F);
      localPath.lineTo(3.0F, 68.0F);
      localPath.lineTo(3.0F, 8.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 26.0F);
      localPath.lineTo(71.0F, 26.0F);
      localPath.lineTo(71.0F, 29.0F);
      localPath.lineTo(0.0F, 29.0F);
      localPath.lineTo(0.0F, 26.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(12.0F, 39.0F);
      localPath.lineTo(23.0F, 39.0F);
      localPath.lineTo(23.0F, 42.0F);
      localPath.lineTo(12.0F, 42.0F);
      localPath.lineTo(12.0F, 39.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      localObject2 = c.a((float[])localObject2, -1.8369701E-16F, -1.0F, 22.60606F, 1.0F, -1.8369701E-16F, -8.621212F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(8.621212F, 5.6060605F);
      localPath.lineTo(22.621212F, 5.6060605F);
      localPath.lineTo(22.621212F, 8.60606F);
      localPath.lineTo(8.621212F, 8.60606F);
      localPath.lineTo(8.621212F, 5.6060605F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      localObject2 = c.a((float[])localObject2, -1.8369701E-16F, -1.0F, 62.60606F, 1.0F, -1.8369701E-16F, -48.621212F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(48.621212F, 5.6060605F);
      ((Path)localObject1).lineTo(62.621212F, 5.6060605F);
      ((Path)localObject1).lineTo(62.621212F, 8.60606F);
      ((Path)localObject1).lineTo(48.621212F, 8.60606F);
      ((Path)localObject1).lineTo(48.621212F, 5.6060605F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(12.0F, 53.0F);
      ((Path)localObject2).lineTo(23.0F, 53.0F);
      ((Path)localObject2).lineTo(23.0F, 56.0F);
      ((Path)localObject2).lineTo(12.0F, 56.0F);
      ((Path)localObject2).lineTo(12.0F, 53.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(30.0F, 39.0F);
      ((Path)localObject2).lineTo(41.0F, 39.0F);
      ((Path)localObject2).lineTo(41.0F, 42.0F);
      ((Path)localObject2).lineTo(30.0F, 42.0F);
      ((Path)localObject2).lineTo(30.0F, 39.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(30.0F, 53.0F);
      ((Path)localObject2).lineTo(41.0F, 53.0F);
      ((Path)localObject2).lineTo(41.0F, 56.0F);
      ((Path)localObject2).lineTo(30.0F, 56.0F);
      ((Path)localObject2).lineTo(30.0F, 53.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(48.0F, 39.0F);
      ((Path)localObject2).lineTo(59.0F, 39.0F);
      ((Path)localObject2).lineTo(59.0F, 42.0F);
      ((Path)localObject2).lineTo(48.0F, 42.0F);
      ((Path)localObject2).lineTo(48.0F, 39.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(48.0F, 53.0F);
      ((Path)localObject1).lineTo(59.0F, 53.0F);
      ((Path)localObject1).lineTo(59.0F, 56.0F);
      ((Path)localObject1).lineTo(48.0F, 56.0F);
      ((Path)localObject1).lineTo(48.0F, 53.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\afq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */