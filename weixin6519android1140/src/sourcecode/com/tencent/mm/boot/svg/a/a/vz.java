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

public final class vz
  extends c
{
  private final int height;
  private final int width;
  
  public vz()
  {
    GMTrace.i(15932046966784L, 118703);
    this.width = 84;
    this.height = 84;
    GMTrace.o(15932046966784L, 118703);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15932181184512L, 118704);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15932181184512L, 118704);
      return 0;
      GMTrace.o(15932181184512L, 118704);
      return 84;
      GMTrace.o(15932181184512L, 118704);
      return 84;
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
      localCanvas.saveLayerAlpha(null, 128, 4);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(1717131609);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 9.0093975F);
      localPath.cubicTo(0.0F, 4.0336447F, 4.0231953F, 0.0F, 9.0093975F, 0.0F);
      localPath.lineTo(74.9906F, 0.0F);
      localPath.cubicTo(79.966354F, 0.0F, 84.0F, 4.0231953F, 84.0F, 9.0093975F);
      localPath.lineTo(84.0F, 74.9906F);
      localPath.cubicTo(84.0F, 79.966354F, 79.97681F, 84.0F, 74.9906F, 84.0F);
      localPath.lineTo(9.0093975F, 84.0F);
      localPath.cubicTo(4.0336447F, 84.0F, 0.0F, 79.97681F, 0.0F, 74.9906F);
      localPath.lineTo(0.0F, 9.0093975F);
      localPath.close();
      localPath.moveTo(2.0F, 10.0000515F);
      localPath.lineTo(2.0F, 73.99995F);
      localPath.cubicTo(2.0F, 78.42021F, 5.5817447F, 82.0F, 10.0000515F, 82.0F);
      localPath.lineTo(73.99995F, 82.0F);
      localPath.cubicTo(78.42021F, 82.0F, 82.0F, 78.41826F, 82.0F, 73.99995F);
      localPath.lineTo(82.0F, 10.0000515F);
      localPath.cubicTo(82.0F, 5.5797863F, 78.41826F, 2.0F, 73.99995F, 2.0F);
      localPath.lineTo(10.0000515F, 2.0F);
      localPath.cubicTo(5.5797863F, 2.0F, 2.0F, 5.5817447F, 2.0F, 10.0000515F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(1719039606);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(84.0F, 0.0F);
      localPath.lineTo(84.0F, 84.0F);
      localPath.lineTo(0.0F, 84.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 28.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(10.0F, 0.0F);
      ((Path)localObject2).lineTo(10.0F, 10.0F);
      ((Path)localObject2).lineTo(0.0F, 10.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 18.0F);
      ((Path)localObject2).lineTo(10.0F, 18.0F);
      ((Path)localObject2).lineTo(10.0F, 28.0F);
      ((Path)localObject2).lineTo(0.0F, 28.0F);
      ((Path)localObject2).lineTo(0.0F, 18.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(16.0F, 0.0F);
      ((Path)localObject2).lineTo(26.0F, 0.0F);
      ((Path)localObject2).lineTo(26.0F, 10.0F);
      ((Path)localObject2).lineTo(16.0F, 10.0F);
      ((Path)localObject2).lineTo(16.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(16.0F, 18.0F);
      ((Path)localObject2).lineTo(26.0F, 18.0F);
      ((Path)localObject2).lineTo(26.0F, 28.0F);
      ((Path)localObject2).lineTo(16.0F, 28.0F);
      ((Path)localObject2).lineTo(16.0F, 18.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(32.0F, 0.0F);
      ((Path)localObject2).lineTo(42.0F, 0.0F);
      ((Path)localObject2).lineTo(42.0F, 10.0F);
      ((Path)localObject2).lineTo(32.0F, 10.0F);
      ((Path)localObject2).lineTo(32.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(32.0F, 18.0F);
      ((Path)localObject1).lineTo(42.0F, 18.0F);
      ((Path)localObject1).lineTo(42.0F, 28.0F);
      ((Path)localObject1).lineTo(32.0F, 28.0F);
      ((Path)localObject1).lineTo(32.0F, 18.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\vz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */