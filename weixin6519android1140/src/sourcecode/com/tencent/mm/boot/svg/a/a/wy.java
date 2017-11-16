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

public final class wy
  extends c
{
  private final int height;
  private final int width;
  
  public wy()
  {
    GMTrace.i(17573127127040L, 130930);
    this.width = 96;
    this.height = 96;
    GMTrace.o(17573127127040L, 130930);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17573261344768L, 130931);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17573261344768L, 130931);
      return 0;
      GMTrace.o(17573261344768L, 130931);
      return 96;
      GMTrace.o(17573261344768L, 130931);
      return 96;
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
      localPaint.setColor(48640);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(21.44831F, 69.12264F);
      ((Path)localObject).lineTo(46.491844F, 26.187445F);
      ((Path)localObject).cubicTo(47.320778F, 24.766298F, 48.675976F, 24.758957F, 49.509193F, 26.187445F);
      ((Path)localObject).lineTo(74.55273F, 69.12264F);
      ((Path)localObject).cubicTo(75.38166F, 70.54379F, 74.719376F, 71.70915F, 73.063896F, 71.70915F);
      ((Path)localObject).lineTo(22.937145F, 71.70915F);
      ((Path)localObject).cubicTo(21.285309F, 71.70915F, 20.615093F, 70.55113F, 21.44831F, 69.12264F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(46.700405F, 41.400345F);
      ((Path)localObject).cubicTo(46.15008F, 41.400345F, 45.72443F, 41.842537F, 45.75011F, 42.39727F);
      ((Path)localObject).lineTo(46.46933F, 57.932423F);
      ((Path)localObject).lineTo(49.530827F, 57.932423F);
      ((Path)localObject).lineTo(50.250046F, 42.39727F);
      ((Path)localObject).cubicTo(50.275536F, 41.846684F, 49.83909F, 41.400345F, 49.29975F, 41.400345F);
      ((Path)localObject).lineTo(46.700405F, 41.400345F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.000076F, 65.280014F);
      ((Path)localObject).cubicTo(49.268192F, 65.280014F, 50.2962F, 64.252F, 50.2962F, 62.98389F);
      ((Path)localObject).cubicTo(50.2962F, 61.715775F, 49.268192F, 60.687767F, 48.000076F, 60.687767F);
      ((Path)localObject).cubicTo(46.731964F, 60.687767F, 45.703957F, 61.715775F, 45.703957F, 62.98389F);
      ((Path)localObject).cubicTo(45.703957F, 64.252F, 46.731964F, 65.280014F, 48.000076F, 65.280014F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\wy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */