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

public final class ahj
  extends c
{
  private final int height;
  private final int width;
  
  public ahj()
  {
    GMTrace.i(17578764271616L, 130972);
    this.width = 45;
    this.height = 45;
    GMTrace.o(17578764271616L, 130972);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17578898489344L, 130973);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17578898489344L, 130973);
      return 0;
      GMTrace.o(17578898489344L, 130973);
      return 45;
      GMTrace.o(17578898489344L, 130973);
      return 45;
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
      localCanvas.saveLayerAlpha(null, 38, 4);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(9.457563F, 7.8087344F);
      ((Path)localObject2).cubicTo(11.167546F, 6.0274277F, 13.166591F, 5.1481767F, 14.952687F, 4.761591F);
      ((Path)localObject2).cubicTo(14.593289F, 4.2669635F, 14.3813095F, 3.65827F, 14.3813095F, 3.0F);
      ((Path)localObject2).cubicTo(14.3813095F, 1.3429188F, 15.724614F, 0.0F, 17.38131F, 0.0F);
      ((Path)localObject2).cubicTo(19.038004F, 0.0F, 20.38131F, 1.3429188F, 20.38131F, 3.0F);
      ((Path)localObject2).cubicTo(20.38131F, 3.65827F, 20.169329F, 4.2669635F, 19.80993F, 4.761591F);
      ((Path)localObject2).cubicTo(23.826532F, 5.630951F, 28.920044F, 8.991799F, 29.38131F, 19.5F);
      ((Path)localObject2).cubicTo(29.192793F, 23.44757F, 29.636072F, 26.433947F, 30.30884F, 28.660011F);
      ((Path)localObject2).lineTo(37.4661F, 35.81727F);
      ((Path)localObject2).cubicTo(37.86362F, 36.214794F, 37.86378F, 36.846252F, 37.474403F, 37.23563F);
      ((Path)localObject2).lineTo(36.61694F, 38.093094F);
      ((Path)localObject2).cubicTo(36.2272F, 38.482834F, 35.59254F, 38.478752F, 35.198578F, 38.08479F);
      ((Path)localObject2).lineTo(0.094642155F, 2.980852F);
      ((Path)localObject2).cubicTo(-0.30288154F, 2.5833282F, -0.3030391F, 1.9518675F, 0.08633687F, 1.5624915F);
      ((Path)localObject2).lineTo(0.9438008F, 0.7050276F);
      ((Path)localObject2).cubicTo(1.3335396F, 0.3152888F, 1.9681984F, 0.31937F, 2.3621612F, 0.71333283F);
      ((Path)localObject2).lineTo(9.457563F, 7.8087344F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(6.360238F, 13.343368F);
      ((Path)localObject2).lineTo(29.01687F, 36.0F);
      ((Path)localObject2).lineTo(0.8813093F, 36.0F);
      ((Path)localObject2).lineTo(0.8813093F, 34.5F);
      ((Path)localObject2).cubicTo(0.8813093F, 34.5F, 5.943809F, 31.278849F, 5.3813095F, 19.5F);
      ((Path)localObject2).cubicTo(5.487063F, 17.090797F, 5.836307F, 15.05729F, 6.360238F, 13.343368F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ahj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */