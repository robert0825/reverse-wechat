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

public final class de
  extends c
{
  private final int height;
  private final int width;
  
  public de()
  {
    GMTrace.i(17577690529792L, 130964);
    this.width = 110;
    this.height = 47;
    GMTrace.o(17577690529792L, 130964);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17577824747520L, 130965);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17577824747520L, 130965);
      return 0;
      GMTrace.o(17577824747520L, 130965);
      return 110;
      GMTrace.o(17577824747520L, 130965);
      return 47;
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -558.0F, 0.0F, 1.0F, -160.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 558.0F, 0.0F, 1.0F, 160.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(3.0F);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.5F, 23.5F);
      ((Path)localObject2).cubicTo(1.5F, 11.349735F, 11.349735F, 1.5F, 23.5F, 1.5F);
      ((Path)localObject2).lineTo(86.5F, 1.5F);
      ((Path)localObject2).cubicTo(98.65027F, 1.5F, 108.5F, 11.349735F, 108.5F, 23.5F);
      ((Path)localObject2).lineTo(108.5F, 23.5F);
      ((Path)localObject2).cubicTo(108.5F, 35.650265F, 98.65027F, 45.5F, 86.5F, 45.5F);
      ((Path)localObject2).lineTo(23.5F, 45.5F);
      ((Path)localObject2).cubicTo(11.349735F, 45.5F, 1.5F, 35.650265F, 1.5F, 23.5F);
      ((Path)localObject2).lineTo(1.5F, 23.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(31.969F, 18.689F);
      ((Path)localObject1).lineTo(37.045F, 18.689F);
      ((Path)localObject1).lineTo(37.045F, 11.075F);
      ((Path)localObject1).lineTo(29.836F, 11.075F);
      ((Path)localObject1).lineTo(29.836F, 12.776F);
      ((Path)localObject1).lineTo(35.155F, 12.776F);
      ((Path)localObject1).lineTo(35.155F, 16.988F);
      ((Path)localObject1).lineTo(30.241F, 16.988F);
      ((Path)localObject1).lineTo(29.539F, 24.764F);
      ((Path)localObject1).lineTo(35.425F, 24.764F);
      ((Path)localObject1).cubicTo(35.425F, 28.004F, 35.29F, 30.164F, 35.02F, 31.19F);
      ((Path)localObject1).cubicTo(34.777F, 32.162F, 33.859F, 32.675F, 32.266F, 32.675F);
      ((Path)localObject1).cubicTo(31.591F, 32.675F, 30.943F, 32.621F, 30.295F, 32.567F);
      ((Path)localObject1).lineTo(30.781F, 34.376F);
      ((Path)localObject1).cubicTo(31.429F, 34.43F, 32.077F, 34.484F, 32.698F, 34.484F);
      ((Path)localObject1).cubicTo(35.101F, 34.376F, 36.478F, 33.566F, 36.829F, 32.0F);
      ((Path)localObject1).cubicTo(37.099F, 30.596F, 37.261F, 27.599F, 37.261F, 23.063F);
      ((Path)localObject1).lineTo(31.51F, 23.063F);
      ((Path)localObject1).lineTo(31.969F, 18.689F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(39.367F, 14.315F);
      ((Path)localObject1).lineTo(47.224F, 14.315F);
      ((Path)localObject1).cubicTo(48.034F, 12.857F, 48.709F, 11.345F, 49.303F, 9.752F);
      ((Path)localObject1).lineTo(51.166F, 10.4F);
      ((Path)localObject1).cubicTo(50.572F, 11.858F, 49.897F, 13.181F, 49.141F, 14.315F);
      ((Path)localObject1).lineTo(52.651F, 14.315F);
      ((Path)localObject1).lineTo(52.651F, 25.142F);
      ((Path)localObject1).lineTo(46.9F, 25.142F);
      ((Path)localObject1).lineTo(46.9F, 27.761F);
      ((Path)localObject1).lineTo(53.839F, 27.761F);
      ((Path)localObject1).lineTo(53.839F, 29.57F);
      ((Path)localObject1).lineTo(46.9F, 29.57F);
      ((Path)localObject1).lineTo(46.9F, 34.754F);
      ((Path)localObject1).lineTo(45.01F, 34.754F);
      ((Path)localObject1).lineTo(45.01F, 29.57F);
      ((Path)localObject1).lineTo(38.179F, 29.57F);
      ((Path)localObject1).lineTo(38.179F, 27.761F);
      ((Path)localObject1).lineTo(45.01F, 27.761F);
      ((Path)localObject1).lineTo(45.01F, 25.142F);
      ((Path)localObject1).lineTo(39.367F, 25.142F);
      ((Path)localObject1).lineTo(39.367F, 14.315F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(50.896F, 23.495F);
      ((Path)localObject1).lineTo(50.896F, 20.579F);
      ((Path)localObject1).lineTo(46.9F, 20.579F);
      ((Path)localObject1).lineTo(46.9F, 23.495F);
      ((Path)localObject1).lineTo(50.896F, 23.495F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(45.01F, 23.495F);
      ((Path)localObject1).lineTo(45.01F, 20.579F);
      ((Path)localObject1).lineTo(41.095F, 20.579F);
      ((Path)localObject1).lineTo(41.095F, 23.495F);
      ((Path)localObject1).lineTo(45.01F, 23.495F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(41.095F, 18.959F);
      ((Path)localObject1).lineTo(45.01F, 18.959F);
      ((Path)localObject1).lineTo(45.01F, 15.962F);
      ((Path)localObject1).lineTo(41.095F, 15.962F);
      ((Path)localObject1).lineTo(41.095F, 18.959F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(46.9F, 15.962F);
      ((Path)localObject1).lineTo(46.9F, 18.959F);
      ((Path)localObject1).lineTo(50.896F, 18.959F);
      ((Path)localObject1).lineTo(50.896F, 15.962F);
      ((Path)localObject1).lineTo(46.9F, 15.962F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(42.553F, 9.914F);
      ((Path)localObject1).cubicTo(43.363F, 11.021F, 44.065F, 12.209F, 44.659F, 13.451F);
      ((Path)localObject1).lineTo(42.985F, 14.18F);
      ((Path)localObject1).cubicTo(42.337F, 12.776F, 41.581F, 11.561F, 40.771F, 10.481F);
      ((Path)localObject1).lineTo(42.553F, 9.914F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(67.636F, 26.141F);
      ((Path)localObject1).lineTo(69.472F, 26.141F);
      ((Path)localObject1).lineTo(69.472F, 28.031F);
      ((Path)localObject1).lineTo(75.709F, 28.031F);
      ((Path)localObject1).cubicTo(74.251F, 27.167F, 73.117F, 26.249F, 72.307F, 25.223F);
      ((Path)localObject1).lineTo(65.314F, 25.223F);
      ((Path)localObject1).cubicTo(64.369F, 26.249F, 63.181F, 27.194F, 61.75F, 28.031F);
      ((Path)localObject1).lineTo(67.636F, 28.031F);
      ((Path)localObject1).lineTo(67.636F, 26.141F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(67.636F, 29.516F);
      ((Path)localObject1).lineTo(62.533F, 29.516F);
      ((Path)localObject1).lineTo(62.533F, 34.025F);
      ((Path)localObject1).lineTo(60.697F, 34.025F);
      ((Path)localObject1).lineTo(60.697F, 28.598F);
      ((Path)localObject1).cubicTo(59.563F, 29.165F, 58.348F, 29.678F, 57.052F, 30.137F);
      ((Path)localObject1).lineTo(56.215F, 28.517F);
      ((Path)localObject1).cubicTo(59.131F, 27.599F, 61.399F, 26.519F, 62.992F, 25.223F);
      ((Path)localObject1).lineTo(56.89F, 25.223F);
      ((Path)localObject1).lineTo(56.89F, 23.603F);
      ((Path)localObject1).lineTo(64.558F, 23.603F);
      ((Path)localObject1).cubicTo(64.882F, 23.144F, 65.152F, 22.685F, 65.368F, 22.199F);
      ((Path)localObject1).lineTo(59.86F, 22.199F);
      ((Path)localObject1).lineTo(59.86F, 15.044F);
      ((Path)localObject1).lineTo(62.992F, 15.044F);
      ((Path)localObject1).lineTo(62.992F, 13.316F);
      ((Path)localObject1).lineTo(56.566F, 13.316F);
      ((Path)localObject1).lineTo(56.566F, 11.723F);
      ((Path)localObject1).lineTo(62.992F, 11.723F);
      ((Path)localObject1).lineTo(62.992F, 9.914F);
      ((Path)localObject1).lineTo(64.855F, 9.914F);
      ((Path)localObject1).lineTo(64.855F, 11.723F);
      ((Path)localObject1).lineTo(72.172F, 11.723F);
      ((Path)localObject1).lineTo(72.172F, 9.914F);
      ((Path)localObject1).lineTo(74.035F, 9.914F);
      ((Path)localObject1).lineTo(74.035F, 11.723F);
      ((Path)localObject1).lineTo(80.461F, 11.723F);
      ((Path)localObject1).lineTo(80.461F, 13.316F);
      ((Path)localObject1).lineTo(74.035F, 13.316F);
      ((Path)localObject1).lineTo(74.035F, 15.044F);
      ((Path)localObject1).lineTo(77.167F, 15.044F);
      ((Path)localObject1).lineTo(77.167F, 22.199F);
      ((Path)localObject1).lineTo(67.177F, 22.199F);
      ((Path)localObject1).cubicTo(66.988F, 22.685F, 66.772F, 23.144F, 66.502F, 23.603F);
      ((Path)localObject1).lineTo(80.11F, 23.603F);
      ((Path)localObject1).lineTo(80.11F, 25.223F);
      ((Path)localObject1).lineTo(74.278F, 25.223F);
      ((Path)localObject1).cubicTo(75.763F, 26.546F, 77.977F, 27.599F, 80.893F, 28.355F);
      ((Path)localObject1).lineTo(80.11F, 29.975F);
      ((Path)localObject1).cubicTo(78.868F, 29.543F, 77.788F, 29.111F, 76.87F, 28.652F);
      ((Path)localObject1).lineTo(76.87F, 31.919F);
      ((Path)localObject1).cubicTo(76.87F, 33.323F, 76.087F, 34.052F, 74.521F, 34.052F);
      ((Path)localObject1).lineTo(72.469F, 34.052F);
      ((Path)localObject1).lineTo(72.064F, 32.432F);
      ((Path)localObject1).lineTo(73.981F, 32.486F);
      ((Path)localObject1).cubicTo(74.683F, 32.486F, 75.034F, 32.162F, 75.034F, 31.514F);
      ((Path)localObject1).lineTo(75.034F, 29.516F);
      ((Path)localObject1).lineTo(69.472F, 29.516F);
      ((Path)localObject1).lineTo(69.472F, 34.7F);
      ((Path)localObject1).lineTo(67.636F, 34.7F);
      ((Path)localObject1).lineTo(67.636F, 29.516F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(72.172F, 13.316F);
      ((Path)localObject1).lineTo(64.855F, 13.316F);
      ((Path)localObject1).lineTo(64.855F, 15.044F);
      ((Path)localObject1).lineTo(72.172F, 15.044F);
      ((Path)localObject1).lineTo(72.172F, 13.316F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(75.331F, 20.849F);
      ((Path)localObject1).lineTo(75.331F, 19.229F);
      ((Path)localObject1).lineTo(61.696F, 19.229F);
      ((Path)localObject1).lineTo(61.696F, 20.849F);
      ((Path)localObject1).lineTo(75.331F, 20.849F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(61.696F, 17.96F);
      ((Path)localObject1).lineTo(75.331F, 17.96F);
      ((Path)localObject1).lineTo(75.331F, 16.448F);
      ((Path)localObject1).lineTo(61.696F, 16.448F);
      ((Path)localObject1).lineTo(61.696F, 17.96F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */