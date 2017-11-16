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
import com.tencent.mm.svg.c;

public final class pk
  extends c
{
  private final int height;
  private final int width;
  
  public pk()
  {
    GMTrace.i(21020912123904L, 156618);
    this.width = 30;
    this.height = 30;
    GMTrace.o(21020912123904L, 156618);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21021046341632L, 156619);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21021046341632L, 156619);
      return 0;
      GMTrace.o(21021046341632L, 156619);
      return 30;
      GMTrace.o(21021046341632L, 156619);
      return 30;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-5066062);
      ((Paint)localObject2).setStrokeWidth(2.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(1.7598912F, 9.578414F);
      localPath.cubicTo(0.67707217F, 8.5686035F, 0.0F, 7.1293283F, 0.0F, 5.5319147F);
      localPath.cubicTo(0.0F, 2.4767227F, 2.4767227F, 0.0F, 5.5319147F, 0.0F);
      localPath.cubicTo(7.280762F, 0.0F, 8.840067F, 0.8115291F, 9.853792F, 2.078551F);
      localPath.cubicTo(6.0863647F, 3.10554F, 3.0613158F, 5.932576F, 1.7598912F, 9.578414F);
      localPath.close();
      localPath.moveTo(16.145893F, 2.078945F);
      localPath.cubicTo(17.15961F, 0.8116973F, 18.719057F, 0.0F, 20.468084F, 0.0F);
      localPath.cubicTo(23.523277F, 0.0F, 26.0F, 2.4767227F, 26.0F, 5.5319147F);
      localPath.cubicTo(26.0F, 7.1299777F, 25.322378F, 8.569773F, 24.238789F, 9.579644F);
      localPath.cubicTo(22.937773F, 5.9336786F, 19.913073F, 3.1063783F, 16.145893F, 2.078945F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(13.0F, 1.6595745F);
      localPath.cubicTo(19.263145F, 1.6595745F, 24.340425F, 6.7368555F, 24.340425F, 13.0F);
      localPath.cubicTo(24.340425F, 19.263145F, 19.263145F, 24.340425F, 13.0F, 24.340425F);
      localPath.cubicTo(6.7368555F, 24.340425F, 1.6595745F, 19.263145F, 1.6595745F, 13.0F);
      localPath.cubicTo(1.6595745F, 6.7368555F, 6.7368555F, 1.6595745F, 13.0F, 1.6595745F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setStrokeCap(Paint.Cap.SQUARE);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(20.265247F, 22.957447F);
      localPath.lineTo(23.031206F, 25.723404F);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setStrokeCap(Paint.Cap.SQUARE);
      localObject3 = c.a((float[])localObject3, -1.0F, 0.0F, 8.777304F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(3.2822695F, 22.404255F);
      ((Path)localObject1).lineTo(5.4950356F, 25.723404F);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.SQUARE);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(13.0F, 5.318182F);
      ((Path)localObject3).lineTo(13.0F, 13.0F);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.SQUARE);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(13.0F, 13.0F);
      ((Path)localObject2).lineTo(17.978724F, 15.954546F);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\pk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */