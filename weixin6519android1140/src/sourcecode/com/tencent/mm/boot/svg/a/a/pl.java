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

public final class pl
  extends c
{
  private final int height;
  private final int width;
  
  public pl()
  {
    GMTrace.i(21027086139392L, 156664);
    this.width = 98;
    this.height = 98;
    GMTrace.o(21027086139392L, 156664);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21027220357120L, 156665);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21027220357120L, 156665);
      return 0;
      GMTrace.o(21027220357120L, 156665);
      return 98;
      GMTrace.o(21027220357120L, 156665);
      return 98;
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
      localPaint = c.a((Paint)localObject, paramVarArgs);
      localPaint.setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-9012352);
      localPaint.setStrokeWidth(3.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(25.636152F, 33.94453F);
      ((Path)localObject).lineTo(47.514046F, 46.408054F);
      ((Path)localObject).cubicTo(48.43459F, 46.932476F, 49.56348F, 46.932476F, 50.484028F, 46.408054F);
      ((Path)localObject).lineTo(72.361916F, 33.94453F);
      ((Path)localObject).cubicTo(73.80155F, 33.124393F, 74.30375F, 31.292488F, 73.48361F, 29.852856F);
      ((Path)localObject).cubicTo(73.1879F, 29.333775F, 72.74394F, 28.9148F, 72.20862F, 28.649614F);
      ((Path)localObject).lineTo(50.33073F, 17.811768F);
      ((Path)localObject).cubicTo(49.491592F, 17.396078F, 48.506477F, 17.396078F, 47.667343F, 17.811768F);
      ((Path)localObject).lineTo(25.78945F, 28.649614F);
      ((Path)localObject).cubicTo(24.30478F, 29.385088F, 23.697437F, 31.184872F, 24.43291F, 32.66954F);
      ((Path)localObject).cubicTo(24.698097F, 33.20486F, 25.117071F, 33.64882F, 25.636152F, 33.94453F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(51.5F, 54.065365F);
      ((Path)localObject).lineTo(51.5F, 77.94596F);
      ((Path)localObject).cubicTo(51.5F, 79.60281F, 52.843147F, 80.94596F, 54.5F, 80.94596F);
      ((Path)localObject).cubicTo(55.0565F, 80.94596F, 55.602028F, 80.791176F, 56.075596F, 80.4989F);
      ((Path)localObject).lineTo(77.0756F, 67.53834F);
      ((Path)localObject).cubicTo(77.96095F, 66.99192F, 78.5F, 66.0258F, 78.5F, 64.9854F);
      ((Path)localObject).lineTo(78.5F, 41.93013F);
      ((Path)localObject).cubicTo(78.5F, 40.273277F, 77.15685F, 38.93013F, 75.5F, 38.93013F);
      ((Path)localObject).cubicTo(74.97299F, 38.93013F, 74.45529F, 39.06896F, 73.99899F, 39.332638F);
      ((Path)localObject).lineTo(52.998993F, 51.46787F);
      ((Path)localObject).cubicTo(52.071358F, 52.00392F, 51.5F, 52.993984F, 51.5F, 54.065365F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(46.5F, 54.407204F);
      ((Path)localObject).cubicTo(46.5F, 53.35098F, 45.944565F, 52.372574F, 45.037624F, 51.831215F);
      ((Path)localObject).lineTo(24.037622F, 39.296185F);
      ((Path)localObject).cubicTo(23.572733F, 39.01869F, 23.041412F, 38.872173F, 22.5F, 38.872173F);
      ((Path)localObject).cubicTo(20.843145F, 38.872173F, 19.5F, 40.21532F, 19.5F, 41.872173F);
      ((Path)localObject).lineTo(19.5F, 64.84526F);
      ((Path)localObject).cubicTo(19.5F, 65.874146F, 20.027266F, 66.83126F, 20.896944F, 67.38104F);
      ((Path)localObject).lineTo(41.896942F, 80.656685F);
      ((Path)localObject).cubicTo(42.376633F, 80.95993F, 42.932495F, 81.1209F, 43.5F, 81.1209F);
      ((Path)localObject).cubicTo(45.156853F, 81.1209F, 46.5F, 79.777756F, 46.5F, 78.1209F);
      ((Path)localObject).lineTo(46.5F, 54.407204F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\pl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */