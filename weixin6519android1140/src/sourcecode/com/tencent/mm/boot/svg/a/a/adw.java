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

public final class adw
  extends c
{
  private final int height;
  private final int width;
  
  public adw()
  {
    GMTrace.i(20326335381504L, 151443);
    this.width = 36;
    this.height = 36;
    GMTrace.o(20326335381504L, 151443);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20326469599232L, 151444);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20326469599232L, 151444);
      return 0;
      GMTrace.o(20326469599232L, 151444);
      return 36;
      GMTrace.o(20326469599232L, 151444);
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
      localPaint.setColor(-3833595);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(30.0F, 18.0F);
      ((Path)localObject).cubicTo(30.0F, 18.0F, 26.249992F, 20.250055F, 23.249962F, 23.249962F);
      ((Path)localObject).cubicTo(20.250055F, 26.249992F, 18.0F, 30.0F, 18.0F, 30.0F);
      ((Path)localObject).cubicTo(18.0F, 30.0F, 15.698808F, 26.198854F, 12.750039F, 23.249962F);
      ((Path)localObject).cubicTo(9.801146F, 20.301191F, 6.0F, 18.0F, 6.0F, 18.0F);
      ((Path)localObject).cubicTo(6.0F, 18.0F, 9.750008F, 15.749946F, 12.750039F, 12.750039F);
      ((Path)localObject).cubicTo(15.749946F, 9.750008F, 18.0F, 6.0F, 18.0F, 6.0F);
      ((Path)localObject).cubicTo(18.0F, 6.0F, 20.223738F, 9.723691F, 23.249962F, 12.750039F);
      ((Path)localObject).cubicTo(26.27631F, 15.776262F, 30.0F, 18.0F, 30.0F, 18.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\adw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */