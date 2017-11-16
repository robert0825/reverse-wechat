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

public final class fi
  extends c
{
  private final int height;
  private final int width;
  
  public fi()
  {
    GMTrace.i(21028965187584L, 156678);
    this.width = 54;
    this.height = 54;
    GMTrace.o(21028965187584L, 156678);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21029099405312L, 156679);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21029099405312L, 156679);
      return 0;
      GMTrace.o(21029099405312L, 156679);
      return 54;
      GMTrace.o(21029099405312L, 156679);
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
      localObject = c.a((Paint)localObject, paramVarArgs);
      ((Paint)localObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject = c.a((Paint)localObject, paramVarArgs);
      ((Paint)localObject).setColor(-13290187);
      ((Paint)localObject).setStrokeWidth(4.0F);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(27.0F, 2.0F);
      localPath.cubicTo(40.80712F, 2.0F, 52.0F, 13.192881F, 52.0F, 27.0F);
      localPath.cubicTo(52.0F, 40.80712F, 40.80712F, 52.0F, 27.0F, 52.0F);
      localPath.cubicTo(13.192881F, 52.0F, 2.0F, 40.80712F, 2.0F, 27.0F);
      localPath.cubicTo(2.0F, 13.192881F, 13.192881F, 2.0F, 27.0F, 2.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-13290187);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(18.515137F, 20.405273F);
      ((Path)localObject).lineTo(22.760254F, 20.405273F);
      ((Path)localObject).cubicTo(22.944824F, 17.780273F, 24.77002F, 16.11914F, 27.600098F, 16.11914F);
      ((Path)localObject).cubicTo(30.409668F, 16.11914F, 32.234863F, 17.759766F, 32.234863F, 20.015625F);
      ((Path)localObject).cubicTo(32.234863F, 22.086914F, 31.353027F, 23.25586F, 28.871582F, 24.75293F);
      ((Path)localObject).cubicTo(26.062012F, 26.43457F, 24.811035F, 28.280273F, 24.913574F, 31.233398F);
      ((Path)localObject).lineTo(24.934082F, 32.791992F);
      ((Path)localObject).lineTo(29.1792F, 32.791992F);
      ((Path)localObject).lineTo(29.1792F, 31.561523F);
      ((Path)localObject).cubicTo(29.1792F, 29.490234F, 29.937988F, 28.40332F, 32.583496F, 26.844727F);
      ((Path)localObject).cubicTo(35.290527F, 25.22461F, 36.890137F, 22.989258F, 36.890137F, 19.831055F);
      ((Path)localObject).cubicTo(36.890137F, 15.380859F, 33.239746F, 12.161133F, 27.825684F, 12.161133F);
      ((Path)localObject).cubicTo(21.878418F, 12.161133F, 18.699707F, 15.688477F, 18.515137F, 20.405273F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.312988F, 42.47168F);
      ((Path)localObject).cubicTo(29.199707F, 42.47168F, 30.471191F, 41.220703F, 30.471191F, 39.354492F);
      ((Path)localObject).cubicTo(30.471191F, 37.447266F, 29.199707F, 36.19629F, 27.312988F, 36.19629F);
      ((Path)localObject).cubicTo(25.42627F, 36.19629F, 24.134277F, 37.447266F, 24.134277F, 39.354492F);
      ((Path)localObject).cubicTo(24.134277F, 41.220703F, 25.42627F, 42.47168F, 27.312988F, 42.47168F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */