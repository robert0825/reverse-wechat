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

public final class aew
  extends c
{
  private final int height;
  private final int width;
  
  public aew()
  {
    GMTrace.i(15777696579584L, 117553);
    this.width = 186;
    this.height = 186;
    GMTrace.o(15777696579584L, 117553);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15777830797312L, 117554);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15777830797312L, 117554);
      return 0;
      GMTrace.o(15777830797312L, 117554);
      return 186;
      GMTrace.o(15777830797312L, 117554);
      return 186;
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
      ((Paint)localObject).setColor(48640);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(186.0F, 94.14815F);
      localPath.cubicTo(186.0F, 41.636444F, 144.36356F, 0.0F, 91.85185F, 0.0F);
      localPath.cubicTo(41.636444F, 0.0F, 0.0F, 41.636444F, 0.0F, 94.14815F);
      localPath.cubicTo(0.0F, 144.36356F, 41.636444F, 186.0F, 91.85185F, 186.0F);
      localPath.cubicTo(144.36356F, 186.0F, 186.0F, 144.36356F, 186.0F, 94.14815F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(107.577896F, 70.84931F);
      ((Path)localObject).cubicTo(122.7227F, 70.84931F, 135.0F, 83.19187F, 135.0F, 98.42466F);
      ((Path)localObject).cubicTo(135.0F, 113.6541F, 122.72481F, 126.0F, 107.577896F, 126.0F);
      ((Path)localObject).lineTo(55.890526F, 126.0F);
      ((Path)localObject).cubicTo(55.3987F, 126.0F, 55.0F, 125.58803F, 55.0F, 125.10005F);
      ((Path)localObject).lineTo(55.0F, 117.85886F);
      ((Path)localObject).cubicTo(55.0F, 117.361824F, 55.39301F, 116.9589F, 55.890583F, 116.9589F);
      ((Path)localObject).lineTo(107.58115F, 116.9589F);
      ((Path)localObject).cubicTo(117.75454F, 116.9589F, 126.01124F, 108.660835F, 126.01124F, 98.42466F);
      ((Path)localObject).cubicTo(126.01124F, 88.186226F, 117.7598F, 79.89041F, 107.58115F, 79.89041F);
      ((Path)localObject).lineTo(75.55843F, 79.89041F);
      ((Path)localObject).lineTo(75.55843F, 89.56726F);
      ((Path)localObject).cubicTo(75.55843F, 90.5657F, 74.91493F, 90.89319F, 74.12114F, 90.29675F);
      ((Path)localObject).lineTo(55.596493F, 76.37788F);
      ((Path)localObject).cubicTo(54.799637F, 75.779144F, 54.8027F, 74.81443F, 55.596493F, 74.217995F);
      ((Path)localObject).lineTo(74.12114F, 60.299118F);
      ((Path)localObject).cubicTo(74.918F, 59.700382F, 75.55843F, 60.02929F, 75.55843F, 61.02861F);
      ((Path)localObject).lineTo(75.55843F, 70.84931F);
      ((Path)localObject).lineTo(107.577896F, 70.84931F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */