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

public final class bk
  extends c
{
  private final int height;
  private final int width;
  
  public bk()
  {
    GMTrace.i(15914330226688L, 118571);
    this.width = 481;
    this.height = 480;
    GMTrace.o(15914330226688L, 118571);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15914464444416L, 118572);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15914464444416L, 118572);
      return 0;
      GMTrace.o(15914464444416L, 118572);
      return 481;
      GMTrace.o(15914464444416L, 118572);
      return 480;
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
      ((Paint)localObject).setColor(-13917627);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(480.0F, 0.0F);
      localPath.lineTo(480.0F, 480.0F);
      localPath.lineTo(0.0F, 480.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(89.391014F, 121.6F);
      ((Path)localObject).cubicTo(87.73912F, 121.6F, 86.4F, 122.946335F, 86.4F, 124.594025F);
      ((Path)localObject).lineTo(86.4F, 355.40598F);
      ((Path)localObject).cubicTo(86.4F, 357.05954F, 87.73457F, 358.4F, 89.40565F, 358.4F);
      ((Path)localObject).lineTo(348.99435F, 358.4F);
      ((Path)localObject).cubicTo(350.65433F, 358.4F, 352.0F, 357.06567F, 352.0F, 355.39465F);
      ((Path)localObject).cubicTo(352.0F, 355.39465F, 351.99997F, 316.97693F, 352.0F, 295.25333F);
      ((Path)localObject).cubicTo(352.0F, 263.4904F, 393.6F, 241.3135F, 393.6F, 222.63467F);
      ((Path)localObject).cubicTo(393.6F, 204.11925F, 393.6F, 124.600876F, 393.6F, 124.600876F);
      ((Path)localObject).cubicTo(393.6F, 122.943535F, 392.26395F, 121.6F, 390.60898F, 121.6F);
      ((Path)localObject).lineTo(89.391014F, 121.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(102.4F, 137.6F);
      ((Path)localObject).lineTo(102.4F, 163.2F);
      ((Path)localObject).lineTo(137.6F, 163.2F);
      ((Path)localObject).lineTo(137.6F, 137.6F);
      ((Path)localObject).lineTo(102.4F, 137.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(198.4F, 137.6F);
      ((Path)localObject).lineTo(198.4F, 163.2F);
      ((Path)localObject).lineTo(233.6F, 163.2F);
      ((Path)localObject).lineTo(233.6F, 137.6F);
      ((Path)localObject).lineTo(198.4F, 137.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(150.4F, 137.6F);
      ((Path)localObject).lineTo(150.4F, 163.2F);
      ((Path)localObject).lineTo(185.6F, 163.2F);
      ((Path)localObject).lineTo(185.6F, 137.6F);
      ((Path)localObject).lineTo(150.4F, 137.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(294.4F, 137.6F);
      ((Path)localObject).lineTo(294.4F, 163.2F);
      ((Path)localObject).lineTo(329.6F, 163.2F);
      ((Path)localObject).lineTo(329.6F, 137.6F);
      ((Path)localObject).lineTo(294.4F, 137.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(246.4F, 137.6F);
      ((Path)localObject).lineTo(246.4F, 163.2F);
      ((Path)localObject).lineTo(281.6F, 163.2F);
      ((Path)localObject).lineTo(281.6F, 137.6F);
      ((Path)localObject).lineTo(246.4F, 137.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(342.4F, 137.6F);
      ((Path)localObject).lineTo(342.4F, 163.2F);
      ((Path)localObject).lineTo(377.6F, 163.2F);
      ((Path)localObject).lineTo(377.6F, 137.6F);
      ((Path)localObject).lineTo(342.4F, 137.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(102.4F, 316.8F);
      ((Path)localObject).lineTo(102.4F, 342.4F);
      ((Path)localObject).lineTo(137.6F, 342.4F);
      ((Path)localObject).lineTo(137.6F, 316.8F);
      ((Path)localObject).lineTo(102.4F, 316.8F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(198.4F, 316.8F);
      ((Path)localObject).lineTo(198.4F, 342.4F);
      ((Path)localObject).lineTo(233.6F, 342.4F);
      ((Path)localObject).lineTo(233.6F, 316.8F);
      ((Path)localObject).lineTo(198.4F, 316.8F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(150.4F, 316.8F);
      ((Path)localObject).lineTo(150.4F, 342.4F);
      ((Path)localObject).lineTo(185.6F, 342.4F);
      ((Path)localObject).lineTo(185.6F, 316.8F);
      ((Path)localObject).lineTo(150.4F, 316.8F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(294.4F, 316.8F);
      ((Path)localObject).lineTo(294.4F, 342.4F);
      ((Path)localObject).lineTo(329.6F, 342.4F);
      ((Path)localObject).lineTo(329.6F, 316.8F);
      ((Path)localObject).lineTo(294.4F, 316.8F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(246.4F, 316.8F);
      ((Path)localObject).lineTo(246.4F, 342.4F);
      ((Path)localObject).lineTo(281.6F, 342.4F);
      ((Path)localObject).lineTo(281.6F, 316.8F);
      ((Path)localObject).lineTo(246.4F, 316.8F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */