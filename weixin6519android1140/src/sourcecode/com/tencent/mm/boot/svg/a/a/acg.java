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

public final class acg
  extends c
{
  private final int height;
  private final int width;
  
  public acg()
  {
    GMTrace.i(15818230333440L, 117855);
    this.width = 168;
    this.height = 168;
    GMTrace.o(15818230333440L, 117855);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15818364551168L, 117856);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15818364551168L, 117856);
      return 0;
      GMTrace.o(15818364551168L, 117856);
      return 168;
      GMTrace.o(15818364551168L, 117856);
      return 168;
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
      localPaint1.setColor(-8617594);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 51.0F, 0.0F, 1.0F, 39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(31.624044F, 90.34997F);
      ((Path)localObject2).cubicTo(32.383965F, 91.14044F, 33.629753F, 91.13373F, 34.386406F, 90.3389F);
      ((Path)localObject2).cubicTo(34.386406F, 90.3389F, 66.0F, 58.57656F, 66.0F, 33.461914F);
      ((Path)localObject2).cubicTo(66.0F, 14.90092F, 51.225395F, 0.0F, 33.47826F, 0.0F);
      ((Path)localObject2).cubicTo(14.774603F, 0.0F, 0.0F, 14.90092F, 0.0F, 33.461914F);
      ((Path)localObject2).cubicTo(0.0F, 58.57656F, 31.624044F, 90.34997F, 31.624044F, 90.34997F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(33.0F, 44.30819F);
      ((Path)localObject2).cubicTo(39.07513F, 44.30819F, 44.0F, 39.348827F, 44.0F, 33.231144F);
      ((Path)localObject2).cubicTo(44.0F, 27.113459F, 39.07513F, 22.154095F, 33.0F, 22.154095F);
      ((Path)localObject2).cubicTo(26.924868F, 22.154095F, 22.0F, 27.113459F, 22.0F, 33.231144F);
      ((Path)localObject2).cubicTo(22.0F, 39.348827F, 26.924868F, 44.30819F, 33.0F, 44.30819F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\acg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */