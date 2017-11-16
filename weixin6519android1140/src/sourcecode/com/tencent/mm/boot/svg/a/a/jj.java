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

public final class jj
  extends c
{
  private final int height;
  private final int width;
  
  public jj()
  {
    GMTrace.i(15775817531392L, 117539);
    this.width = 32;
    this.height = 32;
    GMTrace.o(15775817531392L, 117539);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15775951749120L, 117540);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15775951749120L, 117540);
      return 0;
      GMTrace.o(15775951749120L, 117540);
      return 32;
      GMTrace.o(15775951749120L, 117540);
      return 32;
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
      localCanvas.saveLayerAlpha(null, 51, 4);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(12.320716F, 29.0F);
      ((Path)localObject).lineTo(9.3872795F, 25.98882F);
      ((Path)localObject).lineTo(19.132097F, 16.4053F);
      ((Path)localObject).lineTo(9.0F, 7.0749907F);
      ((Path)localObject).lineTo(12.127076F, 4.0F);
      ((Path)localObject).lineTo(25.0F, 16.531904F);
      ((Path)localObject).lineTo(12.320716F, 29.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\jj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */