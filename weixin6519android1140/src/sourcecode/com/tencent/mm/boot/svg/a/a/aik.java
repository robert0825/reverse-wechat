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

public final class aik
  extends c
{
  private final int height;
  private final int width;
  
  public aik()
  {
    GMTrace.i(17574469304320L, 130940);
    this.width = 42;
    this.height = 42;
    GMTrace.o(17574469304320L, 130940);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17574603522048L, 130941);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17574603522048L, 130941);
      return 0;
      GMTrace.o(17574603522048L, 130941);
      return 42;
      GMTrace.o(17574603522048L, 130941);
      return 42;
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
      localPaint.setColor(-1973791);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(21.0F, 33.0F);
      ((Path)localObject).lineTo(9.244295F, 39.18034F);
      ((Path)localObject).lineTo(11.489435F, 26.09017F);
      ((Path)localObject).lineTo(1.9788697F, 16.81966F);
      ((Path)localObject).lineTo(15.122148F, 14.90983F);
      ((Path)localObject).lineTo(21.0F, 3.0F);
      ((Path)localObject).lineTo(26.877853F, 14.90983F);
      ((Path)localObject).lineTo(40.02113F, 16.81966F);
      ((Path)localObject).lineTo(30.510565F, 26.09017F);
      ((Path)localObject).lineTo(32.755707F, 39.18034F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */