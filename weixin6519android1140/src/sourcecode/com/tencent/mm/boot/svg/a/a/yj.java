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

public final class yj
  extends c
{
  private final int height;
  private final int width;
  
  public yj()
  {
    GMTrace.i(15778770321408L, 117561);
    this.width = 120;
    this.height = 24;
    GMTrace.o(15778770321408L, 117561);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15778904539136L, 117562);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15778904539136L, 117562);
      return 0;
      GMTrace.o(15778904539136L, 117562);
      return 120;
      GMTrace.o(15778904539136L, 117562);
      return 24;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      Paint localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(60.0F, 24.0F);
      ((Path)localObject).cubicTo(66.62742F, 24.0F, 72.0F, 18.627417F, 72.0F, 12.0F);
      ((Path)localObject).cubicTo(72.0F, 5.372583F, 66.62742F, 0.0F, 60.0F, 0.0F);
      ((Path)localObject).cubicTo(53.37258F, 0.0F, 48.0F, 5.372583F, 48.0F, 12.0F);
      ((Path)localObject).cubicTo(48.0F, 18.627417F, 53.37258F, 24.0F, 60.0F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 24.0F);
      ((Path)localObject).cubicTo(18.627417F, 24.0F, 24.0F, 18.627417F, 24.0F, 12.0F);
      ((Path)localObject).cubicTo(24.0F, 5.372583F, 18.627417F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject).cubicTo(5.372583F, 0.0F, 0.0F, 5.372583F, 0.0F, 12.0F);
      ((Path)localObject).cubicTo(0.0F, 18.627417F, 5.372583F, 24.0F, 12.0F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(108.0F, 24.0F);
      ((Path)localObject).cubicTo(114.62742F, 24.0F, 120.0F, 18.627417F, 120.0F, 12.0F);
      ((Path)localObject).cubicTo(120.0F, 5.372583F, 114.62742F, 0.0F, 108.0F, 0.0F);
      ((Path)localObject).cubicTo(101.37258F, 0.0F, 96.0F, 5.372583F, 96.0F, 12.0F);
      ((Path)localObject).cubicTo(96.0F, 18.627417F, 101.37258F, 24.0F, 108.0F, 24.0F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 76, 4);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(12.0F, 0.0F);
      ((Path)localObject).cubicTo(18.627419F, 0.0F, 24.0F, 5.3725824F, 24.0F, 12.0F);
      ((Path)localObject).cubicTo(24.0F, 18.627419F, 18.627419F, 24.0F, 12.0F, 24.0F);
      ((Path)localObject).cubicTo(5.3725824F, 24.0F, 0.0F, 18.627419F, 0.0F, 12.0F);
      ((Path)localObject).cubicTo(0.0F, 5.3725824F, 5.3725824F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 153, 4);
      localCanvas.drawPath((Path)localObject, c.a(localPaint1, paramVarArgs));
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\yj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */