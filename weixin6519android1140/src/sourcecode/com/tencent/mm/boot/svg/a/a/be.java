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

public final class be
  extends c
{
  private final int height;
  private final int width;
  
  public be()
  {
    GMTrace.i(15916477710336L, 118587);
    this.width = 90;
    this.height = 90;
    GMTrace.o(15916477710336L, 118587);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15916611928064L, 118588);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15916611928064L, 118588);
      return 0;
      GMTrace.o(15916611928064L, 118588);
      return 90;
      GMTrace.o(15916611928064L, 118588);
      return 90;
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
      ((Paint)localObject).setColor(-7645398);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 4.0F);
      localPath.cubicTo(0.0F, 1.7908609F, 1.7908609F, 0.0F, 4.0F, 0.0F);
      localPath.lineTo(86.0F, 0.0F);
      localPath.cubicTo(88.20914F, 0.0F, 90.0F, 1.7908609F, 90.0F, 4.0F);
      localPath.lineTo(90.0F, 86.0F);
      localPath.cubicTo(90.0F, 88.20914F, 88.20914F, 90.0F, 86.0F, 90.0F);
      localPath.lineTo(4.0F, 90.0F);
      localPath.cubicTo(1.7908609F, 90.0F, 0.0F, 88.20914F, 0.0F, 86.0F);
      localPath.lineTo(0.0F, 4.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(27.00527F, 18.0F);
      ((Path)localObject).cubicTo(25.897789F, 18.0F, 25.0F, 18.895992F, 25.0F, 19.99926F);
      ((Path)localObject).lineTo(25.0F, 67.00074F);
      ((Path)localObject).cubicTo(25.0F, 68.104904F, 25.894474F, 69.0F, 27.00527F, 69.0F);
      ((Path)localObject).lineTo(63.99473F, 69.0F);
      ((Path)localObject).cubicTo(65.10221F, 69.0F, 66.0F, 68.104004F, 66.0F, 67.00074F);
      ((Path)localObject).lineTo(66.0F, 19.99926F);
      ((Path)localObject).cubicTo(66.0F, 18.8951F, 65.10553F, 18.0F, 63.99473F, 18.0F);
      ((Path)localObject).lineTo(27.00527F, 18.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(29.0F, 22.0F);
      ((Path)localObject).lineTo(29.0F, 65.0F);
      ((Path)localObject).lineTo(62.0F, 65.0F);
      ((Path)localObject).lineTo(62.0F, 22.0F);
      ((Path)localObject).lineTo(29.0F, 22.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(45.0F, 22.0F);
      ((Path)localObject).lineTo(45.0F, 26.0F);
      ((Path)localObject).lineTo(50.0F, 26.0F);
      ((Path)localObject).lineTo(50.0F, 22.0F);
      ((Path)localObject).lineTo(45.0F, 22.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(40.0F, 26.0F);
      ((Path)localObject).lineTo(40.0F, 30.0F);
      ((Path)localObject).lineTo(45.0F, 30.0F);
      ((Path)localObject).lineTo(45.0F, 26.0F);
      ((Path)localObject).lineTo(40.0F, 26.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(45.0F, 30.0F);
      ((Path)localObject).lineTo(45.0F, 34.0F);
      ((Path)localObject).lineTo(50.0F, 34.0F);
      ((Path)localObject).lineTo(50.0F, 30.0F);
      ((Path)localObject).lineTo(45.0F, 30.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(40.0F, 34.0F);
      ((Path)localObject).lineTo(40.0F, 38.0F);
      ((Path)localObject).lineTo(45.0F, 38.0F);
      ((Path)localObject).lineTo(45.0F, 34.0F);
      ((Path)localObject).lineTo(40.0F, 34.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(45.0F, 38.0F);
      ((Path)localObject).lineTo(45.0F, 42.0F);
      ((Path)localObject).lineTo(50.0F, 42.0F);
      ((Path)localObject).lineTo(50.0F, 38.0F);
      ((Path)localObject).lineTo(45.0F, 38.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(40.0F, 42.0F);
      ((Path)localObject).lineTo(40.0F, 46.0F);
      ((Path)localObject).lineTo(45.0F, 46.0F);
      ((Path)localObject).lineTo(45.0F, 42.0F);
      ((Path)localObject).lineTo(40.0F, 42.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(45.0F, 46.0F);
      ((Path)localObject).lineTo(45.0F, 54.0F);
      ((Path)localObject).lineTo(50.0F, 54.0F);
      ((Path)localObject).lineTo(50.0F, 46.0F);
      ((Path)localObject).lineTo(45.0F, 46.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(40.0F, 50.0F);
      ((Path)localObject).lineTo(40.0F, 54.0F);
      ((Path)localObject).lineTo(45.0F, 54.0F);
      ((Path)localObject).lineTo(45.0F, 50.0F);
      ((Path)localObject).lineTo(40.0F, 50.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */