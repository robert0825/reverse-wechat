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

public final class tj
  extends c
{
  private final int height;
  private final int width;
  
  public tj()
  {
    GMTrace.i(17575543046144L, 130948);
    this.width = 96;
    this.height = 96;
    GMTrace.o(17575543046144L, 130948);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17575677263872L, 130949);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17575677263872L, 130949);
      return 0;
      GMTrace.o(17575677263872L, 130949);
      return 96;
      GMTrace.o(17575677263872L, 130949);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      localPaint2.setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setStrokeWidth(1.0F);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setColor(-8617594);
      localCanvas.save();
      Object localObject = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(96.0F, 48.0F);
      localPath.cubicTo(96.0F, 74.50967F, 74.50967F, 96.0F, 48.0F, 96.0F);
      localPath.cubicTo(21.490332F, 96.0F, 0.0F, 74.50967F, 0.0F, 48.0F);
      localPath.cubicTo(0.0F, 21.490332F, 21.490332F, 0.0F, 48.0F, 0.0F);
      localPath.cubicTo(74.50967F, 0.0F, 96.0F, 21.490332F, 96.0F, 48.0F);
      localPath.close();
      localPath.moveTo(2.2325583F, 48.0F);
      localPath.cubicTo(2.2325583F, 73.27666F, 22.72334F, 93.76744F, 48.0F, 93.76744F);
      localPath.cubicTo(73.27666F, 93.76744F, 93.76744F, 73.27666F, 93.76744F, 48.0F);
      localPath.cubicTo(93.76744F, 22.72334F, 73.27666F, 2.2325583F, 48.0F, 2.2325583F);
      localPath.cubicTo(22.72334F, 2.2325583F, 2.2325583F, 22.72334F, 2.2325583F, 48.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-8617594);
      localPaint1.setStrokeWidth(2.0F);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(61.0F, 51.0F);
      ((Path)localObject).cubicTo(59.552845F, 51.154545F, 58.8374F, 50.327274F, 60.0F, 49.0F);
      ((Path)localObject).cubicTo(59.672085F, 48.436363F, 60.506775F, 47.727272F, 62.0F, 48.0F);
      ((Path)localObject).cubicTo(65.03794F, 46.663635F, 67.54201F, 43.945454F, 68.0F, 41.0F);
      ((Path)localObject).cubicTo(67.54201F, 36.736362F, 63.845528F, 33.545456F, 60.0F, 33.0F);
      ((Path)localObject).cubicTo(54.544716F, 33.545456F, 50.84824F, 36.736362F, 51.0F, 41.0F);
      ((Path)localObject).lineTo(51.0F, 58.0F);
      ((Path)localObject).cubicTo(50.84824F, 64.27273F, 45.482384F, 69.0F, 39.0F, 69.0F);
      ((Path)localObject).cubicTo(32.365852F, 69.0F, 27.0F, 64.27273F, 27.0F, 58.0F);
      ((Path)localObject).cubicTo(27.0F, 53.163635F, 31.17344F, 48.79091F, 37.0F, 48.0F);
      ((Path)localObject).cubicTo(38.20867F, 47.96364F, 38.80488F, 49.618183F, 38.0F, 50.0F);
      ((Path)localObject).cubicTo(37.759224F, 50.496105F, 37.373985F, 51.390907F, 36.0F, 51.0F);
      ((Path)localObject).cubicTo(32.96206F, 52.454544F, 30.457994F, 55.172726F, 30.0F, 58.0F);
      ((Path)localObject).cubicTo(30.457994F, 62.263638F, 34.154472F, 65.454544F, 38.0F, 66.0F);
      ((Path)localObject).cubicTo(43.455284F, 65.454544F, 47.15176F, 62.263638F, 47.0F, 58.0F);
      ((Path)localObject).lineTo(47.0F, 41.0F);
      ((Path)localObject).cubicTo(47.15176F, 34.727272F, 52.517616F, 30.0F, 59.0F, 30.0F);
      ((Path)localObject).cubicTo(65.63415F, 30.0F, 71.0F, 34.727272F, 71.0F, 41.0F);
      ((Path)localObject).cubicTo(71.0F, 45.954544F, 66.82656F, 50.20909F, 61.0F, 51.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\tj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */