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

public final class om
  extends c
{
  private final int height;
  private final int width;
  
  public om()
  {
    GMTrace.i(15945468739584L, 118803);
    this.width = 24;
    this.height = 30;
    GMTrace.o(15945468739584L, 118803);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15945602957312L, 118804);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15945602957312L, 118804);
      return 0;
      GMTrace.o(15945602957312L, 118804);
      return 24;
      GMTrace.o(15945602957312L, 118804);
      return 30;
      Object localObject1 = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setColor(-16777216);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(22.0F, 14.999688F);
      ((Path)localObject2).lineTo(7.130435F, 29.999374F);
      ((Path)localObject2).lineTo(3.826087F, 26.666111F);
      ((Path)localObject2).lineTo(15.391304F, 14.999688F);
      ((Path)localObject2).lineTo(3.0F, 3.3332639F);
      ((Path)localObject2).lineTo(6.304348F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      ((Canvas)localObject1).saveLayerAlpha(null, 51, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      ((Canvas)localObject1).drawPath((Path)localObject2, localPaint);
      ((Canvas)localObject1).restore();
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(24.0F, 0.0F);
      ((Path)localObject1).lineTo(24.0F, 30.0F);
      ((Path)localObject1).lineTo(0.0F, 30.0F);
      ((Path)localObject1).lineTo(0.0F, 0.0F);
      ((Path)localObject1).close();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\om.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */