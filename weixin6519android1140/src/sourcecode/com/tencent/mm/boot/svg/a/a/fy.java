package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class fy
  extends c
{
  private final int height;
  private final int width;
  
  public fy()
  {
    GMTrace.i(15849637281792L, 118089);
    this.width = 144;
    this.height = 144;
    GMTrace.o(15849637281792L, 118089);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15849771499520L, 118090);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15849771499520L, 118090);
      return 0;
      GMTrace.o(15849771499520L, 118090);
      return 144;
      GMTrace.o(15849771499520L, 118090);
      return 144;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-9276814);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(8.0F, 32.0F);
      localPath.cubicTo(8.0F, 28.68629F, 10.686291F, 26.0F, 14.0F, 26.0F);
      localPath.lineTo(130.0F, 26.0F);
      localPath.cubicTo(133.3137F, 26.0F, 136.0F, 28.68629F, 136.0F, 32.0F);
      localPath.lineTo(136.0F, 112.0F);
      localPath.cubicTo(136.0F, 115.313705F, 133.3137F, 118.0F, 130.0F, 118.0F);
      localPath.lineTo(14.0F, 118.0F);
      localPath.cubicTo(10.686291F, 118.0F, 8.0F, 115.313705F, 8.0F, 112.0F);
      localPath.lineTo(8.0F, 32.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(71.88509F, 65.0309F);
      ((Path)localObject).lineTo(27.494259F, 39.401836F);
      ((Path)localObject).cubicTo(26.058262F, 38.57276F, 24.230272F, 39.068474F, 23.401754F, 40.50351F);
      ((Path)localObject).lineTo(21.402084F, 43.967037F);
      ((Path)localObject).cubicTo(20.576242F, 45.39744F, 21.06255F, 47.23549F, 22.494259F, 48.062088F);
      ((Path)localObject).lineTo(70.312874F, 75.67018F);
      ((Path)localObject).cubicTo(70.809265F, 75.95677F, 71.3525F, 76.08506F, 71.88509F, 76.07097F);
      ((Path)localObject).cubicTo(72.417694F, 76.08506F, 72.96093F, 75.95677F, 73.45732F, 75.67018F);
      ((Path)localObject).lineTo(121.27593F, 48.062088F);
      ((Path)localObject).cubicTo(122.70764F, 47.23549F, 123.19395F, 45.39744F, 122.36811F, 43.967037F);
      ((Path)localObject).lineTo(120.36844F, 40.50351F);
      ((Path)localObject).cubicTo(119.53992F, 39.068474F, 117.71193F, 38.57276F, 116.27593F, 39.401836F);
      ((Path)localObject).lineTo(71.88509F, 65.0309F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */