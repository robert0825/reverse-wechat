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

public final class aan
  extends c
{
  private final int height;
  private final int width;
  
  public aan()
  {
    GMTrace.i(20325530075136L, 151437);
    this.width = 48;
    this.height = 52;
    GMTrace.o(20325530075136L, 151437);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20325664292864L, 151438);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20325664292864L, 151438);
      return 0;
      GMTrace.o(20325664292864L, 151438);
      return 48;
      GMTrace.o(20325664292864L, 151438);
      return 52;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -8.0F, 0.0F, 1.0F, -6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(24.80435F, 38.659184F);
      ((Path)localObject2).cubicTo(24.637218F, 38.487045F, 24.6045F, 38.174816F, 24.726532F, 37.968803F);
      ((Path)localObject2).lineTo(25.386211F, 36.854485F);
      ((Path)localObject2).cubicTo(25.510012F, 36.644806F, 25.781488F, 36.56881F, 25.990181F, 36.682346F);
      ((Path)localObject2).lineTo(30.773296F, 39.283638F);
      ((Path)localObject2).cubicTo(31.195103F, 39.513462F, 31.854782F, 39.464016F, 32.22972F, 39.1875F);
      ((Path)localObject2).lineTo(45.16686F, 29.642105F);
      ((Path)localObject2).cubicTo(45.357864F, 29.501099F, 45.648796F, 29.51758F, 45.827423F, 29.688803F);
      ((Path)localObject2).lineTo(46.070602F, 29.922287F);
      ((Path)localObject2).cubicTo(46.24481F, 30.08893F, 46.248344F, 30.366365F, 46.0821F, 30.538502F);
      ((Path)localObject2).lineTo(32.136868F, 44.987984F);
      ((Path)localObject2).cubicTo(31.805262F, 45.331345F, 31.269382F, 45.33409F, 30.92451F, 44.977913F);
      ((Path)localObject2).lineTo(24.80435F, 38.659184F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(12.888889F, 32.348488F);
      ((Path)localObject2).cubicTo(12.644444F, 32.348488F, 12.444445F, 32.550213F, 12.444445F, 32.796764F);
      ((Path)localObject2).lineTo(12.444445F, 52.988007F);
      ((Path)localObject2).cubicTo(12.444445F, 53.237247F, 12.636444F, 53.43449F, 12.881778F, 53.436283F);
      ((Path)localObject2).cubicTo(19.092443F, 53.477524F, 37.99289F, 53.602146F, 40.093334F, 53.425526F);
      ((Path)localObject2).cubicTo(42.373333F, 53.23366F, 45.365334F, 52.000904F, 46.518223F, 51.02725F);
      ((Path)localObject2).cubicTo(52.352F, 46.09711F, 51.52178F, 32.061592F, 50.393776F, 29.480421F);
      ((Path)localObject2).cubicTo(49.748444F, 28.0038F, 46.894222F, 27.45511F, 45.588444F, 27.417456F);
      ((Path)localObject2).cubicTo(45.08889F, 27.41656F, 43.112F, 27.308973F, 41.523556F, 25.757938F);
      ((Path)localObject2).cubicTo(40.651554F, 24.90711F, 39.612446F, 23.31842F, 39.612446F, 20.58125F);
      ((Path)localObject2).cubicTo(39.612446F, 16.276007F, 39.393776F, 13.897455F, 38.152F, 12.019179F);
      ((Path)localObject2).cubicTo(37.90489F, 11.644421F, 36.045334F, 10.231455F, 34.06222F, 11.176421F);
      ((Path)localObject2).cubicTo(33.340443F, 11.520697F, 33.217777F, 12.341938F, 33.112F, 15.418903F);
      ((Path)localObject2).cubicTo(33.096F, 15.881524F, 33.079113F, 16.366558F, 33.05511F, 16.874903F);
      ((Path)localObject2).cubicTo(32.905777F, 20.137455F, 32.761776F, 21.871386F, 32.098667F, 23.672558F);
      ((Path)localObject2).cubicTo(31.076445F, 26.449179F, 29.518223F, 28.351662F, 27.046223F, 29.838144F);
      ((Path)localObject2).cubicTo(25.94489F, 30.4998F, 24.438223F, 31.40711F, 22.61511F, 31.817732F);
      ((Path)localObject2).cubicTo(20.514668F, 32.292904F, 18.948444F, 32.348488F, 17.953777F, 32.348488F);
      ((Path)localObject2).lineTo(12.888889F, 32.348488F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(31.533333F, 57.99973F);
      ((Path)localObject2).cubicTo(26.16711F, 57.99973F, 19.216888F, 57.96028F, 12.852445F, 57.91904F);
      ((Path)localObject2).cubicTo(10.176888F, 57.90111F, 8.0F, 55.68842F, 8.0F, 52.988007F);
      ((Path)localObject2).lineTo(8.0F, 32.796764F);
      ((Path)localObject2).cubicTo(8.0F, 30.07842F, 10.193778F, 27.86573F, 12.888889F, 27.86573F);
      ((Path)localObject2).lineTo(17.953777F, 27.86573F);
      ((Path)localObject2).cubicTo(18.803556F, 27.86573F, 19.990223F, 27.817318F, 21.644444F, 27.443455F);
      ((Path)localObject2).cubicTo(22.773333F, 27.188835F, 23.88F, 26.523594F, 24.769777F, 25.987455F);
      ((Path)localObject2).cubicTo(26.107555F, 25.183249F, 27.158222F, 24.21587F, 27.932444F, 22.111662F);
      ((Path)localObject2).cubicTo(28.355556F, 20.963179F, 28.473778F, 19.74387F, 28.616F, 16.666903F);
      ((Path)localObject2).cubicTo(28.63911F, 16.176489F, 28.654222F, 15.708489F, 28.670221F, 15.2638F);
      ((Path)localObject2).cubicTo(28.786667F, 11.879317F, 28.896F, 8.682214F, 32.161777F, 7.1240067F);
      ((Path)localObject2).lineTo(32.162666F, 7.1240067F);
      ((Path)localObject2).cubicTo(36.176888F, 5.2089725F, 40.366222F, 7.2907653F, 41.84889F, 9.531248F);
      ((Path)localObject2).cubicTo(43.716446F, 12.353593F, 44.05689F, 15.466421F, 44.05689F, 20.58125F);
      ((Path)localObject2).cubicTo(44.05689F, 21.225868F, 44.153778F, 22.087456F, 44.614223F, 22.537523F);
      ((Path)localObject2).cubicTo(44.981335F, 22.894352F, 45.532444F, 22.935593F, 45.538666F, 22.935593F);
      ((Path)localObject2).lineTo(45.539555F, 22.935593F);
      ((Path)localObject2).lineTo(45.595554F, 22.9338F);
      ((Path)localObject2).lineTo(45.651554F, 22.934696F);
      ((Path)localObject2).cubicTo(46.34667F, 22.948145F, 52.499557F, 23.185732F, 54.460445F, 27.671179F);
      ((Path)localObject2).cubicTo(56.191113F, 31.631248F, 57.154667F, 47.886627F, 49.372444F, 54.462833F);
      ((Path)localObject2).cubicTo(47.397335F, 56.132214F, 43.484444F, 57.63842F, 40.46311F, 57.892143F);
      ((Path)localObject2).cubicTo(39.526222F, 57.971043F, 36.10311F, 57.99973F, 31.533333F, 57.99973F);
      ((Path)localObject2).lineTo(31.533333F, 57.99973F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */