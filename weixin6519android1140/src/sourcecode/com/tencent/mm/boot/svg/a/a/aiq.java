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

public final class aiq
  extends c
{
  private final int height;
  private final int width;
  
  public aiq()
  {
    GMTrace.i(16234171072512L, 120954);
    this.width = 144;
    this.height = 144;
    GMTrace.o(16234171072512L, 120954);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16234305290240L, 120955);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16234305290240L, 120955);
      return 0;
      GMTrace.o(16234305290240L, 120955);
      return 144;
      GMTrace.o(16234305290240L, 120955);
      return 144;
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
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(59.612698F, 75.461945F);
      ((Path)localObject).lineTo(95.98885F, 75.461945F);
      ((Path)localObject).lineTo(95.98885F, 69.461945F);
      ((Path)localObject).lineTo(59.357864F, 69.461945F);
      ((Path)localObject).lineTo(75.57716F, 53.24264F);
      ((Path)localObject).lineTo(71.334526F, 49.0F);
      ((Path)localObject).lineTo(48.0F, 72.334526F);
      ((Path)localObject).lineTo(50.12132F, 74.45584F);
      ((Path)localObject).lineTo(71.334526F, 95.669044F);
      ((Path)localObject).lineTo(75.57716F, 91.42641F);
      ((Path)localObject).lineTo(59.612698F, 75.461945F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aiq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */