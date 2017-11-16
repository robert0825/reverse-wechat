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

public final class am
  extends c
{
  private final int height;
  private final int width;
  
  public am()
  {
    GMTrace.i(15850711023616L, 118097);
    this.width = 138;
    this.height = 138;
    GMTrace.o(15850711023616L, 118097);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15850845241344L, 118098);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15850845241344L, 118098);
      return 0;
      GMTrace.o(15850845241344L, 118098);
      return 138;
      GMTrace.o(15850845241344L, 118098);
      return 138;
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
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-372399);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(73.897F, 30.479F);
      localPath.cubicTo(74.751F, 28.69F, 74.819F, 26.755001F, 74.084F, 25.024F);
      localPath.cubicTo(73.349F, 23.294F, 71.902F, 21.997F, 70.015F, 21.374F);
      localPath.lineTo(68.426F, 20.848F);
      localPath.cubicTo(67.69701F, 20.607F, 66.952F, 20.484F, 66.212006F, 20.484F);
      localPath.cubicTo(63.095005F, 20.484F, 60.479004F, 22.682999F, 59.852005F, 25.833F);
      localPath.lineTo(56.529007F, 42.544F);
      localPath.cubicTo(55.72801F, 46.562F, 56.918007F, 50.312F, 59.237007F, 51.079998F);
      localPath.cubicTo(59.53301F, 51.177998F, 59.85301F, 51.227997F, 60.184006F, 51.227997F);
      localPath.cubicTo(62.403008F, 51.227997F, 65.01101F, 49.019997F, 66.524F, 45.857F);
      localPath.lineTo(73.897F, 30.479F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-372399);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(47.594F, 58.56F);
      localPath.cubicTo(47.825F, 56.139F, 44.891003F, 53.479F, 40.913002F, 52.502003F);
      localPath.lineTo(28.674002F, 49.49F);
      localPath.cubicTo(28.108002F, 49.352F, 27.537003F, 49.281002F, 26.977001F, 49.281002F);
      localPath.cubicTo(23.645F, 49.281002F, 20.992F, 51.755F, 20.665F, 55.160004F);
      localPath.lineTo(20.5F, 56.885F);
      localPath.cubicTo(20.483F, 58.966F, 21.181F, 60.827F, 22.469F, 62.123997F);
      localPath.cubicTo(23.628F, 63.291996F, 25.164F, 63.911995F, 26.909F, 63.911995F);
      localPath.cubicTo(27.034F, 63.911995F, 27.163F, 63.907993F, 27.29F, 63.902996F);
      localPath.lineTo(39.885002F, 63.248997F);
      localPath.cubicTo(43.976F, 63.039F, 47.36F, 60.978F, 47.594F, 58.56F);
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-372399);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(52.464F, 71.346F);
      localPath.cubicTo(50.162003F, 70.582F, 46.995003F, 72.976F, 45.374F, 76.679F);
      localPath.lineTo(33.727F, 103.298004F);
      localPath.cubicTo(32.935F, 105.107F, 32.925003F, 107.064F, 33.699F, 108.80801F);
      localPath.cubicTo(34.476F, 110.55401F, 35.939003F, 111.86101F, 37.822002F, 112.490005F);
      localPath.lineTo(39.410004F, 113.018005F);
      localPath.lineTo(39.569004F, 113.051F);
      localPath.cubicTo(39.827003F, 113.07201F, 40.099003F, 113.086006F, 40.385002F, 113.086006F);
      localPath.cubicTo(43.696003F, 113.086006F, 47.402F, 111.55301F, 48.216003F, 108.12201F);
      localPath.lineTo(54.923004F, 79.86101F);
      localPath.cubicTo(55.872F, 75.861F, 54.79F, 72.12F, 52.464F, 71.346F);
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-372399);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(75.157F, 75.74F);
      localPath.cubicTo(73.254F, 73.711F, 70.840996F, 72.45F, 68.858F, 72.45F);
      localPath.cubicTo(68.017F, 72.45F, 67.277F, 72.687996F, 66.722F, 73.135994F);
      localPath.cubicTo(64.809F, 74.685F, 65.159F, 78.536995F, 67.52F, 81.912994F);
      localPath.lineTo(90.321F, 114.520996F);
      localPath.cubicTo(91.653F, 116.423996F, 93.719F, 117.515F, 95.988F, 117.515F);
      localPath.cubicTo(97.584F, 117.515F, 99.101F, 116.97F, 100.381F, 115.939F);
      localPath.lineTo(101.682F, 114.887F);
      localPath.cubicTo(103.22F, 113.645004F, 104.139F, 111.901F, 104.274F, 109.984F);
      localPath.cubicTo(104.405F, 108.065F, 103.734F, 106.213F, 102.379005F, 104.772F);
      localPath.lineTo(75.157F, 75.74F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-372399);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(117.396F, 55.183F);
      ((Path)localObject).cubicTo(117.16701F, 51.164997F, 113.701004F, 48.226997F, 109.587006F, 48.821F);
      ((Path)localObject).lineTo(75.83F, 53.738F);
      ((Path)localObject).cubicTo(71.757F, 54.335F, 68.674F, 56.717F, 68.811005F, 59.159F);
      ((Path)localObject).cubicTo(68.950005F, 61.612F, 72.288F, 63.583F, 76.414F, 63.645F);
      ((Path)localObject).lineTo(109.757F, 64.078F);
      ((Path)localObject).lineTo(109.873F, 64.081F);
      ((Path)localObject).cubicTo(112.042F, 64.081F, 114.214005F, 63.15F, 115.685F, 61.594F);
      ((Path)localObject).cubicTo(116.947F, 60.258003F, 117.587F, 58.575F, 117.49F, 56.855003F);
      ((Path)localObject).lineTo(117.396F, 55.183F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(109.874F, 63.373F);
      ((Path)localObject).lineTo(109.874F, 63.373F);
      ((Path)localObject).lineTo(109.874F, 63.375F);
      ((Path)localObject).lineTo(109.874F, 63.373F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */