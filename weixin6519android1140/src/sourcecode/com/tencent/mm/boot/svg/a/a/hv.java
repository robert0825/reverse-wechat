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

public final class hv
  extends c
{
  private final int height;
  private final int width;
  
  public hv()
  {
    GMTrace.i(16772115726336L, 124962);
    this.width = 117;
    this.height = 117;
    GMTrace.o(16772115726336L, 124962);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16772249944064L, 124963);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16772249944064L, 124963);
      return 0;
      GMTrace.o(16772249944064L, 124963);
      return 117;
      GMTrace.o(16772249944064L, 124963);
      return 117;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -323.0F, 0.0F, 1.0F, -139.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 323.0F, 0.0F, 1.0F, 139.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-2565928);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(117.0F, 0.0F);
      ((Path)localObject2).lineTo(117.0F, 117.0F);
      ((Path)localObject2).lineTo(0.0F, 117.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath((Path)localObject2, c.a((Paint)localObject1, paramVarArgs));
      localCanvas.restore();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-2606050);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(9.0F, 4.0F);
      ((Path)localObject2).cubicTo(9.0F, 1.7908609F, 10.790861F, 0.0F, 13.0F, 0.0F);
      ((Path)localObject2).lineTo(104.0F, 0.0F);
      ((Path)localObject2).cubicTo(106.20914F, 0.0F, 108.0F, 1.7908609F, 108.0F, 4.0F);
      ((Path)localObject2).lineTo(108.0F, 113.0F);
      ((Path)localObject2).cubicTo(108.0F, 115.20914F, 106.20914F, 117.0F, 104.0F, 117.0F);
      ((Path)localObject2).lineTo(13.0F, 117.0F);
      ((Path)localObject2).cubicTo(10.790861F, 117.0F, 9.0F, 115.20914F, 9.0F, 113.0F);
      ((Path)localObject2).lineTo(9.0F, 4.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1029075);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(58.0F, -158.0F);
      ((Path)localObject2).cubicTo(115.9899F, -158.0F, 163.0F, -110.9899F, 163.0F, -53.0F);
      ((Path)localObject2).cubicTo(163.0F, 4.9899025F, 115.9899F, 52.0F, 58.0F, 52.0F);
      ((Path)localObject2).cubicTo(0.010097504F, 52.0F, -47.0F, 4.9899025F, -47.0F, -53.0F);
      ((Path)localObject2).cubicTo(-47.0F, -110.9899F, 0.010097504F, -158.0F, 58.0F, -158.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-600934);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(58.5F, 31.0F);
      ((Path)localObject2).cubicTo(68.164986F, 31.0F, 76.0F, 38.835014F, 76.0F, 48.5F);
      ((Path)localObject2).cubicTo(76.0F, 58.164986F, 68.164986F, 66.0F, 58.5F, 66.0F);
      ((Path)localObject2).cubicTo(48.835014F, 66.0F, 41.0F, 58.164986F, 41.0F, 48.5F);
      ((Path)localObject2).cubicTo(41.0F, 38.835014F, 48.835014F, 31.0F, 58.5F, 31.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1604553);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(61.1106F, 46.0F);
      ((Path)localObject1).lineTo(66.0F, 46.0F);
      ((Path)localObject1).lineTo(66.0F, 49.0F);
      ((Path)localObject1).lineTo(60.0F, 49.0F);
      ((Path)localObject1).lineTo(60.0F, 52.0F);
      ((Path)localObject1).lineTo(66.0F, 52.0F);
      ((Path)localObject1).lineTo(66.0F, 55.0F);
      ((Path)localObject1).lineTo(60.0F, 55.0F);
      ((Path)localObject1).lineTo(60.0F, 59.0F);
      ((Path)localObject1).lineTo(57.0F, 59.0F);
      ((Path)localObject1).lineTo(57.0F, 55.0F);
      ((Path)localObject1).lineTo(51.0F, 55.0F);
      ((Path)localObject1).lineTo(51.0F, 52.0F);
      ((Path)localObject1).lineTo(57.0F, 52.0F);
      ((Path)localObject1).lineTo(57.0F, 49.0F);
      ((Path)localObject1).lineTo(51.0F, 49.0F);
      ((Path)localObject1).lineTo(51.0F, 46.0F);
      ((Path)localObject1).lineTo(55.87868F, 46.0F);
      ((Path)localObject1).lineTo(51.707108F, 41.828426F);
      ((Path)localObject1).cubicTo(51.31658F, 41.437904F, 51.31658F, 40.804737F, 51.707108F, 40.414215F);
      ((Path)localObject1).lineTo(52.414215F, 39.707108F);
      ((Path)localObject1).lineTo(52.414215F, 39.707108F);
      ((Path)localObject1).cubicTo(52.804737F, 39.31658F, 53.437904F, 39.31658F, 53.828426F, 39.707108F);
      ((Path)localObject1).lineTo(53.828426F, 39.707108F);
      ((Path)localObject1).lineTo(58.49464F, 44.373318F);
      ((Path)localObject1).lineTo(63.16085F, 39.707108F);
      ((Path)localObject1).lineTo(63.16085F, 39.707108F);
      ((Path)localObject1).cubicTo(63.551376F, 39.31658F, 64.18454F, 39.31658F, 64.575066F, 39.707108F);
      ((Path)localObject1).lineTo(64.575066F, 39.707108F);
      ((Path)localObject1).lineTo(65.28217F, 40.414215F);
      ((Path)localObject1).cubicTo(65.6727F, 40.804737F, 65.6727F, 41.437904F, 65.28217F, 41.828426F);
      ((Path)localObject1).lineTo(65.28217F, 41.828426F);
      ((Path)localObject1).lineTo(61.1106F, 46.0F);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */