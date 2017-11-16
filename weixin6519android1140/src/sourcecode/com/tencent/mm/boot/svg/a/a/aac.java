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

public final class aac
  extends c
{
  private final int height;
  private final int width;
  
  public aac()
  {
    GMTrace.i(15798902980608L, 117711);
    this.width = 43;
    this.height = 96;
    GMTrace.o(15798902980608L, 117711);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15799037198336L, 117712);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15799037198336L, 117712);
      return 0;
      GMTrace.o(15799037198336L, 117712);
      return 43;
      GMTrace.o(15799037198336L, 117712);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
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
      localPaint1.setColor(-3355444);
      localPaint2.setColor(832018327);
      localPaint2.setStrokeWidth(1.44F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(21.5F, 31.0F);
      localPath.cubicTo(31.164984F, 31.0F, 39.0F, 38.835014F, 39.0F, 48.5F);
      localPath.cubicTo(39.0F, 58.164986F, 31.164984F, 66.0F, 21.5F, 66.0F);
      localPath.cubicTo(11.835016F, 66.0F, 4.0F, 58.164986F, 4.0F, 48.5F);
      localPath.cubicTo(4.0F, 38.835014F, 11.835016F, 31.0F, 21.5F, 31.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint1);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */