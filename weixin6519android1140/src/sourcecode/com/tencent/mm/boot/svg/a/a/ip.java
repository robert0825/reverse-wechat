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

public final class ip
  extends c
{
  private final int height;
  private final int width;
  
  public ip()
  {
    GMTrace.i(15769106644992L, 117489);
    this.width = 63;
    this.height = 48;
    GMTrace.o(15769106644992L, 117489);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15769240862720L, 117490);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15769240862720L, 117490);
      return 0;
      GMTrace.o(15769240862720L, 117490);
      return 63;
      GMTrace.o(15769240862720L, 117490);
      return 48;
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
      localPaint.setColor(-5066062);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(2.0F, 0.0F);
      ((Path)localObject).lineTo(61.0F, 0.0F);
      ((Path)localObject).cubicTo(61.11F, 1.2F, 61.67F, 1.83F, 63.0F, 2.0F);
      ((Path)localObject).lineTo(63.0F, 46.0F);
      ((Path)localObject).cubicTo(61.8F, 46.1F, 61.18F, 46.66F, 61.0F, 48.0F);
      ((Path)localObject).lineTo(2.0F, 48.0F);
      ((Path)localObject).cubicTo(1.89F, 46.8F, 1.34F, 46.17F, 0.0F, 46.0F);
      ((Path)localObject).lineTo(0.0F, 2.0F);
      ((Path)localObject).cubicTo(1.2F, 1.9F, 1.82F, 1.34F, 2.0F, 0.0F);
      ((Path)localObject).lineTo(2.0F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(6.0F, 6.0F);
      ((Path)localObject).cubicTo(6.009992F, 14.688017F, 6.0399685F, 23.386019F, 6.0F, 32.0F);
      ((Path)localObject).cubicTo(9.807014F, 26.681475F, 14.5433F, 21.658401F, 20.0F, 19.0F);
      ((Path)localObject).cubicTo(23.536245F, 16.894972F, 26.683777F, 19.161846F, 29.0F, 21.0F);
      ((Path)localObject).cubicTo(33.98805F, 25.31336F, 38.404583F, 30.196625F, 43.0F, 35.0F);
      ((Path)localObject).cubicTo(41.642044F, 32.88292F, 40.32308F, 30.815771F, 39.0F, 29.0F);
      ((Path)localObject).cubicTo(41.272335F, 26.441805F, 43.51058F, 23.286158F, 47.0F, 23.0F);
      ((Path)localObject).cubicTo(51.614223F, 24.234848F, 54.332092F, 28.59883F, 57.0F, 32.0F);
      ((Path)localObject).cubicTo(56.96003F, 23.425964F, 56.99001F, 14.707989F, 57.0F, 6.0F);
      ((Path)localObject).lineTo(6.0F, 6.0F);
      ((Path)localObject).lineTo(6.0F, 6.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */