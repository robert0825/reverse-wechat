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

public final class kj
  extends c
{
  private final int height;
  private final int width;
  
  public kj()
  {
    GMTrace.i(17570174337024L, 130908);
    this.width = 62;
    this.height = 62;
    GMTrace.o(17570174337024L, 130908);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17570308554752L, 130909);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17570308554752L, 130909);
      return 0;
      GMTrace.o(17570308554752L, 130909);
      return 62;
      GMTrace.o(17570308554752L, 130909);
      return 62;
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
      localPaint.setColor(-11776948);
      localPaint.setStrokeWidth(3.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(12.5F, 51.5F);
      ((Path)localObject).lineTo(12.5F, 50.833168F);
      ((Path)localObject).cubicTo(12.604213F, 50.756973F, 12.7130165F, 50.673367F, 12.825878F, 50.581997F);
      ((Path)localObject).cubicTo(13.609306F, 49.947758F, 14.377914F, 49.098545F, 15.08248F, 48.008003F);
      ((Path)localObject).cubicTo(17.25971F, 44.638042F, 18.415026F, 39.67215F, 18.092539F, 32.831554F);
      ((Path)localObject).cubicTo(18.56658F, 22.598658F, 22.709154F, 17.582647F, 28.795002F, 16.286835F);
      ((Path)localObject).lineTo(31.072823F, 15.801835F);
      ((Path)localObject).lineTo(29.689184F, 13.928539F);
      ((Path)localObject).cubicTo(29.419085F, 13.562856F, 29.272728F, 13.127208F, 29.272728F, 12.666667F);
      ((Path)localObject).cubicTo(29.272728F, 11.47552F, 30.26446F, 10.5F, 31.5F, 10.5F);
      ((Path)localObject).cubicTo(32.735542F, 10.5F, 33.727272F, 11.47552F, 33.727272F, 12.666667F);
      ((Path)localObject).cubicTo(33.727272F, 13.127208F, 33.580914F, 13.562856F, 33.310818F, 13.928539F);
      ((Path)localObject).lineTo(31.927177F, 15.801835F);
      ((Path)localObject).lineTo(34.204998F, 16.286835F);
      ((Path)localObject).cubicTo(40.290844F, 17.582647F, 44.43342F, 22.598658F, 44.90746F, 32.831554F);
      ((Path)localObject).cubicTo(44.584972F, 39.67215F, 45.740288F, 44.638042F, 47.91752F, 48.008003F);
      ((Path)localObject).cubicTo(48.622086F, 49.098545F, 49.390694F, 49.947758F, 50.17412F, 50.581997F);
      ((Path)localObject).cubicTo(50.286983F, 50.673367F, 50.395786F, 50.756973F, 50.5F, 50.833168F);
      ((Path)localObject).lineTo(50.5F, 51.5F);
      ((Path)localObject).lineTo(12.5F, 51.5F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\kj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */