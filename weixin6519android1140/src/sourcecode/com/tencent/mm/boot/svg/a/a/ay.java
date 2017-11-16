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

public final class ay
  extends c
{
  private final int height;
  private final int width;
  
  public ay()
  {
    GMTrace.i(15790849916928L, 117651);
    this.width = 180;
    this.height = 180;
    GMTrace.o(15790849916928L, 117651);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15790984134656L, 117652);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15790984134656L, 117652);
      return 0;
      GMTrace.o(15790984134656L, 117652);
      return 180;
      GMTrace.o(15790984134656L, 117652);
      return 180;
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
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-12206054);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(180.0F, 0.0F);
      localPath.lineTo(180.0F, 180.0F);
      localPath.lineTo(0.0F, 180.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(121.2F, 114.02628F);
      ((Path)localObject).cubicTo(114.79987F, 113.84735F, 109.2F, 117.62628F, 109.2F, 123.62628F);
      ((Path)localObject).cubicTo(109.2F, 129.62628F, 114.79987F, 132.0105F, 121.2F, 132.02628F);
      ((Path)localObject).cubicTo(120.070335F, 132.0105F, 124.8F, 132.02628F, 124.8F, 132.02628F);
      ((Path)localObject).cubicTo(131.00111F, 132.0105F, 136.40923F, 127.2425F, 136.8F, 121.22628F);
      ((Path)localObject).lineTo(136.8F, 49.22628F);
      ((Path)localObject).lineTo(136.8F, 42.026283F);
      ((Path)localObject).cubicTo(136.8F, 39.42614F, 135.34097F, 38.200985F, 133.2F, 38.42628F);
      ((Path)localObject).lineTo(60.0F, 49.22628F);
      ((Path)localObject).cubicTo(57.178402F, 49.530968F, 55.72174F, 51.176342F, 56.4F, 52.826283F);
      ((Path)localObject).lineTo(56.4F, 60.026283F);
      ((Path)localObject).lineTo(56.4F, 117.62628F);
      ((Path)localObject).cubicTo(55.72174F, 118.12103F, 55.651085F, 123.463135F, 49.2F, 123.62628F);
      ((Path)localObject).cubicTo(47.17411F, 123.46318F, 45.35031F, 123.46317F, 45.6F, 123.62628F);
      ((Path)localObject).cubicTo(40.16959F, 123.463135F, 36.0F, 127.52909F, 36.0F, 132.02628F);
      ((Path)localObject).cubicTo(36.0F, 137.56032F, 40.16959F, 141.62628F, 45.6F, 141.62628F);
      ((Path)localObject).lineTo(49.2F, 141.62628F);
      ((Path)localObject).cubicTo(56.2364F, 141.62628F, 61.769886F, 136.85829F, 63.6F, 130.82628F);
      ((Path)localObject).lineTo(63.6F, 63.62628F);
      ((Path)localObject).lineTo(129.6F, 54.026283F);
      ((Path)localObject).lineTo(129.6F, 109.22628F);
      ((Path)localObject).cubicTo(130.35202F, 108.50525F, 130.28137F, 113.84735F, 124.8F, 114.02628F);
      ((Path)localObject).lineTo(121.2F, 114.02628F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */