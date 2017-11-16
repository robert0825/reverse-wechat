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

public final class ix
  extends c
{
  private final int height;
  private final int width;
  
  public ix()
  {
    GMTrace.i(15826014961664L, 117913);
    this.width = 322;
    this.height = 294;
    GMTrace.o(15826014961664L, 117913);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15826149179392L, 117914);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15826149179392L, 117914);
      return 0;
      GMTrace.o(15826149179392L, 117914);
      return 322;
      GMTrace.o(15826149179392L, 117914);
      return 294;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      Object localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(-657931);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 322.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(22.0F, 15.00912F);
      localPath.cubicTo(22.0F, 6.719812F, 28.722176F, 0.0F, 37.005398F, 0.0F);
      localPath.lineTo(306.9946F, 0.0F);
      localPath.cubicTo(315.28186F, 0.0F, 322.0F, 6.710611F, 322.0F, 15.00912F);
      localPath.lineTo(322.0F, 278.99088F);
      localPath.cubicTo(322.0F, 287.28018F, 315.27783F, 294.0F, 306.9946F, 294.0F);
      localPath.lineTo(37.005398F, 294.0F);
      localPath.cubicTo(28.718145F, 294.0F, 22.0F, 287.2894F, 22.0F, 278.99088F);
      localPath.lineTo(22.0F, 15.00912F);
      localPath.close();
      localPath.moveTo(0.0F, 60.37744F);
      localPath.lineTo(22.0F, 48.0F);
      localPath.lineTo(22.0F, 73.0F);
      localPath.lineTo(0.0F, 60.37744F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(arrayOfFloat, 1.0F, 0.0F, 64.0F, 0.0F, 1.0F, 83.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-3552823);
      ((Paint)localObject1).setStrokeWidth(20.0F);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 2.0F);
      ((Path)localObject2).cubicTo(0.0F, 0.89543045F, 0.89543045F, 0.0F, 2.0F, 0.0F);
      ((Path)localObject2).lineTo(163.0F, 0.0F);
      ((Path)localObject2).cubicTo(164.10457F, 0.0F, 165.0F, 0.89543045F, 165.0F, 2.0F);
      ((Path)localObject2).lineTo(165.0F, 118.0F);
      ((Path)localObject2).cubicTo(165.0F, 119.10457F, 164.10457F, 120.0F, 163.0F, 120.0F);
      ((Path)localObject2).lineTo(2.0F, 120.0F);
      ((Path)localObject2).cubicTo(0.89543045F, 120.0F, 0.0F, 119.10457F, 0.0F, 118.0F);
      ((Path)localObject2).lineTo(0.0F, 2.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-3552823);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(126.73595F, 64.14897F);
      ((Path)localObject1).lineTo(103.837265F, 81.98572F);
      ((Path)localObject1).lineTo(111.876335F, 98.63208F);
      ((Path)localObject1).lineTo(55.73088F, 46.75F);
      ((Path)localObject1).lineTo(2.75F, 96.57307F);
      ((Path)localObject1).lineTo(2.75F, 119.245766F);
      ((Path)localObject1).lineTo(162.59375F, 119.245766F);
      ((Path)localObject1).lineTo(162.59375F, 96.57307F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */