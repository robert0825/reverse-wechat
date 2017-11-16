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

public final class aeo
  extends c
{
  private final int height;
  private final int width;
  
  public aeo()
  {
    GMTrace.i(15784139030528L, 117601);
    this.width = 46;
    this.height = 36;
    GMTrace.o(15784139030528L, 117601);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15784273248256L, 117602);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15784273248256L, 117602);
      return 0;
      GMTrace.o(15784273248256L, 117602);
      return 46;
      GMTrace.o(15784273248256L, 117602);
      return 36;
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
      localPaint.setColor(-9205837);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(9.0F, 12.0F);
      localPath.lineTo(36.0F, 12.0F);
      localPath.lineTo(36.0F, 17.0F);
      localPath.lineTo(9.0F, 17.0F);
      localPath.lineTo(9.0F, 12.0F);
      localPath.lineTo(9.0F, 12.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 3.0074198F);
      ((Path)localObject).cubicTo(0.0F, 1.3464677F, 1.3517805F, 0.0F, 3.0004442F, 0.0F);
      ((Path)localObject).lineTo(42.999557F, 0.0F);
      ((Path)localObject).cubicTo(44.656654F, 0.0F, 46.0F, 1.3455393F, 46.0F, 3.0074198F);
      ((Path)localObject).lineTo(46.0F, 32.99258F);
      ((Path)localObject).cubicTo(46.0F, 34.653534F, 44.64822F, 36.0F, 42.999557F, 36.0F);
      ((Path)localObject).lineTo(3.0004442F, 36.0F);
      ((Path)localObject).cubicTo(1.3433446F, 36.0F, 0.0F, 34.65446F, 0.0F, 32.99258F);
      ((Path)localObject).lineTo(0.0F, 3.0074198F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(3.0666666F, 3.0F);
      ((Path)localObject).lineTo(43.0F, 3.0F);
      ((Path)localObject).lineTo(43.0F, 33.0F);
      ((Path)localObject).lineTo(3.0666666F, 33.0F);
      ((Path)localObject).lineTo(3.0666666F, 3.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(9.2F, 12.0F);
      ((Path)localObject).lineTo(37.0F, 12.0F);
      ((Path)localObject).lineTo(37.0F, 17.0F);
      ((Path)localObject).lineTo(9.2F, 17.0F);
      ((Path)localObject).lineTo(9.2F, 12.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aeo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */