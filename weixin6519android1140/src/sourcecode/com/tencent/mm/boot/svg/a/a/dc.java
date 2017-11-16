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

public final class dc
  extends c
{
  private final int height;
  private final int width;
  
  public dc()
  {
    GMTrace.i(17572053385216L, 130922);
    this.width = 144;
    this.height = 144;
    GMTrace.o(17572053385216L, 130922);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17572187602944L, 130923);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17572187602944L, 130923);
      return 0;
      GMTrace.o(17572187602944L, 130923);
      return 144;
      GMTrace.o(17572187602944L, 130923);
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
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-2565928);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(144.0F, 0.0F);
      localPath.lineTo(144.0F, 144.0F);
      localPath.lineTo(0.0F, 144.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath(localPath, c.a((Paint)localObject, paramVarArgs));
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(72.0F, 102.0F);
      ((Path)localObject).cubicTo(55.431458F, 102.0F, 42.0F, 88.56854F, 42.0F, 72.0F);
      ((Path)localObject).cubicTo(42.0F, 55.431458F, 55.431458F, 42.0F, 72.0F, 42.0F);
      ((Path)localObject).cubicTo(88.56854F, 42.0F, 102.0F, 55.431458F, 102.0F, 72.0F);
      ((Path)localObject).cubicTo(102.0F, 88.56854F, 88.56854F, 102.0F, 72.0F, 102.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(72.0F, 96.0F);
      ((Path)localObject).cubicTo(85.25484F, 96.0F, 96.0F, 85.25484F, 96.0F, 72.0F);
      ((Path)localObject).cubicTo(96.0F, 58.745167F, 85.25484F, 48.0F, 72.0F, 48.0F);
      ((Path)localObject).cubicTo(72.0F, 64.35864F, 72.0F, 82.30664F, 72.0F, 96.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(3.0F, 69.0F);
      ((Path)localObject).lineTo(30.0F, 69.0F);
      ((Path)localObject).lineTo(30.0F, 75.0F);
      ((Path)localObject).lineTo(3.0F, 75.0F);
      ((Path)localObject).lineTo(3.0F, 69.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(69.0F, 3.0F);
      ((Path)localObject).lineTo(75.0F, 3.0F);
      ((Path)localObject).lineTo(75.0F, 30.0F);
      ((Path)localObject).lineTo(69.0F, 30.0F);
      ((Path)localObject).lineTo(69.0F, 3.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(69.0F, 114.0F);
      ((Path)localObject).lineTo(75.0F, 114.0F);
      ((Path)localObject).lineTo(75.0F, 141.0F);
      ((Path)localObject).lineTo(69.0F, 141.0F);
      ((Path)localObject).lineTo(69.0F, 114.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(114.0F, 69.0F);
      ((Path)localObject).lineTo(141.0F, 69.0F);
      ((Path)localObject).lineTo(141.0F, 75.0F);
      ((Path)localObject).lineTo(114.0F, 75.0F);
      ((Path)localObject).lineTo(114.0F, 69.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(25.330952F, 21.088312F);
      ((Path)localObject).lineTo(44.422836F, 40.180195F);
      ((Path)localObject).lineTo(40.180195F, 44.422836F);
      ((Path)localObject).lineTo(21.088312F, 25.330952F);
      ((Path)localObject).lineTo(25.330952F, 21.088312F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(118.669044F, 21.088312F);
      ((Path)localObject).lineTo(122.91169F, 25.330952F);
      ((Path)localObject).lineTo(103.8198F, 44.422836F);
      ((Path)localObject).lineTo(99.57716F, 40.180195F);
      ((Path)localObject).lineTo(118.669044F, 21.088312F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(40.180195F, 99.57716F);
      ((Path)localObject).lineTo(44.422836F, 103.8198F);
      ((Path)localObject).lineTo(25.330952F, 122.91169F);
      ((Path)localObject).lineTo(21.088312F, 118.669044F);
      ((Path)localObject).lineTo(40.180195F, 99.57716F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(103.8198F, 99.57716F);
      ((Path)localObject).lineTo(122.91169F, 118.669044F);
      ((Path)localObject).lineTo(118.669044F, 122.91169F);
      ((Path)localObject).lineTo(99.57716F, 103.8198F);
      ((Path)localObject).lineTo(103.8198F, 99.57716F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */