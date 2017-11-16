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

public final class bi
  extends c
{
  private final int height;
  private final int width;
  
  public bi()
  {
    GMTrace.i(15854469120000L, 118125);
    this.width = 80;
    this.height = 80;
    GMTrace.o(15854469120000L, 118125);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15854603337728L, 118126);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15854603337728L, 118126);
      return 0;
      GMTrace.o(15854603337728L, 118126);
      return 80;
      GMTrace.o(15854603337728L, 118126);
      return 80;
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
      ((Path)localObject).moveTo(61.0F, 33.0F);
      ((Path)localObject).lineTo(61.0F, 64.0F);
      ((Path)localObject).lineTo(19.0F, 64.0F);
      ((Path)localObject).lineTo(19.0F, 17.0F);
      ((Path)localObject).lineTo(47.0F, 17.0F);
      ((Path)localObject).lineTo(47.0F, 33.0F);
      ((Path)localObject).lineTo(49.0F, 33.0F);
      ((Path)localObject).lineTo(61.0F, 33.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(60.989494F, 29.0F);
      ((Path)localObject).lineTo(51.0F, 18.140165F);
      ((Path)localObject).lineTo(51.0F, 29.0F);
      ((Path)localObject).lineTo(60.989494F, 29.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(63.0F, 68.0F);
      ((Path)localObject).lineTo(15.0F, 68.0F);
      ((Path)localObject).lineTo(15.0F, 66.0F);
      ((Path)localObject).lineTo(15.0F, 15.0F);
      ((Path)localObject).lineTo(15.0F, 13.0F);
      ((Path)localObject).lineTo(51.0F, 13.0F);
      ((Path)localObject).lineTo(51.0F, 13.028122F);
      ((Path)localObject).lineTo(65.04203F, 28.0F);
      ((Path)localObject).lineTo(65.0F, 28.010773F);
      ((Path)localObject).lineTo(65.0F, 68.0F);
      ((Path)localObject).lineTo(63.0F, 68.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */