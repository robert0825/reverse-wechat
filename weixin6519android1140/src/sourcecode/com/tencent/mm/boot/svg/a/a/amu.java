package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class amu
  extends c
{
  private final int height;
  private final int width;
  
  public amu()
  {
    GMTrace.i(20324724768768L, 151431);
    this.width = 102;
    this.height = 102;
    GMTrace.o(20324724768768L, 151431);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20324858986496L, 151432);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20324858986496L, 151432);
      return 0;
      GMTrace.o(20324858986496L, 151432);
      return 102;
      GMTrace.o(20324858986496L, 151432);
      return 102;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-1250068);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(102.0F, 0.0F);
      localPath.lineTo(102.0F, 102.0F);
      localPath.lineTo(0.0F, 102.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath(localPath, c.a((Paint)localObject, paramVarArgs));
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-352965);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(63.63156F, 32.550247F);
      ((Path)localObject).cubicTo(75.09288F, 38.508724F, 83.25293F, 51.791027F, 83.25293F, 63.84621F);
      ((Path)localObject).cubicTo(83.25293F, 79.99414F, 68.611664F, 87.82541F, 51.00678F, 87.82541F);
      ((Path)localObject).cubicTo(33.401894F, 87.82541F, 19.5F, 79.99414F, 19.5F, 63.84621F);
      ((Path)localObject).cubicTo(19.5F, 51.74594F, 27.306032F, 38.40936F, 38.626804F, 32.483704F);
      ((Path)localObject).cubicTo(36.242176F, 30.331757F, 31.298382F, 24.12442F, 32.533047F, 19.040112F);
      ((Path)localObject).cubicTo(32.985134F, 17.178434F, 35.765137F, 15.0F, 41.421295F, 15.0F);
      ((Path)localObject).cubicTo(47.07745F, 15.0F, 53.052776F, 19.531132F, 58.69562F, 19.531132F);
      ((Path)localObject).cubicTo(63.543755F, 19.531132F, 67.75456F, 16.320612F, 70.28289F, 19.040112F);
      ((Path)localObject).cubicTo(72.71456F, 21.655647F, 66.70847F, 29.404749F, 63.63156F, 32.550247F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(43.35897F, 30.520924F);
      ((Path)localObject).cubicTo(45.80165F, 29.762579F, 48.362442F, 29.348583F, 51.00678F, 29.348583F);
      ((Path)localObject).cubicTo(53.602345F, 29.348583F, 56.13349F, 29.747448F, 58.562794F, 30.479317F);
      ((Path)localObject).cubicTo(59.680264F, 28.81376F, 61.609486F, 25.761576F, 62.010014F, 25.23725F);
      ((Path)localObject).cubicTo(60.884056F, 25.436415F, 59.851704F, 25.531132F, 58.69562F, 25.531132F);
      ((Path)localObject).cubicTo(55.32233F, 25.531132F, 52.970524F, 24.838364F, 47.88444F, 22.855907F);
      ((Path)localObject).cubicTo(47.79554F, 22.821255F, 47.79554F, 22.821255F, 47.707146F, 22.786812F);
      ((Path)localObject).cubicTo(44.254536F, 21.441628F, 42.73305F, 21.0F, 41.421295F, 21.0F);
      ((Path)localObject).cubicTo(40.116314F, 21.0F, 39.107048F, 21.153767F, 38.407772F, 21.383652F);
      ((Path)localObject).cubicTo(38.582615F, 22.199299F, 39.062702F, 23.344135F, 39.880257F, 24.636806F);
      ((Path)localObject).cubicTo(40.307247F, 25.311932F, 42.24616F, 28.74818F, 43.35897F, 30.520924F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(51.00678F, 81.82541F);
      ((Path)localObject).cubicTo(67.22918F, 81.82541F, 77.25293F, 75.02486F, 77.25293F, 63.84621F);
      ((Path)localObject).cubicTo(77.25293F, 49.93904F, 64.30792F, 35.348583F, 51.00678F, 35.348583F);
      ((Path)localObject).cubicTo(37.86723F, 35.348583F, 25.5F, 49.74176F, 25.5F, 63.84621F);
      ((Path)localObject).cubicTo(25.5F, 75.17643F, 34.99126F, 81.82541F, 51.00678F, 81.82541F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\amu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */