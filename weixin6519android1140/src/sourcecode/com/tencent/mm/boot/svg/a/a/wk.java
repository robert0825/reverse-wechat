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

public final class wk
  extends c
{
  private final int height;
  private final int width;
  
  public wk()
  {
    GMTrace.i(15726156972032L, 117169);
    this.width = 40;
    this.height = 56;
    GMTrace.o(15726156972032L, 117169);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15726291189760L, 117170);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15726291189760L, 117170);
      return 0;
      GMTrace.o(15726291189760L, 117170);
      return 40;
      GMTrace.o(15726291189760L, 117170);
      return 56;
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
      localPaint.setColor(-7105645);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(40.0F, 0.0F);
      ((Path)localObject).lineTo(40.0F, 0.0F);
      ((Path)localObject).lineTo(40.0F, 56.0F);
      ((Path)localObject).lineTo(40.0F, 56.0F);
      ((Path)localObject).cubicTo(28.04299F, 47.66F, 16.135965F, 39.26F, 4.0F, 31.0F);
      ((Path)localObject).cubicTo(2.9492626F, 29.86F, 1.6795801F, 28.79F, 0.0F, 29.0F);
      ((Path)localObject).lineTo(0.0F, 27.0F);
      ((Path)localObject).cubicTo(0.179955F, 27.41F, 0.52986753F, 27.41F, 1.0F, 27.0F);
      ((Path)localObject).cubicTo(13.886528F, 18.41F, 26.88328F, 9.13F, 40.0F, 0.0F);
      ((Path)localObject).lineTo(40.0F, 0.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\wk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */