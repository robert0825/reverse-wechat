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

public final class and
  extends c
{
  private final int height;
  private final int width;
  
  public and()
  {
    GMTrace.i(15767764467712L, 117479);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15767764467712L, 117479);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15767898685440L, 117480);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15767898685440L, 117480);
      return 0;
      GMTrace.o(15767898685440L, 117480);
      return 96;
      GMTrace.o(15767898685440L, 117480);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
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
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -127.0F, 0.0F, 1.0F, -128.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 127.0F, 0.0F, 1.0F, 128.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-9276814);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 5.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(78.0F, 47.0F);
      ((Path)localObject3).cubicTo(78.0F, 68.53911F, 60.539104F, 86.0F, 39.0F, 86.0F);
      ((Path)localObject3).cubicTo(17.460896F, 86.0F, 0.0F, 68.53911F, 0.0F, 47.0F);
      ((Path)localObject3).cubicTo(0.0F, 29.647755F, 11.332416F, 14.942338F, 27.0F, 9.880997F);
      ((Path)localObject3).lineTo(27.0F, 18.408052F);
      ((Path)localObject3).cubicTo(15.838201F, 23.098259F, 8.0F, 34.133774F, 8.0F, 47.0F);
      ((Path)localObject3).cubicTo(8.0F, 64.12083F, 21.879173F, 78.0F, 39.0F, 78.0F);
      ((Path)localObject3).cubicTo(56.120827F, 78.0F, 70.0F, 64.12083F, 70.0F, 47.0F);
      ((Path)localObject3).cubicTo(70.0F, 34.133774F, 62.1618F, 23.098259F, 51.0F, 18.408056F);
      ((Path)localObject3).lineTo(51.0F, 9.880997F);
      ((Path)localObject3).cubicTo(66.66759F, 14.942338F, 78.0F, 29.647755F, 78.0F, 47.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(35.0F, 2.0F);
      ((Path)localObject2).cubicTo(35.0F, 0.89543045F, 35.89543F, 0.0F, 37.0F, 0.0F);
      ((Path)localObject2).lineTo(42.0F, 0.0F);
      ((Path)localObject2).cubicTo(43.10457F, 0.0F, 44.0F, 0.89543045F, 44.0F, 2.0F);
      ((Path)localObject2).lineTo(44.0F, 28.0F);
      ((Path)localObject2).cubicTo(44.0F, 29.10457F, 43.10457F, 30.0F, 42.0F, 30.0F);
      ((Path)localObject2).lineTo(37.0F, 30.0F);
      ((Path)localObject2).cubicTo(35.89543F, 30.0F, 35.0F, 29.10457F, 35.0F, 28.0F);
      ((Path)localObject2).lineTo(35.0F, 2.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\and.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */