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

public final class ai
  extends c
{
  private final int height;
  private final int width;
  
  public ai()
  {
    GMTrace.i(15789776175104L, 117643);
    this.width = 54;
    this.height = 54;
    GMTrace.o(15789776175104L, 117643);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15789910392832L, 117644);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15789910392832L, 117644);
      return 0;
      GMTrace.o(15789910392832L, 117644);
      return 54;
      GMTrace.o(15789910392832L, 117644);
      return 54;
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
      localPaint.setColor(-6710887);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(17.995556F, 0.0F);
      localPath.cubicTo(17.995556F, 5.998519F, 18.005554F, 11.997038F, 17.995556F, 17.995556F);
      localPath.cubicTo(11.997038F, 18.005554F, 5.998519F, 17.995556F, 0.0F, 17.995556F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localPath.moveTo(6.0044413F, 6.0F);
      localPath.cubicTo(6.0044413F, 7.99862F, 5.9944487F, 9.99724F, 6.0044413F, 11.9858675F);
      localPath.cubicTo(8.002961F, 11.995861F, 10.00148F, 12.005854F, 11.990007F, 11.995861F);
      localPath.cubicTo(12.0F, 9.99724F, 12.0F, 7.99862F, 12.0F, 6.0F);
      localPath.lineTo(6.0044413F, 6.0F);
      localPath.lineTo(6.0044413F, 6.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(24.0F, 0.0F);
      localPath.lineTo(36.0F, 0.0F);
      localPath.lineTo(36.0F, 6.0F);
      localPath.cubicTo(38.0F, 6.0F, 40.0F, 6.01F, 42.0F, 6.0F);
      localPath.lineTo(42.0F, 12.0F);
      localPath.lineTo(30.0F, 12.0F);
      localPath.lineTo(30.0F, 6.0F);
      localPath.cubicTo(28.0F, 6.0F, 26.0F, 6.0F, 24.0F, 5.99F);
      localPath.lineTo(24.0F, 0.0F);
      localPath.lineTo(24.0F, 0.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(42.0F, 0.0F);
      localPath.lineTo(54.0F, 0.0F);
      localPath.lineTo(54.0F, 24.0F);
      localPath.cubicTo(52.0F, 24.0F, 50.0F, 24.0F, 48.0F, 23.99F);
      localPath.lineTo(48.0F, 18.01F);
      localPath.cubicTo(46.0F, 18.0F, 44.0F, 18.0F, 42.0F, 18.0F);
      localPath.lineTo(42.0F, 12.0F);
      localPath.lineTo(48.0F, 12.0F);
      localPath.cubicTo(48.0F, 10.0F, 48.0F, 8.0F, 47.99F, 6.0F);
      localPath.cubicTo(46.0F, 6.0F, 44.0F, 5.99F, 42.0F, 6.0F);
      localPath.lineTo(42.0F, 0.0F);
      localPath.lineTo(42.0F, 0.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(24.0F, 12.0F);
      localPath.lineTo(30.0F, 12.0F);
      localPath.lineTo(30.0F, 18.0F);
      localPath.lineTo(24.01F, 18.0F);
      localPath.cubicTo(24.0F, 16.0F, 24.0F, 14.0F, 24.0F, 12.0F);
      localPath.lineTo(24.0F, 12.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(30.0F, 18.0F);
      localPath.lineTo(42.0F, 18.0F);
      localPath.lineTo(42.0F, 24.0F);
      localPath.cubicTo(40.0F, 24.0F, 38.0F, 24.0F, 36.0F, 24.01F);
      localPath.lineTo(36.0F, 30.0F);
      localPath.cubicTo(32.0F, 30.0F, 28.0F, 29.99F, 24.01F, 30.0F);
      localPath.cubicTo(24.0F, 32.0F, 24.0F, 34.0F, 24.0F, 36.0F);
      localPath.lineTo(12.0F, 36.0F);
      localPath.lineTo(12.0F, 30.0F);
      localPath.cubicTo(14.0F, 30.01F, 16.0F, 30.0F, 18.0F, 30.0F);
      localPath.cubicTo(18.0F, 28.0F, 18.0F, 26.0F, 18.01F, 24.0F);
      localPath.cubicTo(22.0F, 23.99F, 26.0F, 24.01F, 30.0F, 24.0F);
      localPath.lineTo(30.0F, 18.0F);
      localPath.lineTo(30.0F, 18.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 24.004442F);
      localPath.cubicTo(4.0F, 24.004442F, 8.0F, 23.994446F, 11.99F, 24.004442F);
      localPath.cubicTo(12.0F, 26.003702F, 12.0F, 28.002962F, 12.0F, 30.002222F);
      localPath.cubicTo(10.0F, 29.992226F, 8.0F, 30.002222F, 6.0F, 30.002222F);
      localPath.lineTo(6.0F, 36.0F);
      localPath.lineTo(0.0F, 36.0F);
      localPath.lineTo(0.0F, 24.004442F);
      localPath.lineTo(0.0F, 24.004442F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(36.0F, 30.0F);
      localPath.lineTo(42.0F, 30.0F);
      localPath.lineTo(42.0F, 36.0F);
      localPath.lineTo(36.0F, 36.0F);
      localPath.lineTo(36.0F, 30.0F);
      localPath.lineTo(36.0F, 30.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(48.0F, 30.0F);
      localPath.lineTo(54.0F, 30.0F);
      localPath.lineTo(54.0F, 42.0F);
      localPath.cubicTo(52.0F, 42.0F, 50.0F, 42.0F, 48.0F, 42.01F);
      localPath.cubicTo(48.0F, 44.0F, 48.0F, 46.0F, 48.01F, 48.0F);
      localPath.lineTo(54.0F, 48.0F);
      localPath.lineTo(54.0F, 54.0F);
      localPath.lineTo(42.0F, 54.0F);
      localPath.cubicTo(42.0F, 52.0F, 42.0F, 50.0F, 41.99F, 48.0F);
      localPath.lineTo(36.0F, 48.0F);
      localPath.lineTo(36.0F, 42.0F);
      localPath.cubicTo(38.0F, 42.0F, 40.0F, 42.0F, 42.0F, 41.99F);
      localPath.lineTo(42.0F, 36.0F);
      localPath.lineTo(47.99F, 36.0F);
      localPath.cubicTo(48.0F, 34.0F, 48.0F, 32.0F, 48.0F, 30.0F);
      localPath.lineTo(48.0F, 30.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(6.0F, 36.0F);
      localPath.lineTo(12.0F, 36.0F);
      localPath.lineTo(12.0F, 42.0F);
      localPath.lineTo(6.0F, 42.0F);
      localPath.lineTo(6.0F, 36.0F);
      localPath.lineTo(6.0F, 36.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(24.0F, 36.0F);
      localPath.lineTo(36.0F, 36.0F);
      localPath.lineTo(36.0F, 42.0F);
      localPath.lineTo(24.0F, 42.0F);
      localPath.lineTo(24.0F, 36.0F);
      localPath.lineTo(24.0F, 36.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 42.0F);
      localPath.lineTo(6.0F, 42.0F);
      localPath.lineTo(6.0F, 48.0F);
      localPath.cubicTo(10.0F, 48.01F, 14.0F, 48.0F, 18.0F, 48.0F);
      localPath.lineTo(18.0F, 54.0F);
      localPath.lineTo(0.0F, 54.0F);
      localPath.lineTo(0.0F, 42.0F);
      localPath.lineTo(0.0F, 42.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(18.0F, 42.0F);
      localPath.lineTo(24.0F, 42.0F);
      localPath.lineTo(24.0F, 48.0F);
      localPath.lineTo(18.0F, 48.0F);
      localPath.lineTo(18.0F, 42.0F);
      localPath.lineTo(18.0F, 42.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(24.0F, 48.0F);
      ((Path)localObject).lineTo(36.0F, 48.0F);
      ((Path)localObject).lineTo(36.0F, 54.0F);
      ((Path)localObject).lineTo(24.0F, 54.0F);
      ((Path)localObject).lineTo(24.0F, 48.0F);
      ((Path)localObject).lineTo(24.0F, 48.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */