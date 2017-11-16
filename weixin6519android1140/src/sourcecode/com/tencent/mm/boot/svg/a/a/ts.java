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

public final class ts
  extends c
{
  private final int height;
  private final int width;
  
  public ts()
  {
    GMTrace.i(15783870595072L, 117599);
    this.width = 75;
    this.height = 75;
    GMTrace.o(15783870595072L, 117599);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15784004812800L, 117600);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15784004812800L, 117600);
      return 0;
      GMTrace.o(15784004812800L, 117600);
      return 75;
      GMTrace.o(15784004812800L, 117600);
      return 75;
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
      localPaint.setColor(-15028967);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(37.5F, 45.0F);
      ((Path)localObject).cubicTo(41.642136F, 45.0F, 45.0F, 41.642136F, 45.0F, 37.5F);
      ((Path)localObject).cubicTo(45.0F, 33.357864F, 41.642136F, 30.0F, 37.5F, 30.0F);
      ((Path)localObject).cubicTo(33.357864F, 30.0F, 30.0F, 33.357864F, 30.0F, 37.5F);
      ((Path)localObject).cubicTo(30.0F, 41.642136F, 33.357864F, 45.0F, 37.5F, 45.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(64.5F, 45.0F);
      ((Path)localObject).cubicTo(68.642136F, 45.0F, 72.0F, 41.642136F, 72.0F, 37.5F);
      ((Path)localObject).cubicTo(72.0F, 33.357864F, 68.642136F, 30.0F, 64.5F, 30.0F);
      ((Path)localObject).cubicTo(60.357864F, 30.0F, 57.0F, 33.357864F, 57.0F, 37.5F);
      ((Path)localObject).cubicTo(57.0F, 41.642136F, 60.357864F, 45.0F, 64.5F, 45.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(10.5F, 45.0F);
      ((Path)localObject).cubicTo(14.642136F, 45.0F, 18.0F, 41.642136F, 18.0F, 37.5F);
      ((Path)localObject).cubicTo(18.0F, 33.357864F, 14.642136F, 30.0F, 10.5F, 30.0F);
      ((Path)localObject).cubicTo(6.3578644F, 30.0F, 3.0F, 33.357864F, 3.0F, 37.5F);
      ((Path)localObject).cubicTo(3.0F, 41.642136F, 6.3578644F, 45.0F, 10.5F, 45.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(37.5F, 72.0F);
      ((Path)localObject).cubicTo(41.642136F, 72.0F, 45.0F, 68.642136F, 45.0F, 64.5F);
      ((Path)localObject).cubicTo(45.0F, 60.357864F, 41.642136F, 57.0F, 37.5F, 57.0F);
      ((Path)localObject).cubicTo(33.357864F, 57.0F, 30.0F, 60.357864F, 30.0F, 64.5F);
      ((Path)localObject).cubicTo(30.0F, 68.642136F, 33.357864F, 72.0F, 37.5F, 72.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(64.5F, 72.0F);
      ((Path)localObject).cubicTo(68.642136F, 72.0F, 72.0F, 68.642136F, 72.0F, 64.5F);
      ((Path)localObject).cubicTo(72.0F, 60.357864F, 68.642136F, 57.0F, 64.5F, 57.0F);
      ((Path)localObject).cubicTo(60.357864F, 57.0F, 57.0F, 60.357864F, 57.0F, 64.5F);
      ((Path)localObject).cubicTo(57.0F, 68.642136F, 60.357864F, 72.0F, 64.5F, 72.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(10.5F, 72.0F);
      ((Path)localObject).cubicTo(14.642136F, 72.0F, 18.0F, 68.642136F, 18.0F, 64.5F);
      ((Path)localObject).cubicTo(18.0F, 60.357864F, 14.642136F, 57.0F, 10.5F, 57.0F);
      ((Path)localObject).cubicTo(6.3578644F, 57.0F, 3.0F, 60.357864F, 3.0F, 64.5F);
      ((Path)localObject).cubicTo(3.0F, 68.642136F, 6.3578644F, 72.0F, 10.5F, 72.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(37.5F, 18.0F);
      ((Path)localObject).cubicTo(41.642136F, 18.0F, 45.0F, 14.642136F, 45.0F, 10.5F);
      ((Path)localObject).cubicTo(45.0F, 6.3578644F, 41.642136F, 3.0F, 37.5F, 3.0F);
      ((Path)localObject).cubicTo(33.357864F, 3.0F, 30.0F, 6.3578644F, 30.0F, 10.5F);
      ((Path)localObject).cubicTo(30.0F, 14.642136F, 33.357864F, 18.0F, 37.5F, 18.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(64.5F, 18.0F);
      ((Path)localObject).cubicTo(68.642136F, 18.0F, 72.0F, 14.642136F, 72.0F, 10.5F);
      ((Path)localObject).cubicTo(72.0F, 6.3578644F, 68.642136F, 3.0F, 64.5F, 3.0F);
      ((Path)localObject).cubicTo(60.357864F, 3.0F, 57.0F, 6.3578644F, 57.0F, 10.5F);
      ((Path)localObject).cubicTo(57.0F, 14.642136F, 60.357864F, 18.0F, 64.5F, 18.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(10.5F, 18.0F);
      ((Path)localObject).cubicTo(14.642136F, 18.0F, 18.0F, 14.642136F, 18.0F, 10.5F);
      ((Path)localObject).cubicTo(18.0F, 6.3578644F, 14.642136F, 3.0F, 10.5F, 3.0F);
      ((Path)localObject).cubicTo(6.3578644F, 3.0F, 3.0F, 6.3578644F, 3.0F, 10.5F);
      ((Path)localObject).cubicTo(3.0F, 14.642136F, 6.3578644F, 18.0F, 10.5F, 18.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */