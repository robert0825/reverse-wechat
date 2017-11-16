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

public final class acx
  extends c
{
  private final int height;
  private final int width;
  
  public acx()
  {
    GMTrace.i(15713272070144L, 117073);
    this.width = 240;
    this.height = 240;
    GMTrace.o(15713272070144L, 117073);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15713406287872L, 117074);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15713406287872L, 117074);
      return 0;
      GMTrace.o(15713406287872L, 117074);
      return 240;
      GMTrace.o(15713406287872L, 117074);
      return 240;
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
      localCanvas.saveLayerAlpha(null, 192, 4);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 92.0F, 0.0F, 1.0F, 95.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(44.0F, 4.0F);
      ((Path)localObject2).lineTo(57.0F, 4.0F);
      ((Path)localObject2).lineTo(57.0F, 9.0F);
      ((Path)localObject2).lineTo(44.0F, 9.0F);
      ((Path)localObject2).lineTo(44.0F, 14.0F);
      ((Path)localObject2).lineTo(39.0F, 14.0F);
      ((Path)localObject2).lineTo(39.0F, 0.0F);
      ((Path)localObject2).lineTo(44.0F, 0.0F);
      ((Path)localObject2).lineTo(44.0F, 4.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(0.0F, 4.0F);
      ((Path)localObject2).lineTo(36.0F, 4.0F);
      ((Path)localObject2).lineTo(36.0F, 9.0F);
      ((Path)localObject2).lineTo(0.0F, 9.0F);
      ((Path)localObject2).lineTo(0.0F, 4.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(22.0F, 24.0F);
      ((Path)localObject2).lineTo(57.0F, 24.0F);
      ((Path)localObject2).lineTo(57.0F, 29.0F);
      ((Path)localObject2).lineTo(22.0F, 29.0F);
      ((Path)localObject2).lineTo(22.0F, 32.0F);
      ((Path)localObject2).lineTo(17.0F, 32.0F);
      ((Path)localObject2).lineTo(17.0F, 21.0F);
      ((Path)localObject2).lineTo(22.0F, 21.0F);
      ((Path)localObject2).lineTo(22.0F, 24.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(0.0F, 24.0F);
      ((Path)localObject2).lineTo(14.0F, 24.0F);
      ((Path)localObject2).lineTo(14.0F, 29.0F);
      ((Path)localObject2).lineTo(0.0F, 29.0F);
      ((Path)localObject2).lineTo(0.0F, 24.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(44.0F, 43.0F);
      ((Path)localObject1).lineTo(57.0F, 43.0F);
      ((Path)localObject1).lineTo(57.0F, 48.0F);
      ((Path)localObject1).lineTo(44.0F, 48.0F);
      ((Path)localObject1).lineTo(44.0F, 51.0F);
      ((Path)localObject1).lineTo(40.0F, 51.0F);
      ((Path)localObject1).lineTo(40.0F, 40.0F);
      ((Path)localObject1).lineTo(44.0F, 40.0F);
      ((Path)localObject1).lineTo(44.0F, 43.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.0F, 43.0F);
      ((Path)localObject1).lineTo(36.0F, 43.0F);
      ((Path)localObject1).lineTo(36.0F, 48.0F);
      ((Path)localObject1).lineTo(0.0F, 48.0F);
      ((Path)localObject1).lineTo(0.0F, 43.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\acx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */