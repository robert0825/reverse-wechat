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

public final class lw
  extends c
{
  private final int height;
  private final int width;
  
  public lw()
  {
    GMTrace.i(15769643515904L, 117493);
    this.width = 144;
    this.height = 144;
    GMTrace.o(15769643515904L, 117493);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15769777733632L, 117494);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15769777733632L, 117494);
      return 0;
      GMTrace.o(15769777733632L, 117494);
      return 144;
      GMTrace.o(15769777733632L, 117494);
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
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-14187817);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(144.0F, 0.0F);
      localPath.lineTo(144.0F, 144.0F);
      localPath.lineTo(0.0F, 144.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(61.621193F, 73.14729F);
      localPath.cubicTo(66.18872F, 80.1801F, 59.140778F, 83.23341F, 55.739967F, 85.172226F);
      localPath.cubicTo(43.53354F, 92.134026F, 38.0F, 94.832306F, 38.0F, 98.453674F);
      localPath.lineTo(38.0F, 102.981674F);
      localPath.cubicTo(38.0F, 104.6663F, 39.151512F, 106.0F, 40.95683F, 106.0F);
      localPath.lineTo(103.04317F, 106.0F);
      localPath.cubicTo(104.84849F, 106.0F, 106.0F, 104.6663F, 106.0F, 102.981674F);
      localPath.lineTo(106.0F, 98.453674F);
      localPath.cubicTo(106.0F, 94.832306F, 100.46646F, 92.134026F, 88.26003F, 85.172226F);
      localPath.cubicTo(84.85922F, 83.23341F, 77.81128F, 80.1801F, 82.37881F, 73.14729F);
      localPath.cubicTo(85.82625F, 67.83821F, 88.767876F, 65.55775F, 88.767876F, 56.603626F);
      localPath.cubicTo(88.767876F, 47.310932F, 82.19635F, 38.0F, 72.0F, 38.0F);
      localPath.cubicTo(61.80365F, 38.0F, 55.23213F, 47.310932F, 55.23213F, 56.603626F);
      localPath.cubicTo(55.23213F, 65.55775F, 58.17375F, 67.83821F, 61.621193F, 73.14729F);
      localPath.close();
      localPath.moveTo(66.0F, 97.856636F);
      localPath.lineTo(71.5F, 105.0F);
      localPath.lineTo(77.0F, 97.856636F);
      localPath.lineTo(71.5F, 80.0F);
      localPath.lineTo(66.0F, 97.856636F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-16608256);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(144.0F, 0.0F);
      localPath.lineTo(144.0F, 144.0F);
      localPath.lineTo(0.0F, 144.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-328966);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 31.0F, 0.0F, 1.0F, 39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(32.0F, 44.0F);
      ((Path)localObject2).lineTo(32.0F, 53.677307F);
      ((Path)localObject2).cubicTo(32.0F, 56.064663F, 33.92523F, 58.0F, 36.31028F, 58.0F);
      ((Path)localObject2).lineTo(61.0F, 58.0F);
      ((Path)localObject2).lineTo(69.31494F, 64.651955F);
      ((Path)localObject2).cubicTo(70.245575F, 65.39646F, 71.0F, 65.03501F, 71.0F, 63.835083F);
      ((Path)localObject2).lineTo(71.0F, 58.0F);
      ((Path)localObject2).lineTo(77.68408F, 58.0F);
      ((Path)localObject2).cubicTo(80.067696F, 58.0F, 82.0F, 56.065983F, 82.0F, 53.677307F);
      ((Path)localObject2).lineTo(82.0F, 23.322693F);
      ((Path)localObject2).cubicTo(82.0F, 20.935335F, 80.07058F, 19.0F, 77.67205F, 19.0F);
      ((Path)localObject2).lineTo(57.0F, 19.0F);
      ((Path)localObject2).lineTo(57.0F, 39.672432F);
      ((Path)localObject2).cubicTo(57.0F, 42.06248F, 55.062813F, 44.0F, 52.683216F, 44.0F);
      ((Path)localObject2).lineTo(32.0F, 44.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(49.672234F, 0.0F);
      ((Path)localObject2).cubicTo(52.062393F, 0.0F, 54.0F, 1.9362065F, 54.0F, 4.3102264F);
      ((Path)localObject2).lineTo(54.0F, 36.689774F);
      ((Path)localObject2).cubicTo(54.0F, 39.070248F, 52.06081F, 41.0F, 49.689583F, 41.0F);
      ((Path)localObject2).lineTo(23.0F, 41.0F);
      ((Path)localObject2).lineTo(13.670663F, 48.633095F);
      ((Path)localObject2).cubicTo(12.747981F, 49.388016F, 12.0F, 49.036842F, 12.0F, 47.844276F);
      ((Path)localObject2).lineTo(12.0F, 41.0F);
      ((Path)localObject2).lineTo(4.315322F, 41.0F);
      ((Path)localObject2).cubicTo(1.9320353F, 41.0F, 0.0F, 39.063793F, 0.0F, 36.689774F);
      ((Path)localObject2).lineTo(0.0F, 4.3102264F);
      ((Path)localObject2).cubicTo(0.0F, 1.929754F, 1.9378097F, 0.0F, 4.327765F, 0.0F);
      ((Path)localObject2).lineTo(49.672234F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\lw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */