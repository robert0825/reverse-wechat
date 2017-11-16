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

public final class fn
  extends c
{
  private final int height;
  private final int width;
  
  public fn()
  {
    GMTrace.i(16769968242688L, 124946);
    this.width = 102;
    this.height = 102;
    GMTrace.o(16769968242688L, 124946);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16770102460416L, 124947);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16770102460416L, 124947);
      return 0;
      GMTrace.o(16770102460416L, 124947);
      return 102;
      GMTrace.o(16770102460416L, 124947);
      return 102;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -2.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(64.10316F, 2.0F);
      localPath.lineTo(103.0F, 40.8261F);
      localPath.lineTo(102.954636F, 104.0F);
      localPath.lineTo(1.0F, 2.0F);
      localPath.lineTo(64.10316F, 2.0F);
      localPath.close();
      localPath.moveTo(42.299107F, 26.234137F);
      localPath.lineTo(51.097515F, 17.435728F);
      localPath.lineTo(51.18077F, 17.518986F);
      localPath.lineTo(48.626644F, 32.561672F);
      localPath.lineTo(50.93934F, 34.87437F);
      localPath.lineTo(64.37437F, 21.43934F);
      localPath.lineTo(61.700893F, 18.765863F);
      localPath.lineTo(52.949036F, 27.51772F);
      localPath.lineTo(52.87503F, 27.443712F);
      localPath.lineTo(55.391857F, 12.456829F);
      localPath.lineTo(53.06066F, 10.125631F);
      localPath.lineTo(39.62563F, 23.56066F);
      localPath.lineTo(42.299107F, 26.234137F);
      localPath.close();
      localPath.moveTo(64.7063F, 43.486088F);
      localPath.lineTo(58.417786F, 37.19757F);
      localPath.lineTo(61.8068F, 33.808556F);
      localPath.lineTo(67.73955F, 39.7413F);
      localPath.lineTo(69.899574F, 37.581264F);
      localPath.lineTo(63.96683F, 31.648521F);
      localPath.lineTo(67.20688F, 28.408474F);
      localPath.lineTo(73.4954F, 34.69699F);
      localPath.lineTo(75.813705F, 32.37868F);
      localPath.lineTo(66.62132F, 23.18629F);
      localPath.lineTo(53.18629F, 36.62132F);
      localPath.lineTo(62.37868F, 45.81371F);
      localPath.lineTo(64.7063F, 43.486088F);
      localPath.close();
      localPath.moveTo(81.91591F, 46.99066F);
      localPath.lineTo(82.0F, 47.07475F);
      localPath.lineTo(75.379944F, 58.814972F);
      localPath.lineTo(78.04281F, 61.477837F);
      localPath.lineTo(95.05635F, 51.62132F);
      localPath.lineTo(92.131874F, 48.696842F);
      localPath.lineTo(80.272125F, 56.29601F);
      localPath.lineTo(80.19738F, 56.221264F);
      localPath.lineTo(87.40412F, 43.969093F);
      localPath.lineTo(85.02156F, 41.586533F);
      localPath.lineTo(72.769394F, 48.793278F);
      localPath.lineTo(72.69465F, 48.71853F);
      localPath.lineTo(80.303154F, 36.86813F);
      localPath.lineTo(77.37868F, 33.94365F);
      localPath.lineTo(67.51282F, 50.94785F);
      localPath.lineTo(70.17568F, 53.610714F);
      localPath.lineTo(81.91591F, 46.99066F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 0.70710677F, -0.70710677F, 46.286797F, 0.70710677F, 0.70710677F, -36.74621F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(41.78087F, 47.0F);
      ((Path)localObject).lineTo(41.78087F, 34.55717F);
      ((Path)localObject).lineTo(41.89861F, 34.55717F);
      ((Path)localObject).lineTo(50.729355F, 47.0F);
      ((Path)localObject).lineTo(54.0F, 47.0F);
      ((Path)localObject).lineTo(54.0F, 28.0F);
      ((Path)localObject).lineTo(50.21913F, 28.0F);
      ((Path)localObject).lineTo(50.21913F, 40.37699F);
      ((Path)localObject).lineTo(50.11447F, 40.37699F);
      ((Path)localObject).lineTo(41.29681F, 28.0F);
      ((Path)localObject).lineTo(38.0F, 28.0F);
      ((Path)localObject).lineTo(38.0F, 47.0F);
      ((Path)localObject).lineTo(41.78087F, 47.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(70.0F, 43.70825F);
      ((Path)localObject).lineTo(61.106693F, 43.70825F);
      ((Path)localObject).lineTo(61.106693F, 38.915455F);
      ((Path)localObject).lineTo(69.496864F, 38.915455F);
      ((Path)localObject).lineTo(69.496864F, 35.860706F);
      ((Path)localObject).lineTo(61.106693F, 35.860706F);
      ((Path)localObject).lineTo(61.106693F, 31.278585F);
      ((Path)localObject).lineTo(70.0F, 31.278585F);
      ((Path)localObject).lineTo(70.0F, 28.0F);
      ((Path)localObject).lineTo(57.0F, 28.0F);
      ((Path)localObject).lineTo(57.0F, 47.0F);
      ((Path)localObject).lineTo(70.0F, 47.0F);
      ((Path)localObject).lineTo(70.0F, 43.70825F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(84.43393F, 34.017326F);
      ((Path)localObject).lineTo(84.55286F, 34.017326F);
      ((Path)localObject).lineTo(88.17336F, 47.0F);
      ((Path)localObject).lineTo(91.93922F, 47.0F);
      ((Path)localObject).lineTo(97.0F, 28.0F);
      ((Path)localObject).lineTo(92.86417F, 28.0F);
      ((Path)localObject).lineTo(89.85148F, 41.75953F);
      ((Path)localObject).lineTo(89.74577F, 41.75953F);
      ((Path)localObject).lineTo(86.178116F, 28.0F);
      ((Path)localObject).lineTo(82.80867F, 28.0F);
      ((Path)localObject).lineTo(79.24101F, 41.75953F);
      ((Path)localObject).lineTo(79.13531F, 41.75953F);
      ((Path)localObject).lineTo(76.13583F, 28.0F);
      ((Path)localObject).lineTo(72.0F, 28.0F);
      ((Path)localObject).lineTo(77.04757F, 47.0F);
      ((Path)localObject).lineTo(80.81342F, 47.0F);
      ((Path)localObject).lineTo(84.43393F, 34.017326F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 51, 4);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */