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

public final class akm
  extends c
{
  private final int height;
  private final int width;
  
  public akm()
  {
    GMTrace.i(17583327674368L, 131006);
    this.width = 96;
    this.height = 96;
    GMTrace.o(17583327674368L, 131006);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17583461892096L, 131007);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17583461892096L, 131007);
      return 0;
      GMTrace.o(17583461892096L, 131007);
      return 96;
      GMTrace.o(17583461892096L, 131007);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramVarArgs).setStrokeWidth(1.0F);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(96.0F, 0.0F);
      ((Path)localObject3).lineTo(96.0F, 96.0F);
      ((Path)localObject3).lineTo(0.0F, 96.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 0.70710677F, 0.70710677F, -21.213203F, -0.70710677F, 0.70710677F, 45.55635F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(57.384777F, 35.384777F);
      ((Path)localObject1).lineTo(53.384777F, 35.384777F);
      ((Path)localObject1).lineTo(53.384777F, 57.384777F);
      ((Path)localObject1).lineTo(31.384777F, 57.384777F);
      ((Path)localObject1).lineTo(31.384777F, 61.384777F);
      ((Path)localObject1).lineTo(57.384777F, 61.384777F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.saveLayerAlpha(null, 76, 4);
      localObject2 = c.a(localPaint, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\akm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */