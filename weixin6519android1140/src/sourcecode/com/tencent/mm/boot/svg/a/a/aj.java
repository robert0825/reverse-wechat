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

public final class aj
  extends c
{
  private final int height;
  private final int width;
  
  public aj()
  {
    GMTrace.i(15882117971968L, 118331);
    this.width = 54;
    this.height = 54;
    GMTrace.o(15882117971968L, 118331);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15882252189696L, 118332);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15882252189696L, 118332);
      return 0;
      GMTrace.o(15882252189696L, 118332);
      return 54;
      GMTrace.o(15882252189696L, 118332);
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
      localPaint.setColor(-9145228);
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
      localPath.moveTo(6.0F, 6.0F);
      localPath.lineTo(6.0F, 12.0F);
      localPath.lineTo(12.0F, 12.0F);
      localPath.lineTo(12.0F, 6.0F);
      localPath.lineTo(6.0F, 6.0F);
      localPath.lineTo(6.0F, 6.0F);
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
      localPath.lineTo(42.0F, 6.0F);
      localPath.lineTo(42.0F, 12.0F);
      localPath.lineTo(30.0F, 12.0F);
      localPath.lineTo(30.0F, 6.01F);
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
      localPath.lineTo(48.01F, 24.0F);
      localPath.cubicTo(48.0F, 22.0F, 48.0F, 20.0F, 47.99F, 18.0F);
      localPath.lineTo(42.0F, 18.0F);
      localPath.lineTo(42.0F, 12.0F);
      localPath.lineTo(48.0F, 12.0F);
      localPath.lineTo(48.0F, 6.0F);
      localPath.lineTo(42.0F, 6.0F);
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
      localPath.lineTo(24.0F, 18.0F);
      localPath.lineTo(24.0F, 12.0F);
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
      localPath.lineTo(36.0F, 24.0F);
      localPath.lineTo(36.0F, 30.0F);
      localPath.lineTo(24.0F, 30.0F);
      localPath.lineTo(24.0F, 36.0F);
      localPath.lineTo(12.0F, 36.0F);
      localPath.lineTo(12.0F, 30.0F);
      localPath.lineTo(18.0F, 30.0F);
      localPath.lineTo(18.0F, 24.0F);
      localPath.lineTo(30.0F, 24.0F);
      localPath.lineTo(30.0F, 18.0F);
      localPath.lineTo(30.0F, 18.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 24.0F);
      localPath.lineTo(12.0F, 24.0F);
      localPath.lineTo(12.0F, 30.0F);
      localPath.lineTo(6.0F, 30.0F);
      localPath.lineTo(6.0F, 36.0F);
      localPath.lineTo(0.0F, 36.0F);
      localPath.lineTo(0.0F, 24.0F);
      localPath.lineTo(0.0F, 24.0F);
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
      localPath.lineTo(48.0F, 42.0F);
      localPath.lineTo(48.0F, 48.0F);
      localPath.lineTo(54.0F, 48.0F);
      localPath.lineTo(54.0F, 54.0F);
      localPath.lineTo(42.0F, 54.0F);
      localPath.lineTo(42.0F, 48.0F);
      localPath.lineTo(36.0F, 48.0F);
      localPath.lineTo(36.0F, 42.0F);
      localPath.lineTo(42.0F, 42.0F);
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
      localPath.lineTo(18.0F, 48.0F);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */