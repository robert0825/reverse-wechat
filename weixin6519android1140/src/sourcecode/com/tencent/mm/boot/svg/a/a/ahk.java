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

public final class ahk
  extends c
{
  private final int height;
  private final int width;
  
  public ahk()
  {
    GMTrace.i(16007879983104L, 119268);
    this.width = 27;
    this.height = 27;
    GMTrace.o(16007879983104L, 119268);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16008014200832L, 119269);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16008014200832L, 119269);
      return 0;
      GMTrace.o(16008014200832L, 119269);
      return 27;
      GMTrace.o(16008014200832L, 119269);
      return 27;
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
      localCanvas.saveLayerAlpha(null, 76, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(15.84375F, 13.5F);
      ((Path)localObject).lineTo(26.0F, 3.34375F);
      ((Path)localObject).lineTo(23.65625F, 1.0F);
      ((Path)localObject).lineTo(13.5F, 11.15625F);
      ((Path)localObject).lineTo(3.34375F, 1.0F);
      ((Path)localObject).lineTo(1.0F, 3.34375F);
      ((Path)localObject).lineTo(11.15625F, 13.5F);
      ((Path)localObject).lineTo(1.0F, 23.65625F);
      ((Path)localObject).lineTo(3.34375F, 26.0F);
      ((Path)localObject).lineTo(13.5F, 15.84375F);
      ((Path)localObject).lineTo(23.65625F, 26.0F);
      ((Path)localObject).lineTo(26.0F, 23.65625F);
      ((Path)localObject).lineTo(15.84375F, 13.5F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ahk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */