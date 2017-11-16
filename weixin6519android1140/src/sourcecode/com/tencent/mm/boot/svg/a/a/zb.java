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

public final class zb
  extends c
{
  private final int height;
  private final int width;
  
  public zb()
  {
    GMTrace.i(15827088703488L, 117921);
    this.width = 107;
    this.height = 107;
    GMTrace.o(15827088703488L, 117921);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15827222921216L, 117922);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15827222921216L, 117922);
      return 0;
      GMTrace.o(15827222921216L, 117922);
      return 107;
      GMTrace.o(15827222921216L, 117922);
      return 107;
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
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(33.506958F, 86.825905F);
      ((Path)localObject).cubicTo(32.122402F, 87.74495F, 31.0F, 87.15455F, 31.0F, 85.48306F);
      ((Path)localObject).lineTo(31.0F, 21.517584F);
      ((Path)localObject).cubicTo(31.0F, 19.856905F, 32.125355F, 19.257656F, 33.506958F, 20.174744F);
      ((Path)localObject).lineTo(81.20527F, 51.83624F);
      ((Path)localObject).cubicTo(82.58983F, 52.755287F, 82.586876F, 54.24732F, 81.20527F, 55.16441F);
      ((Path)localObject).lineTo(33.506958F, 86.825905F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */