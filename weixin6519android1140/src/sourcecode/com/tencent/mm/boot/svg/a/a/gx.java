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

public final class gx
  extends c
{
  private final int height;
  private final int width;
  
  public gx()
  {
    GMTrace.i(15834604896256L, 117977);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15834604896256L, 117977);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15834739113984L, 117978);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15834739113984L, 117978);
      return 0;
      GMTrace.o(15834739113984L, 117978);
      return 96;
      GMTrace.o(15834739113984L, 117978);
      return 96;
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
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(53.0F, 44.0F);
      ((Path)localObject).lineTo(81.0F, 44.0F);
      ((Path)localObject).lineTo(81.0F, 16.0F);
      ((Path)localObject).lineTo(53.0F, 16.0F);
      ((Path)localObject).lineTo(53.0F, 44.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(16.0F, 44.0F);
      ((Path)localObject).lineTo(44.0F, 44.0F);
      ((Path)localObject).lineTo(44.0F, 16.0F);
      ((Path)localObject).lineTo(16.0F, 16.0F);
      ((Path)localObject).lineTo(16.0F, 44.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(53.0F, 81.0F);
      ((Path)localObject).lineTo(81.0F, 81.0F);
      ((Path)localObject).lineTo(81.0F, 53.0F);
      ((Path)localObject).lineTo(53.0F, 53.0F);
      ((Path)localObject).lineTo(53.0F, 81.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(16.0F, 81.0F);
      ((Path)localObject).lineTo(44.0F, 81.0F);
      ((Path)localObject).lineTo(44.0F, 53.0F);
      ((Path)localObject).lineTo(16.0F, 53.0F);
      ((Path)localObject).lineTo(16.0F, 81.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */