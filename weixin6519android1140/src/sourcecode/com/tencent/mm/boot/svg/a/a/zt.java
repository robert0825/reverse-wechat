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

public final class zt
  extends c
{
  private final int height;
  private final int width;
  
  public zt()
  {
    GMTrace.i(21021985865728L, 156626);
    this.width = 152;
    this.height = 271;
    GMTrace.o(21021985865728L, 156626);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21022120083456L, 156627);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21022120083456L, 156627);
      return 0;
      GMTrace.o(21022120083456L, 156627);
      return 152;
      GMTrace.o(21022120083456L, 156627);
      return 271;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 1.333333F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Object localObject4 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject4).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(4.0F);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(2.0F, 16.0F);
      localPath.cubicTo(2.0F, 8.268013F, 8.268013F, 2.0F, 16.0F, 2.0F);
      localPath.lineTo(133.33333F, 2.0F);
      localPath.cubicTo(141.0653F, 2.0F, 147.33333F, 8.268013F, 147.33333F, 16.0F);
      localPath.lineTo(147.33333F, 250.66666F);
      localPath.cubicTo(147.33333F, 258.39865F, 141.0653F, 264.66666F, 133.33333F, 264.66666F);
      localPath.lineTo(16.0F, 264.66666F);
      localPath.cubicTo(8.268013F, 264.66666F, 2.0F, 258.39865F, 2.0F, 250.66666F);
      localPath.lineTo(2.0F, 16.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localPaint.setStrokeWidth(2.0F);
      localObject4 = c.i(paramVarArgs);
      ((Path)localObject4).moveTo(11.666667F, 29.0F);
      ((Path)localObject4).lineTo(11.666667F, 232.33333F);
      ((Path)localObject4).lineTo(137.66667F, 232.33333F);
      ((Path)localObject4).lineTo(137.66667F, 29.0F);
      ((Path)localObject4).lineTo(11.666667F, 29.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setColor(-16777216);
      localObject4 = c.i(paramVarArgs);
      ((Path)localObject4).moveTo(65.333336F, 13.333333F);
      ((Path)localObject4).lineTo(85.333336F, 13.333333F);
      ((Path)localObject4).lineTo(85.333336F, 17.333332F);
      ((Path)localObject4).lineTo(65.333336F, 17.333332F);
      ((Path)localObject4).lineTo(65.333336F, 13.333333F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-15028967);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 38.0F, 0.0F, 1.0F, 90.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(74.55886F, 18.44114F);
      ((Path)localObject3).lineTo(73.35034F, 19.649662F);
      ((Path)localObject3).lineTo(38.0F, 55.0F);
      ((Path)localObject3).lineTo(2.6496618F, 19.649662F);
      ((Path)localObject3).lineTo(1.4411386F, 18.44114F);
      ((Path)localObject3).lineTo(0.23261555F, 17.232616F);
      ((Path)localObject3).cubicTo(9.399959F, 6.675522F, 22.920404F, 0.0F, 38.0F, 0.0F);
      ((Path)localObject3).cubicTo(53.079597F, 0.0F, 66.600044F, 6.675522F, 75.76739F, 17.232616F);
      ((Path)localObject3).lineTo(74.55886F, 18.44114F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(73.35034F, 19.649662F);
      ((Path)localObject3).cubicTo(64.80579F, 9.706631F, 52.138332F, 3.409091F, 38.0F, 3.409091F);
      ((Path)localObject3).cubicTo(23.861668F, 3.409091F, 11.194205F, 9.706631F, 2.6496618F, 19.649662F);
      ((Path)localObject3).lineTo(38.0F, 55.0F);
      ((Path)localObject3).lineTo(73.35034F, 19.649662F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(64.41209F, 28.587917F);
      ((Path)localObject3).lineTo(38.0F, 55.0F);
      ((Path)localObject3).lineTo(11.587917F, 28.587917F);
      ((Path)localObject3).cubicTo(17.821682F, 20.907948F, 27.337685F, 16.0F, 38.0F, 16.0F);
      ((Path)localObject3).cubicTo(48.662315F, 16.0F, 58.178318F, 20.907948F, 64.41209F, 28.587917F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(61.952404F, 31.047596F);
      ((Path)localObject3).cubicTo(56.358055F, 23.986908F, 47.707962F, 19.457626F, 38.0F, 19.457626F);
      ((Path)localObject3).cubicTo(28.292036F, 19.457626F, 19.641943F, 23.986908F, 14.047595F, 31.047596F);
      ((Path)localObject3).lineTo(38.0F, 55.0F);
      ((Path)localObject3).lineTo(61.952404F, 31.047596F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(24.464458F, 41.46446F);
      ((Path)localObject3).cubicTo(27.298983F, 36.97893F, 32.30161F, 34.0F, 38.0F, 34.0F);
      ((Path)localObject3).cubicTo(43.69839F, 34.0F, 48.701015F, 36.97893F, 51.53554F, 41.46446F);
      ((Path)localObject3).lineTo(38.0F, 55.0F);
      ((Path)localObject3).lineTo(24.464458F, 41.46446F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(26.967703F, 43.9677F);
      ((Path)localObject3).lineTo(38.0F, 55.0F);
      ((Path)localObject3).lineTo(49.0323F, 43.9677F);
      ((Path)localObject3).cubicTo(46.89699F, 40.070786F, 42.757057F, 37.42857F, 38.0F, 37.42857F);
      ((Path)localObject3).cubicTo(33.242943F, 37.42857F, 29.103008F, 40.070786F, 26.967703F, 43.9677F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(41.284134F, 51.715866F);
      ((Path)localObject2).lineTo(38.0F, 55.0F);
      ((Path)localObject2).lineTo(34.715866F, 51.715866F);
      ((Path)localObject2).cubicTo(35.438572F, 50.6787F, 36.640026F, 50.0F, 38.0F, 50.0F);
      ((Path)localObject2).cubicTo(39.359974F, 50.0F, 40.561428F, 50.6787F, 41.284134F, 51.715866F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\zt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */