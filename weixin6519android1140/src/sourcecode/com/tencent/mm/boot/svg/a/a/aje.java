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

public final class aje
  extends c
{
  private final int height;
  private final int width;
  
  public aje()
  {
    GMTrace.i(17569637466112L, 130904);
    this.width = 42;
    this.height = 42;
    GMTrace.o(17569637466112L, 130904);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17569771683840L, 130905);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17569771683840L, 130905);
      return 0;
      GMTrace.o(17569771683840L, 130905);
      return 42;
      GMTrace.o(17569771683840L, 130905);
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint1.setColor(-4210753);
      localPaint2.setColor(-4210753);
      localPaint2.setStrokeWidth(1.5F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(16.837944F, 33.589672F);
      localPath.cubicTo(7.7312255F, 33.589672F, 0.26877472F, 26.054348F, 0.26877472F, 16.858696F);
      localPath.cubicTo(0.26877472F, 7.6630435F, 7.7312255F, 0.12771739F, 16.837944F, 0.12771739F);
      localPath.cubicTo(25.944664F, 0.12771739F, 33.407116F, 7.6630435F, 33.407116F, 16.858696F);
      localPath.cubicTo(33.407116F, 26.182066F, 25.944664F, 33.589672F, 16.837944F, 33.589672F);
      localPath.close();
      localPath.moveTo(16.837944F, 1.4048913F);
      localPath.cubicTo(8.363636F, 1.4048913F, 1.5335969F, 8.30163F, 1.5335969F, 16.858696F);
      localPath.cubicTo(1.5335969F, 25.41576F, 8.363636F, 32.3125F, 16.837944F, 32.3125F);
      localPath.cubicTo(25.312254F, 32.3125F, 32.142292F, 25.41576F, 32.142292F, 16.858696F);
      localPath.cubicTo(32.142292F, 8.429348F, 25.18577F, 1.4048913F, 16.837944F, 1.4048913F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject1);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(39.35178F, 40.23098F);
      ((Path)localObject1).cubicTo(39.225296F, 40.23098F, 38.972332F, 40.23098F, 38.845848F, 40.10326F);
      ((Path)localObject1).lineTo(27.841898F, 28.991848F);
      ((Path)localObject1).cubicTo(27.588932F, 28.736412F, 27.588932F, 28.35326F, 27.841898F, 28.097826F);
      ((Path)localObject1).cubicTo(28.094862F, 27.842392F, 28.474308F, 27.842392F, 28.727272F, 28.097826F);
      ((Path)localObject1).lineTo(39.731224F, 39.20924F);
      ((Path)localObject1).cubicTo(39.984188F, 39.464672F, 39.984188F, 39.847828F, 39.731224F, 40.10326F);
      ((Path)localObject1).cubicTo(39.604744F, 40.23098F, 39.47826F, 40.23098F, 39.35178F, 40.23098F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */