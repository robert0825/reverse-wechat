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

public final class bo
  extends c
{
  private final int height;
  private final int width;
  
  public bo()
  {
    GMTrace.i(15940636901376L, 118767);
    this.width = 90;
    this.height = 90;
    GMTrace.o(15940636901376L, 118767);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15940771119104L, 118768);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15940771119104L, 118768);
      return 0;
      GMTrace.o(15940771119104L, 118768);
      return 90;
      GMTrace.o(15940771119104L, 118768);
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
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-13008703);
      localCanvas.save();
      localObject = c.a((Paint)localObject, paramVarArgs);
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
      ((Path)localObject).moveTo(29.596294F, 64.99123F);
      ((Path)localObject).lineTo(18.0F, 25.0F);
      ((Path)localObject).lineTo(24.626453F, 25.0F);
      ((Path)localObject).lineTo(30.700703F, 48.328217F);
      ((Path)localObject).lineTo(32.90952F, 56.65972F);
      ((Path)localObject).cubicTo(33.146145F, 56.24236F, 33.806232F, 53.49346F, 35.11834F, 48.328217F);
      ((Path)localObject).lineTo(41.19259F, 25.0F);
      ((Path)localObject).lineTo(47.819042F, 25.0F);
      ((Path)localObject).lineTo(53.341084F, 48.328217F);
      ((Path)localObject).lineTo(55.549904F, 56.10429F);
      ((Path)localObject).lineTo(57.75872F, 48.328217F);
      ((Path)localObject).lineTo(64.38518F, 25.0F);
      ((Path)localObject).lineTo(70.45943F, 25.0F);
      ((Path)localObject).lineTo(58.310925F, 64.99123F);
      ((Path)localObject).lineTo(51.68447F, 64.99123F);
      ((Path)localObject).lineTo(45.61022F, 41.10758F);
      ((Path)localObject).lineTo(43.95361F, 34.442375F);
      ((Path)localObject).lineTo(36.222748F, 64.99123F);
      ((Path)localObject).lineTo(29.596294F, 64.99123F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */