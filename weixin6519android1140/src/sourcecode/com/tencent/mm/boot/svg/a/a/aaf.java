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

public final class aaf
  extends c
{
  private final int height;
  private final int width;
  
  public aaf()
  {
    GMTrace.i(15727499149312L, 117179);
    this.width = 9;
    this.height = 58;
    GMTrace.o(15727499149312L, 117179);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15727633367040L, 117180);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15727633367040L, 117180);
      return 0;
      GMTrace.o(15727633367040L, 117180);
      return 9;
      GMTrace.o(15727633367040L, 117180);
      return 58;
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
      localPaint.setColor(-3552823);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 3.0F);
      ((Path)localObject).lineTo(0.0F, 12.0F);
      ((Path)localObject).lineTo(9.0F, 12.0F);
      ((Path)localObject).lineTo(9.0F, 3.0F);
      ((Path)localObject).lineTo(0.0F, 3.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(0.0F, 24.0F);
      ((Path)localObject).lineTo(0.0F, 33.0F);
      ((Path)localObject).lineTo(9.0F, 33.0F);
      ((Path)localObject).lineTo(9.0F, 24.0F);
      ((Path)localObject).lineTo(0.0F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(0.0F, 45.0F);
      ((Path)localObject).lineTo(0.0F, 54.0F);
      ((Path)localObject).lineTo(9.0F, 54.0F);
      ((Path)localObject).lineTo(9.0F, 45.0F);
      ((Path)localObject).lineTo(0.0F, 45.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */