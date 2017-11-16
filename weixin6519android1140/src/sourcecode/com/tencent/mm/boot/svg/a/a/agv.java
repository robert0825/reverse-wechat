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

public final class agv
  extends c
{
  private final int height;
  private final int width;
  
  public agv()
  {
    GMTrace.i(15778501885952L, 117559);
    this.width = 90;
    this.height = 90;
    GMTrace.o(15778501885952L, 117559);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15778636103680L, 117560);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15778636103680L, 117560);
      return 0;
      GMTrace.o(15778636103680L, 117560);
      return 90;
      GMTrace.o(15778636103680L, 117560);
      return 90;
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(26.0F, 1.0F);
      ((Path)localObject2).cubicTo(41.749996F, -2.7020142F, 58.451546F, 6.5304475F, 64.0F, 21.0F);
      ((Path)localObject2).cubicTo(69.30905F, 34.878006F, 64.155495F, 51.76251F, 52.0F, 60.0F);
      ((Path)localObject2).cubicTo(39.778633F, 68.93709F, 21.556034F, 67.74677F, 11.0F, 57.0F);
      ((Path)localObject2).cubicTo(-0.24904436F, 47.641407F, -3.2110927F, 30.486835F, 4.0F, 18.0F);
      ((Path)localObject2).cubicTo(8.276852F, 9.0211115F, 16.842775F, 2.5793939F, 26.0F, 1.0F);
      ((Path)localObject2).lineTo(26.0F, 1.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(27.0F, 4.0F);
      ((Path)localObject2).cubicTo(12.1093855F, 6.789598F, 1.3032824F, 21.511627F, 3.0F, 36.0F);
      ((Path)localObject2).cubicTo(4.5091596F, 51.64438F, 19.529842F, 64.36022F, 35.0F, 63.0F);
      ((Path)localObject2).cubicTo(51.368896F, 62.174374F, 64.971405F, 46.114883F, 63.0F, 30.0F);
      ((Path)localObject2).cubicTo(61.405987F, 12.758258F, 43.229362F, -0.47659707F, 27.0F, 4.0F);
      ((Path)localObject2).lineTo(27.0F, 4.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(19.0F, 19.0F);
      ((Path)localObject2).cubicTo(22.44149F, 17.715698F, 26.87168F, 21.241371F, 26.0F, 25.0F);
      ((Path)localObject2).cubicTo(25.251135F, 28.607508F, 20.48421F, 30.265413F, 18.0F, 28.0F);
      ((Path)localObject2).cubicTo(14.928059F, 25.732405F, 15.6331005F, 20.811155F, 19.0F, 19.0F);
      ((Path)localObject2).lineTo(19.0F, 19.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(45.0F, 19.0F);
      ((Path)localObject2).cubicTo(48.144283F, 18.20386F, 51.80879F, 21.377556F, 51.0F, 24.0F);
      ((Path)localObject2).cubicTo(50.233788F, 27.98074F, 44.67928F, 29.259693F, 42.0F, 27.0F);
      ((Path)localObject2).cubicTo(39.723274F, 24.219673F, 41.235275F, 19.795444F, 45.0F, 19.0F);
      ((Path)localObject2).lineTo(45.0F, 19.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(15.0F, 36.0F);
      ((Path)localObject1).cubicTo(27.003326F, 35.99499F, 38.996674F, 35.99499F, 51.0F, 36.0F);
      ((Path)localObject1).cubicTo(50.890244F, 43.420006F, 46.080933F, 50.524376F, 39.0F, 53.0F);
      ((Path)localObject1).cubicTo(31.752771F, 55.694836F, 22.90244F, 52.91922F, 18.0F, 46.0F);
      ((Path)localObject1).cubicTo(16.207317F, 43.470108F, 15.219512F, 39.732548F, 15.0F, 36.0F);
      ((Path)localObject1).lineTo(15.0F, 36.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\agv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */