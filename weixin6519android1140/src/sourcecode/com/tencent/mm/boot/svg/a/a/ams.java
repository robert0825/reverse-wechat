package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.c;

public final class ams
  extends c
{
  private final int height;
  private final int width;
  
  public ams()
  {
    GMTrace.i(20327409123328L, 151451);
    this.width = 102;
    this.height = 102;
    GMTrace.o(20327409123328L, 151451);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20327543341056L, 151452);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20327543341056L, 151452);
      return 0;
      GMTrace.o(20327543341056L, 151452);
      return 102;
      GMTrace.o(20327543341056L, 151452);
      return 102;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      Object localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(-789517);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(102.0F, 0.0F);
      localPath.lineTo(102.0F, 102.0F);
      localPath.lineTo(0.0F, 102.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath(localPath, c.a((Paint)localObject2, paramVarArgs));
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setColor(49920);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(27.0F, 25.0F);
      ((Path)localObject2).cubicTo(27.0F, 22.790861F, 28.790861F, 21.0F, 31.0F, 21.0F);
      ((Path)localObject2).lineTo(71.0F, 21.0F);
      ((Path)localObject2).cubicTo(73.20914F, 21.0F, 75.0F, 22.790861F, 75.0F, 25.0F);
      ((Path)localObject2).lineTo(75.0F, 77.0F);
      ((Path)localObject2).cubicTo(75.0F, 79.20914F, 73.20914F, 81.0F, 71.0F, 81.0F);
      ((Path)localObject2).lineTo(31.0F, 81.0F);
      ((Path)localObject2).cubicTo(28.790861F, 81.0F, 27.0F, 79.20914F, 27.0F, 77.0F);
      ((Path)localObject2).lineTo(27.0F, 25.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject1).setColor(49920);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(36.0F, 33.0F);
      ((Path)localObject2).lineTo(60.0F, 33.0F);
      ((Path)localObject2).lineTo(60.0F, 39.0F);
      ((Path)localObject2).lineTo(36.0F, 39.0F);
      ((Path)localObject2).lineTo(36.0F, 33.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(49920);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(36.0F, 45.0F);
      ((Path)localObject1).lineTo(51.0F, 45.0F);
      ((Path)localObject1).lineTo(51.0F, 51.0F);
      ((Path)localObject1).lineTo(36.0F, 51.0F);
      ((Path)localObject1).lineTo(36.0F, 45.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */