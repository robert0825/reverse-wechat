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

public final class gv
  extends c
{
  private final int height;
  private final int width;
  
  public gv()
  {
    GMTrace.i(15911377436672L, 118549);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15911377436672L, 118549);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15911511654400L, 118550);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15911511654400L, 118550);
      return 0;
      GMTrace.o(15911511654400L, 118550);
      return 96;
      GMTrace.o(15911511654400L, 118550);
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
      localPaint.setColor(-8617594);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(39.0F, 87.17454F);
      ((Path)localObject).cubicTo(41.636593F, 87.715576F, 44.36543F, 88.0F, 47.160282F, 88.0F);
      ((Path)localObject).cubicTo(52.397297F, 88.0F, 57.40235F, 87.001335F, 62.0F, 85.18495F);
      ((Path)localObject).lineTo(39.0F, 62.0F);
      ((Path)localObject).lineTo(39.0F, 87.17454F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(84.18153F, 34.0F);
      ((Path)localObject).lineTo(61.0F, 57.0F);
      ((Path)localObject).lineTo(86.17404F, 57.0F);
      ((Path)localObject).cubicTo(86.71542F, 54.364433F, 87.0F, 51.636253F, 87.0F, 48.841667F);
      ((Path)localObject).cubicTo(87.0F, 43.60351F, 86.00011F, 38.59756F, 84.18153F, 34.0F);
      ((Path)localObject).lineTo(84.18153F, 34.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(68.36796F, 82.0F);
      ((Path)localObject).cubicTo(74.77223F, 77.61014F, 79.888794F, 71.36405F, 83.0F, 64.0F);
      ((Path)localObject).lineTo(51.0F, 64.0F);
      ((Path)localObject).lineTo(68.36796F, 82.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(7.0F, 48.134434F);
      ((Path)localObject).cubicTo(7.0F, 53.381317F, 8.00163F, 58.394844F, 9.8239765F, 63.0F);
      ((Path)localObject).lineTo(33.0F, 40.0F);
      ((Path)localObject).lineTo(7.8198056F, 40.0F);
      ((Path)localObject).cubicTo(7.2825346F, 42.628418F, 7.0F, 45.348637F, 7.0F, 48.134434F);
      ((Path)localObject).lineTo(7.0F, 48.134434F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.616856F, 15.0F);
      ((Path)localObject).cubicTo(18.216589F, 19.392467F, 13.105181F, 25.63808F, 10.0F, 33.0F);
      ((Path)localObject).lineTo(42.0F, 33.0F);
      ((Path)localObject).lineTo(24.616856F, 15.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(63.0F, 11.0F);
      ((Path)localObject).lineTo(63.0F, 43.0F);
      ((Path)localObject).lineTo(81.0F, 25.622782F);
      ((Path)localObject).cubicTo(76.60968F, 19.219759F, 70.3637F, 14.106408F, 63.0F, 11.0F);
      ((Path)localObject).lineTo(63.0F, 11.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(32.0F, 84.0F);
      ((Path)localObject).lineTo(32.0F, 52.0F);
      ((Path)localObject).lineTo(14.0F, 69.37412F);
      ((Path)localObject).cubicTo(18.39201F, 75.77617F, 24.637726F, 80.88998F, 32.0F, 84.0F);
      ((Path)localObject).lineTo(32.0F, 84.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(56.0F, 8.82031F);
      ((Path)localObject).cubicTo(53.37215F, 8.282693F, 50.65258F, 8.0F, 47.867496F, 8.0F);
      ((Path)localObject).cubicTo(42.61948F, 8.0F, 37.60506F, 9.003309F, 33.0F, 10.826928F);
      ((Path)localObject).lineTo(56.0F, 34.0F);
      ((Path)localObject).lineTo(56.0F, 8.82031F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */