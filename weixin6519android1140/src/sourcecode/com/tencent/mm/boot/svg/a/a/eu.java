package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class eu
  extends c
{
  private final int height;
  private final int width;
  
  public eu()
  {
    GMTrace.i(15814740672512L, 117829);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15814740672512L, 117829);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15814874890240L, 117830);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15814874890240L, 117830);
      return 0;
      GMTrace.o(15814874890240L, 117830);
      return 96;
      GMTrace.o(15814874890240L, 117830);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-9473160);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 80.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(45.0513F, 58.846F);
      localPath.lineTo(48.5133F, 60.0F);
      localPath.lineTo(32.4863F, 60.0F);
      localPath.lineTo(35.9483F, 58.846F);
      localPath.lineTo(38.0003F, 58.162F);
      localPath.lineTo(38.0003F, 56.0F);
      localPath.lineTo(38.0003F, 52.0F);
      localPath.lineTo(43.0003F, 52.0F);
      localPath.lineTo(43.0003F, 56.0F);
      localPath.lineTo(43.0003F, 58.162F);
      localPath.lineTo(45.0513F, 58.846F);
      localPath.close();
      localPath.moveTo(35.0003F, 49.0F);
      localPath.lineTo(3.0003F, 49.0F);
      localPath.lineTo(3.0003F, 3.0F);
      localPath.lineTo(77.0003F, 3.0F);
      localPath.lineTo(77.0003F, 18.0F);
      localPath.lineTo(80.0003F, 18.0F);
      localPath.lineTo(80.0003F, 2.87F);
      localPath.cubicTo(80.0003F, 1.285F, 78.7143F, 0.0F, 77.1293F, 0.0F);
      localPath.lineTo(2.8713F, 0.0F);
      localPath.cubicTo(1.2893F, 0.0F, 3.0E-4F, 1.285F, 3.0E-4F, 2.87F);
      localPath.lineTo(3.0E-4F, 49.13F);
      localPath.cubicTo(3.0E-4F, 50.715F, 1.2853F, 52.0F, 2.8713F, 52.0F);
      localPath.lineTo(35.0003F, 52.0F);
      localPath.lineTo(35.0003F, 56.0F);
      localPath.lineTo(23.0003F, 60.0F);
      localPath.lineTo(23.0003F, 63.0F);
      localPath.lineTo(58.0003F, 63.0F);
      localPath.lineTo(58.0003F, 60.0F);
      localPath.lineTo(46.0003F, 56.0F);
      localPath.lineTo(46.0003F, 52.0F);
      localPath.lineTo(61.5F, 52.0F);
      localPath.lineTo(61.5F, 49.0F);
      localPath.lineTo(46.0003F, 49.0F);
      localPath.lineTo(35.0003F, 49.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(3.0F, 59.028194F);
      ((Path)localObject).lineTo(3.0F, 24.971806F);
      ((Path)localObject).cubicTo(3.0F, 24.435892F, 3.40374F, 24.0F, 3.9F, 24.0F);
      ((Path)localObject).lineTo(20.1F, 24.0F);
      ((Path)localObject).cubicTo(20.59626F, 24.0F, 21.0F, 24.435892F, 21.0F, 24.971806F);
      ((Path)localObject).lineTo(21.0F, 59.028194F);
      ((Path)localObject).cubicTo(21.0F, 59.56411F, 20.59626F, 60.0F, 20.1F, 60.0F);
      ((Path)localObject).lineTo(3.9F, 60.0F);
      ((Path)localObject).cubicTo(3.40374F, 60.0F, 3.0F, 59.56411F, 3.0F, 59.028194F);
      ((Path)localObject).lineTo(3.0F, 59.028194F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(22.188679F, 63.0F);
      ((Path)localObject).cubicTo(23.188982F, 63.0F, 24.0F, 62.212334F, 24.0F, 61.242157F);
      ((Path)localObject).lineTo(24.0F, 22.757843F);
      ((Path)localObject).cubicTo(24.0F, 21.787004F, 23.187622F, 21.0F, 22.188679F, 21.0F);
      ((Path)localObject).lineTo(1.8113208F, 21.0F);
      ((Path)localObject).cubicTo(0.8110189F, 21.0F, 0.0F, 21.787664F, 0.0F, 22.757843F);
      ((Path)localObject).lineTo(0.0F, 61.242157F);
      ((Path)localObject).cubicTo(0.0F, 62.212994F, 0.81237733F, 63.0F, 1.8113208F, 63.0F);
      ((Path)localObject).lineTo(22.188679F, 63.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\eu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */