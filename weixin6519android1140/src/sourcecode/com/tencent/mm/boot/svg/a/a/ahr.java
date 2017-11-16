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

public final class ahr
  extends c
{
  private final int height;
  private final int width;
  
  public ahr()
  {
    GMTrace.i(15922920161280L, 118635);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15922920161280L, 118635);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15923054379008L, 118636);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15923054379008L, 118636);
      return 0;
      GMTrace.o(15923054379008L, 118636);
      return 96;
      GMTrace.o(15923054379008L, 118636);
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
      localPaint.setColor(-1323621);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(35.150757F, 51.0F);
      ((Path)localObject).lineTo(71.0F, 51.0F);
      ((Path)localObject).lineTo(71.0F, 45.0F);
      ((Path)localObject).lineTo(35.819805F, 45.0F);
      ((Path)localObject).lineTo(51.577164F, 29.242641F);
      ((Path)localObject).lineTo(47.334522F, 25.0F);
      ((Path)localObject).lineTo(24.0F, 48.334522F);
      ((Path)localObject).lineTo(26.12132F, 50.455845F);
      ((Path)localObject).lineTo(47.334522F, 71.669044F);
      ((Path)localObject).lineTo(51.577164F, 67.42641F);
      ((Path)localObject).lineTo(35.150757F, 51.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ahr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */