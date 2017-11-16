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

public final class ed
  extends c
{
  private final int height;
  private final int width;
  
  public ed()
  {
    GMTrace.i(15853663813632L, 118119);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15853663813632L, 118119);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15853798031360L, 118120);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15853798031360L, 118120);
      return 0;
      GMTrace.o(15853798031360L, 118120);
      return 108;
      GMTrace.o(15853798031360L, 118120);
      return 108;
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
      ((Paint)localObject).setColor(-13917627);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(108.0F, 0.0F);
      localPath.lineTo(108.0F, 108.0F);
      localPath.lineTo(0.0F, 108.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(54.752F, 27.584F);
      ((Path)localObject).cubicTo(46.472F, 27.584F, 39.704F, 30.248F, 34.376F, 35.648F);
      ((Path)localObject).cubicTo(29.264F, 40.688F, 26.744F, 46.952F, 26.744F, 54.512F);
      ((Path)localObject).cubicTo(26.744F, 62.576F, 29.264F, 68.984F, 34.376F, 73.88F);
      ((Path)localObject).cubicTo(39.344F, 78.632F, 46.112F, 81.008F, 54.752F, 81.008F);
      ((Path)localObject).cubicTo(60.44F, 81.008F, 65.552F, 79.856F, 70.16F, 77.624F);
      ((Path)localObject).cubicTo(74.912F, 75.32F, 78.512F, 72.008F, 81.032F, 67.688F);
      ((Path)localObject).lineTo(75.992F, 67.688F);
      ((Path)localObject).cubicTo(73.976F, 70.568F, 71.312F, 72.8F, 68.0F, 74.456F);
      ((Path)localObject).cubicTo(64.256F, 76.256F, 59.792F, 77.192F, 54.752F, 77.192F);
      ((Path)localObject).cubicTo(47.696F, 77.192F, 42.152F, 75.248F, 38.12F, 71.504F);
      ((Path)localObject).cubicTo(33.8F, 67.544F, 31.712F, 61.928F, 31.712F, 54.656F);
      ((Path)localObject).cubicTo(31.712F, 48.032F, 33.8F, 42.488F, 38.048F, 38.168F);
      ((Path)localObject).cubicTo(42.368F, 33.776F, 47.84F, 31.616F, 54.464F, 31.616F);
      ((Path)localObject).cubicTo(60.656F, 31.616F, 65.696F, 33.416F, 69.44F, 37.088F);
      ((Path)localObject).cubicTo(72.896F, 40.472F, 74.624F, 44.72F, 74.624F, 49.832F);
      ((Path)localObject).cubicTo(74.624F, 54.296F, 73.328F, 58.184F, 70.736F, 61.496F);
      ((Path)localObject).cubicTo(68.504F, 64.304F, 66.272F, 65.744F, 64.04F, 65.744F);
      ((Path)localObject).cubicTo(62.672F, 65.744F, 62.024F, 65.096F, 62.024F, 63.944F);
      ((Path)localObject).cubicTo(62.024F, 63.08F, 62.312F, 61.64F, 62.888F, 59.552F);
      ((Path)localObject).lineTo(68.0F, 40.76F);
      ((Path)localObject).lineTo(63.32F, 40.76F);
      ((Path)localObject).lineTo(62.24F, 44.792F);
      ((Path)localObject).cubicTo(61.088F, 41.192F, 58.784F, 39.392F, 55.328F, 39.392F);
      ((Path)localObject).cubicTo(51.008F, 39.392F, 47.336F, 41.264F, 44.168F, 45.152F);
      ((Path)localObject).cubicTo(40.856F, 49.04F, 39.272F, 53.72F, 39.272F, 59.048F);
      ((Path)localObject).cubicTo(39.272F, 62.144F, 40.208F, 64.736F, 42.08F, 66.752F);
      ((Path)localObject).cubicTo(43.952F, 68.768F, 46.4F, 69.848F, 49.424F, 69.848F);
      ((Path)localObject).cubicTo(53.024F, 69.848F, 56.048F, 68.192F, 58.496F, 64.952F);
      ((Path)localObject).cubicTo(58.784F, 68.12F, 60.44F, 69.704F, 63.464F, 69.704F);
      ((Path)localObject).cubicTo(67.208F, 69.704F, 70.664F, 67.688F, 73.832F, 63.728F);
      ((Path)localObject).cubicTo(77.0F, 59.552F, 78.656F, 54.944F, 78.656F, 49.76F);
      ((Path)localObject).cubicTo(78.656F, 43.568F, 76.64F, 38.456F, 72.608F, 34.352F);
      ((Path)localObject).cubicTo(68.216F, 29.816F, 62.24F, 27.584F, 54.752F, 27.584F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(56.12F, 43.928F);
      ((Path)localObject).cubicTo(57.56F, 43.928F, 58.712F, 44.504F, 59.648F, 45.656F);
      ((Path)localObject).cubicTo(60.44F, 46.592F, 60.872F, 47.744F, 60.872F, 49.04F);
      ((Path)localObject).cubicTo(60.872F, 49.472F, 60.584F, 50.624F, 60.152F, 52.496F);
      ((Path)localObject).lineTo(58.568F, 58.4F);
      ((Path)localObject).cubicTo(57.992F, 60.272F, 56.84F, 62.0F, 55.112F, 63.44F);
      ((Path)localObject).cubicTo(53.384F, 64.88F, 51.584F, 65.6F, 49.784F, 65.6F);
      ((Path)localObject).cubicTo(47.984F, 65.6F, 46.616F, 65.024F, 45.68F, 63.872F);
      ((Path)localObject).cubicTo(44.744F, 62.72F, 44.312F, 61.208F, 44.312F, 59.264F);
      ((Path)localObject).cubicTo(44.312F, 55.016F, 45.536F, 51.416F, 47.984F, 48.392F);
      ((Path)localObject).cubicTo(50.288F, 45.368F, 53.024F, 43.928F, 56.12F, 43.928F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */