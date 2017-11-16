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

public final class jl
  extends c
{
  private final int height;
  private final int width;
  
  public jl()
  {
    GMTrace.i(15720251392000L, 117125);
    this.width = 136;
    this.height = 136;
    GMTrace.o(15720251392000L, 117125);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15720385609728L, 117126);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15720385609728L, 117126);
      return 0;
      GMTrace.o(15720385609728L, 117126);
      return 136;
      GMTrace.o(15720385609728L, 117126);
      return 136;
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint3 = c.a(localPaint1, paramVarArgs);
      localPaint3.setColor(-921103);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(136.0F, 0.0F);
      localPath.lineTo(136.0F, 136.0F);
      localPath.lineTo(0.0F, 136.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 34.0F, 0.0F, 1.0F, 42.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramVarArgs);
      ((Paint)localObject1).setColor(-3552823);
      ((Paint)localObject1).setStrokeWidth(3.0F);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.5F, 6.0F);
      ((Path)localObject2).cubicTo(1.5F, 3.5147185F, 3.5147185F, 1.5F, 6.0F, 1.5F);
      ((Path)localObject2).lineTo(63.0F, 1.5F);
      ((Path)localObject2).cubicTo(65.48528F, 1.5F, 67.5F, 3.5147185F, 67.5F, 6.0F);
      ((Path)localObject2).lineTo(67.5F, 47.0F);
      ((Path)localObject2).cubicTo(67.5F, 49.485283F, 65.48528F, 51.5F, 63.0F, 51.5F);
      ((Path)localObject2).lineTo(6.0F, 51.5F);
      ((Path)localObject2).cubicTo(3.5147185F, 51.5F, 1.5F, 49.485283F, 1.5F, 47.0F);
      ((Path)localObject2).lineTo(1.5F, 6.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-3552823);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(2.0F, 40.47622F);
      ((Path)localObject1).lineTo(23.9226F, 20.0F);
      ((Path)localObject1).lineTo(48.016544F, 43.06765F);
      ((Path)localObject1).lineTo(44.84195F, 35.311966F);
      ((Path)localObject1).lineTo(54.734417F, 27.538553F);
      ((Path)localObject1).lineTo(68.0F, 40.47622F);
      ((Path)localObject1).lineTo(68.0F, 50.245495F);
      ((Path)localObject1).lineTo(2.0F, 50.245495F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\jl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */