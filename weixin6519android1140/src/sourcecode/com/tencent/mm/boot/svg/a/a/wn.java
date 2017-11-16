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

public final class wn
  extends c
{
  private final int height;
  private final int width;
  
  public wn()
  {
    GMTrace.i(15856348168192L, 118139);
    this.width = 120;
    this.height = 120;
    GMTrace.o(15856348168192L, 118139);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15856482385920L, 118140);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15856482385920L, 118140);
      return 0;
      GMTrace.o(15856482385920L, 118140);
      return 120;
      GMTrace.o(15856482385920L, 118140);
      return 120;
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
      localPaint.setColor(-855310);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(57.788662F, 79.0313F);
      ((Path)localObject).lineTo(59.890873F, 81.133514F);
      ((Path)localObject).lineTo(98.07464F, 42.94975F);
      ((Path)localObject).lineTo(93.870224F, 38.745327F);
      ((Path)localObject).lineTo(59.929096F, 72.686455F);
      ((Path)localObject).lineTo(25.242641F, 38.0F);
      ((Path)localObject).lineTo(21.0F, 42.24264F);
      ((Path)localObject).lineTo(57.788662F, 79.0313F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\wn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */