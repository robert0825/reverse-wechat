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

public final class amt
  extends c
{
  private final int height;
  private final int width;
  
  public amt()
  {
    GMTrace.i(20325261639680L, 151435);
    this.width = 102;
    this.height = 102;
    GMTrace.o(20325261639680L, 151435);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20325395857408L, 151436);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20325395857408L, 151436);
      return 0;
      GMTrace.o(20325395857408L, 151436);
      return 102;
      GMTrace.o(20325395857408L, 151436);
      return 102;
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
      ((Paint)localObject).setColor(-789517);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(102.0F, 0.0F);
      localPath.lineTo(102.0F, 102.0F);
      localPath.lineTo(0.0F, 102.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath(localPath, c.a((Paint)localObject, paramVarArgs));
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-12354608);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(50.655247F, 48.301735F);
      ((Path)localObject).lineTo(26.15658F, 30.9727F);
      ((Path)localObject).cubicTo(26.750633F, 30.543125F, 35.86884F, 24.124636F, 50.655247F, 23.766985F);
      ((Path)localObject).cubicTo(65.46684F, 24.124636F, 74.612946F, 30.543125F, 75.207F, 30.9727F);
      ((Path)localObject).lineTo(50.655247F, 48.301735F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(50.655247F, 76.95833F);
      ((Path)localObject).cubicTo(32.996593F, 65.54555F, 28.063675F, 44.621784F, 26.588911F, 34.82606F);
      ((Path)localObject).lineTo(50.655247F, 58.75586F);
      ((Path)localObject).lineTo(74.774666F, 34.82606F);
      ((Path)localObject).cubicTo(73.299904F, 44.621784F, 68.18205F, 65.54555F, 50.655247F, 76.95833F);
      ((Path)localObject).lineTo(50.655247F, 76.95833F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(80.50583F, 27.418613F);
      ((Path)localObject).cubicTo(78.234055F, 25.462376F, 67.93515F, 18.0F, 50.655247F, 18.0F);
      ((Path)localObject).cubicTo(33.36769F, 18.0F, 23.094215F, 25.462376F, 20.822441F, 27.418613F);
      ((Path)localObject).cubicTo(20.739235F, 27.489798F, 20.0F, 28.14746F, 20.0F, 28.14746F);
      ((Path)localObject).lineTo(20.033085F, 31.721006F);
      ((Path)localObject).cubicTo(20.03827F, 32.07693F, 20.300978F, 40.503387F, 23.987518F, 51.028694F);
      ((Path)localObject).cubicTo(28.894264F, 65.03814F, 37.481873F, 76.145F, 49.090115F, 83.07533F);
      ((Path)localObject).lineTo(50.655247F, 84.0F);
      ((Path)localObject).lineTo(52.24013F, 83.07533F);
      ((Path)localObject).cubicTo(63.848377F, 76.145F, 72.40265F, 65.03814F, 77.309395F, 51.028694F);
      ((Path)localObject).cubicTo(80.99594F, 40.503387F, 81.26309F, 32.07693F, 81.26827F, 31.721006F);
      ((Path)localObject).lineTo(81.310005F, 28.14746F);
      ((Path)localObject).cubicTo(81.310005F, 28.14746F, 80.58879F, 27.489798F, 80.50583F, 27.418613F);
      ((Path)localObject).lineTo(80.50583F, 27.418613F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\amt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */