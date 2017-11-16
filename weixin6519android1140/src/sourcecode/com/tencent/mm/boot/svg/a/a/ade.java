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

public final class ade
  extends c
{
  private final int height;
  private final int width;
  
  public ade()
  {
    GMTrace.i(15823599042560L, 117895);
    this.width = 72;
    this.height = 72;
    GMTrace.o(15823599042560L, 117895);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15823733260288L, 117896);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15823733260288L, 117896);
      return 0;
      GMTrace.o(15823733260288L, 117896);
      return 72;
      GMTrace.o(15823733260288L, 117896);
      return 72;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-6710887);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(33.88F, 0.0F);
      localPath.lineTo(37.99F, 0.0F);
      localPath.cubicTo(46.5F, 0.63F, 54.85F, 4.06F, 60.96F, 10.08F);
      localPath.cubicTo(67.43F, 16.24F, 71.33F, 24.85F, 72.0F, 33.73F);
      localPath.lineTo(72.0F, 37.97F);
      localPath.cubicTo(71.44F, 46.97F, 67.49F, 55.71F, 60.95F, 61.93F);
      localPath.cubicTo(54.91F, 67.87F, 46.69F, 71.3F, 38.29F, 72.0F);
      localPath.lineTo(34.16F, 72.0F);
      localPath.cubicTo(25.58F, 71.47F, 17.17F, 67.95F, 11.02F, 61.9F);
      localPath.cubicTo(4.53F, 55.72F, 0.62F, 47.06F, 0.0F, 38.14F);
      localPath.lineTo(0.0F, 34.2F);
      localPath.cubicTo(0.52F, 24.67F, 4.91F, 15.44F, 12.08F, 9.12F);
      localPath.cubicTo(18.04F, 3.69F, 25.89F, 0.64F, 33.88F, 0.0F);
      localPath.lineTo(33.88F, 0.0F);
      localPath.close();
      localPath.moveTo(29.41F, 3.66F);
      localPath.cubicTo(22.9F, 5.01F, 16.79F, 8.34F, 12.2F, 13.16F);
      localPath.cubicTo(1.73F, 23.69F, -0.01F, 41.47F, 8.24F, 53.82F);
      localPath.cubicTo(16.74F, 67.7F, 36.16F, 73.15F, 50.6F, 65.58F);
      localPath.cubicTo(65.28F, 58.72F, 72.84F, 40.21F, 67.13F, 25.04F);
      localPath.cubicTo(62.1F, 9.87F, 45.03F, 0.13F, 29.41F, 3.66F);
      localPath.lineTo(29.41F, 3.66F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(26.0F, 19.01F);
      ((Path)localObject).cubicTo(35.33F, 24.67F, 44.66F, 30.33F, 53.99F, 36.0F);
      ((Path)localObject).cubicTo(44.67F, 41.67F, 35.34F, 47.33F, 26.0F, 52.99F);
      ((Path)localObject).lineTo(26.0F, 19.01F);
      ((Path)localObject).lineTo(26.0F, 19.01F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */