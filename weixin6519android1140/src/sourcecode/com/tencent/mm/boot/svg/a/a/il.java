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

public final class il
  extends c
{
  private final int height;
  private final int width;
  
  public il()
  {
    GMTrace.i(21026549268480L, 156660);
    this.width = 66;
    this.height = 48;
    GMTrace.o(21026549268480L, 156660);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21026683486208L, 156661);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21026683486208L, 156661);
      return 0;
      GMTrace.o(21026683486208L, 156661);
      return 66;
      GMTrace.o(21026683486208L, 156661);
      return 48;
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
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-16139513);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(1.492238E-12F, 4.753689F);
      localPath.lineTo(1.4921397E-12F, 1.44F);
      localPath.lineTo(1.4921397E-12F, 1.44F);
      localPath.cubicTo(1.4920424E-12F, 0.64470994F, 0.64470994F, 5.0310737E-15F, 1.44F, 4.8849813E-15F);
      localPath.lineTo(1.44F, 7.1054274E-15F);
      localPath.lineTo(63.440598F, 7.1054274E-15F);
      localPath.lineTo(63.440598F, 6.8833828E-15F);
      localPath.cubicTo(64.235886F, 1.0975447E-14F, 64.8806F, 0.64470994F, 64.8806F, 1.44F);
      localPath.lineTo(64.8806F, 4.7524633F);
      localPath.cubicTo(63.212986F, 4.838482F, 61.888626F, 6.1519527F, 61.888626F, 7.759649F);
      localPath.cubicTo(61.888626F, 9.367345F, 63.212986F, 10.680816F, 64.8806F, 10.766834F);
      localPath.lineTo(64.8806F, 15.700022F);
      localPath.cubicTo(63.212986F, 15.78604F, 61.888626F, 17.099512F, 61.888626F, 18.707207F);
      localPath.cubicTo(61.888626F, 20.314903F, 63.212986F, 21.628374F, 64.8806F, 21.714392F);
      localPath.lineTo(64.8806F, 26.64758F);
      localPath.cubicTo(63.212986F, 26.733599F, 61.888626F, 28.04707F, 61.888626F, 29.654766F);
      localPath.cubicTo(61.888626F, 31.26246F, 63.212986F, 32.57593F, 64.8806F, 32.66195F);
      localPath.lineTo(64.8806F, 37.59514F);
      localPath.cubicTo(63.212986F, 37.681156F, 61.888626F, 38.99463F, 61.888626F, 40.602325F);
      localPath.cubicTo(61.888626F, 42.21002F, 63.212986F, 43.52349F, 64.8806F, 43.60951F);
      localPath.lineTo(64.8806F, 46.403267F);
      localPath.cubicTo(64.8806F, 47.198555F, 64.235886F, 47.843266F, 63.440598F, 47.843266F);
      localPath.lineTo(1.44F, 47.843266F);
      localPath.lineTo(1.44F, 47.843266F);
      localPath.cubicTo(0.64470994F, 47.843266F, 1.4974544E-12F, 47.198555F, 1.493472E-12F, 46.403267F);
      localPath.lineTo(1.4933892E-12F, 43.608284F);
      localPath.cubicTo(1.6570933F, 43.511753F, 2.969651F, 42.20284F, 2.969651F, 40.602325F);
      localPath.cubicTo(2.969651F, 39.00181F, 1.6570933F, 37.692894F, 1.5220741E-12F, 37.596363F);
      localPath.lineTo(1.4930648E-12F, 32.660725F);
      localPath.cubicTo(1.6570933F, 32.564198F, 2.969651F, 31.255281F, 2.969651F, 29.654766F);
      localPath.cubicTo(2.969651F, 28.054249F, 1.6570933F, 26.745335F, 1.5188684E-12F, 26.648806F);
      localPath.lineTo(1.4927404E-12F, 21.713167F);
      localPath.cubicTo(1.6570933F, 21.616638F, 2.969651F, 20.307724F, 2.969651F, 18.707207F);
      localPath.cubicTo(2.969651F, 17.10669F, 1.6570933F, 15.797776F, 1.5214496E-12F, 15.701247F);
      localPath.lineTo(1.4924161E-12F, 10.765609F);
      localPath.cubicTo(1.6570933F, 10.669079F, 2.969651F, 9.360166F, 2.969651F, 7.759649F);
      localPath.cubicTo(2.969651F, 6.1591315F, 1.6570933F, 4.8502183F, 1.5211582E-12F, 4.753689F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.766567F, 0.0F, 1.0F, 11.284898F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(27.595623F, 4.3071604F);
      ((Path)localObject2).cubicTo(27.895103F, 4.257804F, 28.206886F, 4.231837F, 28.530052F, 4.231837F);
      ((Path)localObject2).cubicTo(31.791265F, 4.231837F, 33.893112F, 6.8762636F, 33.893112F, 9.515511F);
      ((Path)localObject2).cubicTo(33.893112F, 12.0585985F, 32.952255F, 12.706281F, 31.849623F, 14.214129F);
      ((Path)localObject2).cubicTo(30.38874F, 16.211538F, 32.642963F, 17.07872F, 33.730682F, 17.629368F);
      ((Path)localObject2).cubicTo(37.6348F, 19.60661F, 39.404655F, 20.372955F, 39.404655F, 21.401474F);
      ((Path)localObject2).lineTo(39.404655F, 22.687485F);
      ((Path)localObject2).cubicTo(39.404655F, 23.16594F, 39.036354F, 23.54473F, 38.45894F, 23.54473F);
      ((Path)localObject2).lineTo(36.02181F, 23.54473F);
      ((Path)localObject2).lineTo(36.02181F, 22.387041F);
      ((Path)localObject2).cubicTo(36.02181F, 21.20894F, 31.7092F, 18.685806F, 27.265581F, 16.338505F);
      ((Path)localObject2).cubicTo(26.625496F, 16.000385F, 25.99978F, 15.9148F, 25.658697F, 15.706315F);
      ((Path)localObject2).cubicTo(25.719418F, 15.427879F, 25.690248F, 15.114451F, 25.533134F, 14.759604F);
      ((Path)localObject2).cubicTo(25.69226F, 14.4091625F, 25.996216F, 13.935938F, 26.486708F, 13.281987F);
      ((Path)localObject2).cubicTo(28.105675F, 11.123124F, 28.233088F, 9.803711F, 28.233088F, 8.206916F);
      ((Path)localObject2).cubicTo(28.233088F, 7.4495745F, 28.17138F, 5.8157215F, 27.595623F, 4.3071604F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(13.871522F, 14.759604F);
      ((Path)localObject2).cubicTo(13.714407F, 15.114451F, 13.685238F, 15.427879F, 13.745958F, 15.706315F);
      ((Path)localObject2).cubicTo(13.404876F, 15.9148F, 12.7791605F, 16.000385F, 12.139076F, 16.338505F);
      ((Path)localObject2).cubicTo(7.695457F, 18.685806F, 3.382846F, 21.20894F, 3.382846F, 22.387041F);
      ((Path)localObject2).lineTo(3.382846F, 23.54473F);
      ((Path)localObject2).lineTo(0.9457164F, 23.54473F);
      ((Path)localObject2).cubicTo(0.36830094F, 23.54473F, -3.5527137E-15F, 23.16594F, -3.5527137E-15F, 22.687485F);
      ((Path)localObject2).lineTo(-3.5527137E-15F, 21.401474F);
      ((Path)localObject2).cubicTo(-3.5527137E-15F, 20.372955F, 1.7698545F, 19.60661F, 5.673974F, 17.629368F);
      ((Path)localObject2).cubicTo(6.761694F, 17.07872F, 9.015916F, 16.211538F, 7.5550323F, 14.214129F);
      ((Path)localObject2).cubicTo(6.452399F, 12.706281F, 5.5115457F, 12.0585985F, 5.5115457F, 9.515511F);
      ((Path)localObject2).cubicTo(5.5115457F, 6.8762636F, 7.6133895F, 4.231837F, 10.874603F, 4.231837F);
      ((Path)localObject2).cubicTo(11.19777F, 4.231837F, 11.509552F, 4.257804F, 11.809032F, 4.3071604F);
      ((Path)localObject2).cubicTo(11.233276F, 5.8157215F, 11.171569F, 7.4495745F, 11.171569F, 8.206916F);
      ((Path)localObject2).cubicTo(11.171569F, 9.803711F, 11.298982F, 11.123124F, 12.917948F, 13.281987F);
      ((Path)localObject2).cubicTo(13.408441F, 13.935938F, 13.712396F, 14.4091625F, 13.871522F, 14.759604F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(12.660459F, 7.1585255F);
      ((Path)localObject2).cubicTo(12.660459F, 10.603999F, 13.853084F, 11.481504F, 15.25078F, 13.524396F);
      ((Path)localObject2).cubicTo(17.102594F, 16.230564F, 14.245145F, 17.405455F, 12.866353F, 18.151493F);
      ((Path)localObject2).cubicTo(7.9174953F, 20.830338F, 5.67403F, 21.868614F, 5.67403F, 23.262089F);
      ((Path)localObject2).lineTo(5.67403F, 25.004427F);
      ((Path)localObject2).cubicTo(5.67403F, 25.652655F, 6.1408877F, 26.165854F, 6.872819F, 26.165854F);
      ((Path)localObject2).lineTo(32.04451F, 26.165854F);
      ((Path)localObject2).cubicTo(32.776443F, 26.165854F, 33.2433F, 25.652655F, 33.2433F, 25.004427F);
      ((Path)localObject2).lineTo(33.2433F, 23.262089F);
      ((Path)localObject2).cubicTo(33.2433F, 21.868614F, 30.999834F, 20.830338F, 26.050976F, 18.151493F);
      ((Path)localObject2).cubicTo(24.672184F, 17.405455F, 21.814735F, 16.230564F, 23.66655F, 13.524396F);
      ((Path)localObject2).cubicTo(25.064245F, 11.481504F, 26.25687F, 10.603999F, 26.25687F, 7.1585255F);
      ((Path)localObject2).cubicTo(26.25687F, 3.5827715F, 23.592575F, 0.0F, 19.458664F, 0.0F);
      ((Path)localObject2).cubicTo(15.324754F, 0.0F, 12.660459F, 3.5827715F, 12.660459F, 7.1585255F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\il.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */