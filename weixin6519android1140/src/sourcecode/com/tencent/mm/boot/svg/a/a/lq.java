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

public final class lq
  extends c
{
  private final int height;
  private final int width;
  
  public lq()
  {
    GMTrace.i(15755416436736L, 117387);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15755416436736L, 117387);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15755550654464L, 117388);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15755550654464L, 117388);
      return 0;
      GMTrace.o(15755550654464L, 117388);
      return 60;
      GMTrace.o(15755550654464L, 117388);
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
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-12206054);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(28.32F, 0.0F);
      localPath.lineTo(31.73F, 0.0F);
      localPath.cubicTo(46.52F, 0.66F, 59.35F, 13.49F, 60.0F, 28.28F);
      localPath.lineTo(60.0F, 31.52F);
      localPath.cubicTo(59.48F, 46.57F, 46.27F, 59.66F, 31.21F, 60.0F);
      localPath.lineTo(28.74F, 60.0F);
      localPath.cubicTo(13.88F, 59.63F, 0.87F, 46.88F, 0.0F, 32.07F);
      localPath.lineTo(0.0F, 28.48F);
      localPath.cubicTo(0.53F, 13.59F, 13.45F, 0.64F, 28.32F, 0.0F);
      localPath.lineTo(28.32F, 0.0F);
      localPath.close();
      localPath.moveTo(28.0F, 12.0F);
      localPath.lineTo(28.0F, 28.0F);
      localPath.lineTo(12.0F, 28.0F);
      localPath.lineTo(12.0F, 32.0F);
      localPath.lineTo(28.0F, 32.0F);
      localPath.lineTo(28.0F, 48.0F);
      localPath.lineTo(32.0F, 48.0F);
      localPath.lineTo(32.0F, 32.0F);
      localPath.lineTo(48.0F, 32.0F);
      localPath.lineTo(48.0F, 28.0F);
      localPath.lineTo(32.0F, 28.0F);
      localPath.lineTo(32.0F, 12.0F);
      localPath.lineTo(28.0F, 12.0F);
      localPath.lineTo(28.0F, 12.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(16.0F, 0.0F);
      ((Path)localObject2).lineTo(20.0F, 0.0F);
      ((Path)localObject2).lineTo(20.0F, 16.0F);
      ((Path)localObject2).lineTo(36.0F, 16.0F);
      ((Path)localObject2).lineTo(36.0F, 20.0F);
      ((Path)localObject2).lineTo(20.0F, 20.0F);
      ((Path)localObject2).lineTo(20.0F, 36.0F);
      ((Path)localObject2).lineTo(16.0F, 36.0F);
      ((Path)localObject2).lineTo(16.0F, 20.0F);
      ((Path)localObject2).lineTo(0.0F, 20.0F);
      ((Path)localObject2).lineTo(0.0F, 16.0F);
      ((Path)localObject2).lineTo(16.0F, 16.0F);
      ((Path)localObject2).lineTo(16.0F, 0.0F);
      ((Path)localObject2).lineTo(16.0F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\lq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */