package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class si
  extends c
{
  private final int height;
  private final int width;
  
  public si()
  {
    GMTrace.i(15743068405760L, 117295);
    this.width = 120;
    this.height = 80;
    GMTrace.o(15743068405760L, 117295);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15743202623488L, 117296);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15743202623488L, 117296);
      return 0;
      GMTrace.o(15743202623488L, 117296);
      return 120;
      GMTrace.o(15743202623488L, 117296);
      return 80;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 31.0F, 0.0F, 1.0F, 22.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(14.0F, 0.0F);
      ((Path)localObject2).lineTo(14.0F, 14.0F);
      ((Path)localObject2).lineTo(0.0F, 14.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(22.0F, 0.0F);
      ((Path)localObject2).lineTo(36.0F, 0.0F);
      ((Path)localObject2).lineTo(36.0F, 14.0F);
      ((Path)localObject2).lineTo(22.0F, 14.0F);
      ((Path)localObject2).lineTo(22.0F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(44.0F, 0.0F);
      ((Path)localObject2).lineTo(58.0F, 0.0F);
      ((Path)localObject2).lineTo(58.0F, 14.0F);
      ((Path)localObject2).lineTo(44.0F, 14.0F);
      ((Path)localObject2).lineTo(44.0F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(0.0F, 22.0F);
      ((Path)localObject2).lineTo(14.0F, 22.0F);
      ((Path)localObject2).lineTo(14.0F, 36.0F);
      ((Path)localObject2).lineTo(0.0F, 36.0F);
      ((Path)localObject2).lineTo(0.0F, 22.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(22.0F, 22.0F);
      ((Path)localObject2).lineTo(36.0F, 22.0F);
      ((Path)localObject2).lineTo(36.0F, 36.0F);
      ((Path)localObject2).lineTo(22.0F, 36.0F);
      ((Path)localObject2).lineTo(22.0F, 22.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(44.0F, 22.0F);
      ((Path)localObject2).lineTo(58.0F, 22.0F);
      ((Path)localObject2).lineTo(58.0F, 36.0F);
      ((Path)localObject2).lineTo(44.0F, 36.0F);
      ((Path)localObject2).lineTo(44.0F, 22.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\si.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */